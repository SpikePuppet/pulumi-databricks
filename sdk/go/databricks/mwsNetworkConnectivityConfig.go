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

// > **Note** Initialize provider with `alias = "account"`, `host = "https://accounts.azuredatabricks.net"` and use `provider = databricks.account` for all `databricks_mws_*` resources.
//
// > **Public Preview** This feature is available for AWS & Azure only, and is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html) in AWS.
//
// Allows you to create a [Network Connectivity Config] that can be used as part of a MwsWorkspaces resource to create a [Databricks Workspace that leverages serverless network connectivity configs](https://learn.microsoft.com/en-us/azure/databricks/security/network/serverless-network-security/serverless-firewall).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			region := cfg.RequireObject("region")
//			prefix := cfg.RequireObject("prefix")
//			ncc, err := databricks.NewMwsNetworkConnectivityConfig(ctx, "ncc", &databricks.MwsNetworkConnectivityConfigArgs{
//				Name:   pulumi.String(fmt.Sprintf("Network Connectivity Config for %v", prefix)),
//				Region: pulumi.Any(region),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewMwsNccBinding(ctx, "ncc_binding", &databricks.MwsNccBindingArgs{
//				NetworkConnectivityConfigId: ncc.NetworkConnectivityConfigId,
//				WorkspaceId:                 pulumi.Any(databricksWorkspaceId),
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
// The following resources are used in the context:
//
// * MwsWorkspaces to set up Databricks workspaces.
// * MwsNccBinding to attach an NCC to a workspace.
// * MwsNccPrivateEndpointRule to create a private endpoint rule.
//
// ## Import
//
// This resource can be imported by Databricks account ID and Network Connectivity Config ID.
//
// ```sh
// $ pulumi import databricks:index/mwsNetworkConnectivityConfig:MwsNetworkConnectivityConfig ncc <account_id>/<network_connectivity_config_id>
// ```
type MwsNetworkConnectivityConfig struct {
	pulumi.CustomResourceState

	AccountId    pulumi.StringOutput                            `pulumi:"accountId"`
	CreationTime pulumi.IntOutput                               `pulumi:"creationTime"`
	EgressConfig MwsNetworkConnectivityConfigEgressConfigOutput `pulumi:"egressConfig"`
	// Name of Network Connectivity Config in Databricks Account. Change forces creation of a new resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Canonical unique identifier of Network Connectivity Config in Databricks Account
	NetworkConnectivityConfigId pulumi.StringOutput `pulumi:"networkConnectivityConfigId"`
	// Region of the Network Connectivity Config. NCCs can only be referenced by your workspaces in the same region. Change forces creation of a new resource.
	Region      pulumi.StringOutput `pulumi:"region"`
	UpdatedTime pulumi.IntOutput    `pulumi:"updatedTime"`
}

