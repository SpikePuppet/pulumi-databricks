// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Note** This resource could be only used on Unity Catalog-enabled workspace!
//
// This resource allows you to create [Online Table](https://docs.databricks.com/en/machine-learning/feature-store/online-tables.html) in Databricks.  An online table is a read-only copy of a Delta Table that is stored in row-oriented format optimized for online access. Online tables are fully serverless tables that auto-scale throughput capacity with the request load and provide low latency and high throughput access to data of any scale. Online tables are designed to work with Databricks Model Serving, Feature Serving, and retrieval-augmented generation (RAG) applications where they are used for fast data lookups.
//
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
//			_, err := databricks.NewOnlineTable(ctx, "this", &databricks.OnlineTableArgs{
//				Name: pulumi.String("main.default.online_table"),
//				Spec: &databricks.OnlineTableSpecArgs{
//					SourceTableFullName: pulumi.String("main.default.source_table"),
//					PrimaryKeyColumns: pulumi.StringArray{
//						pulumi.String("id"),
//					},
//					RunTriggered: nil,
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
//
// ## Import
//
// The resource can be imported using the name of the Online Table:
//
// bash
//
// ```sh
// $ pulumi import databricks:index/onlineTable:OnlineTable this <endpoint-name>
// ```
type OnlineTable struct {
	pulumi.CustomResourceState

	// 3-level name of the Online Table to create.
	Name pulumi.StringOutput `pulumi:"name"`
	// object containing specification of the online table:
	Spec OnlineTableSpecPtrOutput `pulumi:"spec"`
	// object describing status of the online table:
	Statuses OnlineTableStatusArrayOutput `pulumi:"statuses"`
}

// NewOnlineTable registers a new resource with the given unique name, arguments, and options.
func NewOnlineTable(ctx *pulumi.Context,
	name string, args *OnlineTableArgs, opts ...pulumi.ResourceOption) (*OnlineTable, error) {
	if args == nil {
		args = &OnlineTableArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OnlineTable
	err := ctx.RegisterResource("databricks:index/onlineTable:OnlineTable", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOnlineTable gets an existing OnlineTable resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOnlineTable(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OnlineTableState, opts ...pulumi.ResourceOption) (*OnlineTable, error) {
	var resource OnlineTable
	err := ctx.ReadResource("databricks:index/onlineTable:OnlineTable", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OnlineTable resources.
type onlineTableState struct {
	// 3-level name of the Online Table to create.
	Name *string `pulumi:"name"`
	// object containing specification of the online table:
	Spec *OnlineTableSpec `pulumi:"spec"`
	// object describing status of the online table:
	Statuses []OnlineTableStatus `pulumi:"statuses"`
}

type OnlineTableState struct {
	// 3-level name of the Online Table to create.
	Name pulumi.StringPtrInput
	// object containing specification of the online table:
	Spec OnlineTableSpecPtrInput
	// object describing status of the online table:
	Statuses OnlineTableStatusArrayInput
}

func (OnlineTableState) ElementType() reflect.Type {
	return reflect.TypeOf((*onlineTableState)(nil)).Elem()
}

type onlineTableArgs struct {
	// 3-level name of the Online Table to create.
	Name *string `pulumi:"name"`
	// object containing specification of the online table:
	Spec *OnlineTableSpec `pulumi:"spec"`
}

// The set of arguments for constructing a OnlineTable resource.
type OnlineTableArgs struct {
	// 3-level name of the Online Table to create.
	Name pulumi.StringPtrInput
	// object containing specification of the online table:
	Spec OnlineTableSpecPtrInput
}

func (OnlineTableArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*onlineTableArgs)(nil)).Elem()
}

type OnlineTableInput interface {
	pulumi.Input

	ToOnlineTableOutput() OnlineTableOutput
	ToOnlineTableOutputWithContext(ctx context.Context) OnlineTableOutput
}

func (*OnlineTable) ElementType() reflect.Type {
	return reflect.TypeOf((**OnlineTable)(nil)).Elem()
}

func (i *OnlineTable) ToOnlineTableOutput() OnlineTableOutput {
	return i.ToOnlineTableOutputWithContext(context.Background())
}

func (i *OnlineTable) ToOnlineTableOutputWithContext(ctx context.Context) OnlineTableOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OnlineTableOutput)
}

// OnlineTableArrayInput is an input type that accepts OnlineTableArray and OnlineTableArrayOutput values.
// You can construct a concrete instance of `OnlineTableArrayInput` via:
//
//	OnlineTableArray{ OnlineTableArgs{...} }
type OnlineTableArrayInput interface {
	pulumi.Input

	ToOnlineTableArrayOutput() OnlineTableArrayOutput
	ToOnlineTableArrayOutputWithContext(context.Context) OnlineTableArrayOutput
}

type OnlineTableArray []OnlineTableInput

func (OnlineTableArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OnlineTable)(nil)).Elem()
}

