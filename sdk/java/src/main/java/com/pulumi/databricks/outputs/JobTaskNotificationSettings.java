// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskNotificationSettings {
    /**
     * @return (Bool) do not send notifications to recipients specified in `on_start` for the retried runs and do not send notifications to recipients specified in `on_failure` until the last retry of the run.
     * 
     */
    private @Nullable Boolean alertOnLastAttempt;
    /**
     * @return (Bool) don&#39;t send alert for cancelled runs.
     * 
     */
    private @Nullable Boolean noAlertForCanceledRuns;
    /**
     * @return (Bool) don&#39;t send alert for skipped runs.
     * 
     */
    private @Nullable Boolean noAlertForSkippedRuns;

    private JobTaskNotificationSettings() {}
    /**
     * @return (Bool) do not send notifications to recipients specified in `on_start` for the retried runs and do not send notifications to recipients specified in `on_failure` until the last retry of the run.
     * 
     */
    public Optional<Boolean> alertOnLastAttempt() {
        return Optional.ofNullable(this.alertOnLastAttempt);
    }
    /**
     * @return (Bool) don&#39;t send alert for cancelled runs.
     * 
     */
    public Optional<Boolean> noAlertForCanceledRuns() {
        return Optional.ofNullable(this.noAlertForCanceledRuns);
    }
    /**
     * @return (Bool) don&#39;t send alert for skipped runs.
     * 
     */
    public Optional<Boolean> noAlertForSkippedRuns() {
        return Optional.ofNullable(this.noAlertForSkippedRuns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskNotificationSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean alertOnLastAttempt;
        private @Nullable Boolean noAlertForCanceledRuns;
        private @Nullable Boolean noAlertForSkippedRuns;
        public Builder() {}
        public Builder(JobTaskNotificationSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertOnLastAttempt = defaults.alertOnLastAttempt;
    	      this.noAlertForCanceledRuns = defaults.noAlertForCanceledRuns;
    	      this.noAlertForSkippedRuns = defaults.noAlertForSkippedRuns;
        }

        @CustomType.Setter
        public Builder alertOnLastAttempt(@Nullable Boolean alertOnLastAttempt) {

            this.alertOnLastAttempt = alertOnLastAttempt;
            return this;
        }
        @CustomType.Setter
        public Builder noAlertForCanceledRuns(@Nullable Boolean noAlertForCanceledRuns) {

            this.noAlertForCanceledRuns = noAlertForCanceledRuns;
            return this;
        }
        @CustomType.Setter
        public Builder noAlertForSkippedRuns(@Nullable Boolean noAlertForSkippedRuns) {

            this.noAlertForSkippedRuns = noAlertForSkippedRuns;
            return this;
        }
        public JobTaskNotificationSettings build() {
            final var _resultValue = new JobTaskNotificationSettings();
            _resultValue.alertOnLastAttempt = alertOnLastAttempt;
            _resultValue.noAlertForCanceledRuns = noAlertForCanceledRuns;
            _resultValue.noAlertForSkippedRuns = noAlertForSkippedRuns;
            return _resultValue;
        }
    }
}
