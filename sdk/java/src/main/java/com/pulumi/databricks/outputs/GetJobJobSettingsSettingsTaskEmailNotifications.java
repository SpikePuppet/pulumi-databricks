// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskEmailNotifications {
    private @Nullable List<String> onDurationWarningThresholdExceededs;
    private @Nullable List<String> onFailures;
    private @Nullable List<String> onStarts;
    private @Nullable List<String> onSuccesses;

    private GetJobJobSettingsSettingsTaskEmailNotifications() {}
    public List<String> onDurationWarningThresholdExceededs() {
        return this.onDurationWarningThresholdExceededs == null ? List.of() : this.onDurationWarningThresholdExceededs;
    }
    public List<String> onFailures() {
        return this.onFailures == null ? List.of() : this.onFailures;
    }
    public List<String> onStarts() {
        return this.onStarts == null ? List.of() : this.onStarts;
    }
    public List<String> onSuccesses() {
        return this.onSuccesses == null ? List.of() : this.onSuccesses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskEmailNotifications defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> onDurationWarningThresholdExceededs;
        private @Nullable List<String> onFailures;
        private @Nullable List<String> onStarts;
        private @Nullable List<String> onSuccesses;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskEmailNotifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onDurationWarningThresholdExceededs = defaults.onDurationWarningThresholdExceededs;
    	      this.onFailures = defaults.onFailures;
    	      this.onStarts = defaults.onStarts;
    	      this.onSuccesses = defaults.onSuccesses;
        }

        @CustomType.Setter
        public Builder onDurationWarningThresholdExceededs(@Nullable List<String> onDurationWarningThresholdExceededs) {

            this.onDurationWarningThresholdExceededs = onDurationWarningThresholdExceededs;
            return this;
        }
        public Builder onDurationWarningThresholdExceededs(String... onDurationWarningThresholdExceededs) {
            return onDurationWarningThresholdExceededs(List.of(onDurationWarningThresholdExceededs));
        }
        @CustomType.Setter
        public Builder onFailures(@Nullable List<String> onFailures) {

            this.onFailures = onFailures;
            return this;
        }
        public Builder onFailures(String... onFailures) {
            return onFailures(List.of(onFailures));
        }
        @CustomType.Setter
        public Builder onStarts(@Nullable List<String> onStarts) {

            this.onStarts = onStarts;
            return this;
        }
        public Builder onStarts(String... onStarts) {
            return onStarts(List.of(onStarts));
        }
        @CustomType.Setter
        public Builder onSuccesses(@Nullable List<String> onSuccesses) {

            this.onSuccesses = onSuccesses;
            return this;
        }
        public Builder onSuccesses(String... onSuccesses) {
            return onSuccesses(List.of(onSuccesses));
        }
        public GetJobJobSettingsSettingsTaskEmailNotifications build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskEmailNotifications();
            _resultValue.onDurationWarningThresholdExceededs = onDurationWarningThresholdExceededs;
            _resultValue.onFailures = onFailures;
            _resultValue.onStarts = onStarts;
            _resultValue.onSuccesses = onSuccesses;
            return _resultValue;
        }
    }
}
