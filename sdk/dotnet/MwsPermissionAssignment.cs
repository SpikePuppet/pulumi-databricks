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
    /// These resources are invoked in the account context. Permission Assignment Account API endpoints are restricted to account admins. Provider must have `account_id` attribute configured. Account Id that could be found in the top right corner of Accounts Console
    /// 
    /// ## Example Usage
    /// 
    /// In account context, adding account-level group to a workspace:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var dataEng = new Databricks.Group("data_eng", new()
    ///     {
    ///         DisplayName = "Data Engineering",
    ///     });
    /// 
    ///     var addAdminGroup = new Databricks.MwsPermissionAssignment("add_admin_group", new()
    ///     {
    ///         WorkspaceId = @this.WorkspaceId,
    ///         PrincipalId = dataEng.Id,
    ///         Permissions = new[]
    ///         {
    ///             "ADMIN",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// In account context, adding account-level user to a workspace:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var me = new Databricks.User("me", new()
    ///     {
    ///         UserName = "me@example.com",
    ///     });
    /// 
    ///     var addUser = new Databricks.MwsPermissionAssignment("add_user", new()
    ///     {
    ///         WorkspaceId = @this.WorkspaceId,
    ///         PrincipalId = me.Id,
    ///         Permissions = new[]
    ///         {
    ///             "USER",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// In account context, adding account-level service principal to a workspace:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var sp = new Databricks.ServicePrincipal("sp", new()
    ///     {
    ///         DisplayName = "Automation-only SP",
    ///     });
    /// 
    ///     var addAdminSpn = new Databricks.MwsPermissionAssignment("add_admin_spn", new()
    ///     {
    ///         WorkspaceId = @this.WorkspaceId,
    ///         PrincipalId = sp.Id,
    ///         Permissions = new[]
    ///         {
    ///             "ADMIN",
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
    /// * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
    /// * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
    /// * databricks.GroupMember to attach users and groups as group members.
    /// * databricks.PermissionAssignment to manage permission assignment from a workspace context
    /// 
    /// ## Import
    /// 
    /// The resource `databricks_mws_permission_assignment` can be imported using the workspace id and principal id
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/mwsPermissionAssignment:MwsPermissionAssignment this "workspace_id|principal_id"
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/mwsPermissionAssignment:MwsPermissionAssignment")]
    public partial class MwsPermissionAssignment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The list of workspace permissions to assign to the principal:
        /// * `"USER"` - Can access the workspace with basic privileges.
        /// * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
        /// </summary>
        [Output("permissions")]
        public Output<ImmutableArray<string>> Permissions { get; private set; } = null!;

        /// <summary>
        /// Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, databricks.ServicePrincipal or databricks.Group data sources.
        /// </summary>
        [Output("principalId")]
        public Output<int> PrincipalId { get; private set; } = null!;

        /// <summary>
        /// Databricks workspace ID.
        /// </summary>
        [Output("workspaceId")]
        public Output<string> WorkspaceId { get; private set; } = null!;


        /// <summary>
        /// Create a MwsPermissionAssignment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MwsPermissionAssignment(string name, MwsPermissionAssignmentArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/mwsPermissionAssignment:MwsPermissionAssignment", name, args ?? new MwsPermissionAssignmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MwsPermissionAssignment(string name, Input<string> id, MwsPermissionAssignmentState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/mwsPermissionAssignment:MwsPermissionAssignment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MwsPermissionAssignment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MwsPermissionAssignment Get(string name, Input<string> id, MwsPermissionAssignmentState? state = null, CustomResourceOptions? options = null)
        {
            return new MwsPermissionAssignment(name, id, state, options);
        }
    }

    public sealed class MwsPermissionAssignmentArgs : global::Pulumi.ResourceArgs
    {
        [Input("permissions", required: true)]
        private InputList<string>? _permissions;

        /// <summary>
        /// The list of workspace permissions to assign to the principal:
        /// * `"USER"` - Can access the workspace with basic privileges.
        /// * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
        /// </summary>
        public InputList<string> Permissions
        {
            get => _permissions ?? (_permissions = new InputList<string>());
            set => _permissions = value;
        }

        /// <summary>
        /// Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, databricks.ServicePrincipal or databricks.Group data sources.
        /// </summary>
        [Input("principalId", required: true)]
        public Input<int> PrincipalId { get; set; } = null!;

        /// <summary>
        /// Databricks workspace ID.
        /// </summary>
        [Input("workspaceId", required: true)]
        public Input<string> WorkspaceId { get; set; } = null!;

        public MwsPermissionAssignmentArgs()
        {
        }
        public static new MwsPermissionAssignmentArgs Empty => new MwsPermissionAssignmentArgs();
    }

    public sealed class MwsPermissionAssignmentState : global::Pulumi.ResourceArgs
    {
        [Input("permissions")]
        private InputList<string>? _permissions;

        /// <summary>
        /// The list of workspace permissions to assign to the principal:
        /// * `"USER"` - Can access the workspace with basic privileges.
        /// * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
        /// </summary>
        public InputList<string> Permissions
        {
            get => _permissions ?? (_permissions = new InputList<string>());
            set => _permissions = value;
        }

        /// <summary>
        /// Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, databricks.ServicePrincipal or databricks.Group data sources.
        /// </summary>
        [Input("principalId")]
        public Input<int>? PrincipalId { get; set; }

        /// <summary>
        /// Databricks workspace ID.
        /// </summary>
        [Input("workspaceId")]
        public Input<string>? WorkspaceId { get; set; }

        public MwsPermissionAssignmentState()
        {
        }
        public static new MwsPermissionAssignmentState Empty => new MwsPermissionAssignmentState();
    }
}
