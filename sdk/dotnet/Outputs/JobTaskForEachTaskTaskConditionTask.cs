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
    public sealed class JobTaskForEachTaskTaskConditionTask
    {
        /// <summary>
        /// The left operand of the condition task. It could be a string value, job state, or a parameter reference.
        /// </summary>
        public readonly string Left;
        /// <summary>
        /// The string specifying the operation used to compare operands.  Currently, following operators are supported: `EQUAL_TO`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `NOT_EQUAL`. (Check the [API docs](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
        /// 
        /// This task does not require a cluster to execute and does not support retries or notifications.
        /// </summary>
        public readonly string Op;
        /// <summary>
        /// The right operand of the condition task. It could be a string value, job state, or parameter reference.
        /// </summary>
        public readonly string Right;

        [OutputConstructor]
        private JobTaskForEachTaskTaskConditionTask(
            string left,

            string op,

            string right)
        {
            Left = left;
            Op = op;
            Right = right;
        }
    }
}
