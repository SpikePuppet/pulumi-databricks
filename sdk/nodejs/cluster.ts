// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * The resource cluster can be imported using cluster id. bash
 *
 * ```sh
 *  $ pulumi import databricks:index/cluster:Cluster this <cluster-id>
 * ```
 */
export class Cluster extends pulumi.CustomResource {
    /**
     * Get an existing Cluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterState, opts?: pulumi.CustomResourceOptions): Cluster {
        return new Cluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/cluster:Cluster';

    /**
     * Returns true if the given object is an instance of Cluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Cluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Cluster.__pulumiType;
    }

    /**
     * Whether to use policy default values for missing cluster attributes.
     */
    public readonly applyPolicyDefaultValues!: pulumi.Output<boolean | undefined>;
    public readonly autoscale!: pulumi.Output<outputs.ClusterAutoscale | undefined>;
    /**
     * Automatically terminate the cluster after being inactive for this time in minutes. If specified, the threshold must be between 10 and 10000 minutes. You can also set this value to 0 to explicitly disable automatic termination. Defaults to `60`.  *We highly recommend having this setting present for Interactive/BI clusters.*
     */
    public readonly autoterminationMinutes!: pulumi.Output<number | undefined>;
    public readonly awsAttributes!: pulumi.Output<outputs.ClusterAwsAttributes | undefined>;
    public readonly azureAttributes!: pulumi.Output<outputs.ClusterAzureAttributes | undefined>;
    public readonly clusterId!: pulumi.Output<string>;
    public readonly clusterLogConf!: pulumi.Output<outputs.ClusterClusterLogConf | undefined>;
    /**
     * Cluster name, which doesn’t have to be unique. If not specified at creation, the cluster name will be an empty string.
     */
    public readonly clusterName!: pulumi.Output<string | undefined>;
    /**
     * Additional tags for cluster resources. Databricks will tag all cluster resources (e.g., AWS EC2 instances and EBS volumes) with these tags in addition to `defaultTags`.
     */
    public readonly customTags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Select the security features of the cluster. Unity Catalog requires `SINGLE_USER` or `USER_ISOLATION` mode. `LEGACY_PASSTHROUGH` for passthrough cluster and `LEGACY_TABLE_ACL` for Table ACL cluster. Default to `NONE`, i.e. no security feature enabled.
     */
    public readonly dataSecurityMode!: pulumi.Output<string | undefined>;
    /**
     * (map) Tags that are added by Databricks by default, regardless of any customTags that may have been added. These include: Vendor: Databricks, Creator: <username_of_creator>, ClusterName: <name_of_cluster>, ClusterId: <id_of_cluster>, Name: <Databricks internal use>
     */
    public /*out*/ readonly defaultTags!: pulumi.Output<{[key: string]: any}>;
    public readonly dockerImage!: pulumi.Output<outputs.ClusterDockerImage | undefined>;
    /**
     * similar to `instancePoolId`, but for driver node. If omitted, and `instancePoolId` is specified, then the driver will be allocated from that pool.
     */
    public readonly driverInstancePoolId!: pulumi.Output<string>;
    /**
     * The node type of the Spark driver. This field is optional; if unset, API will set the driver node type to the same value as `nodeTypeId` defined above.
     */
    public readonly driverNodeTypeId!: pulumi.Output<string>;
    /**
     * If you don’t want to allocate a fixed number of EBS volumes at cluster creation time, use autoscaling local storage. With autoscaling local storage, Databricks monitors the amount of free disk space available on your cluster’s Spark workers. If a worker begins to run too low on disk, Databricks automatically attaches a new EBS volume to the worker before it runs out of disk space. EBS volumes are attached up to a limit of 5 TB of total disk space per instance (including the instance’s local storage). To scale down EBS usage, make sure you have `autoterminationMinutes` and `autoscale` attributes set. More documentation available at [cluster configuration page](https://docs.databricks.com/clusters/configure.html#autoscaling-local-storage-1).
     */
    public readonly enableElasticDisk!: pulumi.Output<boolean>;
    /**
     * Some instance types you use to run clusters may have locally attached disks. Databricks may store shuffle data or temporary data on these locally attached disks. To ensure that all data at rest is encrypted for all storage types, including shuffle data stored temporarily on your cluster’s local disks, you can enable local disk encryption. When local disk encryption is enabled, Databricks generates an encryption key locally unique to each cluster node and uses it to encrypt all data stored on local disks. The scope of the key is local to each cluster node and is destroyed along with the cluster node itself. During its lifetime, the key resides in memory for encryption and decryption and is stored encrypted on the disk. *Your workloads may run more slowly because of the performance impact of reading and writing encrypted data to and from local volumes. This feature is not available for all Azure Databricks subscriptions. Contact your Microsoft or Databricks account representative to request access.*
     */
    public readonly enableLocalDiskEncryption!: pulumi.Output<boolean>;
    public readonly gcpAttributes!: pulumi.Output<outputs.ClusterGcpAttributes | undefined>;
    /**
     * An optional token to guarantee the idempotency of cluster creation requests. If an active cluster with the provided token already exists, the request will not create a new cluster, but it will return the existing running cluster's ID instead. If you specify the idempotency token, upon failure, you can retry until the request succeeds. Databricks platform guarantees to launch exactly one cluster with that idempotency token. This token should have at most 64 characters.
     */
    public readonly idempotencyToken!: pulumi.Output<string | undefined>;
    public readonly initScripts!: pulumi.Output<outputs.ClusterInitScript[] | undefined>;
    /**
     * - To reduce cluster start time, you can attach a cluster to a predefined pool of idle instances. When attached to a pool, a cluster allocates its driver and worker nodes from the pool. If the pool does not have sufficient idle resources to accommodate the cluster’s request, it expands by allocating new instances from the instance provider. When an attached cluster changes its state to `TERMINATED`, the instances it used are returned to the pool and reused by a different cluster.
     */
    public readonly instancePoolId!: pulumi.Output<string | undefined>;
    /**
     * boolean value specifying if the cluster is pinned (not pinned by default). You must be a Databricks administrator to use this.  The pinned clusters' maximum number is [limited to 70](https://docs.databricks.com/clusters/clusters-manage.html#pin-a-cluster), so `apply` may fail if you have more than that.
     */
    public readonly isPinned!: pulumi.Output<boolean | undefined>;
    public readonly libraries!: pulumi.Output<outputs.ClusterLibrary[] | undefined>;
    /**
     * Any supported databricks.getNodeType id. If `instancePoolId` is specified, this field is not needed.
     */
    public readonly nodeTypeId!: pulumi.Output<string>;
    public readonly numWorkers!: pulumi.Output<number | undefined>;
    /**
     * Identifier of Cluster Policy to validate cluster and preset certain defaults. *The primary use for cluster policies is to allow users to create policy-scoped clusters via UI rather than sharing configuration for API-created clusters.* For example, when you specify `policyId` of [external metastore](https://docs.databricks.com/administration-guide/clusters/policies.html#external-metastore-policy) policy, you still have to fill in relevant keys for `sparkConf`.
     */
    public readonly policyId!: pulumi.Output<string | undefined>;
    /**
     * The type of runtime engine to use. If not specified, the runtime engine type is inferred based on the sparkVersion value. Allowed values include: `PHOTON`, `STANDARD`.
     */
    public readonly runtimeEngine!: pulumi.Output<string | undefined>;
    /**
     * The optional user name of the user to assign to an interactive cluster. This field is required when using standard AAD Passthrough for Azure Data Lake Storage (ADLS) with a single-user cluster (i.e., not high-concurrency clusters).
     */
    public readonly singleUserName!: pulumi.Output<string | undefined>;
    /**
     * Map with key-value pairs to fine-tune Spark clusters, where you can provide custom [Spark configuration properties](https://spark.apache.org/docs/latest/configuration.html) in a cluster configuration.
     */
    public readonly sparkConf!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Map with environment variable key-value pairs to fine-tune Spark clusters. Key-value pairs of the form (X,Y) are exported (i.e., X='Y') while launching the driver and workers.
     */
    public readonly sparkEnvVars!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * [Runtime version](https://docs.databricks.com/runtime/index.html) of the cluster. Any supported databricks.getSparkVersion id.  We advise using Cluster Policies to restrict the list of versions for simplicity while maintaining enough control.
     */
    public readonly sparkVersion!: pulumi.Output<string>;
    /**
     * SSH public key contents that will be added to each Spark node in this cluster. The corresponding private keys can be used to login with the user name ubuntu on port 2200. You can specify up to 10 keys.
     */
    public readonly sshPublicKeys!: pulumi.Output<string[] | undefined>;
    /**
     * (string) State of the cluster.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    public /*out*/ readonly url!: pulumi.Output<string>;
    public readonly workloadType!: pulumi.Output<outputs.ClusterWorkloadType | undefined>;

    /**
     * Create a Cluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterArgs | ClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterState | undefined;
            resourceInputs["applyPolicyDefaultValues"] = state ? state.applyPolicyDefaultValues : undefined;
            resourceInputs["autoscale"] = state ? state.autoscale : undefined;
            resourceInputs["autoterminationMinutes"] = state ? state.autoterminationMinutes : undefined;
            resourceInputs["awsAttributes"] = state ? state.awsAttributes : undefined;
            resourceInputs["azureAttributes"] = state ? state.azureAttributes : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["clusterLogConf"] = state ? state.clusterLogConf : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["customTags"] = state ? state.customTags : undefined;
            resourceInputs["dataSecurityMode"] = state ? state.dataSecurityMode : undefined;
            resourceInputs["defaultTags"] = state ? state.defaultTags : undefined;
            resourceInputs["dockerImage"] = state ? state.dockerImage : undefined;
            resourceInputs["driverInstancePoolId"] = state ? state.driverInstancePoolId : undefined;
            resourceInputs["driverNodeTypeId"] = state ? state.driverNodeTypeId : undefined;
            resourceInputs["enableElasticDisk"] = state ? state.enableElasticDisk : undefined;
            resourceInputs["enableLocalDiskEncryption"] = state ? state.enableLocalDiskEncryption : undefined;
            resourceInputs["gcpAttributes"] = state ? state.gcpAttributes : undefined;
            resourceInputs["idempotencyToken"] = state ? state.idempotencyToken : undefined;
            resourceInputs["initScripts"] = state ? state.initScripts : undefined;
            resourceInputs["instancePoolId"] = state ? state.instancePoolId : undefined;
            resourceInputs["isPinned"] = state ? state.isPinned : undefined;
            resourceInputs["libraries"] = state ? state.libraries : undefined;
            resourceInputs["nodeTypeId"] = state ? state.nodeTypeId : undefined;
            resourceInputs["numWorkers"] = state ? state.numWorkers : undefined;
            resourceInputs["policyId"] = state ? state.policyId : undefined;
            resourceInputs["runtimeEngine"] = state ? state.runtimeEngine : undefined;
            resourceInputs["singleUserName"] = state ? state.singleUserName : undefined;
            resourceInputs["sparkConf"] = state ? state.sparkConf : undefined;
            resourceInputs["sparkEnvVars"] = state ? state.sparkEnvVars : undefined;
            resourceInputs["sparkVersion"] = state ? state.sparkVersion : undefined;
            resourceInputs["sshPublicKeys"] = state ? state.sshPublicKeys : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["workloadType"] = state ? state.workloadType : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            if ((!args || args.sparkVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sparkVersion'");
            }
            resourceInputs["applyPolicyDefaultValues"] = args ? args.applyPolicyDefaultValues : undefined;
            resourceInputs["autoscale"] = args ? args.autoscale : undefined;
            resourceInputs["autoterminationMinutes"] = args ? args.autoterminationMinutes : undefined;
            resourceInputs["awsAttributes"] = args ? args.awsAttributes : undefined;
            resourceInputs["azureAttributes"] = args ? args.azureAttributes : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["clusterLogConf"] = args ? args.clusterLogConf : undefined;
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["customTags"] = args ? args.customTags : undefined;
            resourceInputs["dataSecurityMode"] = args ? args.dataSecurityMode : undefined;
            resourceInputs["dockerImage"] = args ? args.dockerImage : undefined;
            resourceInputs["driverInstancePoolId"] = args ? args.driverInstancePoolId : undefined;
            resourceInputs["driverNodeTypeId"] = args ? args.driverNodeTypeId : undefined;
            resourceInputs["enableElasticDisk"] = args ? args.enableElasticDisk : undefined;
            resourceInputs["enableLocalDiskEncryption"] = args ? args.enableLocalDiskEncryption : undefined;
            resourceInputs["gcpAttributes"] = args ? args.gcpAttributes : undefined;
            resourceInputs["idempotencyToken"] = args ? args.idempotencyToken : undefined;
            resourceInputs["initScripts"] = args ? args.initScripts : undefined;
            resourceInputs["instancePoolId"] = args ? args.instancePoolId : undefined;
            resourceInputs["isPinned"] = args ? args.isPinned : undefined;
            resourceInputs["libraries"] = args ? args.libraries : undefined;
            resourceInputs["nodeTypeId"] = args ? args.nodeTypeId : undefined;
            resourceInputs["numWorkers"] = args ? args.numWorkers : undefined;
            resourceInputs["policyId"] = args ? args.policyId : undefined;
            resourceInputs["runtimeEngine"] = args ? args.runtimeEngine : undefined;
            resourceInputs["singleUserName"] = args ? args.singleUserName : undefined;
            resourceInputs["sparkConf"] = args ? args.sparkConf : undefined;
            resourceInputs["sparkEnvVars"] = args ? args.sparkEnvVars : undefined;
            resourceInputs["sparkVersion"] = args ? args.sparkVersion : undefined;
            resourceInputs["sshPublicKeys"] = args ? args.sshPublicKeys : undefined;
            resourceInputs["workloadType"] = args ? args.workloadType : undefined;
            resourceInputs["defaultTags"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["url"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Cluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cluster resources.
 */
export interface ClusterState {
    /**
     * Whether to use policy default values for missing cluster attributes.
     */
    applyPolicyDefaultValues?: pulumi.Input<boolean>;
    autoscale?: pulumi.Input<inputs.ClusterAutoscale>;
    /**
     * Automatically terminate the cluster after being inactive for this time in minutes. If specified, the threshold must be between 10 and 10000 minutes. You can also set this value to 0 to explicitly disable automatic termination. Defaults to `60`.  *We highly recommend having this setting present for Interactive/BI clusters.*
     */
    autoterminationMinutes?: pulumi.Input<number>;
    awsAttributes?: pulumi.Input<inputs.ClusterAwsAttributes>;
    azureAttributes?: pulumi.Input<inputs.ClusterAzureAttributes>;
    clusterId?: pulumi.Input<string>;
    clusterLogConf?: pulumi.Input<inputs.ClusterClusterLogConf>;
    /**
     * Cluster name, which doesn’t have to be unique. If not specified at creation, the cluster name will be an empty string.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * Additional tags for cluster resources. Databricks will tag all cluster resources (e.g., AWS EC2 instances and EBS volumes) with these tags in addition to `defaultTags`.
     */
    customTags?: pulumi.Input<{[key: string]: any}>;
    /**
     * Select the security features of the cluster. Unity Catalog requires `SINGLE_USER` or `USER_ISOLATION` mode. `LEGACY_PASSTHROUGH` for passthrough cluster and `LEGACY_TABLE_ACL` for Table ACL cluster. Default to `NONE`, i.e. no security feature enabled.
     */
    dataSecurityMode?: pulumi.Input<string>;
    /**
     * (map) Tags that are added by Databricks by default, regardless of any customTags that may have been added. These include: Vendor: Databricks, Creator: <username_of_creator>, ClusterName: <name_of_cluster>, ClusterId: <id_of_cluster>, Name: <Databricks internal use>
     */
    defaultTags?: pulumi.Input<{[key: string]: any}>;
    dockerImage?: pulumi.Input<inputs.ClusterDockerImage>;
    /**
     * similar to `instancePoolId`, but for driver node. If omitted, and `instancePoolId` is specified, then the driver will be allocated from that pool.
     */
    driverInstancePoolId?: pulumi.Input<string>;
    /**
     * The node type of the Spark driver. This field is optional; if unset, API will set the driver node type to the same value as `nodeTypeId` defined above.
     */
    driverNodeTypeId?: pulumi.Input<string>;
    /**
     * If you don’t want to allocate a fixed number of EBS volumes at cluster creation time, use autoscaling local storage. With autoscaling local storage, Databricks monitors the amount of free disk space available on your cluster’s Spark workers. If a worker begins to run too low on disk, Databricks automatically attaches a new EBS volume to the worker before it runs out of disk space. EBS volumes are attached up to a limit of 5 TB of total disk space per instance (including the instance’s local storage). To scale down EBS usage, make sure you have `autoterminationMinutes` and `autoscale` attributes set. More documentation available at [cluster configuration page](https://docs.databricks.com/clusters/configure.html#autoscaling-local-storage-1).
     */
    enableElasticDisk?: pulumi.Input<boolean>;
    /**
     * Some instance types you use to run clusters may have locally attached disks. Databricks may store shuffle data or temporary data on these locally attached disks. To ensure that all data at rest is encrypted for all storage types, including shuffle data stored temporarily on your cluster’s local disks, you can enable local disk encryption. When local disk encryption is enabled, Databricks generates an encryption key locally unique to each cluster node and uses it to encrypt all data stored on local disks. The scope of the key is local to each cluster node and is destroyed along with the cluster node itself. During its lifetime, the key resides in memory for encryption and decryption and is stored encrypted on the disk. *Your workloads may run more slowly because of the performance impact of reading and writing encrypted data to and from local volumes. This feature is not available for all Azure Databricks subscriptions. Contact your Microsoft or Databricks account representative to request access.*
     */
    enableLocalDiskEncryption?: pulumi.Input<boolean>;
    gcpAttributes?: pulumi.Input<inputs.ClusterGcpAttributes>;
    /**
     * An optional token to guarantee the idempotency of cluster creation requests. If an active cluster with the provided token already exists, the request will not create a new cluster, but it will return the existing running cluster's ID instead. If you specify the idempotency token, upon failure, you can retry until the request succeeds. Databricks platform guarantees to launch exactly one cluster with that idempotency token. This token should have at most 64 characters.
     */
    idempotencyToken?: pulumi.Input<string>;
    initScripts?: pulumi.Input<pulumi.Input<inputs.ClusterInitScript>[]>;
    /**
     * - To reduce cluster start time, you can attach a cluster to a predefined pool of idle instances. When attached to a pool, a cluster allocates its driver and worker nodes from the pool. If the pool does not have sufficient idle resources to accommodate the cluster’s request, it expands by allocating new instances from the instance provider. When an attached cluster changes its state to `TERMINATED`, the instances it used are returned to the pool and reused by a different cluster.
     */
    instancePoolId?: pulumi.Input<string>;
    /**
     * boolean value specifying if the cluster is pinned (not pinned by default). You must be a Databricks administrator to use this.  The pinned clusters' maximum number is [limited to 70](https://docs.databricks.com/clusters/clusters-manage.html#pin-a-cluster), so `apply` may fail if you have more than that.
     */
    isPinned?: pulumi.Input<boolean>;
    libraries?: pulumi.Input<pulumi.Input<inputs.ClusterLibrary>[]>;
    /**
     * Any supported databricks.getNodeType id. If `instancePoolId` is specified, this field is not needed.
     */
    nodeTypeId?: pulumi.Input<string>;
    numWorkers?: pulumi.Input<number>;
    /**
     * Identifier of Cluster Policy to validate cluster and preset certain defaults. *The primary use for cluster policies is to allow users to create policy-scoped clusters via UI rather than sharing configuration for API-created clusters.* For example, when you specify `policyId` of [external metastore](https://docs.databricks.com/administration-guide/clusters/policies.html#external-metastore-policy) policy, you still have to fill in relevant keys for `sparkConf`.
     */
    policyId?: pulumi.Input<string>;
    /**
     * The type of runtime engine to use. If not specified, the runtime engine type is inferred based on the sparkVersion value. Allowed values include: `PHOTON`, `STANDARD`.
     */
    runtimeEngine?: pulumi.Input<string>;
    /**
     * The optional user name of the user to assign to an interactive cluster. This field is required when using standard AAD Passthrough for Azure Data Lake Storage (ADLS) with a single-user cluster (i.e., not high-concurrency clusters).
     */
    singleUserName?: pulumi.Input<string>;
    /**
     * Map with key-value pairs to fine-tune Spark clusters, where you can provide custom [Spark configuration properties](https://spark.apache.org/docs/latest/configuration.html) in a cluster configuration.
     */
    sparkConf?: pulumi.Input<{[key: string]: any}>;
    /**
     * Map with environment variable key-value pairs to fine-tune Spark clusters. Key-value pairs of the form (X,Y) are exported (i.e., X='Y') while launching the driver and workers.
     */
    sparkEnvVars?: pulumi.Input<{[key: string]: any}>;
    /**
     * [Runtime version](https://docs.databricks.com/runtime/index.html) of the cluster. Any supported databricks.getSparkVersion id.  We advise using Cluster Policies to restrict the list of versions for simplicity while maintaining enough control.
     */
    sparkVersion?: pulumi.Input<string>;
    /**
     * SSH public key contents that will be added to each Spark node in this cluster. The corresponding private keys can be used to login with the user name ubuntu on port 2200. You can specify up to 10 keys.
     */
    sshPublicKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (string) State of the cluster.
     */
    state?: pulumi.Input<string>;
    url?: pulumi.Input<string>;
    workloadType?: pulumi.Input<inputs.ClusterWorkloadType>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    /**
     * Whether to use policy default values for missing cluster attributes.
     */
    applyPolicyDefaultValues?: pulumi.Input<boolean>;
    autoscale?: pulumi.Input<inputs.ClusterAutoscale>;
    /**
     * Automatically terminate the cluster after being inactive for this time in minutes. If specified, the threshold must be between 10 and 10000 minutes. You can also set this value to 0 to explicitly disable automatic termination. Defaults to `60`.  *We highly recommend having this setting present for Interactive/BI clusters.*
     */
    autoterminationMinutes?: pulumi.Input<number>;
    awsAttributes?: pulumi.Input<inputs.ClusterAwsAttributes>;
    azureAttributes?: pulumi.Input<inputs.ClusterAzureAttributes>;
    clusterId?: pulumi.Input<string>;
    clusterLogConf?: pulumi.Input<inputs.ClusterClusterLogConf>;
    /**
     * Cluster name, which doesn’t have to be unique. If not specified at creation, the cluster name will be an empty string.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * Additional tags for cluster resources. Databricks will tag all cluster resources (e.g., AWS EC2 instances and EBS volumes) with these tags in addition to `defaultTags`.
     */
    customTags?: pulumi.Input<{[key: string]: any}>;
    /**
     * Select the security features of the cluster. Unity Catalog requires `SINGLE_USER` or `USER_ISOLATION` mode. `LEGACY_PASSTHROUGH` for passthrough cluster and `LEGACY_TABLE_ACL` for Table ACL cluster. Default to `NONE`, i.e. no security feature enabled.
     */
    dataSecurityMode?: pulumi.Input<string>;
    dockerImage?: pulumi.Input<inputs.ClusterDockerImage>;
    /**
     * similar to `instancePoolId`, but for driver node. If omitted, and `instancePoolId` is specified, then the driver will be allocated from that pool.
     */
    driverInstancePoolId?: pulumi.Input<string>;
    /**
     * The node type of the Spark driver. This field is optional; if unset, API will set the driver node type to the same value as `nodeTypeId` defined above.
     */
    driverNodeTypeId?: pulumi.Input<string>;
    /**
     * If you don’t want to allocate a fixed number of EBS volumes at cluster creation time, use autoscaling local storage. With autoscaling local storage, Databricks monitors the amount of free disk space available on your cluster’s Spark workers. If a worker begins to run too low on disk, Databricks automatically attaches a new EBS volume to the worker before it runs out of disk space. EBS volumes are attached up to a limit of 5 TB of total disk space per instance (including the instance’s local storage). To scale down EBS usage, make sure you have `autoterminationMinutes` and `autoscale` attributes set. More documentation available at [cluster configuration page](https://docs.databricks.com/clusters/configure.html#autoscaling-local-storage-1).
     */
    enableElasticDisk?: pulumi.Input<boolean>;
    /**
     * Some instance types you use to run clusters may have locally attached disks. Databricks may store shuffle data or temporary data on these locally attached disks. To ensure that all data at rest is encrypted for all storage types, including shuffle data stored temporarily on your cluster’s local disks, you can enable local disk encryption. When local disk encryption is enabled, Databricks generates an encryption key locally unique to each cluster node and uses it to encrypt all data stored on local disks. The scope of the key is local to each cluster node and is destroyed along with the cluster node itself. During its lifetime, the key resides in memory for encryption and decryption and is stored encrypted on the disk. *Your workloads may run more slowly because of the performance impact of reading and writing encrypted data to and from local volumes. This feature is not available for all Azure Databricks subscriptions. Contact your Microsoft or Databricks account representative to request access.*
     */
    enableLocalDiskEncryption?: pulumi.Input<boolean>;
    gcpAttributes?: pulumi.Input<inputs.ClusterGcpAttributes>;
    /**
     * An optional token to guarantee the idempotency of cluster creation requests. If an active cluster with the provided token already exists, the request will not create a new cluster, but it will return the existing running cluster's ID instead. If you specify the idempotency token, upon failure, you can retry until the request succeeds. Databricks platform guarantees to launch exactly one cluster with that idempotency token. This token should have at most 64 characters.
     */
    idempotencyToken?: pulumi.Input<string>;
    initScripts?: pulumi.Input<pulumi.Input<inputs.ClusterInitScript>[]>;
    /**
     * - To reduce cluster start time, you can attach a cluster to a predefined pool of idle instances. When attached to a pool, a cluster allocates its driver and worker nodes from the pool. If the pool does not have sufficient idle resources to accommodate the cluster’s request, it expands by allocating new instances from the instance provider. When an attached cluster changes its state to `TERMINATED`, the instances it used are returned to the pool and reused by a different cluster.
     */
    instancePoolId?: pulumi.Input<string>;
    /**
     * boolean value specifying if the cluster is pinned (not pinned by default). You must be a Databricks administrator to use this.  The pinned clusters' maximum number is [limited to 70](https://docs.databricks.com/clusters/clusters-manage.html#pin-a-cluster), so `apply` may fail if you have more than that.
     */
    isPinned?: pulumi.Input<boolean>;
    libraries?: pulumi.Input<pulumi.Input<inputs.ClusterLibrary>[]>;
    /**
     * Any supported databricks.getNodeType id. If `instancePoolId` is specified, this field is not needed.
     */
    nodeTypeId?: pulumi.Input<string>;
    numWorkers?: pulumi.Input<number>;
    /**
     * Identifier of Cluster Policy to validate cluster and preset certain defaults. *The primary use for cluster policies is to allow users to create policy-scoped clusters via UI rather than sharing configuration for API-created clusters.* For example, when you specify `policyId` of [external metastore](https://docs.databricks.com/administration-guide/clusters/policies.html#external-metastore-policy) policy, you still have to fill in relevant keys for `sparkConf`.
     */
    policyId?: pulumi.Input<string>;
    /**
     * The type of runtime engine to use. If not specified, the runtime engine type is inferred based on the sparkVersion value. Allowed values include: `PHOTON`, `STANDARD`.
     */
    runtimeEngine?: pulumi.Input<string>;
    /**
     * The optional user name of the user to assign to an interactive cluster. This field is required when using standard AAD Passthrough for Azure Data Lake Storage (ADLS) with a single-user cluster (i.e., not high-concurrency clusters).
     */
    singleUserName?: pulumi.Input<string>;
    /**
     * Map with key-value pairs to fine-tune Spark clusters, where you can provide custom [Spark configuration properties](https://spark.apache.org/docs/latest/configuration.html) in a cluster configuration.
     */
    sparkConf?: pulumi.Input<{[key: string]: any}>;
    /**
     * Map with environment variable key-value pairs to fine-tune Spark clusters. Key-value pairs of the form (X,Y) are exported (i.e., X='Y') while launching the driver and workers.
     */
    sparkEnvVars?: pulumi.Input<{[key: string]: any}>;
    /**
     * [Runtime version](https://docs.databricks.com/runtime/index.html) of the cluster. Any supported databricks.getSparkVersion id.  We advise using Cluster Policies to restrict the list of versions for simplicity while maintaining enough control.
     */
    sparkVersion: pulumi.Input<string>;
    /**
     * SSH public key contents that will be added to each Spark node in this cluster. The corresponding private keys can be used to login with the user name ubuntu on port 2200. You can specify up to 10 keys.
     */
    sshPublicKeys?: pulumi.Input<pulumi.Input<string>[]>;
    workloadType?: pulumi.Input<inputs.ClusterWorkloadType>;
}
