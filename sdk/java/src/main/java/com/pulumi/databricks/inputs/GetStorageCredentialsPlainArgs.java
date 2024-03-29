// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStorageCredentialsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStorageCredentialsPlainArgs Empty = new GetStorageCredentialsPlainArgs();

    /**
     * List of names of databricks.StorageCredential in the metastore
     * 
     */
    @Import(name="names")
    private @Nullable List<String> names;

    /**
     * @return List of names of databricks.StorageCredential in the metastore
     * 
     */
    public Optional<List<String>> names() {
        return Optional.ofNullable(this.names);
    }

    private GetStorageCredentialsPlainArgs() {}

    private GetStorageCredentialsPlainArgs(GetStorageCredentialsPlainArgs $) {
        this.names = $.names;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStorageCredentialsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStorageCredentialsPlainArgs $;

        public Builder() {
            $ = new GetStorageCredentialsPlainArgs();
        }

        public Builder(GetStorageCredentialsPlainArgs defaults) {
            $ = new GetStorageCredentialsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param names List of names of databricks.StorageCredential in the metastore
         * 
         * @return builder
         * 
         */
        public Builder names(@Nullable List<String> names) {
            $.names = names;
            return this;
        }

        /**
         * @param names List of names of databricks.StorageCredential in the metastore
         * 
         * @return builder
         * 
         */
        public Builder names(String... names) {
            return names(List.of(names));
        }

        public GetStorageCredentialsPlainArgs build() {
            return $;
        }
    }

}
