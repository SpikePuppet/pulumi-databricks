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
    public sealed class GetShareObjectPartitionValueResult
    {
        /// <summary>
        /// The name of the share
        /// </summary>
        public readonly string Name;
        public readonly string Op;
        public readonly string? RecipientPropertyKey;
        public readonly string? Value;

        [OutputConstructor]
        private GetShareObjectPartitionValueResult(
            string name,

            string op,

            string? recipientPropertyKey,

            string? value)
        {
            Name = name;
            Op = op;
            RecipientPropertyKey = recipientPropertyKey;
            Value = value;
        }
    }
}
