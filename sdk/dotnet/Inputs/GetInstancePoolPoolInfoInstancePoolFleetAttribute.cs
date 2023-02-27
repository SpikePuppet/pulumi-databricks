// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetInstancePoolPoolInfoInstancePoolFleetAttributeArgs : global::Pulumi.InvokeArgs
    {
        [Input("fleetOnDemandOption")]
        public Inputs.GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetOnDemandOptionArgs? FleetOnDemandOption { get; set; }

        [Input("fleetSpotOption")]
        public Inputs.GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOptionArgs? FleetSpotOption { get; set; }

        [Input("launchTemplateOverrides", required: true)]
        private List<Inputs.GetInstancePoolPoolInfoInstancePoolFleetAttributeLaunchTemplateOverrideArgs>? _launchTemplateOverrides;
        public List<Inputs.GetInstancePoolPoolInfoInstancePoolFleetAttributeLaunchTemplateOverrideArgs> LaunchTemplateOverrides
        {
            get => _launchTemplateOverrides ?? (_launchTemplateOverrides = new List<Inputs.GetInstancePoolPoolInfoInstancePoolFleetAttributeLaunchTemplateOverrideArgs>());
            set => _launchTemplateOverrides = value;
        }

        public GetInstancePoolPoolInfoInstancePoolFleetAttributeArgs()
        {
        }
        public static new GetInstancePoolPoolInfoInstancePoolFleetAttributeArgs Empty => new GetInstancePoolPoolInfoInstancePoolFleetAttributeArgs();
    }
}