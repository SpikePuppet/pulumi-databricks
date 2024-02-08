// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ClusterInitScriptVolumesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// S3 destination, e.g., `s3://my-bucket/some-prefix` You must configure the cluster with an instance profile, and the instance profile must have write access to the destination. You cannot use AWS keys.
        /// </summary>
        [Input("destination", required: true)]
        public Input<string> Destination { get; set; } = null!;

        public ClusterInitScriptVolumesGetArgs()
        {
        }
        public static new ClusterInitScriptVolumesGetArgs Empty => new ClusterInitScriptVolumesGetArgs();
    }
}
