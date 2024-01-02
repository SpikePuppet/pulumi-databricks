// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobNewClusterClusterMountInfoNetworkFilesystemInfo;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobNewClusterClusterMountInfo {
    private String localMountDirPath;
    private JobNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo;
    private @Nullable String remoteMountDirPath;

    private JobNewClusterClusterMountInfo() {}
    public String localMountDirPath() {
        return this.localMountDirPath;
    }
    public JobNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo() {
        return this.networkFilesystemInfo;
    }
    public Optional<String> remoteMountDirPath() {
        return Optional.ofNullable(this.remoteMountDirPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobNewClusterClusterMountInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String localMountDirPath;
        private JobNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo;
        private @Nullable String remoteMountDirPath;
        public Builder() {}
        public Builder(JobNewClusterClusterMountInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localMountDirPath = defaults.localMountDirPath;
    	      this.networkFilesystemInfo = defaults.networkFilesystemInfo;
    	      this.remoteMountDirPath = defaults.remoteMountDirPath;
        }

        @CustomType.Setter
        public Builder localMountDirPath(String localMountDirPath) {
            if (localMountDirPath == null) {
              throw new MissingRequiredPropertyException("JobNewClusterClusterMountInfo", "localMountDirPath");
            }
            this.localMountDirPath = localMountDirPath;
            return this;
        }
        @CustomType.Setter
        public Builder networkFilesystemInfo(JobNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo) {
            if (networkFilesystemInfo == null) {
              throw new MissingRequiredPropertyException("JobNewClusterClusterMountInfo", "networkFilesystemInfo");
            }
            this.networkFilesystemInfo = networkFilesystemInfo;
            return this;
        }
        @CustomType.Setter
        public Builder remoteMountDirPath(@Nullable String remoteMountDirPath) {

            this.remoteMountDirPath = remoteMountDirPath;
            return this;
        }
        public JobNewClusterClusterMountInfo build() {
            final var _resultValue = new JobNewClusterClusterMountInfo();
            _resultValue.localMountDirPath = localMountDirPath;
            _resultValue.networkFilesystemInfo = networkFilesystemInfo;
            _resultValue.remoteMountDirPath = remoteMountDirPath;
            return _resultValue;
        }
    }
}
