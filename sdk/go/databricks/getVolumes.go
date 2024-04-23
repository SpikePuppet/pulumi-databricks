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
// Listing all volumes in a _things_ Schema of a  _sandbox_ databricks_catalog:
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
//			this, err := databricks.GetVolumes(ctx, &databricks.GetVolumesArgs{
//				CatalogName: "sandbox",
//				SchemaName:  "things",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("allVolumes", this)
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
// * Volume to manage volumes within Unity Catalog.
// * Schema to manage schemas within Unity Catalog.
// * Catalog to manage catalogs within Unity Catalog.
func GetVolumes(ctx *pulumi.Context, args *GetVolumesArgs, opts ...pulumi.InvokeOption) (*GetVolumesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVolumesResult
	err := ctx.Invoke("databricks:index/getVolumes:getVolumes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVolumes.
type GetVolumesArgs struct {
	// Name of databricks_catalog
	CatalogName string `pulumi:"catalogName"`
	// a list of Volume full names: *`catalog`.`schema`.`volume`*
	Ids []string `pulumi:"ids"`
	// Name of databricks_schema
	SchemaName string `pulumi:"schemaName"`
}

// A collection of values returned by getVolumes.
type GetVolumesResult struct {
	CatalogName string `pulumi:"catalogName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// a list of Volume full names: *`catalog`.`schema`.`volume`*
	Ids        []string `pulumi:"ids"`
	SchemaName string   `pulumi:"schemaName"`
}

func GetVolumesOutput(ctx *pulumi.Context, args GetVolumesOutputArgs, opts ...pulumi.InvokeOption) GetVolumesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVolumesResult, error) {
			args := v.(GetVolumesArgs)
			r, err := GetVolumes(ctx, &args, opts...)
			var s GetVolumesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVolumesResultOutput)
}

// A collection of arguments for invoking getVolumes.
type GetVolumesOutputArgs struct {
	// Name of databricks_catalog
	CatalogName pulumi.StringInput `pulumi:"catalogName"`
	// a list of Volume full names: *`catalog`.`schema`.`volume`*
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// Name of databricks_schema
	SchemaName pulumi.StringInput `pulumi:"schemaName"`
}

func (GetVolumesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumesArgs)(nil)).Elem()
}

// A collection of values returned by getVolumes.
type GetVolumesResultOutput struct{ *pulumi.OutputState }

func (GetVolumesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumesResult)(nil)).Elem()
}

func (o GetVolumesResultOutput) ToGetVolumesResultOutput() GetVolumesResultOutput {
	return o
}

func (o GetVolumesResultOutput) ToGetVolumesResultOutputWithContext(ctx context.Context) GetVolumesResultOutput {
	return o
}

func (o GetVolumesResultOutput) CatalogName() pulumi.StringOutput {
	return o.ApplyT(func(v GetVolumesResult) string { return v.CatalogName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetVolumesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVolumesResult) string { return v.Id }).(pulumi.StringOutput)
}

// a list of Volume full names: *`catalog`.`schema`.`volume`*
func (o GetVolumesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVolumesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetVolumesResultOutput) SchemaName() pulumi.StringOutput {
	return o.ApplyT(func(v GetVolumesResult) string { return v.SchemaName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVolumesResultOutput{})
}
