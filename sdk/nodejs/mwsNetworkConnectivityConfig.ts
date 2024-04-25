// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > **Note** Initialize provider with `alias = "account"`, `host = "https://accounts.azuredatabricks.net"` and use `provider = databricks.account` for all `databricks_mws_*` resources.
 *
 * > **Public Preview** This feature is available for AWS & Azure only, and is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html) in AWS.
 *
 * Allows you to create a [Network Connectivity Config] that can be used as part of a databricks.MwsWorkspaces resource to create a [Databricks Workspace that leverages serverless network connectivity configs](https://learn.microsoft.com/en-us/azure/databricks/security/network/serverless-network-security/serverless-firewall).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const config = new pulumi.Config();
 * const region = config.requireObject("region");
 * const prefix = config.requireObject("prefix");
 * const ncc = new databricks.MwsNetworkConnectivityConfig("ncc", {
 *     name: `Network Connectivity Config for ${prefix}`,
 *     region: region,
 * });
 * const nccBinding = new databricks.MwsNccBinding("ncc_binding", {
 *     networkConnectivityConfigId: ncc.networkConnectivityConfigId,
 *     workspaceId: databricksWorkspaceId,
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the context:
 *
 * * databricks.MwsWorkspaces to set up Databricks workspaces.
 * * databricks.MwsNccBinding to attach an NCC to a workspace.
 * * databricks.MwsNccPrivateEndpointRule to create a private endpoint rule.
 *
 * ## Import
 *
 * This resource can be imported by Databricks account ID and Network Connectivity Config ID.
 *
 * ```sh
 * $ pulumi import databricks:index/mwsNetworkConnectivityConfig:MwsNetworkConnectivityConfig ncc <account_id>/<network_connectivity_config_id>
 * ```
 */
export class MwsNetworkConnectivityConfig extends pulumi.CustomResource {
    /**
     * Get an existing MwsNetworkConnectivityConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MwsNetworkConnectivityConfigState, opts?: pulumi.CustomResourceOptions): MwsNetworkConnectivityConfig {
        return new MwsNetworkConnectivityConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/mwsNetworkConnectivityConfig:MwsNetworkConnectivityConfig';

    /**
     * Returns true if the given object is an instance of MwsNetworkConnectivityConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MwsNetworkConnectivityConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MwsNetworkConnectivityConfig.__pulumiType;
    }

    public readonly accountId!: pulumi.Output<string>;
    public readonly creationTime!: pulumi.Output<number>;
    public readonly egressConfig!: pulumi.Output<outputs.MwsNetworkConnectivityConfigEgressConfig>;
    /**
     * Name of Network Connectivity Config in Databricks Account. Change forces creation of a new resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Canonical unique identifier of Network Connectivity Config in Databricks Account
     */
    public readonly networkConnectivityConfigId!: pulumi.Output<string>;
    /**
     * Region of the Network Connectivity Config. NCCs can only be referenced by your workspaces in the same region. Change forces creation of a new resource.
     */
    public readonly region!: pulumi.Output<string>;
    public readonly updatedTime!: pulumi.Output<number>;

    /**
     * Create a MwsNetworkConnectivityConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MwsNetworkConnectivityConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MwsNetworkConnectivityConfigArgs | MwsNetworkConnectivityConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MwsNetworkConnectivityConfigState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["creationTime"] = state ? state.creationTime : undefined;
            resourceInputs["egressConfig"] = state ? state.egressConfig : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkConnectivityConfigId"] = state ? state.networkConnectivityConfigId : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["updatedTime"] = state ? state.updatedTime : undefined;
        } else {
            const args = argsOrState as MwsNetworkConnectivityConfigArgs | undefined;
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["creationTime"] = args ? args.creationTime : undefined;
            resourceInputs["egressConfig"] = args ? args.egressConfig : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkConnectivityConfigId"] = args ? args.networkConnectivityConfigId : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["updatedTime"] = args ? args.updatedTime : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MwsNetworkConnectivityConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MwsNetworkConnectivityConfig resources.
 */
export interface MwsNetworkConnectivityConfigState {
    accountId?: pulumi.Input<string>;
    creationTime?: pulumi.Input<number>;
    egressConfig?: pulumi.Input<inputs.MwsNetworkConnectivityConfigEgressConfig>;
    /**
     * Name of Network Connectivity Config in Databricks Account. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Canonical unique identifier of Network Connectivity Config in Databricks Account
     */
    networkConnectivityConfigId?: pulumi.Input<string>;
    /**
     * Region of the Network Connectivity Config. NCCs can only be referenced by your workspaces in the same region. Change forces creation of a new resource.
     */
    region?: pulumi.Input<string>;
    updatedTime?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a MwsNetworkConnectivityConfig resource.
 */
export interface MwsNetworkConnectivityConfigArgs {
    accountId?: pulumi.Input<string>;
    creationTime?: pulumi.Input<number>;
    egressConfig?: pulumi.Input<inputs.MwsNetworkConnectivityConfigEgressConfig>;
    /**
     * Name of Network Connectivity Config in Databricks Account. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Canonical unique identifier of Network Connectivity Config in Databricks Account
     */
    networkConnectivityConfigId?: pulumi.Input<string>;
    /**
     * Region of the Network Connectivity Config. NCCs can only be referenced by your workspaces in the same region. Change forces creation of a new resource.
     */
    region: pulumi.Input<string>;
    updatedTime?: pulumi.Input<number>;
}
