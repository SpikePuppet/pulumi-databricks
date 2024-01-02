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


public final class JobJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs Empty = new JobJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs();

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

    private JobJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs() {}

    private JobJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs(JobJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs $) {
        this.mountOptions = $.mountOptions;
        this.serverAddress = $.serverAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs $;

        public Builder() {
            $ = new JobJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs();
        }

        public Builder(JobJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs defaults) {
            $ = new JobJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs(Objects.requireNonNull(defaults));
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

        public JobJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs build() {
            if ($.serverAddress == null) {
                throw new MissingRequiredPropertyException("JobJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs", "serverAddress");
            }
            return $;
        }
    }

}
