// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobSparkPythonTaskGetArgs : Pulumi.ResourceArgs
    {
        [Input("parameters")]
        private InputList<string>? _parameters;

        /// <summary>
        /// Parameters for the task
        /// </summary>
        public InputList<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// The URI of the Python file to be executed. databricks.DbfsFile and S3 paths are supported. This field is required.
        /// </summary>
        [Input("pythonFile", required: true)]
        public Input<string> PythonFile { get; set; } = null!;

        public JobSparkPythonTaskGetArgs()
        {
        }
    }
}
