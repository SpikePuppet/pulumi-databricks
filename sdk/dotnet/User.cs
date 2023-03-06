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
    /// Creating regular user:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
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
    /// });
    /// ```
    /// 
    /// Creating user with administrative permissions - referencing special `admins` databricks.Group in databricks.GroupMember resource:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var admins = Databricks.GetGroup.Invoke(new()
    ///     {
    ///         DisplayName = "admins",
    ///     });
    /// 
    ///     var me = new Databricks.User("me", new()
    ///     {
    ///         UserName = "me@example.com",
    ///     });
    /// 
    ///     var i_am_admin = new Databricks.GroupMember("i-am-admin", new()
    ///     {
    ///         GroupId = admins.Apply(getGroupResult =&gt; getGroupResult.Id),
    ///         MemberId = me.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Creating user with cluster create permissions:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var me = new Databricks.User("me", new()
    ///     {
    ///         AllowClusterCreate = true,
    ///         DisplayName = "Example user",
    ///         UserName = "me@example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Creating user in AWS Databricks account:
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // initialize provider at account-level
    ///     var mws = new Databricks.Provider("mws", new()
    ///     {
    ///         Host = "https://accounts.cloud.databricks.com",
    ///         AccountId = "00000000-0000-0000-0000-000000000000",
    ///         Username = @var.Databricks_account_username,
    ///         Password = @var.Databricks_account_password,
    ///     });
    /// 
    ///     var accountUser = new Databricks.User("accountUser", new()
    ///     {
    ///         UserName = "me@example.com",
    ///         DisplayName = "Example user",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = databricks.Mws,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Creating user in Azure Databricks account:
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // initialize provider at Azure account-level
    ///     var azureAccount = new Databricks.Provider("azureAccount", new()
    ///     {
    ///         Host = "https://accounts.azuredatabricks.net",
    ///         AccountId = "00000000-0000-0000-0000-000000000000",
    ///         AuthType = "azure-cli",
    ///     });
    /// 
    ///     var accountUser = new Databricks.User("accountUser", new()
    ///     {
    ///         UserName = "me@example.com",
    ///         DisplayName = "Example user",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = databricks.Azure_account,
    ///     });
    /// 
    /// });
    /// ```
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * End to end workspace management guide.
    /// * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
    /// * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
    /// * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
    /// * databricks.GroupMember to attach users and groups as group members.
    /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
    /// * databricks.User data to retrieve information about databricks_user.
    /// 
    /// ## Import
    /// 
    /// The resource scim user can be imported using idbash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/user:User me &lt;user-id&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/user:User")]
    public partial class User : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
        /// </summary>
        [Output("active")]
        public Output<bool?> Active { get; private set; } = null!;

        /// <summary>
        /// Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        /// </summary>
        [Output("allowClusterCreate")]
        public Output<bool?> AllowClusterCreate { get; private set; } = null!;

        /// <summary>
        /// Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
        /// </summary>
        [Output("allowInstancePoolCreate")]
        public Output<bool?> AllowInstancePoolCreate { get; private set; } = null!;

        /// <summary>
        /// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        /// </summary>
        [Output("databricksSqlAccess")]
        public Output<bool?> DatabricksSqlAccess { get; private set; } = null!;

        /// <summary>
        /// This is an alias for the username that can be the full name of the user.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// ID of the user in an external identity provider.
        /// </summary>
        [Output("externalId")]
        public Output<string?> ExternalId { get; private set; } = null!;

        [Output("force")]
        public Output<bool?> Force { get; private set; } = null!;

        /// <summary>
        /// This flag determines whether the user's home directory is deleted when the user is deleted. It will have not impact when in the accounts SCIM API. False by default.
        /// </summary>
        [Output("forceDeleteHomeDir")]
        public Output<bool?> ForceDeleteHomeDir { get; private set; } = null!;

        /// <summary>
        /// This flag determines whether the user's repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
        /// </summary>
        [Output("forceDeleteRepos")]
        public Output<bool?> ForceDeleteRepos { get; private set; } = null!;

        /// <summary>
        /// Home folder of the user, e.g. `/Users/mr.foo@example.com`.
        /// </summary>
        [Output("home")]
        public Output<string> Home { get; private set; } = null!;

        /// <summary>
        /// Personal Repos location of the user, e.g. `/Repos/mr.foo@example.com`.
        /// </summary>
        [Output("repos")]
        public Output<string> Repos { get; private set; } = null!;

        /// <summary>
        /// This is the username of the given user and will be their form of access and identity.
        /// </summary>
        [Output("userName")]
        public Output<string> UserName { get; private set; } = null!;

        [Output("workspaceAccess")]
        public Output<bool?> WorkspaceAccess { get; private set; } = null!;


        /// <summary>
        /// Create a User resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public User(string name, UserArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/user:User", name, args ?? new UserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private User(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/user:User", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing User resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static User Get(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
        {
            return new User(name, id, state, options);
        }
    }

    public sealed class UserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        /// </summary>
        [Input("allowClusterCreate")]
        public Input<bool>? AllowClusterCreate { get; set; }

        /// <summary>
        /// Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
        /// </summary>
        [Input("allowInstancePoolCreate")]
        public Input<bool>? AllowInstancePoolCreate { get; set; }

        /// <summary>
        /// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        /// </summary>
        [Input("databricksSqlAccess")]
        public Input<bool>? DatabricksSqlAccess { get; set; }

        /// <summary>
        /// This is an alias for the username that can be the full name of the user.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// ID of the user in an external identity provider.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// This flag determines whether the user's home directory is deleted when the user is deleted. It will have not impact when in the accounts SCIM API. False by default.
        /// </summary>
        [Input("forceDeleteHomeDir")]
        public Input<bool>? ForceDeleteHomeDir { get; set; }

        /// <summary>
        /// This flag determines whether the user's repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
        /// </summary>
        [Input("forceDeleteRepos")]
        public Input<bool>? ForceDeleteRepos { get; set; }

        /// <summary>
        /// Home folder of the user, e.g. `/Users/mr.foo@example.com`.
        /// </summary>
        [Input("home")]
        public Input<string>? Home { get; set; }

        /// <summary>
        /// Personal Repos location of the user, e.g. `/Repos/mr.foo@example.com`.
        /// </summary>
        [Input("repos")]
        public Input<string>? Repos { get; set; }

        /// <summary>
        /// This is the username of the given user and will be their form of access and identity.
        /// </summary>
        [Input("userName", required: true)]
        public Input<string> UserName { get; set; } = null!;

        [Input("workspaceAccess")]
        public Input<bool>? WorkspaceAccess { get; set; }

        public UserArgs()
        {
        }
        public static new UserArgs Empty => new UserArgs();
    }

    public sealed class UserState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        /// </summary>
        [Input("allowClusterCreate")]
        public Input<bool>? AllowClusterCreate { get; set; }

        /// <summary>
        /// Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
        /// </summary>
        [Input("allowInstancePoolCreate")]
        public Input<bool>? AllowInstancePoolCreate { get; set; }

        /// <summary>
        /// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        /// </summary>
        [Input("databricksSqlAccess")]
        public Input<bool>? DatabricksSqlAccess { get; set; }

        /// <summary>
        /// This is an alias for the username that can be the full name of the user.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// ID of the user in an external identity provider.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// This flag determines whether the user's home directory is deleted when the user is deleted. It will have not impact when in the accounts SCIM API. False by default.
        /// </summary>
        [Input("forceDeleteHomeDir")]
        public Input<bool>? ForceDeleteHomeDir { get; set; }

        /// <summary>
        /// This flag determines whether the user's repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
        /// </summary>
        [Input("forceDeleteRepos")]
        public Input<bool>? ForceDeleteRepos { get; set; }

        /// <summary>
        /// Home folder of the user, e.g. `/Users/mr.foo@example.com`.
        /// </summary>
        [Input("home")]
        public Input<string>? Home { get; set; }

        /// <summary>
        /// Personal Repos location of the user, e.g. `/Repos/mr.foo@example.com`.
        /// </summary>
        [Input("repos")]
        public Input<string>? Repos { get; set; }

        /// <summary>
        /// This is the username of the given user and will be their form of access and identity.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        [Input("workspaceAccess")]
        public Input<bool>? WorkspaceAccess { get; set; }

        public UserState()
        {
        }
        public static new UserState Empty => new UserState();
    }
}
