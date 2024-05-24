// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// &gt; **Note** If you've used the resource before, please add `use_cases = ["MANAGED_SERVICES"]` to keep the previous behaviour.
    /// 
    /// ### Customer-managed key for managed services
    /// 
    /// You must configure this during workspace creation
    /// 
    /// ### For AWS
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
    ///     var config = new Config();
    ///     // Account Id that could be found in the top right corner of https://accounts.cloud.databricks.com/
    ///     var databricksAccountId = config.RequireObject&lt;dynamic&gt;("databricksAccountId");
    ///     var current = Aws.GetCallerIdentity.Invoke();
    /// 
    ///     var databricksManagedServicesCmk = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Version = "2012-10-17",
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Sid = "Enable IAM User Permissions",
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "AWS",
    ///                         Identifiers = new[]
    ///                         {
    ///                             current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.AccountId),
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "kms:*",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///             },
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Sid = "Allow Databricks to use KMS key for control plane managed services",
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "AWS",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "arn:aws:iam::414351767826:root",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "kms:Encrypt",
    ///                     "kms:Decrypt",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var managedServicesCustomerManagedKey = new Aws.Kms.Key("managed_services_customer_managed_key", new()
    ///     {
    ///         Policy = databricksManagedServicesCmk.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var managedServicesCustomerManagedKeyAlias = new Aws.Kms.Alias("managed_services_customer_managed_key_alias", new()
    ///     {
    ///         Name = "alias/managed-services-customer-managed-key-alias",
    ///         TargetKeyId = managedServicesCustomerManagedKey.KeyId,
    ///     });
    /// 
    ///     var managedServices = new Databricks.MwsCustomerManagedKeys("managed_services", new()
    ///     {
    ///         AccountId = databricksAccountId,
    ///         AwsKeyInfo = new Databricks.Inputs.MwsCustomerManagedKeysAwsKeyInfoArgs
    ///         {
    ///             KeyArn = managedServicesCustomerManagedKey.Arn,
    ///             KeyAlias = managedServicesCustomerManagedKeyAlias.Name,
    ///         },
    ///         UseCases = new[]
    ///         {
    ///             "MANAGED_SERVICES",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### For GCP
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     // Account Id that could be found in the top right corner of https://accounts.gcp.databricks.com/
    ///     var databricksAccountId = config.RequireObject&lt;dynamic&gt;("databricksAccountId");
    ///     // Id of a google_kms_crypto_key
    ///     var cmekResourceId = config.RequireObject&lt;dynamic&gt;("cmekResourceId");
    ///     var managedServices = new Databricks.MwsCustomerManagedKeys("managed_services", new()
    ///     {
    ///         AccountId = databricksAccountId,
    ///         GcpKeyInfo = new Databricks.Inputs.MwsCustomerManagedKeysGcpKeyInfoArgs
    ///         {
    ///             KmsKeyId = cmekResourceId,
    ///         },
    ///         UseCases = new[]
    ///         {
    ///             "MANAGED_SERVICES",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Customer-managed key for workspace storage
    /// 
    /// ### For AWS
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
    ///     var config = new Config();
    ///     // Account Id that could be found in the top right corner of https://accounts.cloud.databricks.com/
    ///     var databricksAccountId = config.RequireObject&lt;dynamic&gt;("databricksAccountId");
    ///     // AWS ARN for the Databricks cross account role
    ///     var databricksCrossAccountRole = config.RequireObject&lt;dynamic&gt;("databricksCrossAccountRole");
    ///     var databricksStorageCmk = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Version = "2012-10-17",
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Sid = "Enable IAM User Permissions",
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "AWS",
    ///                         Identifiers = new[]
    ///                         {
    ///                             current.AccountId,
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "kms:*",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///             },
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Sid = "Allow Databricks to use KMS key for DBFS",
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "AWS",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "arn:aws:iam::414351767826:root",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "kms:Encrypt",
    ///                     "kms:Decrypt",
    ///                     "kms:ReEncrypt*",
    ///                     "kms:GenerateDataKey*",
    ///                     "kms:DescribeKey",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///             },
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Sid = "Allow Databricks to use KMS key for DBFS (Grants)",
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "AWS",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "arn:aws:iam::414351767826:root",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "kms:CreateGrant",
    ///                     "kms:ListGrants",
    ///                     "kms:RevokeGrant",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///                 Conditions = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementConditionInputArgs
    ///                     {
    ///                         Test = "Bool",
    ///                         Variable = "kms:GrantIsForAWSResource",
    ///                         Values = new[]
    ///                         {
    ///                             "true",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Sid = "Allow Databricks to use KMS key for EBS",
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "AWS",
    ///                         Identifiers = new[]
    ///                         {
    ///                             databricksCrossAccountRole,
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "kms:Decrypt",
    ///                     "kms:GenerateDataKey*",
    ///                     "kms:CreateGrant",
    ///                     "kms:DescribeKey",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///                 Conditions = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementConditionInputArgs
    ///                     {
    ///                         Test = "ForAnyValue:StringLike",
    ///                         Variable = "kms:ViaService",
    ///                         Values = new[]
    ///                         {
    ///                             "ec2.*.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var storageCustomerManagedKey = new Aws.Kms.Key("storage_customer_managed_key", new()
    ///     {
    ///         Policy = databricksStorageCmk.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var storageCustomerManagedKeyAlias = new Aws.Kms.Alias("storage_customer_managed_key_alias", new()
    ///     {
    ///         Name = "alias/storage-customer-managed-key-alias",
    ///         TargetKeyId = storageCustomerManagedKey.KeyId,
    ///     });
    /// 
    ///     var storage = new Databricks.MwsCustomerManagedKeys("storage", new()
    ///     {
    ///         AccountId = databricksAccountId,
    ///         AwsKeyInfo = new Databricks.Inputs.MwsCustomerManagedKeysAwsKeyInfoArgs
    ///         {
    ///             KeyArn = storageCustomerManagedKey.Arn,
    ///             KeyAlias = storageCustomerManagedKeyAlias.Name,
    ///         },
    ///         UseCases = new[]
    ///         {
    ///             "STORAGE",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### For GCP
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     // Account Id that could be found in the top right corner of https://accounts.gcp.databricks.com/
    ///     var databricksAccountId = config.RequireObject&lt;dynamic&gt;("databricksAccountId");
    ///     // Id of a google_kms_crypto_key
    ///     var cmekResourceId = config.RequireObject&lt;dynamic&gt;("cmekResourceId");
    ///     var storage = new Databricks.MwsCustomerManagedKeys("storage", new()
    ///     {
    ///         AccountId = databricksAccountId,
    ///         GcpKeyInfo = new Databricks.Inputs.MwsCustomerManagedKeysGcpKeyInfoArgs
    ///         {
    ///             KmsKeyId = cmekResourceId,
    ///         },
    ///         UseCases = new[]
    ///         {
    ///             "STORAGE",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are used in the same context:
    /// 
    /// * Provisioning Databricks on AWS guide.
    /// * databricks.MwsCredentials to configure the cross-account role for creation of new workspaces within AWS.
    /// * databricks.MwsLogDelivery to configure delivery of [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
    /// * databricks.MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) &amp; subnets for new workspaces within AWS.
    /// * databricks.MwsStorageConfigurations to configure root bucket new workspaces within AWS.
    /// * databricks.MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
    /// 
    /// ## Import
    /// 
    /// -&gt; **Note** Importing this resource is not currently supported.
    /// </summary>
    [DatabricksResourceType("databricks:index/mwsCustomerManagedKeys:MwsCustomerManagedKeys")]
    public partial class MwsCustomerManagedKeys : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// This field is a block and is documented below. This conflicts with `gcp_key_info`
        /// </summary>
        [Output("awsKeyInfo")]
        public Output<Outputs.MwsCustomerManagedKeysAwsKeyInfo?> AwsKeyInfo { get; private set; } = null!;

        /// <summary>
        /// (Integer) Time in epoch milliseconds when the customer key was created.
        /// </summary>
        [Output("creationTime")]
        public Output<int> CreationTime { get; private set; } = null!;

        /// <summary>
        /// (String) ID of the encryption key configuration object.
        /// </summary>
        [Output("customerManagedKeyId")]
        public Output<string> CustomerManagedKeyId { get; private set; } = null!;

        /// <summary>
        /// This field is a block and is documented below. This conflicts with `aws_key_info`
        /// </summary>
        [Output("gcpKeyInfo")]
        public Output<Outputs.MwsCustomerManagedKeysGcpKeyInfo?> GcpKeyInfo { get; private set; } = null!;

        /// <summary>
        /// *(since v0.3.4)* List of use cases for which this key will be used. *If you've used the resource before, please add `use_cases = ["MANAGED_SERVICES"]` to keep the previous behaviour.* Possible values are:
        /// * `MANAGED_SERVICES` - for encryption of the workspace objects (notebooks, secrets) that are stored in the control plane
        /// * `STORAGE` - for encryption of the DBFS Storage &amp; Cluster EBS Volumes
        /// </summary>
        [Output("useCases")]
        public Output<ImmutableArray<string>> UseCases { get; private set; } = null!;


        /// <summary>
        /// Create a MwsCustomerManagedKeys resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MwsCustomerManagedKeys(string name, MwsCustomerManagedKeysArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/mwsCustomerManagedKeys:MwsCustomerManagedKeys", name, args ?? new MwsCustomerManagedKeysArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MwsCustomerManagedKeys(string name, Input<string> id, MwsCustomerManagedKeysState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/mwsCustomerManagedKeys:MwsCustomerManagedKeys", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MwsCustomerManagedKeys resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MwsCustomerManagedKeys Get(string name, Input<string> id, MwsCustomerManagedKeysState? state = null, CustomResourceOptions? options = null)
        {
            return new MwsCustomerManagedKeys(name, id, state, options);
        }
    }

    public sealed class MwsCustomerManagedKeysArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// This field is a block and is documented below. This conflicts with `gcp_key_info`
        /// </summary>
        [Input("awsKeyInfo")]
        public Input<Inputs.MwsCustomerManagedKeysAwsKeyInfoArgs>? AwsKeyInfo { get; set; }

        /// <summary>
        /// (Integer) Time in epoch milliseconds when the customer key was created.
        /// </summary>
        [Input("creationTime")]
        public Input<int>? CreationTime { get; set; }

        /// <summary>
        /// (String) ID of the encryption key configuration object.
        /// </summary>
        [Input("customerManagedKeyId")]
        public Input<string>? CustomerManagedKeyId { get; set; }

        /// <summary>
        /// This field is a block and is documented below. This conflicts with `aws_key_info`
        /// </summary>
        [Input("gcpKeyInfo")]
        public Input<Inputs.MwsCustomerManagedKeysGcpKeyInfoArgs>? GcpKeyInfo { get; set; }

        [Input("useCases", required: true)]
        private InputList<string>? _useCases;

        /// <summary>
        /// *(since v0.3.4)* List of use cases for which this key will be used. *If you've used the resource before, please add `use_cases = ["MANAGED_SERVICES"]` to keep the previous behaviour.* Possible values are:
        /// * `MANAGED_SERVICES` - for encryption of the workspace objects (notebooks, secrets) that are stored in the control plane
        /// * `STORAGE` - for encryption of the DBFS Storage &amp; Cluster EBS Volumes
        /// </summary>
        public InputList<string> UseCases
        {
            get => _useCases ?? (_useCases = new InputList<string>());
            set => _useCases = value;
        }

        public MwsCustomerManagedKeysArgs()
        {
        }
        public static new MwsCustomerManagedKeysArgs Empty => new MwsCustomerManagedKeysArgs();
    }

    public sealed class MwsCustomerManagedKeysState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// This field is a block and is documented below. This conflicts with `gcp_key_info`
        /// </summary>
        [Input("awsKeyInfo")]
        public Input<Inputs.MwsCustomerManagedKeysAwsKeyInfoGetArgs>? AwsKeyInfo { get; set; }

        /// <summary>
        /// (Integer) Time in epoch milliseconds when the customer key was created.
        /// </summary>
        [Input("creationTime")]
        public Input<int>? CreationTime { get; set; }

        /// <summary>
        /// (String) ID of the encryption key configuration object.
        /// </summary>
        [Input("customerManagedKeyId")]
        public Input<string>? CustomerManagedKeyId { get; set; }

        /// <summary>
        /// This field is a block and is documented below. This conflicts with `aws_key_info`
        /// </summary>
        [Input("gcpKeyInfo")]
        public Input<Inputs.MwsCustomerManagedKeysGcpKeyInfoGetArgs>? GcpKeyInfo { get; set; }

        [Input("useCases")]
        private InputList<string>? _useCases;

        /// <summary>
        /// *(since v0.3.4)* List of use cases for which this key will be used. *If you've used the resource before, please add `use_cases = ["MANAGED_SERVICES"]` to keep the previous behaviour.* Possible values are:
        /// * `MANAGED_SERVICES` - for encryption of the workspace objects (notebooks, secrets) that are stored in the control plane
        /// * `STORAGE` - for encryption of the DBFS Storage &amp; Cluster EBS Volumes
        /// </summary>
        public InputList<string> UseCases
        {
            get => _useCases ?? (_useCases = new InputList<string>());
            set => _useCases = value;
        }

        public MwsCustomerManagedKeysState()
        {
        }
        public static new MwsCustomerManagedKeysState Empty => new MwsCustomerManagedKeysState();
    }
}
