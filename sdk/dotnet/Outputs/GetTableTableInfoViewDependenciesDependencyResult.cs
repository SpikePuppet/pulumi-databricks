// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetTableTableInfoViewDependenciesDependencyResult
    {
        public readonly Outputs.GetTableTableInfoViewDependenciesDependencyFunctionResult? Function;
        public readonly Outputs.GetTableTableInfoViewDependenciesDependencyTableResult? Table;

        [OutputConstructor]
        private GetTableTableInfoViewDependenciesDependencyResult(
            Outputs.GetTableTableInfoViewDependenciesDependencyFunctionResult? function,

            Outputs.GetTableTableInfoViewDependenciesDependencyTableResult? table)
        {
            Function = function;
            Table = table;
        }
    }
}
