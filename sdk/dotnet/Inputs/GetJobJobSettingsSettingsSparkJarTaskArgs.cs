// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsSparkJarTaskInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("jarUri")]
        public Input<string>? JarUri { get; set; }

        [Input("mainClassName")]
        public Input<string>? MainClassName { get; set; }

        [Input("parameters")]
        private InputList<string>? _parameters;
        public InputList<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<string>());
            set => _parameters = value;
        }

        public GetJobJobSettingsSettingsSparkJarTaskInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsSparkJarTaskInputArgs Empty => new GetJobJobSettingsSettingsSparkJarTaskInputArgs();
    }
}