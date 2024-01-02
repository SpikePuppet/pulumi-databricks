// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsNewClusterClusterMountInfoNetworkFilesystemInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsNewClusterClusterMountInfoNetworkFilesystemInfoArgs Empty = new GetJobJobSettingsSettingsNewClusterClusterMountInfoNetworkFilesystemInfoArgs();

    @Import(name="mountOptions")
    private @Nullable Output<String> mountOptions;

    public Optional<Output<String>> mountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }

    @Import(name="serverAddress", required=true)
    private Output<String> serverAddress;

    public Output<String> serverAddress() {
        return this.serverAddress;
    }

    private GetJobJobSettingsSettingsNewClusterClusterMountInfoNetworkFilesystemInfoArgs() {}

    private GetJobJobSettingsSettingsNewClusterClusterMountInfoNetworkFilesystemInfoArgs(GetJobJobSettingsSettingsNewClusterClusterMountInfoNetworkFilesystemInfoArgs $) {
        this.mountOptions = $.mountOptions;
        this.serverAddress = $.serverAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsNewClusterClusterMountInfoNetworkFilesystemInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsNewClusterClusterMountInfoNetworkFilesystemInfoArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsNewClusterClusterMountInfoNetworkFilesystemInfoArgs();
        }

        public Builder(GetJobJobSettingsSettingsNewClusterClusterMountInfoNetworkFilesystemInfoArgs defaults) {
            $ = new GetJobJobSettingsSettingsNewClusterClusterMountInfoNetworkFilesystemInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder mountOptions(@Nullable Output<String> mountOptions) {
            $.mountOptions = mountOptions;
            return this;
        }

        public Builder mountOptions(String mountOptions) {
            return mountOptions(Output.of(mountOptions));
        }

        public Builder serverAddress(Output<String> serverAddress) {
            $.serverAddress = serverAddress;
            return this;
        }

        public Builder serverAddress(String serverAddress) {
            return serverAddress(Output.of(serverAddress));
        }

        public GetJobJobSettingsSettingsNewClusterClusterMountInfoNetworkFilesystemInfoArgs build() {
            if ($.serverAddress == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsNewClusterClusterMountInfoNetworkFilesystemInfoArgs", "serverAddress");
            }
            return $;
        }
    }

}
