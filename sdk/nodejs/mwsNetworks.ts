// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 * ### Creating a Databricks on AWS workspace
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as databricks from "@pulumi/databricks";
 *
 * const config = new pulumi.Config();
 * const databricksAccountId = config.requireObject("databricksAccountId");
 * const available = aws.getAvailabilityZones({});
 * const _this = new databricks.MwsNetworks("this", {
 *     accountId: databricksAccountId,
 *     networkName: `${local.prefix}-network`,
 *     securityGroupIds: [module.vpc.default_security_group_id],
 *     subnetIds: module.vpc.private_subnets,
 *     vpcId: module.vpc.vpc_id,
 * }, {
 *     provider: databricks.mws,
 * });
 * ```
 *
 * In order to create a VPC [that leverages AWS PrivateLink](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html) you would need to add the `vpcEndpointId` Attributes from mwsVpcEndpoint resources into the databricks.MwsNetworks resource. For example:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const _this = new databricks.MwsNetworks("this", {
 *     accountId: _var.databricks_account_id,
 *     networkName: `${local.prefix}-network`,
 *     securityGroupIds: [module.vpc.default_security_group_id],
 *     subnetIds: module.vpc.private_subnets,
 *     vpcId: module.vpc.vpc_id,
 *     vpcEndpoints: {
 *         dataplaneRelays: [databricks_mws_vpc_endpoint.relay.vpc_endpoint_id],
 *         restApis: [databricks_mws_vpc_endpoint.workspace.vpc_endpoint_id],
 *     },
 * }, {
 *     provider: databricks.mws,
 *     dependsOn: [
 *         aws_vpc_endpoint.workspace,
 *         aws_vpc_endpoint.relay,
 *     ],
 * });
 * ```
 * ### Creating a Databricks on GCP workspace
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 * import * as google from "@pulumi/google";
 *
 * const config = new pulumi.Config();
 * const databricksAccountId = config.requireObject("databricksAccountId");
 * const dbxPrivateVpc = new google.index.Google_compute_network("dbxPrivateVpc", {
 *     project: _var.google_project,
 *     name: `tf-network-${random_string.suffix.result}`,
 *     autoCreateSubnetworks: false,
 * });
 * const network_with_private_secondary_ip_ranges = new google.index.Google_compute_subnetwork("network-with-private-secondary-ip-ranges", {
 *     name: `test-dbx-${random_string.suffix.result}`,
 *     ipCidrRange: "10.0.0.0/16",
 *     region: "us-central1",
 *     network: dbxPrivateVpc.id,
 *     secondaryIpRange: [
 *         {
 *             rangeName: "pods",
 *             ipCidrRange: "10.1.0.0/16",
 *         },
 *         {
 *             rangeName: "svc",
 *             ipCidrRange: "10.2.0.0/20",
 *         },
 *     ],
 *     privateIpGoogleAccess: true,
 * });
 * const router = new google.index.Google_compute_router("router", {
 *     name: `my-router-${random_string.suffix.result}`,
 *     region: network_with_private_secondary_ip_ranges.region,
 *     network: dbxPrivateVpc.id,
 * });
 * const nat = new google.index.Google_compute_router_nat("nat", {
 *     name: `my-router-nat-${random_string.suffix.result}`,
 *     router: router.name,
 *     region: router.region,
 *     natIpAllocateOption: "AUTO_ONLY",
 *     sourceSubnetworkIpRangesToNat: "ALL_SUBNETWORKS_ALL_IP_RANGES",
 * });
 * const _this = new databricks.MwsNetworks("this", {
 *     accountId: databricksAccountId,
 *     networkName: `test-demo-${random_string.suffix.result}`,
 *     gcpNetworkInfo: {
 *         networkProjectId: _var.google_project,
 *         vpcId: dbxPrivateVpc.name,
 *         subnetId: google_compute_subnetwork.network_with_private_secondary_ip_ranges.name,
 *         subnetRegion: google_compute_subnetwork.network_with_private_secondary_ip_ranges.region,
 *         podIpRangeName: "pods",
 *         serviceIpRangeName: "svc",
 *     },
 * });
 * ```
 *
 * In order to create a VPC [that leverages GCP Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html) you would need to add the `vpcEndpointId` Attributes from mwsVpcEndpoint resources into the databricks.MwsNetworks resource. For example:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const _this = new databricks.MwsNetworks("this", {
 *     accountId: _var.databricks_account_id,
 *     networkName: `test-demo-${random_string.suffix.result}`,
 *     gcpNetworkInfo: {
 *         networkProjectId: _var.google_project,
 *         vpcId: google_compute_network.dbx_private_vpc.name,
 *         subnetId: google_compute_subnetwork.network_with_private_secondary_ip_ranges.name,
 *         subnetRegion: google_compute_subnetwork.network_with_private_secondary_ip_ranges.region,
 *         podIpRangeName: "pods",
 *         serviceIpRangeName: "svc",
 *     },
 *     vpcEndpoints: {
 *         dataplaneRelays: [databricks_mws_vpc_endpoint.relay.vpc_endpoint_id],
 *         restApis: [databricks_mws_vpc_endpoint.workspace.vpc_endpoint_id],
 *     },
 * });
 * ```
 * ## Modifying networks on running workspaces (AWS only)
 *
 * Due to specifics of platform APIs, changing any attribute of network configuration would cause `databricks.MwsNetworks` to be re-created - deleted & added again with special case for running workspaces. Once network configuration is attached to a running databricks_mws_workspaces, you cannot delete it and `pulumi up` would result in `INVALID_STATE: Unable to delete, Network is being used by active workspace X` error. In order to modify any attributes of a network, you have to perform three different `pulumi up` steps:
 *
 * 1. Create a new `databricks.MwsNetworks` resource.
 * 2. Update the `databricks.MwsWorkspaces` to point to the new `networkId`.
 * 3. Delete the old `databricks.MwsNetworks` resource.
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * Provisioning Databricks on AWS guide.
 * * Provisioning Databricks on AWS with PrivateLink guide.
 * * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide.
 * * Provisioning Databricks on GCP guide.
 * * Provisioning Databricks workspaces on GCP with Private Service Connect guide.
 * * databricks.MwsVpcEndpoint resources with Databricks such that they can be used as part of a databricks.MwsNetworks configuration.
 * * databricks.MwsPrivateAccessSettings to create a Private Access Setting that can be used as part of a databricks.MwsWorkspaces resource to create a [Databricks Workspace that leverages AWS PrivateLink](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html) or [GCP Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html).
 * * databricks.MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
 *
 * ## Import
 *
 * -> **Note** Importing this resource is not currently supported.
 */
