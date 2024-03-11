// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetNodeType
    {
        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// Gets the smallest node type for databricks.Cluster that fits search criteria, like amount of RAM or number of cores. [AWS](https://databricks.com/product/aws-pricing/instance-types) or [Azure](https://azure.microsoft.com/en-us/pricing/details/databricks/). Internally data source fetches [node types](https://docs.databricks.com/dev-tools/api/latest/clusters.html#list-node-types) available per cloud, similar to executing `databricks clusters list-node-types`, and filters it to return the smallest possible node with criteria.
        /// 
        /// &gt; **Note** This is experimental functionality, which aims to simplify things. In case of wrong parameters given (e.g. `min_gpus = 876`) or no nodes matching, data source will return cloud-default node type, even though it doesn't match search criteria specified by data source arguments: [i3.xlarge](https://aws.amazon.com/ec2/instance-types/i3/) for AWS or [Standard_D3_v2](https://docs.microsoft.com/en-us/azure/cloud-services/cloud-services-sizes-specs#dv2-series) for Azure.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var withGpu = Databricks.GetNodeType.Invoke(new()
        ///     {
        ///         LocalDisk = true,
        ///         MinCores = 16,
        ///         GbPerCore = 1,
        ///         MinGpus = 1,
        ///     });
        /// 
        ///     var gpuMl = Databricks.GetSparkVersion.Invoke(new()
        ///     {
        ///         Gpu = true,
        ///         Ml = true,
        ///     });
        /// 
        ///     var research = new Databricks.Cluster("research", new()
        ///     {
        ///         ClusterName = "Research Cluster",
        ///         SparkVersion = gpuMl.Apply(getSparkVersionResult =&gt; getSparkVersionResult.Id),
        ///         NodeTypeId = withGpu.Apply(getNodeTypeResult =&gt; getNodeTypeResult.Id),
        ///         AutoterminationMinutes = 20,
        ///         Autoscale = new Databricks.Inputs.ClusterAutoscaleArgs
        ///         {
        ///             MinWorkers = 1,
        ///             MaxWorkers = 50,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide.
        /// * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
        /// * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
        /// * databricks.InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
        /// * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
        /// </summary>
        public static Task<GetNodeTypeResult> InvokeAsync(GetNodeTypeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNodeTypeResult>("databricks:index/getNodeType:getNodeType", args ?? new GetNodeTypeArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// Gets the smallest node type for databricks.Cluster that fits search criteria, like amount of RAM or number of cores. [AWS](https://databricks.com/product/aws-pricing/instance-types) or [Azure](https://azure.microsoft.com/en-us/pricing/details/databricks/). Internally data source fetches [node types](https://docs.databricks.com/dev-tools/api/latest/clusters.html#list-node-types) available per cloud, similar to executing `databricks clusters list-node-types`, and filters it to return the smallest possible node with criteria.
        /// 
        /// &gt; **Note** This is experimental functionality, which aims to simplify things. In case of wrong parameters given (e.g. `min_gpus = 876`) or no nodes matching, data source will return cloud-default node type, even though it doesn't match search criteria specified by data source arguments: [i3.xlarge](https://aws.amazon.com/ec2/instance-types/i3/) for AWS or [Standard_D3_v2](https://docs.microsoft.com/en-us/azure/cloud-services/cloud-services-sizes-specs#dv2-series) for Azure.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var withGpu = Databricks.GetNodeType.Invoke(new()
        ///     {
        ///         LocalDisk = true,
        ///         MinCores = 16,
        ///         GbPerCore = 1,
        ///         MinGpus = 1,
        ///     });
        /// 
        ///     var gpuMl = Databricks.GetSparkVersion.Invoke(new()
        ///     {
        ///         Gpu = true,
        ///         Ml = true,
        ///     });
        /// 
        ///     var research = new Databricks.Cluster("research", new()
        ///     {
        ///         ClusterName = "Research Cluster",
        ///         SparkVersion = gpuMl.Apply(getSparkVersionResult =&gt; getSparkVersionResult.Id),
        ///         NodeTypeId = withGpu.Apply(getNodeTypeResult =&gt; getNodeTypeResult.Id),
        ///         AutoterminationMinutes = 20,
        ///         Autoscale = new Databricks.Inputs.ClusterAutoscaleArgs
        ///         {
        ///             MinWorkers = 1,
        ///             MaxWorkers = 50,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide.
        /// * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
        /// * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
        /// * databricks.InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
        /// * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
        /// </summary>
        public static Output<GetNodeTypeResult> Invoke(GetNodeTypeInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNodeTypeResult>("databricks:index/getNodeType:getNodeType", args ?? new GetNodeTypeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNodeTypeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Node category, which can be one of (depending on the cloud environment, could be checked with `databricks clusters list-node-types -o json|jq '.node_types[]|.category'|sort |uniq`):
        /// * `General Purpose` (all clouds)
        /// * `General Purpose (HDD)` (Azure)
        /// * `Compute Optimized` (all clouds)
        /// * `Memory Optimized` (all clouds)
        /// * `Memory Optimized (Remote HDD)` (Azure)
        /// * `Storage Optimized` (AWS, Azure)
        /// * `GPU Accelerated` (AWS, Azure)
        /// </summary>
        [Input("category")]
        public string? Category { get; set; }

        /// <summary>
        /// if we should limit the search only to [AWS fleet instance types](https://docs.databricks.com/compute/aws-fleet-instances.html). Default to _false_.
        /// </summary>
        [Input("fleet")]
        public bool? Fleet { get; set; }

        /// <summary>
        /// Number of gigabytes per core available on instance. Conflicts with `min_memory_gb`. Defaults to _0_.
        /// </summary>
        [Input("gbPerCore")]
        public int? GbPerCore { get; set; }

        /// <summary>
        /// if we should limit the search only to nodes with AWS Graviton CPUs. Default to _false_.
        /// </summary>
        [Input("graviton")]
        public bool? Graviton { get; set; }

        /// <summary>
        /// node type, that can be used for databricks_job, databricks_cluster, or databricks_instance_pool.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// . Pick only nodes that have IO Cache. Defaults to _false_.
        /// </summary>
        [Input("isIoCacheEnabled")]
        public bool? IsIoCacheEnabled { get; set; }

        /// <summary>
        /// Pick only nodes with local storage. Defaults to _false_.
        /// </summary>
        [Input("localDisk")]
        public bool? LocalDisk { get; set; }

        /// <summary>
        /// Pick only nodes that have size local storage greater or equal to given value. Defaults to _0_.
        /// </summary>
        [Input("localDiskMinSize")]
        public int? LocalDiskMinSize { get; set; }

        /// <summary>
        /// Minimum number of CPU cores available on instance. Defaults to _0_.
        /// </summary>
        [Input("minCores")]
        public int? MinCores { get; set; }

        /// <summary>
        /// Minimum number of GPU's attached to instance. Defaults to _0_.
        /// </summary>
        [Input("minGpus")]
        public int? MinGpus { get; set; }

        /// <summary>
        /// Minimum amount of memory per node in gigabytes. Defaults to _0_.
        /// </summary>
        [Input("minMemoryGb")]
        public int? MinMemoryGb { get; set; }

        /// <summary>
        /// Pick only nodes that can run Photon driver. Defaults to _false_.
        /// </summary>
        [Input("photonDriverCapable")]
        public bool? PhotonDriverCapable { get; set; }

        /// <summary>
        /// Pick only nodes that can run Photon workers. Defaults to _false_.
        /// </summary>
        [Input("photonWorkerCapable")]
        public bool? PhotonWorkerCapable { get; set; }

        /// <summary>
        /// Pick only nodes that support port forwarding. Defaults to _false_.
        /// </summary>
        [Input("supportPortForwarding")]
        public bool? SupportPortForwarding { get; set; }

        public GetNodeTypeArgs()
        {
        }
        public static new GetNodeTypeArgs Empty => new GetNodeTypeArgs();
    }

    public sealed class GetNodeTypeInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Node category, which can be one of (depending on the cloud environment, could be checked with `databricks clusters list-node-types -o json|jq '.node_types[]|.category'|sort |uniq`):
        /// * `General Purpose` (all clouds)
        /// * `General Purpose (HDD)` (Azure)
        /// * `Compute Optimized` (all clouds)
        /// * `Memory Optimized` (all clouds)
        /// * `Memory Optimized (Remote HDD)` (Azure)
        /// * `Storage Optimized` (AWS, Azure)
        /// * `GPU Accelerated` (AWS, Azure)
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// if we should limit the search only to [AWS fleet instance types](https://docs.databricks.com/compute/aws-fleet-instances.html). Default to _false_.
        /// </summary>
        [Input("fleet")]
        public Input<bool>? Fleet { get; set; }

        /// <summary>
        /// Number of gigabytes per core available on instance. Conflicts with `min_memory_gb`. Defaults to _0_.
        /// </summary>
        [Input("gbPerCore")]
        public Input<int>? GbPerCore { get; set; }

        /// <summary>
        /// if we should limit the search only to nodes with AWS Graviton CPUs. Default to _false_.
        /// </summary>
        [Input("graviton")]
        public Input<bool>? Graviton { get; set; }

        /// <summary>
        /// node type, that can be used for databricks_job, databricks_cluster, or databricks_instance_pool.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// . Pick only nodes that have IO Cache. Defaults to _false_.
        /// </summary>
        [Input("isIoCacheEnabled")]
        public Input<bool>? IsIoCacheEnabled { get; set; }

        /// <summary>
        /// Pick only nodes with local storage. Defaults to _false_.
        /// </summary>
        [Input("localDisk")]
        public Input<bool>? LocalDisk { get; set; }

        /// <summary>
        /// Pick only nodes that have size local storage greater or equal to given value. Defaults to _0_.
        /// </summary>
        [Input("localDiskMinSize")]
        public Input<int>? LocalDiskMinSize { get; set; }

        /// <summary>
        /// Minimum number of CPU cores available on instance. Defaults to _0_.
        /// </summary>
        [Input("minCores")]
        public Input<int>? MinCores { get; set; }

        /// <summary>
        /// Minimum number of GPU's attached to instance. Defaults to _0_.
        /// </summary>
        [Input("minGpus")]
        public Input<int>? MinGpus { get; set; }

        /// <summary>
        /// Minimum amount of memory per node in gigabytes. Defaults to _0_.
        /// </summary>
        [Input("minMemoryGb")]
        public Input<int>? MinMemoryGb { get; set; }

        /// <summary>
        /// Pick only nodes that can run Photon driver. Defaults to _false_.
        /// </summary>
        [Input("photonDriverCapable")]
        public Input<bool>? PhotonDriverCapable { get; set; }

        /// <summary>
        /// Pick only nodes that can run Photon workers. Defaults to _false_.
        /// </summary>
        [Input("photonWorkerCapable")]
        public Input<bool>? PhotonWorkerCapable { get; set; }

        /// <summary>
        /// Pick only nodes that support port forwarding. Defaults to _false_.
        /// </summary>
        [Input("supportPortForwarding")]
        public Input<bool>? SupportPortForwarding { get; set; }

        public GetNodeTypeInvokeArgs()
        {
        }
        public static new GetNodeTypeInvokeArgs Empty => new GetNodeTypeInvokeArgs();
    }


    [OutputType]
    public sealed class GetNodeTypeResult
    {
        public readonly string? Category;
        public readonly bool? Fleet;
        public readonly int? GbPerCore;
        public readonly bool? Graviton;
        /// <summary>
        /// node type, that can be used for databricks_job, databricks_cluster, or databricks_instance_pool.
        /// </summary>
        public readonly string Id;
        public readonly bool? IsIoCacheEnabled;
        public readonly bool? LocalDisk;
        public readonly int? LocalDiskMinSize;
        public readonly int? MinCores;
        public readonly int? MinGpus;
        public readonly int? MinMemoryGb;
        public readonly bool? PhotonDriverCapable;
        public readonly bool? PhotonWorkerCapable;
        public readonly bool? SupportPortForwarding;

        [OutputConstructor]
        private GetNodeTypeResult(
            string? category,

            bool? fleet,

            int? gbPerCore,

            bool? graviton,

            string id,

            bool? isIoCacheEnabled,

            bool? localDisk,

            int? localDiskMinSize,

            int? minCores,

            int? minGpus,

            int? minMemoryGb,

            bool? photonDriverCapable,

            bool? photonWorkerCapable,

            bool? supportPortForwarding)
        {
            Category = category;
            Fleet = fleet;
            GbPerCore = gbPerCore;
            Graviton = graviton;
            Id = id;
            IsIoCacheEnabled = isIoCacheEnabled;
            LocalDisk = localDisk;
            LocalDiskMinSize = localDiskMinSize;
            MinCores = minCores;
            MinGpus = minGpus;
            MinMemoryGb = minMemoryGb;
            PhotonDriverCapable = photonDriverCapable;
            PhotonWorkerCapable = photonWorkerCapable;
            SupportPortForwarding = supportPortForwarding;
        }
    }
}
