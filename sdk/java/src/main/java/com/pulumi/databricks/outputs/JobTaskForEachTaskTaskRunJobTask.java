// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskRunJobTaskPipelineParams;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskForEachTaskTaskRunJobTask {
    private @Nullable List<String> dbtCommands;
    private @Nullable List<String> jarParams;
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
    private @Nullable Map<String,Object> notebookParams;
    private @Nullable JobTaskForEachTaskTaskRunJobTaskPipelineParams pipelineParams;
    private @Nullable Map<String,Object> pythonNamedParams;
    private @Nullable List<String> pythonParams;
    private @Nullable List<String> sparkSubmitParams;
    private @Nullable Map<String,Object> sqlParams;

    private JobTaskForEachTaskTaskRunJobTask() {}
    public List<String> dbtCommands() {
        return this.dbtCommands == null ? List.of() : this.dbtCommands;
    }
    public List<String> jarParams() {
        return this.jarParams == null ? List.of() : this.jarParams;
    }
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
    public Map<String,Object> notebookParams() {
        return this.notebookParams == null ? Map.of() : this.notebookParams;
    }
    public Optional<JobTaskForEachTaskTaskRunJobTaskPipelineParams> pipelineParams() {
        return Optional.ofNullable(this.pipelineParams);
    }
    public Map<String,Object> pythonNamedParams() {
        return this.pythonNamedParams == null ? Map.of() : this.pythonNamedParams;
    }
    public List<String> pythonParams() {
        return this.pythonParams == null ? List.of() : this.pythonParams;
    }
    public List<String> sparkSubmitParams() {
        return this.sparkSubmitParams == null ? List.of() : this.sparkSubmitParams;
    }
    public Map<String,Object> sqlParams() {
        return this.sqlParams == null ? Map.of() : this.sqlParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskForEachTaskTaskRunJobTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> dbtCommands;
        private @Nullable List<String> jarParams;
        private Integer jobId;
        private @Nullable Map<String,Object> jobParameters;
        private @Nullable Map<String,Object> notebookParams;
        private @Nullable JobTaskForEachTaskTaskRunJobTaskPipelineParams pipelineParams;
        private @Nullable Map<String,Object> pythonNamedParams;
        private @Nullable List<String> pythonParams;
        private @Nullable List<String> sparkSubmitParams;
        private @Nullable Map<String,Object> sqlParams;
        public Builder() {}
        public Builder(JobTaskForEachTaskTaskRunJobTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbtCommands = defaults.dbtCommands;
    	      this.jarParams = defaults.jarParams;
    	      this.jobId = defaults.jobId;
    	      this.jobParameters = defaults.jobParameters;
    	      this.notebookParams = defaults.notebookParams;
    	      this.pipelineParams = defaults.pipelineParams;
    	      this.pythonNamedParams = defaults.pythonNamedParams;
    	      this.pythonParams = defaults.pythonParams;
    	      this.sparkSubmitParams = defaults.sparkSubmitParams;
    	      this.sqlParams = defaults.sqlParams;
        }

        @CustomType.Setter
        public Builder dbtCommands(@Nullable List<String> dbtCommands) {

            this.dbtCommands = dbtCommands;
            return this;
        }
        public Builder dbtCommands(String... dbtCommands) {
            return dbtCommands(List.of(dbtCommands));
        }
        @CustomType.Setter
        public Builder jarParams(@Nullable List<String> jarParams) {

            this.jarParams = jarParams;
            return this;
        }
        public Builder jarParams(String... jarParams) {
            return jarParams(List.of(jarParams));
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
        @CustomType.Setter
        public Builder notebookParams(@Nullable Map<String,Object> notebookParams) {

            this.notebookParams = notebookParams;
            return this;
        }
        @CustomType.Setter
        public Builder pipelineParams(@Nullable JobTaskForEachTaskTaskRunJobTaskPipelineParams pipelineParams) {

            this.pipelineParams = pipelineParams;
            return this;
        }
        @CustomType.Setter
        public Builder pythonNamedParams(@Nullable Map<String,Object> pythonNamedParams) {

            this.pythonNamedParams = pythonNamedParams;
            return this;
        }
        @CustomType.Setter
        public Builder pythonParams(@Nullable List<String> pythonParams) {

            this.pythonParams = pythonParams;
            return this;
        }
        public Builder pythonParams(String... pythonParams) {
            return pythonParams(List.of(pythonParams));
        }
        @CustomType.Setter
        public Builder sparkSubmitParams(@Nullable List<String> sparkSubmitParams) {

            this.sparkSubmitParams = sparkSubmitParams;
            return this;
        }
        public Builder sparkSubmitParams(String... sparkSubmitParams) {
            return sparkSubmitParams(List.of(sparkSubmitParams));
        }
        @CustomType.Setter
        public Builder sqlParams(@Nullable Map<String,Object> sqlParams) {

            this.sqlParams = sqlParams;
            return this;
        }
        public JobTaskForEachTaskTaskRunJobTask build() {
            final var _resultValue = new JobTaskForEachTaskTaskRunJobTask();
            _resultValue.dbtCommands = dbtCommands;
            _resultValue.jarParams = jarParams;
            _resultValue.jobId = jobId;
            _resultValue.jobParameters = jobParameters;
            _resultValue.notebookParams = notebookParams;
            _resultValue.pipelineParams = pipelineParams;
            _resultValue.pythonNamedParams = pythonNamedParams;
            _resultValue.pythonParams = pythonParams;
            _resultValue.sparkSubmitParams = sparkSubmitParams;
            _resultValue.sqlParams = sqlParams;
            return _resultValue;
        }
    }
}
