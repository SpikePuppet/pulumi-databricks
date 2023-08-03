// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobWebhookNotificationsOnDurationWarningThresholdExceeded {
    /**
     * @return ID of the system notification that is notified when an event defined in `webhook_notifications` is triggered.
     * 
     * &gt; **Note** The following configuration blocks can be standalone or nested inside a `task` block
     * 
     */
    private String id;

    private JobWebhookNotificationsOnDurationWarningThresholdExceeded() {}
    /**
     * @return ID of the system notification that is notified when an event defined in `webhook_notifications` is triggered.
     * 
     * &gt; **Note** The following configuration blocks can be standalone or nested inside a `task` block
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobWebhookNotificationsOnDurationWarningThresholdExceeded defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(JobWebhookNotificationsOnDurationWarningThresholdExceeded defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public JobWebhookNotificationsOnDurationWarningThresholdExceeded build() {
            final var o = new JobWebhookNotificationsOnDurationWarningThresholdExceeded();
            o.id = id;
            return o;
        }
    }
}