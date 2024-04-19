// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetInstancePoolPoolInfoGcpAttributesInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("gcpAvailability")]
        public Input<string>? GcpAvailability { get; set; }

        [Input("localSsdCount", required: true)]
        public Input<int> LocalSsdCount { get; set; } = null!;

        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetInstancePoolPoolInfoGcpAttributesInputArgs()
        {
        }
        public static new GetInstancePoolPoolInfoGcpAttributesInputArgs Empty => new GetInstancePoolPoolInfoGcpAttributesInputArgs();
    }
}
