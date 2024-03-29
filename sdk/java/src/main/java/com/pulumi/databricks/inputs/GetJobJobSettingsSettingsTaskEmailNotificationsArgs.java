// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskEmailNotificationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskEmailNotificationsArgs Empty = new GetJobJobSettingsSettingsTaskEmailNotificationsArgs();

    @Import(name="noAlertForSkippedRuns")
    private @Nullable Output<Boolean> noAlertForSkippedRuns;

    public Optional<Output<Boolean>> noAlertForSkippedRuns() {
        return Optional.ofNullable(this.noAlertForSkippedRuns);
    }

    @Import(name="onDurationWarningThresholdExceededs")
    private @Nullable Output<List<String>> onDurationWarningThresholdExceededs;

    public Optional<Output<List<String>>> onDurationWarningThresholdExceededs() {
        return Optional.ofNullable(this.onDurationWarningThresholdExceededs);
    }

    @Import(name="onFailures")
    private @Nullable Output<List<String>> onFailures;

    public Optional<Output<List<String>>> onFailures() {
        return Optional.ofNullable(this.onFailures);
    }

    @Import(name="onStarts")
    private @Nullable Output<List<String>> onStarts;

    public Optional<Output<List<String>>> onStarts() {
        return Optional.ofNullable(this.onStarts);
    }

    @Import(name="onSuccesses")
    private @Nullable Output<List<String>> onSuccesses;

    public Optional<Output<List<String>>> onSuccesses() {
        return Optional.ofNullable(this.onSuccesses);
    }

    private GetJobJobSettingsSettingsTaskEmailNotificationsArgs() {}

    private GetJobJobSettingsSettingsTaskEmailNotificationsArgs(GetJobJobSettingsSettingsTaskEmailNotificationsArgs $) {
        this.noAlertForSkippedRuns = $.noAlertForSkippedRuns;
        this.onDurationWarningThresholdExceededs = $.onDurationWarningThresholdExceededs;
        this.onFailures = $.onFailures;
        this.onStarts = $.onStarts;
        this.onSuccesses = $.onSuccesses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskEmailNotificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskEmailNotificationsArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskEmailNotificationsArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskEmailNotificationsArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskEmailNotificationsArgs(Objects.requireNonNull(defaults));
        }

        public Builder noAlertForSkippedRuns(@Nullable Output<Boolean> noAlertForSkippedRuns) {
            $.noAlertForSkippedRuns = noAlertForSkippedRuns;
            return this;
        }

        public Builder noAlertForSkippedRuns(Boolean noAlertForSkippedRuns) {
            return noAlertForSkippedRuns(Output.of(noAlertForSkippedRuns));
        }

        public Builder onDurationWarningThresholdExceededs(@Nullable Output<List<String>> onDurationWarningThresholdExceededs) {
            $.onDurationWarningThresholdExceededs = onDurationWarningThresholdExceededs;
            return this;
        }

        public Builder onDurationWarningThresholdExceededs(List<String> onDurationWarningThresholdExceededs) {
            return onDurationWarningThresholdExceededs(Output.of(onDurationWarningThresholdExceededs));
        }

        public Builder onDurationWarningThresholdExceededs(String... onDurationWarningThresholdExceededs) {
            return onDurationWarningThresholdExceededs(List.of(onDurationWarningThresholdExceededs));
        }

        public Builder onFailures(@Nullable Output<List<String>> onFailures) {
            $.onFailures = onFailures;
            return this;
        }

        public Builder onFailures(List<String> onFailures) {
            return onFailures(Output.of(onFailures));
        }

        public Builder onFailures(String... onFailures) {
            return onFailures(List.of(onFailures));
        }

        public Builder onStarts(@Nullable Output<List<String>> onStarts) {
            $.onStarts = onStarts;
            return this;
        }

        public Builder onStarts(List<String> onStarts) {
            return onStarts(Output.of(onStarts));
        }

        public Builder onStarts(String... onStarts) {
            return onStarts(List.of(onStarts));
        }

        public Builder onSuccesses(@Nullable Output<List<String>> onSuccesses) {
            $.onSuccesses = onSuccesses;
            return this;
        }

        public Builder onSuccesses(List<String> onSuccesses) {
            return onSuccesses(Output.of(onSuccesses));
        }

        public Builder onSuccesses(String... onSuccesses) {
            return onSuccesses(List.of(onSuccesses));
        }

        public GetJobJobSettingsSettingsTaskEmailNotificationsArgs build() {
            return $;
        }
    }

}
