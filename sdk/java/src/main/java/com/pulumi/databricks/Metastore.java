// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MetastoreArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MetastoreState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **Note** This resource could be used with account or workspace-level provider.
 * 
 * A metastore is the top-level container of objects in Unity Catalog. It stores data assets (tables and views) and the permissions that govern access to them. Databricks account admins can create metastores and assign them to Databricks workspaces in order to control which workloads use each metastore.
 * 
 * Unity Catalog offers a new metastore with built in security and auditing. This is distinct to the metastore used in previous versions of Databricks (based on the Hive Metastore).
 * 
 * A Unity Catalog metastore can be created without a root location &amp; credential to maintain strict separation of storage across catalogs or environments.
 * 
 * ## Import
 * 
 * This resource can be imported by ID:
 * 
 *  bash
 * 
 * ```sh
 * $ pulumi import databricks:index/metastore:Metastore this &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/metastore:Metastore")
public class Metastore extends com.pulumi.resources.CustomResource {
    @Export(name="cloud", refs={String.class}, tree="[0]")
    private Output<String> cloud;

    public Output<String> cloud() {
        return this.cloud;
    }
    @Export(name="createdAt", refs={Integer.class}, tree="[0]")
    private Output<Integer> createdAt;

    public Output<Integer> createdAt() {
        return this.createdAt;
    }
    @Export(name="createdBy", refs={String.class}, tree="[0]")
    private Output<String> createdBy;

    public Output<String> createdBy() {
        return this.createdBy;
    }
    @Export(name="defaultDataAccessConfigId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultDataAccessConfigId;

    public Output<Optional<String>> defaultDataAccessConfigId() {
        return Codegen.optional(this.defaultDataAccessConfigId);
    }
    /**
     * The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing. Once this is set it cannot be removed and can only be modified to another valid value. To delete this value please taint and recreate the resource.
     * 
     */
    @Export(name="deltaSharingOrganizationName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deltaSharingOrganizationName;

    /**
     * @return The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing. Once this is set it cannot be removed and can only be modified to another valid value. To delete this value please taint and recreate the resource.
     * 
     */
    public Output<Optional<String>> deltaSharingOrganizationName() {
        return Codegen.optional(this.deltaSharingOrganizationName);
    }
    /**
     * Required along with `delta_sharing_scope`. Used to set expiration duration in seconds on recipient data access tokens. Set to 0 for unlimited duration.
     * 
     */
    @Export(name="deltaSharingRecipientTokenLifetimeInSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> deltaSharingRecipientTokenLifetimeInSeconds;

    /**
     * @return Required along with `delta_sharing_scope`. Used to set expiration duration in seconds on recipient data access tokens. Set to 0 for unlimited duration.
     * 
     */
    public Output<Optional<Integer>> deltaSharingRecipientTokenLifetimeInSeconds() {
        return Codegen.optional(this.deltaSharingRecipientTokenLifetimeInSeconds);
    }
    /**
     * Required along with `delta_sharing_recipient_token_lifetime_in_seconds`. Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.
     * 
     */
    @Export(name="deltaSharingScope", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deltaSharingScope;

    /**
     * @return Required along with `delta_sharing_recipient_token_lifetime_in_seconds`. Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.
     * 
     */
    public Output<Optional<String>> deltaSharingScope() {
        return Codegen.optional(this.deltaSharingScope);
    }
    /**
     * Destroy metastore regardless of its contents.
     * 
     */
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Destroy metastore regardless of its contents.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    @Export(name="globalMetastoreId", refs={String.class}, tree="[0]")
    private Output<String> globalMetastoreId;

    public Output<String> globalMetastoreId() {
        return this.globalMetastoreId;
    }
    @Export(name="metastoreId", refs={String.class}, tree="[0]")
    private Output<String> metastoreId;

    public Output<String> metastoreId() {
        return this.metastoreId;
    }
    /**
     * Name of metastore.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of metastore.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Username/groupname/sp application_id of the metastore owner.
     * 
     */
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output<String> owner;

    /**
     * @return Username/groupname/sp application_id of the metastore owner.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * The region of the metastore
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region of the metastore
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Path on cloud storage account, where managed `databricks.Table` are stored. Change forces creation of a new resource. If no `storage_root` is defined for the metastore, each catalog must have a `storage_root` defined.
     * 
     */
    @Export(name="storageRoot", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageRoot;

    /**
     * @return Path on cloud storage account, where managed `databricks.Table` are stored. Change forces creation of a new resource. If no `storage_root` is defined for the metastore, each catalog must have a `storage_root` defined.
     * 
     */
    public Output<Optional<String>> storageRoot() {
        return Codegen.optional(this.storageRoot);
    }
    @Export(name="storageRootCredentialId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageRootCredentialId;

    public Output<Optional<String>> storageRootCredentialId() {
        return Codegen.optional(this.storageRootCredentialId);
    }
    @Export(name="updatedAt", refs={Integer.class}, tree="[0]")
    private Output<Integer> updatedAt;

    public Output<Integer> updatedAt() {
        return this.updatedAt;
    }
    @Export(name="updatedBy", refs={String.class}, tree="[0]")
    private Output<String> updatedBy;

    public Output<String> updatedBy() {
        return this.updatedBy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Metastore(String name) {
        this(name, MetastoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Metastore(String name, @Nullable MetastoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Metastore(String name, @Nullable MetastoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/metastore:Metastore", name, args == null ? MetastoreArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Metastore(String name, Output<String> id, @Nullable MetastoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/metastore:Metastore", name, state, makeResourceOptions(options, id));
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
    public static Metastore get(String name, Output<String> id, @Nullable MetastoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Metastore(name, id, state, options);
    }
}
