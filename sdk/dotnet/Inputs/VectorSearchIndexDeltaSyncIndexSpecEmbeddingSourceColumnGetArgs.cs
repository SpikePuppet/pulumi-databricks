// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("embeddingModelEndpointName")]
        public Input<string>? EmbeddingModelEndpointName { get; set; }

        /// <summary>
        /// Three-level name of the Vector Search Index to create (`catalog.schema.index_name`).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnGetArgs()
        {
        }
        public static new VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnGetArgs Empty => new VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnGetArgs();
    }
}
