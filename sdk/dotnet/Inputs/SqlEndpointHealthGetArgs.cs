// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class SqlEndpointHealthGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("details")]
        public Input<string>? Details { get; set; }

        [Input("failureReason")]
        public Input<Inputs.SqlEndpointHealthFailureReasonGetArgs>? FailureReason { get; set; }

        [Input("message")]
        public Input<string>? Message { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("summary")]
        public Input<string>? Summary { get; set; }

        public SqlEndpointHealthGetArgs()
        {
        }
        public static new SqlEndpointHealthGetArgs Empty => new SqlEndpointHealthGetArgs();
    }
}