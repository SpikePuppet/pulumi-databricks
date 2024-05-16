// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.SqlTableColumnArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlTableArgs Empty = new SqlTableArgs();

    /**
     * Name of parent catalog. Change forces creation of a new resource.
     * 
     */
    @Import(name="catalogName", required=true)
    private Output<String> catalogName;

    /**
     * @return Name of parent catalog. Change forces creation of a new resource.
     * 
     */
    public Output<String> catalogName() {
        return this.catalogName;
    }

    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
     * 
     */
    @Import(name="clusterKeys")
    private @Nullable Output<List<String>> clusterKeys;

    /**
     * @return a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
     * 
     */
    public Optional<Output<List<String>>> clusterKeys() {
        return Optional.ofNullable(this.clusterKeys);
    }

    @Import(name="columns")
    private @Nullable Output<List<SqlTableColumnArgs>> columns;

    public Optional<Output<List<SqlTableColumnArgs>>> columns() {
        return Optional.ofNullable(this.columns);
    }

    /**
     * User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
     * 
     */
    @Import(name="dataSourceFormat")
    private @Nullable Output<String> dataSourceFormat;

    /**
     * @return External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
     * 
     */
    public Optional<Output<String>> dataSourceFormat() {
        return Optional.ofNullable(this.dataSourceFormat);
    }

    /**
     * Name of table relative to parent catalog and schema. Change forces creation of a new resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of table relative to parent catalog and schema. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Map of user defined table options. Change forces creation of a new resource.
     * 
     */
    @Import(name="options")
    private @Nullable Output<Map<String,Object>> options;

    /**
     * @return Map of user defined table options. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * Username/groupname/sp application_id of the schema owner.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return Username/groupname/sp application_id of the schema owner.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `cluster_keys`.
     * 
     */
    @Import(name="partitions")
    private @Nullable Output<List<String>> partitions;

    /**
     * @return a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `cluster_keys`.
     * 
     */
    public Optional<Output<List<String>>> partitions() {
        return Optional.ofNullable(this.partitions);
    }

    /**
     * Map of table properties.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,Object>> properties;

    /**
     * @return Map of table properties.
     * 
     */
    public Optional<Output<Map<String,Object>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
     * 
     */
    @Import(name="schemaName", required=true)
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
    @Import(name="storageCredentialName")
    private @Nullable Output<String> storageCredentialName;

    /**
     * @return For EXTERNAL Tables only: the name of storage credential to use. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> storageCredentialName() {
        return Optional.ofNullable(this.storageCredentialName);
    }

    /**
     * URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
     * 
     */
    @Import(name="storageLocation")
    private @Nullable Output<String> storageLocation;

    /**
     * @return URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
     * 
     */
    public Optional<Output<String>> storageLocation() {
        return Optional.ofNullable(this.storageLocation);
    }

    /**
     * Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
     * 
     */
    @Import(name="tableType", required=true)
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
    @Import(name="viewDefinition")
    private @Nullable Output<String> viewDefinition;

    /**
     * @return SQL text defining the view (for `table_type == &#34;VIEW&#34;`). Not supported for `MANAGED` or `EXTERNAL` table_type.
     * 
     */
    public Optional<Output<String>> viewDefinition() {
        return Optional.ofNullable(this.viewDefinition);
    }

    /**
     * All table CRUD operations must be executed on a running cluster or SQL warehouse. If a `warehouse_id` is specified, that SQL warehouse will be used to execute SQL commands to manage this table. Conflicts with `cluster_id`.
     * 
     */
    @Import(name="warehouseId")
    private @Nullable Output<String> warehouseId;

    /**
     * @return All table CRUD operations must be executed on a running cluster or SQL warehouse. If a `warehouse_id` is specified, that SQL warehouse will be used to execute SQL commands to manage this table. Conflicts with `cluster_id`.
     * 
     */
    public Optional<Output<String>> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    private SqlTableArgs() {}

    private SqlTableArgs(SqlTableArgs $) {
        this.catalogName = $.catalogName;
        this.clusterId = $.clusterId;
        this.clusterKeys = $.clusterKeys;
        this.columns = $.columns;
        this.comment = $.comment;
        this.dataSourceFormat = $.dataSourceFormat;
        this.name = $.name;
        this.options = $.options;
        this.owner = $.owner;
        this.partitions = $.partitions;
        this.properties = $.properties;
        this.schemaName = $.schemaName;
        this.storageCredentialName = $.storageCredentialName;
        this.storageLocation = $.storageLocation;
        this.tableType = $.tableType;
        this.viewDefinition = $.viewDefinition;
        this.warehouseId = $.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlTableArgs $;

        public Builder() {
            $ = new SqlTableArgs();
        }

        public Builder(SqlTableArgs defaults) {
            $ = new SqlTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogName Name of parent catalog. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder catalogName(Output<String> catalogName) {
            $.catalogName = catalogName;
            return this;
        }

        /**
         * @param catalogName Name of parent catalog. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder catalogName(String catalogName) {
            return catalogName(Output.of(catalogName));
        }

        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param clusterKeys a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
         * 
         * @return builder
         * 
         */
        public Builder clusterKeys(@Nullable Output<List<String>> clusterKeys) {
            $.clusterKeys = clusterKeys;
            return this;
        }

        /**
         * @param clusterKeys a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
         * 
         * @return builder
         * 
         */
        public Builder clusterKeys(List<String> clusterKeys) {
            return clusterKeys(Output.of(clusterKeys));
        }

        /**
         * @param clusterKeys a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
         * 
         * @return builder
         * 
         */
        public Builder clusterKeys(String... clusterKeys) {
            return clusterKeys(List.of(clusterKeys));
        }

        public Builder columns(@Nullable Output<List<SqlTableColumnArgs>> columns) {
            $.columns = columns;
            return this;
        }

        public Builder columns(List<SqlTableColumnArgs> columns) {
            return columns(Output.of(columns));
        }

        public Builder columns(SqlTableColumnArgs... columns) {
            return columns(List.of(columns));
        }

        /**
         * @param comment User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param dataSourceFormat External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceFormat(@Nullable Output<String> dataSourceFormat) {
            $.dataSourceFormat = dataSourceFormat;
            return this;
        }

        /**
         * @param dataSourceFormat External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceFormat(String dataSourceFormat) {
            return dataSourceFormat(Output.of(dataSourceFormat));
        }

        /**
         * @param name Name of table relative to parent catalog and schema. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of table relative to parent catalog and schema. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param options Map of user defined table options. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<Map<String,Object>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Map of user defined table options. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder options(Map<String,Object> options) {
            return options(Output.of(options));
        }

        /**
         * @param owner Username/groupname/sp application_id of the schema owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Username/groupname/sp application_id of the schema owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param partitions a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `cluster_keys`.
         * 
         * @return builder
         * 
         */
        public Builder partitions(@Nullable Output<List<String>> partitions) {
            $.partitions = partitions;
            return this;
        }

        /**
         * @param partitions a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `cluster_keys`.
         * 
         * @return builder
         * 
         */
        public Builder partitions(List<String> partitions) {
            return partitions(Output.of(partitions));
        }

        /**
         * @param partitions a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `cluster_keys`.
         * 
         * @return builder
         * 
         */
        public Builder partitions(String... partitions) {
            return partitions(List.of(partitions));
        }

        /**
         * @param properties Map of table properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,Object>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Map of table properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,Object> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param schemaName Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param schemaName Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        /**
         * @param storageCredentialName For EXTERNAL Tables only: the name of storage credential to use. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder storageCredentialName(@Nullable Output<String> storageCredentialName) {
            $.storageCredentialName = storageCredentialName;
            return this;
        }

        /**
         * @param storageCredentialName For EXTERNAL Tables only: the name of storage credential to use. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder storageCredentialName(String storageCredentialName) {
            return storageCredentialName(Output.of(storageCredentialName));
        }

        /**
         * @param storageLocation URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
         * 
         * @return builder
         * 
         */
        public Builder storageLocation(@Nullable Output<String> storageLocation) {
            $.storageLocation = storageLocation;
            return this;
        }

        /**
         * @param storageLocation URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
         * 
         * @return builder
         * 
         */
        public Builder storageLocation(String storageLocation) {
            return storageLocation(Output.of(storageLocation));
        }

        /**
         * @param tableType Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder tableType(Output<String> tableType) {
            $.tableType = tableType;
            return this;
        }

        /**
         * @param tableType Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder tableType(String tableType) {
            return tableType(Output.of(tableType));
        }

        /**
         * @param viewDefinition SQL text defining the view (for `table_type == &#34;VIEW&#34;`). Not supported for `MANAGED` or `EXTERNAL` table_type.
         * 
         * @return builder
         * 
         */
        public Builder viewDefinition(@Nullable Output<String> viewDefinition) {
            $.viewDefinition = viewDefinition;
            return this;
        }

        /**
         * @param viewDefinition SQL text defining the view (for `table_type == &#34;VIEW&#34;`). Not supported for `MANAGED` or `EXTERNAL` table_type.
         * 
         * @return builder
         * 
         */
        public Builder viewDefinition(String viewDefinition) {
            return viewDefinition(Output.of(viewDefinition));
        }

        /**
         * @param warehouseId All table CRUD operations must be executed on a running cluster or SQL warehouse. If a `warehouse_id` is specified, that SQL warehouse will be used to execute SQL commands to manage this table. Conflicts with `cluster_id`.
         * 
         * @return builder
         * 
         */
        public Builder warehouseId(@Nullable Output<String> warehouseId) {
            $.warehouseId = warehouseId;
            return this;
        }

        /**
         * @param warehouseId All table CRUD operations must be executed on a running cluster or SQL warehouse. If a `warehouse_id` is specified, that SQL warehouse will be used to execute SQL commands to manage this table. Conflicts with `cluster_id`.
         * 
         * @return builder
         * 
         */
        public Builder warehouseId(String warehouseId) {
            return warehouseId(Output.of(warehouseId));
        }

        public SqlTableArgs build() {
            if ($.catalogName == null) {
                throw new MissingRequiredPropertyException("SqlTableArgs", "catalogName");
            }
            if ($.schemaName == null) {
                throw new MissingRequiredPropertyException("SqlTableArgs", "schemaName");
            }
            if ($.tableType == null) {
                throw new MissingRequiredPropertyException("SqlTableArgs", "tableType");
            }
            return $;
        }
    }

}
