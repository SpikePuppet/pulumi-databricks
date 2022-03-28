// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type AzureBlobMount struct {
	pulumi.CustomResourceState

	AuthType           pulumi.StringOutput    `pulumi:"authType"`
	ClusterId          pulumi.StringPtrOutput `pulumi:"clusterId"`
	ContainerName      pulumi.StringOutput    `pulumi:"containerName"`
	Directory          pulumi.StringPtrOutput `pulumi:"directory"`
	MountName          pulumi.StringOutput    `pulumi:"mountName"`
	Source             pulumi.StringOutput    `pulumi:"source"`
	StorageAccountName pulumi.StringOutput    `pulumi:"storageAccountName"`
	TokenSecretKey     pulumi.StringOutput    `pulumi:"tokenSecretKey"`
	TokenSecretScope   pulumi.StringOutput    `pulumi:"tokenSecretScope"`
}

// NewAzureBlobMount registers a new resource with the given unique name, arguments, and options.
func NewAzureBlobMount(ctx *pulumi.Context,
	name string, args *AzureBlobMountArgs, opts ...pulumi.ResourceOption) (*AzureBlobMount, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AuthType == nil {
		return nil, errors.New("invalid value for required argument 'AuthType'")
	}
	if args.ContainerName == nil {
		return nil, errors.New("invalid value for required argument 'ContainerName'")
	}
	if args.MountName == nil {
		return nil, errors.New("invalid value for required argument 'MountName'")
	}
	if args.StorageAccountName == nil {
		return nil, errors.New("invalid value for required argument 'StorageAccountName'")
	}
	if args.TokenSecretKey == nil {
		return nil, errors.New("invalid value for required argument 'TokenSecretKey'")
	}
	if args.TokenSecretScope == nil {
		return nil, errors.New("invalid value for required argument 'TokenSecretScope'")
	}
	var resource AzureBlobMount
	err := ctx.RegisterResource("databricks:index/azureBlobMount:AzureBlobMount", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAzureBlobMount gets an existing AzureBlobMount resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAzureBlobMount(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AzureBlobMountState, opts ...pulumi.ResourceOption) (*AzureBlobMount, error) {
	var resource AzureBlobMount
	err := ctx.ReadResource("databricks:index/azureBlobMount:AzureBlobMount", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AzureBlobMount resources.
type azureBlobMountState struct {
	AuthType           *string `pulumi:"authType"`
	ClusterId          *string `pulumi:"clusterId"`
	ContainerName      *string `pulumi:"containerName"`
	Directory          *string `pulumi:"directory"`
	MountName          *string `pulumi:"mountName"`
	Source             *string `pulumi:"source"`
	StorageAccountName *string `pulumi:"storageAccountName"`
	TokenSecretKey     *string `pulumi:"tokenSecretKey"`
	TokenSecretScope   *string `pulumi:"tokenSecretScope"`
}

type AzureBlobMountState struct {
	AuthType           pulumi.StringPtrInput
	ClusterId          pulumi.StringPtrInput
	ContainerName      pulumi.StringPtrInput
	Directory          pulumi.StringPtrInput
	MountName          pulumi.StringPtrInput
	Source             pulumi.StringPtrInput
	StorageAccountName pulumi.StringPtrInput
	TokenSecretKey     pulumi.StringPtrInput
	TokenSecretScope   pulumi.StringPtrInput
}

func (AzureBlobMountState) ElementType() reflect.Type {
	return reflect.TypeOf((*azureBlobMountState)(nil)).Elem()
}

type azureBlobMountArgs struct {
	AuthType           string  `pulumi:"authType"`
	ClusterId          *string `pulumi:"clusterId"`
	ContainerName      string  `pulumi:"containerName"`
	Directory          *string `pulumi:"directory"`
	MountName          string  `pulumi:"mountName"`
	StorageAccountName string  `pulumi:"storageAccountName"`
	TokenSecretKey     string  `pulumi:"tokenSecretKey"`
	TokenSecretScope   string  `pulumi:"tokenSecretScope"`
}

// The set of arguments for constructing a AzureBlobMount resource.
type AzureBlobMountArgs struct {
	AuthType           pulumi.StringInput
	ClusterId          pulumi.StringPtrInput
	ContainerName      pulumi.StringInput
	Directory          pulumi.StringPtrInput
	MountName          pulumi.StringInput
	StorageAccountName pulumi.StringInput
	TokenSecretKey     pulumi.StringInput
	TokenSecretScope   pulumi.StringInput
}

func (AzureBlobMountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*azureBlobMountArgs)(nil)).Elem()
}

type AzureBlobMountInput interface {
	pulumi.Input

	ToAzureBlobMountOutput() AzureBlobMountOutput
	ToAzureBlobMountOutputWithContext(ctx context.Context) AzureBlobMountOutput
}

func (*AzureBlobMount) ElementType() reflect.Type {
	return reflect.TypeOf((**AzureBlobMount)(nil)).Elem()
}

func (i *AzureBlobMount) ToAzureBlobMountOutput() AzureBlobMountOutput {
	return i.ToAzureBlobMountOutputWithContext(context.Background())
}

func (i *AzureBlobMount) ToAzureBlobMountOutputWithContext(ctx context.Context) AzureBlobMountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureBlobMountOutput)
}