export class MwsNetworks extends pulumi.CustomResource {
    /**
     * Get an existing MwsNetworks resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MwsNetworksState, opts?: pulumi.CustomResourceOptions): MwsNetworks {
        return new MwsNetworks(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/mwsNetworks:MwsNetworks';

    /**
     * Returns true if the given object is an instance of MwsNetworks.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MwsNetworks {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MwsNetworks.__pulumiType;
    }

    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     */
    public readonly accountId!: pulumi.Output<string>;
    public readonly creationTime!: pulumi.Output<number>;
    public readonly errorMessages!: pulumi.Output<outputs.MwsNetworksErrorMessage[]>;
    /**
     * a block consists of Google Cloud specific information for this network, for example the VPC ID, subnet ID, and secondary IP ranges. It has the following fields:
     */
    public readonly gcpNetworkInfo!: pulumi.Output<outputs.MwsNetworksGcpNetworkInfo | undefined>;
    /**
     * (String) id of network to be used for databricks.MwsWorkspaces resource.
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * name under which this network is registered
     */
    public readonly networkName!: pulumi.Output<string>;
    /**
     * ids of aws_security_group
     */
    public readonly securityGroupIds!: pulumi.Output<string[] | undefined>;
    /**
     * ids of aws_subnet
     */
    public readonly subnetIds!: pulumi.Output<string[] | undefined>;
    /**
     * mapping of databricks.MwsVpcEndpoint for PrivateLink or Private Service Connect connections
     */
    public readonly vpcEndpoints!: pulumi.Output<outputs.MwsNetworksVpcEndpoints>;
    /**
     * The ID of the VPC associated with this network. VPC IDs can be used in multiple network configurations.
     */
    public readonly vpcId!: pulumi.Output<string | undefined>;
    /**
     * (String) VPC attachment status
     */
    public readonly vpcStatus!: pulumi.Output<string>;
    /**
     * (Integer) id of associated workspace
     */
    public readonly workspaceId!: pulumi.Output<number>;

