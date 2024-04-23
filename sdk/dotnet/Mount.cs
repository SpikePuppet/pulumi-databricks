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
    /// This resource will mount your cloud storage
    /// * `gs` - to [mount Google Cloud Storage](https://docs.gcp.databricks.com/data/data-sources/google/gcs.html)
    /// * `abfs` - to [mount ADLS Gen2](https://docs.microsoft.com/en-us/azure/databricks/data/data-sources/azure/adls-gen2/) using Azure Blob Filesystem (ABFS) driver
    /// * `adl` - to [mount ADLS Gen1](https://docs.microsoft.com/en-us/azure/databricks/data/data-sources/azure/azure-datalake) using Azure Data Lake (ADL) driver
    /// * `wasb`  - to [mount Azure Blob Storage](https://docs.microsoft.com/en-us/azure/databricks/data/data-sources/azure/azure-storage) using Windows Azure Storage Blob (WASB) driver
    /// 
    /// 1. Use generic arguments - you have a responsibility for providing all necessary parameters that are required to mount specific storage. This is most flexible option
    /// 
    /// ## Common arguments
    /// 
    /// * `cluster_id` - (Optional, String) Cluster to use for mounting. If no cluster is specified, a new cluster will be created and will mount the bucket for all of the clusters in this workspace. If the cluster is not running - it's going to be started, so be aware to set auto-termination rules on it.
    /// * `name` - (Optional, String) Name, under which mount will be accessible in `dbfs:/mnt/&lt;MOUNT_NAME&gt;`. If not specified, provider will try to infer it from depending on the resource type:
    ///   * `bucket_name` for AWS S3 and Google Cloud Storage
    ///   * `container_name` for ADLS Gen2 and Azure Blob Storage
    ///   * `storage_resource_name` for ADLS Gen1
    /// * `uri` - (Optional, String) the URI for accessing specific storage (`s3a://....`, `abfss://....`, `gs://....`, etc.)
    /// * `extra_configs` - (Optional, String map) configuration parameters that are necessary for mounting of specific storage
    /// * `resource_id` - (Optional, String) resource ID for a given storage account. Could be used to fill defaults, such as storage account &amp; container names on Azure.
    /// * `encryption_type` - (Optional, String) encryption type. Currently used only for [AWS S3 mounts](https://docs.databricks.com/data/data-sources/aws/amazon-s3.html#encrypt-data-in-s3-buckets)
    /// 
    /// ### Example mounting ADLS Gen2 using uri and extra_configs
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var tenantId = "00000000-1111-2222-3333-444444444444";
    /// 
    ///     var clientId = "55555555-6666-7777-8888-999999999999";
    /// 
    ///     var secretScope = "some-kv";
    /// 
    ///     var secretKey = "some-sp-secret";
    /// 
    ///     var container = "test";
    /// 
    ///     var storageAcc = "lrs";
    /// 
    ///     var @this = new Databricks.Mount("this", new()
    ///     {
    ///         Name = "tf-abfss",
    ///         Uri = $"abfss://{container}@{storageAcc}.dfs.core.windows.net",
    ///         ExtraConfigs = 
    ///         {
    ///             { "fs.azure.account.auth.type", "OAuth" },
    ///             { "fs.azure.account.oauth.provider.type", "org.apache.hadoop.fs.azurebfs.oauth2.ClientCredsTokenProvider" },
    ///             { "fs.azure.account.oauth2.client.id", clientId },
    ///             { "fs.azure.account.oauth2.client.secret", $"{{{{secrets/{secretScope}/{secretKey}}}}}" },
    ///             { "fs.azure.account.oauth2.client.endpoint", $"https://login.microsoftonline.com/{tenantId}/oauth2/token" },
    ///             { "fs.azure.createRemoteFileSystemDuringInitialization", "false" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Example mounting ADLS Gen2 with AAD passthrough
    /// 
    /// &gt; **Note** AAD passthrough is considered a legacy data access pattern. Use Unity Catalog for fine-grained data access control.
    /// 
    /// &gt; **Note** Mounts using AAD passthrough cannot be created using a service principal.
    /// 
    /// To mount ALDS Gen2 with Azure Active Directory Credentials passthrough we need to execute the mount commands using the cluster configured with AAD Credentials passthrough &amp; provide necessary configuration parameters (see [documentation](https://docs.microsoft.com/en-us/azure/databricks/security/credential-passthrough/adls-passthrough#--mount-azure-data-lake-storage-to-dbfs-using-credential-passthrough) for more details).
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     // Resource group for Databricks Workspace
    ///     var resourceGroup = config.Require("resourceGroup");
    ///     // Name of the Databricks Workspace
    ///     var workspaceName = config.Require("workspaceName");
    ///     var @this = Azure.DataBricks.GetWorkspace.Invoke(new()
    ///     {
    ///         Name = workspaceName,
    ///         ResourceGroupName = resourceGroup,
    ///     });
    /// 
    ///     var smallest = Databricks.GetNodeType.Invoke(new()
    ///     {
    ///         LocalDisk = true,
    ///     });
    /// 
    ///     var latest = Databricks.GetSparkVersion.Invoke();
    /// 
    ///     var sharedPassthrough = new Databricks.Cluster("shared_passthrough", new()
    ///     {
    ///         ClusterName = "Shared Passthrough for mount",
    ///         SparkVersion = latest.Apply(getSparkVersionResult =&gt; getSparkVersionResult.Id),
    ///         NodeTypeId = smallest.Apply(getNodeTypeResult =&gt; getNodeTypeResult.Id),
    ///         AutoterminationMinutes = 10,
    ///         NumWorkers = 1,
    ///         SparkConf = 
    ///         {
    ///             { "spark.databricks.cluster.profile", "serverless" },
    ///             { "spark.databricks.repl.allowedLanguages", "python,sql" },
    ///             { "spark.databricks.passthrough.enabled", "true" },
    ///             { "spark.databricks.pyspark.enableProcessIsolation", "true" },
    ///         },
    ///         CustomTags = 
    ///         {
    ///             { "ResourceClass", "Serverless" },
    ///         },
    ///     });
    /// 
    ///     // Name of the ADLS Gen2 storage container
    ///     var storageAcc = config.Require("storageAcc");
    ///     // Name of container inside storage account
    ///     var container = config.Require("container");
    ///     var passthrough = new Databricks.Mount("passthrough", new()
    ///     {
    ///         Name = "passthrough-test",
    ///         ClusterId = sharedPassthrough.Id,
    ///         Uri = $"abfss://{container}@{storageAcc}.dfs.core.windows.net",
    ///         ExtraConfigs = 
    ///         {
    ///             { "fs.azure.account.auth.type", "CustomAccessToken" },
    ///             { "fs.azure.account.custom.token.provider.class", "{{sparkconf/spark.databricks.passthrough.adls.gen2.tokenProviderClassName}}" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## s3 block
    /// 
    /// This block allows specifying parameters for mounting of the ADLS Gen2. The following arguments are required inside the `s3` block:
    /// 
    /// * `instance_profile` - (Optional) (String) ARN of registered instance profile for data access.  If it's not specified, then the `cluster_id` should be provided, and the cluster should have an instance profile attached to it. If both `cluster_id` &amp; `instance_profile` are specified, then `cluster_id` takes precedence.
    /// * `bucket_name` - (Required) (String) S3 bucket name to be mounted.
    /// 
    /// ### Example of mounting S3
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // now you can do `%fs ls /mnt/experiments` in notebooks
    ///     var @this = new Databricks.Mount("this", new()
    ///     {
    ///         Name = "experiments",
    ///         S3 = new Databricks.Inputs.MountS3Args
    ///         {
    ///             InstanceProfile = ds.Id,
    ///             BucketName = thisAwsS3Bucket.Bucket,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## abfs block
    /// 
    /// This block allows specifying parameters for mounting of the ADLS Gen2. The following arguments are required inside the `abfs` block:
    /// 
    /// * `client_id` - (Required) (String) This is the client_id (Application Object ID) for the enterprise application for the service principal.
    /// * `tenant_id` - (Optional) (String) This is your azure directory tenant id. It is required for creating the mount. (Could be omitted if Azure authentication is used, and we can extract `tenant_id` from it).
    /// * `client_secret_key` - (Required) (String) This is the secret key in which your service principal/enterprise app client secret will be stored.
    /// * `client_secret_scope` - (Required) (String) This is the secret scope in which your service principal/enterprise app client secret will be stored.
    /// * `container_name` - (Required) (String) ADLS gen2 container name. (Could be omitted if `resource_id` is provided)
    /// * `storage_account_name` - (Required) (String) The name of the storage resource in which the data is. (Could be omitted if `resource_id` is provided)
    /// * `directory` - (Computed) (String) This is optional if you don't want to add an additional directory that you wish to mount. This must start with a "/".
    /// * `initialize_file_system` - (Required) (Bool) either or not initialize FS for the first use
    /// 
    /// ### Creating mount for ADLS Gen2 using abfs block
    /// 
    /// In this example, we're using Azure authentication, so we can omit some parameters (`tenant_id`, `storage_account_name`, and `container_name`) that will be detected automatically.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var terraform = new Databricks.SecretScope("terraform", new()
    ///     {
    ///         Name = "application",
    ///         InitialManagePrincipal = "users",
    ///     });
    /// 
    ///     var servicePrincipalKey = new Databricks.Secret("service_principal_key", new()
    ///     {
    ///         Key = "service_principal_key",
    ///         StringValue = ARM_CLIENT_SECRET,
    ///         Scope = terraform.Name,
    ///     });
    /// 
    ///     var @this = new Azure.Storage.Account("this", new()
    ///     {
    ///         Name = $"{prefix}datalake",
    ///         ResourceGroupName = resourceGroupName,
    ///         Location = resourceGroupLocation,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "GRS",
    ///         AccountKind = "StorageV2",
    ///         IsHnsEnabled = true,
    ///     });
    /// 
    ///     var thisAssignment = new Azure.Authorization.Assignment("this", new()
    ///     {
    ///         Scope = @this.Id,
    ///         RoleDefinitionName = "Storage Blob Data Contributor",
    ///         PrincipalId = current.ObjectId,
    ///     });
    /// 
    ///     var thisContainer = new Azure.Storage.Container("this", new()
    ///     {
    ///         Name = "marketing",
    ///         StorageAccountName = @this.Name,
    ///         ContainerAccessType = "private",
    ///     });
    /// 
    ///     var marketing = new Databricks.Mount("marketing", new()
    ///     {
    ///         Name = "marketing",
    ///         ResourceId = thisContainer.ResourceManagerId,
    ///         Abfs = new Databricks.Inputs.MountAbfsArgs
    ///         {
    ///             ClientId = current.ClientId,
    ///             ClientSecretScope = terraform.Name,
    ///             ClientSecretKey = servicePrincipalKey.Key,
    ///             InitializeFileSystem = true,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gs block
    /// 
    /// This block allows specifying parameters for mounting of the Google Cloud Storage. The following arguments are required inside the `gs` block:
    /// 
    /// * `service_account` - (Optional) (String) email of registered [Google Service Account](https://docs.gcp.databricks.com/data/data-sources/google/gcs.html#step-1-set-up-google-cloud-service-account-using-google-cloud-console) for data access.  If it's not specified, then the `cluster_id` should be provided, and the cluster should have a Google service account attached to it.
    /// * `bucket_name` - (Required) (String) GCS bucket name to be mounted.
    /// 
    /// ### Example mounting Google Cloud Storage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var thisGs = new Databricks.Mount("this_gs", new()
    ///     {
    ///         Name = "gs-mount",
    ///         Gs = new Databricks.Inputs.MountGsArgs
    ///         {
    ///             ServiceAccount = "acc@company.iam.gserviceaccount.com",
    ///             BucketName = "mybucket",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## adl block
    /// 
    /// This block allows specifying parameters for mounting of the ADLS Gen1. The following arguments are required inside the `adl` block:
    /// 
    /// * `client_id` - (Required) (String) This is the client_id for the enterprise application for the service principal.
    /// * `tenant_id` - (Optional) (String) This is your azure directory tenant id. It is required for creating the mount. (Could be omitted if Azure authentication is used, and we can extract `tenant_id` from it)
    /// * `client_secret_key` - (Required) (String) This is the secret key in which your service principal/enterprise app client secret will be stored.
    /// * `client_secret_scope` - (Required) (String) This is the secret scope in which your service principal/enterprise app client secret will be stored.
    /// 
    /// * `storage_resource_name` - (Required) (String) The name of the storage resource in which the data is for ADLS gen 1. This is what you are trying to mount. (Could be omitted if `resource_id` is provided)
    /// * `spark_conf_prefix` - (Optional) (String) This is the spark configuration prefix for adls gen 1 mount. The options are `fs.adl`, `dfs.adls`. Use `fs.adl` for runtime 6.0 and above for the clusters. Otherwise use `dfs.adls`. The default value is: `fs.adl`.
    /// * `directory` - (Computed) (String) This is optional if you don't want to add an additional directory that you wish to mount. This must start with a "/".
    /// 
    /// ### Example mounting ADLS Gen1
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var mount = new Databricks.Mount("mount", new()
    ///     {
    ///         Name = "{var.RANDOM}",
    ///         Adl = new Databricks.Inputs.MountAdlArgs
    ///         {
    ///             StorageResourceName = "{env.TEST_STORAGE_ACCOUNT_NAME}",
    ///             TenantId = current.TenantId,
    ///             ClientId = current.ClientId,
    ///             ClientSecretScope = terraform.Name,
    ///             ClientSecretKey = servicePrincipalKey.Key,
    ///             SparkConfPrefix = "fs.adl",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## wasb block
    /// 
    /// This block allows specifying parameters for mounting of the Azure Blob Storage. The following arguments are required inside the `wasb` block:
    /// 
    /// * `auth_type` - (Required) (String) This is the auth type for blob storage. This can either be SAS tokens (`SAS`) or account access keys (`ACCESS_KEY`).
    /// * `token_secret_scope` - (Required) (String) This is the secret scope in which your auth type token is stored.
    /// * `token_secret_key` - (Required) (String) This is the secret key in which your auth type token is stored.
    /// * `container_name` - (Required) (String) The container in which the data is. This is what you are trying to mount. (Could be omitted if `resource_id` is provided)
    /// * `storage_account_name` - (Required) (String) The name of the storage resource in which the data is. (Could be omitted if `resource_id` is provided)
    /// * `directory` - (Computed) (String) This is optional if you don't want to add an additional directory that you wish to mount. This must start with a "/".
    /// 
    /// ### Example mounting Azure Blob Storage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var blobaccount = new Azure.Storage.Account("blobaccount", new()
    ///     {
    ///         Name = $"{prefix}blob",
    ///         ResourceGroupName = resourceGroupName,
    ///         Location = resourceGroupLocation,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///         AccountKind = "StorageV2",
    ///     });
    /// 
    ///     var marketing = new Azure.Storage.Container("marketing", new()
    ///     {
    ///         Name = "marketing",
    ///         StorageAccountName = blobaccount.Name,
    ///         ContainerAccessType = "private",
    ///     });
    /// 
    ///     var terraform = new Databricks.SecretScope("terraform", new()
    ///     {
    ///         Name = "application",
    ///         InitialManagePrincipal = "users",
    ///     });
    /// 
    ///     var storageKey = new Databricks.Secret("storage_key", new()
    ///     {
    ///         Key = "blob_storage_key",
    ///         StringValue = blobaccount.PrimaryAccessKey,
    ///         Scope = terraform.Name,
    ///     });
    /// 
    ///     var marketingMount = new Databricks.Mount("marketing", new()
    ///     {
    ///         Name = "marketing",
    ///         Wasb = new Databricks.Inputs.MountWasbArgs
    ///         {
    ///             ContainerName = marketing.Name,
    ///             StorageAccountName = blobaccount.Name,
    ///             AuthType = "ACCESS_KEY",
    ///             TokenSecretScope = terraform.Name,
    ///             TokenSecretKey = storageKey.Key,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Migration from other mount resources
    /// 
    /// Migration from the specific mount resource is straightforward:
    /// 
    /// * rename `mount_name` to `name`
    /// * wrap storage-specific settings (`container_name`, ...) into corresponding block (`adl`, `abfs`, `s3`, `wasbs`)
    /// * for S3 mounts, rename `s3_bucket_name` to `bucket_name`
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * End to end workspace management guide.
    /// * databricks.getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
    /// * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
    /// * databricks.DbfsFile data to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
    /// * databricks.getDbfsFilePaths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
    /// * databricks.DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
    /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
    /// * databricks.Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
    /// 
    /// ## Import
    /// 
    /// -&gt; **Note** Importing this resource is not currently supported.
    /// </summary>
    [DatabricksResourceType("databricks:index/mount:Mount")]
    public partial class Mount : global::Pulumi.CustomResource
    {
        [Output("abfs")]
        public Output<Outputs.MountAbfs?> Abfs { get; private set; } = null!;

        [Output("adl")]
        public Output<Outputs.MountAdl?> Adl { get; private set; } = null!;

        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        [Output("encryptionType")]
        public Output<string?> EncryptionType { get; private set; } = null!;

        [Output("extraConfigs")]
        public Output<ImmutableDictionary<string, object>?> ExtraConfigs { get; private set; } = null!;

        [Output("gs")]
        public Output<Outputs.MountGs?> Gs { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("resourceId")]
        public Output<string?> ResourceId { get; private set; } = null!;

        [Output("s3")]
        public Output<Outputs.MountS3?> S3 { get; private set; } = null!;

        /// <summary>
        /// (String) HDFS-compatible url
        /// </summary>
        [Output("source")]
        public Output<string> Source { get; private set; } = null!;

        [Output("uri")]
        public Output<string?> Uri { get; private set; } = null!;

        [Output("wasb")]
        public Output<Outputs.MountWasb?> Wasb { get; private set; } = null!;


        /// <summary>
        /// Create a Mount resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Mount(string name, MountArgs? args = null, CustomResourceOptions? options = null)
            : base("databricks:index/mount:Mount", name, args ?? new MountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Mount(string name, Input<string> id, MountState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/mount:Mount", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Mount resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Mount Get(string name, Input<string> id, MountState? state = null, CustomResourceOptions? options = null)
        {
            return new Mount(name, id, state, options);
        }
    }

    public sealed class MountArgs : global::Pulumi.ResourceArgs
    {
        [Input("abfs")]
        public Input<Inputs.MountAbfsArgs>? Abfs { get; set; }

        [Input("adl")]
        public Input<Inputs.MountAdlArgs>? Adl { get; set; }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("encryptionType")]
        public Input<string>? EncryptionType { get; set; }

        [Input("extraConfigs")]
        private InputMap<object>? _extraConfigs;
        public InputMap<object> ExtraConfigs
        {
            get => _extraConfigs ?? (_extraConfigs = new InputMap<object>());
            set => _extraConfigs = value;
        }

        [Input("gs")]
        public Input<Inputs.MountGsArgs>? Gs { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        [Input("s3")]
        public Input<Inputs.MountS3Args>? S3 { get; set; }

        [Input("uri")]
        public Input<string>? Uri { get; set; }

        [Input("wasb")]
        public Input<Inputs.MountWasbArgs>? Wasb { get; set; }

        public MountArgs()
        {
        }
        public static new MountArgs Empty => new MountArgs();
    }

    public sealed class MountState : global::Pulumi.ResourceArgs
    {
        [Input("abfs")]
        public Input<Inputs.MountAbfsGetArgs>? Abfs { get; set; }

        [Input("adl")]
        public Input<Inputs.MountAdlGetArgs>? Adl { get; set; }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("encryptionType")]
        public Input<string>? EncryptionType { get; set; }

        [Input("extraConfigs")]
        private InputMap<object>? _extraConfigs;
        public InputMap<object> ExtraConfigs
        {
            get => _extraConfigs ?? (_extraConfigs = new InputMap<object>());
            set => _extraConfigs = value;
        }

        [Input("gs")]
        public Input<Inputs.MountGsGetArgs>? Gs { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        [Input("s3")]
        public Input<Inputs.MountS3GetArgs>? S3 { get; set; }

        /// <summary>
        /// (String) HDFS-compatible url
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        [Input("uri")]
        public Input<string>? Uri { get; set; }

        [Input("wasb")]
        public Input<Inputs.MountWasbGetArgs>? Wasb { get; set; }

        public MountState()
        {
        }
        public static new MountState Empty => new MountState();
    }
}
