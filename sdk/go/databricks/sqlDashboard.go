// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource is used to manage [Databricks SQL Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html). To manage [SQLA resources](https://docs.databricks.com/sql/get-started/concepts.html) you must have `databricksSqlAccess` on your Group or databricks_user.
//
// **Note:** documentation for this resource is a work in progress.
//
// A dashboard may have one or more widgets.
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
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			sharedDir, err := databricks.NewDirectory(ctx, "sharedDir", &databricks.DirectoryArgs{
//				Path: pulumi.String("/Shared/Dashboards"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewSqlDashboard(ctx, "d1", &databricks.SqlDashboardArgs{
//				Parent: sharedDir.ObjectId.ApplyT(func(objectId int) (string, error) {
//					return fmt.Sprintf("folders/%v", objectId), nil
//				}).(pulumi.StringOutput),
//				Tags: pulumi.StringArray{
//					pulumi.String("some-tag"),
//					pulumi.String("another-tag"),
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
//
// Example permission to share dashboard with all users:
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
//			_, err := databricks.NewPermissions(ctx, "d1", &databricks.PermissionsArgs{
//				SqlDashboardId: pulumi.Any(databricks_sql_dashboard.D1.Id),
//				AccessControls: databricks.PermissionsAccessControlArray{
//					&databricks.PermissionsAccessControlArgs{
//						GroupName:       pulumi.Any(data.Databricks_group.Users.Display_name),
//						PermissionLevel: pulumi.String("CAN_RUN"),
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
// ## Related Resources
//
// The following resources are often used in the same context:
//
// * End to end workspace management guide.
// * SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
// * SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all SqlEndpoint of workspace.
// * SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
//
// ## Import
//
// You can import a `databricks_sql_dashboard` resource with ID like the followingbash
//
// ```sh
//
//	$ pulumi import databricks:index/sqlDashboard:SqlDashboard this <dashboard-id>
//
// ```
type SqlDashboard struct {
	pulumi.CustomResourceState

	CreatedAt               pulumi.StringOutput      `pulumi:"createdAt"`
	DashboardFiltersEnabled pulumi.BoolPtrOutput     `pulumi:"dashboardFiltersEnabled"`
	Name                    pulumi.StringOutput      `pulumi:"name"`
	Parent                  pulumi.StringPtrOutput   `pulumi:"parent"`
	Tags                    pulumi.StringArrayOutput `pulumi:"tags"`
	UpdatedAt               pulumi.StringOutput      `pulumi:"updatedAt"`
}

// NewSqlDashboard registers a new resource with the given unique name, arguments, and options.
func NewSqlDashboard(ctx *pulumi.Context,
	name string, args *SqlDashboardArgs, opts ...pulumi.ResourceOption) (*SqlDashboard, error) {
	if args == nil {
		args = &SqlDashboardArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SqlDashboard
	err := ctx.RegisterResource("databricks:index/sqlDashboard:SqlDashboard", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSqlDashboard gets an existing SqlDashboard resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSqlDashboard(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SqlDashboardState, opts ...pulumi.ResourceOption) (*SqlDashboard, error) {
	var resource SqlDashboard
	err := ctx.ReadResource("databricks:index/sqlDashboard:SqlDashboard", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SqlDashboard resources.
type sqlDashboardState struct {
	CreatedAt               *string  `pulumi:"createdAt"`
	DashboardFiltersEnabled *bool    `pulumi:"dashboardFiltersEnabled"`
	Name                    *string  `pulumi:"name"`
	Parent                  *string  `pulumi:"parent"`
	Tags                    []string `pulumi:"tags"`
	UpdatedAt               *string  `pulumi:"updatedAt"`
}

type SqlDashboardState struct {
	CreatedAt               pulumi.StringPtrInput
	DashboardFiltersEnabled pulumi.BoolPtrInput
	Name                    pulumi.StringPtrInput
	Parent                  pulumi.StringPtrInput
	Tags                    pulumi.StringArrayInput
	UpdatedAt               pulumi.StringPtrInput
}

func (SqlDashboardState) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlDashboardState)(nil)).Elem()
}

type sqlDashboardArgs struct {
	CreatedAt               *string  `pulumi:"createdAt"`
	DashboardFiltersEnabled *bool    `pulumi:"dashboardFiltersEnabled"`
	Name                    *string  `pulumi:"name"`
	Parent                  *string  `pulumi:"parent"`
	Tags                    []string `pulumi:"tags"`
	UpdatedAt               *string  `pulumi:"updatedAt"`
}

// The set of arguments for constructing a SqlDashboard resource.
type SqlDashboardArgs struct {
	CreatedAt               pulumi.StringPtrInput
	DashboardFiltersEnabled pulumi.BoolPtrInput
	Name                    pulumi.StringPtrInput
	Parent                  pulumi.StringPtrInput
	Tags                    pulumi.StringArrayInput
	UpdatedAt               pulumi.StringPtrInput
}

func (SqlDashboardArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlDashboardArgs)(nil)).Elem()
}

type SqlDashboardInput interface {
	pulumi.Input

	ToSqlDashboardOutput() SqlDashboardOutput
	ToSqlDashboardOutputWithContext(ctx context.Context) SqlDashboardOutput
}

func (*SqlDashboard) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlDashboard)(nil)).Elem()
}

