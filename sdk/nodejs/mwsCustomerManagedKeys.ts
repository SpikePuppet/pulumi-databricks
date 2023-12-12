// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * > **Note** If you've used the resource before, please add `useCases = ["MANAGED_SERVICES"]` to keep the previous behaviour.
 *
 * ### Customer-managed key for managed services
 *
 * You must configure this during workspace creation
 * ### For AWS
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as databricks from "@pulumi/databricks";
 *
 * const config = new pulumi.Config();
 * const databricksAccountId = config.requireObject("databricksAccountId");
 * const current = aws.getCallerIdentity({});
 * const databricksManagedServicesCmk = current.then(current => aws.iam.getPolicyDocument({
 *     version: "2012-10-17",
 *     statements: [
 *         {
 *             sid: "Enable IAM User Permissions",
 *             effect: "Allow",
 *             principals: [{
 *                 type: "AWS",
 *                 identifiers: [current.accountId],
 *             }],
 *             actions: ["kms:*"],
 *             resources: ["*"],
 *         },
 *         {
 *             sid: "Allow Databricks to use KMS key for control plane managed services",
 *             effect: "Allow",
 *             principals: [{
 *                 type: "AWS",
 *                 identifiers: ["arn:aws:iam::414351767826:root"],
 *             }],
 *             actions: [
 *                 "kms:Encrypt",
 *                 "kms:Decrypt",
 *             ],
 *             resources: ["*"],
 *         },
 *     ],
 * }));
 * const managedServicesCustomerManagedKey = new aws.kms.Key("managedServicesCustomerManagedKey", {policy: databricksManagedServicesCmk.then(databricksManagedServicesCmk => databricksManagedServicesCmk.json)});
 * const managedServicesCustomerManagedKeyAlias = new aws.kms.Alias("managedServicesCustomerManagedKeyAlias", {targetKeyId: managedServicesCustomerManagedKey.keyId});
 * const managedServices = new databricks.MwsCustomerManagedKeys("managedServices", {
 *     accountId: databricksAccountId,
 *     awsKeyInfo: {
 *         keyArn: managedServicesCustomerManagedKey.arn,
 *         keyAlias: managedServicesCustomerManagedKeyAlias.name,
 *     },
 *     useCases: ["MANAGED_SERVICES"],
 * });
 * ```
 * ### For GCP
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const config = new pulumi.Config();
 * const databricksAccountId = config.requireObject("databricksAccountId");
 * const cmekResourceId = config.requireObject("cmekResourceId");
 * const managedServices = new databricks.MwsCustomerManagedKeys("managedServices", {
 *     accountId: databricksAccountId,
 *     gcpKeyInfo: {
 *         kmsKeyId: cmekResourceId,
 *     },
 *     useCases: ["MANAGED_SERVICES"],
 * });
 * ```
 * ### Customer-managed key for workspace storage
 * ### For AWS
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as databricks from "@pulumi/databricks";
 *
 * const config = new pulumi.Config();
 * const databricksAccountId = config.requireObject("databricksAccountId");
 * const databricksCrossAccountRole = config.requireObject("databricksCrossAccountRole");
 * const databricksStorageCmk = aws.iam.getPolicyDocument({
 *     version: "2012-10-17",
 *     statements: [
 *         {
 *             sid: "Enable IAM User Permissions",
 *             effect: "Allow",
 *             principals: [{
 *                 type: "AWS",
 *                 identifiers: [data.aws_caller_identity.current.account_id],
 *             }],
 *             actions: ["kms:*"],
 *             resources: ["*"],
 *         },
 *         {
 *             sid: "Allow Databricks to use KMS key for DBFS",
 *             effect: "Allow",
 *             principals: [{
 *                 type: "AWS",
 *                 identifiers: ["arn:aws:iam::414351767826:root"],
 *             }],
 *             actions: [
 *                 "kms:Encrypt",
 *                 "kms:Decrypt",
 *                 "kms:ReEncrypt*",
 *                 "kms:GenerateDataKey*",
 *                 "kms:DescribeKey",
 *             ],
 *             resources: ["*"],
 *         },
 *         {
 *             sid: "Allow Databricks to use KMS key for DBFS (Grants)",
 *             effect: "Allow",
 *             principals: [{
 *                 type: "AWS",
 *                 identifiers: ["arn:aws:iam::414351767826:root"],
 *             }],
 *             actions: [
 *                 "kms:CreateGrant",
 *                 "kms:ListGrants",
 *                 "kms:RevokeGrant",
 *             ],
 *             resources: ["*"],
 *             conditions: [{
 *                 test: "Bool",
 *                 variable: "kms:GrantIsForAWSResource",
 *                 values: ["true"],
 *             }],
 *         },
 *         {
 *             sid: "Allow Databricks to use KMS key for EBS",
 *             effect: "Allow",
 *             principals: [{
 *                 type: "AWS",
 *                 identifiers: [databricksCrossAccountRole],
 *             }],
 *             actions: [
 *                 "kms:Decrypt",
 *                 "kms:GenerateDataKey*",
 *                 "kms:CreateGrant",
 *                 "kms:DescribeKey",
 *             ],
 *             resources: ["*"],
 *             conditions: [{
 *                 test: "ForAnyValue:StringLike",
 *                 variable: "kms:ViaService",
 *                 values: ["ec2.*.amazonaws.com"],
 *             }],
 *         },
 *     ],
 * });
 * const storageCustomerManagedKey = new aws.kms.Key("storageCustomerManagedKey", {policy: databricksStorageCmk.then(databricksStorageCmk => databricksStorageCmk.json)});
 * const storageCustomerManagedKeyAlias = new aws.kms.Alias("storageCustomerManagedKeyAlias", {targetKeyId: storageCustomerManagedKey.keyId});
 * const storage = new databricks.MwsCustomerManagedKeys("storage", {
 *     accountId: databricksAccountId,
 *     awsKeyInfo: {
 *         keyArn: storageCustomerManagedKey.arn,
 *         keyAlias: storageCustomerManagedKeyAlias.name,
 *     },
 *     useCases: ["STORAGE"],
 * });
 * ```
 * ### For GCP
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const config = new pulumi.Config();
 * const databricksAccountId = config.requireObject("databricksAccountId");
 * const cmekResourceId = config.requireObject("cmekResourceId");
 * const storage = new databricks.MwsCustomerManagedKeys("storage", {
 *     accountId: databricksAccountId,
 *     gcpKeyInfo: {
 *         kmsKeyId: cmekResourceId,
 *     },
 *     useCases: ["STORAGE"],
 * });
 * ```
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * Provisioning Databricks on AWS guide.
 * * databricks.MwsCredentials to configure the cross-account role for creation of new workspaces within AWS.
 * * databricks.MwsLogDelivery to configure delivery of [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
 * * databricks.MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS.
 * * databricks.MwsStorageConfigurations to configure root bucket new workspaces within AWS.
 * * databricks.MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
 *
 * ## Import
 *
 * -> **Note** Importing this resource is not currently supported.
 */
export class MwsCustomerManagedKeys extends pulumi.CustomResource {
    /**
     * Get an existing MwsCustomerManagedKeys resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MwsCustomerManagedKeysState, opts?: pulumi.CustomResourceOptions): MwsCustomerManagedKeys {
        return new MwsCustomerManagedKeys(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/mwsCustomerManagedKeys:MwsCustomerManagedKeys';

    /**
     * Returns true if the given object is an instance of MwsCustomerManagedKeys.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MwsCustomerManagedKeys {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MwsCustomerManagedKeys.__pulumiType;
    }

    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * This field is a block and is documented below. This conflicts with `gcpKeyInfo`
     */
    public readonly awsKeyInfo!: pulumi.Output<outputs.MwsCustomerManagedKeysAwsKeyInfo | undefined>;
    /**
     * (Integer) Time in epoch milliseconds when the customer key was created.
     */
    public readonly creationTime!: pulumi.Output<number>;
    /**
     * (String) ID of the encryption key configuration object.
     */
    public readonly customerManagedKeyId!: pulumi.Output<string>;
    /**
     * This field is a block and is documented below. This conflicts with `awsKeyInfo`
     */
    public readonly gcpKeyInfo!: pulumi.Output<outputs.MwsCustomerManagedKeysGcpKeyInfo | undefined>;
    /**
     * *(since v0.3.4)* List of use cases for which this key will be used. *If you've used the resource before, please add `useCases = ["MANAGED_SERVICES"]` to keep the previous behaviour.* Possible values are:
     */
    public readonly useCases!: pulumi.Output<string[]>;

    /**
     * Create a MwsCustomerManagedKeys resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MwsCustomerManagedKeysArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MwsCustomerManagedKeysArgs | MwsCustomerManagedKeysState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MwsCustomerManagedKeysState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["awsKeyInfo"] = state ? state.awsKeyInfo : undefined;
            resourceInputs["creationTime"] = state ? state.creationTime : undefined;
            resourceInputs["customerManagedKeyId"] = state ? state.customerManagedKeyId : undefined;
            resourceInputs["gcpKeyInfo"] = state ? state.gcpKeyInfo : undefined;
            resourceInputs["useCases"] = state ? state.useCases : undefined;
        } else {
            const args = argsOrState as MwsCustomerManagedKeysArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.useCases === undefined) && !opts.urn) {
                throw new Error("Missing required property 'useCases'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["awsKeyInfo"] = args ? args.awsKeyInfo : undefined;
            resourceInputs["creationTime"] = args ? args.creationTime : undefined;
            resourceInputs["customerManagedKeyId"] = args ? args.customerManagedKeyId : undefined;
            resourceInputs["gcpKeyInfo"] = args ? args.gcpKeyInfo : undefined;
            resourceInputs["useCases"] = args ? args.useCases : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MwsCustomerManagedKeys.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MwsCustomerManagedKeys resources.
 */
export interface MwsCustomerManagedKeysState {
    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     */
    accountId?: pulumi.Input<string>;
    /**
     * This field is a block and is documented below. This conflicts with `gcpKeyInfo`
     */
    awsKeyInfo?: pulumi.Input<inputs.MwsCustomerManagedKeysAwsKeyInfo>;
    /**
     * (Integer) Time in epoch milliseconds when the customer key was created.
     */
    creationTime?: pulumi.Input<number>;
    /**
     * (String) ID of the encryption key configuration object.
     */
    customerManagedKeyId?: pulumi.Input<string>;
    /**
     * This field is a block and is documented below. This conflicts with `awsKeyInfo`
     */
    gcpKeyInfo?: pulumi.Input<inputs.MwsCustomerManagedKeysGcpKeyInfo>;
    /**
     * *(since v0.3.4)* List of use cases for which this key will be used. *If you've used the resource before, please add `useCases = ["MANAGED_SERVICES"]` to keep the previous behaviour.* Possible values are:
     */
    useCases?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a MwsCustomerManagedKeys resource.
 */
export interface MwsCustomerManagedKeysArgs {
    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     */
    accountId: pulumi.Input<string>;
    /**
     * This field is a block and is documented below. This conflicts with `gcpKeyInfo`
     */
    awsKeyInfo?: pulumi.Input<inputs.MwsCustomerManagedKeysAwsKeyInfo>;
    /**
     * (Integer) Time in epoch milliseconds when the customer key was created.
     */
    creationTime?: pulumi.Input<number>;
    /**
     * (String) ID of the encryption key configuration object.
     */
    customerManagedKeyId?: pulumi.Input<string>;
    /**
     * This field is a block and is documented below. This conflicts with `awsKeyInfo`
     */
    gcpKeyInfo?: pulumi.Input<inputs.MwsCustomerManagedKeysGcpKeyInfo>;
    /**
     * *(since v0.3.4)* List of use cases for which this key will be used. *If you've used the resource before, please add `useCases = ["MANAGED_SERVICES"]` to keep the previous behaviour.* Possible values are:
     */
    useCases: pulumi.Input<pulumi.Input<string>[]>;
}
