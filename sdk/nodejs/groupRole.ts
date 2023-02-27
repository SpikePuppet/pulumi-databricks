// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource allows you to attach a role to databricks_group. This role could be a pre-defined role such as account admin, or an instance profile ARN.
 *
 * ## Example Usage
 *
 * Attach an instance profile to a group
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const instanceProfile = new databricks.InstanceProfile("instanceProfile", {instanceProfileArn: "my_instance_profile_arn"});
 * const myGroup = new databricks.Group("myGroup", {});
 * const myGroupInstanceProfile = new databricks.GroupInstanceProfile("myGroupInstanceProfile", {
 *     groupId: myGroup.id,
 *     instanceProfileId: instanceProfile.id,
 * });
 * ```
 *
 * Attach account admin role to an account-level group
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const myGroup = new databricks.Group("myGroup", {});
 * const myGroupAccountAdmin = new databricks.GroupRole("myGroupAccountAdmin", {
 *     groupId: myGroup.id,
 *     role: "account_admin",
 * });
 * ```
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
 * * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
 * * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * * databricks.GroupMember to attach users and groups as group members.
 * * databricks.InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 * * databricks.UserInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_user.
 *
 * ## Import
 *
 * -> **Note** Importing this resource is not currently supported.
 */
export class GroupRole extends pulumi.CustomResource {
    /**
     * Get an existing GroupRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupRoleState, opts?: pulumi.CustomResourceOptions): GroupRole {
        return new GroupRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/groupRole:GroupRole';

    /**
     * Returns true if the given object is an instance of GroupRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GroupRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GroupRole.__pulumiType;
    }

    /**
     * This is the id of the group resource.
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * Either a role name or the ARN/ID of the instance profile resource.
     */
    public readonly role!: pulumi.Output<string>;

    /**
     * Create a GroupRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GroupRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GroupRoleArgs | GroupRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GroupRoleState | undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
        } else {
            const args = argsOrState as GroupRoleArgs | undefined;
            if ((!args || args.groupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupId'");
            }
            if ((!args || args.role === undefined) && !opts.urn) {
                throw new Error("Missing required property 'role'");
            }
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GroupRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GroupRole resources.
 */
export interface GroupRoleState {
    /**
     * This is the id of the group resource.
     */
    groupId?: pulumi.Input<string>;
    /**
     * Either a role name or the ARN/ID of the instance profile resource.
     */
    role?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GroupRole resource.
 */
export interface GroupRoleArgs {
    /**
     * This is the id of the group resource.
     */
    groupId: pulumi.Input<string>;
    /**
     * Either a role name or the ARN/ID of the instance profile resource.
     */
    role: pulumi.Input<string>;
}
