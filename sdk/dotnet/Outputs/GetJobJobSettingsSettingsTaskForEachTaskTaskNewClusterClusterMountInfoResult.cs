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
    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterClusterMountInfoResult
    {
        public readonly string LocalMountDirPath;
        public readonly Outputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterClusterMountInfoNetworkFilesystemInfoResult NetworkFilesystemInfo;
        public readonly string? RemoteMountDirPath;

        [OutputConstructor]
        private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterClusterMountInfoResult(
            string localMountDirPath,

            Outputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterClusterMountInfoNetworkFilesystemInfoResult networkFilesystemInfo,

            string? remoteMountDirPath)
        {
            LocalMountDirPath = localMountDirPath;
            NetworkFilesystemInfo = networkFilesystemInfo;
            RemoteMountDirPath = remoteMountDirPath;
        }
    }
}
