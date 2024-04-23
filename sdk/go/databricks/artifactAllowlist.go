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
//			_, err := databricks.NewArtifactAllowlist(ctx, "init_scripts", &databricks.ArtifactAllowlistArgs{
//				ArtifactType: pulumi.String("INIT_SCRIPT"),
//				ArtifactMatchers: databricks.ArtifactAllowlistArtifactMatcherArray{
//					&databricks.ArtifactAllowlistArtifactMatcherArgs{
//						Artifact:  pulumi.String("/Volumes/inits"),
//						MatchType: pulumi.String("PREFIX_MATCH"),
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
//
// ## Related Resources
//
// The following resources are used in the same context:
//
// * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
// * Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
//
// ## Import
//
// This resource can be imported by name:
//
// bash
//
// ```sh
// $ pulumi import databricks:index/artifactAllowlist:ArtifactAllowlist this '<metastore_id>|<artifact_type>'
// ```
type ArtifactAllowlist struct {
	pulumi.CustomResourceState

	ArtifactMatchers ArtifactAllowlistArtifactMatcherArrayOutput `pulumi:"artifactMatchers"`
	// The artifact type of the allowlist. Can be `INIT_SCRIPT`, `LIBRARY_JAR` or `LIBRARY_MAVEN`. Change forces creation of a new resource.
	ArtifactType pulumi.StringOutput `pulumi:"artifactType"`
	// Time at which this artifact allowlist was set.
	CreatedAt pulumi.IntOutput `pulumi:"createdAt"`
	// Identity that set the artifact allowlist.
	CreatedBy pulumi.StringOutput `pulumi:"createdBy"`
	// ID of the parent metastore.
	MetastoreId pulumi.StringOutput `pulumi:"metastoreId"`
}

