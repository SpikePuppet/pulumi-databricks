// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class StorageCredentialAzureServicePrincipalArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The application ID of the application registration within the referenced AAD tenant
        /// </summary>
        [Input("applicationId", required: true)]
        public Input<string> ApplicationId { get; set; } = null!;

        /// <summary>
        /// The client secret generated for the above app ID in AAD. **This field is redacted on output**
        /// 
        /// `databricks_gcp_service_account` optional configuration block for creating a Databricks-managed GCP Service Account:
        /// </summary>
        [Input("clientSecret", required: true)]
        public Input<string> ClientSecret { get; set; } = null!;

        /// <summary>
        /// The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
        /// </summary>
        [Input("directoryId", required: true)]
        public Input<string> DirectoryId { get; set; } = null!;

        public StorageCredentialAzureServicePrincipalArgs()
        {
        }
        public static new StorageCredentialAzureServicePrincipalArgs Empty => new StorageCredentialAzureServicePrincipalArgs();
    }
}
