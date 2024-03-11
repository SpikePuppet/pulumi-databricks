// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances. An instance pool reduces cluster start and auto-scaling times by maintaining a set of idle, ready-to-use cloud instances. When a cluster attached to a pool needs an instance, it first attempts to allocate one of the pool’s idle instances. If the pool has no idle instances, it expands by allocating a new instance from the instance provider in order to accommodate the cluster’s request. When a cluster releases an instance, it returns to the pool and is free for another cluster to use. Only clusters attached to a pool can use that pool’s idle instances.
//
// > **Note** It is important to know that different cloud service providers have different `nodeTypeId`, `diskSpecs` and potentially other configurations.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			smallest, err := databricks.GetNodeType(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewInstancePool(ctx, "smallestNodes", &databricks.InstancePoolArgs{
//				InstancePoolName: pulumi.String("Smallest Nodes"),
//				MinIdleInstances: pulumi.Int(0),
//				MaxCapacity:      pulumi.Int(300),
//				NodeTypeId:       *pulumi.String(smallest.Id),
//				AwsAttributes: &databricks.InstancePoolAwsAttributesArgs{
//					Availability:        pulumi.String("ON_DEMAND"),
//					ZoneId:              pulumi.String("us-east-1a"),
//					SpotBidPricePercent: pulumi.Int(100),
//				},
//				IdleInstanceAutoterminationMinutes: pulumi.Int(10),
//				DiskSpec: &databricks.InstancePoolDiskSpecArgs{
//					DiskType: &databricks.InstancePoolDiskSpecDiskTypeArgs{
//						EbsVolumeType: pulumi.String("GENERAL_PURPOSE_SSD"),
//					},
//					DiskSize:  pulumi.Int(80),
//					DiskCount: pulumi.Int(1),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Access Control
//
// * Group and User can control which groups or individual users can create instance pools.
// * Permissions can control which groups or individual users can *Manage* or *Attach to* individual instance pools.
//
// ## Import
//
// The resource instance pool can be imported using it's id:
//
// bash
//
// ```sh
// $ pulumi import databricks:index/instancePool:InstancePool this <instance-pool-id>
// ```
type InstancePool struct {
	pulumi.CustomResourceState

	AwsAttributes   InstancePoolAwsAttributesPtrOutput   `pulumi:"awsAttributes"`
	AzureAttributes InstancePoolAzureAttributesPtrOutput `pulumi:"azureAttributes"`
	// (Map) Additional tags for instance pool resources. Databricks tags all pool resources (e.g. AWS & Azure instances and Disk volumes). The tags of the instance pool will propagate to the clusters using the pool (see the [official documentation](https://docs.databricks.com/administration-guide/account-settings/usage-detail-tags-aws.html#tag-propagation)). Attempting to set the same tags in both cluster and instance pool will raise an error. *Databricks allows at most 43 custom tags.*
	CustomTags pulumi.MapOutput              `pulumi:"customTags"`
	DiskSpec   InstancePoolDiskSpecPtrOutput `pulumi:"diskSpec"`
	// (Bool) Autoscaling Local Storage: when enabled, the instances in the pool dynamically acquire additional disk space when they are running low on disk space.
	EnableElasticDisk pulumi.BoolPtrOutput               `pulumi:"enableElasticDisk"`
	GcpAttributes     InstancePoolGcpAttributesPtrOutput `pulumi:"gcpAttributes"`
	// (Integer) The number of minutes that idle instances in excess of the minIdleInstances are maintained by the pool before being terminated. If not specified, excess idle instances are terminated automatically after a default timeout period. If specified, the time must be between 0 and 10000 minutes. If you specify 0, excess idle instances are removed as soon as possible.
	IdleInstanceAutoterminationMinutes pulumi.IntOutput                                 `pulumi:"idleInstanceAutoterminationMinutes"`
	InstancePoolFleetAttributes        InstancePoolInstancePoolFleetAttributesPtrOutput `pulumi:"instancePoolFleetAttributes"`
	InstancePoolId                     pulumi.StringOutput                              `pulumi:"instancePoolId"`
	// (String) The name of the instance pool. This is required for create and edit operations. It must be unique, non-empty, and less than 100 characters.
	InstancePoolName pulumi.StringOutput `pulumi:"instancePoolName"`
	// (Integer) The maximum number of instances the pool can contain, including both idle instances and ones in use by clusters. Once the maximum capacity is reached, you cannot create new clusters from the pool and existing clusters cannot autoscale up until some instances are made idle in the pool via cluster termination or down-scaling. There is no default limit, but as a [best practice](https://docs.databricks.com/clusters/instance-pools/pool-best-practices.html#configure-pools-to-control-cost), this should be set based on anticipated usage.
	MaxCapacity pulumi.IntPtrOutput `pulumi:"maxCapacity"`
	// (Integer) The minimum number of idle instances maintained by the pool. This is in addition to any instances in use by active clusters.
	MinIdleInstances pulumi.IntPtrOutput `pulumi:"minIdleInstances"`
	// (String) The node type for the instances in the pool. All clusters attached to the pool inherit this node type and the pool’s idle instances are allocated based on this type. You can retrieve a list of available node types by using the [List Node Types API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistnodetypes) call.
	NodeTypeId            pulumi.StringPtrOutput                      `pulumi:"nodeTypeId"`
	PreloadedDockerImages InstancePoolPreloadedDockerImageArrayOutput `pulumi:"preloadedDockerImages"`
	// (List) A list with at most one runtime version the pool installs on each instance. Pool clusters that use a preloaded runtime version start faster as they do not have to wait for the image to download. You can retrieve them via getSparkVersion data source or via  [Runtime Versions API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistsparkversions) call.
	PreloadedSparkVersions pulumi.StringArrayOutput `pulumi:"preloadedSparkVersions"`
}

