// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskHealthRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// string specifying the metric to check.  The only supported metric is `RUN_DURATION_SECONDS` (check [Jobs REST API documentation](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
        /// </summary>
        [Input("metric")]
        public Input<string>? Metric { get; set; }

        /// <summary>
        /// The string specifying the operation used to compare operands.  Currently, following operators are supported: `EQUAL_TO`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `NOT_EQUAL`. (Check the [API docs](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
        /// 
        /// This task does not require a cluster to execute and does not support retries or notifications.
        /// </summary>
        [Input("op")]
        public Input<string>? Op { get; set; }

        /// <summary>
        /// integer value used to compare to the given metric.
        /// </summary>
        [Input("value")]
        public Input<int>? Value { get; set; }

        public JobTaskHealthRuleArgs()
        {
        }
        public static new JobTaskHealthRuleArgs Empty => new JobTaskHealthRuleArgs();
    }
}
