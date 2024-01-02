// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterLibraryPypiArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterLibraryPypiArgs Empty = new ClusterLibraryPypiArgs();

    @Import(name="package", required=true)
    private Output<String> package_;

    public Output<String> package_() {
        return this.package_;
    }

    @Import(name="repo")
    private @Nullable Output<String> repo;

    public Optional<Output<String>> repo() {
        return Optional.ofNullable(this.repo);
    }

    private ClusterLibraryPypiArgs() {}

    private ClusterLibraryPypiArgs(ClusterLibraryPypiArgs $) {
        this.package_ = $.package_;
        this.repo = $.repo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterLibraryPypiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterLibraryPypiArgs $;

        public Builder() {
            $ = new ClusterLibraryPypiArgs();
        }

        public Builder(ClusterLibraryPypiArgs defaults) {
            $ = new ClusterLibraryPypiArgs(Objects.requireNonNull(defaults));
        }

        public Builder package_(Output<String> package_) {
            $.package_ = package_;
            return this;
        }

        public Builder package_(String package_) {
            return package_(Output.of(package_));
        }

        public Builder repo(@Nullable Output<String> repo) {
            $.repo = repo;
            return this;
        }

        public Builder repo(String repo) {
            return repo(Output.of(repo));
        }

        public ClusterLibraryPypiArgs build() {
            if ($.package_ == null) {
                throw new MissingRequiredPropertyException("ClusterLibraryPypiArgs", "package_");
            }
            return $;
        }
    }

}
