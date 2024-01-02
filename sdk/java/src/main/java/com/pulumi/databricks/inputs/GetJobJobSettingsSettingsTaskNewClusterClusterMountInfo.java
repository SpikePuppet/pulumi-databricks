// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoNetworkFilesystemInfo;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo Empty = new GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo();

    @Import(name="localMountDirPath", required=true)
    private String localMountDirPath;

    public String localMountDirPath() {
        return this.localMountDirPath;
    }

    @Import(name="networkFilesystemInfo", required=true)
    private GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo;

    public GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo() {
        return this.networkFilesystemInfo;
    }

    @Import(name="remoteMountDirPath")
    private @Nullable String remoteMountDirPath;

    public Optional<String> remoteMountDirPath() {
        return Optional.ofNullable(this.remoteMountDirPath);
    }

    private GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo() {}

    private GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo(GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo $) {
        this.localMountDirPath = $.localMountDirPath;
        this.networkFilesystemInfo = $.networkFilesystemInfo;
        this.remoteMountDirPath = $.remoteMountDirPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo();
        }

        public Builder(GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo defaults) {
            $ = new GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo(Objects.requireNonNull(defaults));
        }

        public Builder localMountDirPath(String localMountDirPath) {
            $.localMountDirPath = localMountDirPath;
            return this;
        }

        public Builder networkFilesystemInfo(GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo) {
            $.networkFilesystemInfo = networkFilesystemInfo;
            return this;
        }

        public Builder remoteMountDirPath(@Nullable String remoteMountDirPath) {
            $.remoteMountDirPath = remoteMountDirPath;
            return this;
        }

        public GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo build() {
            if ($.localMountDirPath == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo", "localMountDirPath");
            }
            if ($.networkFilesystemInfo == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo", "networkFilesystemInfo");
            }
            return $;
        }
    }

}