// NewArtifactAllowlist registers a new resource with the given unique name, arguments, and options.
func NewArtifactAllowlist(ctx *pulumi.Context,
	name string, args *ArtifactAllowlistArgs, opts ...pulumi.ResourceOption) (*ArtifactAllowlist, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ArtifactMatchers == nil {
		return nil, errors.New("invalid value for required argument 'ArtifactMatchers'")
	}
	if args.ArtifactType == nil {
		return nil, errors.New("invalid value for required argument 'ArtifactType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ArtifactAllowlist
	err := ctx.RegisterResource("databricks:index/artifactAllowlist:ArtifactAllowlist", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetArtifactAllowlist gets an existing ArtifactAllowlist resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetArtifactAllowlist(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ArtifactAllowlistState, opts ...pulumi.ResourceOption) (*ArtifactAllowlist, error) {
	var resource ArtifactAllowlist
	err := ctx.ReadResource("databricks:index/artifactAllowlist:ArtifactAllowlist", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ArtifactAllowlist resources.
type artifactAllowlistState struct {
	ArtifactMatchers []ArtifactAllowlistArtifactMatcher `pulumi:"artifactMatchers"`
	// The artifact type of the allowlist. Can be `INIT_SCRIPT`, `LIBRARY_JAR` or `LIBRARY_MAVEN`. Change forces creation of a new resource.
	ArtifactType *string `pulumi:"artifactType"`
	// Time at which this artifact allowlist was set.
	CreatedAt *int `pulumi:"createdAt"`
	// Identity that set the artifact allowlist.
	CreatedBy *string `pulumi:"createdBy"`
	// ID of the parent metastore.
	MetastoreId *string `pulumi:"metastoreId"`
}

type ArtifactAllowlistState struct {
	ArtifactMatchers ArtifactAllowlistArtifactMatcherArrayInput
	// The artifact type of the allowlist. Can be `INIT_SCRIPT`, `LIBRARY_JAR` or `LIBRARY_MAVEN`. Change forces creation of a new resource.
	ArtifactType pulumi.StringPtrInput
	// Time at which this artifact allowlist was set.
	CreatedAt pulumi.IntPtrInput
	// Identity that set the artifact allowlist.
	CreatedBy pulumi.StringPtrInput
	// ID of the parent metastore.
	MetastoreId pulumi.StringPtrInput
}

func (ArtifactAllowlistState) ElementType() reflect.Type {
	return reflect.TypeOf((*artifactAllowlistState)(nil)).Elem()
}

type artifactAllowlistArgs struct {
	ArtifactMatchers []ArtifactAllowlistArtifactMatcher `pulumi:"artifactMatchers"`
	// The artifact type of the allowlist. Can be `INIT_SCRIPT`, `LIBRARY_JAR` or `LIBRARY_MAVEN`. Change forces creation of a new resource.
	ArtifactType string `pulumi:"artifactType"`
	// Time at which this artifact allowlist was set.
	CreatedAt *int `pulumi:"createdAt"`
	// Identity that set the artifact allowlist.
	CreatedBy *string `pulumi:"createdBy"`
	// ID of the parent metastore.
	MetastoreId *string `pulumi:"metastoreId"`
}

// The set of arguments for constructing a ArtifactAllowlist resource.
type ArtifactAllowlistArgs struct {
	ArtifactMatchers ArtifactAllowlistArtifactMatcherArrayInput
	// The artifact type of the allowlist. Can be `INIT_SCRIPT`, `LIBRARY_JAR` or `LIBRARY_MAVEN`. Change forces creation of a new resource.
	ArtifactType pulumi.StringInput
	// Time at which this artifact allowlist was set.
	CreatedAt pulumi.IntPtrInput
	// Identity that set the artifact allowlist.
	CreatedBy pulumi.StringPtrInput
	// ID of the parent metastore.
	MetastoreId pulumi.StringPtrInput
}

func (ArtifactAllowlistArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*artifactAllowlistArgs)(nil)).Elem()
}

type ArtifactAllowlistInput interface {
	pulumi.Input

	ToArtifactAllowlistOutput() ArtifactAllowlistOutput
	ToArtifactAllowlistOutputWithContext(ctx context.Context) ArtifactAllowlistOutput
}

func (*ArtifactAllowlist) ElementType() reflect.Type {
	return reflect.TypeOf((**ArtifactAllowlist)(nil)).Elem()
}

func (i *ArtifactAllowlist) ToArtifactAllowlistOutput() ArtifactAllowlistOutput {
	return i.ToArtifactAllowlistOutputWithContext(context.Background())
}

func (i *ArtifactAllowlist) ToArtifactAllowlistOutputWithContext(ctx context.Context) ArtifactAllowlistOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ArtifactAllowlistOutput)
}

// ArtifactAllowlistArrayInput is an input type that accepts ArtifactAllowlistArray and ArtifactAllowlistArrayOutput values.
// You can construct a concrete instance of `ArtifactAllowlistArrayInput` via:
//
//	ArtifactAllowlistArray{ ArtifactAllowlistArgs{...} }
type ArtifactAllowlistArrayInput interface {
	pulumi.Input

	ToArtifactAllowlistArrayOutput() ArtifactAllowlistArrayOutput
	ToArtifactAllowlistArrayOutputWithContext(context.Context) ArtifactAllowlistArrayOutput
}

type ArtifactAllowlistArray []ArtifactAllowlistInput

func (ArtifactAllowlistArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ArtifactAllowlist)(nil)).Elem()
}

func (i ArtifactAllowlistArray) ToArtifactAllowlistArrayOutput() ArtifactAllowlistArrayOutput {
	return i.ToArtifactAllowlistArrayOutputWithContext(context.Background())
}

func (i ArtifactAllowlistArray) ToArtifactAllowlistArrayOutputWithContext(ctx context.Context) ArtifactAllowlistArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ArtifactAllowlistArrayOutput)
}

// ArtifactAllowlistMapInput is an input type that accepts ArtifactAllowlistMap and ArtifactAllowlistMapOutput values.
// You can construct a concrete instance of `ArtifactAllowlistMapInput` via:
//
//	ArtifactAllowlistMap{ "key": ArtifactAllowlistArgs{...} }
type ArtifactAllowlistMapInput interface {
	pulumi.Input

	ToArtifactAllowlistMapOutput() ArtifactAllowlistMapOutput
	ToArtifactAllowlistMapOutputWithContext(context.Context) ArtifactAllowlistMapOutput
}

type ArtifactAllowlistMap map[string]ArtifactAllowlistInput

func (ArtifactAllowlistMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ArtifactAllowlist)(nil)).Elem()
}

func (i ArtifactAllowlistMap) ToArtifactAllowlistMapOutput() ArtifactAllowlistMapOutput {
	return i.ToArtifactAllowlistMapOutputWithContext(context.Background())
}

