// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MetastoreDataAccessAzureServicePrincipal {
    /**
     * @return The application ID of the application registration within the referenced AAD tenant
     * 
     */
    private String applicationId;
    /**
     * @return The client secret generated for the above app ID in AAD. **This field is redacted on output**
     * 
     */
    private String clientSecret;
    /**
     * @return The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
     * 
     */
    private String directoryId;

    private MetastoreDataAccessAzureServicePrincipal() {}
    /**
     * @return The application ID of the application registration within the referenced AAD tenant
     * 
     */
    public String applicationId() {
        return this.applicationId;
    }
    /**
     * @return The client secret generated for the above app ID in AAD. **This field is redacted on output**
     * 
     */
    public String clientSecret() {
        return this.clientSecret;
    }
    /**
     * @return The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
     * 
     */
    public String directoryId() {
        return this.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreDataAccessAzureServicePrincipal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applicationId;
        private String clientSecret;
        private String directoryId;
        public Builder() {}
        public Builder(MetastoreDataAccessAzureServicePrincipal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.directoryId = defaults.directoryId;
        }

        @CustomType.Setter
        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        @CustomType.Setter
        public Builder directoryId(String directoryId) {
            this.directoryId = Objects.requireNonNull(directoryId);
            return this;
        }
        public MetastoreDataAccessAzureServicePrincipal build() {
            final var _resultValue = new MetastoreDataAccessAzureServicePrincipal();
            _resultValue.applicationId = applicationId;
            _resultValue.clientSecret = clientSecret;
            _resultValue.directoryId = directoryId;
            return _resultValue;
        }
    }
}
