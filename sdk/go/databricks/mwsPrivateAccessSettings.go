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

// Allows you to create a Private Access Setting resource that can be used as part of a MwsWorkspaces resource to create a [Databricks Workspace that leverages AWS PrivateLink](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html) or [GCP Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html)
//
// It is strongly recommended that customers read the [Enable AWS Private Link](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html) [Enable GCP Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html) documentation before trying to leverage this resource.
//
// ## Databricks on AWS usage
//
// > **Note** Initialize provider with `alias = "mws"`, `host  = "https://accounts.cloud.databricks.com"` and use `provider = databricks.mws`
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
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := databricks.NewMwsPrivateAccessSettings(ctx, "pas", &databricks.MwsPrivateAccessSettingsArgs{
//				AccountId:                 pulumi.Any(databricksAccountId),
//				PrivateAccessSettingsName: pulumi.String(fmt.Sprintf("Private Access Settings for %v", prefix)),
//				Region:                    pulumi.Any(region),
//				PublicAccessEnabled:       pulumi.Bool(true),
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
// The `databricks_mws_private_access_settings.pas.private_access_settings_id` can then be used as part of a MwsWorkspaces resource:
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
//			_, err := databricks.NewMwsWorkspaces(ctx, "this", &databricks.MwsWorkspacesArgs{
//				AwsRegion:               pulumi.Any(region),
//				WorkspaceName:           pulumi.Any(prefix),
//				CredentialsId:           pulumi.Any(thisDatabricksMwsCredentials.CredentialsId),
//				StorageConfigurationId:  pulumi.Any(thisDatabricksMwsStorageConfigurations.StorageConfigurationId),
//				NetworkId:               pulumi.Any(thisDatabricksMwsNetworks.NetworkId),
//				PrivateAccessSettingsId: pulumi.Any(pas.PrivateAccessSettingsId),
//				PricingTier:             pulumi.String("ENTERPRISE"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				thisDatabricksMwsNetworks,
//			}))
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
// ## Databricks on GCP usage
//
// > **Note** Initialize provider with `alias = "mws"`, `host  = "https://accounts.gcp.databricks.com"` and use `provider = databricks.mws`
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
//			_, err := databricks.NewMwsWorkspaces(ctx, "this", &databricks.MwsWorkspacesArgs{
//				WorkspaceName: pulumi.String("gcp-workspace"),
//				Location:      pulumi.Any(subnetRegion),
//				CloudResourceContainer: &databricks.MwsWorkspacesCloudResourceContainerArgs{
//					Gcp: &databricks.MwsWorkspacesCloudResourceContainerGcpArgs{
//						ProjectId: pulumi.Any(googleProject),
//					},
//				},
//				GkeConfig: &databricks.MwsWorkspacesGkeConfigArgs{
//					ConnectivityType: pulumi.String("PRIVATE_NODE_PUBLIC_MASTER"),
//					MasterIpRange:    pulumi.String("10.3.0.0/28"),
//				},
//				NetworkId:               pulumi.Any(thisDatabricksMwsNetworks.NetworkId),
//				PrivateAccessSettingsId: pulumi.Any(pas.PrivateAccessSettingsId),
//				PricingTier:             pulumi.String("PREMIUM"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				thisDatabricksMwsNetworks,
//			}))
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
// ## Related Resources
//
// The following resources are used in the same context:
//
// * Provisioning Databricks on AWS guide.
// * Provisioning Databricks on AWS with PrivateLink guide.
// * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide.
// * Provisioning Databricks workspaces on GCP with Private Service Connect guide.
// * MwsVpcEndpoint resources with Databricks such that they can be used as part of a MwsNetworks configuration.
// * MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS.
// * MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
//
// ## Import
//
// -> **Note** Importing this resource is not currently supported.
type MwsPrivateAccessSettings struct {
	pulumi.CustomResourceState

	// Deprecated: Configuring `accountId` at the resource-level is deprecated; please specify it in the `provider {}` configuration block instead
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// An array of MwsVpcEndpoint `vpcEndpointId` (not `id`). Only used when `privateAccessLevel` is set to `ENDPOINT`. This is an allow list of MwsVpcEndpoint that in your account that can connect to your MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `publicAccessEnabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
	AllowedVpcEndpointIds pulumi.StringArrayOutput `pulumi:"allowedVpcEndpointIds"`
	// The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified MwsVpcEndpoint connect to your workspace. Please see the `allowedVpcEndpointIds` documentation for more details.
	PrivateAccessLevel pulumi.StringPtrOutput `pulumi:"privateAccessLevel"`
	// Canonical unique identifier of Private Access Settings in Databricks Account
	PrivateAccessSettingsId pulumi.StringOutput `pulumi:"privateAccessSettingsId"`
	// Name of Private Access Settings in Databricks Account
	PrivateAccessSettingsName pulumi.StringOutput `pulumi:"privateAccessSettingsName"`
	// If `true`, the MwsWorkspaces can be accessed over the MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false`, the workspace can be accessed only over VPC endpoints, and not over the public network. Once explicitly set, this field becomes mandatory.
	PublicAccessEnabled pulumi.BoolPtrOutput `pulumi:"publicAccessEnabled"`
	// Region of AWS VPC or the Google Cloud VPC network
	Region pulumi.StringOutput `pulumi:"region"`
}

// NewMwsPrivateAccessSettings registers a new resource with the given unique name, arguments, and options.
func NewMwsPrivateAccessSettings(ctx *pulumi.Context,
	name string, args *MwsPrivateAccessSettingsArgs, opts ...pulumi.ResourceOption) (*MwsPrivateAccessSettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PrivateAccessSettingsName == nil {
		return nil, errors.New("invalid value for required argument 'PrivateAccessSettingsName'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MwsPrivateAccessSettings
	err := ctx.RegisterResource("databricks:index/mwsPrivateAccessSettings:MwsPrivateAccessSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMwsPrivateAccessSettings gets an existing MwsPrivateAccessSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMwsPrivateAccessSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MwsPrivateAccessSettingsState, opts ...pulumi.ResourceOption) (*MwsPrivateAccessSettings, error) {
	var resource MwsPrivateAccessSettings
	err := ctx.ReadResource("databricks:index/mwsPrivateAccessSettings:MwsPrivateAccessSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MwsPrivateAccessSettings resources.
type mwsPrivateAccessSettingsState struct {
	// Deprecated: Configuring `accountId` at the resource-level is deprecated; please specify it in the `provider {}` configuration block instead
	AccountId *string `pulumi:"accountId"`
	// An array of MwsVpcEndpoint `vpcEndpointId` (not `id`). Only used when `privateAccessLevel` is set to `ENDPOINT`. This is an allow list of MwsVpcEndpoint that in your account that can connect to your MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `publicAccessEnabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
	AllowedVpcEndpointIds []string `pulumi:"allowedVpcEndpointIds"`
	// The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified MwsVpcEndpoint connect to your workspace. Please see the `allowedVpcEndpointIds` documentation for more details.
	PrivateAccessLevel *string `pulumi:"privateAccessLevel"`
	// Canonical unique identifier of Private Access Settings in Databricks Account
	PrivateAccessSettingsId *string `pulumi:"privateAccessSettingsId"`
	// Name of Private Access Settings in Databricks Account
	PrivateAccessSettingsName *string `pulumi:"privateAccessSettingsName"`
	// If `true`, the MwsWorkspaces can be accessed over the MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false`, the workspace can be accessed only over VPC endpoints, and not over the public network. Once explicitly set, this field becomes mandatory.
	PublicAccessEnabled *bool `pulumi:"publicAccessEnabled"`
	// Region of AWS VPC or the Google Cloud VPC network
	Region *string `pulumi:"region"`
}

type MwsPrivateAccessSettingsState struct {
	// Deprecated: Configuring `accountId` at the resource-level is deprecated; please specify it in the `provider {}` configuration block instead
	AccountId pulumi.StringPtrInput
	// An array of MwsVpcEndpoint `vpcEndpointId` (not `id`). Only used when `privateAccessLevel` is set to `ENDPOINT`. This is an allow list of MwsVpcEndpoint that in your account that can connect to your MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `publicAccessEnabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
	AllowedVpcEndpointIds pulumi.StringArrayInput
	// The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified MwsVpcEndpoint connect to your workspace. Please see the `allowedVpcEndpointIds` documentation for more details.
	PrivateAccessLevel pulumi.StringPtrInput
	// Canonical unique identifier of Private Access Settings in Databricks Account
	PrivateAccessSettingsId pulumi.StringPtrInput
	// Name of Private Access Settings in Databricks Account
	PrivateAccessSettingsName pulumi.StringPtrInput
	// If `true`, the MwsWorkspaces can be accessed over the MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false`, the workspace can be accessed only over VPC endpoints, and not over the public network. Once explicitly set, this field becomes mandatory.
	PublicAccessEnabled pulumi.BoolPtrInput
	// Region of AWS VPC or the Google Cloud VPC network
	Region pulumi.StringPtrInput
}

func (MwsPrivateAccessSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*mwsPrivateAccessSettingsState)(nil)).Elem()
}

type mwsPrivateAccessSettingsArgs struct {
	// Deprecated: Configuring `accountId` at the resource-level is deprecated; please specify it in the `provider {}` configuration block instead
	AccountId *string `pulumi:"accountId"`
	// An array of MwsVpcEndpoint `vpcEndpointId` (not `id`). Only used when `privateAccessLevel` is set to `ENDPOINT`. This is an allow list of MwsVpcEndpoint that in your account that can connect to your MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `publicAccessEnabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
	AllowedVpcEndpointIds []string `pulumi:"allowedVpcEndpointIds"`
	// The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified MwsVpcEndpoint connect to your workspace. Please see the `allowedVpcEndpointIds` documentation for more details.
	PrivateAccessLevel *string `pulumi:"privateAccessLevel"`
	// Canonical unique identifier of Private Access Settings in Databricks Account
	PrivateAccessSettingsId *string `pulumi:"privateAccessSettingsId"`
	// Name of Private Access Settings in Databricks Account
	PrivateAccessSettingsName string `pulumi:"privateAccessSettingsName"`
	// If `true`, the MwsWorkspaces can be accessed over the MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false`, the workspace can be accessed only over VPC endpoints, and not over the public network. Once explicitly set, this field becomes mandatory.
	PublicAccessEnabled *bool `pulumi:"publicAccessEnabled"`
	// Region of AWS VPC or the Google Cloud VPC network
	Region string `pulumi:"region"`
}

// The set of arguments for constructing a MwsPrivateAccessSettings resource.
type MwsPrivateAccessSettingsArgs struct {
	// Deprecated: Configuring `accountId` at the resource-level is deprecated; please specify it in the `provider {}` configuration block instead
	AccountId pulumi.StringPtrInput
	// An array of MwsVpcEndpoint `vpcEndpointId` (not `id`). Only used when `privateAccessLevel` is set to `ENDPOINT`. This is an allow list of MwsVpcEndpoint that in your account that can connect to your MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `publicAccessEnabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
	AllowedVpcEndpointIds pulumi.StringArrayInput
	// The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified MwsVpcEndpoint connect to your workspace. Please see the `allowedVpcEndpointIds` documentation for more details.
	PrivateAccessLevel pulumi.StringPtrInput
	// Canonical unique identifier of Private Access Settings in Databricks Account
	PrivateAccessSettingsId pulumi.StringPtrInput
	// Name of Private Access Settings in Databricks Account
	PrivateAccessSettingsName pulumi.StringInput
	// If `true`, the MwsWorkspaces can be accessed over the MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false`, the workspace can be accessed only over VPC endpoints, and not over the public network. Once explicitly set, this field becomes mandatory.
	PublicAccessEnabled pulumi.BoolPtrInput
	// Region of AWS VPC or the Google Cloud VPC network
	Region pulumi.StringInput
}

func (MwsPrivateAccessSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mwsPrivateAccessSettingsArgs)(nil)).Elem()
}

type MwsPrivateAccessSettingsInput interface {
	pulumi.Input

	ToMwsPrivateAccessSettingsOutput() MwsPrivateAccessSettingsOutput
	ToMwsPrivateAccessSettingsOutputWithContext(ctx context.Context) MwsPrivateAccessSettingsOutput
}

func (*MwsPrivateAccessSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**MwsPrivateAccessSettings)(nil)).Elem()
}

func (i *MwsPrivateAccessSettings) ToMwsPrivateAccessSettingsOutput() MwsPrivateAccessSettingsOutput {
	return i.ToMwsPrivateAccessSettingsOutputWithContext(context.Background())
}

func (i *MwsPrivateAccessSettings) ToMwsPrivateAccessSettingsOutputWithContext(ctx context.Context) MwsPrivateAccessSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsPrivateAccessSettingsOutput)
}

