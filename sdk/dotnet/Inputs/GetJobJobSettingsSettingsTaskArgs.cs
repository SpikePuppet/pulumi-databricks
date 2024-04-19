// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditionTask")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskConditionTaskInputArgs>? ConditionTask { get; set; }

        [Input("dbtTask")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskDbtTaskInputArgs>? DbtTask { get; set; }

        [Input("dependsOns")]
        private InputList<Inputs.GetJobJobSettingsSettingsTaskDependsOnInputArgs>? _dependsOns;
        public InputList<Inputs.GetJobJobSettingsSettingsTaskDependsOnInputArgs> DependsOns
        {
            get => _dependsOns ?? (_dependsOns = new InputList<Inputs.GetJobJobSettingsSettingsTaskDependsOnInputArgs>());
            set => _dependsOns = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("emailNotifications")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskEmailNotificationsInputArgs>? EmailNotifications { get; set; }

        [Input("environmentKey")]
        public Input<string>? EnvironmentKey { get; set; }

        [Input("existingClusterId")]
        public Input<string>? ExistingClusterId { get; set; }

        [Input("forEachTask")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskForEachTaskInputArgs>? ForEachTask { get; set; }

        [Input("health")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskHealthInputArgs>? Health { get; set; }

        [Input("jobClusterKey")]
        public Input<string>? JobClusterKey { get; set; }

        [Input("libraries")]
        private InputList<Inputs.GetJobJobSettingsSettingsTaskLibraryInputArgs>? _libraries;
        public InputList<Inputs.GetJobJobSettingsSettingsTaskLibraryInputArgs> Libraries
        {
            get => _libraries ?? (_libraries = new InputList<Inputs.GetJobJobSettingsSettingsTaskLibraryInputArgs>());
            set => _libraries = value;
        }

        [Input("maxRetries")]
        public Input<int>? MaxRetries { get; set; }

        [Input("minRetryIntervalMillis")]
        public Input<int>? MinRetryIntervalMillis { get; set; }

        [Input("newCluster")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskNewClusterInputArgs>? NewCluster { get; set; }

        [Input("notebookTask")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskNotebookTaskInputArgs>? NotebookTask { get; set; }

        [Input("notificationSettings")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskNotificationSettingsInputArgs>? NotificationSettings { get; set; }

        [Input("pipelineTask")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskPipelineTaskInputArgs>? PipelineTask { get; set; }

        [Input("pythonWheelTask")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskPythonWheelTaskInputArgs>? PythonWheelTask { get; set; }

        [Input("retryOnTimeout", required: true)]
        public Input<bool> RetryOnTimeout { get; set; } = null!;

        [Input("runIf")]
        public Input<string>? RunIf { get; set; }

        [Input("runJobTask")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskRunJobTaskInputArgs>? RunJobTask { get; set; }

        [Input("sparkJarTask")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskSparkJarTaskInputArgs>? SparkJarTask { get; set; }

        [Input("sparkPythonTask")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskSparkPythonTaskInputArgs>? SparkPythonTask { get; set; }

        [Input("sparkSubmitTask")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskSparkSubmitTaskInputArgs>? SparkSubmitTask { get; set; }

        [Input("sqlTask")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskSqlTaskInputArgs>? SqlTask { get; set; }

        [Input("taskKey")]
        public Input<string>? TaskKey { get; set; }

        [Input("timeoutSeconds")]
        public Input<int>? TimeoutSeconds { get; set; }

        [Input("webhookNotifications")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskWebhookNotificationsInputArgs>? WebhookNotifications { get; set; }

        public GetJobJobSettingsSettingsTaskInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskInputArgs Empty => new GetJobJobSettingsSettingsTaskInputArgs();
    }
}
