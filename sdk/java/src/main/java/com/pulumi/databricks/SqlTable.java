// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.SqlTableArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.SqlTableState;
import com.pulumi.databricks.outputs.SqlTableColumn;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

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
 *  bash
 * 
 * ```sh
 * $ pulumi import databricks:index/sqlTable:SqlTable this &lt;catalog_name&gt;.&lt;schema_name&gt;.&lt;name&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/sqlTable:SqlTable")
public class SqlTable extends com.pulumi.resources.CustomResource {
    /**
     * Name of parent catalog. Change forces creation of a new resource.
     * 
     */
    @Export(name="catalogName", refs={String.class}, tree="[0]")
    private Output<String> catalogName;

    /**
     * @return Name of parent catalog. Change forces creation of a new resource.
     * 
     */
    public Output<String> catalogName() {
        return this.catalogName;
    }
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
     * 
     */
    @Export(name="clusterKeys", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> clusterKeys;

    /**
     * @return a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
     * 
     */
    public Output<Optional<List<String>>> clusterKeys() {
        return Codegen.optional(this.clusterKeys);
    }
    @Export(name="columns", refs={List.class,SqlTableColumn.class}, tree="[0,1]")
    private Output<List<SqlTableColumn>> columns;

    public Output<List<SqlTableColumn>> columns() {
        return this.columns;
    }
    /**
     * User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
     * 
     */
    @Export(name="dataSourceFormat", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dataSourceFormat;

    /**
     * @return External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
     * 
     */
    public Output<Optional<String>> dataSourceFormat() {
        return Codegen.optional(this.dataSourceFormat);
    }
    /**
     * Name of table relative to parent catalog and schema. Change forces creation of a new resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of table relative to parent catalog and schema. Change forces creation of a new resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Map of user defined table options. Change forces creation of a new resource.
     * 
     */
    @Export(name="options", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> options;

    /**
     * @return Map of user defined table options. Change forces creation of a new resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> options() {
        return Codegen.optional(this.options);
    }
    /**
     * a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `cluster_keys`.
     * 
     */
    @Export(name="partitions", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> partitions;

    /**
     * @return a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `cluster_keys`.
     * 
     */
    public Output<Optional<List<String>>> partitions() {
        return Codegen.optional(this.partitions);
    }
    /**
     * Map of table properties.
     * 
     */
    @Export(name="properties", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> properties;

    /**
     * @return Map of table properties.
     * 
     */
    public Output<Map<String,Object>> properties() {
        return this.properties;
    }
    /**
     * Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
     * 
     */
    @Export(name="schemaName", refs={String.class}, tree="[0]")
    private Output<String> schemaName;

    /**
     * @return Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
     * 
     */
    public Output<String> schemaName() {
        return this.schemaName;
    }
    /**
     * For EXTERNAL Tables only: the name of storage credential to use. Change forces creation of a new resource.
     * 
     */
    @Export(name="storageCredentialName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageCredentialName;

    /**
     * @return For EXTERNAL Tables only: the name of storage credential to use. Change forces creation of a new resource.
     * 
     */
    public Output<Optional<String>> storageCredentialName() {
        return Codegen.optional(this.storageCredentialName);
    }
    /**
     * URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
     * 
     */
    @Export(name="storageLocation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageLocation;

    /**
     * @return URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
     * 
     */
    public Output<Optional<String>> storageLocation() {
        return Codegen.optional(this.storageLocation);
    }
    /**
     * Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
     * 
     */
    @Export(name="tableType", refs={String.class}, tree="[0]")
    private Output<String> tableType;

    /**
     * @return Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
     * 
     */
    public Output<String> tableType() {
        return this.tableType;
    }
    /**
     * SQL text defining the view (for `table_type == &#34;VIEW&#34;`). Not supported for `MANAGED` or `EXTERNAL` table_type.
     * 
     */
    @Export(name="viewDefinition", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> viewDefinition;

    /**
     * @return SQL text defining the view (for `table_type == &#34;VIEW&#34;`). Not supported for `MANAGED` or `EXTERNAL` table_type.
     * 
     */
    public Output<Optional<String>> viewDefinition() {
        return Codegen.optional(this.viewDefinition);
    }
    /**
     * All table CRUD operations must be executed on a running cluster or SQL warehouse. If a `warehouse_id` is specified, that SQL warehouse will be used to execute SQL commands to manage this table. Conflicts with `cluster_id`.
     * 
     */
    @Export(name="warehouseId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> warehouseId;

    /**
     * @return All table CRUD operations must be executed on a running cluster or SQL warehouse. If a `warehouse_id` is specified, that SQL warehouse will be used to execute SQL commands to manage this table. Conflicts with `cluster_id`.
     * 
     */
    public Output<Optional<String>> warehouseId() {
        return Codegen.optional(this.warehouseId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlTable(String name) {
        this(name, SqlTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlTable(String name, SqlTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlTable(String name, SqlTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/sqlTable:SqlTable", name, args == null ? SqlTableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SqlTable(String name, Output<String> id, @Nullable SqlTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/sqlTable:SqlTable", name, state, makeResourceOptions(options, id));
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
    public static SqlTable get(String name, Output<String> id, @Nullable SqlTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlTable(name, id, state, options);
    }
}
