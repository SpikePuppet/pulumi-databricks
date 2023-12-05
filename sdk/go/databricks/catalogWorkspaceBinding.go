// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
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
//			sandboxCatalog, err := databricks.NewCatalog(ctx, "sandboxCatalog", &databricks.CatalogArgs{
//				IsolationMode: pulumi.String("ISOLATED"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewCatalogWorkspaceBinding(ctx, "sandboxCatalogWorkspaceBinding", &databricks.CatalogWorkspaceBindingArgs{
//				SecurableName: sandboxCatalog.Name,
//				WorkspaceId:   pulumi.Any(databricks_mws_workspaces.Other.Workspace_id),
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
// ## Import
//
// -> **Note** Importing this resource is not currently supported.
type CatalogWorkspaceBinding struct {
	pulumi.CustomResourceState

	// Binding mode. Default to `BINDING_TYPE_READ_WRITE`. Possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`
	BindingType pulumi.StringPtrOutput `pulumi:"bindingType"`
	// Deprecated: Please use 'securable_name' and 'securable_type instead.
	CatalogName pulumi.StringPtrOutput `pulumi:"catalogName"`
	// Name of securable. Change forces creation of a new resource.
	SecurableName pulumi.StringPtrOutput `pulumi:"securableName"`
	// Type of securable. Default to `catalog`. Change forces creation of a new resource.
	SecurableType pulumi.StringPtrOutput `pulumi:"securableType"`
	// ID of the workspace. Change forces creation of a new resource.
	WorkspaceId pulumi.IntPtrOutput `pulumi:"workspaceId"`
}

// NewCatalogWorkspaceBinding registers a new resource with the given unique name, arguments, and options.
func NewCatalogWorkspaceBinding(ctx *pulumi.Context,
	name string, args *CatalogWorkspaceBindingArgs, opts ...pulumi.ResourceOption) (*CatalogWorkspaceBinding, error) {
	if args == nil {
		args = &CatalogWorkspaceBindingArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CatalogWorkspaceBinding
	err := ctx.RegisterResource("databricks:index/catalogWorkspaceBinding:CatalogWorkspaceBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCatalogWorkspaceBinding gets an existing CatalogWorkspaceBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCatalogWorkspaceBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CatalogWorkspaceBindingState, opts ...pulumi.ResourceOption) (*CatalogWorkspaceBinding, error) {
	var resource CatalogWorkspaceBinding
	err := ctx.ReadResource("databricks:index/catalogWorkspaceBinding:CatalogWorkspaceBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CatalogWorkspaceBinding resources.
type catalogWorkspaceBindingState struct {
	// Binding mode. Default to `BINDING_TYPE_READ_WRITE`. Possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`
	BindingType *string `pulumi:"bindingType"`
	// Deprecated: Please use 'securable_name' and 'securable_type instead.
	CatalogName *string `pulumi:"catalogName"`
	// Name of securable. Change forces creation of a new resource.
	SecurableName *string `pulumi:"securableName"`
	// Type of securable. Default to `catalog`. Change forces creation of a new resource.
	SecurableType *string `pulumi:"securableType"`
	// ID of the workspace. Change forces creation of a new resource.
	WorkspaceId *int `pulumi:"workspaceId"`
}

type CatalogWorkspaceBindingState struct {
	// Binding mode. Default to `BINDING_TYPE_READ_WRITE`. Possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`
	BindingType pulumi.StringPtrInput
	// Deprecated: Please use 'securable_name' and 'securable_type instead.
	CatalogName pulumi.StringPtrInput
	// Name of securable. Change forces creation of a new resource.
	SecurableName pulumi.StringPtrInput
	// Type of securable. Default to `catalog`. Change forces creation of a new resource.
	SecurableType pulumi.StringPtrInput
	// ID of the workspace. Change forces creation of a new resource.
	WorkspaceId pulumi.IntPtrInput
}

func (CatalogWorkspaceBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*catalogWorkspaceBindingState)(nil)).Elem()
}

type catalogWorkspaceBindingArgs struct {
	// Binding mode. Default to `BINDING_TYPE_READ_WRITE`. Possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`
	BindingType *string `pulumi:"bindingType"`
	// Deprecated: Please use 'securable_name' and 'securable_type instead.
	CatalogName *string `pulumi:"catalogName"`
	// Name of securable. Change forces creation of a new resource.
	SecurableName *string `pulumi:"securableName"`
	// Type of securable. Default to `catalog`. Change forces creation of a new resource.
	SecurableType *string `pulumi:"securableType"`
	// ID of the workspace. Change forces creation of a new resource.
	WorkspaceId *int `pulumi:"workspaceId"`
}

// The set of arguments for constructing a CatalogWorkspaceBinding resource.
type CatalogWorkspaceBindingArgs struct {
	// Binding mode. Default to `BINDING_TYPE_READ_WRITE`. Possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`
	BindingType pulumi.StringPtrInput
	// Deprecated: Please use 'securable_name' and 'securable_type instead.
	CatalogName pulumi.StringPtrInput
	// Name of securable. Change forces creation of a new resource.
	SecurableName pulumi.StringPtrInput
	// Type of securable. Default to `catalog`. Change forces creation of a new resource.
	SecurableType pulumi.StringPtrInput
	// ID of the workspace. Change forces creation of a new resource.
	WorkspaceId pulumi.IntPtrInput
}

func (CatalogWorkspaceBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*catalogWorkspaceBindingArgs)(nil)).Elem()
}

