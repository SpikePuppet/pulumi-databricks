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
 * Each databricks.Metastore requires an IAM role that will be assumed by Unity Catalog to access data. `databricks.MetastoreDataAccess` defines this
 * 
 * ## Import
 * 
 * This resource can be imported by combination of metastore id and the data access name. bash
 * 
 * ```sh
 *  $ pulumi import databricks:index/metastoreDataAccess:MetastoreDataAccess this &#39;&lt;metastore_id&gt;|&lt;name&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="databricks:index/metastoreDataAccess:MetastoreDataAccess")
public class MetastoreDataAccess extends com.pulumi.resources.CustomResource {
    @Export(name="awsIamRole", type=MetastoreDataAccessAwsIamRole.class, parameters={})
    private Output</* @Nullable */ MetastoreDataAccessAwsIamRole> awsIamRole;

    public Output<Optional<MetastoreDataAccessAwsIamRole>> awsIamRole() {
        return Codegen.optional(this.awsIamRole);
    }
    @Export(name="azureManagedIdentity", type=MetastoreDataAccessAzureManagedIdentity.class, parameters={})
    private Output</* @Nullable */ MetastoreDataAccessAzureManagedIdentity> azureManagedIdentity;

    public Output<Optional<MetastoreDataAccessAzureManagedIdentity>> azureManagedIdentity() {
        return Codegen.optional(this.azureManagedIdentity);
    }
    @Export(name="azureServicePrincipal", type=MetastoreDataAccessAzureServicePrincipal.class, parameters={})
    private Output</* @Nullable */ MetastoreDataAccessAzureServicePrincipal> azureServicePrincipal;

    public Output<Optional<MetastoreDataAccessAzureServicePrincipal>> azureServicePrincipal() {
        return Codegen.optional(this.azureServicePrincipal);
    }
    @Export(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    @Export(name="databricksGcpServiceAccount", type=MetastoreDataAccessDatabricksGcpServiceAccount.class, parameters={})
    private Output<MetastoreDataAccessDatabricksGcpServiceAccount> databricksGcpServiceAccount;

    public Output<MetastoreDataAccessDatabricksGcpServiceAccount> databricksGcpServiceAccount() {
        return this.databricksGcpServiceAccount;
    }
    /**
     * Delete the data access configuration regardless of its dependencies.
     * 
     * `aws_iam_role` optional configuration block for credential details for AWS:
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Delete the data access configuration regardless of its dependencies.
     * 
     * `aws_iam_role` optional configuration block for credential details for AWS:
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    @Export(name="gcpServiceAccountKey", type=MetastoreDataAccessGcpServiceAccountKey.class, parameters={})
    private Output</* @Nullable */ MetastoreDataAccessGcpServiceAccountKey> gcpServiceAccountKey;

    public Output<Optional<MetastoreDataAccessGcpServiceAccountKey>> gcpServiceAccountKey() {
        return Codegen.optional(this.gcpServiceAccountKey);
    }
    @Export(name="isDefault", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isDefault;

    public Output<Optional<Boolean>> isDefault() {
        return Codegen.optional(this.isDefault);
    }
    /**
     * Unique identifier of the parent Metastore
     * 
     */
    @Export(name="metastoreId", type=String.class, parameters={})
    private Output<String> metastoreId;

    /**
     * @return Unique identifier of the parent Metastore
     * 
     */
    public Output<String> metastoreId() {
        return this.metastoreId;
    }
    /**
     * Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Username/groupname/sp application_id of the data access configuration owner.
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return Username/groupname/sp application_id of the data access configuration owner.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    @Export(name="readOnly", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> readOnly;

    public Output<Optional<Boolean>> readOnly() {
        return Codegen.optional(this.readOnly);
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
    public MetastoreDataAccess(String name, MetastoreDataAccessArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetastoreDataAccess(String name, MetastoreDataAccessArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
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
