// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ModelServingConfigServedEntityExternalModelAi21labsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingConfigServedEntityExternalModelAi21labsConfigArgs Empty = new ModelServingConfigServedEntityExternalModelAi21labsConfigArgs();

    /**
     * The Databricks secret key reference for an AI21Labs API key.
     * 
     */
    @Import(name="ai21labsApiKey", required=true)
    private Output<String> ai21labsApiKey;

    /**
     * @return The Databricks secret key reference for an AI21Labs API key.
     * 
     */
    public Output<String> ai21labsApiKey() {
        return this.ai21labsApiKey;
    }

    private ModelServingConfigServedEntityExternalModelAi21labsConfigArgs() {}

    private ModelServingConfigServedEntityExternalModelAi21labsConfigArgs(ModelServingConfigServedEntityExternalModelAi21labsConfigArgs $) {
        this.ai21labsApiKey = $.ai21labsApiKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingConfigServedEntityExternalModelAi21labsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingConfigServedEntityExternalModelAi21labsConfigArgs $;

        public Builder() {
            $ = new ModelServingConfigServedEntityExternalModelAi21labsConfigArgs();
        }

        public Builder(ModelServingConfigServedEntityExternalModelAi21labsConfigArgs defaults) {
            $ = new ModelServingConfigServedEntityExternalModelAi21labsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ai21labsApiKey The Databricks secret key reference for an AI21Labs API key.
         * 
         * @return builder
         * 
         */
        public Builder ai21labsApiKey(Output<String> ai21labsApiKey) {
            $.ai21labsApiKey = ai21labsApiKey;
            return this;
        }

        /**
         * @param ai21labsApiKey The Databricks secret key reference for an AI21Labs API key.
         * 
         * @return builder
         * 
         */
        public Builder ai21labsApiKey(String ai21labsApiKey) {
            return ai21labsApiKey(Output.of(ai21labsApiKey));
        }

        public ModelServingConfigServedEntityExternalModelAi21labsConfigArgs build() {
            if ($.ai21labsApiKey == null) {
                throw new MissingRequiredPropertyException("ModelServingConfigServedEntityExternalModelAi21labsConfigArgs", "ai21labsApiKey");
            }
            return $;
        }
    }

}
