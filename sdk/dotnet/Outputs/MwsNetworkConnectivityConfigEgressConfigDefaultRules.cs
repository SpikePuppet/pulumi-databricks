// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class MwsNetworkConnectivityConfigEgressConfigDefaultRules
    {
        public readonly Outputs.MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRule? AwsStableIpRule;
        /// <summary>
        /// This provides a list of subnets. These subnets need to be allowed in your Azure resources in order for Databricks to access. See `default_rules.azure_service_endpoint_rule.target_services` for the supported Azure services.
        /// </summary>
        public readonly Outputs.MwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRule? AzureServiceEndpointRule;

        [OutputConstructor]
        private MwsNetworkConnectivityConfigEgressConfigDefaultRules(
            Outputs.MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRule? awsStableIpRule,

            Outputs.MwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRule? azureServiceEndpointRule)
        {
            AwsStableIpRule = awsStableIpRule;
            AzureServiceEndpointRule = azureServiceEndpointRule;
        }
    }
}