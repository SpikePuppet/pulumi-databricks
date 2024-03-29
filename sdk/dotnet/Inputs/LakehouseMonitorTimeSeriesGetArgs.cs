// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class LakehouseMonitorTimeSeriesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("granularities")]
        private InputList<string>? _granularities;

        /// <summary>
        /// List of granularities to use when aggregating data into time windows based on their timestamp.
        /// </summary>
        public InputList<string> Granularities
        {
            get => _granularities ?? (_granularities = new InputList<string>());
            set => _granularities = value;
        }

        /// <summary>
        /// Column of the timestamp of predictions
        /// </summary>
        [Input("timestampCol")]
        public Input<string>? TimestampCol { get; set; }

        public LakehouseMonitorTimeSeriesGetArgs()
        {
        }
        public static new LakehouseMonitorTimeSeriesGetArgs Empty => new LakehouseMonitorTimeSeriesGetArgs();
    }
}
