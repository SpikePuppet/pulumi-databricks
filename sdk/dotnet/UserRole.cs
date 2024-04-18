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
    /// This resource allows you to attach a role or databricks.InstanceProfile (AWS) to databricks_user.
    /// 
    /// ## Example Usage
    /// 
    /// Adding AWS instance profile to a user
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
    ///     var instanceProfile = new Databricks.InstanceProfile("instance_profile", new()
    ///     {
    ///         InstanceProfileArn = "my_instance_profile_arn",
    ///     });
    /// 
    ///     var myUser = new Databricks.User("my_user", new()
    ///     {
    ///         UserName = "me@example.com",
    ///     });
    /// 
    ///     var myUserRole = new Databricks.UserRole("my_user_role", new()
    ///     {
    ///         UserId = myUser.Id,
    ///         Role = instanceProfile.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// Adding user as administrator to Databricks Account
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
    ///     var myUser = new Databricks.User("my_user", new()
    ///     {
    ///         UserName = "me@example.com",
    ///     });
    /// 
    ///     var myUserAccountAdmin = new Databricks.UserRole("my_user_account_admin", new()
    ///     {
    ///         UserId = myUser.Id,
    ///         Role = "account_admin",
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
    /// * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
    /// * databricks.GroupMember to attach users and groups as group members.
    /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
    /// * databricks.User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to databricks.Group within the workspace.
    /// * databricks.User data to retrieve information about databricks_user.
    /// 
    /// ## Import
    /// 
    /// -&gt; **Note** Importing this resource is not currently supported.
    /// </summary>
    [DatabricksResourceType("databricks:index/userRole:UserRole")]
    public partial class UserRole : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Either a role name or the ARN/ID of the instance profile resource.
        /// </summary>
        [Output("role")]
        public Output<string> Role { get; private set; } = null!;

        /// <summary>
        /// This is the id of the user resource.
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a UserRole resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserRole(string name, UserRoleArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/userRole:UserRole", name, args ?? new UserRoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserRole(string name, Input<string> id, UserRoleState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/userRole:UserRole", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserRole resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserRole Get(string name, Input<string> id, UserRoleState? state = null, CustomResourceOptions? options = null)
        {
            return new UserRole(name, id, state, options);
        }
    }

    public sealed class UserRoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Either a role name or the ARN/ID of the instance profile resource.
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        /// <summary>
        /// This is the id of the user resource.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public UserRoleArgs()
        {
        }
        public static new UserRoleArgs Empty => new UserRoleArgs();
    }

    public sealed class UserRoleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Either a role name or the ARN/ID of the instance profile resource.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// This is the id of the user resource.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public UserRoleState()
        {
        }
        public static new UserRoleState Empty => new UserRoleState();
    }
}
