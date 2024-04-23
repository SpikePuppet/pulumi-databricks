// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ModelServingConfigServedEntityExternalModelPalmConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingConfigServedEntityExternalModelPalmConfigArgs Empty = new ModelServingConfigServedEntityExternalModelPalmConfigArgs();

    @Import(name="palmApiKey", required=true)
    private Output<String> palmApiKey;

    public Output<String> palmApiKey() {
        return this.palmApiKey;
    }

    private ModelServingConfigServedEntityExternalModelPalmConfigArgs() {}

    private ModelServingConfigServedEntityExternalModelPalmConfigArgs(ModelServingConfigServedEntityExternalModelPalmConfigArgs $) {
        this.palmApiKey = $.palmApiKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingConfigServedEntityExternalModelPalmConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingConfigServedEntityExternalModelPalmConfigArgs $;

        public Builder() {
            $ = new ModelServingConfigServedEntityExternalModelPalmConfigArgs();
        }

        public Builder(ModelServingConfigServedEntityExternalModelPalmConfigArgs defaults) {
            $ = new ModelServingConfigServedEntityExternalModelPalmConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder palmApiKey(Output<String> palmApiKey) {
            $.palmApiKey = palmApiKey;
            return this;
        }

        public Builder palmApiKey(String palmApiKey) {
            return palmApiKey(Output.of(palmApiKey));
        }

        public ModelServingConfigServedEntityExternalModelPalmConfigArgs build() {
            if ($.palmApiKey == null) {
                throw new MissingRequiredPropertyException("ModelServingConfigServedEntityExternalModelPalmConfigArgs", "palmApiKey");
            }
            return $;
        }
    }

}
