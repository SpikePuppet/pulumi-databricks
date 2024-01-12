// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Note** This resource could be used with account or workspace-level provider.
//
// To work with external tables, Unity Catalog introduces two new objects to access and work with external cloud storage:
//
// - `StorageCredential` represents authentication methods to access cloud storage (e.g. an IAM role for Amazon S3 or a service principal/managed identity for Azure Storage). Storage credentials are access-controlled to determine which users can use the credential.
// - ExternalLocation are objects that combine a cloud storage path with a Storage Credential that can be used to access the location.
//
// ## Example Usage
//
// # For AWS
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
//			external, err := databricks.NewStorageCredential(ctx, "external", &databricks.StorageCredentialArgs{
//				AwsIamRole: &databricks.StorageCredentialAwsIamRoleArgs{
//					RoleArn: pulumi.Any(aws_iam_role.External_data_access.Arn),
//				},
//				Comment: pulumi.String("Managed by TF"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewGrants(ctx, "externalCreds", &databricks.GrantsArgs{
//				StorageCredential: external.ID(),
//				Grants: databricks.GrantsGrantArray{
//					&databricks.GrantsGrantArgs{
//						Principal: pulumi.String("Data Engineers"),
//						Privileges: pulumi.StringArray{
//							pulumi.String("CREATE_EXTERNAL_TABLE"),
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
//
// # For Azure
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
//			_, err := databricks.NewStorageCredential(ctx, "externalMi", &databricks.StorageCredentialArgs{
//				AzureManagedIdentity: &databricks.StorageCredentialAzureManagedIdentityArgs{
//					AccessConnectorId: pulumi.Any(azurerm_databricks_access_connector.Example.Id),
//				},
//				Comment: pulumi.String("Managed identity credential managed by TF"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewGrants(ctx, "externalCreds", &databricks.GrantsArgs{
//				StorageCredential: pulumi.Any(databricks_storage_credential.External.Id),
//				Grants: databricks.GrantsGrantArray{
//					&databricks.GrantsGrantArgs{
//						Principal: pulumi.String("Data Engineers"),
//						Privileges: pulumi.StringArray{
//							pulumi.String("CREATE_EXTERNAL_TABLE"),
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
//
// # For GCP
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
//			external, err := databricks.NewStorageCredential(ctx, "external", &databricks.StorageCredentialArgs{
//				DatabricksGcpServiceAccount: nil,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewGrants(ctx, "externalCreds", &databricks.GrantsArgs{
//				StorageCredential: external.ID(),
//				Grants: databricks.GrantsGrantArray{
//					&databricks.GrantsGrantArgs{
//						Principal: pulumi.String("Data Engineers"),
//						Privileges: pulumi.StringArray{
//							pulumi.String("CREATE_EXTERNAL_TABLE"),
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
//
// ## Import
//
// # This resource can be imported by namebash
//
// ```sh
//
//	$ pulumi import databricks:index/storageCredential:StorageCredential this <name>
//
// ```
type StorageCredential struct {
	pulumi.CustomResourceState

	AwsIamRole                  StorageCredentialAwsIamRolePtrOutput               `pulumi:"awsIamRole"`
	AzureManagedIdentity        StorageCredentialAzureManagedIdentityPtrOutput     `pulumi:"azureManagedIdentity"`
	AzureServicePrincipal       StorageCredentialAzureServicePrincipalPtrOutput    `pulumi:"azureServicePrincipal"`
	Comment                     pulumi.StringPtrOutput                             `pulumi:"comment"`
	DatabricksGcpServiceAccount StorageCredentialDatabricksGcpServiceAccountOutput `pulumi:"databricksGcpServiceAccount"`
	// Delete storage credential regardless of its dependencies.
	//
	// `awsIamRole` optional configuration block for credential details for AWS:
	ForceDestroy         pulumi.BoolPtrOutput                           `pulumi:"forceDestroy"`
	ForceUpdate          pulumi.BoolPtrOutput                           `pulumi:"forceUpdate"`
	GcpServiceAccountKey StorageCredentialGcpServiceAccountKeyPtrOutput `pulumi:"gcpServiceAccountKey"`
	// Unique identifier of the parent Metastore. If set for workspace-level, it must match the ID of the metastore assigned to the worspace. When changing the metastore assigned to a workspace, this field becomes required.
	MetastoreId pulumi.StringOutput `pulumi:"metastoreId"`
	// Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Username/groupname/sp applicationId of the storage credential owner.
	Owner pulumi.StringOutput `pulumi:"owner"`
	// Indicates whether the storage credential is only usable for read operations.
	ReadOnly pulumi.BoolPtrOutput `pulumi:"readOnly"`
	// Suppress validation errors if any & force save the storage credential.
	SkipValidation pulumi.BoolPtrOutput `pulumi:"skipValidation"`
}

