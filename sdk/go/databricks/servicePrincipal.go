// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Directly manage [Service Principals](https://docs.databricks.com/administration-guide/users-groups/service-principals.html) that could be added to Group in Databricks workspace or account.
//
// > **Note** To assign account level service principals to workspace use databricks_mws_permission_assignment.
//
// > **Note** Entitlements, like, `allowClusterCreate`, `allowInstancePoolCreate`, `databricksSqlAccess`, `workspaceAccess` applicable only for workspace-level service principals.  Use Entitlements resource to assign entitlements inside a workspace to account-level service principals.
//
// To create service principals in the Databricks account, the provider must be configured with `host = "https://accounts.cloud.databricks.com"` on AWS deployments or `host = "https://accounts.azuredatabricks.net"` and authenticate using AAD tokens on Azure deployments
//
// ## Example Usage
//
// Creating regular service principal:
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
//			_, err := databricks.NewServicePrincipal(ctx, "sp", &databricks.ServicePrincipalArgs{
//				ApplicationId: pulumi.String("00000000-0000-0000-0000-000000000000"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// Creating service principal with administrative permissions - referencing special `admins` Group in GroupMember resource:
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
//			admins, err := databricks.LookupGroup(ctx, &databricks.LookupGroupArgs{
//				DisplayName: "admins",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			sp, err := databricks.NewServicePrincipal(ctx, "sp", &databricks.ServicePrincipalArgs{
//				ApplicationId: pulumi.String("00000000-0000-0000-0000-000000000000"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewGroupMember(ctx, "i-am-admin", &databricks.GroupMemberArgs{
//				GroupId:  *pulumi.String(admins.Id),
//				MemberId: sp.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// Creating service principal with cluster create permissions:
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
//			_, err := databricks.NewServicePrincipal(ctx, "sp", &databricks.ServicePrincipalArgs{
//				AllowClusterCreate: pulumi.Bool(true),
//				ApplicationId:      pulumi.String("00000000-0000-0000-0000-000000000000"),
//				DisplayName:        pulumi.String("Example service principal"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// Creating service principal in AWS Databricks account:
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
//			_, err := databricks.NewProvider(ctx, "mws", &databricks.ProviderArgs{
//				Host:         pulumi.String("https://accounts.cloud.databricks.com"),
//				AccountId:    pulumi.String("00000000-0000-0000-0000-000000000000"),
//				ClientId:     pulumi.Any(_var.Client_id),
//				ClientSecret: pulumi.Any(_var.Client_secret),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewServicePrincipal(ctx, "sp", &databricks.ServicePrincipalArgs{
//				DisplayName: pulumi.String("Automation-only SP"),
//			}, pulumi.Provider(databricks.Mws))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// Creating service principal in Azure Databricks account:
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
//			_, err := databricks.NewProvider(ctx, "azureAccount", &databricks.ProviderArgs{
//				Host:      pulumi.String("https://accounts.azuredatabricks.net"),
//				AccountId: pulumi.String("00000000-0000-0000-0000-000000000000"),
//				AuthType:  pulumi.String("azure-cli"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewServicePrincipal(ctx, "sp", &databricks.ServicePrincipalArgs{
//				ApplicationId: pulumi.String("00000000-0000-0000-0000-000000000000"),
//			}, pulumi.Provider(databricks.Azure_account))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Related Resources
//
// The following resources are often used in the same context:
//
// * End to end workspace management guide.
// * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
// * Group data to retrieve information about Group members, entitlements and instance profiles.
// * GroupMember to attach users and groups as group members.
// * Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
// * SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and more to manage secrets for the service principal (only for AWS deployments)
//
// ## Import
//
// The resource scim service principal can be imported using its id, for example `2345678901234567`. To get the service principal ID, call [Get service principals](https://docs.databricks.com/dev-tools/api/latest/scim/scim-sp.html#get-service-principals). bash
//
// ```sh
//
//	$ pulumi import databricks:index/servicePrincipal:ServicePrincipal me <service-principal-id>
//
// ```
type ServicePrincipal struct {
	pulumi.CustomResourceState

	// identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
	AclPrincipalId pulumi.StringOutput `pulumi:"aclPrincipalId"`
	// Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
	Active pulumi.BoolPtrOutput `pulumi:"active"`
	// Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
	AllowClusterCreate pulumi.BoolPtrOutput `pulumi:"allowClusterCreate"`
	// Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate pulumi.BoolPtrOutput `pulumi:"allowInstancePoolCreate"`
	// This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
	ApplicationId pulumi.StringOutput `pulumi:"applicationId"`
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
	DatabricksSqlAccess pulumi.BoolPtrOutput `pulumi:"databricksSqlAccess"`
	// When deleting a user, set the user's active flag to false instead of actually deleting the user. This flag is exclusive to forceDeleteRepos and forceDeleteHomeDir flags. True by default for accounts SCIM API, false otherwise.
	DisableAsUserDeletion pulumi.BoolPtrOutput `pulumi:"disableAsUserDeletion"`
	// This is an alias for the service principal and can be the full name of the service principal.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// ID of the service principal in an external identity provider.
	ExternalId pulumi.StringPtrOutput `pulumi:"externalId"`
	Force      pulumi.BoolPtrOutput   `pulumi:"force"`
	// This flag determines whether the service principal's home directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
	ForceDeleteHomeDir pulumi.BoolPtrOutput `pulumi:"forceDeleteHomeDir"`
	// This flag determines whether the service principal's repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
	ForceDeleteRepos pulumi.BoolPtrOutput `pulumi:"forceDeleteRepos"`
	// Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
	Home pulumi.StringOutput `pulumi:"home"`
	// Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
	Repos pulumi.StringOutput `pulumi:"repos"`
	// This is a field to allow the group to have access to Databricks Workspace.
	WorkspaceAccess pulumi.BoolPtrOutput `pulumi:"workspaceAccess"`
}

