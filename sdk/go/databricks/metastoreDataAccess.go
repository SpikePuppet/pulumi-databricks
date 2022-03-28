// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Private Preview** This feature is in [Private Preview](https://docs.databricks.com/release-notes/release-types.html). Contact your Databricks representative to request access.
//
// Each Metastore requires an IAM role that will be assumed by Unity Catalog to access data. `MetastoreDataAccess` defines this
//
// ## Import
//
// -> **Note** Importing this resource is not currently supported.
type MetastoreDataAccess struct {
	pulumi.CustomResourceState

	AwsIamRole            MetastoreDataAccessAwsIamRolePtrOutput            `pulumi:"awsIamRole"`
	AzureServicePrincipal MetastoreDataAccessAzureServicePrincipalPtrOutput `pulumi:"azureServicePrincipal"`
	ConfigurationType     pulumi.StringOutput                               `pulumi:"configurationType"`
	Id                    pulumi.StringOutput                               `pulumi:"id"`
	IsDefault             pulumi.BoolPtrOutput                              `pulumi:"isDefault"`
	// Unique identifier of the parent Metastore
	MetastoreId pulumi.StringOutput `pulumi:"metastoreId"`
	// Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewMetastoreDataAccess registers a new resource with the given unique name, arguments, and options.
func NewMetastoreDataAccess(ctx *pulumi.Context,
	name string, args *MetastoreDataAccessArgs, opts ...pulumi.ResourceOption) (*MetastoreDataAccess, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.MetastoreId == nil {
		return nil, errors.New("invalid value for required argument 'MetastoreId'")
	}
	var resource MetastoreDataAccess
	err := ctx.RegisterResource("databricks:index/metastoreDataAccess:MetastoreDataAccess", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMetastoreDataAccess gets an existing MetastoreDataAccess resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMetastoreDataAccess(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MetastoreDataAccessState, opts ...pulumi.ResourceOption) (*MetastoreDataAccess, error) {
	var resource MetastoreDataAccess
	err := ctx.ReadResource("databricks:index/metastoreDataAccess:MetastoreDataAccess", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MetastoreDataAccess resources.
type metastoreDataAccessState struct {
	AwsIamRole            *MetastoreDataAccessAwsIamRole            `pulumi:"awsIamRole"`
	AzureServicePrincipal *MetastoreDataAccessAzureServicePrincipal `pulumi:"azureServicePrincipal"`
	ConfigurationType     *string                                   `pulumi:"configurationType"`
	Id                    *string                                   `pulumi:"id"`
	IsDefault             *bool                                     `pulumi:"isDefault"`
	// Unique identifier of the parent Metastore
	MetastoreId *string `pulumi:"metastoreId"`
	// Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
}

type MetastoreDataAccessState struct {
	AwsIamRole            MetastoreDataAccessAwsIamRolePtrInput
	AzureServicePrincipal MetastoreDataAccessAzureServicePrincipalPtrInput
	ConfigurationType     pulumi.StringPtrInput
	Id                    pulumi.StringPtrInput
	IsDefault             pulumi.BoolPtrInput
	// Unique identifier of the parent Metastore
	MetastoreId pulumi.StringPtrInput
	// Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
}

func (MetastoreDataAccessState) ElementType() reflect.Type {
	return reflect.TypeOf((*metastoreDataAccessState)(nil)).Elem()
}

type metastoreDataAccessArgs struct {
	AwsIamRole            *MetastoreDataAccessAwsIamRole            `pulumi:"awsIamRole"`
	AzureServicePrincipal *MetastoreDataAccessAzureServicePrincipal `pulumi:"azureServicePrincipal"`
	ConfigurationType     *string                                   `pulumi:"configurationType"`
	Id                    *string                                   `pulumi:"id"`
	IsDefault             *bool                                     `pulumi:"isDefault"`
	// Unique identifier of the parent Metastore
	MetastoreId string `pulumi:"metastoreId"`
	// Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a MetastoreDataAccess resource.
type MetastoreDataAccessArgs struct {
	AwsIamRole            MetastoreDataAccessAwsIamRolePtrInput
	AzureServicePrincipal MetastoreDataAccessAzureServicePrincipalPtrInput
	ConfigurationType     pulumi.StringPtrInput
	Id                    pulumi.StringPtrInput
	IsDefault             pulumi.BoolPtrInput
	// Unique identifier of the parent Metastore
	MetastoreId pulumi.StringInput
	// Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
}

func (MetastoreDataAccessArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*metastoreDataAccessArgs)(nil)).Elem()
}

type MetastoreDataAccessInput interface {
	pulumi.Input

	ToMetastoreDataAccessOutput() MetastoreDataAccessOutput
	ToMetastoreDataAccessOutputWithContext(ctx context.Context) MetastoreDataAccessOutput
}

func (*MetastoreDataAccess) ElementType() reflect.Type {
	return reflect.TypeOf((**MetastoreDataAccess)(nil)).Elem()
}

func (i *MetastoreDataAccess) ToMetastoreDataAccessOutput() MetastoreDataAccessOutput {
	return i.ToMetastoreDataAccessOutputWithContext(context.Background())
}

func (i *MetastoreDataAccess) ToMetastoreDataAccessOutputWithContext(ctx context.Context) MetastoreDataAccessOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetastoreDataAccessOutput)
}

// MetastoreDataAccessArrayInput is an input type that accepts MetastoreDataAccessArray and MetastoreDataAccessArrayOutput values.
// You can construct a concrete instance of `MetastoreDataAccessArrayInput` via:
//
//          MetastoreDataAccessArray{ MetastoreDataAccessArgs{...} }
type MetastoreDataAccessArrayInput interface {
	pulumi.Input

	ToMetastoreDataAccessArrayOutput() MetastoreDataAccessArrayOutput
	ToMetastoreDataAccessArrayOutputWithContext(context.Context) MetastoreDataAccessArrayOutput
}

type MetastoreDataAccessArray []MetastoreDataAccessInput

func (MetastoreDataAccessArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MetastoreDataAccess)(nil)).Elem()
}

