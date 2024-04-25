// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs;
import com.pulumi.databricks.inputs.MwsNetworkConnectivityConfigEgressConfigTargetRulesArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MwsNetworkConnectivityConfigEgressConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MwsNetworkConnectivityConfigEgressConfigArgs Empty = new MwsNetworkConnectivityConfigEgressConfigArgs();

    @Import(name="defaultRules")
    private @Nullable Output<MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs> defaultRules;

    public Optional<Output<MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs>> defaultRules() {
        return Optional.ofNullable(this.defaultRules);
    }

    @Import(name="targetRules")
    private @Nullable Output<MwsNetworkConnectivityConfigEgressConfigTargetRulesArgs> targetRules;

    public Optional<Output<MwsNetworkConnectivityConfigEgressConfigTargetRulesArgs>> targetRules() {
        return Optional.ofNullable(this.targetRules);
    }

    private MwsNetworkConnectivityConfigEgressConfigArgs() {}

    private MwsNetworkConnectivityConfigEgressConfigArgs(MwsNetworkConnectivityConfigEgressConfigArgs $) {
        this.defaultRules = $.defaultRules;
        this.targetRules = $.targetRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsNetworkConnectivityConfigEgressConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsNetworkConnectivityConfigEgressConfigArgs $;

        public Builder() {
            $ = new MwsNetworkConnectivityConfigEgressConfigArgs();
        }

        public Builder(MwsNetworkConnectivityConfigEgressConfigArgs defaults) {
            $ = new MwsNetworkConnectivityConfigEgressConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultRules(@Nullable Output<MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs> defaultRules) {
            $.defaultRules = defaultRules;
            return this;
        }

        public Builder defaultRules(MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs defaultRules) {
            return defaultRules(Output.of(defaultRules));
        }

        public Builder targetRules(@Nullable Output<MwsNetworkConnectivityConfigEgressConfigTargetRulesArgs> targetRules) {
            $.targetRules = targetRules;
            return this;
        }

        public Builder targetRules(MwsNetworkConnectivityConfigEgressConfigTargetRulesArgs targetRules) {
            return targetRules(Output.of(targetRules));
        }

        public MwsNetworkConnectivityConfigEgressConfigArgs build() {
            return $;
        }
    }

}
