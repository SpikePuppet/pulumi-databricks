// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetTableTableInfoColumn;
import com.pulumi.databricks.inputs.GetTableTableInfoDeltaRuntimePropertiesKvpairs;
import com.pulumi.databricks.inputs.GetTableTableInfoEffectivePredictiveOptimizationFlag;
import com.pulumi.databricks.inputs.GetTableTableInfoEncryptionDetails;
import com.pulumi.databricks.inputs.GetTableTableInfoRowFilter;
import com.pulumi.databricks.inputs.GetTableTableInfoTableConstraint;
import com.pulumi.databricks.inputs.GetTableTableInfoViewDependencies;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTableTableInfo extends com.pulumi.resources.InvokeArgs {

    public static final GetTableTableInfo Empty = new GetTableTableInfo();

    @Import(name="accessPoint")
    private @Nullable String accessPoint;

    public Optional<String> accessPoint() {
        return Optional.ofNullable(this.accessPoint);
    }

    @Import(name="browseOnly")
    private @Nullable Boolean browseOnly;

    public Optional<Boolean> browseOnly() {
        return Optional.ofNullable(this.browseOnly);
    }

    /**
     * Name of parent catalog.
     * 
     */
    @Import(name="catalogName")
    private @Nullable String catalogName;

    /**
     * @return Name of parent catalog.
     * 
     */
    public Optional<String> catalogName() {
        return Optional.ofNullable(this.catalogName);
    }

    /**
     * Array of ColumnInfo objects of the table&#39;s columns
     * 
     */
    @Import(name="columns")
    private @Nullable List<GetTableTableInfoColumn> columns;

    /**
     * @return Array of ColumnInfo objects of the table&#39;s columns
     * 
     */
    public Optional<List<GetTableTableInfoColumn>> columns() {
        return Optional.ofNullable(this.columns);
    }

    /**
     * Free-form text description
     * 
     */
    @Import(name="comment")
    private @Nullable String comment;

    /**
     * @return Free-form text description
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="createdAt")
    private @Nullable Integer createdAt;

    public Optional<Integer> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    @Import(name="createdBy")
    private @Nullable String createdBy;

    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    @Import(name="dataAccessConfigurationId")
    private @Nullable String dataAccessConfigurationId;

    public Optional<String> dataAccessConfigurationId() {
        return Optional.ofNullable(this.dataAccessConfigurationId);
    }

    /**
     * Table format, e.g. DELTA, CSV, JSON
     * 
     */
    @Import(name="dataSourceFormat")
    private @Nullable String dataSourceFormat;

    /**
     * @return Table format, e.g. DELTA, CSV, JSON
     * 
     */
    public Optional<String> dataSourceFormat() {
        return Optional.ofNullable(this.dataSourceFormat);
    }

    @Import(name="deletedAt")
    private @Nullable Integer deletedAt;

    public Optional<Integer> deletedAt() {
        return Optional.ofNullable(this.deletedAt);
    }

    @Import(name="deltaRuntimePropertiesKvpairs")
    private @Nullable GetTableTableInfoDeltaRuntimePropertiesKvpairs deltaRuntimePropertiesKvpairs;

    public Optional<GetTableTableInfoDeltaRuntimePropertiesKvpairs> deltaRuntimePropertiesKvpairs() {
        return Optional.ofNullable(this.deltaRuntimePropertiesKvpairs);
    }

    @Import(name="effectivePredictiveOptimizationFlag")
    private @Nullable GetTableTableInfoEffectivePredictiveOptimizationFlag effectivePredictiveOptimizationFlag;

    public Optional<GetTableTableInfoEffectivePredictiveOptimizationFlag> effectivePredictiveOptimizationFlag() {
        return Optional.ofNullable(this.effectivePredictiveOptimizationFlag);
    }

    @Import(name="enablePredictiveOptimization")
    private @Nullable String enablePredictiveOptimization;

    public Optional<String> enablePredictiveOptimization() {
        return Optional.ofNullable(this.enablePredictiveOptimization);
    }

    @Import(name="encryptionDetails")
    private @Nullable GetTableTableInfoEncryptionDetails encryptionDetails;

    public Optional<GetTableTableInfoEncryptionDetails> encryptionDetails() {
        return Optional.ofNullable(this.encryptionDetails);
    }

    @Import(name="fullName")
    private @Nullable String fullName;

    public Optional<String> fullName() {
        return Optional.ofNullable(this.fullName);
    }

    @Import(name="metastoreId")
    private @Nullable String metastoreId;

    public Optional<String> metastoreId() {
        return Optional.ofNullable(this.metastoreId);
    }

    /**
     * Full name of the databricks_table: _`catalog`.`schema`.`table`_
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Full name of the databricks_table: _`catalog`.`schema`.`table`_
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Current owner of the table
     * 
     */
    @Import(name="owner")
    private @Nullable String owner;

    /**
     * @return Current owner of the table
     * 
     */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }

    @Import(name="pipelineId")
    private @Nullable String pipelineId;

    public Optional<String> pipelineId() {
        return Optional.ofNullable(this.pipelineId);
    }

    @Import(name="properties")
    private @Nullable Map<String,Object> properties;

    public Optional<Map<String,Object>> properties() {
        return Optional.ofNullable(this.properties);
    }

    @Import(name="rowFilter")
    private @Nullable GetTableTableInfoRowFilter rowFilter;

    public Optional<GetTableTableInfoRowFilter> rowFilter() {
        return Optional.ofNullable(this.rowFilter);
    }

    /**
     * Name of parent schema relative to its parent catalog.
     * 
     */
    @Import(name="schemaName")
    private @Nullable String schemaName;

    /**
     * @return Name of parent schema relative to its parent catalog.
     * 
     */
    public Optional<String> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    @Import(name="sqlPath")
    private @Nullable String sqlPath;

    public Optional<String> sqlPath() {
        return Optional.ofNullable(this.sqlPath);
    }

    @Import(name="storageCredentialName")
    private @Nullable String storageCredentialName;

    public Optional<String> storageCredentialName() {
        return Optional.ofNullable(this.storageCredentialName);
    }

    @Import(name="storageLocation")
    private @Nullable String storageLocation;

    public Optional<String> storageLocation() {
        return Optional.ofNullable(this.storageLocation);
    }

    @Import(name="tableConstraints")
    private @Nullable List<GetTableTableInfoTableConstraint> tableConstraints;

    public Optional<List<GetTableTableInfoTableConstraint>> tableConstraints() {
        return Optional.ofNullable(this.tableConstraints);
    }

    @Import(name="tableId")
    private @Nullable String tableId;

    public Optional<String> tableId() {
        return Optional.ofNullable(this.tableId);
    }

    /**
     * Table type, e.g. MANAGED, EXTERNAL, VIEW
     * 
     */
    @Import(name="tableType")
    private @Nullable String tableType;

    /**
     * @return Table type, e.g. MANAGED, EXTERNAL, VIEW
     * 
     */
    public Optional<String> tableType() {
        return Optional.ofNullable(this.tableType);
    }

    @Import(name="updatedAt")
    private @Nullable Integer updatedAt;

    public Optional<Integer> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    @Import(name="updatedBy")
    private @Nullable String updatedBy;

    public Optional<String> updatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }

    /**
     * View definition SQL (when `table_type` is VIEW, MATERIALIZED_VIEW, or STREAMING_TABLE)
     * 
     */
    @Import(name="viewDefinition")
    private @Nullable String viewDefinition;

    /**
     * @return View definition SQL (when `table_type` is VIEW, MATERIALIZED_VIEW, or STREAMING_TABLE)
     * 
     */
    public Optional<String> viewDefinition() {
        return Optional.ofNullable(this.viewDefinition);
    }

    /**
     * View dependencies (when `table_type` is VIEW or MATERIALIZED_VIEW, STREAMING_TABLE)
     * 
     */
    @Import(name="viewDependencies")
    private @Nullable GetTableTableInfoViewDependencies viewDependencies;

    /**
     * @return View dependencies (when `table_type` is VIEW or MATERIALIZED_VIEW, STREAMING_TABLE)
     * 
     */
    public Optional<GetTableTableInfoViewDependencies> viewDependencies() {
        return Optional.ofNullable(this.viewDependencies);
    }

    private GetTableTableInfo() {}

    private GetTableTableInfo(GetTableTableInfo $) {
        this.accessPoint = $.accessPoint;
        this.browseOnly = $.browseOnly;
        this.catalogName = $.catalogName;
        this.columns = $.columns;
        this.comment = $.comment;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.dataAccessConfigurationId = $.dataAccessConfigurationId;
        this.dataSourceFormat = $.dataSourceFormat;
        this.deletedAt = $.deletedAt;
        this.deltaRuntimePropertiesKvpairs = $.deltaRuntimePropertiesKvpairs;
        this.effectivePredictiveOptimizationFlag = $.effectivePredictiveOptimizationFlag;
        this.enablePredictiveOptimization = $.enablePredictiveOptimization;
        this.encryptionDetails = $.encryptionDetails;
        this.fullName = $.fullName;
        this.metastoreId = $.metastoreId;
        this.name = $.name;
        this.owner = $.owner;
        this.pipelineId = $.pipelineId;
        this.properties = $.properties;
        this.rowFilter = $.rowFilter;
        this.schemaName = $.schemaName;
        this.sqlPath = $.sqlPath;
        this.storageCredentialName = $.storageCredentialName;
        this.storageLocation = $.storageLocation;
        this.tableConstraints = $.tableConstraints;
        this.tableId = $.tableId;
        this.tableType = $.tableType;
        this.updatedAt = $.updatedAt;
        this.updatedBy = $.updatedBy;
        this.viewDefinition = $.viewDefinition;
        this.viewDependencies = $.viewDependencies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableTableInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableTableInfo $;

        public Builder() {
            $ = new GetTableTableInfo();
        }

        public Builder(GetTableTableInfo defaults) {
            $ = new GetTableTableInfo(Objects.requireNonNull(defaults));
        }

        public Builder accessPoint(@Nullable String accessPoint) {
            $.accessPoint = accessPoint;
            return this;
        }

        public Builder browseOnly(@Nullable Boolean browseOnly) {
            $.browseOnly = browseOnly;
            return this;
        }

        /**
         * @param catalogName Name of parent catalog.
         * 
         * @return builder
         * 
         */
        public Builder catalogName(@Nullable String catalogName) {
            $.catalogName = catalogName;
            return this;
        }

        /**
         * @param columns Array of ColumnInfo objects of the table&#39;s columns
         * 
         * @return builder
         * 
         */
        public Builder columns(@Nullable List<GetTableTableInfoColumn> columns) {
            $.columns = columns;
            return this;
        }

        /**
         * @param columns Array of ColumnInfo objects of the table&#39;s columns
         * 
         * @return builder
         * 
         */
        public Builder columns(GetTableTableInfoColumn... columns) {
            return columns(List.of(columns));
        }

        /**
         * @param comment Free-form text description
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable String comment) {
            $.comment = comment;
            return this;
        }

        public Builder createdAt(@Nullable Integer createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdBy(@Nullable String createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        public Builder dataAccessConfigurationId(@Nullable String dataAccessConfigurationId) {
            $.dataAccessConfigurationId = dataAccessConfigurationId;
            return this;
        }

        /**
         * @param dataSourceFormat Table format, e.g. DELTA, CSV, JSON
         * 
         * @return builder
         * 
         */
        public Builder dataSourceFormat(@Nullable String dataSourceFormat) {
            $.dataSourceFormat = dataSourceFormat;
            return this;
        }

        public Builder deletedAt(@Nullable Integer deletedAt) {
            $.deletedAt = deletedAt;
            return this;
        }

        public Builder deltaRuntimePropertiesKvpairs(@Nullable GetTableTableInfoDeltaRuntimePropertiesKvpairs deltaRuntimePropertiesKvpairs) {
            $.deltaRuntimePropertiesKvpairs = deltaRuntimePropertiesKvpairs;
            return this;
        }

        public Builder effectivePredictiveOptimizationFlag(@Nullable GetTableTableInfoEffectivePredictiveOptimizationFlag effectivePredictiveOptimizationFlag) {
            $.effectivePredictiveOptimizationFlag = effectivePredictiveOptimizationFlag;
            return this;
        }

        public Builder enablePredictiveOptimization(@Nullable String enablePredictiveOptimization) {
            $.enablePredictiveOptimization = enablePredictiveOptimization;
            return this;
        }

        public Builder encryptionDetails(@Nullable GetTableTableInfoEncryptionDetails encryptionDetails) {
            $.encryptionDetails = encryptionDetails;
            return this;
        }

        public Builder fullName(@Nullable String fullName) {
            $.fullName = fullName;
            return this;
        }

        public Builder metastoreId(@Nullable String metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        /**
         * @param name Full name of the databricks_table: _`catalog`.`schema`.`table`_
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param owner Current owner of the table
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable String owner) {
            $.owner = owner;
            return this;
        }

        public Builder pipelineId(@Nullable String pipelineId) {
            $.pipelineId = pipelineId;
            return this;
        }

        public Builder properties(@Nullable Map<String,Object> properties) {
            $.properties = properties;
            return this;
        }

        public Builder rowFilter(@Nullable GetTableTableInfoRowFilter rowFilter) {
            $.rowFilter = rowFilter;
            return this;
        }

        /**
         * @param schemaName Name of parent schema relative to its parent catalog.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(@Nullable String schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        public Builder sqlPath(@Nullable String sqlPath) {
            $.sqlPath = sqlPath;
            return this;
        }

        public Builder storageCredentialName(@Nullable String storageCredentialName) {
            $.storageCredentialName = storageCredentialName;
            return this;
        }

        public Builder storageLocation(@Nullable String storageLocation) {
            $.storageLocation = storageLocation;
            return this;
        }

        public Builder tableConstraints(@Nullable List<GetTableTableInfoTableConstraint> tableConstraints) {
            $.tableConstraints = tableConstraints;
            return this;
        }

        public Builder tableConstraints(GetTableTableInfoTableConstraint... tableConstraints) {
            return tableConstraints(List.of(tableConstraints));
        }

        public Builder tableId(@Nullable String tableId) {
            $.tableId = tableId;
            return this;
        }

        /**
         * @param tableType Table type, e.g. MANAGED, EXTERNAL, VIEW
         * 
         * @return builder
         * 
         */
        public Builder tableType(@Nullable String tableType) {
            $.tableType = tableType;
            return this;
        }

        public Builder updatedAt(@Nullable Integer updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedBy(@Nullable String updatedBy) {
            $.updatedBy = updatedBy;
            return this;
        }

        /**
         * @param viewDefinition View definition SQL (when `table_type` is VIEW, MATERIALIZED_VIEW, or STREAMING_TABLE)
         * 
         * @return builder
         * 
         */
        public Builder viewDefinition(@Nullable String viewDefinition) {
            $.viewDefinition = viewDefinition;
            return this;
        }

        /**
         * @param viewDependencies View dependencies (when `table_type` is VIEW or MATERIALIZED_VIEW, STREAMING_TABLE)
         * 
         * @return builder
         * 
         */
        public Builder viewDependencies(@Nullable GetTableTableInfoViewDependencies viewDependencies) {
            $.viewDependencies = viewDependencies;
            return this;
        }

        public GetTableTableInfo build() {
            return $;
        }
    }

}