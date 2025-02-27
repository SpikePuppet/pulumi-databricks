// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ModelServingConfigServedEntityExternalModelAnthropicConfig {
    private String anthropicApiKey;

    private ModelServingConfigServedEntityExternalModelAnthropicConfig() {}
    public String anthropicApiKey() {
        return this.anthropicApiKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelServingConfigServedEntityExternalModelAnthropicConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String anthropicApiKey;
        public Builder() {}
        public Builder(ModelServingConfigServedEntityExternalModelAnthropicConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anthropicApiKey = defaults.anthropicApiKey;
        }

        @CustomType.Setter
        public Builder anthropicApiKey(String anthropicApiKey) {
            if (anthropicApiKey == null) {
              throw new MissingRequiredPropertyException("ModelServingConfigServedEntityExternalModelAnthropicConfig", "anthropicApiKey");
            }
            this.anthropicApiKey = anthropicApiKey;
            return this;
        }
        public ModelServingConfigServedEntityExternalModelAnthropicConfig build() {
            final var _resultValue = new ModelServingConfigServedEntityExternalModelAnthropicConfig();
            _resultValue.anthropicApiKey = anthropicApiKey;
            return _resultValue;
        }
    }
}
