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

// > **Note** This resource could be only used with workspace-level provider!
//
// In Delta Sharing, a provider is an entity that shares data with a recipient. Within a metastore, Unity Catalog provides the ability to create a provider which contains a list of shares that have been shared with you.
//
// A `MetastoreProvider` is contained within Metastore and can contain a list of shares that have been shared with you.
//
// Note that Databricks to Databricks sharing automatically creates the provider.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"shareCredentialsVersion": 1,
//				"bearerToken":             "token",
//				"endpoint":                "endpoint",
//				"expirationTime":          "expiration-time",
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = databricks.NewMetastoreProvider(ctx, "dbprovider", &databricks.MetastoreProviderArgs{
//				Name:                pulumi.String("terraform-test-provider"),
//				Comment:             pulumi.String("made by terraform 2"),
//				AuthenticationType:  pulumi.String("TOKEN"),
//				RecipientProfileStr: pulumi.String(json0),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Related Resources
//
// The following resources are used in the same context:
//
// * getTables data to list tables within Unity Catalog.
// * getSchemas data to list schemas within Unity Catalog.
// * getCatalogs data to list catalogs within Unity Catalog.
type MetastoreProvider struct {
	pulumi.CustomResourceState

	// The delta sharing authentication type. Valid values are `TOKEN`.
	AuthenticationType pulumi.StringOutput `pulumi:"authenticationType"`
	// Description about the provider.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Name of provider. Change forces creation of a new resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// This is the json file that is created from a recipient url.
	RecipientProfileStr pulumi.StringOutput `pulumi:"recipientProfileStr"`
}

// NewMetastoreProvider registers a new resource with the given unique name, arguments, and options.
func NewMetastoreProvider(ctx *pulumi.Context,
	name string, args *MetastoreProviderArgs, opts ...pulumi.ResourceOption) (*MetastoreProvider, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AuthenticationType == nil {
		return nil, errors.New("invalid value for required argument 'AuthenticationType'")
	}
	if args.RecipientProfileStr == nil {
		return nil, errors.New("invalid value for required argument 'RecipientProfileStr'")
	}
	if args.RecipientProfileStr != nil {
		args.RecipientProfileStr = pulumi.ToSecret(args.RecipientProfileStr).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"recipientProfileStr",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MetastoreProvider
	err := ctx.RegisterResource("databricks:index/metastoreProvider:MetastoreProvider", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMetastoreProvider gets an existing MetastoreProvider resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMetastoreProvider(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MetastoreProviderState, opts ...pulumi.ResourceOption) (*MetastoreProvider, error) {
	var resource MetastoreProvider
	err := ctx.ReadResource("databricks:index/metastoreProvider:MetastoreProvider", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MetastoreProvider resources.
type metastoreProviderState struct {
	// The delta sharing authentication type. Valid values are `TOKEN`.
	AuthenticationType *string `pulumi:"authenticationType"`
	// Description about the provider.
	Comment *string `pulumi:"comment"`
	// Name of provider. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// This is the json file that is created from a recipient url.
	RecipientProfileStr *string `pulumi:"recipientProfileStr"`
}

type MetastoreProviderState struct {
	// The delta sharing authentication type. Valid values are `TOKEN`.
	AuthenticationType pulumi.StringPtrInput
	// Description about the provider.
	Comment pulumi.StringPtrInput
	// Name of provider. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// This is the json file that is created from a recipient url.
	RecipientProfileStr pulumi.StringPtrInput
}

func (MetastoreProviderState) ElementType() reflect.Type {
	return reflect.TypeOf((*metastoreProviderState)(nil)).Elem()
}

type metastoreProviderArgs struct {
	// The delta sharing authentication type. Valid values are `TOKEN`.
	AuthenticationType string `pulumi:"authenticationType"`
	// Description about the provider.
	Comment *string `pulumi:"comment"`
	// Name of provider. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// This is the json file that is created from a recipient url.
	RecipientProfileStr string `pulumi:"recipientProfileStr"`
}

// The set of arguments for constructing a MetastoreProvider resource.
type MetastoreProviderArgs struct {
	// The delta sharing authentication type. Valid values are `TOKEN`.
	AuthenticationType pulumi.StringInput
	// Description about the provider.
	Comment pulumi.StringPtrInput
	// Name of provider. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// This is the json file that is created from a recipient url.
	RecipientProfileStr pulumi.StringInput
}

func (MetastoreProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*metastoreProviderArgs)(nil)).Elem()
}

type MetastoreProviderInput interface {
	pulumi.Input

	ToMetastoreProviderOutput() MetastoreProviderOutput
	ToMetastoreProviderOutputWithContext(ctx context.Context) MetastoreProviderOutput
}

func (*MetastoreProvider) ElementType() reflect.Type {
	return reflect.TypeOf((**MetastoreProvider)(nil)).Elem()
}

func (i *MetastoreProvider) ToMetastoreProviderOutput() MetastoreProviderOutput {
	return i.ToMetastoreProviderOutputWithContext(context.Background())
}

func (i *MetastoreProvider) ToMetastoreProviderOutputWithContext(ctx context.Context) MetastoreProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetastoreProviderOutput)
}

// MetastoreProviderArrayInput is an input type that accepts MetastoreProviderArray and MetastoreProviderArrayOutput values.
// You can construct a concrete instance of `MetastoreProviderArrayInput` via:
//
//	MetastoreProviderArray{ MetastoreProviderArgs{...} }
type MetastoreProviderArrayInput interface {
	pulumi.Input

	ToMetastoreProviderArrayOutput() MetastoreProviderArrayOutput
	ToMetastoreProviderArrayOutputWithContext(context.Context) MetastoreProviderArrayOutput
}

type MetastoreProviderArray []MetastoreProviderInput

func (MetastoreProviderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MetastoreProvider)(nil)).Elem()
}

func (i MetastoreProviderArray) ToMetastoreProviderArrayOutput() MetastoreProviderArrayOutput {
	return i.ToMetastoreProviderArrayOutputWithContext(context.Background())
}

func (i MetastoreProviderArray) ToMetastoreProviderArrayOutputWithContext(ctx context.Context) MetastoreProviderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetastoreProviderArrayOutput)
}

