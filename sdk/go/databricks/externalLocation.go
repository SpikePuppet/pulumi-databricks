// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// To work with external tables, Unity Catalog introduces two new objects to access and work with external cloud storage:
//
// - StorageCredential represent authentication methods to access cloud storage (e.g. an IAM role for Amazon S3 or a service principal for Azure Storage). Storage credentials are access-controlled to determine which users can use the credential.
// - `ExternalLocation` are objects that combine a cloud storage path with a Storage Credential that can be used to access the location.
//
// ## Import
//
// # This resource can be imported by namebash
//
// ```sh
//
//	$ pulumi import databricks:index/externalLocation:ExternalLocation this <name>
//
// ```
type ExternalLocation struct {
	pulumi.CustomResourceState

	// User-supplied free-form text.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Name of the StorageCredential to use with this External Location.
	CredentialName pulumi.StringOutput `pulumi:"credentialName"`
	// Destroy external location regardless of its dependents.
	ForceDestroy pulumi.BoolPtrOutput `pulumi:"forceDestroy"`
	MetastoreId  pulumi.StringOutput  `pulumi:"metastoreId"`
	// Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Username/groupname/sp applicationId of the external Location owner.
	Owner pulumi.StringOutput `pulumi:"owner"`
	// Indicates whether the external location is read-only.
	ReadOnly pulumi.BoolPtrOutput `pulumi:"readOnly"`
	// Suppress validation errors if any & force save the external location
	SkipValidation pulumi.BoolPtrOutput `pulumi:"skipValidation"`
	// Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewExternalLocation registers a new resource with the given unique name, arguments, and options.
func NewExternalLocation(ctx *pulumi.Context,
	name string, args *ExternalLocationArgs, opts ...pulumi.ResourceOption) (*ExternalLocation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CredentialName == nil {
		return nil, errors.New("invalid value for required argument 'CredentialName'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	var resource ExternalLocation
	err := ctx.RegisterResource("databricks:index/externalLocation:ExternalLocation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetExternalLocation gets an existing ExternalLocation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetExternalLocation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ExternalLocationState, opts ...pulumi.ResourceOption) (*ExternalLocation, error) {
	var resource ExternalLocation
	err := ctx.ReadResource("databricks:index/externalLocation:ExternalLocation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ExternalLocation resources.
type externalLocationState struct {
	// User-supplied free-form text.
	Comment *string `pulumi:"comment"`
	// Name of the StorageCredential to use with this External Location.
	CredentialName *string `pulumi:"credentialName"`
	// Destroy external location regardless of its dependents.
	ForceDestroy *bool   `pulumi:"forceDestroy"`
	MetastoreId  *string `pulumi:"metastoreId"`
	// Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Username/groupname/sp applicationId of the external Location owner.
	Owner *string `pulumi:"owner"`
	// Indicates whether the external location is read-only.
	ReadOnly *bool `pulumi:"readOnly"`
	// Suppress validation errors if any & force save the external location
	SkipValidation *bool `pulumi:"skipValidation"`
	// Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
	Url *string `pulumi:"url"`
}

type ExternalLocationState struct {
	// User-supplied free-form text.
	Comment pulumi.StringPtrInput
	// Name of the StorageCredential to use with this External Location.
	CredentialName pulumi.StringPtrInput
	// Destroy external location regardless of its dependents.
	ForceDestroy pulumi.BoolPtrInput
	MetastoreId  pulumi.StringPtrInput
	// Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Username/groupname/sp applicationId of the external Location owner.
	Owner pulumi.StringPtrInput
	// Indicates whether the external location is read-only.
	ReadOnly pulumi.BoolPtrInput
	// Suppress validation errors if any & force save the external location
	SkipValidation pulumi.BoolPtrInput
	// Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
	Url pulumi.StringPtrInput
}

func (ExternalLocationState) ElementType() reflect.Type {
	return reflect.TypeOf((*externalLocationState)(nil)).Elem()
}

type externalLocationArgs struct {
	// User-supplied free-form text.
	Comment *string `pulumi:"comment"`
	// Name of the StorageCredential to use with this External Location.
	CredentialName string `pulumi:"credentialName"`
	// Destroy external location regardless of its dependents.
	ForceDestroy *bool   `pulumi:"forceDestroy"`
	MetastoreId  *string `pulumi:"metastoreId"`
	// Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Username/groupname/sp applicationId of the external Location owner.
	Owner *string `pulumi:"owner"`
	// Indicates whether the external location is read-only.
	ReadOnly *bool `pulumi:"readOnly"`
	// Suppress validation errors if any & force save the external location
	SkipValidation *bool `pulumi:"skipValidation"`
	// Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
	Url string `pulumi:"url"`
}

// The set of arguments for constructing a ExternalLocation resource.
type ExternalLocationArgs struct {
	// User-supplied free-form text.
	Comment pulumi.StringPtrInput
	// Name of the StorageCredential to use with this External Location.
	CredentialName pulumi.StringInput
	// Destroy external location regardless of its dependents.
	ForceDestroy pulumi.BoolPtrInput
	MetastoreId  pulumi.StringPtrInput
	// Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Username/groupname/sp applicationId of the external Location owner.
	Owner pulumi.StringPtrInput
	// Indicates whether the external location is read-only.
	ReadOnly pulumi.BoolPtrInput
	// Suppress validation errors if any & force save the external location
	SkipValidation pulumi.BoolPtrInput
	// Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
	Url pulumi.StringInput
}

func (ExternalLocationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*externalLocationArgs)(nil)).Elem()
}

type ExternalLocationInput interface {
	pulumi.Input

	ToExternalLocationOutput() ExternalLocationOutput
	ToExternalLocationOutputWithContext(ctx context.Context) ExternalLocationOutput
}

func (*ExternalLocation) ElementType() reflect.Type {
	return reflect.TypeOf((**ExternalLocation)(nil)).Elem()
}

func (i *ExternalLocation) ToExternalLocationOutput() ExternalLocationOutput {
	return i.ToExternalLocationOutputWithContext(context.Background())
}

func (i *ExternalLocation) ToExternalLocationOutputWithContext(ctx context.Context) ExternalLocationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExternalLocationOutput)
}

// ExternalLocationArrayInput is an input type that accepts ExternalLocationArray and ExternalLocationArrayOutput values.
// You can construct a concrete instance of `ExternalLocationArrayInput` via:
//
//	ExternalLocationArray{ ExternalLocationArgs{...} }
type ExternalLocationArrayInput interface {
	pulumi.Input

	ToExternalLocationArrayOutput() ExternalLocationArrayOutput
	ToExternalLocationArrayOutputWithContext(context.Context) ExternalLocationArrayOutput
}

type ExternalLocationArray []ExternalLocationInput

func (ExternalLocationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExternalLocation)(nil)).Elem()
}