// NewInstancePool registers a new resource with the given unique name, arguments, and options.
func NewInstancePool(ctx *pulumi.Context,
	name string, args *InstancePoolArgs, opts ...pulumi.ResourceOption) (*InstancePool, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.IdleInstanceAutoterminationMinutes == nil {
		return nil, errors.New("invalid value for required argument 'IdleInstanceAutoterminationMinutes'")
	}
	if args.InstancePoolName == nil {
		return nil, errors.New("invalid value for required argument 'InstancePoolName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InstancePool
	err := ctx.RegisterResource("databricks:index/instancePool:InstancePool", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstancePool gets an existing InstancePool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstancePool(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstancePoolState, opts ...pulumi.ResourceOption) (*InstancePool, error) {
	var resource InstancePool
	err := ctx.ReadResource("databricks:index/instancePool:InstancePool", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstancePool resources.
type instancePoolState struct {
	AwsAttributes   *InstancePoolAwsAttributes   `pulumi:"awsAttributes"`
	AzureAttributes *InstancePoolAzureAttributes `pulumi:"azureAttributes"`
	// (Map) Additional tags for instance pool resources. Databricks tags all pool resources (e.g. AWS & Azure instances and Disk volumes). The tags of the instance pool will propagate to the clusters using the pool (see the [official documentation](https://docs.databricks.com/administration-guide/account-settings/usage-detail-tags-aws.html#tag-propagation)). Attempting to set the same tags in both cluster and instance pool will raise an error. *Databricks allows at most 43 custom tags.*
	CustomTags map[string]interface{} `pulumi:"customTags"`
	DiskSpec   *InstancePoolDiskSpec  `pulumi:"diskSpec"`
	// (Bool) Autoscaling Local Storage: when enabled, the instances in the pool dynamically acquire additional disk space when they are running low on disk space.
	EnableElasticDisk *bool                      `pulumi:"enableElasticDisk"`
	GcpAttributes     *InstancePoolGcpAttributes `pulumi:"gcpAttributes"`
	// (Integer) The number of minutes that idle instances in excess of the minIdleInstances are maintained by the pool before being terminated. If not specified, excess idle instances are terminated automatically after a default timeout period. If specified, the time must be between 0 and 10000 minutes. If you specify 0, excess idle instances are removed as soon as possible.
	IdleInstanceAutoterminationMinutes *int                                     `pulumi:"idleInstanceAutoterminationMinutes"`
	InstancePoolFleetAttributes        *InstancePoolInstancePoolFleetAttributes `pulumi:"instancePoolFleetAttributes"`
	InstancePoolId                     *string                                  `pulumi:"instancePoolId"`
	// (String) The name of the instance pool. This is required for create and edit operations. It must be unique, non-empty, and less than 100 characters.
	InstancePoolName *string `pulumi:"instancePoolName"`
	// (Integer) The maximum number of instances the pool can contain, including both idle instances and ones in use by clusters. Once the maximum capacity is reached, you cannot create new clusters from the pool and existing clusters cannot autoscale up until some instances are made idle in the pool via cluster termination or down-scaling. There is no default limit, but as a [best practice](https://docs.databricks.com/clusters/instance-pools/pool-best-practices.html#configure-pools-to-control-cost), this should be set based on anticipated usage.
	MaxCapacity *int `pulumi:"maxCapacity"`
	// (Integer) The minimum number of idle instances maintained by the pool. This is in addition to any instances in use by active clusters.
	MinIdleInstances *int `pulumi:"minIdleInstances"`
	// (String) The node type for the instances in the pool. All clusters attached to the pool inherit this node type and the pool’s idle instances are allocated based on this type. You can retrieve a list of available node types by using the [List Node Types API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistnodetypes) call.
	NodeTypeId            *string                            `pulumi:"nodeTypeId"`
	PreloadedDockerImages []InstancePoolPreloadedDockerImage `pulumi:"preloadedDockerImages"`
	// (List) A list with at most one runtime version the pool installs on each instance. Pool clusters that use a preloaded runtime version start faster as they do not have to wait for the image to download. You can retrieve them via getSparkVersion data source or via  [Runtime Versions API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistsparkversions) call.
	PreloadedSparkVersions []string `pulumi:"preloadedSparkVersions"`
}

type InstancePoolState struct {
	AwsAttributes   InstancePoolAwsAttributesPtrInput
	AzureAttributes InstancePoolAzureAttributesPtrInput
	// (Map) Additional tags for instance pool resources. Databricks tags all pool resources (e.g. AWS & Azure instances and Disk volumes). The tags of the instance pool will propagate to the clusters using the pool (see the [official documentation](https://docs.databricks.com/administration-guide/account-settings/usage-detail-tags-aws.html#tag-propagation)). Attempting to set the same tags in both cluster and instance pool will raise an error. *Databricks allows at most 43 custom tags.*
	CustomTags pulumi.MapInput
	DiskSpec   InstancePoolDiskSpecPtrInput
	// (Bool) Autoscaling Local Storage: when enabled, the instances in the pool dynamically acquire additional disk space when they are running low on disk space.
	EnableElasticDisk pulumi.BoolPtrInput
	GcpAttributes     InstancePoolGcpAttributesPtrInput
	// (Integer) The number of minutes that idle instances in excess of the minIdleInstances are maintained by the pool before being terminated. If not specified, excess idle instances are terminated automatically after a default timeout period. If specified, the time must be between 0 and 10000 minutes. If you specify 0, excess idle instances are removed as soon as possible.
	IdleInstanceAutoterminationMinutes pulumi.IntPtrInput
	InstancePoolFleetAttributes        InstancePoolInstancePoolFleetAttributesPtrInput
	InstancePoolId                     pulumi.StringPtrInput
	// (String) The name of the instance pool. This is required for create and edit operations. It must be unique, non-empty, and less than 100 characters.
	InstancePoolName pulumi.StringPtrInput
	// (Integer) The maximum number of instances the pool can contain, including both idle instances and ones in use by clusters. Once the maximum capacity is reached, you cannot create new clusters from the pool and existing clusters cannot autoscale up until some instances are made idle in the pool via cluster termination or down-scaling. There is no default limit, but as a [best practice](https://docs.databricks.com/clusters/instance-pools/pool-best-practices.html#configure-pools-to-control-cost), this should be set based on anticipated usage.
	MaxCapacity pulumi.IntPtrInput
	// (Integer) The minimum number of idle instances maintained by the pool. This is in addition to any instances in use by active clusters.
	MinIdleInstances pulumi.IntPtrInput
	// (String) The node type for the instances in the pool. All clusters attached to the pool inherit this node type and the pool’s idle instances are allocated based on this type. You can retrieve a list of available node types by using the [List Node Types API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistnodetypes) call.
	NodeTypeId            pulumi.StringPtrInput
	PreloadedDockerImages InstancePoolPreloadedDockerImageArrayInput
	// (List) A list with at most one runtime version the pool installs on each instance. Pool clusters that use a preloaded runtime version start faster as they do not have to wait for the image to download. You can retrieve them via getSparkVersion data source or via  [Runtime Versions API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistsparkversions) call.
	PreloadedSparkVersions pulumi.StringArrayInput
}

func (InstancePoolState) ElementType() reflect.Type {
	return reflect.TypeOf((*instancePoolState)(nil)).Elem()
}

type instancePoolArgs struct {
	AwsAttributes   *InstancePoolAwsAttributes   `pulumi:"awsAttributes"`
	AzureAttributes *InstancePoolAzureAttributes `pulumi:"azureAttributes"`
	// (Map) Additional tags for instance pool resources. Databricks tags all pool resources (e.g. AWS & Azure instances and Disk volumes). The tags of the instance pool will propagate to the clusters using the pool (see the [official documentation](https://docs.databricks.com/administration-guide/account-settings/usage-detail-tags-aws.html#tag-propagation)). Attempting to set the same tags in both cluster and instance pool will raise an error. *Databricks allows at most 43 custom tags.*
	CustomTags map[string]interface{} `pulumi:"customTags"`
	DiskSpec   *InstancePoolDiskSpec  `pulumi:"diskSpec"`
	// (Bool) Autoscaling Local Storage: when enabled, the instances in the pool dynamically acquire additional disk space when they are running low on disk space.
	EnableElasticDisk *bool                      `pulumi:"enableElasticDisk"`
	GcpAttributes     *InstancePoolGcpAttributes `pulumi:"gcpAttributes"`
	// (Integer) The number of minutes that idle instances in excess of the minIdleInstances are maintained by the pool before being terminated. If not specified, excess idle instances are terminated automatically after a default timeout period. If specified, the time must be between 0 and 10000 minutes. If you specify 0, excess idle instances are removed as soon as possible.
	IdleInstanceAutoterminationMinutes int                                      `pulumi:"idleInstanceAutoterminationMinutes"`
	InstancePoolFleetAttributes        *InstancePoolInstancePoolFleetAttributes `pulumi:"instancePoolFleetAttributes"`
	InstancePoolId                     *string                                  `pulumi:"instancePoolId"`
	// (String) The name of the instance pool. This is required for create and edit operations. It must be unique, non-empty, and less than 100 characters.
	InstancePoolName string `pulumi:"instancePoolName"`
	// (Integer) The maximum number of instances the pool can contain, including both idle instances and ones in use by clusters. Once the maximum capacity is reached, you cannot create new clusters from the pool and existing clusters cannot autoscale up until some instances are made idle in the pool via cluster termination or down-scaling. There is no default limit, but as a [best practice](https://docs.databricks.com/clusters/instance-pools/pool-best-practices.html#configure-pools-to-control-cost), this should be set based on anticipated usage.
	MaxCapacity *int `pulumi:"maxCapacity"`
	// (Integer) The minimum number of idle instances maintained by the pool. This is in addition to any instances in use by active clusters.
	MinIdleInstances *int `pulumi:"minIdleInstances"`
	// (String) The node type for the instances in the pool. All clusters attached to the pool inherit this node type and the pool’s idle instances are allocated based on this type. You can retrieve a list of available node types by using the [List Node Types API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistnodetypes) call.
	NodeTypeId            *string                            `pulumi:"nodeTypeId"`
	PreloadedDockerImages []InstancePoolPreloadedDockerImage `pulumi:"preloadedDockerImages"`
	// (List) A list with at most one runtime version the pool installs on each instance. Pool clusters that use a preloaded runtime version start faster as they do not have to wait for the image to download. You can retrieve them via getSparkVersion data source or via  [Runtime Versions API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistsparkversions) call.
	PreloadedSparkVersions []string `pulumi:"preloadedSparkVersions"`
}

// The set of arguments for constructing a InstancePool resource.
type InstancePoolArgs struct {
	AwsAttributes   InstancePoolAwsAttributesPtrInput
	AzureAttributes InstancePoolAzureAttributesPtrInput
	// (Map) Additional tags for instance pool resources. Databricks tags all pool resources (e.g. AWS & Azure instances and Disk volumes). The tags of the instance pool will propagate to the clusters using the pool (see the [official documentation](https://docs.databricks.com/administration-guide/account-settings/usage-detail-tags-aws.html#tag-propagation)). Attempting to set the same tags in both cluster and instance pool will raise an error. *Databricks allows at most 43 custom tags.*
	CustomTags pulumi.MapInput
	DiskSpec   InstancePoolDiskSpecPtrInput
	// (Bool) Autoscaling Local Storage: when enabled, the instances in the pool dynamically acquire additional disk space when they are running low on disk space.
	EnableElasticDisk pulumi.BoolPtrInput
	GcpAttributes     InstancePoolGcpAttributesPtrInput
	// (Integer) The number of minutes that idle instances in excess of the minIdleInstances are maintained by the pool before being terminated. If not specified, excess idle instances are terminated automatically after a default timeout period. If specified, the time must be between 0 and 10000 minutes. If you specify 0, excess idle instances are removed as soon as possible.
	IdleInstanceAutoterminationMinutes pulumi.IntInput
	InstancePoolFleetAttributes        InstancePoolInstancePoolFleetAttributesPtrInput
	InstancePoolId                     pulumi.StringPtrInput
	// (String) The name of the instance pool. This is required for create and edit operations. It must be unique, non-empty, and less than 100 characters.
	InstancePoolName pulumi.StringInput
	// (Integer) The maximum number of instances the pool can contain, including both idle instances and ones in use by clusters. Once the maximum capacity is reached, you cannot create new clusters from the pool and existing clusters cannot autoscale up until some instances are made idle in the pool via cluster termination or down-scaling. There is no default limit, but as a [best practice](https://docs.databricks.com/clusters/instance-pools/pool-best-practices.html#configure-pools-to-control-cost), this should be set based on anticipated usage.
	MaxCapacity pulumi.IntPtrInput
	// (Integer) The minimum number of idle instances maintained by the pool. This is in addition to any instances in use by active clusters.
	MinIdleInstances pulumi.IntPtrInput
	// (String) The node type for the instances in the pool. All clusters attached to the pool inherit this node type and the pool’s idle instances are allocated based on this type. You can retrieve a list of available node types by using the [List Node Types API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistnodetypes) call.
	NodeTypeId            pulumi.StringPtrInput
	PreloadedDockerImages InstancePoolPreloadedDockerImageArrayInput
	// (List) A list with at most one runtime version the pool installs on each instance. Pool clusters that use a preloaded runtime version start faster as they do not have to wait for the image to download. You can retrieve them via getSparkVersion data source or via  [Runtime Versions API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistsparkversions) call.
	PreloadedSparkVersions pulumi.StringArrayInput
}

func (InstancePoolArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instancePoolArgs)(nil)).Elem()
}

type InstancePoolInput interface {
	pulumi.Input

	ToInstancePoolOutput() InstancePoolOutput
	ToInstancePoolOutputWithContext(ctx context.Context) InstancePoolOutput
}

func (*InstancePool) ElementType() reflect.Type {
	return reflect.TypeOf((**InstancePool)(nil)).Elem()
}

func (i *InstancePool) ToInstancePoolOutput() InstancePoolOutput {
	return i.ToInstancePoolOutputWithContext(context.Background())
}

func (i *InstancePool) ToInstancePoolOutputWithContext(ctx context.Context) InstancePoolOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstancePoolOutput)
}

// InstancePoolArrayInput is an input type that accepts InstancePoolArray and InstancePoolArrayOutput values.
// You can construct a concrete instance of `InstancePoolArrayInput` via:
//
//	InstancePoolArray{ InstancePoolArgs{...} }
type InstancePoolArrayInput interface {
	pulumi.Input

	ToInstancePoolArrayOutput() InstancePoolArrayOutput
	ToInstancePoolArrayOutputWithContext(context.Context) InstancePoolArrayOutput
}

type InstancePoolArray []InstancePoolInput

func (InstancePoolArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstancePool)(nil)).Elem()
}

