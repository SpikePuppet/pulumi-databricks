// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source constructs necessary AWS STS assume role policy for you.
 *
 * ## Example Usage
 *
 * End-to-end example of provisioning Cross-account IAM role with databricks_mws_credentials:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as databricks from "@pulumi/databricks";
 *
 * const config = new pulumi.Config();
 * const databricksAccountId = config.requireObject("databricksAccountId");
 * const thisAwsCrossAccountPolicy = databricks.getAwsCrossAccountPolicy({});
 * const crossAccountPolicy = new aws.iam.Policy("crossAccountPolicy", {policy: thisAwsCrossAccountPolicy.then(thisAwsCrossAccountPolicy => thisAwsCrossAccountPolicy.json)});
 * const thisAwsAssumeRolePolicy = databricks.getAwsAssumeRolePolicy({
 *     externalId: databricksAccountId,
 * });
 * const crossAccountRole = new aws.iam.Role("crossAccountRole", {
 *     assumeRolePolicy: thisAwsAssumeRolePolicy.then(thisAwsAssumeRolePolicy => thisAwsAssumeRolePolicy.json),
 *     description: "Grants Databricks full access to VPC resources",
 * });
 * const crossAccountRolePolicyAttachment = new aws.iam.RolePolicyAttachment("crossAccountRolePolicyAttachment", {
 *     policyArn: crossAccountPolicy.arn,
 *     role: crossAccountRole.name,
 * });
 * // required only in case of multi-workspace setup
 * const thisMwsCredentials = new databricks.MwsCredentials("thisMwsCredentials", {
 *     accountId: databricksAccountId,
 *     credentialsName: `${_var.prefix}-creds`,
 *     roleArn: crossAccountRole.arn,
 * }, {
 *     provider: databricks.mws,
 * });
 * ```
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide
 * * databricks.getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
 * * databricks.getAwsCrossAccountPolicy data to construct the necessary AWS cross-account policy for you, which is based on [official documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default).
 */
export function getAwsAssumeRolePolicy(args: GetAwsAssumeRolePolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetAwsAssumeRolePolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getAwsAssumeRolePolicy:getAwsAssumeRolePolicy", {
        "databricksAccountId": args.databricksAccountId,
        "externalId": args.externalId,
        "forLogDelivery": args.forLogDelivery,
    }, opts);
}

/**
 * A collection of arguments for invoking getAwsAssumeRolePolicy.
 */
export interface GetAwsAssumeRolePolicyArgs {
    databricksAccountId?: string;
    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     */
    externalId: string;
    /**
     * Either or not this assume role policy should be created for usage log delivery. Defaults to false.
     */
    forLogDelivery?: boolean;
}

/**
 * A collection of values returned by getAwsAssumeRolePolicy.
 */
export interface GetAwsAssumeRolePolicyResult {
    readonly databricksAccountId?: string;
    readonly externalId: string;
    readonly forLogDelivery?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * AWS IAM Policy JSON document
     */
    readonly json: string;
}
/**
 * This data source constructs necessary AWS STS assume role policy for you.
 *
 * ## Example Usage
 *
 * End-to-end example of provisioning Cross-account IAM role with databricks_mws_credentials:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as databricks from "@pulumi/databricks";
 *
 * const config = new pulumi.Config();
 * const databricksAccountId = config.requireObject("databricksAccountId");
 * const thisAwsCrossAccountPolicy = databricks.getAwsCrossAccountPolicy({});
 * const crossAccountPolicy = new aws.iam.Policy("crossAccountPolicy", {policy: thisAwsCrossAccountPolicy.then(thisAwsCrossAccountPolicy => thisAwsCrossAccountPolicy.json)});
 * const thisAwsAssumeRolePolicy = databricks.getAwsAssumeRolePolicy({
 *     externalId: databricksAccountId,
 * });
 * const crossAccountRole = new aws.iam.Role("crossAccountRole", {
 *     assumeRolePolicy: thisAwsAssumeRolePolicy.then(thisAwsAssumeRolePolicy => thisAwsAssumeRolePolicy.json),
 *     description: "Grants Databricks full access to VPC resources",
 * });
 * const crossAccountRolePolicyAttachment = new aws.iam.RolePolicyAttachment("crossAccountRolePolicyAttachment", {
 *     policyArn: crossAccountPolicy.arn,
 *     role: crossAccountRole.name,
 * });
 * // required only in case of multi-workspace setup
 * const thisMwsCredentials = new databricks.MwsCredentials("thisMwsCredentials", {
 *     accountId: databricksAccountId,
 *     credentialsName: `${_var.prefix}-creds`,
 *     roleArn: crossAccountRole.arn,
 * }, {
 *     provider: databricks.mws,
 * });
 * ```
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide
 * * databricks.getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
 * * databricks.getAwsCrossAccountPolicy data to construct the necessary AWS cross-account policy for you, which is based on [official documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default).
 */
export function getAwsAssumeRolePolicyOutput(args: GetAwsAssumeRolePolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAwsAssumeRolePolicyResult> {
    return pulumi.output(args).apply((a: any) => getAwsAssumeRolePolicy(a, opts))
}

/**
 * A collection of arguments for invoking getAwsAssumeRolePolicy.
 */
export interface GetAwsAssumeRolePolicyOutputArgs {
    databricksAccountId?: pulumi.Input<string>;
    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     */
    externalId: pulumi.Input<string>;
    /**
     * Either or not this assume role policy should be created for usage log delivery. Defaults to false.
     */
    forLogDelivery?: pulumi.Input<boolean>;
}
