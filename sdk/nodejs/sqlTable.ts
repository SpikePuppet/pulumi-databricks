// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Within a metastore, Unity Catalog provides a 3-level namespace for organizing data: Catalogs, databases (also called schemas), and tables / views.
 *
 * A `databricks.SqlTable` is contained within databricks_schema, and can represent either a managed table, an external table or a view.
 *
 * This resource creates and updates the Unity Catalog table/view by executing the necessary SQL queries on a special auto-terminating cluster it would create for this operation. You could also specify a SQL warehouse or cluster for the queries to be executed on.
 *
 * ## Import
 *
 * This resource can be imported by its full name:
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/sqlTable:SqlTable this <catalog_name>.<schema_name>.<name>
 * ```
 */
export class SqlTable extends pulumi.CustomResource {
    /**
     * Get an existing SqlTable resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SqlTableState, opts?: pulumi.CustomResourceOptions): SqlTable {
        return new SqlTable(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/sqlTable:SqlTable';

    /**
     * Returns true if the given object is an instance of SqlTable.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SqlTable {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SqlTable.__pulumiType;
    }

    /**
     * Name of parent catalog. Change forces creation of a new resource.
     */
    public readonly catalogName!: pulumi.Output<string>;
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
     */
    public readonly clusterKeys!: pulumi.Output<string[] | undefined>;
    public readonly columns!: pulumi.Output<outputs.SqlTableColumn[]>;
    /**
     * User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
     */
    public readonly dataSourceFormat!: pulumi.Output<string | undefined>;
    /**
     * Name of table relative to parent catalog and schema. Change forces creation of a new resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Map of user defined table options. Change forces creation of a new resource.
     */
    public readonly options!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `clusterKeys`.
     */
    public readonly partitions!: pulumi.Output<string[] | undefined>;
    /**
     * Map of table properties.
     */
    public readonly properties!: pulumi.Output<{[key: string]: any}>;
    /**
     * Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
     */
    public readonly schemaName!: pulumi.Output<string>;
    /**
     * For EXTERNAL Tables only: the name of storage credential to use. Change forces creation of a new resource.
     */
    public readonly storageCredentialName!: pulumi.Output<string | undefined>;
    /**
     * URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
     */
    public readonly storageLocation!: pulumi.Output<string | undefined>;
    /**
     * Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
     */
    public readonly tableType!: pulumi.Output<string>;
    /**
     * SQL text defining the view (for `tableType == "VIEW"`). Not supported for `MANAGED` or `EXTERNAL` table_type.
     */
    public readonly viewDefinition!: pulumi.Output<string | undefined>;
    /**
     * All table CRUD operations must be executed on a running cluster or SQL warehouse. If a `warehouseId` is specified, that SQL warehouse will be used to execute SQL commands to manage this table. Conflicts with `clusterId`.
     */
    public readonly warehouseId!: pulumi.Output<string | undefined>;

    /**
     * Create a SqlTable resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SqlTableArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SqlTableArgs | SqlTableState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SqlTableState | undefined;
            resourceInputs["catalogName"] = state ? state.catalogName : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["clusterKeys"] = state ? state.clusterKeys : undefined;
            resourceInputs["columns"] = state ? state.columns : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["dataSourceFormat"] = state ? state.dataSourceFormat : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["options"] = state ? state.options : undefined;
            resourceInputs["partitions"] = state ? state.partitions : undefined;
            resourceInputs["properties"] = state ? state.properties : undefined;
            resourceInputs["schemaName"] = state ? state.schemaName : undefined;
            resourceInputs["storageCredentialName"] = state ? state.storageCredentialName : undefined;
            resourceInputs["storageLocation"] = state ? state.storageLocation : undefined;
            resourceInputs["tableType"] = state ? state.tableType : undefined;
            resourceInputs["viewDefinition"] = state ? state.viewDefinition : undefined;
            resourceInputs["warehouseId"] = state ? state.warehouseId : undefined;
        } else {
            const args = argsOrState as SqlTableArgs | undefined;
            if ((!args || args.catalogName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'catalogName'");
            }
            if ((!args || args.schemaName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schemaName'");
            }
            if ((!args || args.tableType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tableType'");
            }
            resourceInputs["catalogName"] = args ? args.catalogName : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["clusterKeys"] = args ? args.clusterKeys : undefined;
            resourceInputs["columns"] = args ? args.columns : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["dataSourceFormat"] = args ? args.dataSourceFormat : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["options"] = args ? args.options : undefined;
            resourceInputs["partitions"] = args ? args.partitions : undefined;
            resourceInputs["properties"] = args ? args.properties : undefined;
            resourceInputs["schemaName"] = args ? args.schemaName : undefined;
            resourceInputs["storageCredentialName"] = args ? args.storageCredentialName : undefined;
            resourceInputs["storageLocation"] = args ? args.storageLocation : undefined;
            resourceInputs["tableType"] = args ? args.tableType : undefined;
            resourceInputs["viewDefinition"] = args ? args.viewDefinition : undefined;
            resourceInputs["warehouseId"] = args ? args.warehouseId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SqlTable.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SqlTable resources.
 */
export interface SqlTableState {
    /**
     * Name of parent catalog. Change forces creation of a new resource.
     */
    catalogName?: pulumi.Input<string>;
    clusterId?: pulumi.Input<string>;
    /**
     * a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
     */
    clusterKeys?: pulumi.Input<pulumi.Input<string>[]>;
    columns?: pulumi.Input<pulumi.Input<inputs.SqlTableColumn>[]>;
    /**
     * User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
     */
    comment?: pulumi.Input<string>;
    /**
     * External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
     */
    dataSourceFormat?: pulumi.Input<string>;
    /**
     * Name of table relative to parent catalog and schema. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Map of user defined table options. Change forces creation of a new resource.
     */
    options?: pulumi.Input<{[key: string]: any}>;
    /**
     * a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `clusterKeys`.
     */
    partitions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Map of table properties.
     */
    properties?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
     */
    schemaName?: pulumi.Input<string>;
    /**
     * For EXTERNAL Tables only: the name of storage credential to use. Change forces creation of a new resource.
     */
    storageCredentialName?: pulumi.Input<string>;
    /**
     * URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
     */
    storageLocation?: pulumi.Input<string>;
    /**
     * Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
     */
    tableType?: pulumi.Input<string>;
    /**
     * SQL text defining the view (for `tableType == "VIEW"`). Not supported for `MANAGED` or `EXTERNAL` table_type.
     */
    viewDefinition?: pulumi.Input<string>;
    /**
     * All table CRUD operations must be executed on a running cluster or SQL warehouse. If a `warehouseId` is specified, that SQL warehouse will be used to execute SQL commands to manage this table. Conflicts with `clusterId`.
     */
    warehouseId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SqlTable resource.
 */
export interface SqlTableArgs {
    /**
     * Name of parent catalog. Change forces creation of a new resource.
     */
    catalogName: pulumi.Input<string>;
    clusterId?: pulumi.Input<string>;
    /**
     * a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
     */
    clusterKeys?: pulumi.Input<pulumi.Input<string>[]>;
    columns?: pulumi.Input<pulumi.Input<inputs.SqlTableColumn>[]>;
    /**
     * User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
     */
    comment?: pulumi.Input<string>;
    /**
     * External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
     */
    dataSourceFormat?: pulumi.Input<string>;
    /**
     * Name of table relative to parent catalog and schema. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Map of user defined table options. Change forces creation of a new resource.
     */
    options?: pulumi.Input<{[key: string]: any}>;
    /**
     * a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `clusterKeys`.
     */
    partitions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Map of table properties.
     */
    properties?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
     */
    schemaName: pulumi.Input<string>;
    /**
     * For EXTERNAL Tables only: the name of storage credential to use. Change forces creation of a new resource.
     */
    storageCredentialName?: pulumi.Input<string>;
    /**
     * URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
     */
    storageLocation?: pulumi.Input<string>;
    /**
     * Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
     */
    tableType: pulumi.Input<string>;
    /**
     * SQL text defining the view (for `tableType == "VIEW"`). Not supported for `MANAGED` or `EXTERNAL` table_type.
     */
    viewDefinition?: pulumi.Input<string>;
    /**
     * All table CRUD operations must be executed on a running cluster or SQL warehouse. If a `warehouseId` is specified, that SQL warehouse will be used to execute SQL commands to manage this table. Conflicts with `clusterId`.
     */
    warehouseId?: pulumi.Input<string>;
}
