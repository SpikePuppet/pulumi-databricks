// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Within a metastore, Unity Catalog provides the ability to create a share, which is a named object that contains a collection of tables in a metastore that you want to share as a group. A share can contain tables from only a single metastore. You can add or remove tables from a share at any time.
//
// A `Share` is contained within Metastore and can contain a list of shares.
//
// ## Related Resources
//
// The following resources are often used in the same context:
//
// * Recipient to create Delta Sharing recipients.
// * Grants to manage Delta Sharing permissions.
// * getShares to read existing Delta Sharing shares.
type Share struct {
	pulumi.CustomResourceState

	// Time when the share was created.
	CreatedAt pulumi.IntOutput `pulumi:"createdAt"`
	// The principal that created the share.
	CreatedBy pulumi.StringOutput `pulumi:"createdBy"`
	// Full name of the object, e.g. `catalog.schema.name` for a table.
	Name    pulumi.StringOutput    `pulumi:"name"`
	Objects ShareObjectArrayOutput `pulumi:"objects"`
}

// NewShare registers a new resource with the given unique name, arguments, and options.
func NewShare(ctx *pulumi.Context,
	name string, args *ShareArgs, opts ...pulumi.ResourceOption) (*Share, error) {
	if args == nil {
		args = &ShareArgs{}
	}

	var resource Share
	err := ctx.RegisterResource("databricks:index/share:Share", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetShare gets an existing Share resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetShare(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ShareState, opts ...pulumi.ResourceOption) (*Share, error) {
	var resource Share
	err := ctx.ReadResource("databricks:index/share:Share", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Share resources.
type shareState struct {
	// Time when the share was created.
	CreatedAt *int `pulumi:"createdAt"`
	// The principal that created the share.
	CreatedBy *string `pulumi:"createdBy"`
	// Full name of the object, e.g. `catalog.schema.name` for a table.
	Name    *string       `pulumi:"name"`
	Objects []ShareObject `pulumi:"objects"`
}

type ShareState struct {
	// Time when the share was created.
	CreatedAt pulumi.IntPtrInput
	// The principal that created the share.
	CreatedBy pulumi.StringPtrInput
	// Full name of the object, e.g. `catalog.schema.name` for a table.
	Name    pulumi.StringPtrInput
	Objects ShareObjectArrayInput
}

func (ShareState) ElementType() reflect.Type {
	return reflect.TypeOf((*shareState)(nil)).Elem()
}

type shareArgs struct {
	// Time when the share was created.
	CreatedAt *int `pulumi:"createdAt"`
	// The principal that created the share.
	CreatedBy *string `pulumi:"createdBy"`
	// Full name of the object, e.g. `catalog.schema.name` for a table.
	Name    *string       `pulumi:"name"`
	Objects []ShareObject `pulumi:"objects"`
}

// The set of arguments for constructing a Share resource.
type ShareArgs struct {
	// Time when the share was created.
	CreatedAt pulumi.IntPtrInput
	// The principal that created the share.
	CreatedBy pulumi.StringPtrInput
	// Full name of the object, e.g. `catalog.schema.name` for a table.
	Name    pulumi.StringPtrInput
	Objects ShareObjectArrayInput
}

func (ShareArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*shareArgs)(nil)).Elem()
}

type ShareInput interface {
	pulumi.Input

	ToShareOutput() ShareOutput
	ToShareOutputWithContext(ctx context.Context) ShareOutput
}

func (*Share) ElementType() reflect.Type {
	return reflect.TypeOf((**Share)(nil)).Elem()
}

func (i *Share) ToShareOutput() ShareOutput {
	return i.ToShareOutputWithContext(context.Background())
}

func (i *Share) ToShareOutputWithContext(ctx context.Context) ShareOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareOutput)
}

