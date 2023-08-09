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
    public sealed class JobParameter
    {
        /// <summary>
        /// Default value of the parameter.
        /// </summary>
        public readonly string? Default;
        /// <summary>
        /// An optional name for the job. The default value is Untitled.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private JobParameter(
            string? @default,

            string? name)
        {
            Default = @default;
            Name = name;
        }
    }
}
