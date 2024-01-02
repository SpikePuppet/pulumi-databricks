// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.PipelineClusterInitScriptAbfss;
import com.pulumi.databricks.outputs.PipelineClusterInitScriptDbfs;
import com.pulumi.databricks.outputs.PipelineClusterInitScriptFile;
import com.pulumi.databricks.outputs.PipelineClusterInitScriptGcs;
import com.pulumi.databricks.outputs.PipelineClusterInitScriptS3;
import com.pulumi.databricks.outputs.PipelineClusterInitScriptVolumes;
import com.pulumi.databricks.outputs.PipelineClusterInitScriptWorkspace;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineClusterInitScript {
    private @Nullable PipelineClusterInitScriptAbfss abfss;
    /**
     * @deprecated
     * For init scripts use &#39;volumes&#39;, &#39;workspace&#39; or cloud storage location instead of &#39;dbfs&#39;.
     * 
     */
    @Deprecated /* For init scripts use 'volumes', 'workspace' or cloud storage location instead of 'dbfs'. */
    private @Nullable PipelineClusterInitScriptDbfs dbfs;
    private @Nullable PipelineClusterInitScriptFile file;
    private @Nullable PipelineClusterInitScriptGcs gcs;
    private @Nullable PipelineClusterInitScriptS3 s3;
    private @Nullable PipelineClusterInitScriptVolumes volumes;
    private @Nullable PipelineClusterInitScriptWorkspace workspace;

    private PipelineClusterInitScript() {}
    public Optional<PipelineClusterInitScriptAbfss> abfss() {
        return Optional.ofNullable(this.abfss);
    }
    /**
     * @deprecated
     * For init scripts use &#39;volumes&#39;, &#39;workspace&#39; or cloud storage location instead of &#39;dbfs&#39;.
     * 
     */
    @Deprecated /* For init scripts use 'volumes', 'workspace' or cloud storage location instead of 'dbfs'. */
    public Optional<PipelineClusterInitScriptDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<PipelineClusterInitScriptFile> file() {
        return Optional.ofNullable(this.file);
    }
    public Optional<PipelineClusterInitScriptGcs> gcs() {
        return Optional.ofNullable(this.gcs);
    }
    public Optional<PipelineClusterInitScriptS3> s3() {
        return Optional.ofNullable(this.s3);
    }
    public Optional<PipelineClusterInitScriptVolumes> volumes() {
        return Optional.ofNullable(this.volumes);
    }
    public Optional<PipelineClusterInitScriptWorkspace> workspace() {
        return Optional.ofNullable(this.workspace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineClusterInitScript defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PipelineClusterInitScriptAbfss abfss;
        private @Nullable PipelineClusterInitScriptDbfs dbfs;
        private @Nullable PipelineClusterInitScriptFile file;
        private @Nullable PipelineClusterInitScriptGcs gcs;
        private @Nullable PipelineClusterInitScriptS3 s3;
        private @Nullable PipelineClusterInitScriptVolumes volumes;
        private @Nullable PipelineClusterInitScriptWorkspace workspace;
        public Builder() {}
        public Builder(PipelineClusterInitScript defaults) {
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
        public Builder abfss(@Nullable PipelineClusterInitScriptAbfss abfss) {

            this.abfss = abfss;
            return this;
        }
        @CustomType.Setter
        public Builder dbfs(@Nullable PipelineClusterInitScriptDbfs dbfs) {

            this.dbfs = dbfs;
            return this;
        }
        @CustomType.Setter
        public Builder file(@Nullable PipelineClusterInitScriptFile file) {

            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder gcs(@Nullable PipelineClusterInitScriptGcs gcs) {

            this.gcs = gcs;
            return this;
        }
        @CustomType.Setter
        public Builder s3(@Nullable PipelineClusterInitScriptS3 s3) {

            this.s3 = s3;
            return this;
        }
        @CustomType.Setter
        public Builder volumes(@Nullable PipelineClusterInitScriptVolumes volumes) {

            this.volumes = volumes;
            return this;
        }
        @CustomType.Setter
        public Builder workspace(@Nullable PipelineClusterInitScriptWorkspace workspace) {

            this.workspace = workspace;
            return this;
        }
        public PipelineClusterInitScript build() {
            final var _resultValue = new PipelineClusterInitScript();
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
