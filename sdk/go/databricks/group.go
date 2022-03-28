// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments). You can also associate Databricks users to groups. This is useful if you are using an application to sync users & groups with SCIM API.
//
// Recommended to use along with Identity Provider SCIM provisioning to populate users into those groups:
//
// * [Azure Active Directory](https://docs.microsoft.com/en-us/azure/databricks/administration-guide/users-groups/scim/aad)
// * [Okta](https://docs.databricks.com/administration-guide/users-groups/scim/okta.html)
// * [OneLogin](https://docs.databricks.com/administration-guide/users-groups/scim/onelogin.html)
//
// ## Import
//
// You can import a `databricks_group` resource with the name `my_group` like the followingbash
//
// ```sh
//  $ pulumi import databricks:index/group:Group my_group <group_id>
// ```
type Group struct {
	pulumi.CustomResourceState

	// This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with Permissions and clusterId argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate pulumi.BoolPtrOutput `pulumi:"allowClusterCreate"`
	// This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate pulumi.BoolPtrOutput `pulumi:"allowInstancePoolCreate"`
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess pulumi.BoolPtrOutput `pulumi:"databricksSqlAccess"`
	// This is the display name for the given group.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// ID of the group in an external identity provider.
	ExternalId pulumi.StringPtrOutput `pulumi:"externalId"`
	Force      pulumi.BoolPtrOutput   `pulumi:"force"`
	Url        pulumi.StringOutput    `pulumi:"url"`
	// This is a field to allow the group to have access to Databricks Workspace.
	WorkspaceAccess pulumi.BoolPtrOutput `pulumi:"workspaceAccess"`
}

// NewGroup registers a new resource with the given unique name, arguments, and options.
func NewGroup(ctx *pulumi.Context,
	name string, args *GroupArgs, opts ...pulumi.ResourceOption) (*Group, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	var resource Group
	err := ctx.RegisterResource("databricks:index/group:Group", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGroup gets an existing Group resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GroupState, opts ...pulumi.ResourceOption) (*Group, error) {
	var resource Group
	err := ctx.ReadResource("databricks:index/group:Group", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Group resources.
type groupState struct {
	// This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with Permissions and clusterId argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate *bool `pulumi:"allowClusterCreate"`
	// This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate *bool `pulumi:"allowInstancePoolCreate"`
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess *bool `pulumi:"databricksSqlAccess"`
	// This is the display name for the given group.
	DisplayName *string `pulumi:"displayName"`
	// ID of the group in an external identity provider.
	ExternalId *string `pulumi:"externalId"`
	Force      *bool   `pulumi:"force"`
	Url        *string `pulumi:"url"`
	// This is a field to allow the group to have access to Databricks Workspace.
	WorkspaceAccess *bool `pulumi:"workspaceAccess"`
}

type GroupState struct {
	// This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with Permissions and clusterId argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate pulumi.BoolPtrInput
	// This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate pulumi.BoolPtrInput
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess pulumi.BoolPtrInput
	// This is the display name for the given group.
	DisplayName pulumi.StringPtrInput
	// ID of the group in an external identity provider.
	ExternalId pulumi.StringPtrInput
	Force      pulumi.BoolPtrInput
	Url        pulumi.StringPtrInput
	// This is a field to allow the group to have access to Databricks Workspace.
	WorkspaceAccess pulumi.BoolPtrInput
}

func (GroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*groupState)(nil)).Elem()
}

type groupArgs struct {
	// This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with Permissions and clusterId argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate *bool `pulumi:"allowClusterCreate"`
	// This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate *bool `pulumi:"allowInstancePoolCreate"`
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess *bool `pulumi:"databricksSqlAccess"`
	// This is the display name for the given group.
	DisplayName string `pulumi:"displayName"`
	// ID of the group in an external identity provider.
	ExternalId *string `pulumi:"externalId"`
	Force      *bool   `pulumi:"force"`
	Url        *string `pulumi:"url"`
	// This is a field to allow the group to have access to Databricks Workspace.
	WorkspaceAccess *bool `pulumi:"workspaceAccess"`
}

// The set of arguments for constructing a Group resource.
type GroupArgs struct {
	// This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with Permissions and clusterId argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate pulumi.BoolPtrInput
	// This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate pulumi.BoolPtrInput
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess pulumi.BoolPtrInput
	// This is the display name for the given group.
	DisplayName pulumi.StringInput
	// ID of the group in an external identity provider.
	ExternalId pulumi.StringPtrInput
	Force      pulumi.BoolPtrInput
	Url        pulumi.StringPtrInput
	// This is a field to allow the group to have access to Databricks Workspace.
	WorkspaceAccess pulumi.BoolPtrInput
}

func (GroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*groupArgs)(nil)).Elem()
}