// MwsPrivateAccessSettingsArrayInput is an input type that accepts MwsPrivateAccessSettingsArray and MwsPrivateAccessSettingsArrayOutput values.
// You can construct a concrete instance of `MwsPrivateAccessSettingsArrayInput` via:
//
//	MwsPrivateAccessSettingsArray{ MwsPrivateAccessSettingsArgs{...} }
type MwsPrivateAccessSettingsArrayInput interface {
	pulumi.Input

	ToMwsPrivateAccessSettingsArrayOutput() MwsPrivateAccessSettingsArrayOutput
	ToMwsPrivateAccessSettingsArrayOutputWithContext(context.Context) MwsPrivateAccessSettingsArrayOutput
}

type MwsPrivateAccessSettingsArray []MwsPrivateAccessSettingsInput

func (MwsPrivateAccessSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MwsPrivateAccessSettings)(nil)).Elem()
}

func (i MwsPrivateAccessSettingsArray) ToMwsPrivateAccessSettingsArrayOutput() MwsPrivateAccessSettingsArrayOutput {
	return i.ToMwsPrivateAccessSettingsArrayOutputWithContext(context.Background())
}

func (i MwsPrivateAccessSettingsArray) ToMwsPrivateAccessSettingsArrayOutputWithContext(ctx context.Context) MwsPrivateAccessSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsPrivateAccessSettingsArrayOutput)
}

