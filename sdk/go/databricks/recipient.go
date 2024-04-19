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

// > **Note** This resource could be only used with workspace-level provider!
//
// In Delta Sharing, a recipient is an entity that receives shares from a provider. In Unity Catalog, a share is a securable object that represents an organization and associates it with a credential or secure sharing identifier that allows that organization to access one or more shares.
//
// As a data provider (sharer), you can define multiple recipients for any given Unity Catalog metastore, but if you want to share data from multiple metastores with a particular user or group of users, you must define the recipient separately for each metastore. A recipient can have access to multiple shares.
//
// A `Recipient` is contained within Metastore and can have permissions to `SELECT` from a list of shares.
//
// ## Example Usage
//
// ### Databricks Sharing with non databricks recipient
//
// Setting `authenticationType` type to `TOKEN` creates a temporary url to download a credentials file. This is used to
// authenticate to the sharing server to access data. This is for when the recipient is not using Databricks.
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
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			db2opensharecode, err := random.NewPassword(ctx, "db2opensharecode", &random.PasswordArgs{
//				Length:  16,
//				Special: true,
//			})
//			if err != nil {
//				return err
//			}
//			current, err := databricks.GetCurrentUser(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewRecipient(ctx, "db2open", &databricks.RecipientArgs{
//				Name:               pulumi.String(fmt.Sprintf("%v-recipient", current.Alphanumeric)),
//				Comment:            pulumi.String("made by terraform"),
//				AuthenticationType: pulumi.String("TOKEN"),
//				SharingCode:        db2opensharecode.Result,
//				IpAccessList: &databricks.RecipientIpAccessListArgs{
//					AllowedIpAddresses: pulumi.StringArray{},
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
type Recipient struct {
	pulumi.CustomResourceState

	Activated pulumi.BoolOutput `pulumi:"activated"`
	// Full activation URL to retrieve the access token. It will be empty if the token is already retrieved.
	ActivationUrl pulumi.StringOutput `pulumi:"activationUrl"`
	// The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
	AuthenticationType pulumi.StringOutput `pulumi:"authenticationType"`
	// Cloud vendor of the recipient's Unity Catalog Metstore. This field is only present when the authenticationType is `DATABRICKS`.
	Cloud pulumi.StringOutput `pulumi:"cloud"`
	// Description about the recipient.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Time at which this recipient was created, in epoch milliseconds.
	CreatedAt pulumi.IntOutput `pulumi:"createdAt"`
	// Username of recipient creator.
	CreatedBy pulumi.StringOutput `pulumi:"createdBy"`
	// Required when `authenticationType` is `DATABRICKS`.
	DataRecipientGlobalMetastoreId pulumi.StringPtrOutput `pulumi:"dataRecipientGlobalMetastoreId"`
	// Recipient IP access list.
	IpAccessList RecipientIpAccessListPtrOutput `pulumi:"ipAccessList"`
	// Unique identifier of recipient's Unity Catalog metastore. This field is only present when the authenticationType is `DATABRICKS`.
	MetastoreId pulumi.StringOutput `pulumi:"metastoreId"`
	// Name of recipient. Change forces creation of a new resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Username/groupname/sp applicationId of the recipient owner.
	Owner pulumi.StringPtrOutput `pulumi:"owner"`
	// Recipient properties - object consisting of following fields:
	PropertiesKvpairs RecipientPropertiesKvpairsPtrOutput `pulumi:"propertiesKvpairs"`
	// Cloud region of the recipient's Unity Catalog Metstore. This field is only present when the authenticationType is `DATABRICKS`.
	Region pulumi.StringOutput `pulumi:"region"`
	// The one-time sharing code provided by the data recipient.
	SharingCode pulumi.StringPtrOutput `pulumi:"sharingCode"`
	// List of Recipient Tokens. This field is only present when the authenticationType is TOKEN. Each list element is an object with following attributes:
	Tokens RecipientTokenArrayOutput `pulumi:"tokens"`
	// Time at which this recipient was updated, in epoch milliseconds.
	UpdatedAt pulumi.IntOutput `pulumi:"updatedAt"`
	// Username of recipient Token updater.
	UpdatedBy pulumi.StringOutput `pulumi:"updatedBy"`
}

// NewRecipient registers a new resource with the given unique name, arguments, and options.
func NewRecipient(ctx *pulumi.Context,
	name string, args *RecipientArgs, opts ...pulumi.ResourceOption) (*Recipient, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AuthenticationType == nil {
		return nil, errors.New("invalid value for required argument 'AuthenticationType'")
	}
	if args.SharingCode != nil {
		args.SharingCode = pulumi.ToSecret(args.SharingCode).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"sharingCode",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Recipient
	err := ctx.RegisterResource("databricks:index/recipient:Recipient", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRecipient gets an existing Recipient resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRecipient(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RecipientState, opts ...pulumi.ResourceOption) (*Recipient, error) {
	var resource Recipient
	err := ctx.ReadResource("databricks:index/recipient:Recipient", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Recipient resources.
type recipientState struct {
	Activated *bool `pulumi:"activated"`
	// Full activation URL to retrieve the access token. It will be empty if the token is already retrieved.
	ActivationUrl *string `pulumi:"activationUrl"`
	// The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
	AuthenticationType *string `pulumi:"authenticationType"`
	// Cloud vendor of the recipient's Unity Catalog Metstore. This field is only present when the authenticationType is `DATABRICKS`.
	Cloud *string `pulumi:"cloud"`
	// Description about the recipient.
	Comment *string `pulumi:"comment"`
	// Time at which this recipient was created, in epoch milliseconds.
	CreatedAt *int `pulumi:"createdAt"`
	// Username of recipient creator.
	CreatedBy *string `pulumi:"createdBy"`
	// Required when `authenticationType` is `DATABRICKS`.
	DataRecipientGlobalMetastoreId *string `pulumi:"dataRecipientGlobalMetastoreId"`
	// Recipient IP access list.
	IpAccessList *RecipientIpAccessList `pulumi:"ipAccessList"`
	// Unique identifier of recipient's Unity Catalog metastore. This field is only present when the authenticationType is `DATABRICKS`.
	MetastoreId *string `pulumi:"metastoreId"`
	// Name of recipient. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Username/groupname/sp applicationId of the recipient owner.
	Owner *string `pulumi:"owner"`
	// Recipient properties - object consisting of following fields:
	PropertiesKvpairs *RecipientPropertiesKvpairs `pulumi:"propertiesKvpairs"`
	// Cloud region of the recipient's Unity Catalog Metstore. This field is only present when the authenticationType is `DATABRICKS`.
	Region *string `pulumi:"region"`
	// The one-time sharing code provided by the data recipient.
	SharingCode *string `pulumi:"sharingCode"`
	// List of Recipient Tokens. This field is only present when the authenticationType is TOKEN. Each list element is an object with following attributes:
	Tokens []RecipientToken `pulumi:"tokens"`
	// Time at which this recipient was updated, in epoch milliseconds.
	UpdatedAt *int `pulumi:"updatedAt"`
	// Username of recipient Token updater.
	UpdatedBy *string `pulumi:"updatedBy"`
}

type RecipientState struct {
	Activated pulumi.BoolPtrInput
	// Full activation URL to retrieve the access token. It will be empty if the token is already retrieved.
	ActivationUrl pulumi.StringPtrInput
	// The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
	AuthenticationType pulumi.StringPtrInput
	// Cloud vendor of the recipient's Unity Catalog Metstore. This field is only present when the authenticationType is `DATABRICKS`.
	Cloud pulumi.StringPtrInput
	// Description about the recipient.
	Comment pulumi.StringPtrInput
	// Time at which this recipient was created, in epoch milliseconds.
	CreatedAt pulumi.IntPtrInput
	// Username of recipient creator.
	CreatedBy pulumi.StringPtrInput
	// Required when `authenticationType` is `DATABRICKS`.
	DataRecipientGlobalMetastoreId pulumi.StringPtrInput
	// Recipient IP access list.
	IpAccessList RecipientIpAccessListPtrInput
	// Unique identifier of recipient's Unity Catalog metastore. This field is only present when the authenticationType is `DATABRICKS`.
	MetastoreId pulumi.StringPtrInput
	// Name of recipient. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Username/groupname/sp applicationId of the recipient owner.
	Owner pulumi.StringPtrInput
	// Recipient properties - object consisting of following fields:
	PropertiesKvpairs RecipientPropertiesKvpairsPtrInput
	// Cloud region of the recipient's Unity Catalog Metstore. This field is only present when the authenticationType is `DATABRICKS`.
	Region pulumi.StringPtrInput
	// The one-time sharing code provided by the data recipient.
	SharingCode pulumi.StringPtrInput
	// List of Recipient Tokens. This field is only present when the authenticationType is TOKEN. Each list element is an object with following attributes:
	Tokens RecipientTokenArrayInput
	// Time at which this recipient was updated, in epoch milliseconds.
	UpdatedAt pulumi.IntPtrInput
	// Username of recipient Token updater.
	UpdatedBy pulumi.StringPtrInput
}

func (RecipientState) ElementType() reflect.Type {
	return reflect.TypeOf((*recipientState)(nil)).Elem()
}

type recipientArgs struct {
	// The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
	AuthenticationType string `pulumi:"authenticationType"`
	// Description about the recipient.
	Comment *string `pulumi:"comment"`
	// Required when `authenticationType` is `DATABRICKS`.
	DataRecipientGlobalMetastoreId *string `pulumi:"dataRecipientGlobalMetastoreId"`
	// Recipient IP access list.
	IpAccessList *RecipientIpAccessList `pulumi:"ipAccessList"`
	// Name of recipient. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Username/groupname/sp applicationId of the recipient owner.
	Owner *string `pulumi:"owner"`
	// Recipient properties - object consisting of following fields:
	PropertiesKvpairs *RecipientPropertiesKvpairs `pulumi:"propertiesKvpairs"`
	// The one-time sharing code provided by the data recipient.
	SharingCode *string `pulumi:"sharingCode"`
	// List of Recipient Tokens. This field is only present when the authenticationType is TOKEN. Each list element is an object with following attributes:
	Tokens []RecipientToken `pulumi:"tokens"`
}

// The set of arguments for constructing a Recipient resource.
type RecipientArgs struct {
	// The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
	AuthenticationType pulumi.StringInput
	// Description about the recipient.
	Comment pulumi.StringPtrInput
	// Required when `authenticationType` is `DATABRICKS`.
	DataRecipientGlobalMetastoreId pulumi.StringPtrInput
	// Recipient IP access list.
	IpAccessList RecipientIpAccessListPtrInput
	// Name of recipient. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Username/groupname/sp applicationId of the recipient owner.
	Owner pulumi.StringPtrInput
	// Recipient properties - object consisting of following fields:
	PropertiesKvpairs RecipientPropertiesKvpairsPtrInput
	// The one-time sharing code provided by the data recipient.
	SharingCode pulumi.StringPtrInput
	// List of Recipient Tokens. This field is only present when the authenticationType is TOKEN. Each list element is an object with following attributes:
	Tokens RecipientTokenArrayInput
}

func (RecipientArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*recipientArgs)(nil)).Elem()
}

type RecipientInput interface {
	pulumi.Input

	ToRecipientOutput() RecipientOutput
	ToRecipientOutputWithContext(ctx context.Context) RecipientOutput
}

func (*Recipient) ElementType() reflect.Type {
	return reflect.TypeOf((**Recipient)(nil)).Elem()
}

func (i *Recipient) ToRecipientOutput() RecipientOutput {
	return i.ToRecipientOutputWithContext(context.Background())
}

func (i *Recipient) ToRecipientOutputWithContext(ctx context.Context) RecipientOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecipientOutput)
}

// RecipientArrayInput is an input type that accepts RecipientArray and RecipientArrayOutput values.
// You can construct a concrete instance of `RecipientArrayInput` via:
//
//	RecipientArray{ RecipientArgs{...} }
type RecipientArrayInput interface {
	pulumi.Input

	ToRecipientArrayOutput() RecipientArrayOutput
	ToRecipientArrayOutputWithContext(context.Context) RecipientArrayOutput
}

type RecipientArray []RecipientInput

func (RecipientArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Recipient)(nil)).Elem()
}

func (i RecipientArray) ToRecipientArrayOutput() RecipientArrayOutput {
	return i.ToRecipientArrayOutputWithContext(context.Background())
}

func (i RecipientArray) ToRecipientArrayOutputWithContext(ctx context.Context) RecipientArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecipientArrayOutput)
}

