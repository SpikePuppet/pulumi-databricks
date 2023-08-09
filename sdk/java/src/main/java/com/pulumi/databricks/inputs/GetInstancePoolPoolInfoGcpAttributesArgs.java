// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancePoolPoolInfoGcpAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetInstancePoolPoolInfoGcpAttributesArgs Empty = new GetInstancePoolPoolInfoGcpAttributesArgs();

    @Import(name="gcpAvailability")
    private @Nullable Output<String> gcpAvailability;

    public Optional<Output<String>> gcpAvailability() {
        return Optional.ofNullable(this.gcpAvailability);
    }

    @Import(name="localSsdCount")
    private @Nullable Output<Integer> localSsdCount;

    public Optional<Output<Integer>> localSsdCount() {
        return Optional.ofNullable(this.localSsdCount);
    }

    private GetInstancePoolPoolInfoGcpAttributesArgs() {}

    private GetInstancePoolPoolInfoGcpAttributesArgs(GetInstancePoolPoolInfoGcpAttributesArgs $) {
        this.gcpAvailability = $.gcpAvailability;
        this.localSsdCount = $.localSsdCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstancePoolPoolInfoGcpAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstancePoolPoolInfoGcpAttributesArgs $;

        public Builder() {
            $ = new GetInstancePoolPoolInfoGcpAttributesArgs();
        }

        public Builder(GetInstancePoolPoolInfoGcpAttributesArgs defaults) {
            $ = new GetInstancePoolPoolInfoGcpAttributesArgs(Objects.requireNonNull(defaults));
        }

        public Builder gcpAvailability(@Nullable Output<String> gcpAvailability) {
            $.gcpAvailability = gcpAvailability;
            return this;
        }

        public Builder gcpAvailability(String gcpAvailability) {
            return gcpAvailability(Output.of(gcpAvailability));
        }

        public Builder localSsdCount(@Nullable Output<Integer> localSsdCount) {
            $.localSsdCount = localSsdCount;
            return this;
        }

        public Builder localSsdCount(Integer localSsdCount) {
            return localSsdCount(Output.of(localSsdCount));
        }

        public GetInstancePoolPoolInfoGcpAttributesArgs build() {
            return $;
        }
    }

}
