// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsParameterArgs : global::Pulumi.InvokeArgs
    {
        [Input("default", required: true)]
        public string Default { get; set; } = null!;

        /// <summary>
        /// the job name of databricks.Job if the resource was matched by id.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetJobJobSettingsSettingsParameterArgs()
        {
        }
        public static new GetJobJobSettingsSettingsParameterArgs Empty => new GetJobJobSettingsSettingsParameterArgs();
    }
}
