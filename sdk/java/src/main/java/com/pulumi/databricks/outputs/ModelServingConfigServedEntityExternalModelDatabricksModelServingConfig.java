// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ModelServingConfigServedEntityExternalModelDatabricksModelServingConfig {
    private String databricksApiToken;
    private String databricksWorkspaceUrl;

    private ModelServingConfigServedEntityExternalModelDatabricksModelServingConfig() {}
    public String databricksApiToken() {
        return this.databricksApiToken;
    }
    public String databricksWorkspaceUrl() {
        return this.databricksWorkspaceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelServingConfigServedEntityExternalModelDatabricksModelServingConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String databricksApiToken;
        private String databricksWorkspaceUrl;
        public Builder() {}
        public Builder(ModelServingConfigServedEntityExternalModelDatabricksModelServingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databricksApiToken = defaults.databricksApiToken;
    	      this.databricksWorkspaceUrl = defaults.databricksWorkspaceUrl;
        }

        @CustomType.Setter
        public Builder databricksApiToken(String databricksApiToken) {
            if (databricksApiToken == null) {
              throw new MissingRequiredPropertyException("ModelServingConfigServedEntityExternalModelDatabricksModelServingConfig", "databricksApiToken");
            }
            this.databricksApiToken = databricksApiToken;
            return this;
        }
        @CustomType.Setter
        public Builder databricksWorkspaceUrl(String databricksWorkspaceUrl) {
            if (databricksWorkspaceUrl == null) {
              throw new MissingRequiredPropertyException("ModelServingConfigServedEntityExternalModelDatabricksModelServingConfig", "databricksWorkspaceUrl");
            }
            this.databricksWorkspaceUrl = databricksWorkspaceUrl;
            return this;
        }
        public ModelServingConfigServedEntityExternalModelDatabricksModelServingConfig build() {
            final var _resultValue = new ModelServingConfigServedEntityExternalModelDatabricksModelServingConfig();
            _resultValue.databricksApiToken = databricksApiToken;
            _resultValue.databricksWorkspaceUrl = databricksWorkspaceUrl;
            return _resultValue;
        }
    }
}
