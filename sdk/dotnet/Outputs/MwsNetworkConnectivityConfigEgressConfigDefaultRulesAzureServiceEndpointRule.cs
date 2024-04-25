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
    public sealed class MwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRule
    {
        public readonly ImmutableArray<string> Subnets;
        public readonly string? TargetRegion;
        public readonly ImmutableArray<string> TargetServices;

        [OutputConstructor]
        private MwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRule(
            ImmutableArray<string> subnets,

            string? targetRegion,

            ImmutableArray<string> targetServices)
        {
            Subnets = subnets;
            TargetRegion = targetRegion;
            TargetServices = targetServices;
        }
    }
}
