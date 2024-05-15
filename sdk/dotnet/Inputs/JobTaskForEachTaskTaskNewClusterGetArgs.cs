// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskForEachTaskTaskNewClusterGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("applyPolicyDefaultValues")]
        public Input<bool>? ApplyPolicyDefaultValues { get; set; }

        [Input("autoscale")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterAutoscaleGetArgs>? Autoscale { get; set; }

        [Input("autoterminationMinutes")]
        public Input<int>? AutoterminationMinutes { get; set; }

        [Input("awsAttributes")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterAwsAttributesGetArgs>? AwsAttributes { get; set; }

        [Input("azureAttributes")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterAzureAttributesGetArgs>? AzureAttributes { get; set; }

        [Input("cloneFrom")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterCloneFromGetArgs>? CloneFrom { get; set; }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("clusterLogConf")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterClusterLogConfGetArgs>? ClusterLogConf { get; set; }

        [Input("clusterMountInfos")]
        private InputList<Inputs.JobTaskForEachTaskTaskNewClusterClusterMountInfoGetArgs>? _clusterMountInfos;
        public InputList<Inputs.JobTaskForEachTaskTaskNewClusterClusterMountInfoGetArgs> ClusterMountInfos
        {
            get => _clusterMountInfos ?? (_clusterMountInfos = new InputList<Inputs.JobTaskForEachTaskTaskNewClusterClusterMountInfoGetArgs>());
            set => _clusterMountInfos = value;
        }

        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        [Input("customTags")]
        private InputMap<object>? _customTags;
        public InputMap<object> CustomTags
        {
            get => _customTags ?? (_customTags = new InputMap<object>());
            set => _customTags = value;
        }

        [Input("dataSecurityMode")]
        public Input<string>? DataSecurityMode { get; set; }

        [Input("dockerImage")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterDockerImageGetArgs>? DockerImage { get; set; }

        [Input("driverInstancePoolId")]
        public Input<string>? DriverInstancePoolId { get; set; }

        [Input("driverNodeTypeId")]
        public Input<string>? DriverNodeTypeId { get; set; }

        [Input("enableElasticDisk")]
        public Input<bool>? EnableElasticDisk { get; set; }

        [Input("enableLocalDiskEncryption")]
        public Input<bool>? EnableLocalDiskEncryption { get; set; }

        [Input("gcpAttributes")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterGcpAttributesGetArgs>? GcpAttributes { get; set; }

        [Input("idempotencyToken")]
        public Input<string>? IdempotencyToken { get; set; }

        [Input("initScripts")]
        private InputList<Inputs.JobTaskForEachTaskTaskNewClusterInitScriptGetArgs>? _initScripts;
        public InputList<Inputs.JobTaskForEachTaskTaskNewClusterInitScriptGetArgs> InitScripts
        {
            get => _initScripts ?? (_initScripts = new InputList<Inputs.JobTaskForEachTaskTaskNewClusterInitScriptGetArgs>());
            set => _initScripts = value;
        }

        [Input("instancePoolId")]
        public Input<string>? InstancePoolId { get; set; }

        [Input("libraries")]
        private InputList<Inputs.JobTaskForEachTaskTaskNewClusterLibraryGetArgs>? _libraries;

        /// <summary>
        /// (List) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section of the databricks.Cluster resource for more information.
        /// </summary>
        public InputList<Inputs.JobTaskForEachTaskTaskNewClusterLibraryGetArgs> Libraries
        {
            get => _libraries ?? (_libraries = new InputList<Inputs.JobTaskForEachTaskTaskNewClusterLibraryGetArgs>());
            set => _libraries = value;
        }

        [Input("nodeTypeId")]
        public Input<string>? NodeTypeId { get; set; }

        [Input("numWorkers")]
        public Input<int>? NumWorkers { get; set; }

        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        [Input("runtimeEngine")]
        public Input<string>? RuntimeEngine { get; set; }

        [Input("singleUserName")]
        public Input<string>? SingleUserName { get; set; }

        [Input("sparkConf")]
        private InputMap<object>? _sparkConf;
        public InputMap<object> SparkConf
        {
            get => _sparkConf ?? (_sparkConf = new InputMap<object>());
            set => _sparkConf = value;
        }

        [Input("sparkEnvVars")]
        private InputMap<object>? _sparkEnvVars;
        public InputMap<object> SparkEnvVars
        {
            get => _sparkEnvVars ?? (_sparkEnvVars = new InputMap<object>());
            set => _sparkEnvVars = value;
        }

        [Input("sparkVersion", required: true)]
        public Input<string> SparkVersion { get; set; } = null!;

        [Input("sshPublicKeys")]
        private InputList<string>? _sshPublicKeys;
        public InputList<string> SshPublicKeys
        {
            get => _sshPublicKeys ?? (_sshPublicKeys = new InputList<string>());
            set => _sshPublicKeys = value;
        }

        [Input("workloadType")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterWorkloadTypeGetArgs>? WorkloadType { get; set; }

        public JobTaskForEachTaskTaskNewClusterGetArgs()
        {
        }
        public static new JobTaskForEachTaskTaskNewClusterGetArgs Empty => new JobTaskForEachTaskTaskNewClusterGetArgs();
    }
}
