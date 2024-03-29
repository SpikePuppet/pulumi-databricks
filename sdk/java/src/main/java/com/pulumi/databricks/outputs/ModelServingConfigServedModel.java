// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ModelServingConfigServedModel {
    /**
     * @return a map of environment variable name/values that will be used for serving this model.  Environment variables may refer to Databricks secrets using the standard syntax: `{{secrets/secret_scope/secret_key}}`.
     * 
     */
    private @Nullable Map<String,Object> environmentVars;
    /**
     * @return ARN of the instance profile that the served model will use to access AWS resources.
     * 
     */
    private @Nullable String instanceProfileArn;
    /**
     * @return The name of the model in Databricks Model Registry to be served.
     * 
     */
    private String modelName;
    /**
     * @return The version of the model in Databricks Model Registry to be served.
     * 
     */
    private String modelVersion;
    /**
     * @return The name of a served model. It must be unique across an endpoint. If not specified, this field will default to `modelname-modelversion`. A served model name can consist of alphanumeric characters, dashes, and underscores.
     * 
     */
    private @Nullable String name;
    /**
     * @return Whether the compute resources for the served model should scale down to zero. If `scale-to-zero` is enabled, the lower bound of the provisioned concurrency for each workload size will be 0. The default value is `true`.
     * 
     */
    private @Nullable Boolean scaleToZeroEnabled;
    /**
     * @return The workload size of the served model. The workload size corresponds to a range of provisioned concurrency that the compute will autoscale between. A single unit of provisioned concurrency can process one request at a time. Valid workload sizes are `Small` (4 - 4 provisioned concurrency), `Medium` (8 - 16 provisioned concurrency), and `Large` (16 - 64 provisioned concurrency).
     * 
     */
    private String workloadSize;
    /**
     * @return The workload type of the served model. The workload type selects which type of compute to use in the endpoint. For deep learning workloads, GPU acceleration is available by selecting workload types like `GPU_SMALL` and others. See documentation for all options. The default value is `CPU`.
     * 
     */
    private @Nullable String workloadType;

    private ModelServingConfigServedModel() {}
    /**
     * @return a map of environment variable name/values that will be used for serving this model.  Environment variables may refer to Databricks secrets using the standard syntax: `{{secrets/secret_scope/secret_key}}`.
     * 
     */
    public Map<String,Object> environmentVars() {
        return this.environmentVars == null ? Map.of() : this.environmentVars;
    }
    /**
     * @return ARN of the instance profile that the served model will use to access AWS resources.
     * 
     */
    public Optional<String> instanceProfileArn() {
        return Optional.ofNullable(this.instanceProfileArn);
    }
    /**
     * @return The name of the model in Databricks Model Registry to be served.
     * 
     */
    public String modelName() {
        return this.modelName;
    }
    /**
     * @return The version of the model in Databricks Model Registry to be served.
     * 
     */
    public String modelVersion() {
        return this.modelVersion;
    }
    /**
     * @return The name of a served model. It must be unique across an endpoint. If not specified, this field will default to `modelname-modelversion`. A served model name can consist of alphanumeric characters, dashes, and underscores.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Whether the compute resources for the served model should scale down to zero. If `scale-to-zero` is enabled, the lower bound of the provisioned concurrency for each workload size will be 0. The default value is `true`.
     * 
     */
    public Optional<Boolean> scaleToZeroEnabled() {
        return Optional.ofNullable(this.scaleToZeroEnabled);
    }
    /**
     * @return The workload size of the served model. The workload size corresponds to a range of provisioned concurrency that the compute will autoscale between. A single unit of provisioned concurrency can process one request at a time. Valid workload sizes are `Small` (4 - 4 provisioned concurrency), `Medium` (8 - 16 provisioned concurrency), and `Large` (16 - 64 provisioned concurrency).
     * 
     */
    public String workloadSize() {
        return this.workloadSize;
    }
    /**
     * @return The workload type of the served model. The workload type selects which type of compute to use in the endpoint. For deep learning workloads, GPU acceleration is available by selecting workload types like `GPU_SMALL` and others. See documentation for all options. The default value is `CPU`.
     * 
     */
    public Optional<String> workloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelServingConfigServedModel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> environmentVars;
        private @Nullable String instanceProfileArn;
        private String modelName;
        private String modelVersion;
        private @Nullable String name;
        private @Nullable Boolean scaleToZeroEnabled;
        private String workloadSize;
        private @Nullable String workloadType;
        public Builder() {}
        public Builder(ModelServingConfigServedModel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentVars = defaults.environmentVars;
    	      this.instanceProfileArn = defaults.instanceProfileArn;
    	      this.modelName = defaults.modelName;
    	      this.modelVersion = defaults.modelVersion;
    	      this.name = defaults.name;
    	      this.scaleToZeroEnabled = defaults.scaleToZeroEnabled;
    	      this.workloadSize = defaults.workloadSize;
    	      this.workloadType = defaults.workloadType;
        }

        @CustomType.Setter
        public Builder environmentVars(@Nullable Map<String,Object> environmentVars) {

            this.environmentVars = environmentVars;
            return this;
        }
        @CustomType.Setter
        public Builder instanceProfileArn(@Nullable String instanceProfileArn) {

            this.instanceProfileArn = instanceProfileArn;
            return this;
        }
        @CustomType.Setter
        public Builder modelName(String modelName) {
            if (modelName == null) {
              throw new MissingRequiredPropertyException("ModelServingConfigServedModel", "modelName");
            }
            this.modelName = modelName;
            return this;
        }
        @CustomType.Setter
        public Builder modelVersion(String modelVersion) {
            if (modelVersion == null) {
              throw new MissingRequiredPropertyException("ModelServingConfigServedModel", "modelVersion");
            }
            this.modelVersion = modelVersion;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder scaleToZeroEnabled(@Nullable Boolean scaleToZeroEnabled) {

            this.scaleToZeroEnabled = scaleToZeroEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder workloadSize(String workloadSize) {
            if (workloadSize == null) {
              throw new MissingRequiredPropertyException("ModelServingConfigServedModel", "workloadSize");
            }
            this.workloadSize = workloadSize;
            return this;
        }
        @CustomType.Setter
        public Builder workloadType(@Nullable String workloadType) {

            this.workloadType = workloadType;
            return this;
        }
        public ModelServingConfigServedModel build() {
            final var _resultValue = new ModelServingConfigServedModel();
            _resultValue.environmentVars = environmentVars;
            _resultValue.instanceProfileArn = instanceProfileArn;
            _resultValue.modelName = modelName;
            _resultValue.modelVersion = modelVersion;
            _resultValue.name = name;
            _resultValue.scaleToZeroEnabled = scaleToZeroEnabled;
            _resultValue.workloadSize = workloadSize;
            _resultValue.workloadType = workloadType;
            return _resultValue;
        }
    }
}
