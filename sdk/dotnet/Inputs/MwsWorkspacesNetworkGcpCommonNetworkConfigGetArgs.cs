// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MwsWorkspacesNetworkGcpCommonNetworkConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("gkeClusterMasterIpRange", required: true)]
        public Input<string> GkeClusterMasterIpRange { get; set; } = null!;

        [Input("gkeConnectivityType", required: true)]
        public Input<string> GkeConnectivityType { get; set; } = null!;

        public MwsWorkspacesNetworkGcpCommonNetworkConfigGetArgs()
        {
        }
    }
}
