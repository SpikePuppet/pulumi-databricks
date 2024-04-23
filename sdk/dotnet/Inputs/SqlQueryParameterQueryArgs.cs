// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class SqlQueryParameterQueryArgs : global::Pulumi.ResourceArgs
    {
        [Input("multiple")]
        public Input<Inputs.SqlQueryParameterQueryMultipleArgs>? Multiple { get; set; }

        [Input("queryId", required: true)]
        public Input<string> QueryId { get; set; } = null!;

        [Input("value")]
        public Input<string>? Value { get; set; }

        [Input("values")]
        private InputList<string>? _values;
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public SqlQueryParameterQueryArgs()
        {
        }
        public static new SqlQueryParameterQueryArgs Empty => new SqlQueryParameterQueryArgs();
    }
}
