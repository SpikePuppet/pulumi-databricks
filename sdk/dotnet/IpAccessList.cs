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
    /// Security-conscious enterprises that use cloud SaaS applications need to restrict access to their own employees. Authentication helps to prove user identity, but that does not enforce network location of the users. Accessing a cloud service from an unsecured network can pose security risks to an enterprise, especially when the user may have authorized access to sensitive or personal data. Enterprise network perimeters apply security policies and limit access to external services (for example, firewalls, proxies, DLP, and logging), so access beyond these controls are assumed to be untrusted. Please see [IP Access List](https://docs.databricks.com/security/network/ip-access-list.html) for full feature documentation.
    /// 
    /// &gt; **Note** The total number of IP addresses and CIDR scopes provided across all ACL Lists in a workspace can not exceed 1000.  Refer to the docs above for specifics.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @this = new Databricks.WorkspaceConf("this", new()
    ///     {
    ///         CustomConfig = 
    ///         {
    ///             { "enableIpAccessLists", true },
    ///         },
    ///     });
    /// 
    ///     var allowed_list = new Databricks.IpAccessList("allowed-list", new()
    ///     {
    ///         Label = "allow_in",
    ///         ListType = "ALLOW",
    ///         IpAddresses = new[]
    ///         {
    ///             "1.1.1.1",
    ///             "1.2.3.0/24",
    ///             "1.2.5.0/24",
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             @this,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * End to end workspace management guide.
    /// * Provisioning AWS Databricks E2 with a Hub &amp; Spoke firewall for data exfiltration protection guide.
    /// * databricks.MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) &amp; subnets for new workspaces within AWS.
    /// * databricks.MwsPrivateAccessSettings to create a [Private Access Setting](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html#step-5-create-a-private-access-settings-configuration-using-the-databricks-account-api) that can be used as part of a databricks.MwsWorkspaces resource to create a [Databricks Workspace that leverages AWS PrivateLink](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html).
    /// * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
    /// * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
    /// 
    /// ## Import
    /// 
    /// The databricks_ip_access_list can be imported using idbash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/ipAccessList:IpAccessList this &lt;list-id&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/ipAccessList:IpAccessList")]
    public partial class IpAccessList : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// A string list of IP addresses and CIDR ranges.
        /// </summary>
        [Output("ipAddresses")]
        public Output<ImmutableArray<string>> IpAddresses { get; private set; } = null!;

        /// <summary>
        /// This is the display name for the given IP ACL List.
        /// </summary>
        [Output("label")]
        public Output<string> Label { get; private set; } = null!;

        /// <summary>
        /// Can only be "ALLOW" or "BLOCK".
        /// </summary>
        [Output("listType")]
        public Output<string> ListType { get; private set; } = null!;


        /// <summary>
        /// Create a IpAccessList resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IpAccessList(string name, IpAccessListArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/ipAccessList:IpAccessList", name, args ?? new IpAccessListArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IpAccessList(string name, Input<string> id, IpAccessListState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/ipAccessList:IpAccessList", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IpAccessList resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IpAccessList Get(string name, Input<string> id, IpAccessListState? state = null, CustomResourceOptions? options = null)
        {
            return new IpAccessList(name, id, state, options);
        }
    }

    public sealed class IpAccessListArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("ipAddresses", required: true)]
        private InputList<string>? _ipAddresses;

        /// <summary>
        /// A string list of IP addresses and CIDR ranges.
        /// </summary>
        public InputList<string> IpAddresses
        {
            get => _ipAddresses ?? (_ipAddresses = new InputList<string>());
            set => _ipAddresses = value;
        }

        /// <summary>
        /// This is the display name for the given IP ACL List.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// Can only be "ALLOW" or "BLOCK".
        /// </summary>
        [Input("listType", required: true)]
        public Input<string> ListType { get; set; } = null!;

        public IpAccessListArgs()
        {
        }
        public static new IpAccessListArgs Empty => new IpAccessListArgs();
    }

    public sealed class IpAccessListState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("ipAddresses")]
        private InputList<string>? _ipAddresses;

        /// <summary>
        /// A string list of IP addresses and CIDR ranges.
        /// </summary>
        public InputList<string> IpAddresses
        {
            get => _ipAddresses ?? (_ipAddresses = new InputList<string>());
            set => _ipAddresses = value;
        }

        /// <summary>
        /// This is the display name for the given IP ACL List.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// Can only be "ALLOW" or "BLOCK".
        /// </summary>
        [Input("listType")]
        public Input<string>? ListType { get; set; }

        public IpAccessListState()
        {
        }
        public static new IpAccessListState Empty => new IpAccessListState();
    }
}
