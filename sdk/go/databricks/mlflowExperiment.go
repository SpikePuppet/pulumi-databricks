// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
//
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
//			_, err := databricks.GetCurrentUser(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewMlflowExperiment(ctx, "this", &databricks.MlflowExperimentArgs{
//				ArtifactLocation: pulumi.String("dbfs:/tmp/my-experiment"),
//				Description:      pulumi.String("My MLflow experiment description"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Access Control
//
// * Permissions can control which groups or individual users can *Read*, *Edit*, or *Manage* individual experiments.
//
// ## Related Resources
//
// The following resources are often used in the same context:
//
// * RegisteredModel to create [Models in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.
// * End to end workspace management guide.
// * Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
// * MlflowModel to create models in the [workspace model registry](https://docs.databricks.com/en/mlflow/model-registry.html) in Databricks.
// * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
// * Notebook data to export a notebook from Databricks Workspace.
// * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
//
// ## Import
//
// # The experiment resource can be imported using the id of the experiment bash
//
// ```sh
//
//	$ pulumi import databricks:index/mlflowExperiment:MlflowExperiment this <experiment-id>
//
// ```
type MlflowExperiment struct {
	pulumi.CustomResourceState

	// Path to dbfs:/ or s3:// artifact location of the MLflow experiment.
	ArtifactLocation pulumi.StringPtrOutput `pulumi:"artifactLocation"`
	CreationTime     pulumi.IntOutput       `pulumi:"creationTime"`
	// The description of the MLflow experiment.
	Description    pulumi.StringPtrOutput `pulumi:"description"`
	ExperimentId   pulumi.StringOutput    `pulumi:"experimentId"`
	LastUpdateTime pulumi.IntOutput       `pulumi:"lastUpdateTime"`
	LifecycleStage pulumi.StringOutput    `pulumi:"lifecycleStage"`
	// Name of MLflow experiment. It must be an absolute path within the Databricks workspace, e.g. `/Users/<some-username>/my-experiment`. For more information about changes to experiment naming conventions, see [mlflow docs](https://docs.databricks.com/applications/mlflow/experiments.html#experiment-migration).
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewMlflowExperiment registers a new resource with the given unique name, arguments, and options.
func NewMlflowExperiment(ctx *pulumi.Context,
	name string, args *MlflowExperimentArgs, opts ...pulumi.ResourceOption) (*MlflowExperiment, error) {
	if args == nil {
		args = &MlflowExperimentArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MlflowExperiment
	err := ctx.RegisterResource("databricks:index/mlflowExperiment:MlflowExperiment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMlflowExperiment gets an existing MlflowExperiment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMlflowExperiment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MlflowExperimentState, opts ...pulumi.ResourceOption) (*MlflowExperiment, error) {
	var resource MlflowExperiment
	err := ctx.ReadResource("databricks:index/mlflowExperiment:MlflowExperiment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MlflowExperiment resources.
type mlflowExperimentState struct {
	// Path to dbfs:/ or s3:// artifact location of the MLflow experiment.
	ArtifactLocation *string `pulumi:"artifactLocation"`
	CreationTime     *int    `pulumi:"creationTime"`
	// The description of the MLflow experiment.
	Description    *string `pulumi:"description"`
	ExperimentId   *string `pulumi:"experimentId"`
	LastUpdateTime *int    `pulumi:"lastUpdateTime"`
	LifecycleStage *string `pulumi:"lifecycleStage"`
	// Name of MLflow experiment. It must be an absolute path within the Databricks workspace, e.g. `/Users/<some-username>/my-experiment`. For more information about changes to experiment naming conventions, see [mlflow docs](https://docs.databricks.com/applications/mlflow/experiments.html#experiment-migration).
	Name *string `pulumi:"name"`
}

type MlflowExperimentState struct {
	// Path to dbfs:/ or s3:// artifact location of the MLflow experiment.
	ArtifactLocation pulumi.StringPtrInput
	CreationTime     pulumi.IntPtrInput
	// The description of the MLflow experiment.
	Description    pulumi.StringPtrInput
	ExperimentId   pulumi.StringPtrInput
	LastUpdateTime pulumi.IntPtrInput
	LifecycleStage pulumi.StringPtrInput
	// Name of MLflow experiment. It must be an absolute path within the Databricks workspace, e.g. `/Users/<some-username>/my-experiment`. For more information about changes to experiment naming conventions, see [mlflow docs](https://docs.databricks.com/applications/mlflow/experiments.html#experiment-migration).
	Name pulumi.StringPtrInput
}

func (MlflowExperimentState) ElementType() reflect.Type {
	return reflect.TypeOf((*mlflowExperimentState)(nil)).Elem()
}

type mlflowExperimentArgs struct {
	// Path to dbfs:/ or s3:// artifact location of the MLflow experiment.
	ArtifactLocation *string `pulumi:"artifactLocation"`
	CreationTime     *int    `pulumi:"creationTime"`
	// The description of the MLflow experiment.
	Description    *string `pulumi:"description"`
	ExperimentId   *string `pulumi:"experimentId"`
	LastUpdateTime *int    `pulumi:"lastUpdateTime"`
	LifecycleStage *string `pulumi:"lifecycleStage"`
	// Name of MLflow experiment. It must be an absolute path within the Databricks workspace, e.g. `/Users/<some-username>/my-experiment`. For more information about changes to experiment naming conventions, see [mlflow docs](https://docs.databricks.com/applications/mlflow/experiments.html#experiment-migration).
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a MlflowExperiment resource.
type MlflowExperimentArgs struct {
	// Path to dbfs:/ or s3:// artifact location of the MLflow experiment.
	ArtifactLocation pulumi.StringPtrInput
	CreationTime     pulumi.IntPtrInput
	// The description of the MLflow experiment.
	Description    pulumi.StringPtrInput
	ExperimentId   pulumi.StringPtrInput
	LastUpdateTime pulumi.IntPtrInput
	LifecycleStage pulumi.StringPtrInput
	// Name of MLflow experiment. It must be an absolute path within the Databricks workspace, e.g. `/Users/<some-username>/my-experiment`. For more information about changes to experiment naming conventions, see [mlflow docs](https://docs.databricks.com/applications/mlflow/experiments.html#experiment-migration).
	Name pulumi.StringPtrInput
}

func (MlflowExperimentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mlflowExperimentArgs)(nil)).Elem()
}

type MlflowExperimentInput interface {
	pulumi.Input

	ToMlflowExperimentOutput() MlflowExperimentOutput
	ToMlflowExperimentOutputWithContext(ctx context.Context) MlflowExperimentOutput
}

func (*MlflowExperiment) ElementType() reflect.Type {
	return reflect.TypeOf((**MlflowExperiment)(nil)).Elem()
}

func (i *MlflowExperiment) ToMlflowExperimentOutput() MlflowExperimentOutput {
	return i.ToMlflowExperimentOutputWithContext(context.Background())
}

func (i *MlflowExperiment) ToMlflowExperimentOutputWithContext(ctx context.Context) MlflowExperimentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MlflowExperimentOutput)
}

// MlflowExperimentArrayInput is an input type that accepts MlflowExperimentArray and MlflowExperimentArrayOutput values.
// You can construct a concrete instance of `MlflowExperimentArrayInput` via:
//
//	MlflowExperimentArray{ MlflowExperimentArgs{...} }
type MlflowExperimentArrayInput interface {
	pulumi.Input

	ToMlflowExperimentArrayOutput() MlflowExperimentArrayOutput
	ToMlflowExperimentArrayOutputWithContext(context.Context) MlflowExperimentArrayOutput
}

type MlflowExperimentArray []MlflowExperimentInput

func (MlflowExperimentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MlflowExperiment)(nil)).Elem()
}

