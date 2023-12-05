// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MwsCustomerManagedKeysAwsKeyInfoGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS KMS key alias.
        /// </summary>
        [Input("keyAlias")]
        public Input<string>? KeyAlias { get; set; }

        /// <summary>
        /// The AWS KMS key's Amazon Resource Name (ARN).
        /// </summary>
        [Input("keyArn", required: true)]
        public Input<string> KeyArn { get; set; } = null!;

        /// <summary>
        /// (Computed) The AWS region in which KMS key is deployed to. This is not required.
        /// </summary>
        [Input("keyRegion")]
        public Input<string>? KeyRegion { get; set; }

        public MwsCustomerManagedKeysAwsKeyInfoGetArgs()
        {
        }
        public static new MwsCustomerManagedKeysAwsKeyInfoGetArgs Empty => new MwsCustomerManagedKeysAwsKeyInfoGetArgs();
    }
}
