// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetExternalLocationExternalLocationInfoEncryptionDetails;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExternalLocationExternalLocationInfo extends com.pulumi.resources.InvokeArgs {

    public static final GetExternalLocationExternalLocationInfo Empty = new GetExternalLocationExternalLocationInfo();

    /**
     * The ARN of the s3 access point to use with the external location (AWS).
     * 
     */
    @Import(name="accessPoint")
    private @Nullable String accessPoint;

    /**
     * @return The ARN of the s3 access point to use with the external location (AWS).
     * 
     */
    public Optional<String> accessPoint() {
        return Optional.ofNullable(this.accessPoint);
    }

    @Import(name="browseOnly")
    private @Nullable Boolean browseOnly;

    public Optional<Boolean> browseOnly() {
        return Optional.ofNullable(this.browseOnly);
    }

    /**
     * User-supplied comment.
     * 
     */
    @Import(name="comment")
    private @Nullable String comment;

    /**
     * @return User-supplied comment.
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
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

    @Import(name="credentialId")
    private @Nullable String credentialId;

    public Optional<String> credentialId() {
        return Optional.ofNullable(this.credentialId);
    }

    /**
     * Name of the databricks.StorageCredential to use with this external location.
     * 
     */
    @Import(name="credentialName")
    private @Nullable String credentialName;

    /**
     * @return Name of the databricks.StorageCredential to use with this external location.
     * 
     */
    public Optional<String> credentialName() {
        return Optional.ofNullable(this.credentialName);
    }

    /**
     * The options for Server-Side Encryption to be used by each Databricks s3 client when connecting to S3 cloud storage (AWS).
     * 
     */
    @Import(name="encryptionDetails")
    private @Nullable GetExternalLocationExternalLocationInfoEncryptionDetails encryptionDetails;

    /**
     * @return The options for Server-Side Encryption to be used by each Databricks s3 client when connecting to S3 cloud storage (AWS).
     * 
     */
    public Optional<GetExternalLocationExternalLocationInfoEncryptionDetails> encryptionDetails() {
        return Optional.ofNullable(this.encryptionDetails);
    }

    @Import(name="metastoreId")
    private @Nullable String metastoreId;

    public Optional<String> metastoreId() {
        return Optional.ofNullable(this.metastoreId);
    }

    /**
     * The name of the storage credential
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the storage credential
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Username/groupname/sp application_id of the external location owner.
     * 
     */
    @Import(name="owner")
    private @Nullable String owner;

    /**
     * @return Username/groupname/sp application_id of the external location owner.
     * 
     */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * Indicates whether the external location is read-only.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Boolean readOnly;

    /**
     * @return Indicates whether the external location is read-only.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
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

    /**
     * Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]{@literal @}[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
     * 
     */
    @Import(name="url")
    private @Nullable String url;

    /**
     * @return Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]{@literal @}[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    private GetExternalLocationExternalLocationInfo() {}

    private GetExternalLocationExternalLocationInfo(GetExternalLocationExternalLocationInfo $) {
        this.accessPoint = $.accessPoint;
        this.browseOnly = $.browseOnly;
        this.comment = $.comment;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.credentialId = $.credentialId;
        this.credentialName = $.credentialName;
        this.encryptionDetails = $.encryptionDetails;
        this.metastoreId = $.metastoreId;
        this.name = $.name;
        this.owner = $.owner;
        this.readOnly = $.readOnly;
        this.updatedAt = $.updatedAt;
        this.updatedBy = $.updatedBy;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExternalLocationExternalLocationInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalLocationExternalLocationInfo $;

        public Builder() {
            $ = new GetExternalLocationExternalLocationInfo();
        }

        public Builder(GetExternalLocationExternalLocationInfo defaults) {
            $ = new GetExternalLocationExternalLocationInfo(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPoint The ARN of the s3 access point to use with the external location (AWS).
         * 
         * @return builder
         * 
         */
        public Builder accessPoint(@Nullable String accessPoint) {
            $.accessPoint = accessPoint;
            return this;
        }

        public Builder browseOnly(@Nullable Boolean browseOnly) {
            $.browseOnly = browseOnly;
            return this;
        }

        /**
         * @param comment User-supplied comment.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable String comment) {
            $.comment = comment;
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

        public Builder credentialId(@Nullable String credentialId) {
            $.credentialId = credentialId;
            return this;
        }

        /**
         * @param credentialName Name of the databricks.StorageCredential to use with this external location.
         * 
         * @return builder
         * 
         */
        public Builder credentialName(@Nullable String credentialName) {
            $.credentialName = credentialName;
            return this;
        }

        /**
         * @param encryptionDetails The options for Server-Side Encryption to be used by each Databricks s3 client when connecting to S3 cloud storage (AWS).
         * 
         * @return builder
         * 
         */
        public Builder encryptionDetails(@Nullable GetExternalLocationExternalLocationInfoEncryptionDetails encryptionDetails) {
            $.encryptionDetails = encryptionDetails;
            return this;
        }

        public Builder metastoreId(@Nullable String metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        /**
         * @param name The name of the storage credential
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param owner Username/groupname/sp application_id of the external location owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable String owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param readOnly Indicates whether the external location is read-only.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Boolean readOnly) {
            $.readOnly = readOnly;
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

        /**
         * @param url Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]{@literal @}[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable String url) {
            $.url = url;
            return this;
        }

        public GetExternalLocationExternalLocationInfo build() {
            return $;
        }
    }

}
