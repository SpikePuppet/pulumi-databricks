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
    public sealed class GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccountResult
    {
        public readonly string? CredentialId;
        /// <summary>
        /// The email of the GCP service account created, to be granted access to relevant buckets.
        /// </summary>
        public readonly string? Email;

        [OutputConstructor]
        private GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccountResult(
            string? credentialId,

            string? email)
        {
            CredentialId = credentialId;
            Email = email;
        }
    }
}
