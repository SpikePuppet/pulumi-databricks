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
public final class JobNewClusterAwsAttributes {
    private @Nullable String availability;
    private @Nullable Integer ebsVolumeCount;
    private @Nullable Integer ebsVolumeSize;
    private @Nullable String ebsVolumeType;
    private @Nullable Integer firstOnDemand;
    private @Nullable String instanceProfileArn;
    private @Nullable Integer spotBidPricePercent;
    private @Nullable String zoneId;

    private JobNewClusterAwsAttributes() {}
    public Optional<String> availability() {
        return Optional.ofNullable(this.availability);
    }
    public Optional<Integer> ebsVolumeCount() {
        return Optional.ofNullable(this.ebsVolumeCount);
    }
    public Optional<Integer> ebsVolumeSize() {
        return Optional.ofNullable(this.ebsVolumeSize);
    }
    public Optional<String> ebsVolumeType() {
        return Optional.ofNullable(this.ebsVolumeType);
    }
    public Optional<Integer> firstOnDemand() {
        return Optional.ofNullable(this.firstOnDemand);
    }
    public Optional<String> instanceProfileArn() {
        return Optional.ofNullable(this.instanceProfileArn);
    }
    public Optional<Integer> spotBidPricePercent() {
        return Optional.ofNullable(this.spotBidPricePercent);
    }
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobNewClusterAwsAttributes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String availability;
        private @Nullable Integer ebsVolumeCount;
        private @Nullable Integer ebsVolumeSize;
        private @Nullable String ebsVolumeType;
        private @Nullable Integer firstOnDemand;
        private @Nullable String instanceProfileArn;
        private @Nullable Integer spotBidPricePercent;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(JobNewClusterAwsAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.ebsVolumeCount = defaults.ebsVolumeCount;
    	      this.ebsVolumeSize = defaults.ebsVolumeSize;
    	      this.ebsVolumeType = defaults.ebsVolumeType;
    	      this.firstOnDemand = defaults.firstOnDemand;
    	      this.instanceProfileArn = defaults.instanceProfileArn;
    	      this.spotBidPricePercent = defaults.spotBidPricePercent;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder availability(@Nullable String availability) {

            this.availability = availability;
            return this;
        }
        @CustomType.Setter
        public Builder ebsVolumeCount(@Nullable Integer ebsVolumeCount) {

            this.ebsVolumeCount = ebsVolumeCount;
            return this;
        }
        @CustomType.Setter
        public Builder ebsVolumeSize(@Nullable Integer ebsVolumeSize) {

            this.ebsVolumeSize = ebsVolumeSize;
            return this;
        }
        @CustomType.Setter
        public Builder ebsVolumeType(@Nullable String ebsVolumeType) {

            this.ebsVolumeType = ebsVolumeType;
            return this;
        }
        @CustomType.Setter
        public Builder firstOnDemand(@Nullable Integer firstOnDemand) {

            this.firstOnDemand = firstOnDemand;
            return this;
        }
        @CustomType.Setter
        public Builder instanceProfileArn(@Nullable String instanceProfileArn) {

            this.instanceProfileArn = instanceProfileArn;
            return this;
        }
        @CustomType.Setter
        public Builder spotBidPricePercent(@Nullable Integer spotBidPricePercent) {

            this.spotBidPricePercent = spotBidPricePercent;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {

            this.zoneId = zoneId;
            return this;
        }
        public JobNewClusterAwsAttributes build() {
            final var _resultValue = new JobNewClusterAwsAttributes();
            _resultValue.availability = availability;
            _resultValue.ebsVolumeCount = ebsVolumeCount;
            _resultValue.ebsVolumeSize = ebsVolumeSize;
            _resultValue.ebsVolumeType = ebsVolumeType;
            _resultValue.firstOnDemand = firstOnDemand;
            _resultValue.instanceProfileArn = instanceProfileArn;
            _resultValue.spotBidPricePercent = spotBidPricePercent;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
