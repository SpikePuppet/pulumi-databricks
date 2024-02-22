// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskNewClusterInitScriptGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("abfss")]
        public Input<Inputs.JobTaskNewClusterInitScriptAbfssGetArgs>? Abfss { get; set; }

        [Input("dbfs")]
        public Input<Inputs.JobTaskNewClusterInitScriptDbfsGetArgs>? Dbfs { get; set; }

        /// <summary>
        /// block consisting of single string fields:
        /// </summary>
        [Input("file")]
        public Input<Inputs.JobTaskNewClusterInitScriptFileGetArgs>? File { get; set; }

        [Input("gcs")]
        public Input<Inputs.JobTaskNewClusterInitScriptGcsGetArgs>? Gcs { get; set; }

        [Input("s3")]
        public Input<Inputs.JobTaskNewClusterInitScriptS3GetArgs>? S3 { get; set; }

        [Input("volumes")]
        public Input<Inputs.JobTaskNewClusterInitScriptVolumesGetArgs>? Volumes { get; set; }

        [Input("workspace")]
        public Input<Inputs.JobTaskNewClusterInitScriptWorkspaceGetArgs>? Workspace { get; set; }

        public JobTaskNewClusterInitScriptGetArgs()
        {
        }
        public static new JobTaskNewClusterInitScriptGetArgs Empty => new JobTaskNewClusterInitScriptGetArgs();
    }
}
