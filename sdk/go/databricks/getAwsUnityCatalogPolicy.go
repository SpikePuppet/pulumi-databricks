// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Note** This resource has an evolving API, which may change in future versions of the provider. Please always consult [latest documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default) in case of any questions.
//
// This data source constructs necessary AWS Unity Catalog policy for you, which is based on [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// this, err := databricks.GetAwsUnityCatalogPolicy(ctx, &databricks.GetAwsUnityCatalogPolicyArgs{
// AwsAccountId: awsAccountId,
// BucketName: "databricks-bucket",
// RoleName: "databricks-role",
// KmsName: pulumi.StringRef("databricks-kms"),
// }, nil);
// if err != nil {
// return err
// }
// passroleForUc, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Effect: pulumi.StringRef("Allow"),
// Actions: []string{
// "sts:AssumeRole",
// },
// Principals: []iam.GetPolicyDocumentStatementPrincipal{
// {
// Identifiers: []string{
// "arn:aws:iam::414351767826:role/unity-catalog-prod-UCMasterRole-14S5ZJVKOTYTL",
// },
// Type: "AWS",
// },
// },
// Conditions: []iam.GetPolicyDocumentStatementCondition{
// {
// Test: "StringEquals",
// Variable: "sts:ExternalId",
// Values: interface{}{
// databricksAccountId,
// },
// },
// },
// },
// {
// Sid: pulumi.StringRef("ExplicitSelfRoleAssumption"),
// Effect: pulumi.StringRef("Allow"),
// Actions: []string{
// "sts:AssumeRole",
// },
// Principals: []iam.GetPolicyDocumentStatementPrincipal{
// {
// Type: "AWS",
// Identifiers: []string{
// fmt.Sprintf("arn:aws:iam::%v:root", awsAccountId),
// },
// },
// },
// Conditions: []iam.GetPolicyDocumentStatementCondition{
// {
// Test: "ArnLike",
// Variable: "aws:PrincipalArn",
// Values: []string{
// fmt.Sprintf("arn:aws:iam::%v:role/%v-uc-access", awsAccountId, prefix),
// },
// },
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// unityMetastore, err := iam.NewPolicy(ctx, "unity_metastore", &iam.PolicyArgs{
// Name: pulumi.String(fmt.Sprintf("%v-unity-catalog-metastore-access-iam-policy", prefix)),
// Policy: pulumi.String(this.Json),
// })
// if err != nil {
// return err
// }
// _, err = iam.NewRole(ctx, "metastore_data_access", &iam.RoleArgs{
// Name: pulumi.String(fmt.Sprintf("%v-uc-access", prefix)),
// AssumeRolePolicy: pulumi.String(passroleForUc.Json),
// ManagedPolicyArns: pulumi.StringArray{
// unityMetastore.Arn,
// },
// })
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
func GetAwsUnityCatalogPolicy(ctx *pulumi.Context, args *GetAwsUnityCatalogPolicyArgs, opts ...pulumi.InvokeOption) (*GetAwsUnityCatalogPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAwsUnityCatalogPolicyResult
	err := ctx.Invoke("databricks:index/getAwsUnityCatalogPolicy:getAwsUnityCatalogPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAwsUnityCatalogPolicy.
type GetAwsUnityCatalogPolicyArgs struct {
	// The Account ID of the current AWS account (not your Databricks account).
	AwsAccountId string `pulumi:"awsAccountId"`
	// The name of the S3 bucket used as root storage location for [managed tables](https://docs.databricks.com/data-governance/unity-catalog/index.html#managed-table) in Unity Catalog.
	BucketName string `pulumi:"bucketName"`
	// If encryption is enabled, provide the name of the KMS key that encrypts the S3 bucket contents. If encryption is disabled, do not provide this argument.
	KmsName *string `pulumi:"kmsName"`
	// The name of the AWS IAM role that you created in the previous step in the [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
	RoleName string `pulumi:"roleName"`
}

// A collection of values returned by getAwsUnityCatalogPolicy.
type GetAwsUnityCatalogPolicyResult struct {
	AwsAccountId string `pulumi:"awsAccountId"`
	BucketName   string `pulumi:"bucketName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// AWS IAM Policy JSON document
	Json     string  `pulumi:"json"`
	KmsName  *string `pulumi:"kmsName"`
	RoleName string  `pulumi:"roleName"`
}

func GetAwsUnityCatalogPolicyOutput(ctx *pulumi.Context, args GetAwsUnityCatalogPolicyOutputArgs, opts ...pulumi.InvokeOption) GetAwsUnityCatalogPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAwsUnityCatalogPolicyResult, error) {
			args := v.(GetAwsUnityCatalogPolicyArgs)
			r, err := GetAwsUnityCatalogPolicy(ctx, &args, opts...)
			var s GetAwsUnityCatalogPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAwsUnityCatalogPolicyResultOutput)
}

// A collection of arguments for invoking getAwsUnityCatalogPolicy.
type GetAwsUnityCatalogPolicyOutputArgs struct {
	// The Account ID of the current AWS account (not your Databricks account).
	AwsAccountId pulumi.StringInput `pulumi:"awsAccountId"`
	// The name of the S3 bucket used as root storage location for [managed tables](https://docs.databricks.com/data-governance/unity-catalog/index.html#managed-table) in Unity Catalog.
	BucketName pulumi.StringInput `pulumi:"bucketName"`
	// If encryption is enabled, provide the name of the KMS key that encrypts the S3 bucket contents. If encryption is disabled, do not provide this argument.
	KmsName pulumi.StringPtrInput `pulumi:"kmsName"`
	// The name of the AWS IAM role that you created in the previous step in the [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
	RoleName pulumi.StringInput `pulumi:"roleName"`
}

func (GetAwsUnityCatalogPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAwsUnityCatalogPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getAwsUnityCatalogPolicy.
type GetAwsUnityCatalogPolicyResultOutput struct{ *pulumi.OutputState }

func (GetAwsUnityCatalogPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAwsUnityCatalogPolicyResult)(nil)).Elem()
}

func (o GetAwsUnityCatalogPolicyResultOutput) ToGetAwsUnityCatalogPolicyResultOutput() GetAwsUnityCatalogPolicyResultOutput {
	return o
}

func (o GetAwsUnityCatalogPolicyResultOutput) ToGetAwsUnityCatalogPolicyResultOutputWithContext(ctx context.Context) GetAwsUnityCatalogPolicyResultOutput {
	return o
}

func (o GetAwsUnityCatalogPolicyResultOutput) AwsAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsUnityCatalogPolicyResult) string { return v.AwsAccountId }).(pulumi.StringOutput)
}

func (o GetAwsUnityCatalogPolicyResultOutput) BucketName() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsUnityCatalogPolicyResult) string { return v.BucketName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAwsUnityCatalogPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsUnityCatalogPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// AWS IAM Policy JSON document
func (o GetAwsUnityCatalogPolicyResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsUnityCatalogPolicyResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o GetAwsUnityCatalogPolicyResultOutput) KmsName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAwsUnityCatalogPolicyResult) *string { return v.KmsName }).(pulumi.StringPtrOutput)
}

func (o GetAwsUnityCatalogPolicyResultOutput) RoleName() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsUnityCatalogPolicyResult) string { return v.RoleName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAwsUnityCatalogPolicyResultOutput{})
}
