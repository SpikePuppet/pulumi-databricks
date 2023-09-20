// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource allows you to manage both [account groups and workspace-local groups](https://docs.databricks.com/administration-guide/users-groups/groups.html). You can use the databricks.GroupMember resource to assign Databricks users, service principals as well as other groups as members of the group. This is useful if you are using an application to sync users & groups with SCIM API.
 *
 * > **Note** To assign an account level group to a workspace use databricks_mws_permission_assignment.
 *
 * To create account groups in the Databricks account, the provider must be configured accordingly. On AWS deployment with `host = "https://accounts.cloud.databricks.com"` and `accountId = "00000000-0000-0000-0000-000000000000"`. On Azure deployments `host = "https://accounts.azuredatabricks.net"`, `accountId = "00000000-0000-0000-0000-000000000000"` and using AAD tokens as authentication.
 *
 * Recommended to use along with Identity Provider SCIM provisioning to populate users into those groups:
 *
 * * [Azure Active Directory](https://docs.microsoft.com/en-us/azure/databricks/administration-guide/users-groups/scim/aad)
 * * [Okta](https://docs.databricks.com/administration-guide/users-groups/scim/okta.html)
 * * [OneLogin](https://docs.databricks.com/administration-guide/users-groups/scim/onelogin.html)
 *
 * ## Example Usage
 *
 * Creating some group
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const _this = new databricks.Group("this", {
 *     allowClusterCreate: true,
 *     allowInstancePoolCreate: true,
 * });
 * ```
 *
 * Adding databricks.User as databricks.GroupMember of some group
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const thisGroup = new databricks.Group("thisGroup", {
 *     allowClusterCreate: true,
 *     allowInstancePoolCreate: true,
 * });
 * const thisUser = new databricks.User("thisUser", {userName: "someone@example.com"});
 * const vipMember = new databricks.GroupMember("vipMember", {
 *     groupId: thisGroup.id,
 *     memberId: thisUser.id,
 * });
 * ```
 *
 * Creating group in AWS Databricks account:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * // initialize provider at account-level
 * const mws = new databricks.Provider("mws", {
 *     host: "https://accounts.cloud.databricks.com",
 *     accountId: "00000000-0000-0000-0000-000000000000",
 *     clientId: _var.client_id,
 *     clientSecret: _var.client_secret,
 * });
 * const _this = new databricks.Group("this", {}, {
 *     provider: databricks.mws,
 * });
 * ```
 *
 * Creating group in Azure Databricks account:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * // initialize provider at Azure account-level
 * const azureAccount = new databricks.Provider("azureAccount", {
 *     host: "https://accounts.azuredatabricks.net",
 *     accountId: "00000000-0000-0000-0000-000000000000",
 *     authType: "azure-cli",
 * });
 * const _this = new databricks.Group("this", {}, {
 *     provider: databricks.azure_account,
 * });
 * ```
 *
 * ## Import
 *
 * You can import a `databricks_group` resource with the name `my_group` like the followingbash
 *
 * ```sh
 *  $ pulumi import databricks:index/group:Group my_group <group_id>
 * ```
 */
export class Group extends pulumi.CustomResource {
    /**
     * Get an existing Group resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupState, opts?: pulumi.CustomResourceOptions): Group {
        return new Group(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/group:Group';

    /**
     * Returns true if the given object is an instance of Group.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Group {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Group.__pulumiType;
    }

    /**
     * identifier for use in databricks_access_control_rule_set, e.g. `groups/Some Group`.
     */
    public readonly aclPrincipalId!: pulumi.Output<string>;
    /**
     * This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with databricks.Permissions and clusterId argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
     */
    public readonly allowClusterCreate!: pulumi.Output<boolean | undefined>;
    /**
     * This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with databricks.Permissions and instancePoolId argument.
     */
    public readonly allowInstancePoolCreate!: pulumi.Output<boolean | undefined>;
    /**
     * This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
     */
    public readonly databricksSqlAccess!: pulumi.Output<boolean | undefined>;
    /**
     * This is the display name for the given group.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * ID of the group in an external identity provider.
     */
    public readonly externalId!: pulumi.Output<string | undefined>;
    public readonly force!: pulumi.Output<boolean | undefined>;
    public readonly url!: pulumi.Output<string>;
    /**
     * This is a field to allow the group to have access to Databricks Workspace.
     */
    public readonly workspaceAccess!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Group resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: GroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GroupArgs | GroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GroupState | undefined;
            resourceInputs["aclPrincipalId"] = state ? state.aclPrincipalId : undefined;
            resourceInputs["allowClusterCreate"] = state ? state.allowClusterCreate : undefined;
            resourceInputs["allowInstancePoolCreate"] = state ? state.allowInstancePoolCreate : undefined;
            resourceInputs["databricksSqlAccess"] = state ? state.databricksSqlAccess : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["externalId"] = state ? state.externalId : undefined;
            resourceInputs["force"] = state ? state.force : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["workspaceAccess"] = state ? state.workspaceAccess : undefined;
        } else {
            const args = argsOrState as GroupArgs | undefined;
            resourceInputs["aclPrincipalId"] = args ? args.aclPrincipalId : undefined;
            resourceInputs["allowClusterCreate"] = args ? args.allowClusterCreate : undefined;
            resourceInputs["allowInstancePoolCreate"] = args ? args.allowInstancePoolCreate : undefined;
            resourceInputs["databricksSqlAccess"] = args ? args.databricksSqlAccess : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["externalId"] = args ? args.externalId : undefined;
            resourceInputs["force"] = args ? args.force : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
            resourceInputs["workspaceAccess"] = args ? args.workspaceAccess : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Group.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Group resources.
 */
export interface GroupState {
    /**
     * identifier for use in databricks_access_control_rule_set, e.g. `groups/Some Group`.
     */
    aclPrincipalId?: pulumi.Input<string>;
    /**
     * This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with databricks.Permissions and clusterId argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
     */
    allowClusterCreate?: pulumi.Input<boolean>;
    /**
     * This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with databricks.Permissions and instancePoolId argument.
     */
    allowInstancePoolCreate?: pulumi.Input<boolean>;
    /**
     * This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
     */
    databricksSqlAccess?: pulumi.Input<boolean>;
    /**
     * This is the display name for the given group.
     */
    displayName?: pulumi.Input<string>;
    /**
     * ID of the group in an external identity provider.
     */
    externalId?: pulumi.Input<string>;
    force?: pulumi.Input<boolean>;
    url?: pulumi.Input<string>;
    /**
     * This is a field to allow the group to have access to Databricks Workspace.
     */
    workspaceAccess?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Group resource.
 */
export interface GroupArgs {
    /**
     * identifier for use in databricks_access_control_rule_set, e.g. `groups/Some Group`.
     */
    aclPrincipalId?: pulumi.Input<string>;
    /**
     * This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with databricks.Permissions and clusterId argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
     */
    allowClusterCreate?: pulumi.Input<boolean>;
    /**
     * This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with databricks.Permissions and instancePoolId argument.
     */
    allowInstancePoolCreate?: pulumi.Input<boolean>;
    /**
     * This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
     */
    databricksSqlAccess?: pulumi.Input<boolean>;
    /**
     * This is the display name for the given group.
     */
    displayName?: pulumi.Input<string>;
    /**
     * ID of the group in an external identity provider.
     */
    externalId?: pulumi.Input<string>;
    force?: pulumi.Input<boolean>;
    url?: pulumi.Input<string>;
    /**
     * This is a field to allow the group to have access to Databricks Workspace.
     */
    workspaceAccess?: pulumi.Input<boolean>;
}
