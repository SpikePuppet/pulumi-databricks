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
// # Getting details of an existing share in the metastore
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
//			this, err := databricks.LookupShare(ctx, &databricks.LookupShareArgs{
//				Name: pulumi.StringRef("this"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("createdBy", this.CreatedBy)
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Related Resources
//
// The following resources are used in the same context:
//
// * Share to create Delta Sharing shares.
// * Recipient to create Delta Sharing recipients.
// * Grants to manage Delta Sharing permissions.
func LookupShare(ctx *pulumi.Context, args *LookupShareArgs, opts ...pulumi.InvokeOption) (*LookupShareResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupShareResult
	err := ctx.Invoke("databricks:index/getShare:getShare", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getShare.
type LookupShareArgs struct {
	// Time when the share was created.
	CreatedAt *int `pulumi:"createdAt"`
	// The principal that created the share.
	CreatedBy *string `pulumi:"createdBy"`
	// The name of the share
	Name *string `pulumi:"name"`
	// arrays containing details of each object in the share.
	Objects []GetShareObject `pulumi:"objects"`
}

// A collection of values returned by getShare.
type LookupShareResult struct {
	// Time when the share was created.
	CreatedAt int `pulumi:"createdAt"`
	// The principal that created the share.
	CreatedBy string `pulumi:"createdBy"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Full name of the object being shared.
	Name string `pulumi:"name"`
	// arrays containing details of each object in the share.
	Objects []GetShareObject `pulumi:"objects"`
}

func LookupShareOutput(ctx *pulumi.Context, args LookupShareOutputArgs, opts ...pulumi.InvokeOption) LookupShareResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupShareResult, error) {
			args := v.(LookupShareArgs)
			r, err := LookupShare(ctx, &args, opts...)
			var s LookupShareResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupShareResultOutput)
}

// A collection of arguments for invoking getShare.
type LookupShareOutputArgs struct {
	// Time when the share was created.
	CreatedAt pulumi.IntPtrInput `pulumi:"createdAt"`
	// The principal that created the share.
	CreatedBy pulumi.StringPtrInput `pulumi:"createdBy"`
	// The name of the share
	Name pulumi.StringPtrInput `pulumi:"name"`
	// arrays containing details of each object in the share.
	Objects GetShareObjectArrayInput `pulumi:"objects"`
}

func (LookupShareOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupShareArgs)(nil)).Elem()
}

// A collection of values returned by getShare.
type LookupShareResultOutput struct{ *pulumi.OutputState }

func (LookupShareResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupShareResult)(nil)).Elem()
}

func (o LookupShareResultOutput) ToLookupShareResultOutput() LookupShareResultOutput {
	return o
}

func (o LookupShareResultOutput) ToLookupShareResultOutputWithContext(ctx context.Context) LookupShareResultOutput {
	return o
}

// Time when the share was created.
func (o LookupShareResultOutput) CreatedAt() pulumi.IntOutput {
	return o.ApplyT(func(v LookupShareResult) int { return v.CreatedAt }).(pulumi.IntOutput)
}

// The principal that created the share.
func (o LookupShareResultOutput) CreatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupShareResult) string { return v.CreatedBy }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupShareResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupShareResult) string { return v.Id }).(pulumi.StringOutput)
}

// Full name of the object being shared.
func (o LookupShareResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupShareResult) string { return v.Name }).(pulumi.StringOutput)
}

// arrays containing details of each object in the share.
func (o LookupShareResultOutput) Objects() GetShareObjectArrayOutput {
	return o.ApplyT(func(v LookupShareResult) []GetShareObject { return v.Objects }).(GetShareObjectArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupShareResultOutput{})
}
