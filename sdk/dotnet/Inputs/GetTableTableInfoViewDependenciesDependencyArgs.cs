// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetTableTableInfoViewDependenciesDependencyInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("function")]
        public Input<Inputs.GetTableTableInfoViewDependenciesDependencyFunctionInputArgs>? Function { get; set; }

        [Input("table")]
        public Input<Inputs.GetTableTableInfoViewDependenciesDependencyTableInputArgs>? Table { get; set; }

        public GetTableTableInfoViewDependenciesDependencyInputArgs()
        {
        }
        public static new GetTableTableInfoViewDependenciesDependencyInputArgs Empty => new GetTableTableInfoViewDependenciesDependencyInputArgs();
    }
}
