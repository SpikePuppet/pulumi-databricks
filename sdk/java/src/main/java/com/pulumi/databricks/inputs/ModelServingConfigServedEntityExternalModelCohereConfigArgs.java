// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ModelServingConfigServedEntityExternalModelCohereConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingConfigServedEntityExternalModelCohereConfigArgs Empty = new ModelServingConfigServedEntityExternalModelCohereConfigArgs();

    /**
     * The Databricks secret key reference for a Cohere API key.
     * 
     */
    @Import(name="cohereApiKey", required=true)
    private Output<String> cohereApiKey;

    /**
     * @return The Databricks secret key reference for a Cohere API key.
     * 
     */
    public Output<String> cohereApiKey() {
        return this.cohereApiKey;
    }

    private ModelServingConfigServedEntityExternalModelCohereConfigArgs() {}

    private ModelServingConfigServedEntityExternalModelCohereConfigArgs(ModelServingConfigServedEntityExternalModelCohereConfigArgs $) {
        this.cohereApiKey = $.cohereApiKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingConfigServedEntityExternalModelCohereConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingConfigServedEntityExternalModelCohereConfigArgs $;

        public Builder() {
            $ = new ModelServingConfigServedEntityExternalModelCohereConfigArgs();
        }

        public Builder(ModelServingConfigServedEntityExternalModelCohereConfigArgs defaults) {
            $ = new ModelServingConfigServedEntityExternalModelCohereConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cohereApiKey The Databricks secret key reference for a Cohere API key.
         * 
         * @return builder
         * 
         */
        public Builder cohereApiKey(Output<String> cohereApiKey) {
            $.cohereApiKey = cohereApiKey;
            return this;
        }

        /**
         * @param cohereApiKey The Databricks secret key reference for a Cohere API key.
         * 
         * @return builder
         * 
         */
        public Builder cohereApiKey(String cohereApiKey) {
            return cohereApiKey(Output.of(cohereApiKey));
        }

        public ModelServingConfigServedEntityExternalModelCohereConfigArgs build() {
            if ($.cohereApiKey == null) {
                throw new MissingRequiredPropertyException("ModelServingConfigServedEntityExternalModelCohereConfigArgs", "cohereApiKey");
            }
            return $;
        }
    }

}