func (i OnlineTableArray) ToOnlineTableArrayOutput() OnlineTableArrayOutput {
	return i.ToOnlineTableArrayOutputWithContext(context.Background())
}

func (i OnlineTableArray) ToOnlineTableArrayOutputWithContext(ctx context.Context) OnlineTableArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OnlineTableArrayOutput)
}

// OnlineTableMapInput is an input type that accepts OnlineTableMap and OnlineTableMapOutput values.
// You can construct a concrete instance of `OnlineTableMapInput` via:
//
//	OnlineTableMap{ "key": OnlineTableArgs{...} }
type OnlineTableMapInput interface {
	pulumi.Input

	ToOnlineTableMapOutput() OnlineTableMapOutput
	ToOnlineTableMapOutputWithContext(context.Context) OnlineTableMapOutput
}

type OnlineTableMap map[string]OnlineTableInput

func (OnlineTableMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OnlineTable)(nil)).Elem()
}

func (i OnlineTableMap) ToOnlineTableMapOutput() OnlineTableMapOutput {
	return i.ToOnlineTableMapOutputWithContext(context.Background())
}

func (i OnlineTableMap) ToOnlineTableMapOutputWithContext(ctx context.Context) OnlineTableMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OnlineTableMapOutput)
}

type OnlineTableOutput struct{ *pulumi.OutputState }

func (OnlineTableOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OnlineTable)(nil)).Elem()
}

func (o OnlineTableOutput) ToOnlineTableOutput() OnlineTableOutput {
	return o
}

func (o OnlineTableOutput) ToOnlineTableOutputWithContext(ctx context.Context) OnlineTableOutput {
	return o
}

// 3-level name of the Online Table to create.
func (o OnlineTableOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OnlineTable) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// object containing specification of the online table:
func (o OnlineTableOutput) Spec() OnlineTableSpecPtrOutput {
	return o.ApplyT(func(v *OnlineTable) OnlineTableSpecPtrOutput { return v.Spec }).(OnlineTableSpecPtrOutput)
}

// object describing status of the online table:
func (o OnlineTableOutput) Statuses() OnlineTableStatusArrayOutput {
	return o.ApplyT(func(v *OnlineTable) OnlineTableStatusArrayOutput { return v.Statuses }).(OnlineTableStatusArrayOutput)
}

type OnlineTableArrayOutput struct{ *pulumi.OutputState }

func (OnlineTableArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OnlineTable)(nil)).Elem()
}

func (o OnlineTableArrayOutput) ToOnlineTableArrayOutput() OnlineTableArrayOutput {
	return o
}

func (o OnlineTableArrayOutput) ToOnlineTableArrayOutputWithContext(ctx context.Context) OnlineTableArrayOutput {
	return o
}

func (o OnlineTableArrayOutput) Index(i pulumi.IntInput) OnlineTableOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OnlineTable {
		return vs[0].([]*OnlineTable)[vs[1].(int)]
	}).(OnlineTableOutput)
}

type OnlineTableMapOutput struct{ *pulumi.OutputState }

func (OnlineTableMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OnlineTable)(nil)).Elem()
}

func (o OnlineTableMapOutput) ToOnlineTableMapOutput() OnlineTableMapOutput {
	return o
}

func (o OnlineTableMapOutput) ToOnlineTableMapOutputWithContext(ctx context.Context) OnlineTableMapOutput {
	return o
}

func (o OnlineTableMapOutput) MapIndex(k pulumi.StringInput) OnlineTableOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OnlineTable {
		return vs[0].(map[string]*OnlineTable)[vs[1].(string)]
	}).(OnlineTableOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OnlineTableInput)(nil)).Elem(), &OnlineTable{})
	pulumi.RegisterInputType(reflect.TypeOf((*OnlineTableArrayInput)(nil)).Elem(), OnlineTableArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OnlineTableMapInput)(nil)).Elem(), OnlineTableMap{})
	pulumi.RegisterOutputType(OnlineTableOutput{})
	pulumi.RegisterOutputType(OnlineTableArrayOutput{})
	pulumi.RegisterOutputType(OnlineTableMapOutput{})
}
