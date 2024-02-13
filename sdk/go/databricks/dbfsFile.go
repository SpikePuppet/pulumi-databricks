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

// ## Import
//
// The resource dbfs file can be imported using the path of the file:
//
//	bash
//
// ```sh
// $ pulumi import databricks:index/dbfsFile:DbfsFile this <path>
// ```
type DbfsFile struct {
	pulumi.CustomResourceState

	ContentBase64 pulumi.StringPtrOutput `pulumi:"contentBase64"`
	// Path, but with `dbfs:` prefix.
	DbfsPath pulumi.StringOutput `pulumi:"dbfsPath"`
	// The file size of the file that is being tracked by this resource in bytes.
	FileSize pulumi.IntOutput       `pulumi:"fileSize"`
	Md5      pulumi.StringPtrOutput `pulumi:"md5"`
	// The path of the file in which you wish to save.
	Path pulumi.StringOutput `pulumi:"path"`
	// The full absolute path to the file. Conflicts with `contentBase64`.
	Source pulumi.StringPtrOutput `pulumi:"source"`
}

// NewDbfsFile registers a new resource with the given unique name, arguments, and options.
func NewDbfsFile(ctx *pulumi.Context,
	name string, args *DbfsFileArgs, opts ...pulumi.ResourceOption) (*DbfsFile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Path == nil {
		return nil, errors.New("invalid value for required argument 'Path'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DbfsFile
	err := ctx.RegisterResource("databricks:index/dbfsFile:DbfsFile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDbfsFile gets an existing DbfsFile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDbfsFile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DbfsFileState, opts ...pulumi.ResourceOption) (*DbfsFile, error) {
	var resource DbfsFile
	err := ctx.ReadResource("databricks:index/dbfsFile:DbfsFile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DbfsFile resources.
type dbfsFileState struct {
	ContentBase64 *string `pulumi:"contentBase64"`
	// Path, but with `dbfs:` prefix.
	DbfsPath *string `pulumi:"dbfsPath"`
	// The file size of the file that is being tracked by this resource in bytes.
	FileSize *int    `pulumi:"fileSize"`
	Md5      *string `pulumi:"md5"`
	// The path of the file in which you wish to save.
	Path *string `pulumi:"path"`
	// The full absolute path to the file. Conflicts with `contentBase64`.
	Source *string `pulumi:"source"`
}

type DbfsFileState struct {
	ContentBase64 pulumi.StringPtrInput
	// Path, but with `dbfs:` prefix.
	DbfsPath pulumi.StringPtrInput
	// The file size of the file that is being tracked by this resource in bytes.
	FileSize pulumi.IntPtrInput
	Md5      pulumi.StringPtrInput
	// The path of the file in which you wish to save.
	Path pulumi.StringPtrInput
	// The full absolute path to the file. Conflicts with `contentBase64`.
	Source pulumi.StringPtrInput
}

func (DbfsFileState) ElementType() reflect.Type {
	return reflect.TypeOf((*dbfsFileState)(nil)).Elem()
}

type dbfsFileArgs struct {
	ContentBase64 *string `pulumi:"contentBase64"`
	Md5           *string `pulumi:"md5"`
	// The path of the file in which you wish to save.
	Path string `pulumi:"path"`
	// The full absolute path to the file. Conflicts with `contentBase64`.
	Source *string `pulumi:"source"`
}

// The set of arguments for constructing a DbfsFile resource.
type DbfsFileArgs struct {
	ContentBase64 pulumi.StringPtrInput
	Md5           pulumi.StringPtrInput
	// The path of the file in which you wish to save.
	Path pulumi.StringInput
	// The full absolute path to the file. Conflicts with `contentBase64`.
	Source pulumi.StringPtrInput
}

func (DbfsFileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dbfsFileArgs)(nil)).Elem()
}

type DbfsFileInput interface {
	pulumi.Input

	ToDbfsFileOutput() DbfsFileOutput
	ToDbfsFileOutputWithContext(ctx context.Context) DbfsFileOutput
}

func (*DbfsFile) ElementType() reflect.Type {
	return reflect.TypeOf((**DbfsFile)(nil)).Elem()
}

func (i *DbfsFile) ToDbfsFileOutput() DbfsFileOutput {
	return i.ToDbfsFileOutputWithContext(context.Background())
}

func (i *DbfsFile) ToDbfsFileOutputWithContext(ctx context.Context) DbfsFileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DbfsFileOutput)
}

// DbfsFileArrayInput is an input type that accepts DbfsFileArray and DbfsFileArrayOutput values.
// You can construct a concrete instance of `DbfsFileArrayInput` via:
//
//	DbfsFileArray{ DbfsFileArgs{...} }
type DbfsFileArrayInput interface {
	pulumi.Input

	ToDbfsFileArrayOutput() DbfsFileArrayOutput
	ToDbfsFileArrayOutputWithContext(context.Context) DbfsFileArrayOutput
}

type DbfsFileArray []DbfsFileInput

func (DbfsFileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DbfsFile)(nil)).Elem()
}

