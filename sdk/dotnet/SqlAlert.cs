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
    /// This resource allows you to manage [Databricks SQL Alerts](https://docs.databricks.com/sql/user/queries/index.html).
    /// 
    /// **Note:** To manage [SQLA resources](https://docs.databricks.com/sql/get-started/concepts.html) you must have `databricks_sql_access` on your databricks.Group or databricks_user.
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
    ///     var sharedDir = new Databricks.Directory("shared_dir", new()
    ///     {
    ///         Path = "/Shared/Queries",
    ///     });
    /// 
    ///     var @this = new Databricks.SqlQuery("this", new()
    ///     {
    ///         DataSourceId = example.DataSourceId,
    ///         Name = "My Query Name",
    ///         Query = "SELECT 1 AS p1, 2 as p2",
    ///         Parent = sharedDir.ObjectId.Apply(objectId =&gt; $"folders/{objectId}"),
    ///     });
    /// 
    ///     var alert = new Databricks.SqlAlert("alert", new()
    ///     {
    ///         QueryId = @this.Id,
    ///         Name = "My Alert",
    ///         Parent = sharedDir.ObjectId.Apply(objectId =&gt; $"folders/{objectId}"),
    ///         Rearm = 1,
    ///         Options = new Databricks.Inputs.SqlAlertOptionsArgs
    ///         {
    ///             Column = "p1",
    ///             Op = "==",
    ///             Value = "2",
    ///             Muted = false,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * End to end workspace management guide.
    /// * databricks.SqlQuery to manage Databricks SQL [Queries](https://docs.databricks.com/sql/user/queries/index.html).
    /// * databricks.SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
    /// * databricks.Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
    /// </summary>
    [DatabricksResourceType("databricks:index/sqlAlert:SqlAlert")]
    public partial class SqlAlert : global::Pulumi.CustomResource
    {
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Name of the alert.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Alert configuration options.
        /// </summary>
        [Output("options")]
        public Output<Outputs.SqlAlertOptions> Options { get; private set; } = null!;

        /// <summary>
        /// The identifier of the workspace folder containing the alert. The default is ther user's home folder. The folder identifier is formatted as `folder/&lt;folder_id&gt;`.
        /// </summary>
        [Output("parent")]
        public Output<string?> Parent { get; private set; } = null!;

        /// <summary>
        /// ID of the query evaluated by the alert.
        /// </summary>
        [Output("queryId")]
        public Output<string> QueryId { get; private set; } = null!;

        /// <summary>
        /// Number of seconds after being triggered before the alert rearms itself and can be triggered again. If not defined, alert will never be triggered again.
        /// </summary>
        [Output("rearm")]
        public Output<int?> Rearm { get; private set; } = null!;

        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;


        /// <summary>
        /// Create a SqlAlert resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SqlAlert(string name, SqlAlertArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/sqlAlert:SqlAlert", name, args ?? new SqlAlertArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SqlAlert(string name, Input<string> id, SqlAlertState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/sqlAlert:SqlAlert", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SqlAlert resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SqlAlert Get(string name, Input<string> id, SqlAlertState? state = null, CustomResourceOptions? options = null)
        {
            return new SqlAlert(name, id, state, options);
        }
    }

    public sealed class SqlAlertArgs : global::Pulumi.ResourceArgs
    {
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Name of the alert.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Alert configuration options.
        /// </summary>
        [Input("options", required: true)]
        public Input<Inputs.SqlAlertOptionsArgs> Options { get; set; } = null!;

        /// <summary>
        /// The identifier of the workspace folder containing the alert. The default is ther user's home folder. The folder identifier is formatted as `folder/&lt;folder_id&gt;`.
        /// </summary>
        [Input("parent")]
        public Input<string>? Parent { get; set; }

        /// <summary>
        /// ID of the query evaluated by the alert.
        /// </summary>
        [Input("queryId", required: true)]
        public Input<string> QueryId { get; set; } = null!;

        /// <summary>
        /// Number of seconds after being triggered before the alert rearms itself and can be triggered again. If not defined, alert will never be triggered again.
        /// </summary>
        [Input("rearm")]
        public Input<int>? Rearm { get; set; }

        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        public SqlAlertArgs()
        {
        }
        public static new SqlAlertArgs Empty => new SqlAlertArgs();
    }

    public sealed class SqlAlertState : global::Pulumi.ResourceArgs
    {
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Name of the alert.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Alert configuration options.
        /// </summary>
        [Input("options")]
        public Input<Inputs.SqlAlertOptionsGetArgs>? Options { get; set; }

        /// <summary>
        /// The identifier of the workspace folder containing the alert. The default is ther user's home folder. The folder identifier is formatted as `folder/&lt;folder_id&gt;`.
        /// </summary>
        [Input("parent")]
        public Input<string>? Parent { get; set; }

        /// <summary>
        /// ID of the query evaluated by the alert.
        /// </summary>
        [Input("queryId")]
        public Input<string>? QueryId { get; set; }

        /// <summary>
        /// Number of seconds after being triggered before the alert rearms itself and can be triggered again. If not defined, alert will never be triggered again.
        /// </summary>
        [Input("rearm")]
        public Input<int>? Rearm { get; set; }

        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        public SqlAlertState()
        {
        }
        public static new SqlAlertState Empty => new SqlAlertState();
    }
}
