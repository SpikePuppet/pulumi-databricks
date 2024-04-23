// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ClusterAutoscaleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum number of workers to which the cluster can scale up when overloaded. max_workers must be strictly greater than min_workers.
        /// 
        /// When using a [Single Node cluster](https://docs.databricks.com/clusters/single-node.html), `num_workers` needs to be `0`. It can be set to `0` explicitly, or simply not specified, as it defaults to `0`.  When `num_workers` is `0`, provider checks for presence of the required Spark configurations:
        /// 
        /// * `spark.master` must have prefix `local`, like `local[*]`
        /// * `spark.databricks.cluster.profile` must have value `singleNode`
        /// 
        /// and also `custom_tag` entry:
        /// 
        /// * `"ResourceClass" = "SingleNode"`
        /// 
        /// The following example demonstrates how to create an single node cluster:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var smallest = Databricks.GetNodeType.Invoke(new()
        ///     {
        ///         LocalDisk = true,
        ///     });
        /// 
        ///     var latestLts = Databricks.GetSparkVersion.Invoke(new()
        ///     {
        ///         LongTermSupport = true,
        ///     });
        /// 
        ///     var singleNode = new Databricks.Cluster("single_node", new()
        ///     {
        ///         ClusterName = "Single Node",
        ///         SparkVersion = latestLts.Apply(getSparkVersionResult =&gt; getSparkVersionResult.Id),
        ///         NodeTypeId = smallest.Apply(getNodeTypeResult =&gt; getNodeTypeResult.Id),
        ///         AutoterminationMinutes = 20,
        ///         SparkConf = 
        ///         {
        ///             { "spark.databricks.cluster.profile", "singleNode" },
        ///             { "spark.master", "local[*]" },
        ///         },
        ///         CustomTags = 
        ///         {
        ///             { "ResourceClass", "SingleNode" },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        [Input("maxWorkers")]
        public Input<int>? MaxWorkers { get; set; }

        /// <summary>
        /// The minimum number of workers to which the cluster can scale down when underutilized. It is also the initial number of workers the cluster will have after creation.
        /// </summary>
        [Input("minWorkers")]
        public Input<int>? MinWorkers { get; set; }

        public ClusterAutoscaleGetArgs()
        {
        }
        public static new ClusterAutoscaleGetArgs Empty => new ClusterAutoscaleGetArgs();
    }
}
