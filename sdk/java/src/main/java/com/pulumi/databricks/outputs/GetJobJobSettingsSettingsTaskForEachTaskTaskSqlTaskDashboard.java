// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardSubscription;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboard {
    private @Nullable String customSubject;
    private String dashboardId;
    private @Nullable Boolean pauseSubscriptions;
    private @Nullable List<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardSubscription> subscriptions;

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboard() {}
    public Optional<String> customSubject() {
        return Optional.ofNullable(this.customSubject);
    }
    public String dashboardId() {
        return this.dashboardId;
    }
    public Optional<Boolean> pauseSubscriptions() {
        return Optional.ofNullable(this.pauseSubscriptions);
    }
    public List<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardSubscription> subscriptions() {
        return this.subscriptions == null ? List.of() : this.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboard defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String customSubject;
        private String dashboardId;
        private @Nullable Boolean pauseSubscriptions;
        private @Nullable List<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardSubscription> subscriptions;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboard defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSubject = defaults.customSubject;
    	      this.dashboardId = defaults.dashboardId;
    	      this.pauseSubscriptions = defaults.pauseSubscriptions;
    	      this.subscriptions = defaults.subscriptions;
        }

        @CustomType.Setter
        public Builder customSubject(@Nullable String customSubject) {

            this.customSubject = customSubject;
            return this;
        }
        @CustomType.Setter
        public Builder dashboardId(String dashboardId) {
            if (dashboardId == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboard", "dashboardId");
            }
            this.dashboardId = dashboardId;
            return this;
        }
        @CustomType.Setter
        public Builder pauseSubscriptions(@Nullable Boolean pauseSubscriptions) {

            this.pauseSubscriptions = pauseSubscriptions;
            return this;
        }
        @CustomType.Setter
        public Builder subscriptions(@Nullable List<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardSubscription> subscriptions) {

            this.subscriptions = subscriptions;
            return this;
        }
        public Builder subscriptions(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardSubscription... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }
        public GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboard build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboard();
            _resultValue.customSubject = customSubject;
            _resultValue.dashboardId = dashboardId;
            _resultValue.pauseSubscriptions = pauseSubscriptions;
            _resultValue.subscriptions = subscriptions;
            return _resultValue;
        }
    }
}
