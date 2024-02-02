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
    /// ## Databricks on AWS usage
    /// ### Creating a Databricks on GCP workspace
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// using Google = Pulumi.Google;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var databricksAccountId = config.RequireObject&lt;dynamic&gt;("databricksAccountId");
    ///     var dbxPrivateVpc = new Google.Index.Google_compute_network("dbxPrivateVpc", new()
    ///     {
    ///         Project = @var.Google_project,
    ///         Name = $"tf-network-{random_string.Suffix.Result}",
    ///         AutoCreateSubnetworks = false,
    ///     });
    /// 
    ///     var network_with_private_secondary_ip_ranges = new Google.Index.Google_compute_subnetwork("network-with-private-secondary-ip-ranges", new()
    ///     {
    ///         Name = $"test-dbx-{random_string.Suffix.Result}",
    ///         IpCidrRange = "10.0.0.0/16",
    ///         Region = "us-central1",
    ///         Network = dbxPrivateVpc.Id,
    ///         SecondaryIpRange = new[]
    ///         {
    ///             
    ///             {
    ///                 { "rangeName", "pods" },
    ///                 { "ipCidrRange", "10.1.0.0/16" },
    ///             },
    ///             
    ///             {
    ///                 { "rangeName", "svc" },
    ///                 { "ipCidrRange", "10.2.0.0/20" },
    ///             },
    ///         },
    ///         PrivateIpGoogleAccess = true,
    ///     });
    /// 
    ///     var router = new Google.Index.Google_compute_router("router", new()
    ///     {
    ///         Name = $"my-router-{random_string.Suffix.Result}",
    ///         Region = network_with_private_secondary_ip_ranges.Region,
    ///         Network = dbxPrivateVpc.Id,
    ///     });
    /// 
    ///     var nat = new Google.Index.Google_compute_router_nat("nat", new()
    ///     {
    ///         Name = $"my-router-nat-{random_string.Suffix.Result}",
    ///         Router = router.Name,
    ///         Region = router.Region,
    ///         NatIpAllocateOption = "AUTO_ONLY",
    ///         SourceSubnetworkIpRangesToNat = "ALL_SUBNETWORKS_ALL_IP_RANGES",
    ///     });
    /// 
    ///     var @this = new Databricks.MwsNetworks("this", new()
    ///     {
    ///         AccountId = databricksAccountId,
    ///         NetworkName = $"test-demo-{random_string.Suffix.Result}",
    ///         GcpNetworkInfo = new Databricks.Inputs.MwsNetworksGcpNetworkInfoArgs
    ///         {
    ///             NetworkProjectId = @var.Google_project,
    ///             VpcId = dbxPrivateVpc.Name,
    ///             SubnetId = google_compute_subnetwork.Network_with_private_secondary_ip_ranges.Name,
    ///             SubnetRegion = google_compute_subnetwork.Network_with_private_secondary_ip_ranges.Region,
    ///             PodIpRangeName = "pods",
    ///             ServiceIpRangeName = "svc",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// In order to create a VPC [that leverages GCP Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html) you would need to add the `vpc_endpoint_id` Attributes from mws_vpc_endpoint resources into the databricks.MwsNetworks resource. For example:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @this = new Databricks.MwsNetworks("this", new()
    ///     {
    ///         AccountId = @var.Databricks_account_id,
    ///         NetworkName = $"test-demo-{random_string.Suffix.Result}",
    ///         GcpNetworkInfo = new Databricks.Inputs.MwsNetworksGcpNetworkInfoArgs
    ///         {
    ///             NetworkProjectId = @var.Google_project,
    ///             VpcId = google_compute_network.Dbx_private_vpc.Name,
    ///             SubnetId = google_compute_subnetwork.Network_with_private_secondary_ip_ranges.Name,
    ///             SubnetRegion = google_compute_subnetwork.Network_with_private_secondary_ip_ranges.Region,
    ///             PodIpRangeName = "pods",
    ///             ServiceIpRangeName = "svc",
    ///         },
    ///         VpcEndpoints = new Databricks.Inputs.MwsNetworksVpcEndpointsArgs
    ///         {
    ///             DataplaneRelays = new[]
    ///             {
    ///                 databricks_mws_vpc_endpoint.Relay.Vpc_endpoint_id,
    ///             },
    ///             RestApis = new[]
    ///             {
    ///                 databricks_mws_vpc_endpoint.Workspace.Vpc_endpoint_id,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Modifying networks on running workspaces (AWS only)
    /// 
    /// Due to specifics of platform APIs, changing any attribute of network configuration would cause `databricks.MwsNetworks` to be re-created - deleted &amp; added again with special case for running workspaces. Once network configuration is attached to a running databricks_mws_workspaces, you cannot delete it and `pulumi up` would result in `INVALID_STATE: Unable to delete, Network is being used by active workspace X` error. In order to modify any attributes of a network, you have to perform three different `pulumi up` steps:
    /// 
    /// 1. Create a new `databricks.MwsNetworks` resource.
    /// 2. Update the `databricks.MwsWorkspaces` to point to the new `network_id`.
    /// 3. Delete the old `databricks.MwsNetworks` resource.
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are used in the same context:
    /// 
    /// * Provisioning Databricks on AWS guide.
    /// * Provisioning Databricks on AWS with PrivateLink guide.
    /// * Provisioning AWS Databricks E2 with a Hub &amp; Spoke firewall for data exfiltration protection guide.
    /// * Provisioning Databricks on GCP guide.
    /// * Provisioning Databricks workspaces on GCP with Private Service Connect guide.
    /// * databricks.MwsVpcEndpoint resources with Databricks such that they can be used as part of a databricks.MwsNetworks configuration.
    /// * databricks.MwsPrivateAccessSettings to create a Private Access Setting that can be used as part of a databricks.MwsWorkspaces resource to create a [Databricks Workspace that leverages AWS PrivateLink](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html) or [GCP Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html).
    /// * databricks.MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
    /// 
    /// ## Import
    /// 
    /// -&gt; **Note** Importing this resource is not currently supported.
    /// </summary>
    [DatabricksResourceType("databricks:index/mwsNetworks:MwsNetworks")]
    public partial class MwsNetworks : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        [Output("creationTime")]
        public Output<int> CreationTime { get; private set; } = null!;

        [Output("errorMessages")]
        public Output<ImmutableArray<Outputs.MwsNetworksErrorMessage>> ErrorMessages { get; private set; } = null!;

        /// <summary>
        /// a block consists of Google Cloud specific information for this network, for example the VPC ID, subnet ID, and secondary IP ranges. It has the following fields:
        /// </summary>
        [Output("gcpNetworkInfo")]
        public Output<Outputs.MwsNetworksGcpNetworkInfo?> GcpNetworkInfo { get; private set; } = null!;

        /// <summary>
        /// (String) id of network to be used for databricks.MwsWorkspaces resource.
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// name under which this network is registered
        /// </summary>
        [Output("networkName")]
        public Output<string> NetworkName { get; private set; } = null!;

        /// <summary>
        /// ids of aws_security_group
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// ids of aws_subnet
        /// </summary>
        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

        /// <summary>
        /// mapping of databricks.MwsVpcEndpoint for PrivateLink or Private Service Connect connections
        /// </summary>
        [Output("vpcEndpoints")]
        public Output<Outputs.MwsNetworksVpcEndpoints> VpcEndpoints { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC associated with this network. VPC IDs can be used in multiple network configurations.
        /// </summary>
        [Output("vpcId")]
        public Output<string?> VpcId { get; private set; } = null!;

        /// <summary>
        /// (String) VPC attachment status
        /// </summary>
        [Output("vpcStatus")]
        public Output<string> VpcStatus { get; private set; } = null!;

        /// <summary>
        /// (Integer) id of associated workspace
        /// </summary>
        [Output("workspaceId")]
        public Output<int> WorkspaceId { get; private set; } = null!;


        /// <summary>
        /// Create a MwsNetworks resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MwsNetworks(string name, MwsNetworksArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/mwsNetworks:MwsNetworks", name, args ?? new MwsNetworksArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MwsNetworks(string name, Input<string> id, MwsNetworksState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/mwsNetworks:MwsNetworks", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "accountId",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MwsNetworks resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MwsNetworks Get(string name, Input<string> id, MwsNetworksState? state = null, CustomResourceOptions? options = null)
        {
            return new MwsNetworks(name, id, state, options);
        }
    }

    public sealed class MwsNetworksArgs : global::Pulumi.ResourceArgs
    {
        [Input("accountId", required: true)]
        private Input<string>? _accountId;

        /// <summary>
        /// Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        /// </summary>
        public Input<string>? AccountId
        {
            get => _accountId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("creationTime")]
        public Input<int>? CreationTime { get; set; }

        [Input("errorMessages")]
        private InputList<Inputs.MwsNetworksErrorMessageArgs>? _errorMessages;
        public InputList<Inputs.MwsNetworksErrorMessageArgs> ErrorMessages
        {
            get => _errorMessages ?? (_errorMessages = new InputList<Inputs.MwsNetworksErrorMessageArgs>());
            set => _errorMessages = value;
        }

        /// <summary>
        /// a block consists of Google Cloud specific information for this network, for example the VPC ID, subnet ID, and secondary IP ranges. It has the following fields:
        /// </summary>
        [Input("gcpNetworkInfo")]
        public Input<Inputs.MwsNetworksGcpNetworkInfoArgs>? GcpNetworkInfo { get; set; }

        /// <summary>
        /// (String) id of network to be used for databricks.MwsWorkspaces resource.
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// name under which this network is registered
        /// </summary>
        [Input("networkName", required: true)]
        public Input<string> NetworkName { get; set; } = null!;

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// ids of aws_security_group
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// ids of aws_subnet
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        /// <summary>
        /// mapping of databricks.MwsVpcEndpoint for PrivateLink or Private Service Connect connections
        /// </summary>
        [Input("vpcEndpoints")]
        public Input<Inputs.MwsNetworksVpcEndpointsArgs>? VpcEndpoints { get; set; }

        /// <summary>
        /// The ID of the VPC associated with this network. VPC IDs can be used in multiple network configurations.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// (String) VPC attachment status
        /// </summary>
        [Input("vpcStatus")]
        public Input<string>? VpcStatus { get; set; }

        /// <summary>
        /// (Integer) id of associated workspace
        /// </summary>
        [Input("workspaceId")]
        public Input<int>? WorkspaceId { get; set; }

        public MwsNetworksArgs()
        {
        }
        public static new MwsNetworksArgs Empty => new MwsNetworksArgs();
    }

    public sealed class MwsNetworksState : global::Pulumi.ResourceArgs
    {
        [Input("accountId")]
        private Input<string>? _accountId;

        /// <summary>
        /// Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        /// </summary>
        public Input<string>? AccountId
        {
            get => _accountId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("creationTime")]
        public Input<int>? CreationTime { get; set; }

        [Input("errorMessages")]
        private InputList<Inputs.MwsNetworksErrorMessageGetArgs>? _errorMessages;
        public InputList<Inputs.MwsNetworksErrorMessageGetArgs> ErrorMessages
        {
            get => _errorMessages ?? (_errorMessages = new InputList<Inputs.MwsNetworksErrorMessageGetArgs>());
            set => _errorMessages = value;
        }

        /// <summary>
        /// a block consists of Google Cloud specific information for this network, for example the VPC ID, subnet ID, and secondary IP ranges. It has the following fields:
        /// </summary>
        [Input("gcpNetworkInfo")]
        public Input<Inputs.MwsNetworksGcpNetworkInfoGetArgs>? GcpNetworkInfo { get; set; }

        /// <summary>
        /// (String) id of network to be used for databricks.MwsWorkspaces resource.
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// name under which this network is registered
        /// </summary>
        [Input("networkName")]
        public Input<string>? NetworkName { get; set; }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// ids of aws_security_group
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// ids of aws_subnet
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        /// <summary>
        /// mapping of databricks.MwsVpcEndpoint for PrivateLink or Private Service Connect connections
        /// </summary>
        [Input("vpcEndpoints")]
        public Input<Inputs.MwsNetworksVpcEndpointsGetArgs>? VpcEndpoints { get; set; }

        /// <summary>
        /// The ID of the VPC associated with this network. VPC IDs can be used in multiple network configurations.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// (String) VPC attachment status
        /// </summary>
        [Input("vpcStatus")]
        public Input<string>? VpcStatus { get; set; }

        /// <summary>
        /// (Integer) id of associated workspace
        /// </summary>
        [Input("workspaceId")]
        public Input<int>? WorkspaceId { get; set; }

        public MwsNetworksState()
        {
        }
        public static new MwsNetworksState Empty => new MwsNetworksState();
    }
}
