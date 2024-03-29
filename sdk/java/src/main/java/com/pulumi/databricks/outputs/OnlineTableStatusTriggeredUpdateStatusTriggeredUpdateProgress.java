// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgress {
    private @Nullable Double estimatedCompletionTimeSeconds;
    private @Nullable Integer latestVersionCurrentlyProcessing;
    private @Nullable Double syncProgressCompletion;
    private @Nullable Integer syncedRowCount;
    private @Nullable Integer totalRowCount;

    private OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgress() {}
    public Optional<Double> estimatedCompletionTimeSeconds() {
        return Optional.ofNullable(this.estimatedCompletionTimeSeconds);
    }
    public Optional<Integer> latestVersionCurrentlyProcessing() {
        return Optional.ofNullable(this.latestVersionCurrentlyProcessing);
    }
    public Optional<Double> syncProgressCompletion() {
        return Optional.ofNullable(this.syncProgressCompletion);
    }
    public Optional<Integer> syncedRowCount() {
        return Optional.ofNullable(this.syncedRowCount);
    }
    public Optional<Integer> totalRowCount() {
        return Optional.ofNullable(this.totalRowCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double estimatedCompletionTimeSeconds;
        private @Nullable Integer latestVersionCurrentlyProcessing;
        private @Nullable Double syncProgressCompletion;
        private @Nullable Integer syncedRowCount;
        private @Nullable Integer totalRowCount;
        public Builder() {}
        public Builder(OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.estimatedCompletionTimeSeconds = defaults.estimatedCompletionTimeSeconds;
    	      this.latestVersionCurrentlyProcessing = defaults.latestVersionCurrentlyProcessing;
    	      this.syncProgressCompletion = defaults.syncProgressCompletion;
    	      this.syncedRowCount = defaults.syncedRowCount;
    	      this.totalRowCount = defaults.totalRowCount;
        }

        @CustomType.Setter
        public Builder estimatedCompletionTimeSeconds(@Nullable Double estimatedCompletionTimeSeconds) {

            this.estimatedCompletionTimeSeconds = estimatedCompletionTimeSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder latestVersionCurrentlyProcessing(@Nullable Integer latestVersionCurrentlyProcessing) {

            this.latestVersionCurrentlyProcessing = latestVersionCurrentlyProcessing;
            return this;
        }
        @CustomType.Setter
        public Builder syncProgressCompletion(@Nullable Double syncProgressCompletion) {

            this.syncProgressCompletion = syncProgressCompletion;
            return this;
        }
        @CustomType.Setter
        public Builder syncedRowCount(@Nullable Integer syncedRowCount) {

            this.syncedRowCount = syncedRowCount;
            return this;
        }
        @CustomType.Setter
        public Builder totalRowCount(@Nullable Integer totalRowCount) {

            this.totalRowCount = totalRowCount;
            return this;
        }
        public OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgress build() {
            final var _resultValue = new OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgress();
            _resultValue.estimatedCompletionTimeSeconds = estimatedCompletionTimeSeconds;
            _resultValue.latestVersionCurrentlyProcessing = latestVersionCurrentlyProcessing;
            _resultValue.syncProgressCompletion = syncProgressCompletion;
            _resultValue.syncedRowCount = syncedRowCount;
            _resultValue.totalRowCount = totalRowCount;
            return _resultValue;
        }
    }
}
