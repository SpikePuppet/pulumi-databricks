// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsSparkSubmitTask {
    private @Nullable List<String> parameters;

    private GetJobJobSettingsSettingsSparkSubmitTask() {}
    public List<String> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsSparkSubmitTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> parameters;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsSparkSubmitTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
        }

        @CustomType.Setter
        public Builder parameters(@Nullable List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }
        public GetJobJobSettingsSettingsSparkSubmitTask build() {
            final var _resultValue = new GetJobJobSettingsSettingsSparkSubmitTask();
            _resultValue.parameters = parameters;
            return _resultValue;
        }
    }
}
