// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Retrieve cluster IDs for all clusters:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const all = databricks.getClusters({});
 * ```
 *
 * Retrieve cluster IDs for all clusters having "Shared" in the cluster name:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const allShared = databricks.getClusters({
 *     clusterNameContains: "shared",
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
 * * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
 * * databricks.InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 * * databricks.Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
 * * databricks.Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
 */
export function getClusters(args?: GetClustersArgs, opts?: pulumi.InvokeOptions): Promise<GetClustersResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getClusters:getClusters", {
        "clusterNameContains": args.clusterNameContains,
    }, opts);
}

/**
 * A collection of arguments for invoking getClusters.
 */
export interface GetClustersArgs {
    /**
     * Only return databricks.Cluster ids that match the given name string.
     */
    clusterNameContains?: string;
}

/**
 * A collection of values returned by getClusters.
 */
export interface GetClustersResult {
    readonly clusterNameContains?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * list of databricks.Cluster ids
     */
    readonly ids: string[];
}
/**
 * ## Example Usage
 *
 * Retrieve cluster IDs for all clusters:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const all = databricks.getClusters({});
 * ```
 *
 * Retrieve cluster IDs for all clusters having "Shared" in the cluster name:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const allShared = databricks.getClusters({
 *     clusterNameContains: "shared",
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
 * * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
 * * databricks.InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 * * databricks.Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
 * * databricks.Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
 */
export function getClustersOutput(args?: GetClustersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetClustersResult> {
    return pulumi.output(args).apply((a: any) => getClusters(a, opts))
}

/**
 * A collection of arguments for invoking getClusters.
 */
export interface GetClustersOutputArgs {
    /**
     * Only return databricks.Cluster ids that match the given name string.
     */
    clusterNameContains?: pulumi.Input<string>;
}
