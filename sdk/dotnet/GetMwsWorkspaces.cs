// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetMwsWorkspaces
    {
        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// Lists all databricks.MwsWorkspaces in Databricks Account.
        /// 
        /// &gt; **Note** `account_id` provider configuration property is required for this resource to work.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Listing all workspaces in
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Databricks.GetMwsWorkspaces.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["allMwsWorkspaces"] = all.Apply(getMwsWorkspacesResult =&gt; getMwsWorkspacesResult.Ids),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.MwsWorkspaces to manage Databricks E2 Workspaces.
        /// * databricks.MetastoreAssignment
        /// </summary>
        public static Task<GetMwsWorkspacesResult> InvokeAsync(GetMwsWorkspacesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMwsWorkspacesResult>("databricks:index/getMwsWorkspaces:getMwsWorkspaces", args ?? new GetMwsWorkspacesArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// Lists all databricks.MwsWorkspaces in Databricks Account.
        /// 
        /// &gt; **Note** `account_id` provider configuration property is required for this resource to work.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Listing all workspaces in
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Databricks.GetMwsWorkspaces.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["allMwsWorkspaces"] = all.Apply(getMwsWorkspacesResult =&gt; getMwsWorkspacesResult.Ids),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.MwsWorkspaces to manage Databricks E2 Workspaces.
        /// * databricks.MetastoreAssignment
        /// </summary>
        public static Output<GetMwsWorkspacesResult> Invoke(GetMwsWorkspacesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMwsWorkspacesResult>("databricks:index/getMwsWorkspaces:getMwsWorkspaces", args ?? new GetMwsWorkspacesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMwsWorkspacesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private Dictionary<string, object>? _ids;

        /// <summary>
        /// name-to-id map for all of the workspaces in the account
        /// </summary>
        public Dictionary<string, object> Ids
        {
            get => _ids ?? (_ids = new Dictionary<string, object>());
            set => _ids = value;
        }

        public GetMwsWorkspacesArgs()
        {
        }
        public static new GetMwsWorkspacesArgs Empty => new GetMwsWorkspacesArgs();
    }

    public sealed class GetMwsWorkspacesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputMap<object>? _ids;

        /// <summary>
        /// name-to-id map for all of the workspaces in the account
        /// </summary>
        public InputMap<object> Ids
        {
            get => _ids ?? (_ids = new InputMap<object>());
            set => _ids = value;
        }

        public GetMwsWorkspacesInvokeArgs()
        {
        }
        public static new GetMwsWorkspacesInvokeArgs Empty => new GetMwsWorkspacesInvokeArgs();
    }


    [OutputType]
    public sealed class GetMwsWorkspacesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// name-to-id map for all of the workspaces in the account
        /// </summary>
        public readonly ImmutableDictionary<string, object> Ids;

        [OutputConstructor]
        private GetMwsWorkspacesResult(
            string id,

            ImmutableDictionary<string, object> ids)
        {
            Id = id;
            Ids = ids;
        }
    }
}
