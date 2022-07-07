// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * The resource permissions can be imported using the object id bash
 *
 * ```sh
 *  $ pulumi import databricks:index/permissions:Permissions this /<object type>/<object id>
 * ```
 */
export class Permissions extends pulumi.CustomResource {
    /**
     * Get an existing Permissions resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PermissionsState, opts?: pulumi.CustomResourceOptions): Permissions {
        return new Permissions(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/permissions:Permissions';

    /**
     * Returns true if the given object is an instance of Permissions.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Permissions {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Permissions.__pulumiType;
    }

    public readonly accessControls!: pulumi.Output<outputs.PermissionsAccessControl[]>;
    /**
     * either [`tokens`](https://docs.databricks.com/administration-guide/access-control/tokens.html) or [`passwords`](https://docs.databricks.com/administration-guide/users-groups/single-sign-on/index.html#configure-password-permission).
     */
    public readonly authorization!: pulumi.Output<string | undefined>;
    /**
     * cluster id
     */
    public readonly clusterId!: pulumi.Output<string | undefined>;
    /**
     * cluster policy id
     */
    public readonly clusterPolicyId!: pulumi.Output<string | undefined>;
    /**
     * directory id
     */
    public readonly directoryId!: pulumi.Output<string | undefined>;
    /**
     * path of directory
     */
    public readonly directoryPath!: pulumi.Output<string | undefined>;
    public readonly experimentId!: pulumi.Output<string | undefined>;
    /**
     * instance pool id
     */
    public readonly instancePoolId!: pulumi.Output<string | undefined>;
    /**
     * job id
     */
    public readonly jobId!: pulumi.Output<string | undefined>;
    /**
     * ID of notebook within workspace
     */
    public readonly notebookId!: pulumi.Output<string | undefined>;
    /**
     * path of notebook
     */
    public readonly notebookPath!: pulumi.Output<string | undefined>;
    /**
     * type of permissions.
     */
    public readonly objectType!: pulumi.Output<string>;
    public readonly pipelineId!: pulumi.Output<string | undefined>;
    public readonly registeredModelId!: pulumi.Output<string | undefined>;
    /**
     * repo id
     */
    public readonly repoId!: pulumi.Output<string | undefined>;
    /**
     * path of databricks repo directory(`/Repos/<username>/...`)
     */
    public readonly repoPath!: pulumi.Output<string | undefined>;
    public readonly sqlAlertId!: pulumi.Output<string | undefined>;
    public readonly sqlDashboardId!: pulumi.Output<string | undefined>;
    public readonly sqlEndpointId!: pulumi.Output<string | undefined>;
    public readonly sqlQueryId!: pulumi.Output<string | undefined>;

