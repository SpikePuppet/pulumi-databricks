// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTriggerTableArgs : global::Pulumi.ResourceArgs
    {
        [Input("condition")]
        public Input<string>? Condition { get; set; }

        [Input("minTimeBetweenTriggersSeconds")]
        public Input<int>? MinTimeBetweenTriggersSeconds { get; set; }

        [Input("tableNames")]
        private InputList<string>? _tableNames;
        public InputList<string> TableNames
        {
            get => _tableNames ?? (_tableNames = new InputList<string>());
            set => _tableNames = value;
        }

        [Input("waitAfterLastChangeSeconds")]
        public Input<int>? WaitAfterLastChangeSeconds { get; set; }

        public JobTriggerTableArgs()
        {
        }
        public static new JobTriggerTableArgs Empty => new JobTriggerTableArgs();
    }
}
