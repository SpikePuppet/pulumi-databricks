// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobJobClusterNewClusterGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("applyPolicyDefaultValues")]
        public Input<bool>? ApplyPolicyDefaultValues { get; set; }

        [Input("autoscale")]
        public Input<Inputs.JobJobClusterNewClusterAutoscaleGetArgs>? Autoscale { get; set; }

        [Input("awsAttributes")]
        public Input<Inputs.JobJobClusterNewClusterAwsAttributesGetArgs>? AwsAttributes { get; set; }

        [Input("azureAttributes")]
        public Input<Inputs.JobJobClusterNewClusterAzureAttributesGetArgs>? AzureAttributes { get; set; }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("clusterLogConf")]
        public Input<Inputs.JobJobClusterNewClusterClusterLogConfGetArgs>? ClusterLogConf { get; set; }

        [Input("clusterMountInfos")]
        private InputList<Inputs.JobJobClusterNewClusterClusterMountInfoGetArgs>? _clusterMountInfos;
        public InputList<Inputs.JobJobClusterNewClusterClusterMountInfoGetArgs> ClusterMountInfos
        {
            get => _clusterMountInfos ?? (_clusterMountInfos = new InputList<Inputs.JobJobClusterNewClusterClusterMountInfoGetArgs>());
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
        public Input<Inputs.JobJobClusterNewClusterDockerImageGetArgs>? DockerImage { get; set; }

        [Input("driverInstancePoolId")]
        public Input<string>? DriverInstancePoolId { get; set; }

        [Input("driverNodeTypeId")]
        public Input<string>? DriverNodeTypeId { get; set; }

        [Input("enableElasticDisk")]
        public Input<bool>? EnableElasticDisk { get; set; }

        [Input("enableLocalDiskEncryption")]
        public Input<bool>? EnableLocalDiskEncryption { get; set; }

        [Input("gcpAttributes")]
        public Input<Inputs.JobJobClusterNewClusterGcpAttributesGetArgs>? GcpAttributes { get; set; }

        [Input("idempotencyToken")]
        public Input<string>? IdempotencyToken { get; set; }

        [Input("initScripts")]
        private InputList<Inputs.JobJobClusterNewClusterInitScriptGetArgs>? _initScripts;
        public InputList<Inputs.JobJobClusterNewClusterInitScriptGetArgs> InitScripts
        {
            get => _initScripts ?? (_initScripts = new InputList<Inputs.JobJobClusterNewClusterInitScriptGetArgs>());
            set => _initScripts = value;
        }

        [Input("instancePoolId")]
        public Input<string>? InstancePoolId { get; set; }

        [Input("libraries")]
        private InputList<Inputs.JobJobClusterNewClusterLibraryGetArgs>? _libraries;

        /// <summary>
        /// (List) An optional list of libraries to be installed on the cluster that will execute the job. See library Configuration Block below.
        /// </summary>
        public InputList<Inputs.JobJobClusterNewClusterLibraryGetArgs> Libraries
        {
            get => _libraries ?? (_libraries = new InputList<Inputs.JobJobClusterNewClusterLibraryGetArgs>());
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

        /// <summary>
        /// isn't supported
        /// </summary>
        [Input("workloadType")]
        public Input<Inputs.JobJobClusterNewClusterWorkloadTypeGetArgs>? WorkloadType { get; set; }

        public JobJobClusterNewClusterGetArgs()
        {
        }
        public static new JobJobClusterNewClusterGetArgs Empty => new JobJobClusterNewClusterGetArgs();
    }
}
