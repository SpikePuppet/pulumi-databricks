// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class JobTaskForEachTaskTaskNotificationSettings
    {
        /// <summary>
        /// (Bool) do not send notifications to recipients specified in `on_start` for the retried runs and do not send notifications to recipients specified in `on_failure` until the last retry of the run.
        /// </summary>
        public readonly bool? AlertOnLastAttempt;
        /// <summary>
        /// (Bool) don't send alert for cancelled runs.
        /// </summary>
        public readonly bool? NoAlertForCanceledRuns;
        /// <summary>
        /// (Bool) don't send alert for skipped runs.
        /// </summary>
        public readonly bool? NoAlertForSkippedRuns;

        [OutputConstructor]
        private JobTaskForEachTaskTaskNotificationSettings(
            bool? alertOnLastAttempt,

            bool? noAlertForCanceledRuns,

            bool? noAlertForSkippedRuns)
        {
            AlertOnLastAttempt = alertOnLastAttempt;
            NoAlertForCanceledRuns = noAlertForCanceledRuns;
            NoAlertForSkippedRuns = noAlertForSkippedRuns;
        }
    }
}
