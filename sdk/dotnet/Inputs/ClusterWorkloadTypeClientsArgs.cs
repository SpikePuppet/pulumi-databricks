// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ClusterWorkloadTypeClientsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// boolean flag defining if it's possible to run Databricks Jobs on this cluster. Default: `true`.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var withNfs = new Databricks.Cluster("with_nfs", new()
        ///     {
        ///         WorkloadType = new Databricks.Inputs.ClusterWorkloadTypeArgs
        ///         {
        ///             Clients = new Databricks.Inputs.ClusterWorkloadTypeClientsArgs
        ///             {
        ///                 Jobs = false,
        ///                 Notebooks = true,
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        [Input("jobs")]
        public Input<bool>? Jobs { get; set; }

        /// <summary>
        /// boolean flag defining if it's possible to run notebooks on this cluster. Default: `true`.
        /// </summary>
        [Input("notebooks")]
        public Input<bool>? Notebooks { get; set; }

        public ClusterWorkloadTypeClientsArgs()
        {
        }
        public static new ClusterWorkloadTypeClientsArgs Empty => new ClusterWorkloadTypeClientsArgs();
    }
}
