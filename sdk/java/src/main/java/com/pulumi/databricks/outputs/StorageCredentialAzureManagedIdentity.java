// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StorageCredentialAzureManagedIdentity {
    /**
     * @return The Resource ID of the Azure Databricks Access Connector resource, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.Databricks/accessConnectors/connector-name`.
     * 
     */
    private String accessConnectorId;
    private @Nullable String credentialId;
    /**
     * @return The Resource ID of the Azure User Assigned Managed Identity associated with Azure Databricks Access Connector, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.ManagedIdentity/userAssignedIdentities/user-managed-identity-name`.
     * 
     * `databricks_gcp_service_account` optional configuration block for creating a Databricks-managed GCP Service Account:
     * 
     */
    private @Nullable String managedIdentityId;

    private StorageCredentialAzureManagedIdentity() {}
    /**
     * @return The Resource ID of the Azure Databricks Access Connector resource, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.Databricks/accessConnectors/connector-name`.
     * 
     */
    public String accessConnectorId() {
        return this.accessConnectorId;
    }
    public Optional<String> credentialId() {
        return Optional.ofNullable(this.credentialId);
    }
    /**
     * @return The Resource ID of the Azure User Assigned Managed Identity associated with Azure Databricks Access Connector, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.ManagedIdentity/userAssignedIdentities/user-managed-identity-name`.
     * 
     * `databricks_gcp_service_account` optional configuration block for creating a Databricks-managed GCP Service Account:
     * 
     */
    public Optional<String> managedIdentityId() {
        return Optional.ofNullable(this.managedIdentityId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageCredentialAzureManagedIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessConnectorId;
        private @Nullable String credentialId;
        private @Nullable String managedIdentityId;
        public Builder() {}
        public Builder(StorageCredentialAzureManagedIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConnectorId = defaults.accessConnectorId;
    	      this.credentialId = defaults.credentialId;
    	      this.managedIdentityId = defaults.managedIdentityId;
        }

        @CustomType.Setter
        public Builder accessConnectorId(String accessConnectorId) {
            if (accessConnectorId == null) {
              throw new MissingRequiredPropertyException("StorageCredentialAzureManagedIdentity", "accessConnectorId");
            }
            this.accessConnectorId = accessConnectorId;
            return this;
        }
        @CustomType.Setter
        public Builder credentialId(@Nullable String credentialId) {

            this.credentialId = credentialId;
            return this;
        }
        @CustomType.Setter
        public Builder managedIdentityId(@Nullable String managedIdentityId) {

            this.managedIdentityId = managedIdentityId;
            return this;
        }
        public StorageCredentialAzureManagedIdentity build() {
            final var _resultValue = new StorageCredentialAzureManagedIdentity();
            _resultValue.accessConnectorId = accessConnectorId;
            _resultValue.credentialId = credentialId;
            _resultValue.managedIdentityId = managedIdentityId;
            return _resultValue;
        }
    }
}
