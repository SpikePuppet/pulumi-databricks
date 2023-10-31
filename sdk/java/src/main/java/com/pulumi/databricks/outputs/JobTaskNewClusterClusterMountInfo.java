// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskNewClusterClusterMountInfoNetworkFilesystemInfo;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskNewClusterClusterMountInfo {
    private String localMountDirPath;
    private JobTaskNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo;
    private @Nullable String remoteMountDirPath;

    private JobTaskNewClusterClusterMountInfo() {}
    public String localMountDirPath() {
        return this.localMountDirPath;
    }
    public JobTaskNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo() {
        return this.networkFilesystemInfo;
    }
    public Optional<String> remoteMountDirPath() {
        return Optional.ofNullable(this.remoteMountDirPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskNewClusterClusterMountInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String localMountDirPath;
        private JobTaskNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo;
        private @Nullable String remoteMountDirPath;
        public Builder() {}
        public Builder(JobTaskNewClusterClusterMountInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localMountDirPath = defaults.localMountDirPath;
    	      this.networkFilesystemInfo = defaults.networkFilesystemInfo;
    	      this.remoteMountDirPath = defaults.remoteMountDirPath;
        }

        @CustomType.Setter
        public Builder localMountDirPath(String localMountDirPath) {
            this.localMountDirPath = Objects.requireNonNull(localMountDirPath);
            return this;
        }
        @CustomType.Setter
        public Builder networkFilesystemInfo(JobTaskNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo) {
            this.networkFilesystemInfo = Objects.requireNonNull(networkFilesystemInfo);
            return this;
        }
        @CustomType.Setter
        public Builder remoteMountDirPath(@Nullable String remoteMountDirPath) {
            this.remoteMountDirPath = remoteMountDirPath;
            return this;
        }
        public JobTaskNewClusterClusterMountInfo build() {
            final var _resultValue = new JobTaskNewClusterClusterMountInfo();
            _resultValue.localMountDirPath = localMountDirPath;
            _resultValue.networkFilesystemInfo = networkFilesystemInfo;
            _resultValue.remoteMountDirPath = remoteMountDirPath;
            return _resultValue;
        }
    }
}
