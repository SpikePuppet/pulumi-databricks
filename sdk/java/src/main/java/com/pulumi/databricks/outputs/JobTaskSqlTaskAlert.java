// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskSqlTaskAlertSubscription;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskSqlTaskAlert {
    /**
     * @return (String) identifier of the Databricks SQL Alert.
     * 
     */
    private String alertId;
    /**
     * @return flag that specifies if subscriptions are paused or not.
     * 
     */
    private @Nullable Boolean pauseSubscriptions;
    /**
     * @return a list of subscription blocks consisting out of one of the required fields: `user_name` for user emails or `destination_id` - for Alert destination&#39;s identifier.
     * 
     */
    private List<JobTaskSqlTaskAlertSubscription> subscriptions;

    private JobTaskSqlTaskAlert() {}
    /**
     * @return (String) identifier of the Databricks SQL Alert.
     * 
     */
    public String alertId() {
        return this.alertId;
    }
    /**
     * @return flag that specifies if subscriptions are paused or not.
     * 
     */
    public Optional<Boolean> pauseSubscriptions() {
        return Optional.ofNullable(this.pauseSubscriptions);
    }
    /**
     * @return a list of subscription blocks consisting out of one of the required fields: `user_name` for user emails or `destination_id` - for Alert destination&#39;s identifier.
     * 
     */
    public List<JobTaskSqlTaskAlertSubscription> subscriptions() {
        return this.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskSqlTaskAlert defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alertId;
        private @Nullable Boolean pauseSubscriptions;
        private List<JobTaskSqlTaskAlertSubscription> subscriptions;
        public Builder() {}
        public Builder(JobTaskSqlTaskAlert defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertId = defaults.alertId;
    	      this.pauseSubscriptions = defaults.pauseSubscriptions;
    	      this.subscriptions = defaults.subscriptions;
        }

        @CustomType.Setter
        public Builder alertId(String alertId) {
            if (alertId == null) {
              throw new MissingRequiredPropertyException("JobTaskSqlTaskAlert", "alertId");
            }
            this.alertId = alertId;
            return this;
        }
        @CustomType.Setter
        public Builder pauseSubscriptions(@Nullable Boolean pauseSubscriptions) {

            this.pauseSubscriptions = pauseSubscriptions;
            return this;
        }
        @CustomType.Setter
        public Builder subscriptions(List<JobTaskSqlTaskAlertSubscription> subscriptions) {
            if (subscriptions == null) {
              throw new MissingRequiredPropertyException("JobTaskSqlTaskAlert", "subscriptions");
            }
            this.subscriptions = subscriptions;
            return this;
        }
        public Builder subscriptions(JobTaskSqlTaskAlertSubscription... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }
        public JobTaskSqlTaskAlert build() {
            final var _resultValue = new JobTaskSqlTaskAlert();
            _resultValue.alertId = alertId;
            _resultValue.pauseSubscriptions = pauseSubscriptions;
            _resultValue.subscriptions = subscriptions;
            return _resultValue;
        }
    }
}