func (i ExternalLocationArray) ToExternalLocationArrayOutput() ExternalLocationArrayOutput {
	return i.ToExternalLocationArrayOutputWithContext(context.Background())
}

func (i ExternalLocationArray) ToExternalLocationArrayOutputWithContext(ctx context.Context) ExternalLocationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExternalLocationArrayOutput)
}

// ExternalLocationMapInput is an input type that accepts ExternalLocationMap and ExternalLocationMapOutput values.
// You can construct a concrete instance of `ExternalLocationMapInput` via:
//
//	ExternalLocationMap{ "key": ExternalLocationArgs{...} }
type ExternalLocationMapInput interface {
	pulumi.Input

	ToExternalLocationMapOutput() ExternalLocationMapOutput
	ToExternalLocationMapOutputWithContext(context.Context) ExternalLocationMapOutput
}

type ExternalLocationMap map[string]ExternalLocationInput

func (ExternalLocationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExternalLocation)(nil)).Elem()
}

func (i ExternalLocationMap) ToExternalLocationMapOutput() ExternalLocationMapOutput {
	return i.ToExternalLocationMapOutputWithContext(context.Background())
}

func (i ExternalLocationMap) ToExternalLocationMapOutputWithContext(ctx context.Context) ExternalLocationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExternalLocationMapOutput)
}

