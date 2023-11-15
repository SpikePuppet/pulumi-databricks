// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
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
//			_, err := databricks.NewCatalog(ctx, "sandbox", &databricks.CatalogArgs{
//				MetastoreId: pulumi.Any(databricks_metastore.This.Id),
//				Comment:     pulumi.String("this catalog is managed by terraform"),
//				Properties: pulumi.Map{
//					"purpose": pulumi.Any("testing"),
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
// The following resources are used in the same context:
//
// * Table data to list tables within Unity Catalog.
// * Schema data to list schemas within Unity Catalog.
// * Catalog data to list catalogs within Unity Catalog.
//
// ## Import
//
// # This resource can be imported by namebash
//
// ```sh
//
//	$ pulumi import databricks:index/catalog:Catalog this <name>
//
// ```
type Catalog struct {
	pulumi.CustomResourceState

	// User-supplied free-form text.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// For Foreign Catalogs: the name of the connection to an external data source. Changes forces creation of a new resource.
	ConnectionName pulumi.StringPtrOutput `pulumi:"connectionName"`
	// Delete catalog regardless of its contents.
	ForceDestroy pulumi.BoolPtrOutput `pulumi:"forceDestroy"`
	// Whether the catalog is accessible from all workspaces or a specific set of workspaces. Can be `ISOLATED` or `OPEN`. Setting the catalog to `ISOLATED` will automatically allow access from the current workspace.
	IsolationMode pulumi.StringOutput `pulumi:"isolationMode"`
	MetastoreId   pulumi.StringOutput `pulumi:"metastoreId"`
	// Name of Catalog relative to parent metastore.
	Name pulumi.StringOutput `pulumi:"name"`
	// For Foreign Catalogs: the name of the entity from an external data source that maps to a catalog. For example, the database name in a PostgreSQL server.
	Options pulumi.MapOutput `pulumi:"options"`
	// Username/groupname/sp applicationId of the catalog owner.
	Owner pulumi.StringOutput `pulumi:"owner"`
	// Extensible Catalog properties.
	Properties pulumi.MapOutput `pulumi:"properties"`
	// For Delta Sharing Catalogs: the name of the delta sharing provider. Change forces creation of a new resource.
	ProviderName pulumi.StringPtrOutput `pulumi:"providerName"`
	// For Delta Sharing Catalogs: the name of the share under the share provider. Change forces creation of a new resource.
	ShareName pulumi.StringPtrOutput `pulumi:"shareName"`
	// Managed location of the catalog. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the metastore root location. Change forces creation of a new resource.
	StorageRoot pulumi.StringPtrOutput `pulumi:"storageRoot"`
}

