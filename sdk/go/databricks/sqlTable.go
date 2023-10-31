// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Within a metastore, Unity Catalog provides a 3-level namespace for organizing data: Catalogs, databases (also called schemas), and tables / views.
//
// A `SqlTable` is contained within databricks_schema, and can represent either a managed table, an external table or a view.
//
// This resource creates and updates the Unity Catalog table/view by executing the necessary SQL queries on a special auto-terminating cluster it would create for this operation. You could also specify a SQL warehouse or cluster for the queries to be executed on.
//
// ## Import
//
// # This resource can be imported by its full namebash
//
// ```sh
//
//	$ pulumi import databricks:index/sqlTable:SqlTable this <catalog_name>.<schema_name>.<name>
//
// ```
type SqlTable struct {
	pulumi.CustomResourceState

	// Name of parent catalog. Change forces creation of a new resource.
	CatalogName pulumi.StringOutput `pulumi:"catalogName"`
	ClusterId   pulumi.StringOutput `pulumi:"clusterId"`
	// a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
	ClusterKeys pulumi.StringArrayOutput  `pulumi:"clusterKeys"`
	Columns     SqlTableColumnArrayOutput `pulumi:"columns"`
	// User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
	DataSourceFormat pulumi.StringPtrOutput `pulumi:"dataSourceFormat"`
	// Name of table relative to parent catalog and schema. Change forces creation of a new resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Map of user defined table options. Change forces creation of a new resource.
	Options pulumi.MapOutput `pulumi:"options"`
	// a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `clusterKeys`.
	Partitions pulumi.StringArrayOutput `pulumi:"partitions"`
	// Map of table properties.
	Properties pulumi.MapOutput `pulumi:"properties"`
	// Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
	SchemaName pulumi.StringOutput `pulumi:"schemaName"`
	// For EXTERNAL Tables only: the name of storage credential to use. Change forces creation of a new resource.
	StorageCredentialName pulumi.StringPtrOutput `pulumi:"storageCredentialName"`
	// URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
	StorageLocation pulumi.StringPtrOutput `pulumi:"storageLocation"`
	// Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
	TableType pulumi.StringOutput `pulumi:"tableType"`
	// SQL text defining the view (for `tableType == "VIEW"`). Not supported for `MANAGED` or `EXTERNAL` table_type.
	ViewDefinition pulumi.StringPtrOutput `pulumi:"viewDefinition"`
	// All table CRUD operations must be executed on a running cluster or SQL warehouse. If a `warehouseId` is specified, that SQL warehouse will be used to execute SQL commands to manage this table. Conflicts with `clusterId`.
	WarehouseId pulumi.StringPtrOutput `pulumi:"warehouseId"`
}

