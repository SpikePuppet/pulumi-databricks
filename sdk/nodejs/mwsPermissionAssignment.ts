// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * These resources are invoked in the account context. Permission Assignment Account API endpoints are restricted to account admins. Provider must have `accountId` attribute configured. Account Id that could be found in the top right corner of Accounts Console
 *
 * ## Example Usage
 *
 * In account context, adding account-level group to a workspace:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const dataEng = new databricks.Group("dataEng", {});
 * const addAdminGroup = new databricks.MwsPermissionAssignment("addAdminGroup", {
 *     workspaceId: databricks_mws_workspaces["this"].workspace_id,
 *     principalId: dataEng.id,
 *     permissions: ["ADMIN"],
 * });
 * ```
 *
 * In account context, adding account-level user to a workspace:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const me = new databricks.User("me", {userName: "me@example.com"});
 * const addUser = new databricks.MwsPermissionAssignment("addUser", {
 *     workspaceId: databricks_mws_workspaces["this"].workspace_id,
 *     principalId: me.id,
 *     permissions: ["USER"],
 * });
 * ```
 *
 * In account context, adding account-level service principal to a workspace:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const sp = new databricks.ServicePrincipal("sp", {displayName: "Automation-only SP"});
 * const addAdminSpn = new databricks.MwsPermissionAssignment("addAdminSpn", {
 *     workspaceId: databricks_mws_workspaces["this"].workspace_id,
 *     principalId: sp.id,
 *     permissions: ["ADMIN"],
 * });
 * ```
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * * databricks.GroupMember to attach users and groups as group members.
 * * databricks.PermissionAssignment to manage permission assignment from a workspace context
 *
 * ## Import
 *
 * The resource `databricks_mws_permission_assignment` can be imported using the workspace id and principal id bash
 *
 * ```sh
 *  $ pulumi import databricks:index/mwsPermissionAssignment:MwsPermissionAssignment this "workspace_id|principal_id"
 * ```
 */
export class MwsPermissionAssignment extends pulumi.CustomResource {
    /**
     * Get an existing MwsPermissionAssignment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MwsPermissionAssignmentState, opts?: pulumi.CustomResourceOptions): MwsPermissionAssignment {
        return new MwsPermissionAssignment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/mwsPermissionAssignment:MwsPermissionAssignment';

    /**
     * Returns true if the given object is an instance of MwsPermissionAssignment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MwsPermissionAssignment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MwsPermissionAssignment.__pulumiType;
    }

    /**
     * The list of workspace permissions to assign to the principal:
     * * `"USER"` - Can access the workspace with basic privileges.
     * * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
     */
    public readonly permissions!: pulumi.Output<string[]>;
    /**
     * Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, databricks.ServicePrincipal or databricks.Group data sources.
     */
    public readonly principalId!: pulumi.Output<number>;
    /**
     * Databricks workspace ID.
     */
    public readonly workspaceId!: pulumi.Output<number>;

    /**
     * Create a MwsPermissionAssignment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MwsPermissionAssignmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MwsPermissionAssignmentArgs | MwsPermissionAssignmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MwsPermissionAssignmentState | undefined;
            resourceInputs["permissions"] = state ? state.permissions : undefined;
            resourceInputs["principalId"] = state ? state.principalId : undefined;
            resourceInputs["workspaceId"] = state ? state.workspaceId : undefined;
        } else {
            const args = argsOrState as MwsPermissionAssignmentArgs | undefined;
            if ((!args || args.permissions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'permissions'");
            }
            if ((!args || args.principalId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'principalId'");
            }
            if ((!args || args.workspaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workspaceId'");
            }
            resourceInputs["permissions"] = args ? args.permissions : undefined;
            resourceInputs["principalId"] = args ? args.principalId : undefined;
            resourceInputs["workspaceId"] = args ? args.workspaceId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MwsPermissionAssignment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MwsPermissionAssignment resources.
 */
export interface MwsPermissionAssignmentState {
    /**
     * The list of workspace permissions to assign to the principal:
     * * `"USER"` - Can access the workspace with basic privileges.
     * * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
     */
    permissions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, databricks.ServicePrincipal or databricks.Group data sources.
     */
    principalId?: pulumi.Input<number>;
    /**
     * Databricks workspace ID.
     */
    workspaceId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a MwsPermissionAssignment resource.
 */
export interface MwsPermissionAssignmentArgs {
    /**
     * The list of workspace permissions to assign to the principal:
     * * `"USER"` - Can access the workspace with basic privileges.
     * * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
     */
    permissions: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, databricks.ServicePrincipal or databricks.Group data sources.
     */
    principalId: pulumi.Input<number>;
    /**
     * Databricks workspace ID.
     */
    workspaceId: pulumi.Input<number>;
}
