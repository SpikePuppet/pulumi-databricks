// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingConfigServedEntityExternalModelGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ai21labsConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelAi21labsConfigGetArgs>? Ai21labsConfig { get; set; }

        [Input("amazonBedrockConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelAmazonBedrockConfigGetArgs>? AmazonBedrockConfig { get; set; }

        [Input("anthropicConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelAnthropicConfigGetArgs>? AnthropicConfig { get; set; }

        [Input("cohereConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelCohereConfigGetArgs>? CohereConfig { get; set; }

        [Input("databricksModelServingConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigGetArgs>? DatabricksModelServingConfig { get; set; }

        /// <summary>
        /// The name of the external model.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("openaiConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelOpenaiConfigGetArgs>? OpenaiConfig { get; set; }

        [Input("palmConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelPalmConfigGetArgs>? PalmConfig { get; set; }

        /// <summary>
        /// The name of the provider for the external model. Currently, the supported providers are `ai21labs`, `anthropic`, `amazon-bedrock`, `cohere`, `databricks-model-serving`, `openai`, and `palm`.
        /// </summary>
        [Input("provider", required: true)]
        public Input<string> Provider { get; set; } = null!;

        /// <summary>
        /// The task type of the external model.
        /// </summary>
        [Input("task", required: true)]
        public Input<string> Task { get; set; } = null!;

        public ModelServingConfigServedEntityExternalModelGetArgs()
        {
        }
        public static new ModelServingConfigServedEntityExternalModelGetArgs Empty => new ModelServingConfigServedEntityExternalModelGetArgs();
    }
}
