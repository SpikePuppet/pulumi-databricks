// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetStorageCredentialStorageCredentialInfoAzureServicePrincipal extends com.pulumi.resources.InvokeArgs {

    public static final GetStorageCredentialStorageCredentialInfoAzureServicePrincipal Empty = new GetStorageCredentialStorageCredentialInfoAzureServicePrincipal();

    /**
     * The application ID of the application registration within the referenced AAD tenant
     * 
     */
    @Import(name="applicationId", required=true)
    private String applicationId;

    /**
     * @return The application ID of the application registration within the referenced AAD tenant
     * 
     */
    public String applicationId() {
        return this.applicationId;
    }

    @Import(name="clientSecret", required=true)
    private String clientSecret;

    public String clientSecret() {
        return this.clientSecret;
    }

    /**
     * The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
     * 
     */
    @Import(name="directoryId", required=true)
    private String directoryId;

    /**
     * @return The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
     * 
     */
    public String directoryId() {
        return this.directoryId;
    }

    private GetStorageCredentialStorageCredentialInfoAzureServicePrincipal() {}

    private GetStorageCredentialStorageCredentialInfoAzureServicePrincipal(GetStorageCredentialStorageCredentialInfoAzureServicePrincipal $) {
        this.applicationId = $.applicationId;
        this.clientSecret = $.clientSecret;
        this.directoryId = $.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStorageCredentialStorageCredentialInfoAzureServicePrincipal defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStorageCredentialStorageCredentialInfoAzureServicePrincipal $;

        public Builder() {
            $ = new GetStorageCredentialStorageCredentialInfoAzureServicePrincipal();
        }

        public Builder(GetStorageCredentialStorageCredentialInfoAzureServicePrincipal defaults) {
            $ = new GetStorageCredentialStorageCredentialInfoAzureServicePrincipal(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The application ID of the application registration within the referenced AAD tenant
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param directoryId The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        public GetStorageCredentialStorageCredentialInfoAzureServicePrincipal build() {
            if ($.applicationId == null) {
                throw new MissingRequiredPropertyException("GetStorageCredentialStorageCredentialInfoAzureServicePrincipal", "applicationId");
            }
            if ($.clientSecret == null) {
                throw new MissingRequiredPropertyException("GetStorageCredentialStorageCredentialInfoAzureServicePrincipal", "clientSecret");
            }
            if ($.directoryId == null) {
                throw new MissingRequiredPropertyException("GetStorageCredentialStorageCredentialInfoAzureServicePrincipal", "directoryId");
            }
            return $;
        }
    }

}