    /**
     * Create a MwsNetworks resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MwsNetworksArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MwsNetworksArgs | MwsNetworksState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MwsNetworksState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["creationTime"] = state ? state.creationTime : undefined;
            resourceInputs["errorMessages"] = state ? state.errorMessages : undefined;
            resourceInputs["gcpNetworkInfo"] = state ? state.gcpNetworkInfo : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["networkName"] = state ? state.networkName : undefined;
            resourceInputs["securityGroupIds"] = state ? state.securityGroupIds : undefined;
            resourceInputs["subnetIds"] = state ? state.subnetIds : undefined;
            resourceInputs["vpcEndpoints"] = state ? state.vpcEndpoints : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
            resourceInputs["vpcStatus"] = state ? state.vpcStatus : undefined;
            resourceInputs["workspaceId"] = state ? state.workspaceId : undefined;
        } else {
            const args = argsOrState as MwsNetworksArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.networkName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkName'");
            }
            resourceInputs["accountId"] = args?.accountId ? pulumi.secret(args.accountId) : undefined;
            resourceInputs["creationTime"] = args ? args.creationTime : undefined;
            resourceInputs["errorMessages"] = args ? args.errorMessages : undefined;
            resourceInputs["gcpNetworkInfo"] = args ? args.gcpNetworkInfo : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["networkName"] = args ? args.networkName : undefined;
            resourceInputs["securityGroupIds"] = args ? args.securityGroupIds : undefined;
            resourceInputs["subnetIds"] = args ? args.subnetIds : undefined;
            resourceInputs["vpcEndpoints"] = args ? args.vpcEndpoints : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["vpcStatus"] = args ? args.vpcStatus : undefined;
            resourceInputs["workspaceId"] = args ? args.workspaceId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["accountId"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(MwsNetworks.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MwsNetworks resources.
 */
export interface MwsNetworksState {
    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     */
    accountId?: pulumi.Input<string>;
    creationTime?: pulumi.Input<number>;
    errorMessages?: pulumi.Input<pulumi.Input<inputs.MwsNetworksErrorMessage>[]>;
    /**
     * a block consists of Google Cloud specific information for this network, for example the VPC ID, subnet ID, and secondary IP ranges. It has the following fields:
     */
    gcpNetworkInfo?: pulumi.Input<inputs.MwsNetworksGcpNetworkInfo>;
    /**
     * (String) id of network to be used for databricks.MwsWorkspaces resource.
     */
    networkId?: pulumi.Input<string>;
    /**
     * name under which this network is registered
     */
    networkName?: pulumi.Input<string>;
    /**
     * ids of aws_security_group
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ids of aws_subnet
     */
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * mapping of databricks.MwsVpcEndpoint for PrivateLink or Private Service Connect connections
     */
    vpcEndpoints?: pulumi.Input<inputs.MwsNetworksVpcEndpoints>;
    /**
     * The ID of the VPC associated with this network. VPC IDs can be used in multiple network configurations.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * (String) VPC attachment status
     */
    vpcStatus?: pulumi.Input<string>;
    /**
     * (Integer) id of associated workspace
     */
    workspaceId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a MwsNetworks resource.
 */
export interface MwsNetworksArgs {
    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     */
    accountId: pulumi.Input<string>;
    creationTime?: pulumi.Input<number>;
    errorMessages?: pulumi.Input<pulumi.Input<inputs.MwsNetworksErrorMessage>[]>;
    /**
     * a block consists of Google Cloud specific information for this network, for example the VPC ID, subnet ID, and secondary IP ranges. It has the following fields:
     */
    gcpNetworkInfo?: pulumi.Input<inputs.MwsNetworksGcpNetworkInfo>;
    /**
     * (String) id of network to be used for databricks.MwsWorkspaces resource.
     */
    networkId?: pulumi.Input<string>;
    /**
     * name under which this network is registered
     */
    networkName: pulumi.Input<string>;
    /**
     * ids of aws_security_group
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ids of aws_subnet
     */
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * mapping of databricks.MwsVpcEndpoint for PrivateLink or Private Service Connect connections
     */
    vpcEndpoints?: pulumi.Input<inputs.MwsNetworksVpcEndpoints>;
    /**
     * The ID of the VPC associated with this network. VPC IDs can be used in multiple network configurations.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * (String) VPC attachment status
     */
    vpcStatus?: pulumi.Input<string>;
    /**
     * (Integer) id of associated workspace
     */
    workspaceId?: pulumi.Input<number>;
}