func (i InstancePoolArray) ToInstancePoolArrayOutput() InstancePoolArrayOutput {
	return i.ToInstancePoolArrayOutputWithContext(context.Background())
}

func (i InstancePoolArray) ToInstancePoolArrayOutputWithContext(ctx context.Context) InstancePoolArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstancePoolArrayOutput)
}

// InstancePoolMapInput is an input type that accepts InstancePoolMap and InstancePoolMapOutput values.
// You can construct a concrete instance of `InstancePoolMapInput` via:
//
//	InstancePoolMap{ "key": InstancePoolArgs{...} }
type InstancePoolMapInput interface {
	pulumi.Input

	ToInstancePoolMapOutput() InstancePoolMapOutput
	ToInstancePoolMapOutputWithContext(context.Context) InstancePoolMapOutput
}

type InstancePoolMap map[string]InstancePoolInput

func (InstancePoolMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstancePool)(nil)).Elem()
}

func (i InstancePoolMap) ToInstancePoolMapOutput() InstancePoolMapOutput {
	return i.ToInstancePoolMapOutputWithContext(context.Background())
}

func (i InstancePoolMap) ToInstancePoolMapOutputWithContext(ctx context.Context) InstancePoolMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstancePoolMapOutput)
}

type InstancePoolOutput struct{ *pulumi.OutputState }

