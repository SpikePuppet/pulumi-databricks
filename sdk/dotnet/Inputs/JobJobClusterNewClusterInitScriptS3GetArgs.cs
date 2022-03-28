// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobJobClusterNewClusterInitScriptS3GetArgs : Pulumi.ResourceArgs
    {
        [Input("cannedAcl")]
        public Input<string>? CannedAcl { get; set; }

        [Input("destination", required: true)]
        public Input<string> Destination { get; set; } = null!;

        [Input("enableEncryption")]
        public Input<bool>? EnableEncryption { get; set; }

        [Input("encryptionType")]
        public Input<string>? EncryptionType { get; set; }

        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        [Input("kmsKey")]
        public Input<string>? KmsKey { get; set; }

        [Input("region")]
        public Input<string>? Region { get; set; }

        public JobJobClusterNewClusterInitScriptS3GetArgs()
        {
        }
    }
}
