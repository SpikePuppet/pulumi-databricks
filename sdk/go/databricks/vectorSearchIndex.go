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

// > **Note** This resource could be only used on Unity Catalog-enabled workspace!
//
// This resource allows you to create [Vector Search Index](https://docs.databricks.com/en/generative-ai/create-query-vector-search.html) in Databricks.  Vector Search is a serverless similarity search engine that allows you to store a vector representation of your data, including metadata, in a vector database.  The Vector Search Index provides the ability to search data in the linked Delta Table.
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
//			_, err := databricks.NewVectorSearchIndex(ctx, "sync", &databricks.VectorSearchIndexArgs{
//				EndpointName: pulumi.Any(databricks_vector_search_endpoint.This.Name),
//				PrimaryKey:   pulumi.String("id"),
//				IndexType:    pulumi.String("DELTA_SYNC"),
//				DeltaSyncIndexSpec: &databricks.VectorSearchIndexDeltaSyncIndexSpecArgs{
//					SourceTable:  pulumi.String("main.default.source_table"),
//					PipelineType: pulumi.String("TRIGGERED"),
//					EmbeddingSourceColumns: databricks.VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArray{
//						&databricks.VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs{
//							Name:                       pulumi.String("text"),
//							EmbeddingModelEndpointName: pulumi.Any(databricks_model_serving.This.Name),
//						},
//					},
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
// ## Import
//
// # The resource can be imported using the name of the Vector Search Index
//
// bash
//
// ```sh
// $ pulumi import databricks:index/vectorSearchIndex:VectorSearchIndex this <index-name>
// ```
type VectorSearchIndex struct {
	pulumi.CustomResourceState

	// Creator of the endpoint.
	Creator pulumi.StringOutput `pulumi:"creator"`
	// Specification for Delta Sync Index. Required if `indexType` is `DELTA_SYNC`.
	DeltaSyncIndexSpec VectorSearchIndexDeltaSyncIndexSpecPtrOutput `pulumi:"deltaSyncIndexSpec"`
	// Specification for Direct Vector Access Index. Required if `indexType` is `DIRECT_ACCESS`.
	DirectAccessIndexSpec VectorSearchIndexDirectAccessIndexSpecPtrOutput `pulumi:"directAccessIndexSpec"`
	// The name of the Vector Search Endpoint that will be used for indexing the data.
	EndpointName pulumi.StringOutput `pulumi:"endpointName"`
	// Vector Search index type. Currently supported values are:
	IndexType pulumi.StringOutput `pulumi:"indexType"`
	// The name of the column.
	Name pulumi.StringOutput `pulumi:"name"`
	// The column name that will be used as a primary key.
	PrimaryKey pulumi.StringOutput `pulumi:"primaryKey"`
	// Object describing the current status of the index consisting of the following fields:
	Statuses VectorSearchIndexStatusArrayOutput `pulumi:"statuses"`
}

