// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalLocationArgs Empty = new ExternalLocationArgs();

    /**
     * User-supplied free-form text.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return User-supplied free-form text.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Name of the databricks.StorageCredential to use with this External Location.
     * 
     */
    @Import(name="credentialName", required=true)
    private Output<String> credentialName;

    /**
     * @return Name of the databricks.StorageCredential to use with this External Location.
     * 
     */
    public Output<String> credentialName() {
        return this.credentialName;
    }

    /**
     * Destroy external location regardless of its dependents.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return Destroy external location regardless of its dependents.
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    @Import(name="metastoreId")
    private @Nullable Output<String> metastoreId;

    public Optional<Output<String>> metastoreId() {
        return Optional.ofNullable(this.metastoreId);
    }

    /**
     * Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Username/groupname/sp application_id of the external Location owner.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return Username/groupname/sp application_id of the external Location owner.
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

    /**
     * Suppress validation errors if any &amp; force save the external location
     * 
     */
    @Import(name="skipValidation")
    private @Nullable Output<Boolean> skipValidation;

    /**
     * @return Suppress validation errors if any &amp; force save the external location
     * 
     */
    public Optional<Output<Boolean>> skipValidation() {
        return Optional.ofNullable(this.skipValidation);
    }

    /**
     * Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private ExternalLocationArgs() {}

    private ExternalLocationArgs(ExternalLocationArgs $) {
        this.comment = $.comment;
        this.credentialName = $.credentialName;
        this.forceDestroy = $.forceDestroy;
        this.metastoreId = $.metastoreId;
        this.name = $.name;
        this.owner = $.owner;
        this.readOnly = $.readOnly;
        this.skipValidation = $.skipValidation;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalLocationArgs $;

        public Builder() {
            $ = new ExternalLocationArgs();
        }

        public Builder(ExternalLocationArgs defaults) {
            $ = new ExternalLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment User-supplied free-form text.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment User-supplied free-form text.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param credentialName Name of the databricks.StorageCredential to use with this External Location.
         * 
         * @return builder
         * 
         */
        public Builder credentialName(Output<String> credentialName) {
            $.credentialName = credentialName;
            return this;
        }

        /**
         * @param credentialName Name of the databricks.StorageCredential to use with this External Location.
         * 
         * @return builder
         * 
         */
        public Builder credentialName(String credentialName) {
            return credentialName(Output.of(credentialName));
        }

        /**
         * @param forceDestroy Destroy external location regardless of its dependents.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * @param forceDestroy Destroy external location regardless of its dependents.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        public Builder metastoreId(@Nullable Output<String> metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        public Builder metastoreId(String metastoreId) {
            return metastoreId(Output.of(metastoreId));
        }

        /**
         * @param name Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param owner Username/groupname/sp application_id of the external Location owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Username/groupname/sp application_id of the external Location owner.
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

        /**
         * @param skipValidation Suppress validation errors if any &amp; force save the external location
         * 
         * @return builder
         * 
         */
        public Builder skipValidation(@Nullable Output<Boolean> skipValidation) {
            $.skipValidation = skipValidation;
            return this;
        }

        /**
         * @param skipValidation Suppress validation errors if any &amp; force save the external location
         * 
         * @return builder
         * 
         */
        public Builder skipValidation(Boolean skipValidation) {
            return skipValidation(Output.of(skipValidation));
        }

        /**
         * @param url Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
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

        public ExternalLocationArgs build() {
            $.credentialName = Objects.requireNonNull($.credentialName, "expected parameter 'credentialName' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
