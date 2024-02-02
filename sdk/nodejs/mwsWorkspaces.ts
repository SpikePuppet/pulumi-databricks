// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 * ### Creating a Databricks on AWS workspace
 *
 * !Simplest multiworkspace
 *
 * To get workspace running, you have to configure a couple of things:
 *
 * * databricks.MwsCredentials - You can share a credentials (cross-account IAM role) configuration ID with multiple workspaces. It is not required to create a new one for each workspace.
 * * databricks.MwsStorageConfigurations - You can share a root S3 bucket with multiple workspaces in a single account. You do not have to create new ones for each workspace. If you share a root S3 bucket for multiple workspaces in an account, data on the root S3 bucket is partitioned into separate directories by workspace.
 * * databricks.MwsNetworks - (optional, but recommended) You can share one [customer-managed VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) with multiple workspaces in a single account. You do not have to create a new VPC for each workspace. However, you cannot reuse subnets or security groups with other resources, including other workspaces or non-Databricks resources. If you plan to share one VPC with multiple workspaces, be sure to size your VPC and subnets accordingly. Because a Databricks databricks.MwsNetworks encapsulates this information, you cannot reuse it across workspaces.
 * * databricks.MwsCustomerManagedKeys - You can share a customer-managed key across workspaces.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const config = new pulumi.Config();
 * const databricksAccountId = config.requireObject("databricksAccountId");
 * const mws = new databricks.Provider("mws", {host: "https://accounts.cloud.databricks.com"});
 * // register cross-account ARN
 * const thisMwsCredentials = new databricks.MwsCredentials("thisMwsCredentials", {
 *     accountId: databricksAccountId,
 *     credentialsName: `${_var.prefix}-creds`,
 *     roleArn: _var.crossaccount_arn,
 * }, {
 *     provider: databricks.mws,
 * });
 * // register root bucket
 * const thisMwsStorageConfigurations = new databricks.MwsStorageConfigurations("thisMwsStorageConfigurations", {
 *     accountId: databricksAccountId,
 *     storageConfigurationName: `${_var.prefix}-storage`,
 *     bucketName: _var.root_bucket,
 * }, {
 *     provider: databricks.mws,
 * });
 * // register VPC
 * const thisMwsNetworks = new databricks.MwsNetworks("thisMwsNetworks", {
 *     accountId: databricksAccountId,
 *     networkName: `${_var.prefix}-network`,
 *     vpcId: _var.vpc_id,
 *     subnetIds: _var.subnets_private,
 *     securityGroupIds: [_var.security_group],
 * }, {
 *     provider: databricks.mws,
 * });
 * // create workspace in given VPC with DBFS on root bucket
 * const thisMwsWorkspaces = new databricks.MwsWorkspaces("thisMwsWorkspaces", {
 *     accountId: databricksAccountId,
 *     workspaceName: _var.prefix,
 *     awsRegion: _var.region,
 *     credentialsId: thisMwsCredentials.credentialsId,
 *     storageConfigurationId: thisMwsStorageConfigurations.storageConfigurationId,
 *     networkId: thisMwsNetworks.networkId,
 *     token: {},
 * }, {
 *     provider: databricks.mws,
 * });
 * export const databricksToken = thisMwsWorkspaces.token.apply(token => token?.tokenValue);
 * ```
 * ### Creating a Databricks on AWS workspace with Databricks-Managed VPC
 *
 * ![VPCs](https://docs.databricks.com/_images/customer-managed-vpc.png)
 *
 * By default, Databricks creates a VPC in your AWS account for each workspace. Databricks uses it for running clusters in the workspace. Optionally, you can use your VPC for the workspace, using the feature customer-managed VPC. Databricks recommends that you provide your VPC with databricks.MwsNetworks so that you can configure it according to your organization’s enterprise cloud standards while still conforming to Databricks requirements. You cannot migrate an existing workspace to your VPC. Please see the difference described through IAM policy actions [on this page](https://docs.databricks.com/administration-guide/account-api/iam-role.html).
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as databricks from "@pulumi/databricks";
 * import * as random from "@pulumi/random";
 *
 * const config = new pulumi.Config();
 * const databricksAccountId = config.requireObject("databricksAccountId");
 * const naming = new random.RandomString("naming", {
 *     special: false,
 *     upper: false,
 *     length: 6,
 * });
 * const prefix = pulumi.interpolate`dltp${naming.result}`;
 * const thisAwsAssumeRolePolicy = databricks.getAwsAssumeRolePolicy({
 *     externalId: databricksAccountId,
 * });
 * const crossAccountRole = new aws.iam.Role("crossAccountRole", {
 *     assumeRolePolicy: thisAwsAssumeRolePolicy.then(thisAwsAssumeRolePolicy => thisAwsAssumeRolePolicy.json),
 *     tags: _var.tags,
 * });
 * const thisAwsCrossAccountPolicy = databricks.getAwsCrossAccountPolicy({});
 * const thisRolePolicy = new aws.iam.RolePolicy("thisRolePolicy", {
 *     role: crossAccountRole.id,
 *     policy: thisAwsCrossAccountPolicy.then(thisAwsCrossAccountPolicy => thisAwsCrossAccountPolicy.json),
 * });
 * const thisMwsCredentials = new databricks.MwsCredentials("thisMwsCredentials", {
 *     accountId: databricksAccountId,
 *     credentialsName: `${prefix}-creds`,
 *     roleArn: crossAccountRole.arn,
 * }, {
 *     provider: databricks.mws,
 * });
 * const rootStorageBucketBucketV2 = new aws.s3.BucketV2("rootStorageBucketBucketV2", {
 *     acl: "private",
 *     forceDestroy: true,
 *     tags: _var.tags,
 * });
 * const rootVersioning = new aws.s3.BucketVersioningV2("rootVersioning", {
 *     bucket: rootStorageBucketBucketV2.id,
 *     versioningConfiguration: {
 *         status: "Disabled",
 *     },
 * });
 * const rootStorageBucketBucketServerSideEncryptionConfigurationV2 = new aws.s3.BucketServerSideEncryptionConfigurationV2("rootStorageBucketBucketServerSideEncryptionConfigurationV2", {
 *     bucket: rootStorageBucketBucketV2.bucket,
 *     rules: [{
 *         applyServerSideEncryptionByDefault: {
 *             sseAlgorithm: "AES256",
 *         },
 *     }],
 * });
 * const rootStorageBucketBucketPublicAccessBlock = new aws.s3.BucketPublicAccessBlock("rootStorageBucketBucketPublicAccessBlock", {
 *     bucket: rootStorageBucketBucketV2.id,
 *     blockPublicAcls: true,
 *     blockPublicPolicy: true,
 *     ignorePublicAcls: true,
 *     restrictPublicBuckets: true,
 * }, {
 *     dependsOn: [rootStorageBucketBucketV2],
 * });
 * const thisAwsBucketPolicy = databricks.getAwsBucketPolicyOutput({
 *     bucket: rootStorageBucketBucketV2.bucket,
 * });
 * const rootBucketPolicy = new aws.s3.BucketPolicy("rootBucketPolicy", {
 *     bucket: rootStorageBucketBucketV2.id,
 *     policy: thisAwsBucketPolicy.apply(thisAwsBucketPolicy => thisAwsBucketPolicy.json),
 * }, {
 *     dependsOn: [rootStorageBucketBucketPublicAccessBlock],
 * });
 * const thisMwsStorageConfigurations = new databricks.MwsStorageConfigurations("thisMwsStorageConfigurations", {
 *     accountId: databricksAccountId,
 *     storageConfigurationName: `${prefix}-storage`,
 *     bucketName: rootStorageBucketBucketV2.bucket,
 * }, {
 *     provider: databricks.mws,
 * });
 * const thisMwsWorkspaces = new databricks.MwsWorkspaces("thisMwsWorkspaces", {
 *     accountId: databricksAccountId,
 *     workspaceName: prefix,
 *     awsRegion: "us-east-1",
 *     credentialsId: thisMwsCredentials.credentialsId,
 *     storageConfigurationId: thisMwsStorageConfigurations.storageConfigurationId,
 *     token: {},
 *     customTags: {
 *         SoldToCode: "1234",
 *     },
 * }, {
 *     provider: databricks.mws,
 * });
 * export const databricksToken = thisMwsWorkspaces.token.apply(token => token?.tokenValue);
 * ```
 *
 * In order to create a [Databricks Workspace that leverages AWS PrivateLink](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html) please ensure that you have read and understood the [Enable Private Link](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html) documentation and then customise the example above with the relevant examples from mws_vpc_endpoint, mwsPrivateAccessSettings and mws_networks.
 * ### Creating a Databricks on GCP workspace
 *
 * To get workspace running, you have to configure a network object:
 *
 * * databricks.MwsNetworks - (optional, but recommended) You can share one [customer-managed VPC](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/customer-managed-vpc.html) with multiple workspaces in a single account. You do not have to create a new VPC for each workspace. However, you cannot reuse subnets with other resources, including other workspaces or non-Databricks resources. If you plan to share one VPC with multiple workspaces, be sure to size your VPC and subnets accordingly. Because a Databricks databricks.MwsNetworks encapsulates this information, you cannot reuse it across workspaces.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const config = new pulumi.Config();
 * const databricksAccountId = config.requireObject("databricksAccountId");
 * const databricksGoogleServiceAccount = config.requireObject("databricksGoogleServiceAccount");
 * const googleProject = config.requireObject("googleProject");
 * const mws = new databricks.Provider("mws", {host: "https://accounts.gcp.databricks.com"});
 * // register VPC
 * const thisMwsNetworks = new databricks.MwsNetworks("thisMwsNetworks", {
 *     accountId: databricksAccountId,
 *     networkName: `${_var.prefix}-network`,
 *     gcpNetworkInfo: {
 *         networkProjectId: googleProject,
 *         vpcId: _var.vpc_id,
 *         subnetId: _var.subnet_id,
 *         subnetRegion: _var.subnet_region,
 *         podIpRangeName: "pods",
 *         serviceIpRangeName: "svc",
 *     },
 * });
 * // create workspace in given VPC
 * const thisMwsWorkspaces = new databricks.MwsWorkspaces("thisMwsWorkspaces", {
 *     accountId: databricksAccountId,
 *     workspaceName: _var.prefix,
 *     location: _var.subnet_region,
 *     cloudResourceContainer: {
 *         gcp: {
 *             projectId: googleProject,
 *         },
 *     },
 *     networkId: thisMwsNetworks.networkId,
 *     gkeConfig: {
 *         connectivityType: "PRIVATE_NODE_PUBLIC_MASTER",
 *         masterIpRange: "10.3.0.0/28",
 *     },
 *     token: {},
 * });
 * export const databricksToken = thisMwsWorkspaces.token.apply(token => token?.tokenValue);
 * ```
 *
 * In order to create a [Databricks Workspace that leverages GCP Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html) please ensure that you have read and understood the [Enable Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html) documentation and then customise the example above with the relevant examples from mws_vpc_endpoint, mwsPrivateAccessSettings and mws_networks.
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * Provisioning Databricks on AWS guide.
 * * Provisioning Databricks on AWS with PrivateLink guide.
 * * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide.
 * * Provisioning Databricks on GCP guide.
 * * Provisioning Databricks workspaces on GCP with Private Service Connect guide.
 * * databricks.MwsCredentials to configure the cross-account role for creation of new workspaces within AWS.
 * * databricks.MwsCustomerManagedKeys to configure KMS keys for new workspaces within AWS.
 * * databricks.MwsLogDelivery to configure delivery of [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
 * * databricks.MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS.
 * * databricks.MwsStorageConfigurations to configure root bucket new workspaces within AWS.
 * * databricks.MwsPrivateAccessSettings to create a [Private Access Setting](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html#step-5-create-a-private-access-settings-configuration-using-the-databricks-account-api) that can be used as part of a databricks.MwsWorkspaces resource to create a [Databricks Workspace that leverages AWS PrivateLink](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html).
 *
 * ## Import
 *
 * -> **Note** Importing this resource is not currently supported.
 */
export class MwsWorkspaces extends pulumi.CustomResource {
    /**
     * Get an existing MwsWorkspaces resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MwsWorkspacesState, opts?: pulumi.CustomResourceOptions): MwsWorkspaces {
        return new MwsWorkspaces(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/mwsWorkspaces:MwsWorkspaces';

    /**
     * Returns true if the given object is an instance of MwsWorkspaces.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MwsWorkspaces {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MwsWorkspaces.__pulumiType;
    }

    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * region of VPC.
     */
    public readonly awsRegion!: pulumi.Output<string | undefined>;
    public readonly cloud!: pulumi.Output<string>;
    /**
     * A block that specifies GCP workspace configurations, consisting of following blocks:
     */
    public readonly cloudResourceContainer!: pulumi.Output<outputs.MwsWorkspacesCloudResourceContainer | undefined>;
    /**
     * (Integer) time when workspace was created
     */
    public readonly creationTime!: pulumi.Output<number>;
    public readonly credentialsId!: pulumi.Output<string | undefined>;
    /**
     * The custom tags key-value pairing that is attached to this workspace. These tags will be applied to clusters automatically in addition to any `defaultTags` or `customTags` on a cluster level. Please note it can take up to an hour for customTags to be set due to scheduling on Control Plane. After custom tags are applied, they can be modified however they can never be completely removed.
     */
    public readonly customTags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * @deprecated Use managed_services_customer_managed_key_id instead
     */
    public readonly customerManagedKeyId!: pulumi.Output<string | undefined>;
    /**
     * part of URL as in `https://<prefix>-<deployment-name>.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
     */
    public readonly deploymentName!: pulumi.Output<string | undefined>;
    public readonly externalCustomerInfo!: pulumi.Output<outputs.MwsWorkspacesExternalCustomerInfo | undefined>;
    public readonly gcpManagedNetworkConfig!: pulumi.Output<outputs.MwsWorkspacesGcpManagedNetworkConfig | undefined>;
    /**
     * A block that specifies GKE configuration for the Databricks workspace:
     */
    public readonly gkeConfig!: pulumi.Output<outputs.MwsWorkspacesGkeConfig | undefined>;
    public readonly isNoPublicIpEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * region of the subnet.
     */
    public readonly location!: pulumi.Output<string | undefined>;
    /**
     * `customerManagedKeyId` from customer managed keys with `useCases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace's notebook and secret data in the control plane.
     */
    public readonly managedServicesCustomerManagedKeyId!: pulumi.Output<string | undefined>;
    /**
     * `networkId` from networks.
     */
    public readonly networkId!: pulumi.Output<string | undefined>;
    public readonly pricingTier!: pulumi.Output<string>;
    /**
     * Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account.
     */
    public readonly privateAccessSettingsId!: pulumi.Output<string | undefined>;
    /**
     * `storageConfigurationId` from storage configuration.
     */
    public readonly storageConfigurationId!: pulumi.Output<string | undefined>;
    /**
     * `customerManagedKeyId` from customer managed keys with `useCases` set to `STORAGE`. This is used to encrypt the DBFS Storage & Cluster Volumes.
     */
    public readonly storageCustomerManagedKeyId!: pulumi.Output<string | undefined>;
    public readonly token!: pulumi.Output<outputs.MwsWorkspacesToken | undefined>;
    /**
     * (String) workspace id
     */
    public readonly workspaceId!: pulumi.Output<number>;
    /**
     * name of the workspace, will appear on UI.
     */
    public readonly workspaceName!: pulumi.Output<string>;
    /**
     * (String) workspace status
     */
    public readonly workspaceStatus!: pulumi.Output<string>;
    /**
     * (String) updates on workspace status
     */
    public readonly workspaceStatusMessage!: pulumi.Output<string>;
    /**
     * (String) URL of the workspace
     */
    public readonly workspaceUrl!: pulumi.Output<string>;

    /**
     * Create a MwsWorkspaces resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MwsWorkspacesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MwsWorkspacesArgs | MwsWorkspacesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MwsWorkspacesState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["awsRegion"] = state ? state.awsRegion : undefined;
            resourceInputs["cloud"] = state ? state.cloud : undefined;
            resourceInputs["cloudResourceContainer"] = state ? state.cloudResourceContainer : undefined;
            resourceInputs["creationTime"] = state ? state.creationTime : undefined;
            resourceInputs["credentialsId"] = state ? state.credentialsId : undefined;
            resourceInputs["customTags"] = state ? state.customTags : undefined;
            resourceInputs["customerManagedKeyId"] = state ? state.customerManagedKeyId : undefined;
            resourceInputs["deploymentName"] = state ? state.deploymentName : undefined;
            resourceInputs["externalCustomerInfo"] = state ? state.externalCustomerInfo : undefined;
            resourceInputs["gcpManagedNetworkConfig"] = state ? state.gcpManagedNetworkConfig : undefined;
            resourceInputs["gkeConfig"] = state ? state.gkeConfig : undefined;
            resourceInputs["isNoPublicIpEnabled"] = state ? state.isNoPublicIpEnabled : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["managedServicesCustomerManagedKeyId"] = state ? state.managedServicesCustomerManagedKeyId : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["pricingTier"] = state ? state.pricingTier : undefined;
            resourceInputs["privateAccessSettingsId"] = state ? state.privateAccessSettingsId : undefined;
            resourceInputs["storageConfigurationId"] = state ? state.storageConfigurationId : undefined;
            resourceInputs["storageCustomerManagedKeyId"] = state ? state.storageCustomerManagedKeyId : undefined;
            resourceInputs["token"] = state ? state.token : undefined;
            resourceInputs["workspaceId"] = state ? state.workspaceId : undefined;
            resourceInputs["workspaceName"] = state ? state.workspaceName : undefined;
            resourceInputs["workspaceStatus"] = state ? state.workspaceStatus : undefined;
            resourceInputs["workspaceStatusMessage"] = state ? state.workspaceStatusMessage : undefined;
            resourceInputs["workspaceUrl"] = state ? state.workspaceUrl : undefined;
        } else {
            const args = argsOrState as MwsWorkspacesArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.workspaceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workspaceName'");
            }
            resourceInputs["accountId"] = args?.accountId ? pulumi.secret(args.accountId) : undefined;
            resourceInputs["awsRegion"] = args ? args.awsRegion : undefined;
            resourceInputs["cloud"] = args ? args.cloud : undefined;
            resourceInputs["cloudResourceContainer"] = args ? args.cloudResourceContainer : undefined;
            resourceInputs["creationTime"] = args ? args.creationTime : undefined;
            resourceInputs["credentialsId"] = args ? args.credentialsId : undefined;
            resourceInputs["customTags"] = args ? args.customTags : undefined;
            resourceInputs["customerManagedKeyId"] = args ? args.customerManagedKeyId : undefined;
            resourceInputs["deploymentName"] = args ? args.deploymentName : undefined;
            resourceInputs["externalCustomerInfo"] = args ? args.externalCustomerInfo : undefined;
            resourceInputs["gcpManagedNetworkConfig"] = args ? args.gcpManagedNetworkConfig : undefined;
            resourceInputs["gkeConfig"] = args ? args.gkeConfig : undefined;
            resourceInputs["isNoPublicIpEnabled"] = args ? args.isNoPublicIpEnabled : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["managedServicesCustomerManagedKeyId"] = args ? args.managedServicesCustomerManagedKeyId : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["pricingTier"] = args ? args.pricingTier : undefined;
            resourceInputs["privateAccessSettingsId"] = args ? args.privateAccessSettingsId : undefined;
            resourceInputs["storageConfigurationId"] = args ? args.storageConfigurationId : undefined;
            resourceInputs["storageCustomerManagedKeyId"] = args ? args.storageCustomerManagedKeyId : undefined;
            resourceInputs["token"] = args ? args.token : undefined;
            resourceInputs["workspaceId"] = args ? args.workspaceId : undefined;
            resourceInputs["workspaceName"] = args ? args.workspaceName : undefined;
            resourceInputs["workspaceStatus"] = args ? args.workspaceStatus : undefined;
            resourceInputs["workspaceStatusMessage"] = args ? args.workspaceStatusMessage : undefined;
            resourceInputs["workspaceUrl"] = args ? args.workspaceUrl : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["accountId"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(MwsWorkspaces.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MwsWorkspaces resources.
 */