// NewServicePrincipal registers a new resource with the given unique name, arguments, and options.
func NewServicePrincipal(ctx *pulumi.Context,
	name string, args *ServicePrincipalArgs, opts ...pulumi.ResourceOption) (*ServicePrincipal, error) {
	if args == nil {
		args = &ServicePrincipalArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServicePrincipal
	err := ctx.RegisterResource("databricks:index/servicePrincipal:ServicePrincipal", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServicePrincipal gets an existing ServicePrincipal resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServicePrincipal(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServicePrincipalState, opts ...pulumi.ResourceOption) (*ServicePrincipal, error) {
	var resource ServicePrincipal
	err := ctx.ReadResource("databricks:index/servicePrincipal:ServicePrincipal", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServicePrincipal resources.
type servicePrincipalState struct {
	// identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
	AclPrincipalId *string `pulumi:"aclPrincipalId"`
	// Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
	Active *bool `pulumi:"active"`
	// Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
	AllowClusterCreate *bool `pulumi:"allowClusterCreate"`
	// Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate *bool `pulumi:"allowInstancePoolCreate"`
	// This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
	ApplicationId *string `pulumi:"applicationId"`
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
	DatabricksSqlAccess *bool `pulumi:"databricksSqlAccess"`
	// When deleting a user, set the user's active flag to false instead of actually deleting the user. This flag is exclusive to forceDeleteRepos and forceDeleteHomeDir flags. True by default for accounts SCIM API, false otherwise.
	DisableAsUserDeletion *bool `pulumi:"disableAsUserDeletion"`
	// This is an alias for the service principal and can be the full name of the service principal.
	DisplayName *string `pulumi:"displayName"`
	// ID of the service principal in an external identity provider.
	ExternalId *string `pulumi:"externalId"`
	Force      *bool   `pulumi:"force"`
	// This flag determines whether the service principal's home directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
	ForceDeleteHomeDir *bool `pulumi:"forceDeleteHomeDir"`
	// This flag determines whether the service principal's repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
	ForceDeleteRepos *bool `pulumi:"forceDeleteRepos"`
	// Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
	Home *string `pulumi:"home"`
	// Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
	Repos *string `pulumi:"repos"`
	// This is a field to allow the group to have access to Databricks Workspace.
	WorkspaceAccess *bool `pulumi:"workspaceAccess"`
}

type ServicePrincipalState struct {
	// identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
	AclPrincipalId pulumi.StringPtrInput
	// Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
	Active pulumi.BoolPtrInput
	// Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
	AllowClusterCreate pulumi.BoolPtrInput
	// Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate pulumi.BoolPtrInput
	// This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
	ApplicationId pulumi.StringPtrInput
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
	DatabricksSqlAccess pulumi.BoolPtrInput
	// When deleting a user, set the user's active flag to false instead of actually deleting the user. This flag is exclusive to forceDeleteRepos and forceDeleteHomeDir flags. True by default for accounts SCIM API, false otherwise.
	DisableAsUserDeletion pulumi.BoolPtrInput
	// This is an alias for the service principal and can be the full name of the service principal.
	DisplayName pulumi.StringPtrInput
	// ID of the service principal in an external identity provider.
	ExternalId pulumi.StringPtrInput
	Force      pulumi.BoolPtrInput
	// This flag determines whether the service principal's home directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
	ForceDeleteHomeDir pulumi.BoolPtrInput
	// This flag determines whether the service principal's repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
	ForceDeleteRepos pulumi.BoolPtrInput
	// Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
	Home pulumi.StringPtrInput
	// Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
	Repos pulumi.StringPtrInput
	// This is a field to allow the group to have access to Databricks Workspace.
	WorkspaceAccess pulumi.BoolPtrInput
}

func (ServicePrincipalState) ElementType() reflect.Type {
	return reflect.TypeOf((*servicePrincipalState)(nil)).Elem()
}

type servicePrincipalArgs struct {
	// identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
	AclPrincipalId *string `pulumi:"aclPrincipalId"`
	// Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
	Active *bool `pulumi:"active"`
	// Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
	AllowClusterCreate *bool `pulumi:"allowClusterCreate"`
	// Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate *bool `pulumi:"allowInstancePoolCreate"`
	// This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
	ApplicationId *string `pulumi:"applicationId"`
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
	DatabricksSqlAccess *bool `pulumi:"databricksSqlAccess"`
	// When deleting a user, set the user's active flag to false instead of actually deleting the user. This flag is exclusive to forceDeleteRepos and forceDeleteHomeDir flags. True by default for accounts SCIM API, false otherwise.
	DisableAsUserDeletion *bool `pulumi:"disableAsUserDeletion"`
	// This is an alias for the service principal and can be the full name of the service principal.
	DisplayName *string `pulumi:"displayName"`
	// ID of the service principal in an external identity provider.
	ExternalId *string `pulumi:"externalId"`
	Force      *bool   `pulumi:"force"`
	// This flag determines whether the service principal's home directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
	ForceDeleteHomeDir *bool `pulumi:"forceDeleteHomeDir"`
	// This flag determines whether the service principal's repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
	ForceDeleteRepos *bool `pulumi:"forceDeleteRepos"`
	// Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
	Home *string `pulumi:"home"`
	// Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
	Repos *string `pulumi:"repos"`
	// This is a field to allow the group to have access to Databricks Workspace.
	WorkspaceAccess *bool `pulumi:"workspaceAccess"`
}

// The set of arguments for constructing a ServicePrincipal resource.
type ServicePrincipalArgs struct {
	// identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
	AclPrincipalId pulumi.StringPtrInput
	// Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
	Active pulumi.BoolPtrInput
	// Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
	AllowClusterCreate pulumi.BoolPtrInput
	// Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate pulumi.BoolPtrInput
	// This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
	ApplicationId pulumi.StringPtrInput
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
	DatabricksSqlAccess pulumi.BoolPtrInput
	// When deleting a user, set the user's active flag to false instead of actually deleting the user. This flag is exclusive to forceDeleteRepos and forceDeleteHomeDir flags. True by default for accounts SCIM API, false otherwise.
	DisableAsUserDeletion pulumi.BoolPtrInput
	// This is an alias for the service principal and can be the full name of the service principal.
	DisplayName pulumi.StringPtrInput
	// ID of the service principal in an external identity provider.
	ExternalId pulumi.StringPtrInput
	Force      pulumi.BoolPtrInput
	// This flag determines whether the service principal's home directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
	ForceDeleteHomeDir pulumi.BoolPtrInput
	// This flag determines whether the service principal's repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
	ForceDeleteRepos pulumi.BoolPtrInput
	// Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
	Home pulumi.StringPtrInput
	// Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
	Repos pulumi.StringPtrInput
	// This is a field to allow the group to have access to Databricks Workspace.
	WorkspaceAccess pulumi.BoolPtrInput
}

func (ServicePrincipalArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*servicePrincipalArgs)(nil)).Elem()
}

type ServicePrincipalInput interface {
	pulumi.Input

	ToServicePrincipalOutput() ServicePrincipalOutput
	ToServicePrincipalOutputWithContext(ctx context.Context) ServicePrincipalOutput
}

func (*ServicePrincipal) ElementType() reflect.Type {
	return reflect.TypeOf((**ServicePrincipal)(nil)).Elem()
}

func (i *ServicePrincipal) ToServicePrincipalOutput() ServicePrincipalOutput {
	return i.ToServicePrincipalOutputWithContext(context.Background())
}

func (i *ServicePrincipal) ToServicePrincipalOutputWithContext(ctx context.Context) ServicePrincipalOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicePrincipalOutput)
}

// ServicePrincipalArrayInput is an input type that accepts ServicePrincipalArray and ServicePrincipalArrayOutput values.
// You can construct a concrete instance of `ServicePrincipalArrayInput` via:
//
//	ServicePrincipalArray{ ServicePrincipalArgs{...} }
type ServicePrincipalArrayInput interface {
	pulumi.Input

	ToServicePrincipalArrayOutput() ServicePrincipalArrayOutput
	ToServicePrincipalArrayOutputWithContext(context.Context) ServicePrincipalArrayOutput
}

type ServicePrincipalArray []ServicePrincipalInput

func (ServicePrincipalArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServicePrincipal)(nil)).Elem()
}