func (InstancePoolOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstancePool)(nil)).Elem()
}

func (o InstancePoolOutput) ToInstancePoolOutput() InstancePoolOutput {
	return o
}

func (o InstancePoolOutput) ToInstancePoolOutputWithContext(ctx context.Context) InstancePoolOutput {
	return o
}

func (o InstancePoolOutput) AwsAttributes() InstancePoolAwsAttributesPtrOutput {
	return o.ApplyT(func(v *InstancePool) InstancePoolAwsAttributesPtrOutput { return v.AwsAttributes }).(InstancePoolAwsAttributesPtrOutput)
}

func (o InstancePoolOutput) AzureAttributes() InstancePoolAzureAttributesPtrOutput {
	return o.ApplyT(func(v *InstancePool) InstancePoolAzureAttributesPtrOutput { return v.AzureAttributes }).(InstancePoolAzureAttributesPtrOutput)
}

// (Map) Additional tags for instance pool resources. Databricks tags all pool resources (e.g. AWS & Azure instances and Disk volumes). The tags of the instance pool will propagate to the clusters using the pool (see the [official documentation](https://docs.databricks.com/administration-guide/account-settings/usage-detail-tags-aws.html#tag-propagation)). Attempting to set the same tags in both cluster and instance pool will raise an error. *Databricks allows at most 43 custom tags.*
func (o InstancePoolOutput) CustomTags() pulumi.MapOutput {
	return o.ApplyT(func(v *InstancePool) pulumi.MapOutput { return v.CustomTags }).(pulumi.MapOutput)
}

