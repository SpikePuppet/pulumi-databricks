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
    public sealed class ShareObjectPartitionValue
    {
        /// <summary>
        /// The name of the partition column.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The operator to apply for the value, one of: `EQUAL`, `LIKE`
        /// </summary>
        public readonly string Op;
        /// <summary>
        /// The key of a Delta Sharing recipient's property. For example `databricks-account-id`. When this field is set, field `value` can not be set.
        /// </summary>
        public readonly string? RecipientPropertyKey;
        /// <summary>
        /// The value of the partition column. When this value is not set, it means null value. When this field is set, field `recipient_property_key` can not be set.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private ShareObjectPartitionValue(
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
