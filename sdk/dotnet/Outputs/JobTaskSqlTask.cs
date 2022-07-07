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
    public sealed class JobTaskSqlTask
    {
        public readonly Outputs.JobTaskSqlTaskAlert? Alert;
        public readonly Outputs.JobTaskSqlTaskDashboard? Dashboard;
        /// <summary>
        /// Parameters for the task
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Parameters;
        public readonly Outputs.JobTaskSqlTaskQuery? Query;
        public readonly string? WarehouseId;

        [OutputConstructor]
        private JobTaskSqlTask(
            Outputs.JobTaskSqlTaskAlert? alert,

            Outputs.JobTaskSqlTaskDashboard? dashboard,

            ImmutableDictionary<string, object>? parameters,

            Outputs.JobTaskSqlTaskQuery? query,

            string? warehouseId)
        {
            Alert = alert;
            Dashboard = dashboard;
            Parameters = parameters;
            Query = query;
            WarehouseId = warehouseId;
        }
    }
}
