// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source constructs necessary AWS cross-account policy for you, which is based on [official documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default).
 *
 * ## Example Usage
 *
 * For more detailed usage please see databricks.getAwsAssumeRolePolicy or databricksAwsS3Mount pages.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getAwsCrossAccountPolicy({});
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide
 * * databricks.getAwsAssumeRolePolicy data to construct the necessary AWS STS assume role policy.
 * * databricks.getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 */
export function getAwsCrossAccountPolicy(args?: GetAwsCrossAccountPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetAwsCrossAccountPolicyResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getAwsCrossAccountPolicy:getAwsCrossAccountPolicy", {
        "awsAccountId": args.awsAccountId,
        "passRoles": args.passRoles,
        "policyType": args.policyType,
        "region": args.region,
        "securityGroupId": args.securityGroupId,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAwsCrossAccountPolicy.
 */
export interface GetAwsCrossAccountPolicyArgs {
    /**
     * — Your AWS account ID, which is a number.
     */
    awsAccountId?: string;
    /**
     * List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
     * The below arguments are only valid for `restricted` policy type
     */
    passRoles?: string[];
    /**
     * The type of cross account policy to generated: `managed` for Databricks-managed VPC and `customer` for customer-managed VPC, `restricted` for customer-managed VPC with policy restrictions
     */
    policyType?: string;
    /**
     * — AWS Region name for your VPC deployment, for example `us-west-2`.
     */
    region?: string;
    /**
     * — ID of your AWS security group. When you add a security group restriction, you cannot reuse the cross-account IAM role or reference a credentials ID (`credentialsId`) for any other workspaces. For those other workspaces, you must create separate roles, policies, and credentials objects.
     */
    securityGroupId?: string;
    /**
     * — ID of the AWS VPC where you want to launch workspaces.
     */
    vpcId?: string;
}

/**
 * A collection of values returned by getAwsCrossAccountPolicy.
 */
export interface GetAwsCrossAccountPolicyResult {
    readonly awsAccountId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * AWS IAM Policy JSON document
     */
    readonly json: string;
    readonly passRoles?: string[];
    readonly policyType?: string;
    readonly region?: string;
    readonly securityGroupId?: string;
    readonly vpcId?: string;
}
/**
 * This data source constructs necessary AWS cross-account policy for you, which is based on [official documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default).
 *
 * ## Example Usage
 *
 * For more detailed usage please see databricks.getAwsAssumeRolePolicy or databricksAwsS3Mount pages.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getAwsCrossAccountPolicy({});
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide
 * * databricks.getAwsAssumeRolePolicy data to construct the necessary AWS STS assume role policy.
 * * databricks.getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 */
export function getAwsCrossAccountPolicyOutput(args?: GetAwsCrossAccountPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAwsCrossAccountPolicyResult> {
    return pulumi.output(args).apply((a: any) => getAwsCrossAccountPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getAwsCrossAccountPolicy.
 */
export interface GetAwsCrossAccountPolicyOutputArgs {
    /**
     * — Your AWS account ID, which is a number.
     */
    awsAccountId?: pulumi.Input<string>;
    /**
     * List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
     * The below arguments are only valid for `restricted` policy type
     */
    passRoles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The type of cross account policy to generated: `managed` for Databricks-managed VPC and `customer` for customer-managed VPC, `restricted` for customer-managed VPC with policy restrictions
     */
    policyType?: pulumi.Input<string>;
    /**
     * — AWS Region name for your VPC deployment, for example `us-west-2`.
     */
    region?: pulumi.Input<string>;
    /**
     * — ID of your AWS security group. When you add a security group restriction, you cannot reuse the cross-account IAM role or reference a credentials ID (`credentialsId`) for any other workspaces. For those other workspaces, you must create separate roles, policies, and credentials objects.
     */
    securityGroupId?: pulumi.Input<string>;
    /**
     * — ID of the AWS VPC where you want to launch workspaces.
     */
    vpcId?: pulumi.Input<string>;
}