// ShareArrayInput is an input type that accepts ShareArray and ShareArrayOutput values.
// You can construct a concrete instance of `ShareArrayInput` via:
//
//	ShareArray{ ShareArgs{...} }
type ShareArrayInput interface {
	pulumi.Input

	ToShareArrayOutput() ShareArrayOutput
	ToShareArrayOutputWithContext(context.Context) ShareArrayOutput
}

type ShareArray []ShareInput

func (ShareArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Share)(nil)).Elem()
}

func (i ShareArray) ToShareArrayOutput() ShareArrayOutput {
	return i.ToShareArrayOutputWithContext(context.Background())
}

func (i ShareArray) ToShareArrayOutputWithContext(ctx context.Context) ShareArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareArrayOutput)
}

// ShareMapInput is an input type that accepts ShareMap and ShareMapOutput values.
// You can construct a concrete instance of `ShareMapInput` via:
//
//	ShareMap{ "key": ShareArgs{...} }
type ShareMapInput interface {
	pulumi.Input

	ToShareMapOutput() ShareMapOutput
	ToShareMapOutputWithContext(context.Context) ShareMapOutput
}

type ShareMap map[string]ShareInput

func (ShareMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Share)(nil)).Elem()
}

func (i ShareMap) ToShareMapOutput() ShareMapOutput {
	return i.ToShareMapOutputWithContext(context.Background())
}

func (i ShareMap) ToShareMapOutputWithContext(ctx context.Context) ShareMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareMapOutput)
}

type ShareOutput struct{ *pulumi.OutputState }

func (ShareOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Share)(nil)).Elem()
}

func (o ShareOutput) ToShareOutput() ShareOutput {
	return o
}

func (o ShareOutput) ToShareOutputWithContext(ctx context.Context) ShareOutput {
	return o
}

// Time when the share was created.
func (o ShareOutput) CreatedAt() pulumi.IntOutput {
	return o.ApplyT(func(v *Share) pulumi.IntOutput { return v.CreatedAt }).(pulumi.IntOutput)
}

// The principal that created the share.
func (o ShareOutput) CreatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v *Share) pulumi.StringOutput { return v.CreatedBy }).(pulumi.StringOutput)
}

// Full name of the object, e.g. `catalog.schema.name` for a table.
func (o ShareOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Share) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o ShareOutput) Objects() ShareObjectArrayOutput {
	return o.ApplyT(func(v *Share) ShareObjectArrayOutput { return v.Objects }).(ShareObjectArrayOutput)
}

type ShareArrayOutput struct{ *pulumi.OutputState }

func (ShareArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Share)(nil)).Elem()
}

func (o ShareArrayOutput) ToShareArrayOutput() ShareArrayOutput {
	return o
}

func (o ShareArrayOutput) ToShareArrayOutputWithContext(ctx context.Context) ShareArrayOutput {
	return o
}

func (o ShareArrayOutput) Index(i pulumi.IntInput) ShareOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Share {
		return vs[0].([]*Share)[vs[1].(int)]
	}).(ShareOutput)
}

type ShareMapOutput struct{ *pulumi.OutputState }

func (ShareMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Share)(nil)).Elem()
}

func (o ShareMapOutput) ToShareMapOutput() ShareMapOutput {
	return o
}

func (o ShareMapOutput) ToShareMapOutputWithContext(ctx context.Context) ShareMapOutput {
	return o
}

func (o ShareMapOutput) MapIndex(k pulumi.StringInput) ShareOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Share {
		return vs[0].(map[string]*Share)[vs[1].(string)]
	}).(ShareOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ShareInput)(nil)).Elem(), &Share{})
	pulumi.RegisterInputType(reflect.TypeOf((*ShareArrayInput)(nil)).Elem(), ShareArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ShareMapInput)(nil)).Elem(), ShareMap{})
	pulumi.RegisterOutputType(ShareOutput{})
	pulumi.RegisterOutputType(ShareArrayOutput{})
	pulumi.RegisterOutputType(ShareMapOutput{})
}