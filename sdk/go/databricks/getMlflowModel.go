// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add dependsOn attribute in order to prevent _default auth: cannot configure default credentials_ errors.
//
// Retrieves the settings of MlflowModel by name.
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
//			_, err := databricks.NewMlflowModel(ctx, "this", &databricks.MlflowModelArgs{
//				Name:        pulumi.String("My MLflow Model"),
//				Description: pulumi.String("My MLflow model description"),
//				Tags: databricks.MlflowModelTagArray{
//					&databricks.MlflowModelTagArgs{
//						Key:   pulumi.String("key1"),
//						Value: pulumi.String("value1"),
//					},
//					&databricks.MlflowModelTagArgs{
//						Key:   pulumi.String("key2"),
//						Value: pulumi.String("value2"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			this, err := databricks.LookupMlflowModel(ctx, &databricks.LookupMlflowModelArgs{
//				Name: "My MLflow Model",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("model", this)
//			return nil
//		})
//	}
//
// ```
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
//			this, err := databricks.LookupMlflowModel(ctx, &databricks.LookupMlflowModelArgs{
//				Name: "My MLflow Model with multiple versions",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewModelServing(ctx, "this", &databricks.ModelServingArgs{
//				Name: pulumi.String("model-serving-endpoint"),
//				Config: &databricks.ModelServingConfigArgs{
//					ServedModels: databricks.ModelServingConfigServedModelArray{
//						&databricks.ModelServingConfigServedModelArgs{
//							Name:               pulumi.String("model_serving_prod"),
//							ModelName:          pulumi.String(this.Name),
//							ModelVersion:       pulumi.String(this.LatestVersions[0].Version),
//							WorkloadSize:       pulumi.String("Small"),
//							ScaleToZeroEnabled: pulumi.Bool(true),
//						},
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
func LookupMlflowModel(ctx *pulumi.Context, args *LookupMlflowModelArgs, opts ...pulumi.InvokeOption) (*LookupMlflowModelResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupMlflowModelResult
	err := ctx.Invoke("databricks:index/getMlflowModel:getMlflowModel", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMlflowModel.
type LookupMlflowModelArgs struct {
	// User-specified description for the object.
	Description *string `pulumi:"description"`
	// Array of model versions, each the latest version for its stage.
	LatestVersions []GetMlflowModelLatestVersion `pulumi:"latestVersions"`
	// Name of the registered model.
	Name string `pulumi:"name"`
	// Permission level of the requesting user on the object. For what is allowed at each level, see MLflow Model permissions.
	PermissionLevel *string `pulumi:"permissionLevel"`
	// Array of tags associated with the model.
	Tags []GetMlflowModelTag `pulumi:"tags"`
	// The username of the user that created the object.
	UserId *string `pulumi:"userId"`
}

// A collection of values returned by getMlflowModel.
type LookupMlflowModelResult struct {
	// User-specified description for the object.
	Description string `pulumi:"description"`
	// Unique identifier for the object.
	Id string `pulumi:"id"`
	// Array of model versions, each the latest version for its stage.
	LatestVersions []GetMlflowModelLatestVersion `pulumi:"latestVersions"`
	// Name of the model.
	Name string `pulumi:"name"`
	// Permission level of the requesting user on the object. For what is allowed at each level, see MLflow Model permissions.
	PermissionLevel string `pulumi:"permissionLevel"`
	// Array of tags associated with the model.
	Tags []GetMlflowModelTag `pulumi:"tags"`
	// The username of the user that created the object.
	UserId string `pulumi:"userId"`
}

func LookupMlflowModelOutput(ctx *pulumi.Context, args LookupMlflowModelOutputArgs, opts ...pulumi.InvokeOption) LookupMlflowModelResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupMlflowModelResult, error) {
			args := v.(LookupMlflowModelArgs)
			r, err := LookupMlflowModel(ctx, &args, opts...)
			var s LookupMlflowModelResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupMlflowModelResultOutput)
}

// A collection of arguments for invoking getMlflowModel.
type LookupMlflowModelOutputArgs struct {
	// User-specified description for the object.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// Array of model versions, each the latest version for its stage.
	LatestVersions GetMlflowModelLatestVersionArrayInput `pulumi:"latestVersions"`
	// Name of the registered model.
	Name pulumi.StringInput `pulumi:"name"`
	// Permission level of the requesting user on the object. For what is allowed at each level, see MLflow Model permissions.
	PermissionLevel pulumi.StringPtrInput `pulumi:"permissionLevel"`
	// Array of tags associated with the model.
	Tags GetMlflowModelTagArrayInput `pulumi:"tags"`
	// The username of the user that created the object.
	UserId pulumi.StringPtrInput `pulumi:"userId"`
}

func (LookupMlflowModelOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMlflowModelArgs)(nil)).Elem()
}

// A collection of values returned by getMlflowModel.
type LookupMlflowModelResultOutput struct{ *pulumi.OutputState }

func (LookupMlflowModelResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMlflowModelResult)(nil)).Elem()
}

func (o LookupMlflowModelResultOutput) ToLookupMlflowModelResultOutput() LookupMlflowModelResultOutput {
	return o
}

func (o LookupMlflowModelResultOutput) ToLookupMlflowModelResultOutputWithContext(ctx context.Context) LookupMlflowModelResultOutput {
	return o
}

// User-specified description for the object.
func (o LookupMlflowModelResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMlflowModelResult) string { return v.Description }).(pulumi.StringOutput)
}

// Unique identifier for the object.
func (o LookupMlflowModelResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMlflowModelResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of model versions, each the latest version for its stage.
func (o LookupMlflowModelResultOutput) LatestVersions() GetMlflowModelLatestVersionArrayOutput {
	return o.ApplyT(func(v LookupMlflowModelResult) []GetMlflowModelLatestVersion { return v.LatestVersions }).(GetMlflowModelLatestVersionArrayOutput)
}

// Name of the model.
func (o LookupMlflowModelResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMlflowModelResult) string { return v.Name }).(pulumi.StringOutput)
}

// Permission level of the requesting user on the object. For what is allowed at each level, see MLflow Model permissions.
func (o LookupMlflowModelResultOutput) PermissionLevel() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMlflowModelResult) string { return v.PermissionLevel }).(pulumi.StringOutput)
}

// Array of tags associated with the model.
func (o LookupMlflowModelResultOutput) Tags() GetMlflowModelTagArrayOutput {
	return o.ApplyT(func(v LookupMlflowModelResult) []GetMlflowModelTag { return v.Tags }).(GetMlflowModelTagArrayOutput)
}

// The username of the user that created the object.
func (o LookupMlflowModelResultOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMlflowModelResult) string { return v.UserId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupMlflowModelResultOutput{})
}
