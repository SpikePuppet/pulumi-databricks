// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Referring to a cluster policy by name:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const personal = databricks.getClusterPolicy({
 *     name: "Personal Compute",
 * });
 * const myCluster = new databricks.Cluster("myCluster", {policyId: personal.then(personal => personal.id)});
 * // ...
 * ```
 */
export function getClusterPolicy(args: GetClusterPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetClusterPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getClusterPolicy:getClusterPolicy", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getClusterPolicy.
 */
export interface GetClusterPolicyArgs {
    /**
     * Name of the cluster policy. The cluster policy must exist before this resource can be planned.
     */
    name: string;
}

/**
 * A collection of values returned by getClusterPolicy.
 */
export interface GetClusterPolicyResult {
    /**
     * Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
     */
    readonly definition: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly maxClustersPerUser: number;
    readonly name: string;
}
/**
 * ## Example Usage
 *
 * Referring to a cluster policy by name:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const personal = databricks.getClusterPolicy({
 *     name: "Personal Compute",
 * });
 * const myCluster = new databricks.Cluster("myCluster", {policyId: personal.then(personal => personal.id)});
 * // ...
 * ```
 */
export function getClusterPolicyOutput(args: GetClusterPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetClusterPolicyResult> {
    return pulumi.output(args).apply((a: any) => getClusterPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getClusterPolicy.
 */
export interface GetClusterPolicyOutputArgs {
    /**
     * Name of the cluster policy. The cluster policy must exist before this resource can be planned.
     */
    name: pulumi.Input<string>;
}