func (o InstancePoolOutput) DiskSpec() InstancePoolDiskSpecPtrOutput {
	return o.ApplyT(func(v *InstancePool) InstancePoolDiskSpecPtrOutput { return v.DiskSpec }).(InstancePoolDiskSpecPtrOutput)
}

// (Bool) Autoscaling Local Storage: when enabled, the instances in the pool dynamically acquire additional disk space when they are running low on disk space.
func (o InstancePoolOutput) EnableElasticDisk() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *InstancePool) pulumi.BoolPtrOutput { return v.EnableElasticDisk }).(pulumi.BoolPtrOutput)
}

func (o InstancePoolOutput) GcpAttributes() InstancePoolGcpAttributesPtrOutput {
	return o.ApplyT(func(v *InstancePool) InstancePoolGcpAttributesPtrOutput { return v.GcpAttributes }).(InstancePoolGcpAttributesPtrOutput)
}

// (Integer) The number of minutes that idle instances in excess of the minIdleInstances are maintained by the pool before being terminated. If not specified, excess idle instances are terminated automatically after a default timeout period. If specified, the time must be between 0 and 10000 minutes. If you specify 0, excess idle instances are removed as soon as possible.
func (o InstancePoolOutput) IdleInstanceAutoterminationMinutes() pulumi.IntOutput {
	return o.ApplyT(func(v *InstancePool) pulumi.IntOutput { return v.IdleInstanceAutoterminationMinutes }).(pulumi.IntOutput)
}