// NewMwsNetworkConnectivityConfig registers a new resource with the given unique name, arguments, and options.
func NewMwsNetworkConnectivityConfig(ctx *pulumi.Context,
	name string, args *MwsNetworkConnectivityConfigArgs, opts ...pulumi.ResourceOption) (*MwsNetworkConnectivityConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MwsNetworkConnectivityConfig
	err := ctx.RegisterResource("databricks:index/mwsNetworkConnectivityConfig:MwsNetworkConnectivityConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMwsNetworkConnectivityConfig gets an existing MwsNetworkConnectivityConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMwsNetworkConnectivityConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MwsNetworkConnectivityConfigState, opts ...pulumi.ResourceOption) (*MwsNetworkConnectivityConfig, error) {
	var resource MwsNetworkConnectivityConfig
	err := ctx.ReadResource("databricks:index/mwsNetworkConnectivityConfig:MwsNetworkConnectivityConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MwsNetworkConnectivityConfig resources.
type mwsNetworkConnectivityConfigState struct {
	AccountId    *string                                   `pulumi:"accountId"`
	CreationTime *int                                      `pulumi:"creationTime"`
	EgressConfig *MwsNetworkConnectivityConfigEgressConfig `pulumi:"egressConfig"`
	// Name of Network Connectivity Config in Databricks Account. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Canonical unique identifier of Network Connectivity Config in Databricks Account
	NetworkConnectivityConfigId *string `pulumi:"networkConnectivityConfigId"`
	// Region of the Network Connectivity Config. NCCs can only be referenced by your workspaces in the same region. Change forces creation of a new resource.
	Region      *string `pulumi:"region"`
	UpdatedTime *int    `pulumi:"updatedTime"`
}

type MwsNetworkConnectivityConfigState struct {
	AccountId    pulumi.StringPtrInput
	CreationTime pulumi.IntPtrInput
	EgressConfig MwsNetworkConnectivityConfigEgressConfigPtrInput
	// Name of Network Connectivity Config in Databricks Account. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Canonical unique identifier of Network Connectivity Config in Databricks Account
	NetworkConnectivityConfigId pulumi.StringPtrInput
	// Region of the Network Connectivity Config. NCCs can only be referenced by your workspaces in the same region. Change forces creation of a new resource.
	Region      pulumi.StringPtrInput
	UpdatedTime pulumi.IntPtrInput
}

func (MwsNetworkConnectivityConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*mwsNetworkConnectivityConfigState)(nil)).Elem()
}

type mwsNetworkConnectivityConfigArgs struct {
	AccountId    *string                                   `pulumi:"accountId"`
	CreationTime *int                                      `pulumi:"creationTime"`
	EgressConfig *MwsNetworkConnectivityConfigEgressConfig `pulumi:"egressConfig"`
	// Name of Network Connectivity Config in Databricks Account. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Canonical unique identifier of Network Connectivity Config in Databricks Account
	NetworkConnectivityConfigId *string `pulumi:"networkConnectivityConfigId"`
	// Region of the Network Connectivity Config. NCCs can only be referenced by your workspaces in the same region. Change forces creation of a new resource.
	Region      string `pulumi:"region"`
	UpdatedTime *int   `pulumi:"updatedTime"`
}

// The set of arguments for constructing a MwsNetworkConnectivityConfig resource.
type MwsNetworkConnectivityConfigArgs struct {
	AccountId    pulumi.StringPtrInput
	CreationTime pulumi.IntPtrInput
	EgressConfig MwsNetworkConnectivityConfigEgressConfigPtrInput
	// Name of Network Connectivity Config in Databricks Account. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Canonical unique identifier of Network Connectivity Config in Databricks Account
	NetworkConnectivityConfigId pulumi.StringPtrInput
	// Region of the Network Connectivity Config. NCCs can only be referenced by your workspaces in the same region. Change forces creation of a new resource.
	Region      pulumi.StringInput
	UpdatedTime pulumi.IntPtrInput
}

func (MwsNetworkConnectivityConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mwsNetworkConnectivityConfigArgs)(nil)).Elem()
}

type MwsNetworkConnectivityConfigInput interface {
	pulumi.Input

	ToMwsNetworkConnectivityConfigOutput() MwsNetworkConnectivityConfigOutput
	ToMwsNetworkConnectivityConfigOutputWithContext(ctx context.Context) MwsNetworkConnectivityConfigOutput
}

func (*MwsNetworkConnectivityConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**MwsNetworkConnectivityConfig)(nil)).Elem()
}

func (i *MwsNetworkConnectivityConfig) ToMwsNetworkConnectivityConfigOutput() MwsNetworkConnectivityConfigOutput {
	return i.ToMwsNetworkConnectivityConfigOutputWithContext(context.Background())
}

func (i *MwsNetworkConnectivityConfig) ToMwsNetworkConnectivityConfigOutputWithContext(ctx context.Context) MwsNetworkConnectivityConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsNetworkConnectivityConfigOutput)
}

