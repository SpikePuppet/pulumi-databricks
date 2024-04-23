// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetMetastores
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// Mapping of name to id of all metastores:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Databricks.GetMetastores.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["allMetastores"] = all.Apply(getMetastoresResult =&gt; getMetastoresResult.Ids),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Metastore to get information about a single metastore.
        /// * databricks.Metastore to manage Metastores within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Task<GetMetastoresResult> InvokeAsync(GetMetastoresArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMetastoresResult>("databricks:index/getMetastores:getMetastores", args ?? new GetMetastoresArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// Mapping of name to id of all metastores:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Databricks.GetMetastores.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["allMetastores"] = all.Apply(getMetastoresResult =&gt; getMetastoresResult.Ids),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Metastore to get information about a single metastore.
        /// * databricks.Metastore to manage Metastores within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Output<GetMetastoresResult> Invoke(GetMetastoresInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMetastoresResult>("databricks:index/getMetastores:getMetastores", args ?? new GetMetastoresInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMetastoresArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private Dictionary<string, object>? _ids;

        /// <summary>
        /// Mapping of name to id of databricks_metastore
        /// </summary>
        public Dictionary<string, object> Ids
        {
            get => _ids ?? (_ids = new Dictionary<string, object>());
            set => _ids = value;
        }

        public GetMetastoresArgs()
        {
        }
        public static new GetMetastoresArgs Empty => new GetMetastoresArgs();
    }

    public sealed class GetMetastoresInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputMap<object>? _ids;

        /// <summary>
        /// Mapping of name to id of databricks_metastore
        /// </summary>
        public InputMap<object> Ids
        {
            get => _ids ?? (_ids = new InputMap<object>());
            set => _ids = value;
        }

        public GetMetastoresInvokeArgs()
        {
        }
        public static new GetMetastoresInvokeArgs Empty => new GetMetastoresInvokeArgs();
    }


    [OutputType]
    public sealed class GetMetastoresResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Mapping of name to id of databricks_metastore
        /// </summary>
        public readonly ImmutableDictionary<string, object> Ids;

        [OutputConstructor]
        private GetMetastoresResult(
            string id,

            ImmutableDictionary<string, object> ids)
        {
            Id = id;
            Ids = ids;
        }
    }
}
