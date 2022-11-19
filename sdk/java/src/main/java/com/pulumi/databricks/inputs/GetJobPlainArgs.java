// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettings;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobPlainArgs Empty = new GetJobPlainArgs();

    /**
     * the id of databricks.Job if the resource was matched by name.
     * 
     */
    @Import(name="jobId")
    private @Nullable String jobId;

    /**
     * @return the id of databricks.Job if the resource was matched by name.
     * 
     */
    public Optional<String> jobId() {
        return Optional.ofNullable(this.jobId);
    }

    /**
     * the job name of databricks.Job if the resource was matched by id.
     * 
     */
    @Import(name="jobName")
    private @Nullable String jobName;

    /**
     * @return the job name of databricks.Job if the resource was matched by id.
     * 
     */
    public Optional<String> jobName() {
        return Optional.ofNullable(this.jobName);
    }

    /**
     * the same fields as in databricks_job.
     * 
     */
    @Import(name="jobSettings")
    private @Nullable GetJobJobSettings jobSettings;

    /**
     * @return the same fields as in databricks_job.
     * 
     */
    public Optional<GetJobJobSettings> jobSettings() {
        return Optional.ofNullable(this.jobSettings);
    }

    private GetJobPlainArgs() {}

    private GetJobPlainArgs(GetJobPlainArgs $) {
        this.jobId = $.jobId;
        this.jobName = $.jobName;
        this.jobSettings = $.jobSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobPlainArgs $;

        public Builder() {
            $ = new GetJobPlainArgs();
        }

        public Builder(GetJobPlainArgs defaults) {
            $ = new GetJobPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jobId the id of databricks.Job if the resource was matched by name.
         * 
         * @return builder
         * 
         */
        public Builder jobId(@Nullable String jobId) {
            $.jobId = jobId;
            return this;
        }

        /**
         * @param jobName the job name of databricks.Job if the resource was matched by id.
         * 
         * @return builder
         * 
         */
        public Builder jobName(@Nullable String jobName) {
            $.jobName = jobName;
            return this;
        }

        /**
         * @param jobSettings the same fields as in databricks_job.
         * 
         * @return builder
         * 
         */
        public Builder jobSettings(@Nullable GetJobJobSettings jobSettings) {
            $.jobSettings = jobSettings;
            return this;
        }

        public GetJobPlainArgs build() {
            return $;
        }
    }

}