// MetastoreProviderMapInput is an input type that accepts MetastoreProviderMap and MetastoreProviderMapOutput values.
// You can construct a concrete instance of `MetastoreProviderMapInput` via:
//
//	MetastoreProviderMap{ "key": MetastoreProviderArgs{...} }
type MetastoreProviderMapInput interface {
	pulumi.Input

	ToMetastoreProviderMapOutput() MetastoreProviderMapOutput
	ToMetastoreProviderMapOutputWithContext(context.Context) MetastoreProviderMapOutput
}

type MetastoreProviderMap map[string]MetastoreProviderInput

func (MetastoreProviderMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MetastoreProvider)(nil)).Elem()
}

func (i MetastoreProviderMap) ToMetastoreProviderMapOutput() MetastoreProviderMapOutput {
	return i.ToMetastoreProviderMapOutputWithContext(context.Background())
}

func (i MetastoreProviderMap) ToMetastoreProviderMapOutputWithContext(ctx context.Context) MetastoreProviderMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetastoreProviderMapOutput)
}

type MetastoreProviderOutput struct{ *pulumi.OutputState }

func (MetastoreProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MetastoreProvider)(nil)).Elem()
}

func (o MetastoreProviderOutput) ToMetastoreProviderOutput() MetastoreProviderOutput {
	return o
}

func (o MetastoreProviderOutput) ToMetastoreProviderOutputWithContext(ctx context.Context) MetastoreProviderOutput {
	return o
}

// The delta sharing authentication type. Valid values are `TOKEN`.
func (o MetastoreProviderOutput) AuthenticationType() pulumi.StringOutput {
	return o.ApplyT(func(v *MetastoreProvider) pulumi.StringOutput { return v.AuthenticationType }).(pulumi.StringOutput)
}

// Description about the provider.
func (o MetastoreProviderOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MetastoreProvider) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Name of provider. Change forces creation of a new resource.
func (o MetastoreProviderOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MetastoreProvider) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// This is the json file that is created from a recipient url.
func (o MetastoreProviderOutput) RecipientProfileStr() pulumi.StringOutput {
	return o.ApplyT(func(v *MetastoreProvider) pulumi.StringOutput { return v.RecipientProfileStr }).(pulumi.StringOutput)
}

type MetastoreProviderArrayOutput struct{ *pulumi.OutputState }

func (MetastoreProviderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MetastoreProvider)(nil)).Elem()
}

func (o MetastoreProviderArrayOutput) ToMetastoreProviderArrayOutput() MetastoreProviderArrayOutput {
	return o
}

func (o MetastoreProviderArrayOutput) ToMetastoreProviderArrayOutputWithContext(ctx context.Context) MetastoreProviderArrayOutput {
	return o
}

func (o MetastoreProviderArrayOutput) Index(i pulumi.IntInput) MetastoreProviderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MetastoreProvider {
		return vs[0].([]*MetastoreProvider)[vs[1].(int)]
	}).(MetastoreProviderOutput)
}

type MetastoreProviderMapOutput struct{ *pulumi.OutputState }

func (MetastoreProviderMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MetastoreProvider)(nil)).Elem()
}

func (o MetastoreProviderMapOutput) ToMetastoreProviderMapOutput() MetastoreProviderMapOutput {
	return o
}

func (o MetastoreProviderMapOutput) ToMetastoreProviderMapOutputWithContext(ctx context.Context) MetastoreProviderMapOutput {
	return o
}

func (o MetastoreProviderMapOutput) MapIndex(k pulumi.StringInput) MetastoreProviderOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MetastoreProvider {
		return vs[0].(map[string]*MetastoreProvider)[vs[1].(string)]
	}).(MetastoreProviderOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MetastoreProviderInput)(nil)).Elem(), &MetastoreProvider{})
	pulumi.RegisterInputType(reflect.TypeOf((*MetastoreProviderArrayInput)(nil)).Elem(), MetastoreProviderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MetastoreProviderMapInput)(nil)).Elem(), MetastoreProviderMap{})
	pulumi.RegisterOutputType(MetastoreProviderOutput{})
	pulumi.RegisterOutputType(MetastoreProviderArrayOutput{})
	pulumi.RegisterOutputType(MetastoreProviderMapOutput{})
}
