// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskConditionTask;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskDbtTask;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskDependsOn;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskEmailNotifications;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskHealth;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskLibrary;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskNewCluster;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskNotebookTask;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskNotificationSettings;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskPipelineTask;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskPythonWheelTask;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskRunJobTask;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskSparkJarTask;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskSparkPythonTask;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskSparkSubmitTask;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskSqlTask;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskWebhookNotifications;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskForEachTaskTask {
    private @Nullable JobTaskForEachTaskTaskConditionTask conditionTask;
    private @Nullable JobTaskForEachTaskTaskDbtTask dbtTask;
    /**
     * @return block specifying dependency(-ies) for a given task.
     * 
     */
    private @Nullable List<JobTaskForEachTaskTaskDependsOn> dependsOns;
    /**
     * @return An optional description for the job. The maximum length is 1024 characters in UTF-8 encoding.
     * 
     */
    private @Nullable String description;
    /**
     * @return (List) An optional set of email addresses notified when this task begins, completes or fails. The default behavior is to not send any emails. This field is a block and is documented below.
     * 
     */
    private @Nullable JobTaskForEachTaskTaskEmailNotifications emailNotifications;
    private @Nullable String environmentKey;
    private @Nullable String existingClusterId;
    /**
     * @return block described below that specifies health conditions for a given task.
     * 
     */
    private @Nullable JobTaskForEachTaskTaskHealth health;
    private @Nullable String jobClusterKey;
    /**
     * @return (Set) An optional list of libraries to be installed on the cluster that will execute the job.
     * 
     */
    private @Nullable List<JobTaskForEachTaskTaskLibrary> libraries;
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
    private @Nullable JobTaskForEachTaskTaskNewCluster newCluster;
    private @Nullable JobTaskForEachTaskTaskNotebookTask notebookTask;
    /**
     * @return An optional block controlling the notification settings on the job level (described below).
     * 
     */
    private @Nullable JobTaskForEachTaskTaskNotificationSettings notificationSettings;
    private @Nullable JobTaskForEachTaskTaskPipelineTask pipelineTask;
    private @Nullable JobTaskForEachTaskTaskPythonWheelTask pythonWheelTask;
    /**
     * @return (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
     * 
     */
    private @Nullable Boolean retryOnTimeout;
    /**
     * @return An optional value indicating the condition that determines whether the task should be run once its dependencies have been completed. When omitted, defaults to `ALL_SUCCESS`.
     * 
     */
    private @Nullable String runIf;
    private @Nullable JobTaskForEachTaskTaskRunJobTask runJobTask;
    private @Nullable JobTaskForEachTaskTaskSparkJarTask sparkJarTask;
    private @Nullable JobTaskForEachTaskTaskSparkPythonTask sparkPythonTask;
    private @Nullable JobTaskForEachTaskTaskSparkSubmitTask sparkSubmitTask;
    private @Nullable JobTaskForEachTaskTaskSqlTask sqlTask;
    /**
     * @return string specifying an unique key for a given task.
     * * `*_task` - (Required) one of the specific task blocks described below:
     * 
     */
    private @Nullable String taskKey;
    /**
     * @return (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
     * 
     */
    private @Nullable Integer timeoutSeconds;
    /**
     * @return (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this task begins, completes or fails. The default behavior is to not send any notifications. This field is a block and is documented below.
     * 
     */
    private @Nullable JobTaskForEachTaskTaskWebhookNotifications webhookNotifications;

    private JobTaskForEachTaskTask() {}
    public Optional<JobTaskForEachTaskTaskConditionTask> conditionTask() {
        return Optional.ofNullable(this.conditionTask);
    }
    public Optional<JobTaskForEachTaskTaskDbtTask> dbtTask() {
        return Optional.ofNullable(this.dbtTask);
    }
    /**
     * @return block specifying dependency(-ies) for a given task.
     * 
     */
    public List<JobTaskForEachTaskTaskDependsOn> dependsOns() {
        return this.dependsOns == null ? List.of() : this.dependsOns;
    }
    /**
     * @return An optional description for the job. The maximum length is 1024 characters in UTF-8 encoding.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return (List) An optional set of email addresses notified when this task begins, completes or fails. The default behavior is to not send any emails. This field is a block and is documented below.
     * 
     */
    public Optional<JobTaskForEachTaskTaskEmailNotifications> emailNotifications() {
        return Optional.ofNullable(this.emailNotifications);
    }
    public Optional<String> environmentKey() {
        return Optional.ofNullable(this.environmentKey);
    }
    public Optional<String> existingClusterId() {
        return Optional.ofNullable(this.existingClusterId);
    }
    /**
     * @return block described below that specifies health conditions for a given task.
     * 
     */
    public Optional<JobTaskForEachTaskTaskHealth> health() {
        return Optional.ofNullable(this.health);
    }
    public Optional<String> jobClusterKey() {
        return Optional.ofNullable(this.jobClusterKey);
    }
    /**
     * @return (Set) An optional list of libraries to be installed on the cluster that will execute the job.
     * 
     */
    public List<JobTaskForEachTaskTaskLibrary> libraries() {
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
    public Optional<JobTaskForEachTaskTaskNewCluster> newCluster() {
        return Optional.ofNullable(this.newCluster);
    }
    public Optional<JobTaskForEachTaskTaskNotebookTask> notebookTask() {
        return Optional.ofNullable(this.notebookTask);
    }
    /**
     * @return An optional block controlling the notification settings on the job level (described below).
     * 
     */
    public Optional<JobTaskForEachTaskTaskNotificationSettings> notificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }
    public Optional<JobTaskForEachTaskTaskPipelineTask> pipelineTask() {
        return Optional.ofNullable(this.pipelineTask);
    }
    public Optional<JobTaskForEachTaskTaskPythonWheelTask> pythonWheelTask() {
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
     * @return An optional value indicating the condition that determines whether the task should be run once its dependencies have been completed. When omitted, defaults to `ALL_SUCCESS`.
     * 
     */
    public Optional<String> runIf() {
        return Optional.ofNullable(this.runIf);
    }
    public Optional<JobTaskForEachTaskTaskRunJobTask> runJobTask() {
        return Optional.ofNullable(this.runJobTask);
    }
    public Optional<JobTaskForEachTaskTaskSparkJarTask> sparkJarTask() {
        return Optional.ofNullable(this.sparkJarTask);
    }
    public Optional<JobTaskForEachTaskTaskSparkPythonTask> sparkPythonTask() {
        return Optional.ofNullable(this.sparkPythonTask);
    }
    public Optional<JobTaskForEachTaskTaskSparkSubmitTask> sparkSubmitTask() {
        return Optional.ofNullable(this.sparkSubmitTask);
    }
    public Optional<JobTaskForEachTaskTaskSqlTask> sqlTask() {
        return Optional.ofNullable(this.sqlTask);
    }
    /**
     * @return string specifying an unique key for a given task.
     * * `*_task` - (Required) one of the specific task blocks described below:
     * 
     */
    public Optional<String> taskKey() {
        return Optional.ofNullable(this.taskKey);
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
    public Optional<JobTaskForEachTaskTaskWebhookNotifications> webhookNotifications() {
        return Optional.ofNullable(this.webhookNotifications);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskForEachTaskTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JobTaskForEachTaskTaskConditionTask conditionTask;
        private @Nullable JobTaskForEachTaskTaskDbtTask dbtTask;
        private @Nullable List<JobTaskForEachTaskTaskDependsOn> dependsOns;
        private @Nullable String description;
        private @Nullable JobTaskForEachTaskTaskEmailNotifications emailNotifications;
        private @Nullable String environmentKey;
        private @Nullable String existingClusterId;
        private @Nullable JobTaskForEachTaskTaskHealth health;
        private @Nullable String jobClusterKey;
        private @Nullable List<JobTaskForEachTaskTaskLibrary> libraries;
        private @Nullable Integer maxRetries;
        private @Nullable Integer minRetryIntervalMillis;
        private @Nullable JobTaskForEachTaskTaskNewCluster newCluster;
        private @Nullable JobTaskForEachTaskTaskNotebookTask notebookTask;
        private @Nullable JobTaskForEachTaskTaskNotificationSettings notificationSettings;
        private @Nullable JobTaskForEachTaskTaskPipelineTask pipelineTask;
        private @Nullable JobTaskForEachTaskTaskPythonWheelTask pythonWheelTask;
        private @Nullable Boolean retryOnTimeout;
        private @Nullable String runIf;
        private @Nullable JobTaskForEachTaskTaskRunJobTask runJobTask;
        private @Nullable JobTaskForEachTaskTaskSparkJarTask sparkJarTask;
        private @Nullable JobTaskForEachTaskTaskSparkPythonTask sparkPythonTask;
        private @Nullable JobTaskForEachTaskTaskSparkSubmitTask sparkSubmitTask;
        private @Nullable JobTaskForEachTaskTaskSqlTask sqlTask;
        private @Nullable String taskKey;
        private @Nullable Integer timeoutSeconds;
        private @Nullable JobTaskForEachTaskTaskWebhookNotifications webhookNotifications;
        public Builder() {}
        public Builder(JobTaskForEachTaskTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionTask = defaults.conditionTask;
    	      this.dbtTask = defaults.dbtTask;
    	      this.dependsOns = defaults.dependsOns;
    	      this.description = defaults.description;
    	      this.emailNotifications = defaults.emailNotifications;
    	      this.environmentKey = defaults.environmentKey;
    	      this.existingClusterId = defaults.existingClusterId;
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
        public Builder conditionTask(@Nullable JobTaskForEachTaskTaskConditionTask conditionTask) {

            this.conditionTask = conditionTask;
            return this;
        }
        @CustomType.Setter
        public Builder dbtTask(@Nullable JobTaskForEachTaskTaskDbtTask dbtTask) {

            this.dbtTask = dbtTask;
            return this;
        }
        @CustomType.Setter
        public Builder dependsOns(@Nullable List<JobTaskForEachTaskTaskDependsOn> dependsOns) {

            this.dependsOns = dependsOns;
            return this;
        }
        public Builder dependsOns(JobTaskForEachTaskTaskDependsOn... dependsOns) {
            return dependsOns(List.of(dependsOns));
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder emailNotifications(@Nullable JobTaskForEachTaskTaskEmailNotifications emailNotifications) {

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
        public Builder health(@Nullable JobTaskForEachTaskTaskHealth health) {

            this.health = health;
            return this;
        }
        @CustomType.Setter
        public Builder jobClusterKey(@Nullable String jobClusterKey) {

            this.jobClusterKey = jobClusterKey;
            return this;
        }
        @CustomType.Setter
        public Builder libraries(@Nullable List<JobTaskForEachTaskTaskLibrary> libraries) {

            this.libraries = libraries;
            return this;
        }
        public Builder libraries(JobTaskForEachTaskTaskLibrary... libraries) {
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
        public Builder newCluster(@Nullable JobTaskForEachTaskTaskNewCluster newCluster) {

            this.newCluster = newCluster;
            return this;
        }
        @CustomType.Setter
        public Builder notebookTask(@Nullable JobTaskForEachTaskTaskNotebookTask notebookTask) {

            this.notebookTask = notebookTask;
            return this;
        }
        @CustomType.Setter
        public Builder notificationSettings(@Nullable JobTaskForEachTaskTaskNotificationSettings notificationSettings) {

            this.notificationSettings = notificationSettings;
            return this;
        }
        @CustomType.Setter
        public Builder pipelineTask(@Nullable JobTaskForEachTaskTaskPipelineTask pipelineTask) {

            this.pipelineTask = pipelineTask;
            return this;
        }
        @CustomType.Setter
        public Builder pythonWheelTask(@Nullable JobTaskForEachTaskTaskPythonWheelTask pythonWheelTask) {

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
        public Builder runJobTask(@Nullable JobTaskForEachTaskTaskRunJobTask runJobTask) {

            this.runJobTask = runJobTask;
            return this;
        }
        @CustomType.Setter
        public Builder sparkJarTask(@Nullable JobTaskForEachTaskTaskSparkJarTask sparkJarTask) {

            this.sparkJarTask = sparkJarTask;
            return this;
        }
        @CustomType.Setter
        public Builder sparkPythonTask(@Nullable JobTaskForEachTaskTaskSparkPythonTask sparkPythonTask) {

            this.sparkPythonTask = sparkPythonTask;
            return this;
        }
        @CustomType.Setter
        public Builder sparkSubmitTask(@Nullable JobTaskForEachTaskTaskSparkSubmitTask sparkSubmitTask) {

            this.sparkSubmitTask = sparkSubmitTask;
            return this;
        }
        @CustomType.Setter
        public Builder sqlTask(@Nullable JobTaskForEachTaskTaskSqlTask sqlTask) {

            this.sqlTask = sqlTask;
            return this;
        }
        @CustomType.Setter
        public Builder taskKey(@Nullable String taskKey) {

            this.taskKey = taskKey;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {

            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder webhookNotifications(@Nullable JobTaskForEachTaskTaskWebhookNotifications webhookNotifications) {

            this.webhookNotifications = webhookNotifications;
            return this;
        }
        public JobTaskForEachTaskTask build() {
            final var _resultValue = new JobTaskForEachTaskTask();
            _resultValue.conditionTask = conditionTask;
            _resultValue.dbtTask = dbtTask;
            _resultValue.dependsOns = dependsOns;
            _resultValue.description = description;
            _resultValue.emailNotifications = emailNotifications;
            _resultValue.environmentKey = environmentKey;
            _resultValue.existingClusterId = existingClusterId;
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
