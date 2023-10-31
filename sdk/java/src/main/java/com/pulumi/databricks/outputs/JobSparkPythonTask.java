// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobSparkPythonTask {
    /**
     * @return (List) Command line parameters passed to the Python file.
     * 
     */
    private @Nullable List<String> parameters;
    /**
     * @return The URI of the Python file to be executed. databricks_dbfs_file, cloud file URIs (e.g. `s3:/`, `abfss:/`, `gs:/`), workspace paths and remote repository are supported. For Python files stored in the Databricks workspace, the path must be absolute and begin with `/Repos`. For files stored in a remote repository, the path must be relative. This field is required.
     * 
     */
    private String pythonFile;
    /**
     * @return Location type of the Python file, can only be `GIT`. When set to `GIT`, the Python file will be retrieved from a Git repository defined in `git_source`.
     * 
     */
    private @Nullable String source;

    private JobSparkPythonTask() {}
    /**
     * @return (List) Command line parameters passed to the Python file.
     * 
     */
    public List<String> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * @return The URI of the Python file to be executed. databricks_dbfs_file, cloud file URIs (e.g. `s3:/`, `abfss:/`, `gs:/`), workspace paths and remote repository are supported. For Python files stored in the Databricks workspace, the path must be absolute and begin with `/Repos`. For files stored in a remote repository, the path must be relative. This field is required.
     * 
     */
    public String pythonFile() {
        return this.pythonFile;
    }
    /**
     * @return Location type of the Python file, can only be `GIT`. When set to `GIT`, the Python file will be retrieved from a Git repository defined in `git_source`.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSparkPythonTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> parameters;
        private String pythonFile;
        private @Nullable String source;
        public Builder() {}
        public Builder(JobSparkPythonTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.pythonFile = defaults.pythonFile;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder parameters(@Nullable List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }
        @CustomType.Setter
        public Builder pythonFile(String pythonFile) {
            this.pythonFile = Objects.requireNonNull(pythonFile);
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        public JobSparkPythonTask build() {
            final var _resultValue = new JobSparkPythonTask();
            _resultValue.parameters = parameters;
            _resultValue.pythonFile = pythonFile;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}
