// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfs;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcs;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptVolumes;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsJobClusterNewClusterInitScript {
    private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss abfss;
    private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfs dbfs;
    private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile file;
    private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcs gcs;
    private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3 s3;
    private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptVolumes volumes;
    private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace workspace;

    private GetJobJobSettingsSettingsJobClusterNewClusterInitScript() {}
    public Optional<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss> abfss() {
        return Optional.ofNullable(this.abfss);
    }
    public Optional<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile> file() {
        return Optional.ofNullable(this.file);
    }
    public Optional<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcs> gcs() {
        return Optional.ofNullable(this.gcs);
    }
    public Optional<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3> s3() {
        return Optional.ofNullable(this.s3);
    }
    public Optional<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptVolumes> volumes() {
        return Optional.ofNullable(this.volumes);
    }
    public Optional<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace> workspace() {
        return Optional.ofNullable(this.workspace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsJobClusterNewClusterInitScript defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss abfss;
        private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfs dbfs;
        private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile file;
        private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcs gcs;
        private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3 s3;
        private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptVolumes volumes;
        private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace workspace;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsJobClusterNewClusterInitScript defaults) {
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
        public Builder abfss(@Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss abfss) {

            this.abfss = abfss;
            return this;
        }
        @CustomType.Setter
        public Builder dbfs(@Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfs dbfs) {

            this.dbfs = dbfs;
            return this;
        }
        @CustomType.Setter
        public Builder file(@Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile file) {

            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder gcs(@Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcs gcs) {

            this.gcs = gcs;
            return this;
        }
        @CustomType.Setter
        public Builder s3(@Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3 s3) {

            this.s3 = s3;
            return this;
        }
        @CustomType.Setter
        public Builder volumes(@Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptVolumes volumes) {

            this.volumes = volumes;
            return this;
        }
        @CustomType.Setter
        public Builder workspace(@Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace workspace) {

            this.workspace = workspace;
            return this;
        }
        public GetJobJobSettingsSettingsJobClusterNewClusterInitScript build() {
            final var _resultValue = new GetJobJobSettingsSettingsJobClusterNewClusterInitScript();
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
