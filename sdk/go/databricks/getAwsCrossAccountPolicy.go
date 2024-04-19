// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Note** This data source could be only used with account-level provider!
//
// This data source constructs necessary AWS cross-account policy for you, which is based on [official documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default).
//
// ## Example Usage
//
// For more detailed usage please see getAwsAssumeRolePolicy or databricksAwsS3Mount pages.
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
//			_, err := databricks.GetAwsCrossAccountPolicy(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
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
// * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide
// * getAwsAssumeRolePolicy data to construct the necessary AWS STS assume role policy.
// * getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
// * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
func GetAwsCrossAccountPolicy(ctx *pulumi.Context, args *GetAwsCrossAccountPolicyArgs, opts ...pulumi.InvokeOption) (*GetAwsCrossAccountPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAwsCrossAccountPolicyResult
	err := ctx.Invoke("databricks:index/getAwsCrossAccountPolicy:getAwsCrossAccountPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAwsCrossAccountPolicy.
type GetAwsCrossAccountPolicyArgs struct {
	// — Your AWS account ID, which is a number.
	AwsAccountId *string `pulumi:"awsAccountId"`
	// List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
	// The below arguments are only valid for `restricted` policy type
	PassRoles []string `pulumi:"passRoles"`
	// The type of cross account policy to generated: `managed` for Databricks-managed VPC and `customer` for customer-managed VPC, `restricted` for customer-managed VPC with policy restrictions
	PolicyType *string `pulumi:"policyType"`
	// — AWS Region name for your VPC deployment, for example `us-west-2`.
	Region *string `pulumi:"region"`
	// — ID of your AWS security group. When you add a security group restriction, you cannot reuse the cross-account IAM role or reference a credentials ID (`credentialsId`) for any other workspaces. For those other workspaces, you must create separate roles, policies, and credentials objects.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// — ID of the AWS VPC where you want to launch workspaces.
	VpcId *string `pulumi:"vpcId"`
}

// A collection of values returned by getAwsCrossAccountPolicy.
type GetAwsCrossAccountPolicyResult struct {
	AwsAccountId *string `pulumi:"awsAccountId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// AWS IAM Policy JSON document
	Json            string   `pulumi:"json"`
	PassRoles       []string `pulumi:"passRoles"`
	PolicyType      *string  `pulumi:"policyType"`
	Region          *string  `pulumi:"region"`
	SecurityGroupId *string  `pulumi:"securityGroupId"`
	VpcId           *string  `pulumi:"vpcId"`
}

func GetAwsCrossAccountPolicyOutput(ctx *pulumi.Context, args GetAwsCrossAccountPolicyOutputArgs, opts ...pulumi.InvokeOption) GetAwsCrossAccountPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAwsCrossAccountPolicyResult, error) {
			args := v.(GetAwsCrossAccountPolicyArgs)
			r, err := GetAwsCrossAccountPolicy(ctx, &args, opts...)
			var s GetAwsCrossAccountPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAwsCrossAccountPolicyResultOutput)
}

// A collection of arguments for invoking getAwsCrossAccountPolicy.
type GetAwsCrossAccountPolicyOutputArgs struct {
	// — Your AWS account ID, which is a number.
	AwsAccountId pulumi.StringPtrInput `pulumi:"awsAccountId"`
	// List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
	// The below arguments are only valid for `restricted` policy type
	PassRoles pulumi.StringArrayInput `pulumi:"passRoles"`
	// The type of cross account policy to generated: `managed` for Databricks-managed VPC and `customer` for customer-managed VPC, `restricted` for customer-managed VPC with policy restrictions
	PolicyType pulumi.StringPtrInput `pulumi:"policyType"`
	// — AWS Region name for your VPC deployment, for example `us-west-2`.
	Region pulumi.StringPtrInput `pulumi:"region"`
	// — ID of your AWS security group. When you add a security group restriction, you cannot reuse the cross-account IAM role or reference a credentials ID (`credentialsId`) for any other workspaces. For those other workspaces, you must create separate roles, policies, and credentials objects.
	SecurityGroupId pulumi.StringPtrInput `pulumi:"securityGroupId"`
	// — ID of the AWS VPC where you want to launch workspaces.
	VpcId pulumi.StringPtrInput `pulumi:"vpcId"`
}

func (GetAwsCrossAccountPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAwsCrossAccountPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getAwsCrossAccountPolicy.
type GetAwsCrossAccountPolicyResultOutput struct{ *pulumi.OutputState }

func (GetAwsCrossAccountPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAwsCrossAccountPolicyResult)(nil)).Elem()
}

func (o GetAwsCrossAccountPolicyResultOutput) ToGetAwsCrossAccountPolicyResultOutput() GetAwsCrossAccountPolicyResultOutput {
	return o
}

func (o GetAwsCrossAccountPolicyResultOutput) ToGetAwsCrossAccountPolicyResultOutputWithContext(ctx context.Context) GetAwsCrossAccountPolicyResultOutput {
	return o
}

func (o GetAwsCrossAccountPolicyResultOutput) AwsAccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAwsCrossAccountPolicyResult) *string { return v.AwsAccountId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAwsCrossAccountPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsCrossAccountPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// AWS IAM Policy JSON document
func (o GetAwsCrossAccountPolicyResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsCrossAccountPolicyResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o GetAwsCrossAccountPolicyResultOutput) PassRoles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAwsCrossAccountPolicyResult) []string { return v.PassRoles }).(pulumi.StringArrayOutput)
}

func (o GetAwsCrossAccountPolicyResultOutput) PolicyType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAwsCrossAccountPolicyResult) *string { return v.PolicyType }).(pulumi.StringPtrOutput)
}

func (o GetAwsCrossAccountPolicyResultOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAwsCrossAccountPolicyResult) *string { return v.Region }).(pulumi.StringPtrOutput)
}

func (o GetAwsCrossAccountPolicyResultOutput) SecurityGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAwsCrossAccountPolicyResult) *string { return v.SecurityGroupId }).(pulumi.StringPtrOutput)
}

func (o GetAwsCrossAccountPolicyResultOutput) VpcId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAwsCrossAccountPolicyResult) *string { return v.VpcId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAwsCrossAccountPolicyResultOutput{})
}
