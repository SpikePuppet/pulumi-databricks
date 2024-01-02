// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDbfsFilePathsPathList {
    private @Nullable Integer fileSize;
    /**
     * @return Path on DBFS for the file to perform listing
     * 
     */
    private @Nullable String path;

    private GetDbfsFilePathsPathList() {}
    public Optional<Integer> fileSize() {
        return Optional.ofNullable(this.fileSize);
    }
    /**
     * @return Path on DBFS for the file to perform listing
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDbfsFilePathsPathList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer fileSize;
        private @Nullable String path;
        public Builder() {}
        public Builder(GetDbfsFilePathsPathList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSize = defaults.fileSize;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder fileSize(@Nullable Integer fileSize) {

            this.fileSize = fileSize;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        public GetDbfsFilePathsPathList build() {
            final var _resultValue = new GetDbfsFilePathsPathList();
            _resultValue.fileSize = fileSize;
            _resultValue.path = path;
            return _resultValue;
        }
    }
}
