// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Note** This resource has an evolving API, which may change in future versions of the provider. Please always consult [latest documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default) in case of any questions.
 *
 * This data source constructs necessary AWS Unity Catalog policy for you, which is based on [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getAwsUnityCatalogPolicy({
 *     awsAccountId: awsAccountId,
 *     bucketName: "databricks-bucket",
 *     roleName: "databricks-role",
 *     kmsName: "databricks-kms",
 * });
 * const passroleForUc = aws.iam.getPolicyDocument({
 *     statements: [
 *         {
 *             effect: "Allow",
 *             actions: ["sts:AssumeRole"],
 *             principals: [{
 *                 identifiers: ["arn:aws:iam::414351767826:role/unity-catalog-prod-UCMasterRole-14S5ZJVKOTYTL"],
 *                 type: "AWS",
 *             }],
 *             conditions: [{
 *                 test: "StringEquals",
 *                 variable: "sts:ExternalId",
 *                 values: [databricksAccountId],
 *             }],
 *         },
 *         {
 *             sid: "ExplicitSelfRoleAssumption",
 *             effect: "Allow",
 *             actions: ["sts:AssumeRole"],
 *             principals: [{
 *                 type: "AWS",
 *                 identifiers: [`arn:aws:iam::${awsAccountId}:root`],
 *             }],
 *             conditions: [{
 *                 test: "ArnLike",
 *                 variable: "aws:PrincipalArn",
 *                 values: [`arn:aws:iam::${awsAccountId}:role/${prefix}-uc-access`],
 *             }],
 *         },
 *     ],
 * });
 * const unityMetastore = new aws.iam.Policy("unity_metastore", {
 *     name: `${prefix}-unity-catalog-metastore-access-iam-policy`,
 *     policy: _this.then(_this => _this.json),
 * });
 * const metastoreDataAccess = new aws.iam.Role("metastore_data_access", {
 *     name: `${prefix}-uc-access`,
 *     assumeRolePolicy: passroleForUc.then(passroleForUc => passroleForUc.json),
 *     managedPolicyArns: [unityMetastore.arn],
 * });
 * ```
 */
export function getAwsUnityCatalogPolicy(args: GetAwsUnityCatalogPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetAwsUnityCatalogPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getAwsUnityCatalogPolicy:getAwsUnityCatalogPolicy", {
        "awsAccountId": args.awsAccountId,
        "bucketName": args.bucketName,
        "kmsName": args.kmsName,
        "roleName": args.roleName,
    }, opts);
}

/**
 * A collection of arguments for invoking getAwsUnityCatalogPolicy.
 */
export interface GetAwsUnityCatalogPolicyArgs {
    /**
     * The Account ID of the current AWS account (not your Databricks account).
     */
    awsAccountId: string;
    /**
     * The name of the S3 bucket used as root storage location for [managed tables](https://docs.databricks.com/data-governance/unity-catalog/index.html#managed-table) in Unity Catalog.
     */
    bucketName: string;
    /**
     * If encryption is enabled, provide the name of the KMS key that encrypts the S3 bucket contents. If encryption is disabled, do not provide this argument.
     */
    kmsName?: string;
    /**
     * The name of the AWS IAM role that you created in the previous step in the [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
     */
    roleName: string;
}

/**
 * A collection of values returned by getAwsUnityCatalogPolicy.
 */
export interface GetAwsUnityCatalogPolicyResult {
    readonly awsAccountId: string;
    readonly bucketName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * AWS IAM Policy JSON document
     */
    readonly json: string;
    readonly kmsName?: string;
    readonly roleName: string;
}
/**
 * > **Note** This resource has an evolving API, which may change in future versions of the provider. Please always consult [latest documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default) in case of any questions.
 *
 * This data source constructs necessary AWS Unity Catalog policy for you, which is based on [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getAwsUnityCatalogPolicy({
 *     awsAccountId: awsAccountId,
 *     bucketName: "databricks-bucket",
 *     roleName: "databricks-role",
 *     kmsName: "databricks-kms",
 * });
 * const passroleForUc = aws.iam.getPolicyDocument({
 *     statements: [
 *         {
 *             effect: "Allow",
 *             actions: ["sts:AssumeRole"],
 *             principals: [{
 *                 identifiers: ["arn:aws:iam::414351767826:role/unity-catalog-prod-UCMasterRole-14S5ZJVKOTYTL"],
 *                 type: "AWS",
 *             }],
 *             conditions: [{
 *                 test: "StringEquals",
 *                 variable: "sts:ExternalId",
 *                 values: [databricksAccountId],
 *             }],
 *         },
 *         {
 *             sid: "ExplicitSelfRoleAssumption",
 *             effect: "Allow",
 *             actions: ["sts:AssumeRole"],
 *             principals: [{
 *                 type: "AWS",
 *                 identifiers: [`arn:aws:iam::${awsAccountId}:root`],
 *             }],
 *             conditions: [{
 *                 test: "ArnLike",
 *                 variable: "aws:PrincipalArn",
 *                 values: [`arn:aws:iam::${awsAccountId}:role/${prefix}-uc-access`],
 *             }],
 *         },
 *     ],
 * });
 * const unityMetastore = new aws.iam.Policy("unity_metastore", {
 *     name: `${prefix}-unity-catalog-metastore-access-iam-policy`,
 *     policy: _this.then(_this => _this.json),
 * });
 * const metastoreDataAccess = new aws.iam.Role("metastore_data_access", {
 *     name: `${prefix}-uc-access`,
 *     assumeRolePolicy: passroleForUc.then(passroleForUc => passroleForUc.json),
 *     managedPolicyArns: [unityMetastore.arn],
 * });
 * ```
 */
export function getAwsUnityCatalogPolicyOutput(args: GetAwsUnityCatalogPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAwsUnityCatalogPolicyResult> {
    return pulumi.output(args).apply((a: any) => getAwsUnityCatalogPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getAwsUnityCatalogPolicy.
 */
export interface GetAwsUnityCatalogPolicyOutputArgs {
    /**
     * The Account ID of the current AWS account (not your Databricks account).
     */
    awsAccountId: pulumi.Input<string>;
    /**
     * The name of the S3 bucket used as root storage location for [managed tables](https://docs.databricks.com/data-governance/unity-catalog/index.html#managed-table) in Unity Catalog.
     */
    bucketName: pulumi.Input<string>;
    /**
     * If encryption is enabled, provide the name of the KMS key that encrypts the S3 bucket contents. If encryption is disabled, do not provide this argument.
     */
    kmsName?: pulumi.Input<string>;
    /**
     * The name of the AWS IAM role that you created in the previous step in the [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
     */
    roleName: pulumi.Input<string>;
}
