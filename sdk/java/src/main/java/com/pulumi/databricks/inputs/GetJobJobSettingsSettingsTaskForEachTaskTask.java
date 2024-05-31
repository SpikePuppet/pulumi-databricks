// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskDbtTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOn;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskHealth;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskLibrary;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewCluster;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNotificationSettings;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskPipelineTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskRunJobTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSparkPythonTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotifications;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskForEachTaskTask extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTask Empty = new GetJobJobSettingsSettingsTaskForEachTaskTask();

    @Import(name="conditionTask")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask conditionTask;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask> conditionTask() {
        return Optional.ofNullable(this.conditionTask);
    }

    @Import(name="dbtTask")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskDbtTask dbtTask;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskDbtTask> dbtTask() {
        return Optional.ofNullable(this.dbtTask);
    }

    @Import(name="dependsOns")
    private @Nullable List<GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOn> dependsOns;

    public Optional<List<GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOn>> dependsOns() {
        return Optional.ofNullable(this.dependsOns);
    }

    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="emailNotifications")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications emailNotifications;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications> emailNotifications() {
        return Optional.ofNullable(this.emailNotifications);
    }

    @Import(name="environmentKey")
    private @Nullable String environmentKey;

    public Optional<String> environmentKey() {
        return Optional.ofNullable(this.environmentKey);
    }

    @Import(name="existingClusterId")
    private @Nullable String existingClusterId;

    public Optional<String> existingClusterId() {
        return Optional.ofNullable(this.existingClusterId);
    }

    @Import(name="health")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskHealth health;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskHealth> health() {
        return Optional.ofNullable(this.health);
    }

    @Import(name="jobClusterKey")
    private @Nullable String jobClusterKey;

    public Optional<String> jobClusterKey() {
        return Optional.ofNullable(this.jobClusterKey);
    }

    @Import(name="libraries")
    private @Nullable List<GetJobJobSettingsSettingsTaskForEachTaskTaskLibrary> libraries;

    public Optional<List<GetJobJobSettingsSettingsTaskForEachTaskTaskLibrary>> libraries() {
        return Optional.ofNullable(this.libraries);
    }

    @Import(name="maxRetries")
    private @Nullable Integer maxRetries;

    public Optional<Integer> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }

    @Import(name="minRetryIntervalMillis")
    private @Nullable Integer minRetryIntervalMillis;

    public Optional<Integer> minRetryIntervalMillis() {
        return Optional.ofNullable(this.minRetryIntervalMillis);
    }

    @Import(name="newCluster")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskNewCluster newCluster;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskNewCluster> newCluster() {
        return Optional.ofNullable(this.newCluster);
    }

    @Import(name="notebookTask")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask notebookTask;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask> notebookTask() {
        return Optional.ofNullable(this.notebookTask);
    }

    @Import(name="notificationSettings")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskNotificationSettings notificationSettings;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskNotificationSettings> notificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }

    @Import(name="pipelineTask")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskPipelineTask pipelineTask;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskPipelineTask> pipelineTask() {
        return Optional.ofNullable(this.pipelineTask);
    }

    @Import(name="pythonWheelTask")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTask pythonWheelTask;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTask> pythonWheelTask() {
        return Optional.ofNullable(this.pythonWheelTask);
    }

    @Import(name="retryOnTimeout", required=true)
    private Boolean retryOnTimeout;

    public Boolean retryOnTimeout() {
        return this.retryOnTimeout;
    }

    @Import(name="runIf")
    private @Nullable String runIf;

    public Optional<String> runIf() {
        return Optional.ofNullable(this.runIf);
    }

    @Import(name="runJobTask")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskRunJobTask runJobTask;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskRunJobTask> runJobTask() {
        return Optional.ofNullable(this.runJobTask);
    }

    @Import(name="sparkJarTask")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTask sparkJarTask;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTask> sparkJarTask() {
        return Optional.ofNullable(this.sparkJarTask);
    }

    @Import(name="sparkPythonTask")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskSparkPythonTask sparkPythonTask;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskSparkPythonTask> sparkPythonTask() {
        return Optional.ofNullable(this.sparkPythonTask);
    }

    @Import(name="sparkSubmitTask")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask sparkSubmitTask;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask> sparkSubmitTask() {
        return Optional.ofNullable(this.sparkSubmitTask);
    }

    @Import(name="sqlTask")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTask sqlTask;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTask> sqlTask() {
        return Optional.ofNullable(this.sqlTask);
    }

    @Import(name="taskKey", required=true)
    private String taskKey;

    public String taskKey() {
        return this.taskKey;
    }

    @Import(name="timeoutSeconds")
    private @Nullable Integer timeoutSeconds;

    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    @Import(name="webhookNotifications")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotifications webhookNotifications;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotifications> webhookNotifications() {
        return Optional.ofNullable(this.webhookNotifications);
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTask() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTask(GetJobJobSettingsSettingsTaskForEachTaskTask $) {
        this.conditionTask = $.conditionTask;
        this.dbtTask = $.dbtTask;
        this.dependsOns = $.dependsOns;
        this.description = $.description;
        this.emailNotifications = $.emailNotifications;
        this.environmentKey = $.environmentKey;
        this.existingClusterId = $.existingClusterId;
        this.health = $.health;
        this.jobClusterKey = $.jobClusterKey;
        this.libraries = $.libraries;
        this.maxRetries = $.maxRetries;
        this.minRetryIntervalMillis = $.minRetryIntervalMillis;
        this.newCluster = $.newCluster;
        this.notebookTask = $.notebookTask;
        this.notificationSettings = $.notificationSettings;
        this.pipelineTask = $.pipelineTask;
        this.pythonWheelTask = $.pythonWheelTask;
        this.retryOnTimeout = $.retryOnTimeout;
        this.runIf = $.runIf;
        this.runJobTask = $.runJobTask;
        this.sparkJarTask = $.sparkJarTask;
        this.sparkPythonTask = $.sparkPythonTask;
        this.sparkSubmitTask = $.sparkSubmitTask;
        this.sqlTask = $.sqlTask;
        this.taskKey = $.taskKey;
        this.timeoutSeconds = $.timeoutSeconds;
        this.webhookNotifications = $.webhookNotifications;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTask $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTask();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTask defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTask(Objects.requireNonNull(defaults));
        }

        public Builder conditionTask(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask conditionTask) {
            $.conditionTask = conditionTask;
            return this;
        }

        public Builder dbtTask(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskDbtTask dbtTask) {
            $.dbtTask = dbtTask;
            return this;
        }

        public Builder dependsOns(@Nullable List<GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOn> dependsOns) {
            $.dependsOns = dependsOns;
            return this;
        }

        public Builder dependsOns(GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOn... dependsOns) {
            return dependsOns(List.of(dependsOns));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder emailNotifications(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications emailNotifications) {
            $.emailNotifications = emailNotifications;
            return this;
        }

        public Builder environmentKey(@Nullable String environmentKey) {
            $.environmentKey = environmentKey;
            return this;
        }

        public Builder existingClusterId(@Nullable String existingClusterId) {
            $.existingClusterId = existingClusterId;
            return this;
        }

        public Builder health(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskHealth health) {
            $.health = health;
            return this;
        }

        public Builder jobClusterKey(@Nullable String jobClusterKey) {
            $.jobClusterKey = jobClusterKey;
            return this;
        }

        public Builder libraries(@Nullable List<GetJobJobSettingsSettingsTaskForEachTaskTaskLibrary> libraries) {
            $.libraries = libraries;
            return this;
        }

        public Builder libraries(GetJobJobSettingsSettingsTaskForEachTaskTaskLibrary... libraries) {
            return libraries(List.of(libraries));
        }

        public Builder maxRetries(@Nullable Integer maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        public Builder minRetryIntervalMillis(@Nullable Integer minRetryIntervalMillis) {
            $.minRetryIntervalMillis = minRetryIntervalMillis;
            return this;
        }

        public Builder newCluster(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskNewCluster newCluster) {
            $.newCluster = newCluster;
            return this;
        }

        public Builder notebookTask(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask notebookTask) {
            $.notebookTask = notebookTask;
            return this;
        }

        public Builder notificationSettings(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskNotificationSettings notificationSettings) {
            $.notificationSettings = notificationSettings;
            return this;
        }

        public Builder pipelineTask(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskPipelineTask pipelineTask) {
            $.pipelineTask = pipelineTask;
            return this;
        }

        public Builder pythonWheelTask(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTask pythonWheelTask) {
            $.pythonWheelTask = pythonWheelTask;
            return this;
        }

        public Builder retryOnTimeout(Boolean retryOnTimeout) {
            $.retryOnTimeout = retryOnTimeout;
            return this;
        }

        public Builder runIf(@Nullable String runIf) {
            $.runIf = runIf;
            return this;
        }

        public Builder runJobTask(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskRunJobTask runJobTask) {
            $.runJobTask = runJobTask;
            return this;
        }

        public Builder sparkJarTask(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTask sparkJarTask) {
            $.sparkJarTask = sparkJarTask;
            return this;
        }

        public Builder sparkPythonTask(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskSparkPythonTask sparkPythonTask) {
            $.sparkPythonTask = sparkPythonTask;
            return this;
        }

        public Builder sparkSubmitTask(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask sparkSubmitTask) {
            $.sparkSubmitTask = sparkSubmitTask;
            return this;
        }

        public Builder sqlTask(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTask sqlTask) {
            $.sqlTask = sqlTask;
            return this;
        }

        public Builder taskKey(String taskKey) {
            $.taskKey = taskKey;
            return this;
        }

        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Builder webhookNotifications(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotifications webhookNotifications) {
            $.webhookNotifications = webhookNotifications;
            return this;
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTask build() {
            if ($.retryOnTimeout == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTask", "retryOnTimeout");
            }
            if ($.taskKey == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTask", "taskKey");
            }
            return $;
        }
    }

}
