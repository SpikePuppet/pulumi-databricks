// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTaskArgs : global::Pulumi.InvokeArgs
    {
        [Input("left", required: true)]
        public string Left { get; set; } = null!;

        [Input("op", required: true)]
        public string Op { get; set; } = null!;

        [Input("right", required: true)]
        public string Right { get; set; } = null!;

        public GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTaskArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTaskArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTaskArgs();
    }
}
