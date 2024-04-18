// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskWebhookNotificationsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("onDurationWarningThresholdExceededs")]
        private InputList<Inputs.JobTaskWebhookNotificationsOnDurationWarningThresholdExceededGetArgs>? _onDurationWarningThresholdExceededs;

        /// <summary>
        /// (List) list of notification IDs to call when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
        /// 
        /// Note that the `id` is not to be confused with the name of the alert destination. The `id` can be retrieved through the API or the URL of Databricks UI `https://&lt;workspace host&gt;/sql/destinations/&lt;notification id&gt;?o=&lt;workspace id&gt;`
        /// 
        /// Example
        /// </summary>
        public InputList<Inputs.JobTaskWebhookNotificationsOnDurationWarningThresholdExceededGetArgs> OnDurationWarningThresholdExceededs
        {
            get => _onDurationWarningThresholdExceededs ?? (_onDurationWarningThresholdExceededs = new InputList<Inputs.JobTaskWebhookNotificationsOnDurationWarningThresholdExceededGetArgs>());
            set => _onDurationWarningThresholdExceededs = value;
        }

        [Input("onFailures")]
        private InputList<Inputs.JobTaskWebhookNotificationsOnFailureGetArgs>? _onFailures;

        /// <summary>
        /// (List) list of notification IDs to call when the run fails. A maximum of 3 destinations can be specified.
        /// </summary>
        public InputList<Inputs.JobTaskWebhookNotificationsOnFailureGetArgs> OnFailures
        {
            get => _onFailures ?? (_onFailures = new InputList<Inputs.JobTaskWebhookNotificationsOnFailureGetArgs>());
            set => _onFailures = value;
        }

        [Input("onStarts")]
        private InputList<Inputs.JobTaskWebhookNotificationsOnStartGetArgs>? _onStarts;

        /// <summary>
        /// (List) list of notification IDs to call when the run starts. A maximum of 3 destinations can be specified.
        /// </summary>
        public InputList<Inputs.JobTaskWebhookNotificationsOnStartGetArgs> OnStarts
        {
            get => _onStarts ?? (_onStarts = new InputList<Inputs.JobTaskWebhookNotificationsOnStartGetArgs>());
            set => _onStarts = value;
        }

        [Input("onSuccesses")]
        private InputList<Inputs.JobTaskWebhookNotificationsOnSuccessGetArgs>? _onSuccesses;

        /// <summary>
        /// (List) list of notification IDs to call when the run completes successfully. A maximum of 3 destinations can be specified.
        /// </summary>
        public InputList<Inputs.JobTaskWebhookNotificationsOnSuccessGetArgs> OnSuccesses
        {
            get => _onSuccesses ?? (_onSuccesses = new InputList<Inputs.JobTaskWebhookNotificationsOnSuccessGetArgs>());
            set => _onSuccesses = value;
        }

        public JobTaskWebhookNotificationsGetArgs()
        {
        }
        public static new JobTaskWebhookNotificationsGetArgs Empty => new JobTaskWebhookNotificationsGetArgs();
    }
}
