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
    public sealed class JobTriggerTableUpdate
    {
        public readonly string? Condition;
        public readonly int? MinTimeBetweenTriggersSeconds;
        public readonly ImmutableArray<string> TableNames;
        public readonly int? WaitAfterLastChangeSeconds;

        [OutputConstructor]
        private JobTriggerTableUpdate(
            string? condition,

            int? minTimeBetweenTriggersSeconds,

            ImmutableArray<string> tableNames,

            int? waitAfterLastChangeSeconds)
        {
            Condition = condition;
            MinTimeBetweenTriggersSeconds = minTimeBetweenTriggersSeconds;
            TableNames = tableNames;
            WaitAfterLastChangeSeconds = waitAfterLastChangeSeconds;
        }
    }
}
