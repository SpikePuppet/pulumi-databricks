// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskDbtTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOnArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotificationsArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskHealthArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskLibraryArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNotificationSettingsArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskPipelineTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskRunJobTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSparkPythonTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskArgs Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskArgs();

    @Import(name="conditionTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTaskArgs> conditionTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTaskArgs>> conditionTask() {
        return Optional.ofNullable(this.conditionTask);
    }

    @Import(name="dbtTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskDbtTaskArgs> dbtTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskDbtTaskArgs>> dbtTask() {
        return Optional.ofNullable(this.dbtTask);
    }

    @Import(name="dependsOns")
    private @Nullable Output<List<GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOnArgs>> dependsOns;

    public Optional<Output<List<GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOnArgs>>> dependsOns() {
        return Optional.ofNullable(this.dependsOns);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="emailNotifications")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotificationsArgs> emailNotifications;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotificationsArgs>> emailNotifications() {
        return Optional.ofNullable(this.emailNotifications);
    }

    @Import(name="environmentKey")
    private @Nullable Output<String> environmentKey;

    public Optional<Output<String>> environmentKey() {
        return Optional.ofNullable(this.environmentKey);
    }

    @Import(name="existingClusterId")
    private @Nullable Output<String> existingClusterId;

    public Optional<Output<String>> existingClusterId() {
        return Optional.ofNullable(this.existingClusterId);
    }

    @Import(name="health")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskHealthArgs> health;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskHealthArgs>> health() {
        return Optional.ofNullable(this.health);
    }

    @Import(name="jobClusterKey")
    private @Nullable Output<String> jobClusterKey;

    public Optional<Output<String>> jobClusterKey() {
        return Optional.ofNullable(this.jobClusterKey);
    }

    @Import(name="libraries")
    private @Nullable Output<List<GetJobJobSettingsSettingsTaskForEachTaskTaskLibraryArgs>> libraries;

    public Optional<Output<List<GetJobJobSettingsSettingsTaskForEachTaskTaskLibraryArgs>>> libraries() {
        return Optional.ofNullable(this.libraries);
    }

    @Import(name="maxRetries")
    private @Nullable Output<Integer> maxRetries;

    public Optional<Output<Integer>> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }

    @Import(name="minRetryIntervalMillis")
    private @Nullable Output<Integer> minRetryIntervalMillis;

    public Optional<Output<Integer>> minRetryIntervalMillis() {
        return Optional.ofNullable(this.minRetryIntervalMillis);
    }

    @Import(name="newCluster")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterArgs> newCluster;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterArgs>> newCluster() {
        return Optional.ofNullable(this.newCluster);
    }

    @Import(name="notebookTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs> notebookTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs>> notebookTask() {
        return Optional.ofNullable(this.notebookTask);
    }

    @Import(name="notificationSettings")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNotificationSettingsArgs> notificationSettings;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNotificationSettingsArgs>> notificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }

    @Import(name="pipelineTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskPipelineTaskArgs> pipelineTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskPipelineTaskArgs>> pipelineTask() {
        return Optional.ofNullable(this.pipelineTask);
    }

    @Import(name="pythonWheelTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs> pythonWheelTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs>> pythonWheelTask() {
        return Optional.ofNullable(this.pythonWheelTask);
    }

    @Import(name="retryOnTimeout", required=true)
    private Output<Boolean> retryOnTimeout;

    public Output<Boolean> retryOnTimeout() {
        return this.retryOnTimeout;
    }

    @Import(name="runIf")
    private @Nullable Output<String> runIf;

    public Optional<Output<String>> runIf() {
        return Optional.ofNullable(this.runIf);
    }

    @Import(name="runJobTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskRunJobTaskArgs> runJobTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskRunJobTaskArgs>> runJobTask() {
        return Optional.ofNullable(this.runJobTask);
    }

    @Import(name="sparkJarTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs> sparkJarTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs>> sparkJarTask() {
        return Optional.ofNullable(this.sparkJarTask);
    }

    @Import(name="sparkPythonTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskSparkPythonTaskArgs> sparkPythonTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskSparkPythonTaskArgs>> sparkPythonTask() {
        return Optional.ofNullable(this.sparkPythonTask);
    }

    @Import(name="sparkSubmitTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTaskArgs> sparkSubmitTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTaskArgs>> sparkSubmitTask() {
        return Optional.ofNullable(this.sparkSubmitTask);
    }

    @Import(name="sqlTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskArgs> sqlTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskArgs>> sqlTask() {
        return Optional.ofNullable(this.sqlTask);
    }

    @Import(name="taskKey", required=true)
    private Output<String> taskKey;

    public Output<String> taskKey() {
        return this.taskKey;
    }

    @Import(name="timeoutSeconds")
    private @Nullable Output<Integer> timeoutSeconds;

    public Optional<Output<Integer>> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    @Import(name="webhookNotifications")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsArgs> webhookNotifications;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsArgs>> webhookNotifications() {
        return Optional.ofNullable(this.webhookNotifications);
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskArgs() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskArgs(GetJobJobSettingsSettingsTaskForEachTaskTaskArgs $) {
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
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditionTask(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTaskArgs> conditionTask) {
            $.conditionTask = conditionTask;
            return this;
        }

        public Builder conditionTask(GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTaskArgs conditionTask) {
            return conditionTask(Output.of(conditionTask));
        }

        public Builder dbtTask(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskDbtTaskArgs> dbtTask) {
            $.dbtTask = dbtTask;
            return this;
        }

        public Builder dbtTask(GetJobJobSettingsSettingsTaskForEachTaskTaskDbtTaskArgs dbtTask) {
            return dbtTask(Output.of(dbtTask));
        }

        public Builder dependsOns(@Nullable Output<List<GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOnArgs>> dependsOns) {
            $.dependsOns = dependsOns;
            return this;
        }

        public Builder dependsOns(List<GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOnArgs> dependsOns) {
            return dependsOns(Output.of(dependsOns));
        }

        public Builder dependsOns(GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOnArgs... dependsOns) {
            return dependsOns(List.of(dependsOns));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder emailNotifications(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotificationsArgs> emailNotifications) {
            $.emailNotifications = emailNotifications;
            return this;
        }

        public Builder emailNotifications(GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotificationsArgs emailNotifications) {
            return emailNotifications(Output.of(emailNotifications));
        }

        public Builder environmentKey(@Nullable Output<String> environmentKey) {
            $.environmentKey = environmentKey;
            return this;
        }

        public Builder environmentKey(String environmentKey) {
            return environmentKey(Output.of(environmentKey));
        }

        public Builder existingClusterId(@Nullable Output<String> existingClusterId) {
            $.existingClusterId = existingClusterId;
            return this;
        }

        public Builder existingClusterId(String existingClusterId) {
            return existingClusterId(Output.of(existingClusterId));
        }

        public Builder health(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskHealthArgs> health) {
            $.health = health;
            return this;
        }

        public Builder health(GetJobJobSettingsSettingsTaskForEachTaskTaskHealthArgs health) {
            return health(Output.of(health));
        }

        public Builder jobClusterKey(@Nullable Output<String> jobClusterKey) {
            $.jobClusterKey = jobClusterKey;
            return this;
        }

        public Builder jobClusterKey(String jobClusterKey) {
            return jobClusterKey(Output.of(jobClusterKey));
        }

        public Builder libraries(@Nullable Output<List<GetJobJobSettingsSettingsTaskForEachTaskTaskLibraryArgs>> libraries) {
            $.libraries = libraries;
            return this;
        }

        public Builder libraries(List<GetJobJobSettingsSettingsTaskForEachTaskTaskLibraryArgs> libraries) {
            return libraries(Output.of(libraries));
        }

        public Builder libraries(GetJobJobSettingsSettingsTaskForEachTaskTaskLibraryArgs... libraries) {
            return libraries(List.of(libraries));
        }

        public Builder maxRetries(@Nullable Output<Integer> maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        public Builder maxRetries(Integer maxRetries) {
            return maxRetries(Output.of(maxRetries));
        }

        public Builder minRetryIntervalMillis(@Nullable Output<Integer> minRetryIntervalMillis) {
            $.minRetryIntervalMillis = minRetryIntervalMillis;
            return this;
        }

        public Builder minRetryIntervalMillis(Integer minRetryIntervalMillis) {
            return minRetryIntervalMillis(Output.of(minRetryIntervalMillis));
        }

        public Builder newCluster(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterArgs> newCluster) {
            $.newCluster = newCluster;
            return this;
        }

        public Builder newCluster(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterArgs newCluster) {
            return newCluster(Output.of(newCluster));
        }

        public Builder notebookTask(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs> notebookTask) {
            $.notebookTask = notebookTask;
            return this;
        }

        public Builder notebookTask(GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs notebookTask) {
            return notebookTask(Output.of(notebookTask));
        }

        public Builder notificationSettings(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNotificationSettingsArgs> notificationSettings) {
            $.notificationSettings = notificationSettings;
            return this;
        }

        public Builder notificationSettings(GetJobJobSettingsSettingsTaskForEachTaskTaskNotificationSettingsArgs notificationSettings) {
            return notificationSettings(Output.of(notificationSettings));
        }

        public Builder pipelineTask(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskPipelineTaskArgs> pipelineTask) {
            $.pipelineTask = pipelineTask;
            return this;
        }

        public Builder pipelineTask(GetJobJobSettingsSettingsTaskForEachTaskTaskPipelineTaskArgs pipelineTask) {
            return pipelineTask(Output.of(pipelineTask));
        }

        public Builder pythonWheelTask(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs> pythonWheelTask) {
            $.pythonWheelTask = pythonWheelTask;
            return this;
        }

        public Builder pythonWheelTask(GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs pythonWheelTask) {
            return pythonWheelTask(Output.of(pythonWheelTask));
        }

        public Builder retryOnTimeout(Output<Boolean> retryOnTimeout) {
            $.retryOnTimeout = retryOnTimeout;
            return this;
        }

        public Builder retryOnTimeout(Boolean retryOnTimeout) {
            return retryOnTimeout(Output.of(retryOnTimeout));
        }

        public Builder runIf(@Nullable Output<String> runIf) {
            $.runIf = runIf;
            return this;
        }

        public Builder runIf(String runIf) {
            return runIf(Output.of(runIf));
        }

        public Builder runJobTask(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskRunJobTaskArgs> runJobTask) {
            $.runJobTask = runJobTask;
            return this;
        }

        public Builder runJobTask(GetJobJobSettingsSettingsTaskForEachTaskTaskRunJobTaskArgs runJobTask) {
            return runJobTask(Output.of(runJobTask));
        }

        public Builder sparkJarTask(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs> sparkJarTask) {
            $.sparkJarTask = sparkJarTask;
            return this;
        }

        public Builder sparkJarTask(GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs sparkJarTask) {
            return sparkJarTask(Output.of(sparkJarTask));
        }

        public Builder sparkPythonTask(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskSparkPythonTaskArgs> sparkPythonTask) {
            $.sparkPythonTask = sparkPythonTask;
            return this;
        }

        public Builder sparkPythonTask(GetJobJobSettingsSettingsTaskForEachTaskTaskSparkPythonTaskArgs sparkPythonTask) {
            return sparkPythonTask(Output.of(sparkPythonTask));
        }

        public Builder sparkSubmitTask(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTaskArgs> sparkSubmitTask) {
            $.sparkSubmitTask = sparkSubmitTask;
            return this;
        }

        public Builder sparkSubmitTask(GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTaskArgs sparkSubmitTask) {
            return sparkSubmitTask(Output.of(sparkSubmitTask));
        }

        public Builder sqlTask(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskArgs> sqlTask) {
            $.sqlTask = sqlTask;
            return this;
        }

        public Builder sqlTask(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskArgs sqlTask) {
            return sqlTask(Output.of(sqlTask));
        }

        public Builder taskKey(Output<String> taskKey) {
            $.taskKey = taskKey;
            return this;
        }

        public Builder taskKey(String taskKey) {
            return taskKey(Output.of(taskKey));
        }

        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Builder timeoutSeconds(Integer timeoutSeconds) {
            return timeoutSeconds(Output.of(timeoutSeconds));
        }

        public Builder webhookNotifications(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsArgs> webhookNotifications) {
            $.webhookNotifications = webhookNotifications;
            return this;
        }

        public Builder webhookNotifications(GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsArgs webhookNotifications) {
            return webhookNotifications(Output.of(webhookNotifications));
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskArgs build() {
            if ($.retryOnTimeout == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskArgs", "retryOnTimeout");
            }
            if ($.taskKey == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskArgs", "taskKey");
            }
            return $;
        }
    }

}