// NewStorageCredential registers a new resource with the given unique name, arguments, and options.
func NewStorageCredential(ctx *pulumi.Context,
	name string, args *StorageCredentialArgs, opts ...pulumi.ResourceOption) (*StorageCredential, error) {
	if args == nil {
		args = &StorageCredentialArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StorageCredential
	err := ctx.RegisterResource("databricks:index/storageCredential:StorageCredential", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStorageCredential gets an existing StorageCredential resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStorageCredential(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StorageCredentialState, opts ...pulumi.ResourceOption) (*StorageCredential, error) {
	var resource StorageCredential
	err := ctx.ReadResource("databricks:index/storageCredential:StorageCredential", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StorageCredential resources.
type storageCredentialState struct {
	AwsIamRole                  *StorageCredentialAwsIamRole                  `pulumi:"awsIamRole"`
	AzureManagedIdentity        *StorageCredentialAzureManagedIdentity        `pulumi:"azureManagedIdentity"`
	AzureServicePrincipal       *StorageCredentialAzureServicePrincipal       `pulumi:"azureServicePrincipal"`
	Comment                     *string                                       `pulumi:"comment"`
	DatabricksGcpServiceAccount *StorageCredentialDatabricksGcpServiceAccount `pulumi:"databricksGcpServiceAccount"`
	// Delete storage credential regardless of its dependencies.
	//
	// `awsIamRole` optional configuration block for credential details for AWS:
	ForceDestroy         *bool                                  `pulumi:"forceDestroy"`
	ForceUpdate          *bool                                  `pulumi:"forceUpdate"`
	GcpServiceAccountKey *StorageCredentialGcpServiceAccountKey `pulumi:"gcpServiceAccountKey"`
	// Unique identifier of the parent Metastore. If set for workspace-level, it must match the ID of the metastore assigned to the worspace. When changing the metastore assigned to a workspace, this field becomes required.
	MetastoreId *string `pulumi:"metastoreId"`
	// Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Username/groupname/sp applicationId of the storage credential owner.
	Owner *string `pulumi:"owner"`
	// Indicates whether the storage credential is only usable for read operations.
	ReadOnly *bool `pulumi:"readOnly"`
	// Suppress validation errors if any & force save the storage credential.
	SkipValidation *bool `pulumi:"skipValidation"`
}

type StorageCredentialState struct {
	AwsIamRole                  StorageCredentialAwsIamRolePtrInput
	AzureManagedIdentity        StorageCredentialAzureManagedIdentityPtrInput
	AzureServicePrincipal       StorageCredentialAzureServicePrincipalPtrInput
	Comment                     pulumi.StringPtrInput
	DatabricksGcpServiceAccount StorageCredentialDatabricksGcpServiceAccountPtrInput
	// Delete storage credential regardless of its dependencies.
	//
	// `awsIamRole` optional configuration block for credential details for AWS:
	ForceDestroy         pulumi.BoolPtrInput
	ForceUpdate          pulumi.BoolPtrInput
	GcpServiceAccountKey StorageCredentialGcpServiceAccountKeyPtrInput
	// Unique identifier of the parent Metastore. If set for workspace-level, it must match the ID of the metastore assigned to the worspace. When changing the metastore assigned to a workspace, this field becomes required.
	MetastoreId pulumi.StringPtrInput
	// Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Username/groupname/sp applicationId of the storage credential owner.
	Owner pulumi.StringPtrInput
	// Indicates whether the storage credential is only usable for read operations.
	ReadOnly pulumi.BoolPtrInput
	// Suppress validation errors if any & force save the storage credential.
	SkipValidation pulumi.BoolPtrInput
}

func (StorageCredentialState) ElementType() reflect.Type {
	return reflect.TypeOf((*storageCredentialState)(nil)).Elem()
}

type storageCredentialArgs struct {
	AwsIamRole                  *StorageCredentialAwsIamRole                  `pulumi:"awsIamRole"`
	AzureManagedIdentity        *StorageCredentialAzureManagedIdentity        `pulumi:"azureManagedIdentity"`
	AzureServicePrincipal       *StorageCredentialAzureServicePrincipal       `pulumi:"azureServicePrincipal"`
	Comment                     *string                                       `pulumi:"comment"`
	DatabricksGcpServiceAccount *StorageCredentialDatabricksGcpServiceAccount `pulumi:"databricksGcpServiceAccount"`
	// Delete storage credential regardless of its dependencies.
	//
	// `awsIamRole` optional configuration block for credential details for AWS:
	ForceDestroy         *bool                                  `pulumi:"forceDestroy"`
	ForceUpdate          *bool                                  `pulumi:"forceUpdate"`
	GcpServiceAccountKey *StorageCredentialGcpServiceAccountKey `pulumi:"gcpServiceAccountKey"`
	// Unique identifier of the parent Metastore. If set for workspace-level, it must match the ID of the metastore assigned to the worspace. When changing the metastore assigned to a workspace, this field becomes required.
	MetastoreId *string `pulumi:"metastoreId"`
	// Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Username/groupname/sp applicationId of the storage credential owner.
	Owner *string `pulumi:"owner"`
	// Indicates whether the storage credential is only usable for read operations.
	ReadOnly *bool `pulumi:"readOnly"`
	// Suppress validation errors if any & force save the storage credential.
	SkipValidation *bool `pulumi:"skipValidation"`
}

// The set of arguments for constructing a StorageCredential resource.
type StorageCredentialArgs struct {
	AwsIamRole                  StorageCredentialAwsIamRolePtrInput
	AzureManagedIdentity        StorageCredentialAzureManagedIdentityPtrInput
	AzureServicePrincipal       StorageCredentialAzureServicePrincipalPtrInput
	Comment                     pulumi.StringPtrInput
	DatabricksGcpServiceAccount StorageCredentialDatabricksGcpServiceAccountPtrInput
	// Delete storage credential regardless of its dependencies.
	//
	// `awsIamRole` optional configuration block for credential details for AWS:
	ForceDestroy         pulumi.BoolPtrInput
	ForceUpdate          pulumi.BoolPtrInput
	GcpServiceAccountKey StorageCredentialGcpServiceAccountKeyPtrInput
	// Unique identifier of the parent Metastore. If set for workspace-level, it must match the ID of the metastore assigned to the worspace. When changing the metastore assigned to a workspace, this field becomes required.
	MetastoreId pulumi.StringPtrInput
	// Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Username/groupname/sp applicationId of the storage credential owner.
	Owner pulumi.StringPtrInput
	// Indicates whether the storage credential is only usable for read operations.
	ReadOnly pulumi.BoolPtrInput
	// Suppress validation errors if any & force save the storage credential.
	SkipValidation pulumi.BoolPtrInput
}

func (StorageCredentialArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*storageCredentialArgs)(nil)).Elem()
}

type StorageCredentialInput interface {
	pulumi.Input

	ToStorageCredentialOutput() StorageCredentialOutput
	ToStorageCredentialOutputWithContext(ctx context.Context) StorageCredentialOutput
}

func (*StorageCredential) ElementType() reflect.Type {
	return reflect.TypeOf((**StorageCredential)(nil)).Elem()
}

func (i *StorageCredential) ToStorageCredentialOutput() StorageCredentialOutput {
	return i.ToStorageCredentialOutputWithContext(context.Background())
}

func (i *StorageCredential) ToStorageCredentialOutputWithContext(ctx context.Context) StorageCredentialOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageCredentialOutput)
}

// StorageCredentialArrayInput is an input type that accepts StorageCredentialArray and StorageCredentialArrayOutput values.
// You can construct a concrete instance of `StorageCredentialArrayInput` via:
//
//	StorageCredentialArray{ StorageCredentialArgs{...} }
type StorageCredentialArrayInput interface {
	pulumi.Input

	ToStorageCredentialArrayOutput() StorageCredentialArrayOutput
	ToStorageCredentialArrayOutputWithContext(context.Context) StorageCredentialArrayOutput
}

type StorageCredentialArray []StorageCredentialInput

func (StorageCredentialArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StorageCredential)(nil)).Elem()
}

