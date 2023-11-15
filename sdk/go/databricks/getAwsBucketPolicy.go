// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This datasource configures a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
//
// ## Related Resources
//
// The following resources are used in the same context:
//
// * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide.
// * End to end workspace management guide
// * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
// * Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
func GetAwsBucketPolicy(ctx *pulumi.Context, args *GetAwsBucketPolicyArgs, opts ...pulumi.InvokeOption) (*GetAwsBucketPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAwsBucketPolicyResult
	err := ctx.Invoke("databricks:index/getAwsBucketPolicy:getAwsBucketPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAwsBucketPolicy.
type GetAwsBucketPolicyArgs struct {
	// AWS S3 Bucket name for which to generate the policy document.
	Bucket              string  `pulumi:"bucket"`
	DatabricksAccountId *string `pulumi:"databricksAccountId"`
	// Your Databricks E2 account ID. Used to generate  restrictive IAM policies that will increase the security of your root bucket
	DatabricksE2AccountId *string `pulumi:"databricksE2AccountId"`
	// Data access role that can have full access for this bucket
	FullAccessRole *string `pulumi:"fullAccessRole"`
}

// A collection of values returned by getAwsBucketPolicy.
type GetAwsBucketPolicyResult struct {
	Bucket                string  `pulumi:"bucket"`
	DatabricksAccountId   *string `pulumi:"databricksAccountId"`
	DatabricksE2AccountId *string `pulumi:"databricksE2AccountId"`
	FullAccessRole        *string `pulumi:"fullAccessRole"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Read-only) AWS IAM Policy JSON document to grant Databricks full access to bucket.
	Json string `pulumi:"json"`
}

func GetAwsBucketPolicyOutput(ctx *pulumi.Context, args GetAwsBucketPolicyOutputArgs, opts ...pulumi.InvokeOption) GetAwsBucketPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAwsBucketPolicyResult, error) {
			args := v.(GetAwsBucketPolicyArgs)
			r, err := GetAwsBucketPolicy(ctx, &args, opts...)
			var s GetAwsBucketPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAwsBucketPolicyResultOutput)
}

// A collection of arguments for invoking getAwsBucketPolicy.
type GetAwsBucketPolicyOutputArgs struct {
	// AWS S3 Bucket name for which to generate the policy document.
	Bucket              pulumi.StringInput    `pulumi:"bucket"`
	DatabricksAccountId pulumi.StringPtrInput `pulumi:"databricksAccountId"`
	// Your Databricks E2 account ID. Used to generate  restrictive IAM policies that will increase the security of your root bucket
	DatabricksE2AccountId pulumi.StringPtrInput `pulumi:"databricksE2AccountId"`
	// Data access role that can have full access for this bucket
	FullAccessRole pulumi.StringPtrInput `pulumi:"fullAccessRole"`
}

func (GetAwsBucketPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAwsBucketPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getAwsBucketPolicy.
type GetAwsBucketPolicyResultOutput struct{ *pulumi.OutputState }

func (GetAwsBucketPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAwsBucketPolicyResult)(nil)).Elem()
}

func (o GetAwsBucketPolicyResultOutput) ToGetAwsBucketPolicyResultOutput() GetAwsBucketPolicyResultOutput {
	return o
}

func (o GetAwsBucketPolicyResultOutput) ToGetAwsBucketPolicyResultOutputWithContext(ctx context.Context) GetAwsBucketPolicyResultOutput {
	return o
}

func (o GetAwsBucketPolicyResultOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsBucketPolicyResult) string { return v.Bucket }).(pulumi.StringOutput)
}

func (o GetAwsBucketPolicyResultOutput) DatabricksAccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAwsBucketPolicyResult) *string { return v.DatabricksAccountId }).(pulumi.StringPtrOutput)
}

func (o GetAwsBucketPolicyResultOutput) DatabricksE2AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAwsBucketPolicyResult) *string { return v.DatabricksE2AccountId }).(pulumi.StringPtrOutput)
}

func (o GetAwsBucketPolicyResultOutput) FullAccessRole() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAwsBucketPolicyResult) *string { return v.FullAccessRole }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAwsBucketPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsBucketPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Read-only) AWS IAM Policy JSON document to grant Databricks full access to bucket.
func (o GetAwsBucketPolicyResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsBucketPolicyResult) string { return v.Json }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAwsBucketPolicyResultOutput{})
}
