// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetMetastoreMetastoreInfoResult
    {
        public readonly string? Cloud;
        public readonly int? CreatedAt;
        public readonly string? CreatedBy;
        public readonly string? DefaultDataAccessConfigId;
        /// <summary>
        /// The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing.
        /// </summary>
        public readonly string? DeltaSharingOrganizationName;
        /// <summary>
        /// Used to set expiration duration in seconds on recipient data access tokens.
        /// </summary>
        public readonly int? DeltaSharingRecipientTokenLifetimeInSeconds;
        /// <summary>
        /// Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL. INTERNAL only allows sharing within the same account, and INTERNAL_AND_EXTERNAL allows cross account sharing and token based sharing.
        /// </summary>
        public readonly string? DeltaSharingScope;
        public readonly string? GlobalMetastoreId;
        /// <summary>
        /// Id of the metastore to be fetched
        /// </summary>
        public readonly string? MetastoreId;
        /// <summary>
        /// Name of metastore.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Username/groupname/sp application_id of the metastore owner.
        /// </summary>
        public readonly string? Owner;
        public readonly string? PrivilegeModelVersion;
        public readonly string? Region;
        /// <summary>
        /// Path on cloud storage account, where managed `databricks.Table` are stored.
        /// </summary>
        public readonly string? StorageRoot;
        public readonly string? StorageRootCredentialId;
        public readonly string? StorageRootCredentialName;
        public readonly int? UpdatedAt;
        public readonly string? UpdatedBy;

        [OutputConstructor]
        private GetMetastoreMetastoreInfoResult(
            string? cloud,

            int? createdAt,

            string? createdBy,

            string? defaultDataAccessConfigId,

            string? deltaSharingOrganizationName,

            int? deltaSharingRecipientTokenLifetimeInSeconds,

            string? deltaSharingScope,

            string? globalMetastoreId,

            string? metastoreId,

            string? name,

            string? owner,

            string? privilegeModelVersion,

            string? region,

            string? storageRoot,

            string? storageRootCredentialId,

            string? storageRootCredentialName,

            int? updatedAt,

            string? updatedBy)
        {
            Cloud = cloud;
            CreatedAt = createdAt;
            CreatedBy = createdBy;
            DefaultDataAccessConfigId = defaultDataAccessConfigId;
            DeltaSharingOrganizationName = deltaSharingOrganizationName;
            DeltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
            DeltaSharingScope = deltaSharingScope;
            GlobalMetastoreId = globalMetastoreId;
            MetastoreId = metastoreId;
            Name = name;
            Owner = owner;
            PrivilegeModelVersion = privilegeModelVersion;
            Region = region;
            StorageRoot = storageRoot;
            StorageRootCredentialId = storageRootCredentialId;
            StorageRootCredentialName = storageRootCredentialName;
            UpdatedAt = updatedAt;
            UpdatedBy = updatedBy;
        }
    }
}