func (i MetastoreDataAccessArray) ToMetastoreDataAccessArrayOutput() MetastoreDataAccessArrayOutput {
	return i.ToMetastoreDataAccessArrayOutputWithContext(context.Background())
}

func (i MetastoreDataAccessArray) ToMetastoreDataAccessArrayOutputWithContext(ctx context.Context) MetastoreDataAccessArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetastoreDataAccessArrayOutput)
}

// MetastoreDataAccessMapInput is an input type that accepts MetastoreDataAccessMap and MetastoreDataAccessMapOutput values.
// You can construct a concrete instance of `MetastoreDataAccessMapInput` via:
//
//          MetastoreDataAccessMap{ "key": MetastoreDataAccessArgs{...} }
type MetastoreDataAccessMapInput interface {
	pulumi.Input

	ToMetastoreDataAccessMapOutput() MetastoreDataAccessMapOutput
	ToMetastoreDataAccessMapOutputWithContext(context.Context) MetastoreDataAccessMapOutput
}

type MetastoreDataAccessMap map[string]MetastoreDataAccessInput

func (MetastoreDataAccessMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MetastoreDataAccess)(nil)).Elem()
}

func (i MetastoreDataAccessMap) ToMetastoreDataAccessMapOutput() MetastoreDataAccessMapOutput {
	return i.ToMetastoreDataAccessMapOutputWithContext(context.Background())
}

func (i MetastoreDataAccessMap) ToMetastoreDataAccessMapOutputWithContext(ctx context.Context) MetastoreDataAccessMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetastoreDataAccessMapOutput)
}

type MetastoreDataAccessOutput struct{ *pulumi.OutputState }

func (MetastoreDataAccessOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MetastoreDataAccess)(nil)).Elem()
}

func (o MetastoreDataAccessOutput) ToMetastoreDataAccessOutput() MetastoreDataAccessOutput {
	return o
}

func (o MetastoreDataAccessOutput) ToMetastoreDataAccessOutputWithContext(ctx context.Context) MetastoreDataAccessOutput {
	return o
}

type MetastoreDataAccessArrayOutput struct{ *pulumi.OutputState }

func (MetastoreDataAccessArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MetastoreDataAccess)(nil)).Elem()
}

func (o MetastoreDataAccessArrayOutput) ToMetastoreDataAccessArrayOutput() MetastoreDataAccessArrayOutput {
	return o
}

func (o MetastoreDataAccessArrayOutput) ToMetastoreDataAccessArrayOutputWithContext(ctx context.Context) MetastoreDataAccessArrayOutput {
	return o
}

func (o MetastoreDataAccessArrayOutput) Index(i pulumi.IntInput) MetastoreDataAccessOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MetastoreDataAccess {
		return vs[0].([]*MetastoreDataAccess)[vs[1].(int)]
	}).(MetastoreDataAccessOutput)
}

type MetastoreDataAccessMapOutput struct{ *pulumi.OutputState }

func (MetastoreDataAccessMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MetastoreDataAccess)(nil)).Elem()
}

func (o MetastoreDataAccessMapOutput) ToMetastoreDataAccessMapOutput() MetastoreDataAccessMapOutput {
	return o
}

func (o MetastoreDataAccessMapOutput) ToMetastoreDataAccessMapOutputWithContext(ctx context.Context) MetastoreDataAccessMapOutput {
	return o
}

func (o MetastoreDataAccessMapOutput) MapIndex(k pulumi.StringInput) MetastoreDataAccessOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MetastoreDataAccess {
		return vs[0].(map[string]*MetastoreDataAccess)[vs[1].(string)]
	}).(MetastoreDataAccessOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MetastoreDataAccessInput)(nil)).Elem(), &MetastoreDataAccess{})
	pulumi.RegisterInputType(reflect.TypeOf((*MetastoreDataAccessArrayInput)(nil)).Elem(), MetastoreDataAccessArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MetastoreDataAccessMapInput)(nil)).Elem(), MetastoreDataAccessMap{})
	pulumi.RegisterOutputType(MetastoreDataAccessOutput{})
	pulumi.RegisterOutputType(MetastoreDataAccessArrayOutput{})
	pulumi.RegisterOutputType(MetastoreDataAccessMapOutput{})
}
