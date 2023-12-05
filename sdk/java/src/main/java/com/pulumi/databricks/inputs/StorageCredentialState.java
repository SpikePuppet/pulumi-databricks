// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.StorageCredentialAwsIamRoleArgs;
import com.pulumi.databricks.inputs.StorageCredentialAzureManagedIdentityArgs;
import com.pulumi.databricks.inputs.StorageCredentialAzureServicePrincipalArgs;
import com.pulumi.databricks.inputs.StorageCredentialDatabricksGcpServiceAccountArgs;
import com.pulumi.databricks.inputs.StorageCredentialGcpServiceAccountKeyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StorageCredentialState extends com.pulumi.resources.ResourceArgs {

    public static final StorageCredentialState Empty = new StorageCredentialState();

    @Import(name="awsIamRole")
    private @Nullable Output<StorageCredentialAwsIamRoleArgs> awsIamRole;

    public Optional<Output<StorageCredentialAwsIamRoleArgs>> awsIamRole() {
        return Optional.ofNullable(this.awsIamRole);
    }

    @Import(name="azureManagedIdentity")
    private @Nullable Output<StorageCredentialAzureManagedIdentityArgs> azureManagedIdentity;

    public Optional<Output<StorageCredentialAzureManagedIdentityArgs>> azureManagedIdentity() {
        return Optional.ofNullable(this.azureManagedIdentity);
    }

    @Import(name="azureServicePrincipal")
    private @Nullable Output<StorageCredentialAzureServicePrincipalArgs> azureServicePrincipal;

    public Optional<Output<StorageCredentialAzureServicePrincipalArgs>> azureServicePrincipal() {
        return Optional.ofNullable(this.azureServicePrincipal);
    }

    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="databricksGcpServiceAccount")
    private @Nullable Output<StorageCredentialDatabricksGcpServiceAccountArgs> databricksGcpServiceAccount;

    public Optional<Output<StorageCredentialDatabricksGcpServiceAccountArgs>> databricksGcpServiceAccount() {
        return Optional.ofNullable(this.databricksGcpServiceAccount);
    }

    /**
     * Delete storage credential regardless of its dependencies.
     * 
     * `aws_iam_role` optional configuration block for credential details for AWS:
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return Delete storage credential regardless of its dependencies.
     * 
     * `aws_iam_role` optional configuration block for credential details for AWS:
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    @Import(name="gcpServiceAccountKey")
    private @Nullable Output<StorageCredentialGcpServiceAccountKeyArgs> gcpServiceAccountKey;

    public Optional<Output<StorageCredentialGcpServiceAccountKeyArgs>> gcpServiceAccountKey() {
        return Optional.ofNullable(this.gcpServiceAccountKey);
    }

    /**
     * Unique identifier of the parent Metastore
     * 
     */
    @Import(name="metastoreId")
    private @Nullable Output<String> metastoreId;

    /**
     * @return Unique identifier of the parent Metastore
     * 
     */
    public Optional<Output<String>> metastoreId() {
        return Optional.ofNullable(this.metastoreId);
    }

    /**
     * Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Username/groupname/sp application_id of the storage credential owner.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return Username/groupname/sp application_id of the storage credential owner.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * Indicates whether the storage credential is only usable for read operations.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return Indicates whether the storage credential is only usable for read operations.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    private StorageCredentialState() {}

    private StorageCredentialState(StorageCredentialState $) {
        this.awsIamRole = $.awsIamRole;
        this.azureManagedIdentity = $.azureManagedIdentity;
        this.azureServicePrincipal = $.azureServicePrincipal;
        this.comment = $.comment;
        this.databricksGcpServiceAccount = $.databricksGcpServiceAccount;
        this.forceDestroy = $.forceDestroy;
        this.gcpServiceAccountKey = $.gcpServiceAccountKey;
        this.metastoreId = $.metastoreId;
        this.name = $.name;
        this.owner = $.owner;
        this.readOnly = $.readOnly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageCredentialState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageCredentialState $;

        public Builder() {
            $ = new StorageCredentialState();
        }

        public Builder(StorageCredentialState defaults) {
            $ = new StorageCredentialState(Objects.requireNonNull(defaults));
        }

        public Builder awsIamRole(@Nullable Output<StorageCredentialAwsIamRoleArgs> awsIamRole) {
            $.awsIamRole = awsIamRole;
            return this;
        }

        public Builder awsIamRole(StorageCredentialAwsIamRoleArgs awsIamRole) {
            return awsIamRole(Output.of(awsIamRole));
        }

        public Builder azureManagedIdentity(@Nullable Output<StorageCredentialAzureManagedIdentityArgs> azureManagedIdentity) {
            $.azureManagedIdentity = azureManagedIdentity;
            return this;
        }

        public Builder azureManagedIdentity(StorageCredentialAzureManagedIdentityArgs azureManagedIdentity) {
            return azureManagedIdentity(Output.of(azureManagedIdentity));
        }

        public Builder azureServicePrincipal(@Nullable Output<StorageCredentialAzureServicePrincipalArgs> azureServicePrincipal) {
            $.azureServicePrincipal = azureServicePrincipal;
            return this;
        }

        public Builder azureServicePrincipal(StorageCredentialAzureServicePrincipalArgs azureServicePrincipal) {
            return azureServicePrincipal(Output.of(azureServicePrincipal));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder databricksGcpServiceAccount(@Nullable Output<StorageCredentialDatabricksGcpServiceAccountArgs> databricksGcpServiceAccount) {
            $.databricksGcpServiceAccount = databricksGcpServiceAccount;
            return this;
        }

        public Builder databricksGcpServiceAccount(StorageCredentialDatabricksGcpServiceAccountArgs databricksGcpServiceAccount) {
            return databricksGcpServiceAccount(Output.of(databricksGcpServiceAccount));
        }

        /**
         * @param forceDestroy Delete storage credential regardless of its dependencies.
         * 
         * `aws_iam_role` optional configuration block for credential details for AWS:
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * @param forceDestroy Delete storage credential regardless of its dependencies.
         * 
         * `aws_iam_role` optional configuration block for credential details for AWS:
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        public Builder gcpServiceAccountKey(@Nullable Output<StorageCredentialGcpServiceAccountKeyArgs> gcpServiceAccountKey) {
            $.gcpServiceAccountKey = gcpServiceAccountKey;
            return this;
        }

        public Builder gcpServiceAccountKey(StorageCredentialGcpServiceAccountKeyArgs gcpServiceAccountKey) {
            return gcpServiceAccountKey(Output.of(gcpServiceAccountKey));
        }

        /**
         * @param metastoreId Unique identifier of the parent Metastore
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(@Nullable Output<String> metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        /**
         * @param metastoreId Unique identifier of the parent Metastore
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(String metastoreId) {
            return metastoreId(Output.of(metastoreId));
        }

        /**
         * @param name Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param owner Username/groupname/sp application_id of the storage credential owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Username/groupname/sp application_id of the storage credential owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param readOnly Indicates whether the storage credential is only usable for read operations.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly Indicates whether the storage credential is only usable for read operations.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public StorageCredentialState build() {
            return $;
        }
    }

}
