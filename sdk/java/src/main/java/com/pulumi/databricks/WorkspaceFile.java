// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.WorkspaceFileArgs;
import com.pulumi.databricks.inputs.WorkspaceFileState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * The workspace file resource can be imported using workspace file path bash
 * 
 * ```sh
 *  $ pulumi import databricks:index/workspaceFile:WorkspaceFile this /path/to/file
 * ```
 * 
 */
@ResourceType(type="databricks:index/workspaceFile:WorkspaceFile")
public class WorkspaceFile extends com.pulumi.resources.CustomResource {
    @Export(name="contentBase64", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> contentBase64;

    public Output<Optional<String>> contentBase64() {
        return Codegen.optional(this.contentBase64);
    }
    @Export(name="md5", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> md5;

    public Output<Optional<String>> md5() {
        return Codegen.optional(this.md5);
    }
    /**
     * Unique identifier for a workspace file
     * 
     */
    @Export(name="objectId", refs={Integer.class}, tree="[0]")
    private Output<Integer> objectId;

    /**
     * @return Unique identifier for a workspace file
     * 
     */
    public Output<Integer> objectId() {
        return this.objectId;
    }
    /**
     * The absolute path of the workspace file, beginning with &#34;/&#34;, e.g. &#34;/Demo&#34;.
     * 
     */
    @Export(name="path", refs={String.class}, tree="[0]")
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
    @Export(name="source", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> source;

    /**
     * @return Path to file on local filesystem. Conflicts with `content_base64`.
     * 
     */
    public Output<Optional<String>> source() {
        return Codegen.optional(this.source);
    }
    /**
     * Routable URL of the workspace file
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return Routable URL of the workspace file
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * path on Workspace File System (WSFS) in form of `/Workspace` + `path`
     * 
     */
    @Export(name="workspacePath", refs={String.class}, tree="[0]")
    private Output<String> workspacePath;

    /**
     * @return path on Workspace File System (WSFS) in form of `/Workspace` + `path`
     * 
     */
    public Output<String> workspacePath() {
        return this.workspacePath;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkspaceFile(String name) {
        this(name, WorkspaceFileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkspaceFile(String name, WorkspaceFileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkspaceFile(String name, WorkspaceFileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/workspaceFile:WorkspaceFile", name, args == null ? WorkspaceFileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkspaceFile(String name, Output<String> id, @Nullable WorkspaceFileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/workspaceFile:WorkspaceFile", name, state, makeResourceOptions(options, id));
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
    public static WorkspaceFile get(String name, Output<String> id, @Nullable WorkspaceFileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkspaceFile(name, id, state, options);
    }
}
