// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// To manage [SQLA resources](https://docs.databricks.com/sql/get-started/concepts.html) you must have `databricksSqlAccess` on your Group or databricks_user.
//
// **Note:** documentation for this resource is a work in progress.
//
// A visualization is always tied to a query. Every query may have one or more visualizations.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"encoding/json"
//
// 	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		tmpJSON0, err := json.Marshal(map[string]interface{}{
// 			"itemsPerPage": 25,
// 			"columns": []map[string]interface{}{
// 				map[string]interface{}{
// 					"name":      "p1",
// 					"type":      "string",
// 					"title":     "Parameter 1",
// 					"displayAs": "string",
// 				},
// 				map[string]interface{}{
// 					"name":           "p2",
// 					"type":           "string",
// 					"title":          "Parameter 2",
// 					"displayAs":      "link",
// 					"highlightLinks": true,
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		json0 := string(tmpJSON0)
// 		_, err := databricks.NewSqlVisualization(ctx, "q1v1", &databricks.SqlVisualizationArgs{
// 			QueryId:     pulumi.Any(databricks_sql_query.Q1.Id),
// 			Type:        pulumi.String("table"),
// 			Description: pulumi.String("Some Description"),
// 			Options:     pulumi.String(json0),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Related Resources
//
// The following resources are often used in the same context:
//
// * End to end workspace management guide.
// * SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
// * SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
// * SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all SqlEndpoint of workspace.
// * SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
//
// ## Import
//
// -> **Note** Importing this resource is not currently supported.
type SqlVisualization struct {
	pulumi.CustomResourceState

	Description     pulumi.StringPtrOutput `pulumi:"description"`
	Name            pulumi.StringOutput    `pulumi:"name"`
	Options         pulumi.StringOutput    `pulumi:"options"`
	QueryId         pulumi.StringOutput    `pulumi:"queryId"`
	Type            pulumi.StringOutput    `pulumi:"type"`
	VisualizationId pulumi.StringOutput    `pulumi:"visualizationId"`
}

// NewSqlVisualization registers a new resource with the given unique name, arguments, and options.
func NewSqlVisualization(ctx *pulumi.Context,
	name string, args *SqlVisualizationArgs, opts ...pulumi.ResourceOption) (*SqlVisualization, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Options == nil {
		return nil, errors.New("invalid value for required argument 'Options'")
	}
	if args.QueryId == nil {
		return nil, errors.New("invalid value for required argument 'QueryId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource SqlVisualization
	err := ctx.RegisterResource("databricks:index/sqlVisualization:SqlVisualization", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSqlVisualization gets an existing SqlVisualization resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSqlVisualization(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SqlVisualizationState, opts ...pulumi.ResourceOption) (*SqlVisualization, error) {
	var resource SqlVisualization
	err := ctx.ReadResource("databricks:index/sqlVisualization:SqlVisualization", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SqlVisualization resources.
type sqlVisualizationState struct {
	Description     *string `pulumi:"description"`
	Name            *string `pulumi:"name"`
	Options         *string `pulumi:"options"`
	QueryId         *string `pulumi:"queryId"`
	Type            *string `pulumi:"type"`
	VisualizationId *string `pulumi:"visualizationId"`
}

type SqlVisualizationState struct {
	Description     pulumi.StringPtrInput
	Name            pulumi.StringPtrInput
	Options         pulumi.StringPtrInput
	QueryId         pulumi.StringPtrInput
	Type            pulumi.StringPtrInput
	VisualizationId pulumi.StringPtrInput
}

func (SqlVisualizationState) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlVisualizationState)(nil)).Elem()
}

type sqlVisualizationArgs struct {
	Description     *string `pulumi:"description"`
	Name            *string `pulumi:"name"`
	Options         string  `pulumi:"options"`
	QueryId         string  `pulumi:"queryId"`
	Type            string  `pulumi:"type"`
	VisualizationId *string `pulumi:"visualizationId"`
}

// The set of arguments for constructing a SqlVisualization resource.
type SqlVisualizationArgs struct {
	Description     pulumi.StringPtrInput
	Name            pulumi.StringPtrInput
	Options         pulumi.StringInput
	QueryId         pulumi.StringInput
	Type            pulumi.StringInput
	VisualizationId pulumi.StringPtrInput
}

func (SqlVisualizationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlVisualizationArgs)(nil)).Elem()
}

type SqlVisualizationInput interface {
	pulumi.Input

	ToSqlVisualizationOutput() SqlVisualizationOutput
	ToSqlVisualizationOutputWithContext(ctx context.Context) SqlVisualizationOutput
}

func (*SqlVisualization) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlVisualization)(nil)).Elem()
}

