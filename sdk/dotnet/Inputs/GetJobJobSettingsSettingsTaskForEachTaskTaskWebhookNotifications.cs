// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsArgs : global::Pulumi.InvokeArgs
    {
        [Input("onDurationWarningThresholdExceededs")]
        private List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnDurationWarningThresholdExceededArgs>? _onDurationWarningThresholdExceededs;
        public List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnDurationWarningThresholdExceededArgs> OnDurationWarningThresholdExceededs
        {
            get => _onDurationWarningThresholdExceededs ?? (_onDurationWarningThresholdExceededs = new List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnDurationWarningThresholdExceededArgs>());
            set => _onDurationWarningThresholdExceededs = value;
        }

        [Input("onFailures")]
        private List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs>? _onFailures;
        public List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs> OnFailures
        {
            get => _onFailures ?? (_onFailures = new List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs>());
            set => _onFailures = value;
        }

        [Input("onStarts")]
        private List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnStartArgs>? _onStarts;
        public List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnStartArgs> OnStarts
        {
            get => _onStarts ?? (_onStarts = new List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnStartArgs>());
            set => _onStarts = value;
        }

        [Input("onSuccesses")]
        private List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnSuccessArgs>? _onSuccesses;
        public List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnSuccessArgs> OnSuccesses
        {
            get => _onSuccesses ?? (_onSuccesses = new List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnSuccessArgs>());
            set => _onSuccesses = value;
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsArgs();
    }
}
