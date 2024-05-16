// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetCatalog
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// Read  on a specific catalog `test`:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Databricks.GetCatalog.Invoke(new()
        ///     {
        ///         Name = "test",
        ///     });
        /// 
        ///     var things = new Databricks.Grants("things", new()
        ///     {
        ///         Catalog = test.Apply(getCatalogResult =&gt; getCatalogResult.Name),
        ///         GrantDetails = new[]
        ///         {
        ///             new Databricks.Inputs.GrantsGrantArgs
        ///             {
        ///                 Principal = "sensitive",
        ///                 Privileges = new[]
        ///                 {
        ///                     "USE_CATALOG",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Grant to manage grants within Unity Catalog.
        /// * databricks.getCatalogs to list all catalogs within Unity Catalog metastore.
        /// </summary>
        public static Task<GetCatalogResult> InvokeAsync(GetCatalogArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCatalogResult>("databricks:index/getCatalog:getCatalog", args ?? new GetCatalogArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// Read  on a specific catalog `test`:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Databricks.GetCatalog.Invoke(new()
        ///     {
        ///         Name = "test",
        ///     });
        /// 
        ///     var things = new Databricks.Grants("things", new()
        ///     {
        ///         Catalog = test.Apply(getCatalogResult =&gt; getCatalogResult.Name),
        ///         GrantDetails = new[]
        ///         {
        ///             new Databricks.Inputs.GrantsGrantArgs
        ///             {
        ///                 Principal = "sensitive",
        ///                 Privileges = new[]
        ///                 {
        ///                     "USE_CATALOG",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Grant to manage grants within Unity Catalog.
        /// * databricks.getCatalogs to list all catalogs within Unity Catalog metastore.
        /// </summary>
        public static Output<GetCatalogResult> Invoke(GetCatalogInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCatalogResult>("databricks:index/getCatalog:getCatalog", args ?? new GetCatalogInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCatalogArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// the [CatalogInfo](https://pkg.go.dev/github.com/databricks/databricks-sdk-go/service/catalog#CatalogInfo) object for a Unity Catalog catalog. This contains the following attributes (see ):
        /// </summary>
        [Input("catalogInfo")]
        public Inputs.GetCatalogCatalogInfoArgs? CatalogInfo { get; set; }

        /// <summary>
        /// same as the `name`
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// name of the catalog
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetCatalogArgs()
        {
        }
        public static new GetCatalogArgs Empty => new GetCatalogArgs();
    }

    public sealed class GetCatalogInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// the [CatalogInfo](https://pkg.go.dev/github.com/databricks/databricks-sdk-go/service/catalog#CatalogInfo) object for a Unity Catalog catalog. This contains the following attributes (see ):
        /// </summary>
        [Input("catalogInfo")]
        public Input<Inputs.GetCatalogCatalogInfoInputArgs>? CatalogInfo { get; set; }

        /// <summary>
        /// same as the `name`
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// name of the catalog
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetCatalogInvokeArgs()
        {
        }
        public static new GetCatalogInvokeArgs Empty => new GetCatalogInvokeArgs();
    }


    [OutputType]
    public sealed class GetCatalogResult
    {
        /// <summary>
        /// the [CatalogInfo](https://pkg.go.dev/github.com/databricks/databricks-sdk-go/service/catalog#CatalogInfo) object for a Unity Catalog catalog. This contains the following attributes (see ):
        /// </summary>
        public readonly Outputs.GetCatalogCatalogInfoResult CatalogInfo;
        /// <summary>
        /// same as the `name`
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the catalog
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetCatalogResult(
            Outputs.GetCatalogCatalogInfoResult catalogInfo,

            string id,

            string name)
        {
            CatalogInfo = catalogInfo;
            Id = id;
            Name = name;
        }
    }
}
