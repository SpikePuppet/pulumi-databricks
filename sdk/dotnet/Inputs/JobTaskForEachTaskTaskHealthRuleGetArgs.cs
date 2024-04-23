// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskForEachTaskTaskHealthRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// string specifying the metric to check.  The only supported metric is `RUN_DURATION_SECONDS` (check [Jobs REST API documentation](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
        /// </summary>
        [Input("metric")]
        public Input<string>? Metric { get; set; }

        /// <summary>
        /// string specifying the operation used to evaluate the given metric. The only supported operation is `GREATER_THAN`.
        /// </summary>
        [Input("op")]
        public Input<string>? Op { get; set; }

        /// <summary>
        /// integer value used to compare to the given metric.
        /// </summary>
        [Input("value")]
        public Input<int>? Value { get; set; }

        public JobTaskForEachTaskTaskHealthRuleGetArgs()
        {
        }
        public static new JobTaskForEachTaskTaskHealthRuleGetArgs Empty => new JobTaskForEachTaskTaskHealthRuleGetArgs();
    }
}
