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
// # MetastoreInfo response for a given metastore id
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			thisMetastore, err := databricks.NewMetastore(ctx, "this", &databricks.MetastoreArgs{
//				Name:         pulumi.String("primary"),
//				StorageRoot:  pulumi.String(fmt.Sprintf("s3://%v/metastore", metastore.Id)),
//				Owner:        pulumi.Any(unityAdminGroup),
//				ForceDestroy: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			this := databricks.LookupMetastoreOutput(ctx, databricks.GetMetastoreOutputArgs{
//				MetastoreId: thisMetastore.ID(),
//			}, nil)
//			ctx.Export("someMetastore", this.ApplyT(func(this databricks.GetMetastoreResult) (databricks.GetMetastoreMetastoreInfo, error) {
//				return this.MetastoreInfo, nil
//			}).(databricks.GetMetastoreMetastoreInfoOutput))
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
// * getMetastores to get mapping of name to id of all metastores.
// * Metastore to manage Metastores within Unity Catalog.
// * Catalog to manage catalogs within Unity Catalog.
func LookupMetastore(ctx *pulumi.Context, args *LookupMetastoreArgs, opts ...pulumi.InvokeOption) (*LookupMetastoreResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupMetastoreResult
	err := ctx.Invoke("databricks:index/getMetastore:getMetastore", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMetastore.
type LookupMetastoreArgs struct {
	// Id of the metastore
	MetastoreId *string `pulumi:"metastoreId"`
	// MetastoreInfo object for a databricks_metastore. This contains the following attributes:
	MetastoreInfo *GetMetastoreMetastoreInfo `pulumi:"metastoreInfo"`
	// Name of the metastore
	Name *string `pulumi:"name"`
	// Region of the metastore
	Region *string `pulumi:"region"`
}

// A collection of values returned by getMetastore.
type LookupMetastoreResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id          string `pulumi:"id"`
	MetastoreId string `pulumi:"metastoreId"`
	// MetastoreInfo object for a databricks_metastore. This contains the following attributes:
	MetastoreInfo GetMetastoreMetastoreInfo `pulumi:"metastoreInfo"`
	// Name of metastore.
	Name   string `pulumi:"name"`
	Region string `pulumi:"region"`
}

func LookupMetastoreOutput(ctx *pulumi.Context, args LookupMetastoreOutputArgs, opts ...pulumi.InvokeOption) LookupMetastoreResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupMetastoreResult, error) {
			args := v.(LookupMetastoreArgs)
			r, err := LookupMetastore(ctx, &args, opts...)
			var s LookupMetastoreResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupMetastoreResultOutput)
}

// A collection of arguments for invoking getMetastore.
type LookupMetastoreOutputArgs struct {
	// Id of the metastore
	MetastoreId pulumi.StringPtrInput `pulumi:"metastoreId"`
	// MetastoreInfo object for a databricks_metastore. This contains the following attributes:
	MetastoreInfo GetMetastoreMetastoreInfoPtrInput `pulumi:"metastoreInfo"`
	// Name of the metastore
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Region of the metastore
	Region pulumi.StringPtrInput `pulumi:"region"`
}

func (LookupMetastoreOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMetastoreArgs)(nil)).Elem()
}

// A collection of values returned by getMetastore.
type LookupMetastoreResultOutput struct{ *pulumi.OutputState }

func (LookupMetastoreResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMetastoreResult)(nil)).Elem()
}

func (o LookupMetastoreResultOutput) ToLookupMetastoreResultOutput() LookupMetastoreResultOutput {
	return o
}

func (o LookupMetastoreResultOutput) ToLookupMetastoreResultOutputWithContext(ctx context.Context) LookupMetastoreResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupMetastoreResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMetastoreResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupMetastoreResultOutput) MetastoreId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMetastoreResult) string { return v.MetastoreId }).(pulumi.StringOutput)
}

// MetastoreInfo object for a databricks_metastore. This contains the following attributes:
func (o LookupMetastoreResultOutput) MetastoreInfo() GetMetastoreMetastoreInfoOutput {
	return o.ApplyT(func(v LookupMetastoreResult) GetMetastoreMetastoreInfo { return v.MetastoreInfo }).(GetMetastoreMetastoreInfoOutput)
}

// Name of metastore.
func (o LookupMetastoreResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMetastoreResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupMetastoreResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMetastoreResult) string { return v.Region }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupMetastoreResultOutput{})
}
