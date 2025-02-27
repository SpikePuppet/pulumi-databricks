// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskNewClusterInitScriptAbfss;
import com.pulumi.databricks.outputs.JobTaskNewClusterInitScriptDbfs;
import com.pulumi.databricks.outputs.JobTaskNewClusterInitScriptFile;
import com.pulumi.databricks.outputs.JobTaskNewClusterInitScriptGcs;
import com.pulumi.databricks.outputs.JobTaskNewClusterInitScriptS3;
import com.pulumi.databricks.outputs.JobTaskNewClusterInitScriptVolumes;
import com.pulumi.databricks.outputs.JobTaskNewClusterInitScriptWorkspace;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskNewClusterInitScript {
    private @Nullable JobTaskNewClusterInitScriptAbfss abfss;
    /**
     * @deprecated
     * For init scripts use &#39;volumes&#39;, &#39;workspace&#39; or cloud storage location instead of &#39;dbfs&#39;.
     * 
     */
    @Deprecated /* For init scripts use 'volumes', 'workspace' or cloud storage location instead of 'dbfs'. */
    private @Nullable JobTaskNewClusterInitScriptDbfs dbfs;
    private @Nullable JobTaskNewClusterInitScriptFile file;
    private @Nullable JobTaskNewClusterInitScriptGcs gcs;
    private @Nullable JobTaskNewClusterInitScriptS3 s3;
    private @Nullable JobTaskNewClusterInitScriptVolumes volumes;
    private @Nullable JobTaskNewClusterInitScriptWorkspace workspace;

    private JobTaskNewClusterInitScript() {}
    public Optional<JobTaskNewClusterInitScriptAbfss> abfss() {
        return Optional.ofNullable(this.abfss);
    }
    /**
     * @deprecated
     * For init scripts use &#39;volumes&#39;, &#39;workspace&#39; or cloud storage location instead of &#39;dbfs&#39;.
     * 
     */
    @Deprecated /* For init scripts use 'volumes', 'workspace' or cloud storage location instead of 'dbfs'. */
    public Optional<JobTaskNewClusterInitScriptDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<JobTaskNewClusterInitScriptFile> file() {
        return Optional.ofNullable(this.file);
    }
    public Optional<JobTaskNewClusterInitScriptGcs> gcs() {
        return Optional.ofNullable(this.gcs);
    }
    public Optional<JobTaskNewClusterInitScriptS3> s3() {
        return Optional.ofNullable(this.s3);
    }
    public Optional<JobTaskNewClusterInitScriptVolumes> volumes() {
        return Optional.ofNullable(this.volumes);
    }
    public Optional<JobTaskNewClusterInitScriptWorkspace> workspace() {
        return Optional.ofNullable(this.workspace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskNewClusterInitScript defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JobTaskNewClusterInitScriptAbfss abfss;
        private @Nullable JobTaskNewClusterInitScriptDbfs dbfs;
        private @Nullable JobTaskNewClusterInitScriptFile file;
        private @Nullable JobTaskNewClusterInitScriptGcs gcs;
        private @Nullable JobTaskNewClusterInitScriptS3 s3;
        private @Nullable JobTaskNewClusterInitScriptVolumes volumes;
        private @Nullable JobTaskNewClusterInitScriptWorkspace workspace;
        public Builder() {}
        public Builder(JobTaskNewClusterInitScript defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abfss = defaults.abfss;
    	      this.dbfs = defaults.dbfs;
    	      this.file = defaults.file;
    	      this.gcs = defaults.gcs;
    	      this.s3 = defaults.s3;
    	      this.volumes = defaults.volumes;
    	      this.workspace = defaults.workspace;
        }

        @CustomType.Setter
        public Builder abfss(@Nullable JobTaskNewClusterInitScriptAbfss abfss) {

            this.abfss = abfss;
            return this;
        }
        @CustomType.Setter
        public Builder dbfs(@Nullable JobTaskNewClusterInitScriptDbfs dbfs) {

            this.dbfs = dbfs;
            return this;
        }
        @CustomType.Setter
        public Builder file(@Nullable JobTaskNewClusterInitScriptFile file) {

            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder gcs(@Nullable JobTaskNewClusterInitScriptGcs gcs) {

            this.gcs = gcs;
            return this;
        }
        @CustomType.Setter
        public Builder s3(@Nullable JobTaskNewClusterInitScriptS3 s3) {

            this.s3 = s3;
            return this;
        }
        @CustomType.Setter
        public Builder volumes(@Nullable JobTaskNewClusterInitScriptVolumes volumes) {

            this.volumes = volumes;
            return this;
        }
        @CustomType.Setter
        public Builder workspace(@Nullable JobTaskNewClusterInitScriptWorkspace workspace) {

            this.workspace = workspace;
            return this;
        }
        public JobTaskNewClusterInitScript build() {
            final var _resultValue = new JobTaskNewClusterInitScript();
            _resultValue.abfss = abfss;
            _resultValue.dbfs = dbfs;
            _resultValue.file = file;
            _resultValue.gcs = gcs;
            _resultValue.s3 = s3;
            _resultValue.volumes = volumes;
            _resultValue.workspace = workspace;
            return _resultValue;
        }
    }
}
