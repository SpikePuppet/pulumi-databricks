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

// > **Deprecated** Please rewrite with databricks_user_role. This resource will be removed in v0.5.x
//
// This resource allows you to attach InstanceProfile (AWS) to databricks_user.
//
// ## Example Usage
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
//			instanceProfile, err := databricks.NewInstanceProfile(ctx, "instance_profile", &databricks.InstanceProfileArgs{
//				InstanceProfileArn: pulumi.String("my_instance_profile_arn"),
//			})
//			if err != nil {
//				return err
//			}
//			myUser, err := databricks.NewUser(ctx, "my_user", &databricks.UserArgs{
//				UserName: pulumi.String("me@example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewUserInstanceProfile(ctx, "my_user_instance_profile", &databricks.UserInstanceProfileArgs{
//				UserId:            myUser.ID(),
//				InstanceProfileId: instanceProfile.ID(),
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
// ## Related Resources
//
// The following resources are often used in the same context:
//
// * End to end workspace management guide.
// * GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
// * GroupMember to attach users and groups as group members.
// * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
// * User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to Group within the workspace.
// * User data to retrieve information about databricks_user.
//
// ## Import
//
// -> **Note** Importing this resource is not currently supported.
type UserInstanceProfile struct {
	pulumi.CustomResourceState

	// This is the id of the instance profile resource.
	InstanceProfileId pulumi.StringOutput `pulumi:"instanceProfileId"`
	// This is the id of the user resource.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewUserInstanceProfile registers a new resource with the given unique name, arguments, and options.
func NewUserInstanceProfile(ctx *pulumi.Context,
	name string, args *UserInstanceProfileArgs, opts ...pulumi.ResourceOption) (*UserInstanceProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceProfileId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceProfileId'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UserInstanceProfile
	err := ctx.RegisterResource("databricks:index/userInstanceProfile:UserInstanceProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserInstanceProfile gets an existing UserInstanceProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserInstanceProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserInstanceProfileState, opts ...pulumi.ResourceOption) (*UserInstanceProfile, error) {
	var resource UserInstanceProfile
	err := ctx.ReadResource("databricks:index/userInstanceProfile:UserInstanceProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserInstanceProfile resources.
type userInstanceProfileState struct {
	// This is the id of the instance profile resource.
	InstanceProfileId *string `pulumi:"instanceProfileId"`
	// This is the id of the user resource.
	UserId *string `pulumi:"userId"`
}

type UserInstanceProfileState struct {
	// This is the id of the instance profile resource.
	InstanceProfileId pulumi.StringPtrInput
	// This is the id of the user resource.
	UserId pulumi.StringPtrInput
}

func (UserInstanceProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*userInstanceProfileState)(nil)).Elem()
}

type userInstanceProfileArgs struct {
	// This is the id of the instance profile resource.
	InstanceProfileId string `pulumi:"instanceProfileId"`
	// This is the id of the user resource.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a UserInstanceProfile resource.
type UserInstanceProfileArgs struct {
	// This is the id of the instance profile resource.
	InstanceProfileId pulumi.StringInput
	// This is the id of the user resource.
	UserId pulumi.StringInput
}

func (UserInstanceProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userInstanceProfileArgs)(nil)).Elem()
}

type UserInstanceProfileInput interface {
	pulumi.Input

	ToUserInstanceProfileOutput() UserInstanceProfileOutput
	ToUserInstanceProfileOutputWithContext(ctx context.Context) UserInstanceProfileOutput
}

func (*UserInstanceProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**UserInstanceProfile)(nil)).Elem()
}

func (i *UserInstanceProfile) ToUserInstanceProfileOutput() UserInstanceProfileOutput {
	return i.ToUserInstanceProfileOutputWithContext(context.Background())
}

func (i *UserInstanceProfile) ToUserInstanceProfileOutputWithContext(ctx context.Context) UserInstanceProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserInstanceProfileOutput)
}

// UserInstanceProfileArrayInput is an input type that accepts UserInstanceProfileArray and UserInstanceProfileArrayOutput values.
// You can construct a concrete instance of `UserInstanceProfileArrayInput` via:
//
//	UserInstanceProfileArray{ UserInstanceProfileArgs{...} }
type UserInstanceProfileArrayInput interface {
	pulumi.Input

	ToUserInstanceProfileArrayOutput() UserInstanceProfileArrayOutput
	ToUserInstanceProfileArrayOutputWithContext(context.Context) UserInstanceProfileArrayOutput
}

