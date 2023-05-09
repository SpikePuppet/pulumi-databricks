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
    public sealed class JobJobClusterNewClusterInitScript
    {
        public readonly Outputs.JobJobClusterNewClusterInitScriptAbfss? Abfss;
        public readonly Outputs.JobJobClusterNewClusterInitScriptDbfs? Dbfs;
        /// <summary>
        /// block consisting of single string field: `path` - a relative path to the file (inside the Git repository) with SQL commands to execute.  *Requires `git_source` configuration block*.
        /// </summary>
        public readonly Outputs.JobJobClusterNewClusterInitScriptFile? File;
        public readonly Outputs.JobJobClusterNewClusterInitScriptGcs? Gcs;
        public readonly Outputs.JobJobClusterNewClusterInitScriptS3? S3;
        public readonly Outputs.JobJobClusterNewClusterInitScriptWorkspace? Workspace;

        [OutputConstructor]
        private JobJobClusterNewClusterInitScript(
            Outputs.JobJobClusterNewClusterInitScriptAbfss? abfss,

            Outputs.JobJobClusterNewClusterInitScriptDbfs? dbfs,

            Outputs.JobJobClusterNewClusterInitScriptFile? file,

            Outputs.JobJobClusterNewClusterInitScriptGcs? gcs,

            Outputs.JobJobClusterNewClusterInitScriptS3? s3,

            Outputs.JobJobClusterNewClusterInitScriptWorkspace? workspace)
        {
            Abfss = abfss;
            Dbfs = dbfs;
            File = file;
            Gcs = gcs;
            S3 = s3;
            Workspace = workspace;
        }
    }
}