func (i *SqlVisualization) ToSqlVisualizationOutput() SqlVisualizationOutput {
	return i.ToSqlVisualizationOutputWithContext(context.Background())
}

func (i *SqlVisualization) ToSqlVisualizationOutputWithContext(ctx context.Context) SqlVisualizationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlVisualizationOutput)
}

// SqlVisualizationArrayInput is an input type that accepts SqlVisualizationArray and SqlVisualizationArrayOutput values.
// You can construct a concrete instance of `SqlVisualizationArrayInput` via:
//
//          SqlVisualizationArray{ SqlVisualizationArgs{...} }
type SqlVisualizationArrayInput interface {
	pulumi.Input

	ToSqlVisualizationArrayOutput() SqlVisualizationArrayOutput
	ToSqlVisualizationArrayOutputWithContext(context.Context) SqlVisualizationArrayOutput
}

type SqlVisualizationArray []SqlVisualizationInput

func (SqlVisualizationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlVisualization)(nil)).Elem()
}

func (i SqlVisualizationArray) ToSqlVisualizationArrayOutput() SqlVisualizationArrayOutput {
	return i.ToSqlVisualizationArrayOutputWithContext(context.Background())
}

func (i SqlVisualizationArray) ToSqlVisualizationArrayOutputWithContext(ctx context.Context) SqlVisualizationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlVisualizationArrayOutput)
}

// SqlVisualizationMapInput is an input type that accepts SqlVisualizationMap and SqlVisualizationMapOutput values.
// You can construct a concrete instance of `SqlVisualizationMapInput` via:
//
//          SqlVisualizationMap{ "key": SqlVisualizationArgs{...} }
type SqlVisualizationMapInput interface {
	pulumi.Input

	ToSqlVisualizationMapOutput() SqlVisualizationMapOutput
	ToSqlVisualizationMapOutputWithContext(context.Context) SqlVisualizationMapOutput
}

type SqlVisualizationMap map[string]SqlVisualizationInput

func (SqlVisualizationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlVisualization)(nil)).Elem()
}

func (i SqlVisualizationMap) ToSqlVisualizationMapOutput() SqlVisualizationMapOutput {
	return i.ToSqlVisualizationMapOutputWithContext(context.Background())
}

func (i SqlVisualizationMap) ToSqlVisualizationMapOutputWithContext(ctx context.Context) SqlVisualizationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlVisualizationMapOutput)
}

type SqlVisualizationOutput struct{ *pulumi.OutputState }

func (SqlVisualizationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlVisualization)(nil)).Elem()
}

func (o SqlVisualizationOutput) ToSqlVisualizationOutput() SqlVisualizationOutput {
	return o
}

func (o SqlVisualizationOutput) ToSqlVisualizationOutputWithContext(ctx context.Context) SqlVisualizationOutput {
	return o
}

type SqlVisualizationArrayOutput struct{ *pulumi.OutputState }

func (SqlVisualizationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlVisualization)(nil)).Elem()
}

func (o SqlVisualizationArrayOutput) ToSqlVisualizationArrayOutput() SqlVisualizationArrayOutput {
	return o
}

func (o SqlVisualizationArrayOutput) ToSqlVisualizationArrayOutputWithContext(ctx context.Context) SqlVisualizationArrayOutput {
	return o
}

func (o SqlVisualizationArrayOutput) Index(i pulumi.IntInput) SqlVisualizationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SqlVisualization {
		return vs[0].([]*SqlVisualization)[vs[1].(int)]
	}).(SqlVisualizationOutput)
}

type SqlVisualizationMapOutput struct{ *pulumi.OutputState }

func (SqlVisualizationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlVisualization)(nil)).Elem()
}

func (o SqlVisualizationMapOutput) ToSqlVisualizationMapOutput() SqlVisualizationMapOutput {
	return o
}

func (o SqlVisualizationMapOutput) ToSqlVisualizationMapOutputWithContext(ctx context.Context) SqlVisualizationMapOutput {
	return o
}

func (o SqlVisualizationMapOutput) MapIndex(k pulumi.StringInput) SqlVisualizationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SqlVisualization {
		return vs[0].(map[string]*SqlVisualization)[vs[1].(string)]
	}).(SqlVisualizationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SqlVisualizationInput)(nil)).Elem(), &SqlVisualization{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlVisualizationArrayInput)(nil)).Elem(), SqlVisualizationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlVisualizationMapInput)(nil)).Elem(), SqlVisualizationMap{})
	pulumi.RegisterOutputType(SqlVisualizationOutput{})
	pulumi.RegisterOutputType(SqlVisualizationArrayOutput{})
	pulumi.RegisterOutputType(SqlVisualizationMapOutput{})
}
