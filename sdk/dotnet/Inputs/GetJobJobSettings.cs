// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsArgs : global::Pulumi.InvokeArgs
    {
        [Input("createdTime")]
        public int? CreatedTime { get; set; }

        [Input("creatorUserName")]
        public string? CreatorUserName { get; set; }

        /// <summary>
        /// the id of databricks.Job if the resource was matched by name.
        /// </summary>
        [Input("jobId")]
        public int? JobId { get; set; }

        [Input("settings")]
        public Inputs.GetJobJobSettingsSettingsArgs? Settings { get; set; }

        public GetJobJobSettingsArgs()
        {
        }
        public static new GetJobJobSettingsArgs Empty => new GetJobJobSettingsArgs();
    }
}