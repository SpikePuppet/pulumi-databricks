// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetTableTableInfoArgs : global::Pulumi.InvokeArgs
    {
        [Input("accessPoint")]
        public string? AccessPoint { get; set; }

        [Input("browseOnly")]
        public bool? BrowseOnly { get; set; }

        /// <summary>
        /// Name of parent catalog.
        /// </summary>
        [Input("catalogName")]
        public string? CatalogName { get; set; }

        [Input("columns")]
        private List<Inputs.GetTableTableInfoColumnArgs>? _columns;

        /// <summary>
        /// Array of ColumnInfo objects of the table's columns
        /// </summary>
        public List<Inputs.GetTableTableInfoColumnArgs> Columns
        {
            get => _columns ?? (_columns = new List<Inputs.GetTableTableInfoColumnArgs>());
            set => _columns = value;
        }

        /// <summary>
        /// Free-form text description
        /// </summary>
        [Input("comment")]
        public string? Comment { get; set; }

        [Input("createdAt")]
        public int? CreatedAt { get; set; }

        [Input("createdBy")]
        public string? CreatedBy { get; set; }

        [Input("dataAccessConfigurationId")]
        public string? DataAccessConfigurationId { get; set; }

        /// <summary>
        /// Table format, e.g. DELTA, CSV, JSON
        /// </summary>
        [Input("dataSourceFormat")]
        public string? DataSourceFormat { get; set; }

        [Input("deletedAt")]
        public int? DeletedAt { get; set; }

        [Input("deltaRuntimePropertiesKvpairs")]
        public Inputs.GetTableTableInfoDeltaRuntimePropertiesKvpairsArgs? DeltaRuntimePropertiesKvpairs { get; set; }

        [Input("effectivePredictiveOptimizationFlag")]
        public Inputs.GetTableTableInfoEffectivePredictiveOptimizationFlagArgs? EffectivePredictiveOptimizationFlag { get; set; }

        [Input("enablePredictiveOptimization")]
        public string? EnablePredictiveOptimization { get; set; }

        [Input("encryptionDetails")]
        public Inputs.GetTableTableInfoEncryptionDetailsArgs? EncryptionDetails { get; set; }

        [Input("fullName")]
        public string? FullName { get; set; }

        [Input("metastoreId")]
        public string? MetastoreId { get; set; }

        /// <summary>
        /// Full name of the databricks_table: _`catalog`.`schema`.`table`_
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Current owner of the table
        /// </summary>
        [Input("owner")]
        public string? Owner { get; set; }

        [Input("pipelineId")]
        public string? PipelineId { get; set; }

        [Input("properties")]
        private Dictionary<string, object>? _properties;
        public Dictionary<string, object> Properties
        {
            get => _properties ?? (_properties = new Dictionary<string, object>());
            set => _properties = value;
        }

        [Input("rowFilter")]
        public Inputs.GetTableTableInfoRowFilterArgs? RowFilter { get; set; }

        /// <summary>
        /// Name of parent schema relative to its parent catalog.
        /// </summary>
        [Input("schemaName")]
        public string? SchemaName { get; set; }

        [Input("sqlPath")]
        public string? SqlPath { get; set; }

        [Input("storageCredentialName")]
        public string? StorageCredentialName { get; set; }

        [Input("storageLocation")]
        public string? StorageLocation { get; set; }

        [Input("tableConstraints")]
        private List<Inputs.GetTableTableInfoTableConstraintArgs>? _tableConstraints;
        public List<Inputs.GetTableTableInfoTableConstraintArgs> TableConstraints
        {
            get => _tableConstraints ?? (_tableConstraints = new List<Inputs.GetTableTableInfoTableConstraintArgs>());
            set => _tableConstraints = value;
        }

        [Input("tableId")]
        public string? TableId { get; set; }

        /// <summary>
        /// Table type, e.g. MANAGED, EXTERNAL, VIEW
        /// </summary>
        [Input("tableType")]
        public string? TableType { get; set; }

        [Input("updatedAt")]
        public int? UpdatedAt { get; set; }

        [Input("updatedBy")]
        public string? UpdatedBy { get; set; }

        /// <summary>
        /// View definition SQL (when `table_type` is VIEW, MATERIALIZED_VIEW, or STREAMING_TABLE)
        /// </summary>
        [Input("viewDefinition")]
        public string? ViewDefinition { get; set; }

        /// <summary>
        /// View dependencies (when `table_type` is VIEW or MATERIALIZED_VIEW, STREAMING_TABLE)
        /// </summary>
        [Input("viewDependencies")]
        public Inputs.GetTableTableInfoViewDependenciesArgs? ViewDependencies { get; set; }

        public GetTableTableInfoArgs()
        {
        }
        public static new GetTableTableInfoArgs Empty => new GetTableTableInfoArgs();
    }
}
