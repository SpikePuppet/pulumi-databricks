// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNotebookArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNotebookArgs Empty = new GetNotebookArgs();

    /**
     * Notebook format to export. Either `SOURCE`, `HTML`, `JUPYTER`, or `DBC`.
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    /**
     * @return Notebook format to export. Either `SOURCE`, `HTML`, `JUPYTER`, or `DBC`.
     * 
     */
    public Output<String> format() {
        return this.format;
    }

    /**
     * notebook language
     * 
     */
    @Import(name="language")
    private @Nullable Output<String> language;

    /**
     * @return notebook language
     * 
     */
    public Optional<Output<String>> language() {
        return Optional.ofNullable(this.language);
    }

    /**
     * notebook object ID
     * 
     */
    @Import(name="objectId")
    private @Nullable Output<Integer> objectId;

    /**
     * @return notebook object ID
     * 
     */
    public Optional<Output<Integer>> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    /**
     * notebook object type
     * 
     */
    @Import(name="objectType")
    private @Nullable Output<String> objectType;

    /**
     * @return notebook object type
     * 
     */
    public Optional<Output<String>> objectType() {
        return Optional.ofNullable(this.objectType);
    }

    /**
     * Notebook path on the workspace
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return Notebook path on the workspace
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    private GetNotebookArgs() {}

    private GetNotebookArgs(GetNotebookArgs $) {
        this.format = $.format;
        this.language = $.language;
        this.objectId = $.objectId;
        this.objectType = $.objectType;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNotebookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNotebookArgs $;

        public Builder() {
            $ = new GetNotebookArgs();
        }

        public Builder(GetNotebookArgs defaults) {
            $ = new GetNotebookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param format Notebook format to export. Either `SOURCE`, `HTML`, `JUPYTER`, or `DBC`.
         * 
         * @return builder
         * 
         */
        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Notebook format to export. Either `SOURCE`, `HTML`, `JUPYTER`, or `DBC`.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param language notebook language
         * 
         * @return builder
         * 
         */
        public Builder language(@Nullable Output<String> language) {
            $.language = language;
            return this;
        }

        /**
         * @param language notebook language
         * 
         * @return builder
         * 
         */
        public Builder language(String language) {
            return language(Output.of(language));
        }

        /**
         * @param objectId notebook object ID
         * 
         * @return builder
         * 
         */
        public Builder objectId(@Nullable Output<Integer> objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param objectId notebook object ID
         * 
         * @return builder
         * 
         */
        public Builder objectId(Integer objectId) {
            return objectId(Output.of(objectId));
        }

        /**
         * @param objectType notebook object type
         * 
         * @return builder
         * 
         */
        public Builder objectType(@Nullable Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param objectType notebook object type
         * 
         * @return builder
         * 
         */
        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        /**
         * @param path Notebook path on the workspace
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Notebook path on the workspace
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public GetNotebookArgs build() {
            if ($.format == null) {
                throw new MissingRequiredPropertyException("GetNotebookArgs", "format");
            }
            if ($.path == null) {
                throw new MissingRequiredPropertyException("GetNotebookArgs", "path");
            }
            return $;
        }
    }

}
