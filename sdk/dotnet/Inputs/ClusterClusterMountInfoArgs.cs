// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ClusterClusterMountInfoArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// path inside the Spark container.
        /// 
        /// For example, you can mount Azure Data Lake Storage container using the following code:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var storageAccount = "ewfw3ggwegwg";
        /// 
        ///     var storageContainer = "test";
        /// 
        ///     var withNfs = new Databricks.Cluster("with_nfs", new()
        ///     {
        ///         ClusterMountInfos = new[]
        ///         {
        ///             new Databricks.Inputs.ClusterClusterMountInfoArgs
        ///             {
        ///                 NetworkFilesystemInfo = new Databricks.Inputs.ClusterClusterMountInfoNetworkFilesystemInfoArgs
        ///                 {
        ///                     ServerAddress = $"{storageAccount}.blob.core.windows.net",
        ///                     MountOptions = "sec=sys,vers=3,nolock,proto=tcp",
        ///                 },
        ///                 RemoteMountDirPath = $"{storageAccount}/{storageContainer}",
        ///                 LocalMountDirPath = "/mnt/nfs-test",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        [Input("localMountDirPath", required: true)]
        public Input<string> LocalMountDirPath { get; set; } = null!;

        /// <summary>
        /// block specifying connection. It consists of:
        /// </summary>
        [Input("networkFilesystemInfo", required: true)]
        public Input<Inputs.ClusterClusterMountInfoNetworkFilesystemInfoArgs> NetworkFilesystemInfo { get; set; } = null!;

        /// <summary>
        /// string specifying path to mount on the remote service.
        /// </summary>
        [Input("remoteMountDirPath")]
        public Input<string>? RemoteMountDirPath { get; set; }

        public ClusterClusterMountInfoArgs()
        {
        }
        public static new ClusterClusterMountInfoArgs Empty => new ClusterClusterMountInfoArgs();
    }
}
