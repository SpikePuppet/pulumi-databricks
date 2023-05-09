// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const withGpu = databricks.getNodeType({
 *     localDisk: true,
 *     minCores: 16,
 *     gbPerCore: 1,
 *     minGpus: 1,
 * });
 * const gpuMl = databricks.getSparkVersion({
 *     gpu: true,
 *     ml: true,
 * });
 * const research = new databricks.Cluster("research", {
 *     clusterName: "Research Cluster",
 *     sparkVersion: gpuMl.then(gpuMl => gpuMl.id),
 *     nodeTypeId: withGpu.then(withGpu => withGpu.id),
 *     autoterminationMinutes: 20,
 *     autoscale: {
 *         minWorkers: 1,
 *         maxWorkers: 50,
 *     },
 * });
 * ```
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
 * * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
 * * databricks.InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 */
export function getNodeType(args?: GetNodeTypeArgs, opts?: pulumi.InvokeOptions): Promise<GetNodeTypeResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getNodeType:getNodeType", {
        "category": args.category,
        "fleet": args.fleet,
        "gbPerCore": args.gbPerCore,
        "graviton": args.graviton,
        "id": args.id,
        "isIoCacheEnabled": args.isIoCacheEnabled,
        "localDisk": args.localDisk,
        "localDiskMinSize": args.localDiskMinSize,
        "minCores": args.minCores,
        "minGpus": args.minGpus,
        "minMemoryGb": args.minMemoryGb,
        "photonDriverCapable": args.photonDriverCapable,
        "photonWorkerCapable": args.photonWorkerCapable,
        "supportPortForwarding": args.supportPortForwarding,
    }, opts);
}

/**
 * A collection of arguments for invoking getNodeType.
 */
export interface GetNodeTypeArgs {
    /**
     * Node category, which can be one of (depending on the cloud environment, could be checked with `databricks clusters list-node-types|jq '.node_types[]|.category'|sort |uniq`):
     * * `General Purpose` (all clouds)
     * * `General Purpose (HDD)` (Azure)
     * * `Compute Optimized` (all clouds)
     * * `Memory Optimized` (all clouds)
     * * `Memory Optimized (Remote HDD)` (Azure)
     * * `Storage Optimized` (AWS, Azure)
     * * `GPU Accelerated` (AWS, Azure)
     */
    category?: string;
    /**
     * if we should limit the search only to [AWS fleet instance types](https://docs.databricks.com/compute/aws-fleet-instances.html). Default to *false*.
     */
    fleet?: boolean;
    /**
     * Number of gigabytes per core available on instance. Conflicts with `minMemoryGb`. Defaults to *0*.
     */
    gbPerCore?: number;
    /**
     * if we should limit the search only to nodes with AWS Graviton CPUs. Default to *false*.
     */
    graviton?: boolean;
    /**
     * node type, that can be used for databricks_job, databricks_cluster, or databricks_instance_pool.
     */
    id?: string;
    /**
     * . Pick only nodes that have IO Cache. Defaults to *false*.
     */
    isIoCacheEnabled?: boolean;
    /**
     * Pick only nodes with local storage. Defaults to *false*.
     */
    localDisk?: boolean;
    /**
     * Pick only nodes that have size local storage greater or equal to given value. Defaults to *0*.
     */
    localDiskMinSize?: number;
    /**
     * Minimum number of CPU cores available on instance. Defaults to *0*.
     */
    minCores?: number;
    /**
     * Minimum number of GPU's attached to instance. Defaults to *0*.
     */
    minGpus?: number;
    /**
     * Minimum amount of memory per node in gigabytes. Defaults to *0*.
     */
    minMemoryGb?: number;
    /**
     * Pick only nodes that can run Photon driver. Defaults to *false*.
     */
    photonDriverCapable?: boolean;
    /**
     * Pick only nodes that can run Photon workers. Defaults to *false*.
     */
    photonWorkerCapable?: boolean;
    /**
     * Pick only nodes that support port forwarding. Defaults to *false*.
     */
    supportPortForwarding?: boolean;
}

/**
 * A collection of values returned by getNodeType.
 */
export interface GetNodeTypeResult {
    readonly category?: string;
    readonly fleet?: boolean;
    readonly gbPerCore?: number;
    readonly graviton?: boolean;
    /**
     * node type, that can be used for databricks_job, databricks_cluster, or databricks_instance_pool.
     */
    readonly id: string;
    readonly isIoCacheEnabled?: boolean;
    readonly localDisk?: boolean;
    readonly localDiskMinSize?: number;
    readonly minCores?: number;
    readonly minGpus?: number;
    readonly minMemoryGb?: number;
    readonly photonDriverCapable?: boolean;
    readonly photonWorkerCapable?: boolean;
    readonly supportPortForwarding?: boolean;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const withGpu = databricks.getNodeType({
 *     localDisk: true,
 *     minCores: 16,
 *     gbPerCore: 1,
 *     minGpus: 1,
 * });
 * const gpuMl = databricks.getSparkVersion({
 *     gpu: true,
 *     ml: true,
 * });
 * const research = new databricks.Cluster("research", {
 *     clusterName: "Research Cluster",
 *     sparkVersion: gpuMl.then(gpuMl => gpuMl.id),
 *     nodeTypeId: withGpu.then(withGpu => withGpu.id),
 *     autoterminationMinutes: 20,
 *     autoscale: {
 *         minWorkers: 1,
 *         maxWorkers: 50,
 *     },
 * });
 * ```
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
 * * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
 * * databricks.InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 */
