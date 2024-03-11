// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.NotebookArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.NotebookState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * The resource notebook can be imported using notebook path
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/notebook:Notebook this /path/to/notebook
 * ```
 * 
 */
@ResourceType(type="databricks:index/notebook:Notebook")
public class Notebook extends com.pulumi.resources.CustomResource {
    @Export(name="contentBase64", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> contentBase64;

    public Output<Optional<String>> contentBase64() {
        return Codegen.optional(this.contentBase64);
    }
    @Export(name="format", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> format;

    public Output<Optional<String>> format() {
        return Codegen.optional(this.format);
    }
    /**
     * One of `SCALA`, `PYTHON`, `SQL`, `R`.
     * 
     */
    @Export(name="language", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> language;

    /**
     * @return One of `SCALA`, `PYTHON`, `SQL`, `R`.
     * 
     */
    public Output<Optional<String>> language() {
        return Codegen.optional(this.language);
    }
    @Export(name="md5", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> md5;

    public Output<Optional<String>> md5() {
        return Codegen.optional(this.md5);
    }
    /**
     * Unique identifier for a NOTEBOOK
     * 
     */
    @Export(name="objectId", refs={Integer.class}, tree="[0]")
    private Output<Integer> objectId;

    /**
     * @return Unique identifier for a NOTEBOOK
     * 
     */
    public Output<Integer> objectId() {
        return this.objectId;
    }
    /**
     * @deprecated
     * Always is a notebook
     * 
     */
    @Deprecated /* Always is a notebook */
    @Export(name="objectType", refs={String.class}, tree="[0]")
    private Output<String> objectType;

    public Output<String> objectType() {
        return this.objectType;
    }
    /**
     * The absolute path of the notebook or directory, beginning with &#34;/&#34;, e.g. &#34;/Demo&#34;.
     * 
     */
    @Export(name="path", refs={String.class}, tree="[0]")
    private Output<String> path;

    /**
     * @return The absolute path of the notebook or directory, beginning with &#34;/&#34;, e.g. &#34;/Demo&#34;.
     * 
     */
    public Output<String> path() {
        return this.path;
    }
    /**
     * Path to notebook in source code format on local filesystem. Conflicts with `content_base64`.
     * 
     */
    @Export(name="source", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> source;

    /**
     * @return Path to notebook in source code format on local filesystem. Conflicts with `content_base64`.
     * 
     */
    public Output<Optional<String>> source() {
        return Codegen.optional(this.source);
    }
    /**
     * Routable URL of the notebook
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return Routable URL of the notebook
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Notebook(String name) {
        this(name, NotebookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Notebook(String name, NotebookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Notebook(String name, NotebookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/notebook:Notebook", name, args == null ? NotebookArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Notebook(String name, Output<String> id, @Nullable NotebookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/notebook:Notebook", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Notebook get(String name, Output<String> id, @Nullable NotebookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Notebook(name, id, state, options);
    }
}
