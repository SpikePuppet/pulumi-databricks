// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount. The following example demonstrates how to create an instance profile and create a cluster with it. When creating a new `InstanceProfile`, Databricks validates that it has sufficient permissions to launch instances with the instance profile. This validation uses AWS dry-run mode for the [AWS EC2 RunInstances API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html).
//
// > **Note** Please switch to StorageCredential with Unity Catalog to manage storage credentials, which provides a better and faster way for managing credential security.
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			// Role that you've specified on https://accounts.cloud.databricks.com/#aws
//			crossaccountRoleName := cfg.Require("crossaccountRoleName")
//			assumeRoleForEc2, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Effect: pulumi.StringRef("Allow"),
//						Actions: []string{
//							"sts:AssumeRole",
//						},
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Identifiers: []string{
//									"ec2.amazonaws.com",
//								},
//								Type: "Service",
//							},
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			roleForS3Access, err := iam.NewRole(ctx, "role_for_s3_access", &iam.RoleArgs{
//				Name:             pulumi.String("shared-ec2-role-for-s3"),
//				Description:      pulumi.String("Role for shared access"),
//				AssumeRolePolicy: pulumi.String(assumeRoleForEc2.Json),
//			})
//			if err != nil {
//				return err
//			}
//			passRoleForS3Access := iam.GetPolicyDocumentOutput(ctx, iam.GetPolicyDocumentOutputArgs{
//				Statements: iam.GetPolicyDocumentStatementArray{
//					&iam.GetPolicyDocumentStatementArgs{
//						Effect: pulumi.String("Allow"),
//						Actions: pulumi.StringArray{
//							pulumi.String("iam:PassRole"),
//						},
//						Resources: pulumi.StringArray{
//							roleForS3Access.Arn,
//						},
//					},
//				},
//			}, nil)
//			passRoleForS3AccessPolicy, err := iam.NewPolicy(ctx, "pass_role_for_s3_access", &iam.PolicyArgs{
//				Name: pulumi.String("shared-pass-role-for-s3-access"),
//				Path: pulumi.String("/"),
//				Policy: passRoleForS3Access.ApplyT(func(passRoleForS3Access iam.GetPolicyDocumentResult) (*string, error) {
//					return &passRoleForS3Access.Json, nil
//				}).(pulumi.StringPtrOutput),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = iam.NewRolePolicyAttachment(ctx, "cross_account", &iam.RolePolicyAttachmentArgs{
//				PolicyArn: passRoleForS3AccessPolicy.Arn,
//				Role:      pulumi.String(crossaccountRoleName),
//			})
//			if err != nil {
//				return err
//			}
//			shared, err := iam.NewInstanceProfile(ctx, "shared", &iam.InstanceProfileArgs{
//				Name: pulumi.String("shared-instance-profile"),
//				Role: roleForS3Access.Name,
//			})
//			if err != nil {
//				return err
//			}
//			sharedInstanceProfile, err := databricks.NewInstanceProfile(ctx, "shared", &databricks.InstanceProfileArgs{
//				InstanceProfileArn: shared.Arn,
//			})
//			if err != nil {
//				return err
//			}
//			latest, err := databricks.GetSparkVersion(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			smallest, err := databricks.GetNodeType(ctx, &databricks.GetNodeTypeArgs{
//				LocalDisk: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewCluster(ctx, "this", &databricks.ClusterArgs{
//				ClusterName:            pulumi.String("Shared Autoscaling"),
//				SparkVersion:           pulumi.String(latest.Id),
//				NodeTypeId:             pulumi.String(smallest.Id),
//				AutoterminationMinutes: pulumi.Int(20),
//				Autoscale: &databricks.ClusterAutoscaleArgs{
//					MinWorkers: pulumi.Int(1),
//					MaxWorkers: pulumi.Int(50),
//				},
//				AwsAttributes: &databricks.ClusterAwsAttributesArgs{
//					InstanceProfileArn:  sharedInstanceProfile.ID(),
//					Availability:        pulumi.String("SPOT"),
//					ZoneId:              pulumi.String("us-east-1"),
//					FirstOnDemand:       pulumi.Int(1),
//					SpotBidPricePercent: pulumi.Int(100),
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
// <!--End PulumiCodeChooser -->
//
// ## Usage with Cluster Policies
//
// It is advised to keep all common configurations in Cluster Policies to maintain control of the environments launched, so `Cluster` above could be replaced with `ClusterPolicy`:
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"aws_attributes.instance_profile_arn": map[string]interface{}{
//					"type":  "fixed",
//					"value": shared.Arn,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = databricks.NewClusterPolicy(ctx, "this", &databricks.ClusterPolicyArgs{
//				Name:       pulumi.String("Policy with predefined instance profile"),
//				Definition: pulumi.String(json0),
//			})
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
// ## Granting access to all users
//
// You can make instance profile available to all users by associating it with the special group called `users` through Group data source.
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
//			this, err := databricks.NewInstanceProfile(ctx, "this", &databricks.InstanceProfileArgs{
//				InstanceProfileArn: pulumi.Any(shared.Arn),
//			})
//			if err != nil {
//				return err
//			}
//			users, err := databricks.LookupGroup(ctx, &databricks.LookupGroupArgs{
//				DisplayName: "users",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewGroupInstanceProfile(ctx, "all", &databricks.GroupInstanceProfileArgs{
//				GroupId:           pulumi.String(users.Id),
//				InstanceProfileId: this.ID(),
//			})
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
// ## Usage with Databricks SQL serverless
//
// When the instance profile ARN and its associated IAM role ARN don't match and the instance profile is intended for use with Databricks SQL serverless, the `iamRoleArn` parameter can be specified.
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			sqlServerlessAssumeRole, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Actions: []string{
//							"sts:AssumeRole",
//						},
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "AWS",
//								Identifiers: []string{
//									"arn:aws:iam::790110701330:role/serverless-customer-resource-role",
//								},
//							},
//						},
//						Conditions: []iam.GetPolicyDocumentStatementCondition{
//							{
//								Test:     "StringEquals",
//								Variable: "sts:ExternalID",
//								Values: []string{
//									"databricks-serverless-<YOUR_WORKSPACE_ID1>",
//									"databricks-serverless-<YOUR_WORKSPACE_ID2>",
//								},
//							},
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			this, err := iam.NewRole(ctx, "this", &iam.RoleArgs{
//				Name:             pulumi.String("my-databricks-sql-serverless-role"),
//				AssumeRolePolicy: pulumi.String(sqlServerlessAssumeRole.Json),
//			})
//			if err != nil {
//				return err
//			}
//			thisInstanceProfile, err := iam.NewInstanceProfile(ctx, "this", &iam.InstanceProfileArgs{
//				Name: pulumi.String("my-databricks-sql-serverless-instance-profile"),
//				Role: this.Name,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewInstanceProfile(ctx, "this", &databricks.InstanceProfileArgs{
//				InstanceProfileArn: thisInstanceProfile.Arn,
//				IamRoleArn:         this.Arn,
//			})
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
// ## Import
//
// # The resource instance profile can be imported using the ARN of it
//
// bash
//
// ```sh
// $ pulumi import databricks:index/instanceProfile:InstanceProfile this <instance-profile-arn>
// ```
type InstanceProfile struct {
	pulumi.CustomResourceState

	// The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::<account-id>:role/<name>`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
	IamRoleArn pulumi.StringPtrOutput `pulumi:"iamRoleArn"`
	// `ARN` attribute of `awsIamInstanceProfile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
	InstanceProfileArn pulumi.StringOutput `pulumi:"instanceProfileArn"`
	// Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
	IsMetaInstanceProfile pulumi.BoolPtrOutput `pulumi:"isMetaInstanceProfile"`
	// **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. "Your requested instance type is not supported in your requested availability zone"), you can pass this flag to skip the validation and forcibly add the instance profile.
	SkipValidation pulumi.BoolOutput `pulumi:"skipValidation"`
}

// NewInstanceProfile registers a new resource with the given unique name, arguments, and options.
func NewInstanceProfile(ctx *pulumi.Context,
	name string, args *InstanceProfileArgs, opts ...pulumi.ResourceOption) (*InstanceProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceProfileArn == nil {
		return nil, errors.New("invalid value for required argument 'InstanceProfileArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InstanceProfile
	err := ctx.RegisterResource("databricks:index/instanceProfile:InstanceProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceProfile gets an existing InstanceProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceProfileState, opts ...pulumi.ResourceOption) (*InstanceProfile, error) {
	var resource InstanceProfile
	err := ctx.ReadResource("databricks:index/instanceProfile:InstanceProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceProfile resources.
type instanceProfileState struct {
	// The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::<account-id>:role/<name>`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
	IamRoleArn *string `pulumi:"iamRoleArn"`
	// `ARN` attribute of `awsIamInstanceProfile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
	InstanceProfileArn *string `pulumi:"instanceProfileArn"`
	// Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
	IsMetaInstanceProfile *bool `pulumi:"isMetaInstanceProfile"`
	// **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. "Your requested instance type is not supported in your requested availability zone"), you can pass this flag to skip the validation and forcibly add the instance profile.
	SkipValidation *bool `pulumi:"skipValidation"`
}

type InstanceProfileState struct {
	// The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::<account-id>:role/<name>`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
	IamRoleArn pulumi.StringPtrInput
	// `ARN` attribute of `awsIamInstanceProfile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
	InstanceProfileArn pulumi.StringPtrInput
	// Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
	IsMetaInstanceProfile pulumi.BoolPtrInput
	// **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. "Your requested instance type is not supported in your requested availability zone"), you can pass this flag to skip the validation and forcibly add the instance profile.
	SkipValidation pulumi.BoolPtrInput
}

func (InstanceProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceProfileState)(nil)).Elem()
}

type instanceProfileArgs struct {
	// The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::<account-id>:role/<name>`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
	IamRoleArn *string `pulumi:"iamRoleArn"`
	// `ARN` attribute of `awsIamInstanceProfile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
	InstanceProfileArn string `pulumi:"instanceProfileArn"`
	// Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
	IsMetaInstanceProfile *bool `pulumi:"isMetaInstanceProfile"`
	// **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. "Your requested instance type is not supported in your requested availability zone"), you can pass this flag to skip the validation and forcibly add the instance profile.
	SkipValidation *bool `pulumi:"skipValidation"`
}

// The set of arguments for constructing a InstanceProfile resource.
type InstanceProfileArgs struct {
	// The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::<account-id>:role/<name>`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
	IamRoleArn pulumi.StringPtrInput
	// `ARN` attribute of `awsIamInstanceProfile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
	InstanceProfileArn pulumi.StringInput
	// Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
	IsMetaInstanceProfile pulumi.BoolPtrInput
	// **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. "Your requested instance type is not supported in your requested availability zone"), you can pass this flag to skip the validation and forcibly add the instance profile.
	SkipValidation pulumi.BoolPtrInput
}

func (InstanceProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceProfileArgs)(nil)).Elem()
}

type InstanceProfileInput interface {
	pulumi.Input

	ToInstanceProfileOutput() InstanceProfileOutput
	ToInstanceProfileOutputWithContext(ctx context.Context) InstanceProfileOutput
}

func (*InstanceProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceProfile)(nil)).Elem()
}

func (i *InstanceProfile) ToInstanceProfileOutput() InstanceProfileOutput {
	return i.ToInstanceProfileOutputWithContext(context.Background())
}

func (i *InstanceProfile) ToInstanceProfileOutputWithContext(ctx context.Context) InstanceProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceProfileOutput)
}

// InstanceProfileArrayInput is an input type that accepts InstanceProfileArray and InstanceProfileArrayOutput values.
// You can construct a concrete instance of `InstanceProfileArrayInput` via:
//
//	InstanceProfileArray{ InstanceProfileArgs{...} }
type InstanceProfileArrayInput interface {
	pulumi.Input

	ToInstanceProfileArrayOutput() InstanceProfileArrayOutput
	ToInstanceProfileArrayOutputWithContext(context.Context) InstanceProfileArrayOutput
}

type InstanceProfileArray []InstanceProfileInput

func (InstanceProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceProfile)(nil)).Elem()
}

func (i InstanceProfileArray) ToInstanceProfileArrayOutput() InstanceProfileArrayOutput {
	return i.ToInstanceProfileArrayOutputWithContext(context.Background())
}

func (i InstanceProfileArray) ToInstanceProfileArrayOutputWithContext(ctx context.Context) InstanceProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceProfileArrayOutput)
}