// RecipientMapInput is an input type that accepts RecipientMap and RecipientMapOutput values.
// You can construct a concrete instance of `RecipientMapInput` via:
//
//	RecipientMap{ "key": RecipientArgs{...} }
type RecipientMapInput interface {
	pulumi.Input

	ToRecipientMapOutput() RecipientMapOutput
	ToRecipientMapOutputWithContext(context.Context) RecipientMapOutput
}

type RecipientMap map[string]RecipientInput

func (RecipientMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Recipient)(nil)).Elem()
}

func (i RecipientMap) ToRecipientMapOutput() RecipientMapOutput {
	return i.ToRecipientMapOutputWithContext(context.Background())
}

func (i RecipientMap) ToRecipientMapOutputWithContext(ctx context.Context) RecipientMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecipientMapOutput)
}

type RecipientOutput struct{ *pulumi.OutputState }

func (RecipientOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Recipient)(nil)).Elem()
}

func (o RecipientOutput) ToRecipientOutput() RecipientOutput {
	return o
}

func (o RecipientOutput) ToRecipientOutputWithContext(ctx context.Context) RecipientOutput {
	return o
}

func (o RecipientOutput) Activated() pulumi.BoolOutput {
	return o.ApplyT(func(v *Recipient) pulumi.BoolOutput { return v.Activated }).(pulumi.BoolOutput)
}

