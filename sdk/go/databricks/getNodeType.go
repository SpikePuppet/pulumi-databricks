// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		withGpu, err := databricks.GetNodeType(ctx, &GetNodeTypeArgs{
// 			LocalDisk: pulumi.BoolRef(true),
// 			MinCores:  pulumi.IntRef(16),
// 			GbPerCore: pulumi.IntRef(1),
// 			MinGpus:   pulumi.IntRef(1),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		gpuMl, err := databricks.GetSparkVersion(ctx, &GetSparkVersionArgs{
// 			Gpu: pulumi.BoolRef(true),
// 			Ml:  pulumi.BoolRef(true),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = databricks.NewCluster(ctx, "research", &databricks.ClusterArgs{
// 			ClusterName:            pulumi.String("Research Cluster"),
// 			SparkVersion:           pulumi.String(gpuMl.Id),
// 			NodeTypeId:             pulumi.String(withGpu.Id),
// 			AutoterminationMinutes: pulumi.Int(20),
// 			Autoscale: &ClusterAutoscaleArgs{
// 				MinWorkers: pulumi.Int(1),
// 				MaxWorkers: pulumi.Int(50),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Related Resources
//
// The following resources are used in the same context:
//
// * End to end workspace management guide
// * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
// * ClusterPolicy to create a Cluster policy, which limits the ability to create clusters based on a set of rules.
// * InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
// * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
func GetNodeType(ctx *pulumi.Context, args *GetNodeTypeArgs, opts ...pulumi.InvokeOption) (*GetNodeTypeResult, error) {
	var rv GetNodeTypeResult
	err := ctx.Invoke("databricks:index/getNodeType:getNodeType", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNodeType.
type GetNodeTypeArgs struct {
	// Node category, which can be one of (depending on the cloud environment, could be checked with `databricks clusters list-node-types|jq '.node_types[]|.category'|sort |uniq`):
	// * `General Purpose` (all clouds)
	// * `General Purpose (HDD)` (Azure)
	// * `Compute Optimized` (all clouds)
	// * `Memory Optimized` (all clouds)
	// * `Memory Optimized (Remote HDD)` (Azure)
	// * `Storage Optimized` (AWS, Azure)
	// * `GPU Accelerated` (AWS, Azure)
	Category *string `pulumi:"category"`
	// Number of gigabytes per core available on instance. Conflicts with `minMemoryGb`. Defaults to *0*.
	GbPerCore *int `pulumi:"gbPerCore"`
	// if we should limit the search only to nodes with AWS Graviton CPUs. Default to *false*.
	Graviton *bool `pulumi:"graviton"`
	// . Pick only nodes that have IO Cache. Defaults to *false*.
	IsIoCacheEnabled *bool `pulumi:"isIoCacheEnabled"`
	// Pick only nodes with local storage. Defaults to *false*.
	LocalDisk *bool `pulumi:"localDisk"`
	// Minimum number of CPU cores available on instance. Defaults to *0*.
	MinCores *int `pulumi:"minCores"`
	// Minimum number of GPU's attached to instance. Defaults to *0*.
	MinGpus *int `pulumi:"minGpus"`
	// Minimum amount of memory per node in gigabytes. Defaults to *0*.
	MinMemoryGb *int `pulumi:"minMemoryGb"`
	// Pick only nodes that can run Photon driver. Defaults to *false*.
	PhotonDriverCapable *bool `pulumi:"photonDriverCapable"`
	// Pick only nodes that can run Photon workers. Defaults to *false*.
	PhotonWorkerCapable *bool `pulumi:"photonWorkerCapable"`
	// Pick only nodes that support port forwarding. Defaults to *false*.
	SupportPortForwarding *bool `pulumi:"supportPortForwarding"`
	Vcpu                  *bool `pulumi:"vcpu"`
}

// A collection of values returned by getNodeType.
type GetNodeTypeResult struct {
	Category  *string `pulumi:"category"`
	GbPerCore *int    `pulumi:"gbPerCore"`
	Graviton  *bool   `pulumi:"graviton"`
	// The provider-assigned unique ID for this managed resource.
	Id                    string `pulumi:"id"`
	IsIoCacheEnabled      *bool  `pulumi:"isIoCacheEnabled"`
	LocalDisk             *bool  `pulumi:"localDisk"`
	MinCores              *int   `pulumi:"minCores"`
	MinGpus               *int   `pulumi:"minGpus"`
	MinMemoryGb           *int   `pulumi:"minMemoryGb"`
	PhotonDriverCapable   *bool  `pulumi:"photonDriverCapable"`
	PhotonWorkerCapable   *bool  `pulumi:"photonWorkerCapable"`
	SupportPortForwarding *bool  `pulumi:"supportPortForwarding"`
	Vcpu                  *bool  `pulumi:"vcpu"`
}

func GetNodeTypeOutput(ctx *pulumi.Context, args GetNodeTypeOutputArgs, opts ...pulumi.InvokeOption) GetNodeTypeResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNodeTypeResult, error) {
			args := v.(GetNodeTypeArgs)
			r, err := GetNodeType(ctx, &args, opts...)
			var s GetNodeTypeResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNodeTypeResultOutput)
}

