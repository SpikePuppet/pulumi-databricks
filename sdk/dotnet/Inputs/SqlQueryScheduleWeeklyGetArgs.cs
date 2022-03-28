// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class SqlQueryScheduleWeeklyGetArgs : Pulumi.ResourceArgs
    {
        [Input("dayOfWeek", required: true)]
        public Input<string> DayOfWeek { get; set; } = null!;

        [Input("intervalWeeks", required: true)]
        public Input<int> IntervalWeeks { get; set; } = null!;

        [Input("timeOfDay", required: true)]
        public Input<string> TimeOfDay { get; set; } = null!;

        [Input("untilDate")]
        public Input<string>? UntilDate { get; set; }

        public SqlQueryScheduleWeeklyGetArgs()
        {
        }
    }
}
