// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class SqlQueryParameterDatetimeRangeGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("range")]
        public Input<Inputs.SqlQueryParameterDatetimeRangeRangeGetArgs>? Range { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public SqlQueryParameterDatetimeRangeGetArgs()
        {
        }
        public static new SqlQueryParameterDatetimeRangeGetArgs Empty => new SqlQueryParameterDatetimeRangeGetArgs();
    }
}
