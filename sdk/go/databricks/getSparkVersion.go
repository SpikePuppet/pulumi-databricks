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
// Gets [Databricks Runtime (DBR)](https://docs.databricks.com/runtime/dbr.html) version that could be used for `sparkVersion` parameter in Cluster and other resources that fits search criteria, like specific Spark or Scala version, ML or Genomics runtime, etc., similar to executing `databricks clusters spark-versions`, and filters it to return the latest version that matches criteria. Often used along getNodeType data source.
//
// > **Note** This is experimental functionality, which aims to simplify things. In case of wrong parameters given (e.g. together `ml = true` and `genomics = true`, or something like), data source will throw an error.  Similarly, if search returns multiple results, and `latest = false`, data source will throw an error.
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
//			withGpu, err := databricks.GetNodeType(ctx, &databricks.GetNodeTypeArgs{
//				LocalDisk: pulumi.BoolRef(true),
//				MinCores:  pulumi.IntRef(16),
//				GbPerCore: pulumi.IntRef(1),
//				MinGpus:   pulumi.IntRef(1),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			gpuMl, err := databricks.GetSparkVersion(ctx, &databricks.GetSparkVersionArgs{
//				Gpu: pulumi.BoolRef(true),
//				Ml:  pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewCluster(ctx, "research", &databricks.ClusterArgs{
//				ClusterName:            pulumi.String("Research Cluster"),
//				SparkVersion:           *pulumi.String(gpuMl.Id),
//				NodeTypeId:             *pulumi.String(withGpu.Id),
//				AutoterminationMinutes: pulumi.Int(20),
//				Autoscale: &databricks.ClusterAutoscaleArgs{
//					MinWorkers: pulumi.Int(1),
//					MaxWorkers: pulumi.Int(50),
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
// * End to end workspace management guide.
// * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
// * ClusterPolicy to create a Cluster policy, which limits the ability to create clusters based on a set of rules.
// * InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
// * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
func GetSparkVersion(ctx *pulumi.Context, args *GetSparkVersionArgs, opts ...pulumi.InvokeOption) (*GetSparkVersionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSparkVersionResult
	err := ctx.Invoke("databricks:index/getSparkVersion:getSparkVersion", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSparkVersion.
type GetSparkVersionArgs struct {
	// if we should limit the search only to runtimes that are in Beta stage. Default to `false`.
	Beta *bool `pulumi:"beta"`
	// if we should limit the search only to Genomics (HLS) runtimes. Default to `false`.
	Genomics *bool `pulumi:"genomics"`
	// if we should limit the search only to runtimes that support GPUs. Default to `false`.
	Gpu *bool `pulumi:"gpu"`
	// if we should limit the search only to runtimes supporting AWS Graviton CPUs. Default to `false`. _Deprecated with DBR 14.0 release. DBR version compiled for Graviton will be automatically installed when nodes with Graviton CPUs are specified in the cluster configuration._
	//
	// Deprecated: Not required anymore - it's automatically enabled on the Graviton-based node types
	Graviton *bool `pulumi:"graviton"`
	// if we should return only the latest version if there is more than one result.  Default to `true`. If set to `false` and multiple versions are matching, throws an error.
	Latest *bool `pulumi:"latest"`
	// if we should limit the search only to LTS (long term support) & ESR (extended support) versions. Default to `false`.
	LongTermSupport *bool `pulumi:"longTermSupport"`
	// if we should limit the search only to ML runtimes. Default to `false`.
	Ml *bool `pulumi:"ml"`
	// if we should limit the search only to Photon runtimes. Default to `false`. *Deprecated with DBR 14.0 release. Specify `runtime_engine=\"PHOTON\"` in the cluster configuration instead!*
	//
	// Deprecated: Specify runtime_engine="PHOTON" in the cluster configuration
	Photon *bool `pulumi:"photon"`
	// if we should limit the search only to runtimes that are based on specific Scala version. Default to `2.12`.
	Scala *string `pulumi:"scala"`
	// if we should limit the search only to runtimes that are based on specific Spark version. Default to empty string.  It could be specified as `3`, or `3.0`, or full version, like, `3.0.1`.
	SparkVersion *string `pulumi:"sparkVersion"`
}

// A collection of values returned by getSparkVersion.
type GetSparkVersionResult struct {
	Beta     *bool `pulumi:"beta"`
	Genomics *bool `pulumi:"genomics"`
	Gpu      *bool `pulumi:"gpu"`
	// Deprecated: Not required anymore - it's automatically enabled on the Graviton-based node types
	Graviton *bool `pulumi:"graviton"`
	// The provider-assigned unique ID for this managed resource.
	Id              string `pulumi:"id"`
	Latest          *bool  `pulumi:"latest"`
	LongTermSupport *bool  `pulumi:"longTermSupport"`
	Ml              *bool  `pulumi:"ml"`
	// Deprecated: Specify runtime_engine="PHOTON" in the cluster configuration
	Photon       *bool   `pulumi:"photon"`
	Scala        *string `pulumi:"scala"`
	SparkVersion *string `pulumi:"sparkVersion"`
}

func GetSparkVersionOutput(ctx *pulumi.Context, args GetSparkVersionOutputArgs, opts ...pulumi.InvokeOption) GetSparkVersionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSparkVersionResult, error) {
			args := v.(GetSparkVersionArgs)
			r, err := GetSparkVersion(ctx, &args, opts...)
			var s GetSparkVersionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSparkVersionResultOutput)
}

