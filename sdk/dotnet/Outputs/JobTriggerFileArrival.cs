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
    public sealed class JobTriggerFileArrival
    {
        /// <summary>
        /// If set, the trigger starts a run only after the specified amount of time passed since the last time the trigger fired. The minimum allowed value is 60 seconds.
        /// </summary>
        public readonly int? MinTimeBetweenTriggersSeconds;
        /// <summary>
        /// URL of the job on the given workspace
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// If set, the trigger starts a run only after no file activity has occurred for the specified amount of time. This makes it possible to wait for a batch of incoming files to arrive before triggering a run. The minimum allowed value is 60 seconds.
        /// </summary>
        public readonly int? WaitAfterLastChangeSeconds;

        [OutputConstructor]
        private JobTriggerFileArrival(
            int? minTimeBetweenTriggersSeconds,

            string url,

            int? waitAfterLastChangeSeconds)
        {
            MinTimeBetweenTriggersSeconds = minTimeBetweenTriggersSeconds;
            Url = url;
            WaitAfterLastChangeSeconds = waitAfterLastChangeSeconds;
        }
    }
}
