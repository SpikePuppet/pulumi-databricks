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
public final class GetClusterClusterInfoAzureAttributes {
    private @Nullable String availability;
    private @Nullable Integer firstOnDemand;
    private @Nullable Double spotBidMaxPrice;

    private GetClusterClusterInfoAzureAttributes() {}
    public Optional<String> availability() {
        return Optional.ofNullable(this.availability);
    }
    public Optional<Integer> firstOnDemand() {
        return Optional.ofNullable(this.firstOnDemand);
    }
    public Optional<Double> spotBidMaxPrice() {
        return Optional.ofNullable(this.spotBidMaxPrice);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterInfoAzureAttributes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String availability;
        private @Nullable Integer firstOnDemand;
        private @Nullable Double spotBidMaxPrice;
        public Builder() {}
        public Builder(GetClusterClusterInfoAzureAttributes defaults) {
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
        public GetClusterClusterInfoAzureAttributes build() {
            final var _resultValue = new GetClusterClusterInfoAzureAttributes();
            _resultValue.availability = availability;
            _resultValue.firstOnDemand = firstOnDemand;
            _resultValue.spotBidMaxPrice = spotBidMaxPrice;
            return _resultValue;
        }
    }
}
