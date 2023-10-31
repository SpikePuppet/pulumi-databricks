// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskLibraryMaven {
    private String coordinates;
    private @Nullable List<String> exclusions;
    private @Nullable String repo;

    private JobTaskLibraryMaven() {}
    public String coordinates() {
        return this.coordinates;
    }
    public List<String> exclusions() {
        return this.exclusions == null ? List.of() : this.exclusions;
    }
    public Optional<String> repo() {
        return Optional.ofNullable(this.repo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskLibraryMaven defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String coordinates;
        private @Nullable List<String> exclusions;
        private @Nullable String repo;
        public Builder() {}
        public Builder(JobTaskLibraryMaven defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coordinates = defaults.coordinates;
    	      this.exclusions = defaults.exclusions;
    	      this.repo = defaults.repo;
        }

        @CustomType.Setter
        public Builder coordinates(String coordinates) {
            this.coordinates = Objects.requireNonNull(coordinates);
            return this;
        }
        @CustomType.Setter
        public Builder exclusions(@Nullable List<String> exclusions) {
            this.exclusions = exclusions;
            return this;
        }
        public Builder exclusions(String... exclusions) {
            return exclusions(List.of(exclusions));
        }
        @CustomType.Setter
        public Builder repo(@Nullable String repo) {
            this.repo = repo;
            return this;
        }
        public JobTaskLibraryMaven build() {
            final var _resultValue = new JobTaskLibraryMaven();
            _resultValue.coordinates = coordinates;
            _resultValue.exclusions = exclusions;
            _resultValue.repo = repo;
            return _resultValue;
        }
    }
}