// NewVectorSearchIndex registers a new resource with the given unique name, arguments, and options.
func NewVectorSearchIndex(ctx *pulumi.Context,
	name string, args *VectorSearchIndexArgs, opts ...pulumi.ResourceOption) (*VectorSearchIndex, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EndpointName == nil {
		return nil, errors.New("invalid value for required argument 'EndpointName'")
	}
	if args.IndexType == nil {
		return nil, errors.New("invalid value for required argument 'IndexType'")
	}
	if args.PrimaryKey == nil {
		return nil, errors.New("invalid value for required argument 'PrimaryKey'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VectorSearchIndex
	err := ctx.RegisterResource("databricks:index/vectorSearchIndex:VectorSearchIndex", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVectorSearchIndex gets an existing VectorSearchIndex resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVectorSearchIndex(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VectorSearchIndexState, opts ...pulumi.ResourceOption) (*VectorSearchIndex, error) {
	var resource VectorSearchIndex
	err := ctx.ReadResource("databricks:index/vectorSearchIndex:VectorSearchIndex", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VectorSearchIndex resources.
type vectorSearchIndexState struct {
	// Creator of the endpoint.
	Creator *string `pulumi:"creator"`
	// Specification for Delta Sync Index. Required if `indexType` is `DELTA_SYNC`.
	DeltaSyncIndexSpec *VectorSearchIndexDeltaSyncIndexSpec `pulumi:"deltaSyncIndexSpec"`
	// Specification for Direct Vector Access Index. Required if `indexType` is `DIRECT_ACCESS`.
	DirectAccessIndexSpec *VectorSearchIndexDirectAccessIndexSpec `pulumi:"directAccessIndexSpec"`
	// The name of the Vector Search Endpoint that will be used for indexing the data.
	EndpointName *string `pulumi:"endpointName"`
	// Vector Search index type. Currently supported values are:
	IndexType *string `pulumi:"indexType"`
	// The name of the column.
	Name *string `pulumi:"name"`
	// The column name that will be used as a primary key.
	PrimaryKey *string `pulumi:"primaryKey"`
	// Object describing the current status of the index consisting of the following fields:
	Statuses []VectorSearchIndexStatus `pulumi:"statuses"`
}

type VectorSearchIndexState struct {
	// Creator of the endpoint.
	Creator pulumi.StringPtrInput
	// Specification for Delta Sync Index. Required if `indexType` is `DELTA_SYNC`.
	DeltaSyncIndexSpec VectorSearchIndexDeltaSyncIndexSpecPtrInput
	// Specification for Direct Vector Access Index. Required if `indexType` is `DIRECT_ACCESS`.
	DirectAccessIndexSpec VectorSearchIndexDirectAccessIndexSpecPtrInput
	// The name of the Vector Search Endpoint that will be used for indexing the data.
	EndpointName pulumi.StringPtrInput
	// Vector Search index type. Currently supported values are:
	IndexType pulumi.StringPtrInput
	// The name of the column.
	Name pulumi.StringPtrInput
	// The column name that will be used as a primary key.
	PrimaryKey pulumi.StringPtrInput
	// Object describing the current status of the index consisting of the following fields:
	Statuses VectorSearchIndexStatusArrayInput
}

func (VectorSearchIndexState) ElementType() reflect.Type {
	return reflect.TypeOf((*vectorSearchIndexState)(nil)).Elem()
}

type vectorSearchIndexArgs struct {
	// Specification for Delta Sync Index. Required if `indexType` is `DELTA_SYNC`.
	DeltaSyncIndexSpec *VectorSearchIndexDeltaSyncIndexSpec `pulumi:"deltaSyncIndexSpec"`
	// Specification for Direct Vector Access Index. Required if `indexType` is `DIRECT_ACCESS`.
	DirectAccessIndexSpec *VectorSearchIndexDirectAccessIndexSpec `pulumi:"directAccessIndexSpec"`
	// The name of the Vector Search Endpoint that will be used for indexing the data.
	EndpointName string `pulumi:"endpointName"`
	// Vector Search index type. Currently supported values are:
	IndexType string `pulumi:"indexType"`
	// The name of the column.
	Name *string `pulumi:"name"`
	// The column name that will be used as a primary key.
	PrimaryKey string `pulumi:"primaryKey"`
}

// The set of arguments for constructing a VectorSearchIndex resource.
type VectorSearchIndexArgs struct {
	// Specification for Delta Sync Index. Required if `indexType` is `DELTA_SYNC`.
	DeltaSyncIndexSpec VectorSearchIndexDeltaSyncIndexSpecPtrInput
	// Specification for Direct Vector Access Index. Required if `indexType` is `DIRECT_ACCESS`.
	DirectAccessIndexSpec VectorSearchIndexDirectAccessIndexSpecPtrInput
	// The name of the Vector Search Endpoint that will be used for indexing the data.
	EndpointName pulumi.StringInput
	// Vector Search index type. Currently supported values are:
	IndexType pulumi.StringInput
	// The name of the column.
	Name pulumi.StringPtrInput
	// The column name that will be used as a primary key.
	PrimaryKey pulumi.StringInput
}

func (VectorSearchIndexArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vectorSearchIndexArgs)(nil)).Elem()
}

type VectorSearchIndexInput interface {
	pulumi.Input

	ToVectorSearchIndexOutput() VectorSearchIndexOutput
	ToVectorSearchIndexOutputWithContext(ctx context.Context) VectorSearchIndexOutput
}

func (*VectorSearchIndex) ElementType() reflect.Type {
	return reflect.TypeOf((**VectorSearchIndex)(nil)).Elem()
}

func (i *VectorSearchIndex) ToVectorSearchIndexOutput() VectorSearchIndexOutput {
	return i.ToVectorSearchIndexOutputWithContext(context.Background())
}

func (i *VectorSearchIndex) ToVectorSearchIndexOutputWithContext(ctx context.Context) VectorSearchIndexOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VectorSearchIndexOutput)
}

// VectorSearchIndexArrayInput is an input type that accepts VectorSearchIndexArray and VectorSearchIndexArrayOutput values.
// You can construct a concrete instance of `VectorSearchIndexArrayInput` via:
//
//	VectorSearchIndexArray{ VectorSearchIndexArgs{...} }
type VectorSearchIndexArrayInput interface {
	pulumi.Input

	ToVectorSearchIndexArrayOutput() VectorSearchIndexArrayOutput
	ToVectorSearchIndexArrayOutputWithContext(context.Context) VectorSearchIndexArrayOutput
}

type VectorSearchIndexArray []VectorSearchIndexInput

func (VectorSearchIndexArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VectorSearchIndex)(nil)).Elem()
}

