// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class SqlQueryParameterDateRangeArgs : global::Pulumi.ResourceArgs
    {
        [Input("range")]
        public Input<Inputs.SqlQueryParameterDateRangeRangeArgs>? Range { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public SqlQueryParameterDateRangeArgs()
        {
        }
        public static new SqlQueryParameterDateRangeArgs Empty => new SqlQueryParameterDateRangeArgs();
    }
}
