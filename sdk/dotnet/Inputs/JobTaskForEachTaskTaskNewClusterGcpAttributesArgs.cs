// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskForEachTaskTaskNewClusterGcpAttributesArgs : global::Pulumi.ResourceArgs
    {
        [Input("availability")]
        public Input<string>? Availability { get; set; }

        [Input("bootDiskSize")]
        public Input<int>? BootDiskSize { get; set; }

        [Input("googleServiceAccount")]
        public Input<string>? GoogleServiceAccount { get; set; }

        [Input("localSsdCount")]
        public Input<int>? LocalSsdCount { get; set; }

        [Input("usePreemptibleExecutors")]
        public Input<bool>? UsePreemptibleExecutors { get; set; }

        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public JobTaskForEachTaskTaskNewClusterGcpAttributesArgs()
        {
        }
        public static new JobTaskForEachTaskTaskNewClusterGcpAttributesArgs Empty => new JobTaskForEachTaskTaskNewClusterGcpAttributesArgs();
    }
}