// MwsNetworkConnectivityConfigArrayInput is an input type that accepts MwsNetworkConnectivityConfigArray and MwsNetworkConnectivityConfigArrayOutput values.
// You can construct a concrete instance of `MwsNetworkConnectivityConfigArrayInput` via:
//
//	MwsNetworkConnectivityConfigArray{ MwsNetworkConnectivityConfigArgs{...} }
type MwsNetworkConnectivityConfigArrayInput interface {
	pulumi.Input

	ToMwsNetworkConnectivityConfigArrayOutput() MwsNetworkConnectivityConfigArrayOutput
	ToMwsNetworkConnectivityConfigArrayOutputWithContext(context.Context) MwsNetworkConnectivityConfigArrayOutput
}

type MwsNetworkConnectivityConfigArray []MwsNetworkConnectivityConfigInput

func (MwsNetworkConnectivityConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MwsNetworkConnectivityConfig)(nil)).Elem()
}

func (i MwsNetworkConnectivityConfigArray) ToMwsNetworkConnectivityConfigArrayOutput() MwsNetworkConnectivityConfigArrayOutput {
	return i.ToMwsNetworkConnectivityConfigArrayOutputWithContext(context.Background())
}

func (i MwsNetworkConnectivityConfigArray) ToMwsNetworkConnectivityConfigArrayOutputWithContext(ctx context.Context) MwsNetworkConnectivityConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsNetworkConnectivityConfigArrayOutput)
}

// MwsNetworkConnectivityConfigMapInput is an input type that accepts MwsNetworkConnectivityConfigMap and MwsNetworkConnectivityConfigMapOutput values.
// You can construct a concrete instance of `MwsNetworkConnectivityConfigMapInput` via:
//
//	MwsNetworkConnectivityConfigMap{ "key": MwsNetworkConnectivityConfigArgs{...} }
type MwsNetworkConnectivityConfigMapInput interface {
	pulumi.Input

	ToMwsNetworkConnectivityConfigMapOutput() MwsNetworkConnectivityConfigMapOutput
	ToMwsNetworkConnectivityConfigMapOutputWithContext(context.Context) MwsNetworkConnectivityConfigMapOutput
}

type MwsNetworkConnectivityConfigMap map[string]MwsNetworkConnectivityConfigInput

func (MwsNetworkConnectivityConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MwsNetworkConnectivityConfig)(nil)).Elem()
}

func (i MwsNetworkConnectivityConfigMap) ToMwsNetworkConnectivityConfigMapOutput() MwsNetworkConnectivityConfigMapOutput {
	return i.ToMwsNetworkConnectivityConfigMapOutputWithContext(context.Background())
}

func (i MwsNetworkConnectivityConfigMap) ToMwsNetworkConnectivityConfigMapOutputWithContext(ctx context.Context) MwsNetworkConnectivityConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsNetworkConnectivityConfigMapOutput)
}

type MwsNetworkConnectivityConfigOutput struct{ *pulumi.OutputState }

func (MwsNetworkConnectivityConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MwsNetworkConnectivityConfig)(nil)).Elem()
}

func (o MwsNetworkConnectivityConfigOutput) ToMwsNetworkConnectivityConfigOutput() MwsNetworkConnectivityConfigOutput {
	return o
}

func (o MwsNetworkConnectivityConfigOutput) ToMwsNetworkConnectivityConfigOutputWithContext(ctx context.Context) MwsNetworkConnectivityConfigOutput {
	return o
}

func (o MwsNetworkConnectivityConfigOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsNetworkConnectivityConfig) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

func (o MwsNetworkConnectivityConfigOutput) CreationTime() pulumi.IntOutput {
	return o.ApplyT(func(v *MwsNetworkConnectivityConfig) pulumi.IntOutput { return v.CreationTime }).(pulumi.IntOutput)
}

