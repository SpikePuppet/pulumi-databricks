// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskHealthRuleInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("metric", required: true)]
        public Input<string> Metric { get; set; } = null!;

        [Input("op", required: true)]
        public Input<string> Op { get; set; } = null!;

        [Input("value", required: true)]
        public Input<int> Value { get; set; } = null!;

        public GetJobJobSettingsSettingsTaskHealthRuleInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskHealthRuleInputArgs Empty => new GetJobJobSettingsSettingsTaskHealthRuleInputArgs();
    }
}