func (o InstancePoolOutput) InstancePoolFleetAttributes() InstancePoolInstancePoolFleetAttributesPtrOutput {
	return o.ApplyT(func(v *InstancePool) InstancePoolInstancePoolFleetAttributesPtrOutput {
		return v.InstancePoolFleetAttributes
	}).(InstancePoolInstancePoolFleetAttributesPtrOutput)
}

func (o InstancePoolOutput) InstancePoolId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstancePool) pulumi.StringOutput { return v.InstancePoolId }).(pulumi.StringOutput)
}

// (String) The name of the instance pool. This is required for create and edit operations. It must be unique, non-empty, and less than 100 characters.
func (o InstancePoolOutput) InstancePoolName() pulumi.StringOutput {
	return o.ApplyT(func(v *InstancePool) pulumi.StringOutput { return v.InstancePoolName }).(pulumi.StringOutput)
}

// (Integer) The maximum number of instances the pool can contain, including both idle instances and ones in use by clusters. Once the maximum capacity is reached, you cannot create new clusters from the pool and existing clusters cannot autoscale up until some instances are made idle in the pool via cluster termination or down-scaling. There is no default limit, but as a [best practice](https://docs.databricks.com/clusters/instance-pools/pool-best-practices.html#configure-pools-to-control-cost), this should be set based on anticipated usage.
func (o InstancePoolOutput) MaxCapacity() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *InstancePool) pulumi.IntPtrOutput { return v.MaxCapacity }).(pulumi.IntPtrOutput)
}

