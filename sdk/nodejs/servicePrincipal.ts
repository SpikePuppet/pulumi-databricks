// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Directly manage [Service Principals](https://docs.databricks.com/administration-guide/users-groups/service-principals.html) that could be added to databricks.Group in Databricks account or workspace.
 *
 * There are different types of service principals:
 *
 * * Databricks-managed - exists only inside the Databricks platform (all clouds) and couldn't be used for accessing non-Databricks services.
 * * Azure-managed - existing Azure service principal (enterprise application) is registered inside Databricks.  It could be used to work with other Azure services.
 *
 * > **Note** To assign account level service principals to workspace use databricks_mws_permission_assignment.
 *
 * > **Note** Entitlements, like, `allowClusterCreate`, `allowInstancePoolCreate`, `databricksSqlAccess`, `workspaceAccess` applicable only for workspace-level service principals. Use databricks.Entitlements resource to assign entitlements inside a workspace to account-level service principals.
 *
 * To create service principals in the Databricks account, the provider must be configured with `host = "https://accounts.cloud.databricks.com"` on AWS deployments or `host = "https://accounts.azuredatabricks.net"` and authenticate using the supported authentication method for account operations.
 *
 * The default behavior when deleting a `databricks.ServicePrincipal` resource depends on whether the provider is configured at the workspace-level or account-level. When the provider is configured at the workspace-level, the service principal will be deleted from the workspace. When the provider is configured at the account-level, the service principal will be deactivated but not deleted. When the provider is configured at the account level, to delete the service principal from the account when the resource is deleted, set `disableAsUserDeletion = false`. Conversely, when the provider is configured at the account-level, to deactivate the service principal when the resource is deleted, set `disableAsUserDeletion = true`.
 *
 * ## Example Usage
 *
 * Creating regular Databricks-managed service principal:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const sp = new databricks.ServicePrincipal("sp", {displayName: "Admin SP"});
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Creating service principal with administrative permissions - referencing special `admins` databricks.Group in databricks.GroupMember resource:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const admins = databricks.getGroup({
 *     displayName: "admins",
 * });
 * const sp = new databricks.ServicePrincipal("sp", {displayName: "Admin SP"});
 * const i_am_admin = new databricks.GroupMember("i-am-admin", {
 *     groupId: admins.then(admins => admins.id),
 *     memberId: sp.id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Creating Azure-managed service principal with cluster create permissions:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const sp = new databricks.ServicePrincipal("sp", {
 *     applicationId: "00000000-0000-0000-0000-000000000000",
 *     displayName: "Example service principal",
 *     allowClusterCreate: true,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Creating Databricks-managed service principal in AWS Databricks account:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const sp = new databricks.ServicePrincipal("sp", {displayName: "Automation-only SP"});
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Creating Azure-managed service principal in Azure Databricks account:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const sp = new databricks.ServicePrincipal("sp", {applicationId: "00000000-0000-0000-0000-000000000000"});
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * - End to end workspace management guide.
 * - databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * - databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * - databricks.GroupMember to attach users and groups as group members.
 * - databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
 * - databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and more to manage secrets for the service principal (only for AWS deployments)
 *
 * ## Import
 *
 * The resource scim service principal can be imported using its id, for example `2345678901234567`. To get the service principal ID, call [Get service principals](https://docs.databricks.com/dev-tools/api/latest/scim/scim-sp.html#get-service-principals).
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/servicePrincipal:ServicePrincipal me <service-principal-id>
 * ```
 */
export class ServicePrincipal extends pulumi.CustomResource {
    /**
     * Get an existing ServicePrincipal resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServicePrincipalState, opts?: pulumi.CustomResourceOptions): ServicePrincipal {
        return new ServicePrincipal(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/servicePrincipal:ServicePrincipal';

    /**
     * Returns true if the given object is an instance of ServicePrincipal.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServicePrincipal {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServicePrincipal.__pulumiType;
    }

    /**
     * identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
     */
    public readonly aclPrincipalId!: pulumi.Output<string>;
    /**
     * Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
     */
    public readonly active!: pulumi.Output<boolean | undefined>;
    /**
     * Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
     */
    public readonly allowClusterCreate!: pulumi.Output<boolean | undefined>;
    /**
     * Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instancePoolId argument.
     */
    public readonly allowInstancePoolCreate!: pulumi.Output<boolean | undefined>;
    /**
     * This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. For Databricks-managed service principals this value is auto-generated.
     */
    public readonly applicationId!: pulumi.Output<string>;
    /**
     * This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
     */
    public readonly databricksSqlAccess!: pulumi.Output<boolean | undefined>;
    /**
     * Deactivate the service principal when deleting the resource, rather than deleting the service principal entirely. Defaults to `true` when the provider is configured at the account-level and `false` when configured at the workspace-level. This flag is exclusive to forceDeleteRepos and forceDeleteHomeDir flags.
     */
    public readonly disableAsUserDeletion!: pulumi.Output<boolean | undefined>;
    /**
     * This is an alias for the service principal and can be the full name of the service principal.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * ID of the service principal in an external identity provider.
     */
    public readonly externalId!: pulumi.Output<string | undefined>;
    public readonly force!: pulumi.Output<boolean | undefined>;
    /**
     * This flag determines whether the service principal's home directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     */
    public readonly forceDeleteHomeDir!: pulumi.Output<boolean | undefined>;
    /**
     * This flag determines whether the service principal's repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     */
    public readonly forceDeleteRepos!: pulumi.Output<boolean | undefined>;
    /**
     * Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
     */
    public readonly home!: pulumi.Output<string>;
    /**
     * Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
     */
    public readonly repos!: pulumi.Output<string>;
    /**
     * This is a field to allow the group to have access to Databricks Workspace.
     */
    public readonly workspaceAccess!: pulumi.Output<boolean | undefined>;

    /**
     * Create a ServicePrincipal resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ServicePrincipalArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServicePrincipalArgs | ServicePrincipalState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServicePrincipalState | undefined;
            resourceInputs["aclPrincipalId"] = state ? state.aclPrincipalId : undefined;
            resourceInputs["active"] = state ? state.active : undefined;
            resourceInputs["allowClusterCreate"] = state ? state.allowClusterCreate : undefined;
            resourceInputs["allowInstancePoolCreate"] = state ? state.allowInstancePoolCreate : undefined;
            resourceInputs["applicationId"] = state ? state.applicationId : undefined;
            resourceInputs["databricksSqlAccess"] = state ? state.databricksSqlAccess : undefined;
            resourceInputs["disableAsUserDeletion"] = state ? state.disableAsUserDeletion : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["externalId"] = state ? state.externalId : undefined;
            resourceInputs["force"] = state ? state.force : undefined;
            resourceInputs["forceDeleteHomeDir"] = state ? state.forceDeleteHomeDir : undefined;
            resourceInputs["forceDeleteRepos"] = state ? state.forceDeleteRepos : undefined;
            resourceInputs["home"] = state ? state.home : undefined;
            resourceInputs["repos"] = state ? state.repos : undefined;
            resourceInputs["workspaceAccess"] = state ? state.workspaceAccess : undefined;
        } else {
            const args = argsOrState as ServicePrincipalArgs | undefined;
            resourceInputs["aclPrincipalId"] = args ? args.aclPrincipalId : undefined;
            resourceInputs["active"] = args ? args.active : undefined;
            resourceInputs["allowClusterCreate"] = args ? args.allowClusterCreate : undefined;
            resourceInputs["allowInstancePoolCreate"] = args ? args.allowInstancePoolCreate : undefined;
            resourceInputs["applicationId"] = args ? args.applicationId : undefined;
            resourceInputs["databricksSqlAccess"] = args ? args.databricksSqlAccess : undefined;
            resourceInputs["disableAsUserDeletion"] = args ? args.disableAsUserDeletion : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["externalId"] = args ? args.externalId : undefined;
            resourceInputs["force"] = args ? args.force : undefined;
            resourceInputs["forceDeleteHomeDir"] = args ? args.forceDeleteHomeDir : undefined;
            resourceInputs["forceDeleteRepos"] = args ? args.forceDeleteRepos : undefined;
            resourceInputs["home"] = args ? args.home : undefined;
            resourceInputs["repos"] = args ? args.repos : undefined;
            resourceInputs["workspaceAccess"] = args ? args.workspaceAccess : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServicePrincipal.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServicePrincipal resources.
 */
export interface ServicePrincipalState {
    /**
     * identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
     */
    aclPrincipalId?: pulumi.Input<string>;
    /**
     * Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
     */
    active?: pulumi.Input<boolean>;
    /**
     * Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
     */
    allowClusterCreate?: pulumi.Input<boolean>;
    /**
     * Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instancePoolId argument.
     */
    allowInstancePoolCreate?: pulumi.Input<boolean>;
    /**
     * This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. For Databricks-managed service principals this value is auto-generated.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
     */
    databricksSqlAccess?: pulumi.Input<boolean>;
    /**
     * Deactivate the service principal when deleting the resource, rather than deleting the service principal entirely. Defaults to `true` when the provider is configured at the account-level and `false` when configured at the workspace-level. This flag is exclusive to forceDeleteRepos and forceDeleteHomeDir flags.
     */
    disableAsUserDeletion?: pulumi.Input<boolean>;
    /**
     * This is an alias for the service principal and can be the full name of the service principal.
     */
    displayName?: pulumi.Input<string>;
    /**
     * ID of the service principal in an external identity provider.
     */
    externalId?: pulumi.Input<string>;
    force?: pulumi.Input<boolean>;
    /**
     * This flag determines whether the service principal's home directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     */
    forceDeleteHomeDir?: pulumi.Input<boolean>;
    /**
     * This flag determines whether the service principal's repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     */
    forceDeleteRepos?: pulumi.Input<boolean>;
    /**
     * Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
     */
    home?: pulumi.Input<string>;
    /**
     * Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
     */
    repos?: pulumi.Input<string>;
    /**
     * This is a field to allow the group to have access to Databricks Workspace.
     */
    workspaceAccess?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ServicePrincipal resource.
 */
export interface ServicePrincipalArgs {
    /**
     * identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
     */
    aclPrincipalId?: pulumi.Input<string>;
    /**
     * Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
     */
    active?: pulumi.Input<boolean>;
    /**
     * Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
     */
    allowClusterCreate?: pulumi.Input<boolean>;
    /**
     * Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instancePoolId argument.
     */
    allowInstancePoolCreate?: pulumi.Input<boolean>;
    /**
     * This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. For Databricks-managed service principals this value is auto-generated.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
     */
    databricksSqlAccess?: pulumi.Input<boolean>;
    /**
     * Deactivate the service principal when deleting the resource, rather than deleting the service principal entirely. Defaults to `true` when the provider is configured at the account-level and `false` when configured at the workspace-level. This flag is exclusive to forceDeleteRepos and forceDeleteHomeDir flags.
     */
    disableAsUserDeletion?: pulumi.Input<boolean>;
    /**
     * This is an alias for the service principal and can be the full name of the service principal.
     */
    displayName?: pulumi.Input<string>;
    /**
     * ID of the service principal in an external identity provider.
     */
    externalId?: pulumi.Input<string>;
    force?: pulumi.Input<boolean>;
    /**
     * This flag determines whether the service principal's home directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     */
    forceDeleteHomeDir?: pulumi.Input<boolean>;
    /**
     * This flag determines whether the service principal's repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     */
    forceDeleteRepos?: pulumi.Input<boolean>;
    /**
     * Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
     */
    home?: pulumi.Input<string>;
    /**
     * Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
     */
    repos?: pulumi.Input<string>;
    /**
     * This is a field to allow the group to have access to Databricks Workspace.
     */
    workspaceAccess?: pulumi.Input<boolean>;
}
