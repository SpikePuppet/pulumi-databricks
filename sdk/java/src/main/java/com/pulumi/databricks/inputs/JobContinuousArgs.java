// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobContinuousArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobContinuousArgs Empty = new JobContinuousArgs();

    /**
     * Indicate whether this continuous job is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted in the block, the server will default to using `UNPAUSED` as a value for `pause_status`.
     * 
     */
    @Import(name="pauseStatus")
    private @Nullable Output<String> pauseStatus;

    /**
     * @return Indicate whether this continuous job is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted in the block, the server will default to using `UNPAUSED` as a value for `pause_status`.
     * 
     */
    public Optional<Output<String>> pauseStatus() {
        return Optional.ofNullable(this.pauseStatus);
    }

    private JobContinuousArgs() {}

    private JobContinuousArgs(JobContinuousArgs $) {
        this.pauseStatus = $.pauseStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobContinuousArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobContinuousArgs $;

        public Builder() {
            $ = new JobContinuousArgs();
        }

        public Builder(JobContinuousArgs defaults) {
            $ = new JobContinuousArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pauseStatus Indicate whether this continuous job is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted in the block, the server will default to using `UNPAUSED` as a value for `pause_status`.
         * 
         * @return builder
         * 
         */
        public Builder pauseStatus(@Nullable Output<String> pauseStatus) {
            $.pauseStatus = pauseStatus;
            return this;
        }

        /**
         * @param pauseStatus Indicate whether this continuous job is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted in the block, the server will default to using `UNPAUSED` as a value for `pause_status`.
         * 
         * @return builder
         * 
         */
        public Builder pauseStatus(String pauseStatus) {
            return pauseStatus(Output.of(pauseStatus));
        }

        public JobContinuousArgs build() {
            return $;
        }
    }

}
