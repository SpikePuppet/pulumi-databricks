// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnDurationWarningThresholdExceededInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// the id of databricks.Job if the resource was matched by name.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnDurationWarningThresholdExceededInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnDurationWarningThresholdExceededInputArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnDurationWarningThresholdExceededInputArgs();
    }
}
