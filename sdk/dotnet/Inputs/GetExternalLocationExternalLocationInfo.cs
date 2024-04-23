// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetExternalLocationExternalLocationInfoArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ARN of the s3 access point to use with the external location (AWS).
        /// </summary>
        [Input("accessPoint")]
        public string? AccessPoint { get; set; }

        [Input("browseOnly")]
        public bool? BrowseOnly { get; set; }

        /// <summary>
        /// User-supplied comment.
        /// </summary>
        [Input("comment")]
        public string? Comment { get; set; }

        [Input("createdAt")]
        public int? CreatedAt { get; set; }

        [Input("createdBy")]
        public string? CreatedBy { get; set; }

        [Input("credentialId")]
        public string? CredentialId { get; set; }

        /// <summary>
        /// Name of the databricks.StorageCredential to use with this external location.
        /// </summary>
        [Input("credentialName")]
        public string? CredentialName { get; set; }

        /// <summary>
        /// The options for Server-Side Encryption to be used by each Databricks s3 client when connecting to S3 cloud storage (AWS).
        /// </summary>
        [Input("encryptionDetails")]
        public Inputs.GetExternalLocationExternalLocationInfoEncryptionDetailsArgs? EncryptionDetails { get; set; }

        [Input("metastoreId")]
        public string? MetastoreId { get; set; }

        /// <summary>
        /// The name of the storage credential
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Username/groupname/sp application_id of the external location owner.
        /// </summary>
        [Input("owner")]
        public string? Owner { get; set; }

        /// <summary>
        /// Indicates whether the external location is read-only.
        /// </summary>
        [Input("readOnly")]
        public bool? ReadOnly { get; set; }

        [Input("updatedAt")]
        public int? UpdatedAt { get; set; }

        [Input("updatedBy")]
        public string? UpdatedBy { get; set; }

        /// <summary>
        /// Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
        /// </summary>
        [Input("url")]
        public string? Url { get; set; }

        public GetExternalLocationExternalLocationInfoArgs()
        {
        }
        public static new GetExternalLocationExternalLocationInfoArgs Empty => new GetExternalLocationExternalLocationInfoArgs();
    }
}