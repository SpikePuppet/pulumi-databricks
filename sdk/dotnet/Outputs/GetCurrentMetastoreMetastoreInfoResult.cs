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
    public sealed class GetCurrentMetastoreMetastoreInfoResult
    {
        public readonly string? Cloud;
        /// <summary>
        /// Timestamp (in milliseconds) when the current metastore was created.
        /// </summary>
        public readonly int? CreatedAt;
        /// <summary>
        /// the ID of the identity that created the current metastore.
        /// </summary>
        public readonly string? CreatedBy;
        /// <summary>
        /// the ID of the default data access configuration.
        /// </summary>
        public readonly string? DefaultDataAccessConfigId;
        /// <summary>
        /// The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing.
        /// </summary>
        public readonly string? DeltaSharingOrganizationName;
        /// <summary>
        /// the expiration duration in seconds on recipient data access tokens.
        /// </summary>
        public readonly int? DeltaSharingRecipientTokenLifetimeInSeconds;
        /// <summary>
        /// Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.
        /// </summary>
        public readonly string? DeltaSharingScope;
        /// <summary>
        /// Identifier in form of `&lt;cloud&gt;:&lt;region&gt;:&lt;metastore_id&gt;` for use in Databricks to Databricks Delta Sharing.
        /// </summary>
        public readonly string? GlobalMetastoreId;
        /// <summary>
        /// Metastore ID.
        /// </summary>
        public readonly string? MetastoreId;
        /// <summary>
        /// Name of metastore.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Username/group name/sp application_id of the metastore owner.
        /// </summary>
        public readonly string? Owner;
        /// <summary>
        /// the version of the privilege model used by the metastore.
        /// </summary>
        public readonly string? PrivilegeModelVersion;
        /// <summary>
        /// (Mandatory for account-level) The region of the metastore.
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// Path on cloud storage account, where managed `databricks.Table` are stored.
        /// </summary>
        public readonly string? StorageRoot;
        /// <summary>
        /// ID of a storage credential used for the `storage_root`.
        /// </summary>
        public readonly string? StorageRootCredentialId;
        /// <summary>
        /// Name of a storage credential used for the `storage_root`.
        /// </summary>
        public readonly string? StorageRootCredentialName;
        /// <summary>
        /// Timestamp (in milliseconds) when the current metastore was updated.
        /// </summary>
        public readonly int? UpdatedAt;
        /// <summary>
        /// the ID of the identity that updated the current metastore.
        /// </summary>
        public readonly string? UpdatedBy;

        [OutputConstructor]
        private GetCurrentMetastoreMetastoreInfoResult(
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
