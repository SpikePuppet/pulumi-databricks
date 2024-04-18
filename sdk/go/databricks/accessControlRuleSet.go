// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Note** This resource could be used with account or workspace-level provider.
//
// This resource allows you to manage access rules on Databricks account level resources. For convenience we allow accessing this resource through the Databricks account and workspace.
//
// > **Note** Currently, we only support managing access rules on service principal, group and account resources through `AccessControlRuleSet`.
//
// > **Warning** `AccessControlRuleSet` cannot be used to manage access rules for resources supported by databricks_permissions. Refer to its documentation for more information.
//
// ## Service principal rule set usage
//
// Through a Databricks workspace:
//
// <!--Start PulumiCodeChooser -->
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
//			accountId := "00000000-0000-0000-0000-000000000000"
//			// account level group
//			ds, err := databricks.LookupGroup(ctx, &databricks.LookupGroupArgs{
//				DisplayName: "Data Science",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			automationSp, err := databricks.NewServicePrincipal(ctx, "automation_sp", &databricks.ServicePrincipalArgs{
//				DisplayName: pulumi.String("SP_FOR_AUTOMATION"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewAccessControlRuleSet(ctx, "automation_sp_rule_set", &databricks.AccessControlRuleSetArgs{
//				Name: automationSp.ApplicationId.ApplyT(func(applicationId string) (string, error) {
//					return fmt.Sprintf("accounts/%v/servicePrincipals/%v/ruleSets/default", accountId, applicationId), nil
//				}).(pulumi.StringOutput),
//				GrantRules: databricks.AccessControlRuleSetGrantRuleArray{
//					&databricks.AccessControlRuleSetGrantRuleArgs{
//						Principals: pulumi.StringArray{
//							pulumi.String(ds.AclPrincipalId),
//						},
//						Role: pulumi.String("roles/servicePrincipal.user"),
//					},
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
// Through AWS Databricks account:
//
// <!--Start PulumiCodeChooser -->
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
//			accountId := "00000000-0000-0000-0000-000000000000"
//			// account level group creation
//			ds, err := databricks.NewGroup(ctx, "ds", &databricks.GroupArgs{
//				DisplayName: pulumi.String("Data Science"),
//			})
//			if err != nil {
//				return err
//			}
//			automationSp, err := databricks.NewServicePrincipal(ctx, "automation_sp", &databricks.ServicePrincipalArgs{
//				DisplayName: pulumi.String("SP_FOR_AUTOMATION"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewAccessControlRuleSet(ctx, "automation_sp_rule_set", &databricks.AccessControlRuleSetArgs{
//				Name: automationSp.ApplicationId.ApplyT(func(applicationId string) (string, error) {
//					return fmt.Sprintf("accounts/%v/servicePrincipals/%v/ruleSets/default", accountId, applicationId), nil
//				}).(pulumi.StringOutput),
//				GrantRules: databricks.AccessControlRuleSetGrantRuleArray{
//					&databricks.AccessControlRuleSetGrantRuleArgs{
//						Principals: pulumi.StringArray{
//							ds.AclPrincipalId,
//						},
//						Role: pulumi.String("roles/servicePrincipal.user"),
//					},
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
// Through Azure Databricks account:
//
// <!--Start PulumiCodeChooser -->
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
//			accountId := "00000000-0000-0000-0000-000000000000"
//			// account level group creation
//			ds, err := databricks.NewGroup(ctx, "ds", &databricks.GroupArgs{
//				DisplayName: pulumi.String("Data Science"),
//			})
//			if err != nil {
//				return err
//			}
//			automationSp, err := databricks.NewServicePrincipal(ctx, "automation_sp", &databricks.ServicePrincipalArgs{
//				ApplicationId: pulumi.String("00000000-0000-0000-0000-000000000000"),
//				DisplayName:   pulumi.String("SP_FOR_AUTOMATION"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewAccessControlRuleSet(ctx, "automation_sp_rule_set", &databricks.AccessControlRuleSetArgs{
//				Name: automationSp.ApplicationId.ApplyT(func(applicationId string) (string, error) {
//					return fmt.Sprintf("accounts/%v/servicePrincipals/%v/ruleSets/default", accountId, applicationId), nil
//				}).(pulumi.StringOutput),
//				GrantRules: databricks.AccessControlRuleSetGrantRuleArray{
//					&databricks.AccessControlRuleSetGrantRuleArgs{
//						Principals: pulumi.StringArray{
//							ds.AclPrincipalId,
//						},
//						Role: pulumi.String("roles/servicePrincipal.user"),
//					},
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
// Through GCP Databricks account:
//
// <!--Start PulumiCodeChooser -->
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
//			accountId := "00000000-0000-0000-0000-000000000000"
//			// account level group creation
//			ds, err := databricks.NewGroup(ctx, "ds", &databricks.GroupArgs{
//				DisplayName: pulumi.String("Data Science"),
//			})
//			if err != nil {
//				return err
//			}
//			automationSp, err := databricks.NewServicePrincipal(ctx, "automation_sp", &databricks.ServicePrincipalArgs{
//				DisplayName: pulumi.String("SP_FOR_AUTOMATION"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewAccessControlRuleSet(ctx, "automation_sp_rule_set", &databricks.AccessControlRuleSetArgs{
//				Name: automationSp.ApplicationId.ApplyT(func(applicationId string) (string, error) {
//					return fmt.Sprintf("accounts/%v/servicePrincipals/%v/ruleSets/default", accountId, applicationId), nil
//				}).(pulumi.StringOutput),
//				GrantRules: databricks.AccessControlRuleSetGrantRuleArray{
//					&databricks.AccessControlRuleSetGrantRuleArgs{
//						Principals: pulumi.StringArray{
//							ds.AclPrincipalId,
//						},
//						Role: pulumi.String("roles/servicePrincipal.user"),
//					},
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
// ## Group rule set usage
//
// Refer to the appropriate provider configuration as shown in the examples for service principal rule set.
//
// <!--Start PulumiCodeChooser -->
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
//			accountId := "00000000-0000-0000-0000-000000000000"
//			// account level group
//			_, err := databricks.LookupGroup(ctx, &databricks.LookupGroupArgs{
//				DisplayName: "Data Science",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			john, err := databricks.LookupUser(ctx, &databricks.LookupUserArgs{
//				UserName: pulumi.StringRef("john.doe@example.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewAccessControlRuleSet(ctx, "ds_group_rule_set", &databricks.AccessControlRuleSetArgs{
//				Name: pulumi.String(fmt.Sprintf("accounts/%v/groups/%v/ruleSets/default", accountId, dsDatabricksGroup.Id)),
//				GrantRules: databricks.AccessControlRuleSetGrantRuleArray{
//					&databricks.AccessControlRuleSetGrantRuleArgs{
//						Principals: pulumi.StringArray{
//							pulumi.String(john.AclPrincipalId),
//						},
//						Role: pulumi.String("roles/group.manager"),
//					},
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
// ## Account rule set usage
//
// Refer to the appropriate provider configuration as shown in the examples for service principal rule set.
//
// <!--Start PulumiCodeChooser -->
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
//			accountId := "00000000-0000-0000-0000-000000000000"
//			// account level group
//			ds, err := databricks.LookupGroup(ctx, &databricks.LookupGroupArgs{
//				DisplayName: "Data Science",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// account level group
//			marketplaceAdmins, err := databricks.LookupGroup(ctx, &databricks.LookupGroupArgs{
//				DisplayName: "Marketplace Admins",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			john, err := databricks.LookupUser(ctx, &databricks.LookupUserArgs{
//				UserName: pulumi.StringRef("john.doe@example.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewAccessControlRuleSet(ctx, "account_rule_set", &databricks.AccessControlRuleSetArgs{
//				Name: pulumi.String(fmt.Sprintf("accounts/%v/ruleSets/default", accountId)),
//				GrantRules: databricks.AccessControlRuleSetGrantRuleArray{
//					&databricks.AccessControlRuleSetGrantRuleArgs{
//						Principals: pulumi.StringArray{
//							pulumi.String(john.AclPrincipalId),
//						},
//						Role: pulumi.String("roles/group.manager"),
//					},
//					&databricks.AccessControlRuleSetGrantRuleArgs{
//						Principals: pulumi.StringArray{
//							pulumi.String(ds.AclPrincipalId),
//						},
//						Role: pulumi.String("roles/servicePrincipal.manager"),
//					},
//					&databricks.AccessControlRuleSetGrantRuleArgs{
//						Principals: pulumi.StringArray{
//							pulumi.String(marketplaceAdmins.AclPrincipalId),
//						},
//						Role: pulumi.String("roles/marketplace.admin"),
//					},
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
// ## Related Resources
//
// The following resources are often used in the same context:
//
// * Group
// * User
// * ServicePrincipal
type AccessControlRuleSet struct {
	pulumi.CustomResourceState

	Etag pulumi.StringOutput `pulumi:"etag"`
	// The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.
	//
	// !> **Warning** Name uniquely identifies a rule set resource. Ensure all the grantRules blocks for a rule set name are present in one `AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
	GrantRules AccessControlRuleSetGrantRuleArrayOutput `pulumi:"grantRules"`
	// Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
	// * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
	// * `accounts/{account_id}/groups/{group_id}/ruleSets/default`
	// * `accounts/{account_id}/ruleSets/default`
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewAccessControlRuleSet registers a new resource with the given unique name, arguments, and options.
func NewAccessControlRuleSet(ctx *pulumi.Context,
	name string, args *AccessControlRuleSetArgs, opts ...pulumi.ResourceOption) (*AccessControlRuleSet, error) {
	if args == nil {
		args = &AccessControlRuleSetArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccessControlRuleSet
	err := ctx.RegisterResource("databricks:index/accessControlRuleSet:AccessControlRuleSet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessControlRuleSet gets an existing AccessControlRuleSet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessControlRuleSet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessControlRuleSetState, opts ...pulumi.ResourceOption) (*AccessControlRuleSet, error) {
	var resource AccessControlRuleSet
	err := ctx.ReadResource("databricks:index/accessControlRuleSet:AccessControlRuleSet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessControlRuleSet resources.
type accessControlRuleSetState struct {
	Etag *string `pulumi:"etag"`
	// The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.
	//
	// !> **Warning** Name uniquely identifies a rule set resource. Ensure all the grantRules blocks for a rule set name are present in one `AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
	GrantRules []AccessControlRuleSetGrantRule `pulumi:"grantRules"`
	// Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
	// * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
	// * `accounts/{account_id}/groups/{group_id}/ruleSets/default`
	// * `accounts/{account_id}/ruleSets/default`
	Name *string `pulumi:"name"`
}

type AccessControlRuleSetState struct {
	Etag pulumi.StringPtrInput
	// The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.
	//
	// !> **Warning** Name uniquely identifies a rule set resource. Ensure all the grantRules blocks for a rule set name are present in one `AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
	GrantRules AccessControlRuleSetGrantRuleArrayInput
	// Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
	// * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
	// * `accounts/{account_id}/groups/{group_id}/ruleSets/default`
	// * `accounts/{account_id}/ruleSets/default`
	Name pulumi.StringPtrInput
}

func (AccessControlRuleSetState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessControlRuleSetState)(nil)).Elem()
}

type accessControlRuleSetArgs struct {
	// The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.
	//
	// !> **Warning** Name uniquely identifies a rule set resource. Ensure all the grantRules blocks for a rule set name are present in one `AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
	GrantRules []AccessControlRuleSetGrantRule `pulumi:"grantRules"`
	// Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
	// * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
	// * `accounts/{account_id}/groups/{group_id}/ruleSets/default`
	// * `accounts/{account_id}/ruleSets/default`
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a AccessControlRuleSet resource.
type AccessControlRuleSetArgs struct {
	// The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.
	//
	// !> **Warning** Name uniquely identifies a rule set resource. Ensure all the grantRules blocks for a rule set name are present in one `AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
	GrantRules AccessControlRuleSetGrantRuleArrayInput
	// Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
	// * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
	// * `accounts/{account_id}/groups/{group_id}/ruleSets/default`
	// * `accounts/{account_id}/ruleSets/default`
	Name pulumi.StringPtrInput
}

func (AccessControlRuleSetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessControlRuleSetArgs)(nil)).Elem()
}

type AccessControlRuleSetInput interface {
	pulumi.Input

	ToAccessControlRuleSetOutput() AccessControlRuleSetOutput
	ToAccessControlRuleSetOutputWithContext(ctx context.Context) AccessControlRuleSetOutput
}

func (*AccessControlRuleSet) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessControlRuleSet)(nil)).Elem()
}

