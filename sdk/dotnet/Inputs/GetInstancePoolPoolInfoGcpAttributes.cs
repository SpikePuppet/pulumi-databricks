// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetInstancePoolPoolInfoGcpAttributesArgs : global::Pulumi.InvokeArgs
    {
        [Input("gcpAvailability")]
        public string? GcpAvailability { get; set; }

        [Input("localSsdCount")]
        public int? LocalSsdCount { get; set; }

        public GetInstancePoolPoolInfoGcpAttributesArgs()
        {
        }
        public static new GetInstancePoolPoolInfoGcpAttributesArgs Empty => new GetInstancePoolPoolInfoGcpAttributesArgs();
    }
}