// MwsPrivateAccessSettingsMapInput is an input type that accepts MwsPrivateAccessSettingsMap and MwsPrivateAccessSettingsMapOutput values.
// You can construct a concrete instance of `MwsPrivateAccessSettingsMapInput` via:
//
//	MwsPrivateAccessSettingsMap{ "key": MwsPrivateAccessSettingsArgs{...} }
type MwsPrivateAccessSettingsMapInput interface {
	pulumi.Input

	ToMwsPrivateAccessSettingsMapOutput() MwsPrivateAccessSettingsMapOutput
	ToMwsPrivateAccessSettingsMapOutputWithContext(context.Context) MwsPrivateAccessSettingsMapOutput
}

type MwsPrivateAccessSettingsMap map[string]MwsPrivateAccessSettingsInput

func (MwsPrivateAccessSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MwsPrivateAccessSettings)(nil)).Elem()
}

func (i MwsPrivateAccessSettingsMap) ToMwsPrivateAccessSettingsMapOutput() MwsPrivateAccessSettingsMapOutput {
	return i.ToMwsPrivateAccessSettingsMapOutputWithContext(context.Background())
}

func (i MwsPrivateAccessSettingsMap) ToMwsPrivateAccessSettingsMapOutputWithContext(ctx context.Context) MwsPrivateAccessSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsPrivateAccessSettingsMapOutput)
}