// Full activation URL to retrieve the access token. It will be empty if the token is already retrieved.
func (o RecipientOutput) ActivationUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Recipient) pulumi.StringOutput { return v.ActivationUrl }).(pulumi.StringOutput)
}

// The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
func (o RecipientOutput) AuthenticationType() pulumi.StringOutput {
	return o.ApplyT(func(v *Recipient) pulumi.StringOutput { return v.AuthenticationType }).(pulumi.StringOutput)
}

// Cloud vendor of the recipient's Unity Catalog Metstore. This field is only present when the authenticationType is `DATABRICKS`.
func (o RecipientOutput) Cloud() pulumi.StringOutput {
	return o.ApplyT(func(v *Recipient) pulumi.StringOutput { return v.Cloud }).(pulumi.StringOutput)
}

// Description about the recipient.
func (o RecipientOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Recipient) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Time at which this recipient was created, in epoch milliseconds.
func (o RecipientOutput) CreatedAt() pulumi.IntOutput {
	return o.ApplyT(func(v *Recipient) pulumi.IntOutput { return v.CreatedAt }).(pulumi.IntOutput)
}

// Username of recipient creator.
func (o RecipientOutput) CreatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v *Recipient) pulumi.StringOutput { return v.CreatedBy }).(pulumi.StringOutput)
}

