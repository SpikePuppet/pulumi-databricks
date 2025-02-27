// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceFileArgs Empty = new WorkspaceFileArgs();

    @Import(name="contentBase64")
    private @Nullable Output<String> contentBase64;

    public Optional<Output<String>> contentBase64() {
        return Optional.ofNullable(this.contentBase64);
    }

    @Import(name="md5")
    private @Nullable Output<String> md5;

    public Optional<Output<String>> md5() {
        return Optional.ofNullable(this.md5);
    }

    /**
     * Unique identifier for a workspace file
     * 
     */
    @Import(name="objectId")
    private @Nullable Output<Integer> objectId;

    /**
     * @return Unique identifier for a workspace file
     * 
     */
    public Optional<Output<Integer>> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    /**
     * The absolute path of the workspace file, beginning with &#34;/&#34;, e.g. &#34;/Demo&#34;.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The absolute path of the workspace file, beginning with &#34;/&#34;, e.g. &#34;/Demo&#34;.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * Path to file on local filesystem. Conflicts with `content_base64`.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return Path to file on local filesystem. Conflicts with `content_base64`.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private WorkspaceFileArgs() {}

    private WorkspaceFileArgs(WorkspaceFileArgs $) {
        this.contentBase64 = $.contentBase64;
        this.md5 = $.md5;
        this.objectId = $.objectId;
        this.path = $.path;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceFileArgs $;

        public Builder() {
            $ = new WorkspaceFileArgs();
        }

        public Builder(WorkspaceFileArgs defaults) {
            $ = new WorkspaceFileArgs(Objects.requireNonNull(defaults));
        }

        public Builder contentBase64(@Nullable Output<String> contentBase64) {
            $.contentBase64 = contentBase64;
            return this;
        }

        public Builder contentBase64(String contentBase64) {
            return contentBase64(Output.of(contentBase64));
        }

        public Builder md5(@Nullable Output<String> md5) {
            $.md5 = md5;
            return this;
        }

        public Builder md5(String md5) {
            return md5(Output.of(md5));
        }

        /**
         * @param objectId Unique identifier for a workspace file
         * 
         * @return builder
         * 
         */
        public Builder objectId(@Nullable Output<Integer> objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param objectId Unique identifier for a workspace file
         * 
         * @return builder
         * 
         */
        public Builder objectId(Integer objectId) {
            return objectId(Output.of(objectId));
        }

        /**
         * @param path The absolute path of the workspace file, beginning with &#34;/&#34;, e.g. &#34;/Demo&#34;.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The absolute path of the workspace file, beginning with &#34;/&#34;, e.g. &#34;/Demo&#34;.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param source Path to file on local filesystem. Conflicts with `content_base64`.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Path to file on local filesystem. Conflicts with `content_base64`.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public WorkspaceFileArgs build() {
            if ($.path == null) {
                throw new MissingRequiredPropertyException("WorkspaceFileArgs", "path");
            }
            return $;
        }
    }

}
