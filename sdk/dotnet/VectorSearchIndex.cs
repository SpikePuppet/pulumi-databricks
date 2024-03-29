// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// &gt; **Note** This resource could be only used on Unity Catalog-enabled workspace!
    /// 
    /// This resource allows you to create [Vector Search Index](https://docs.databricks.com/en/generative-ai/create-query-vector-search.html) in Databricks.  Vector Search is a serverless similarity search engine that allows you to store a vector representation of your data, including metadata, in a vector database.  The Vector Search Index provides the ability to search data in the linked Delta Table.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var sync = new Databricks.VectorSearchIndex("sync", new()
    ///     {
    ///         EndpointName = databricks_vector_search_endpoint.This.Name,
    ///         PrimaryKey = "id",
    ///         IndexType = "DELTA_SYNC",
    ///         DeltaSyncIndexSpec = new Databricks.Inputs.VectorSearchIndexDeltaSyncIndexSpecArgs
    ///         {
    ///             SourceTable = "main.default.source_table",
    ///             PipelineType = "TRIGGERED",
    ///             EmbeddingSourceColumns = new[]
    ///             {
    ///                 new Databricks.Inputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs
    ///                 {
    ///                     Name = "text",
    ///                     EmbeddingModelEndpointName = databricks_model_serving.This.Name,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// The resource can be imported using the name of the Vector Search Index
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/vectorSearchIndex:VectorSearchIndex this &lt;index-name&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/vectorSearchIndex:VectorSearchIndex")]
    public partial class VectorSearchIndex : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Creator of the endpoint.
        /// </summary>
        [Output("creator")]
        public Output<string> Creator { get; private set; } = null!;

        /// <summary>
        /// Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`.
        /// </summary>
        [Output("deltaSyncIndexSpec")]
        public Output<Outputs.VectorSearchIndexDeltaSyncIndexSpec?> DeltaSyncIndexSpec { get; private set; } = null!;

        /// <summary>
        /// Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`.
        /// </summary>
        [Output("directAccessIndexSpec")]
        public Output<Outputs.VectorSearchIndexDirectAccessIndexSpec?> DirectAccessIndexSpec { get; private set; } = null!;

        /// <summary>
        /// The name of the Vector Search Endpoint that will be used for indexing the data.
        /// </summary>
        [Output("endpointName")]
        public Output<string> EndpointName { get; private set; } = null!;

        /// <summary>
        /// Vector Search index type. Currently supported values are:
        /// </summary>
        [Output("indexType")]
        public Output<string> IndexType { get; private set; } = null!;

        /// <summary>
        /// The name of the column.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The column name that will be used as a primary key.
        /// </summary>
        [Output("primaryKey")]
        public Output<string> PrimaryKey { get; private set; } = null!;

        /// <summary>
        /// Object describing the current status of the index consisting of the following fields:
        /// </summary>
        [Output("statuses")]
        public Output<ImmutableArray<Outputs.VectorSearchIndexStatus>> Statuses { get; private set; } = null!;


        /// <summary>
        /// Create a VectorSearchIndex resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VectorSearchIndex(string name, VectorSearchIndexArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/vectorSearchIndex:VectorSearchIndex", name, args ?? new VectorSearchIndexArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VectorSearchIndex(string name, Input<string> id, VectorSearchIndexState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/vectorSearchIndex:VectorSearchIndex", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing VectorSearchIndex resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VectorSearchIndex Get(string name, Input<string> id, VectorSearchIndexState? state = null, CustomResourceOptions? options = null)
        {
            return new VectorSearchIndex(name, id, state, options);
        }
    }

    public sealed class VectorSearchIndexArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`.
        /// </summary>
        [Input("deltaSyncIndexSpec")]
        public Input<Inputs.VectorSearchIndexDeltaSyncIndexSpecArgs>? DeltaSyncIndexSpec { get; set; }

        /// <summary>
        /// Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`.
        /// </summary>
        [Input("directAccessIndexSpec")]
        public Input<Inputs.VectorSearchIndexDirectAccessIndexSpecArgs>? DirectAccessIndexSpec { get; set; }

        /// <summary>
        /// The name of the Vector Search Endpoint that will be used for indexing the data.
        /// </summary>
        [Input("endpointName", required: true)]
        public Input<string> EndpointName { get; set; } = null!;

        /// <summary>
        /// Vector Search index type. Currently supported values are:
        /// </summary>
        [Input("indexType", required: true)]
        public Input<string> IndexType { get; set; } = null!;

        /// <summary>
        /// The name of the column.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The column name that will be used as a primary key.
        /// </summary>
        [Input("primaryKey", required: true)]
        public Input<string> PrimaryKey { get; set; } = null!;

        public VectorSearchIndexArgs()
        {
        }
        public static new VectorSearchIndexArgs Empty => new VectorSearchIndexArgs();
    }

    public sealed class VectorSearchIndexState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Creator of the endpoint.
        /// </summary>
        [Input("creator")]
        public Input<string>? Creator { get; set; }

        /// <summary>
        /// Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`.
        /// </summary>
        [Input("deltaSyncIndexSpec")]
        public Input<Inputs.VectorSearchIndexDeltaSyncIndexSpecGetArgs>? DeltaSyncIndexSpec { get; set; }

        /// <summary>
        /// Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`.
        /// </summary>
        [Input("directAccessIndexSpec")]
        public Input<Inputs.VectorSearchIndexDirectAccessIndexSpecGetArgs>? DirectAccessIndexSpec { get; set; }

        /// <summary>
        /// The name of the Vector Search Endpoint that will be used for indexing the data.
        /// </summary>
        [Input("endpointName")]
        public Input<string>? EndpointName { get; set; }

        /// <summary>
        /// Vector Search index type. Currently supported values are:
        /// </summary>
        [Input("indexType")]
        public Input<string>? IndexType { get; set; }

        /// <summary>
        /// The name of the column.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The column name that will be used as a primary key.
        /// </summary>
        [Input("primaryKey")]
        public Input<string>? PrimaryKey { get; set; }

        [Input("statuses")]
        private InputList<Inputs.VectorSearchIndexStatusGetArgs>? _statuses;

        /// <summary>
        /// Object describing the current status of the index consisting of the following fields:
        /// </summary>
        public InputList<Inputs.VectorSearchIndexStatusGetArgs> Statuses
        {
            get => _statuses ?? (_statuses = new InputList<Inputs.VectorSearchIndexStatusGetArgs>());
            set => _statuses = value;
        }

        public VectorSearchIndexState()
        {
        }
        public static new VectorSearchIndexState Empty => new VectorSearchIndexState();
    }
}
