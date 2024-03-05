// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetMetastoreMetastoreInfoInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("cloud")]
        public Input<string>? Cloud { get; set; }

        [Input("createdAt")]
        public Input<int>? CreatedAt { get; set; }

        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        [Input("defaultDataAccessConfigId")]
        public Input<string>? DefaultDataAccessConfigId { get; set; }

        /// <summary>
        /// The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing.
        /// </summary>
        [Input("deltaSharingOrganizationName")]
        public Input<string>? DeltaSharingOrganizationName { get; set; }

        /// <summary>
        /// Used to set expiration duration in seconds on recipient data access tokens.
        /// </summary>
        [Input("deltaSharingRecipientTokenLifetimeInSeconds")]
        public Input<int>? DeltaSharingRecipientTokenLifetimeInSeconds { get; set; }

        /// <summary>
        /// Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL. INTERNAL only allows sharing within the same account, and INTERNAL_AND_EXTERNAL allows cross account sharing and token based sharing.
        /// </summary>
        [Input("deltaSharingScope")]
        public Input<string>? DeltaSharingScope { get; set; }

        [Input("globalMetastoreId")]
        public Input<string>? GlobalMetastoreId { get; set; }

        /// <summary>
        /// Id of the metastore to be fetched
        /// </summary>
        [Input("metastoreId")]
        public Input<string>? MetastoreId { get; set; }

        /// <summary>
        /// Name of metastore.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Username/groupname/sp application_id of the metastore owner.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("privilegeModelVersion")]
        public Input<string>? PrivilegeModelVersion { get; set; }

        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Path on cloud storage account, where managed `databricks.Table` are stored.
        /// </summary>
        [Input("storageRoot")]
        public Input<string>? StorageRoot { get; set; }

        [Input("storageRootCredentialId")]
        public Input<string>? StorageRootCredentialId { get; set; }

        [Input("storageRootCredentialName")]
        public Input<string>? StorageRootCredentialName { get; set; }

        [Input("updatedAt")]
        public Input<int>? UpdatedAt { get; set; }

        [Input("updatedBy")]
        public Input<string>? UpdatedBy { get; set; }

        public GetMetastoreMetastoreInfoInputArgs()
        {
        }
        public static new GetMetastoreMetastoreInfoInputArgs Empty => new GetMetastoreMetastoreInfoInputArgs();
    }
}
