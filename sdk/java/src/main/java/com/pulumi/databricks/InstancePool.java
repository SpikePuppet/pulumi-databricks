// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.InstancePoolArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.InstancePoolState;
import com.pulumi.databricks.outputs.InstancePoolAwsAttributes;
import com.pulumi.databricks.outputs.InstancePoolAzureAttributes;
import com.pulumi.databricks.outputs.InstancePoolDiskSpec;
import com.pulumi.databricks.outputs.InstancePoolGcpAttributes;
import com.pulumi.databricks.outputs.InstancePoolInstancePoolFleetAttributes;
import com.pulumi.databricks.outputs.InstancePoolPreloadedDockerImage;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances. An instance pool reduces cluster start and auto-scaling times by maintaining a set of idle, ready-to-use cloud instances. When a cluster attached to a pool needs an instance, it first attempts to allocate one of the pool’s idle instances. If the pool has no idle instances, it expands by allocating a new instance from the instance provider in order to accommodate the cluster’s request. When a cluster releases an instance, it returns to the pool and is free for another cluster to use. Only clusters attached to a pool can use that pool’s idle instances.
 * 
 * &gt; **Note** It is important to know that different cloud service providers have different `node_type_id`, `disk_specs` and potentially other configurations.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetNodeTypeArgs;
 * import com.pulumi.databricks.InstancePool;
 * import com.pulumi.databricks.InstancePoolArgs;
 * import com.pulumi.databricks.inputs.InstancePoolAwsAttributesArgs;
 * import com.pulumi.databricks.inputs.InstancePoolDiskSpecArgs;
 * import com.pulumi.databricks.inputs.InstancePoolDiskSpecDiskTypeArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var smallest = DatabricksFunctions.getNodeType();
 * 
 *         var smallestNodes = new InstancePool(&#34;smallestNodes&#34;, InstancePoolArgs.builder()        
 *             .instancePoolName(&#34;Smallest Nodes&#34;)
 *             .minIdleInstances(0)
 *             .maxCapacity(300)
 *             .nodeTypeId(smallest.applyValue(getNodeTypeResult -&gt; getNodeTypeResult.id()))
 *             .awsAttributes(InstancePoolAwsAttributesArgs.builder()
 *                 .availability(&#34;ON_DEMAND&#34;)
 *                 .zoneId(&#34;us-east-1a&#34;)
 *                 .spotBidPricePercent(&#34;100&#34;)
 *                 .build())
 *             .idleInstanceAutoterminationMinutes(10)
 *             .diskSpec(InstancePoolDiskSpecArgs.builder()
 *                 .diskType(InstancePoolDiskSpecDiskTypeArgs.builder()
 *                     .ebsVolumeType(&#34;GENERAL_PURPOSE_SSD&#34;)
 *                     .build())
 *                 .diskSize(80)
 *                 .diskCount(1)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Access Control
 * 
 * * databricks.Group and databricks.User can control which groups or individual users can create instance pools.
 * * databricks.Permissions can control which groups or individual users can *Manage* or *Attach to* individual instance pools.
 * 
 * ## Import
 * 
 * The resource instance pool can be imported using it&#39;s id:
 * 
 *  bash
 * 
 * ```sh
 * $ pulumi import databricks:index/instancePool:InstancePool this &lt;instance-pool-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/instancePool:InstancePool")
public class InstancePool extends com.pulumi.resources.CustomResource {
    @Export(name="awsAttributes", refs={InstancePoolAwsAttributes.class}, tree="[0]")
    private Output</* @Nullable */ InstancePoolAwsAttributes> awsAttributes;

    public Output<Optional<InstancePoolAwsAttributes>> awsAttributes() {
        return Codegen.optional(this.awsAttributes);
    }
    @Export(name="azureAttributes", refs={InstancePoolAzureAttributes.class}, tree="[0]")
    private Output</* @Nullable */ InstancePoolAzureAttributes> azureAttributes;

    public Output<Optional<InstancePoolAzureAttributes>> azureAttributes() {
        return Codegen.optional(this.azureAttributes);
    }
    /**
     * (Map) Additional tags for instance pool resources. Databricks tags all pool resources (e.g. AWS &amp; Azure instances and Disk volumes). The tags of the instance pool will propagate to the clusters using the pool (see the [official documentation](https://docs.databricks.com/administration-guide/account-settings/usage-detail-tags-aws.html#tag-propagation)). Attempting to set the same tags in both cluster and instance pool will raise an error. *Databricks allows at most 43 custom tags.*
     * 
     */
    @Export(name="customTags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> customTags;

    /**
     * @return (Map) Additional tags for instance pool resources. Databricks tags all pool resources (e.g. AWS &amp; Azure instances and Disk volumes). The tags of the instance pool will propagate to the clusters using the pool (see the [official documentation](https://docs.databricks.com/administration-guide/account-settings/usage-detail-tags-aws.html#tag-propagation)). Attempting to set the same tags in both cluster and instance pool will raise an error. *Databricks allows at most 43 custom tags.*
     * 
     */
    public Output<Optional<Map<String,Object>>> customTags() {
        return Codegen.optional(this.customTags);
    }
    @Export(name="diskSpec", refs={InstancePoolDiskSpec.class}, tree="[0]")
    private Output</* @Nullable */ InstancePoolDiskSpec> diskSpec;

    public Output<Optional<InstancePoolDiskSpec>> diskSpec() {
        return Codegen.optional(this.diskSpec);
    }
    /**
     * (Bool) Autoscaling Local Storage: when enabled, the instances in the pool dynamically acquire additional disk space when they are running low on disk space.
     * 
     */
    @Export(name="enableElasticDisk", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableElasticDisk;

    /**
     * @return (Bool) Autoscaling Local Storage: when enabled, the instances in the pool dynamically acquire additional disk space when they are running low on disk space.
     * 
     */
    public Output<Optional<Boolean>> enableElasticDisk() {
        return Codegen.optional(this.enableElasticDisk);
    }
    @Export(name="gcpAttributes", refs={InstancePoolGcpAttributes.class}, tree="[0]")
    private Output</* @Nullable */ InstancePoolGcpAttributes> gcpAttributes;

    public Output<Optional<InstancePoolGcpAttributes>> gcpAttributes() {
        return Codegen.optional(this.gcpAttributes);
    }
    /**
     * (Integer) The number of minutes that idle instances in excess of the min_idle_instances are maintained by the pool before being terminated. If not specified, excess idle instances are terminated automatically after a default timeout period. If specified, the time must be between 0 and 10000 minutes. If you specify 0, excess idle instances are removed as soon as possible.
     * 
     */
    @Export(name="idleInstanceAutoterminationMinutes", refs={Integer.class}, tree="[0]")
    private Output<Integer> idleInstanceAutoterminationMinutes;

    /**
     * @return (Integer) The number of minutes that idle instances in excess of the min_idle_instances are maintained by the pool before being terminated. If not specified, excess idle instances are terminated automatically after a default timeout period. If specified, the time must be between 0 and 10000 minutes. If you specify 0, excess idle instances are removed as soon as possible.
     * 
     */
    public Output<Integer> idleInstanceAutoterminationMinutes() {
        return this.idleInstanceAutoterminationMinutes;
    }
    @Export(name="instancePoolFleetAttributes", refs={InstancePoolInstancePoolFleetAttributes.class}, tree="[0]")
    private Output</* @Nullable */ InstancePoolInstancePoolFleetAttributes> instancePoolFleetAttributes;

    public Output<Optional<InstancePoolInstancePoolFleetAttributes>> instancePoolFleetAttributes() {
        return Codegen.optional(this.instancePoolFleetAttributes);
    }
    @Export(name="instancePoolId", refs={String.class}, tree="[0]")
    private Output<String> instancePoolId;

    public Output<String> instancePoolId() {
        return this.instancePoolId;
    }
    /**
     * (String) The name of the instance pool. This is required for create and edit operations. It must be unique, non-empty, and less than 100 characters.
     * 
     */
    @Export(name="instancePoolName", refs={String.class}, tree="[0]")
    private Output<String> instancePoolName;

    /**
     * @return (String) The name of the instance pool. This is required for create and edit operations. It must be unique, non-empty, and less than 100 characters.
     * 
     */
    public Output<String> instancePoolName() {
        return this.instancePoolName;
    }
    /**
     * (Integer) The maximum number of instances the pool can contain, including both idle instances and ones in use by clusters. Once the maximum capacity is reached, you cannot create new clusters from the pool and existing clusters cannot autoscale up until some instances are made idle in the pool via cluster termination or down-scaling. There is no default limit, but as a [best practice](https://docs.databricks.com/clusters/instance-pools/pool-best-practices.html#configure-pools-to-control-cost), this should be set based on anticipated usage.
     * 
     */
    @Export(name="maxCapacity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxCapacity;

    /**
     * @return (Integer) The maximum number of instances the pool can contain, including both idle instances and ones in use by clusters. Once the maximum capacity is reached, you cannot create new clusters from the pool and existing clusters cannot autoscale up until some instances are made idle in the pool via cluster termination or down-scaling. There is no default limit, but as a [best practice](https://docs.databricks.com/clusters/instance-pools/pool-best-practices.html#configure-pools-to-control-cost), this should be set based on anticipated usage.
     * 
     */
    public Output<Optional<Integer>> maxCapacity() {
        return Codegen.optional(this.maxCapacity);
    }
    /**
     * (Integer) The minimum number of idle instances maintained by the pool. This is in addition to any instances in use by active clusters.
     * 
     */
    @Export(name="minIdleInstances", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minIdleInstances;

    /**
     * @return (Integer) The minimum number of idle instances maintained by the pool. This is in addition to any instances in use by active clusters.
     * 
     */
    public Output<Optional<Integer>> minIdleInstances() {
        return Codegen.optional(this.minIdleInstances);
    }
    /**
     * (String) The node type for the instances in the pool. All clusters attached to the pool inherit this node type and the pool’s idle instances are allocated based on this type. You can retrieve a list of available node types by using the [List Node Types API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistnodetypes) call.
     * 
     */
    @Export(name="nodeTypeId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> nodeTypeId;

    /**
     * @return (String) The node type for the instances in the pool. All clusters attached to the pool inherit this node type and the pool’s idle instances are allocated based on this type. You can retrieve a list of available node types by using the [List Node Types API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistnodetypes) call.
     * 
     */
    public Output<Optional<String>> nodeTypeId() {
        return Codegen.optional(this.nodeTypeId);
    }
    @Export(name="preloadedDockerImages", refs={List.class,InstancePoolPreloadedDockerImage.class}, tree="[0,1]")
    private Output</* @Nullable */ List<InstancePoolPreloadedDockerImage>> preloadedDockerImages;

    public Output<Optional<List<InstancePoolPreloadedDockerImage>>> preloadedDockerImages() {
        return Codegen.optional(this.preloadedDockerImages);
    }
    /**
     * (List) A list with at most one runtime version the pool installs on each instance. Pool clusters that use a preloaded runtime version start faster as they do not have to wait for the image to download. You can retrieve them via databricks.getSparkVersion data source or via  [Runtime Versions API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistsparkversions) call.
     * 
     */
    @Export(name="preloadedSparkVersions", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> preloadedSparkVersions;

    /**
     * @return (List) A list with at most one runtime version the pool installs on each instance. Pool clusters that use a preloaded runtime version start faster as they do not have to wait for the image to download. You can retrieve them via databricks.getSparkVersion data source or via  [Runtime Versions API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistsparkversions) call.
     * 
     */
    public Output<Optional<List<String>>> preloadedSparkVersions() {
        return Codegen.optional(this.preloadedSparkVersions);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstancePool(String name) {
        this(name, InstancePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstancePool(String name, InstancePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstancePool(String name, InstancePoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/instancePool:InstancePool", name, args == null ? InstancePoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstancePool(String name, Output<String> id, @Nullable InstancePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/instancePool:InstancePool", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InstancePool get(String name, Output<String> id, @Nullable InstancePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstancePool(name, id, state, options);
    }
}
