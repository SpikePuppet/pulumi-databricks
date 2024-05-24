// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MwsWorkspacesCloudResourceContainerGcpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Google Cloud project ID, which the workspace uses to instantiate cloud resources for your workspace.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public MwsWorkspacesCloudResourceContainerGcpArgs()
        {
        }
        public static new MwsWorkspacesCloudResourceContainerGcpArgs Empty => new MwsWorkspacesCloudResourceContainerGcpArgs();
    }
}