func (i MlflowExperimentArray) ToMlflowExperimentArrayOutput() MlflowExperimentArrayOutput {
	return i.ToMlflowExperimentArrayOutputWithContext(context.Background())
}

func (i MlflowExperimentArray) ToMlflowExperimentArrayOutputWithContext(ctx context.Context) MlflowExperimentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MlflowExperimentArrayOutput)
}

// MlflowExperimentMapInput is an input type that accepts MlflowExperimentMap and MlflowExperimentMapOutput values.
// You can construct a concrete instance of `MlflowExperimentMapInput` via:
//
//	MlflowExperimentMap{ "key": MlflowExperimentArgs{...} }
type MlflowExperimentMapInput interface {
	pulumi.Input

	ToMlflowExperimentMapOutput() MlflowExperimentMapOutput
	ToMlflowExperimentMapOutputWithContext(context.Context) MlflowExperimentMapOutput
}

type MlflowExperimentMap map[string]MlflowExperimentInput

func (MlflowExperimentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MlflowExperiment)(nil)).Elem()
}

func (i MlflowExperimentMap) ToMlflowExperimentMapOutput() MlflowExperimentMapOutput {
	return i.ToMlflowExperimentMapOutputWithContext(context.Background())
}

func (i MlflowExperimentMap) ToMlflowExperimentMapOutputWithContext(ctx context.Context) MlflowExperimentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MlflowExperimentMapOutput)
}

