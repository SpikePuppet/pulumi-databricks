// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetExternalLocationExternalLocationInfoEncryptionDetailsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExternalLocationExternalLocationInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetExternalLocationExternalLocationInfoArgs Empty = new GetExternalLocationExternalLocationInfoArgs();

    /**
     * The ARN of the s3 access point to use with the external location (AWS).
     * 
     */
    @Import(name="accessPoint")
    private @Nullable Output<String> accessPoint;

    /**
     * @return The ARN of the s3 access point to use with the external location (AWS).
     * 
     */
    public Optional<Output<String>> accessPoint() {
        return Optional.ofNullable(this.accessPoint);
    }

    @Import(name="browseOnly")
    private @Nullable Output<Boolean> browseOnly;

    public Optional<Output<Boolean>> browseOnly() {
        return Optional.ofNullable(this.browseOnly);
    }

    /**
     * User-supplied comment.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return User-supplied comment.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="createdAt")
    private @Nullable Output<Integer> createdAt;

    public Optional<Output<Integer>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    @Import(name="credentialId")
    private @Nullable Output<String> credentialId;

    public Optional<Output<String>> credentialId() {
        return Optional.ofNullable(this.credentialId);
    }

    /**
     * Name of the databricks.StorageCredential to use with this external location.
     * 
     */
    @Import(name="credentialName")
    private @Nullable Output<String> credentialName;

    /**
     * @return Name of the databricks.StorageCredential to use with this external location.
     * 
     */
    public Optional<Output<String>> credentialName() {
        return Optional.ofNullable(this.credentialName);
    }

    /**
     * The options for Server-Side Encryption to be used by each Databricks s3 client when connecting to S3 cloud storage (AWS).
     * 
     */
    @Import(name="encryptionDetails")
    private @Nullable Output<GetExternalLocationExternalLocationInfoEncryptionDetailsArgs> encryptionDetails;

    /**
     * @return The options for Server-Side Encryption to be used by each Databricks s3 client when connecting to S3 cloud storage (AWS).
     * 
     */
    public Optional<Output<GetExternalLocationExternalLocationInfoEncryptionDetailsArgs>> encryptionDetails() {
        return Optional.ofNullable(this.encryptionDetails);
    }

    @Import(name="metastoreId")
    private @Nullable Output<String> metastoreId;

    public Optional<Output<String>> metastoreId() {
        return Optional.ofNullable(this.metastoreId);
    }

    /**
     * The name of the storage credential
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the storage credential
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Username/groupname/sp application_id of the external location owner.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return Username/groupname/sp application_id of the external location owner.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * Indicates whether the external location is read-only.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return Indicates whether the external location is read-only.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    @Import(name="updatedAt")
    private @Nullable Output<Integer> updatedAt;

    public Optional<Output<Integer>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    @Import(name="updatedBy")
    private @Nullable Output<String> updatedBy;

    public Optional<Output<String>> updatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }

    /**
     * Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private GetExternalLocationExternalLocationInfoArgs() {}

    private GetExternalLocationExternalLocationInfoArgs(GetExternalLocationExternalLocationInfoArgs $) {
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
    public static Builder builder(GetExternalLocationExternalLocationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalLocationExternalLocationInfoArgs $;

        public Builder() {
            $ = new GetExternalLocationExternalLocationInfoArgs();
        }

        public Builder(GetExternalLocationExternalLocationInfoArgs defaults) {
            $ = new GetExternalLocationExternalLocationInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPoint The ARN of the s3 access point to use with the external location (AWS).
         * 
         * @return builder
         * 
         */
        public Builder accessPoint(@Nullable Output<String> accessPoint) {
            $.accessPoint = accessPoint;
            return this;
        }

        /**
         * @param accessPoint The ARN of the s3 access point to use with the external location (AWS).
         * 
         * @return builder
         * 
         */
        public Builder accessPoint(String accessPoint) {
            return accessPoint(Output.of(accessPoint));
        }

        public Builder browseOnly(@Nullable Output<Boolean> browseOnly) {
            $.browseOnly = browseOnly;
            return this;
        }

        public Builder browseOnly(Boolean browseOnly) {
            return browseOnly(Output.of(browseOnly));
        }

        /**
         * @param comment User-supplied comment.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment User-supplied comment.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder createdAt(@Nullable Output<Integer> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(Integer createdAt) {
            return createdAt(Output.of(createdAt));
        }

        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        public Builder credentialId(@Nullable Output<String> credentialId) {
            $.credentialId = credentialId;
            return this;
        }

        public Builder credentialId(String credentialId) {
            return credentialId(Output.of(credentialId));
        }

        /**
         * @param credentialName Name of the databricks.StorageCredential to use with this external location.
         * 
         * @return builder
         * 
         */
        public Builder credentialName(@Nullable Output<String> credentialName) {
            $.credentialName = credentialName;
            return this;
        }

        /**
         * @param credentialName Name of the databricks.StorageCredential to use with this external location.
         * 
         * @return builder
         * 
         */
        public Builder credentialName(String credentialName) {
            return credentialName(Output.of(credentialName));
        }

        /**
         * @param encryptionDetails The options for Server-Side Encryption to be used by each Databricks s3 client when connecting to S3 cloud storage (AWS).
         * 
         * @return builder
         * 
         */
        public Builder encryptionDetails(@Nullable Output<GetExternalLocationExternalLocationInfoEncryptionDetailsArgs> encryptionDetails) {
            $.encryptionDetails = encryptionDetails;
            return this;
        }

        /**
         * @param encryptionDetails The options for Server-Side Encryption to be used by each Databricks s3 client when connecting to S3 cloud storage (AWS).
         * 
         * @return builder
         * 
         */
        public Builder encryptionDetails(GetExternalLocationExternalLocationInfoEncryptionDetailsArgs encryptionDetails) {
            return encryptionDetails(Output.of(encryptionDetails));
        }

        public Builder metastoreId(@Nullable Output<String> metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        public Builder metastoreId(String metastoreId) {
            return metastoreId(Output.of(metastoreId));
        }

        /**
         * @param name The name of the storage credential
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the storage credential
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param owner Username/groupname/sp application_id of the external location owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Username/groupname/sp application_id of the external location owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param readOnly Indicates whether the external location is read-only.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly Indicates whether the external location is read-only.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public Builder updatedAt(@Nullable Output<Integer> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(Integer updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public Builder updatedBy(@Nullable Output<String> updatedBy) {
            $.updatedBy = updatedBy;
            return this;
        }

        public Builder updatedBy(String updatedBy) {
            return updatedBy(Output.of(updatedBy));
        }

        /**
         * @param url Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public GetExternalLocationExternalLocationInfoArgs build() {
            return $;
        }
    }

}
