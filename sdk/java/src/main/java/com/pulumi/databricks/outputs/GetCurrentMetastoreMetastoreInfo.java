// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCurrentMetastoreMetastoreInfo {
    private @Nullable String cloud;
    /**
     * @return Timestamp (in milliseconds) when the current metastore was created.
     * 
     */
    private @Nullable Integer createdAt;
    /**
     * @return the ID of the identity that created the current metastore.
     * 
     */
    private @Nullable String createdBy;
    /**
     * @return the ID of the default data access configuration.
     * 
     */
    private @Nullable String defaultDataAccessConfigId;
    /**
     * @return The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing.
     * 
     */
    private @Nullable String deltaSharingOrganizationName;
    /**
     * @return the expiration duration in seconds on recipient data access tokens.
     * 
     */
    private @Nullable Integer deltaSharingRecipientTokenLifetimeInSeconds;
    /**
     * @return Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL. INTERNAL only allows sharing within the same account, and INTERNAL_AND_EXTERNAL allows cross account sharing and token based sharing.
     * 
     */
    private @Nullable String deltaSharingScope;
    /**
     * @return Identifier in form of `&lt;cloud&gt;:&lt;region&gt;:&lt;metastore_id&gt;` for use in Databricks to Databricks Delta Sharing.
     * 
     */
    private @Nullable String globalMetastoreId;
    /**
     * @return Metastore ID.
     * 
     */
    private @Nullable String metastoreId;
    /**
     * @return Name of metastore.
     * 
     */
    private @Nullable String name;
    /**
     * @return Username/group name/sp application_id of the metastore owner.
     * 
     */
    private @Nullable String owner;
    /**
     * @return the version of the privilege model used by the metastore.
     * 
     */
    private @Nullable String privilegeModelVersion;
    /**
     * @return (Mandatory for account-level) The region of the metastore.
     * 
     */
    private @Nullable String region;
    /**
     * @return Path on cloud storage account, where managed `databricks.Table` are stored.
     * 
     */
    private @Nullable String storageRoot;
    /**
     * @return ID of a storage credential used for the `storage_root`.
     * 
     */
    private @Nullable String storageRootCredentialId;
    /**
     * @return Name of a storage credential used for the `storage_root`.
     * 
     */
    private @Nullable String storageRootCredentialName;
    /**
     * @return Timestamp (in milliseconds) when the current metastore was updated.
     * 
     */
    private @Nullable Integer updatedAt;
    /**
     * @return the ID of the identity that updated the current metastore.
     * 
     */
    private @Nullable String updatedBy;

    private GetCurrentMetastoreMetastoreInfo() {}
    public Optional<String> cloud() {
        return Optional.ofNullable(this.cloud);
    }
    /**
     * @return Timestamp (in milliseconds) when the current metastore was created.
     * 
     */
    public Optional<Integer> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * @return the ID of the identity that created the current metastore.
     * 
     */
    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * @return the ID of the default data access configuration.
     * 
     */
    public Optional<String> defaultDataAccessConfigId() {
        return Optional.ofNullable(this.defaultDataAccessConfigId);
    }
    /**
     * @return The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing.
     * 
     */
    public Optional<String> deltaSharingOrganizationName() {
        return Optional.ofNullable(this.deltaSharingOrganizationName);
    }
    /**
     * @return the expiration duration in seconds on recipient data access tokens.
     * 
     */
    public Optional<Integer> deltaSharingRecipientTokenLifetimeInSeconds() {
        return Optional.ofNullable(this.deltaSharingRecipientTokenLifetimeInSeconds);
    }
    /**
     * @return Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL. INTERNAL only allows sharing within the same account, and INTERNAL_AND_EXTERNAL allows cross account sharing and token based sharing.
     * 
     */
    public Optional<String> deltaSharingScope() {
        return Optional.ofNullable(this.deltaSharingScope);
    }
    /**
     * @return Identifier in form of `&lt;cloud&gt;:&lt;region&gt;:&lt;metastore_id&gt;` for use in Databricks to Databricks Delta Sharing.
     * 
     */
    public Optional<String> globalMetastoreId() {
        return Optional.ofNullable(this.globalMetastoreId);
    }
    /**
     * @return Metastore ID.
     * 
     */
    public Optional<String> metastoreId() {
        return Optional.ofNullable(this.metastoreId);
    }
    /**
     * @return Name of metastore.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Username/group name/sp application_id of the metastore owner.
     * 
     */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }
    /**
     * @return the version of the privilege model used by the metastore.
     * 
     */
    public Optional<String> privilegeModelVersion() {
        return Optional.ofNullable(this.privilegeModelVersion);
    }
    /**
     * @return (Mandatory for account-level) The region of the metastore.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Path on cloud storage account, where managed `databricks.Table` are stored.
     * 
     */
    public Optional<String> storageRoot() {
        return Optional.ofNullable(this.storageRoot);
    }
    /**
     * @return ID of a storage credential used for the `storage_root`.
     * 
     */
    public Optional<String> storageRootCredentialId() {
        return Optional.ofNullable(this.storageRootCredentialId);
    }
    /**
     * @return Name of a storage credential used for the `storage_root`.
     * 
     */
    public Optional<String> storageRootCredentialName() {
        return Optional.ofNullable(this.storageRootCredentialName);
    }
    /**
     * @return Timestamp (in milliseconds) when the current metastore was updated.
     * 
     */
    public Optional<Integer> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }
    /**
     * @return the ID of the identity that updated the current metastore.
     * 
     */
    public Optional<String> updatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCurrentMetastoreMetastoreInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cloud;
        private @Nullable Integer createdAt;
        private @Nullable String createdBy;
        private @Nullable String defaultDataAccessConfigId;
        private @Nullable String deltaSharingOrganizationName;
        private @Nullable Integer deltaSharingRecipientTokenLifetimeInSeconds;
        private @Nullable String deltaSharingScope;
        private @Nullable String globalMetastoreId;
        private @Nullable String metastoreId;
        private @Nullable String name;
        private @Nullable String owner;
        private @Nullable String privilegeModelVersion;
        private @Nullable String region;
        private @Nullable String storageRoot;
        private @Nullable String storageRootCredentialId;
        private @Nullable String storageRootCredentialName;
        private @Nullable Integer updatedAt;
        private @Nullable String updatedBy;
        public Builder() {}
        public Builder(GetCurrentMetastoreMetastoreInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloud = defaults.cloud;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.defaultDataAccessConfigId = defaults.defaultDataAccessConfigId;
    	      this.deltaSharingOrganizationName = defaults.deltaSharingOrganizationName;
    	      this.deltaSharingRecipientTokenLifetimeInSeconds = defaults.deltaSharingRecipientTokenLifetimeInSeconds;
    	      this.deltaSharingScope = defaults.deltaSharingScope;
    	      this.globalMetastoreId = defaults.globalMetastoreId;
    	      this.metastoreId = defaults.metastoreId;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.privilegeModelVersion = defaults.privilegeModelVersion;
    	      this.region = defaults.region;
    	      this.storageRoot = defaults.storageRoot;
    	      this.storageRootCredentialId = defaults.storageRootCredentialId;
    	      this.storageRootCredentialName = defaults.storageRootCredentialName;
    	      this.updatedAt = defaults.updatedAt;
    	      this.updatedBy = defaults.updatedBy;
        }

        @CustomType.Setter
        public Builder cloud(@Nullable String cloud) {

            this.cloud = cloud;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(@Nullable Integer createdAt) {

            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder createdBy(@Nullable String createdBy) {

            this.createdBy = createdBy;
            return this;
        }
        @CustomType.Setter
        public Builder defaultDataAccessConfigId(@Nullable String defaultDataAccessConfigId) {

            this.defaultDataAccessConfigId = defaultDataAccessConfigId;
            return this;
        }
        @CustomType.Setter
        public Builder deltaSharingOrganizationName(@Nullable String deltaSharingOrganizationName) {

            this.deltaSharingOrganizationName = deltaSharingOrganizationName;
            return this;
        }
        @CustomType.Setter
        public Builder deltaSharingRecipientTokenLifetimeInSeconds(@Nullable Integer deltaSharingRecipientTokenLifetimeInSeconds) {

            this.deltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder deltaSharingScope(@Nullable String deltaSharingScope) {

            this.deltaSharingScope = deltaSharingScope;
            return this;
        }
        @CustomType.Setter
        public Builder globalMetastoreId(@Nullable String globalMetastoreId) {

            this.globalMetastoreId = globalMetastoreId;
            return this;
        }
        @CustomType.Setter
        public Builder metastoreId(@Nullable String metastoreId) {

            this.metastoreId = metastoreId;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder owner(@Nullable String owner) {

            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder privilegeModelVersion(@Nullable String privilegeModelVersion) {

            this.privilegeModelVersion = privilegeModelVersion;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder storageRoot(@Nullable String storageRoot) {

            this.storageRoot = storageRoot;
            return this;
        }
        @CustomType.Setter
        public Builder storageRootCredentialId(@Nullable String storageRootCredentialId) {

            this.storageRootCredentialId = storageRootCredentialId;
            return this;
        }
        @CustomType.Setter
        public Builder storageRootCredentialName(@Nullable String storageRootCredentialName) {

            this.storageRootCredentialName = storageRootCredentialName;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(@Nullable Integer updatedAt) {

            this.updatedAt = updatedAt;
            return this;
        }
        @CustomType.Setter
        public Builder updatedBy(@Nullable String updatedBy) {

            this.updatedBy = updatedBy;
            return this;
        }
        public GetCurrentMetastoreMetastoreInfo build() {
            final var _resultValue = new GetCurrentMetastoreMetastoreInfo();
            _resultValue.cloud = cloud;
            _resultValue.createdAt = createdAt;
            _resultValue.createdBy = createdBy;
            _resultValue.defaultDataAccessConfigId = defaultDataAccessConfigId;
            _resultValue.deltaSharingOrganizationName = deltaSharingOrganizationName;
            _resultValue.deltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
            _resultValue.deltaSharingScope = deltaSharingScope;
            _resultValue.globalMetastoreId = globalMetastoreId;
            _resultValue.metastoreId = metastoreId;
            _resultValue.name = name;
            _resultValue.owner = owner;
            _resultValue.privilegeModelVersion = privilegeModelVersion;
            _resultValue.region = region;
            _resultValue.storageRoot = storageRoot;
            _resultValue.storageRootCredentialId = storageRootCredentialId;
            _resultValue.storageRootCredentialName = storageRootCredentialName;
            _resultValue.updatedAt = updatedAt;
            _resultValue.updatedBy = updatedBy;
            return _resultValue;
        }
    }
}
