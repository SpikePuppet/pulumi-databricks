// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// &gt; **Note** Initialize provider with `alias = "account"`, `host = "https://accounts.azuredatabricks.net"` and use `provider = databricks.account` for all `databricks_mws_*` resources.
    /// 
    /// &gt; **Public Preview** This feature is available for AWS &amp; Azure only, and is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html) in AWS.
    /// 
    /// Allows you to attach a Network Connectivity Config object to a databricks.MwsWorkspaces resource to create a [Databricks Workspace that leverages serverless network connectivity configs](https://learn.microsoft.com/en-us/azure/databricks/sql/admin/serverless-firewall).
    /// 
    /// The NCC and workspace must be in the same region.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var region = config.RequireObject&lt;dynamic&gt;("region");
    ///     var prefix = config.RequireObject&lt;dynamic&gt;("prefix");
    ///     var ncc = new Databricks.MwsNetworkConnectivityConfig("ncc", new()
    ///     {
    ///         Name = $"Network Connectivity Config for {prefix}",
    ///         Region = region,
    ///     });
    /// 
    ///     var nccBinding = new Databricks.MwsNccBinding("ncc_binding", new()
    ///     {
    ///         NetworkConnectivityConfigId = ncc.NetworkConnectivityConfigId,
    ///         WorkspaceId = databricksWorkspaceId,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are used in the context:
    /// 
    /// * databricks.MwsWorkspaces to set up Databricks workspaces.
    /// * databricks.MwsNetworkConnectivityConfig to create Network Connectivity Config objects.
    /// </summary>
    [DatabricksResourceType("databricks:index/mwsNccBinding:MwsNccBinding")]
    public partial class MwsNccBinding : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Canonical unique identifier of Network Connectivity Config in Databricks Account.
        /// </summary>
        [Output("networkConnectivityConfigId")]
        public Output<string> NetworkConnectivityConfigId { get; private set; } = null!;

        /// <summary>
        /// Identifier of the workspace to attach the NCC to. Change forces creation of a new resource.
        /// </summary>
        [Output("workspaceId")]
        public Output<string> WorkspaceId { get; private set; } = null!;


        /// <summary>
        /// Create a MwsNccBinding resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MwsNccBinding(string name, MwsNccBindingArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/mwsNccBinding:MwsNccBinding", name, args ?? new MwsNccBindingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MwsNccBinding(string name, Input<string> id, MwsNccBindingState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/mwsNccBinding:MwsNccBinding", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MwsNccBinding resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MwsNccBinding Get(string name, Input<string> id, MwsNccBindingState? state = null, CustomResourceOptions? options = null)
        {
            return new MwsNccBinding(name, id, state, options);
        }
    }

    public sealed class MwsNccBindingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Canonical unique identifier of Network Connectivity Config in Databricks Account.
        /// </summary>
        [Input("networkConnectivityConfigId", required: true)]
        public Input<string> NetworkConnectivityConfigId { get; set; } = null!;

        /// <summary>
        /// Identifier of the workspace to attach the NCC to. Change forces creation of a new resource.
        /// </summary>
        [Input("workspaceId", required: true)]
        public Input<string> WorkspaceId { get; set; } = null!;

        public MwsNccBindingArgs()
        {
        }
        public static new MwsNccBindingArgs Empty => new MwsNccBindingArgs();
    }

    public sealed class MwsNccBindingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Canonical unique identifier of Network Connectivity Config in Databricks Account.
        /// </summary>
        [Input("networkConnectivityConfigId")]
        public Input<string>? NetworkConnectivityConfigId { get; set; }

        /// <summary>
        /// Identifier of the workspace to attach the NCC to. Change forces creation of a new resource.
        /// </summary>
        [Input("workspaceId")]
        public Input<string>? WorkspaceId { get; set; }

        public MwsNccBindingState()
        {
        }
        public static new MwsNccBindingState Empty => new MwsNccBindingState();
    }
}