// NewSqlTable registers a new resource with the given unique name, arguments, and options.
func NewSqlTable(ctx *pulumi.Context,
	name string, args *SqlTableArgs, opts ...pulumi.ResourceOption) (*SqlTable, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CatalogName == nil {
		return nil, errors.New("invalid value for required argument 'CatalogName'")
	}
	if args.SchemaName == nil {
		return nil, errors.New("invalid value for required argument 'SchemaName'")
	}
	if args.TableType == nil {
		return nil, errors.New("invalid value for required argument 'TableType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SqlTable
	err := ctx.RegisterResource("databricks:index/sqlTable:SqlTable", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSqlTable gets an existing SqlTable resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSqlTable(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SqlTableState, opts ...pulumi.ResourceOption) (*SqlTable, error) {
	var resource SqlTable
	err := ctx.ReadResource("databricks:index/sqlTable:SqlTable", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SqlTable resources.
type sqlTableState struct {
	// Name of parent catalog. Change forces creation of a new resource.
	CatalogName *string `pulumi:"catalogName"`
	ClusterId   *string `pulumi:"clusterId"`
	// a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
	ClusterKeys []string         `pulumi:"clusterKeys"`
	Columns     []SqlTableColumn `pulumi:"columns"`
	// User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
	Comment *string `pulumi:"comment"`
	// External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
	DataSourceFormat *string `pulumi:"dataSourceFormat"`
	// Name of table relative to parent catalog and schema. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Map of user defined table options. Change forces creation of a new resource.
	Options map[string]interface{} `pulumi:"options"`
	// a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `clusterKeys`.
	Partitions []string `pulumi:"partitions"`
	// Map of table properties.
	Properties map[string]interface{} `pulumi:"properties"`
	// Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
	SchemaName *string `pulumi:"schemaName"`
	// For EXTERNAL Tables only: the name of storage credential to use. Change forces creation of a new resource.
	StorageCredentialName *string `pulumi:"storageCredentialName"`
	// URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
	StorageLocation *string `pulumi:"storageLocation"`
	// Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
	TableType *string `pulumi:"tableType"`
	// SQL text defining the view (for `tableType == "VIEW"`). Not supported for `MANAGED` or `EXTERNAL` table_type.
	ViewDefinition *string `pulumi:"viewDefinition"`
	// All table CRUD operations must be executed on a running cluster or SQL warehouse. If a `warehouseId` is specified, that SQL warehouse will be used to execute SQL commands to manage this table. Conflicts with `clusterId`.
	WarehouseId *string `pulumi:"warehouseId"`
}

type SqlTableState struct {
	// Name of parent catalog. Change forces creation of a new resource.
	CatalogName pulumi.StringPtrInput
	ClusterId   pulumi.StringPtrInput
	// a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
	ClusterKeys pulumi.StringArrayInput
	Columns     SqlTableColumnArrayInput
	// User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
	Comment pulumi.StringPtrInput
	// External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
	DataSourceFormat pulumi.StringPtrInput
	// Name of table relative to parent catalog and schema. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Map of user defined table options. Change forces creation of a new resource.
	Options pulumi.MapInput
	// a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `clusterKeys`.
	Partitions pulumi.StringArrayInput
	// Map of table properties.
	Properties pulumi.MapInput
	// Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
	SchemaName pulumi.StringPtrInput
	// For EXTERNAL Tables only: the name of storage credential to use. Change forces creation of a new resource.
	StorageCredentialName pulumi.StringPtrInput
	// URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
	StorageLocation pulumi.StringPtrInput
	// Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
	TableType pulumi.StringPtrInput
	// SQL text defining the view (for `tableType == "VIEW"`). Not supported for `MANAGED` or `EXTERNAL` table_type.
	ViewDefinition pulumi.StringPtrInput
	// All table CRUD operations must be executed on a running cluster or SQL warehouse. If a `warehouseId` is specified, that SQL warehouse will be used to execute SQL commands to manage this table. Conflicts with `clusterId`.
	WarehouseId pulumi.StringPtrInput
}

func (SqlTableState) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlTableState)(nil)).Elem()
}

type sqlTableArgs struct {
	// Name of parent catalog. Change forces creation of a new resource.
	CatalogName string  `pulumi:"catalogName"`
	ClusterId   *string `pulumi:"clusterId"`
	// a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
	ClusterKeys []string         `pulumi:"clusterKeys"`
	Columns     []SqlTableColumn `pulumi:"columns"`
	// User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
	Comment *string `pulumi:"comment"`
	// External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
	DataSourceFormat *string `pulumi:"dataSourceFormat"`
	// Name of table relative to parent catalog and schema. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Map of user defined table options. Change forces creation of a new resource.
	Options map[string]interface{} `pulumi:"options"`
	// a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `clusterKeys`.
	Partitions []string `pulumi:"partitions"`
	// Map of table properties.
	Properties map[string]interface{} `pulumi:"properties"`
	// Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
	SchemaName string `pulumi:"schemaName"`
	// For EXTERNAL Tables only: the name of storage credential to use. Change forces creation of a new resource.
	StorageCredentialName *string `pulumi:"storageCredentialName"`
	// URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
	StorageLocation *string `pulumi:"storageLocation"`
	// Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
	TableType string `pulumi:"tableType"`
	// SQL text defining the view (for `tableType == "VIEW"`). Not supported for `MANAGED` or `EXTERNAL` table_type.
	ViewDefinition *string `pulumi:"viewDefinition"`
	// All table CRUD operations must be executed on a running cluster or SQL warehouse. If a `warehouseId` is specified, that SQL warehouse will be used to execute SQL commands to manage this table. Conflicts with `clusterId`.
	WarehouseId *string `pulumi:"warehouseId"`
}

// The set of arguments for constructing a SqlTable resource.
type SqlTableArgs struct {
	// Name of parent catalog. Change forces creation of a new resource.
	CatalogName pulumi.StringInput
	ClusterId   pulumi.StringPtrInput
	// a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
	ClusterKeys pulumi.StringArrayInput
	Columns     SqlTableColumnArrayInput
	// User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
	Comment pulumi.StringPtrInput
	// External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
	DataSourceFormat pulumi.StringPtrInput
	// Name of table relative to parent catalog and schema. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Map of user defined table options. Change forces creation of a new resource.
	Options pulumi.MapInput
	// a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `clusterKeys`.
	Partitions pulumi.StringArrayInput
	// Map of table properties.
	Properties pulumi.MapInput
	// Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
	SchemaName pulumi.StringInput
	// For EXTERNAL Tables only: the name of storage credential to use. Change forces creation of a new resource.
	StorageCredentialName pulumi.StringPtrInput
	// URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
	StorageLocation pulumi.StringPtrInput
	// Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
	TableType pulumi.StringInput
	// SQL text defining the view (for `tableType == "VIEW"`). Not supported for `MANAGED` or `EXTERNAL` table_type.
	ViewDefinition pulumi.StringPtrInput
	// All table CRUD operations must be executed on a running cluster or SQL warehouse. If a `warehouseId` is specified, that SQL warehouse will be used to execute SQL commands to manage this table. Conflicts with `clusterId`.
	WarehouseId pulumi.StringPtrInput
}

func (SqlTableArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlTableArgs)(nil)).Elem()
}

type SqlTableInput interface {
	pulumi.Input

	ToSqlTableOutput() SqlTableOutput
	ToSqlTableOutputWithContext(ctx context.Context) SqlTableOutput
}

func (*SqlTable) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlTable)(nil)).Elem()
}

