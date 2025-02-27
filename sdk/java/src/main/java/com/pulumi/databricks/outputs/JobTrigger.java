// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTriggerFileArrival;
import com.pulumi.databricks.outputs.JobTriggerTable;
import com.pulumi.databricks.outputs.JobTriggerTableUpdate;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTrigger {
    /**
     * @return configuration block to define a trigger for [File Arrival events](https://learn.microsoft.com/en-us/azure/databricks/workflows/jobs/file-arrival-triggers) consisting of following attributes:
     * 
     */
    private @Nullable JobTriggerFileArrival fileArrival;
    /**
     * @return Indicate whether this trigger is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted in the block, the server will default to using `UNPAUSED` as a value for `pause_status`.
     * 
     */
    private @Nullable String pauseStatus;
    private @Nullable JobTriggerTable table;
    private @Nullable JobTriggerTableUpdate tableUpdate;

    private JobTrigger() {}
    /**
     * @return configuration block to define a trigger for [File Arrival events](https://learn.microsoft.com/en-us/azure/databricks/workflows/jobs/file-arrival-triggers) consisting of following attributes:
     * 
     */
    public Optional<JobTriggerFileArrival> fileArrival() {
        return Optional.ofNullable(this.fileArrival);
    }
    /**
     * @return Indicate whether this trigger is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted in the block, the server will default to using `UNPAUSED` as a value for `pause_status`.
     * 
     */
    public Optional<String> pauseStatus() {
        return Optional.ofNullable(this.pauseStatus);
    }
    public Optional<JobTriggerTable> table() {
        return Optional.ofNullable(this.table);
    }
    public Optional<JobTriggerTableUpdate> tableUpdate() {
        return Optional.ofNullable(this.tableUpdate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTrigger defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JobTriggerFileArrival fileArrival;
        private @Nullable String pauseStatus;
        private @Nullable JobTriggerTable table;
        private @Nullable JobTriggerTableUpdate tableUpdate;
        public Builder() {}
        public Builder(JobTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileArrival = defaults.fileArrival;
    	      this.pauseStatus = defaults.pauseStatus;
    	      this.table = defaults.table;
    	      this.tableUpdate = defaults.tableUpdate;
        }

        @CustomType.Setter
        public Builder fileArrival(@Nullable JobTriggerFileArrival fileArrival) {

            this.fileArrival = fileArrival;
            return this;
        }
        @CustomType.Setter
        public Builder pauseStatus(@Nullable String pauseStatus) {

            this.pauseStatus = pauseStatus;
            return this;
        }
        @CustomType.Setter
        public Builder table(@Nullable JobTriggerTable table) {

            this.table = table;
            return this;
        }
        @CustomType.Setter
        public Builder tableUpdate(@Nullable JobTriggerTableUpdate tableUpdate) {

            this.tableUpdate = tableUpdate;
            return this;
        }
        public JobTrigger build() {
            final var _resultValue = new JobTrigger();
            _resultValue.fileArrival = fileArrival;
            _resultValue.pauseStatus = pauseStatus;
            _resultValue.table = table;
            _resultValue.tableUpdate = tableUpdate;
            return _resultValue;
        }
    }
}
