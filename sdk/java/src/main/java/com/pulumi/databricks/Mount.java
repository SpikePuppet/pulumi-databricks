// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MountArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MountState;
import com.pulumi.databricks.outputs.MountAbfs;
import com.pulumi.databricks.outputs.MountAdl;
import com.pulumi.databricks.outputs.MountGs;
import com.pulumi.databricks.outputs.MountS3;
import com.pulumi.databricks.outputs.MountWasb;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource will mount your cloud storage
 * * `gs` - to [mount Google Cloud Storage](https://docs.gcp.databricks.com/data/data-sources/google/gcs.html)
 * * `abfs` - to [mount ADLS Gen2](https://docs.microsoft.com/en-us/azure/databricks/data/data-sources/azure/adls-gen2/) using Azure Blob Filesystem (ABFS) driver
 * * `adl` - to [mount ADLS Gen1](https://docs.microsoft.com/en-us/azure/databricks/data/data-sources/azure/azure-datalake) using Azure Data Lake (ADL) driver
 * * `wasb`  - to [mount Azure Blob Storage](https://docs.microsoft.com/en-us/azure/databricks/data/data-sources/azure/azure-storage) using Windows Azure Storage Blob (WASB) driver
 * 
 * 1. Use generic arguments - you have a responsibility for providing all necessary parameters that are required to mount specific storage. This is most flexible option
 * 
 * ## Common arguments
 * 
 * * `cluster_id` - (Optional, String) Cluster to use for mounting. If no cluster is specified, a new cluster will be created and will mount the bucket for all of the clusters in this workspace. If the cluster is not running - it&#39;s going to be started, so be aware to set auto-termination rules on it.
 * * `name` - (Optional, String) Name, under which mount will be accessible in `dbfs:/mnt/&lt;MOUNT_NAME&gt;`. If not specified, provider will try to infer it from depending on the resource type:
 *   * `bucket_name` for AWS S3 and Google Cloud Storage
 *   * `container_name` for ADLS Gen2 and Azure Blob Storage
 *   * `storage_resource_name` for ADLS Gen1
 * * `uri` - (Optional, String) the URI for accessing specific storage (`s3a://....`, `abfss://....`, `gs://....`, etc.)
 * * `extra_configs` - (Optional, String map) configuration parameters that are necessary for mounting of specific storage
 * * `resource_id` - (Optional, String) resource ID for a given storage account. Could be used to fill defaults, such as storage account &amp; container names on Azure.
 * * `encryption_type` - (Optional, String) encryption type. Currently used only for [AWS S3 mounts](https://docs.databricks.com/data/data-sources/aws/amazon-s3.html#encrypt-data-in-s3-buckets)
 * 
 * ### Example mounting ADLS Gen2 using uri and extra_configs
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Mount;
 * import com.pulumi.databricks.MountArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var tenantId = "00000000-1111-2222-3333-444444444444";
 * 
 *         final var clientId = "55555555-6666-7777-8888-999999999999";
 * 
 *         final var secretScope = "some-kv";
 * 
 *         final var secretKey = "some-sp-secret";
 * 
 *         final var container = "test";
 * 
 *         final var storageAcc = "lrs";
 * 
 *         var this_ = new Mount("this", MountArgs.builder()        
 *             .name("tf-abfss")
 *             .uri(String.format("abfss://%s{@literal @}%s.dfs.core.windows.net", container,storageAcc))
 *             .extraConfigs(Map.ofEntries(
 *                 Map.entry("fs.azure.account.auth.type", "OAuth"),
 *                 Map.entry("fs.azure.account.oauth.provider.type", "org.apache.hadoop.fs.azurebfs.oauth2.ClientCredsTokenProvider"),
 *                 Map.entry("fs.azure.account.oauth2.client.id", clientId),
 *                 Map.entry("fs.azure.account.oauth2.client.secret", String.format("{{{{secrets/%s/%s}}}}", secretScope,secretKey)),
 *                 Map.entry("fs.azure.account.oauth2.client.endpoint", String.format("https://login.microsoftonline.com/%s/oauth2/token", tenantId)),
 *                 Map.entry("fs.azure.createRemoteFileSystemDuringInitialization", "false")
 *             ))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example mounting ADLS Gen2 with AAD passthrough
 * 
 * &gt; **Note** AAD passthrough is considered a legacy data access pattern. Use Unity Catalog for fine-grained data access control.
 * 
 * &gt; **Note** Mounts using AAD passthrough cannot be created using a service principal.
 * 
 * To mount ALDS Gen2 with Azure Active Directory Credentials passthrough we need to execute the mount commands using the cluster configured with AAD Credentials passthrough &amp; provide necessary configuration parameters (see [documentation](https://docs.microsoft.com/en-us/azure/databricks/security/credential-passthrough/adls-passthrough#--mount-azure-data-lake-storage-to-dbfs-using-credential-passthrough) for more details).
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.databricks.DatabricksFunctions;
 * import com.pulumi.azure.databricks.inputs.GetWorkspaceArgs;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetNodeTypeArgs;
 * import com.pulumi.databricks.inputs.GetSparkVersionArgs;
 * import com.pulumi.databricks.Cluster;
 * import com.pulumi.databricks.ClusterArgs;
 * import com.pulumi.databricks.Mount;
 * import com.pulumi.databricks.MountArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var resourceGroup = config.get("resourceGroup");
 *         final var workspaceName = config.get("workspaceName");
 *         final var this = DatabricksFunctions.getWorkspace(GetWorkspaceArgs.builder()
 *             .name(workspaceName)
 *             .resourceGroupName(resourceGroup)
 *             .build());
 * 
 *         final var smallest = DatabricksFunctions.getNodeType(GetNodeTypeArgs.builder()
 *             .localDisk(true)
 *             .build());
 * 
 *         final var latest = DatabricksFunctions.getSparkVersion();
 * 
 *         var sharedPassthrough = new Cluster("sharedPassthrough", ClusterArgs.builder()        
 *             .clusterName("Shared Passthrough for mount")
 *             .sparkVersion(latest.applyValue(getSparkVersionResult -> getSparkVersionResult.id()))
 *             .nodeTypeId(smallest.applyValue(getNodeTypeResult -> getNodeTypeResult.id()))
 *             .autoterminationMinutes(10)
 *             .numWorkers(1)
 *             .sparkConf(Map.ofEntries(
 *                 Map.entry("spark.databricks.cluster.profile", "serverless"),
 *                 Map.entry("spark.databricks.repl.allowedLanguages", "python,sql"),
 *                 Map.entry("spark.databricks.passthrough.enabled", "true"),
 *                 Map.entry("spark.databricks.pyspark.enableProcessIsolation", "true")
 *             ))
 *             .customTags(Map.of("ResourceClass", "Serverless"))
 *             .build());
 * 
 *         final var storageAcc = config.get("storageAcc");
 *         final var container = config.get("container");
 *         var passthrough = new Mount("passthrough", MountArgs.builder()        
 *             .name("passthrough-test")
 *             .clusterId(sharedPassthrough.id())
 *             .uri(String.format("abfss://%s{@literal @}%s.dfs.core.windows.net", container,storageAcc))
 *             .extraConfigs(Map.ofEntries(
 *                 Map.entry("fs.azure.account.auth.type", "CustomAccessToken"),
 *                 Map.entry("fs.azure.account.custom.token.provider.class", "{{sparkconf/spark.databricks.passthrough.adls.gen2.tokenProviderClassName}}")
 *             ))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## s3 block
 * 
 * This block allows specifying parameters for mounting of the ADLS Gen2. The following arguments are required inside the `s3` block:
 * 
 * * `instance_profile` - (Optional) (String) ARN of registered instance profile for data access.  If it&#39;s not specified, then the `cluster_id` should be provided, and the cluster should have an instance profile attached to it. If both `cluster_id` &amp; `instance_profile` are specified, then `cluster_id` takes precedence.
 * * `bucket_name` - (Required) (String) S3 bucket name to be mounted.
 * 
 * ### Example of mounting S3
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Mount;
 * import com.pulumi.databricks.MountArgs;
 * import com.pulumi.databricks.inputs.MountS3Args;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // now you can do `%fs ls /mnt/experiments` in notebooks
 *         var this_ = new Mount("this", MountArgs.builder()        
 *             .name("experiments")
 *             .s3(MountS3Args.builder()
 *                 .instanceProfile(ds.id())
 *                 .bucketName(thisAwsS3Bucket.bucket())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## abfs block
 * 
 * This block allows specifying parameters for mounting of the ADLS Gen2. The following arguments are required inside the `abfs` block:
 * 
 * * `client_id` - (Required) (String) This is the client_id (Application Object ID) for the enterprise application for the service principal.
 * * `tenant_id` - (Optional) (String) This is your azure directory tenant id. It is required for creating the mount. (Could be omitted if Azure authentication is used, and we can extract `tenant_id` from it).
 * * `client_secret_key` - (Required) (String) This is the secret key in which your service principal/enterprise app client secret will be stored.
 * * `client_secret_scope` - (Required) (String) This is the secret scope in which your service principal/enterprise app client secret will be stored.
 * * `container_name` - (Required) (String) ADLS gen2 container name. (Could be omitted if `resource_id` is provided)
 * * `storage_account_name` - (Required) (String) The name of the storage resource in which the data is. (Could be omitted if `resource_id` is provided)
 * * `directory` - (Computed) (String) This is optional if you don&#39;t want to add an additional directory that you wish to mount. This must start with a &#34;/&#34;.
 * * `initialize_file_system` - (Required) (Bool) either or not initialize FS for the first use
 * 
 * ### Creating mount for ADLS Gen2 using abfs block
 * 
 * In this example, we&#39;re using Azure authentication, so we can omit some parameters (`tenant_id`, `storage_account_name`, and `container_name`) that will be detected automatically.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.SecretScope;
 * import com.pulumi.databricks.SecretScopeArgs;
 * import com.pulumi.databricks.Secret;
 * import com.pulumi.databricks.SecretArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.authorization.Assignment;
 * import com.pulumi.azure.authorization.AssignmentArgs;
 * import com.pulumi.azure.storage.Container;
 * import com.pulumi.azure.storage.ContainerArgs;
 * import com.pulumi.databricks.Mount;
 * import com.pulumi.databricks.MountArgs;
 * import com.pulumi.databricks.inputs.MountAbfsArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var terraform = new SecretScope("terraform", SecretScopeArgs.builder()        
 *             .name("application")
 *             .initialManagePrincipal("users")
 *             .build());
 * 
 *         var servicePrincipalKey = new Secret("servicePrincipalKey", SecretArgs.builder()        
 *             .key("service_principal_key")
 *             .stringValue(ARM_CLIENT_SECRET)
 *             .scope(terraform.name())
 *             .build());
 * 
 *         var this_ = new Account("this", AccountArgs.builder()        
 *             .name(String.format("%sdatalake", prefix))
 *             .resourceGroupName(resourceGroupName)
 *             .location(resourceGroupLocation)
 *             .accountTier("Standard")
 *             .accountReplicationType("GRS")
 *             .accountKind("StorageV2")
 *             .isHnsEnabled(true)
 *             .build());
 * 
 *         var thisAssignment = new Assignment("thisAssignment", AssignmentArgs.builder()        
 *             .scope(this_.id())
 *             .roleDefinitionName("Storage Blob Data Contributor")
 *             .principalId(current.objectId())
 *             .build());
 * 
 *         var thisContainer = new Container("thisContainer", ContainerArgs.builder()        
 *             .name("marketing")
 *             .storageAccountName(this_.name())
 *             .containerAccessType("private")
 *             .build());
 * 
 *         var marketing = new Mount("marketing", MountArgs.builder()        
 *             .name("marketing")
 *             .resourceId(thisContainer.resourceManagerId())
 *             .abfs(MountAbfsArgs.builder()
 *                 .clientId(current.clientId())
 *                 .clientSecretScope(terraform.name())
 *                 .clientSecretKey(servicePrincipalKey.key())
 *                 .initializeFileSystem(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## gs block
 * 
 * This block allows specifying parameters for mounting of the Google Cloud Storage. The following arguments are required inside the `gs` block:
 * 
 * * `service_account` - (Optional) (String) email of registered [Google Service Account](https://docs.gcp.databricks.com/data/data-sources/google/gcs.html#step-1-set-up-google-cloud-service-account-using-google-cloud-console) for data access.  If it&#39;s not specified, then the `cluster_id` should be provided, and the cluster should have a Google service account attached to it.
 * * `bucket_name` - (Required) (String) GCS bucket name to be mounted.
 * 
 * ### Example mounting Google Cloud Storage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Mount;
 * import com.pulumi.databricks.MountArgs;
 * import com.pulumi.databricks.inputs.MountGsArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var thisGs = new Mount("thisGs", MountArgs.builder()        
 *             .name("gs-mount")
 *             .gs(MountGsArgs.builder()
 *                 .serviceAccount("acc{@literal @}company.iam.gserviceaccount.com")
 *                 .bucketName("mybucket")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## adl block
 * 
 * This block allows specifying parameters for mounting of the ADLS Gen1. The following arguments are required inside the `adl` block:
 * 
 * * `client_id` - (Required) (String) This is the client_id for the enterprise application for the service principal.
 * * `tenant_id` - (Optional) (String) This is your azure directory tenant id. It is required for creating the mount. (Could be omitted if Azure authentication is used, and we can extract `tenant_id` from it)
 * * `client_secret_key` - (Required) (String) This is the secret key in which your service principal/enterprise app client secret will be stored.
 * * `client_secret_scope` - (Required) (String) This is the secret scope in which your service principal/enterprise app client secret will be stored.
 * 
 * * `storage_resource_name` - (Required) (String) The name of the storage resource in which the data is for ADLS gen 1. This is what you are trying to mount. (Could be omitted if `resource_id` is provided)
 * * `spark_conf_prefix` - (Optional) (String) This is the spark configuration prefix for adls gen 1 mount. The options are `fs.adl`, `dfs.adls`. Use `fs.adl` for runtime 6.0 and above for the clusters. Otherwise use `dfs.adls`. The default value is: `fs.adl`.
 * * `directory` - (Computed) (String) This is optional if you don&#39;t want to add an additional directory that you wish to mount. This must start with a &#34;/&#34;.
 * 
 * ### Example mounting ADLS Gen1
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Mount;
 * import com.pulumi.databricks.MountArgs;
 * import com.pulumi.databricks.inputs.MountAdlArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var mount = new Mount("mount", MountArgs.builder()        
 *             .name("{var.RANDOM}")
 *             .adl(MountAdlArgs.builder()
 *                 .storageResourceName("{env.TEST_STORAGE_ACCOUNT_NAME}")
 *                 .tenantId(current.tenantId())
 *                 .clientId(current.clientId())
 *                 .clientSecretScope(terraform.name())
 *                 .clientSecretKey(servicePrincipalKey.key())
 *                 .sparkConfPrefix("fs.adl")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## wasb block
 * 
 * This block allows specifying parameters for mounting of the Azure Blob Storage. The following arguments are required inside the `wasb` block:
 * 
 * * `auth_type` - (Required) (String) This is the auth type for blob storage. This can either be SAS tokens (`SAS`) or account access keys (`ACCESS_KEY`).
 * * `token_secret_scope` - (Required) (String) This is the secret scope in which your auth type token is stored.
 * * `token_secret_key` - (Required) (String) This is the secret key in which your auth type token is stored.
 * * `container_name` - (Required) (String) The container in which the data is. This is what you are trying to mount. (Could be omitted if `resource_id` is provided)
 * * `storage_account_name` - (Required) (String) The name of the storage resource in which the data is. (Could be omitted if `resource_id` is provided)
 * * `directory` - (Computed) (String) This is optional if you don&#39;t want to add an additional directory that you wish to mount. This must start with a &#34;/&#34;.
 * 
 * ### Example mounting Azure Blob Storage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.storage.Container;
 * import com.pulumi.azure.storage.ContainerArgs;
 * import com.pulumi.databricks.SecretScope;
 * import com.pulumi.databricks.SecretScopeArgs;
 * import com.pulumi.databricks.Secret;
 * import com.pulumi.databricks.SecretArgs;
 * import com.pulumi.databricks.Mount;
 * import com.pulumi.databricks.MountArgs;
 * import com.pulumi.databricks.inputs.MountWasbArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var blobaccount = new Account("blobaccount", AccountArgs.builder()        
 *             .name(String.format("%sblob", prefix))
 *             .resourceGroupName(resourceGroupName)
 *             .location(resourceGroupLocation)
 *             .accountTier("Standard")
 *             .accountReplicationType("LRS")
 *             .accountKind("StorageV2")
 *             .build());
 * 
 *         var marketing = new Container("marketing", ContainerArgs.builder()        
 *             .name("marketing")
 *             .storageAccountName(blobaccount.name())
 *             .containerAccessType("private")
 *             .build());
 * 
 *         var terraform = new SecretScope("terraform", SecretScopeArgs.builder()        
 *             .name("application")
 *             .initialManagePrincipal("users")
 *             .build());
 * 
 *         var storageKey = new Secret("storageKey", SecretArgs.builder()        
 *             .key("blob_storage_key")
 *             .stringValue(blobaccount.primaryAccessKey())
 *             .scope(terraform.name())
 *             .build());
 * 
 *         var marketingMount = new Mount("marketingMount", MountArgs.builder()        
 *             .name("marketing")
 *             .wasb(MountWasbArgs.builder()
 *                 .containerName(marketing.name())
 *                 .storageAccountName(blobaccount.name())
 *                 .authType("ACCESS_KEY")
 *                 .tokenSecretScope(terraform.name())
 *                 .tokenSecretKey(storageKey.key())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Migration from other mount resources
 * 
 * Migration from the specific mount resource is straightforward:
 * 
 * * rename `mount_name` to `name`
 * * wrap storage-specific settings (`container_name`, ...) into corresponding block (`adl`, `abfs`, `s3`, `wasbs`)
 * * for S3 mounts, rename `s3_bucket_name` to `bucket_name`
 * 
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * End to end workspace management guide.
 * * databricks.getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
 * * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
 * * databricks.DbfsFile data to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
 * * databricks.getDbfsFilePaths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
 * * databricks.DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 * * databricks.Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
 * 
 * ## Import
 * 
 * -&gt; **Note** Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/mount:Mount")
public class Mount extends com.pulumi.resources.CustomResource {
    @Export(name="abfs", refs={MountAbfs.class}, tree="[0]")
    private Output</* @Nullable */ MountAbfs> abfs;

    public Output<Optional<MountAbfs>> abfs() {
        return Codegen.optional(this.abfs);
    }
    @Export(name="adl", refs={MountAdl.class}, tree="[0]")
    private Output</* @Nullable */ MountAdl> adl;

    public Output<Optional<MountAdl>> adl() {
        return Codegen.optional(this.adl);
    }
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    public Output<String> clusterId() {
        return this.clusterId;
    }
    @Export(name="encryptionType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> encryptionType;

    public Output<Optional<String>> encryptionType() {
        return Codegen.optional(this.encryptionType);
    }
    @Export(name="extraConfigs", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> extraConfigs;

    public Output<Optional<Map<String,Object>>> extraConfigs() {
        return Codegen.optional(this.extraConfigs);
    }
    @Export(name="gs", refs={MountGs.class}, tree="[0]")
    private Output</* @Nullable */ MountGs> gs;

    public Output<Optional<MountGs>> gs() {
        return Codegen.optional(this.gs);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="resourceId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resourceId;

    public Output<Optional<String>> resourceId() {
        return Codegen.optional(this.resourceId);
    }
    @Export(name="s3", refs={MountS3.class}, tree="[0]")
    private Output</* @Nullable */ MountS3> s3;

    public Output<Optional<MountS3>> s3() {
        return Codegen.optional(this.s3);
    }
    /**
     * (String) HDFS-compatible url
     * 
     */
    @Export(name="source", refs={String.class}, tree="[0]")
    private Output<String> source;

    /**
     * @return (String) HDFS-compatible url
     * 
     */
    public Output<String> source() {
        return this.source;
    }
    @Export(name="uri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> uri;

    public Output<Optional<String>> uri() {
        return Codegen.optional(this.uri);
    }
    @Export(name="wasb", refs={MountWasb.class}, tree="[0]")
    private Output</* @Nullable */ MountWasb> wasb;

    public Output<Optional<MountWasb>> wasb() {
        return Codegen.optional(this.wasb);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Mount(String name) {
        this(name, MountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Mount(String name, @Nullable MountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Mount(String name, @Nullable MountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mount:Mount", name, args == null ? MountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Mount(String name, Output<String> id, @Nullable MountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mount:Mount", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Mount get(String name, Output<String> id, @Nullable MountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Mount(name, id, state, options);
    }
}
