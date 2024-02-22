// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskNewClusterClusterMountInfoNetworkFilesystemInfo;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskForEachTaskTaskNewClusterClusterMountInfo {
    private String localMountDirPath;
    private JobTaskForEachTaskTaskNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo;
    private @Nullable String remoteMountDirPath;

    private JobTaskForEachTaskTaskNewClusterClusterMountInfo() {}
    public String localMountDirPath() {
        return this.localMountDirPath;
    }
    public JobTaskForEachTaskTaskNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo() {
        return this.networkFilesystemInfo;
    }
    public Optional<String> remoteMountDirPath() {
        return Optional.ofNullable(this.remoteMountDirPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskForEachTaskTaskNewClusterClusterMountInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String localMountDirPath;
        private JobTaskForEachTaskTaskNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo;
        private @Nullable String remoteMountDirPath;
        public Builder() {}
        public Builder(JobTaskForEachTaskTaskNewClusterClusterMountInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localMountDirPath = defaults.localMountDirPath;
    	      this.networkFilesystemInfo = defaults.networkFilesystemInfo;
    	      this.remoteMountDirPath = defaults.remoteMountDirPath;
        }

        @CustomType.Setter
        public Builder localMountDirPath(String localMountDirPath) {
            if (localMountDirPath == null) {
              throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskNewClusterClusterMountInfo", "localMountDirPath");
            }
            this.localMountDirPath = localMountDirPath;
            return this;
        }
        @CustomType.Setter
        public Builder networkFilesystemInfo(JobTaskForEachTaskTaskNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo) {
            if (networkFilesystemInfo == null) {
              throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskNewClusterClusterMountInfo", "networkFilesystemInfo");
            }
            this.networkFilesystemInfo = networkFilesystemInfo;
            return this;
        }
        @CustomType.Setter
        public Builder remoteMountDirPath(@Nullable String remoteMountDirPath) {

            this.remoteMountDirPath = remoteMountDirPath;
            return this;
        }
        public JobTaskForEachTaskTaskNewClusterClusterMountInfo build() {
            final var _resultValue = new JobTaskForEachTaskTaskNewClusterClusterMountInfo();
            _resultValue.localMountDirPath = localMountDirPath;
            _resultValue.networkFilesystemInfo = networkFilesystemInfo;
            _resultValue.remoteMountDirPath = remoteMountDirPath;
            return _resultValue;
        }
    }
}
