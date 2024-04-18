// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskWebhookNotificationsArgs : global::Pulumi.ResourceArgs
    {
        [Input("onDurationWarningThresholdExceededs")]
        private InputList<Inputs.JobTaskWebhookNotificationsOnDurationWarningThresholdExceededArgs>? _onDurationWarningThresholdExceededs;

        /// <summary>
        /// (List) list of notification IDs to call when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
        /// 
        /// Note that the `id` is not to be confused with the name of the alert destination. The `id` can be retrieved through the API or the URL of Databricks UI `https://&lt;workspace host&gt;/sql/destinations/&lt;notification id&gt;?o=&lt;workspace id&gt;`
        /// 
        /// Example
        /// </summary>
        public InputList<Inputs.JobTaskWebhookNotificationsOnDurationWarningThresholdExceededArgs> OnDurationWarningThresholdExceededs
        {
            get => _onDurationWarningThresholdExceededs ?? (_onDurationWarningThresholdExceededs = new InputList<Inputs.JobTaskWebhookNotificationsOnDurationWarningThresholdExceededArgs>());
            set => _onDurationWarningThresholdExceededs = value;
        }

        [Input("onFailures")]
        private InputList<Inputs.JobTaskWebhookNotificationsOnFailureArgs>? _onFailures;

        /// <summary>
        /// (List) list of notification IDs to call when the run fails. A maximum of 3 destinations can be specified.
        /// </summary>
        public InputList<Inputs.JobTaskWebhookNotificationsOnFailureArgs> OnFailures
        {
            get => _onFailures ?? (_onFailures = new InputList<Inputs.JobTaskWebhookNotificationsOnFailureArgs>());
            set => _onFailures = value;
        }

        [Input("onStarts")]
        private InputList<Inputs.JobTaskWebhookNotificationsOnStartArgs>? _onStarts;

        /// <summary>
        /// (List) list of notification IDs to call when the run starts. A maximum of 3 destinations can be specified.
        /// </summary>
        public InputList<Inputs.JobTaskWebhookNotificationsOnStartArgs> OnStarts
        {
            get => _onStarts ?? (_onStarts = new InputList<Inputs.JobTaskWebhookNotificationsOnStartArgs>());
            set => _onStarts = value;
        }

        [Input("onSuccesses")]
        private InputList<Inputs.JobTaskWebhookNotificationsOnSuccessArgs>? _onSuccesses;

        /// <summary>
        /// (List) list of notification IDs to call when the run completes successfully. A maximum of 3 destinations can be specified.
        /// </summary>
        public InputList<Inputs.JobTaskWebhookNotificationsOnSuccessArgs> OnSuccesses
        {
            get => _onSuccesses ?? (_onSuccesses = new InputList<Inputs.JobTaskWebhookNotificationsOnSuccessArgs>());
            set => _onSuccesses = value;
        }

        public JobTaskWebhookNotificationsArgs()
        {
        }
        public static new JobTaskWebhookNotificationsArgs Empty => new JobTaskWebhookNotificationsArgs();
    }
}
