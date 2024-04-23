// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class JobTaskForEachTaskTaskWebhookNotificationsOnStartArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskForEachTaskTaskWebhookNotificationsOnStartArgs Empty = new JobTaskForEachTaskTaskWebhookNotificationsOnStartArgs();

    /**
     * ID of the job
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return ID of the job
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private JobTaskForEachTaskTaskWebhookNotificationsOnStartArgs() {}

    private JobTaskForEachTaskTaskWebhookNotificationsOnStartArgs(JobTaskForEachTaskTaskWebhookNotificationsOnStartArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskForEachTaskTaskWebhookNotificationsOnStartArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskForEachTaskTaskWebhookNotificationsOnStartArgs $;

        public Builder() {
            $ = new JobTaskForEachTaskTaskWebhookNotificationsOnStartArgs();
        }

        public Builder(JobTaskForEachTaskTaskWebhookNotificationsOnStartArgs defaults) {
            $ = new JobTaskForEachTaskTaskWebhookNotificationsOnStartArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the job
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
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

        public JobTaskForEachTaskTaskWebhookNotificationsOnStartArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskWebhookNotificationsOnStartArgs", "id");
            }
            return $;
        }
    }

}
