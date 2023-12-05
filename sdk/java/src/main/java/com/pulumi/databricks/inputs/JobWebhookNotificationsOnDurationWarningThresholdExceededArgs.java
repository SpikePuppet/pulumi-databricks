// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobWebhookNotificationsOnDurationWarningThresholdExceededArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobWebhookNotificationsOnDurationWarningThresholdExceededArgs Empty = new JobWebhookNotificationsOnDurationWarningThresholdExceededArgs();

    /**
     * ID of the job
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return ID of the job
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private JobWebhookNotificationsOnDurationWarningThresholdExceededArgs() {}

    private JobWebhookNotificationsOnDurationWarningThresholdExceededArgs(JobWebhookNotificationsOnDurationWarningThresholdExceededArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobWebhookNotificationsOnDurationWarningThresholdExceededArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobWebhookNotificationsOnDurationWarningThresholdExceededArgs $;

        public Builder() {
            $ = new JobWebhookNotificationsOnDurationWarningThresholdExceededArgs();
        }

        public Builder(JobWebhookNotificationsOnDurationWarningThresholdExceededArgs defaults) {
            $ = new JobWebhookNotificationsOnDurationWarningThresholdExceededArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the job
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the job
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public JobWebhookNotificationsOnDurationWarningThresholdExceededArgs build() {
            return $;
        }
    }

}
