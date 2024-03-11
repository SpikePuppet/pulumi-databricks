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
// Retrieves information about databricks_cluster_policy.
//
// ## Example Usage
//
// Referring to a cluster policy by name:
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
//			personal, err := databricks.LookupClusterPolicy(ctx, &databricks.LookupClusterPolicyArgs{
//				Name: pulumi.StringRef("Personal Compute"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewCluster(ctx, "myCluster", &databricks.ClusterArgs{
//				PolicyId: *pulumi.String(personal.Id),
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
func LookupClusterPolicy(ctx *pulumi.Context, args *LookupClusterPolicyArgs, opts ...pulumi.InvokeOption) (*LookupClusterPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupClusterPolicyResult
	err := ctx.Invoke("databricks:index/getClusterPolicy:getClusterPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusterPolicy.
type LookupClusterPolicyArgs struct {
	// Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
	Definition *string `pulumi:"definition"`
	// Additional human-readable description of the cluster policy.
	Description *string `pulumi:"description"`
	// The id of the cluster policy.
	Id *string `pulumi:"id"`
	// If true, policy is a default policy created and managed by Databricks.
	IsDefault *bool `pulumi:"isDefault"`
	// Max number of clusters per user that can be active using this policy.
	MaxClustersPerUser *int `pulumi:"maxClustersPerUser"`
	// Name of the cluster policy. The cluster policy must exist before this resource can be planned.
	Name *string `pulumi:"name"`
	// Policy definition JSON document expressed in Databricks [Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definitions).
	PolicyFamilyDefinitionOverrides *string `pulumi:"policyFamilyDefinitionOverrides"`
	// ID of the policy family.
	PolicyFamilyId *string `pulumi:"policyFamilyId"`
}

// A collection of values returned by getClusterPolicy.
type LookupClusterPolicyResult struct {
	// Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
	Definition string `pulumi:"definition"`
	// Additional human-readable description of the cluster policy.
	Description string `pulumi:"description"`
	// The id of the cluster policy.
	Id string `pulumi:"id"`
	// If true, policy is a default policy created and managed by Databricks.
	IsDefault bool `pulumi:"isDefault"`
	// Max number of clusters per user that can be active using this policy.
	MaxClustersPerUser int    `pulumi:"maxClustersPerUser"`
	Name               string `pulumi:"name"`
	// Policy definition JSON document expressed in Databricks [Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definitions).
	PolicyFamilyDefinitionOverrides string `pulumi:"policyFamilyDefinitionOverrides"`
	// ID of the policy family.
	PolicyFamilyId string `pulumi:"policyFamilyId"`
}

func LookupClusterPolicyOutput(ctx *pulumi.Context, args LookupClusterPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupClusterPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClusterPolicyResult, error) {
			args := v.(LookupClusterPolicyArgs)
			r, err := LookupClusterPolicy(ctx, &args, opts...)
			var s LookupClusterPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupClusterPolicyResultOutput)
}

// A collection of arguments for invoking getClusterPolicy.
type LookupClusterPolicyOutputArgs struct {
	// Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
	Definition pulumi.StringPtrInput `pulumi:"definition"`
	// Additional human-readable description of the cluster policy.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// The id of the cluster policy.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// If true, policy is a default policy created and managed by Databricks.
	IsDefault pulumi.BoolPtrInput `pulumi:"isDefault"`
	// Max number of clusters per user that can be active using this policy.
	MaxClustersPerUser pulumi.IntPtrInput `pulumi:"maxClustersPerUser"`
	// Name of the cluster policy. The cluster policy must exist before this resource can be planned.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Policy definition JSON document expressed in Databricks [Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definitions).
	PolicyFamilyDefinitionOverrides pulumi.StringPtrInput `pulumi:"policyFamilyDefinitionOverrides"`
	// ID of the policy family.
	PolicyFamilyId pulumi.StringPtrInput `pulumi:"policyFamilyId"`
}

func (LookupClusterPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getClusterPolicy.
type LookupClusterPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupClusterPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterPolicyResult)(nil)).Elem()
}

func (o LookupClusterPolicyResultOutput) ToLookupClusterPolicyResultOutput() LookupClusterPolicyResultOutput {
	return o
}

func (o LookupClusterPolicyResultOutput) ToLookupClusterPolicyResultOutputWithContext(ctx context.Context) LookupClusterPolicyResultOutput {
	return o
}

// Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
func (o LookupClusterPolicyResultOutput) Definition() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterPolicyResult) string { return v.Definition }).(pulumi.StringOutput)
}

// Additional human-readable description of the cluster policy.
func (o LookupClusterPolicyResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterPolicyResult) string { return v.Description }).(pulumi.StringOutput)
}

// The id of the cluster policy.
func (o LookupClusterPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// If true, policy is a default policy created and managed by Databricks.
func (o LookupClusterPolicyResultOutput) IsDefault() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterPolicyResult) bool { return v.IsDefault }).(pulumi.BoolOutput)
}

// Max number of clusters per user that can be active using this policy.
func (o LookupClusterPolicyResultOutput) MaxClustersPerUser() pulumi.IntOutput {
	return o.ApplyT(func(v LookupClusterPolicyResult) int { return v.MaxClustersPerUser }).(pulumi.IntOutput)
}

func (o LookupClusterPolicyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterPolicyResult) string { return v.Name }).(pulumi.StringOutput)
}

// Policy definition JSON document expressed in Databricks [Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definitions).
func (o LookupClusterPolicyResultOutput) PolicyFamilyDefinitionOverrides() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterPolicyResult) string { return v.PolicyFamilyDefinitionOverrides }).(pulumi.StringOutput)
}

// ID of the policy family.
func (o LookupClusterPolicyResultOutput) PolicyFamilyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterPolicyResult) string { return v.PolicyFamilyId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClusterPolicyResultOutput{})
}
