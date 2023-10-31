// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.ClusterClusterLogConfDbfs;
import com.pulumi.databricks.outputs.ClusterClusterLogConfS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterLogConf {
    private @Nullable ClusterClusterLogConfDbfs dbfs;
    private @Nullable ClusterClusterLogConfS3 s3;

    private ClusterClusterLogConf() {}
    public Optional<ClusterClusterLogConfDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<ClusterClusterLogConfS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterLogConf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterClusterLogConfDbfs dbfs;
        private @Nullable ClusterClusterLogConfS3 s3;
        public Builder() {}
        public Builder(ClusterClusterLogConf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbfs = defaults.dbfs;
    	      this.s3 = defaults.s3;
        }

        @CustomType.Setter
        public Builder dbfs(@Nullable ClusterClusterLogConfDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        @CustomType.Setter
        public Builder s3(@Nullable ClusterClusterLogConfS3 s3) {
            this.s3 = s3;
            return this;
        }
        public ClusterClusterLogConf build() {
            final var _resultValue = new ClusterClusterLogConf();
            _resultValue.dbfs = dbfs;
            _resultValue.s3 = s3;
            return _resultValue;
        }
    }
}
