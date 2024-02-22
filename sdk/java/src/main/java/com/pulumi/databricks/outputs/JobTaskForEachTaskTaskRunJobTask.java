// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskForEachTaskTaskRunJobTask {
    /**
     * @return (String) ID of the job
     * 
     */
    private Integer jobId;
    /**
     * @return (Map) Job parameters for the task
     * 
     */
    private @Nullable Map<String,Object> jobParameters;

    private JobTaskForEachTaskTaskRunJobTask() {}
    /**
     * @return (String) ID of the job
     * 
     */
    public Integer jobId() {
        return this.jobId;
    }
    /**
     * @return (Map) Job parameters for the task
     * 
     */
    public Map<String,Object> jobParameters() {
        return this.jobParameters == null ? Map.of() : this.jobParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskForEachTaskTaskRunJobTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer jobId;
        private @Nullable Map<String,Object> jobParameters;
        public Builder() {}
        public Builder(JobTaskForEachTaskTaskRunJobTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
    	      this.jobParameters = defaults.jobParameters;
        }

        @CustomType.Setter
        public Builder jobId(Integer jobId) {
            if (jobId == null) {
              throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskRunJobTask", "jobId");
            }
            this.jobId = jobId;
            return this;
        }
        @CustomType.Setter
        public Builder jobParameters(@Nullable Map<String,Object> jobParameters) {

            this.jobParameters = jobParameters;
            return this;
        }
        public JobTaskForEachTaskTaskRunJobTask build() {
            final var _resultValue = new JobTaskForEachTaskTaskRunJobTask();
            _resultValue.jobId = jobId;
            _resultValue.jobParameters = jobParameters;
            return _resultValue;
        }
    }
}
