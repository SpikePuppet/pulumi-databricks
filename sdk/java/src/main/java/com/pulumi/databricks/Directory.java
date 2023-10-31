// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.DirectoryArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.DirectoryState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * The resource directory can be imported using directory pathbash
 * 
 * ```sh
 *  $ pulumi import databricks:index/directory:Directory this /path/to/directory
 * ```
 * 
 */
@ResourceType(type="databricks:index/directory:Directory")
public class Directory extends com.pulumi.resources.CustomResource {
    @Export(name="deleteRecursive", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deleteRecursive;

    public Output<Optional<Boolean>> deleteRecursive() {
        return Codegen.optional(this.deleteRecursive);
    }
    /**
     * Unique identifier for a DIRECTORY
     * 
     */
    @Export(name="objectId", refs={Integer.class}, tree="[0]")
    private Output<Integer> objectId;

    /**
     * @return Unique identifier for a DIRECTORY
     * 
     */
    public Output<Integer> objectId() {
        return this.objectId;
    }
    /**
     * The absolute path of the directory, beginning with &#34;/&#34;, e.g. &#34;/Demo&#34;.
     * 
     */
    @Export(name="path", refs={String.class}, tree="[0]")
    private Output<String> path;

    /**
     * @return The absolute path of the directory, beginning with &#34;/&#34;, e.g. &#34;/Demo&#34;.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Directory(String name) {
        this(name, DirectoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Directory(String name, DirectoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Directory(String name, DirectoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/directory:Directory", name, args == null ? DirectoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Directory(String name, Output<String> id, @Nullable DirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/directory:Directory", name, state, makeResourceOptions(options, id));
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
    public static Directory get(String name, Output<String> id, @Nullable DirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Directory(name, id, state, options);
    }
}
