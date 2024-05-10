// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.GroupMemberArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.GroupMemberState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource allows you to attach users, service_principal, and groups as group members.
 * 
 * To attach members to groups in the Databricks account, the provider must be configured with `host = &#34;https://accounts.cloud.databricks.com&#34;` on AWS deployments or `host = &#34;https://accounts.azuredatabricks.net&#34;` and authenticate using AAD tokens on Azure deployments
 * 
 * ## Example Usage
 * 
 * After the following example, Bradley would have direct membership in group B and transitive membership in group A.
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
 * import com.pulumi.databricks.GroupMember;
 * import com.pulumi.databricks.GroupMemberArgs;
 * import com.pulumi.databricks.User;
 * import com.pulumi.databricks.UserArgs;
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
 *         var a = new Group("a", GroupArgs.builder()        
 *             .displayName("A")
 *             .build());
 * 
 *         var b = new Group("b", GroupArgs.builder()        
 *             .displayName("B")
 *             .build());
 * 
 *         var ab = new GroupMember("ab", GroupMemberArgs.builder()        
 *             .groupId(a.id())
 *             .memberId(b.id())
 *             .build());
 * 
 *         var bradley = new User("bradley", UserArgs.builder()        
 *             .userName("bradley{@literal @}example.com")
 *             .build());
 * 
 *         var bb = new GroupMember("bb", GroupMemberArgs.builder()        
 *             .groupId(b.id())
 *             .memberId(bradley.id())
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
 * * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
 * * databricks.IpAccessList to allow access from [predefined IP ranges](https://docs.databricks.com/security/network/ip-access-list.html).
 * * databricks.ServicePrincipal to grant access to a workspace to an automation tool or application.
 * * databricks.User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to databricks.Group within the workspace.
 * * databricks.User data to retrieve information about databricks_user.
 * * databricks.UserInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_user.
 * 
 * ## Import
 * 
 * You can import a `databricks_group_member` resource with name `my_group_member` like the following:
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/groupMember:GroupMember my_group_member &#34;&lt;group_id&gt;|&lt;member_id&gt;&#34;
 * ```
 * 
 */
@ResourceType(type="databricks:index/groupMember:GroupMember")
public class GroupMember extends com.pulumi.resources.CustomResource {
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
     * This is the id of the group, service principal, or user.
     * 
     */
    @Export(name="memberId", refs={String.class}, tree="[0]")
    private Output<String> memberId;

    /**
     * @return This is the id of the group, service principal, or user.
     * 
     */
    public Output<String> memberId() {
        return this.memberId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupMember(String name) {
        this(name, GroupMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupMember(String name, GroupMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupMember(String name, GroupMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/groupMember:GroupMember", name, args == null ? GroupMemberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GroupMember(String name, Output<String> id, @Nullable GroupMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/groupMember:GroupMember", name, state, makeResourceOptions(options, id));
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
    public static GroupMember get(String name, Output<String> id, @Nullable GroupMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GroupMember(name, id, state, options);
    }
}
