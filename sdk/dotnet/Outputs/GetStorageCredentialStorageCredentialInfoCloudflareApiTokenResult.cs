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
    public sealed class GetStorageCredentialStorageCredentialInfoCloudflareApiTokenResult
    {
        public readonly string AccessKeyId;
        public readonly string AccountId;
        public readonly string SecretAccessKey;

        [OutputConstructor]
        private GetStorageCredentialStorageCredentialInfoCloudflareApiTokenResult(
            string accessKeyId,

            string accountId,

            string secretAccessKey)
        {
            AccessKeyId = accessKeyId;
            AccountId = accountId;
            SecretAccessKey = secretAccessKey;
        }
    }
}
