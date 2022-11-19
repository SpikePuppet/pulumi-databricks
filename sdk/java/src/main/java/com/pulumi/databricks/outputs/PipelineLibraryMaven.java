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
public final class PipelineLibraryMaven {
    private String coordinates;
    private @Nullable List<String> exclusions;
    private @Nullable String repo;

    private PipelineLibraryMaven() {}
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

    public static Builder builder(PipelineLibraryMaven defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String coordinates;
        private @Nullable List<String> exclusions;
        private @Nullable String repo;
        public Builder() {}
        public Builder(PipelineLibraryMaven defaults) {
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
        public PipelineLibraryMaven build() {
            final var o = new PipelineLibraryMaven();
            o.coordinates = coordinates;
            o.exclusions = exclusions;
            o.repo = repo;
            return o;
        }
    }
}