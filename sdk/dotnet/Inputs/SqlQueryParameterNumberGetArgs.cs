// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class SqlQueryParameterNumberGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("value", required: true)]
        public Input<double> Value { get; set; } = null!;

        public SqlQueryParameterNumberGetArgs()
        {
        }
        public static new SqlQueryParameterNumberGetArgs Empty => new SqlQueryParameterNumberGetArgs();
    }
}
