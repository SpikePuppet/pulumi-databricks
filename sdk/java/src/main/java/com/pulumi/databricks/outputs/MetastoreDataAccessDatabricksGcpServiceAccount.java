// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetastoreDataAccessDatabricksGcpServiceAccount {
    private @Nullable String credentialId;
    /**
     * @return The email of the GCP service account created, to be granted access to relevant buckets.
     * 
     * `azure_service_principal` optional configuration block for credential details for Azure (Legacy):
     * 
     */
    private @Nullable String email;

    private MetastoreDataAccessDatabricksGcpServiceAccount() {}
    public Optional<String> credentialId() {
        return Optional.ofNullable(this.credentialId);
    }
    /**
     * @return The email of the GCP service account created, to be granted access to relevant buckets.
     * 
     * `azure_service_principal` optional configuration block for credential details for Azure (Legacy):
     * 
     */
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreDataAccessDatabricksGcpServiceAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String credentialId;
        private @Nullable String email;
        public Builder() {}
        public Builder(MetastoreDataAccessDatabricksGcpServiceAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentialId = defaults.credentialId;
    	      this.email = defaults.email;
        }

        @CustomType.Setter
        public Builder credentialId(@Nullable String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        @CustomType.Setter
        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        public MetastoreDataAccessDatabricksGcpServiceAccount build() {
            final var _resultValue = new MetastoreDataAccessDatabricksGcpServiceAccount();
            _resultValue.credentialId = credentialId;
            _resultValue.email = email;
            return _resultValue;
        }
    }
}