func (i *AccessControlRuleSet) ToAccessControlRuleSetOutput() AccessControlRuleSetOutput {
	return i.ToAccessControlRuleSetOutputWithContext(context.Background())
}

func (i *AccessControlRuleSet) ToAccessControlRuleSetOutputWithContext(ctx context.Context) AccessControlRuleSetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessControlRuleSetOutput)
}

// AccessControlRuleSetArrayInput is an input type that accepts AccessControlRuleSetArray and AccessControlRuleSetArrayOutput values.
// You can construct a concrete instance of `AccessControlRuleSetArrayInput` via:
//
//	AccessControlRuleSetArray{ AccessControlRuleSetArgs{...} }
type AccessControlRuleSetArrayInput interface {
	pulumi.Input

	ToAccessControlRuleSetArrayOutput() AccessControlRuleSetArrayOutput
	ToAccessControlRuleSetArrayOutputWithContext(context.Context) AccessControlRuleSetArrayOutput
}

type AccessControlRuleSetArray []AccessControlRuleSetInput

func (AccessControlRuleSetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessControlRuleSet)(nil)).Elem()
}

func (i AccessControlRuleSetArray) ToAccessControlRuleSetArrayOutput() AccessControlRuleSetArrayOutput {
	return i.ToAccessControlRuleSetArrayOutputWithContext(context.Background())
}

