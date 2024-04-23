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
    /// This resource allows you to manage [Model Serving](https://docs.databricks.com/machine-learning/model-serving/index.html) endpoints in Databricks.
    /// 
    /// **Note** If you replace `served_models` with `served_entities` in an existing serving endpoint, the serving endpoint will briefly go into an update state (~30 seconds) and increment the config version.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @this = new Databricks.ModelServing("this", new()
    ///     {
    ///         Name = "ads-serving-endpoint",
    ///         Config = new Databricks.Inputs.ModelServingConfigArgs
    ///         {
    ///             ServedEntities = new[]
    ///             {
    ///                 new Databricks.Inputs.ModelServingConfigServedEntityArgs
    ///                 {
    ///                     Name = "prod_model",
    ///                     EntityName = "ads-model",
    ///                     EntityVersion = "2",
    ///                     WorkloadSize = "Small",
    ///                     ScaleToZeroEnabled = true,
    ///                 },
    ///                 new Databricks.Inputs.ModelServingConfigServedEntityArgs
    ///                 {
    ///                     Name = "candidate_model",
    ///                     EntityName = "ads-model",
    ///                     EntityVersion = "4",
    ///                     WorkloadSize = "Small",
    ///                     ScaleToZeroEnabled = false,
    ///                 },
    ///             },
    ///             TrafficConfig = new Databricks.Inputs.ModelServingConfigTrafficConfigArgs
    ///             {
    ///                 Routes = new[]
    ///                 {
    ///                     new Databricks.Inputs.ModelServingConfigTrafficConfigRouteArgs
    ///                     {
    ///                         ServedModelName = "prod_model",
    ///                         TrafficPercentage = 90,
    ///                     },
    ///                     new Databricks.Inputs.ModelServingConfigTrafficConfigRouteArgs
    ///                     {
    ///                         ServedModelName = "candidate_model",
    ///                         TrafficPercentage = 10,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Access Control
    /// 
    /// * databricks.Permissions can control which groups or individual users can *Manage*, *Query* or *View* individual serving endpoints.
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * databricks.RegisteredModel to create [Models in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.
    /// * End to end workspace management guide.
    /// * databricks.Directory to manage directories in [Databricks Workspace](https://docs.databricks.com/workspace/workspace-objects.html).
    /// * databricks.MlflowModel to create models in the [workspace model registry](https://docs.databricks.com/en/mlflow/model-registry.html) in Databricks.
    /// * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
    /// * databricks.Notebook data to export a notebook from Databricks Workspace.
    /// * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
    /// 
    /// ## Import
    /// 
    /// The model serving resource can be imported using the name of the endpoint.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/modelServing:ModelServing this &lt;model-serving-endpoint-name&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/modelServing:ModelServing")]
    public partial class ModelServing : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The model serving endpoint configuration.
        /// </summary>
        [Output("config")]
        public Output<Outputs.ModelServingConfig> Config { get; private set; } = null!;

        /// <summary>
        /// The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of rate limits to be applied to the serving endpoint. NOTE: only external and foundation model endpoints are supported as of now.
        /// </summary>
        [Output("rateLimits")]
        public Output<ImmutableArray<Outputs.ModelServingRateLimit>> RateLimits { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
        /// </summary>
        [Output("servingEndpointId")]
        public Output<string> ServingEndpointId { get; private set; } = null!;

        /// <summary>
        /// Tags to be attached to the serving endpoint and automatically propagated to billing logs.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.ModelServingTag>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a ModelServing resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ModelServing(string name, ModelServingArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/modelServing:ModelServing", name, args ?? new ModelServingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ModelServing(string name, Input<string> id, ModelServingState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/modelServing:ModelServing", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ModelServing resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ModelServing Get(string name, Input<string> id, ModelServingState? state = null, CustomResourceOptions? options = null)
        {
            return new ModelServing(name, id, state, options);
        }
    }

    public sealed class ModelServingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The model serving endpoint configuration.
        /// </summary>
        [Input("config", required: true)]
        public Input<Inputs.ModelServingConfigArgs> Config { get; set; } = null!;

        /// <summary>
        /// The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("rateLimits")]
        private InputList<Inputs.ModelServingRateLimitArgs>? _rateLimits;

        /// <summary>
        /// A list of rate limits to be applied to the serving endpoint. NOTE: only external and foundation model endpoints are supported as of now.
        /// </summary>
        public InputList<Inputs.ModelServingRateLimitArgs> RateLimits
        {
            get => _rateLimits ?? (_rateLimits = new InputList<Inputs.ModelServingRateLimitArgs>());
            set => _rateLimits = value;
        }

        [Input("tags")]
        private InputList<Inputs.ModelServingTagArgs>? _tags;

        /// <summary>
        /// Tags to be attached to the serving endpoint and automatically propagated to billing logs.
        /// </summary>
        public InputList<Inputs.ModelServingTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ModelServingTagArgs>());
            set => _tags = value;
        }

        public ModelServingArgs()
        {
        }
        public static new ModelServingArgs Empty => new ModelServingArgs();
    }

    public sealed class ModelServingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The model serving endpoint configuration.
        /// </summary>
        [Input("config")]
        public Input<Inputs.ModelServingConfigGetArgs>? Config { get; set; }

        /// <summary>
        /// The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("rateLimits")]
        private InputList<Inputs.ModelServingRateLimitGetArgs>? _rateLimits;

        /// <summary>
        /// A list of rate limits to be applied to the serving endpoint. NOTE: only external and foundation model endpoints are supported as of now.
        /// </summary>
        public InputList<Inputs.ModelServingRateLimitGetArgs> RateLimits
        {
            get => _rateLimits ?? (_rateLimits = new InputList<Inputs.ModelServingRateLimitGetArgs>());
            set => _rateLimits = value;
        }

        /// <summary>
        /// Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
        /// </summary>
        [Input("servingEndpointId")]
        public Input<string>? ServingEndpointId { get; set; }

        [Input("tags")]
        private InputList<Inputs.ModelServingTagGetArgs>? _tags;

        /// <summary>
        /// Tags to be attached to the serving endpoint and automatically propagated to billing logs.
        /// </summary>
        public InputList<Inputs.ModelServingTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ModelServingTagGetArgs>());
            set => _tags = value;
        }

        public ModelServingState()
        {
        }
        public static new ModelServingState Empty => new ModelServingState();
    }
}
