// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskConditionTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskDbtTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskDependsOn;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskEmailNotifications;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskHealth;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskLibrary;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskNewCluster;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskNotebookTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskNotificationSettings;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskPipelineTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskPythonWheelTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskRunJobTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskSparkJarTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskSparkPythonTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskSparkSubmitTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskSqlTask;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTask {
    private @Nullable String computeKey;
    private @Nullable GetJobJobSettingsSettingsTaskConditionTask conditionTask;
    private @Nullable GetJobJobSettingsSettingsTaskDbtTask dbtTask;
    private @Nullable List<GetJobJobSettingsSettingsTaskDependsOn> dependsOns;
    private @Nullable String description;
    private @Nullable GetJobJobSettingsSettingsTaskEmailNotifications emailNotifications;
    private @Nullable String existingClusterId;
    private @Nullable GetJobJobSettingsSettingsTaskHealth health;
    private @Nullable String jobClusterKey;
    private @Nullable List<GetJobJobSettingsSettingsTaskLibrary> libraries;
    private @Nullable Integer maxRetries;
    private @Nullable Integer minRetryIntervalMillis;
    private @Nullable GetJobJobSettingsSettingsTaskNewCluster newCluster;
    private @Nullable GetJobJobSettingsSettingsTaskNotebookTask notebookTask;
    private @Nullable GetJobJobSettingsSettingsTaskNotificationSettings notificationSettings;
    private @Nullable GetJobJobSettingsSettingsTaskPipelineTask pipelineTask;
    private @Nullable GetJobJobSettingsSettingsTaskPythonWheelTask pythonWheelTask;
    private Boolean retryOnTimeout;
    private @Nullable String runIf;
    private @Nullable GetJobJobSettingsSettingsTaskRunJobTask runJobTask;
    private @Nullable GetJobJobSettingsSettingsTaskSparkJarTask sparkJarTask;
    private @Nullable GetJobJobSettingsSettingsTaskSparkPythonTask sparkPythonTask;
    private @Nullable GetJobJobSettingsSettingsTaskSparkSubmitTask sparkSubmitTask;
    private @Nullable GetJobJobSettingsSettingsTaskSqlTask sqlTask;
    private @Nullable String taskKey;
    private @Nullable Integer timeoutSeconds;

    private GetJobJobSettingsSettingsTask() {}
    public Optional<String> computeKey() {
        return Optional.ofNullable(this.computeKey);
    }
    public Optional<GetJobJobSettingsSettingsTaskConditionTask> conditionTask() {
        return Optional.ofNullable(this.conditionTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskDbtTask> dbtTask() {
        return Optional.ofNullable(this.dbtTask);
    }
    public List<GetJobJobSettingsSettingsTaskDependsOn> dependsOns() {
        return this.dependsOns == null ? List.of() : this.dependsOns;
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<GetJobJobSettingsSettingsTaskEmailNotifications> emailNotifications() {
        return Optional.ofNullable(this.emailNotifications);
    }
    public Optional<String> existingClusterId() {
        return Optional.ofNullable(this.existingClusterId);
    }
    public Optional<GetJobJobSettingsSettingsTaskHealth> health() {
        return Optional.ofNullable(this.health);
    }
    public Optional<String> jobClusterKey() {
        return Optional.ofNullable(this.jobClusterKey);
    }
    public List<GetJobJobSettingsSettingsTaskLibrary> libraries() {
        return this.libraries == null ? List.of() : this.libraries;
    }
    public Optional<Integer> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }
    public Optional<Integer> minRetryIntervalMillis() {
        return Optional.ofNullable(this.minRetryIntervalMillis);
    }
    public Optional<GetJobJobSettingsSettingsTaskNewCluster> newCluster() {
        return Optional.ofNullable(this.newCluster);
    }
    public Optional<GetJobJobSettingsSettingsTaskNotebookTask> notebookTask() {
        return Optional.ofNullable(this.notebookTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskNotificationSettings> notificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }
    public Optional<GetJobJobSettingsSettingsTaskPipelineTask> pipelineTask() {
        return Optional.ofNullable(this.pipelineTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskPythonWheelTask> pythonWheelTask() {
        return Optional.ofNullable(this.pythonWheelTask);
    }
    public Boolean retryOnTimeout() {
        return this.retryOnTimeout;
    }
    public Optional<String> runIf() {
        return Optional.ofNullable(this.runIf);
    }
    public Optional<GetJobJobSettingsSettingsTaskRunJobTask> runJobTask() {
        return Optional.ofNullable(this.runJobTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskSparkJarTask> sparkJarTask() {
        return Optional.ofNullable(this.sparkJarTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskSparkPythonTask> sparkPythonTask() {
        return Optional.ofNullable(this.sparkPythonTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskSparkSubmitTask> sparkSubmitTask() {
        return Optional.ofNullable(this.sparkSubmitTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskSqlTask> sqlTask() {
        return Optional.ofNullable(this.sqlTask);
    }
    public Optional<String> taskKey() {
        return Optional.ofNullable(this.taskKey);
    }
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String computeKey;
        private @Nullable GetJobJobSettingsSettingsTaskConditionTask conditionTask;
        private @Nullable GetJobJobSettingsSettingsTaskDbtTask dbtTask;
        private @Nullable List<GetJobJobSettingsSettingsTaskDependsOn> dependsOns;
        private @Nullable String description;
        private @Nullable GetJobJobSettingsSettingsTaskEmailNotifications emailNotifications;
        private @Nullable String existingClusterId;
        private @Nullable GetJobJobSettingsSettingsTaskHealth health;
        private @Nullable String jobClusterKey;
        private @Nullable List<GetJobJobSettingsSettingsTaskLibrary> libraries;
        private @Nullable Integer maxRetries;
        private @Nullable Integer minRetryIntervalMillis;
        private @Nullable GetJobJobSettingsSettingsTaskNewCluster newCluster;
        private @Nullable GetJobJobSettingsSettingsTaskNotebookTask notebookTask;
        private @Nullable GetJobJobSettingsSettingsTaskNotificationSettings notificationSettings;
        private @Nullable GetJobJobSettingsSettingsTaskPipelineTask pipelineTask;
        private @Nullable GetJobJobSettingsSettingsTaskPythonWheelTask pythonWheelTask;
        private Boolean retryOnTimeout;
        private @Nullable String runIf;
        private @Nullable GetJobJobSettingsSettingsTaskRunJobTask runJobTask;
        private @Nullable GetJobJobSettingsSettingsTaskSparkJarTask sparkJarTask;
        private @Nullable GetJobJobSettingsSettingsTaskSparkPythonTask sparkPythonTask;
        private @Nullable GetJobJobSettingsSettingsTaskSparkSubmitTask sparkSubmitTask;
        private @Nullable GetJobJobSettingsSettingsTaskSqlTask sqlTask;
        private @Nullable String taskKey;
        private @Nullable Integer timeoutSeconds;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeKey = defaults.computeKey;
    	      this.conditionTask = defaults.conditionTask;
    	      this.dbtTask = defaults.dbtTask;
    	      this.dependsOns = defaults.dependsOns;
    	      this.description = defaults.description;
    	      this.emailNotifications = defaults.emailNotifications;
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
        }

        @CustomType.Setter
        public Builder computeKey(@Nullable String computeKey) {
            this.computeKey = computeKey;
            return this;
        }
        @CustomType.Setter
        public Builder conditionTask(@Nullable GetJobJobSettingsSettingsTaskConditionTask conditionTask) {
            this.conditionTask = conditionTask;
            return this;
        }
        @CustomType.Setter
        public Builder dbtTask(@Nullable GetJobJobSettingsSettingsTaskDbtTask dbtTask) {
            this.dbtTask = dbtTask;
            return this;
        }
        @CustomType.Setter
        public Builder dependsOns(@Nullable List<GetJobJobSettingsSettingsTaskDependsOn> dependsOns) {
            this.dependsOns = dependsOns;
            return this;
        }
        public Builder dependsOns(GetJobJobSettingsSettingsTaskDependsOn... dependsOns) {
            return dependsOns(List.of(dependsOns));
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder emailNotifications(@Nullable GetJobJobSettingsSettingsTaskEmailNotifications emailNotifications) {
            this.emailNotifications = emailNotifications;
            return this;
        }
        @CustomType.Setter
        public Builder existingClusterId(@Nullable String existingClusterId) {
            this.existingClusterId = existingClusterId;
            return this;
        }
        @CustomType.Setter
        public Builder health(@Nullable GetJobJobSettingsSettingsTaskHealth health) {
            this.health = health;
            return this;
        }
        @CustomType.Setter
        public Builder jobClusterKey(@Nullable String jobClusterKey) {
            this.jobClusterKey = jobClusterKey;
            return this;
        }
        @CustomType.Setter
        public Builder libraries(@Nullable List<GetJobJobSettingsSettingsTaskLibrary> libraries) {
            this.libraries = libraries;
            return this;
        }
        public Builder libraries(GetJobJobSettingsSettingsTaskLibrary... libraries) {
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
        public Builder newCluster(@Nullable GetJobJobSettingsSettingsTaskNewCluster newCluster) {
            this.newCluster = newCluster;
            return this;
        }
        @CustomType.Setter
        public Builder notebookTask(@Nullable GetJobJobSettingsSettingsTaskNotebookTask notebookTask) {
            this.notebookTask = notebookTask;
            return this;
        }
        @CustomType.Setter
        public Builder notificationSettings(@Nullable GetJobJobSettingsSettingsTaskNotificationSettings notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }
        @CustomType.Setter
        public Builder pipelineTask(@Nullable GetJobJobSettingsSettingsTaskPipelineTask pipelineTask) {
            this.pipelineTask = pipelineTask;
            return this;
        }
        @CustomType.Setter
        public Builder pythonWheelTask(@Nullable GetJobJobSettingsSettingsTaskPythonWheelTask pythonWheelTask) {
            this.pythonWheelTask = pythonWheelTask;
            return this;
        }
        @CustomType.Setter
        public Builder retryOnTimeout(Boolean retryOnTimeout) {
            this.retryOnTimeout = Objects.requireNonNull(retryOnTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder runIf(@Nullable String runIf) {
            this.runIf = runIf;
            return this;
        }
        @CustomType.Setter
        public Builder runJobTask(@Nullable GetJobJobSettingsSettingsTaskRunJobTask runJobTask) {
            this.runJobTask = runJobTask;
            return this;
        }
        @CustomType.Setter
        public Builder sparkJarTask(@Nullable GetJobJobSettingsSettingsTaskSparkJarTask sparkJarTask) {
            this.sparkJarTask = sparkJarTask;
            return this;
        }
        @CustomType.Setter
        public Builder sparkPythonTask(@Nullable GetJobJobSettingsSettingsTaskSparkPythonTask sparkPythonTask) {
            this.sparkPythonTask = sparkPythonTask;
            return this;
        }
        @CustomType.Setter
        public Builder sparkSubmitTask(@Nullable GetJobJobSettingsSettingsTaskSparkSubmitTask sparkSubmitTask) {
            this.sparkSubmitTask = sparkSubmitTask;
            return this;
        }
        @CustomType.Setter
        public Builder sqlTask(@Nullable GetJobJobSettingsSettingsTaskSqlTask sqlTask) {
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
        public GetJobJobSettingsSettingsTask build() {
            final var o = new GetJobJobSettingsSettingsTask();
            o.computeKey = computeKey;
            o.conditionTask = conditionTask;
            o.dbtTask = dbtTask;
            o.dependsOns = dependsOns;
            o.description = description;
            o.emailNotifications = emailNotifications;
            o.existingClusterId = existingClusterId;
            o.health = health;
            o.jobClusterKey = jobClusterKey;
            o.libraries = libraries;
            o.maxRetries = maxRetries;
            o.minRetryIntervalMillis = minRetryIntervalMillis;
            o.newCluster = newCluster;
            o.notebookTask = notebookTask;
            o.notificationSettings = notificationSettings;
            o.pipelineTask = pipelineTask;
            o.pythonWheelTask = pythonWheelTask;
            o.retryOnTimeout = retryOnTimeout;
            o.runIf = runIf;
            o.runJobTask = runJobTask;
            o.sparkJarTask = sparkJarTask;
            o.sparkPythonTask = sparkPythonTask;
            o.sparkSubmitTask = sparkSubmitTask;
            o.sqlTask = sqlTask;
            o.taskKey = taskKey;
            o.timeoutSeconds = timeoutSeconds;
            return o;
        }
    }
}
