// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobTaskNewClusterInitScriptAbfssArgs;
import com.pulumi.databricks.inputs.JobTaskNewClusterInitScriptDbfsArgs;
import com.pulumi.databricks.inputs.JobTaskNewClusterInitScriptFileArgs;
import com.pulumi.databricks.inputs.JobTaskNewClusterInitScriptGcsArgs;
import com.pulumi.databricks.inputs.JobTaskNewClusterInitScriptS3Args;
import com.pulumi.databricks.inputs.JobTaskNewClusterInitScriptWorkspaceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskNewClusterInitScriptArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskNewClusterInitScriptArgs Empty = new JobTaskNewClusterInitScriptArgs();

    @Import(name="abfss")
    private @Nullable Output<JobTaskNewClusterInitScriptAbfssArgs> abfss;

    public Optional<Output<JobTaskNewClusterInitScriptAbfssArgs>> abfss() {
        return Optional.ofNullable(this.abfss);
    }

    @Import(name="dbfs")
    private @Nullable Output<JobTaskNewClusterInitScriptDbfsArgs> dbfs;

    public Optional<Output<JobTaskNewClusterInitScriptDbfsArgs>> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }

    /**
     * block consisting of single string field: `path` - a relative path to the file (inside the Git repository) with SQL commands to execute.  *Requires `git_source` configuration block*.
     * 
     */
    @Import(name="file")
    private @Nullable Output<JobTaskNewClusterInitScriptFileArgs> file;

    /**
     * @return block consisting of single string field: `path` - a relative path to the file (inside the Git repository) with SQL commands to execute.  *Requires `git_source` configuration block*.
     * 
     */
    public Optional<Output<JobTaskNewClusterInitScriptFileArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    @Import(name="gcs")
    private @Nullable Output<JobTaskNewClusterInitScriptGcsArgs> gcs;

    public Optional<Output<JobTaskNewClusterInitScriptGcsArgs>> gcs() {
        return Optional.ofNullable(this.gcs);
    }

    @Import(name="s3")
    private @Nullable Output<JobTaskNewClusterInitScriptS3Args> s3;

    public Optional<Output<JobTaskNewClusterInitScriptS3Args>> s3() {
        return Optional.ofNullable(this.s3);
    }

    @Import(name="workspace")
    private @Nullable Output<JobTaskNewClusterInitScriptWorkspaceArgs> workspace;

    public Optional<Output<JobTaskNewClusterInitScriptWorkspaceArgs>> workspace() {
        return Optional.ofNullable(this.workspace);
    }

    private JobTaskNewClusterInitScriptArgs() {}

    private JobTaskNewClusterInitScriptArgs(JobTaskNewClusterInitScriptArgs $) {
        this.abfss = $.abfss;
        this.dbfs = $.dbfs;
        this.file = $.file;
        this.gcs = $.gcs;
        this.s3 = $.s3;
        this.workspace = $.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskNewClusterInitScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskNewClusterInitScriptArgs $;

        public Builder() {
            $ = new JobTaskNewClusterInitScriptArgs();
        }

        public Builder(JobTaskNewClusterInitScriptArgs defaults) {
            $ = new JobTaskNewClusterInitScriptArgs(Objects.requireNonNull(defaults));
        }

        public Builder abfss(@Nullable Output<JobTaskNewClusterInitScriptAbfssArgs> abfss) {
            $.abfss = abfss;
            return this;
        }

        public Builder abfss(JobTaskNewClusterInitScriptAbfssArgs abfss) {
            return abfss(Output.of(abfss));
        }

        public Builder dbfs(@Nullable Output<JobTaskNewClusterInitScriptDbfsArgs> dbfs) {
            $.dbfs = dbfs;
            return this;
        }

        public Builder dbfs(JobTaskNewClusterInitScriptDbfsArgs dbfs) {
            return dbfs(Output.of(dbfs));
        }

        /**
         * @param file block consisting of single string field: `path` - a relative path to the file (inside the Git repository) with SQL commands to execute.  *Requires `git_source` configuration block*.
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<JobTaskNewClusterInitScriptFileArgs> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file block consisting of single string field: `path` - a relative path to the file (inside the Git repository) with SQL commands to execute.  *Requires `git_source` configuration block*.
         * 
         * @return builder
         * 
         */
        public Builder file(JobTaskNewClusterInitScriptFileArgs file) {
            return file(Output.of(file));
        }

        public Builder gcs(@Nullable Output<JobTaskNewClusterInitScriptGcsArgs> gcs) {
            $.gcs = gcs;
            return this;
        }

        public Builder gcs(JobTaskNewClusterInitScriptGcsArgs gcs) {
            return gcs(Output.of(gcs));
        }

        public Builder s3(@Nullable Output<JobTaskNewClusterInitScriptS3Args> s3) {
            $.s3 = s3;
            return this;
        }

        public Builder s3(JobTaskNewClusterInitScriptS3Args s3) {
            return s3(Output.of(s3));
        }

        public Builder workspace(@Nullable Output<JobTaskNewClusterInitScriptWorkspaceArgs> workspace) {
            $.workspace = workspace;
            return this;
        }

        public Builder workspace(JobTaskNewClusterInitScriptWorkspaceArgs workspace) {
            return workspace(Output.of(workspace));
        }

        public JobTaskNewClusterInitScriptArgs build() {
            return $;
        }
    }

}
