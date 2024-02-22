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
public final class JobTaskForEachTaskTaskLibraryPypi {
    private String package_;
    private @Nullable String repo;

    private JobTaskForEachTaskTaskLibraryPypi() {}
    public String package_() {
        return this.package_;
    }
    public Optional<String> repo() {
        return Optional.ofNullable(this.repo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskForEachTaskTaskLibraryPypi defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String package_;
        private @Nullable String repo;
        public Builder() {}
        public Builder(JobTaskForEachTaskTaskLibraryPypi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.package_ = defaults.package_;
    	      this.repo = defaults.repo;
        }

        @CustomType.Setter("package")
        public Builder package_(String package_) {
            if (package_ == null) {
              throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskLibraryPypi", "package_");
            }
            this.package_ = package_;
            return this;
        }
        @CustomType.Setter
        public Builder repo(@Nullable String repo) {

            this.repo = repo;
            return this;
        }
        public JobTaskForEachTaskTaskLibraryPypi build() {
            final var _resultValue = new JobTaskForEachTaskTaskLibraryPypi();
            _resultValue.package_ = package_;
            _resultValue.repo = repo;
            return _resultValue;
        }
    }
}
