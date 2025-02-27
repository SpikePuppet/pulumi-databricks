// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskRunJobTaskPipelineParams {
    private @Nullable Boolean fullRefresh;

    private JobTaskRunJobTaskPipelineParams() {}
    public Optional<Boolean> fullRefresh() {
        return Optional.ofNullable(this.fullRefresh);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskRunJobTaskPipelineParams defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean fullRefresh;
        public Builder() {}
        public Builder(JobTaskRunJobTaskPipelineParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullRefresh = defaults.fullRefresh;
        }

        @CustomType.Setter
        public Builder fullRefresh(@Nullable Boolean fullRefresh) {

            this.fullRefresh = fullRefresh;
            return this;
        }
        public JobTaskRunJobTaskPipelineParams build() {
            final var _resultValue = new JobTaskRunJobTaskPipelineParams();
            _resultValue.fullRefresh = fullRefresh;
            return _resultValue;
        }
    }
}
