// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterGcpAttributes {
    /**
     * @return Availability type used for all nodes. Valid values are `PREEMPTIBLE_GCP`, `PREEMPTIBLE_WITH_FALLBACK_GCP` and `ON_DEMAND_GCP`, default: `ON_DEMAND_GCP`.
     * 
     */
    private @Nullable String availability;
    /**
     * @return Boot disk size in GB
     * 
     */
    private @Nullable Integer bootDiskSize;
    /**
     * @return Google Service Account email address that the cluster uses to authenticate with Google Identity. This field is used for authentication with the GCS and BigQuery data sources.
     * 
     */
    private @Nullable String googleServiceAccount;
    /**
     * @return Number of local SSD disks (each is 375GB in size) that will be attached to each node of the cluster.
     * 
     */
    private @Nullable Integer localSsdCount;
    /**
     * @return if we should use preemptible executors ([GCP documentation](https://cloud.google.com/compute/docs/instances/preemptible)). *Warning: this field is deprecated in favor of `availability`, and will be removed soon.*
     * 
     * @deprecated
     * Please use &#39;availability&#39; instead.
     * 
     */
    @Deprecated /* Please use 'availability' instead. */
    private @Nullable Boolean usePreemptibleExecutors;
    /**
     * @return Identifier for the availability zone in which the cluster resides. This can be one of the following:
     * 
     */
    private @Nullable String zoneId;

    private ClusterGcpAttributes() {}
    /**
     * @return Availability type used for all nodes. Valid values are `PREEMPTIBLE_GCP`, `PREEMPTIBLE_WITH_FALLBACK_GCP` and `ON_DEMAND_GCP`, default: `ON_DEMAND_GCP`.
     * 
     */
    public Optional<String> availability() {
        return Optional.ofNullable(this.availability);
    }
    /**
     * @return Boot disk size in GB
     * 
     */
    public Optional<Integer> bootDiskSize() {
        return Optional.ofNullable(this.bootDiskSize);
    }
    /**
     * @return Google Service Account email address that the cluster uses to authenticate with Google Identity. This field is used for authentication with the GCS and BigQuery data sources.
     * 
     */
    public Optional<String> googleServiceAccount() {
        return Optional.ofNullable(this.googleServiceAccount);
    }
    /**
     * @return Number of local SSD disks (each is 375GB in size) that will be attached to each node of the cluster.
     * 
     */
    public Optional<Integer> localSsdCount() {
        return Optional.ofNullable(this.localSsdCount);
    }
    /**
     * @return if we should use preemptible executors ([GCP documentation](https://cloud.google.com/compute/docs/instances/preemptible)). *Warning: this field is deprecated in favor of `availability`, and will be removed soon.*
     * 
     * @deprecated
     * Please use &#39;availability&#39; instead.
     * 
     */
    @Deprecated /* Please use 'availability' instead. */
    public Optional<Boolean> usePreemptibleExecutors() {
        return Optional.ofNullable(this.usePreemptibleExecutors);
    }
    /**
     * @return Identifier for the availability zone in which the cluster resides. This can be one of the following:
     * 
     */
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterGcpAttributes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String availability;
        private @Nullable Integer bootDiskSize;
        private @Nullable String googleServiceAccount;
        private @Nullable Integer localSsdCount;
        private @Nullable Boolean usePreemptibleExecutors;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(ClusterGcpAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.bootDiskSize = defaults.bootDiskSize;
    	      this.googleServiceAccount = defaults.googleServiceAccount;
    	      this.localSsdCount = defaults.localSsdCount;
    	      this.usePreemptibleExecutors = defaults.usePreemptibleExecutors;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder availability(@Nullable String availability) {

            this.availability = availability;
            return this;
        }
        @CustomType.Setter
        public Builder bootDiskSize(@Nullable Integer bootDiskSize) {

            this.bootDiskSize = bootDiskSize;
            return this;
        }
        @CustomType.Setter
        public Builder googleServiceAccount(@Nullable String googleServiceAccount) {

            this.googleServiceAccount = googleServiceAccount;
            return this;
        }
        @CustomType.Setter
        public Builder localSsdCount(@Nullable Integer localSsdCount) {

            this.localSsdCount = localSsdCount;
            return this;
        }
        @CustomType.Setter
        public Builder usePreemptibleExecutors(@Nullable Boolean usePreemptibleExecutors) {

            this.usePreemptibleExecutors = usePreemptibleExecutors;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {

            this.zoneId = zoneId;
            return this;
        }
        public ClusterGcpAttributes build() {
            final var _resultValue = new ClusterGcpAttributes();
            _resultValue.availability = availability;
            _resultValue.bootDiskSize = bootDiskSize;
            _resultValue.googleServiceAccount = googleServiceAccount;
            _resultValue.localSsdCount = localSsdCount;
            _resultValue.usePreemptibleExecutors = usePreemptibleExecutors;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