type MwsPrivateAccessSettingsOutput struct{ *pulumi.OutputState }

func (MwsPrivateAccessSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MwsPrivateAccessSettings)(nil)).Elem()
}

func (o MwsPrivateAccessSettingsOutput) ToMwsPrivateAccessSettingsOutput() MwsPrivateAccessSettingsOutput {
	return o
}

func (o MwsPrivateAccessSettingsOutput) ToMwsPrivateAccessSettingsOutputWithContext(ctx context.Context) MwsPrivateAccessSettingsOutput {
	return o
}

// Deprecated: Configuring `accountId` at the resource-level is deprecated; please specify it in the `provider {}` configuration block instead
func (o MwsPrivateAccessSettingsOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsPrivateAccessSettings) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// An array of MwsVpcEndpoint `vpcEndpointId` (not `id`). Only used when `privateAccessLevel` is set to `ENDPOINT`. This is an allow list of MwsVpcEndpoint that in your account that can connect to your MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `publicAccessEnabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
func (o MwsPrivateAccessSettingsOutput) AllowedVpcEndpointIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MwsPrivateAccessSettings) pulumi.StringArrayOutput { return v.AllowedVpcEndpointIds }).(pulumi.StringArrayOutput)
}

// The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified MwsVpcEndpoint connect to your workspace. Please see the `allowedVpcEndpointIds` documentation for more details.
func (o MwsPrivateAccessSettingsOutput) PrivateAccessLevel() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MwsPrivateAccessSettings) pulumi.StringPtrOutput { return v.PrivateAccessLevel }).(pulumi.StringPtrOutput)
}

