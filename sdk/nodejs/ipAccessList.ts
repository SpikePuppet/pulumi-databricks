// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Security-conscious enterprises that use cloud SaaS applications need to restrict access to their own employees. Authentication helps to prove user identity, but that does not enforce network location of the users. Accessing a cloud service from an unsecured network can pose security risks to an enterprise, especially when the user may have authorized access to sensitive or personal data. Enterprise network perimeters apply security policies and limit access to external services (for example, firewalls, proxies, DLP, and logging), so access beyond these controls are assumed to be untrusted. Please see [IP Access List](https://docs.databricks.com/security/network/ip-access-list.html) for full feature documentation.
 *
 * > **Note** The total number of IP addresses and CIDR scopes provided across all ACL Lists in a workspace can not exceed 1000.  Refer to the docs above for specifics.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const _this = new databricks.WorkspaceConf("this", {customConfig: {
 *     enableIpAccessLists: true,
 * }});
 * const allowed_list = new databricks.IpAccessList("allowed-list", {
 *     label: "allow_in",
 *     listType: "ALLOW",
 *     ipAddresses: [
 *         "1.1.1.1",
 *         "1.2.3.0/24",
 *         "1.2.5.0/24",
 *     ],
 * }, {
 *     dependsOn: [_this],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * End to end workspace management guide.
 * * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide.
 * * databricks.MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS.
 * * databricks.MwsPrivateAccessSettings to create a [Private Access Setting](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html#step-5-create-a-private-access-settings-configuration-using-the-databricks-account-api) that can be used as part of a databricks.MwsWorkspaces resource to create a [Databricks Workspace that leverages AWS PrivateLink](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html).
 * * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
 * * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
 *
 * ## Import
 *
 * The databricks_ip_access_list can be imported using id:
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/ipAccessList:IpAccessList this <list-id>
 * ```
 */
export class IpAccessList extends pulumi.CustomResource {
    /**
     * Get an existing IpAccessList resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IpAccessListState, opts?: pulumi.CustomResourceOptions): IpAccessList {
        return new IpAccessList(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/ipAccessList:IpAccessList';

    /**
     * Returns true if the given object is an instance of IpAccessList.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IpAccessList {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IpAccessList.__pulumiType;
    }

    /**
     * Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * A string list of IP addresses and CIDR ranges.
     */
    public readonly ipAddresses!: pulumi.Output<string[]>;
    /**
     * This is the display name for the given IP ACL List.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * Can only be "ALLOW" or "BLOCK".
     */
    public readonly listType!: pulumi.Output<string>;

    /**
     * Create a IpAccessList resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IpAccessListArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IpAccessListArgs | IpAccessListState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IpAccessListState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["ipAddresses"] = state ? state.ipAddresses : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["listType"] = state ? state.listType : undefined;
        } else {
            const args = argsOrState as IpAccessListArgs | undefined;
            if ((!args || args.ipAddresses === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipAddresses'");
            }
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            if ((!args || args.listType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'listType'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["ipAddresses"] = args ? args.ipAddresses : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["listType"] = args ? args.listType : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IpAccessList.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IpAccessList resources.
 */
export interface IpAccessListState {
    /**
     * Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * A string list of IP addresses and CIDR ranges.
     */
    ipAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * This is the display name for the given IP ACL List.
     */
    label?: pulumi.Input<string>;
    /**
     * Can only be "ALLOW" or "BLOCK".
     */
    listType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IpAccessList resource.
 */
export interface IpAccessListArgs {
    /**
     * Boolean `true` or `false` indicating whether this list should be active.  Defaults to `true`
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * A string list of IP addresses and CIDR ranges.
     */
    ipAddresses: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * This is the display name for the given IP ACL List.
     */
    label: pulumi.Input<string>;
    /**
     * Can only be "ALLOW" or "BLOCK".
     */
    listType: pulumi.Input<string>;
}
