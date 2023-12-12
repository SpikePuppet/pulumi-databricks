// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as databricks from "@pulumi/databricks";
 *
 * const config = new pulumi.Config();
 * const databricksAccountId = config.requireObject("databricksAccountId");
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
 *     credentialsName: `${local.prefix}-creds`,
 *     roleArn: crossAccountRole.arn,
 * }, {
 *     provider: databricks.mws,
 * });
 * ```
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * Provisioning Databricks on AWS guide.
 * * databricks.MwsCustomerManagedKeys to configure KMS keys for new workspaces within AWS.
 * * databricks.MwsLogDelivery to configure delivery of [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
 * * databricks.MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS.
 * * databricks.MwsStorageConfigurations to configure root bucket new workspaces within AWS.
 * * databricks.MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
 *
 * ## Import
 *
 * This resource can be imported by the combination of its identifier and the account idbash
 *
 * ```sh
 *  $ pulumi import databricks:index/mwsCredentials:MwsCredentials this <account_id>/<credentials_id>
 * ```
 */
export class MwsCredentials extends pulumi.CustomResource {
    /**
     * Get an existing MwsCredentials resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MwsCredentialsState, opts?: pulumi.CustomResourceOptions): MwsCredentials {
        return new MwsCredentials(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/mwsCredentials:MwsCredentials';

    /**
     * Returns true if the given object is an instance of MwsCredentials.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MwsCredentials {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MwsCredentials.__pulumiType;
    }

    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * (Integer) time of credentials registration
     */
    public readonly creationTime!: pulumi.Output<number>;
    /**
     * (String) identifier of credentials
     */
    public readonly credentialsId!: pulumi.Output<string>;
    /**
     * name of credentials to register
     */
    public readonly credentialsName!: pulumi.Output<string>;
    public readonly externalId!: pulumi.Output<string>;
    /**
     * ARN of cross-account role
     */
    public readonly roleArn!: pulumi.Output<string>;

    /**
     * Create a MwsCredentials resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MwsCredentialsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MwsCredentialsArgs | MwsCredentialsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MwsCredentialsState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["creationTime"] = state ? state.creationTime : undefined;
            resourceInputs["credentialsId"] = state ? state.credentialsId : undefined;
            resourceInputs["credentialsName"] = state ? state.credentialsName : undefined;
            resourceInputs["externalId"] = state ? state.externalId : undefined;
            resourceInputs["roleArn"] = state ? state.roleArn : undefined;
        } else {
            const args = argsOrState as MwsCredentialsArgs | undefined;
            if ((!args || args.credentialsName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'credentialsName'");
            }
            if ((!args || args.roleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleArn'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["creationTime"] = args ? args.creationTime : undefined;
            resourceInputs["credentialsId"] = args ? args.credentialsId : undefined;
            resourceInputs["credentialsName"] = args ? args.credentialsName : undefined;
            resourceInputs["externalId"] = args ? args.externalId : undefined;
            resourceInputs["roleArn"] = args ? args.roleArn : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MwsCredentials.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MwsCredentials resources.
 */
export interface MwsCredentialsState {
    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     */
    accountId?: pulumi.Input<string>;
    /**
     * (Integer) time of credentials registration
     */
    creationTime?: pulumi.Input<number>;
    /**
     * (String) identifier of credentials
     */
    credentialsId?: pulumi.Input<string>;
    /**
     * name of credentials to register
     */
    credentialsName?: pulumi.Input<string>;
    externalId?: pulumi.Input<string>;
    /**
     * ARN of cross-account role
     */
    roleArn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MwsCredentials resource.
 */
export interface MwsCredentialsArgs {
    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     */
    accountId?: pulumi.Input<string>;
    /**
     * (Integer) time of credentials registration
     */
    creationTime?: pulumi.Input<number>;
    /**
     * (String) identifier of credentials
     */
    credentialsId?: pulumi.Input<string>;
    /**
     * name of credentials to register
     */
    credentialsName: pulumi.Input<string>;
    externalId?: pulumi.Input<string>;
    /**
     * ARN of cross-account role
     */
    roleArn: pulumi.Input<string>;
}