func (i AccessControlRuleSetArray) ToAccessControlRuleSetArrayOutputWithContext(ctx context.Context) AccessControlRuleSetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessControlRuleSetArrayOutput)
}

// AccessControlRuleSetMapInput is an input type that accepts AccessControlRuleSetMap and AccessControlRuleSetMapOutput values.
// You can construct a concrete instance of `AccessControlRuleSetMapInput` via:
//
//	AccessControlRuleSetMap{ "key": AccessControlRuleSetArgs{...} }
type AccessControlRuleSetMapInput interface {
	pulumi.Input

	ToAccessControlRuleSetMapOutput() AccessControlRuleSetMapOutput
	ToAccessControlRuleSetMapOutputWithContext(context.Context) AccessControlRuleSetMapOutput
}

type AccessControlRuleSetMap map[string]AccessControlRuleSetInput

func (AccessControlRuleSetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessControlRuleSet)(nil)).Elem()
}

func (i AccessControlRuleSetMap) ToAccessControlRuleSetMapOutput() AccessControlRuleSetMapOutput {
	return i.ToAccessControlRuleSetMapOutputWithContext(context.Background())
}

func (i AccessControlRuleSetMap) ToAccessControlRuleSetMapOutputWithContext(ctx context.Context) AccessControlRuleSetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessControlRuleSetMapOutput)
}

