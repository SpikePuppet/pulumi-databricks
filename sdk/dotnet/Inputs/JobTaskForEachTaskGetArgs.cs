// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskForEachTaskGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Controls the number of active iteration task runs. Default is 20, maximum allowed is 100.
        /// </summary>
        [Input("concurrency")]
        public Input<int>? Concurrency { get; set; }

        /// <summary>
        /// (String) Array for task to iterate on. This can be a JSON string or a reference to an array parameter.
        /// </summary>
        [Input("inputs", required: true)]
        public Input<string> Inputs { get; set; } = null!;

        /// <summary>
        /// Task to run against the `inputs` list.
        /// </summary>
        [Input("task", required: true)]
        public Input<Inputs.JobTaskForEachTaskTaskGetArgs> Task { get; set; } = null!;

        public JobTaskForEachTaskGetArgs()
        {
        }
        public static new JobTaskForEachTaskGetArgs Empty => new JobTaskForEachTaskGetArgs();
    }
}
