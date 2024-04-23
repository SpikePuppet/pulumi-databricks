// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.ModelServingConfigServedEntityExternalModelAi21labsConfigArgs;
import com.pulumi.databricks.inputs.ModelServingConfigServedEntityExternalModelAmazonBedrockConfigArgs;
import com.pulumi.databricks.inputs.ModelServingConfigServedEntityExternalModelAnthropicConfigArgs;
import com.pulumi.databricks.inputs.ModelServingConfigServedEntityExternalModelCohereConfigArgs;
import com.pulumi.databricks.inputs.ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs;
import com.pulumi.databricks.inputs.ModelServingConfigServedEntityExternalModelOpenaiConfigArgs;
import com.pulumi.databricks.inputs.ModelServingConfigServedEntityExternalModelPalmConfigArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelServingConfigServedEntityExternalModelArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingConfigServedEntityExternalModelArgs Empty = new ModelServingConfigServedEntityExternalModelArgs();

    /**
     * AI21Labs Config
     * 
     */
    @Import(name="ai21labsConfig")
    private @Nullable Output<ModelServingConfigServedEntityExternalModelAi21labsConfigArgs> ai21labsConfig;

    /**
     * @return AI21Labs Config
     * 
     */
    public Optional<Output<ModelServingConfigServedEntityExternalModelAi21labsConfigArgs>> ai21labsConfig() {
        return Optional.ofNullable(this.ai21labsConfig);
    }

    /**
     * Amazon Bedrock Config
     * 
     */
    @Import(name="amazonBedrockConfig")
    private @Nullable Output<ModelServingConfigServedEntityExternalModelAmazonBedrockConfigArgs> amazonBedrockConfig;

    /**
     * @return Amazon Bedrock Config
     * 
     */
    public Optional<Output<ModelServingConfigServedEntityExternalModelAmazonBedrockConfigArgs>> amazonBedrockConfig() {
        return Optional.ofNullable(this.amazonBedrockConfig);
    }

    /**
     * Anthropic Config
     * 
     */
    @Import(name="anthropicConfig")
    private @Nullable Output<ModelServingConfigServedEntityExternalModelAnthropicConfigArgs> anthropicConfig;

    /**
     * @return Anthropic Config
     * 
     */
    public Optional<Output<ModelServingConfigServedEntityExternalModelAnthropicConfigArgs>> anthropicConfig() {
        return Optional.ofNullable(this.anthropicConfig);
    }

    /**
     * Cohere Config
     * 
     */
    @Import(name="cohereConfig")
    private @Nullable Output<ModelServingConfigServedEntityExternalModelCohereConfigArgs> cohereConfig;

    /**
     * @return Cohere Config
     * 
     */
    public Optional<Output<ModelServingConfigServedEntityExternalModelCohereConfigArgs>> cohereConfig() {
        return Optional.ofNullable(this.cohereConfig);
    }

    /**
     * Databricks Model Serving Config
     * 
     */
    @Import(name="databricksModelServingConfig")
    private @Nullable Output<ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs> databricksModelServingConfig;

    /**
     * @return Databricks Model Serving Config
     * 
     */
    public Optional<Output<ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs>> databricksModelServingConfig() {
        return Optional.ofNullable(this.databricksModelServingConfig);
    }

    /**
     * The name of the external model.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the external model.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * OpenAI Config
     * 
     */
    @Import(name="openaiConfig")
    private @Nullable Output<ModelServingConfigServedEntityExternalModelOpenaiConfigArgs> openaiConfig;

    /**
     * @return OpenAI Config
     * 
     */
    public Optional<Output<ModelServingConfigServedEntityExternalModelOpenaiConfigArgs>> openaiConfig() {
        return Optional.ofNullable(this.openaiConfig);
    }

    /**
     * PaLM Config
     * 
     */
    @Import(name="palmConfig")
    private @Nullable Output<ModelServingConfigServedEntityExternalModelPalmConfigArgs> palmConfig;

    /**
     * @return PaLM Config
     * 
     */
    public Optional<Output<ModelServingConfigServedEntityExternalModelPalmConfigArgs>> palmConfig() {
        return Optional.ofNullable(this.palmConfig);
    }

    /**
     * The name of the provider for the external model. Currently, the supported providers are `ai21labs`, `anthropic`, `amazon-bedrock`, `cohere`, `databricks-model-serving`, `openai`, and `palm`.
     * 
     */
    @Import(name="provider", required=true)
    private Output<String> provider;

    /**
     * @return The name of the provider for the external model. Currently, the supported providers are `ai21labs`, `anthropic`, `amazon-bedrock`, `cohere`, `databricks-model-serving`, `openai`, and `palm`.
     * 
     */
    public Output<String> provider() {
        return this.provider;
    }

    /**
     * The task type of the external model.
     * 
     */
    @Import(name="task", required=true)
    private Output<String> task;

    /**
     * @return The task type of the external model.
     * 
     */
    public Output<String> task() {
        return this.task;
    }

    private ModelServingConfigServedEntityExternalModelArgs() {}

    private ModelServingConfigServedEntityExternalModelArgs(ModelServingConfigServedEntityExternalModelArgs $) {
        this.ai21labsConfig = $.ai21labsConfig;
        this.amazonBedrockConfig = $.amazonBedrockConfig;
        this.anthropicConfig = $.anthropicConfig;
        this.cohereConfig = $.cohereConfig;
        this.databricksModelServingConfig = $.databricksModelServingConfig;
        this.name = $.name;
        this.openaiConfig = $.openaiConfig;
        this.palmConfig = $.palmConfig;
        this.provider = $.provider;
        this.task = $.task;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingConfigServedEntityExternalModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingConfigServedEntityExternalModelArgs $;

        public Builder() {
            $ = new ModelServingConfigServedEntityExternalModelArgs();
        }

        public Builder(ModelServingConfigServedEntityExternalModelArgs defaults) {
            $ = new ModelServingConfigServedEntityExternalModelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ai21labsConfig AI21Labs Config
         * 
         * @return builder
         * 
         */
        public Builder ai21labsConfig(@Nullable Output<ModelServingConfigServedEntityExternalModelAi21labsConfigArgs> ai21labsConfig) {
            $.ai21labsConfig = ai21labsConfig;
            return this;
        }

        /**
         * @param ai21labsConfig AI21Labs Config
         * 
         * @return builder
         * 
         */
        public Builder ai21labsConfig(ModelServingConfigServedEntityExternalModelAi21labsConfigArgs ai21labsConfig) {
            return ai21labsConfig(Output.of(ai21labsConfig));
        }

        /**
         * @param amazonBedrockConfig Amazon Bedrock Config
         * 
         * @return builder
         * 
         */
        public Builder amazonBedrockConfig(@Nullable Output<ModelServingConfigServedEntityExternalModelAmazonBedrockConfigArgs> amazonBedrockConfig) {
            $.amazonBedrockConfig = amazonBedrockConfig;
            return this;
        }

        /**
         * @param amazonBedrockConfig Amazon Bedrock Config
         * 
         * @return builder
         * 
         */
        public Builder amazonBedrockConfig(ModelServingConfigServedEntityExternalModelAmazonBedrockConfigArgs amazonBedrockConfig) {
            return amazonBedrockConfig(Output.of(amazonBedrockConfig));
        }

        /**
         * @param anthropicConfig Anthropic Config
         * 
         * @return builder
         * 
         */
        public Builder anthropicConfig(@Nullable Output<ModelServingConfigServedEntityExternalModelAnthropicConfigArgs> anthropicConfig) {
            $.anthropicConfig = anthropicConfig;
            return this;
        }

        /**
         * @param anthropicConfig Anthropic Config
         * 
         * @return builder
         * 
         */
        public Builder anthropicConfig(ModelServingConfigServedEntityExternalModelAnthropicConfigArgs anthropicConfig) {
            return anthropicConfig(Output.of(anthropicConfig));
        }

        /**
         * @param cohereConfig Cohere Config
         * 
         * @return builder
         * 
         */
        public Builder cohereConfig(@Nullable Output<ModelServingConfigServedEntityExternalModelCohereConfigArgs> cohereConfig) {
            $.cohereConfig = cohereConfig;
            return this;
        }

        /**
         * @param cohereConfig Cohere Config
         * 
         * @return builder
         * 
         */
        public Builder cohereConfig(ModelServingConfigServedEntityExternalModelCohereConfigArgs cohereConfig) {
            return cohereConfig(Output.of(cohereConfig));
        }

        /**
         * @param databricksModelServingConfig Databricks Model Serving Config
         * 
         * @return builder
         * 
         */
        public Builder databricksModelServingConfig(@Nullable Output<ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs> databricksModelServingConfig) {
            $.databricksModelServingConfig = databricksModelServingConfig;
            return this;
        }

        /**
         * @param databricksModelServingConfig Databricks Model Serving Config
         * 
         * @return builder
         * 
         */
        public Builder databricksModelServingConfig(ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs databricksModelServingConfig) {
            return databricksModelServingConfig(Output.of(databricksModelServingConfig));
        }

        /**
         * @param name The name of the external model.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the external model.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param openaiConfig OpenAI Config
         * 
         * @return builder
         * 
         */
        public Builder openaiConfig(@Nullable Output<ModelServingConfigServedEntityExternalModelOpenaiConfigArgs> openaiConfig) {
            $.openaiConfig = openaiConfig;
            return this;
        }

        /**
         * @param openaiConfig OpenAI Config
         * 
         * @return builder
         * 
         */
        public Builder openaiConfig(ModelServingConfigServedEntityExternalModelOpenaiConfigArgs openaiConfig) {
            return openaiConfig(Output.of(openaiConfig));
        }

        /**
         * @param palmConfig PaLM Config
         * 
         * @return builder
         * 
         */
        public Builder palmConfig(@Nullable Output<ModelServingConfigServedEntityExternalModelPalmConfigArgs> palmConfig) {
            $.palmConfig = palmConfig;
            return this;
        }

        /**
         * @param palmConfig PaLM Config
         * 
         * @return builder
         * 
         */
        public Builder palmConfig(ModelServingConfigServedEntityExternalModelPalmConfigArgs palmConfig) {
            return palmConfig(Output.of(palmConfig));
        }

        /**
         * @param provider The name of the provider for the external model. Currently, the supported providers are `ai21labs`, `anthropic`, `amazon-bedrock`, `cohere`, `databricks-model-serving`, `openai`, and `palm`.
         * 
         * @return builder
         * 
         */
        public Builder provider(Output<String> provider) {
            $.provider = provider;
            return this;
        }

        /**
         * @param provider The name of the provider for the external model. Currently, the supported providers are `ai21labs`, `anthropic`, `amazon-bedrock`, `cohere`, `databricks-model-serving`, `openai`, and `palm`.
         * 
         * @return builder
         * 
         */
        public Builder provider(String provider) {
            return provider(Output.of(provider));
        }

        /**
         * @param task The task type of the external model.
         * 
         * @return builder
         * 
         */
        public Builder task(Output<String> task) {
            $.task = task;
            return this;
        }

        /**
         * @param task The task type of the external model.
         * 
         * @return builder
         * 
         */
        public Builder task(String task) {
            return task(Output.of(task));
        }

        public ModelServingConfigServedEntityExternalModelArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ModelServingConfigServedEntityExternalModelArgs", "name");
            }
            if ($.provider == null) {
                throw new MissingRequiredPropertyException("ModelServingConfigServedEntityExternalModelArgs", "provider");
            }
            if ($.task == null) {
                throw new MissingRequiredPropertyException("ModelServingConfigServedEntityExternalModelArgs", "task");
            }
            return $;
        }
    }

}
