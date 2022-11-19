// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MwsStorageConfigurationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MwsStorageConfigurationsArgs Empty = new MwsStorageConfigurationsArgs();

    /**
     * Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * name of AWS S3 bucket
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    /**
     * @return name of AWS S3 bucket
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }

    /**
     * name under which this storage configuration is stored
     * 
     */
    @Import(name="storageConfigurationName", required=true)
    private Output<String> storageConfigurationName;

    /**
     * @return name under which this storage configuration is stored
     * 
     */
    public Output<String> storageConfigurationName() {
        return this.storageConfigurationName;
    }

    private MwsStorageConfigurationsArgs() {}

    private MwsStorageConfigurationsArgs(MwsStorageConfigurationsArgs $) {
        this.accountId = $.accountId;
        this.bucketName = $.bucketName;
        this.storageConfigurationName = $.storageConfigurationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsStorageConfigurationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsStorageConfigurationsArgs $;

        public Builder() {
            $ = new MwsStorageConfigurationsArgs();
        }

        public Builder(MwsStorageConfigurationsArgs defaults) {
            $ = new MwsStorageConfigurationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param bucketName name of AWS S3 bucket
         * 
         * @return builder
         * 
         */
        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName name of AWS S3 bucket
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param storageConfigurationName name under which this storage configuration is stored
         * 
         * @return builder
         * 
         */
        public Builder storageConfigurationName(Output<String> storageConfigurationName) {
            $.storageConfigurationName = storageConfigurationName;
            return this;
        }

        /**
         * @param storageConfigurationName name under which this storage configuration is stored
         * 
         * @return builder
         * 
         */
        public Builder storageConfigurationName(String storageConfigurationName) {
            return storageConfigurationName(Output.of(storageConfigurationName));
        }

        public MwsStorageConfigurationsArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            $.storageConfigurationName = Objects.requireNonNull($.storageConfigurationName, "expected parameter 'storageConfigurationName' to be non-null");
            return $;
        }
    }

}