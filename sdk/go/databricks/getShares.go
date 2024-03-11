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
// # Getting all existing shares in the metastore
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
//			this, err := databricks.GetShares(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("shareName", this.Shares)
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
func GetShares(ctx *pulumi.Context, args *GetSharesArgs, opts ...pulumi.InvokeOption) (*GetSharesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSharesResult
	err := ctx.Invoke("databricks:index/getShares:getShares", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getShares.
type GetSharesArgs struct {
	// list of Share names.
	Shares []string `pulumi:"shares"`
}

// A collection of values returned by getShares.
type GetSharesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// list of Share names.
	Shares []string `pulumi:"shares"`
}

func GetSharesOutput(ctx *pulumi.Context, args GetSharesOutputArgs, opts ...pulumi.InvokeOption) GetSharesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSharesResult, error) {
			args := v.(GetSharesArgs)
			r, err := GetShares(ctx, &args, opts...)
			var s GetSharesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSharesResultOutput)
}

// A collection of arguments for invoking getShares.
type GetSharesOutputArgs struct {
	// list of Share names.
	Shares pulumi.StringArrayInput `pulumi:"shares"`
}

func (GetSharesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSharesArgs)(nil)).Elem()
}

// A collection of values returned by getShares.
type GetSharesResultOutput struct{ *pulumi.OutputState }

func (GetSharesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSharesResult)(nil)).Elem()
}

func (o GetSharesResultOutput) ToGetSharesResultOutput() GetSharesResultOutput {
	return o
}

func (o GetSharesResultOutput) ToGetSharesResultOutputWithContext(ctx context.Context) GetSharesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetSharesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSharesResult) string { return v.Id }).(pulumi.StringOutput)
}

// list of Share names.
func (o GetSharesResultOutput) Shares() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSharesResult) []string { return v.Shares }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSharesResultOutput{})
}
