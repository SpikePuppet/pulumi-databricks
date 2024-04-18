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

// This resource allows you to create [MLflow Model Registry Webhooks](https://docs.databricks.com/applications/mlflow/model-registry-webhooks.html) in Databricks.  Webhooks enable you to listen for Model Registry events so your integrations can automatically trigger actions. You can use webhooks to automate and integrate your machine learning pipeline with existing CI/CD tools and workflows. Webhooks allow trigger execution of a Databricks job or call a web service on specific event(s) that is generated in the MLflow Registry - stage transitioning, creation of registered model, creation of transition request, etc.
//
// ## Example Usage
//
// ### Triggering Databricks job
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi-std/sdk/go/std"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			me, err := databricks.GetCurrentUser(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			latest, err := databricks.GetSparkVersion(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			smallest, err := databricks.GetNodeType(ctx, &databricks.GetNodeTypeArgs{
//				LocalDisk: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			invokeBase64encode, err := std.Base64encode(ctx, &std.Base64encodeArgs{
//				Input: `import json
//
// event_message = dbutils.widgets.get("event_message")
// event_message_dict = json.loads(event_message)
// print(f"event data={event_message_dict}")
// `,
//
//			}, nil)
//			if err != nil {
//				return err
//			}
//			this, err := databricks.NewNotebook(ctx, "this", &databricks.NotebookArgs{
//				Path:          pulumi.String(fmt.Sprintf("%v/MLFlowWebhook", me.Home)),
//				Language:      pulumi.String("PYTHON"),
//				ContentBase64: invokeBase64encode.Result,
//			})
//			if err != nil {
//				return err
//			}
//			thisJob, err := databricks.NewJob(ctx, "this", &databricks.JobArgs{
//				Name: pulumi.String(fmt.Sprintf("Terraform MLflowWebhook Demo (%v)", me.Alphanumeric)),
//				Tasks: databricks.JobTaskArray{
//					&databricks.JobTaskArgs{
//						TaskKey: pulumi.String("task1"),
//						NewCluster: &databricks.JobTaskNewClusterArgs{
//							NumWorkers:   pulumi.Int(1),
//							SparkVersion: pulumi.String(latest.Id),
//							NodeTypeId:   pulumi.String(smallest.Id),
//						},
//						NotebookTask: &databricks.JobTaskNotebookTaskArgs{
//							NotebookPath: this.Path,
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			patForWebhook, err := databricks.NewToken(ctx, "pat_for_webhook", &databricks.TokenArgs{
//				Comment:         pulumi.String("MLflow Webhook"),
//				LifetimeSeconds: pulumi.Int(86400000),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewMlflowWebhook(ctx, "job", &databricks.MlflowWebhookArgs{
//				Events: pulumi.StringArray{
//					pulumi.String("TRANSITION_REQUEST_CREATED"),
//				},
//				Description: pulumi.String("Databricks Job webhook trigger"),
//				Status:      pulumi.String("ACTIVE"),
//				JobSpec: &databricks.MlflowWebhookJobSpecArgs{
//					JobId:        thisJob.ID(),
//					WorkspaceUrl: pulumi.String(me.WorkspaceUrl),
//					AccessToken:  patForWebhook.TokenValue,
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
// <!--End PulumiCodeChooser -->
//
// ### POSTing to URL
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := databricks.NewMlflowWebhook(ctx, "url", &databricks.MlflowWebhookArgs{
//				Events: pulumi.StringArray{
//					pulumi.String("TRANSITION_REQUEST_CREATED"),
//				},
//				Description: pulumi.String("URL webhook trigger"),
//				HttpUrlSpec: &databricks.MlflowWebhookHttpUrlSpecArgs{
//					Url: pulumi.String("https://my_cool_host/webhook"),
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
// <!--End PulumiCodeChooser -->
//
// ## Access Control
//
// * MLflow webhooks could be configured only by workspace admins.
//
// ## Related Resources
//
// The following resources are often used in the same context:
//
// * End to end workspace management guide.
// * Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
// * MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
// * MlflowModel to create [MLflow models](https://docs.databricks.com/applications/mlflow/models.html) in Databricks.
// * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
// * Notebook data to export a notebook from Databricks Workspace.
// * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
//
// ## Import
//
// -> **Note** Importing this resource is not currently supported.
type MlflowWebhook struct {
	pulumi.CustomResourceState

	// Optional description of the MLflow webhook.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
	//
	// Configuration must include one of `httpUrlSpec` or `jobSpec` blocks, but not both.
	Events      pulumi.StringArrayOutput          `pulumi:"events"`
	HttpUrlSpec MlflowWebhookHttpUrlSpecPtrOutput `pulumi:"httpUrlSpec"`
	JobSpec     MlflowWebhookJobSpecPtrOutput     `pulumi:"jobSpec"`
	// Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
	ModelName pulumi.StringPtrOutput `pulumi:"modelName"`
	// Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
	Status pulumi.StringPtrOutput `pulumi:"status"`
}

// NewMlflowWebhook registers a new resource with the given unique name, arguments, and options.
func NewMlflowWebhook(ctx *pulumi.Context,
	name string, args *MlflowWebhookArgs, opts ...pulumi.ResourceOption) (*MlflowWebhook, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Events == nil {
		return nil, errors.New("invalid value for required argument 'Events'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MlflowWebhook
	err := ctx.RegisterResource("databricks:index/mlflowWebhook:MlflowWebhook", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMlflowWebhook gets an existing MlflowWebhook resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMlflowWebhook(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MlflowWebhookState, opts ...pulumi.ResourceOption) (*MlflowWebhook, error) {
	var resource MlflowWebhook
	err := ctx.ReadResource("databricks:index/mlflowWebhook:MlflowWebhook", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MlflowWebhook resources.
type mlflowWebhookState struct {
	// Optional description of the MLflow webhook.
	Description *string `pulumi:"description"`
	// The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
	//
	// Configuration must include one of `httpUrlSpec` or `jobSpec` blocks, but not both.
	Events      []string                  `pulumi:"events"`
	HttpUrlSpec *MlflowWebhookHttpUrlSpec `pulumi:"httpUrlSpec"`
	JobSpec     *MlflowWebhookJobSpec     `pulumi:"jobSpec"`
	// Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
	ModelName *string `pulumi:"modelName"`
	// Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
	Status *string `pulumi:"status"`
}

type MlflowWebhookState struct {
	// Optional description of the MLflow webhook.
	Description pulumi.StringPtrInput
	// The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
	//
	// Configuration must include one of `httpUrlSpec` or `jobSpec` blocks, but not both.
	Events      pulumi.StringArrayInput
	HttpUrlSpec MlflowWebhookHttpUrlSpecPtrInput
	JobSpec     MlflowWebhookJobSpecPtrInput
	// Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
	ModelName pulumi.StringPtrInput
	// Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
	Status pulumi.StringPtrInput
}

func (MlflowWebhookState) ElementType() reflect.Type {
	return reflect.TypeOf((*mlflowWebhookState)(nil)).Elem()
}

type mlflowWebhookArgs struct {
	// Optional description of the MLflow webhook.
	Description *string `pulumi:"description"`
	// The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
	//
	// Configuration must include one of `httpUrlSpec` or `jobSpec` blocks, but not both.
	Events      []string                  `pulumi:"events"`
	HttpUrlSpec *MlflowWebhookHttpUrlSpec `pulumi:"httpUrlSpec"`
	JobSpec     *MlflowWebhookJobSpec     `pulumi:"jobSpec"`
	// Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
	ModelName *string `pulumi:"modelName"`
	// Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
	Status *string `pulumi:"status"`
}

// The set of arguments for constructing a MlflowWebhook resource.
type MlflowWebhookArgs struct {
	// Optional description of the MLflow webhook.
	Description pulumi.StringPtrInput
	// The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
	//
	// Configuration must include one of `httpUrlSpec` or `jobSpec` blocks, but not both.
	Events      pulumi.StringArrayInput
	HttpUrlSpec MlflowWebhookHttpUrlSpecPtrInput
	JobSpec     MlflowWebhookJobSpecPtrInput
	// Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
	ModelName pulumi.StringPtrInput
	// Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
	Status pulumi.StringPtrInput
}

func (MlflowWebhookArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mlflowWebhookArgs)(nil)).Elem()
}

type MlflowWebhookInput interface {
	pulumi.Input

	ToMlflowWebhookOutput() MlflowWebhookOutput
	ToMlflowWebhookOutputWithContext(ctx context.Context) MlflowWebhookOutput
}

func (*MlflowWebhook) ElementType() reflect.Type {
	return reflect.TypeOf((**MlflowWebhook)(nil)).Elem()
}

func (i *MlflowWebhook) ToMlflowWebhookOutput() MlflowWebhookOutput {
	return i.ToMlflowWebhookOutputWithContext(context.Background())
}

func (i *MlflowWebhook) ToMlflowWebhookOutputWithContext(ctx context.Context) MlflowWebhookOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MlflowWebhookOutput)
}

// MlflowWebhookArrayInput is an input type that accepts MlflowWebhookArray and MlflowWebhookArrayOutput values.
// You can construct a concrete instance of `MlflowWebhookArrayInput` via:
//
//	MlflowWebhookArray{ MlflowWebhookArgs{...} }
type MlflowWebhookArrayInput interface {
	pulumi.Input

	ToMlflowWebhookArrayOutput() MlflowWebhookArrayOutput
	ToMlflowWebhookArrayOutputWithContext(context.Context) MlflowWebhookArrayOutput
}

type MlflowWebhookArray []MlflowWebhookInput

func (MlflowWebhookArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MlflowWebhook)(nil)).Elem()
}

func (i MlflowWebhookArray) ToMlflowWebhookArrayOutput() MlflowWebhookArrayOutput {
	return i.ToMlflowWebhookArrayOutputWithContext(context.Background())
}

func (i MlflowWebhookArray) ToMlflowWebhookArrayOutputWithContext(ctx context.Context) MlflowWebhookArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MlflowWebhookArrayOutput)
}

// MlflowWebhookMapInput is an input type that accepts MlflowWebhookMap and MlflowWebhookMapOutput values.
// You can construct a concrete instance of `MlflowWebhookMapInput` via:
//
//	MlflowWebhookMap{ "key": MlflowWebhookArgs{...} }
type MlflowWebhookMapInput interface {
	pulumi.Input

	ToMlflowWebhookMapOutput() MlflowWebhookMapOutput
	ToMlflowWebhookMapOutputWithContext(context.Context) MlflowWebhookMapOutput
}

type MlflowWebhookMap map[string]MlflowWebhookInput

func (MlflowWebhookMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MlflowWebhook)(nil)).Elem()
}

