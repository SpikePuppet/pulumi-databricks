// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StorageCredentialAwsIamRole {
    /**
     * @return The external ID used in role assumption to prevent confused deputy problem.
     * 
     */
    private @Nullable String externalId;
    /**
     * @return The Amazon Resource Name (ARN) of the AWS IAM role for S3 data access, of the form `arn:aws:iam::1234567890:role/MyRole-AJJHDSKSDF`
     * 
     */
    private String roleArn;
    /**
     * @return The Amazon Resource Name (ARN) of the AWS IAM user managed by Databricks. This is the identity that is going to assume the AWS IAM role.
     * 
     * `azure_managed_identity` optional configuration block for using managed identity as credential details for Azure (recommended over service principal):
     * 
     */
    private @Nullable String unityCatalogIamArn;

    private StorageCredentialAwsIamRole() {}
    /**
     * @return The external ID used in role assumption to prevent confused deputy problem.
     * 
     */
    public Optional<String> externalId() {
        return Optional.ofNullable(this.externalId);
    }
    /**
     * @return The Amazon Resource Name (ARN) of the AWS IAM role for S3 data access, of the form `arn:aws:iam::1234567890:role/MyRole-AJJHDSKSDF`
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the AWS IAM user managed by Databricks. This is the identity that is going to assume the AWS IAM role.
     * 
     * `azure_managed_identity` optional configuration block for using managed identity as credential details for Azure (recommended over service principal):
     * 
     */
    public Optional<String> unityCatalogIamArn() {
        return Optional.ofNullable(this.unityCatalogIamArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageCredentialAwsIamRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String externalId;
        private String roleArn;
        private @Nullable String unityCatalogIamArn;
        public Builder() {}
        public Builder(StorageCredentialAwsIamRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalId = defaults.externalId;
    	      this.roleArn = defaults.roleArn;
    	      this.unityCatalogIamArn = defaults.unityCatalogIamArn;
        }

        @CustomType.Setter
        public Builder externalId(@Nullable String externalId) {
            this.externalId = externalId;
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        @CustomType.Setter
        public Builder unityCatalogIamArn(@Nullable String unityCatalogIamArn) {
            this.unityCatalogIamArn = unityCatalogIamArn;
            return this;
        }
        public StorageCredentialAwsIamRole build() {
            final var _resultValue = new StorageCredentialAwsIamRole();
            _resultValue.externalId = externalId;
            _resultValue.roleArn = roleArn;
            _resultValue.unityCatalogIamArn = unityCatalogIamArn;
            return _resultValue;
        }
    }
}
