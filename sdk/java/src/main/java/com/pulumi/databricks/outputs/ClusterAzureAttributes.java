// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterAzureAttributes {
    /**
     * @return Availability type used for all subsequent nodes past the `first_on_demand` ones. Valid values are `SPOT_AZURE`, `SPOT_WITH_FALLBACK_AZURE`, and `ON_DEMAND_AZURE`. Note: If `first_on_demand` is zero, this availability type will be used for the entire cluster.
     * 
     */
    private @Nullable String availability;
    /**
     * @return The first `first_on_demand` nodes of the cluster will be placed on on-demand instances. If this value is greater than 0, the cluster driver node will be placed on an on-demand instance. If this value is greater than or equal to the current cluster size, all nodes will be placed on on-demand instances. If this value is less than the current cluster size, `first_on_demand` nodes will be placed on on-demand instances, and the remainder will be placed on availability instances. This value does not affect cluster size and cannot be mutated over the lifetime of a cluster.
     * 
     */
    private @Nullable Integer firstOnDemand;
    /**
     * @return The max price for Azure spot instances.  Use `-1` to specify the lowest price.
     * 
     */
    private @Nullable Double spotBidMaxPrice;

    private ClusterAzureAttributes() {}
    /**
     * @return Availability type used for all subsequent nodes past the `first_on_demand` ones. Valid values are `SPOT_AZURE`, `SPOT_WITH_FALLBACK_AZURE`, and `ON_DEMAND_AZURE`. Note: If `first_on_demand` is zero, this availability type will be used for the entire cluster.
     * 
     */
    public Optional<String> availability() {
        return Optional.ofNullable(this.availability);
    }
    /**
     * @return The first `first_on_demand` nodes of the cluster will be placed on on-demand instances. If this value is greater than 0, the cluster driver node will be placed on an on-demand instance. If this value is greater than or equal to the current cluster size, all nodes will be placed on on-demand instances. If this value is less than the current cluster size, `first_on_demand` nodes will be placed on on-demand instances, and the remainder will be placed on availability instances. This value does not affect cluster size and cannot be mutated over the lifetime of a cluster.
     * 
     */
    public Optional<Integer> firstOnDemand() {
        return Optional.ofNullable(this.firstOnDemand);
    }
    /**
     * @return The max price for Azure spot instances.  Use `-1` to specify the lowest price.
     * 
     */
    public Optional<Double> spotBidMaxPrice() {
        return Optional.ofNullable(this.spotBidMaxPrice);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAzureAttributes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String availability;
        private @Nullable Integer firstOnDemand;
        private @Nullable Double spotBidMaxPrice;
        public Builder() {}
        public Builder(ClusterAzureAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.firstOnDemand = defaults.firstOnDemand;
    	      this.spotBidMaxPrice = defaults.spotBidMaxPrice;
        }

        @CustomType.Setter
        public Builder availability(@Nullable String availability) {

            this.availability = availability;
            return this;
        }
        @CustomType.Setter
        public Builder firstOnDemand(@Nullable Integer firstOnDemand) {

            this.firstOnDemand = firstOnDemand;
            return this;
        }
        @CustomType.Setter
        public Builder spotBidMaxPrice(@Nullable Double spotBidMaxPrice) {

            this.spotBidMaxPrice = spotBidMaxPrice;
            return this;
        }
        public ClusterAzureAttributes build() {
            final var _resultValue = new ClusterAzureAttributes();
            _resultValue.availability = availability;
            _resultValue.firstOnDemand = firstOnDemand;
            _resultValue.spotBidMaxPrice = spotBidMaxPrice;
            return _resultValue;
        }
    }
}
