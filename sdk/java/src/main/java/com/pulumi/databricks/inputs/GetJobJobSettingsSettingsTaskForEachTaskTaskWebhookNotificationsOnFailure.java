// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailure extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailure Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailure();

    /**
     * the id of databricks.Job if the resource was matched by name.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return the id of databricks.Job if the resource was matched by name.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailure() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailure(GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailure $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailure defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailure $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailure();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailure defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailure(Objects.requireNonNull(defaults));
        }

        /**
         * @param id the id of databricks.Job if the resource was matched by name.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailure build() {
            return $;
        }
    }

}