// (Integer) The minimum number of idle instances maintained by the pool. This is in addition to any instances in use by active clusters.
func (o InstancePoolOutput) MinIdleInstances() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *InstancePool) pulumi.IntPtrOutput { return v.MinIdleInstances }).(pulumi.IntPtrOutput)
}

// (String) The node type for the instances in the pool. All clusters attached to the pool inherit this node type and the pool’s idle instances are allocated based on this type. You can retrieve a list of available node types by using the [List Node Types API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistnodetypes) call.
func (o InstancePoolOutput) NodeTypeId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InstancePool) pulumi.StringPtrOutput { return v.NodeTypeId }).(pulumi.StringPtrOutput)
}

func (o InstancePoolOutput) PreloadedDockerImages() InstancePoolPreloadedDockerImageArrayOutput {
	return o.ApplyT(func(v *InstancePool) InstancePoolPreloadedDockerImageArrayOutput { return v.PreloadedDockerImages }).(InstancePoolPreloadedDockerImageArrayOutput)
}

// (List) A list with at most one runtime version the pool installs on each instance. Pool clusters that use a preloaded runtime version start faster as they do not have to wait for the image to download. You can retrieve them via getSparkVersion data source or via  [Runtime Versions API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistsparkversions) call.
func (o InstancePoolOutput) PreloadedSparkVersions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *InstancePool) pulumi.StringArrayOutput { return v.PreloadedSparkVersions }).(pulumi.StringArrayOutput)
}

type InstancePoolArrayOutput struct{ *pulumi.OutputState }

func (InstancePoolArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstancePool)(nil)).Elem()
}

func (o InstancePoolArrayOutput) ToInstancePoolArrayOutput() InstancePoolArrayOutput {
	return o
}

func (o InstancePoolArrayOutput) ToInstancePoolArrayOutputWithContext(ctx context.Context) InstancePoolArrayOutput {
	return o
}

func (o InstancePoolArrayOutput) Index(i pulumi.IntInput) InstancePoolOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstancePool {
		return vs[0].([]*InstancePool)[vs[1].(int)]
	}).(InstancePoolOutput)
}

type InstancePoolMapOutput struct{ *pulumi.OutputState }

func (InstancePoolMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstancePool)(nil)).Elem()
}

func (o InstancePoolMapOutput) ToInstancePoolMapOutput() InstancePoolMapOutput {
	return o
}

func (o InstancePoolMapOutput) ToInstancePoolMapOutputWithContext(ctx context.Context) InstancePoolMapOutput {
	return o
}

func (o InstancePoolMapOutput) MapIndex(k pulumi.StringInput) InstancePoolOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstancePool {
		return vs[0].(map[string]*InstancePool)[vs[1].(string)]
	}).(InstancePoolOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstancePoolInput)(nil)).Elem(), &InstancePool{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstancePoolArrayInput)(nil)).Elem(), InstancePoolArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstancePoolMapInput)(nil)).Elem(), InstancePoolMap{})
	pulumi.RegisterOutputType(InstancePoolOutput{})
	pulumi.RegisterOutputType(InstancePoolArrayOutput{})
	pulumi.RegisterOutputType(InstancePoolMapOutput{})
}
