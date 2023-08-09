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
    public sealed class GetJobJobSettingsSettingsTaskResult
    {
        public readonly string? ComputeKey;
        public readonly Outputs.GetJobJobSettingsSettingsTaskConditionTaskResult? ConditionTask;
        public readonly Outputs.GetJobJobSettingsSettingsTaskDbtTaskResult? DbtTask;
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsTaskDependsOnResult> DependsOns;
        public readonly string? Description;
        public readonly Outputs.GetJobJobSettingsSettingsTaskEmailNotificationsResult? EmailNotifications;
        public readonly string? ExistingClusterId;
        public readonly Outputs.GetJobJobSettingsSettingsTaskHealthResult? Health;
        public readonly string? JobClusterKey;
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsTaskLibraryResult> Libraries;
        public readonly int? MaxRetries;
        public readonly int? MinRetryIntervalMillis;
        public readonly Outputs.GetJobJobSettingsSettingsTaskNewClusterResult? NewCluster;
        public readonly Outputs.GetJobJobSettingsSettingsTaskNotebookTaskResult? NotebookTask;
        public readonly Outputs.GetJobJobSettingsSettingsTaskNotificationSettingsResult? NotificationSettings;
        public readonly Outputs.GetJobJobSettingsSettingsTaskPipelineTaskResult? PipelineTask;
        public readonly Outputs.GetJobJobSettingsSettingsTaskPythonWheelTaskResult? PythonWheelTask;
        public readonly bool RetryOnTimeout;
        public readonly string? RunIf;
        public readonly Outputs.GetJobJobSettingsSettingsTaskRunJobTaskResult? RunJobTask;
        public readonly Outputs.GetJobJobSettingsSettingsTaskSparkJarTaskResult? SparkJarTask;
        public readonly Outputs.GetJobJobSettingsSettingsTaskSparkPythonTaskResult? SparkPythonTask;
        public readonly Outputs.GetJobJobSettingsSettingsTaskSparkSubmitTaskResult? SparkSubmitTask;
        public readonly Outputs.GetJobJobSettingsSettingsTaskSqlTaskResult? SqlTask;
        public readonly string? TaskKey;
        public readonly int? TimeoutSeconds;

        [OutputConstructor]
        private GetJobJobSettingsSettingsTaskResult(
            string? computeKey,

            Outputs.GetJobJobSettingsSettingsTaskConditionTaskResult? conditionTask,

            Outputs.GetJobJobSettingsSettingsTaskDbtTaskResult? dbtTask,

            ImmutableArray<Outputs.GetJobJobSettingsSettingsTaskDependsOnResult> dependsOns,

            string? description,

            Outputs.GetJobJobSettingsSettingsTaskEmailNotificationsResult? emailNotifications,

            string? existingClusterId,

            Outputs.GetJobJobSettingsSettingsTaskHealthResult? health,

            string? jobClusterKey,

            ImmutableArray<Outputs.GetJobJobSettingsSettingsTaskLibraryResult> libraries,

            int? maxRetries,

            int? minRetryIntervalMillis,

            Outputs.GetJobJobSettingsSettingsTaskNewClusterResult? newCluster,

            Outputs.GetJobJobSettingsSettingsTaskNotebookTaskResult? notebookTask,

            Outputs.GetJobJobSettingsSettingsTaskNotificationSettingsResult? notificationSettings,

            Outputs.GetJobJobSettingsSettingsTaskPipelineTaskResult? pipelineTask,

            Outputs.GetJobJobSettingsSettingsTaskPythonWheelTaskResult? pythonWheelTask,

            bool retryOnTimeout,

            string? runIf,

            Outputs.GetJobJobSettingsSettingsTaskRunJobTaskResult? runJobTask,

            Outputs.GetJobJobSettingsSettingsTaskSparkJarTaskResult? sparkJarTask,

            Outputs.GetJobJobSettingsSettingsTaskSparkPythonTaskResult? sparkPythonTask,

            Outputs.GetJobJobSettingsSettingsTaskSparkSubmitTaskResult? sparkSubmitTask,

            Outputs.GetJobJobSettingsSettingsTaskSqlTaskResult? sqlTask,

            string? taskKey,

            int? timeoutSeconds)
        {
            ComputeKey = computeKey;
            ConditionTask = conditionTask;
            DbtTask = dbtTask;
            DependsOns = dependsOns;
            Description = description;
            EmailNotifications = emailNotifications;
            ExistingClusterId = existingClusterId;
            Health = health;
            JobClusterKey = jobClusterKey;
            Libraries = libraries;
            MaxRetries = maxRetries;
            MinRetryIntervalMillis = minRetryIntervalMillis;
            NewCluster = newCluster;
            NotebookTask = notebookTask;
            NotificationSettings = notificationSettings;
            PipelineTask = pipelineTask;
            PythonWheelTask = pythonWheelTask;
            RetryOnTimeout = retryOnTimeout;
            RunIf = runIf;
            RunJobTask = runJobTask;
            SparkJarTask = sparkJarTask;
            SparkPythonTask = sparkPythonTask;
            SparkSubmitTask = sparkSubmitTask;
            SqlTask = sqlTask;
            TaskKey = taskKey;
            TimeoutSeconds = timeoutSeconds;
        }
    }
}