type ExternalLocationOutput struct{ *pulumi.OutputState }

func (ExternalLocationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ExternalLocation)(nil)).Elem()
}

func (o ExternalLocationOutput) ToExternalLocationOutput() ExternalLocationOutput {
	return o
}

func (o ExternalLocationOutput) ToExternalLocationOutputWithContext(ctx context.Context) ExternalLocationOutput {
	return o
}

// User-supplied free-form text.
func (o ExternalLocationOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExternalLocation) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Name of the StorageCredential to use with this External Location.
func (o ExternalLocationOutput) CredentialName() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalLocation) pulumi.StringOutput { return v.CredentialName }).(pulumi.StringOutput)
}

// Destroy external location regardless of its dependents.
func (o ExternalLocationOutput) ForceDestroy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ExternalLocation) pulumi.BoolPtrOutput { return v.ForceDestroy }).(pulumi.BoolPtrOutput)
}

func (o ExternalLocationOutput) MetastoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalLocation) pulumi.StringOutput { return v.MetastoreId }).(pulumi.StringOutput)
}

// Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
func (o ExternalLocationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalLocation) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Username/groupname/sp applicationId of the external Location owner.
func (o ExternalLocationOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalLocation) pulumi.StringOutput { return v.Owner }).(pulumi.StringOutput)
}

// Indicates whether the external location is read-only.
func (o ExternalLocationOutput) ReadOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ExternalLocation) pulumi.BoolPtrOutput { return v.ReadOnly }).(pulumi.BoolPtrOutput)
}

// Suppress validation errors if any & force save the external location
func (o ExternalLocationOutput) SkipValidation() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ExternalLocation) pulumi.BoolPtrOutput { return v.SkipValidation }).(pulumi.BoolPtrOutput)
}

// Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
func (o ExternalLocationOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalLocation) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type ExternalLocationArrayOutput struct{ *pulumi.OutputState }

func (ExternalLocationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExternalLocation)(nil)).Elem()
}

func (o ExternalLocationArrayOutput) ToExternalLocationArrayOutput() ExternalLocationArrayOutput {
	return o
}

func (o ExternalLocationArrayOutput) ToExternalLocationArrayOutputWithContext(ctx context.Context) ExternalLocationArrayOutput {
	return o
}

func (o ExternalLocationArrayOutput) Index(i pulumi.IntInput) ExternalLocationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ExternalLocation {
		return vs[0].([]*ExternalLocation)[vs[1].(int)]
	}).(ExternalLocationOutput)
}

type ExternalLocationMapOutput struct{ *pulumi.OutputState }

func (ExternalLocationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExternalLocation)(nil)).Elem()
}

func (o ExternalLocationMapOutput) ToExternalLocationMapOutput() ExternalLocationMapOutput {
	return o
}

func (o ExternalLocationMapOutput) ToExternalLocationMapOutputWithContext(ctx context.Context) ExternalLocationMapOutput {
	return o
}

func (o ExternalLocationMapOutput) MapIndex(k pulumi.StringInput) ExternalLocationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ExternalLocation {
		return vs[0].(map[string]*ExternalLocation)[vs[1].(string)]
	}).(ExternalLocationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ExternalLocationInput)(nil)).Elem(), &ExternalLocation{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExternalLocationArrayInput)(nil)).Elem(), ExternalLocationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExternalLocationMapInput)(nil)).Elem(), ExternalLocationMap{})
	pulumi.RegisterOutputType(ExternalLocationOutput{})
	pulumi.RegisterOutputType(ExternalLocationArrayOutput{})
	pulumi.RegisterOutputType(ExternalLocationMapOutput{})
}
