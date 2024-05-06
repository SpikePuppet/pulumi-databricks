// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskNotificationSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Bool) do not send notifications to recipients specified in `on_start` for the retried runs and do not send notifications to recipients specified in `on_failure` until the last retry of the run.
        /// </summary>
        [Input("alertOnLastAttempt")]
        public Input<bool>? AlertOnLastAttempt { get; set; }

        /// <summary>
        /// (Bool) don't send alert for cancelled runs.
        /// 
        /// The following parameter is only available on task level.
        /// </summary>
        [Input("noAlertForCanceledRuns")]
        public Input<bool>? NoAlertForCanceledRuns { get; set; }

        /// <summary>
        /// (Bool) don't send alert for skipped runs.
        /// </summary>
        [Input("noAlertForSkippedRuns")]
        public Input<bool>? NoAlertForSkippedRuns { get; set; }

        public JobTaskNotificationSettingsGetArgs()
        {
        }
        public static new JobTaskNotificationSettingsGetArgs Empty => new JobTaskNotificationSettingsGetArgs();
    }
}
