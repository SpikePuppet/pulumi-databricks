// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetShareObjectPartitionArgs : global::Pulumi.InvokeArgs
    {
        [Input("values", required: true)]
        private List<Inputs.GetShareObjectPartitionValueArgs>? _values;
        public List<Inputs.GetShareObjectPartitionValueArgs> Values
        {
            get => _values ?? (_values = new List<Inputs.GetShareObjectPartitionValueArgs>());
            set => _values = value;
        }

        public GetShareObjectPartitionArgs()
        {
        }
        public static new GetShareObjectPartitionArgs Empty => new GetShareObjectPartitionArgs();
    }
}