func (o MwsNetworkConnectivityConfigOutput) EgressConfig() MwsNetworkConnectivityConfigEgressConfigOutput {
	return o.ApplyT(func(v *MwsNetworkConnectivityConfig) MwsNetworkConnectivityConfigEgressConfigOutput {
		return v.EgressConfig
	}).(MwsNetworkConnectivityConfigEgressConfigOutput)
}

// Name of Network Connectivity Config in Databricks Account. Change forces creation of a new resource.
func (o MwsNetworkConnectivityConfigOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsNetworkConnectivityConfig) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Canonical unique identifier of Network Connectivity Config in Databricks Account
func (o MwsNetworkConnectivityConfigOutput) NetworkConnectivityConfigId() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsNetworkConnectivityConfig) pulumi.StringOutput { return v.NetworkConnectivityConfigId }).(pulumi.StringOutput)
}

// Region of the Network Connectivity Config. NCCs can only be referenced by your workspaces in the same region. Change forces creation of a new resource.
func (o MwsNetworkConnectivityConfigOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsNetworkConnectivityConfig) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

func (o MwsNetworkConnectivityConfigOutput) UpdatedTime() pulumi.IntOutput {
	return o.ApplyT(func(v *MwsNetworkConnectivityConfig) pulumi.IntOutput { return v.UpdatedTime }).(pulumi.IntOutput)
}

type MwsNetworkConnectivityConfigArrayOutput struct{ *pulumi.OutputState }

func (MwsNetworkConnectivityConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MwsNetworkConnectivityConfig)(nil)).Elem()
}

func (o MwsNetworkConnectivityConfigArrayOutput) ToMwsNetworkConnectivityConfigArrayOutput() MwsNetworkConnectivityConfigArrayOutput {
	return o
}

func (o MwsNetworkConnectivityConfigArrayOutput) ToMwsNetworkConnectivityConfigArrayOutputWithContext(ctx context.Context) MwsNetworkConnectivityConfigArrayOutput {
	return o
}

func (o MwsNetworkConnectivityConfigArrayOutput) Index(i pulumi.IntInput) MwsNetworkConnectivityConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MwsNetworkConnectivityConfig {
		return vs[0].([]*MwsNetworkConnectivityConfig)[vs[1].(int)]
	}).(MwsNetworkConnectivityConfigOutput)
}

type MwsNetworkConnectivityConfigMapOutput struct{ *pulumi.OutputState }

func (MwsNetworkConnectivityConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MwsNetworkConnectivityConfig)(nil)).Elem()
}

func (o MwsNetworkConnectivityConfigMapOutput) ToMwsNetworkConnectivityConfigMapOutput() MwsNetworkConnectivityConfigMapOutput {
	return o
}

func (o MwsNetworkConnectivityConfigMapOutput) ToMwsNetworkConnectivityConfigMapOutputWithContext(ctx context.Context) MwsNetworkConnectivityConfigMapOutput {
	return o
}

func (o MwsNetworkConnectivityConfigMapOutput) MapIndex(k pulumi.StringInput) MwsNetworkConnectivityConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MwsNetworkConnectivityConfig {
		return vs[0].(map[string]*MwsNetworkConnectivityConfig)[vs[1].(string)]
	}).(MwsNetworkConnectivityConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MwsNetworkConnectivityConfigInput)(nil)).Elem(), &MwsNetworkConnectivityConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*MwsNetworkConnectivityConfigArrayInput)(nil)).Elem(), MwsNetworkConnectivityConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MwsNetworkConnectivityConfigMapInput)(nil)).Elem(), MwsNetworkConnectivityConfigMap{})
	pulumi.RegisterOutputType(MwsNetworkConnectivityConfigOutput{})
	pulumi.RegisterOutputType(MwsNetworkConnectivityConfigArrayOutput{})
	pulumi.RegisterOutputType(MwsNetworkConnectivityConfigMapOutput{})
}
