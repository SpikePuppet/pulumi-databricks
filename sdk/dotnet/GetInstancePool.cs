// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetInstancePool
    {
        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// Retrieves information about databricks_instance_pool.
        /// 
        /// ## Example Usage
        /// 
        /// Referring to an instance pool by name:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var pool = Databricks.GetInstancePool.Invoke(new()
        ///     {
        ///         Name = "All spot",
        ///     });
        /// 
        ///     var myCluster = new Databricks.Cluster("my_cluster", new()
        ///     {
        ///         InstancePoolId = poolDatabricksInstancePool.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetInstancePoolResult> InvokeAsync(GetInstancePoolArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstancePoolResult>("databricks:index/getInstancePool:getInstancePool", args ?? new GetInstancePoolArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// Retrieves information about databricks_instance_pool.
        /// 
        /// ## Example Usage
        /// 
        /// Referring to an instance pool by name:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var pool = Databricks.GetInstancePool.Invoke(new()
        ///     {
        ///         Name = "All spot",
        ///     });
        /// 
        ///     var myCluster = new Databricks.Cluster("my_cluster", new()
        ///     {
        ///         InstancePoolId = poolDatabricksInstancePool.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetInstancePoolResult> Invoke(GetInstancePoolInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstancePoolResult>("databricks:index/getInstancePool:getInstancePool", args ?? new GetInstancePoolInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstancePoolArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the instance pool. The instance pool must exist before this resource can be planned.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// block describing instance pool and its state. Check documentation for databricks.InstancePool for a list of exposed attributes.
        /// </summary>
        [Input("poolInfo")]
        public Inputs.GetInstancePoolPoolInfoArgs? PoolInfo { get; set; }

        public GetInstancePoolArgs()
        {
        }
        public static new GetInstancePoolArgs Empty => new GetInstancePoolArgs();
    }

    public sealed class GetInstancePoolInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the instance pool. The instance pool must exist before this resource can be planned.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// block describing instance pool and its state. Check documentation for databricks.InstancePool for a list of exposed attributes.
        /// </summary>
        [Input("poolInfo")]
        public Input<Inputs.GetInstancePoolPoolInfoInputArgs>? PoolInfo { get; set; }

        public GetInstancePoolInvokeArgs()
        {
        }
        public static new GetInstancePoolInvokeArgs Empty => new GetInstancePoolInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstancePoolResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// block describing instance pool and its state. Check documentation for databricks.InstancePool for a list of exposed attributes.
        /// </summary>
        public readonly Outputs.GetInstancePoolPoolInfoResult PoolInfo;

        [OutputConstructor]
        private GetInstancePoolResult(
            string id,

            string name,

            Outputs.GetInstancePoolPoolInfoResult poolInfo)
        {
            Id = id;
            Name = name;
            PoolInfo = poolInfo;
        }
    }
}
