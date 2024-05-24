// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterGcpAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterGcpAttributesArgs Empty = new ClusterGcpAttributesArgs();

    /**
     * Availability type used for all nodes. Valid values are `PREEMPTIBLE_GCP`, `PREEMPTIBLE_WITH_FALLBACK_GCP` and `ON_DEMAND_GCP`, default: `ON_DEMAND_GCP`.
     * 
     */
    @Import(name="availability")
    private @Nullable Output<String> availability;

    /**
     * @return Availability type used for all nodes. Valid values are `PREEMPTIBLE_GCP`, `PREEMPTIBLE_WITH_FALLBACK_GCP` and `ON_DEMAND_GCP`, default: `ON_DEMAND_GCP`.
     * 
     */
    public Optional<Output<String>> availability() {
        return Optional.ofNullable(this.availability);
    }

    /**
     * Boot disk size in GB
     * 
     */
    @Import(name="bootDiskSize")
    private @Nullable Output<Integer> bootDiskSize;

    /**
     * @return Boot disk size in GB
     * 
     */
    public Optional<Output<Integer>> bootDiskSize() {
        return Optional.ofNullable(this.bootDiskSize);
    }

    /**
     * Google Service Account email address that the cluster uses to authenticate with Google Identity. This field is used for authentication with the GCS and BigQuery data sources.
     * 
     */
    @Import(name="googleServiceAccount")
    private @Nullable Output<String> googleServiceAccount;

    /**
     * @return Google Service Account email address that the cluster uses to authenticate with Google Identity. This field is used for authentication with the GCS and BigQuery data sources.
     * 
     */
    public Optional<Output<String>> googleServiceAccount() {
        return Optional.ofNullable(this.googleServiceAccount);
    }

    /**
     * Number of local SSD disks (each is 375GB in size) that will be attached to each node of the cluster.
     * 
     */
    @Import(name="localSsdCount")
    private @Nullable Output<Integer> localSsdCount;

    /**
     * @return Number of local SSD disks (each is 375GB in size) that will be attached to each node of the cluster.
     * 
     */
    public Optional<Output<Integer>> localSsdCount() {
        return Optional.ofNullable(this.localSsdCount);
    }

    /**
     * if we should use preemptible executors ([GCP documentation](https://cloud.google.com/compute/docs/instances/preemptible)). *Warning: this field is deprecated in favor of `availability`, and will be removed soon.*
     * 
     */
    @Import(name="usePreemptibleExecutors")
    private @Nullable Output<Boolean> usePreemptibleExecutors;

    /**
     * @return if we should use preemptible executors ([GCP documentation](https://cloud.google.com/compute/docs/instances/preemptible)). *Warning: this field is deprecated in favor of `availability`, and will be removed soon.*
     * 
     */
    public Optional<Output<Boolean>> usePreemptibleExecutors() {
        return Optional.ofNullable(this.usePreemptibleExecutors);
    }

    /**
     * Identifier for the availability zone in which the cluster resides. This can be one of the following:
     * * `HA` (default): High availability, spread nodes across availability zones for a Databricks deployment region.
     * * `AUTO`: Databricks picks an availability zone to schedule the cluster on.
     * * name of a GCP availability zone: pick one of the available zones from the [list of available availability zones](https://cloud.google.com/compute/docs/regions-zones#available).
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return Identifier for the availability zone in which the cluster resides. This can be one of the following:
     * * `HA` (default): High availability, spread nodes across availability zones for a Databricks deployment region.
     * * `AUTO`: Databricks picks an availability zone to schedule the cluster on.
     * * name of a GCP availability zone: pick one of the available zones from the [list of available availability zones](https://cloud.google.com/compute/docs/regions-zones#available).
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private ClusterGcpAttributesArgs() {}

    private ClusterGcpAttributesArgs(ClusterGcpAttributesArgs $) {
        this.availability = $.availability;
        this.bootDiskSize = $.bootDiskSize;
        this.googleServiceAccount = $.googleServiceAccount;
        this.localSsdCount = $.localSsdCount;
        this.usePreemptibleExecutors = $.usePreemptibleExecutors;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterGcpAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterGcpAttributesArgs $;

        public Builder() {
            $ = new ClusterGcpAttributesArgs();
        }

        public Builder(ClusterGcpAttributesArgs defaults) {
            $ = new ClusterGcpAttributesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availability Availability type used for all nodes. Valid values are `PREEMPTIBLE_GCP`, `PREEMPTIBLE_WITH_FALLBACK_GCP` and `ON_DEMAND_GCP`, default: `ON_DEMAND_GCP`.
         * 
         * @return builder
         * 
         */
        public Builder availability(@Nullable Output<String> availability) {
            $.availability = availability;
            return this;
        }

        /**
         * @param availability Availability type used for all nodes. Valid values are `PREEMPTIBLE_GCP`, `PREEMPTIBLE_WITH_FALLBACK_GCP` and `ON_DEMAND_GCP`, default: `ON_DEMAND_GCP`.
         * 
         * @return builder
         * 
         */
        public Builder availability(String availability) {
            return availability(Output.of(availability));
        }

        /**
         * @param bootDiskSize Boot disk size in GB
         * 
         * @return builder
         * 
         */
        public Builder bootDiskSize(@Nullable Output<Integer> bootDiskSize) {
            $.bootDiskSize = bootDiskSize;
            return this;
        }

        /**
         * @param bootDiskSize Boot disk size in GB
         * 
         * @return builder
         * 
         */
        public Builder bootDiskSize(Integer bootDiskSize) {
            return bootDiskSize(Output.of(bootDiskSize));
        }

        /**
         * @param googleServiceAccount Google Service Account email address that the cluster uses to authenticate with Google Identity. This field is used for authentication with the GCS and BigQuery data sources.
         * 
         * @return builder
         * 
         */
        public Builder googleServiceAccount(@Nullable Output<String> googleServiceAccount) {
            $.googleServiceAccount = googleServiceAccount;
            return this;
        }

        /**
         * @param googleServiceAccount Google Service Account email address that the cluster uses to authenticate with Google Identity. This field is used for authentication with the GCS and BigQuery data sources.
         * 
         * @return builder
         * 
         */
        public Builder googleServiceAccount(String googleServiceAccount) {
            return googleServiceAccount(Output.of(googleServiceAccount));
        }

        /**
         * @param localSsdCount Number of local SSD disks (each is 375GB in size) that will be attached to each node of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder localSsdCount(@Nullable Output<Integer> localSsdCount) {
            $.localSsdCount = localSsdCount;
            return this;
        }

        /**
         * @param localSsdCount Number of local SSD disks (each is 375GB in size) that will be attached to each node of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder localSsdCount(Integer localSsdCount) {
            return localSsdCount(Output.of(localSsdCount));
        }

        /**
         * @param usePreemptibleExecutors if we should use preemptible executors ([GCP documentation](https://cloud.google.com/compute/docs/instances/preemptible)). *Warning: this field is deprecated in favor of `availability`, and will be removed soon.*
         * 
         * @return builder
         * 
         */
        public Builder usePreemptibleExecutors(@Nullable Output<Boolean> usePreemptibleExecutors) {
            $.usePreemptibleExecutors = usePreemptibleExecutors;
            return this;
        }

        /**
         * @param usePreemptibleExecutors if we should use preemptible executors ([GCP documentation](https://cloud.google.com/compute/docs/instances/preemptible)). *Warning: this field is deprecated in favor of `availability`, and will be removed soon.*
         * 
         * @return builder
         * 
         */
        public Builder usePreemptibleExecutors(Boolean usePreemptibleExecutors) {
            return usePreemptibleExecutors(Output.of(usePreemptibleExecutors));
        }

        /**
         * @param zoneId Identifier for the availability zone in which the cluster resides. This can be one of the following:
         * * `HA` (default): High availability, spread nodes across availability zones for a Databricks deployment region.
         * * `AUTO`: Databricks picks an availability zone to schedule the cluster on.
         * * name of a GCP availability zone: pick one of the available zones from the [list of available availability zones](https://cloud.google.com/compute/docs/regions-zones#available).
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId Identifier for the availability zone in which the cluster resides. This can be one of the following:
         * * `HA` (default): High availability, spread nodes across availability zones for a Databricks deployment region.
         * * `AUTO`: Databricks picks an availability zone to schedule the cluster on.
         * * name of a GCP availability zone: pick one of the available zones from the [list of available availability zones](https://cloud.google.com/compute/docs/regions-zones#available).
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ClusterGcpAttributesArgs build() {
            return $;
        }
    }

}