// InstanceProfileMapInput is an input type that accepts InstanceProfileMap and InstanceProfileMapOutput values.
// You can construct a concrete instance of `InstanceProfileMapInput` via:
//
//	InstanceProfileMap{ "key": InstanceProfileArgs{...} }
type InstanceProfileMapInput interface {
	pulumi.Input

	ToInstanceProfileMapOutput() InstanceProfileMapOutput
	ToInstanceProfileMapOutputWithContext(context.Context) InstanceProfileMapOutput
}

type InstanceProfileMap map[string]InstanceProfileInput

func (InstanceProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceProfile)(nil)).Elem()
}

func (i InstanceProfileMap) ToInstanceProfileMapOutput() InstanceProfileMapOutput {
	return i.ToInstanceProfileMapOutputWithContext(context.Background())
}

func (i InstanceProfileMap) ToInstanceProfileMapOutputWithContext(ctx context.Context) InstanceProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceProfileMapOutput)
}

type InstanceProfileOutput struct{ *pulumi.OutputState }

func (InstanceProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceProfile)(nil)).Elem()
}

func (o InstanceProfileOutput) ToInstanceProfileOutput() InstanceProfileOutput {
	return o
}

func (o InstanceProfileOutput) ToInstanceProfileOutputWithContext(ctx context.Context) InstanceProfileOutput {
	return o
}

