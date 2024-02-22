// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications();

    @Import(name="onDurationWarningThresholdExceededs")
    private @Nullable List<String> onDurationWarningThresholdExceededs;

    public Optional<List<String>> onDurationWarningThresholdExceededs() {
        return Optional.ofNullable(this.onDurationWarningThresholdExceededs);
    }

    @Import(name="onFailures")
    private @Nullable List<String> onFailures;

    public Optional<List<String>> onFailures() {
        return Optional.ofNullable(this.onFailures);
    }

    @Import(name="onStarts")
    private @Nullable List<String> onStarts;

    public Optional<List<String>> onStarts() {
        return Optional.ofNullable(this.onStarts);
    }

    @Import(name="onSuccesses")
    private @Nullable List<String> onSuccesses;

    public Optional<List<String>> onSuccesses() {
        return Optional.ofNullable(this.onSuccesses);
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications(GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications $) {
        this.onDurationWarningThresholdExceededs = $.onDurationWarningThresholdExceededs;
        this.onFailures = $.onFailures;
        this.onStarts = $.onStarts;
        this.onSuccesses = $.onSuccesses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications(Objects.requireNonNull(defaults));
        }

        public Builder onDurationWarningThresholdExceededs(@Nullable List<String> onDurationWarningThresholdExceededs) {
            $.onDurationWarningThresholdExceededs = onDurationWarningThresholdExceededs;
            return this;
        }

        public Builder onDurationWarningThresholdExceededs(String... onDurationWarningThresholdExceededs) {
            return onDurationWarningThresholdExceededs(List.of(onDurationWarningThresholdExceededs));
        }

        public Builder onFailures(@Nullable List<String> onFailures) {
            $.onFailures = onFailures;
            return this;
        }

        public Builder onFailures(String... onFailures) {
            return onFailures(List.of(onFailures));
        }

        public Builder onStarts(@Nullable List<String> onStarts) {
            $.onStarts = onStarts;
            return this;
        }

        public Builder onStarts(String... onStarts) {
            return onStarts(List.of(onStarts));
        }

        public Builder onSuccesses(@Nullable List<String> onSuccesses) {
            $.onSuccesses = onSuccesses;
            return this;
        }

        public Builder onSuccesses(String... onSuccesses) {
            return onSuccesses(List.of(onSuccesses));
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotifications build() {
            return $;
        }
    }

}