func (i *SqlTable) ToSqlTableOutput() SqlTableOutput {
	return i.ToSqlTableOutputWithContext(context.Background())
}

func (i *SqlTable) ToSqlTableOutputWithContext(ctx context.Context) SqlTableOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlTableOutput)
}

func (i *SqlTable) ToOutput(ctx context.Context) pulumix.Output[*SqlTable] {
	return pulumix.Output[*SqlTable]{
		OutputState: i.ToSqlTableOutputWithContext(ctx).OutputState,
	}
}

// SqlTableArrayInput is an input type that accepts SqlTableArray and SqlTableArrayOutput values.
// You can construct a concrete instance of `SqlTableArrayInput` via:
//
//	SqlTableArray{ SqlTableArgs{...} }
type SqlTableArrayInput interface {
	pulumi.Input

	ToSqlTableArrayOutput() SqlTableArrayOutput
	ToSqlTableArrayOutputWithContext(context.Context) SqlTableArrayOutput
}

type SqlTableArray []SqlTableInput

func (SqlTableArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlTable)(nil)).Elem()
}

func (i SqlTableArray) ToSqlTableArrayOutput() SqlTableArrayOutput {
	return i.ToSqlTableArrayOutputWithContext(context.Background())
}

func (i SqlTableArray) ToSqlTableArrayOutputWithContext(ctx context.Context) SqlTableArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlTableArrayOutput)
}

func (i SqlTableArray) ToOutput(ctx context.Context) pulumix.Output[[]*SqlTable] {
	return pulumix.Output[[]*SqlTable]{
		OutputState: i.ToSqlTableArrayOutputWithContext(ctx).OutputState,
	}
}

// SqlTableMapInput is an input type that accepts SqlTableMap and SqlTableMapOutput values.
// You can construct a concrete instance of `SqlTableMapInput` via:
//
//	SqlTableMap{ "key": SqlTableArgs{...} }
type SqlTableMapInput interface {
	pulumi.Input

	ToSqlTableMapOutput() SqlTableMapOutput
	ToSqlTableMapOutputWithContext(context.Context) SqlTableMapOutput
}

type SqlTableMap map[string]SqlTableInput

func (SqlTableMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlTable)(nil)).Elem()
}

func (i SqlTableMap) ToSqlTableMapOutput() SqlTableMapOutput {
	return i.ToSqlTableMapOutputWithContext(context.Background())
}

func (i SqlTableMap) ToSqlTableMapOutputWithContext(ctx context.Context) SqlTableMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlTableMapOutput)
}

func (i SqlTableMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*SqlTable] {
	return pulumix.Output[map[string]*SqlTable]{
		OutputState: i.ToSqlTableMapOutputWithContext(ctx).OutputState,
	}
}

type SqlTableOutput struct{ *pulumi.OutputState }

func (SqlTableOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlTable)(nil)).Elem()
}

func (o SqlTableOutput) ToSqlTableOutput() SqlTableOutput {
	return o
}

func (o SqlTableOutput) ToSqlTableOutputWithContext(ctx context.Context) SqlTableOutput {
	return o
}

func (o SqlTableOutput) ToOutput(ctx context.Context) pulumix.Output[*SqlTable] {
	return pulumix.Output[*SqlTable]{
		OutputState: o.OutputState,
	}
}

// Name of parent catalog. Change forces creation of a new resource.
func (o SqlTableOutput) CatalogName() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlTable) pulumi.StringOutput { return v.CatalogName }).(pulumi.StringOutput)
}

func (o SqlTableOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlTable) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// a subset of columns to liquid cluster the table by. Conflicts with `partitions`.
func (o SqlTableOutput) ClusterKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SqlTable) pulumi.StringArrayOutput { return v.ClusterKeys }).(pulumi.StringArrayOutput)
}