// The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::<account-id>:role/<name>`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
func (o InstanceProfileOutput) IamRoleArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InstanceProfile) pulumi.StringPtrOutput { return v.IamRoleArn }).(pulumi.StringPtrOutput)
}

// `ARN` attribute of `awsIamInstanceProfile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
func (o InstanceProfileOutput) InstanceProfileArn() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceProfile) pulumi.StringOutput { return v.InstanceProfileArn }).(pulumi.StringOutput)
}

// Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
func (o InstanceProfileOutput) IsMetaInstanceProfile() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *InstanceProfile) pulumi.BoolPtrOutput { return v.IsMetaInstanceProfile }).(pulumi.BoolPtrOutput)
}

// **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. "Your requested instance type is not supported in your requested availability zone"), you can pass this flag to skip the validation and forcibly add the instance profile.
func (o InstanceProfileOutput) SkipValidation() pulumi.BoolOutput {
	return o.ApplyT(func(v *InstanceProfile) pulumi.BoolOutput { return v.SkipValidation }).(pulumi.BoolOutput)
}

type InstanceProfileArrayOutput struct{ *pulumi.OutputState }

func (InstanceProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceProfile)(nil)).Elem()
}

func (o InstanceProfileArrayOutput) ToInstanceProfileArrayOutput() InstanceProfileArrayOutput {
	return o
}