// A collection of arguments for invoking getNodeType.
type GetNodeTypeOutputArgs struct {
	// Node category, which can be one of (depending on the cloud environment, could be checked with `databricks clusters list-node-types|jq '.node_types[]|.category'|sort |uniq`):
	// * `General Purpose` (all clouds)
	// * `General Purpose (HDD)` (Azure)
	// * `Compute Optimized` (all clouds)
	// * `Memory Optimized` (all clouds)
	// * `Memory Optimized (Remote HDD)` (Azure)
	// * `Storage Optimized` (AWS, Azure)
	// * `GPU Accelerated` (AWS, Azure)
	Category pulumi.StringPtrInput `pulumi:"category"`
	// Number of gigabytes per core available on instance. Conflicts with `minMemoryGb`. Defaults to *0*.
	GbPerCore pulumi.IntPtrInput `pulumi:"gbPerCore"`
	// if we should limit the search only to nodes with AWS Graviton CPUs. Default to *false*.
	Graviton pulumi.BoolPtrInput `pulumi:"graviton"`
	// . Pick only nodes that have IO Cache. Defaults to *false*.
	IsIoCacheEnabled pulumi.BoolPtrInput `pulumi:"isIoCacheEnabled"`
	// Pick only nodes with local storage. Defaults to *false*.
	LocalDisk pulumi.BoolPtrInput `pulumi:"localDisk"`
	// Minimum number of CPU cores available on instance. Defaults to *0*.
	MinCores pulumi.IntPtrInput `pulumi:"minCores"`
	// Minimum number of GPU's attached to instance. Defaults to *0*.
	MinGpus pulumi.IntPtrInput `pulumi:"minGpus"`
	// Minimum amount of memory per node in gigabytes. Defaults to *0*.
	MinMemoryGb pulumi.IntPtrInput `pulumi:"minMemoryGb"`
	// Pick only nodes that can run Photon driver. Defaults to *false*.
	PhotonDriverCapable pulumi.BoolPtrInput `pulumi:"photonDriverCapable"`
	// Pick only nodes that can run Photon workers. Defaults to *false*.
	PhotonWorkerCapable pulumi.BoolPtrInput `pulumi:"photonWorkerCapable"`
	// Pick only nodes that support port forwarding. Defaults to *false*.
	SupportPortForwarding pulumi.BoolPtrInput `pulumi:"supportPortForwarding"`
	Vcpu                  pulumi.BoolPtrInput `pulumi:"vcpu"`
}

func (GetNodeTypeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNodeTypeArgs)(nil)).Elem()
}

// A collection of values returned by getNodeType.
type GetNodeTypeResultOutput struct{ *pulumi.OutputState }

func (GetNodeTypeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNodeTypeResult)(nil)).Elem()
}

func (o GetNodeTypeResultOutput) ToGetNodeTypeResultOutput() GetNodeTypeResultOutput {
	return o
}

func (o GetNodeTypeResultOutput) ToGetNodeTypeResultOutputWithContext(ctx context.Context) GetNodeTypeResultOutput {
	return o
}

func (o GetNodeTypeResultOutput) Category() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *string { return v.Category }).(pulumi.StringPtrOutput)
}

func (o GetNodeTypeResultOutput) GbPerCore() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *int { return v.GbPerCore }).(pulumi.IntPtrOutput)
}

func (o GetNodeTypeResultOutput) Graviton() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *bool { return v.Graviton }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetNodeTypeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNodeTypeResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetNodeTypeResultOutput) IsIoCacheEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *bool { return v.IsIoCacheEnabled }).(pulumi.BoolPtrOutput)
}

func (o GetNodeTypeResultOutput) LocalDisk() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *bool { return v.LocalDisk }).(pulumi.BoolPtrOutput)
}

func (o GetNodeTypeResultOutput) MinCores() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *int { return v.MinCores }).(pulumi.IntPtrOutput)
}

func (o GetNodeTypeResultOutput) MinGpus() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *int { return v.MinGpus }).(pulumi.IntPtrOutput)
}

func (o GetNodeTypeResultOutput) MinMemoryGb() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *int { return v.MinMemoryGb }).(pulumi.IntPtrOutput)
}

func (o GetNodeTypeResultOutput) PhotonDriverCapable() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *bool { return v.PhotonDriverCapable }).(pulumi.BoolPtrOutput)
}

func (o GetNodeTypeResultOutput) PhotonWorkerCapable() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *bool { return v.PhotonWorkerCapable }).(pulumi.BoolPtrOutput)
}

func (o GetNodeTypeResultOutput) SupportPortForwarding() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *bool { return v.SupportPortForwarding }).(pulumi.BoolPtrOutput)
}

func (o GetNodeTypeResultOutput) Vcpu() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *bool { return v.Vcpu }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNodeTypeResultOutput{})
}
