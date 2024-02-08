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
    /// &gt; **Note** This resource could be used with account or workspace-level provider.
    /// 
    /// To work with external tables, Unity Catalog introduces two new objects to access and work with external cloud storage:
    /// 
    /// - `databricks.StorageCredential` represents authentication methods to access cloud storage (e.g. an IAM role for Amazon S3 or a service principal/managed identity for Azure Storage). Storage credentials are access-controlled to determine which users can use the credential.
    /// - databricks.ExternalLocation are objects that combine a cloud storage path with a Storage Credential that can be used to access the location.
    /// 
    /// ## Example Usage
    /// 
    /// For AWS
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var external = new Databricks.StorageCredential("external", new()
    ///     {
    ///         AwsIamRole = new Databricks.Inputs.StorageCredentialAwsIamRoleArgs
    ///         {
    ///             RoleArn = aws_iam_role.External_data_access.Arn,
    ///         },
    ///         Comment = "Managed by TF",
    ///     });
    /// 
    ///     var externalCreds = new Databricks.Grants("externalCreds", new()
    ///     {
    ///         StorageCredential = external.Id,
    ///         GrantDetails = new[]
    ///         {
    ///             new Databricks.Inputs.GrantsGrantArgs
    ///             {
    ///                 Principal = "Data Engineers",
    ///                 Privileges = new[]
    ///                 {
    ///                     "CREATE_EXTERNAL_TABLE",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// For Azure
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var externalMi = new Databricks.StorageCredential("externalMi", new()
    ///     {
    ///         AzureManagedIdentity = new Databricks.Inputs.StorageCredentialAzureManagedIdentityArgs
    ///         {
    ///             AccessConnectorId = azurerm_databricks_access_connector.Example.Id,
    ///         },
    ///         Comment = "Managed identity credential managed by TF",
    ///     });
    /// 
    ///     var externalCreds = new Databricks.Grants("externalCreds", new()
    ///     {
    ///         StorageCredential = databricks_storage_credential.External.Id,
    ///         GrantDetails = new[]
    ///         {
    ///             new Databricks.Inputs.GrantsGrantArgs
    ///             {
    ///                 Principal = "Data Engineers",
    ///                 Privileges = new[]
    ///                 {
    ///                     "CREATE_EXTERNAL_TABLE",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// For GCP
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var external = new Databricks.StorageCredential("external", new()
    ///     {
    ///         DatabricksGcpServiceAccount = null,
    ///     });
    /// 
    ///     var externalCreds = new Databricks.Grants("externalCreds", new()
    ///     {
    ///         StorageCredential = external.Id,
    ///         GrantDetails = new[]
    ///         {
    ///             new Databricks.Inputs.GrantsGrantArgs
    ///             {
    ///                 Principal = "Data Engineers",
    ///                 Privileges = new[]
    ///                 {
    ///                     "CREATE_EXTERNAL_TABLE",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by namebash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/storageCredential:StorageCredential this &lt;name&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/storageCredential:StorageCredential")]
    public partial class StorageCredential : global::Pulumi.CustomResource
    {
        [Output("awsIamRole")]
        public Output<Outputs.StorageCredentialAwsIamRole?> AwsIamRole { get; private set; } = null!;

        [Output("azureManagedIdentity")]
        public Output<Outputs.StorageCredentialAzureManagedIdentity?> AzureManagedIdentity { get; private set; } = null!;

        [Output("azureServicePrincipal")]
        public Output<Outputs.StorageCredentialAzureServicePrincipal?> AzureServicePrincipal { get; private set; } = null!;

        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        [Output("databricksGcpServiceAccount")]
        public Output<Outputs.StorageCredentialDatabricksGcpServiceAccount> DatabricksGcpServiceAccount { get; private set; } = null!;

        /// <summary>
        /// Delete storage credential regardless of its dependencies.
        /// </summary>
        [Output("forceDestroy")]
        public Output<bool?> ForceDestroy { get; private set; } = null!;

        /// <summary>
        /// Update storage credential regardless of its dependents.
        /// 
        /// `aws_iam_role` optional configuration block for credential details for AWS:
        /// </summary>
        [Output("forceUpdate")]
        public Output<bool?> ForceUpdate { get; private set; } = null!;

        [Output("gcpServiceAccountKey")]
        public Output<Outputs.StorageCredentialGcpServiceAccountKey?> GcpServiceAccountKey { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the parent Metastore. If set for workspace-level, it must match the ID of the metastore assigned to the worspace. When changing the metastore assigned to a workspace, this field becomes required.
        /// </summary>
        [Output("metastoreId")]
        public Output<string> MetastoreId { get; private set; } = null!;

        /// <summary>
        /// Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Username/groupname/sp application_id of the storage credential owner.
        /// </summary>
        [Output("owner")]
        public Output<string> Owner { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the storage credential is only usable for read operations.
        /// </summary>
        [Output("readOnly")]
        public Output<bool?> ReadOnly { get; private set; } = null!;

        /// <summary>
        /// Suppress validation errors if any &amp; force save the storage credential.
        /// </summary>
        [Output("skipValidation")]
        public Output<bool?> SkipValidation { get; private set; } = null!;


        /// <summary>
        /// Create a StorageCredential resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StorageCredential(string name, StorageCredentialArgs? args = null, CustomResourceOptions? options = null)
            : base("databricks:index/storageCredential:StorageCredential", name, args ?? new StorageCredentialArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StorageCredential(string name, Input<string> id, StorageCredentialState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/storageCredential:StorageCredential", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StorageCredential resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StorageCredential Get(string name, Input<string> id, StorageCredentialState? state = null, CustomResourceOptions? options = null)
        {
            return new StorageCredential(name, id, state, options);
        }
    }

    public sealed class StorageCredentialArgs : global::Pulumi.ResourceArgs
    {
        [Input("awsIamRole")]
        public Input<Inputs.StorageCredentialAwsIamRoleArgs>? AwsIamRole { get; set; }

        [Input("azureManagedIdentity")]
        public Input<Inputs.StorageCredentialAzureManagedIdentityArgs>? AzureManagedIdentity { get; set; }

        [Input("azureServicePrincipal")]
        public Input<Inputs.StorageCredentialAzureServicePrincipalArgs>? AzureServicePrincipal { get; set; }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("databricksGcpServiceAccount")]
        public Input<Inputs.StorageCredentialDatabricksGcpServiceAccountArgs>? DatabricksGcpServiceAccount { get; set; }

        /// <summary>
        /// Delete storage credential regardless of its dependencies.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// Update storage credential regardless of its dependents.
        /// 
        /// `aws_iam_role` optional configuration block for credential details for AWS:
        /// </summary>
        [Input("forceUpdate")]
        public Input<bool>? ForceUpdate { get; set; }

        [Input("gcpServiceAccountKey")]
        public Input<Inputs.StorageCredentialGcpServiceAccountKeyArgs>? GcpServiceAccountKey { get; set; }

        /// <summary>
        /// Unique identifier of the parent Metastore. If set for workspace-level, it must match the ID of the metastore assigned to the worspace. When changing the metastore assigned to a workspace, this field becomes required.
        /// </summary>
        [Input("metastoreId")]
        public Input<string>? MetastoreId { get; set; }

        /// <summary>
        /// Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Username/groupname/sp application_id of the storage credential owner.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// Indicates whether the storage credential is only usable for read operations.
        /// </summary>
        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        /// <summary>
        /// Suppress validation errors if any &amp; force save the storage credential.
        /// </summary>
        [Input("skipValidation")]
        public Input<bool>? SkipValidation { get; set; }

        public StorageCredentialArgs()
        {
        }
        public static new StorageCredentialArgs Empty => new StorageCredentialArgs();
    }

    public sealed class StorageCredentialState : global::Pulumi.ResourceArgs
    {
        [Input("awsIamRole")]
        public Input<Inputs.StorageCredentialAwsIamRoleGetArgs>? AwsIamRole { get; set; }

        [Input("azureManagedIdentity")]
        public Input<Inputs.StorageCredentialAzureManagedIdentityGetArgs>? AzureManagedIdentity { get; set; }

        [Input("azureServicePrincipal")]
        public Input<Inputs.StorageCredentialAzureServicePrincipalGetArgs>? AzureServicePrincipal { get; set; }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("databricksGcpServiceAccount")]
        public Input<Inputs.StorageCredentialDatabricksGcpServiceAccountGetArgs>? DatabricksGcpServiceAccount { get; set; }

        /// <summary>
        /// Delete storage credential regardless of its dependencies.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// Update storage credential regardless of its dependents.
        /// 
        /// `aws_iam_role` optional configuration block for credential details for AWS:
        /// </summary>
        [Input("forceUpdate")]
        public Input<bool>? ForceUpdate { get; set; }

        [Input("gcpServiceAccountKey")]
        public Input<Inputs.StorageCredentialGcpServiceAccountKeyGetArgs>? GcpServiceAccountKey { get; set; }

        /// <summary>
        /// Unique identifier of the parent Metastore. If set for workspace-level, it must match the ID of the metastore assigned to the worspace. When changing the metastore assigned to a workspace, this field becomes required.
        /// </summary>
        [Input("metastoreId")]
        public Input<string>? MetastoreId { get; set; }

        /// <summary>
        /// Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Username/groupname/sp application_id of the storage credential owner.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// Indicates whether the storage credential is only usable for read operations.
        /// </summary>
        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        /// <summary>
        /// Suppress validation errors if any &amp; force save the storage credential.
        /// </summary>
        [Input("skipValidation")]
        public Input<bool>? SkipValidation { get; set; }

        public StorageCredentialState()
        {
        }
        public static new StorageCredentialState Empty => new StorageCredentialState();
    }
}
