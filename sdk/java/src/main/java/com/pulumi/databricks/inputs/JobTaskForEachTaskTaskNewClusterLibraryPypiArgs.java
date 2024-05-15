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


public final class JobTaskForEachTaskTaskNewClusterLibraryPypiArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskForEachTaskTaskNewClusterLibraryPypiArgs Empty = new JobTaskForEachTaskTaskNewClusterLibraryPypiArgs();

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

    private JobTaskForEachTaskTaskNewClusterLibraryPypiArgs() {}

    private JobTaskForEachTaskTaskNewClusterLibraryPypiArgs(JobTaskForEachTaskTaskNewClusterLibraryPypiArgs $) {
        this.package_ = $.package_;
        this.repo = $.repo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskForEachTaskTaskNewClusterLibraryPypiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskForEachTaskTaskNewClusterLibraryPypiArgs $;

        public Builder() {
            $ = new JobTaskForEachTaskTaskNewClusterLibraryPypiArgs();
        }

        public Builder(JobTaskForEachTaskTaskNewClusterLibraryPypiArgs defaults) {
            $ = new JobTaskForEachTaskTaskNewClusterLibraryPypiArgs(Objects.requireNonNull(defaults));
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

        public JobTaskForEachTaskTaskNewClusterLibraryPypiArgs build() {
            if ($.package_ == null) {
                throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskNewClusterLibraryPypiArgs", "package_");
            }
            return $;
        }
    }

}
