// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMetastoreMetastoreInfo extends com.pulumi.resources.InvokeArgs {

    public static final GetMetastoreMetastoreInfo Empty = new GetMetastoreMetastoreInfo();

    @Import(name="cloud")
    private @Nullable String cloud;

    public Optional<String> cloud() {
        return Optional.ofNullable(this.cloud);
    }

    @Import(name="createdAt")
    private @Nullable Integer createdAt;

    public Optional<Integer> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    @Import(name="createdBy")
    private @Nullable String createdBy;

    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    @Import(name="defaultDataAccessConfigId")
    private @Nullable String defaultDataAccessConfigId;

    public Optional<String> defaultDataAccessConfigId() {
        return Optional.ofNullable(this.defaultDataAccessConfigId);
    }

    /**
     * The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing.
     * 
     */
    @Import(name="deltaSharingOrganizationName")
    private @Nullable String deltaSharingOrganizationName;

    /**
     * @return The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing.
     * 
     */
    public Optional<String> deltaSharingOrganizationName() {
        return Optional.ofNullable(this.deltaSharingOrganizationName);
    }

    /**
     * Used to set expiration duration in seconds on recipient data access tokens.
     * 
     */
    @Import(name="deltaSharingRecipientTokenLifetimeInSeconds")
    private @Nullable Integer deltaSharingRecipientTokenLifetimeInSeconds;

    /**
     * @return Used to set expiration duration in seconds on recipient data access tokens.
     * 
     */
    public Optional<Integer> deltaSharingRecipientTokenLifetimeInSeconds() {
        return Optional.ofNullable(this.deltaSharingRecipientTokenLifetimeInSeconds);
    }

    /**
     * Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.
     * 
     */
    @Import(name="deltaSharingScope")
    private @Nullable String deltaSharingScope;

    /**
     * @return Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.
     * 
     */
    public Optional<String> deltaSharingScope() {
        return Optional.ofNullable(this.deltaSharingScope);
    }

    @Import(name="globalMetastoreId")
    private @Nullable String globalMetastoreId;

    public Optional<String> globalMetastoreId() {
        return Optional.ofNullable(this.globalMetastoreId);
    }

    /**
     * Id of the metastore to be fetched
     * 
     */
    @Import(name="metastoreId")
    private @Nullable String metastoreId;

    /**
     * @return Id of the metastore to be fetched
     * 
     */
    public Optional<String> metastoreId() {
        return Optional.ofNullable(this.metastoreId);
    }

    /**
     * Name of metastore.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of metastore.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Username/groupname/sp application_id of the metastore owner.
     * 
     */
    @Import(name="owner")
    private @Nullable String owner;

    /**
     * @return Username/groupname/sp application_id of the metastore owner.
     * 
     */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }

    @Import(name="privilegeModelVersion")
    private @Nullable String privilegeModelVersion;

    public Optional<String> privilegeModelVersion() {
        return Optional.ofNullable(this.privilegeModelVersion);
    }

    @Import(name="region")
    private @Nullable String region;

    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Path on cloud storage account, where managed `databricks.Table` are stored.
     * 
     */
    @Import(name="storageRoot")
    private @Nullable String storageRoot;

    /**
     * @return Path on cloud storage account, where managed `databricks.Table` are stored.
     * 
     */
    public Optional<String> storageRoot() {
        return Optional.ofNullable(this.storageRoot);
    }

    @Import(name="storageRootCredentialId")
    private @Nullable String storageRootCredentialId;

    public Optional<String> storageRootCredentialId() {
        return Optional.ofNullable(this.storageRootCredentialId);
    }

    @Import(name="storageRootCredentialName")
    private @Nullable String storageRootCredentialName;

    public Optional<String> storageRootCredentialName() {
        return Optional.ofNullable(this.storageRootCredentialName);
    }

    @Import(name="updatedAt")
    private @Nullable Integer updatedAt;

    public Optional<Integer> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    @Import(name="updatedBy")
    private @Nullable String updatedBy;

    public Optional<String> updatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }

    private GetMetastoreMetastoreInfo() {}

    private GetMetastoreMetastoreInfo(GetMetastoreMetastoreInfo $) {
        this.cloud = $.cloud;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.defaultDataAccessConfigId = $.defaultDataAccessConfigId;
        this.deltaSharingOrganizationName = $.deltaSharingOrganizationName;
        this.deltaSharingRecipientTokenLifetimeInSeconds = $.deltaSharingRecipientTokenLifetimeInSeconds;
        this.deltaSharingScope = $.deltaSharingScope;
        this.globalMetastoreId = $.globalMetastoreId;
        this.metastoreId = $.metastoreId;
        this.name = $.name;
        this.owner = $.owner;
        this.privilegeModelVersion = $.privilegeModelVersion;
        this.region = $.region;
        this.storageRoot = $.storageRoot;
        this.storageRootCredentialId = $.storageRootCredentialId;
        this.storageRootCredentialName = $.storageRootCredentialName;
        this.updatedAt = $.updatedAt;
        this.updatedBy = $.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetastoreMetastoreInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetastoreMetastoreInfo $;

        public Builder() {
            $ = new GetMetastoreMetastoreInfo();
        }

        public Builder(GetMetastoreMetastoreInfo defaults) {
            $ = new GetMetastoreMetastoreInfo(Objects.requireNonNull(defaults));
        }

        public Builder cloud(@Nullable String cloud) {
            $.cloud = cloud;
            return this;
        }

        public Builder createdAt(@Nullable Integer createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdBy(@Nullable String createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        public Builder defaultDataAccessConfigId(@Nullable String defaultDataAccessConfigId) {
            $.defaultDataAccessConfigId = defaultDataAccessConfigId;
            return this;
        }

        /**
         * @param deltaSharingOrganizationName The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing.
         * 
         * @return builder
         * 
         */
        public Builder deltaSharingOrganizationName(@Nullable String deltaSharingOrganizationName) {
            $.deltaSharingOrganizationName = deltaSharingOrganizationName;
            return this;
        }

        /**
         * @param deltaSharingRecipientTokenLifetimeInSeconds Used to set expiration duration in seconds on recipient data access tokens.
         * 
         * @return builder
         * 
         */
        public Builder deltaSharingRecipientTokenLifetimeInSeconds(@Nullable Integer deltaSharingRecipientTokenLifetimeInSeconds) {
            $.deltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
            return this;
        }

        /**
         * @param deltaSharingScope Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.
         * 
         * @return builder
         * 
         */
        public Builder deltaSharingScope(@Nullable String deltaSharingScope) {
            $.deltaSharingScope = deltaSharingScope;
            return this;
        }

        public Builder globalMetastoreId(@Nullable String globalMetastoreId) {
            $.globalMetastoreId = globalMetastoreId;
            return this;
        }

        /**
         * @param metastoreId Id of the metastore to be fetched
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(@Nullable String metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        /**
         * @param name Name of metastore.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param owner Username/groupname/sp application_id of the metastore owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable String owner) {
            $.owner = owner;
            return this;
        }

        public Builder privilegeModelVersion(@Nullable String privilegeModelVersion) {
            $.privilegeModelVersion = privilegeModelVersion;
            return this;
        }

        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        /**
         * @param storageRoot Path on cloud storage account, where managed `databricks.Table` are stored.
         * 
         * @return builder
         * 
         */
        public Builder storageRoot(@Nullable String storageRoot) {
            $.storageRoot = storageRoot;
            return this;
        }

        public Builder storageRootCredentialId(@Nullable String storageRootCredentialId) {
            $.storageRootCredentialId = storageRootCredentialId;
            return this;
        }

        public Builder storageRootCredentialName(@Nullable String storageRootCredentialName) {
            $.storageRootCredentialName = storageRootCredentialName;
            return this;
        }

        public Builder updatedAt(@Nullable Integer updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedBy(@Nullable String updatedBy) {
            $.updatedBy = updatedBy;
            return this;
        }

        public GetMetastoreMetastoreInfo build() {
            return $;
        }
    }

}
