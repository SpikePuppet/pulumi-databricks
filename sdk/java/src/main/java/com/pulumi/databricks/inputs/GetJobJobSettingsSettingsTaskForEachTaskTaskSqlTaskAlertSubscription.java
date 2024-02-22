// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription();

    @Import(name="destinationId")
    private @Nullable String destinationId;

    public Optional<String> destinationId() {
        return Optional.ofNullable(this.destinationId);
    }

    @Import(name="userName")
    private @Nullable String userName;

    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription $) {
        this.destinationId = $.destinationId;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription(Objects.requireNonNull(defaults));
        }

        public Builder destinationId(@Nullable String destinationId) {
            $.destinationId = destinationId;
            return this;
        }

        public Builder userName(@Nullable String userName) {
            $.userName = userName;
            return this;
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription build() {
            return $;
        }
    }

}