// NewCatalog registers a new resource with the given unique name, arguments, and options.
func NewCatalog(ctx *pulumi.Context,
	name string, args *CatalogArgs, opts ...pulumi.ResourceOption) (*Catalog, error) {
	if args == nil {
		args = &CatalogArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Catalog
	err := ctx.RegisterResource("databricks:index/catalog:Catalog", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCatalog gets an existing Catalog resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCatalog(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CatalogState, opts ...pulumi.ResourceOption) (*Catalog, error) {
	var resource Catalog
	err := ctx.ReadResource("databricks:index/catalog:Catalog", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Catalog resources.
type catalogState struct {
	// User-supplied free-form text.
	Comment *string `pulumi:"comment"`
	// For Foreign Catalogs: the name of the connection to an external data source. Changes forces creation of a new resource.
	ConnectionName *string `pulumi:"connectionName"`
	// Delete catalog regardless of its contents.
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// Whether the catalog is accessible from all workspaces or a specific set of workspaces. Can be `ISOLATED` or `OPEN`. Setting the catalog to `ISOLATED` will automatically allow access from the current workspace.
	IsolationMode *string `pulumi:"isolationMode"`
	MetastoreId   *string `pulumi:"metastoreId"`
	// Name of Catalog relative to parent metastore.
	Name *string `pulumi:"name"`
	// For Foreign Catalogs: the name of the entity from an external data source that maps to a catalog. For example, the database name in a PostgreSQL server.
	Options map[string]interface{} `pulumi:"options"`
	// Username/groupname/sp applicationId of the catalog owner.
	Owner *string `pulumi:"owner"`
	// Extensible Catalog properties.
	Properties map[string]interface{} `pulumi:"properties"`
	// For Delta Sharing Catalogs: the name of the delta sharing provider. Change forces creation of a new resource.
	ProviderName *string `pulumi:"providerName"`
	// For Delta Sharing Catalogs: the name of the share under the share provider. Change forces creation of a new resource.
	ShareName *string `pulumi:"shareName"`
	// Managed location of the catalog. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the metastore root location. Change forces creation of a new resource.
	StorageRoot *string `pulumi:"storageRoot"`
}

type CatalogState struct {
	// User-supplied free-form text.
	Comment pulumi.StringPtrInput
	// For Foreign Catalogs: the name of the connection to an external data source. Changes forces creation of a new resource.
	ConnectionName pulumi.StringPtrInput
	// Delete catalog regardless of its contents.
	ForceDestroy pulumi.BoolPtrInput
	// Whether the catalog is accessible from all workspaces or a specific set of workspaces. Can be `ISOLATED` or `OPEN`. Setting the catalog to `ISOLATED` will automatically allow access from the current workspace.
	IsolationMode pulumi.StringPtrInput
	MetastoreId   pulumi.StringPtrInput
	// Name of Catalog relative to parent metastore.
	Name pulumi.StringPtrInput
	// For Foreign Catalogs: the name of the entity from an external data source that maps to a catalog. For example, the database name in a PostgreSQL server.
	Options pulumi.MapInput
	// Username/groupname/sp applicationId of the catalog owner.
	Owner pulumi.StringPtrInput
	// Extensible Catalog properties.
	Properties pulumi.MapInput
	// For Delta Sharing Catalogs: the name of the delta sharing provider. Change forces creation of a new resource.
	ProviderName pulumi.StringPtrInput
	// For Delta Sharing Catalogs: the name of the share under the share provider. Change forces creation of a new resource.
	ShareName pulumi.StringPtrInput
	// Managed location of the catalog. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the metastore root location. Change forces creation of a new resource.
	StorageRoot pulumi.StringPtrInput
}

func (CatalogState) ElementType() reflect.Type {
	return reflect.TypeOf((*catalogState)(nil)).Elem()
}

type catalogArgs struct {
	// User-supplied free-form text.
	Comment *string `pulumi:"comment"`
	// For Foreign Catalogs: the name of the connection to an external data source. Changes forces creation of a new resource.
	ConnectionName *string `pulumi:"connectionName"`
	// Delete catalog regardless of its contents.
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// Whether the catalog is accessible from all workspaces or a specific set of workspaces. Can be `ISOLATED` or `OPEN`. Setting the catalog to `ISOLATED` will automatically allow access from the current workspace.
	IsolationMode *string `pulumi:"isolationMode"`
	MetastoreId   *string `pulumi:"metastoreId"`
	// Name of Catalog relative to parent metastore.
	Name *string `pulumi:"name"`
	// For Foreign Catalogs: the name of the entity from an external data source that maps to a catalog. For example, the database name in a PostgreSQL server.
	Options map[string]interface{} `pulumi:"options"`
	// Username/groupname/sp applicationId of the catalog owner.
	Owner *string `pulumi:"owner"`
	// Extensible Catalog properties.
	Properties map[string]interface{} `pulumi:"properties"`
	// For Delta Sharing Catalogs: the name of the delta sharing provider. Change forces creation of a new resource.
	ProviderName *string `pulumi:"providerName"`
	// For Delta Sharing Catalogs: the name of the share under the share provider. Change forces creation of a new resource.
	ShareName *string `pulumi:"shareName"`
	// Managed location of the catalog. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the metastore root location. Change forces creation of a new resource.
	StorageRoot *string `pulumi:"storageRoot"`
}

// The set of arguments for constructing a Catalog resource.
type CatalogArgs struct {
	// User-supplied free-form text.
	Comment pulumi.StringPtrInput
	// For Foreign Catalogs: the name of the connection to an external data source. Changes forces creation of a new resource.
	ConnectionName pulumi.StringPtrInput
	// Delete catalog regardless of its contents.
	ForceDestroy pulumi.BoolPtrInput
	// Whether the catalog is accessible from all workspaces or a specific set of workspaces. Can be `ISOLATED` or `OPEN`. Setting the catalog to `ISOLATED` will automatically allow access from the current workspace.
	IsolationMode pulumi.StringPtrInput
	MetastoreId   pulumi.StringPtrInput
	// Name of Catalog relative to parent metastore.
	Name pulumi.StringPtrInput
	// For Foreign Catalogs: the name of the entity from an external data source that maps to a catalog. For example, the database name in a PostgreSQL server.
	Options pulumi.MapInput
	// Username/groupname/sp applicationId of the catalog owner.
	Owner pulumi.StringPtrInput
	// Extensible Catalog properties.
	Properties pulumi.MapInput
	// For Delta Sharing Catalogs: the name of the delta sharing provider. Change forces creation of a new resource.
	ProviderName pulumi.StringPtrInput
	// For Delta Sharing Catalogs: the name of the share under the share provider. Change forces creation of a new resource.
	ShareName pulumi.StringPtrInput
	// Managed location of the catalog. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the metastore root location. Change forces creation of a new resource.
	StorageRoot pulumi.StringPtrInput
}

func (CatalogArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*catalogArgs)(nil)).Elem()
}

type CatalogInput interface {
	pulumi.Input

	ToCatalogOutput() CatalogOutput
	ToCatalogOutputWithContext(ctx context.Context) CatalogOutput
}

func (*Catalog) ElementType() reflect.Type {
	return reflect.TypeOf((**Catalog)(nil)).Elem()
}

func (i *Catalog) ToCatalogOutput() CatalogOutput {
	return i.ToCatalogOutputWithContext(context.Background())
}

func (i *Catalog) ToCatalogOutputWithContext(ctx context.Context) CatalogOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogOutput)
}

// CatalogArrayInput is an input type that accepts CatalogArray and CatalogArrayOutput values.
// You can construct a concrete instance of `CatalogArrayInput` via:
//
//	CatalogArray{ CatalogArgs{...} }
type CatalogArrayInput interface {
	pulumi.Input

	ToCatalogArrayOutput() CatalogArrayOutput
	ToCatalogArrayOutputWithContext(context.Context) CatalogArrayOutput
}

type CatalogArray []CatalogInput

func (CatalogArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Catalog)(nil)).Elem()
}

