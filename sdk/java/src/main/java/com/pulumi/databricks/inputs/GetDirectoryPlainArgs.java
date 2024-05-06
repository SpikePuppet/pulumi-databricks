// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDirectoryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDirectoryPlainArgs Empty = new GetDirectoryPlainArgs();

    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * directory object ID
     * 
     */
    @Import(name="objectId")
    private @Nullable Integer objectId;

    /**
     * @return directory object ID
     * 
     */
    public Optional<Integer> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    /**
     * Path to a directory in the workspace
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return Path to a directory in the workspace
     * 
     */
    public String path() {
        return this.path;
    }

    /**
     * path on Workspace File System (WSFS) in form of `/Workspace` + `path`
     * 
     */
    @Import(name="workspacePath")
    private @Nullable String workspacePath;

    /**
     * @return path on Workspace File System (WSFS) in form of `/Workspace` + `path`
     * 
     */
    public Optional<String> workspacePath() {
        return Optional.ofNullable(this.workspacePath);
    }

    private GetDirectoryPlainArgs() {}

    private GetDirectoryPlainArgs(GetDirectoryPlainArgs $) {
        this.id = $.id;
        this.objectId = $.objectId;
        this.path = $.path;
        this.workspacePath = $.workspacePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDirectoryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDirectoryPlainArgs $;

        public Builder() {
            $ = new GetDirectoryPlainArgs();
        }

        public Builder(GetDirectoryPlainArgs defaults) {
            $ = new GetDirectoryPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param objectId directory object ID
         * 
         * @return builder
         * 
         */
        public Builder objectId(@Nullable Integer objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param path Path to a directory in the workspace
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        /**
         * @param workspacePath path on Workspace File System (WSFS) in form of `/Workspace` + `path`
         * 
         * @return builder
         * 
         */
        public Builder workspacePath(@Nullable String workspacePath) {
            $.workspacePath = workspacePath;
            return this;
        }

        public GetDirectoryPlainArgs build() {
            if ($.path == null) {
                throw new MissingRequiredPropertyException("GetDirectoryPlainArgs", "path");
            }
            return $;
        }
    }

}
