// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetStorageCredentialStorageCredentialInfoAzureServicePrincipalInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The application ID of the application registration within the referenced AAD tenant
        /// </summary>
        [Input("applicationId", required: true)]
        public Input<string> ApplicationId { get; set; } = null!;

        [Input("clientSecret", required: true)]
        public Input<string> ClientSecret { get; set; } = null!;

        /// <summary>
        /// The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
        /// </summary>
        [Input("directoryId", required: true)]
        public Input<string> DirectoryId { get; set; } = null!;

        public GetStorageCredentialStorageCredentialInfoAzureServicePrincipalInputArgs()
        {
        }
        public static new GetStorageCredentialStorageCredentialInfoAzureServicePrincipalInputArgs Empty => new GetStorageCredentialStorageCredentialInfoAzureServicePrincipalInputArgs();
    }
}
