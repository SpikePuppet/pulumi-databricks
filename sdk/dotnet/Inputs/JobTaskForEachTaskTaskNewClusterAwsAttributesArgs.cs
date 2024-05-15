// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskForEachTaskTaskNewClusterAwsAttributesArgs : global::Pulumi.ResourceArgs
    {
        [Input("availability")]
        public Input<string>? Availability { get; set; }

        [Input("ebsVolumeCount")]
        public Input<int>? EbsVolumeCount { get; set; }

        [Input("ebsVolumeIops")]
        public Input<int>? EbsVolumeIops { get; set; }

        [Input("ebsVolumeSize")]
        public Input<int>? EbsVolumeSize { get; set; }

        [Input("ebsVolumeThroughput")]
        public Input<int>? EbsVolumeThroughput { get; set; }

        [Input("ebsVolumeType")]
        public Input<string>? EbsVolumeType { get; set; }

        [Input("firstOnDemand")]
        public Input<int>? FirstOnDemand { get; set; }

        [Input("instanceProfileArn")]
        public Input<string>? InstanceProfileArn { get; set; }

        [Input("spotBidPricePercent")]
        public Input<int>? SpotBidPricePercent { get; set; }

        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public JobTaskForEachTaskTaskNewClusterAwsAttributesArgs()
        {
        }
        public static new JobTaskForEachTaskTaskNewClusterAwsAttributesArgs Empty => new JobTaskForEachTaskTaskNewClusterAwsAttributesArgs();
    }
}
