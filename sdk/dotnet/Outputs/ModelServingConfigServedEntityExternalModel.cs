// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class ModelServingConfigServedEntityExternalModel
    {
        /// <summary>
        /// AI21Labs Config
        /// </summary>
        public readonly Outputs.ModelServingConfigServedEntityExternalModelAi21labsConfig? Ai21labsConfig;
        /// <summary>
        /// Amazon Bedrock Config
        /// </summary>
        public readonly Outputs.ModelServingConfigServedEntityExternalModelAmazonBedrockConfig? AmazonBedrockConfig;
        /// <summary>
        /// Anthropic Config
        /// </summary>
        public readonly Outputs.ModelServingConfigServedEntityExternalModelAnthropicConfig? AnthropicConfig;
        /// <summary>
        /// Cohere Config
        /// </summary>
        public readonly Outputs.ModelServingConfigServedEntityExternalModelCohereConfig? CohereConfig;
        /// <summary>
        /// Databricks Model Serving Config
        /// </summary>
        public readonly Outputs.ModelServingConfigServedEntityExternalModelDatabricksModelServingConfig? DatabricksModelServingConfig;
        /// <summary>
        /// The name of the external model.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// OpenAI Config
        /// </summary>
        public readonly Outputs.ModelServingConfigServedEntityExternalModelOpenaiConfig? OpenaiConfig;
        /// <summary>
        /// PaLM Config
        /// </summary>
        public readonly Outputs.ModelServingConfigServedEntityExternalModelPalmConfig? PalmConfig;
        /// <summary>
        /// The name of the provider for the external model. Currently, the supported providers are `ai21labs`, `anthropic`, `amazon-bedrock`, `cohere`, `databricks-model-serving`, `openai`, and `palm`.
        /// </summary>
        public readonly string Provider;
        /// <summary>
        /// The task type of the external model.
        /// </summary>
        public readonly string Task;

        [OutputConstructor]
        private ModelServingConfigServedEntityExternalModel(
            Outputs.ModelServingConfigServedEntityExternalModelAi21labsConfig? ai21labsConfig,

            Outputs.ModelServingConfigServedEntityExternalModelAmazonBedrockConfig? amazonBedrockConfig,

            Outputs.ModelServingConfigServedEntityExternalModelAnthropicConfig? anthropicConfig,

            Outputs.ModelServingConfigServedEntityExternalModelCohereConfig? cohereConfig,

            Outputs.ModelServingConfigServedEntityExternalModelDatabricksModelServingConfig? databricksModelServingConfig,

            string name,

            Outputs.ModelServingConfigServedEntityExternalModelOpenaiConfig? openaiConfig,

            Outputs.ModelServingConfigServedEntityExternalModelPalmConfig? palmConfig,

            string provider,

            string task)
        {
            Ai21labsConfig = ai21labsConfig;
            AmazonBedrockConfig = amazonBedrockConfig;
            AnthropicConfig = anthropicConfig;
            CohereConfig = cohereConfig;
            DatabricksModelServingConfig = databricksModelServingConfig;
            Name = name;
            OpenaiConfig = openaiConfig;
            PalmConfig = palmConfig;
            Provider = provider;
            Task = task;
        }
    }
}
