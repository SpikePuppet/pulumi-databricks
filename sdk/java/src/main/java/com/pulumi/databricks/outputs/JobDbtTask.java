// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobDbtTask {
    /**
     * @return The name of the catalog to use inside Unity Catalog.
     * 
     */
    private @Nullable String catalog;
    /**
     * @return (Array) Series of dbt commands to execute in sequence. Every command must start with &#34;dbt&#34;.
     * 
     */
    private List<String> commands;
    /**
     * @return The relative path to the directory in the repository specified by `git_source` where dbt should look in for the `profiles.yml` file. If not specified, defaults to the repository&#39;s root directory. Equivalent to passing `--profile-dir` to a dbt command.
     * 
     */
    private @Nullable String profilesDirectory;
    /**
     * @return The path where dbt should look for `dbt_project.yml`. Equivalent to passing `--project-dir` to the dbt CLI.
     * * If `source` is `GIT`: Relative path to the directory in the repository specified in the `git_source` block. Defaults to the repository&#39;s root directory when not specified.
     * * If `source` is `WORKSPACE`: Absolute path to the folder in the workspace.
     * 
     */
    private @Nullable String projectDirectory;
    /**
     * @return The name of the schema dbt should run in. Defaults to `default`.
     * 
     */
    private @Nullable String schema;
    /**
     * @return The source of the project. Possible values are `WORKSPACE` and `GIT`.  Defaults to `GIT` if a `git_source` block is present in the job definition.
     * 
     */
    private @Nullable String source;
    /**
     * @return The ID of the SQL warehouse that dbt should execute against.
     * 
     * You also need to include a `git_source` block to configure the repository that contains the dbt project.
     * 
     */
    private @Nullable String warehouseId;

    private JobDbtTask() {}
    /**
     * @return The name of the catalog to use inside Unity Catalog.
     * 
     */
    public Optional<String> catalog() {
        return Optional.ofNullable(this.catalog);
    }
    /**
     * @return (Array) Series of dbt commands to execute in sequence. Every command must start with &#34;dbt&#34;.
     * 
     */
    public List<String> commands() {
        return this.commands;
    }
    /**
     * @return The relative path to the directory in the repository specified by `git_source` where dbt should look in for the `profiles.yml` file. If not specified, defaults to the repository&#39;s root directory. Equivalent to passing `--profile-dir` to a dbt command.
     * 
     */
    public Optional<String> profilesDirectory() {
        return Optional.ofNullable(this.profilesDirectory);
    }
    /**
     * @return The path where dbt should look for `dbt_project.yml`. Equivalent to passing `--project-dir` to the dbt CLI.
     * * If `source` is `GIT`: Relative path to the directory in the repository specified in the `git_source` block. Defaults to the repository&#39;s root directory when not specified.
     * * If `source` is `WORKSPACE`: Absolute path to the folder in the workspace.
     * 
     */
    public Optional<String> projectDirectory() {
        return Optional.ofNullable(this.projectDirectory);
    }
    /**
     * @return The name of the schema dbt should run in. Defaults to `default`.
     * 
     */
    public Optional<String> schema() {
        return Optional.ofNullable(this.schema);
    }
    /**
     * @return The source of the project. Possible values are `WORKSPACE` and `GIT`.  Defaults to `GIT` if a `git_source` block is present in the job definition.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * @return The ID of the SQL warehouse that dbt should execute against.
     * 
     * You also need to include a `git_source` block to configure the repository that contains the dbt project.
     * 
     */
    public Optional<String> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDbtTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String catalog;
        private List<String> commands;
        private @Nullable String profilesDirectory;
        private @Nullable String projectDirectory;
        private @Nullable String schema;
        private @Nullable String source;
        private @Nullable String warehouseId;
        public Builder() {}
        public Builder(JobDbtTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalog = defaults.catalog;
    	      this.commands = defaults.commands;
    	      this.profilesDirectory = defaults.profilesDirectory;
    	      this.projectDirectory = defaults.projectDirectory;
    	      this.schema = defaults.schema;
    	      this.source = defaults.source;
    	      this.warehouseId = defaults.warehouseId;
        }

        @CustomType.Setter
        public Builder catalog(@Nullable String catalog) {

            this.catalog = catalog;
            return this;
        }
        @CustomType.Setter
        public Builder commands(List<String> commands) {
            if (commands == null) {
              throw new MissingRequiredPropertyException("JobDbtTask", "commands");
            }
            this.commands = commands;
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        @CustomType.Setter
        public Builder profilesDirectory(@Nullable String profilesDirectory) {

            this.profilesDirectory = profilesDirectory;
            return this;
        }
        @CustomType.Setter
        public Builder projectDirectory(@Nullable String projectDirectory) {

            this.projectDirectory = projectDirectory;
            return this;
        }
        @CustomType.Setter
        public Builder schema(@Nullable String schema) {

            this.schema = schema;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {

            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder warehouseId(@Nullable String warehouseId) {

            this.warehouseId = warehouseId;
            return this;
        }
        public JobDbtTask build() {
            final var _resultValue = new JobDbtTask();
            _resultValue.catalog = catalog;
            _resultValue.commands = commands;
            _resultValue.profilesDirectory = profilesDirectory;
            _resultValue.projectDirectory = projectDirectory;
            _resultValue.schema = schema;
            _resultValue.source = source;
            _resultValue.warehouseId = warehouseId;
            return _resultValue;
        }
    }
}
