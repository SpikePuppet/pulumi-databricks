// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstancePoolGcpAttributes {
    /**
     * @return Availability type used for all nodes. Valid values are `PREEMPTIBLE_GCP`, `PREEMPTIBLE_WITH_FALLBACK_GCP` and `ON_DEMAND_GCP`, default: `ON_DEMAND_GCP`.
     * 
     */
    private @Nullable String gcpAvailability;
    /**
     * @return Number of local SSD disks (each is 375GB in size) that will be attached to each node of the cluster.
     * 
     */
    private @Nullable Integer localSsdCount;

    private InstancePoolGcpAttributes() {}
    /**
     * @return Availability type used for all nodes. Valid values are `PREEMPTIBLE_GCP`, `PREEMPTIBLE_WITH_FALLBACK_GCP` and `ON_DEMAND_GCP`, default: `ON_DEMAND_GCP`.
     * 
     */
    public Optional<String> gcpAvailability() {
        return Optional.ofNullable(this.gcpAvailability);
    }
    /**
     * @return Number of local SSD disks (each is 375GB in size) that will be attached to each node of the cluster.
     * 
     */
    public Optional<Integer> localSsdCount() {
        return Optional.ofNullable(this.localSsdCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePoolGcpAttributes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String gcpAvailability;
        private @Nullable Integer localSsdCount;
        public Builder() {}
        public Builder(InstancePoolGcpAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcpAvailability = defaults.gcpAvailability;
    	      this.localSsdCount = defaults.localSsdCount;
        }

        @CustomType.Setter
        public Builder gcpAvailability(@Nullable String gcpAvailability) {
            this.gcpAvailability = gcpAvailability;
            return this;
        }
        @CustomType.Setter
        public Builder localSsdCount(@Nullable Integer localSsdCount) {
            this.localSsdCount = localSsdCount;
            return this;
        }
        public InstancePoolGcpAttributes build() {
            final var _resultValue = new InstancePoolGcpAttributes();
            _resultValue.gcpAvailability = gcpAvailability;
            _resultValue.localSsdCount = localSsdCount;
            return _resultValue;
        }
    }
}
