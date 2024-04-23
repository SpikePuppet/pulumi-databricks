// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetAwsUnityCatalogPolicy
    {
        /// <summary>
        /// &gt; **Note** This resource has an evolving API, which may change in future versions of the provider. Please always consult [latest documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default) in case of any questions.
        /// 
        /// This data source constructs necessary AWS Unity Catalog policy for you, which is based on [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetAwsUnityCatalogPolicy.Invoke(new()
        ///     {
        ///         AwsAccountId = awsAccountId,
        ///         BucketName = "databricks-bucket",
        ///         RoleName = "databricks-role",
        ///         KmsName = "databricks-kms",
        ///     });
        /// 
        ///     var passroleForUc = Aws.Iam.GetPolicyDocument.Invoke(new()
        ///     {
        ///         Statements = new[]
        ///         {
        ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
        ///             {
        ///                 Effect = "Allow",
        ///                 Actions = new[]
        ///                 {
        ///                     "sts:AssumeRole",
        ///                 },
        ///                 Principals = new[]
        ///                 {
        ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
        ///                     {
        ///                         Identifiers = new[]
        ///                         {
        ///                             "arn:aws:iam::414351767826:role/unity-catalog-prod-UCMasterRole-14S5ZJVKOTYTL",
        ///                         },
        ///                         Type = "AWS",
        ///                     },
        ///                 },
        ///                 Conditions = new[]
        ///                 {
        ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementConditionInputArgs
        ///                     {
        ///                         Test = "StringEquals",
        ///                         Variable = "sts:ExternalId",
        ///                         Values = new[]
        ///                         {
        ///                             databricksAccountId,
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
        ///             {
        ///                 Sid = "ExplicitSelfRoleAssumption",
        ///                 Effect = "Allow",
        ///                 Actions = new[]
        ///                 {
        ///                     "sts:AssumeRole",
        ///                 },
        ///                 Principals = new[]
        ///                 {
        ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
        ///                     {
        ///                         Type = "AWS",
        ///                         Identifiers = new[]
        ///                         {
        ///                             $"arn:aws:iam::{awsAccountId}:root",
        ///                         },
        ///                     },
        ///                 },
        ///                 Conditions = new[]
        ///                 {
        ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementConditionInputArgs
        ///                     {
        ///                         Test = "ArnLike",
        ///                         Variable = "aws:PrincipalArn",
        ///                         Values = new[]
        ///                         {
        ///                             $"arn:aws:iam::{awsAccountId}:role/{prefix}-uc-access",
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var unityMetastore = new Aws.Iam.Policy("unity_metastore", new()
        ///     {
        ///         Name = $"{prefix}-unity-catalog-metastore-access-iam-policy",
        ///         PolicyDocument = @this.Apply(@this =&gt; @this.Apply(getAwsUnityCatalogPolicyResult =&gt; getAwsUnityCatalogPolicyResult.Json)),
        ///     });
        /// 
        ///     var metastoreDataAccess = new Aws.Iam.Role("metastore_data_access", new()
        ///     {
        ///         Name = $"{prefix}-uc-access",
        ///         AssumeRolePolicy = passroleForUc.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
        ///         ManagedPolicyArns = new[]
        ///         {
        ///             unityMetastore.Arn,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAwsUnityCatalogPolicyResult> InvokeAsync(GetAwsUnityCatalogPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAwsUnityCatalogPolicyResult>("databricks:index/getAwsUnityCatalogPolicy:getAwsUnityCatalogPolicy", args ?? new GetAwsUnityCatalogPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note** This resource has an evolving API, which may change in future versions of the provider. Please always consult [latest documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default) in case of any questions.
        /// 
        /// This data source constructs necessary AWS Unity Catalog policy for you, which is based on [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetAwsUnityCatalogPolicy.Invoke(new()
        ///     {
        ///         AwsAccountId = awsAccountId,
        ///         BucketName = "databricks-bucket",
        ///         RoleName = "databricks-role",
        ///         KmsName = "databricks-kms",
        ///     });
        /// 
        ///     var passroleForUc = Aws.Iam.GetPolicyDocument.Invoke(new()
        ///     {
        ///         Statements = new[]
        ///         {
        ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
        ///             {
        ///                 Effect = "Allow",
        ///                 Actions = new[]
        ///                 {
        ///                     "sts:AssumeRole",
        ///                 },
        ///                 Principals = new[]
        ///                 {
        ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
        ///                     {
        ///                         Identifiers = new[]
        ///                         {
        ///                             "arn:aws:iam::414351767826:role/unity-catalog-prod-UCMasterRole-14S5ZJVKOTYTL",
        ///                         },
        ///                         Type = "AWS",
        ///                     },
        ///                 },
        ///                 Conditions = new[]
        ///                 {
        ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementConditionInputArgs
        ///                     {
        ///                         Test = "StringEquals",
        ///                         Variable = "sts:ExternalId",
        ///                         Values = new[]
        ///                         {
        ///                             databricksAccountId,
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
        ///             {
        ///                 Sid = "ExplicitSelfRoleAssumption",
        ///                 Effect = "Allow",
        ///                 Actions = new[]
        ///                 {
        ///                     "sts:AssumeRole",
        ///                 },
        ///                 Principals = new[]
        ///                 {
        ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
        ///                     {
        ///                         Type = "AWS",
        ///                         Identifiers = new[]
        ///                         {
        ///                             $"arn:aws:iam::{awsAccountId}:root",
        ///                         },
        ///                     },
        ///                 },
        ///                 Conditions = new[]
        ///                 {
        ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementConditionInputArgs
        ///                     {
        ///                         Test = "ArnLike",
        ///                         Variable = "aws:PrincipalArn",
        ///                         Values = new[]
        ///                         {
        ///                             $"arn:aws:iam::{awsAccountId}:role/{prefix}-uc-access",
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var unityMetastore = new Aws.Iam.Policy("unity_metastore", new()
        ///     {
        ///         Name = $"{prefix}-unity-catalog-metastore-access-iam-policy",
        ///         PolicyDocument = @this.Apply(@this =&gt; @this.Apply(getAwsUnityCatalogPolicyResult =&gt; getAwsUnityCatalogPolicyResult.Json)),
        ///     });
        /// 
        ///     var metastoreDataAccess = new Aws.Iam.Role("metastore_data_access", new()
        ///     {
        ///         Name = $"{prefix}-uc-access",
        ///         AssumeRolePolicy = passroleForUc.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
        ///         ManagedPolicyArns = new[]
        ///         {
        ///             unityMetastore.Arn,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAwsUnityCatalogPolicyResult> Invoke(GetAwsUnityCatalogPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAwsUnityCatalogPolicyResult>("databricks:index/getAwsUnityCatalogPolicy:getAwsUnityCatalogPolicy", args ?? new GetAwsUnityCatalogPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAwsUnityCatalogPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Account ID of the current AWS account (not your Databricks account).
        /// </summary>
        [Input("awsAccountId", required: true)]
        public string AwsAccountId { get; set; } = null!;

        /// <summary>
        /// The name of the S3 bucket used as root storage location for [managed tables](https://docs.databricks.com/data-governance/unity-catalog/index.html#managed-table) in Unity Catalog.
        /// </summary>
        [Input("bucketName", required: true)]
        public string BucketName { get; set; } = null!;

        /// <summary>
        /// If encryption is enabled, provide the name of the KMS key that encrypts the S3 bucket contents. If encryption is disabled, do not provide this argument.
        /// </summary>
        [Input("kmsName")]
        public string? KmsName { get; set; }

        /// <summary>
        /// The name of the AWS IAM role that you created in the previous step in the [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
        /// </summary>
        [Input("roleName", required: true)]
        public string RoleName { get; set; } = null!;

        public GetAwsUnityCatalogPolicyArgs()
        {
        }
        public static new GetAwsUnityCatalogPolicyArgs Empty => new GetAwsUnityCatalogPolicyArgs();
    }

    public sealed class GetAwsUnityCatalogPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Account ID of the current AWS account (not your Databricks account).
        /// </summary>
        [Input("awsAccountId", required: true)]
        public Input<string> AwsAccountId { get; set; } = null!;

        /// <summary>
        /// The name of the S3 bucket used as root storage location for [managed tables](https://docs.databricks.com/data-governance/unity-catalog/index.html#managed-table) in Unity Catalog.
        /// </summary>
        [Input("bucketName", required: true)]
        public Input<string> BucketName { get; set; } = null!;

        /// <summary>
        /// If encryption is enabled, provide the name of the KMS key that encrypts the S3 bucket contents. If encryption is disabled, do not provide this argument.
        /// </summary>
        [Input("kmsName")]
        public Input<string>? KmsName { get; set; }

        /// <summary>
        /// The name of the AWS IAM role that you created in the previous step in the [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
        /// </summary>
        [Input("roleName", required: true)]
        public Input<string> RoleName { get; set; } = null!;

        public GetAwsUnityCatalogPolicyInvokeArgs()
        {
        }
        public static new GetAwsUnityCatalogPolicyInvokeArgs Empty => new GetAwsUnityCatalogPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetAwsUnityCatalogPolicyResult
    {
        public readonly string AwsAccountId;
        public readonly string BucketName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// AWS IAM Policy JSON document
        /// </summary>
        public readonly string Json;
        public readonly string? KmsName;
        public readonly string RoleName;

        [OutputConstructor]
        private GetAwsUnityCatalogPolicyResult(
            string awsAccountId,

            string bucketName,

            string id,

            string json,

            string? kmsName,

            string roleName)
        {
            AwsAccountId = awsAccountId;
            BucketName = bucketName;
            Id = id;
            Json = json;
            KmsName = kmsName;
            RoleName = roleName;
        }
    }
}
