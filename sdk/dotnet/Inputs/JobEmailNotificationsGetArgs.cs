// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobEmailNotificationsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("noAlertForSkippedRuns")]
        public Input<bool>? NoAlertForSkippedRuns { get; set; }

        [Input("onDurationWarningThresholdExceededs")]
        private InputList<string>? _onDurationWarningThresholdExceededs;
        public InputList<string> OnDurationWarningThresholdExceededs
        {
            get => _onDurationWarningThresholdExceededs ?? (_onDurationWarningThresholdExceededs = new InputList<string>());
            set => _onDurationWarningThresholdExceededs = value;
        }

        [Input("onFailures")]
        private InputList<string>? _onFailures;
        public InputList<string> OnFailures
        {
            get => _onFailures ?? (_onFailures = new InputList<string>());
            set => _onFailures = value;
        }

        [Input("onStarts")]
        private InputList<string>? _onStarts;
        public InputList<string> OnStarts
        {
            get => _onStarts ?? (_onStarts = new InputList<string>());
            set => _onStarts = value;
        }

        [Input("onSuccesses")]
        private InputList<string>? _onSuccesses;
        public InputList<string> OnSuccesses
        {
            get => _onSuccesses ?? (_onSuccesses = new InputList<string>());
            set => _onSuccesses = value;
        }

        public JobEmailNotificationsGetArgs()
        {
        }
        public static new JobEmailNotificationsGetArgs Empty => new JobEmailNotificationsGetArgs();
    }
}
