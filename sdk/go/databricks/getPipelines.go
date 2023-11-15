// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add dependsOn attribute in order to prevent _authentication is not configured for provider_ errors.
//
// Retrieves a list of all Pipeline ([Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html)) ids deployed in a workspace, or those matching the provided search term. Maximum 100 results.
//
// ## Example Usage
//
// Get all Delta Live Tables pipelines:
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
//			all, err := databricks.GetPipelines(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("allPipelines", all.Ids)
//			return nil
//		})
//	}
//
// ```
//
// Filter Delta Live Tables pipelines by name (exact match):
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
//			this, err := databricks.GetPipelines(ctx, &databricks.GetPipelinesArgs{
//				PipelineName: pulumi.StringRef("my_pipeline"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("myPipeline", this.Ids)
//			return nil
//		})
//	}
//
// ```
//
// Filter Delta Live Tables pipelines by name (wildcard search):
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
//			this, err := databricks.GetPipelines(ctx, &databricks.GetPipelinesArgs{
//				PipelineName: pulumi.StringRef("%pipeline%"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("wildcardPipelines", this.Ids)
//			return nil
//		})
//	}
//
// ```
// ## Related Resources
//
// The following resources are used in the same context:
//
// * End to end workspace management guide.
// * Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
// * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
// * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
// * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
func GetPipelines(ctx *pulumi.Context, args *GetPipelinesArgs, opts ...pulumi.InvokeOption) (*GetPipelinesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPipelinesResult
	err := ctx.Invoke("databricks:index/getPipelines:getPipelines", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPipelines.
type GetPipelinesArgs struct {
	// List of ids for [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipelines matching the provided search criteria.
	Ids []string `pulumi:"ids"`
	// Filter Delta Live Tables pipelines by name for a given search term. `%` is the supported wildcard operator.
	PipelineName *string `pulumi:"pipelineName"`
}

// A collection of values returned by getPipelines.
type GetPipelinesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of ids for [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipelines matching the provided search criteria.
	Ids          []string `pulumi:"ids"`
	PipelineName *string  `pulumi:"pipelineName"`
}

func GetPipelinesOutput(ctx *pulumi.Context, args GetPipelinesOutputArgs, opts ...pulumi.InvokeOption) GetPipelinesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPipelinesResult, error) {
			args := v.(GetPipelinesArgs)
			r, err := GetPipelines(ctx, &args, opts...)
			var s GetPipelinesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPipelinesResultOutput)
}

// A collection of arguments for invoking getPipelines.
type GetPipelinesOutputArgs struct {
	// List of ids for [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipelines matching the provided search criteria.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// Filter Delta Live Tables pipelines by name for a given search term. `%` is the supported wildcard operator.
	PipelineName pulumi.StringPtrInput `pulumi:"pipelineName"`
}

func (GetPipelinesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPipelinesArgs)(nil)).Elem()
}

// A collection of values returned by getPipelines.
type GetPipelinesResultOutput struct{ *pulumi.OutputState }

func (GetPipelinesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPipelinesResult)(nil)).Elem()
}

func (o GetPipelinesResultOutput) ToGetPipelinesResultOutput() GetPipelinesResultOutput {
	return o
}

func (o GetPipelinesResultOutput) ToGetPipelinesResultOutputWithContext(ctx context.Context) GetPipelinesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetPipelinesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPipelinesResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of ids for [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipelines matching the provided search criteria.
func (o GetPipelinesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPipelinesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetPipelinesResultOutput) PipelineName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPipelinesResult) *string { return v.PipelineName }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPipelinesResultOutput{})
}
