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
    /// This resource allows you to create [Vector Search Endpoint](https://docs.databricks.com/en/generative-ai/vector-search.html) in Databricks.  Vector Search is a serverless similarity search engine that allows you to store a vector representation of your data, including metadata, in a vector database.  The Vector Search Endpoint is used to create and access vector search indexes.
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
    ///     var @this = new Databricks.VectorSearchEndpoint("this", new()
    ///     {
    ///         Name = "vector-search-test",
    ///         EndpointType = "STANDARD",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// The resource can be imported using the name of the Vector Search Endpoint
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/vectorSearchEndpoint:VectorSearchEndpoint this &lt;endpoint-name&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/vectorSearchEndpoint:VectorSearchEndpoint")]
    public partial class VectorSearchEndpoint : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Timestamp of endpoint creation (milliseconds).
        /// </summary>
        [Output("creationTimestamp")]
        public Output<int> CreationTimestamp { get; private set; } = null!;

        /// <summary>
        /// Creator of the endpoint.
        /// </summary>
        [Output("creator")]
        public Output<string> Creator { get; private set; } = null!;

        /// <summary>
        /// Unique internal identifier of the endpoint (UUID).
        /// </summary>
        [Output("endpointId")]
        public Output<string> EndpointId { get; private set; } = null!;

        /// <summary>
        /// Object describing the current status of the endpoint consisting of the following fields:
        /// </summary>
        [Output("endpointStatuses")]
        public Output<ImmutableArray<Outputs.VectorSearchEndpointEndpointStatus>> EndpointStatuses { get; private set; } = null!;

        /// <summary>
        /// Type of Vector Search Endpoint.  Currently only accepting single value: `STANDARD` (See [documentation](https://docs.databricks.com/api/workspace/vectorsearchendpoints/createendpoint) for the list of currently supported values).
        /// </summary>
        [Output("endpointType")]
        public Output<string> EndpointType { get; private set; } = null!;

        /// <summary>
        /// Timestamp of the last update to the endpoint (milliseconds).
        /// </summary>
        [Output("lastUpdatedTimestamp")]
        public Output<int> LastUpdatedTimestamp { get; private set; } = null!;

        /// <summary>
        /// User who last updated the endpoint.
        /// </summary>
        [Output("lastUpdatedUser")]
        public Output<string> LastUpdatedUser { get; private set; } = null!;

        /// <summary>
        /// Name of the Vector Search Endpoint to create.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Number of indexes on the endpoint.
        /// </summary>
        [Output("numIndexes")]
        public Output<int> NumIndexes { get; private set; } = null!;


        /// <summary>
        /// Create a VectorSearchEndpoint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VectorSearchEndpoint(string name, VectorSearchEndpointArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/vectorSearchEndpoint:VectorSearchEndpoint", name, args ?? new VectorSearchEndpointArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VectorSearchEndpoint(string name, Input<string> id, VectorSearchEndpointState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/vectorSearchEndpoint:VectorSearchEndpoint", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VectorSearchEndpoint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VectorSearchEndpoint Get(string name, Input<string> id, VectorSearchEndpointState? state = null, CustomResourceOptions? options = null)
        {
            return new VectorSearchEndpoint(name, id, state, options);
        }
    }

    public sealed class VectorSearchEndpointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of Vector Search Endpoint.  Currently only accepting single value: `STANDARD` (See [documentation](https://docs.databricks.com/api/workspace/vectorsearchendpoints/createendpoint) for the list of currently supported values).
        /// </summary>
        [Input("endpointType", required: true)]
        public Input<string> EndpointType { get; set; } = null!;

        /// <summary>
        /// Name of the Vector Search Endpoint to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public VectorSearchEndpointArgs()
        {
        }
        public static new VectorSearchEndpointArgs Empty => new VectorSearchEndpointArgs();
    }

    public sealed class VectorSearchEndpointState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Timestamp of endpoint creation (milliseconds).
        /// </summary>
        [Input("creationTimestamp")]
        public Input<int>? CreationTimestamp { get; set; }

        /// <summary>
        /// Creator of the endpoint.
        /// </summary>
        [Input("creator")]
        public Input<string>? Creator { get; set; }

        /// <summary>
        /// Unique internal identifier of the endpoint (UUID).
        /// </summary>
        [Input("endpointId")]
        public Input<string>? EndpointId { get; set; }

        [Input("endpointStatuses")]
        private InputList<Inputs.VectorSearchEndpointEndpointStatusGetArgs>? _endpointStatuses;

        /// <summary>
        /// Object describing the current status of the endpoint consisting of the following fields:
        /// </summary>
        public InputList<Inputs.VectorSearchEndpointEndpointStatusGetArgs> EndpointStatuses
        {
            get => _endpointStatuses ?? (_endpointStatuses = new InputList<Inputs.VectorSearchEndpointEndpointStatusGetArgs>());
            set => _endpointStatuses = value;
        }

        /// <summary>
        /// Type of Vector Search Endpoint.  Currently only accepting single value: `STANDARD` (See [documentation](https://docs.databricks.com/api/workspace/vectorsearchendpoints/createendpoint) for the list of currently supported values).
        /// </summary>
        [Input("endpointType")]
        public Input<string>? EndpointType { get; set; }

        /// <summary>
        /// Timestamp of the last update to the endpoint (milliseconds).
        /// </summary>
        [Input("lastUpdatedTimestamp")]
        public Input<int>? LastUpdatedTimestamp { get; set; }

        /// <summary>
        /// User who last updated the endpoint.
        /// </summary>
        [Input("lastUpdatedUser")]
        public Input<string>? LastUpdatedUser { get; set; }

        /// <summary>
        /// Name of the Vector Search Endpoint to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Number of indexes on the endpoint.
        /// </summary>
        [Input("numIndexes")]
        public Input<int>? NumIndexes { get; set; }

        public VectorSearchEndpointState()
        {
        }
        public static new VectorSearchEndpointState Empty => new VectorSearchEndpointState();
    }
}
