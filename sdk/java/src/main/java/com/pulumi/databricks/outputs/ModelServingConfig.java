// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.ModelServingConfigAutoCaptureConfig;
import com.pulumi.databricks.outputs.ModelServingConfigServedModel;
import com.pulumi.databricks.outputs.ModelServingConfigTrafficConfig;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ModelServingConfig {
    private @Nullable ModelServingConfigAutoCaptureConfig autoCaptureConfig;
    /**
     * @return Each block represents a served model for the endpoint to serve. A model serving endpoint can have up to 10 served models.
     * 
     */
    private @Nullable List<ModelServingConfigServedModel> servedModels;
    /**
     * @return A single block represents the traffic split configuration amongst the served models.
     * 
     */
    private @Nullable ModelServingConfigTrafficConfig trafficConfig;

    private ModelServingConfig() {}
    public Optional<ModelServingConfigAutoCaptureConfig> autoCaptureConfig() {
        return Optional.ofNullable(this.autoCaptureConfig);
    }
    /**
     * @return Each block represents a served model for the endpoint to serve. A model serving endpoint can have up to 10 served models.
     * 
     */
    public List<ModelServingConfigServedModel> servedModels() {
        return this.servedModels == null ? List.of() : this.servedModels;
    }
    /**
     * @return A single block represents the traffic split configuration amongst the served models.
     * 
     */
    public Optional<ModelServingConfigTrafficConfig> trafficConfig() {
        return Optional.ofNullable(this.trafficConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelServingConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ModelServingConfigAutoCaptureConfig autoCaptureConfig;
        private @Nullable List<ModelServingConfigServedModel> servedModels;
        private @Nullable ModelServingConfigTrafficConfig trafficConfig;
        public Builder() {}
        public Builder(ModelServingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCaptureConfig = defaults.autoCaptureConfig;
    	      this.servedModels = defaults.servedModels;
    	      this.trafficConfig = defaults.trafficConfig;
        }

        @CustomType.Setter
        public Builder autoCaptureConfig(@Nullable ModelServingConfigAutoCaptureConfig autoCaptureConfig) {

            this.autoCaptureConfig = autoCaptureConfig;
            return this;
        }
        @CustomType.Setter
        public Builder servedModels(@Nullable List<ModelServingConfigServedModel> servedModels) {

            this.servedModels = servedModels;
            return this;
        }
        public Builder servedModels(ModelServingConfigServedModel... servedModels) {
            return servedModels(List.of(servedModels));
        }
        @CustomType.Setter
        public Builder trafficConfig(@Nullable ModelServingConfigTrafficConfig trafficConfig) {

            this.trafficConfig = trafficConfig;
            return this;
        }
        public ModelServingConfig build() {
            final var _resultValue = new ModelServingConfig();
            _resultValue.autoCaptureConfig = autoCaptureConfig;
            _resultValue.servedModels = servedModels;
            _resultValue.trafficConfig = trafficConfig;
            return _resultValue;
        }
    }
}