// Required when `authenticationType` is `DATABRICKS`.
func (o RecipientOutput) DataRecipientGlobalMetastoreId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Recipient) pulumi.StringPtrOutput { return v.DataRecipientGlobalMetastoreId }).(pulumi.StringPtrOutput)
}

// Recipient IP access list.
func (o RecipientOutput) IpAccessList() RecipientIpAccessListPtrOutput {
	return o.ApplyT(func(v *Recipient) RecipientIpAccessListPtrOutput { return v.IpAccessList }).(RecipientIpAccessListPtrOutput)
}

// Unique identifier of recipient's Unity Catalog metastore. This field is only present when the authenticationType is `DATABRICKS`.
func (o RecipientOutput) MetastoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *Recipient) pulumi.StringOutput { return v.MetastoreId }).(pulumi.StringOutput)
}

// Name of recipient. Change forces creation of a new resource.
func (o RecipientOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Recipient) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Username/groupname/sp applicationId of the recipient owner.
func (o RecipientOutput) Owner() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Recipient) pulumi.StringPtrOutput { return v.Owner }).(pulumi.StringPtrOutput)
}

// Recipient properties - object consisting of following fields:
func (o RecipientOutput) PropertiesKvpairs() RecipientPropertiesKvpairsPtrOutput {
	return o.ApplyT(func(v *Recipient) RecipientPropertiesKvpairsPtrOutput { return v.PropertiesKvpairs }).(RecipientPropertiesKvpairsPtrOutput)
}