func (i VectorSearchIndexArray) ToVectorSearchIndexArrayOutput() VectorSearchIndexArrayOutput {
	return i.ToVectorSearchIndexArrayOutputWithContext(context.Background())
}

func (i VectorSearchIndexArray) ToVectorSearchIndexArrayOutputWithContext(ctx context.Context) VectorSearchIndexArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VectorSearchIndexArrayOutput)
}

// VectorSearchIndexMapInput is an input type that accepts VectorSearchIndexMap and VectorSearchIndexMapOutput values.
// You can construct a concrete instance of `VectorSearchIndexMapInput` via:
//
//	VectorSearchIndexMap{ "key": VectorSearchIndexArgs{...} }
type VectorSearchIndexMapInput interface {
	pulumi.Input

	ToVectorSearchIndexMapOutput() VectorSearchIndexMapOutput
	ToVectorSearchIndexMapOutputWithContext(context.Context) VectorSearchIndexMapOutput
}

type VectorSearchIndexMap map[string]VectorSearchIndexInput

func (VectorSearchIndexMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VectorSearchIndex)(nil)).Elem()
}

func (i VectorSearchIndexMap) ToVectorSearchIndexMapOutput() VectorSearchIndexMapOutput {
	return i.ToVectorSearchIndexMapOutputWithContext(context.Background())
}

func (i VectorSearchIndexMap) ToVectorSearchIndexMapOutputWithContext(ctx context.Context) VectorSearchIndexMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VectorSearchIndexMapOutput)
}

type VectorSearchIndexOutput struct{ *pulumi.OutputState }

func (VectorSearchIndexOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VectorSearchIndex)(nil)).Elem()
}

func (o VectorSearchIndexOutput) ToVectorSearchIndexOutput() VectorSearchIndexOutput {
	return o
}

func (o VectorSearchIndexOutput) ToVectorSearchIndexOutputWithContext(ctx context.Context) VectorSearchIndexOutput {
	return o
}

// Creator of the endpoint.
func (o VectorSearchIndexOutput) Creator() pulumi.StringOutput {
	return o.ApplyT(func(v *VectorSearchIndex) pulumi.StringOutput { return v.Creator }).(pulumi.StringOutput)
}

// Specification for Delta Sync Index. Required if `indexType` is `DELTA_SYNC`.
func (o VectorSearchIndexOutput) DeltaSyncIndexSpec() VectorSearchIndexDeltaSyncIndexSpecPtrOutput {
	return o.ApplyT(func(v *VectorSearchIndex) VectorSearchIndexDeltaSyncIndexSpecPtrOutput { return v.DeltaSyncIndexSpec }).(VectorSearchIndexDeltaSyncIndexSpecPtrOutput)
}