func (i DbfsFileArray) ToDbfsFileArrayOutput() DbfsFileArrayOutput {
	return i.ToDbfsFileArrayOutputWithContext(context.Background())
}

func (i DbfsFileArray) ToDbfsFileArrayOutputWithContext(ctx context.Context) DbfsFileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DbfsFileArrayOutput)
}

// DbfsFileMapInput is an input type that accepts DbfsFileMap and DbfsFileMapOutput values.
// You can construct a concrete instance of `DbfsFileMapInput` via:
//
//	DbfsFileMap{ "key": DbfsFileArgs{...} }
type DbfsFileMapInput interface {
	pulumi.Input

	ToDbfsFileMapOutput() DbfsFileMapOutput
	ToDbfsFileMapOutputWithContext(context.Context) DbfsFileMapOutput
}

type DbfsFileMap map[string]DbfsFileInput

func (DbfsFileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DbfsFile)(nil)).Elem()
}

func (i DbfsFileMap) ToDbfsFileMapOutput() DbfsFileMapOutput {
	return i.ToDbfsFileMapOutputWithContext(context.Background())
}

func (i DbfsFileMap) ToDbfsFileMapOutputWithContext(ctx context.Context) DbfsFileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DbfsFileMapOutput)
}

type DbfsFileOutput struct{ *pulumi.OutputState }

func (DbfsFileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DbfsFile)(nil)).Elem()
}

func (o DbfsFileOutput) ToDbfsFileOutput() DbfsFileOutput {
	return o
}

func (o DbfsFileOutput) ToDbfsFileOutputWithContext(ctx context.Context) DbfsFileOutput {
	return o
}

func (o DbfsFileOutput) ContentBase64() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DbfsFile) pulumi.StringPtrOutput { return v.ContentBase64 }).(pulumi.StringPtrOutput)
}

// Path, but with `dbfs:` prefix.
func (o DbfsFileOutput) DbfsPath() pulumi.StringOutput {
	return o.ApplyT(func(v *DbfsFile) pulumi.StringOutput { return v.DbfsPath }).(pulumi.StringOutput)
}

// The file size of the file that is being tracked by this resource in bytes.
func (o DbfsFileOutput) FileSize() pulumi.IntOutput {
	return o.ApplyT(func(v *DbfsFile) pulumi.IntOutput { return v.FileSize }).(pulumi.IntOutput)
}

func (o DbfsFileOutput) Md5() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DbfsFile) pulumi.StringPtrOutput { return v.Md5 }).(pulumi.StringPtrOutput)
}

// The path of the file in which you wish to save.
func (o DbfsFileOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v *DbfsFile) pulumi.StringOutput { return v.Path }).(pulumi.StringOutput)
}

// The full absolute path to the file. Conflicts with `contentBase64`.
func (o DbfsFileOutput) Source() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DbfsFile) pulumi.StringPtrOutput { return v.Source }).(pulumi.StringPtrOutput)
}

type DbfsFileArrayOutput struct{ *pulumi.OutputState }

func (DbfsFileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DbfsFile)(nil)).Elem()
}

func (o DbfsFileArrayOutput) ToDbfsFileArrayOutput() DbfsFileArrayOutput {
	return o
}

func (o DbfsFileArrayOutput) ToDbfsFileArrayOutputWithContext(ctx context.Context) DbfsFileArrayOutput {
	return o
}

func (o DbfsFileArrayOutput) Index(i pulumi.IntInput) DbfsFileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DbfsFile {
		return vs[0].([]*DbfsFile)[vs[1].(int)]
	}).(DbfsFileOutput)
}

type DbfsFileMapOutput struct{ *pulumi.OutputState }

func (DbfsFileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DbfsFile)(nil)).Elem()
}

func (o DbfsFileMapOutput) ToDbfsFileMapOutput() DbfsFileMapOutput {
	return o
}

func (o DbfsFileMapOutput) ToDbfsFileMapOutputWithContext(ctx context.Context) DbfsFileMapOutput {
	return o
}

func (o DbfsFileMapOutput) MapIndex(k pulumi.StringInput) DbfsFileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DbfsFile {
		return vs[0].(map[string]*DbfsFile)[vs[1].(string)]
	}).(DbfsFileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DbfsFileInput)(nil)).Elem(), &DbfsFile{})
	pulumi.RegisterInputType(reflect.TypeOf((*DbfsFileArrayInput)(nil)).Elem(), DbfsFileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DbfsFileMapInput)(nil)).Elem(), DbfsFileMap{})
	pulumi.RegisterOutputType(DbfsFileOutput{})
	pulumi.RegisterOutputType(DbfsFileArrayOutput{})
	pulumi.RegisterOutputType(DbfsFileMapOutput{})
}
