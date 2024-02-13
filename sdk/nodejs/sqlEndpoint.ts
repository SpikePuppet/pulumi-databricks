// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource is used to manage [Databricks SQL warehouses](https://docs.databricks.com/sql/admin/sql-endpoints.html). To create [SQL warehouses](https://docs.databricks.com/sql/get-started/concepts.html) you must have `databricksSqlAccess` on your databricks.Group or databricks_user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const me = databricks.getCurrentUser({});
 * const _this = new databricks.SqlEndpoint("this", {
 *     clusterSize: "Small",
 *     maxNumClusters: 1,
 *     tags: {
 *         customTags: [{
 *             key: "City",
 *             value: "Amsterdam",
 *         }],
 *     },
 * });
 * ```
 * ## Access control
 *
 * * databricks.Permissions can control which groups or individual users can *Can Use* or *Can Manage* SQL warehouses.
 * * `databricksSqlAccess` on databricks.Group or databricks_user.
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
 * $ pulumi import databricks:index/sqlEndpoint:SqlEndpoint this <endpoint-id>
 * ```
 */
export class SqlEndpoint extends pulumi.CustomResource {
    /**
     * Get an existing SqlEndpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SqlEndpointState, opts?: pulumi.CustomResourceOptions): SqlEndpoint {
        return new SqlEndpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/sqlEndpoint:SqlEndpoint';

    /**
     * Returns true if the given object is an instance of SqlEndpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SqlEndpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SqlEndpoint.__pulumiType;
    }

    /**
     * Time in minutes until an idle SQL warehouse terminates all clusters and stops. This field is optional. The default is 120, set to 0 to disable the auto stop.
     */
    public readonly autoStopMins!: pulumi.Output<number | undefined>;
    /**
     * block, consisting of following fields:
     */
    public readonly channel!: pulumi.Output<outputs.SqlEndpointChannel | undefined>;
    /**
     * The size of the clusters allocated to the endpoint: "2X-Small", "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large".
     */
    public readonly clusterSize!: pulumi.Output<string>;
    /**
     * The username of the user who created the endpoint.
     */
    public /*out*/ readonly creatorName!: pulumi.Output<string>;
    /**
     * ID of the data source for this endpoint. This is used to bind an Databricks SQL query to an endpoint.
     */
    public readonly dataSourceId!: pulumi.Output<string>;
    /**
     * Whether to enable [Photon](https://databricks.com/product/delta-engine). This field is optional and is enabled by default.
     */
    public readonly enablePhoton!: pulumi.Output<boolean | undefined>;
    /**
     * Whether this SQL warehouse is a serverless endpoint. See below for details about the default values. To avoid ambiguity, especially for organizations with many workspaces, Databricks recommends that you always set this field explicitly.
     *
     * - **For AWS**, If omitted, the default is `false` for most workspaces. However, if this workspace used the SQL Warehouses API to create a warehouse between September 1, 2022 and April 30, 2023, the default remains the previous behavior which is default to `true` if the workspace is enabled for serverless and fits the requirements for serverless SQL warehouses. If your account needs updated [terms of use](https://docs.databricks.com/sql/admin/serverless.html#accept-terms), workspace admins are prompted in the Databricks SQL UI. A workspace must meet the [requirements](https://docs.databricks.com/sql/admin/serverless.html#requirements) and might require an update to its instance profile role to [add a trust relationship](https://docs.databricks.com/sql/admin/serverless.html#aws-instance-profile-setup).
     *
     * - **For Azure**, If omitted, the default is `false` for most workspaces. However, if this workspace used the SQL Warehouses API to create a warehouse between November 1, 2022 and May 19, 2023, the default remains the previous behavior which is default to `true` if the workspace is enabled for serverless and fits the requirements for serverless SQL warehouses. A workspace must meet the [requirements](https://learn.microsoft.com/azure/databricks/sql/admin/serverless) and might require an update to its [Azure storage firewall](https://learn.microsoft.com/azure/databricks/sql/admin/serverless-firewall).
     */
    public readonly enableServerlessCompute!: pulumi.Output<boolean>;
    /**
     * Health status of the endpoint.
     */
    public /*out*/ readonly healths!: pulumi.Output<outputs.SqlEndpointHealth[]>;
    public readonly instanceProfileArn!: pulumi.Output<string | undefined>;
    /**
     * JDBC connection string.
     */
    public /*out*/ readonly jdbcUrl!: pulumi.Output<string>;
    /**
     * Maximum number of clusters available when a SQL warehouse is running. This field is required. If multi-cluster load balancing is not enabled, this is default to `1`.
     */
    public readonly maxNumClusters!: pulumi.Output<number | undefined>;
    /**
     * Minimum number of clusters available when a SQL warehouse is running. The default is `1`.
     */
    public readonly minNumClusters!: pulumi.Output<number | undefined>;
    /**
     * Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The current number of clusters used by the endpoint.
     */
    public /*out*/ readonly numActiveSessions!: pulumi.Output<number>;
    /**
     * The current number of clusters used by the endpoint.
     */
    public /*out*/ readonly numClusters!: pulumi.Output<number>;
    /**
     * ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
     */
    public /*out*/ readonly odbcParams!: pulumi.Output<outputs.SqlEndpointOdbcParams>;
    /**
     * The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`. This field is optional. Default is `COST_OPTIMIZED`.
     */
    public readonly spotInstancePolicy!: pulumi.Output<string | undefined>;
    /**
     * The current state of the endpoint.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Databricks tags all endpoint resources with these tags.
     */
    public readonly tags!: pulumi.Output<outputs.SqlEndpointTags | undefined>;
    /**
     * SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/admin/sql-endpoints.html#switch-the-sql-warehouse-type-pro-classic-or-serverless) or [Azure](https://learn.microsoft.com/en-us/azure/databricks/sql/admin/create-sql-warehouse#--upgrade-a-pro-or-classic-sql-warehouse-to-a-serverless-sql-warehouse). Set to `PRO` or `CLASSIC`. If the field `enableServerlessCompute` has the value `true` either explicitly or through the default logic (see that field above for details), the default is `PRO`, which is required for serverless SQL warehouses. Otherwise, the default is `CLASSIC`.
     */
    public readonly warehouseType!: pulumi.Output<string | undefined>;