// AzureBlobMountArrayInput is an input type that accepts AzureBlobMountArray and AzureBlobMountArrayOutput values.
// You can construct a concrete instance of `AzureBlobMountArrayInput` via:
//
//          AzureBlobMountArray{ AzureBlobMountArgs{...} }
type AzureBlobMountArrayInput interface {
	pulumi.Input

	ToAzureBlobMountArrayOutput() AzureBlobMountArrayOutput
	ToAzureBlobMountArrayOutputWithContext(context.Context) AzureBlobMountArrayOutput
}

type AzureBlobMountArray []AzureBlobMountInput

func (AzureBlobMountArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AzureBlobMount)(nil)).Elem()
}

func (i AzureBlobMountArray) ToAzureBlobMountArrayOutput() AzureBlobMountArrayOutput {
	return i.ToAzureBlobMountArrayOutputWithContext(context.Background())
}

func (i AzureBlobMountArray) ToAzureBlobMountArrayOutputWithContext(ctx context.Context) AzureBlobMountArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureBlobMountArrayOutput)
}

// AzureBlobMountMapInput is an input type that accepts AzureBlobMountMap and AzureBlobMountMapOutput values.
// You can construct a concrete instance of `AzureBlobMountMapInput` via:
//
//          AzureBlobMountMap{ "key": AzureBlobMountArgs{...} }
type AzureBlobMountMapInput interface {
	pulumi.Input

	ToAzureBlobMountMapOutput() AzureBlobMountMapOutput
	ToAzureBlobMountMapOutputWithContext(context.Context) AzureBlobMountMapOutput
}

type AzureBlobMountMap map[string]AzureBlobMountInput

func (AzureBlobMountMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AzureBlobMount)(nil)).Elem()
}

func (i AzureBlobMountMap) ToAzureBlobMountMapOutput() AzureBlobMountMapOutput {
	return i.ToAzureBlobMountMapOutputWithContext(context.Background())
}

func (i AzureBlobMountMap) ToAzureBlobMountMapOutputWithContext(ctx context.Context) AzureBlobMountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureBlobMountMapOutput)
}

type AzureBlobMountOutput struct{ *pulumi.OutputState }

func (AzureBlobMountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AzureBlobMount)(nil)).Elem()
}

func (o AzureBlobMountOutput) ToAzureBlobMountOutput() AzureBlobMountOutput {
	return o
}

func (o AzureBlobMountOutput) ToAzureBlobMountOutputWithContext(ctx context.Context) AzureBlobMountOutput {
	return o
}

type AzureBlobMountArrayOutput struct{ *pulumi.OutputState }

func (AzureBlobMountArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AzureBlobMount)(nil)).Elem()
}

func (o AzureBlobMountArrayOutput) ToAzureBlobMountArrayOutput() AzureBlobMountArrayOutput {
	return o
}

func (o AzureBlobMountArrayOutput) ToAzureBlobMountArrayOutputWithContext(ctx context.Context) AzureBlobMountArrayOutput {
	return o
}

func (o AzureBlobMountArrayOutput) Index(i pulumi.IntInput) AzureBlobMountOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AzureBlobMount {
		return vs[0].([]*AzureBlobMount)[vs[1].(int)]
	}).(AzureBlobMountOutput)
}

type AzureBlobMountMapOutput struct{ *pulumi.OutputState }

func (AzureBlobMountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AzureBlobMount)(nil)).Elem()
}

func (o AzureBlobMountMapOutput) ToAzureBlobMountMapOutput() AzureBlobMountMapOutput {
	return o
}

func (o AzureBlobMountMapOutput) ToAzureBlobMountMapOutputWithContext(ctx context.Context) AzureBlobMountMapOutput {
	return o
}

func (o AzureBlobMountMapOutput) MapIndex(k pulumi.StringInput) AzureBlobMountOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AzureBlobMount {
		return vs[0].(map[string]*AzureBlobMount)[vs[1].(string)]
	}).(AzureBlobMountOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AzureBlobMountInput)(nil)).Elem(), &AzureBlobMount{})
	pulumi.RegisterInputType(reflect.TypeOf((*AzureBlobMountArrayInput)(nil)).Elem(), AzureBlobMountArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AzureBlobMountMapInput)(nil)).Elem(), AzureBlobMountMap{})
	pulumi.RegisterOutputType(AzureBlobMountOutput{})
	pulumi.RegisterOutputType(AzureBlobMountArrayOutput{})
	pulumi.RegisterOutputType(AzureBlobMountMapOutput{})
}
