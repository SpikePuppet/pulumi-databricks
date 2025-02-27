// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobTriggerFileArrivalArgs;
import com.pulumi.databricks.inputs.JobTriggerTableArgs;
import com.pulumi.databricks.inputs.JobTriggerTableUpdateArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTriggerArgs Empty = new JobTriggerArgs();

    /**
     * configuration block to define a trigger for [File Arrival events](https://learn.microsoft.com/en-us/azure/databricks/workflows/jobs/file-arrival-triggers) consisting of following attributes:
     * 
     */
    @Import(name="fileArrival")
    private @Nullable Output<JobTriggerFileArrivalArgs> fileArrival;

    /**
     * @return configuration block to define a trigger for [File Arrival events](https://learn.microsoft.com/en-us/azure/databricks/workflows/jobs/file-arrival-triggers) consisting of following attributes:
     * 
     */
    public Optional<Output<JobTriggerFileArrivalArgs>> fileArrival() {
        return Optional.ofNullable(this.fileArrival);
    }

    /**
     * Indicate whether this trigger is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted in the block, the server will default to using `UNPAUSED` as a value for `pause_status`.
     * 
     */
    @Import(name="pauseStatus")
    private @Nullable Output<String> pauseStatus;

    /**
     * @return Indicate whether this trigger is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted in the block, the server will default to using `UNPAUSED` as a value for `pause_status`.
     * 
     */
    public Optional<Output<String>> pauseStatus() {
        return Optional.ofNullable(this.pauseStatus);
    }

    @Import(name="table")
    private @Nullable Output<JobTriggerTableArgs> table;

    public Optional<Output<JobTriggerTableArgs>> table() {
        return Optional.ofNullable(this.table);
    }

    @Import(name="tableUpdate")
    private @Nullable Output<JobTriggerTableUpdateArgs> tableUpdate;

    public Optional<Output<JobTriggerTableUpdateArgs>> tableUpdate() {
        return Optional.ofNullable(this.tableUpdate);
    }

    private JobTriggerArgs() {}

    private JobTriggerArgs(JobTriggerArgs $) {
        this.fileArrival = $.fileArrival;
        this.pauseStatus = $.pauseStatus;
        this.table = $.table;
        this.tableUpdate = $.tableUpdate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTriggerArgs $;

        public Builder() {
            $ = new JobTriggerArgs();
        }

        public Builder(JobTriggerArgs defaults) {
            $ = new JobTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileArrival configuration block to define a trigger for [File Arrival events](https://learn.microsoft.com/en-us/azure/databricks/workflows/jobs/file-arrival-triggers) consisting of following attributes:
         * 
         * @return builder
         * 
         */
        public Builder fileArrival(@Nullable Output<JobTriggerFileArrivalArgs> fileArrival) {
            $.fileArrival = fileArrival;
            return this;
        }

        /**
         * @param fileArrival configuration block to define a trigger for [File Arrival events](https://learn.microsoft.com/en-us/azure/databricks/workflows/jobs/file-arrival-triggers) consisting of following attributes:
         * 
         * @return builder
         * 
         */
        public Builder fileArrival(JobTriggerFileArrivalArgs fileArrival) {
            return fileArrival(Output.of(fileArrival));
        }

        /**
         * @param pauseStatus Indicate whether this trigger is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted in the block, the server will default to using `UNPAUSED` as a value for `pause_status`.
         * 
         * @return builder
         * 
         */
        public Builder pauseStatus(@Nullable Output<String> pauseStatus) {
            $.pauseStatus = pauseStatus;
            return this;
        }

        /**
         * @param pauseStatus Indicate whether this trigger is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted in the block, the server will default to using `UNPAUSED` as a value for `pause_status`.
         * 
         * @return builder
         * 
         */
        public Builder pauseStatus(String pauseStatus) {
            return pauseStatus(Output.of(pauseStatus));
        }

        public Builder table(@Nullable Output<JobTriggerTableArgs> table) {
            $.table = table;
            return this;
        }

        public Builder table(JobTriggerTableArgs table) {
            return table(Output.of(table));
        }

        public Builder tableUpdate(@Nullable Output<JobTriggerTableUpdateArgs> tableUpdate) {
            $.tableUpdate = tableUpdate;
            return this;
        }

        public Builder tableUpdate(JobTriggerTableUpdateArgs tableUpdate) {
            return tableUpdate(Output.of(tableUpdate));
        }

        public JobTriggerArgs build() {
            return $;
        }
    }

}