// A collection of arguments for invoking getSparkVersion.
type GetSparkVersionOutputArgs struct {
	// if we should limit the search only to runtimes that are in Beta stage. Default to `false`.
	Beta pulumi.BoolPtrInput `pulumi:"beta"`
	// if we should limit the search only to Genomics (HLS) runtimes. Default to `false`.
	Genomics pulumi.BoolPtrInput `pulumi:"genomics"`
	// if we should limit the search only to runtimes that support GPUs. Default to `false`.
	Gpu pulumi.BoolPtrInput `pulumi:"gpu"`
	// if we should limit the search only to runtimes supporting AWS Graviton CPUs. Default to `false`. _Deprecated with DBR 14.0 release. DBR version compiled for Graviton will be automatically installed when nodes with Graviton CPUs are specified in the cluster configuration._
	//
	// Deprecated: Not required anymore - it's automatically enabled on the Graviton-based node types
	Graviton pulumi.BoolPtrInput `pulumi:"graviton"`
	// if we should return only the latest version if there is more than one result.  Default to `true`. If set to `false` and multiple versions are matching, throws an error.
	Latest pulumi.BoolPtrInput `pulumi:"latest"`
	// if we should limit the search only to LTS (long term support) & ESR (extended support) versions. Default to `false`.
	LongTermSupport pulumi.BoolPtrInput `pulumi:"longTermSupport"`
	// if we should limit the search only to ML runtimes. Default to `false`.
	Ml pulumi.BoolPtrInput `pulumi:"ml"`
	// if we should limit the search only to Photon runtimes. Default to `false`. *Deprecated with DBR 14.0 release. Specify `runtime_engine=\"PHOTON\"` in the cluster configuration instead!*
	//
	// Deprecated: Specify runtime_engine="PHOTON" in the cluster configuration
	Photon pulumi.BoolPtrInput `pulumi:"photon"`
	// if we should limit the search only to runtimes that are based on specific Scala version. Default to `2.12`.
	Scala pulumi.StringPtrInput `pulumi:"scala"`
	// if we should limit the search only to runtimes that are based on specific Spark version. Default to empty string.  It could be specified as `3`, or `3.0`, or full version, like, `3.0.1`.
	SparkVersion pulumi.StringPtrInput `pulumi:"sparkVersion"`
}

func (GetSparkVersionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSparkVersionArgs)(nil)).Elem()
}

// A collection of values returned by getSparkVersion.
type GetSparkVersionResultOutput struct{ *pulumi.OutputState }

func (GetSparkVersionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSparkVersionResult)(nil)).Elem()
}

func (o GetSparkVersionResultOutput) ToGetSparkVersionResultOutput() GetSparkVersionResultOutput {
	return o
}

func (o GetSparkVersionResultOutput) ToGetSparkVersionResultOutputWithContext(ctx context.Context) GetSparkVersionResultOutput {
	return o
}

func (o GetSparkVersionResultOutput) Beta() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSparkVersionResult) *bool { return v.Beta }).(pulumi.BoolPtrOutput)
}

func (o GetSparkVersionResultOutput) Genomics() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSparkVersionResult) *bool { return v.Genomics }).(pulumi.BoolPtrOutput)
}

func (o GetSparkVersionResultOutput) Gpu() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSparkVersionResult) *bool { return v.Gpu }).(pulumi.BoolPtrOutput)
}

// Deprecated: Not required anymore - it's automatically enabled on the Graviton-based node types
func (o GetSparkVersionResultOutput) Graviton() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSparkVersionResult) *bool { return v.Graviton }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSparkVersionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSparkVersionResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSparkVersionResultOutput) Latest() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSparkVersionResult) *bool { return v.Latest }).(pulumi.BoolPtrOutput)
}

func (o GetSparkVersionResultOutput) LongTermSupport() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSparkVersionResult) *bool { return v.LongTermSupport }).(pulumi.BoolPtrOutput)
}

func (o GetSparkVersionResultOutput) Ml() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSparkVersionResult) *bool { return v.Ml }).(pulumi.BoolPtrOutput)
}

// Deprecated: Specify runtime_engine="PHOTON" in the cluster configuration
func (o GetSparkVersionResultOutput) Photon() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSparkVersionResult) *bool { return v.Photon }).(pulumi.BoolPtrOutput)
}

func (o GetSparkVersionResultOutput) Scala() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSparkVersionResult) *string { return v.Scala }).(pulumi.StringPtrOutput)
}

func (o GetSparkVersionResultOutput) SparkVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSparkVersionResult) *string { return v.SparkVersion }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSparkVersionResultOutput{})
}