type CatalogWorkspaceBindingInput interface {
	pulumi.Input

	ToCatalogWorkspaceBindingOutput() CatalogWorkspaceBindingOutput
	ToCatalogWorkspaceBindingOutputWithContext(ctx context.Context) CatalogWorkspaceBindingOutput
}

func (*CatalogWorkspaceBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**CatalogWorkspaceBinding)(nil)).Elem()
}

func (i *CatalogWorkspaceBinding) ToCatalogWorkspaceBindingOutput() CatalogWorkspaceBindingOutput {
	return i.ToCatalogWorkspaceBindingOutputWithContext(context.Background())
}

func (i *CatalogWorkspaceBinding) ToCatalogWorkspaceBindingOutputWithContext(ctx context.Context) CatalogWorkspaceBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogWorkspaceBindingOutput)
}

// CatalogWorkspaceBindingArrayInput is an input type that accepts CatalogWorkspaceBindingArray and CatalogWorkspaceBindingArrayOutput values.
// You can construct a concrete instance of `CatalogWorkspaceBindingArrayInput` via:
//
//	CatalogWorkspaceBindingArray{ CatalogWorkspaceBindingArgs{...} }
type CatalogWorkspaceBindingArrayInput interface {
	pulumi.Input

	ToCatalogWorkspaceBindingArrayOutput() CatalogWorkspaceBindingArrayOutput
	ToCatalogWorkspaceBindingArrayOutputWithContext(context.Context) CatalogWorkspaceBindingArrayOutput
}

type CatalogWorkspaceBindingArray []CatalogWorkspaceBindingInput

func (CatalogWorkspaceBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CatalogWorkspaceBinding)(nil)).Elem()
}

func (i CatalogWorkspaceBindingArray) ToCatalogWorkspaceBindingArrayOutput() CatalogWorkspaceBindingArrayOutput {
	return i.ToCatalogWorkspaceBindingArrayOutputWithContext(context.Background())
}

func (i CatalogWorkspaceBindingArray) ToCatalogWorkspaceBindingArrayOutputWithContext(ctx context.Context) CatalogWorkspaceBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogWorkspaceBindingArrayOutput)
}

// CatalogWorkspaceBindingMapInput is an input type that accepts CatalogWorkspaceBindingMap and CatalogWorkspaceBindingMapOutput values.
// You can construct a concrete instance of `CatalogWorkspaceBindingMapInput` via:
//
//	CatalogWorkspaceBindingMap{ "key": CatalogWorkspaceBindingArgs{...} }
type CatalogWorkspaceBindingMapInput interface {
	pulumi.Input

	ToCatalogWorkspaceBindingMapOutput() CatalogWorkspaceBindingMapOutput
	ToCatalogWorkspaceBindingMapOutputWithContext(context.Context) CatalogWorkspaceBindingMapOutput
}

type CatalogWorkspaceBindingMap map[string]CatalogWorkspaceBindingInput

func (CatalogWorkspaceBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CatalogWorkspaceBinding)(nil)).Elem()
}

func (i CatalogWorkspaceBindingMap) ToCatalogWorkspaceBindingMapOutput() CatalogWorkspaceBindingMapOutput {
	return i.ToCatalogWorkspaceBindingMapOutputWithContext(context.Background())
}

