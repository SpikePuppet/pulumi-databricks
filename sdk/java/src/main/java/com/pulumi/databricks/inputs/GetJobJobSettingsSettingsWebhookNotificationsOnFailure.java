// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsWebhookNotificationsOnFailure extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsWebhookNotificationsOnFailure Empty = new GetJobJobSettingsSettingsWebhookNotificationsOnFailure();

    /**
     * the id of databricks.Job if the resource was matched by name.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return the id of databricks.Job if the resource was matched by name.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetJobJobSettingsSettingsWebhookNotificationsOnFailure() {}

    private GetJobJobSettingsSettingsWebhookNotificationsOnFailure(GetJobJobSettingsSettingsWebhookNotificationsOnFailure $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsWebhookNotificationsOnFailure defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsWebhookNotificationsOnFailure $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsWebhookNotificationsOnFailure();
        }

        public Builder(GetJobJobSettingsSettingsWebhookNotificationsOnFailure defaults) {
            $ = new GetJobJobSettingsSettingsWebhookNotificationsOnFailure(Objects.requireNonNull(defaults));
        }

        /**
         * @param id the id of databricks.Job if the resource was matched by name.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetJobJobSettingsSettingsWebhookNotificationsOnFailure build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsWebhookNotificationsOnFailure", "id");
            }
            return $;
        }
    }

}