export function getNodeTypeOutput(args?: GetNodeTypeOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNodeTypeResult> {
    return pulumi.output(args).apply((a: any) => getNodeType(a, opts))
}

/**
 * A collection of arguments for invoking getNodeType.
 */
export interface GetNodeTypeOutputArgs {
    /**
     * Node category, which can be one of (depending on the cloud environment, could be checked with `databricks clusters list-node-types|jq '.node_types[]|.category'|sort |uniq`):
     * * `General Purpose` (all clouds)
     * * `General Purpose (HDD)` (Azure)
     * * `Compute Optimized` (all clouds)
     * * `Memory Optimized` (all clouds)
     * * `Memory Optimized (Remote HDD)` (Azure)
     * * `Storage Optimized` (AWS, Azure)
     * * `GPU Accelerated` (AWS, Azure)
     */
    category?: pulumi.Input<string>;
    /**
     * if we should limit the search only to [AWS fleet instance types](https://docs.databricks.com/compute/aws-fleet-instances.html). Default to *false*.
     */
    fleet?: pulumi.Input<boolean>;
    /**
     * Number of gigabytes per core available on instance. Conflicts with `minMemoryGb`. Defaults to *0*.
     */
    gbPerCore?: pulumi.Input<number>;
    /**
     * if we should limit the search only to nodes with AWS Graviton CPUs. Default to *false*.
     */
    graviton?: pulumi.Input<boolean>;
    /**
     * node type, that can be used for databricks_job, databricks_cluster, or databricks_instance_pool.
     */
    id?: pulumi.Input<string>;
    /**
     * . Pick only nodes that have IO Cache. Defaults to *false*.
     */
    isIoCacheEnabled?: pulumi.Input<boolean>;
    /**
     * Pick only nodes with local storage. Defaults to *false*.
     */
    localDisk?: pulumi.Input<boolean>;
    /**
     * Pick only nodes that have size local storage greater or equal to given value. Defaults to *0*.
     */
    localDiskMinSize?: pulumi.Input<number>;
    /**
     * Minimum number of CPU cores available on instance. Defaults to *0*.
     */
    minCores?: pulumi.Input<number>;
    /**
     * Minimum number of GPU's attached to instance. Defaults to *0*.
     */
    minGpus?: pulumi.Input<number>;
    /**
     * Minimum amount of memory per node in gigabytes. Defaults to *0*.
     */
    minMemoryGb?: pulumi.Input<number>;
    /**
     * Pick only nodes that can run Photon driver. Defaults to *false*.
     */
    photonDriverCapable?: pulumi.Input<boolean>;
    /**
     * Pick only nodes that can run Photon workers. Defaults to *false*.
     */
    photonWorkerCapable?: pulumi.Input<boolean>;
    /**
     * Pick only nodes that support port forwarding. Defaults to *false*.
     */
    supportPortForwarding?: pulumi.Input<boolean>;
}
