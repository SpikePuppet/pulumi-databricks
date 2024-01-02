// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobScheduleArgs Empty = new JobScheduleArgs();

    /**
     * Indicate whether this schedule is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted and a schedule is provided, the server will default to using `UNPAUSED` as a value for `pause_status`.
     * 
     */
    @Import(name="pauseStatus")
    private @Nullable Output<String> pauseStatus;

    /**
     * @return Indicate whether this schedule is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted and a schedule is provided, the server will default to using `UNPAUSED` as a value for `pause_status`.
     * 
     */
    public Optional<Output<String>> pauseStatus() {
        return Optional.ofNullable(this.pauseStatus);
    }

    /**
     * A [Cron expression using Quartz syntax](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html) that describes the schedule for a job. This field is required.
     * 
     */
    @Import(name="quartzCronExpression", required=true)
    private Output<String> quartzCronExpression;

    /**
     * @return A [Cron expression using Quartz syntax](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html) that describes the schedule for a job. This field is required.
     * 
     */
    public Output<String> quartzCronExpression() {
        return this.quartzCronExpression;
    }

    /**
     * A Java timezone ID. The schedule for a job will be resolved with respect to this timezone. See Java TimeZone for details. This field is required.
     * 
     */
    @Import(name="timezoneId", required=true)
    private Output<String> timezoneId;

    /**
     * @return A Java timezone ID. The schedule for a job will be resolved with respect to this timezone. See Java TimeZone for details. This field is required.
     * 
     */
    public Output<String> timezoneId() {
        return this.timezoneId;
    }

    private JobScheduleArgs() {}

    private JobScheduleArgs(JobScheduleArgs $) {
        this.pauseStatus = $.pauseStatus;
        this.quartzCronExpression = $.quartzCronExpression;
        this.timezoneId = $.timezoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobScheduleArgs $;

        public Builder() {
            $ = new JobScheduleArgs();
        }

        public Builder(JobScheduleArgs defaults) {
            $ = new JobScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pauseStatus Indicate whether this schedule is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted and a schedule is provided, the server will default to using `UNPAUSED` as a value for `pause_status`.
         * 
         * @return builder
         * 
         */
        public Builder pauseStatus(@Nullable Output<String> pauseStatus) {
            $.pauseStatus = pauseStatus;
            return this;
        }

        /**
         * @param pauseStatus Indicate whether this schedule is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted and a schedule is provided, the server will default to using `UNPAUSED` as a value for `pause_status`.
         * 
         * @return builder
         * 
         */
        public Builder pauseStatus(String pauseStatus) {
            return pauseStatus(Output.of(pauseStatus));
        }

        /**
         * @param quartzCronExpression A [Cron expression using Quartz syntax](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html) that describes the schedule for a job. This field is required.
         * 
         * @return builder
         * 
         */
        public Builder quartzCronExpression(Output<String> quartzCronExpression) {
            $.quartzCronExpression = quartzCronExpression;
            return this;
        }

        /**
         * @param quartzCronExpression A [Cron expression using Quartz syntax](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html) that describes the schedule for a job. This field is required.
         * 
         * @return builder
         * 
         */
        public Builder quartzCronExpression(String quartzCronExpression) {
            return quartzCronExpression(Output.of(quartzCronExpression));
        }

        /**
         * @param timezoneId A Java timezone ID. The schedule for a job will be resolved with respect to this timezone. See Java TimeZone for details. This field is required.
         * 
         * @return builder
         * 
         */
        public Builder timezoneId(Output<String> timezoneId) {
            $.timezoneId = timezoneId;
            return this;
        }

        /**
         * @param timezoneId A Java timezone ID. The schedule for a job will be resolved with respect to this timezone. See Java TimeZone for details. This field is required.
         * 
         * @return builder
         * 
         */
        public Builder timezoneId(String timezoneId) {
            return timezoneId(Output.of(timezoneId));
        }

        public JobScheduleArgs build() {
            if ($.quartzCronExpression == null) {
                throw new MissingRequiredPropertyException("JobScheduleArgs", "quartzCronExpression");
            }
            if ($.timezoneId == null) {
                throw new MissingRequiredPropertyException("JobScheduleArgs", "timezoneId");
            }
            return $;
        }
    }

}