type UserInstanceProfileArray []UserInstanceProfileInput

func (UserInstanceProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserInstanceProfile)(nil)).Elem()
}

func (i UserInstanceProfileArray) ToUserInstanceProfileArrayOutput() UserInstanceProfileArrayOutput {
	return i.ToUserInstanceProfileArrayOutputWithContext(context.Background())
}

func (i UserInstanceProfileArray) ToUserInstanceProfileArrayOutputWithContext(ctx context.Context) UserInstanceProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserInstanceProfileArrayOutput)
}

// UserInstanceProfileMapInput is an input type that accepts UserInstanceProfileMap and UserInstanceProfileMapOutput values.
// You can construct a concrete instance of `UserInstanceProfileMapInput` via:
//
//	UserInstanceProfileMap{ "key": UserInstanceProfileArgs{...} }
type UserInstanceProfileMapInput interface {
	pulumi.Input

	ToUserInstanceProfileMapOutput() UserInstanceProfileMapOutput
	ToUserInstanceProfileMapOutputWithContext(context.Context) UserInstanceProfileMapOutput
}

type UserInstanceProfileMap map[string]UserInstanceProfileInput

func (UserInstanceProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserInstanceProfile)(nil)).Elem()
}

func (i UserInstanceProfileMap) ToUserInstanceProfileMapOutput() UserInstanceProfileMapOutput {
	return i.ToUserInstanceProfileMapOutputWithContext(context.Background())
}

func (i UserInstanceProfileMap) ToUserInstanceProfileMapOutputWithContext(ctx context.Context) UserInstanceProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserInstanceProfileMapOutput)
}

type UserInstanceProfileOutput struct{ *pulumi.OutputState }

func (UserInstanceProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserInstanceProfile)(nil)).Elem()
}

func (o UserInstanceProfileOutput) ToUserInstanceProfileOutput() UserInstanceProfileOutput {
	return o
}

func (o UserInstanceProfileOutput) ToUserInstanceProfileOutputWithContext(ctx context.Context) UserInstanceProfileOutput {
	return o
}

// This is the id of the instance profile resource.
func (o UserInstanceProfileOutput) InstanceProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserInstanceProfile) pulumi.StringOutput { return v.InstanceProfileId }).(pulumi.StringOutput)
}

// This is the id of the user resource.
func (o UserInstanceProfileOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserInstanceProfile) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type UserInstanceProfileArrayOutput struct{ *pulumi.OutputState }

func (UserInstanceProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserInstanceProfile)(nil)).Elem()
}

func (o UserInstanceProfileArrayOutput) ToUserInstanceProfileArrayOutput() UserInstanceProfileArrayOutput {
	return o
}

func (o UserInstanceProfileArrayOutput) ToUserInstanceProfileArrayOutputWithContext(ctx context.Context) UserInstanceProfileArrayOutput {
	return o
}

func (o UserInstanceProfileArrayOutput) Index(i pulumi.IntInput) UserInstanceProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserInstanceProfile {
		return vs[0].([]*UserInstanceProfile)[vs[1].(int)]
	}).(UserInstanceProfileOutput)
}

type UserInstanceProfileMapOutput struct{ *pulumi.OutputState }

func (UserInstanceProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserInstanceProfile)(nil)).Elem()
}

func (o UserInstanceProfileMapOutput) ToUserInstanceProfileMapOutput() UserInstanceProfileMapOutput {
	return o
}

func (o UserInstanceProfileMapOutput) ToUserInstanceProfileMapOutputWithContext(ctx context.Context) UserInstanceProfileMapOutput {
	return o
}

func (o UserInstanceProfileMapOutput) MapIndex(k pulumi.StringInput) UserInstanceProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserInstanceProfile {
		return vs[0].(map[string]*UserInstanceProfile)[vs[1].(string)]
	}).(UserInstanceProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInstanceProfileInput)(nil)).Elem(), &UserInstanceProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserInstanceProfileArrayInput)(nil)).Elem(), UserInstanceProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserInstanceProfileMapInput)(nil)).Elem(), UserInstanceProfileMap{})
	pulumi.RegisterOutputType(UserInstanceProfileOutput{})
	pulumi.RegisterOutputType(UserInstanceProfileArrayOutput{})
	pulumi.RegisterOutputType(UserInstanceProfileMapOutput{})
}
