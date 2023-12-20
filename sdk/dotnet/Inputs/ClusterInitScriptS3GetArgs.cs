// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ClusterInitScriptS3GetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set canned access control list, e.g. `bucket-owner-full-control`. If `canned_cal` is set, the cluster instance profile must have `s3:PutObjectAcl` permission on the destination bucket and prefix. The full list of possible canned ACLs can be found [here](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl). By default, only the object owner gets full control. If you are using a cross-account role for writing data, you may want to set `bucket-owner-full-control` to make bucket owners able to read the logs.
        /// </summary>
        [Input("cannedAcl")]
        public Input<string>? CannedAcl { get; set; }

        /// <summary>
        /// S3 destination, e.g., `s3://my-bucket/some-prefix` You must configure the cluster with an instance profile, and the instance profile must have write access to the destination. You cannot use AWS keys.
        /// </summary>
        [Input("destination", required: true)]
        public Input<string> Destination { get; set; } = null!;

        /// <summary>
        /// Enable server-side encryption, false by default.
        /// </summary>
        [Input("enableEncryption")]
        public Input<bool>? EnableEncryption { get; set; }

        /// <summary>
        /// The encryption type, it could be `sse-s3` or `sse-kms`. It is used only when encryption is enabled, and the default type is `sse-s3`.
        /// </summary>
        [Input("encryptionType")]
        public Input<string>? EncryptionType { get; set; }

        /// <summary>
        /// S3 endpoint, e.g. &lt;https://s3-us-west-2.amazonaws.com&gt;. Either `region` or `endpoint` needs to be set. If both are set, the endpoint is used.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// KMS key used if encryption is enabled and encryption type is set to `sse-kms`.
        /// </summary>
        [Input("kmsKey")]
        public Input<string>? KmsKey { get; set; }

        /// <summary>
        /// S3 region, e.g. `us-west-2`. Either `region` or `endpoint` must be set. If both are set, the endpoint is used.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public ClusterInitScriptS3GetArgs()
        {
        }
        public static new ClusterInitScriptS3GetArgs Empty => new ClusterInitScriptS3GetArgs();
    }
}