// Cloud region of the recipient's Unity Catalog Metstore. This field is only present when the authenticationType is `DATABRICKS`.
func (o RecipientOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *Recipient) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The one-time sharing code provided by the data recipient.
func (o RecipientOutput) SharingCode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Recipient) pulumi.StringPtrOutput { return v.SharingCode }).(pulumi.StringPtrOutput)
}

// List of Recipient Tokens. This field is only present when the authenticationType is TOKEN. Each list element is an object with following attributes:
func (o RecipientOutput) Tokens() RecipientTokenArrayOutput {
	return o.ApplyT(func(v *Recipient) RecipientTokenArrayOutput { return v.Tokens }).(RecipientTokenArrayOutput)
}

// Time at which this recipient was updated, in epoch milliseconds.
func (o RecipientOutput) UpdatedAt() pulumi.IntOutput {
	return o.ApplyT(func(v *Recipient) pulumi.IntOutput { return v.UpdatedAt }).(pulumi.IntOutput)
}

// Username of recipient Token updater.
func (o RecipientOutput) UpdatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v *Recipient) pulumi.StringOutput { return v.UpdatedBy }).(pulumi.StringOutput)
}

type RecipientArrayOutput struct{ *pulumi.OutputState }

func (RecipientArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Recipient)(nil)).Elem()
}

func (o RecipientArrayOutput) ToRecipientArrayOutput() RecipientArrayOutput {
	return o
}

func (o RecipientArrayOutput) ToRecipientArrayOutputWithContext(ctx context.Context) RecipientArrayOutput {
	return o
}

func (o RecipientArrayOutput) Index(i pulumi.IntInput) RecipientOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Recipient {
		return vs[0].([]*Recipient)[vs[1].(int)]
	}).(RecipientOutput)
}

type RecipientMapOutput struct{ *pulumi.OutputState }

func (RecipientMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Recipient)(nil)).Elem()
}

func (o RecipientMapOutput) ToRecipientMapOutput() RecipientMapOutput {
	return o
}

func (o RecipientMapOutput) ToRecipientMapOutputWithContext(ctx context.Context) RecipientMapOutput {
	return o
}

func (o RecipientMapOutput) MapIndex(k pulumi.StringInput) RecipientOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Recipient {
		return vs[0].(map[string]*Recipient)[vs[1].(string)]
	}).(RecipientOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RecipientInput)(nil)).Elem(), &Recipient{})
	pulumi.RegisterInputType(reflect.TypeOf((*RecipientArrayInput)(nil)).Elem(), RecipientArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RecipientMapInput)(nil)).Elem(), RecipientMap{})
	pulumi.RegisterOutputType(RecipientOutput{})
	pulumi.RegisterOutputType(RecipientArrayOutput{})
	pulumi.RegisterOutputType(RecipientMapOutput{})
}
