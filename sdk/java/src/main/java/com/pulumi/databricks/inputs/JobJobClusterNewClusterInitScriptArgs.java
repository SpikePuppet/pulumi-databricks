// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobJobClusterNewClusterInitScriptAbfssArgs;
import com.pulumi.databricks.inputs.JobJobClusterNewClusterInitScriptDbfsArgs;
import com.pulumi.databricks.inputs.JobJobClusterNewClusterInitScriptFileArgs;
import com.pulumi.databricks.inputs.JobJobClusterNewClusterInitScriptGcsArgs;
import com.pulumi.databricks.inputs.JobJobClusterNewClusterInitScriptS3Args;
import com.pulumi.databricks.inputs.JobJobClusterNewClusterInitScriptVolumesArgs;
import com.pulumi.databricks.inputs.JobJobClusterNewClusterInitScriptWorkspaceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobJobClusterNewClusterInitScriptArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobJobClusterNewClusterInitScriptArgs Empty = new JobJobClusterNewClusterInitScriptArgs();

    @Import(name="abfss")
    private @Nullable Output<JobJobClusterNewClusterInitScriptAbfssArgs> abfss;

    public Optional<Output<JobJobClusterNewClusterInitScriptAbfssArgs>> abfss() {
        return Optional.ofNullable(this.abfss);
    }

    /**
     * @deprecated
     * For init scripts use &#39;volumes&#39;, &#39;workspace&#39; or cloud storage location instead of &#39;dbfs&#39;.
     * 
     */
    @Deprecated /* For init scripts use 'volumes', 'workspace' or cloud storage location instead of 'dbfs'. */
    @Import(name="dbfs")
    private @Nullable Output<JobJobClusterNewClusterInitScriptDbfsArgs> dbfs;

    /**
     * @deprecated
     * For init scripts use &#39;volumes&#39;, &#39;workspace&#39; or cloud storage location instead of &#39;dbfs&#39;.
     * 
     */
    @Deprecated /* For init scripts use 'volumes', 'workspace' or cloud storage location instead of 'dbfs'. */
    public Optional<Output<JobJobClusterNewClusterInitScriptDbfsArgs>> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }

    /**
     * block consisting of single string fields:
     * 
     */
    @Import(name="file")
    private @Nullable Output<JobJobClusterNewClusterInitScriptFileArgs> file;

    /**
     * @return block consisting of single string fields:
     * 
     */
    public Optional<Output<JobJobClusterNewClusterInitScriptFileArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    @Import(name="gcs")
    private @Nullable Output<JobJobClusterNewClusterInitScriptGcsArgs> gcs;

    public Optional<Output<JobJobClusterNewClusterInitScriptGcsArgs>> gcs() {
        return Optional.ofNullable(this.gcs);
    }

    @Import(name="s3")
    private @Nullable Output<JobJobClusterNewClusterInitScriptS3Args> s3;

    public Optional<Output<JobJobClusterNewClusterInitScriptS3Args>> s3() {
        return Optional.ofNullable(this.s3);
    }

    @Import(name="volumes")
    private @Nullable Output<JobJobClusterNewClusterInitScriptVolumesArgs> volumes;

    public Optional<Output<JobJobClusterNewClusterInitScriptVolumesArgs>> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    @Import(name="workspace")
    private @Nullable Output<JobJobClusterNewClusterInitScriptWorkspaceArgs> workspace;

    public Optional<Output<JobJobClusterNewClusterInitScriptWorkspaceArgs>> workspace() {
        return Optional.ofNullable(this.workspace);
    }

    private JobJobClusterNewClusterInitScriptArgs() {}

    private JobJobClusterNewClusterInitScriptArgs(JobJobClusterNewClusterInitScriptArgs $) {
        this.abfss = $.abfss;
        this.dbfs = $.dbfs;
        this.file = $.file;
        this.gcs = $.gcs;
        this.s3 = $.s3;
        this.volumes = $.volumes;
        this.workspace = $.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobJobClusterNewClusterInitScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobJobClusterNewClusterInitScriptArgs $;

        public Builder() {
            $ = new JobJobClusterNewClusterInitScriptArgs();
        }

        public Builder(JobJobClusterNewClusterInitScriptArgs defaults) {
            $ = new JobJobClusterNewClusterInitScriptArgs(Objects.requireNonNull(defaults));
        }

        public Builder abfss(@Nullable Output<JobJobClusterNewClusterInitScriptAbfssArgs> abfss) {
            $.abfss = abfss;
            return this;
        }

        public Builder abfss(JobJobClusterNewClusterInitScriptAbfssArgs abfss) {
            return abfss(Output.of(abfss));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * For init scripts use &#39;volumes&#39;, &#39;workspace&#39; or cloud storage location instead of &#39;dbfs&#39;.
         * 
         */
        @Deprecated /* For init scripts use 'volumes', 'workspace' or cloud storage location instead of 'dbfs'. */
        public Builder dbfs(@Nullable Output<JobJobClusterNewClusterInitScriptDbfsArgs> dbfs) {
            $.dbfs = dbfs;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * For init scripts use &#39;volumes&#39;, &#39;workspace&#39; or cloud storage location instead of &#39;dbfs&#39;.
         * 
         */
        @Deprecated /* For init scripts use 'volumes', 'workspace' or cloud storage location instead of 'dbfs'. */
        public Builder dbfs(JobJobClusterNewClusterInitScriptDbfsArgs dbfs) {
            return dbfs(Output.of(dbfs));
        }

        /**
         * @param file block consisting of single string fields:
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<JobJobClusterNewClusterInitScriptFileArgs> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file block consisting of single string fields:
         * 
         * @return builder
         * 
         */
        public Builder file(JobJobClusterNewClusterInitScriptFileArgs file) {
            return file(Output.of(file));
        }

        public Builder gcs(@Nullable Output<JobJobClusterNewClusterInitScriptGcsArgs> gcs) {
            $.gcs = gcs;
            return this;
        }

        public Builder gcs(JobJobClusterNewClusterInitScriptGcsArgs gcs) {
            return gcs(Output.of(gcs));
        }

        public Builder s3(@Nullable Output<JobJobClusterNewClusterInitScriptS3Args> s3) {
            $.s3 = s3;
            return this;
        }

        public Builder s3(JobJobClusterNewClusterInitScriptS3Args s3) {
            return s3(Output.of(s3));
        }

        public Builder volumes(@Nullable Output<JobJobClusterNewClusterInitScriptVolumesArgs> volumes) {
            $.volumes = volumes;
            return this;
        }

        public Builder volumes(JobJobClusterNewClusterInitScriptVolumesArgs volumes) {
            return volumes(Output.of(volumes));
        }

        public Builder workspace(@Nullable Output<JobJobClusterNewClusterInitScriptWorkspaceArgs> workspace) {
            $.workspace = workspace;
            return this;
        }

        public Builder workspace(JobJobClusterNewClusterInitScriptWorkspaceArgs workspace) {
            return workspace(Output.of(workspace));
        }

        public JobJobClusterNewClusterInitScriptArgs build() {
            return $;
        }
    }

}