func (i MlflowWebhookMap) ToMlflowWebhookMapOutput() MlflowWebhookMapOutput {
	return i.ToMlflowWebhookMapOutputWithContext(context.Background())
}

func (i MlflowWebhookMap) ToMlflowWebhookMapOutputWithContext(ctx context.Context) MlflowWebhookMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MlflowWebhookMapOutput)
}

type MlflowWebhookOutput struct{ *pulumi.OutputState }

func (MlflowWebhookOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MlflowWebhook)(nil)).Elem()
}

func (o MlflowWebhookOutput) ToMlflowWebhookOutput() MlflowWebhookOutput {
	return o
}

func (o MlflowWebhookOutput) ToMlflowWebhookOutputWithContext(ctx context.Context) MlflowWebhookOutput {
	return o
}

// Optional description of the MLflow webhook.
func (o MlflowWebhookOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MlflowWebhook) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
//
// Configuration must include one of `httpUrlSpec` or `jobSpec` blocks, but not both.
func (o MlflowWebhookOutput) Events() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MlflowWebhook) pulumi.StringArrayOutput { return v.Events }).(pulumi.StringArrayOutput)
}

func (o MlflowWebhookOutput) HttpUrlSpec() MlflowWebhookHttpUrlSpecPtrOutput {
	return o.ApplyT(func(v *MlflowWebhook) MlflowWebhookHttpUrlSpecPtrOutput { return v.HttpUrlSpec }).(MlflowWebhookHttpUrlSpecPtrOutput)
}

