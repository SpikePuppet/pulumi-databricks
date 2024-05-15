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
    public sealed class JobTaskNewCluster
    {
        public readonly bool? ApplyPolicyDefaultValues;
        public readonly Outputs.JobTaskNewClusterAutoscale? Autoscale;
        public readonly int? AutoterminationMinutes;
        public readonly Outputs.JobTaskNewClusterAwsAttributes? AwsAttributes;
        public readonly Outputs.JobTaskNewClusterAzureAttributes? AzureAttributes;
        public readonly Outputs.JobTaskNewClusterCloneFrom? CloneFrom;
        public readonly string? ClusterId;
        public readonly Outputs.JobTaskNewClusterClusterLogConf? ClusterLogConf;
        public readonly ImmutableArray<Outputs.JobTaskNewClusterClusterMountInfo> ClusterMountInfos;
        public readonly string? ClusterName;
        public readonly ImmutableDictionary<string, object>? CustomTags;
        public readonly string? DataSecurityMode;
        public readonly Outputs.JobTaskNewClusterDockerImage? DockerImage;
        public readonly string? DriverInstancePoolId;
        public readonly string? DriverNodeTypeId;
        public readonly bool? EnableElasticDisk;
        public readonly bool? EnableLocalDiskEncryption;
        public readonly Outputs.JobTaskNewClusterGcpAttributes? GcpAttributes;
        public readonly string? IdempotencyToken;
        public readonly ImmutableArray<Outputs.JobTaskNewClusterInitScript> InitScripts;
        public readonly string? InstancePoolId;
        /// <summary>
        /// (List) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section of the databricks.Cluster resource for more information.
        /// </summary>
        public readonly ImmutableArray<Outputs.JobTaskNewClusterLibrary> Libraries;
        public readonly string? NodeTypeId;
        public readonly int? NumWorkers;
        public readonly string? PolicyId;
        public readonly string? RuntimeEngine;
        public readonly string? SingleUserName;
        public readonly ImmutableDictionary<string, object>? SparkConf;
        public readonly ImmutableDictionary<string, object>? SparkEnvVars;
        public readonly string SparkVersion;
        public readonly ImmutableArray<string> SshPublicKeys;
        public readonly Outputs.JobTaskNewClusterWorkloadType? WorkloadType;

        [OutputConstructor]
        private JobTaskNewCluster(
            bool? applyPolicyDefaultValues,

            Outputs.JobTaskNewClusterAutoscale? autoscale,

            int? autoterminationMinutes,

            Outputs.JobTaskNewClusterAwsAttributes? awsAttributes,

            Outputs.JobTaskNewClusterAzureAttributes? azureAttributes,

            Outputs.JobTaskNewClusterCloneFrom? cloneFrom,

            string? clusterId,

            Outputs.JobTaskNewClusterClusterLogConf? clusterLogConf,

            ImmutableArray<Outputs.JobTaskNewClusterClusterMountInfo> clusterMountInfos,

            string? clusterName,

            ImmutableDictionary<string, object>? customTags,

            string? dataSecurityMode,

            Outputs.JobTaskNewClusterDockerImage? dockerImage,

            string? driverInstancePoolId,

            string? driverNodeTypeId,

            bool? enableElasticDisk,

            bool? enableLocalDiskEncryption,

            Outputs.JobTaskNewClusterGcpAttributes? gcpAttributes,

            string? idempotencyToken,

            ImmutableArray<Outputs.JobTaskNewClusterInitScript> initScripts,

            string? instancePoolId,

            ImmutableArray<Outputs.JobTaskNewClusterLibrary> libraries,

            string? nodeTypeId,

            int? numWorkers,

            string? policyId,

            string? runtimeEngine,

            string? singleUserName,

            ImmutableDictionary<string, object>? sparkConf,

            ImmutableDictionary<string, object>? sparkEnvVars,

            string sparkVersion,

            ImmutableArray<string> sshPublicKeys,

            Outputs.JobTaskNewClusterWorkloadType? workloadType)
        {
            ApplyPolicyDefaultValues = applyPolicyDefaultValues;
            Autoscale = autoscale;
            AutoterminationMinutes = autoterminationMinutes;
            AwsAttributes = awsAttributes;
            AzureAttributes = azureAttributes;
            CloneFrom = cloneFrom;
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
            Libraries = libraries;
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
