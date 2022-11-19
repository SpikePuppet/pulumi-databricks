// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.SqlDashboardArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.SqlDashboardState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource is used to manage [Databricks SQL Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html). To manage [SQLA resources](https://docs.databricks.com/sql/get-started/concepts.html) you must have `databricks_sql_access` on your databricks.Group or databricks_user.
 * 
 * **Note:** documentation for this resource is a work in progress.
 * 
 * A dashboard may have one or more widgets.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.SqlDashboard;
 * import com.pulumi.databricks.SqlDashboardArgs;
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
 *         var d1 = new SqlDashboard(&#34;d1&#34;, SqlDashboardArgs.builder()        
 *             .tags(            
 *                 &#34;some-tag&#34;,
 *                 &#34;another-tag&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Example permission to share dashboard with all users:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Permissions;
 * import com.pulumi.databricks.PermissionsArgs;
 * import com.pulumi.databricks.inputs.PermissionsAccessControlArgs;
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
 *         var d1 = new Permissions(&#34;d1&#34;, PermissionsArgs.builder()        
 *             .sqlDashboardId(databricks_sql_dashboard.d1().id())
 *             .accessControls(PermissionsAccessControlArgs.builder()
 *                 .groupName(data.databricks_group().users().display_name())
 *                 .permissionLevel(&#34;CAN_RUN&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * End to end workspace management guide.
 * * databricks.SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
 * * databricks.SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all databricks.SqlEndpoint of workspace.
 * * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
 * 
 * ## Import
 * 
 * You can import a `databricks_sql_dashboard` resource with ID like the followingbash
 * 
 * ```sh
 *  $ pulumi import databricks:index/sqlDashboard:SqlDashboard this &lt;dashboard-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/sqlDashboard:SqlDashboard")
public class SqlDashboard extends com.pulumi.resources.CustomResource {
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlDashboard(String name) {
        this(name, SqlDashboardArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlDashboard(String name, @Nullable SqlDashboardArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlDashboard(String name, @Nullable SqlDashboardArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/sqlDashboard:SqlDashboard", name, args == null ? SqlDashboardArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SqlDashboard(String name, Output<String> id, @Nullable SqlDashboardState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/sqlDashboard:SqlDashboard", name, state, makeResourceOptions(options, id));
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
    public static SqlDashboard get(String name, Output<String> id, @Nullable SqlDashboardState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlDashboard(name, id, state, options);
    }
}