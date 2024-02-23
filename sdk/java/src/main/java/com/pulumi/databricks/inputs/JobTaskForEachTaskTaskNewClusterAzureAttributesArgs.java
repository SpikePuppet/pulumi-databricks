// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskForEachTaskTaskNewClusterAzureAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskForEachTaskTaskNewClusterAzureAttributesArgs Empty = new JobTaskForEachTaskTaskNewClusterAzureAttributesArgs();

    @Import(name="availability")
    private @Nullable Output<String> availability;

    public Optional<Output<String>> availability() {
        return Optional.ofNullable(this.availability);
    }

    @Import(name="firstOnDemand")
    private @Nullable Output<Integer> firstOnDemand;

    public Optional<Output<Integer>> firstOnDemand() {
        return Optional.ofNullable(this.firstOnDemand);
    }

    @Import(name="spotBidMaxPrice")
    private @Nullable Output<Double> spotBidMaxPrice;

    public Optional<Output<Double>> spotBidMaxPrice() {
        return Optional.ofNullable(this.spotBidMaxPrice);
    }

    private JobTaskForEachTaskTaskNewClusterAzureAttributesArgs() {}

    private JobTaskForEachTaskTaskNewClusterAzureAttributesArgs(JobTaskForEachTaskTaskNewClusterAzureAttributesArgs $) {
        this.availability = $.availability;
        this.firstOnDemand = $.firstOnDemand;
        this.spotBidMaxPrice = $.spotBidMaxPrice;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskForEachTaskTaskNewClusterAzureAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskForEachTaskTaskNewClusterAzureAttributesArgs $;

        public Builder() {
            $ = new JobTaskForEachTaskTaskNewClusterAzureAttributesArgs();
        }

        public Builder(JobTaskForEachTaskTaskNewClusterAzureAttributesArgs defaults) {
            $ = new JobTaskForEachTaskTaskNewClusterAzureAttributesArgs(Objects.requireNonNull(defaults));
        }

        public Builder availability(@Nullable Output<String> availability) {
            $.availability = availability;
            return this;
        }

        public Builder availability(String availability) {
            return availability(Output.of(availability));
        }

        public Builder firstOnDemand(@Nullable Output<Integer> firstOnDemand) {
            $.firstOnDemand = firstOnDemand;
            return this;
        }

        public Builder firstOnDemand(Integer firstOnDemand) {
            return firstOnDemand(Output.of(firstOnDemand));
        }

        public Builder spotBidMaxPrice(@Nullable Output<Double> spotBidMaxPrice) {
            $.spotBidMaxPrice = spotBidMaxPrice;
            return this;
        }

        public Builder spotBidMaxPrice(Double spotBidMaxPrice) {
            return spotBidMaxPrice(Output.of(spotBidMaxPrice));
        }

        public JobTaskForEachTaskTaskNewClusterAzureAttributesArgs build() {
            return $;
        }
    }

}