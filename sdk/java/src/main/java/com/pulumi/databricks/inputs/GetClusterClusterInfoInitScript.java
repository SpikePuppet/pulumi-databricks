// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetClusterClusterInfoInitScriptAbfss;
import com.pulumi.databricks.inputs.GetClusterClusterInfoInitScriptDbfs;
import com.pulumi.databricks.inputs.GetClusterClusterInfoInitScriptFile;
import com.pulumi.databricks.inputs.GetClusterClusterInfoInitScriptGcs;
import com.pulumi.databricks.inputs.GetClusterClusterInfoInitScriptS3;
import com.pulumi.databricks.inputs.GetClusterClusterInfoInitScriptVolumes;
import com.pulumi.databricks.inputs.GetClusterClusterInfoInitScriptWorkspace;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterClusterInfoInitScript extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoInitScript Empty = new GetClusterClusterInfoInitScript();

    @Import(name="abfss")
    private @Nullable GetClusterClusterInfoInitScriptAbfss abfss;

    public Optional<GetClusterClusterInfoInitScriptAbfss> abfss() {
        return Optional.ofNullable(this.abfss);
    }

    @Import(name="dbfs")
    private @Nullable GetClusterClusterInfoInitScriptDbfs dbfs;

    public Optional<GetClusterClusterInfoInitScriptDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }

    @Import(name="file")
    private @Nullable GetClusterClusterInfoInitScriptFile file;

    public Optional<GetClusterClusterInfoInitScriptFile> file() {
        return Optional.ofNullable(this.file);
    }

    @Import(name="gcs")
    private @Nullable GetClusterClusterInfoInitScriptGcs gcs;

    public Optional<GetClusterClusterInfoInitScriptGcs> gcs() {
        return Optional.ofNullable(this.gcs);
    }

    @Import(name="s3")
    private @Nullable GetClusterClusterInfoInitScriptS3 s3;

    public Optional<GetClusterClusterInfoInitScriptS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    @Import(name="volumes")
    private @Nullable GetClusterClusterInfoInitScriptVolumes volumes;

    public Optional<GetClusterClusterInfoInitScriptVolumes> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    @Import(name="workspace")
    private @Nullable GetClusterClusterInfoInitScriptWorkspace workspace;

    public Optional<GetClusterClusterInfoInitScriptWorkspace> workspace() {
        return Optional.ofNullable(this.workspace);
    }

    private GetClusterClusterInfoInitScript() {}

    private GetClusterClusterInfoInitScript(GetClusterClusterInfoInitScript $) {
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
    public static Builder builder(GetClusterClusterInfoInitScript defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoInitScript $;

        public Builder() {
            $ = new GetClusterClusterInfoInitScript();
        }

        public Builder(GetClusterClusterInfoInitScript defaults) {
            $ = new GetClusterClusterInfoInitScript(Objects.requireNonNull(defaults));
        }

        public Builder abfss(@Nullable GetClusterClusterInfoInitScriptAbfss abfss) {
            $.abfss = abfss;
            return this;
        }

        public Builder dbfs(@Nullable GetClusterClusterInfoInitScriptDbfs dbfs) {
            $.dbfs = dbfs;
            return this;
        }

        public Builder file(@Nullable GetClusterClusterInfoInitScriptFile file) {
            $.file = file;
            return this;
        }

        public Builder gcs(@Nullable GetClusterClusterInfoInitScriptGcs gcs) {
            $.gcs = gcs;
            return this;
        }

        public Builder s3(@Nullable GetClusterClusterInfoInitScriptS3 s3) {
            $.s3 = s3;
            return this;
        }

        public Builder volumes(@Nullable GetClusterClusterInfoInitScriptVolumes volumes) {
            $.volumes = volumes;
            return this;
        }

        public Builder workspace(@Nullable GetClusterClusterInfoInitScriptWorkspace workspace) {
            $.workspace = workspace;
            return this;
        }

        public GetClusterClusterInfoInitScript build() {
            return $;
        }
    }

}