func (i CatalogArray) ToCatalogArrayOutput() CatalogArrayOutput {
	return i.ToCatalogArrayOutputWithContext(context.Background())
}

func (i CatalogArray) ToCatalogArrayOutputWithContext(ctx context.Context) CatalogArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogArrayOutput)
}

// CatalogMapInput is an input type that accepts CatalogMap and CatalogMapOutput values.
// You can construct a concrete instance of `CatalogMapInput` via:
//
//	CatalogMap{ "key": CatalogArgs{...} }
type CatalogMapInput interface {
	pulumi.Input

	ToCatalogMapOutput() CatalogMapOutput
	ToCatalogMapOutputWithContext(context.Context) CatalogMapOutput
}

type CatalogMap map[string]CatalogInput

func (CatalogMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Catalog)(nil)).Elem()
}

func (i CatalogMap) ToCatalogMapOutput() CatalogMapOutput {
	return i.ToCatalogMapOutputWithContext(context.Background())
}

func (i CatalogMap) ToCatalogMapOutputWithContext(ctx context.Context) CatalogMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogMapOutput)
}

type CatalogOutput struct{ *pulumi.OutputState }

func (CatalogOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Catalog)(nil)).Elem()
}

func (o CatalogOutput) ToCatalogOutput() CatalogOutput {
	return o
}

func (o CatalogOutput) ToCatalogOutputWithContext(ctx context.Context) CatalogOutput {
	return o
}

