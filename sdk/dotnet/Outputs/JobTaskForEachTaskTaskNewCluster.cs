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
    public sealed class JobTaskForEachTaskTaskNewCluster
    {
        public readonly bool? ApplyPolicyDefaultValues;
        public readonly Outputs.JobTaskForEachTaskTaskNewClusterAutoscale? Autoscale;
        public readonly int? AutoterminationMinutes;
        public readonly Outputs.JobTaskForEachTaskTaskNewClusterAwsAttributes? AwsAttributes;
        public readonly Outputs.JobTaskForEachTaskTaskNewClusterAzureAttributes? AzureAttributes;
        public readonly string? ClusterId;
        public readonly Outputs.JobTaskForEachTaskTaskNewClusterClusterLogConf? ClusterLogConf;
        public readonly ImmutableArray<Outputs.JobTaskForEachTaskTaskNewClusterClusterMountInfo> ClusterMountInfos;
        public readonly string? ClusterName;
        public readonly ImmutableDictionary<string, object>? CustomTags;
        public readonly string? DataSecurityMode;
        public readonly Outputs.JobTaskForEachTaskTaskNewClusterDockerImage? DockerImage;
        public readonly string? DriverInstancePoolId;
        public readonly string? DriverNodeTypeId;
        public readonly bool? EnableElasticDisk;
        public readonly bool? EnableLocalDiskEncryption;
        public readonly Outputs.JobTaskForEachTaskTaskNewClusterGcpAttributes? GcpAttributes;
        public readonly string? IdempotencyToken;
        public readonly ImmutableArray<Outputs.JobTaskForEachTaskTaskNewClusterInitScript> InitScripts;
        public readonly string? InstancePoolId;
        public readonly string? NodeTypeId;
        public readonly int NumWorkers;
        public readonly string? PolicyId;
        public readonly string? RuntimeEngine;
        public readonly string? SingleUserName;
        public readonly ImmutableDictionary<string, object>? SparkConf;
        public readonly ImmutableDictionary<string, object>? SparkEnvVars;
        public readonly string SparkVersion;
        public readonly ImmutableArray<string> SshPublicKeys;
        public readonly Outputs.JobTaskForEachTaskTaskNewClusterWorkloadType? WorkloadType;

        [OutputConstructor]
        private JobTaskForEachTaskTaskNewCluster(
            bool? applyPolicyDefaultValues,

            Outputs.JobTaskForEachTaskTaskNewClusterAutoscale? autoscale,

            int? autoterminationMinutes,

            Outputs.JobTaskForEachTaskTaskNewClusterAwsAttributes? awsAttributes,

            Outputs.JobTaskForEachTaskTaskNewClusterAzureAttributes? azureAttributes,

            string? clusterId,

            Outputs.JobTaskForEachTaskTaskNewClusterClusterLogConf? clusterLogConf,

            ImmutableArray<Outputs.JobTaskForEachTaskTaskNewClusterClusterMountInfo> clusterMountInfos,

            string? clusterName,

            ImmutableDictionary<string, object>? customTags,

            string? dataSecurityMode,

            Outputs.JobTaskForEachTaskTaskNewClusterDockerImage? dockerImage,

            string? driverInstancePoolId,

            string? driverNodeTypeId,

            bool? enableElasticDisk,

            bool? enableLocalDiskEncryption,

            Outputs.JobTaskForEachTaskTaskNewClusterGcpAttributes? gcpAttributes,

            string? idempotencyToken,

            ImmutableArray<Outputs.JobTaskForEachTaskTaskNewClusterInitScript> initScripts,

            string? instancePoolId,

            string? nodeTypeId,

            int numWorkers,

            string? policyId,

            string? runtimeEngine,

            string? singleUserName,

            ImmutableDictionary<string, object>? sparkConf,

            ImmutableDictionary<string, object>? sparkEnvVars,

            string sparkVersion,

            ImmutableArray<string> sshPublicKeys,

            Outputs.JobTaskForEachTaskTaskNewClusterWorkloadType? workloadType)
        {
            ApplyPolicyDefaultValues = applyPolicyDefaultValues;
            Autoscale = autoscale;
            AutoterminationMinutes = autoterminationMinutes;
            AwsAttributes = awsAttributes;
            AzureAttributes = azureAttributes;
            ClusterId = clusterId;
            ClusterLogConf = clusterLogConf;
            ClusterMountInfos = clusterMountInfos;
            ClusterName = clusterName;
            CustomTags = customTags;
            DataSecurityMode = dataSecurityMode;
            DockerImage = dockerImage;
            DriverInstancePoolId = driverInstancePoolId;
            DriverNodeTypeId = driverNodeTypeId;
            EnableElasticDisk = enableElasticDisk;
            EnableLocalDiskEncryption = enableLocalDiskEncryption;
            GcpAttributes = gcpAttributes;
            IdempotencyToken = idempotencyToken;
            InitScripts = initScripts;
            InstancePoolId = instancePoolId;
            NodeTypeId = nodeTypeId;
            NumWorkers = numWorkers;
            PolicyId = policyId;
            RuntimeEngine = runtimeEngine;
            SingleUserName = singleUserName;
            SparkConf = sparkConf;
            SparkEnvVars = sparkEnvVars;
            SparkVersion = sparkVersion;
            SshPublicKeys = sshPublicKeys;
            WorkloadType = workloadType;
        }
    }
}