type GroupInput interface {
	pulumi.Input

	ToGroupOutput() GroupOutput
	ToGroupOutputWithContext(ctx context.Context) GroupOutput
}

func (*Group) ElementType() reflect.Type {
	return reflect.TypeOf((**Group)(nil)).Elem()
}

func (i *Group) ToGroupOutput() GroupOutput {
	return i.ToGroupOutputWithContext(context.Background())
}

func (i *Group) ToGroupOutputWithContext(ctx context.Context) GroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupOutput)
}

// GroupArrayInput is an input type that accepts GroupArray and GroupArrayOutput values.
// You can construct a concrete instance of `GroupArrayInput` via:
//
//          GroupArray{ GroupArgs{...} }
type GroupArrayInput interface {
	pulumi.Input

	ToGroupArrayOutput() GroupArrayOutput
	ToGroupArrayOutputWithContext(context.Context) GroupArrayOutput
}

type GroupArray []GroupInput

func (GroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Group)(nil)).Elem()
}

func (i GroupArray) ToGroupArrayOutput() GroupArrayOutput {
	return i.ToGroupArrayOutputWithContext(context.Background())
}

func (i GroupArray) ToGroupArrayOutputWithContext(ctx context.Context) GroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupArrayOutput)
}

// GroupMapInput is an input type that accepts GroupMap and GroupMapOutput values.
// You can construct a concrete instance of `GroupMapInput` via:
//
//          GroupMap{ "key": GroupArgs{...} }
type GroupMapInput interface {
	pulumi.Input

	ToGroupMapOutput() GroupMapOutput
	ToGroupMapOutputWithContext(context.Context) GroupMapOutput
}

type GroupMap map[string]GroupInput

func (GroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Group)(nil)).Elem()
}

func (i GroupMap) ToGroupMapOutput() GroupMapOutput {
	return i.ToGroupMapOutputWithContext(context.Background())
}

func (i GroupMap) ToGroupMapOutputWithContext(ctx context.Context) GroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupMapOutput)
}

type GroupOutput struct{ *pulumi.OutputState }

func (GroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Group)(nil)).Elem()
}

func (o GroupOutput) ToGroupOutput() GroupOutput {
	return o
}

func (o GroupOutput) ToGroupOutputWithContext(ctx context.Context) GroupOutput {
	return o
}

type GroupArrayOutput struct{ *pulumi.OutputState }

func (GroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Group)(nil)).Elem()
}

func (o GroupArrayOutput) ToGroupArrayOutput() GroupArrayOutput {
	return o
}

func (o GroupArrayOutput) ToGroupArrayOutputWithContext(ctx context.Context) GroupArrayOutput {
	return o
}

func (o GroupArrayOutput) Index(i pulumi.IntInput) GroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Group {
		return vs[0].([]*Group)[vs[1].(int)]
	}).(GroupOutput)
}

type GroupMapOutput struct{ *pulumi.OutputState }

func (GroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Group)(nil)).Elem()
}

func (o GroupMapOutput) ToGroupMapOutput() GroupMapOutput {
	return o
}

func (o GroupMapOutput) ToGroupMapOutputWithContext(ctx context.Context) GroupMapOutput {
	return o
}

func (o GroupMapOutput) MapIndex(k pulumi.StringInput) GroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Group {
		return vs[0].(map[string]*Group)[vs[1].(string)]
	}).(GroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GroupInput)(nil)).Elem(), &Group{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupArrayInput)(nil)).Elem(), GroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupMapInput)(nil)).Elem(), GroupMap{})
	pulumi.RegisterOutputType(GroupOutput{})
	pulumi.RegisterOutputType(GroupArrayOutput{})
	pulumi.RegisterOutputType(GroupMapOutput{})
}
