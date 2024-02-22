// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscriptionArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertArgs Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertArgs();

    @Import(name="alertId", required=true)
    private Output<String> alertId;

    public Output<String> alertId() {
        return this.alertId;
    }

    @Import(name="pauseSubscriptions")
    private @Nullable Output<Boolean> pauseSubscriptions;

    public Optional<Output<Boolean>> pauseSubscriptions() {
        return Optional.ofNullable(this.pauseSubscriptions);
    }

    @Import(name="subscriptions", required=true)
    private Output<List<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscriptionArgs>> subscriptions;

    public Output<List<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscriptionArgs>> subscriptions() {
        return this.subscriptions;
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertArgs() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertArgs(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertArgs $) {
        this.alertId = $.alertId;
        this.pauseSubscriptions = $.pauseSubscriptions;
        this.subscriptions = $.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertArgs(Objects.requireNonNull(defaults));
        }

        public Builder alertId(Output<String> alertId) {
            $.alertId = alertId;
            return this;
        }

        public Builder alertId(String alertId) {
            return alertId(Output.of(alertId));
        }

        public Builder pauseSubscriptions(@Nullable Output<Boolean> pauseSubscriptions) {
            $.pauseSubscriptions = pauseSubscriptions;
            return this;
        }

        public Builder pauseSubscriptions(Boolean pauseSubscriptions) {
            return pauseSubscriptions(Output.of(pauseSubscriptions));
        }

        public Builder subscriptions(Output<List<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscriptionArgs>> subscriptions) {
            $.subscriptions = subscriptions;
            return this;
        }

        public Builder subscriptions(List<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscriptionArgs> subscriptions) {
            return subscriptions(Output.of(subscriptions));
        }

        public Builder subscriptions(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscriptionArgs... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertArgs build() {
            if ($.alertId == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertArgs", "alertId");
            }
            if ($.subscriptions == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertArgs", "subscriptions");
            }
            return $;
        }
    }

}
