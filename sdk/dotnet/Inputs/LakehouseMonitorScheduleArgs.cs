// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class LakehouseMonitorScheduleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// optional string field that indicates whether a schedule is paused (`PAUSED`) or not (`UNPAUSED`).
        /// </summary>
        [Input("pauseStatus")]
        public Input<string>? PauseStatus { get; set; }

        /// <summary>
        /// string expression that determines when to run the monitor. See [Quartz documentation](https://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html) for examples.
        /// </summary>
        [Input("quartzCronExpression", required: true)]
        public Input<string> QuartzCronExpression { get; set; } = null!;

        /// <summary>
        /// string with timezone id (e.g., `PST`) in which to evaluate the Quartz expression.
        /// </summary>
        [Input("timezoneId", required: true)]
        public Input<string> TimezoneId { get; set; } = null!;

        public LakehouseMonitorScheduleArgs()
        {
        }
        public static new LakehouseMonitorScheduleArgs Empty => new LakehouseMonitorScheduleArgs();
    }
}
