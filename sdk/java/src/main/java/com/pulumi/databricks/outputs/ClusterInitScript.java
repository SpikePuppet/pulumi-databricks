// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.ClusterInitScriptAbfss;
import com.pulumi.databricks.outputs.ClusterInitScriptDbfs;
import com.pulumi.databricks.outputs.ClusterInitScriptFile;
import com.pulumi.databricks.outputs.ClusterInitScriptGcs;
import com.pulumi.databricks.outputs.ClusterInitScriptS3;
import com.pulumi.databricks.outputs.ClusterInitScriptVolumes;
import com.pulumi.databricks.outputs.ClusterInitScriptWorkspace;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterInitScript {
    private @Nullable ClusterInitScriptAbfss abfss;
    /**
     * @deprecated
     * For init scripts use &#39;volumes&#39;, &#39;workspace&#39; or cloud storage location instead of &#39;dbfs&#39;.
     * 
     */
    @Deprecated /* For init scripts use 'volumes', 'workspace' or cloud storage location instead of 'dbfs'. */
    private @Nullable ClusterInitScriptDbfs dbfs;
    private @Nullable ClusterInitScriptFile file;
    private @Nullable ClusterInitScriptGcs gcs;
    private @Nullable ClusterInitScriptS3 s3;
    private @Nullable ClusterInitScriptVolumes volumes;
    private @Nullable ClusterInitScriptWorkspace workspace;

    private ClusterInitScript() {}
    public Optional<ClusterInitScriptAbfss> abfss() {
        return Optional.ofNullable(this.abfss);
    }
    /**
     * @deprecated
     * For init scripts use &#39;volumes&#39;, &#39;workspace&#39; or cloud storage location instead of &#39;dbfs&#39;.
     * 
     */
    @Deprecated /* For init scripts use 'volumes', 'workspace' or cloud storage location instead of 'dbfs'. */
    public Optional<ClusterInitScriptDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<ClusterInitScriptFile> file() {
        return Optional.ofNullable(this.file);
    }
    public Optional<ClusterInitScriptGcs> gcs() {
        return Optional.ofNullable(this.gcs);
    }
    public Optional<ClusterInitScriptS3> s3() {
        return Optional.ofNullable(this.s3);
    }
    public Optional<ClusterInitScriptVolumes> volumes() {
        return Optional.ofNullable(this.volumes);
    }
    public Optional<ClusterInitScriptWorkspace> workspace() {
        return Optional.ofNullable(this.workspace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterInitScript defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterInitScriptAbfss abfss;
        private @Nullable ClusterInitScriptDbfs dbfs;
        private @Nullable ClusterInitScriptFile file;
        private @Nullable ClusterInitScriptGcs gcs;
        private @Nullable ClusterInitScriptS3 s3;
        private @Nullable ClusterInitScriptVolumes volumes;
        private @Nullable ClusterInitScriptWorkspace workspace;
        public Builder() {}
        public Builder(ClusterInitScript defaults) {
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
        public Builder abfss(@Nullable ClusterInitScriptAbfss abfss) {
            this.abfss = abfss;
            return this;
        }
        @CustomType.Setter
        public Builder dbfs(@Nullable ClusterInitScriptDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        @CustomType.Setter
        public Builder file(@Nullable ClusterInitScriptFile file) {
            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder gcs(@Nullable ClusterInitScriptGcs gcs) {
            this.gcs = gcs;
            return this;
        }
        @CustomType.Setter
        public Builder s3(@Nullable ClusterInitScriptS3 s3) {
            this.s3 = s3;
            return this;
        }
        @CustomType.Setter
        public Builder volumes(@Nullable ClusterInitScriptVolumes volumes) {
            this.volumes = volumes;
            return this;
        }
        @CustomType.Setter
        public Builder workspace(@Nullable ClusterInitScriptWorkspace workspace) {
            this.workspace = workspace;
            return this;
        }
        public ClusterInitScript build() {
            final var _resultValue = new ClusterInitScript();
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
