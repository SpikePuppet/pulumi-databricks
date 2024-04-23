// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskForEachTaskTaskNewClusterInitScriptGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("abfss")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterInitScriptAbfssGetArgs>? Abfss { get; set; }

        [Input("dbfs")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterInitScriptDbfsGetArgs>? Dbfs { get; set; }

        [Input("file")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterInitScriptFileGetArgs>? File { get; set; }

        [Input("gcs")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterInitScriptGcsGetArgs>? Gcs { get; set; }

        [Input("s3")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterInitScriptS3GetArgs>? S3 { get; set; }

        [Input("volumes")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterInitScriptVolumesGetArgs>? Volumes { get; set; }

        [Input("workspace")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterInitScriptWorkspaceGetArgs>? Workspace { get; set; }

        public JobTaskForEachTaskTaskNewClusterInitScriptGetArgs()
        {
        }
        public static new JobTaskForEachTaskTaskNewClusterInitScriptGetArgs Empty => new JobTaskForEachTaskTaskNewClusterInitScriptGetArgs();
    }
}
