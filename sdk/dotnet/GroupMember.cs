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
    /// This resource allows you to attach users, service_principal, and groups as group members.
    /// 
    /// To attach members to groups in the Databricks account, the provider must be configured with `host = "https://accounts.cloud.databricks.com"` on AWS deployments or `host = "https://accounts.azuredatabricks.net"` and authenticate using AAD tokens on Azure deployments
    /// 
    /// ## Example Usage
    /// 
    /// After the following example, Bradley would have direct membership in group B and transitive membership in group A.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var a = new Databricks.Group("a", new()
    ///     {
    ///         DisplayName = "A",
    ///     });
    /// 
    ///     var b = new Databricks.Group("b", new()
    ///     {
    ///         DisplayName = "B",
    ///     });
    /// 
    ///     var ab = new Databricks.GroupMember("ab", new()
    ///     {
    ///         GroupId = a.Id,
    ///         MemberId = b.Id,
    ///     });
    /// 
    ///     var bradley = new Databricks.User("bradley", new()
    ///     {
    ///         UserName = "bradley@example.com",
    ///     });
    /// 
    ///     var bb = new Databricks.GroupMember("bb", new()
    ///     {
    ///         GroupId = b.Id,
    ///         MemberId = bradley.Id,
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
    /// * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
    /// * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
    /// * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
    /// * databricks.IpAccessList to allow access from [predefined IP ranges](https://docs.databricks.com/security/network/ip-access-list.html).
    /// * databricks.ServicePrincipal to grant access to a workspace to an automation tool or application.
    /// * databricks.User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to databricks.Group within the workspace.
    /// * databricks.User data to retrieve information about databricks_user.
    /// * databricks.UserInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_user.
    /// 
    /// ## Import
    /// 
    /// You can import a `databricks_group_member` resource with name `my_group_member` like the following:
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/groupMember:GroupMember my_group_member "&lt;group_id&gt;|&lt;member_id&gt;"
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/groupMember:GroupMember")]
    public partial class GroupMember : global::Pulumi.CustomResource
    {
        /// <summary>
        /// This is the id of the group resource.
        /// </summary>
        [Output("groupId")]
        public Output<string> GroupId { get; private set; } = null!;

        /// <summary>
        /// This is the id of the group, service principal, or user.
        /// </summary>
        [Output("memberId")]
        public Output<string> MemberId { get; private set; } = null!;


        /// <summary>
        /// Create a GroupMember resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GroupMember(string name, GroupMemberArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/groupMember:GroupMember", name, args ?? new GroupMemberArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GroupMember(string name, Input<string> id, GroupMemberState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/groupMember:GroupMember", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GroupMember resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GroupMember Get(string name, Input<string> id, GroupMemberState? state = null, CustomResourceOptions? options = null)
        {
            return new GroupMember(name, id, state, options);
        }
    }

    public sealed class GroupMemberArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This is the id of the group resource.
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// This is the id of the group, service principal, or user.
        /// </summary>
        [Input("memberId", required: true)]
        public Input<string> MemberId { get; set; } = null!;

        public GroupMemberArgs()
        {
        }
        public static new GroupMemberArgs Empty => new GroupMemberArgs();
    }

    public sealed class GroupMemberState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This is the id of the group resource.
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// This is the id of the group, service principal, or user.
        /// </summary>
        [Input("memberId")]
        public Input<string>? MemberId { get; set; }

        public GroupMemberState()
        {
        }
        public static new GroupMemberState Empty => new GroupMemberState();
    }
}
