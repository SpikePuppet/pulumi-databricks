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
    /// To manage [SQLA resources](https://docs.databricks.com/sql/get-started/concepts.html) you must have `databricks_sql_access` on your databricks.Group or databricks_user.
    /// 
    /// **Note:** documentation for this resource is a work in progress.
    /// 
    /// A query may have one or more visualizations.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var q1 = new Databricks.SqlQuery("q1", new Databricks.SqlQueryArgs
    ///         {
    ///             DataSourceId = databricks_sql_endpoint.Example.Data_source_id,
    ///             Query = "SELECT {{ p1 }} AS p1, 2 as p2",
    ///             RunAsRole = "viewer",
    ///             Schedule = new Databricks.Inputs.SqlQueryScheduleArgs
    ///             {
    ///                 Continuous = new Databricks.Inputs.SqlQueryScheduleContinuousArgs
    ///                 {
    ///                     IntervalSeconds = 5 * 60,
    ///                 },
    ///             },
    ///             Parameters = 
    ///             {
    ///                 new Databricks.Inputs.SqlQueryParameterArgs
    ///                 {
    ///                     Name = "p1",
    ///                     Title = "Title for p1",
    ///                     Text = new Databricks.Inputs.SqlQueryParameterTextArgs
    ///                     {
    ///                         Value = "default",
    ///                     },
    ///                 },
    ///             },
    ///             Tags = 
    ///             {
    ///                 "t1",
    ///                 "t2",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// Example permission to share query with all users:
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var q1 = new Databricks.Permissions("q1", new Databricks.PermissionsArgs
    ///         {
    ///             SqlQueryId = databricks_sql_query.Q1.Id,
    ///             AccessControls = 
    ///             {
    ///                 new Databricks.Inputs.PermissionsAccessControlArgs
    ///                 {
    ///                     GroupName = data.Databricks_group.Users.Display_name,
    ///                     PermissionLevel = "CAN_RUN",
    ///                 },
    ///                 new Databricks.Inputs.PermissionsAccessControlArgs
    ///                 {
    ///                     GroupName = data.Databricks_group.Team.Display_name,
    ///                     PermissionLevel = "CAN_EDIT",
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * End to end workspace management guide.
    /// * databricks.SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
    /// * databricks.SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
    /// * databricks.SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all databricks.SqlEndpoint of workspace.
    /// * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
    /// 
    /// ## Import
    /// 
    /// You can import a `databricks_sql_query` resource with ID like the followingbash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/sqlQuery:SqlQuery this &lt;query-id&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/sqlQuery:SqlQuery")]
    public partial class SqlQuery : Pulumi.CustomResource
    {
        [Output("dataSourceId")]
        public Output<string> DataSourceId { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("parameters")]
        public Output<ImmutableArray<Outputs.SqlQueryParameter>> Parameters { get; private set; } = null!;

        [Output("query")]
        public Output<string> Query { get; private set; } = null!;

        [Output("runAsRole")]
        public Output<string?> RunAsRole { get; private set; } = null!;

        [Output("schedule")]
        public Output<Outputs.SqlQuerySchedule?> Schedule { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a SqlQuery resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SqlQuery(string name, SqlQueryArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/sqlQuery:SqlQuery", name, args ?? new SqlQueryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SqlQuery(string name, Input<string> id, SqlQueryState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/sqlQuery:SqlQuery", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SqlQuery resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SqlQuery Get(string name, Input<string> id, SqlQueryState? state = null, CustomResourceOptions? options = null)
        {
            return new SqlQuery(name, id, state, options);
        }
    }

    public sealed class SqlQueryArgs : Pulumi.ResourceArgs
    {
        [Input("dataSourceId", required: true)]
        public Input<string> DataSourceId { get; set; } = null!;

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputList<Inputs.SqlQueryParameterArgs>? _parameters;
        public InputList<Inputs.SqlQueryParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.SqlQueryParameterArgs>());
            set => _parameters = value;
        }

        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        [Input("runAsRole")]
        public Input<string>? RunAsRole { get; set; }

        [Input("schedule")]
        public Input<Inputs.SqlQueryScheduleArgs>? Schedule { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public SqlQueryArgs()
        {
        }
    }

    public sealed class SqlQueryState : Pulumi.ResourceArgs
    {
        [Input("dataSourceId")]
        public Input<string>? DataSourceId { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputList<Inputs.SqlQueryParameterGetArgs>? _parameters;
        public InputList<Inputs.SqlQueryParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.SqlQueryParameterGetArgs>());
            set => _parameters = value;
        }

        [Input("query")]
        public Input<string>? Query { get; set; }

        [Input("runAsRole")]
        public Input<string>? RunAsRole { get; set; }

        [Input("schedule")]
        public Input<Inputs.SqlQueryScheduleGetArgs>? Schedule { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public SqlQueryState()
        {
        }
    }
}
