// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MwsPermissionAssignmentArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MwsPermissionAssignmentState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * These resources are invoked in the account context. Permission Assignment Account API endpoints are restricted to account admins. Provider must have `account_id` attribute configured. Account Id that could be found in the top right corner of Accounts Console
 * 
 * ## Example Usage
 * 
 * In account context, adding account-level group to a workspace:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Group;
 * import com.pulumi.databricks.MwsPermissionAssignment;
 * import com.pulumi.databricks.MwsPermissionAssignmentArgs;
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
 *         var dataEng = new Group(&#34;dataEng&#34;);
 * 
 *         var addAdminGroup = new MwsPermissionAssignment(&#34;addAdminGroup&#34;, MwsPermissionAssignmentArgs.builder()        
 *             .workspaceId(databricks_mws_workspaces.this().workspace_id())
 *             .principalId(dataEng.id())
 *             .permissions(&#34;ADMIN&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * In account context, adding account-level user to a workspace:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.User;
 * import com.pulumi.databricks.UserArgs;
 * import com.pulumi.databricks.MwsPermissionAssignment;
 * import com.pulumi.databricks.MwsPermissionAssignmentArgs;
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
 *         var addUser = new MwsPermissionAssignment(&#34;addUser&#34;, MwsPermissionAssignmentArgs.builder()        
 *             .workspaceId(databricks_mws_workspaces.this().workspace_id())
 *             .principalId(me.id())
 *             .permissions(&#34;USER&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * In account context, adding account-level service principal to a workspace:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
 * import com.pulumi.databricks.MwsPermissionAssignment;
 * import com.pulumi.databricks.MwsPermissionAssignmentArgs;
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
 *         var sp = new ServicePrincipal(&#34;sp&#34;, ServicePrincipalArgs.builder()        
 *             .displayName(&#34;Automation-only SP&#34;)
 *             .build());
 * 
 *         var addAdminSpn = new MwsPermissionAssignment(&#34;addAdminSpn&#34;, MwsPermissionAssignmentArgs.builder()        
 *             .workspaceId(databricks_mws_workspaces.this().workspace_id())
 *             .principalId(sp.id())
 *             .permissions(&#34;ADMIN&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Related Resources
 * 
 * The following resources are used in the same context:
 * 
 * * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * * databricks.GroupMember to attach users and groups as group members.
 * * databricks.PermissionAssignment to manage permission assignment from a workspace context
 * 
 * ## Import
 * 
 * The resource `databricks_mws_permission_assignment` can be imported using the workspace id and principal id bash
 * 
 * ```sh
 *  $ pulumi import databricks:index/mwsPermissionAssignment:MwsPermissionAssignment this &#34;workspace_id|principal_id&#34;
 * ```
 * 
 */
@ResourceType(type="databricks:index/mwsPermissionAssignment:MwsPermissionAssignment")
public class MwsPermissionAssignment extends com.pulumi.resources.CustomResource {
    /**
     * The list of workspace permissions to assign to the principal:
     * * `&#34;USER&#34;` - Can access the workspace with basic privileges.
     * * `&#34;ADMIN&#34;` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
     * 
     */
    @Export(name="permissions", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> permissions;

    /**
     * @return The list of workspace permissions to assign to the principal:
     * * `&#34;USER&#34;` - Can access the workspace with basic privileges.
     * * `&#34;ADMIN&#34;` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
     * 
     */
    public Output<List<String>> permissions() {
        return this.permissions;
    }
    /**
     * Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, databricks.ServicePrincipal or databricks.Group data sources.
     * 
     */
    @Export(name="principalId", refs={Integer.class}, tree="[0]")
    private Output<Integer> principalId;

    /**
     * @return Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, databricks.ServicePrincipal or databricks.Group data sources.
     * 
     */
    public Output<Integer> principalId() {
        return this.principalId;
    }
    /**
     * Databricks workspace ID.
     * 
     */
    @Export(name="workspaceId", refs={Integer.class}, tree="[0]")
    private Output<Integer> workspaceId;

    /**
     * @return Databricks workspace ID.
     * 
     */
    public Output<Integer> workspaceId() {
        return this.workspaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MwsPermissionAssignment(String name) {
        this(name, MwsPermissionAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MwsPermissionAssignment(String name, MwsPermissionAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MwsPermissionAssignment(String name, MwsPermissionAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsPermissionAssignment:MwsPermissionAssignment", name, args == null ? MwsPermissionAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MwsPermissionAssignment(String name, Output<String> id, @Nullable MwsPermissionAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsPermissionAssignment:MwsPermissionAssignment", name, state, makeResourceOptions(options, id));
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
    public static MwsPermissionAssignment get(String name, Output<String> id, @Nullable MwsPermissionAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MwsPermissionAssignment(name, id, state, options);
    }
}
