// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This datasource configures a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
 */
export function getAwsBucketPolicy(args: GetAwsBucketPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetAwsBucketPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getAwsBucketPolicy:getAwsBucketPolicy", {
        "bucket": args.bucket,
        "databricksAccountId": args.databricksAccountId,
        "databricksE2AccountId": args.databricksE2AccountId,
        "fullAccessRole": args.fullAccessRole,
    }, opts);
}

/**
 * A collection of arguments for invoking getAwsBucketPolicy.
 */
export interface GetAwsBucketPolicyArgs {
    /**
     * AWS S3 Bucket name for which to generate the policy document.
     */
    bucket: string;
    databricksAccountId?: string;
    /**
     * Your Databricks E2 account ID. Used to generate  restrictive IAM policies that will increase the security of your root bucket
     */
    databricksE2AccountId?: string;
    /**
     * Data access role that can have full access for this bucket
     */
    fullAccessRole?: string;
}

/**
 * A collection of values returned by getAwsBucketPolicy.
 */
export interface GetAwsBucketPolicyResult {
    readonly bucket: string;
    readonly databricksAccountId?: string;
    readonly databricksE2AccountId?: string;
    readonly fullAccessRole?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Read-only) AWS IAM Policy JSON document to grant Databricks full access to bucket.
     */
    readonly json: string;
}
/**
 * This datasource configures a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
 */
export function getAwsBucketPolicyOutput(args: GetAwsBucketPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAwsBucketPolicyResult> {
    return pulumi.output(args).apply((a: any) => getAwsBucketPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getAwsBucketPolicy.
 */
export interface GetAwsBucketPolicyOutputArgs {
    /**
     * AWS S3 Bucket name for which to generate the policy document.
     */
    bucket: pulumi.Input<string>;
    databricksAccountId?: pulumi.Input<string>;
    /**
     * Your Databricks E2 account ID. Used to generate  restrictive IAM policies that will increase the security of your root bucket
     */
    databricksE2AccountId?: pulumi.Input<string>;
    /**
     * Data access role that can have full access for this bucket
     */
    fullAccessRole?: pulumi.Input<string>;
}
