// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Databricks on AWS usage
 *
 * > **Note** Initialize provider with `alias = "mws"`, `host  = "https://accounts.cloud.databricks.com"` and use `provider = databricks.mws`
 *
 * Use this resource to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS. It is essential to understand that this will require you to configure your provider separately for the multiple workspaces resources.
 *
 * * Databricks must have access to at least two subnets for each workspace, with each subnet in a different Availability Zone. You cannot specify more than one Databricks workspace subnet per Availability Zone in the Create network configuration API call. You can have more than one subnet per Availability Zone as part of your network setup, but you can choose only one subnet per Availability Zone for the Databricks workspace.
 * * Databricks assigns two IP addresses per node, one for management traffic and one for Spark applications. The total number of instances for each subnet is equal to half of the available IP addresses.
 * * Each subnet must have a netmask between /17 and /25.
 * * Subnets must be private.
 * * Subnets must have outbound access to the public network using a aws_nat_gateway, or other similar customer-managed appliance infrastructure.
 * * The NAT gateway must be set up in its subnet (public_subnets in the example below) that routes quad-zero (0.0.0.0/0) traffic to an internet gateway or other customer-managed appliance infrastructure.
 *
 * > **Note** The NAT gateway needs only one IP address per AZ. Hence, the public subnet only needs two IP addresses. In order to limit the number of IP addresses in the public subnet, you can specify a secondary CIDR block (cidr_block_public) using the argument secondaryCidrBlocks then pass it to the publicSubnets argument. Please review the [IPv4 CIDR block association restrictions](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) when choosing the secondary cidr block.
 *
 * Please follow this complete runnable example & subnet for new workspaces within GCP. It is essential to understand that this will require you to configure your provider separately for the multiple workspaces resources.
 *
 * * Databricks must have access to a subnet in the same region as the workspace, of which IP range will be used to allocate your workspace’s GKE cluster nodes.
 * * The subnet must have a netmask between /29 and /9.
 * * Databricks must have access to 2 secondary IP ranges, one between /21 to /9 for workspace’s GKE cluster pods, and one between /27 to /16 for workspace’s GKE cluster services.
 * * Subnet must have outbound access to the public network using a gcpComputeRouterNat or other similar customer-managed appliance infrastructure.
 *
 * Please follow this complete runnable example]
 *   privateSubnets = [cidrsubnet(var.cidr_block, 3, 1),
 *   cidrsubnet(var.cidr_block, 3, 2)]
 *
 *   defaultSecurityGroupEgress = [{
 *     cidrBlocks = "0.0.0.0/0"
 *   }]
 *
 *   defaultSecurityGroupIngress = [{
 *     description = "Allow all internal TCP and UDP"
 *     self        = true
 *   }]
 * }
 *
 * resource "databricks.MwsNetworks" "this" {
 *   provider           = databricks.mws
 *   accountId         = var.databricks_account_id
 *   networkName       = "${local.prefix}-network"
 *   securityGroupIds = [module.vpc.default_security_group_id]
 *   subnetIds         = module.vpc.private_subnets
 *   vpcId             = module.vpc.vpc_id
 * }
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
