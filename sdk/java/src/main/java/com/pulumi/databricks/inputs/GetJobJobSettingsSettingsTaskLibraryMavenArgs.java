// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskLibraryMavenArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskLibraryMavenArgs Empty = new GetJobJobSettingsSettingsTaskLibraryMavenArgs();

    @Import(name="coordinates", required=true)
    private Output<String> coordinates;

    public Output<String> coordinates() {
        return this.coordinates;
    }

    @Import(name="exclusions")
    private @Nullable Output<List<String>> exclusions;

    public Optional<Output<List<String>>> exclusions() {
        return Optional.ofNullable(this.exclusions);
    }

    @Import(name="repo")
    private @Nullable Output<String> repo;

    public Optional<Output<String>> repo() {
        return Optional.ofNullable(this.repo);
    }

    private GetJobJobSettingsSettingsTaskLibraryMavenArgs() {}

    private GetJobJobSettingsSettingsTaskLibraryMavenArgs(GetJobJobSettingsSettingsTaskLibraryMavenArgs $) {
        this.coordinates = $.coordinates;
        this.exclusions = $.exclusions;
        this.repo = $.repo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskLibraryMavenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskLibraryMavenArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskLibraryMavenArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskLibraryMavenArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskLibraryMavenArgs(Objects.requireNonNull(defaults));
        }

        public Builder coordinates(Output<String> coordinates) {
            $.coordinates = coordinates;
            return this;
        }

        public Builder coordinates(String coordinates) {
            return coordinates(Output.of(coordinates));
        }

        public Builder exclusions(@Nullable Output<List<String>> exclusions) {
            $.exclusions = exclusions;
            return this;
        }

        public Builder exclusions(List<String> exclusions) {
            return exclusions(Output.of(exclusions));
        }

        public Builder exclusions(String... exclusions) {
            return exclusions(List.of(exclusions));
        }

        public Builder repo(@Nullable Output<String> repo) {
            $.repo = repo;
            return this;
        }

        public Builder repo(String repo) {
            return repo(Output.of(repo));
        }

        public GetJobJobSettingsSettingsTaskLibraryMavenArgs build() {
            if ($.coordinates == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskLibraryMavenArgs", "coordinates");
            }
            return $;
        }
    }

}
