// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobQueueGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, enable queueing for the job.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public JobQueueGetArgs()
        {
        }
        public static new JobQueueGetArgs Empty => new JobQueueGetArgs();
    }
}
