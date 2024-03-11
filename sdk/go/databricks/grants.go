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

// ## Import
//
// The resource can be imported using combination of securable type (`table`, `catalog`, `foreign_connection`, ...) and it's name:
//
// bash
//
// ```sh
// $ pulumi import databricks:index/grants:Grants this catalog/abc
// ```
type Grants struct {
	pulumi.CustomResourceState

	Catalog           pulumi.StringPtrOutput `pulumi:"catalog"`
	ExternalLocation  pulumi.StringPtrOutput `pulumi:"externalLocation"`
	ForeignConnection pulumi.StringPtrOutput `pulumi:"foreignConnection"`
	Function          pulumi.StringPtrOutput `pulumi:"function"`
	Grants            GrantsGrantArrayOutput `pulumi:"grants"`
	Metastore         pulumi.StringPtrOutput `pulumi:"metastore"`
	Model             pulumi.StringPtrOutput `pulumi:"model"`
	Pipeline          pulumi.StringPtrOutput `pulumi:"pipeline"`
	Recipient         pulumi.StringPtrOutput `pulumi:"recipient"`
	Schema            pulumi.StringPtrOutput `pulumi:"schema"`
	Share             pulumi.StringPtrOutput `pulumi:"share"`
	StorageCredential pulumi.StringPtrOutput `pulumi:"storageCredential"`
	Table             pulumi.StringPtrOutput `pulumi:"table"`
	Volume            pulumi.StringPtrOutput `pulumi:"volume"`
}

// NewGrants registers a new resource with the given unique name, arguments, and options.
func NewGrants(ctx *pulumi.Context,
	name string, args *GrantsArgs, opts ...pulumi.ResourceOption) (*Grants, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Grants == nil {
		return nil, errors.New("invalid value for required argument 'Grants'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Grants
	err := ctx.RegisterResource("databricks:index/grants:Grants", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGrants gets an existing Grants resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGrants(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GrantsState, opts ...pulumi.ResourceOption) (*Grants, error) {
	var resource Grants
	err := ctx.ReadResource("databricks:index/grants:Grants", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Grants resources.
type grantsState struct {
	Catalog           *string       `pulumi:"catalog"`
	ExternalLocation  *string       `pulumi:"externalLocation"`
	ForeignConnection *string       `pulumi:"foreignConnection"`
	Function          *string       `pulumi:"function"`
	Grants            []GrantsGrant `pulumi:"grants"`
	Metastore         *string       `pulumi:"metastore"`
	Model             *string       `pulumi:"model"`
	Pipeline          *string       `pulumi:"pipeline"`
	Recipient         *string       `pulumi:"recipient"`
	Schema            *string       `pulumi:"schema"`
	Share             *string       `pulumi:"share"`
	StorageCredential *string       `pulumi:"storageCredential"`
	Table             *string       `pulumi:"table"`
	Volume            *string       `pulumi:"volume"`
}

type GrantsState struct {
	Catalog           pulumi.StringPtrInput
	ExternalLocation  pulumi.StringPtrInput
	ForeignConnection pulumi.StringPtrInput
	Function          pulumi.StringPtrInput
	Grants            GrantsGrantArrayInput
	Metastore         pulumi.StringPtrInput
	Model             pulumi.StringPtrInput
	Pipeline          pulumi.StringPtrInput
	Recipient         pulumi.StringPtrInput
	Schema            pulumi.StringPtrInput
	Share             pulumi.StringPtrInput
	StorageCredential pulumi.StringPtrInput
	Table             pulumi.StringPtrInput
	Volume            pulumi.StringPtrInput
}

func (GrantsState) ElementType() reflect.Type {
	return reflect.TypeOf((*grantsState)(nil)).Elem()
}

type grantsArgs struct {
	Catalog           *string       `pulumi:"catalog"`
	ExternalLocation  *string       `pulumi:"externalLocation"`
	ForeignConnection *string       `pulumi:"foreignConnection"`
	Function          *string       `pulumi:"function"`
	Grants            []GrantsGrant `pulumi:"grants"`
	Metastore         *string       `pulumi:"metastore"`
	Model             *string       `pulumi:"model"`
	Pipeline          *string       `pulumi:"pipeline"`
	Recipient         *string       `pulumi:"recipient"`
	Schema            *string       `pulumi:"schema"`
	Share             *string       `pulumi:"share"`
	StorageCredential *string       `pulumi:"storageCredential"`
	Table             *string       `pulumi:"table"`
	Volume            *string       `pulumi:"volume"`
}

// The set of arguments for constructing a Grants resource.
type GrantsArgs struct {
	Catalog           pulumi.StringPtrInput
	ExternalLocation  pulumi.StringPtrInput
	ForeignConnection pulumi.StringPtrInput
	Function          pulumi.StringPtrInput
	Grants            GrantsGrantArrayInput
	Metastore         pulumi.StringPtrInput
	Model             pulumi.StringPtrInput
	Pipeline          pulumi.StringPtrInput
	Recipient         pulumi.StringPtrInput
	Schema            pulumi.StringPtrInput
	Share             pulumi.StringPtrInput
	StorageCredential pulumi.StringPtrInput
	Table             pulumi.StringPtrInput
	Volume            pulumi.StringPtrInput
}

func (GrantsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*grantsArgs)(nil)).Elem()
}

type GrantsInput interface {
	pulumi.Input

	ToGrantsOutput() GrantsOutput
	ToGrantsOutputWithContext(ctx context.Context) GrantsOutput
}

func (*Grants) ElementType() reflect.Type {
	return reflect.TypeOf((**Grants)(nil)).Elem()
}

func (i *Grants) ToGrantsOutput() GrantsOutput {
	return i.ToGrantsOutputWithContext(context.Background())
}

func (i *Grants) ToGrantsOutputWithContext(ctx context.Context) GrantsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantsOutput)
}

// GrantsArrayInput is an input type that accepts GrantsArray and GrantsArrayOutput values.
// You can construct a concrete instance of `GrantsArrayInput` via:
//
//	GrantsArray{ GrantsArgs{...} }
type GrantsArrayInput interface {
	pulumi.Input

	ToGrantsArrayOutput() GrantsArrayOutput
	ToGrantsArrayOutputWithContext(context.Context) GrantsArrayOutput
}

type GrantsArray []GrantsInput

func (GrantsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Grants)(nil)).Elem()
}