func (i *SqlDashboard) ToSqlDashboardOutput() SqlDashboardOutput {
	return i.ToSqlDashboardOutputWithContext(context.Background())
}

func (i *SqlDashboard) ToSqlDashboardOutputWithContext(ctx context.Context) SqlDashboardOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlDashboardOutput)
}

// SqlDashboardArrayInput is an input type that accepts SqlDashboardArray and SqlDashboardArrayOutput values.
// You can construct a concrete instance of `SqlDashboardArrayInput` via:
//
//	SqlDashboardArray{ SqlDashboardArgs{...} }
type SqlDashboardArrayInput interface {
	pulumi.Input

	ToSqlDashboardArrayOutput() SqlDashboardArrayOutput
	ToSqlDashboardArrayOutputWithContext(context.Context) SqlDashboardArrayOutput
}

type SqlDashboardArray []SqlDashboardInput

func (SqlDashboardArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlDashboard)(nil)).Elem()
}

func (i SqlDashboardArray) ToSqlDashboardArrayOutput() SqlDashboardArrayOutput {
	return i.ToSqlDashboardArrayOutputWithContext(context.Background())
}

func (i SqlDashboardArray) ToSqlDashboardArrayOutputWithContext(ctx context.Context) SqlDashboardArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlDashboardArrayOutput)
}

// SqlDashboardMapInput is an input type that accepts SqlDashboardMap and SqlDashboardMapOutput values.
// You can construct a concrete instance of `SqlDashboardMapInput` via:
//
//	SqlDashboardMap{ "key": SqlDashboardArgs{...} }
type SqlDashboardMapInput interface {
	pulumi.Input

	ToSqlDashboardMapOutput() SqlDashboardMapOutput
	ToSqlDashboardMapOutputWithContext(context.Context) SqlDashboardMapOutput
}

type SqlDashboardMap map[string]SqlDashboardInput

func (SqlDashboardMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlDashboard)(nil)).Elem()
}

func (i SqlDashboardMap) ToSqlDashboardMapOutput() SqlDashboardMapOutput {
	return i.ToSqlDashboardMapOutputWithContext(context.Background())
}

func (i SqlDashboardMap) ToSqlDashboardMapOutputWithContext(ctx context.Context) SqlDashboardMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlDashboardMapOutput)
}

type SqlDashboardOutput struct{ *pulumi.OutputState }

func (SqlDashboardOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlDashboard)(nil)).Elem()
}

func (o SqlDashboardOutput) ToSqlDashboardOutput() SqlDashboardOutput {
	return o
}

func (o SqlDashboardOutput) ToSqlDashboardOutputWithContext(ctx context.Context) SqlDashboardOutput {
	return o
}

func (o SqlDashboardOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlDashboard) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

func (o SqlDashboardOutput) DashboardFiltersEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SqlDashboard) pulumi.BoolPtrOutput { return v.DashboardFiltersEnabled }).(pulumi.BoolPtrOutput)
}

func (o SqlDashboardOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlDashboard) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o SqlDashboardOutput) Parent() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlDashboard) pulumi.StringPtrOutput { return v.Parent }).(pulumi.StringPtrOutput)
}

func (o SqlDashboardOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SqlDashboard) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

func (o SqlDashboardOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlDashboard) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type SqlDashboardArrayOutput struct{ *pulumi.OutputState }

func (SqlDashboardArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlDashboard)(nil)).Elem()
}

func (o SqlDashboardArrayOutput) ToSqlDashboardArrayOutput() SqlDashboardArrayOutput {
	return o
}

func (o SqlDashboardArrayOutput) ToSqlDashboardArrayOutputWithContext(ctx context.Context) SqlDashboardArrayOutput {
	return o
}

func (o SqlDashboardArrayOutput) Index(i pulumi.IntInput) SqlDashboardOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SqlDashboard {
		return vs[0].([]*SqlDashboard)[vs[1].(int)]
	}).(SqlDashboardOutput)
}

type SqlDashboardMapOutput struct{ *pulumi.OutputState }

func (SqlDashboardMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlDashboard)(nil)).Elem()
}

func (o SqlDashboardMapOutput) ToSqlDashboardMapOutput() SqlDashboardMapOutput {
	return o
}

func (o SqlDashboardMapOutput) ToSqlDashboardMapOutputWithContext(ctx context.Context) SqlDashboardMapOutput {
	return o
}

func (o SqlDashboardMapOutput) MapIndex(k pulumi.StringInput) SqlDashboardOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SqlDashboard {
		return vs[0].(map[string]*SqlDashboard)[vs[1].(string)]
	}).(SqlDashboardOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SqlDashboardInput)(nil)).Elem(), &SqlDashboard{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlDashboardArrayInput)(nil)).Elem(), SqlDashboardArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlDashboardMapInput)(nil)).Elem(), SqlDashboardMap{})
	pulumi.RegisterOutputType(SqlDashboardOutput{})
	pulumi.RegisterOutputType(SqlDashboardArrayOutput{})
	pulumi.RegisterOutputType(SqlDashboardMapOutput{})
}