    /**
     * Create a Permissions resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PermissionsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PermissionsArgs | PermissionsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PermissionsState | undefined;
            resourceInputs["accessControls"] = state ? state.accessControls : undefined;
            resourceInputs["authorization"] = state ? state.authorization : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["clusterPolicyId"] = state ? state.clusterPolicyId : undefined;
            resourceInputs["directoryId"] = state ? state.directoryId : undefined;
            resourceInputs["directoryPath"] = state ? state.directoryPath : undefined;
            resourceInputs["experimentId"] = state ? state.experimentId : undefined;
            resourceInputs["instancePoolId"] = state ? state.instancePoolId : undefined;
            resourceInputs["jobId"] = state ? state.jobId : undefined;
            resourceInputs["notebookId"] = state ? state.notebookId : undefined;
            resourceInputs["notebookPath"] = state ? state.notebookPath : undefined;
            resourceInputs["objectType"] = state ? state.objectType : undefined;
            resourceInputs["pipelineId"] = state ? state.pipelineId : undefined;
            resourceInputs["registeredModelId"] = state ? state.registeredModelId : undefined;
            resourceInputs["repoId"] = state ? state.repoId : undefined;
            resourceInputs["repoPath"] = state ? state.repoPath : undefined;
            resourceInputs["sqlAlertId"] = state ? state.sqlAlertId : undefined;
            resourceInputs["sqlDashboardId"] = state ? state.sqlDashboardId : undefined;
            resourceInputs["sqlEndpointId"] = state ? state.sqlEndpointId : undefined;
            resourceInputs["sqlQueryId"] = state ? state.sqlQueryId : undefined;
        } else {
            const args = argsOrState as PermissionsArgs | undefined;
            if ((!args || args.accessControls === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessControls'");
            }
            resourceInputs["accessControls"] = args ? args.accessControls : undefined;
            resourceInputs["authorization"] = args ? args.authorization : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["clusterPolicyId"] = args ? args.clusterPolicyId : undefined;
            resourceInputs["directoryId"] = args ? args.directoryId : undefined;
            resourceInputs["directoryPath"] = args ? args.directoryPath : undefined;
            resourceInputs["experimentId"] = args ? args.experimentId : undefined;
            resourceInputs["instancePoolId"] = args ? args.instancePoolId : undefined;
            resourceInputs["jobId"] = args ? args.jobId : undefined;
            resourceInputs["notebookId"] = args ? args.notebookId : undefined;
            resourceInputs["notebookPath"] = args ? args.notebookPath : undefined;
            resourceInputs["objectType"] = args ? args.objectType : undefined;
            resourceInputs["pipelineId"] = args ? args.pipelineId : undefined;
            resourceInputs["registeredModelId"] = args ? args.registeredModelId : undefined;
            resourceInputs["repoId"] = args ? args.repoId : undefined;
            resourceInputs["repoPath"] = args ? args.repoPath : undefined;
            resourceInputs["sqlAlertId"] = args ? args.sqlAlertId : undefined;
            resourceInputs["sqlDashboardId"] = args ? args.sqlDashboardId : undefined;
            resourceInputs["sqlEndpointId"] = args ? args.sqlEndpointId : undefined;
            resourceInputs["sqlQueryId"] = args ? args.sqlQueryId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Permissions.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Permissions resources.
 */
export interface PermissionsState {
    accessControls?: pulumi.Input<pulumi.Input<inputs.PermissionsAccessControl>[]>;
    /**
     * either [`tokens`](https://docs.databricks.com/administration-guide/access-control/tokens.html) or [`passwords`](https://docs.databricks.com/administration-guide/users-groups/single-sign-on/index.html#configure-password-permission).
     */
    authorization?: pulumi.Input<string>;
    /**
     * cluster id
     */
    clusterId?: pulumi.Input<string>;
    /**
     * cluster policy id
     */
    clusterPolicyId?: pulumi.Input<string>;
    /**
     * directory id
     */
    directoryId?: pulumi.Input<string>;
    /**
     * path of directory
     */
    directoryPath?: pulumi.Input<string>;
    experimentId?: pulumi.Input<string>;
    /**
     * instance pool id
     */
    instancePoolId?: pulumi.Input<string>;
    /**
     * job id
     */
    jobId?: pulumi.Input<string>;
    /**
     * ID of notebook within workspace
     */
    notebookId?: pulumi.Input<string>;
    /**
     * path of notebook
     */
    notebookPath?: pulumi.Input<string>;
    /**
     * type of permissions.
     */
    objectType?: pulumi.Input<string>;
    pipelineId?: pulumi.Input<string>;
    registeredModelId?: pulumi.Input<string>;
    /**
     * repo id
     */
    repoId?: pulumi.Input<string>;
    /**
     * path of databricks repo directory(`/Repos/<username>/...`)
     */
    repoPath?: pulumi.Input<string>;
    sqlAlertId?: pulumi.Input<string>;
    sqlDashboardId?: pulumi.Input<string>;
    sqlEndpointId?: pulumi.Input<string>;
    sqlQueryId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Permissions resource.
 */
export interface PermissionsArgs {
    accessControls: pulumi.Input<pulumi.Input<inputs.PermissionsAccessControl>[]>;
    /**
     * either [`tokens`](https://docs.databricks.com/administration-guide/access-control/tokens.html) or [`passwords`](https://docs.databricks.com/administration-guide/users-groups/single-sign-on/index.html#configure-password-permission).
     */
    authorization?: pulumi.Input<string>;
    /**
     * cluster id
     */
    clusterId?: pulumi.Input<string>;
    /**
     * cluster policy id
     */
    clusterPolicyId?: pulumi.Input<string>;
    /**
     * directory id
     */
    directoryId?: pulumi.Input<string>;
    /**
     * path of directory
     */
    directoryPath?: pulumi.Input<string>;
    experimentId?: pulumi.Input<string>;
    /**
     * instance pool id
     */
    instancePoolId?: pulumi.Input<string>;
    /**
     * job id
     */
    jobId?: pulumi.Input<string>;
    /**
     * ID of notebook within workspace
     */
    notebookId?: pulumi.Input<string>;
    /**
     * path of notebook
     */
    notebookPath?: pulumi.Input<string>;
    /**
     * type of permissions.
     */
    objectType?: pulumi.Input<string>;
    pipelineId?: pulumi.Input<string>;
    registeredModelId?: pulumi.Input<string>;
    /**
     * repo id
     */
    repoId?: pulumi.Input<string>;
    /**
     * path of databricks repo directory(`/Repos/<username>/...`)
     */
    repoPath?: pulumi.Input<string>;
    sqlAlertId?: pulumi.Input<string>;
    sqlDashboardId?: pulumi.Input<string>;
    sqlEndpointId?: pulumi.Input<string>;
    sqlQueryId?: pulumi.Input<string>;
}