func (i GrantsArray) ToGrantsArrayOutput() GrantsArrayOutput {
	return i.ToGrantsArrayOutputWithContext(context.Background())
}

func (i GrantsArray) ToGrantsArrayOutputWithContext(ctx context.Context) GrantsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantsArrayOutput)
}

// GrantsMapInput is an input type that accepts GrantsMap and GrantsMapOutput values.
// You can construct a concrete instance of `GrantsMapInput` via:
//
//	GrantsMap{ "key": GrantsArgs{...} }
type GrantsMapInput interface {
	pulumi.Input

	ToGrantsMapOutput() GrantsMapOutput
	ToGrantsMapOutputWithContext(context.Context) GrantsMapOutput
}

type GrantsMap map[string]GrantsInput

func (GrantsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Grants)(nil)).Elem()
}

func (i GrantsMap) ToGrantsMapOutput() GrantsMapOutput {
	return i.ToGrantsMapOutputWithContext(context.Background())
}

func (i GrantsMap) ToGrantsMapOutputWithContext(ctx context.Context) GrantsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantsMapOutput)
}

type GrantsOutput struct{ *pulumi.OutputState }

func (GrantsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Grants)(nil)).Elem()
}

func (o GrantsOutput) ToGrantsOutput() GrantsOutput {
	return o
}

func (o GrantsOutput) ToGrantsOutputWithContext(ctx context.Context) GrantsOutput {
	return o
}

func (o GrantsOutput) Catalog() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Grants) pulumi.StringPtrOutput { return v.Catalog }).(pulumi.StringPtrOutput)
}

func (o GrantsOutput) ExternalLocation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Grants) pulumi.StringPtrOutput { return v.ExternalLocation }).(pulumi.StringPtrOutput)
}

func (o GrantsOutput) ForeignConnection() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Grants) pulumi.StringPtrOutput { return v.ForeignConnection }).(pulumi.StringPtrOutput)
}

func (o GrantsOutput) Function() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Grants) pulumi.StringPtrOutput { return v.Function }).(pulumi.StringPtrOutput)
}

func (o GrantsOutput) Grants() GrantsGrantArrayOutput {
	return o.ApplyT(func(v *Grants) GrantsGrantArrayOutput { return v.Grants }).(GrantsGrantArrayOutput)
}

func (o GrantsOutput) Metastore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Grants) pulumi.StringPtrOutput { return v.Metastore }).(pulumi.StringPtrOutput)
}

func (o GrantsOutput) Model() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Grants) pulumi.StringPtrOutput { return v.Model }).(pulumi.StringPtrOutput)
}

func (o GrantsOutput) Pipeline() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Grants) pulumi.StringPtrOutput { return v.Pipeline }).(pulumi.StringPtrOutput)
}

func (o GrantsOutput) Recipient() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Grants) pulumi.StringPtrOutput { return v.Recipient }).(pulumi.StringPtrOutput)
}

func (o GrantsOutput) Schema() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Grants) pulumi.StringPtrOutput { return v.Schema }).(pulumi.StringPtrOutput)
}

func (o GrantsOutput) Share() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Grants) pulumi.StringPtrOutput { return v.Share }).(pulumi.StringPtrOutput)
}

func (o GrantsOutput) StorageCredential() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Grants) pulumi.StringPtrOutput { return v.StorageCredential }).(pulumi.StringPtrOutput)
}

func (o GrantsOutput) Table() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Grants) pulumi.StringPtrOutput { return v.Table }).(pulumi.StringPtrOutput)
}

func (o GrantsOutput) Volume() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Grants) pulumi.StringPtrOutput { return v.Volume }).(pulumi.StringPtrOutput)
}

type GrantsArrayOutput struct{ *pulumi.OutputState }

func (GrantsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Grants)(nil)).Elem()
}

func (o GrantsArrayOutput) ToGrantsArrayOutput() GrantsArrayOutput {
	return o
}

func (o GrantsArrayOutput) ToGrantsArrayOutputWithContext(ctx context.Context) GrantsArrayOutput {
	return o
}

func (o GrantsArrayOutput) Index(i pulumi.IntInput) GrantsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Grants {
		return vs[0].([]*Grants)[vs[1].(int)]
	}).(GrantsOutput)
}

type GrantsMapOutput struct{ *pulumi.OutputState }

func (GrantsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Grants)(nil)).Elem()
}

func (o GrantsMapOutput) ToGrantsMapOutput() GrantsMapOutput {
	return o
}

func (o GrantsMapOutput) ToGrantsMapOutputWithContext(ctx context.Context) GrantsMapOutput {
	return o
}

func (o GrantsMapOutput) MapIndex(k pulumi.StringInput) GrantsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Grants {
		return vs[0].(map[string]*Grants)[vs[1].(string)]
	}).(GrantsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GrantsInput)(nil)).Elem(), &Grants{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantsArrayInput)(nil)).Elem(), GrantsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantsMapInput)(nil)).Elem(), GrantsMap{})
	pulumi.RegisterOutputType(GrantsOutput{})
	pulumi.RegisterOutputType(GrantsArrayOutput{})
	pulumi.RegisterOutputType(GrantsMapOutput{})
}