// Specification for Direct Vector Access Index. Required if `indexType` is `DIRECT_ACCESS`.
func (o VectorSearchIndexOutput) DirectAccessIndexSpec() VectorSearchIndexDirectAccessIndexSpecPtrOutput {
	return o.ApplyT(func(v *VectorSearchIndex) VectorSearchIndexDirectAccessIndexSpecPtrOutput {
		return v.DirectAccessIndexSpec
	}).(VectorSearchIndexDirectAccessIndexSpecPtrOutput)
}

// The name of the Vector Search Endpoint that will be used for indexing the data.
func (o VectorSearchIndexOutput) EndpointName() pulumi.StringOutput {
	return o.ApplyT(func(v *VectorSearchIndex) pulumi.StringOutput { return v.EndpointName }).(pulumi.StringOutput)
}

// Vector Search index type. Currently supported values are:
func (o VectorSearchIndexOutput) IndexType() pulumi.StringOutput {
	return o.ApplyT(func(v *VectorSearchIndex) pulumi.StringOutput { return v.IndexType }).(pulumi.StringOutput)
}

// The name of the column.
func (o VectorSearchIndexOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VectorSearchIndex) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The column name that will be used as a primary key.
func (o VectorSearchIndexOutput) PrimaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v *VectorSearchIndex) pulumi.StringOutput { return v.PrimaryKey }).(pulumi.StringOutput)
}

// Object describing the current status of the index consisting of the following fields:
func (o VectorSearchIndexOutput) Statuses() VectorSearchIndexStatusArrayOutput {
	return o.ApplyT(func(v *VectorSearchIndex) VectorSearchIndexStatusArrayOutput { return v.Statuses }).(VectorSearchIndexStatusArrayOutput)
}

type VectorSearchIndexArrayOutput struct{ *pulumi.OutputState }

func (VectorSearchIndexArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VectorSearchIndex)(nil)).Elem()
}

func (o VectorSearchIndexArrayOutput) ToVectorSearchIndexArrayOutput() VectorSearchIndexArrayOutput {
	return o
}

func (o VectorSearchIndexArrayOutput) ToVectorSearchIndexArrayOutputWithContext(ctx context.Context) VectorSearchIndexArrayOutput {
	return o
}

func (o VectorSearchIndexArrayOutput) Index(i pulumi.IntInput) VectorSearchIndexOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VectorSearchIndex {
		return vs[0].([]*VectorSearchIndex)[vs[1].(int)]
	}).(VectorSearchIndexOutput)
}

type VectorSearchIndexMapOutput struct{ *pulumi.OutputState }

func (VectorSearchIndexMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VectorSearchIndex)(nil)).Elem()
}

func (o VectorSearchIndexMapOutput) ToVectorSearchIndexMapOutput() VectorSearchIndexMapOutput {
	return o
}

func (o VectorSearchIndexMapOutput) ToVectorSearchIndexMapOutputWithContext(ctx context.Context) VectorSearchIndexMapOutput {
	return o
}

func (o VectorSearchIndexMapOutput) MapIndex(k pulumi.StringInput) VectorSearchIndexOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VectorSearchIndex {
		return vs[0].(map[string]*VectorSearchIndex)[vs[1].(string)]
	}).(VectorSearchIndexOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VectorSearchIndexInput)(nil)).Elem(), &VectorSearchIndex{})
	pulumi.RegisterInputType(reflect.TypeOf((*VectorSearchIndexArrayInput)(nil)).Elem(), VectorSearchIndexArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VectorSearchIndexMapInput)(nil)).Elem(), VectorSearchIndexMap{})
	pulumi.RegisterOutputType(VectorSearchIndexOutput{})
	pulumi.RegisterOutputType(VectorSearchIndexArrayOutput{})
	pulumi.RegisterOutputType(VectorSearchIndexMapOutput{})
}
