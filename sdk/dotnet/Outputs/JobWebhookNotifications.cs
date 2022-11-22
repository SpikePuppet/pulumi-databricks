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
    public sealed class JobWebhookNotifications
    {
        /// <summary>
        /// (List) list of emails to notify on failure
        /// </summary>
        public readonly ImmutableArray<Outputs.JobWebhookNotificationsOnFailure> OnFailures;
        /// <summary>
        /// (List) list of emails to notify on failure
        /// </summary>
        public readonly ImmutableArray<Outputs.JobWebhookNotificationsOnStart> OnStarts;
        /// <summary>
        /// (List) list of emails to notify on failure
        /// </summary>
        public readonly ImmutableArray<Outputs.JobWebhookNotificationsOnSuccess> OnSuccesses;

        [OutputConstructor]
        private JobWebhookNotifications(
            ImmutableArray<Outputs.JobWebhookNotificationsOnFailure> onFailures,

            ImmutableArray<Outputs.JobWebhookNotificationsOnStart> onStarts,

            ImmutableArray<Outputs.JobWebhookNotificationsOnSuccess> onSuccesses)
        {
            OnFailures = onFailures;
            OnStarts = onStarts;
            OnSuccesses = onSuccesses;
        }
    }
}
