// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("subnets")]
        private InputList<string>? _subnets;
        public InputList<string> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<string>());
            set => _subnets = value;
        }

        [Input("targetRegion")]
        public Input<string>? TargetRegion { get; set; }

        [Input("targetServices")]
        private InputList<string>? _targetServices;
        public InputList<string> TargetServices
        {
            get => _targetServices ?? (_targetServices = new InputList<string>());
            set => _targetServices = value;
        }

        public MwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleGetArgs()
        {
        }
        public static new MwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleGetArgs Empty => new MwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleGetArgs();
    }
}
