// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterPolicyLibraryPypiArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterPolicyLibraryPypiArgs Empty = new ClusterPolicyLibraryPypiArgs();

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

    private ClusterPolicyLibraryPypiArgs() {}

    private ClusterPolicyLibraryPypiArgs(ClusterPolicyLibraryPypiArgs $) {
        this.package_ = $.package_;
        this.repo = $.repo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterPolicyLibraryPypiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterPolicyLibraryPypiArgs $;

        public Builder() {
            $ = new ClusterPolicyLibraryPypiArgs();
        }

        public Builder(ClusterPolicyLibraryPypiArgs defaults) {
            $ = new ClusterPolicyLibraryPypiArgs(Objects.requireNonNull(defaults));
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

        public ClusterPolicyLibraryPypiArgs build() {
            $.package_ = Objects.requireNonNull($.package_, "expected parameter 'package' to be non-null");
            return $;
        }
    }

}