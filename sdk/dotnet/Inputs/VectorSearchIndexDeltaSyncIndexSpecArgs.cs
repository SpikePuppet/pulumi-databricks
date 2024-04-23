// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class VectorSearchIndexDeltaSyncIndexSpecArgs : global::Pulumi.ResourceArgs
    {
        [Input("embeddingSourceColumns")]
        private InputList<Inputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs>? _embeddingSourceColumns;

        /// <summary>
        /// array of objects representing columns that contain the embedding source.  Each entry consists of:
        /// </summary>
        public InputList<Inputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs> EmbeddingSourceColumns
        {
            get => _embeddingSourceColumns ?? (_embeddingSourceColumns = new InputList<Inputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs>());
            set => _embeddingSourceColumns = value;
        }

        [Input("embeddingVectorColumns")]
        private InputList<Inputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumnArgs>? _embeddingVectorColumns;
        public InputList<Inputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumnArgs> EmbeddingVectorColumns
        {
            get => _embeddingVectorColumns ?? (_embeddingVectorColumns = new InputList<Inputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumnArgs>());
            set => _embeddingVectorColumns = value;
        }

        /// <summary>
        /// ID of the associated Delta Live Table pipeline.
        /// </summary>
        [Input("pipelineId")]
        public Input<string>? PipelineId { get; set; }

        [Input("pipelineType")]
        public Input<string>? PipelineType { get; set; }

        /// <summary>
        /// The name of the source table.
        /// </summary>
        [Input("sourceTable")]
        public Input<string>? SourceTable { get; set; }

        public VectorSearchIndexDeltaSyncIndexSpecArgs()
        {
        }
        public static new VectorSearchIndexDeltaSyncIndexSpecArgs Empty => new VectorSearchIndexDeltaSyncIndexSpecArgs();
    }
}
