// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskNewClusterInitScriptArgs : global::Pulumi.ResourceArgs
    {
        [Input("abfss")]
        public Input<Inputs.JobTaskNewClusterInitScriptAbfssArgs>? Abfss { get; set; }

        [Input("dbfs")]
        public Input<Inputs.JobTaskNewClusterInitScriptDbfsArgs>? Dbfs { get; set; }

        [Input("file")]
        public Input<Inputs.JobTaskNewClusterInitScriptFileArgs>? File { get; set; }

        [Input("gcs")]
        public Input<Inputs.JobTaskNewClusterInitScriptGcsArgs>? Gcs { get; set; }

        [Input("s3")]
        public Input<Inputs.JobTaskNewClusterInitScriptS3Args>? S3 { get; set; }

        [Input("volumes")]
        public Input<Inputs.JobTaskNewClusterInitScriptVolumesArgs>? Volumes { get; set; }

        [Input("workspace")]
        public Input<Inputs.JobTaskNewClusterInitScriptWorkspaceArgs>? Workspace { get; set; }

        public JobTaskNewClusterInitScriptArgs()
        {
        }
        public static new JobTaskNewClusterInitScriptArgs Empty => new JobTaskNewClusterInitScriptArgs();
    }
}
