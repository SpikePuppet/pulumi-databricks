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
    public sealed class JobTaskForEachTaskTaskEmailNotifications
    {
        /// <summary>
        /// (Bool) don't send alert for skipped runs. (It's recommended to use the corresponding setting in the `notification_settings` configuration block).
        /// </summary>
        public readonly bool? NoAlertForSkippedRuns;
        /// <summary>
        /// (List) list of emails to notify when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
        /// </summary>
        public readonly ImmutableArray<string> OnDurationWarningThresholdExceededs;
        /// <summary>
        /// (List) list of emails to notify when the run fails.
        /// </summary>
        public readonly ImmutableArray<string> OnFailures;
        /// <summary>
        /// (List) list of emails to notify when the run starts.
        /// </summary>
        public readonly ImmutableArray<string> OnStarts;
        /// <summary>
        /// (List) list of emails to notify when the run completes successfully.
        /// </summary>
        public readonly ImmutableArray<string> OnSuccesses;

        [OutputConstructor]
        private JobTaskForEachTaskTaskEmailNotifications(
            bool? noAlertForSkippedRuns,

            ImmutableArray<string> onDurationWarningThresholdExceededs,

            ImmutableArray<string> onFailures,

            ImmutableArray<string> onStarts,

            ImmutableArray<string> onSuccesses)
        {
            NoAlertForSkippedRuns = noAlertForSkippedRuns;
            OnDurationWarningThresholdExceededs = onDurationWarningThresholdExceededs;
            OnFailures = onFailures;
            OnStarts = onStarts;
            OnSuccesses = onSuccesses;
        }
    }
}
