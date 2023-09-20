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
    public sealed class RecipientToken
    {
        /// <summary>
        /// Full activation URL to retrieve the access token. It will be empty if the token is already retrieved.
        /// </summary>
        public readonly string? ActivationUrl;
        /// <summary>
        /// Time at which this recipient Token was created, in epoch milliseconds.
        /// </summary>
        public readonly int? CreatedAt;
        /// <summary>
        /// Username of recipient token creator.
        /// </summary>
        public readonly string? CreatedBy;
        /// <summary>
        /// Expiration timestamp of the token in epoch milliseconds.
        /// </summary>
        public readonly int? ExpirationTime;
        /// <summary>
        /// ID of this recipient - same as the `name`.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Time at which this recipient Token was updated, in epoch milliseconds.
        /// </summary>
        public readonly int? UpdatedAt;
        /// <summary>
        /// Username of recipient Token updater.
        /// </summary>
        public readonly string? UpdatedBy;

        [OutputConstructor]
        private RecipientToken(
            string? activationUrl,

            int? createdAt,

            string? createdBy,

            int? expirationTime,

            string? id,

            int? updatedAt,

            string? updatedBy)
        {
            ActivationUrl = activationUrl;
            CreatedAt = createdAt;
            CreatedBy = createdBy;
            ExpirationTime = expirationTime;
            Id = id;
            UpdatedAt = updatedAt;
            UpdatedBy = updatedBy;
        }
    }
}