func (i ArtifactAllowlistMap) ToArtifactAllowlistMapOutputWithContext(ctx context.Context) ArtifactAllowlistMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ArtifactAllowlistMapOutput)
}

type ArtifactAllowlistOutput struct{ *pulumi.OutputState }

func (ArtifactAllowlistOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ArtifactAllowlist)(nil)).Elem()
}

func (o ArtifactAllowlistOutput) ToArtifactAllowlistOutput() ArtifactAllowlistOutput {
	return o
}

func (o ArtifactAllowlistOutput) ToArtifactAllowlistOutputWithContext(ctx context.Context) ArtifactAllowlistOutput {
	return o
}

func (o ArtifactAllowlistOutput) ArtifactMatchers() ArtifactAllowlistArtifactMatcherArrayOutput {
	return o.ApplyT(func(v *ArtifactAllowlist) ArtifactAllowlistArtifactMatcherArrayOutput { return v.ArtifactMatchers }).(ArtifactAllowlistArtifactMatcherArrayOutput)
}

// The artifact type of the allowlist. Can be `INIT_SCRIPT`, `LIBRARY_JAR` or `LIBRARY_MAVEN`. Change forces creation of a new resource.
func (o ArtifactAllowlistOutput) ArtifactType() pulumi.StringOutput {
	return o.ApplyT(func(v *ArtifactAllowlist) pulumi.StringOutput { return v.ArtifactType }).(pulumi.StringOutput)
}

// Time at which this artifact allowlist was set.
func (o ArtifactAllowlistOutput) CreatedAt() pulumi.IntOutput {
	return o.ApplyT(func(v *ArtifactAllowlist) pulumi.IntOutput { return v.CreatedAt }).(pulumi.IntOutput)
}

// Identity that set the artifact allowlist.
func (o ArtifactAllowlistOutput) CreatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v *ArtifactAllowlist) pulumi.StringOutput { return v.CreatedBy }).(pulumi.StringOutput)
}

// ID of the parent metastore.
func (o ArtifactAllowlistOutput) MetastoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *ArtifactAllowlist) pulumi.StringOutput { return v.MetastoreId }).(pulumi.StringOutput)
}

type ArtifactAllowlistArrayOutput struct{ *pulumi.OutputState }

func (ArtifactAllowlistArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ArtifactAllowlist)(nil)).Elem()
}

func (o ArtifactAllowlistArrayOutput) ToArtifactAllowlistArrayOutput() ArtifactAllowlistArrayOutput {
	return o
}

func (o ArtifactAllowlistArrayOutput) ToArtifactAllowlistArrayOutputWithContext(ctx context.Context) ArtifactAllowlistArrayOutput {
	return o
}

func (o ArtifactAllowlistArrayOutput) Index(i pulumi.IntInput) ArtifactAllowlistOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ArtifactAllowlist {
		return vs[0].([]*ArtifactAllowlist)[vs[1].(int)]
	}).(ArtifactAllowlistOutput)
}

type ArtifactAllowlistMapOutput struct{ *pulumi.OutputState }

func (ArtifactAllowlistMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ArtifactAllowlist)(nil)).Elem()
}

func (o ArtifactAllowlistMapOutput) ToArtifactAllowlistMapOutput() ArtifactAllowlistMapOutput {
	return o
}

func (o ArtifactAllowlistMapOutput) ToArtifactAllowlistMapOutputWithContext(ctx context.Context) ArtifactAllowlistMapOutput {
	return o
}

func (o ArtifactAllowlistMapOutput) MapIndex(k pulumi.StringInput) ArtifactAllowlistOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ArtifactAllowlist {
		return vs[0].(map[string]*ArtifactAllowlist)[vs[1].(string)]
	}).(ArtifactAllowlistOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ArtifactAllowlistInput)(nil)).Elem(), &ArtifactAllowlist{})
	pulumi.RegisterInputType(reflect.TypeOf((*ArtifactAllowlistArrayInput)(nil)).Elem(), ArtifactAllowlistArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ArtifactAllowlistMapInput)(nil)).Elem(), ArtifactAllowlistMap{})
	pulumi.RegisterOutputType(ArtifactAllowlistOutput{})
	pulumi.RegisterOutputType(ArtifactAllowlistArrayOutput{})
	pulumi.RegisterOutputType(ArtifactAllowlistMapOutput{})
}
