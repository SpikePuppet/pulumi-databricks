// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetTableTableInfoEffectivePredictiveOptimizationFlagArgs : global::Pulumi.InvokeArgs
    {
        [Input("inheritedFromName")]
        public string? InheritedFromName { get; set; }

        [Input("inheritedFromType")]
        public string? InheritedFromType { get; set; }

        [Input("value", required: true)]
        public string Value { get; set; } = null!;

        public GetTableTableInfoEffectivePredictiveOptimizationFlagArgs()
        {
        }
        public static new GetTableTableInfoEffectivePredictiveOptimizationFlagArgs Empty => new GetTableTableInfoEffectivePredictiveOptimizationFlagArgs();
    }
}
