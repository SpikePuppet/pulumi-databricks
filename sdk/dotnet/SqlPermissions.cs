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
    /// The following resource definition will enforce access control on a table by executing the following SQL queries on a special auto-terminating cluster it would create for this operation:
    /// 
    /// * ``` SHOW GRANT ON TABLE `default`.`foo`  ```
    /// * ```REVOKE ALL PRIVILEGES ON TABLE `default`.`foo` FROM ... every group and user that has access to it ...```
    /// * ``` GRANT MODIFY, SELECT ON TABLE `default`.`foo` TO `serge@example.com`  ```
    /// * ``` GRANT SELECT ON TABLE `default`.`foo` TO `special group`  ```
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var fooTable = new Databricks.SqlPermissions("fooTable", new()
    ///     {
    ///         PrivilegeAssignments = new[]
    ///         {
    ///             new Databricks.Inputs.SqlPermissionsPrivilegeAssignmentArgs
    ///             {
    ///                 Principal = "serge@example.com",
    ///                 Privileges = new[]
    ///                 {
    ///                     "SELECT",
    ///                     "MODIFY",
    ///                 },
    ///             },
    ///             new Databricks.Inputs.SqlPermissionsPrivilegeAssignmentArgs
    ///             {
    ///                 Principal = "special group",
    ///                 Privileges = new[]
    ///                 {
    ///                     "SELECT",
    ///                 },
    ///             },
    ///         },
    ///         Table = "foo",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * End to end workspace management guide.
    /// * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
    /// * databricks.Grants to manage data access in Unity Catalog.
    /// * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
    /// * databricks.User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to databricks.Group within the workspace.
    /// 
    /// ## Import
    /// 
    /// The resource can be imported using a synthetic identifier. Examples of valid synthetic identifiers are:
    /// 
    /// * `table/default.foo` - table `foo` in a `default` database. Database is always mandatory.
    /// 
    /// * `view/bar.foo` - view `foo` in `bar` database.
    /// 
    /// * `database/bar` - `bar` database.
    /// 
    /// * `catalog/` - entire catalog. `/` suffix is mandatory.
    /// 
    /// * `any file/` - direct access to any file. `/` suffix is mandatory.
    /// 
    /// * `anonymous function/` - anonymous function. `/` suffix is mandatory.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/sqlPermissions:SqlPermissions foo /&lt;object-type&gt;/&lt;object-name&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/sqlPermissions:SqlPermissions")]
    public partial class SqlPermissions : global::Pulumi.CustomResource
    {
        /// <summary>
        /// If this access control for using anonymous function. Defaults to `false`.
        /// </summary>
        [Output("anonymousFunction")]
        public Output<bool?> AnonymousFunction { get; private set; } = null!;

        /// <summary>
        /// If this access control for reading/writing any file. Defaults to `false`.
        /// </summary>
        [Output("anyFile")]
        public Output<bool?> AnyFile { get; private set; } = null!;

        /// <summary>
        /// If this access control for the entire catalog. Defaults to `false`.
        /// </summary>
        [Output("catalog")]
        public Output<bool?> Catalog { get; private set; } = null!;

        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// Name of the database. Has default value of `default`.
        /// </summary>
        [Output("database")]
        public Output<string?> Database { get; private set; } = null!;

        [Output("privilegeAssignments")]
        public Output<ImmutableArray<Outputs.SqlPermissionsPrivilegeAssignment>> PrivilegeAssignments { get; private set; } = null!;

        /// <summary>
        /// Name of the table. Can be combined with `database`.
        /// </summary>
        [Output("table")]
        public Output<string?> Table { get; private set; } = null!;

        /// <summary>
        /// Name of the view. Can be combined with `database`.
        /// </summary>
        [Output("view")]
        public Output<string?> View { get; private set; } = null!;


        /// <summary>
        /// Create a SqlPermissions resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SqlPermissions(string name, SqlPermissionsArgs? args = null, CustomResourceOptions? options = null)
            : base("databricks:index/sqlPermissions:SqlPermissions", name, args ?? new SqlPermissionsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SqlPermissions(string name, Input<string> id, SqlPermissionsState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/sqlPermissions:SqlPermissions", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SqlPermissions resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SqlPermissions Get(string name, Input<string> id, SqlPermissionsState? state = null, CustomResourceOptions? options = null)
        {
            return new SqlPermissions(name, id, state, options);
        }
    }

    public sealed class SqlPermissionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If this access control for using anonymous function. Defaults to `false`.
        /// </summary>
        [Input("anonymousFunction")]
        public Input<bool>? AnonymousFunction { get; set; }

        /// <summary>
        /// If this access control for reading/writing any file. Defaults to `false`.
        /// </summary>
        [Input("anyFile")]
        public Input<bool>? AnyFile { get; set; }

        /// <summary>
        /// If this access control for the entire catalog. Defaults to `false`.
        /// </summary>
        [Input("catalog")]
        public Input<bool>? Catalog { get; set; }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// Name of the database. Has default value of `default`.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        [Input("privilegeAssignments")]
        private InputList<Inputs.SqlPermissionsPrivilegeAssignmentArgs>? _privilegeAssignments;
        public InputList<Inputs.SqlPermissionsPrivilegeAssignmentArgs> PrivilegeAssignments
        {
            get => _privilegeAssignments ?? (_privilegeAssignments = new InputList<Inputs.SqlPermissionsPrivilegeAssignmentArgs>());
            set => _privilegeAssignments = value;
        }

        /// <summary>
        /// Name of the table. Can be combined with `database`.
        /// </summary>
        [Input("table")]
        public Input<string>? Table { get; set; }

        /// <summary>
        /// Name of the view. Can be combined with `database`.
        /// </summary>
        [Input("view")]
        public Input<string>? View { get; set; }

        public SqlPermissionsArgs()
        {
        }
        public static new SqlPermissionsArgs Empty => new SqlPermissionsArgs();
    }

    public sealed class SqlPermissionsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If this access control for using anonymous function. Defaults to `false`.
        /// </summary>
        [Input("anonymousFunction")]
        public Input<bool>? AnonymousFunction { get; set; }

        /// <summary>
        /// If this access control for reading/writing any file. Defaults to `false`.
        /// </summary>
        [Input("anyFile")]
        public Input<bool>? AnyFile { get; set; }

        /// <summary>
        /// If this access control for the entire catalog. Defaults to `false`.
        /// </summary>
        [Input("catalog")]
        public Input<bool>? Catalog { get; set; }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// Name of the database. Has default value of `default`.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        [Input("privilegeAssignments")]
        private InputList<Inputs.SqlPermissionsPrivilegeAssignmentGetArgs>? _privilegeAssignments;
        public InputList<Inputs.SqlPermissionsPrivilegeAssignmentGetArgs> PrivilegeAssignments
        {
            get => _privilegeAssignments ?? (_privilegeAssignments = new InputList<Inputs.SqlPermissionsPrivilegeAssignmentGetArgs>());
            set => _privilegeAssignments = value;
        }

        /// <summary>
        /// Name of the table. Can be combined with `database`.
        /// </summary>
        [Input("table")]
        public Input<string>? Table { get; set; }

        /// <summary>
        /// Name of the view. Can be combined with `database`.
        /// </summary>
        [Input("view")]
        public Input<string>? View { get; set; }

        public SqlPermissionsState()
        {
        }
        public static new SqlPermissionsState Empty => new SqlPermissionsState();
    }
}