func (i ServicePrincipalArray) ToServicePrincipalArrayOutput() ServicePrincipalArrayOutput {
	return i.ToServicePrincipalArrayOutputWithContext(context.Background())
}

func (i ServicePrincipalArray) ToServicePrincipalArrayOutputWithContext(ctx context.Context) ServicePrincipalArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicePrincipalArrayOutput)
}

// ServicePrincipalMapInput is an input type that accepts ServicePrincipalMap and ServicePrincipalMapOutput values.
// You can construct a concrete instance of `ServicePrincipalMapInput` via:
//
//	ServicePrincipalMap{ "key": ServicePrincipalArgs{...} }
type ServicePrincipalMapInput interface {
	pulumi.Input

	ToServicePrincipalMapOutput() ServicePrincipalMapOutput
	ToServicePrincipalMapOutputWithContext(context.Context) ServicePrincipalMapOutput
}

type ServicePrincipalMap map[string]ServicePrincipalInput

func (ServicePrincipalMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServicePrincipal)(nil)).Elem()
}

func (i ServicePrincipalMap) ToServicePrincipalMapOutput() ServicePrincipalMapOutput {
	return i.ToServicePrincipalMapOutputWithContext(context.Background())
}

func (i ServicePrincipalMap) ToServicePrincipalMapOutputWithContext(ctx context.Context) ServicePrincipalMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicePrincipalMapOutput)
}

