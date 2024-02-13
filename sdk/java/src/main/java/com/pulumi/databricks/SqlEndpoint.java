// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.SqlEndpointArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.SqlEndpointState;
import com.pulumi.databricks.outputs.SqlEndpointChannel;
import com.pulumi.databricks.outputs.SqlEndpointHealth;
import com.pulumi.databricks.outputs.SqlEndpointOdbcParams;
import com.pulumi.databricks.outputs.SqlEndpointTags;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource is used to manage [Databricks SQL warehouses](https://docs.databricks.com/sql/admin/sql-endpoints.html). To create [SQL warehouses](https://docs.databricks.com/sql/get-started/concepts.html) you must have `databricks_sql_access` on your databricks.Group or databricks_user.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.SqlEndpoint;
 * import com.pulumi.databricks.SqlEndpointArgs;
 * import com.pulumi.databricks.inputs.SqlEndpointTagsArgs;
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
 *         final var me = DatabricksFunctions.getCurrentUser();
 * 
 *         var this_ = new SqlEndpoint(&#34;this&#34;, SqlEndpointArgs.builder()        
 *             .clusterSize(&#34;Small&#34;)
 *             .maxNumClusters(1)
 *             .tags(SqlEndpointTagsArgs.builder()
 *                 .customTags(SqlEndpointTagsCustomTagArgs.builder()
 *                     .key(&#34;City&#34;)
 *                     .value(&#34;Amsterdam&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Access control
 * 
 * * databricks.Permissions can control which groups or individual users can *Can Use* or *Can Manage* SQL warehouses.
 * * `databricks_sql_access` on databricks.Group or databricks_user.
 * 
 * ## Related resources
 * 
 * The following resources are often used in the same context:
 * 
 * * End to end workspace management guide.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 * * databricks.SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
 * * databricks.SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all databricks.SqlEndpoint of workspace.
 * * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
 * 
 * ## Import
 * 
 * You can import a `databricks_sql_endpoint` resource with ID like the following:
 * 
 *  bash
 * 
 * ```sh
 * $ pulumi import databricks:index/sqlEndpoint:SqlEndpoint this &lt;endpoint-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/sqlEndpoint:SqlEndpoint")
public class SqlEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * Time in minutes until an idle SQL warehouse terminates all clusters and stops. This field is optional. The default is 120, set to 0 to disable the auto stop.
     * 
     */
    @Export(name="autoStopMins", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> autoStopMins;

    /**
     * @return Time in minutes until an idle SQL warehouse terminates all clusters and stops. This field is optional. The default is 120, set to 0 to disable the auto stop.
     * 
     */
    public Output<Optional<Integer>> autoStopMins() {
        return Codegen.optional(this.autoStopMins);
    }
    /**
     * block, consisting of following fields:
     * 
     */
    @Export(name="channel", refs={SqlEndpointChannel.class}, tree="[0]")
    private Output</* @Nullable */ SqlEndpointChannel> channel;

    /**
     * @return block, consisting of following fields:
     * 
     */
    public Output<Optional<SqlEndpointChannel>> channel() {
        return Codegen.optional(this.channel);
    }
    /**
     * The size of the clusters allocated to the endpoint: &#34;2X-Small&#34;, &#34;X-Small&#34;, &#34;Small&#34;, &#34;Medium&#34;, &#34;Large&#34;, &#34;X-Large&#34;, &#34;2X-Large&#34;, &#34;3X-Large&#34;, &#34;4X-Large&#34;.
     * 
     */
    @Export(name="clusterSize", refs={String.class}, tree="[0]")
    private Output<String> clusterSize;

    /**
     * @return The size of the clusters allocated to the endpoint: &#34;2X-Small&#34;, &#34;X-Small&#34;, &#34;Small&#34;, &#34;Medium&#34;, &#34;Large&#34;, &#34;X-Large&#34;, &#34;2X-Large&#34;, &#34;3X-Large&#34;, &#34;4X-Large&#34;.
     * 
     */
    public Output<String> clusterSize() {
        return this.clusterSize;
    }
    /**
     * The username of the user who created the endpoint.
     * 
     */
    @Export(name="creatorName", refs={String.class}, tree="[0]")
    private Output<String> creatorName;

    /**
     * @return The username of the user who created the endpoint.
     * 
     */
    public Output<String> creatorName() {
        return this.creatorName;
    }
    /**
     * ID of the data source for this endpoint. This is used to bind an Databricks SQL query to an endpoint.
     * 
     */
    @Export(name="dataSourceId", refs={String.class}, tree="[0]")
    private Output<String> dataSourceId;

    /**
     * @return ID of the data source for this endpoint. This is used to bind an Databricks SQL query to an endpoint.
     * 
     */
    public Output<String> dataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Whether to enable [Photon](https://databricks.com/product/delta-engine). This field is optional and is enabled by default.
     * 
     */
    @Export(name="enablePhoton", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enablePhoton;

    /**
     * @return Whether to enable [Photon](https://databricks.com/product/delta-engine). This field is optional and is enabled by default.
     * 
     */
    public Output<Optional<Boolean>> enablePhoton() {
        return Codegen.optional(this.enablePhoton);
    }
    /**
     * Whether this SQL warehouse is a serverless endpoint. See below for details about the default values. To avoid ambiguity, especially for organizations with many workspaces, Databricks recommends that you always set this field explicitly.
     * 
     * - **For AWS**, If omitted, the default is `false` for most workspaces. However, if this workspace used the SQL Warehouses API to create a warehouse between September 1, 2022 and April 30, 2023, the default remains the previous behavior which is default to `true` if the workspace is enabled for serverless and fits the requirements for serverless SQL warehouses. If your account needs updated [terms of use](https://docs.databricks.com/sql/admin/serverless.html#accept-terms), workspace admins are prompted in the Databricks SQL UI. A workspace must meet the [requirements](https://docs.databricks.com/sql/admin/serverless.html#requirements) and might require an update to its instance profile role to [add a trust relationship](https://docs.databricks.com/sql/admin/serverless.html#aws-instance-profile-setup).
     * 
     * - **For Azure**, If omitted, the default is `false` for most workspaces. However, if this workspace used the SQL Warehouses API to create a warehouse between November 1, 2022 and May 19, 2023, the default remains the previous behavior which is default to `true` if the workspace is enabled for serverless and fits the requirements for serverless SQL warehouses. A workspace must meet the [requirements](https://learn.microsoft.com/azure/databricks/sql/admin/serverless) and might require an update to its [Azure storage firewall](https://learn.microsoft.com/azure/databricks/sql/admin/serverless-firewall).
     * 
     */
    @Export(name="enableServerlessCompute", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableServerlessCompute;

    /**
     * @return Whether this SQL warehouse is a serverless endpoint. See below for details about the default values. To avoid ambiguity, especially for organizations with many workspaces, Databricks recommends that you always set this field explicitly.
     * 
     * - **For AWS**, If omitted, the default is `false` for most workspaces. However, if this workspace used the SQL Warehouses API to create a warehouse between September 1, 2022 and April 30, 2023, the default remains the previous behavior which is default to `true` if the workspace is enabled for serverless and fits the requirements for serverless SQL warehouses. If your account needs updated [terms of use](https://docs.databricks.com/sql/admin/serverless.html#accept-terms), workspace admins are prompted in the Databricks SQL UI. A workspace must meet the [requirements](https://docs.databricks.com/sql/admin/serverless.html#requirements) and might require an update to its instance profile role to [add a trust relationship](https://docs.databricks.com/sql/admin/serverless.html#aws-instance-profile-setup).
     * 
     * - **For Azure**, If omitted, the default is `false` for most workspaces. However, if this workspace used the SQL Warehouses API to create a warehouse between November 1, 2022 and May 19, 2023, the default remains the previous behavior which is default to `true` if the workspace is enabled for serverless and fits the requirements for serverless SQL warehouses. A workspace must meet the [requirements](https://learn.microsoft.com/azure/databricks/sql/admin/serverless) and might require an update to its [Azure storage firewall](https://learn.microsoft.com/azure/databricks/sql/admin/serverless-firewall).
     * 
     */
    public Output<Boolean> enableServerlessCompute() {
        return this.enableServerlessCompute;
    }
    /**
     * Health status of the endpoint.
     * 
     */
    @Export(name="healths", refs={List.class,SqlEndpointHealth.class}, tree="[0,1]")
    private Output<List<SqlEndpointHealth>> healths;

    /**
     * @return Health status of the endpoint.
     * 
     */
    public Output<List<SqlEndpointHealth>> healths() {
        return this.healths;
    }
    @Export(name="instanceProfileArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceProfileArn;

    public Output<Optional<String>> instanceProfileArn() {
        return Codegen.optional(this.instanceProfileArn);
    }
    /**
     * JDBC connection string.
     * 
     */
    @Export(name="jdbcUrl", refs={String.class}, tree="[0]")
    private Output<String> jdbcUrl;

    /**
     * @return JDBC connection string.
     * 
     */
    public Output<String> jdbcUrl() {
        return this.jdbcUrl;
    }
    /**
     * Maximum number of clusters available when a SQL warehouse is running. This field is required. If multi-cluster load balancing is not enabled, this is default to `1`.
     * 
     */
    @Export(name="maxNumClusters", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxNumClusters;

    /**
     * @return Maximum number of clusters available when a SQL warehouse is running. This field is required. If multi-cluster load balancing is not enabled, this is default to `1`.
     * 
     */
    public Output<Optional<Integer>> maxNumClusters() {
        return Codegen.optional(this.maxNumClusters);
    }
    /**
     * Minimum number of clusters available when a SQL warehouse is running. The default is `1`.
     * 
     */
    @Export(name="minNumClusters", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minNumClusters;

    /**
     * @return Minimum number of clusters available when a SQL warehouse is running. The default is `1`.
     * 
     */
    public Output<Optional<Integer>> minNumClusters() {
        return Codegen.optional(this.minNumClusters);
    }
    /**
     * Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The current number of clusters used by the endpoint.
     * 
     */
    @Export(name="numActiveSessions", refs={Integer.class}, tree="[0]")
    private Output<Integer> numActiveSessions;

    /**
     * @return The current number of clusters used by the endpoint.
     * 
     */
    public Output<Integer> numActiveSessions() {
        return this.numActiveSessions;
    }
    /**
     * The current number of clusters used by the endpoint.
     * 
     */
    @Export(name="numClusters", refs={Integer.class}, tree="[0]")
    private Output<Integer> numClusters;

    /**
     * @return The current number of clusters used by the endpoint.
     * 
     */
    public Output<Integer> numClusters() {
        return this.numClusters;
    }
    /**
     * ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
     * 
     */
    @Export(name="odbcParams", refs={SqlEndpointOdbcParams.class}, tree="[0]")
    private Output<SqlEndpointOdbcParams> odbcParams;

    /**
     * @return ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
     * 
     */
    public Output<SqlEndpointOdbcParams> odbcParams() {
        return this.odbcParams;
    }
    /**
     * The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`. This field is optional. Default is `COST_OPTIMIZED`.
     * 
     */
    @Export(name="spotInstancePolicy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> spotInstancePolicy;

    /**
     * @return The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`. This field is optional. Default is `COST_OPTIMIZED`.
     * 
     */
    public Output<Optional<String>> spotInstancePolicy() {
        return Codegen.optional(this.spotInstancePolicy);
    }
    /**
     * The current state of the endpoint.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The current state of the endpoint.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Databricks tags all endpoint resources with these tags.
     * 
     */
    @Export(name="tags", refs={SqlEndpointTags.class}, tree="[0]")
    private Output</* @Nullable */ SqlEndpointTags> tags;

    /**
     * @return Databricks tags all endpoint resources with these tags.
     * 
     */
    public Output<Optional<SqlEndpointTags>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/admin/sql-endpoints.html#switch-the-sql-warehouse-type-pro-classic-or-serverless) or [Azure](https://learn.microsoft.com/en-us/azure/databricks/sql/admin/create-sql-warehouse#--upgrade-a-pro-or-classic-sql-warehouse-to-a-serverless-sql-warehouse). Set to `PRO` or `CLASSIC`. If the field `enable_serverless_compute` has the value `true` either explicitly or through the default logic (see that field above for details), the default is `PRO`, which is required for serverless SQL warehouses. Otherwise, the default is `CLASSIC`.
     * 
     */
    @Export(name="warehouseType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> warehouseType;

    /**
     * @return SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/admin/sql-endpoints.html#switch-the-sql-warehouse-type-pro-classic-or-serverless) or [Azure](https://learn.microsoft.com/en-us/azure/databricks/sql/admin/create-sql-warehouse#--upgrade-a-pro-or-classic-sql-warehouse-to-a-serverless-sql-warehouse). Set to `PRO` or `CLASSIC`. If the field `enable_serverless_compute` has the value `true` either explicitly or through the default logic (see that field above for details), the default is `PRO`, which is required for serverless SQL warehouses. Otherwise, the default is `CLASSIC`.
     * 
     */
    public Output<Optional<String>> warehouseType() {
        return Codegen.optional(this.warehouseType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlEndpoint(String name) {
        this(name, SqlEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlEndpoint(String name, SqlEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlEndpoint(String name, SqlEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/sqlEndpoint:SqlEndpoint", name, args == null ? SqlEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SqlEndpoint(String name, Output<String> id, @Nullable SqlEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/sqlEndpoint:SqlEndpoint", name, state, makeResourceOptions(options, id));
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
    public static SqlEndpoint get(String name, Output<String> id, @Nullable SqlEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlEndpoint(name, id, state, options);
    }
}