// User-supplied free-form text.
func (o CatalogOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// For Foreign Catalogs: the name of the connection to an external data source. Changes forces creation of a new resource.
func (o CatalogOutput) ConnectionName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringPtrOutput { return v.ConnectionName }).(pulumi.StringPtrOutput)
}

// Delete catalog regardless of its contents.
func (o CatalogOutput) ForceDestroy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Catalog) pulumi.BoolPtrOutput { return v.ForceDestroy }).(pulumi.BoolPtrOutput)
}

// Whether the catalog is accessible from all workspaces or a specific set of workspaces. Can be `ISOLATED` or `OPEN`. Setting the catalog to `ISOLATED` will automatically allow access from the current workspace.
func (o CatalogOutput) IsolationMode() pulumi.StringOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringOutput { return v.IsolationMode }).(pulumi.StringOutput)
}

func (o CatalogOutput) MetastoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringOutput { return v.MetastoreId }).(pulumi.StringOutput)
}

// Name of Catalog relative to parent metastore.
func (o CatalogOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// For Foreign Catalogs: the name of the entity from an external data source that maps to a catalog. For example, the database name in a PostgreSQL server.
func (o CatalogOutput) Options() pulumi.MapOutput {
	return o.ApplyT(func(v *Catalog) pulumi.MapOutput { return v.Options }).(pulumi.MapOutput)
}

// Username/groupname/sp applicationId of the catalog owner.
func (o CatalogOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringOutput { return v.Owner }).(pulumi.StringOutput)
}

// Extensible Catalog properties.
func (o CatalogOutput) Properties() pulumi.MapOutput {
	return o.ApplyT(func(v *Catalog) pulumi.MapOutput { return v.Properties }).(pulumi.MapOutput)
}

// For Delta Sharing Catalogs: the name of the delta sharing provider. Change forces creation of a new resource.
func (o CatalogOutput) ProviderName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringPtrOutput { return v.ProviderName }).(pulumi.StringPtrOutput)
}

// For Delta Sharing Catalogs: the name of the share under the share provider. Change forces creation of a new resource.
func (o CatalogOutput) ShareName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringPtrOutput { return v.ShareName }).(pulumi.StringPtrOutput)
}

// Managed location of the catalog. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the metastore root location. Change forces creation of a new resource.
func (o CatalogOutput) StorageRoot() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringPtrOutput { return v.StorageRoot }).(pulumi.StringPtrOutput)
}

type CatalogArrayOutput struct{ *pulumi.OutputState }

func (CatalogArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Catalog)(nil)).Elem()
}

func (o CatalogArrayOutput) ToCatalogArrayOutput() CatalogArrayOutput {
	return o
}

func (o CatalogArrayOutput) ToCatalogArrayOutputWithContext(ctx context.Context) CatalogArrayOutput {
	return o
}

func (o CatalogArrayOutput) Index(i pulumi.IntInput) CatalogOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Catalog {
		return vs[0].([]*Catalog)[vs[1].(int)]
	}).(CatalogOutput)
}

type CatalogMapOutput struct{ *pulumi.OutputState }

func (CatalogMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Catalog)(nil)).Elem()
}

func (o CatalogMapOutput) ToCatalogMapOutput() CatalogMapOutput {
	return o
}

func (o CatalogMapOutput) ToCatalogMapOutputWithContext(ctx context.Context) CatalogMapOutput {
	return o
}

func (o CatalogMapOutput) MapIndex(k pulumi.StringInput) CatalogOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Catalog {
		return vs[0].(map[string]*Catalog)[vs[1].(string)]
	}).(CatalogOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogInput)(nil)).Elem(), &Catalog{})
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogArrayInput)(nil)).Elem(), CatalogArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogMapInput)(nil)).Elem(), CatalogMap{})
	pulumi.RegisterOutputType(CatalogOutput{})
	pulumi.RegisterOutputType(CatalogArrayOutput{})
	pulumi.RegisterOutputType(CatalogMapOutput{})
}
