// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add dependsOn attribute in order to prevent _default auth: cannot configure default credentials_ errors.
//
// Lists all MwsCredentials in Databricks Account.
//
// > **Note** `accountId` provider configuration property is required for this resource to work.
//
// ## Example Usage
//
// # Listing all workspaces in
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
//			all, err := databricks.LookupMwsCredentials(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("allMwsCredentials", all.Ids)
//			return nil
//		})
//	}
//
// ```
// ## Related Resources
//
// The following resources are used in the same context:
//
// * Provisioning Databricks on AWS guide.
// * MwsCustomerManagedKeys to configure KMS keys for new workspaces within AWS.
// * MwsLogDelivery to configure delivery of [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
// * MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS.
// * MwsStorageConfigurations to configure root bucket new workspaces within AWS.
// * MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
func LookupMwsCredentials(ctx *pulumi.Context, args *LookupMwsCredentialsArgs, opts ...pulumi.InvokeOption) (*LookupMwsCredentialsResult, error) {
	var rv LookupMwsCredentialsResult
	err := ctx.Invoke("databricks:index/getMwsCredentials:getMwsCredentials", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMwsCredentials.
type LookupMwsCredentialsArgs struct {
	// name-to-id map for all of the credentials in the account
	Ids map[string]interface{} `pulumi:"ids"`
}

// A collection of values returned by getMwsCredentials.
type LookupMwsCredentialsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// name-to-id map for all of the credentials in the account
	Ids map[string]interface{} `pulumi:"ids"`
}

func LookupMwsCredentialsOutput(ctx *pulumi.Context, args LookupMwsCredentialsOutputArgs, opts ...pulumi.InvokeOption) LookupMwsCredentialsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupMwsCredentialsResult, error) {
			args := v.(LookupMwsCredentialsArgs)
			r, err := LookupMwsCredentials(ctx, &args, opts...)
			var s LookupMwsCredentialsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupMwsCredentialsResultOutput)
}

// A collection of arguments for invoking getMwsCredentials.
type LookupMwsCredentialsOutputArgs struct {
	// name-to-id map for all of the credentials in the account
	Ids pulumi.MapInput `pulumi:"ids"`
}

func (LookupMwsCredentialsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMwsCredentialsArgs)(nil)).Elem()
}

// A collection of values returned by getMwsCredentials.
type LookupMwsCredentialsResultOutput struct{ *pulumi.OutputState }

func (LookupMwsCredentialsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMwsCredentialsResult)(nil)).Elem()
}

func (o LookupMwsCredentialsResultOutput) ToLookupMwsCredentialsResultOutput() LookupMwsCredentialsResultOutput {
	return o
}

func (o LookupMwsCredentialsResultOutput) ToLookupMwsCredentialsResultOutputWithContext(ctx context.Context) LookupMwsCredentialsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupMwsCredentialsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMwsCredentialsResult) string { return v.Id }).(pulumi.StringOutput)
}

// name-to-id map for all of the credentials in the account
func (o LookupMwsCredentialsResultOutput) Ids() pulumi.MapOutput {
	return o.ApplyT(func(v LookupMwsCredentialsResult) map[string]interface{} { return v.Ids }).(pulumi.MapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupMwsCredentialsResultOutput{})
}
