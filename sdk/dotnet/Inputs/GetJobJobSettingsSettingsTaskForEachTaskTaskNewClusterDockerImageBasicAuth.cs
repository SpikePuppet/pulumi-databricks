// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuthArgs : global::Pulumi.InvokeArgs
    {
        [Input("password", required: true)]
        private string? _password;
        public string? Password
        {
            get => _password;
            set => _password = value;
        }

        [Input("username", required: true)]
        public string Username { get; set; } = null!;

        public GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuthArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuthArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuthArgs();
    }
}
