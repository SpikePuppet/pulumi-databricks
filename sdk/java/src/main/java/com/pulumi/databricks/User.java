// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.UserArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.UserState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to manage [users in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/users.html), [Databricks Account Console](https://accounts.cloud.databricks.com/) or [Azure Databricks Account Console](https://accounts.azuredatabricks.net). You can also associate Databricks users to databricks_group. Upon user creation the user will receive a password reset email. You can also get information about caller identity using databricks.getCurrentUser data source.
 * 
 * &gt; **Note** To assign account level users to workspace use databricks_mws_permission_assignment.
 * 
 * To create users in the Databricks account, the provider must be configured with `host = &#34;https://accounts.cloud.databricks.com&#34;` on AWS deployments or `host = &#34;https://accounts.azuredatabricks.net&#34;` and authenticate using AAD tokens on Azure deployments
 * 
 * ## Example Usage
 * 
 * Creating regular user:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
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
 *         var me = new User(&#34;me&#34;, UserArgs.builder()        
 *             .userName(&#34;me@example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Creating user with administrative permissions - referencing special `admins` databricks.Group in databricks.GroupMember resource:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetGroupArgs;
 * import com.pulumi.databricks.User;
 * import com.pulumi.databricks.UserArgs;
 * import com.pulumi.databricks.GroupMember;
 * import com.pulumi.databricks.GroupMemberArgs;
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
 *         final var admins = DatabricksFunctions.getGroup(GetGroupArgs.builder()
 *             .displayName(&#34;admins&#34;)
 *             .build());
 * 
 *         var me = new User(&#34;me&#34;, UserArgs.builder()        
 *             .userName(&#34;me@example.com&#34;)
 *             .build());
 * 
 *         var i_am_admin = new GroupMember(&#34;i-am-admin&#34;, GroupMemberArgs.builder()        
 *             .groupId(admins.applyValue(getGroupResult -&gt; getGroupResult.id()))
 *             .memberId(me.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Creating user with cluster create permissions:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
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
 *         var me = new User(&#34;me&#34;, UserArgs.builder()        
 *             .allowClusterCreate(true)
 *             .displayName(&#34;Example user&#34;)
 *             .userName(&#34;me@example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Creating user in AWS Databricks account:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Provider;
 * import com.pulumi.databricks.ProviderArgs;
 * import com.pulumi.databricks.User;
 * import com.pulumi.databricks.UserArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var mws = new Provider(&#34;mws&#34;, ProviderArgs.builder()        
 *             .host(&#34;https://accounts.cloud.databricks.com&#34;)
 *             .accountId(&#34;00000000-0000-0000-0000-000000000000&#34;)
 *             .username(var_.databricks_account_username())
 *             .password(var_.databricks_account_password())
 *             .build());
 * 
 *         var accountUser = new User(&#34;accountUser&#34;, UserArgs.builder()        
 *             .userName(&#34;me@example.com&#34;)
 *             .displayName(&#34;Example user&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.mws())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * Creating user in Azure Databricks account:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Provider;
 * import com.pulumi.databricks.ProviderArgs;
 * import com.pulumi.databricks.User;
 * import com.pulumi.databricks.UserArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var azureAccount = new Provider(&#34;azureAccount&#34;, ProviderArgs.builder()        
 *             .host(&#34;https://accounts.azuredatabricks.net&#34;)
 *             .accountId(&#34;00000000-0000-0000-0000-000000000000&#34;)
 *             .authType(&#34;azure-cli&#34;)
 *             .build());
 * 
 *         var accountUser = new User(&#34;accountUser&#34;, UserArgs.builder()        
 *             .userName(&#34;me@example.com&#34;)
 *             .displayName(&#34;Example user&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.azure_account())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * End to end workspace management guide.
 * * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
 * * databricks.GroupMember to attach users and groups as group members.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 * * databricks.User data to retrieve information about databricks_user.
 * 
 * ## Import
 * 
 * The resource scim user can be imported using idbash
 * 
 * ```sh
 *  $ pulumi import databricks:index/user:User me &lt;user-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/user:User")
public class User extends com.pulumi.resources.CustomResource {
    /**
     * Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
     * 
     */
    @Export(name="active", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> active;

    /**
     * @return Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
     * 
     */
    public Output<Optional<Boolean>> active() {
        return Codegen.optional(this.active);
    }
    /**
     * Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
     * 
     */
    @Export(name="allowClusterCreate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowClusterCreate;

    /**
     * @return Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
     * 
     */
    public Output<Optional<Boolean>> allowClusterCreate() {
        return Codegen.optional(this.allowClusterCreate);
    }
    /**
     * Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
     * 
     */
    @Export(name="allowInstancePoolCreate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowInstancePoolCreate;

    /**
     * @return Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
     * 
     */
    public Output<Optional<Boolean>> allowInstancePoolCreate() {
        return Codegen.optional(this.allowInstancePoolCreate);
    }
    /**
     * This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
     * 
     */
    @Export(name="databricksSqlAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> databricksSqlAccess;

    /**
     * @return This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
     * 
     */
    public Output<Optional<Boolean>> databricksSqlAccess() {
        return Codegen.optional(this.databricksSqlAccess);
    }
    /**
     * This is an alias for the username that can be the full name of the user.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return This is an alias for the username that can be the full name of the user.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * ID of the user in an external identity provider.
     * 
     */
    @Export(name="externalId", type=String.class, parameters={})
    private Output</* @Nullable */ String> externalId;

    /**
     * @return ID of the user in an external identity provider.
     * 
     */
    public Output<Optional<String>> externalId() {
        return Codegen.optional(this.externalId);
    }
    @Export(name="force", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> force;

    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
    /**
     * This flag determines whether the user&#39;s home directory is deleted when the user is deleted. It will have not impact when in the accounts SCIM API. False by default.
     * 
     */
    @Export(name="forceDeleteHomeDir", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDeleteHomeDir;

    /**
     * @return This flag determines whether the user&#39;s home directory is deleted when the user is deleted. It will have not impact when in the accounts SCIM API. False by default.
     * 
     */
    public Output<Optional<Boolean>> forceDeleteHomeDir() {
        return Codegen.optional(this.forceDeleteHomeDir);
    }
    /**
     * This flag determines whether the user&#39;s repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     * 
     */
    @Export(name="forceDeleteRepos", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDeleteRepos;

    /**
     * @return This flag determines whether the user&#39;s repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     * 
     */
    public Output<Optional<Boolean>> forceDeleteRepos() {
        return Codegen.optional(this.forceDeleteRepos);
    }
    /**
     * Home folder of the user, e.g. `/Users/mr.foo@example.com`.
     * 
     */
    @Export(name="home", type=String.class, parameters={})
    private Output<String> home;

    /**
     * @return Home folder of the user, e.g. `/Users/mr.foo@example.com`.
     * 
     */
    public Output<String> home() {
        return this.home;
    }
    /**
     * Personal Repos location of the user, e.g. `/Repos/mr.foo@example.com`.
     * 
     */
    @Export(name="repos", type=String.class, parameters={})
    private Output<String> repos;

    /**
     * @return Personal Repos location of the user, e.g. `/Repos/mr.foo@example.com`.
     * 
     */
    public Output<String> repos() {
        return this.repos;
    }
    /**
     * This is the username of the given user and will be their form of access and identity.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return This is the username of the given user and will be their form of access and identity.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }
    @Export(name="workspaceAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> workspaceAccess;

    public Output<Optional<Boolean>> workspaceAccess() {
        return Codegen.optional(this.workspaceAccess);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(String name, UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private User(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/user:User", name, state, makeResourceOptions(options, id));
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
    public static User get(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
