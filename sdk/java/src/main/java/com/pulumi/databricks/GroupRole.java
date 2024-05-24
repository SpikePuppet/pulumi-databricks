// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.GroupRoleArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.GroupRoleState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource allows you to attach a role to databricks_group. This role could be a pre-defined role such as account admin, or an instance profile ARN.
 * 
 * ## Example Usage
 * 
 * Attach an instance profile to a group
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.InstanceProfile;
 * import com.pulumi.databricks.InstanceProfileArgs;
 * import com.pulumi.databricks.Group;
 * import com.pulumi.databricks.GroupArgs;
 * import com.pulumi.databricks.GroupRole;
 * import com.pulumi.databricks.GroupRoleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var instanceProfile = new InstanceProfile("instanceProfile", InstanceProfileArgs.builder()
 *             .instanceProfileArn("my_instance_profile_arn")
 *             .build());
 * 
 *         var myGroup = new Group("myGroup", GroupArgs.builder()
 *             .displayName("my_group_name")
 *             .build());
 * 
 *         var myGroupInstanceProfile = new GroupRole("myGroupInstanceProfile", GroupRoleArgs.builder()
 *             .groupId(myGroup.id())
 *             .role(instanceProfile.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Attach account admin role to an account-level group
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Group;
 * import com.pulumi.databricks.GroupArgs;
 * import com.pulumi.databricks.GroupRole;
 * import com.pulumi.databricks.GroupRoleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var myGroup = new Group("myGroup", GroupArgs.builder()
 *             .displayName("my_group_name")
 *             .build());
 * 
 *         var myGroupAccountAdmin = new GroupRole("myGroupAccountAdmin", GroupRoleArgs.builder()
 *             .groupId(myGroup.id())
 *             .role("account_admin")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * End to end workspace management guide.
 * * databricks.getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
 * * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
 * * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * * databricks.GroupMember to attach users and groups as group members.
 * * databricks.InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 * * databricks.UserInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_user.
 * 
 * ## Import
 * 
 * -&gt; **Note** Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/groupRole:GroupRole")
public class GroupRole extends com.pulumi.resources.CustomResource {
    /**
     * This is the id of the group resource.
     * 
     */
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output<String> groupId;

    /**
     * @return This is the id of the group resource.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * Either a role name or the ARN/ID of the instance profile resource.
     * 
     */
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output<String> role;

    /**
     * @return Either a role name or the ARN/ID of the instance profile resource.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupRole(String name) {
        this(name, GroupRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupRole(String name, GroupRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupRole(String name, GroupRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/groupRole:GroupRole", name, args == null ? GroupRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GroupRole(String name, Output<String> id, @Nullable GroupRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/groupRole:GroupRole", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GroupRole get(String name, Output<String> id, @Nullable GroupRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GroupRole(name, id, state, options);
    }
}
