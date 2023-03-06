// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobContinuousGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicate whether this continuous job is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted in the block, the server will default to using `UNPAUSED` as a value for `pause_status`.
        /// </summary>
        [Input("pauseStatus")]
        public Input<string>? PauseStatus { get; set; }

        public JobContinuousGetArgs()
        {
        }
        public static new JobContinuousGetArgs Empty => new JobContinuousGetArgs();
    }
}
