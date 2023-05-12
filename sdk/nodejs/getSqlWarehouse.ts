// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add dependsOn attribute in order to prevent _default auth: cannot configure default credentials_ errors.
 *
 * Retrieves information about a databricks.getSqlWarehouse using its id. This could be retrieved programmatically using databricks.getSqlWarehouses data source.
 *
 * ## Example Usage
 *
 * Retrieve attributes of each SQL warehouses in a workspace
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const allSqlWarehouses = databricks.getSqlWarehouses({});
 * const allSqlWarehouse = .map(([, ]) => (databricks.getSqlWarehouse({
 *     id: __value,
 * })));
 * ```
 * ## Related resources
 *
 * The following resources are often used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 * * databricks.SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
 * * databricks.SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all databricks.getSqlWarehouse of workspace.
 * * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
 */
export function getSqlWarehouse(args: GetSqlWarehouseArgs, opts?: pulumi.InvokeOptions): Promise<GetSqlWarehouseResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getSqlWarehouse:getSqlWarehouse", {
        "autoStopMins": args.autoStopMins,
        "channel": args.channel,
        "clusterSize": args.clusterSize,
        "dataSourceId": args.dataSourceId,
        "enablePhoton": args.enablePhoton,
        "enableServerlessCompute": args.enableServerlessCompute,
        "id": args.id,
        "instanceProfileArn": args.instanceProfileArn,
        "jdbcUrl": args.jdbcUrl,
        "maxNumClusters": args.maxNumClusters,
        "minNumClusters": args.minNumClusters,
        "name": args.name,
        "numClusters": args.numClusters,
        "odbcParams": args.odbcParams,
        "spotInstancePolicy": args.spotInstancePolicy,
        "state": args.state,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getSqlWarehouse.
 */
export interface GetSqlWarehouseArgs {
    /**
     * Time in minutes until an idle SQL warehouse terminates all clusters and stops.
     */
    autoStopMins?: number;
    /**
     * block, consisting of following fields:
     */
    channel?: inputs.GetSqlWarehouseChannel;
    /**
     * The size of the clusters allocated to the warehouse: "2X-Small", "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large".
     */
    clusterSize?: string;
    /**
     * ID of the data source for this warehouse. This is used to bind an Databricks SQL query to an warehouse.
     */
    dataSourceId?: string;
    /**
     * Whether to enable [Photon](https://databricks.com/product/delta-engine).
     */
    enablePhoton?: boolean;
    /**
     * Whether this SQL warehouse is a serverless SQL warehouse. If this value is `true`,  `warehouseType` must be `PRO`.
     */
    enableServerlessCompute?: boolean;
    /**
     * The ID of the SQL warehouse
     */
    id: string;
    instanceProfileArn?: string;
    /**
     * JDBC connection string.
     */
    jdbcUrl?: string;
    /**
     * Maximum number of clusters available when a SQL warehouse is running.
     */
    maxNumClusters?: number;
    /**
     * Minimum number of clusters available when a SQL warehouse is running.
     */
    minNumClusters?: number;
    /**
     * Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
     */
    name?: string;
    numClusters?: number;
    /**
     * ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
     */
    odbcParams?: inputs.GetSqlWarehouseOdbcParams;
    /**
     * The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`.
     */
    spotInstancePolicy?: string;
    state?: string;
    /**
     * Databricks tags all warehouse resources with these tags.
     */
    tags?: inputs.GetSqlWarehouseTags;
}

/**
 * A collection of values returned by getSqlWarehouse.
 */
