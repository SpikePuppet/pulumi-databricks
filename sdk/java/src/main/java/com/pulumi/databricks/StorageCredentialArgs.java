// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

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


public final class StorageCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageCredentialArgs Empty = new StorageCredentialArgs();

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
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return Delete storage credential regardless of its dependencies.
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * Update storage credential regardless of its dependents.
     * 
     * `aws_iam_role` optional configuration block for credential details for AWS:
     * 
     */
    @Import(name="forceUpdate")
    private @Nullable Output<Boolean> forceUpdate;

    /**
     * @return Update storage credential regardless of its dependents.
     * 
     * `aws_iam_role` optional configuration block for credential details for AWS:
     * 
     */
    public Optional<Output<Boolean>> forceUpdate() {
        return Optional.ofNullable(this.forceUpdate);
    }

    @Import(name="gcpServiceAccountKey")
    private @Nullable Output<StorageCredentialGcpServiceAccountKeyArgs> gcpServiceAccountKey;

    public Optional<Output<StorageCredentialGcpServiceAccountKeyArgs>> gcpServiceAccountKey() {
        return Optional.ofNullable(this.gcpServiceAccountKey);
    }

    /**
     * Unique identifier of the parent Metastore. If set for workspace-level, it must match the ID of the metastore assigned to the worspace. When changing the metastore assigned to a workspace, this field becomes required.
     * 
     */
    @Import(name="metastoreId")
    private @Nullable Output<String> metastoreId;

    /**
     * @return Unique identifier of the parent Metastore. If set for workspace-level, it must match the ID of the metastore assigned to the worspace. When changing the metastore assigned to a workspace, this field becomes required.
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

    /**
     * Suppress validation errors if any &amp; force save the storage credential.
     * 
     */
    @Import(name="skipValidation")
    private @Nullable Output<Boolean> skipValidation;

    /**
     * @return Suppress validation errors if any &amp; force save the storage credential.
     * 
     */
    public Optional<Output<Boolean>> skipValidation() {
        return Optional.ofNullable(this.skipValidation);
    }

    private StorageCredentialArgs() {}

    private StorageCredentialArgs(StorageCredentialArgs $) {
        this.awsIamRole = $.awsIamRole;
        this.azureManagedIdentity = $.azureManagedIdentity;
        this.azureServicePrincipal = $.azureServicePrincipal;
        this.comment = $.comment;
        this.databricksGcpServiceAccount = $.databricksGcpServiceAccount;
        this.forceDestroy = $.forceDestroy;
        this.forceUpdate = $.forceUpdate;
        this.gcpServiceAccountKey = $.gcpServiceAccountKey;
        this.metastoreId = $.metastoreId;
        this.name = $.name;
        this.owner = $.owner;
        this.readOnly = $.readOnly;
        this.skipValidation = $.skipValidation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageCredentialArgs $;

        public Builder() {
            $ = new StorageCredentialArgs();
        }

        public Builder(StorageCredentialArgs defaults) {
            $ = new StorageCredentialArgs(Objects.requireNonNull(defaults));
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
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        /**
         * @param forceUpdate Update storage credential regardless of its dependents.
         * 
         * `aws_iam_role` optional configuration block for credential details for AWS:
         * 
         * @return builder
         * 
         */
        public Builder forceUpdate(@Nullable Output<Boolean> forceUpdate) {
            $.forceUpdate = forceUpdate;
            return this;
        }

        /**
         * @param forceUpdate Update storage credential regardless of its dependents.
         * 
         * `aws_iam_role` optional configuration block for credential details for AWS:
         * 
         * @return builder
         * 
         */
        public Builder forceUpdate(Boolean forceUpdate) {
            return forceUpdate(Output.of(forceUpdate));
        }

        public Builder gcpServiceAccountKey(@Nullable Output<StorageCredentialGcpServiceAccountKeyArgs> gcpServiceAccountKey) {
            $.gcpServiceAccountKey = gcpServiceAccountKey;
            return this;
        }

        public Builder gcpServiceAccountKey(StorageCredentialGcpServiceAccountKeyArgs gcpServiceAccountKey) {
            return gcpServiceAccountKey(Output.of(gcpServiceAccountKey));
        }

        /**
         * @param metastoreId Unique identifier of the parent Metastore. If set for workspace-level, it must match the ID of the metastore assigned to the worspace. When changing the metastore assigned to a workspace, this field becomes required.
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(@Nullable Output<String> metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        /**
         * @param metastoreId Unique identifier of the parent Metastore. If set for workspace-level, it must match the ID of the metastore assigned to the worspace. When changing the metastore assigned to a workspace, this field becomes required.
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

        /**
         * @param skipValidation Suppress validation errors if any &amp; force save the storage credential.
         * 
         * @return builder
         * 
         */
        public Builder skipValidation(@Nullable Output<Boolean> skipValidation) {
            $.skipValidation = skipValidation;
            return this;
        }

        /**
         * @param skipValidation Suppress validation errors if any &amp; force save the storage credential.
         * 
         * @return builder
         * 
         */
        public Builder skipValidation(Boolean skipValidation) {
            return skipValidation(Output.of(skipValidation));
        }

        public StorageCredentialArgs build() {
            return $;
        }
    }

}
