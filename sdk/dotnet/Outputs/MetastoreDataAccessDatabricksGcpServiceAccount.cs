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
    public sealed class MetastoreDataAccessDatabricksGcpServiceAccount
    {
        public readonly string? CredentialId;
        /// <summary>
        /// The email of the GCP service account created, to be granted access to relevant buckets.
        /// 
        /// `azure_service_principal` optional configuration block for credential details for Azure (Legacy):
        /// </summary>
        public readonly string? Email;

        [OutputConstructor]
        private MetastoreDataAccessDatabricksGcpServiceAccount(
            string? credentialId,

            string? email)
        {
            CredentialId = credentialId;
            Email = email;
        }
    }
}