export interface GetSqlWarehouseResult {
    /**
     * Time in minutes until an idle SQL warehouse terminates all clusters and stops.
     */
    readonly autoStopMins: number;
    /**
     * block, consisting of following fields:
     */
    readonly channel: outputs.GetSqlWarehouseChannel;
    /**
     * The size of the clusters allocated to the warehouse: "2X-Small", "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large".
     */
    readonly clusterSize: string;
    /**
     * ID of the data source for this warehouse. This is used to bind an Databricks SQL query to an warehouse.
     */
    readonly dataSourceId: string;
    /**
     * Whether to enable [Photon](https://databricks.com/product/delta-engine).
     */
    readonly enablePhoton: boolean;
    /**
     * Whether this SQL warehouse is a serverless SQL warehouse. If this value is `true`,  `warehouseType` must be `PRO`.
     */
    readonly enableServerlessCompute: boolean;
    readonly id: string;
    readonly instanceProfileArn: string;
    /**
     * JDBC connection string.
     */
    readonly jdbcUrl: string;
    /**
     * Maximum number of clusters available when a SQL warehouse is running.
     */
    readonly maxNumClusters: number;
    /**
     * Minimum number of clusters available when a SQL warehouse is running.
     */
    readonly minNumClusters: number;
    /**
     * Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
     */
    readonly name: string;
    readonly numClusters: number;
    /**
     * ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
     */
    readonly odbcParams: outputs.GetSqlWarehouseOdbcParams;
    /**
     * The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`.
     */
    readonly spotInstancePolicy: string;
    readonly state: string;
    /**
     * Databricks tags all warehouse resources with these tags.
     */
    readonly tags: outputs.GetSqlWarehouseTags;
}
/**
 * > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add dependsOn attribute in order to prevent _default auth: cannot configure default credentials_ errors.
 *
 * Retrieves information about a databricks.getSqlWarehouse using its id. This could be retrieved programmatically using databricks.getSqlWarehouses data source.
 *
 * ## Example Usage
 *
 * Retrieve attributes of each SQL warehouses in a workspace
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const allSqlWarehouses = databricks.getSqlWarehouses({});
 * const allSqlWarehouse = .map(([, ]) => (databricks.getSqlWarehouse({
 *     id: __value,
 * })));
 * ```
 * ## Related resources
 *
 * The following resources are often used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 * * databricks.SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
 * * databricks.SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all databricks.getSqlWarehouse of workspace.
 * * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
 */
export function getSqlWarehouseOutput(args: GetSqlWarehouseOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSqlWarehouseResult> {
    return pulumi.output(args).apply((a: any) => getSqlWarehouse(a, opts))
}

/**
 * A collection of arguments for invoking getSqlWarehouse.
 */
export interface GetSqlWarehouseOutputArgs {
    /**
     * Time in minutes until an idle SQL warehouse terminates all clusters and stops.
     */
    autoStopMins?: pulumi.Input<number>;
    /**
     * block, consisting of following fields:
     */
    channel?: pulumi.Input<inputs.GetSqlWarehouseChannelArgs>;
    /**
     * The size of the clusters allocated to the warehouse: "2X-Small", "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large".
     */
    clusterSize?: pulumi.Input<string>;
    /**
     * ID of the data source for this warehouse. This is used to bind an Databricks SQL query to an warehouse.
     */
    dataSourceId?: pulumi.Input<string>;
    /**
     * Whether to enable [Photon](https://databricks.com/product/delta-engine).
     */
    enablePhoton?: pulumi.Input<boolean>;
    /**
     * Whether this SQL warehouse is a serverless SQL warehouse. If this value is `true`,  `warehouseType` must be `PRO`.
     */
    enableServerlessCompute?: pulumi.Input<boolean>;
    /**
     * The ID of the SQL warehouse
     */
    id: pulumi.Input<string>;
    instanceProfileArn?: pulumi.Input<string>;
    /**
     * JDBC connection string.
     */
    jdbcUrl?: pulumi.Input<string>;
    /**
     * Maximum number of clusters available when a SQL warehouse is running.
     */
    maxNumClusters?: pulumi.Input<number>;
    /**
     * Minimum number of clusters available when a SQL warehouse is running.
     */
    minNumClusters?: pulumi.Input<number>;
    /**
     * Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
     */
    name?: pulumi.Input<string>;
    numClusters?: pulumi.Input<number>;
    /**
     * ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
     */
    odbcParams?: pulumi.Input<inputs.GetSqlWarehouseOdbcParamsArgs>;
    /**
     * The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`.
     */
    spotInstancePolicy?: pulumi.Input<string>;
    state?: pulumi.Input<string>;
    /**
     * Databricks tags all warehouse resources with these tags.
     */
    tags?: pulumi.Input<inputs.GetSqlWarehouseTagsArgs>;
}