type MlflowExperimentOutput struct{ *pulumi.OutputState }

func (MlflowExperimentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MlflowExperiment)(nil)).Elem()
}

func (o MlflowExperimentOutput) ToMlflowExperimentOutput() MlflowExperimentOutput {
	return o
}

func (o MlflowExperimentOutput) ToMlflowExperimentOutputWithContext(ctx context.Context) MlflowExperimentOutput {
	return o
}

// Path to dbfs:/ or s3:// artifact location of the MLflow experiment.
func (o MlflowExperimentOutput) ArtifactLocation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MlflowExperiment) pulumi.StringPtrOutput { return v.ArtifactLocation }).(pulumi.StringPtrOutput)
}

func (o MlflowExperimentOutput) CreationTime() pulumi.IntOutput {
	return o.ApplyT(func(v *MlflowExperiment) pulumi.IntOutput { return v.CreationTime }).(pulumi.IntOutput)
}

// The description of the MLflow experiment.
func (o MlflowExperimentOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MlflowExperiment) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o MlflowExperimentOutput) ExperimentId() pulumi.StringOutput {
	return o.ApplyT(func(v *MlflowExperiment) pulumi.StringOutput { return v.ExperimentId }).(pulumi.StringOutput)
}

func (o MlflowExperimentOutput) LastUpdateTime() pulumi.IntOutput {
	return o.ApplyT(func(v *MlflowExperiment) pulumi.IntOutput { return v.LastUpdateTime }).(pulumi.IntOutput)
}

func (o MlflowExperimentOutput) LifecycleStage() pulumi.StringOutput {
	return o.ApplyT(func(v *MlflowExperiment) pulumi.StringOutput { return v.LifecycleStage }).(pulumi.StringOutput)
}

// Name of MLflow experiment. It must be an absolute path within the Databricks workspace, e.g. `/Users/<some-username>/my-experiment`. For more information about changes to experiment naming conventions, see [mlflow docs](https://docs.databricks.com/applications/mlflow/experiments.html#experiment-migration).
func (o MlflowExperimentOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MlflowExperiment) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type MlflowExperimentArrayOutput struct{ *pulumi.OutputState }

func (MlflowExperimentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MlflowExperiment)(nil)).Elem()
}

func (o MlflowExperimentArrayOutput) ToMlflowExperimentArrayOutput() MlflowExperimentArrayOutput {
	return o
}

func (o MlflowExperimentArrayOutput) ToMlflowExperimentArrayOutputWithContext(ctx context.Context) MlflowExperimentArrayOutput {
	return o
}

func (o MlflowExperimentArrayOutput) Index(i pulumi.IntInput) MlflowExperimentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MlflowExperiment {
		return vs[0].([]*MlflowExperiment)[vs[1].(int)]
	}).(MlflowExperimentOutput)
}

type MlflowExperimentMapOutput struct{ *pulumi.OutputState }

func (MlflowExperimentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MlflowExperiment)(nil)).Elem()
}

func (o MlflowExperimentMapOutput) ToMlflowExperimentMapOutput() MlflowExperimentMapOutput {
	return o
}

func (o MlflowExperimentMapOutput) ToMlflowExperimentMapOutputWithContext(ctx context.Context) MlflowExperimentMapOutput {
	return o
}

func (o MlflowExperimentMapOutput) MapIndex(k pulumi.StringInput) MlflowExperimentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MlflowExperiment {
		return vs[0].(map[string]*MlflowExperiment)[vs[1].(string)]
	}).(MlflowExperimentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MlflowExperimentInput)(nil)).Elem(), &MlflowExperiment{})
	pulumi.RegisterInputType(reflect.TypeOf((*MlflowExperimentArrayInput)(nil)).Elem(), MlflowExperimentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MlflowExperimentMapInput)(nil)).Elem(), MlflowExperimentMap{})
	pulumi.RegisterOutputType(MlflowExperimentOutput{})
	pulumi.RegisterOutputType(MlflowExperimentArrayOutput{})
	pulumi.RegisterOutputType(MlflowExperimentMapOutput{})
}