func (i StorageCredentialArray) ToStorageCredentialArrayOutput() StorageCredentialArrayOutput {
	return i.ToStorageCredentialArrayOutputWithContext(context.Background())
}

func (i StorageCredentialArray) ToStorageCredentialArrayOutputWithContext(ctx context.Context) StorageCredentialArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageCredentialArrayOutput)
}

// StorageCredentialMapInput is an input type that accepts StorageCredentialMap and StorageCredentialMapOutput values.
// You can construct a concrete instance of `StorageCredentialMapInput` via:
//
//	StorageCredentialMap{ "key": StorageCredentialArgs{...} }
type StorageCredentialMapInput interface {
	pulumi.Input

	ToStorageCredentialMapOutput() StorageCredentialMapOutput
	ToStorageCredentialMapOutputWithContext(context.Context) StorageCredentialMapOutput
}

type StorageCredentialMap map[string]StorageCredentialInput

func (StorageCredentialMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StorageCredential)(nil)).Elem()
}

func (i StorageCredentialMap) ToStorageCredentialMapOutput() StorageCredentialMapOutput {
	return i.ToStorageCredentialMapOutputWithContext(context.Background())
}

func (i StorageCredentialMap) ToStorageCredentialMapOutputWithContext(ctx context.Context) StorageCredentialMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageCredentialMapOutput)
}

