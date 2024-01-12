// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetCurrentMetastore
    {
        /// <summary>
        /// Retrieves information about metastore attached to a given workspace.
        /// 
        /// &gt; **Note** This is the workspace-level data source.
        /// 
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute to prevent _authentication is not configured for provider_ errors.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// MetastoreSummary response for a metastore attached to the current workspace.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetCurrentMetastore.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["someMetastore"] = data.Databricks_metastore.This.Metastore_info[0],
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Metastore to get information for a metastore with a given ID.
        /// * databricks.getMetastores to get a mapping of name to id of all metastores.
        /// * databricks.Metastore to manage Metastores within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Task<GetCurrentMetastoreResult> InvokeAsync(GetCurrentMetastoreArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCurrentMetastoreResult>("databricks:index/getCurrentMetastore:getCurrentMetastore", args ?? new GetCurrentMetastoreArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves information about metastore attached to a given workspace.
        /// 
        /// &gt; **Note** This is the workspace-level data source.
        /// 
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute to prevent _authentication is not configured for provider_ errors.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// MetastoreSummary response for a metastore attached to the current workspace.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetCurrentMetastore.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["someMetastore"] = data.Databricks_metastore.This.Metastore_info[0],
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Metastore to get information for a metastore with a given ID.
        /// * databricks.getMetastores to get a mapping of name to id of all metastores.
        /// * databricks.Metastore to manage Metastores within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Output<GetCurrentMetastoreResult> Invoke(GetCurrentMetastoreInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCurrentMetastoreResult>("databricks:index/getCurrentMetastore:getCurrentMetastore", args ?? new GetCurrentMetastoreInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCurrentMetastoreArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// metastore ID.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// summary about a metastore attached to the current workspace returned by [Get a metastore summary API](https://docs.databricks.com/api/workspace/metastores/summary). This contains the following attributes (check the API page for up-to-date details):
        /// </summary>
        [Input("metastoreInfo")]
        public Inputs.GetCurrentMetastoreMetastoreInfoArgs? MetastoreInfo { get; set; }

        public GetCurrentMetastoreArgs()
        {
        }
        public static new GetCurrentMetastoreArgs Empty => new GetCurrentMetastoreArgs();
    }

    public sealed class GetCurrentMetastoreInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// metastore ID.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// summary about a metastore attached to the current workspace returned by [Get a metastore summary API](https://docs.databricks.com/api/workspace/metastores/summary). This contains the following attributes (check the API page for up-to-date details):
        /// </summary>
        [Input("metastoreInfo")]
        public Input<Inputs.GetCurrentMetastoreMetastoreInfoInputArgs>? MetastoreInfo { get; set; }

        public GetCurrentMetastoreInvokeArgs()
        {
        }
        public static new GetCurrentMetastoreInvokeArgs Empty => new GetCurrentMetastoreInvokeArgs();
    }


    [OutputType]
    public sealed class GetCurrentMetastoreResult
    {
        /// <summary>
        /// metastore ID.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// summary about a metastore attached to the current workspace returned by [Get a metastore summary API](https://docs.databricks.com/api/workspace/metastores/summary). This contains the following attributes (check the API page for up-to-date details):
        /// </summary>
        public readonly Outputs.GetCurrentMetastoreMetastoreInfoResult MetastoreInfo;

        [OutputConstructor]
        private GetCurrentMetastoreResult(
            string id,

            Outputs.GetCurrentMetastoreMetastoreInfoResult metastoreInfo)
        {
            Id = id;
            MetastoreInfo = metastoreInfo;
        }
    }
}