type AccessControlRuleSetOutput struct{ *pulumi.OutputState }

func (AccessControlRuleSetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessControlRuleSet)(nil)).Elem()
}

func (o AccessControlRuleSetOutput) ToAccessControlRuleSetOutput() AccessControlRuleSetOutput {
	return o
}

func (o AccessControlRuleSetOutput) ToAccessControlRuleSetOutputWithContext(ctx context.Context) AccessControlRuleSetOutput {
	return o
}

func (o AccessControlRuleSetOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessControlRuleSet) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.
//
// !> **Warning** Name uniquely identifies a rule set resource. Ensure all the grantRules blocks for a rule set name are present in one `AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
func (o AccessControlRuleSetOutput) GrantRules() AccessControlRuleSetGrantRuleArrayOutput {
	return o.ApplyT(func(v *AccessControlRuleSet) AccessControlRuleSetGrantRuleArrayOutput { return v.GrantRules }).(AccessControlRuleSetGrantRuleArrayOutput)
}

// Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
// * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
// * `accounts/{account_id}/groups/{group_id}/ruleSets/default`
// * `accounts/{account_id}/ruleSets/default`
func (o AccessControlRuleSetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessControlRuleSet) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type AccessControlRuleSetArrayOutput struct{ *pulumi.OutputState }

func (AccessControlRuleSetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessControlRuleSet)(nil)).Elem()
}

func (o AccessControlRuleSetArrayOutput) ToAccessControlRuleSetArrayOutput() AccessControlRuleSetArrayOutput {
	return o
}

func (o AccessControlRuleSetArrayOutput) ToAccessControlRuleSetArrayOutputWithContext(ctx context.Context) AccessControlRuleSetArrayOutput {
	return o
}

func (o AccessControlRuleSetArrayOutput) Index(i pulumi.IntInput) AccessControlRuleSetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessControlRuleSet {
		return vs[0].([]*AccessControlRuleSet)[vs[1].(int)]
	}).(AccessControlRuleSetOutput)
}

type AccessControlRuleSetMapOutput struct{ *pulumi.OutputState }

func (AccessControlRuleSetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessControlRuleSet)(nil)).Elem()
}

func (o AccessControlRuleSetMapOutput) ToAccessControlRuleSetMapOutput() AccessControlRuleSetMapOutput {
	return o
}

func (o AccessControlRuleSetMapOutput) ToAccessControlRuleSetMapOutputWithContext(ctx context.Context) AccessControlRuleSetMapOutput {
	return o
}

func (o AccessControlRuleSetMapOutput) MapIndex(k pulumi.StringInput) AccessControlRuleSetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessControlRuleSet {
		return vs[0].(map[string]*AccessControlRuleSet)[vs[1].(string)]
	}).(AccessControlRuleSetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessControlRuleSetInput)(nil)).Elem(), &AccessControlRuleSet{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessControlRuleSetArrayInput)(nil)).Elem(), AccessControlRuleSetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessControlRuleSetMapInput)(nil)).Elem(), AccessControlRuleSetMap{})
	pulumi.RegisterOutputType(AccessControlRuleSetOutput{})
	pulumi.RegisterOutputType(AccessControlRuleSetArrayOutput{})
	pulumi.RegisterOutputType(AccessControlRuleSetMapOutput{})
}
