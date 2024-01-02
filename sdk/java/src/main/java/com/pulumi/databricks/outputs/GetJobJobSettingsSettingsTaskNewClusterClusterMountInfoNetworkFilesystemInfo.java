// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoNetworkFilesystemInfo {
    private @Nullable String mountOptions;
    private String serverAddress;

    private GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoNetworkFilesystemInfo() {}
    public Optional<String> mountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }
    public String serverAddress() {
        return this.serverAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoNetworkFilesystemInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mountOptions;
        private String serverAddress;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoNetworkFilesystemInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountOptions = defaults.mountOptions;
    	      this.serverAddress = defaults.serverAddress;
        }

        @CustomType.Setter
        public Builder mountOptions(@Nullable String mountOptions) {

            this.mountOptions = mountOptions;
            return this;
        }
        @CustomType.Setter
        public Builder serverAddress(String serverAddress) {
            if (serverAddress == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoNetworkFilesystemInfo", "serverAddress");
            }
            this.serverAddress = serverAddress;
            return this;
        }
        public GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoNetworkFilesystemInfo build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoNetworkFilesystemInfo();
            _resultValue.mountOptions = mountOptions;
            _resultValue.serverAddress = serverAddress;
            return _resultValue;
        }
    }
}
