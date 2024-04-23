// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ### Creating a Databricks on AWS workspace
    /// 
    /// !Simplest multiworkspace
    /// 
    /// To get workspace running, you have to configure a couple of things:
    /// 
    /// * databricks.MwsCredentials - You can share a credentials (cross-account IAM role) configuration ID with multiple workspaces. It is not required to create a new one for each workspace.
    /// * databricks.MwsStorageConfigurations - You can share a root S3 bucket with multiple workspaces in a single account. You do not have to create new ones for each workspace. If you share a root S3 bucket for multiple workspaces in an account, data on the root S3 bucket is partitioned into separate directories by workspace.
    /// * databricks.MwsNetworks - (optional, but recommended) You can share one [customer-managed VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) with multiple workspaces in a single account. You do not have to create a new VPC for each workspace. However, you cannot reuse subnets or security groups with other resources, including other workspaces or non-Databricks resources. If you plan to share one VPC with multiple workspaces, be sure to size your VPC and subnets accordingly. Because a Databricks databricks.MwsNetworks encapsulates this information, you cannot reuse it across workspaces.
    /// * databricks.MwsCustomerManagedKeys - You can share a customer-managed key across workspaces.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     // Account ID that can be found in the dropdown under the email address in the upper-right corner of https://accounts.cloud.databricks.com/
    ///     var databricksAccountId = config.RequireObject&lt;dynamic&gt;("databricksAccountId");
    ///     // register cross-account ARN
    ///     var @this = new Databricks.MwsCredentials("this", new()
    ///     {
    ///         AccountId = databricksAccountId,
    ///         CredentialsName = $"{prefix}-creds",
    ///         RoleArn = crossaccountArn,
    ///     });
    /// 
    ///     // register root bucket
    ///     var thisMwsStorageConfigurations = new Databricks.MwsStorageConfigurations("this", new()
    ///     {
    ///         AccountId = databricksAccountId,
    ///         StorageConfigurationName = $"{prefix}-storage",
    ///         BucketName = rootBucket,
    ///     });
    /// 
    ///     // register VPC
    ///     var thisMwsNetworks = new Databricks.MwsNetworks("this", new()
    ///     {
    ///         AccountId = databricksAccountId,
    ///         NetworkName = $"{prefix}-network",
    ///         VpcId = vpcId,
    ///         SubnetIds = subnetsPrivate,
    ///         SecurityGroupIds = new[]
    ///         {
    ///             securityGroup,
    ///         },
    ///     });
    /// 
    ///     // create workspace in given VPC with DBFS on root bucket
    ///     var thisMwsWorkspaces = new Databricks.MwsWorkspaces("this", new()
    ///     {
    ///         AccountId = databricksAccountId,
    ///         WorkspaceName = prefix,
    ///         AwsRegion = region,
    ///         CredentialsId = @this.CredentialsId,
    ///         StorageConfigurationId = thisMwsStorageConfigurations.StorageConfigurationId,
    ///         NetworkId = thisMwsNetworks.NetworkId,
    ///         Token = null,
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["databricksToken"] = thisMwsWorkspaces.Token.Apply(token =&gt; token?.TokenValue),
    ///     };
    /// });
    /// ```
    /// 
    /// ### Creating a Databricks on AWS workspace with Databricks-Managed VPC
    /// 
    /// ![VPCs](https://docs.databricks.com/_images/customer-managed-vpc.png)
    /// 
    /// By default, Databricks creates a VPC in your AWS account for each workspace. Databricks uses it for running clusters in the workspace. Optionally, you can use your VPC for the workspace, using the feature customer-managed VPC. Databricks recommends that you provide your VPC with databricks.MwsNetworks so that you can configure it according to your organization’s enterprise cloud standards while still conforming to Databricks requirements. You cannot migrate an existing workspace to your VPC. Please see the difference described through IAM policy actions [on this page](https://docs.databricks.com/administration-guide/account-api/iam-role.html).
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// using Databricks = Pulumi.Databricks;
    /// using Random = Pulumi.Random;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     // Account Id that could be found in the top right corner of https://accounts.cloud.databricks.com/
    ///     var databricksAccountId = config.RequireObject&lt;dynamic&gt;("databricksAccountId");
    ///     var naming = new Random.Index.String("naming", new()
    ///     {
    ///         Special = false,
    ///         Upper = false,
    ///         Length = 6,
    ///     });
    /// 
    ///     var prefix = $"dltp{naming.Result}";
    /// 
    ///     var @this = Databricks.GetAwsAssumeRolePolicy.Invoke(new()
    ///     {
    ///         ExternalId = databricksAccountId,
    ///     });
    /// 
    ///     var crossAccountRole = new Aws.Iam.Role("cross_account_role", new()
    ///     {
    ///         Name = $"{prefix}-crossaccount",
    ///         AssumeRolePolicy = @this.Apply(@this =&gt; @this.Apply(getAwsAssumeRolePolicyResult =&gt; getAwsAssumeRolePolicyResult.Json)),
    ///         Tags = tags,
    ///     });
    /// 
    ///     var thisGetAwsCrossAccountPolicy = Databricks.GetAwsCrossAccountPolicy.Invoke();
    /// 
    ///     var thisRolePolicy = new Aws.Iam.RolePolicy("this", new()
    ///     {
    ///         Name = $"{prefix}-policy",
    ///         Role = crossAccountRole.Id,
    ///         Policy = thisGetAwsCrossAccountPolicy.Apply(getAwsCrossAccountPolicyResult =&gt; getAwsCrossAccountPolicyResult.Json),
    ///     });
    /// 
    ///     var thisMwsCredentials = new Databricks.MwsCredentials("this", new()
    ///     {
    ///         AccountId = databricksAccountId,
    ///         CredentialsName = $"{prefix}-creds",
    ///         RoleArn = crossAccountRole.Arn,
    ///     });
    /// 
    ///     var rootStorageBucket = new Aws.S3.BucketV2("root_storage_bucket", new()
    ///     {
    ///         Bucket = $"{prefix}-rootbucket",
    ///         Acl = "private",
    ///         ForceDestroy = true,
    ///         Tags = tags,
    ///     });
    /// 
    ///     var rootVersioning = new Aws.S3.BucketVersioningV2("root_versioning", new()
    ///     {
    ///         Bucket = rootStorageBucket.Id,
    ///         VersioningConfiguration = new Aws.S3.Inputs.BucketVersioningV2VersioningConfigurationArgs
    ///         {
    ///             Status = "Disabled",
    ///         },
    ///     });
    /// 
    ///     var rootStorageBucketBucketServerSideEncryptionConfigurationV2 = new Aws.S3.BucketServerSideEncryptionConfigurationV2("root_storage_bucket", new()
    ///     {
    ///         Bucket = rootStorageBucket.Bucket,
    ///         Rules = new[]
    ///         {
    ///             new Aws.S3.Inputs.BucketServerSideEncryptionConfigurationV2RuleArgs
    ///             {
    ///                 ApplyServerSideEncryptionByDefault = new Aws.S3.Inputs.BucketServerSideEncryptionConfigurationV2RuleApplyServerSideEncryptionByDefaultArgs
    ///                 {
    ///                     SseAlgorithm = "AES256",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var rootStorageBucketBucketPublicAccessBlock = new Aws.S3.BucketPublicAccessBlock("root_storage_bucket", new()
    ///     {
    ///         Bucket = rootStorageBucket.Id,
    ///         BlockPublicAcls = true,
    ///         BlockPublicPolicy = true,
    ///         IgnorePublicAcls = true,
    ///         RestrictPublicBuckets = true,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             rootStorageBucket,
    ///         },
    ///     });
    /// 
    ///     var thisGetAwsBucketPolicy = Databricks.GetAwsBucketPolicy.Invoke(new()
    ///     {
    ///         Bucket = rootStorageBucket.Bucket,
    ///     });
    /// 
    ///     var rootBucketPolicy = new Aws.S3.BucketPolicy("root_bucket_policy", new()
    ///     {
    ///         Bucket = rootStorageBucket.Id,
    ///         Policy = thisGetAwsBucketPolicy.Apply(getAwsBucketPolicyResult =&gt; getAwsBucketPolicyResult.Json),
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             rootStorageBucketBucketPublicAccessBlock,
    ///         },
    ///     });
    /// 
    ///     var thisMwsStorageConfigurations = new Databricks.MwsStorageConfigurations("this", new()
    ///     {
    ///         AccountId = databricksAccountId,
    ///         StorageConfigurationName = $"{prefix}-storage",
    ///         BucketName = rootStorageBucket.Bucket,
    ///     });
    /// 
    ///     var thisMwsWorkspaces = new Databricks.MwsWorkspaces("this", new()
    ///     {
    ///         AccountId = databricksAccountId,
    ///         WorkspaceName = prefix,
    ///         AwsRegion = "us-east-1",
    ///         CredentialsId = thisMwsCredentials.CredentialsId,
    ///         StorageConfigurationId = thisMwsStorageConfigurations.StorageConfigurationId,
    ///         Token = null,
    ///         CustomTags = 
    ///         {
    ///             { "SoldToCode", "1234" },
    ///         },
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["databricksToken"] = thisMwsWorkspaces.Token.Apply(token =&gt; token?.TokenValue),
    ///     };
    /// });
    /// ```
    /// 
    /// In order to create a [Databricks Workspace that leverages AWS PrivateLink](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html) please ensure that you have read and understood the [Enable Private Link](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html) documentation and then customise the example above with the relevant examples from mws_vpc_endpoint, mws_private_access_settings and mws_networks.
    /// 
    /// ### Creating a Databricks on GCP workspace
    /// 
    /// To get workspace running, you have to configure a network object:
    /// 
    /// * databricks.MwsNetworks - (optional, but recommended) You can share one [customer-managed VPC](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/customer-managed-vpc.html) with multiple workspaces in a single account. You do not have to create a new VPC for each workspace. However, you cannot reuse subnets with other resources, including other workspaces or non-Databricks resources. If you plan to share one VPC with multiple workspaces, be sure to size your VPC and subnets accordingly. Because a Databricks databricks.MwsNetworks encapsulates this information, you cannot reuse it across workspaces.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     // Account Id that could be found in the top right corner of https://accounts.cloud.databricks.com/
    ///     var databricksAccountId = config.RequireObject&lt;dynamic&gt;("databricksAccountId");
    ///     var databricksGoogleServiceAccount = config.RequireObject&lt;dynamic&gt;("databricksGoogleServiceAccount");
    ///     var googleProject = config.RequireObject&lt;dynamic&gt;("googleProject");
    ///     // register VPC
    ///     var @this = new Databricks.MwsNetworks("this", new()
    ///     {
    ///         AccountId = databricksAccountId,
    ///         NetworkName = $"{prefix}-network",
    ///         GcpNetworkInfo = new Databricks.Inputs.MwsNetworksGcpNetworkInfoArgs
    ///         {
    ///             NetworkProjectId = googleProject,
    ///             VpcId = vpcId,
    ///             SubnetId = subnetId,
    ///             SubnetRegion = subnetRegion,
    ///             PodIpRangeName = "pods",
    ///             ServiceIpRangeName = "svc",
    ///         },
    ///     });
    /// 
    ///     // create workspace in given VPC
    ///     var thisMwsWorkspaces = new Databricks.MwsWorkspaces("this", new()
    ///     {
    ///         AccountId = databricksAccountId,
    ///         WorkspaceName = prefix,
    ///         Location = subnetRegion,
    ///         CloudResourceContainer = new Databricks.Inputs.MwsWorkspacesCloudResourceContainerArgs
    ///         {
    ///             Gcp = new Databricks.Inputs.MwsWorkspacesCloudResourceContainerGcpArgs
    ///             {
    ///                 ProjectId = googleProject,
    ///             },
    ///         },
    ///         NetworkId = @this.NetworkId,
    ///         GkeConfig = new Databricks.Inputs.MwsWorkspacesGkeConfigArgs
    ///         {
    ///             ConnectivityType = "PRIVATE_NODE_PUBLIC_MASTER",
    ///             MasterIpRange = "10.3.0.0/28",
    ///         },
    ///         Token = null,
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["databricksToken"] = thisMwsWorkspaces.Token.Apply(token =&gt; token?.TokenValue),
    ///     };
    /// });
    /// ```
    /// 
    /// In order to create a [Databricks Workspace that leverages GCP Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html) please ensure that you have read and understood the [Enable Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html) documentation and then customise the example above with the relevant examples from mws_vpc_endpoint, mws_private_access_settings and mws_networks.
    /// </summary>
    [DatabricksResourceType("databricks:index/mwsWorkspaces:MwsWorkspaces")]
    public partial class MwsWorkspaces : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/).
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// region of VPC.
        /// </summary>
        [Output("awsRegion")]
        public Output<string?> AwsRegion { get; private set; } = null!;

        [Output("cloud")]
        public Output<string> Cloud { get; private set; } = null!;

        /// <summary>
        /// A block that specifies GCP workspace configurations, consisting of following blocks:
        /// </summary>
        [Output("cloudResourceContainer")]
        public Output<Outputs.MwsWorkspacesCloudResourceContainer?> CloudResourceContainer { get; private set; } = null!;

        /// <summary>
        /// (Integer) time when workspace was created
        /// </summary>
        [Output("creationTime")]
        public Output<int> CreationTime { get; private set; } = null!;

        [Output("credentialsId")]
        public Output<string?> CredentialsId { get; private set; } = null!;

        /// <summary>
        /// The custom tags key-value pairing that is attached to this workspace. These tags will be applied to clusters automatically in addition to any `default_tags` or `custom_tags` on a cluster level. Please note it can take up to an hour for custom_tags to be set due to scheduling on Control Plane. After custom tags are applied, they can be modified however they can never be completely removed.
        /// </summary>
        [Output("customTags")]
        public Output<ImmutableDictionary<string, object>?> CustomTags { get; private set; } = null!;

        [Output("customerManagedKeyId")]
        public Output<string?> CustomerManagedKeyId { get; private set; } = null!;

        /// <summary>
        /// part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
        /// </summary>
        [Output("deploymentName")]
        public Output<string?> DeploymentName { get; private set; } = null!;

        [Output("externalCustomerInfo")]
        public Output<Outputs.MwsWorkspacesExternalCustomerInfo?> ExternalCustomerInfo { get; private set; } = null!;

        [Output("gcpManagedNetworkConfig")]
        public Output<Outputs.MwsWorkspacesGcpManagedNetworkConfig?> GcpManagedNetworkConfig { get; private set; } = null!;

        /// <summary>
        /// A block that specifies GKE configuration for the Databricks workspace:
        /// </summary>
        [Output("gkeConfig")]
        public Output<Outputs.MwsWorkspacesGkeConfig?> GkeConfig { get; private set; } = null!;

        [Output("isNoPublicIpEnabled")]
        public Output<bool?> IsNoPublicIpEnabled { get; private set; } = null!;

        /// <summary>
        /// region of the subnet.
        /// </summary>
        [Output("location")]
        public Output<string?> Location { get; private set; } = null!;

        /// <summary>
        /// `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace's notebook and secret data in the control plane.
        /// </summary>
        [Output("managedServicesCustomerManagedKeyId")]
        public Output<string?> ManagedServicesCustomerManagedKeyId { get; private set; } = null!;

        /// <summary>
        /// `network_id` from networks.
        /// </summary>
        [Output("networkId")]
        public Output<string?> NetworkId { get; private set; } = null!;

        /// <summary>
        /// The pricing tier of the workspace.
        /// </summary>
        [Output("pricingTier")]
        public Output<string> PricingTier { get; private set; } = null!;

        /// <summary>
        /// Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account.
        /// </summary>
        [Output("privateAccessSettingsId")]
        public Output<string?> PrivateAccessSettingsId { get; private set; } = null!;

        /// <summary>
        /// `storage_configuration_id` from storage configuration.
        /// </summary>
        [Output("storageConfigurationId")]
        public Output<string?> StorageConfigurationId { get; private set; } = null!;

        /// <summary>
        /// `customer_managed_key_id` from customer managed keys with `use_cases` set to `STORAGE`. This is used to encrypt the DBFS Storage &amp; Cluster Volumes.
        /// </summary>
        [Output("storageCustomerManagedKeyId")]
        public Output<string?> StorageCustomerManagedKeyId { get; private set; } = null!;

        [Output("token")]
        public Output<Outputs.MwsWorkspacesToken?> Token { get; private set; } = null!;

        /// <summary>
        /// (String) workspace id
        /// </summary>
        [Output("workspaceId")]
        public Output<int> WorkspaceId { get; private set; } = null!;

        /// <summary>
        /// name of the workspace, will appear on UI.
        /// </summary>
        [Output("workspaceName")]
        public Output<string> WorkspaceName { get; private set; } = null!;

        /// <summary>
        /// (String) workspace status
        /// </summary>
        [Output("workspaceStatus")]
        public Output<string> WorkspaceStatus { get; private set; } = null!;

        /// <summary>
        /// (String) updates on workspace status
        /// </summary>
        [Output("workspaceStatusMessage")]
        public Output<string> WorkspaceStatusMessage { get; private set; } = null!;

        /// <summary>
        /// (String) URL of the workspace
        /// </summary>
        [Output("workspaceUrl")]
        public Output<string> WorkspaceUrl { get; private set; } = null!;


        /// <summary>
        /// Create a MwsWorkspaces resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MwsWorkspaces(string name, MwsWorkspacesArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/mwsWorkspaces:MwsWorkspaces", name, args ?? new MwsWorkspacesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MwsWorkspaces(string name, Input<string> id, MwsWorkspacesState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/mwsWorkspaces:MwsWorkspaces", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "accountId",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MwsWorkspaces resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MwsWorkspaces Get(string name, Input<string> id, MwsWorkspacesState? state = null, CustomResourceOptions? options = null)
        {
            return new MwsWorkspaces(name, id, state, options);
        }
    }

    public sealed class MwsWorkspacesArgs : global::Pulumi.ResourceArgs
    {
        [Input("accountId", required: true)]
        private Input<string>? _accountId;

        /// <summary>
        /// Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/).
        /// </summary>
        public Input<string>? AccountId
        {
            get => _accountId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// region of VPC.
        /// </summary>
        [Input("awsRegion")]
        public Input<string>? AwsRegion { get; set; }

        [Input("cloud")]
        public Input<string>? Cloud { get; set; }

        /// <summary>
        /// A block that specifies GCP workspace configurations, consisting of following blocks:
        /// </summary>
        [Input("cloudResourceContainer")]
        public Input<Inputs.MwsWorkspacesCloudResourceContainerArgs>? CloudResourceContainer { get; set; }

        /// <summary>
        /// (Integer) time when workspace was created
        /// </summary>
        [Input("creationTime")]
        public Input<int>? CreationTime { get; set; }

        [Input("credentialsId")]
        public Input<string>? CredentialsId { get; set; }

        [Input("customTags")]
        private InputMap<object>? _customTags;

        /// <summary>
        /// The custom tags key-value pairing that is attached to this workspace. These tags will be applied to clusters automatically in addition to any `default_tags` or `custom_tags` on a cluster level. Please note it can take up to an hour for custom_tags to be set due to scheduling on Control Plane. After custom tags are applied, they can be modified however they can never be completely removed.
        /// </summary>
        public InputMap<object> CustomTags
        {
            get => _customTags ?? (_customTags = new InputMap<object>());
            set => _customTags = value;
        }

        [Input("customerManagedKeyId")]
        public Input<string>? CustomerManagedKeyId { get; set; }

        /// <summary>
        /// part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
        /// </summary>
        [Input("deploymentName")]
        public Input<string>? DeploymentName { get; set; }

        [Input("externalCustomerInfo")]
        public Input<Inputs.MwsWorkspacesExternalCustomerInfoArgs>? ExternalCustomerInfo { get; set; }

        [Input("gcpManagedNetworkConfig")]
        public Input<Inputs.MwsWorkspacesGcpManagedNetworkConfigArgs>? GcpManagedNetworkConfig { get; set; }

        /// <summary>
        /// A block that specifies GKE configuration for the Databricks workspace:
        /// </summary>
        [Input("gkeConfig")]
        public Input<Inputs.MwsWorkspacesGkeConfigArgs>? GkeConfig { get; set; }

        [Input("isNoPublicIpEnabled")]
        public Input<bool>? IsNoPublicIpEnabled { get; set; }

        /// <summary>
        /// region of the subnet.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace's notebook and secret data in the control plane.
        /// </summary>
        [Input("managedServicesCustomerManagedKeyId")]
        public Input<string>? ManagedServicesCustomerManagedKeyId { get; set; }

        /// <summary>
        /// `network_id` from networks.
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// The pricing tier of the workspace.
        /// </summary>
        [Input("pricingTier")]
        public Input<string>? PricingTier { get; set; }

        /// <summary>
        /// Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account.
        /// </summary>
        [Input("privateAccessSettingsId")]
        public Input<string>? PrivateAccessSettingsId { get; set; }

        /// <summary>
        /// `storage_configuration_id` from storage configuration.
        /// </summary>
        [Input("storageConfigurationId")]
        public Input<string>? StorageConfigurationId { get; set; }

        /// <summary>
        /// `customer_managed_key_id` from customer managed keys with `use_cases` set to `STORAGE`. This is used to encrypt the DBFS Storage &amp; Cluster Volumes.
        /// </summary>
        [Input("storageCustomerManagedKeyId")]
        public Input<string>? StorageCustomerManagedKeyId { get; set; }

        [Input("token")]
        public Input<Inputs.MwsWorkspacesTokenArgs>? Token { get; set; }

        /// <summary>
        /// (String) workspace id
        /// </summary>
        [Input("workspaceId")]
        public Input<int>? WorkspaceId { get; set; }

        /// <summary>
        /// name of the workspace, will appear on UI.
        /// </summary>
        [Input("workspaceName", required: true)]
        public Input<string> WorkspaceName { get; set; } = null!;

        /// <summary>
        /// (String) workspace status
        /// </summary>
        [Input("workspaceStatus")]
        public Input<string>? WorkspaceStatus { get; set; }

        /// <summary>
        /// (String) updates on workspace status
        /// </summary>
        [Input("workspaceStatusMessage")]
        public Input<string>? WorkspaceStatusMessage { get; set; }

        /// <summary>
        /// (String) URL of the workspace
        /// </summary>
        [Input("workspaceUrl")]
        public Input<string>? WorkspaceUrl { get; set; }

        public MwsWorkspacesArgs()
        {
        }
        public static new MwsWorkspacesArgs Empty => new MwsWorkspacesArgs();
    }

    public sealed class MwsWorkspacesState : global::Pulumi.ResourceArgs
    {
        [Input("accountId")]
        private Input<string>? _accountId;

        /// <summary>
        /// Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/).
        /// </summary>
        public Input<string>? AccountId
        {
            get => _accountId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// region of VPC.
        /// </summary>
        [Input("awsRegion")]
        public Input<string>? AwsRegion { get; set; }

        [Input("cloud")]
        public Input<string>? Cloud { get; set; }

        /// <summary>
        /// A block that specifies GCP workspace configurations, consisting of following blocks:
        /// </summary>
        [Input("cloudResourceContainer")]
        public Input<Inputs.MwsWorkspacesCloudResourceContainerGetArgs>? CloudResourceContainer { get; set; }

        /// <summary>
        /// (Integer) time when workspace was created
        /// </summary>
        [Input("creationTime")]
        public Input<int>? CreationTime { get; set; }

        [Input("credentialsId")]
        public Input<string>? CredentialsId { get; set; }

        [Input("customTags")]
        private InputMap<object>? _customTags;

        /// <summary>
        /// The custom tags key-value pairing that is attached to this workspace. These tags will be applied to clusters automatically in addition to any `default_tags` or `custom_tags` on a cluster level. Please note it can take up to an hour for custom_tags to be set due to scheduling on Control Plane. After custom tags are applied, they can be modified however they can never be completely removed.
        /// </summary>
        public InputMap<object> CustomTags
        {
            get => _customTags ?? (_customTags = new InputMap<object>());
            set => _customTags = value;
        }

        [Input("customerManagedKeyId")]
        public Input<string>? CustomerManagedKeyId { get; set; }

        /// <summary>
        /// part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
        /// </summary>
        [Input("deploymentName")]
        public Input<string>? DeploymentName { get; set; }

        [Input("externalCustomerInfo")]
        public Input<Inputs.MwsWorkspacesExternalCustomerInfoGetArgs>? ExternalCustomerInfo { get; set; }

        [Input("gcpManagedNetworkConfig")]
        public Input<Inputs.MwsWorkspacesGcpManagedNetworkConfigGetArgs>? GcpManagedNetworkConfig { get; set; }

        /// <summary>
        /// A block that specifies GKE configuration for the Databricks workspace:
        /// </summary>
        [Input("gkeConfig")]
        public Input<Inputs.MwsWorkspacesGkeConfigGetArgs>? GkeConfig { get; set; }

        [Input("isNoPublicIpEnabled")]
        public Input<bool>? IsNoPublicIpEnabled { get; set; }

        /// <summary>
        /// region of the subnet.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace's notebook and secret data in the control plane.
        /// </summary>
        [Input("managedServicesCustomerManagedKeyId")]
        public Input<string>? ManagedServicesCustomerManagedKeyId { get; set; }

        /// <summary>
        /// `network_id` from networks.
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// The pricing tier of the workspace.
        /// </summary>
        [Input("pricingTier")]
        public Input<string>? PricingTier { get; set; }

        /// <summary>
        /// Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account.
        /// </summary>
        [Input("privateAccessSettingsId")]
        public Input<string>? PrivateAccessSettingsId { get; set; }

        /// <summary>
        /// `storage_configuration_id` from storage configuration.
        /// </summary>
        [Input("storageConfigurationId")]
        public Input<string>? StorageConfigurationId { get; set; }

        /// <summary>
        /// `customer_managed_key_id` from customer managed keys with `use_cases` set to `STORAGE`. This is used to encrypt the DBFS Storage &amp; Cluster Volumes.
        /// </summary>
        [Input("storageCustomerManagedKeyId")]
        public Input<string>? StorageCustomerManagedKeyId { get; set; }

        [Input("token")]
        public Input<Inputs.MwsWorkspacesTokenGetArgs>? Token { get; set; }

        /// <summary>
        /// (String) workspace id
        /// </summary>
        [Input("workspaceId")]
        public Input<int>? WorkspaceId { get; set; }

        /// <summary>
        /// name of the workspace, will appear on UI.
        /// </summary>
        [Input("workspaceName")]
        public Input<string>? WorkspaceName { get; set; }

        /// <summary>
        /// (String) workspace status
        /// </summary>
        [Input("workspaceStatus")]
        public Input<string>? WorkspaceStatus { get; set; }

        /// <summary>
        /// (String) updates on workspace status
        /// </summary>
        [Input("workspaceStatusMessage")]
        public Input<string>? WorkspaceStatusMessage { get; set; }

        /// <summary>
        /// (String) URL of the workspace
        /// </summary>
        [Input("workspaceUrl")]
        public Input<string>? WorkspaceUrl { get; set; }

        public MwsWorkspacesState()
        {
        }
        public static new MwsWorkspacesState Empty => new MwsWorkspacesState();
    }
}
