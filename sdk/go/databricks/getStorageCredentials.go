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
// # List all storage credentials in the metastore
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
//			all, err := databricks.GetStorageCredentials(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("allStorageCredentials", all.Names)
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
// * StorageCredential to get information about a single credential
// * StorageCredential to manage Storage Credentials within Unity Catalog.
func GetStorageCredentials(ctx *pulumi.Context, args *GetStorageCredentialsArgs, opts ...pulumi.InvokeOption) (*GetStorageCredentialsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetStorageCredentialsResult
	err := ctx.Invoke("databricks:index/getStorageCredentials:getStorageCredentials", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStorageCredentials.
type GetStorageCredentialsArgs struct {
	// List of names of StorageCredential in the metastore
	Names []string `pulumi:"names"`
}

// A collection of values returned by getStorageCredentials.
type GetStorageCredentialsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of names of StorageCredential in the metastore
	Names []string `pulumi:"names"`
}

func GetStorageCredentialsOutput(ctx *pulumi.Context, args GetStorageCredentialsOutputArgs, opts ...pulumi.InvokeOption) GetStorageCredentialsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetStorageCredentialsResult, error) {
			args := v.(GetStorageCredentialsArgs)
			r, err := GetStorageCredentials(ctx, &args, opts...)
			var s GetStorageCredentialsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetStorageCredentialsResultOutput)
}

// A collection of arguments for invoking getStorageCredentials.
type GetStorageCredentialsOutputArgs struct {
	// List of names of StorageCredential in the metastore
	Names pulumi.StringArrayInput `pulumi:"names"`
}

func (GetStorageCredentialsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStorageCredentialsArgs)(nil)).Elem()
}

// A collection of values returned by getStorageCredentials.
type GetStorageCredentialsResultOutput struct{ *pulumi.OutputState }

func (GetStorageCredentialsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStorageCredentialsResult)(nil)).Elem()
}

func (o GetStorageCredentialsResultOutput) ToGetStorageCredentialsResultOutput() GetStorageCredentialsResultOutput {
	return o
}

func (o GetStorageCredentialsResultOutput) ToGetStorageCredentialsResultOutputWithContext(ctx context.Context) GetStorageCredentialsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetStorageCredentialsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStorageCredentialsResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of names of StorageCredential in the metastore
func (o GetStorageCredentialsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetStorageCredentialsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetStorageCredentialsResultOutput{})
}
