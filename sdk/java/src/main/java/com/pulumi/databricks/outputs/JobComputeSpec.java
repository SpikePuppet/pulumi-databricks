// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobComputeSpec {
    private @Nullable String kind;

    private JobComputeSpec() {}
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobComputeSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String kind;
        public Builder() {}
        public Builder(JobComputeSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
        }

        @CustomType.Setter
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public JobComputeSpec build() {
            final var _resultValue = new JobComputeSpec();
            _resultValue.kind = kind;
            return _resultValue;
        }
    }
}
