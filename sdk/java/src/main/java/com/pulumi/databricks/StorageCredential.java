// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.StorageCredentialArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.StorageCredentialState;
import com.pulumi.databricks.outputs.StorageCredentialAwsIamRole;
import com.pulumi.databricks.outputs.StorageCredentialAzureManagedIdentity;
import com.pulumi.databricks.outputs.StorageCredentialAzureServicePrincipal;
import com.pulumi.databricks.outputs.StorageCredentialDatabricksGcpServiceAccount;
import com.pulumi.databricks.outputs.StorageCredentialGcpServiceAccountKey;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **Note** This resource could be used with account or workspace-level provider.
 * 
 * To work with external tables, Unity Catalog introduces two new objects to access and work with external cloud storage:
 * 
 * - `databricks.StorageCredential` represents authentication methods to access cloud storage (e.g. an IAM role for Amazon S3 or a service principal/managed identity for Azure Storage). Storage credentials are access-controlled to determine which users can use the credential.
 * - databricks.ExternalLocation are objects that combine a cloud storage path with a Storage Credential that can be used to access the location.
 * 
 * ## Example Usage
 * 
 * For AWS
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.StorageCredential;
 * import com.pulumi.databricks.StorageCredentialArgs;
 * import com.pulumi.databricks.inputs.StorageCredentialAwsIamRoleArgs;
 * import com.pulumi.databricks.Grants;
 * import com.pulumi.databricks.GrantsArgs;
 * import com.pulumi.databricks.inputs.GrantsGrantArgs;
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
 *         var external = new StorageCredential("external", StorageCredentialArgs.builder()        
 *             .name(externalDataAccess.name())
 *             .awsIamRole(StorageCredentialAwsIamRoleArgs.builder()
 *                 .roleArn(externalDataAccess.arn())
 *                 .build())
 *             .comment("Managed by TF")
 *             .build());
 * 
 *         var externalCreds = new Grants("externalCreds", GrantsArgs.builder()        
 *             .storageCredential(external.id())
 *             .grants(GrantsGrantArgs.builder()
 *                 .principal("Data Engineers")
 *                 .privileges("CREATE_EXTERNAL_TABLE")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * For Azure
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.StorageCredential;
 * import com.pulumi.databricks.StorageCredentialArgs;
 * import com.pulumi.databricks.inputs.StorageCredentialAzureManagedIdentityArgs;
 * import com.pulumi.databricks.Grants;
 * import com.pulumi.databricks.GrantsArgs;
 * import com.pulumi.databricks.inputs.GrantsGrantArgs;
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
 *         var externalMi = new StorageCredential("externalMi", StorageCredentialArgs.builder()        
 *             .name("mi_credential")
 *             .azureManagedIdentity(StorageCredentialAzureManagedIdentityArgs.builder()
 *                 .accessConnectorId(example.id())
 *                 .build())
 *             .comment("Managed identity credential managed by TF")
 *             .build());
 * 
 *         var externalCreds = new Grants("externalCreds", GrantsArgs.builder()        
 *             .storageCredential(external.id())
 *             .grants(GrantsGrantArgs.builder()
 *                 .principal("Data Engineers")
 *                 .privileges("CREATE_EXTERNAL_TABLE")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * For GCP
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.StorageCredential;
 * import com.pulumi.databricks.StorageCredentialArgs;
 * import com.pulumi.databricks.inputs.StorageCredentialDatabricksGcpServiceAccountArgs;
 * import com.pulumi.databricks.Grants;
 * import com.pulumi.databricks.GrantsArgs;
 * import com.pulumi.databricks.inputs.GrantsGrantArgs;
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
 *         var external = new StorageCredential("external", StorageCredentialArgs.builder()        
 *             .name("the-creds")
 *             .databricksGcpServiceAccount()
 *             .build());
 * 
 *         var externalCreds = new Grants("externalCreds", GrantsArgs.builder()        
 *             .storageCredential(external.id())
 *             .grants(GrantsGrantArgs.builder()
 *                 .principal("Data Engineers")
 *                 .privileges("CREATE_EXTERNAL_TABLE")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * This resource can be imported by name:
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/storageCredential:StorageCredential this &lt;name&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/storageCredential:StorageCredential")
public class StorageCredential extends com.pulumi.resources.CustomResource {
    @Export(name="awsIamRole", refs={StorageCredentialAwsIamRole.class}, tree="[0]")
    private Output</* @Nullable */ StorageCredentialAwsIamRole> awsIamRole;

    public Output<Optional<StorageCredentialAwsIamRole>> awsIamRole() {
        return Codegen.optional(this.awsIamRole);
    }
    @Export(name="azureManagedIdentity", refs={StorageCredentialAzureManagedIdentity.class}, tree="[0]")
    private Output</* @Nullable */ StorageCredentialAzureManagedIdentity> azureManagedIdentity;

    public Output<Optional<StorageCredentialAzureManagedIdentity>> azureManagedIdentity() {
        return Codegen.optional(this.azureManagedIdentity);
    }
    @Export(name="azureServicePrincipal", refs={StorageCredentialAzureServicePrincipal.class}, tree="[0]")
    private Output</* @Nullable */ StorageCredentialAzureServicePrincipal> azureServicePrincipal;

    public Output<Optional<StorageCredentialAzureServicePrincipal>> azureServicePrincipal() {
        return Codegen.optional(this.azureServicePrincipal);
    }
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    @Export(name="databricksGcpServiceAccount", refs={StorageCredentialDatabricksGcpServiceAccount.class}, tree="[0]")
    private Output<StorageCredentialDatabricksGcpServiceAccount> databricksGcpServiceAccount;

    public Output<StorageCredentialDatabricksGcpServiceAccount> databricksGcpServiceAccount() {
        return this.databricksGcpServiceAccount;
    }
    /**
     * Delete storage credential regardless of its dependencies.
     * 
     */
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Delete storage credential regardless of its dependencies.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * Update storage credential regardless of its dependents.
     * 
     * `aws_iam_role` optional configuration block for credential details for AWS:
     * 
     */
    @Export(name="forceUpdate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceUpdate;

    /**
     * @return Update storage credential regardless of its dependents.
     * 
     * `aws_iam_role` optional configuration block for credential details for AWS:
     * 
     */
    public Output<Optional<Boolean>> forceUpdate() {
        return Codegen.optional(this.forceUpdate);
    }
    @Export(name="gcpServiceAccountKey", refs={StorageCredentialGcpServiceAccountKey.class}, tree="[0]")
    private Output</* @Nullable */ StorageCredentialGcpServiceAccountKey> gcpServiceAccountKey;

    public Output<Optional<StorageCredentialGcpServiceAccountKey>> gcpServiceAccountKey() {
        return Codegen.optional(this.gcpServiceAccountKey);
    }
    /**
     * Unique identifier of the parent Metastore. If set for workspace-level, it must match the ID of the metastore assigned to the worspace. When changing the metastore assigned to a workspace, this field becomes required.
     * 
     */
    @Export(name="metastoreId", refs={String.class}, tree="[0]")
    private Output<String> metastoreId;

    /**
     * @return Unique identifier of the parent Metastore. If set for workspace-level, it must match the ID of the metastore assigned to the worspace. When changing the metastore assigned to a workspace, this field becomes required.
     * 
     */
    public Output<String> metastoreId() {
        return this.metastoreId;
    }
    /**
     * Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Username/groupname/sp application_id of the storage credential owner.
     * 
     */
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output<String> owner;

    /**
     * @return Username/groupname/sp application_id of the storage credential owner.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * Indicates whether the storage credential is only usable for read operations.
     * 
     */
    @Export(name="readOnly", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> readOnly;

    /**
     * @return Indicates whether the storage credential is only usable for read operations.
     * 
     */
    public Output<Optional<Boolean>> readOnly() {
        return Codegen.optional(this.readOnly);
    }
    /**
     * Suppress validation errors if any &amp; force save the storage credential.
     * 
     */
    @Export(name="skipValidation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipValidation;

    /**
     * @return Suppress validation errors if any &amp; force save the storage credential.
     * 
     */
    public Output<Optional<Boolean>> skipValidation() {
        return Codegen.optional(this.skipValidation);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StorageCredential(String name) {
        this(name, StorageCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StorageCredential(String name, @Nullable StorageCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StorageCredential(String name, @Nullable StorageCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/storageCredential:StorageCredential", name, args == null ? StorageCredentialArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StorageCredential(String name, Output<String> id, @Nullable StorageCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/storageCredential:StorageCredential", name, state, makeResourceOptions(options, id));
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
    public static StorageCredential get(String name, Output<String> id, @Nullable StorageCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StorageCredential(name, id, state, options);
    }
}
