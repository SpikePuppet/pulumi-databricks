// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobJobClusterNewClusterInitScriptFileGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("destination", required: true)]
        public Input<string> Destination { get; set; } = null!;

        public JobJobClusterNewClusterInitScriptFileGetArgs()
        {
        }
        public static new JobJobClusterNewClusterInitScriptFileGetArgs Empty => new JobJobClusterNewClusterInitScriptFileGetArgs();
    }
}
