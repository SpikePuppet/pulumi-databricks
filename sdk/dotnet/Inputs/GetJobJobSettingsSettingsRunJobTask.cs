// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsRunJobTaskArgs : global::Pulumi.InvokeArgs
    {
        [Input("jobId", required: true)]
        public string JobId { get; set; } = null!;

        [Input("jobParameters")]
        private Dictionary<string, object>? _jobParameters;
        public Dictionary<string, object> JobParameters
        {
            get => _jobParameters ?? (_jobParameters = new Dictionary<string, object>());
            set => _jobParameters = value;
        }

        public GetJobJobSettingsSettingsRunJobTaskArgs()
        {
        }
        public static new GetJobJobSettingsSettingsRunJobTaskArgs Empty => new GetJobJobSettingsSettingsRunJobTaskArgs();
    }
}
