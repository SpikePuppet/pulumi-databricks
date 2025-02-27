// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAwsBucketPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAwsBucketPolicyPlainArgs Empty = new GetAwsBucketPolicyPlainArgs();

    /**
     * AWS S3 Bucket name for which to generate the policy document.
     * 
     */
    @Import(name="bucket", required=true)
    private String bucket;

    /**
     * @return AWS S3 Bucket name for which to generate the policy document.
     * 
     */
    public String bucket() {
        return this.bucket;
    }

    @Import(name="databricksAccountId")
    private @Nullable String databricksAccountId;

    public Optional<String> databricksAccountId() {
        return Optional.ofNullable(this.databricksAccountId);
    }

    /**
     * Your Databricks E2 account ID. Used to generate  restrictive IAM policies that will increase the security of your root bucket
     * 
     */
    @Import(name="databricksE2AccountId")
    private @Nullable String databricksE2AccountId;

    /**
     * @return Your Databricks E2 account ID. Used to generate  restrictive IAM policies that will increase the security of your root bucket
     * 
     */
    public Optional<String> databricksE2AccountId() {
        return Optional.ofNullable(this.databricksE2AccountId);
    }

    /**
     * Data access role that can have full access for this bucket
     * 
     */
    @Import(name="fullAccessRole")
    private @Nullable String fullAccessRole;

    /**
     * @return Data access role that can have full access for this bucket
     * 
     */
    public Optional<String> fullAccessRole() {
        return Optional.ofNullable(this.fullAccessRole);
    }

    private GetAwsBucketPolicyPlainArgs() {}

    private GetAwsBucketPolicyPlainArgs(GetAwsBucketPolicyPlainArgs $) {
        this.bucket = $.bucket;
        this.databricksAccountId = $.databricksAccountId;
        this.databricksE2AccountId = $.databricksE2AccountId;
        this.fullAccessRole = $.fullAccessRole;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAwsBucketPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAwsBucketPolicyPlainArgs $;

        public Builder() {
            $ = new GetAwsBucketPolicyPlainArgs();
        }

        public Builder(GetAwsBucketPolicyPlainArgs defaults) {
            $ = new GetAwsBucketPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket AWS S3 Bucket name for which to generate the policy document.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder databricksAccountId(@Nullable String databricksAccountId) {
            $.databricksAccountId = databricksAccountId;
            return this;
        }

        /**
         * @param databricksE2AccountId Your Databricks E2 account ID. Used to generate  restrictive IAM policies that will increase the security of your root bucket
         * 
         * @return builder
         * 
         */
        public Builder databricksE2AccountId(@Nullable String databricksE2AccountId) {
            $.databricksE2AccountId = databricksE2AccountId;
            return this;
        }

        /**
         * @param fullAccessRole Data access role that can have full access for this bucket
         * 
         * @return builder
         * 
         */
        public Builder fullAccessRole(@Nullable String fullAccessRole) {
            $.fullAccessRole = fullAccessRole;
            return this;
        }

        public GetAwsBucketPolicyPlainArgs build() {
            if ($.bucket == null) {
                throw new MissingRequiredPropertyException("GetAwsBucketPolicyPlainArgs", "bucket");
            }
            return $;
        }
    }

}
