// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRule {
    private @Nullable List<String> cidrBlocks;

    private MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRule() {}
    public List<String> cidrBlocks() {
        return this.cidrBlocks == null ? List.of() : this.cidrBlocks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> cidrBlocks;
        public Builder() {}
        public Builder(MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
        }

        @CustomType.Setter
        public Builder cidrBlocks(@Nullable List<String> cidrBlocks) {

            this.cidrBlocks = cidrBlocks;
            return this;
        }
        public Builder cidrBlocks(String... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }
        public MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRule build() {
            final var _resultValue = new MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRule();
            _resultValue.cidrBlocks = cidrBlocks;
            return _resultValue;
        }
    }
}
