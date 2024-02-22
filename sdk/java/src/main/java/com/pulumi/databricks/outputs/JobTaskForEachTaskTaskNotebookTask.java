// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskForEachTaskTaskNotebookTask {
    /**
     * @return (Map) Base parameters to be used for each run of this job. If the run is initiated by a call to run-now with parameters specified, the two parameters maps will be merged. If the same key is specified in base_parameters and in run-now, the value from run-now will be used. If the notebook takes a parameter that is not specified in the job’s base_parameters or the run-now override parameters, the default value from the notebook will be used. Retrieve these parameters in a notebook using `dbutils.widgets.get`.
     * 
     */
    private @Nullable Map<String,Object> baseParameters;
    /**
     * @return The path of the databricks.Notebook to be run in the Databricks workspace or remote repository. For notebooks stored in the Databricks workspace, the path must be absolute and begin with a slash. For notebooks stored in a remote repository, the path must be relative. This field is required.
     * 
     */
    private String notebookPath;
    /**
     * @return Location type of the notebook, can only be `WORKSPACE` or `GIT`. When set to `WORKSPACE`, the notebook will be retrieved from the local Databricks workspace. When set to `GIT`, the notebook will be retrieved from a Git repository defined in `git_source`. If the value is empty, the task will use `GIT` if `git_source` is defined and `WORKSPACE` otherwise.
     * 
     */
    private @Nullable String source;

    private JobTaskForEachTaskTaskNotebookTask() {}
    /**
     * @return (Map) Base parameters to be used for each run of this job. If the run is initiated by a call to run-now with parameters specified, the two parameters maps will be merged. If the same key is specified in base_parameters and in run-now, the value from run-now will be used. If the notebook takes a parameter that is not specified in the job’s base_parameters or the run-now override parameters, the default value from the notebook will be used. Retrieve these parameters in a notebook using `dbutils.widgets.get`.
     * 
     */
    public Map<String,Object> baseParameters() {
        return this.baseParameters == null ? Map.of() : this.baseParameters;
    }
    /**
     * @return The path of the databricks.Notebook to be run in the Databricks workspace or remote repository. For notebooks stored in the Databricks workspace, the path must be absolute and begin with a slash. For notebooks stored in a remote repository, the path must be relative. This field is required.
     * 
     */
    public String notebookPath() {
        return this.notebookPath;
    }
    /**
     * @return Location type of the notebook, can only be `WORKSPACE` or `GIT`. When set to `WORKSPACE`, the notebook will be retrieved from the local Databricks workspace. When set to `GIT`, the notebook will be retrieved from a Git repository defined in `git_source`. If the value is empty, the task will use `GIT` if `git_source` is defined and `WORKSPACE` otherwise.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskForEachTaskTaskNotebookTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> baseParameters;
        private String notebookPath;
        private @Nullable String source;
        public Builder() {}
        public Builder(JobTaskForEachTaskTaskNotebookTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseParameters = defaults.baseParameters;
    	      this.notebookPath = defaults.notebookPath;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder baseParameters(@Nullable Map<String,Object> baseParameters) {

            this.baseParameters = baseParameters;
            return this;
        }
        @CustomType.Setter
        public Builder notebookPath(String notebookPath) {
            if (notebookPath == null) {
              throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskNotebookTask", "notebookPath");
            }
            this.notebookPath = notebookPath;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {

            this.source = source;
            return this;
        }
        public JobTaskForEachTaskTaskNotebookTask build() {
            final var _resultValue = new JobTaskForEachTaskTaskNotebookTask();
            _resultValue.baseParameters = baseParameters;
            _resultValue.notebookPath = notebookPath;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}
