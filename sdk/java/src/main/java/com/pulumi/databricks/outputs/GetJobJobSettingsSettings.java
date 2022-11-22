// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsDbtTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsEmailNotifications;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsGitSource;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsJobCluster;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsLibrary;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewCluster;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNotebookTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsPipelineTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsPythonWheelTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsSchedule;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsSparkJarTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsSparkPythonTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsSparkSubmitTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsWebhookNotifications;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettings {
    private @Nullable GetJobJobSettingsSettingsDbtTask dbtTask;
    private @Nullable GetJobJobSettingsSettingsEmailNotifications emailNotifications;
    private @Nullable String existingClusterId;
    private String format;
    private @Nullable GetJobJobSettingsSettingsGitSource gitSource;
    private @Nullable List<GetJobJobSettingsSettingsJobCluster> jobClusters;
    private @Nullable List<GetJobJobSettingsSettingsLibrary> libraries;
    private @Nullable Integer maxConcurrentRuns;
    private @Nullable Integer maxRetries;
    private @Nullable Integer minRetryIntervalMillis;
    private @Nullable String name;
    private @Nullable GetJobJobSettingsSettingsNewCluster newCluster;
    private @Nullable GetJobJobSettingsSettingsNotebookTask notebookTask;
    private @Nullable GetJobJobSettingsSettingsPipelineTask pipelineTask;
    private @Nullable GetJobJobSettingsSettingsPythonWheelTask pythonWheelTask;
    private @Nullable Boolean retryOnTimeout;
    private @Nullable GetJobJobSettingsSettingsSchedule schedule;
    private @Nullable GetJobJobSettingsSettingsSparkJarTask sparkJarTask;
    private @Nullable GetJobJobSettingsSettingsSparkPythonTask sparkPythonTask;
    private @Nullable GetJobJobSettingsSettingsSparkSubmitTask sparkSubmitTask;
    private @Nullable Map<String,Object> tags;
    private @Nullable List<GetJobJobSettingsSettingsTask> tasks;
    private @Nullable Integer timeoutSeconds;
    private @Nullable GetJobJobSettingsSettingsWebhookNotifications webhookNotifications;

    private GetJobJobSettingsSettings() {}
    public Optional<GetJobJobSettingsSettingsDbtTask> dbtTask() {
        return Optional.ofNullable(this.dbtTask);
    }
    public Optional<GetJobJobSettingsSettingsEmailNotifications> emailNotifications() {
        return Optional.ofNullable(this.emailNotifications);
    }
    public Optional<String> existingClusterId() {
        return Optional.ofNullable(this.existingClusterId);
    }
    public String format() {
        return this.format;
    }
    public Optional<GetJobJobSettingsSettingsGitSource> gitSource() {
        return Optional.ofNullable(this.gitSource);
    }
    public List<GetJobJobSettingsSettingsJobCluster> jobClusters() {
        return this.jobClusters == null ? List.of() : this.jobClusters;
    }
    public List<GetJobJobSettingsSettingsLibrary> libraries() {
        return this.libraries == null ? List.of() : this.libraries;
    }
    public Optional<Integer> maxConcurrentRuns() {
        return Optional.ofNullable(this.maxConcurrentRuns);
    }
    public Optional<Integer> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }
    public Optional<Integer> minRetryIntervalMillis() {
        return Optional.ofNullable(this.minRetryIntervalMillis);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<GetJobJobSettingsSettingsNewCluster> newCluster() {
        return Optional.ofNullable(this.newCluster);
    }
    public Optional<GetJobJobSettingsSettingsNotebookTask> notebookTask() {
        return Optional.ofNullable(this.notebookTask);
    }
    public Optional<GetJobJobSettingsSettingsPipelineTask> pipelineTask() {
        return Optional.ofNullable(this.pipelineTask);
    }
    public Optional<GetJobJobSettingsSettingsPythonWheelTask> pythonWheelTask() {
        return Optional.ofNullable(this.pythonWheelTask);
    }
    public Optional<Boolean> retryOnTimeout() {
        return Optional.ofNullable(this.retryOnTimeout);
    }
    public Optional<GetJobJobSettingsSettingsSchedule> schedule() {
        return Optional.ofNullable(this.schedule);
    }
    public Optional<GetJobJobSettingsSettingsSparkJarTask> sparkJarTask() {
        return Optional.ofNullable(this.sparkJarTask);
    }
    public Optional<GetJobJobSettingsSettingsSparkPythonTask> sparkPythonTask() {
        return Optional.ofNullable(this.sparkPythonTask);
    }
    public Optional<GetJobJobSettingsSettingsSparkSubmitTask> sparkSubmitTask() {
        return Optional.ofNullable(this.sparkSubmitTask);
    }
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public List<GetJobJobSettingsSettingsTask> tasks() {
        return this.tasks == null ? List.of() : this.tasks;
    }
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }
    public Optional<GetJobJobSettingsSettingsWebhookNotifications> webhookNotifications() {
        return Optional.ofNullable(this.webhookNotifications);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetJobJobSettingsSettingsDbtTask dbtTask;
        private @Nullable GetJobJobSettingsSettingsEmailNotifications emailNotifications;
        private @Nullable String existingClusterId;
        private String format;
        private @Nullable GetJobJobSettingsSettingsGitSource gitSource;
        private @Nullable List<GetJobJobSettingsSettingsJobCluster> jobClusters;
        private @Nullable List<GetJobJobSettingsSettingsLibrary> libraries;
        private @Nullable Integer maxConcurrentRuns;
        private @Nullable Integer maxRetries;
        private @Nullable Integer minRetryIntervalMillis;
        private @Nullable String name;
        private @Nullable GetJobJobSettingsSettingsNewCluster newCluster;
        private @Nullable GetJobJobSettingsSettingsNotebookTask notebookTask;
        private @Nullable GetJobJobSettingsSettingsPipelineTask pipelineTask;
        private @Nullable GetJobJobSettingsSettingsPythonWheelTask pythonWheelTask;
        private @Nullable Boolean retryOnTimeout;
        private @Nullable GetJobJobSettingsSettingsSchedule schedule;
        private @Nullable GetJobJobSettingsSettingsSparkJarTask sparkJarTask;
        private @Nullable GetJobJobSettingsSettingsSparkPythonTask sparkPythonTask;
        private @Nullable GetJobJobSettingsSettingsSparkSubmitTask sparkSubmitTask;
        private @Nullable Map<String,Object> tags;
        private @Nullable List<GetJobJobSettingsSettingsTask> tasks;
        private @Nullable Integer timeoutSeconds;
        private @Nullable GetJobJobSettingsSettingsWebhookNotifications webhookNotifications;
        public Builder() {}
        public Builder(GetJobJobSettingsSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbtTask = defaults.dbtTask;
    	      this.emailNotifications = defaults.emailNotifications;
    	      this.existingClusterId = defaults.existingClusterId;
    	      this.format = defaults.format;
    	      this.gitSource = defaults.gitSource;
    	      this.jobClusters = defaults.jobClusters;
    	      this.libraries = defaults.libraries;
    	      this.maxConcurrentRuns = defaults.maxConcurrentRuns;
    	      this.maxRetries = defaults.maxRetries;
    	      this.minRetryIntervalMillis = defaults.minRetryIntervalMillis;
    	      this.name = defaults.name;
    	      this.newCluster = defaults.newCluster;
    	      this.notebookTask = defaults.notebookTask;
    	      this.pipelineTask = defaults.pipelineTask;
    	      this.pythonWheelTask = defaults.pythonWheelTask;
    	      this.retryOnTimeout = defaults.retryOnTimeout;
    	      this.schedule = defaults.schedule;
    	      this.sparkJarTask = defaults.sparkJarTask;
    	      this.sparkPythonTask = defaults.sparkPythonTask;
    	      this.sparkSubmitTask = defaults.sparkSubmitTask;
    	      this.tags = defaults.tags;
    	      this.tasks = defaults.tasks;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
    	      this.webhookNotifications = defaults.webhookNotifications;
        }

        @CustomType.Setter
        public Builder dbtTask(@Nullable GetJobJobSettingsSettingsDbtTask dbtTask) {
            this.dbtTask = dbtTask;
            return this;
        }
        @CustomType.Setter
        public Builder emailNotifications(@Nullable GetJobJobSettingsSettingsEmailNotifications emailNotifications) {
            this.emailNotifications = emailNotifications;
            return this;
        }
        @CustomType.Setter
        public Builder existingClusterId(@Nullable String existingClusterId) {
            this.existingClusterId = existingClusterId;
            return this;
        }
        @CustomType.Setter
        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        @CustomType.Setter
        public Builder gitSource(@Nullable GetJobJobSettingsSettingsGitSource gitSource) {
            this.gitSource = gitSource;
            return this;
        }
        @CustomType.Setter
        public Builder jobClusters(@Nullable List<GetJobJobSettingsSettingsJobCluster> jobClusters) {
            this.jobClusters = jobClusters;
            return this;
        }
        public Builder jobClusters(GetJobJobSettingsSettingsJobCluster... jobClusters) {
            return jobClusters(List.of(jobClusters));
        }
        @CustomType.Setter
        public Builder libraries(@Nullable List<GetJobJobSettingsSettingsLibrary> libraries) {
            this.libraries = libraries;
            return this;
        }
        public Builder libraries(GetJobJobSettingsSettingsLibrary... libraries) {
            return libraries(List.of(libraries));
        }
        @CustomType.Setter
        public Builder maxConcurrentRuns(@Nullable Integer maxConcurrentRuns) {
            this.maxConcurrentRuns = maxConcurrentRuns;
            return this;
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
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder newCluster(@Nullable GetJobJobSettingsSettingsNewCluster newCluster) {
            this.newCluster = newCluster;
            return this;
        }
        @CustomType.Setter
        public Builder notebookTask(@Nullable GetJobJobSettingsSettingsNotebookTask notebookTask) {
            this.notebookTask = notebookTask;
            return this;
        }
        @CustomType.Setter
        public Builder pipelineTask(@Nullable GetJobJobSettingsSettingsPipelineTask pipelineTask) {
            this.pipelineTask = pipelineTask;
            return this;
        }
        @CustomType.Setter
        public Builder pythonWheelTask(@Nullable GetJobJobSettingsSettingsPythonWheelTask pythonWheelTask) {
            this.pythonWheelTask = pythonWheelTask;
            return this;
        }
        @CustomType.Setter
        public Builder retryOnTimeout(@Nullable Boolean retryOnTimeout) {
            this.retryOnTimeout = retryOnTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder schedule(@Nullable GetJobJobSettingsSettingsSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        @CustomType.Setter
        public Builder sparkJarTask(@Nullable GetJobJobSettingsSettingsSparkJarTask sparkJarTask) {
            this.sparkJarTask = sparkJarTask;
            return this;
        }
        @CustomType.Setter
        public Builder sparkPythonTask(@Nullable GetJobJobSettingsSettingsSparkPythonTask sparkPythonTask) {
            this.sparkPythonTask = sparkPythonTask;
            return this;
        }
        @CustomType.Setter
        public Builder sparkSubmitTask(@Nullable GetJobJobSettingsSettingsSparkSubmitTask sparkSubmitTask) {
            this.sparkSubmitTask = sparkSubmitTask;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder tasks(@Nullable List<GetJobJobSettingsSettingsTask> tasks) {
            this.tasks = tasks;
            return this;
        }
        public Builder tasks(GetJobJobSettingsSettingsTask... tasks) {
            return tasks(List.of(tasks));
        }
        @CustomType.Setter
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder webhookNotifications(@Nullable GetJobJobSettingsSettingsWebhookNotifications webhookNotifications) {
            this.webhookNotifications = webhookNotifications;
            return this;
        }
        public GetJobJobSettingsSettings build() {
            final var o = new GetJobJobSettingsSettings();
            o.dbtTask = dbtTask;
            o.emailNotifications = emailNotifications;
            o.existingClusterId = existingClusterId;
            o.format = format;
            o.gitSource = gitSource;
            o.jobClusters = jobClusters;
            o.libraries = libraries;
            o.maxConcurrentRuns = maxConcurrentRuns;
            o.maxRetries = maxRetries;
            o.minRetryIntervalMillis = minRetryIntervalMillis;
            o.name = name;
            o.newCluster = newCluster;
            o.notebookTask = notebookTask;
            o.pipelineTask = pipelineTask;
            o.pythonWheelTask = pythonWheelTask;
            o.retryOnTimeout = retryOnTimeout;
            o.schedule = schedule;
            o.sparkJarTask = sparkJarTask;
            o.sparkPythonTask = sparkPythonTask;
            o.sparkSubmitTask = sparkSubmitTask;
            o.tags = tags;
            o.tasks = tasks;
            o.timeoutSeconds = timeoutSeconds;
            o.webhookNotifications = webhookNotifications;
            return o;
        }
    }
}
