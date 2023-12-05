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
    /// Optionally, each databricks.Metastore can have a default databricks.StorageCredential defined as `databricks.MetastoreDataAccess`. This will be used by Unity Catalog to access data in the root storage location if defined.
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by combination of metastore id and the data access name. bash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/metastoreDataAccess:MetastoreDataAccess this '&lt;metastore_id&gt;|&lt;name&gt;'
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/metastoreDataAccess:MetastoreDataAccess")]
    public partial class MetastoreDataAccess : global::Pulumi.CustomResource
    {
        [Output("awsIamRole")]
        public Output<Outputs.MetastoreDataAccessAwsIamRole?> AwsIamRole { get; private set; } = null!;

        [Output("azureManagedIdentity")]
        public Output<Outputs.MetastoreDataAccessAzureManagedIdentity?> AzureManagedIdentity { get; private set; } = null!;

        [Output("azureServicePrincipal")]
        public Output<Outputs.MetastoreDataAccessAzureServicePrincipal?> AzureServicePrincipal { get; private set; } = null!;

        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        [Output("databricksGcpServiceAccount")]
        public Output<Outputs.MetastoreDataAccessDatabricksGcpServiceAccount> DatabricksGcpServiceAccount { get; private set; } = null!;

        [Output("forceDestroy")]
        public Output<bool?> ForceDestroy { get; private set; } = null!;

        [Output("gcpServiceAccountKey")]
        public Output<Outputs.MetastoreDataAccessGcpServiceAccountKey?> GcpServiceAccountKey { get; private set; } = null!;

        /// <summary>
        /// whether to set this credential as the default for the metastore. In practice, this should always be true.
        /// </summary>
        [Output("isDefault")]
        public Output<bool?> IsDefault { get; private set; } = null!;

        [Output("metastoreId")]
        public Output<string> MetastoreId { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("owner")]
        public Output<string> Owner { get; private set; } = null!;

        [Output("readOnly")]
        public Output<bool?> ReadOnly { get; private set; } = null!;


        /// <summary>
        /// Create a MetastoreDataAccess resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MetastoreDataAccess(string name, MetastoreDataAccessArgs? args = null, CustomResourceOptions? options = null)
            : base("databricks:index/metastoreDataAccess:MetastoreDataAccess", name, args ?? new MetastoreDataAccessArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MetastoreDataAccess(string name, Input<string> id, MetastoreDataAccessState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/metastoreDataAccess:MetastoreDataAccess", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MetastoreDataAccess resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MetastoreDataAccess Get(string name, Input<string> id, MetastoreDataAccessState? state = null, CustomResourceOptions? options = null)
        {
            return new MetastoreDataAccess(name, id, state, options);
        }
    }

    public sealed class MetastoreDataAccessArgs : global::Pulumi.ResourceArgs
    {
        [Input("awsIamRole")]
        public Input<Inputs.MetastoreDataAccessAwsIamRoleArgs>? AwsIamRole { get; set; }

        [Input("azureManagedIdentity")]
        public Input<Inputs.MetastoreDataAccessAzureManagedIdentityArgs>? AzureManagedIdentity { get; set; }

        [Input("azureServicePrincipal")]
        public Input<Inputs.MetastoreDataAccessAzureServicePrincipalArgs>? AzureServicePrincipal { get; set; }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("databricksGcpServiceAccount")]
        public Input<Inputs.MetastoreDataAccessDatabricksGcpServiceAccountArgs>? DatabricksGcpServiceAccount { get; set; }

        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        [Input("gcpServiceAccountKey")]
        public Input<Inputs.MetastoreDataAccessGcpServiceAccountKeyArgs>? GcpServiceAccountKey { get; set; }

        /// <summary>
        /// whether to set this credential as the default for the metastore. In practice, this should always be true.
        /// </summary>
        [Input("isDefault")]
        public Input<bool>? IsDefault { get; set; }

        [Input("metastoreId")]
        public Input<string>? MetastoreId { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        public MetastoreDataAccessArgs()
        {
        }
        public static new MetastoreDataAccessArgs Empty => new MetastoreDataAccessArgs();
    }

    public sealed class MetastoreDataAccessState : global::Pulumi.ResourceArgs
    {
        [Input("awsIamRole")]
        public Input<Inputs.MetastoreDataAccessAwsIamRoleGetArgs>? AwsIamRole { get; set; }

        [Input("azureManagedIdentity")]
        public Input<Inputs.MetastoreDataAccessAzureManagedIdentityGetArgs>? AzureManagedIdentity { get; set; }

        [Input("azureServicePrincipal")]
        public Input<Inputs.MetastoreDataAccessAzureServicePrincipalGetArgs>? AzureServicePrincipal { get; set; }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("databricksGcpServiceAccount")]
        public Input<Inputs.MetastoreDataAccessDatabricksGcpServiceAccountGetArgs>? DatabricksGcpServiceAccount { get; set; }

        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        [Input("gcpServiceAccountKey")]
        public Input<Inputs.MetastoreDataAccessGcpServiceAccountKeyGetArgs>? GcpServiceAccountKey { get; set; }

        /// <summary>
        /// whether to set this credential as the default for the metastore. In practice, this should always be true.
        /// </summary>
        [Input("isDefault")]
        public Input<bool>? IsDefault { get; set; }

        [Input("metastoreId")]
        public Input<string>? MetastoreId { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        public MetastoreDataAccessState()
        {
        }
        public static new MetastoreDataAccessState Empty => new MetastoreDataAccessState();
    }
}
