// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * End to end workspace management guide
 * * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
 * * databricks.Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
 * * databricksGroupMember to attach users and groups as group members.
 * * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
 * * databricks.User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to databricks.Group within the workspace.
 */
export function getGroup(args: GetGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetGroupResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("databricks:index/getGroup:getGroup", {
        "allowClusterCreate": args.allowClusterCreate,
        "allowInstancePoolCreate": args.allowInstancePoolCreate,
        "childGroups": args.childGroups,
        "databricksSqlAccess": args.databricksSqlAccess,
        "displayName": args.displayName,
        "externalId": args.externalId,
        "groups": args.groups,
        "instanceProfiles": args.instanceProfiles,
        "members": args.members,
        "recursive": args.recursive,
        "servicePrincipals": args.servicePrincipals,
        "users": args.users,
        "workspaceAccess": args.workspaceAccess,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroup.
 */
export interface GetGroupArgs {
    /**
     * True if group members can create clusters
     */
    allowClusterCreate?: boolean;
    /**
     * True if group members can create instance pools
     */
    allowInstancePoolCreate?: boolean;
    /**
     * Set of databricks.Group identifiers, that can be modified with databricksGroupMember resource.
     */
    childGroups?: string[];
    databricksSqlAccess?: boolean;
    /**
     * Display name of the group. The group must exist before this resource can be planned.
     */
    displayName: string;
    /**
     * ID of the group in an external identity provider.
     */
    externalId?: string;
    /**
     * Set of group identifiers, that can be modified with databricksGroupMember resource.
     */
    groups?: string[];
    /**
     * Set of instance profile ARNs, that can be modified by databricks.GroupInstanceProfile resource.
     */
    instanceProfiles?: string[];
    /**
     * @deprecated Please use `users`, `service_principals`, and `child_groups` instead
     */
    members?: string[];
    /**
     * Collect information for all nested groups. *Defaults to true.*
     */
    recursive?: boolean;
    /**
     * Set of databricks.ServicePrincipal identifiers, that can be modified with databricksGroupMember resource.
     */
    servicePrincipals?: string[];
    /**
     * Set of databricks.User identifiers, that can be modified with databricksGroupMember resource.
     */
    users?: string[];
    workspaceAccess?: boolean;
}

/**
 * A collection of values returned by getGroup.
 */
export interface GetGroupResult {
    /**
     * True if group members can create clusters
     */
    readonly allowClusterCreate?: boolean;
    /**
     * True if group members can create instance pools
     */
    readonly allowInstancePoolCreate?: boolean;
    /**
     * Set of databricks.Group identifiers, that can be modified with databricksGroupMember resource.
     */
    readonly childGroups: string[];
    readonly databricksSqlAccess?: boolean;
    readonly displayName: string;
    /**
     * ID of the group in an external identity provider.
     */
    readonly externalId: string;
    /**
     * Set of group identifiers, that can be modified with databricksGroupMember resource.
     */
    readonly groups: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Set of instance profile ARNs, that can be modified by databricks.GroupInstanceProfile resource.
     */
    readonly instanceProfiles: string[];
    /**
     * @deprecated Please use `users`, `service_principals`, and `child_groups` instead
     */
    readonly members: string[];
    readonly recursive?: boolean;
    /**
     * Set of databricks.ServicePrincipal identifiers, that can be modified with databricksGroupMember resource.
     */
    readonly servicePrincipals: string[];
    /**
     * Set of databricks.User identifiers, that can be modified with databricksGroupMember resource.
     */
    readonly users: string[];
    readonly workspaceAccess?: boolean;
}

export function getGroupOutput(args: GetGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGroupResult> {
    return pulumi.output(args).apply(a => getGroup(a, opts))
}

/**
 * A collection of arguments for invoking getGroup.
 */
export interface GetGroupOutputArgs {
    /**
     * True if group members can create clusters
     */
    allowClusterCreate?: pulumi.Input<boolean>;
    /**
     * True if group members can create instance pools
     */
    allowInstancePoolCreate?: pulumi.Input<boolean>;
    /**
     * Set of databricks.Group identifiers, that can be modified with databricksGroupMember resource.
     */
    childGroups?: pulumi.Input<pulumi.Input<string>[]>;
    databricksSqlAccess?: pulumi.Input<boolean>;
    /**
     * Display name of the group. The group must exist before this resource can be planned.
     */
    displayName: pulumi.Input<string>;
    /**
     * ID of the group in an external identity provider.
     */
    externalId?: pulumi.Input<string>;
    /**
     * Set of group identifiers, that can be modified with databricksGroupMember resource.
     */
    groups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Set of instance profile ARNs, that can be modified by databricks.GroupInstanceProfile resource.
     */
    instanceProfiles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * @deprecated Please use `users`, `service_principals`, and `child_groups` instead
     */
    members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Collect information for all nested groups. *Defaults to true.*
     */
    recursive?: pulumi.Input<boolean>;
    /**
     * Set of databricks.ServicePrincipal identifiers, that can be modified with databricksGroupMember resource.
     */
    servicePrincipals?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Set of databricks.User identifiers, that can be modified with databricksGroupMember resource.
     */
    users?: pulumi.Input<pulumi.Input<string>[]>;
    workspaceAccess?: pulumi.Input<boolean>;
}
