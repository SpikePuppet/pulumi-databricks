// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterInitScriptGcs {
    private @Nullable String destination;

    private ClusterInitScriptGcs() {}
    public Optional<String> destination() {
        return Optional.ofNullable(this.destination);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterInitScriptGcs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String destination;
        public Builder() {}
        public Builder(ClusterInitScriptGcs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        @CustomType.Setter
        public Builder destination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }
        public ClusterInitScriptGcs build() {
            final var o = new ClusterInitScriptGcs();
            o.destination = destination;
            return o;
        }
    }
}