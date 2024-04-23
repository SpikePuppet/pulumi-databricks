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
    public sealed class ClusterWorkloadTypeClients
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
        public readonly bool? Jobs;
        /// <summary>
        /// boolean flag defining if it's possible to run notebooks on this cluster. Default: `true`.
        /// </summary>
        public readonly bool? Notebooks;

        [OutputConstructor]
        private ClusterWorkloadTypeClients(
            bool? jobs,

            bool? notebooks)
        {
            Jobs = jobs;
            Notebooks = notebooks;
        }
    }
}
