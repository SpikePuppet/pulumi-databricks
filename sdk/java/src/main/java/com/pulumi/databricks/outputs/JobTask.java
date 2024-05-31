// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskConditionTask;
import com.pulumi.databricks.outputs.JobTaskDbtTask;
import com.pulumi.databricks.outputs.JobTaskDependsOn;
import com.pulumi.databricks.outputs.JobTaskEmailNotifications;
import com.pulumi.databricks.outputs.JobTaskForEachTask;
import com.pulumi.databricks.outputs.JobTaskHealth;
import com.pulumi.databricks.outputs.JobTaskLibrary;
import com.pulumi.databricks.outputs.JobTaskNewCluster;
import com.pulumi.databricks.outputs.JobTaskNotebookTask;
import com.pulumi.databricks.outputs.JobTaskNotificationSettings;
import com.pulumi.databricks.outputs.JobTaskPipelineTask;
import com.pulumi.databricks.outputs.JobTaskPythonWheelTask;
import com.pulumi.databricks.outputs.JobTaskRunJobTask;
import com.pulumi.databricks.outputs.JobTaskSparkJarTask;
import com.pulumi.databricks.outputs.JobTaskSparkPythonTask;
import com.pulumi.databricks.outputs.JobTaskSparkSubmitTask;
import com.pulumi.databricks.outputs.JobTaskSqlTask;
import com.pulumi.databricks.outputs.JobTaskWebhookNotifications;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTask {
    private @Nullable JobTaskConditionTask conditionTask;
    private @Nullable JobTaskDbtTask dbtTask;
    /**
     * @return block specifying dependency(-ies) for a given task.
     * 
     */
    private @Nullable List<JobTaskDependsOn> dependsOns;
    /**
     * @return An optional description for the job. The maximum length is 1024 characters in UTF-8 encoding.
     * 
     */
    private @Nullable String description;
    private @Nullable Boolean disableAutoOptimization;
    /**
     * @return (List) An optional set of email addresses notified when this task begins, completes or fails. The default behavior is to not send any emails. This field is a block and is documented below.
     * 
     */
    private @Nullable JobTaskEmailNotifications emailNotifications;
    private @Nullable String environmentKey;
    /**
     * @return Identifier of the interactive cluster to run job on.  *Note: running tasks on interactive clusters may lead to increased costs!*
     * 
     */
    private @Nullable String existingClusterId;
    private @Nullable JobTaskForEachTask forEachTask;
    /**
     * @return block described below that specifies health conditions for a given task.
     * 
     * &gt; **Note** If no `job_cluster_key`, `existing_cluster_id`, or `new_cluster` were specified in task definition, then task will executed using serverless compute.
     * 
     */
    private @Nullable JobTaskHealth health;
    /**
     * @return Identifier of the Job cluster specified in the `job_cluster` block.
     * 
     */
    private @Nullable String jobClusterKey;
    /**
     * @return (Set) An optional list of libraries to be installed on the cluster that will execute the job.
     * 
     */
    private @Nullable List<JobTaskLibrary> libraries;
    /**
     * @return (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a `FAILED` or `INTERNAL_ERROR` lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: `PENDING`, `RUNNING`, `TERMINATING`, `TERMINATED`, `SKIPPED` or `INTERNAL_ERROR`.
     * 
     */
    private @Nullable Integer maxRetries;
    /**
     * @return (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
     * 
     */
    private @Nullable Integer minRetryIntervalMillis;
    /**
     * @return Task will run on a dedicated cluster.  See databricks.Cluster documentation for specification.
     * 
     */
    private @Nullable JobTaskNewCluster newCluster;
    private @Nullable JobTaskNotebookTask notebookTask;
    /**
     * @return An optional block controlling the notification settings on the job level documented below.
     * 
     */
    private @Nullable JobTaskNotificationSettings notificationSettings;
    private @Nullable JobTaskPipelineTask pipelineTask;
    private @Nullable JobTaskPythonWheelTask pythonWheelTask;
    /**
     * @return (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
     * 
     */
    private @Nullable Boolean retryOnTimeout;
    /**
     * @return An optional value indicating the condition that determines whether the task should be run once its dependencies have been completed. One of `ALL_SUCCESS`, `AT_LEAST_ONE_SUCCESS`, `NONE_FAILED`, `ALL_DONE`, `AT_LEAST_ONE_FAILED` or `ALL_FAILED`. When omitted, defaults to `ALL_SUCCESS`.
     * 
     */
    private @Nullable String runIf;
    private @Nullable JobTaskRunJobTask runJobTask;
    private @Nullable JobTaskSparkJarTask sparkJarTask;
    private @Nullable JobTaskSparkPythonTask sparkPythonTask;
    private @Nullable JobTaskSparkSubmitTask sparkSubmitTask;
    private @Nullable JobTaskSqlTask sqlTask;
    /**
     * @return string specifying an unique key for a given task.
     * * `*_task` - (Required) one of the specific task blocks described below:
     * 
     */
    private String taskKey;
    /**
     * @return (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
     * 
     */
    private @Nullable Integer timeoutSeconds;
    /**
     * @return (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this task begins, completes or fails. The default behavior is to not send any notifications. This field is a block and is documented below.
     * 
     */
    private @Nullable JobTaskWebhookNotifications webhookNotifications;

    private JobTask() {}
    public Optional<JobTaskConditionTask> conditionTask() {
        return Optional.ofNullable(this.conditionTask);
    }
    public Optional<JobTaskDbtTask> dbtTask() {
        return Optional.ofNullable(this.dbtTask);
    }
    /**
     * @return block specifying dependency(-ies) for a given task.
     * 
     */
    public List<JobTaskDependsOn> dependsOns() {
        return this.dependsOns == null ? List.of() : this.dependsOns;
    }
    /**
     * @return An optional description for the job. The maximum length is 1024 characters in UTF-8 encoding.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Boolean> disableAutoOptimization() {
        return Optional.ofNullable(this.disableAutoOptimization);
    }
    /**
     * @return (List) An optional set of email addresses notified when this task begins, completes or fails. The default behavior is to not send any emails. This field is a block and is documented below.
     * 
     */
    public Optional<JobTaskEmailNotifications> emailNotifications() {
        return Optional.ofNullable(this.emailNotifications);
    }
    public Optional<String> environmentKey() {
        return Optional.ofNullable(this.environmentKey);
    }
    /**
     * @return Identifier of the interactive cluster to run job on.  *Note: running tasks on interactive clusters may lead to increased costs!*
     * 
     */
    public Optional<String> existingClusterId() {
        return Optional.ofNullable(this.existingClusterId);
    }
    public Optional<JobTaskForEachTask> forEachTask() {
        return Optional.ofNullable(this.forEachTask);
    }
    /**
     * @return block described below that specifies health conditions for a given task.
     * 
     * &gt; **Note** If no `job_cluster_key`, `existing_cluster_id`, or `new_cluster` were specified in task definition, then task will executed using serverless compute.
     * 
     */
    public Optional<JobTaskHealth> health() {
        return Optional.ofNullable(this.health);
    }
    /**
     * @return Identifier of the Job cluster specified in the `job_cluster` block.
     * 
     */
    public Optional<String> jobClusterKey() {
        return Optional.ofNullable(this.jobClusterKey);
    }
    /**
     * @return (Set) An optional list of libraries to be installed on the cluster that will execute the job.
     * 
     */
    public List<JobTaskLibrary> libraries() {
        return this.libraries == null ? List.of() : this.libraries;
    }
    /**
     * @return (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a `FAILED` or `INTERNAL_ERROR` lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: `PENDING`, `RUNNING`, `TERMINATING`, `TERMINATED`, `SKIPPED` or `INTERNAL_ERROR`.
     * 
     */
    public Optional<Integer> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }
    /**
     * @return (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
     * 
     */
    public Optional<Integer> minRetryIntervalMillis() {
        return Optional.ofNullable(this.minRetryIntervalMillis);
    }
    /**
     * @return Task will run on a dedicated cluster.  See databricks.Cluster documentation for specification.
     * 
     */
    public Optional<JobTaskNewCluster> newCluster() {
        return Optional.ofNullable(this.newCluster);
    }
    public Optional<JobTaskNotebookTask> notebookTask() {
        return Optional.ofNullable(this.notebookTask);
    }
    /**
     * @return An optional block controlling the notification settings on the job level documented below.
     * 
     */
    public Optional<JobTaskNotificationSettings> notificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }
    public Optional<JobTaskPipelineTask> pipelineTask() {
        return Optional.ofNullable(this.pipelineTask);
    }
    public Optional<JobTaskPythonWheelTask> pythonWheelTask() {
        return Optional.ofNullable(this.pythonWheelTask);
    }
    /**
     * @return (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
     * 
     */
    public Optional<Boolean> retryOnTimeout() {
        return Optional.ofNullable(this.retryOnTimeout);
    }
    /**
     * @return An optional value indicating the condition that determines whether the task should be run once its dependencies have been completed. One of `ALL_SUCCESS`, `AT_LEAST_ONE_SUCCESS`, `NONE_FAILED`, `ALL_DONE`, `AT_LEAST_ONE_FAILED` or `ALL_FAILED`. When omitted, defaults to `ALL_SUCCESS`.
     * 
     */
    public Optional<String> runIf() {
        return Optional.ofNullable(this.runIf);
    }
    public Optional<JobTaskRunJobTask> runJobTask() {
        return Optional.ofNullable(this.runJobTask);
    }
    public Optional<JobTaskSparkJarTask> sparkJarTask() {
        return Optional.ofNullable(this.sparkJarTask);
    }
    public Optional<JobTaskSparkPythonTask> sparkPythonTask() {
        return Optional.ofNullable(this.sparkPythonTask);
    }
    public Optional<JobTaskSparkSubmitTask> sparkSubmitTask() {
        return Optional.ofNullable(this.sparkSubmitTask);
    }
    public Optional<JobTaskSqlTask> sqlTask() {
        return Optional.ofNullable(this.sqlTask);
    }
    /**
     * @return string specifying an unique key for a given task.
     * * `*_task` - (Required) one of the specific task blocks described below:
     * 
     */
    public String taskKey() {
        return this.taskKey;
    }
    /**
     * @return (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }
    /**
     * @return (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this task begins, completes or fails. The default behavior is to not send any notifications. This field is a block and is documented below.
     * 
     */
    public Optional<JobTaskWebhookNotifications> webhookNotifications() {
        return Optional.ofNullable(this.webhookNotifications);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JobTaskConditionTask conditionTask;
        private @Nullable JobTaskDbtTask dbtTask;
        private @Nullable List<JobTaskDependsOn> dependsOns;
        private @Nullable String description;
        private @Nullable Boolean disableAutoOptimization;
        private @Nullable JobTaskEmailNotifications emailNotifications;
        private @Nullable String environmentKey;
        private @Nullable String existingClusterId;
        private @Nullable JobTaskForEachTask forEachTask;
        private @Nullable JobTaskHealth health;
        private @Nullable String jobClusterKey;
        private @Nullable List<JobTaskLibrary> libraries;
        private @Nullable Integer maxRetries;
        private @Nullable Integer minRetryIntervalMillis;
        private @Nullable JobTaskNewCluster newCluster;
        private @Nullable JobTaskNotebookTask notebookTask;
        private @Nullable JobTaskNotificationSettings notificationSettings;
        private @Nullable JobTaskPipelineTask pipelineTask;
        private @Nullable JobTaskPythonWheelTask pythonWheelTask;
        private @Nullable Boolean retryOnTimeout;
        private @Nullable String runIf;
        private @Nullable JobTaskRunJobTask runJobTask;
        private @Nullable JobTaskSparkJarTask sparkJarTask;
        private @Nullable JobTaskSparkPythonTask sparkPythonTask;
        private @Nullable JobTaskSparkSubmitTask sparkSubmitTask;
        private @Nullable JobTaskSqlTask sqlTask;
        private String taskKey;
        private @Nullable Integer timeoutSeconds;
        private @Nullable JobTaskWebhookNotifications webhookNotifications;
        public Builder() {}
        public Builder(JobTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionTask = defaults.conditionTask;
    	      this.dbtTask = defaults.dbtTask;
    	      this.dependsOns = defaults.dependsOns;
    	      this.description = defaults.description;
    	      this.disableAutoOptimization = defaults.disableAutoOptimization;
    	      this.emailNotifications = defaults.emailNotifications;
    	      this.environmentKey = defaults.environmentKey;
    	      this.existingClusterId = defaults.existingClusterId;
    	      this.forEachTask = defaults.forEachTask;
    	      this.health = defaults.health;
    	      this.jobClusterKey = defaults.jobClusterKey;
    	      this.libraries = defaults.libraries;
    	      this.maxRetries = defaults.maxRetries;
    	      this.minRetryIntervalMillis = defaults.minRetryIntervalMillis;
    	      this.newCluster = defaults.newCluster;
    	      this.notebookTask = defaults.notebookTask;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.pipelineTask = defaults.pipelineTask;
    	      this.pythonWheelTask = defaults.pythonWheelTask;
    	      this.retryOnTimeout = defaults.retryOnTimeout;
    	      this.runIf = defaults.runIf;
    	      this.runJobTask = defaults.runJobTask;
    	      this.sparkJarTask = defaults.sparkJarTask;
    	      this.sparkPythonTask = defaults.sparkPythonTask;
    	      this.sparkSubmitTask = defaults.sparkSubmitTask;
    	      this.sqlTask = defaults.sqlTask;
    	      this.taskKey = defaults.taskKey;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
    	      this.webhookNotifications = defaults.webhookNotifications;
        }

        @CustomType.Setter
        public Builder conditionTask(@Nullable JobTaskConditionTask conditionTask) {

            this.conditionTask = conditionTask;
            return this;
        }
        @CustomType.Setter
        public Builder dbtTask(@Nullable JobTaskDbtTask dbtTask) {

            this.dbtTask = dbtTask;
            return this;
        }
        @CustomType.Setter
        public Builder dependsOns(@Nullable List<JobTaskDependsOn> dependsOns) {

            this.dependsOns = dependsOns;
            return this;
        }
        public Builder dependsOns(JobTaskDependsOn... dependsOns) {
            return dependsOns(List.of(dependsOns));
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder disableAutoOptimization(@Nullable Boolean disableAutoOptimization) {

            this.disableAutoOptimization = disableAutoOptimization;
            return this;
        }
        @CustomType.Setter
        public Builder emailNotifications(@Nullable JobTaskEmailNotifications emailNotifications) {

            this.emailNotifications = emailNotifications;
            return this;
        }
        @CustomType.Setter
        public Builder environmentKey(@Nullable String environmentKey) {

            this.environmentKey = environmentKey;
            return this;
        }
        @CustomType.Setter
        public Builder existingClusterId(@Nullable String existingClusterId) {

            this.existingClusterId = existingClusterId;
            return this;
        }
        @CustomType.Setter
        public Builder forEachTask(@Nullable JobTaskForEachTask forEachTask) {

            this.forEachTask = forEachTask;
            return this;
        }
        @CustomType.Setter
        public Builder health(@Nullable JobTaskHealth health) {

            this.health = health;
            return this;
        }
        @CustomType.Setter
        public Builder jobClusterKey(@Nullable String jobClusterKey) {

            this.jobClusterKey = jobClusterKey;
            return this;
        }
        @CustomType.Setter
        public Builder libraries(@Nullable List<JobTaskLibrary> libraries) {

            this.libraries = libraries;
            return this;
        }
        public Builder libraries(JobTaskLibrary... libraries) {
            return libraries(List.of(libraries));
        }
        @CustomType.Setter
        public Builder maxRetries(@Nullable Integer maxRetries) {

            this.maxRetries = maxRetries;
            return this;
        }
        @CustomType.Setter
        public Builder minRetryIntervalMillis(@Nullable Integer minRetryIntervalMillis) {

            this.minRetryIntervalMillis = minRetryIntervalMillis;
            return this;
        }
        @CustomType.Setter
        public Builder newCluster(@Nullable JobTaskNewCluster newCluster) {

            this.newCluster = newCluster;
            return this;
        }
        @CustomType.Setter
        public Builder notebookTask(@Nullable JobTaskNotebookTask notebookTask) {

            this.notebookTask = notebookTask;
            return this;
        }
        @CustomType.Setter
        public Builder notificationSettings(@Nullable JobTaskNotificationSettings notificationSettings) {

            this.notificationSettings = notificationSettings;
            return this;
        }
        @CustomType.Setter
        public Builder pipelineTask(@Nullable JobTaskPipelineTask pipelineTask) {

            this.pipelineTask = pipelineTask;
            return this;
        }
        @CustomType.Setter
        public Builder pythonWheelTask(@Nullable JobTaskPythonWheelTask pythonWheelTask) {

            this.pythonWheelTask = pythonWheelTask;
            return this;
        }
        @CustomType.Setter
        public Builder retryOnTimeout(@Nullable Boolean retryOnTimeout) {

            this.retryOnTimeout = retryOnTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder runIf(@Nullable String runIf) {

            this.runIf = runIf;
            return this;
        }
        @CustomType.Setter
        public Builder runJobTask(@Nullable JobTaskRunJobTask runJobTask) {

            this.runJobTask = runJobTask;
            return this;
        }
        @CustomType.Setter
        public Builder sparkJarTask(@Nullable JobTaskSparkJarTask sparkJarTask) {

            this.sparkJarTask = sparkJarTask;
            return this;
        }
        @CustomType.Setter
        public Builder sparkPythonTask(@Nullable JobTaskSparkPythonTask sparkPythonTask) {

            this.sparkPythonTask = sparkPythonTask;
            return this;
        }
        @CustomType.Setter
        public Builder sparkSubmitTask(@Nullable JobTaskSparkSubmitTask sparkSubmitTask) {

            this.sparkSubmitTask = sparkSubmitTask;
            return this;
        }
        @CustomType.Setter
        public Builder sqlTask(@Nullable JobTaskSqlTask sqlTask) {

            this.sqlTask = sqlTask;
            return this;
        }
        @CustomType.Setter
        public Builder taskKey(String taskKey) {
            if (taskKey == null) {
              throw new MissingRequiredPropertyException("JobTask", "taskKey");
            }
            this.taskKey = taskKey;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {

            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder webhookNotifications(@Nullable JobTaskWebhookNotifications webhookNotifications) {

            this.webhookNotifications = webhookNotifications;
            return this;
        }
        public JobTask build() {
            final var _resultValue = new JobTask();
            _resultValue.conditionTask = conditionTask;
            _resultValue.dbtTask = dbtTask;
            _resultValue.dependsOns = dependsOns;
            _resultValue.description = description;
            _resultValue.disableAutoOptimization = disableAutoOptimization;
            _resultValue.emailNotifications = emailNotifications;
            _resultValue.environmentKey = environmentKey;
            _resultValue.existingClusterId = existingClusterId;
            _resultValue.forEachTask = forEachTask;
            _resultValue.health = health;
            _resultValue.jobClusterKey = jobClusterKey;
            _resultValue.libraries = libraries;
            _resultValue.maxRetries = maxRetries;
            _resultValue.minRetryIntervalMillis = minRetryIntervalMillis;
            _resultValue.newCluster = newCluster;
            _resultValue.notebookTask = notebookTask;
            _resultValue.notificationSettings = notificationSettings;
            _resultValue.pipelineTask = pipelineTask;
            _resultValue.pythonWheelTask = pythonWheelTask;
            _resultValue.retryOnTimeout = retryOnTimeout;
            _resultValue.runIf = runIf;
            _resultValue.runJobTask = runJobTask;
            _resultValue.sparkJarTask = sparkJarTask;
            _resultValue.sparkPythonTask = sparkPythonTask;
            _resultValue.sparkSubmitTask = sparkSubmitTask;
            _resultValue.sqlTask = sqlTask;
            _resultValue.taskKey = taskKey;
            _resultValue.timeoutSeconds = timeoutSeconds;
            _resultValue.webhookNotifications = webhookNotifications;
            return _resultValue;
        }
    }
}
