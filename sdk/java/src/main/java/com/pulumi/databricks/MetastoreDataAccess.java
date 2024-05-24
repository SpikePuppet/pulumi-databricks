// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MetastoreDataAccessArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MetastoreDataAccessState;
import com.pulumi.databricks.outputs.MetastoreDataAccessAwsIamRole;
import com.pulumi.databricks.outputs.MetastoreDataAccessAzureManagedIdentity;
import com.pulumi.databricks.outputs.MetastoreDataAccessAzureServicePrincipal;
import com.pulumi.databricks.outputs.MetastoreDataAccessDatabricksGcpServiceAccount;
import com.pulumi.databricks.outputs.MetastoreDataAccessGcpServiceAccountKey;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **Note** This resource could be used with account or workspace-level provider.
 * 
 * Optionally, each databricks.Metastore can have a default databricks.StorageCredential defined as `databricks.MetastoreDataAccess`. This will be used by Unity Catalog to access data in the root storage location if defined.
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
 * import com.pulumi.databricks.Metastore;
 * import com.pulumi.databricks.MetastoreArgs;
 * import com.pulumi.databricks.MetastoreDataAccess;
 * import com.pulumi.databricks.MetastoreDataAccessArgs;
 * import com.pulumi.databricks.inputs.MetastoreDataAccessAwsIamRoleArgs;
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
 *         var this_ = new Metastore("this", MetastoreArgs.builder()
 *             .name("primary")
 *             .storageRoot(String.format("s3://%s/metastore", metastore.id()))
 *             .owner("uc admins")
 *             .region("us-east-1")
 *             .forceDestroy(true)
 *             .build());
 * 
 *         var thisMetastoreDataAccess = new MetastoreDataAccess("thisMetastoreDataAccess", MetastoreDataAccessArgs.builder()
 *             .metastoreId(this_.id())
 *             .name(metastoreDataAccess.name())
 *             .awsIamRole(MetastoreDataAccessAwsIamRoleArgs.builder()
 *                 .roleArn(metastoreDataAccess.arn())
 *                 .build())
 *             .isDefault(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * For Azure using managed identity as credential (recommended)
 * 
 * ## Import
 * 
 * This resource can be imported by combination of metastore id and the data access name.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/metastoreDataAccess:MetastoreDataAccess this &#39;&lt;metastore_id&gt;|&lt;name&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="databricks:index/metastoreDataAccess:MetastoreDataAccess")
public class MetastoreDataAccess extends com.pulumi.resources.CustomResource {
    @Export(name="awsIamRole", refs={MetastoreDataAccessAwsIamRole.class}, tree="[0]")
    private Output</* @Nullable */ MetastoreDataAccessAwsIamRole> awsIamRole;

    public Output<Optional<MetastoreDataAccessAwsIamRole>> awsIamRole() {
        return Codegen.optional(this.awsIamRole);
    }
    @Export(name="azureManagedIdentity", refs={MetastoreDataAccessAzureManagedIdentity.class}, tree="[0]")
    private Output</* @Nullable */ MetastoreDataAccessAzureManagedIdentity> azureManagedIdentity;

    public Output<Optional<MetastoreDataAccessAzureManagedIdentity>> azureManagedIdentity() {
        return Codegen.optional(this.azureManagedIdentity);
    }
    @Export(name="azureServicePrincipal", refs={MetastoreDataAccessAzureServicePrincipal.class}, tree="[0]")
    private Output</* @Nullable */ MetastoreDataAccessAzureServicePrincipal> azureServicePrincipal;

    public Output<Optional<MetastoreDataAccessAzureServicePrincipal>> azureServicePrincipal() {
        return Codegen.optional(this.azureServicePrincipal);
    }
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    @Export(name="databricksGcpServiceAccount", refs={MetastoreDataAccessDatabricksGcpServiceAccount.class}, tree="[0]")
    private Output<MetastoreDataAccessDatabricksGcpServiceAccount> databricksGcpServiceAccount;

    public Output<MetastoreDataAccessDatabricksGcpServiceAccount> databricksGcpServiceAccount() {
        return this.databricksGcpServiceAccount;
    }
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    @Export(name="forceUpdate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceUpdate;

    public Output<Optional<Boolean>> forceUpdate() {
        return Codegen.optional(this.forceUpdate);
    }
    @Export(name="gcpServiceAccountKey", refs={MetastoreDataAccessGcpServiceAccountKey.class}, tree="[0]")
    private Output</* @Nullable */ MetastoreDataAccessGcpServiceAccountKey> gcpServiceAccountKey;

    public Output<Optional<MetastoreDataAccessGcpServiceAccountKey>> gcpServiceAccountKey() {
        return Codegen.optional(this.gcpServiceAccountKey);
    }
    /**
     * whether to set this credential as the default for the metastore. In practice, this should always be true.
     * 
     */
    @Export(name="isDefault", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isDefault;

    /**
     * @return whether to set this credential as the default for the metastore. In practice, this should always be true.
     * 
     */
    public Output<Optional<Boolean>> isDefault() {
        return Codegen.optional(this.isDefault);
    }
    @Export(name="metastoreId", refs={String.class}, tree="[0]")
    private Output<String> metastoreId;

    public Output<String> metastoreId() {
        return this.metastoreId;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output<String> owner;

    public Output<String> owner() {
        return this.owner;
    }
    @Export(name="readOnly", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> readOnly;

    public Output<Optional<Boolean>> readOnly() {
        return Codegen.optional(this.readOnly);
    }
    @Export(name="skipValidation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipValidation;

    public Output<Optional<Boolean>> skipValidation() {
        return Codegen.optional(this.skipValidation);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MetastoreDataAccess(String name) {
        this(name, MetastoreDataAccessArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MetastoreDataAccess(String name, @Nullable MetastoreDataAccessArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetastoreDataAccess(String name, @Nullable MetastoreDataAccessArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/metastoreDataAccess:MetastoreDataAccess", name, args == null ? MetastoreDataAccessArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MetastoreDataAccess(String name, Output<String> id, @Nullable MetastoreDataAccessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/metastoreDataAccess:MetastoreDataAccess", name, state, makeResourceOptions(options, id));
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
    public static MetastoreDataAccess get(String name, Output<String> id, @Nullable MetastoreDataAccessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MetastoreDataAccess(name, id, state, options);
    }
}
