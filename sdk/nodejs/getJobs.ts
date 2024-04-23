// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Granting view databricks.Permissions to all databricks.Job within the workspace:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * export = async () => {
 *     const this = await databricks.getJobs({});
 *     const everyoneCanViewAllJobs: databricks.Permissions[] = [];
 *     for (const range of Object.entries(_this.ids).map(([k, v]) => ({key: k, value: v}))) {
 *         everyoneCanViewAllJobs.push(new databricks.Permissions(`everyone_can_view_all_jobs-${range.key}`, {
 *             jobId: range.value,
 *             accessControls: [{
 *                 groupName: "users",
 *                 permissionLevel: "CAN_VIEW",
 *             }],
 *         }));
 *     }
 * }
 * ```
 *
 * Getting ID of specific databricks.Job by name:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getJobs({});
 * export const x = _this.then(_this => `ID of `x` job is ${_this.ids?.x}`);
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 */
export function getJobs(args?: GetJobsArgs, opts?: pulumi.InvokeOptions): Promise<GetJobsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getJobs:getJobs", {
        "ids": args.ids,
    }, opts);
}

/**
 * A collection of arguments for invoking getJobs.
 */
export interface GetJobsArgs {
    /**
     * map of databricks.Job names to ids
     */
    ids?: {[key: string]: any};
}

/**
 * A collection of values returned by getJobs.
 */
export interface GetJobsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * map of databricks.Job names to ids
     */
    readonly ids: {[key: string]: any};
}
/**
 * ## Example Usage
 *
 * Granting view databricks.Permissions to all databricks.Job within the workspace:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * export = async () => {
 *     const this = await databricks.getJobs({});
 *     const everyoneCanViewAllJobs: databricks.Permissions[] = [];
 *     for (const range of Object.entries(_this.ids).map(([k, v]) => ({key: k, value: v}))) {
 *         everyoneCanViewAllJobs.push(new databricks.Permissions(`everyone_can_view_all_jobs-${range.key}`, {
 *             jobId: range.value,
 *             accessControls: [{
 *                 groupName: "users",
 *                 permissionLevel: "CAN_VIEW",
 *             }],
 *         }));
 *     }
 * }
 * ```
 *
 * Getting ID of specific databricks.Job by name:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getJobs({});
 * export const x = _this.then(_this => `ID of `x` job is ${_this.ids?.x}`);
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 */
export function getJobsOutput(args?: GetJobsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetJobsResult> {
    return pulumi.output(args).apply((a: any) => getJobs(a, opts))
}

/**
 * A collection of arguments for invoking getJobs.
 */
export interface GetJobsOutputArgs {
    /**
     * map of databricks.Job names to ids
     */
    ids?: pulumi.Input<{[key: string]: any}>;
}
