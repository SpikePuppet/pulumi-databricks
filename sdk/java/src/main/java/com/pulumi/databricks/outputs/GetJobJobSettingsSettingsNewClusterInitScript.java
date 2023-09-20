// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterInitScriptAbfss;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterInitScriptDbfs;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterInitScriptFile;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterInitScriptGcs;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterInitScriptS3;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterInitScriptVolumes;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterInitScriptWorkspace;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsNewClusterInitScript {
    private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptAbfss abfss;
    private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptDbfs dbfs;
    private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptFile file;
    private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptGcs gcs;
    private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptS3 s3;
    private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptVolumes volumes;
    private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptWorkspace workspace;

    private GetJobJobSettingsSettingsNewClusterInitScript() {}
    public Optional<GetJobJobSettingsSettingsNewClusterInitScriptAbfss> abfss() {
        return Optional.ofNullable(this.abfss);
    }
    public Optional<GetJobJobSettingsSettingsNewClusterInitScriptDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<GetJobJobSettingsSettingsNewClusterInitScriptFile> file() {
        return Optional.ofNullable(this.file);
    }
    public Optional<GetJobJobSettingsSettingsNewClusterInitScriptGcs> gcs() {
        return Optional.ofNullable(this.gcs);
    }
    public Optional<GetJobJobSettingsSettingsNewClusterInitScriptS3> s3() {
        return Optional.ofNullable(this.s3);
    }
    public Optional<GetJobJobSettingsSettingsNewClusterInitScriptVolumes> volumes() {
        return Optional.ofNullable(this.volumes);
    }
    public Optional<GetJobJobSettingsSettingsNewClusterInitScriptWorkspace> workspace() {
        return Optional.ofNullable(this.workspace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsNewClusterInitScript defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptAbfss abfss;
        private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptDbfs dbfs;
        private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptFile file;
        private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptGcs gcs;
        private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptS3 s3;
        private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptVolumes volumes;
        private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptWorkspace workspace;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsNewClusterInitScript defaults) {
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
        public Builder abfss(@Nullable GetJobJobSettingsSettingsNewClusterInitScriptAbfss abfss) {
            this.abfss = abfss;
            return this;
        }
        @CustomType.Setter
        public Builder dbfs(@Nullable GetJobJobSettingsSettingsNewClusterInitScriptDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        @CustomType.Setter
        public Builder file(@Nullable GetJobJobSettingsSettingsNewClusterInitScriptFile file) {
            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder gcs(@Nullable GetJobJobSettingsSettingsNewClusterInitScriptGcs gcs) {
            this.gcs = gcs;
            return this;
        }
        @CustomType.Setter
        public Builder s3(@Nullable GetJobJobSettingsSettingsNewClusterInitScriptS3 s3) {
            this.s3 = s3;
            return this;
        }
        @CustomType.Setter
        public Builder volumes(@Nullable GetJobJobSettingsSettingsNewClusterInitScriptVolumes volumes) {
            this.volumes = volumes;
            return this;
        }
        @CustomType.Setter
        public Builder workspace(@Nullable GetJobJobSettingsSettingsNewClusterInitScriptWorkspace workspace) {
            this.workspace = workspace;
            return this;
        }
        public GetJobJobSettingsSettingsNewClusterInitScript build() {
            final var o = new GetJobJobSettingsSettingsNewClusterInitScript();
            o.abfss = abfss;
            o.dbfs = dbfs;
            o.file = file;
            o.gcs = gcs;
            o.s3 = s3;
            o.volumes = volumes;
            o.workspace = workspace;
            return o;
        }
    }
}