type StorageCredentialOutput struct{ *pulumi.OutputState }

func (StorageCredentialOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StorageCredential)(nil)).Elem()
}

func (o StorageCredentialOutput) ToStorageCredentialOutput() StorageCredentialOutput {
	return o
}

func (o StorageCredentialOutput) ToStorageCredentialOutputWithContext(ctx context.Context) StorageCredentialOutput {
	return o
}

func (o StorageCredentialOutput) AwsIamRole() StorageCredentialAwsIamRolePtrOutput {
	return o.ApplyT(func(v *StorageCredential) StorageCredentialAwsIamRolePtrOutput { return v.AwsIamRole }).(StorageCredentialAwsIamRolePtrOutput)
}

func (o StorageCredentialOutput) AzureManagedIdentity() StorageCredentialAzureManagedIdentityPtrOutput {
	return o.ApplyT(func(v *StorageCredential) StorageCredentialAzureManagedIdentityPtrOutput {
		return v.AzureManagedIdentity
	}).(StorageCredentialAzureManagedIdentityPtrOutput)
}

func (o StorageCredentialOutput) AzureServicePrincipal() StorageCredentialAzureServicePrincipalPtrOutput {
	return o.ApplyT(func(v *StorageCredential) StorageCredentialAzureServicePrincipalPtrOutput {
		return v.AzureServicePrincipal
	}).(StorageCredentialAzureServicePrincipalPtrOutput)
}

func (o StorageCredentialOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StorageCredential) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

func (o StorageCredentialOutput) DatabricksGcpServiceAccount() StorageCredentialDatabricksGcpServiceAccountOutput {
	return o.ApplyT(func(v *StorageCredential) StorageCredentialDatabricksGcpServiceAccountOutput {
		return v.DatabricksGcpServiceAccount
	}).(StorageCredentialDatabricksGcpServiceAccountOutput)
}

