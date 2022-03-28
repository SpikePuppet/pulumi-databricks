// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobScheduleGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicate whether this schedule is paused or not. Either “PAUSED” or “UNPAUSED”. When the pause_status field is omitted and a schedule is provided, the server will default to using "UNPAUSED" as a value for pause_status.
        /// </summary>
        [Input("pauseStatus")]
        public Input<string>? PauseStatus { get; set; }

        /// <summary>
        /// A [Cron expression using Quartz syntax](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html) that describes the schedule for a job. This field is required.
        /// </summary>
        [Input("quartzCronExpression", required: true)]
        public Input<string> QuartzCronExpression { get; set; } = null!;

        /// <summary>
        /// A Java timezone ID. The schedule for a job will be resolved with respect to this timezone. See Java TimeZone for details. This field is required.
        /// </summary>
        [Input("timezoneId", required: true)]
        public Input<string> TimezoneId { get; set; } = null!;

        public JobScheduleGetArgs()
        {
        }
    }
}
