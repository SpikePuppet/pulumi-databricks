// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskHealthRuleInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("metric")]
        public Input<string>? Metric { get; set; }

        [Input("op")]
        public Input<string>? Op { get; set; }

        [Input("value")]
        public Input<int>? Value { get; set; }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskHealthRuleInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskHealthRuleInputArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskHealthRuleInputArgs();
    }
}