func (o InstanceProfileArrayOutput) ToInstanceProfileArrayOutputWithContext(ctx context.Context) InstanceProfileArrayOutput {
	return o
}

func (o InstanceProfileArrayOutput) Index(i pulumi.IntInput) InstanceProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceProfile {
		return vs[0].([]*InstanceProfile)[vs[1].(int)]
	}).(InstanceProfileOutput)
}

type InstanceProfileMapOutput struct{ *pulumi.OutputState }

func (InstanceProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceProfile)(nil)).Elem()
}

func (o InstanceProfileMapOutput) ToInstanceProfileMapOutput() InstanceProfileMapOutput {
	return o
}

func (o InstanceProfileMapOutput) ToInstanceProfileMapOutputWithContext(ctx context.Context) InstanceProfileMapOutput {
	return o
}

func (o InstanceProfileMapOutput) MapIndex(k pulumi.StringInput) InstanceProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceProfile {
		return vs[0].(map[string]*InstanceProfile)[vs[1].(string)]
	}).(InstanceProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceProfileInput)(nil)).Elem(), &InstanceProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceProfileArrayInput)(nil)).Elem(), InstanceProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceProfileMapInput)(nil)).Elem(), InstanceProfileMap{})
	pulumi.RegisterOutputType(InstanceProfileOutput{})
	pulumi.RegisterOutputType(InstanceProfileArrayOutput{})
	pulumi.RegisterOutputType(InstanceProfileMapOutput{})
}
