// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskForEachTaskTaskHealthGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("rules", required: true)]
        private InputList<Inputs.JobTaskForEachTaskTaskHealthRuleGetArgs>? _rules;

        /// <summary>
        /// list of rules that are represented as objects with the following attributes:
        /// </summary>
        public InputList<Inputs.JobTaskForEachTaskTaskHealthRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.JobTaskForEachTaskTaskHealthRuleGetArgs>());
            set => _rules = value;
        }

        public JobTaskForEachTaskTaskHealthGetArgs()
        {
        }
        public static new JobTaskForEachTaskTaskHealthGetArgs Empty => new JobTaskForEachTaskTaskHealthGetArgs();
    }
}