type ServicePrincipalOutput struct{ *pulumi.OutputState }

func (ServicePrincipalOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServicePrincipal)(nil)).Elem()
}

func (o ServicePrincipalOutput) ToServicePrincipalOutput() ServicePrincipalOutput {
	return o
}

func (o ServicePrincipalOutput) ToServicePrincipalOutputWithContext(ctx context.Context) ServicePrincipalOutput {
	return o
}

// identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
func (o ServicePrincipalOutput) AclPrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServicePrincipal) pulumi.StringOutput { return v.AclPrincipalId }).(pulumi.StringOutput)
}

// Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
func (o ServicePrincipalOutput) Active() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServicePrincipal) pulumi.BoolPtrOutput { return v.Active }).(pulumi.BoolPtrOutput)
}

// Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
func (o ServicePrincipalOutput) AllowClusterCreate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServicePrincipal) pulumi.BoolPtrOutput { return v.AllowClusterCreate }).(pulumi.BoolPtrOutput)
}

// Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
func (o ServicePrincipalOutput) AllowInstancePoolCreate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServicePrincipal) pulumi.BoolPtrOutput { return v.AllowInstancePoolCreate }).(pulumi.BoolPtrOutput)
}

// This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
func (o ServicePrincipalOutput) ApplicationId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServicePrincipal) pulumi.StringOutput { return v.ApplicationId }).(pulumi.StringOutput)
}

// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
func (o ServicePrincipalOutput) DatabricksSqlAccess() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServicePrincipal) pulumi.BoolPtrOutput { return v.DatabricksSqlAccess }).(pulumi.BoolPtrOutput)
}

// When deleting a user, set the user's active flag to false instead of actually deleting the user. This flag is exclusive to forceDeleteRepos and forceDeleteHomeDir flags. True by default for accounts SCIM API, false otherwise.
func (o ServicePrincipalOutput) DisableAsUserDeletion() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServicePrincipal) pulumi.BoolPtrOutput { return v.DisableAsUserDeletion }).(pulumi.BoolPtrOutput)
}

// This is an alias for the service principal and can be the full name of the service principal.
func (o ServicePrincipalOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServicePrincipal) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// ID of the service principal in an external identity provider.
func (o ServicePrincipalOutput) ExternalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServicePrincipal) pulumi.StringPtrOutput { return v.ExternalId }).(pulumi.StringPtrOutput)
}

func (o ServicePrincipalOutput) Force() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServicePrincipal) pulumi.BoolPtrOutput { return v.Force }).(pulumi.BoolPtrOutput)
}

// This flag determines whether the service principal's home directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
func (o ServicePrincipalOutput) ForceDeleteHomeDir() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServicePrincipal) pulumi.BoolPtrOutput { return v.ForceDeleteHomeDir }).(pulumi.BoolPtrOutput)
}

// This flag determines whether the service principal's repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
func (o ServicePrincipalOutput) ForceDeleteRepos() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServicePrincipal) pulumi.BoolPtrOutput { return v.ForceDeleteRepos }).(pulumi.BoolPtrOutput)
}

// Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
func (o ServicePrincipalOutput) Home() pulumi.StringOutput {
	return o.ApplyT(func(v *ServicePrincipal) pulumi.StringOutput { return v.Home }).(pulumi.StringOutput)
}

// Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
func (o ServicePrincipalOutput) Repos() pulumi.StringOutput {
	return o.ApplyT(func(v *ServicePrincipal) pulumi.StringOutput { return v.Repos }).(pulumi.StringOutput)
}

// This is a field to allow the group to have access to Databricks Workspace.
func (o ServicePrincipalOutput) WorkspaceAccess() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServicePrincipal) pulumi.BoolPtrOutput { return v.WorkspaceAccess }).(pulumi.BoolPtrOutput)
}

type ServicePrincipalArrayOutput struct{ *pulumi.OutputState }

func (ServicePrincipalArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServicePrincipal)(nil)).Elem()
}

func (o ServicePrincipalArrayOutput) ToServicePrincipalArrayOutput() ServicePrincipalArrayOutput {
	return o
}

func (o ServicePrincipalArrayOutput) ToServicePrincipalArrayOutputWithContext(ctx context.Context) ServicePrincipalArrayOutput {
	return o
}

func (o ServicePrincipalArrayOutput) Index(i pulumi.IntInput) ServicePrincipalOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServicePrincipal {
		return vs[0].([]*ServicePrincipal)[vs[1].(int)]
	}).(ServicePrincipalOutput)
}

type ServicePrincipalMapOutput struct{ *pulumi.OutputState }

func (ServicePrincipalMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServicePrincipal)(nil)).Elem()
}

func (o ServicePrincipalMapOutput) ToServicePrincipalMapOutput() ServicePrincipalMapOutput {
	return o
}

func (o ServicePrincipalMapOutput) ToServicePrincipalMapOutputWithContext(ctx context.Context) ServicePrincipalMapOutput {
	return o
}

func (o ServicePrincipalMapOutput) MapIndex(k pulumi.StringInput) ServicePrincipalOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServicePrincipal {
		return vs[0].(map[string]*ServicePrincipal)[vs[1].(string)]
	}).(ServicePrincipalOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServicePrincipalInput)(nil)).Elem(), &ServicePrincipal{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServicePrincipalArrayInput)(nil)).Elem(), ServicePrincipalArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServicePrincipalMapInput)(nil)).Elem(), ServicePrincipalMap{})
	pulumi.RegisterOutputType(ServicePrincipalOutput{})
	pulumi.RegisterOutputType(ServicePrincipalArrayOutput{})
	pulumi.RegisterOutputType(ServicePrincipalMapOutput{})
}
