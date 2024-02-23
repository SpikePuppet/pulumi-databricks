// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("alert")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertInputArgs>? Alert { get; set; }

        [Input("dashboard")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardInputArgs>? Dashboard { get; set; }

        [Input("file")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskFileInputArgs>? File { get; set; }

        [Input("parameters")]
        private InputMap<object>? _parameters;
        public InputMap<object> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<object>());
            set => _parameters = value;
        }

        [Input("query")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQueryInputArgs>? Query { get; set; }

        [Input("warehouseId")]
        public Input<string>? WarehouseId { get; set; }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskInputArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskInputArgs();
    }
}