// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("applyPolicyDefaultValues")]
        public Input<bool>? ApplyPolicyDefaultValues { get; set; }

        [Input("autoscale")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterAutoscaleInputArgs>? Autoscale { get; set; }

        [Input("autoterminationMinutes")]
        public Input<int>? AutoterminationMinutes { get; set; }

        [Input("awsAttributes")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterAwsAttributesInputArgs>? AwsAttributes { get; set; }

        [Input("azureAttributes")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterAzureAttributesInputArgs>? AzureAttributes { get; set; }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("clusterLogConf")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterClusterLogConfInputArgs>? ClusterLogConf { get; set; }

        [Input("clusterMountInfos")]
        private InputList<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterClusterMountInfoInputArgs>? _clusterMountInfos;
        public InputList<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterClusterMountInfoInputArgs> ClusterMountInfos
        {
            get => _clusterMountInfos ?? (_clusterMountInfos = new InputList<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterClusterMountInfoInputArgs>());
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
        public Input<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageInputArgs>? DockerImage { get; set; }

        [Input("driverInstancePoolId", required: true)]
        public Input<string> DriverInstancePoolId { get; set; } = null!;

        [Input("driverNodeTypeId", required: true)]
        public Input<string> DriverNodeTypeId { get; set; } = null!;

        [Input("enableElasticDisk", required: true)]
        public Input<bool> EnableElasticDisk { get; set; } = null!;

        [Input("enableLocalDiskEncryption", required: true)]
        public Input<bool> EnableLocalDiskEncryption { get; set; } = null!;

        [Input("gcpAttributes")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterGcpAttributesInputArgs>? GcpAttributes { get; set; }

        [Input("idempotencyToken")]
        public Input<string>? IdempotencyToken { get; set; }

        [Input("initScripts")]
        private InputList<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptInputArgs>? _initScripts;
        public InputList<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptInputArgs> InitScripts
        {
            get => _initScripts ?? (_initScripts = new InputList<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptInputArgs>());
            set => _initScripts = value;
        }

        [Input("instancePoolId")]
        public Input<string>? InstancePoolId { get; set; }

        [Input("nodeTypeId", required: true)]
        public Input<string> NodeTypeId { get; set; } = null!;

        [Input("numWorkers", required: true)]
        public Input<int> NumWorkers { get; set; } = null!;

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
        public Input<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeInputArgs>? WorkloadType { get; set; }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInputArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInputArgs();
    }
}
