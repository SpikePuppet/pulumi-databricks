// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardSubscription {
    private @Nullable String destinationId;
    private @Nullable String userName;

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardSubscription() {}
    public Optional<String> destinationId() {
        return Optional.ofNullable(this.destinationId);
    }
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardSubscription defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String destinationId;
        private @Nullable String userName;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardSubscription defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationId = defaults.destinationId;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder destinationId(@Nullable String destinationId) {

            this.destinationId = destinationId;
            return this;
        }
        @CustomType.Setter
        public Builder userName(@Nullable String userName) {

            this.userName = userName;
            return this;
        }
        public GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardSubscription build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardSubscription();
            _resultValue.destinationId = destinationId;
            _resultValue.userName = userName;
            return _resultValue;
        }
    }
}