func (o SqlTableOutput) Columns() SqlTableColumnArrayOutput {
	return o.ApplyT(func(v *SqlTable) SqlTableColumnArrayOutput { return v.Columns }).(SqlTableColumnArrayOutput)
}

// User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
func (o SqlTableOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlTable) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
func (o SqlTableOutput) DataSourceFormat() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlTable) pulumi.StringPtrOutput { return v.DataSourceFormat }).(pulumi.StringPtrOutput)
}

// Name of table relative to parent catalog and schema. Change forces creation of a new resource.
func (o SqlTableOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlTable) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Map of user defined table options. Change forces creation of a new resource.
func (o SqlTableOutput) Options() pulumi.MapOutput {
	return o.ApplyT(func(v *SqlTable) pulumi.MapOutput { return v.Options }).(pulumi.MapOutput)
}

// a subset of columns to partition the table by. Change forces creation of a new resource. Conflicts with `clusterKeys`.
func (o SqlTableOutput) Partitions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SqlTable) pulumi.StringArrayOutput { return v.Partitions }).(pulumi.StringArrayOutput)
}

// Map of table properties.
func (o SqlTableOutput) Properties() pulumi.MapOutput {
	return o.ApplyT(func(v *SqlTable) pulumi.MapOutput { return v.Properties }).(pulumi.MapOutput)
}

// Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
func (o SqlTableOutput) SchemaName() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlTable) pulumi.StringOutput { return v.SchemaName }).(pulumi.StringOutput)
}

// For EXTERNAL Tables only: the name of storage credential to use. Change forces creation of a new resource.
func (o SqlTableOutput) StorageCredentialName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlTable) pulumi.StringPtrOutput { return v.StorageCredentialName }).(pulumi.StringPtrOutput)
}

// URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
func (o SqlTableOutput) StorageLocation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlTable) pulumi.StringPtrOutput { return v.StorageLocation }).(pulumi.StringPtrOutput)
}

// Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
func (o SqlTableOutput) TableType() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlTable) pulumi.StringOutput { return v.TableType }).(pulumi.StringOutput)
}

// SQL text defining the view (for `tableType == "VIEW"`). Not supported for `MANAGED` or `EXTERNAL` table_type.
func (o SqlTableOutput) ViewDefinition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlTable) pulumi.StringPtrOutput { return v.ViewDefinition }).(pulumi.StringPtrOutput)
}

// All table CRUD operations must be executed on a running cluster or SQL warehouse. If a `warehouseId` is specified, that SQL warehouse will be used to execute SQL commands to manage this table. Conflicts with `clusterId`.
func (o SqlTableOutput) WarehouseId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlTable) pulumi.StringPtrOutput { return v.WarehouseId }).(pulumi.StringPtrOutput)
}

type SqlTableArrayOutput struct{ *pulumi.OutputState }

func (SqlTableArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlTable)(nil)).Elem()
}

func (o SqlTableArrayOutput) ToSqlTableArrayOutput() SqlTableArrayOutput {
	return o
}

func (o SqlTableArrayOutput) ToSqlTableArrayOutputWithContext(ctx context.Context) SqlTableArrayOutput {
	return o
}

func (o SqlTableArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*SqlTable] {
	return pulumix.Output[[]*SqlTable]{
		OutputState: o.OutputState,
	}
}

func (o SqlTableArrayOutput) Index(i pulumi.IntInput) SqlTableOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SqlTable {
		return vs[0].([]*SqlTable)[vs[1].(int)]
	}).(SqlTableOutput)
}

type SqlTableMapOutput struct{ *pulumi.OutputState }

func (SqlTableMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlTable)(nil)).Elem()
}

func (o SqlTableMapOutput) ToSqlTableMapOutput() SqlTableMapOutput {
	return o
}

func (o SqlTableMapOutput) ToSqlTableMapOutputWithContext(ctx context.Context) SqlTableMapOutput {
	return o
}

func (o SqlTableMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*SqlTable] {
	return pulumix.Output[map[string]*SqlTable]{
		OutputState: o.OutputState,
	}
}

func (o SqlTableMapOutput) MapIndex(k pulumi.StringInput) SqlTableOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SqlTable {
		return vs[0].(map[string]*SqlTable)[vs[1].(string)]
	}).(SqlTableOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SqlTableInput)(nil)).Elem(), &SqlTable{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlTableArrayInput)(nil)).Elem(), SqlTableArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlTableMapInput)(nil)).Elem(), SqlTableMap{})
	pulumi.RegisterOutputType(SqlTableOutput{})
	pulumi.RegisterOutputType(SqlTableArrayOutput{})
	pulumi.RegisterOutputType(SqlTableMapOutput{})
}