func (o MlflowWebhookOutput) JobSpec() MlflowWebhookJobSpecPtrOutput {
	return o.ApplyT(func(v *MlflowWebhook) MlflowWebhookJobSpecPtrOutput { return v.JobSpec }).(MlflowWebhookJobSpecPtrOutput)
}

// Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
func (o MlflowWebhookOutput) ModelName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MlflowWebhook) pulumi.StringPtrOutput { return v.ModelName }).(pulumi.StringPtrOutput)
}

// Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
func (o MlflowWebhookOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MlflowWebhook) pulumi.StringPtrOutput { return v.Status }).(pulumi.StringPtrOutput)
}

type MlflowWebhookArrayOutput struct{ *pulumi.OutputState }

func (MlflowWebhookArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MlflowWebhook)(nil)).Elem()
}

func (o MlflowWebhookArrayOutput) ToMlflowWebhookArrayOutput() MlflowWebhookArrayOutput {
	return o
}

func (o MlflowWebhookArrayOutput) ToMlflowWebhookArrayOutputWithContext(ctx context.Context) MlflowWebhookArrayOutput {
	return o
}

func (o MlflowWebhookArrayOutput) Index(i pulumi.IntInput) MlflowWebhookOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MlflowWebhook {
		return vs[0].([]*MlflowWebhook)[vs[1].(int)]
	}).(MlflowWebhookOutput)
}

type MlflowWebhookMapOutput struct{ *pulumi.OutputState }

func (MlflowWebhookMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MlflowWebhook)(nil)).Elem()
}

func (o MlflowWebhookMapOutput) ToMlflowWebhookMapOutput() MlflowWebhookMapOutput {
	return o
}

func (o MlflowWebhookMapOutput) ToMlflowWebhookMapOutputWithContext(ctx context.Context) MlflowWebhookMapOutput {
	return o
}

func (o MlflowWebhookMapOutput) MapIndex(k pulumi.StringInput) MlflowWebhookOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MlflowWebhook {
		return vs[0].(map[string]*MlflowWebhook)[vs[1].(string)]
	}).(MlflowWebhookOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MlflowWebhookInput)(nil)).Elem(), &MlflowWebhook{})
	pulumi.RegisterInputType(reflect.TypeOf((*MlflowWebhookArrayInput)(nil)).Elem(), MlflowWebhookArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MlflowWebhookMapInput)(nil)).Elem(), MlflowWebhookMap{})
	pulumi.RegisterOutputType(MlflowWebhookOutput{})
	pulumi.RegisterOutputType(MlflowWebhookArrayOutput{})
	pulumi.RegisterOutputType(MlflowWebhookMapOutput{})
}
