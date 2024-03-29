// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.OnlineTableStatusContinuousUpdateStatusArgs;
import com.pulumi.databricks.inputs.OnlineTableStatusFailedStatusArgs;
import com.pulumi.databricks.inputs.OnlineTableStatusProvisioningStatusArgs;
import com.pulumi.databricks.inputs.OnlineTableStatusTriggeredUpdateStatusArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OnlineTableStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final OnlineTableStatusArgs Empty = new OnlineTableStatusArgs();

    @Import(name="continuousUpdateStatus")
    private @Nullable Output<OnlineTableStatusContinuousUpdateStatusArgs> continuousUpdateStatus;

    public Optional<Output<OnlineTableStatusContinuousUpdateStatusArgs>> continuousUpdateStatus() {
        return Optional.ofNullable(this.continuousUpdateStatus);
    }

    /**
     * The state of the online table.
     * 
     */
    @Import(name="detailedState")
    private @Nullable Output<String> detailedState;

    /**
     * @return The state of the online table.
     * 
     */
    public Optional<Output<String>> detailedState() {
        return Optional.ofNullable(this.detailedState);
    }

    @Import(name="failedStatus")
    private @Nullable Output<OnlineTableStatusFailedStatusArgs> failedStatus;

    public Optional<Output<OnlineTableStatusFailedStatusArgs>> failedStatus() {
        return Optional.ofNullable(this.failedStatus);
    }

    /**
     * A text description of the current state of the online table.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return A text description of the current state of the online table.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    @Import(name="provisioningStatus")
    private @Nullable Output<OnlineTableStatusProvisioningStatusArgs> provisioningStatus;

    public Optional<Output<OnlineTableStatusProvisioningStatusArgs>> provisioningStatus() {
        return Optional.ofNullable(this.provisioningStatus);
    }

    @Import(name="triggeredUpdateStatus")
    private @Nullable Output<OnlineTableStatusTriggeredUpdateStatusArgs> triggeredUpdateStatus;

    public Optional<Output<OnlineTableStatusTriggeredUpdateStatusArgs>> triggeredUpdateStatus() {
        return Optional.ofNullable(this.triggeredUpdateStatus);
    }

    private OnlineTableStatusArgs() {}

    private OnlineTableStatusArgs(OnlineTableStatusArgs $) {
        this.continuousUpdateStatus = $.continuousUpdateStatus;
        this.detailedState = $.detailedState;
        this.failedStatus = $.failedStatus;
        this.message = $.message;
        this.provisioningStatus = $.provisioningStatus;
        this.triggeredUpdateStatus = $.triggeredUpdateStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OnlineTableStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OnlineTableStatusArgs $;

        public Builder() {
            $ = new OnlineTableStatusArgs();
        }

        public Builder(OnlineTableStatusArgs defaults) {
            $ = new OnlineTableStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder continuousUpdateStatus(@Nullable Output<OnlineTableStatusContinuousUpdateStatusArgs> continuousUpdateStatus) {
            $.continuousUpdateStatus = continuousUpdateStatus;
            return this;
        }

        public Builder continuousUpdateStatus(OnlineTableStatusContinuousUpdateStatusArgs continuousUpdateStatus) {
            return continuousUpdateStatus(Output.of(continuousUpdateStatus));
        }

        /**
         * @param detailedState The state of the online table.
         * 
         * @return builder
         * 
         */
        public Builder detailedState(@Nullable Output<String> detailedState) {
            $.detailedState = detailedState;
            return this;
        }

        /**
         * @param detailedState The state of the online table.
         * 
         * @return builder
         * 
         */
        public Builder detailedState(String detailedState) {
            return detailedState(Output.of(detailedState));
        }

        public Builder failedStatus(@Nullable Output<OnlineTableStatusFailedStatusArgs> failedStatus) {
            $.failedStatus = failedStatus;
            return this;
        }

        public Builder failedStatus(OnlineTableStatusFailedStatusArgs failedStatus) {
            return failedStatus(Output.of(failedStatus));
        }

        /**
         * @param message A text description of the current state of the online table.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message A text description of the current state of the online table.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        public Builder provisioningStatus(@Nullable Output<OnlineTableStatusProvisioningStatusArgs> provisioningStatus) {
            $.provisioningStatus = provisioningStatus;
            return this;
        }

        public Builder provisioningStatus(OnlineTableStatusProvisioningStatusArgs provisioningStatus) {
            return provisioningStatus(Output.of(provisioningStatus));
        }

        public Builder triggeredUpdateStatus(@Nullable Output<OnlineTableStatusTriggeredUpdateStatusArgs> triggeredUpdateStatus) {
            $.triggeredUpdateStatus = triggeredUpdateStatus;
            return this;
        }

        public Builder triggeredUpdateStatus(OnlineTableStatusTriggeredUpdateStatusArgs triggeredUpdateStatus) {
            return triggeredUpdateStatus(Output.of(triggeredUpdateStatus));
        }

        public OnlineTableStatusArgs build() {
            return $;
        }
    }

}
