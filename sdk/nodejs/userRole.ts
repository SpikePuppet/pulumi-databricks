// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource allows you to attach a role or databricks.InstanceProfile (AWS) to databricks_user.
 *
 * ## Example Usage
 *
 * Adding AWS instance profile to a user
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const instanceProfile = new databricks.InstanceProfile("instanceProfile", {instanceProfileArn: "my_instance_profile_arn"});
 * const myUser = new databricks.User("myUser", {userName: "me@example.com"});
 * const myUserRole = new databricks.UserRole("myUserRole", {
 *     userId: myUser.id,
 *     role: instanceProfile.id,
 * });
 * ```
 *
 * Adding user as administrator to Databricks Account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const myUser = new databricks.User("myUser", {userName: "me@example.com"});
 * const myUserAccountAdmin = new databricks.UserRole("myUserAccountAdmin", {
 *     userId: myUser.id,
 *     role: "account_admin",
 * });
 * ```
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
 * * databricksGroupMember to attach users and groups as group members.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 * * databricks.User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to databricks.Group within the workspace.
 * * databricks.User data to retrieves information about databricks_user.
 *
 * ## Import
 *
 * -> **Note** Importing this resource is not currently supported.
 */
export class UserRole extends pulumi.CustomResource {
    /**
     * Get an existing UserRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserRoleState, opts?: pulumi.CustomResourceOptions): UserRole {
        return new UserRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/userRole:UserRole';

    /**
     * Returns true if the given object is an instance of UserRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserRole.__pulumiType;
    }

    /**
     * Either a role name or the id of the instance profile resource.
     */
    public readonly role!: pulumi.Output<string>;
    /**
     * This is the id of the user resource.
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a UserRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserRoleArgs | UserRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserRoleState | undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as UserRoleArgs | undefined;
            if ((!args || args.role === undefined) && !opts.urn) {
                throw new Error("Missing required property 'role'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UserRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserRole resources.
 */
export interface UserRoleState {
    /**
     * Either a role name or the id of the instance profile resource.
     */
    role?: pulumi.Input<string>;
    /**
     * This is the id of the user resource.
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UserRole resource.
 */
export interface UserRoleArgs {
    /**
     * Either a role name or the id of the instance profile resource.
     */
    role: pulumi.Input<string>;
    /**
     * This is the id of the user resource.
     */
    userId: pulumi.Input<string>;
}