    /**
     * Create a SqlEndpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SqlEndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SqlEndpointArgs | SqlEndpointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SqlEndpointState | undefined;
            resourceInputs["autoStopMins"] = state ? state.autoStopMins : undefined;
            resourceInputs["channel"] = state ? state.channel : undefined;
            resourceInputs["clusterSize"] = state ? state.clusterSize : undefined;
            resourceInputs["creatorName"] = state ? state.creatorName : undefined;
            resourceInputs["dataSourceId"] = state ? state.dataSourceId : undefined;
            resourceInputs["enablePhoton"] = state ? state.enablePhoton : undefined;
            resourceInputs["enableServerlessCompute"] = state ? state.enableServerlessCompute : undefined;
            resourceInputs["healths"] = state ? state.healths : undefined;
            resourceInputs["instanceProfileArn"] = state ? state.instanceProfileArn : undefined;
            resourceInputs["jdbcUrl"] = state ? state.jdbcUrl : undefined;
            resourceInputs["maxNumClusters"] = state ? state.maxNumClusters : undefined;
            resourceInputs["minNumClusters"] = state ? state.minNumClusters : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["numActiveSessions"] = state ? state.numActiveSessions : undefined;
            resourceInputs["numClusters"] = state ? state.numClusters : undefined;
            resourceInputs["odbcParams"] = state ? state.odbcParams : undefined;
            resourceInputs["spotInstancePolicy"] = state ? state.spotInstancePolicy : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["warehouseType"] = state ? state.warehouseType : undefined;
        } else {
            const args = argsOrState as SqlEndpointArgs | undefined;
            if ((!args || args.clusterSize === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterSize'");
            }
            resourceInputs["autoStopMins"] = args ? args.autoStopMins : undefined;
            resourceInputs["channel"] = args ? args.channel : undefined;
            resourceInputs["clusterSize"] = args ? args.clusterSize : undefined;
            resourceInputs["dataSourceId"] = args ? args.dataSourceId : undefined;
            resourceInputs["enablePhoton"] = args ? args.enablePhoton : undefined;
            resourceInputs["enableServerlessCompute"] = args ? args.enableServerlessCompute : undefined;
            resourceInputs["instanceProfileArn"] = args ? args.instanceProfileArn : undefined;
            resourceInputs["maxNumClusters"] = args ? args.maxNumClusters : undefined;
            resourceInputs["minNumClusters"] = args ? args.minNumClusters : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["spotInstancePolicy"] = args ? args.spotInstancePolicy : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["warehouseType"] = args ? args.warehouseType : undefined;
            resourceInputs["creatorName"] = undefined /*out*/;
            resourceInputs["healths"] = undefined /*out*/;
            resourceInputs["jdbcUrl"] = undefined /*out*/;
            resourceInputs["numActiveSessions"] = undefined /*out*/;
            resourceInputs["numClusters"] = undefined /*out*/;
            resourceInputs["odbcParams"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SqlEndpoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SqlEndpoint resources.
 */
export interface SqlEndpointState {
    /**
     * Time in minutes until an idle SQL warehouse terminates all clusters and stops. This field is optional. The default is 120, set to 0 to disable the auto stop.
     */
    autoStopMins?: pulumi.Input<number>;
    /**
     * block, consisting of following fields:
     */
    channel?: pulumi.Input<inputs.SqlEndpointChannel>;
    /**
     * The size of the clusters allocated to the endpoint: "2X-Small", "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large".
     */
    clusterSize?: pulumi.Input<string>;
    /**
     * The username of the user who created the endpoint.
     */
    creatorName?: pulumi.Input<string>;
    /**
     * ID of the data source for this endpoint. This is used to bind an Databricks SQL query to an endpoint.
     */
    dataSourceId?: pulumi.Input<string>;
    /**
     * Whether to enable [Photon](https://databricks.com/product/delta-engine). This field is optional and is enabled by default.
     */
    enablePhoton?: pulumi.Input<boolean>;
    /**
     * Whether this SQL warehouse is a serverless endpoint. See below for details about the default values. To avoid ambiguity, especially for organizations with many workspaces, Databricks recommends that you always set this field explicitly.
     *
     * - **For AWS**, If omitted, the default is `false` for most workspaces. However, if this workspace used the SQL Warehouses API to create a warehouse between September 1, 2022 and April 30, 2023, the default remains the previous behavior which is default to `true` if the workspace is enabled for serverless and fits the requirements for serverless SQL warehouses. If your account needs updated [terms of use](https://docs.databricks.com/sql/admin/serverless.html#accept-terms), workspace admins are prompted in the Databricks SQL UI. A workspace must meet the [requirements](https://docs.databricks.com/sql/admin/serverless.html#requirements) and might require an update to its instance profile role to [add a trust relationship](https://docs.databricks.com/sql/admin/serverless.html#aws-instance-profile-setup).
     *
     * - **For Azure**, If omitted, the default is `false` for most workspaces. However, if this workspace used the SQL Warehouses API to create a warehouse between November 1, 2022 and May 19, 2023, the default remains the previous behavior which is default to `true` if the workspace is enabled for serverless and fits the requirements for serverless SQL warehouses. A workspace must meet the [requirements](https://learn.microsoft.com/azure/databricks/sql/admin/serverless) and might require an update to its [Azure storage firewall](https://learn.microsoft.com/azure/databricks/sql/admin/serverless-firewall).
     */
    enableServerlessCompute?: pulumi.Input<boolean>;
    /**
     * Health status of the endpoint.
     */
    healths?: pulumi.Input<pulumi.Input<inputs.SqlEndpointHealth>[]>;
    instanceProfileArn?: pulumi.Input<string>;
    /**
     * JDBC connection string.
     */
    jdbcUrl?: pulumi.Input<string>;
    /**
     * Maximum number of clusters available when a SQL warehouse is running. This field is required. If multi-cluster load balancing is not enabled, this is default to `1`.
     */
    maxNumClusters?: pulumi.Input<number>;
    /**
     * Minimum number of clusters available when a SQL warehouse is running. The default is `1`.
     */
    minNumClusters?: pulumi.Input<number>;
    /**
     * Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
     */
    name?: pulumi.Input<string>;
    /**
     * The current number of clusters used by the endpoint.
     */
    numActiveSessions?: pulumi.Input<number>;
    /**
     * The current number of clusters used by the endpoint.
     */
    numClusters?: pulumi.Input<number>;
    /**
     * ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
     */
    odbcParams?: pulumi.Input<inputs.SqlEndpointOdbcParams>;
    /**
     * The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`. This field is optional. Default is `COST_OPTIMIZED`.
     */
    spotInstancePolicy?: pulumi.Input<string>;
    /**
     * The current state of the endpoint.
     */
    state?: pulumi.Input<string>;
    /**
     * Databricks tags all endpoint resources with these tags.
     */
    tags?: pulumi.Input<inputs.SqlEndpointTags>;
    /**
     * SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/admin/sql-endpoints.html#switch-the-sql-warehouse-type-pro-classic-or-serverless) or [Azure](https://learn.microsoft.com/en-us/azure/databricks/sql/admin/create-sql-warehouse#--upgrade-a-pro-or-classic-sql-warehouse-to-a-serverless-sql-warehouse). Set to `PRO` or `CLASSIC`. If the field `enableServerlessCompute` has the value `true` either explicitly or through the default logic (see that field above for details), the default is `PRO`, which is required for serverless SQL warehouses. Otherwise, the default is `CLASSIC`.
     */
    warehouseType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SqlEndpoint resource.
 */
export interface SqlEndpointArgs {
    /**
     * Time in minutes until an idle SQL warehouse terminates all clusters and stops. This field is optional. The default is 120, set to 0 to disable the auto stop.
     */
    autoStopMins?: pulumi.Input<number>;
    /**
     * block, consisting of following fields:
     */
    channel?: pulumi.Input<inputs.SqlEndpointChannel>;
    /**
     * The size of the clusters allocated to the endpoint: "2X-Small", "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large".
     */
    clusterSize: pulumi.Input<string>;
    /**
     * ID of the data source for this endpoint. This is used to bind an Databricks SQL query to an endpoint.
     */
    dataSourceId?: pulumi.Input<string>;
    /**
     * Whether to enable [Photon](https://databricks.com/product/delta-engine). This field is optional and is enabled by default.
     */
    enablePhoton?: pulumi.Input<boolean>;
    /**
     * Whether this SQL warehouse is a serverless endpoint. See below for details about the default values. To avoid ambiguity, especially for organizations with many workspaces, Databricks recommends that you always set this field explicitly.
     *
     * - **For AWS**, If omitted, the default is `false` for most workspaces. However, if this workspace used the SQL Warehouses API to create a warehouse between September 1, 2022 and April 30, 2023, the default remains the previous behavior which is default to `true` if the workspace is enabled for serverless and fits the requirements for serverless SQL warehouses. If your account needs updated [terms of use](https://docs.databricks.com/sql/admin/serverless.html#accept-terms), workspace admins are prompted in the Databricks SQL UI. A workspace must meet the [requirements](https://docs.databricks.com/sql/admin/serverless.html#requirements) and might require an update to its instance profile role to [add a trust relationship](https://docs.databricks.com/sql/admin/serverless.html#aws-instance-profile-setup).
     *
     * - **For Azure**, If omitted, the default is `false` for most workspaces. However, if this workspace used the SQL Warehouses API to create a warehouse between November 1, 2022 and May 19, 2023, the default remains the previous behavior which is default to `true` if the workspace is enabled for serverless and fits the requirements for serverless SQL warehouses. A workspace must meet the [requirements](https://learn.microsoft.com/azure/databricks/sql/admin/serverless) and might require an update to its [Azure storage firewall](https://learn.microsoft.com/azure/databricks/sql/admin/serverless-firewall).
     */
    enableServerlessCompute?: pulumi.Input<boolean>;
    instanceProfileArn?: pulumi.Input<string>;
    /**
     * Maximum number of clusters available when a SQL warehouse is running. This field is required. If multi-cluster load balancing is not enabled, this is default to `1`.
     */
    maxNumClusters?: pulumi.Input<number>;
    /**
     * Minimum number of clusters available when a SQL warehouse is running. The default is `1`.
     */
    minNumClusters?: pulumi.Input<number>;
    /**
     * Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
     */
    name?: pulumi.Input<string>;
    /**
     * The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`. This field is optional. Default is `COST_OPTIMIZED`.
     */
    spotInstancePolicy?: pulumi.Input<string>;
    /**
     * Databricks tags all endpoint resources with these tags.
     */
    tags?: pulumi.Input<inputs.SqlEndpointTags>;
    /**
     * SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/admin/sql-endpoints.html#switch-the-sql-warehouse-type-pro-classic-or-serverless) or [Azure](https://learn.microsoft.com/en-us/azure/databricks/sql/admin/create-sql-warehouse#--upgrade-a-pro-or-classic-sql-warehouse-to-a-serverless-sql-warehouse). Set to `PRO` or `CLASSIC`. If the field `enableServerlessCompute` has the value `true` either explicitly or through the default logic (see that field above for details), the default is `PRO`, which is required for serverless SQL warehouses. Otherwise, the default is `CLASSIC`.
     */
    warehouseType?: pulumi.Input<string>;
}
