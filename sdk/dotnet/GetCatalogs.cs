// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetCatalogs
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// Listing all catalogs:
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
        ///     var all = Databricks.GetCatalogs.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["allCatalogs"] = all,
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Schema to manage schemas within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Task<GetCatalogsResult> InvokeAsync(GetCatalogsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCatalogsResult>("databricks:index/getCatalogs:getCatalogs", args ?? new GetCatalogsArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// Listing all catalogs:
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
        ///     var all = Databricks.GetCatalogs.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["allCatalogs"] = all,
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Schema to manage schemas within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Output<GetCatalogsResult> Invoke(GetCatalogsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCatalogsResult>("databricks:index/getCatalogs:getCatalogs", args ?? new GetCatalogsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCatalogsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// set of databricks.Catalog names
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        public GetCatalogsArgs()
        {
        }
        public static new GetCatalogsArgs Empty => new GetCatalogsArgs();
    }

    public sealed class GetCatalogsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// set of databricks.Catalog names
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        public GetCatalogsInvokeArgs()
        {
        }
        public static new GetCatalogsInvokeArgs Empty => new GetCatalogsInvokeArgs();
    }


    [OutputType]
    public sealed class GetCatalogsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// set of databricks.Catalog names
        /// </summary>
        public readonly ImmutableArray<string> Ids;

        [OutputConstructor]
        private GetCatalogsResult(
            string id,

            ImmutableArray<string> ids)
        {
            Id = id;
            Ids = ids;
        }
    }
}
