// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MetastoreDataAccessAzureManagedIdentityArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessConnectorId", required: true)]
        public Input<string> AccessConnectorId { get; set; } = null!;

        [Input("credentialId")]
        public Input<string>? CredentialId { get; set; }

        [Input("managedIdentityId")]
        public Input<string>? ManagedIdentityId { get; set; }

        public MetastoreDataAccessAzureManagedIdentityArgs()
        {
        }
        public static new MetastoreDataAccessAzureManagedIdentityArgs Empty => new MetastoreDataAccessAzureManagedIdentityArgs();
    }
}