// Delete storage credential regardless of its dependencies.
//
// `awsIamRole` optional configuration block for credential details for AWS:
func (o StorageCredentialOutput) ForceDestroy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *StorageCredential) pulumi.BoolPtrOutput { return v.ForceDestroy }).(pulumi.BoolPtrOutput)
}

func (o StorageCredentialOutput) ForceUpdate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *StorageCredential) pulumi.BoolPtrOutput { return v.ForceUpdate }).(pulumi.BoolPtrOutput)
}

func (o StorageCredentialOutput) GcpServiceAccountKey() StorageCredentialGcpServiceAccountKeyPtrOutput {
	return o.ApplyT(func(v *StorageCredential) StorageCredentialGcpServiceAccountKeyPtrOutput {
		return v.GcpServiceAccountKey
	}).(StorageCredentialGcpServiceAccountKeyPtrOutput)
}

// Unique identifier of the parent Metastore. If set for workspace-level, it must match the ID of the metastore assigned to the worspace. When changing the metastore assigned to a workspace, this field becomes required.
func (o StorageCredentialOutput) MetastoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageCredential) pulumi.StringOutput { return v.MetastoreId }).(pulumi.StringOutput)
}

// Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
func (o StorageCredentialOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageCredential) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Username/groupname/sp applicationId of the storage credential owner.
func (o StorageCredentialOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageCredential) pulumi.StringOutput { return v.Owner }).(pulumi.StringOutput)
}

// Indicates whether the storage credential is only usable for read operations.
func (o StorageCredentialOutput) ReadOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *StorageCredential) pulumi.BoolPtrOutput { return v.ReadOnly }).(pulumi.BoolPtrOutput)
}

// Suppress validation errors if any & force save the storage credential.
func (o StorageCredentialOutput) SkipValidation() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *StorageCredential) pulumi.BoolPtrOutput { return v.SkipValidation }).(pulumi.BoolPtrOutput)
}

type StorageCredentialArrayOutput struct{ *pulumi.OutputState }

func (StorageCredentialArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StorageCredential)(nil)).Elem()
}

func (o StorageCredentialArrayOutput) ToStorageCredentialArrayOutput() StorageCredentialArrayOutput {
	return o
}

func (o StorageCredentialArrayOutput) ToStorageCredentialArrayOutputWithContext(ctx context.Context) StorageCredentialArrayOutput {
	return o
}

func (o StorageCredentialArrayOutput) Index(i pulumi.IntInput) StorageCredentialOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StorageCredential {
		return vs[0].([]*StorageCredential)[vs[1].(int)]
	}).(StorageCredentialOutput)
}

type StorageCredentialMapOutput struct{ *pulumi.OutputState }

func (StorageCredentialMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StorageCredential)(nil)).Elem()
}

func (o StorageCredentialMapOutput) ToStorageCredentialMapOutput() StorageCredentialMapOutput {
	return o
}

func (o StorageCredentialMapOutput) ToStorageCredentialMapOutputWithContext(ctx context.Context) StorageCredentialMapOutput {
	return o
}

func (o StorageCredentialMapOutput) MapIndex(k pulumi.StringInput) StorageCredentialOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StorageCredential {
		return vs[0].(map[string]*StorageCredential)[vs[1].(string)]
	}).(StorageCredentialOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StorageCredentialInput)(nil)).Elem(), &StorageCredential{})
	pulumi.RegisterInputType(reflect.TypeOf((*StorageCredentialArrayInput)(nil)).Elem(), StorageCredentialArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StorageCredentialMapInput)(nil)).Elem(), StorageCredentialMap{})
	pulumi.RegisterOutputType(StorageCredentialOutput{})
	pulumi.RegisterOutputType(StorageCredentialArrayOutput{})
	pulumi.RegisterOutputType(StorageCredentialMapOutput{})
}
