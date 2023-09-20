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
    /// A single databricks.Metastore can be shared across Databricks workspaces, and each linked workspace has a consistent view of the data and a single set of access policies. You can only create a single metastore for each region in which your organization operates.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var thisMetastore = new Databricks.Metastore("thisMetastore", new()
    ///     {
    ///         StorageRoot = $"s3://{aws_s3_bucket.Metastore.Id}/metastore",
    ///         Owner = "uc admins",
    ///         Region = "us-east-1",
    ///         ForceDestroy = true,
    ///     });
    /// 
    ///     var thisMetastoreAssignment = new Databricks.MetastoreAssignment("thisMetastoreAssignment", new()
    ///     {
    ///         MetastoreId = thisMetastore.Id,
    ///         WorkspaceId = local.Workspace_id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by combination of workspace id and metastore idbash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/metastoreAssignment:MetastoreAssignment this '&lt;workspace_id&gt;|&lt;metastore_id&gt;'
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/metastoreAssignment:MetastoreAssignment")]
    public partial class MetastoreAssignment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Default catalog used for this assignment, default to `hive_metastore`
        /// </summary>
        [Output("defaultCatalogName")]
        public Output<string?> DefaultCatalogName { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the parent Metastore
        /// </summary>
        [Output("metastoreId")]
        public Output<string> MetastoreId { get; private set; } = null!;

        /// <summary>
        /// id of the workspace for the assignment
        /// </summary>
        [Output("workspaceId")]
        public Output<int> WorkspaceId { get; private set; } = null!;


        /// <summary>
        /// Create a MetastoreAssignment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MetastoreAssignment(string name, MetastoreAssignmentArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/metastoreAssignment:MetastoreAssignment", name, args ?? new MetastoreAssignmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MetastoreAssignment(string name, Input<string> id, MetastoreAssignmentState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/metastoreAssignment:MetastoreAssignment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MetastoreAssignment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MetastoreAssignment Get(string name, Input<string> id, MetastoreAssignmentState? state = null, CustomResourceOptions? options = null)
        {
            return new MetastoreAssignment(name, id, state, options);
        }
    }

    public sealed class MetastoreAssignmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default catalog used for this assignment, default to `hive_metastore`
        /// </summary>
        [Input("defaultCatalogName")]
        public Input<string>? DefaultCatalogName { get; set; }

        /// <summary>
        /// Unique identifier of the parent Metastore
        /// </summary>
        [Input("metastoreId", required: true)]
        public Input<string> MetastoreId { get; set; } = null!;

        /// <summary>
        /// id of the workspace for the assignment
        /// </summary>
        [Input("workspaceId", required: true)]
        public Input<int> WorkspaceId { get; set; } = null!;

        public MetastoreAssignmentArgs()
        {
        }
        public static new MetastoreAssignmentArgs Empty => new MetastoreAssignmentArgs();
    }

    public sealed class MetastoreAssignmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default catalog used for this assignment, default to `hive_metastore`
        /// </summary>
        [Input("defaultCatalogName")]
        public Input<string>? DefaultCatalogName { get; set; }

        /// <summary>
        /// Unique identifier of the parent Metastore
        /// </summary>
        [Input("metastoreId")]
        public Input<string>? MetastoreId { get; set; }

        /// <summary>
        /// id of the workspace for the assignment
        /// </summary>
        [Input("workspaceId")]
        public Input<int>? WorkspaceId { get; set; }

        public MetastoreAssignmentState()
        {
        }
        public static new MetastoreAssignmentState Empty => new MetastoreAssignmentState();
    }
}
