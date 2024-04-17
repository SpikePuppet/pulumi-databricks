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
    public sealed class OnlineTableSpec
    {
        /// <summary>
        /// Whether to create a full-copy pipeline -- a pipeline that stops after creates a full copy of the source table upon initialization and does not process any change data feeds (CDFs) afterwards. The pipeline can still be manually triggered afterwards, but it always perform a full copy of the source table and there are no incremental updates. This mode is useful for syncing views or tables without CDFs to online tables. Note that the full-copy pipeline only supports "triggered" scheduling policy.
        /// </summary>
        public readonly bool? PerformFullCopy;
        /// <summary>
        /// ID of the associated Delta Live Table pipeline.
        /// </summary>
        public readonly string? PipelineId;
        /// <summary>
        /// list of the columns comprising the primary key.
        /// </summary>
        public readonly ImmutableArray<string> PrimaryKeyColumns;
        /// <summary>
        /// empty block that specifies that pipeline runs continuously after generating the initial data.  Conflicts with `run_triggered`.
        /// </summary>
        public readonly Outputs.OnlineTableSpecRunContinuously? RunContinuously;
        /// <summary>
        /// empty block that specifies that pipeline stops after generating the initial data and can be triggered later (manually, through a cron job or through data triggers).
        /// </summary>
        public readonly Outputs.OnlineTableSpecRunTriggered? RunTriggered;
        /// <summary>
        /// full name of the source table.
        /// </summary>
        public readonly string? SourceTableFullName;
        /// <summary>
        /// Time series key to deduplicate (tie-break) rows with the same primary key.
        /// </summary>
        public readonly string? TimeseriesKey;

        [OutputConstructor]
        private OnlineTableSpec(
            bool? performFullCopy,

            string? pipelineId,

            ImmutableArray<string> primaryKeyColumns,

            Outputs.OnlineTableSpecRunContinuously? runContinuously,

            Outputs.OnlineTableSpecRunTriggered? runTriggered,

            string? sourceTableFullName,

            string? timeseriesKey)
        {
            PerformFullCopy = performFullCopy;
            PipelineId = pipelineId;
            PrimaryKeyColumns = primaryKeyColumns;
            RunContinuously = runContinuously;
            RunTriggered = runTriggered;
            SourceTableFullName = sourceTableFullName;
            TimeseriesKey = timeseriesKey;
        }
    }
}