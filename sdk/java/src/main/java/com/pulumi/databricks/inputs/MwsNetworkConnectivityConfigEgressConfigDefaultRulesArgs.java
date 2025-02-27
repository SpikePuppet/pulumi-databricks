// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs;
import com.pulumi.databricks.inputs.MwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs Empty = new MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs();

    @Import(name="awsStableIpRule")
    private @Nullable Output<MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs> awsStableIpRule;

    public Optional<Output<MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs>> awsStableIpRule() {
        return Optional.ofNullable(this.awsStableIpRule);
    }

    /**
     * This provides a list of subnets. These subnets need to be allowed in your Azure resources in order for Databricks to access. See `default_rules.azure_service_endpoint_rule.target_services` for the supported Azure services.
     * 
     */
    @Import(name="azureServiceEndpointRule")
    private @Nullable Output<MwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs> azureServiceEndpointRule;

    /**
     * @return This provides a list of subnets. These subnets need to be allowed in your Azure resources in order for Databricks to access. See `default_rules.azure_service_endpoint_rule.target_services` for the supported Azure services.
     * 
     */
    public Optional<Output<MwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs>> azureServiceEndpointRule() {
        return Optional.ofNullable(this.azureServiceEndpointRule);
    }

    private MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs() {}

    private MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs(MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs $) {
        this.awsStableIpRule = $.awsStableIpRule;
        this.azureServiceEndpointRule = $.azureServiceEndpointRule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs $;

        public Builder() {
            $ = new MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs();
        }

        public Builder(MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs defaults) {
            $ = new MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder awsStableIpRule(@Nullable Output<MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs> awsStableIpRule) {
            $.awsStableIpRule = awsStableIpRule;
            return this;
        }

        public Builder awsStableIpRule(MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs awsStableIpRule) {
            return awsStableIpRule(Output.of(awsStableIpRule));
        }

        /**
         * @param azureServiceEndpointRule This provides a list of subnets. These subnets need to be allowed in your Azure resources in order for Databricks to access. See `default_rules.azure_service_endpoint_rule.target_services` for the supported Azure services.
         * 
         * @return builder
         * 
         */
        public Builder azureServiceEndpointRule(@Nullable Output<MwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs> azureServiceEndpointRule) {
            $.azureServiceEndpointRule = azureServiceEndpointRule;
            return this;
        }

        /**
         * @param azureServiceEndpointRule This provides a list of subnets. These subnets need to be allowed in your Azure resources in order for Databricks to access. See `default_rules.azure_service_endpoint_rule.target_services` for the supported Azure services.
         * 
         * @return builder
         * 
         */
        public Builder azureServiceEndpointRule(MwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs azureServiceEndpointRule) {
            return azureServiceEndpointRule(Output.of(azureServiceEndpointRule));
        }

        public MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs build() {
            return $;
        }
    }

}