func (i CatalogWorkspaceBindingMap) ToCatalogWorkspaceBindingMapOutputWithContext(ctx context.Context) CatalogWorkspaceBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogWorkspaceBindingMapOutput)
}

type CatalogWorkspaceBindingOutput struct{ *pulumi.OutputState }

func (CatalogWorkspaceBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CatalogWorkspaceBinding)(nil)).Elem()
}

func (o CatalogWorkspaceBindingOutput) ToCatalogWorkspaceBindingOutput() CatalogWorkspaceBindingOutput {
	return o
}

func (o CatalogWorkspaceBindingOutput) ToCatalogWorkspaceBindingOutputWithContext(ctx context.Context) CatalogWorkspaceBindingOutput {
	return o
}

// Binding mode. Default to `BINDING_TYPE_READ_WRITE`. Possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`
func (o CatalogWorkspaceBindingOutput) BindingType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CatalogWorkspaceBinding) pulumi.StringPtrOutput { return v.BindingType }).(pulumi.StringPtrOutput)
}

// Deprecated: Please use 'securable_name' and 'securable_type instead.
func (o CatalogWorkspaceBindingOutput) CatalogName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CatalogWorkspaceBinding) pulumi.StringPtrOutput { return v.CatalogName }).(pulumi.StringPtrOutput)
}

// Name of securable. Change forces creation of a new resource.
func (o CatalogWorkspaceBindingOutput) SecurableName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CatalogWorkspaceBinding) pulumi.StringPtrOutput { return v.SecurableName }).(pulumi.StringPtrOutput)
}

// Type of securable. Default to `catalog`. Change forces creation of a new resource.
func (o CatalogWorkspaceBindingOutput) SecurableType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CatalogWorkspaceBinding) pulumi.StringPtrOutput { return v.SecurableType }).(pulumi.StringPtrOutput)
}

// ID of the workspace. Change forces creation of a new resource.
func (o CatalogWorkspaceBindingOutput) WorkspaceId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CatalogWorkspaceBinding) pulumi.IntPtrOutput { return v.WorkspaceId }).(pulumi.IntPtrOutput)
}

type CatalogWorkspaceBindingArrayOutput struct{ *pulumi.OutputState }

func (CatalogWorkspaceBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CatalogWorkspaceBinding)(nil)).Elem()
}

func (o CatalogWorkspaceBindingArrayOutput) ToCatalogWorkspaceBindingArrayOutput() CatalogWorkspaceBindingArrayOutput {
	return o
}

func (o CatalogWorkspaceBindingArrayOutput) ToCatalogWorkspaceBindingArrayOutputWithContext(ctx context.Context) CatalogWorkspaceBindingArrayOutput {
	return o
}

func (o CatalogWorkspaceBindingArrayOutput) Index(i pulumi.IntInput) CatalogWorkspaceBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CatalogWorkspaceBinding {
		return vs[0].([]*CatalogWorkspaceBinding)[vs[1].(int)]
	}).(CatalogWorkspaceBindingOutput)
}

type CatalogWorkspaceBindingMapOutput struct{ *pulumi.OutputState }

func (CatalogWorkspaceBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CatalogWorkspaceBinding)(nil)).Elem()
}

func (o CatalogWorkspaceBindingMapOutput) ToCatalogWorkspaceBindingMapOutput() CatalogWorkspaceBindingMapOutput {
	return o
}

func (o CatalogWorkspaceBindingMapOutput) ToCatalogWorkspaceBindingMapOutputWithContext(ctx context.Context) CatalogWorkspaceBindingMapOutput {
	return o
}

func (o CatalogWorkspaceBindingMapOutput) MapIndex(k pulumi.StringInput) CatalogWorkspaceBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CatalogWorkspaceBinding {
		return vs[0].(map[string]*CatalogWorkspaceBinding)[vs[1].(string)]
	}).(CatalogWorkspaceBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogWorkspaceBindingInput)(nil)).Elem(), &CatalogWorkspaceBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogWorkspaceBindingArrayInput)(nil)).Elem(), CatalogWorkspaceBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogWorkspaceBindingMapInput)(nil)).Elem(), CatalogWorkspaceBindingMap{})
	pulumi.RegisterOutputType(CatalogWorkspaceBindingOutput{})
	pulumi.RegisterOutputType(CatalogWorkspaceBindingArrayOutput{})
	pulumi.RegisterOutputType(CatalogWorkspaceBindingMapOutput{})
}
