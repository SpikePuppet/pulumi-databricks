// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskSqlTaskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// block consisting of following fields:
        /// </summary>
        [Input("alert")]
        public Input<Inputs.JobTaskSqlTaskAlertArgs>? Alert { get; set; }

        /// <summary>
        /// block consisting of following fields:
        /// </summary>
        [Input("dashboard")]
        public Input<Inputs.JobTaskSqlTaskDashboardArgs>? Dashboard { get; set; }

        /// <summary>
        /// block consisting of single string fields:
        /// </summary>
        [Input("file")]
        public Input<Inputs.JobTaskSqlTaskFileArgs>? File { get; set; }

        [Input("parameters")]
        private InputMap<object>? _parameters;

        /// <summary>
        /// (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
        /// </summary>
        public InputMap<object> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<object>());
            set => _parameters = value;
        }

        /// <summary>
        /// block consisting of single string field: `query_id` - identifier of the Databricks SQL Query (databricks_sql_query).
        /// </summary>
        [Input("query")]
        public Input<Inputs.JobTaskSqlTaskQueryArgs>? Query { get; set; }

        /// <summary>
        /// ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only Serverless &amp; Pro warehouses are supported right now.
        /// </summary>
        [Input("warehouseId", required: true)]
        public Input<string> WarehouseId { get; set; } = null!;

        public JobTaskSqlTaskArgs()
        {
        }
        public static new JobTaskSqlTaskArgs Empty => new JobTaskSqlTaskArgs();
    }
}
