// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskNotificationSettingsArgs : global::Pulumi.InvokeArgs
    {
        [Input("alertOnLastAttempt")]
        public bool? AlertOnLastAttempt { get; set; }

        [Input("noAlertForCanceledRuns")]
        public bool? NoAlertForCanceledRuns { get; set; }

        [Input("noAlertForSkippedRuns")]
        public bool? NoAlertForSkippedRuns { get; set; }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskNotificationSettingsArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskNotificationSettingsArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskNotificationSettingsArgs();
    }
}
