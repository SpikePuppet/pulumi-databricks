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
    /// &gt; **Deprecated** Please migrate to databricks_group_role.
    /// 
    /// This resource allows you to attach databricks.InstanceProfile (AWS) to databricks_group.
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
    ///     var instanceProfile = new Databricks.InstanceProfile("instance_profile", new()
    ///     {
    ///         InstanceProfileArn = "my_instance_profile_arn",
    ///     });
    /// 
    ///     var myGroup = new Databricks.Group("my_group", new()
    ///     {
    ///         DisplayName = "my_group_name",
    ///     });
    /// 
    ///     var myGroupInstanceProfile = new Databricks.GroupInstanceProfile("my_group_instance_profile", new()
    ///     {
    ///         GroupId = myGroup.Id,
    ///         InstanceProfileId = instanceProfile.Id,
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
    /// * databricks.getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
    /// * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
    /// * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
    /// * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
    /// * databricks.GroupMember to attach users and groups as group members.
    /// * databricks.InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
    /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
    /// * databricks.UserInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_user.
    /// 
    /// ## Import
    /// 
    /// -&gt; **Note** Importing this resource is not currently supported.
    /// </summary>
    [DatabricksResourceType("databricks:index/groupInstanceProfile:GroupInstanceProfile")]
    public partial class GroupInstanceProfile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// This is the id of the group resource.
        /// </summary>
        [Output("groupId")]
        public Output<string> GroupId { get; private set; } = null!;

        /// <summary>
        /// This is the id of the instance profile resource.
        /// </summary>
        [Output("instanceProfileId")]
        public Output<string> InstanceProfileId { get; private set; } = null!;


        /// <summary>
        /// Create a GroupInstanceProfile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GroupInstanceProfile(string name, GroupInstanceProfileArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/groupInstanceProfile:GroupInstanceProfile", name, args ?? new GroupInstanceProfileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GroupInstanceProfile(string name, Input<string> id, GroupInstanceProfileState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/groupInstanceProfile:GroupInstanceProfile", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GroupInstanceProfile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GroupInstanceProfile Get(string name, Input<string> id, GroupInstanceProfileState? state = null, CustomResourceOptions? options = null)
        {
            return new GroupInstanceProfile(name, id, state, options);
        }
    }

    public sealed class GroupInstanceProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This is the id of the group resource.
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// This is the id of the instance profile resource.
        /// </summary>
        [Input("instanceProfileId", required: true)]
        public Input<string> InstanceProfileId { get; set; } = null!;

        public GroupInstanceProfileArgs()
        {
        }
        public static new GroupInstanceProfileArgs Empty => new GroupInstanceProfileArgs();
    }

    public sealed class GroupInstanceProfileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This is the id of the group resource.
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// This is the id of the instance profile resource.
        /// </summary>
        [Input("instanceProfileId")]
        public Input<string>? InstanceProfileId { get; set; }

        public GroupInstanceProfileState()
        {
        }
        public static new GroupInstanceProfileState Empty => new GroupInstanceProfileState();
    }
}