// Canonical unique identifier of Private Access Settings in Databricks Account
func (o MwsPrivateAccessSettingsOutput) PrivateAccessSettingsId() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsPrivateAccessSettings) pulumi.StringOutput { return v.PrivateAccessSettingsId }).(pulumi.StringOutput)
}

// Name of Private Access Settings in Databricks Account
func (o MwsPrivateAccessSettingsOutput) PrivateAccessSettingsName() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsPrivateAccessSettings) pulumi.StringOutput { return v.PrivateAccessSettingsName }).(pulumi.StringOutput)
}

// If `true`, the MwsWorkspaces can be accessed over the MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false`, the workspace can be accessed only over VPC endpoints, and not over the public network. Once explicitly set, this field becomes mandatory.
func (o MwsPrivateAccessSettingsOutput) PublicAccessEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MwsPrivateAccessSettings) pulumi.BoolPtrOutput { return v.PublicAccessEnabled }).(pulumi.BoolPtrOutput)
}

// Region of AWS VPC or the Google Cloud VPC network
func (o MwsPrivateAccessSettingsOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsPrivateAccessSettings) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

type MwsPrivateAccessSettingsArrayOutput struct{ *pulumi.OutputState }

func (MwsPrivateAccessSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MwsPrivateAccessSettings)(nil)).Elem()
}

func (o MwsPrivateAccessSettingsArrayOutput) ToMwsPrivateAccessSettingsArrayOutput() MwsPrivateAccessSettingsArrayOutput {
	return o
}

func (o MwsPrivateAccessSettingsArrayOutput) ToMwsPrivateAccessSettingsArrayOutputWithContext(ctx context.Context) MwsPrivateAccessSettingsArrayOutput {
	return o
}

func (o MwsPrivateAccessSettingsArrayOutput) Index(i pulumi.IntInput) MwsPrivateAccessSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MwsPrivateAccessSettings {
		return vs[0].([]*MwsPrivateAccessSettings)[vs[1].(int)]
	}).(MwsPrivateAccessSettingsOutput)
}

type MwsPrivateAccessSettingsMapOutput struct{ *pulumi.OutputState }

func (MwsPrivateAccessSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MwsPrivateAccessSettings)(nil)).Elem()
}

func (o MwsPrivateAccessSettingsMapOutput) ToMwsPrivateAccessSettingsMapOutput() MwsPrivateAccessSettingsMapOutput {
	return o
}

func (o MwsPrivateAccessSettingsMapOutput) ToMwsPrivateAccessSettingsMapOutputWithContext(ctx context.Context) MwsPrivateAccessSettingsMapOutput {
	return o
}

func (o MwsPrivateAccessSettingsMapOutput) MapIndex(k pulumi.StringInput) MwsPrivateAccessSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MwsPrivateAccessSettings {
		return vs[0].(map[string]*MwsPrivateAccessSettings)[vs[1].(string)]
	}).(MwsPrivateAccessSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MwsPrivateAccessSettingsInput)(nil)).Elem(), &MwsPrivateAccessSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*MwsPrivateAccessSettingsArrayInput)(nil)).Elem(), MwsPrivateAccessSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MwsPrivateAccessSettingsMapInput)(nil)).Elem(), MwsPrivateAccessSettingsMap{})
	pulumi.RegisterOutputType(MwsPrivateAccessSettingsOutput{})
	pulumi.RegisterOutputType(MwsPrivateAccessSettingsArrayOutput{})
	pulumi.RegisterOutputType(MwsPrivateAccessSettingsMapOutput{})
}
