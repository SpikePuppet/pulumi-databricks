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


public final class LibraryCranArgs extends com.pulumi.resources.ResourceArgs {

    public static final LibraryCranArgs Empty = new LibraryCranArgs();

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

    private LibraryCranArgs() {}

    private LibraryCranArgs(LibraryCranArgs $) {
        this.package_ = $.package_;
        this.repo = $.repo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LibraryCranArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LibraryCranArgs $;

        public Builder() {
            $ = new LibraryCranArgs();
        }

        public Builder(LibraryCranArgs defaults) {
            $ = new LibraryCranArgs(Objects.requireNonNull(defaults));
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

        public LibraryCranArgs build() {
            if ($.package_ == null) {
                throw new MissingRequiredPropertyException("LibraryCranArgs", "package_");
            }
            return $;
        }
    }

}
