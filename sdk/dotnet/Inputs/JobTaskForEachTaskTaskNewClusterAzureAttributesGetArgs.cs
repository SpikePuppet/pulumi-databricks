// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskForEachTaskTaskNewClusterAzureAttributesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("availability")]
        public Input<string>? Availability { get; set; }

        [Input("firstOnDemand")]
        public Input<int>? FirstOnDemand { get; set; }

        [Input("logAnalyticsInfo")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterAzureAttributesLogAnalyticsInfoGetArgs>? LogAnalyticsInfo { get; set; }

        [Input("spotBidMaxPrice")]
        public Input<double>? SpotBidMaxPrice { get; set; }

        public JobTaskForEachTaskTaskNewClusterAzureAttributesGetArgs()
        {
        }
        public static new JobTaskForEachTaskTaskNewClusterAzureAttributesGetArgs Empty => new JobTaskForEachTaskTaskNewClusterAzureAttributesGetArgs();
    }
}
