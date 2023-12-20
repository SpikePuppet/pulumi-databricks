// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterInitScriptWorkspace {
    /**
     * @return S3 destination, e.g., `s3://my-bucket/some-prefix` You must configure the cluster with an instance profile, and the instance profile must have write access to the destination. You cannot use AWS keys.
     * 
     */
    private @Nullable String destination;

    private ClusterInitScriptWorkspace() {}
    /**
     * @return S3 destination, e.g., `s3://my-bucket/some-prefix` You must configure the cluster with an instance profile, and the instance profile must have write access to the destination. You cannot use AWS keys.
     * 
     */
    public Optional<String> destination() {
        return Optional.ofNullable(this.destination);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterInitScriptWorkspace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String destination;
        public Builder() {}
        public Builder(ClusterInitScriptWorkspace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        @CustomType.Setter
        public Builder destination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }
        public ClusterInitScriptWorkspace build() {
            final var _resultValue = new ClusterInitScriptWorkspace();
            _resultValue.destination = destination;
            return _resultValue;
        }
    }
}
