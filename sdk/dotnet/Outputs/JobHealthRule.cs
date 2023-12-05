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
    public sealed class JobHealthRule
    {
        /// <summary>
        /// string specifying the metric to check.  The only supported metric is `RUN_DURATION_SECONDS` (check [Jobs REST API documentation](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
        /// </summary>
        public readonly string? Metric;
        /// <summary>
        /// The string specifying the operation used to compare operands.  Currently, following operators are supported: `EQUAL_TO`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `NOT_EQUAL`. (Check the [API docs](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
        /// 
        /// This task does not require a cluster to execute and does not support retries or notifications.
        /// </summary>
        public readonly string? Op;
        /// <summary>
        /// integer value used to compare to the given metric.
        /// </summary>
        public readonly int? Value;

        [OutputConstructor]
        private JobHealthRule(
            string? metric,

            string? op,

            int? value)
        {
            Metric = metric;
            Op = op;
            Value = value;
        }
    }
}