export interface MwsWorkspacesState {
    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     */
    accountId?: pulumi.Input<string>;
    /**
     * region of VPC.
     */
    awsRegion?: pulumi.Input<string>;
    cloud?: pulumi.Input<string>;
    /**
     * A block that specifies GCP workspace configurations, consisting of following blocks:
     */
    cloudResourceContainer?: pulumi.Input<inputs.MwsWorkspacesCloudResourceContainer>;
    /**
     * (Integer) time when workspace was created
     */
    creationTime?: pulumi.Input<number>;
    credentialsId?: pulumi.Input<string>;
    /**
     * The custom tags key-value pairing that is attached to this workspace. These tags will be applied to clusters automatically in addition to any `defaultTags` or `customTags` on a cluster level. Please note it can take up to an hour for customTags to be set due to scheduling on Control Plane. After custom tags are applied, they can be modified however they can never be completely removed.
     */
    customTags?: pulumi.Input<{[key: string]: any}>;
    /**
     * @deprecated Use managed_services_customer_managed_key_id instead
     */
    customerManagedKeyId?: pulumi.Input<string>;
    /**
     * part of URL as in `https://<prefix>-<deployment-name>.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
     */
    deploymentName?: pulumi.Input<string>;
    externalCustomerInfo?: pulumi.Input<inputs.MwsWorkspacesExternalCustomerInfo>;
    gcpManagedNetworkConfig?: pulumi.Input<inputs.MwsWorkspacesGcpManagedNetworkConfig>;
    /**
     * A block that specifies GKE configuration for the Databricks workspace:
     */
    gkeConfig?: pulumi.Input<inputs.MwsWorkspacesGkeConfig>;
    isNoPublicIpEnabled?: pulumi.Input<boolean>;
    /**
     * region of the subnet.
     */
    location?: pulumi.Input<string>;
    /**
     * `customerManagedKeyId` from customer managed keys with `useCases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace's notebook and secret data in the control plane.
     */
    managedServicesCustomerManagedKeyId?: pulumi.Input<string>;
    /**
     * `networkId` from networks.
     */
    networkId?: pulumi.Input<string>;
    pricingTier?: pulumi.Input<string>;
    /**
     * Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account.
     */
    privateAccessSettingsId?: pulumi.Input<string>;
    /**
     * `storageConfigurationId` from storage configuration.
     */
    storageConfigurationId?: pulumi.Input<string>;
    /**
     * `customerManagedKeyId` from customer managed keys with `useCases` set to `STORAGE`. This is used to encrypt the DBFS Storage & Cluster Volumes.
     */
    storageCustomerManagedKeyId?: pulumi.Input<string>;
    token?: pulumi.Input<inputs.MwsWorkspacesToken>;
    /**
     * (String) workspace id
     */
    workspaceId?: pulumi.Input<number>;
    /**
     * name of the workspace, will appear on UI.
     */
    workspaceName?: pulumi.Input<string>;
    /**
     * (String) workspace status
     */
    workspaceStatus?: pulumi.Input<string>;
    /**
     * (String) updates on workspace status
     */
    workspaceStatusMessage?: pulumi.Input<string>;
    /**
     * (String) URL of the workspace
     */
    workspaceUrl?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MwsWorkspaces resource.
 */
export interface MwsWorkspacesArgs {
    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     */
    accountId: pulumi.Input<string>;
    /**
     * region of VPC.
     */
    awsRegion?: pulumi.Input<string>;
    cloud?: pulumi.Input<string>;
    /**
     * A block that specifies GCP workspace configurations, consisting of following blocks:
     */
    cloudResourceContainer?: pulumi.Input<inputs.MwsWorkspacesCloudResourceContainer>;
    /**
     * (Integer) time when workspace was created
     */
    creationTime?: pulumi.Input<number>;
    credentialsId?: pulumi.Input<string>;
    /**
     * The custom tags key-value pairing that is attached to this workspace. These tags will be applied to clusters automatically in addition to any `defaultTags` or `customTags` on a cluster level. Please note it can take up to an hour for customTags to be set due to scheduling on Control Plane. After custom tags are applied, they can be modified however they can never be completely removed.
     */
    customTags?: pulumi.Input<{[key: string]: any}>;
    /**
     * @deprecated Use managed_services_customer_managed_key_id instead
     */
    customerManagedKeyId?: pulumi.Input<string>;
    /**
     * part of URL as in `https://<prefix>-<deployment-name>.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
     */
    deploymentName?: pulumi.Input<string>;
    externalCustomerInfo?: pulumi.Input<inputs.MwsWorkspacesExternalCustomerInfo>;
    gcpManagedNetworkConfig?: pulumi.Input<inputs.MwsWorkspacesGcpManagedNetworkConfig>;
    /**
     * A block that specifies GKE configuration for the Databricks workspace:
     */
    gkeConfig?: pulumi.Input<inputs.MwsWorkspacesGkeConfig>;
    isNoPublicIpEnabled?: pulumi.Input<boolean>;
    /**
     * region of the subnet.
     */
    location?: pulumi.Input<string>;
    /**
     * `customerManagedKeyId` from customer managed keys with `useCases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace's notebook and secret data in the control plane.
     */
    managedServicesCustomerManagedKeyId?: pulumi.Input<string>;
    /**
     * `networkId` from networks.
     */
    networkId?: pulumi.Input<string>;
    pricingTier?: pulumi.Input<string>;
    /**
     * Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account.
     */
    privateAccessSettingsId?: pulumi.Input<string>;
    /**
     * `storageConfigurationId` from storage configuration.
     */
    storageConfigurationId?: pulumi.Input<string>;
    /**
     * `customerManagedKeyId` from customer managed keys with `useCases` set to `STORAGE`. This is used to encrypt the DBFS Storage & Cluster Volumes.
     */
    storageCustomerManagedKeyId?: pulumi.Input<string>;
    token?: pulumi.Input<inputs.MwsWorkspacesToken>;
    /**
     * (String) workspace id
     */
    workspaceId?: pulumi.Input<number>;
    /**
     * name of the workspace, will appear on UI.
     */
    workspaceName: pulumi.Input<string>;
    /**
     * (String) workspace status
     */
    workspaceStatus?: pulumi.Input<string>;
    /**
     * (String) updates on workspace status
     */
    workspaceStatusMessage?: pulumi.Input<string>;
    /**
     * (String) URL of the workspace
     */
    workspaceUrl?: pulumi.Input<string>;
}
