// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.SystemSchemaArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.SystemSchemaState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **Public Preview** This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html).
 * 
 * &gt; **Note** This resource could be only used with workspace-level provider!
 * 
 * Manages system tables enablement. System tables are a Databricks-hosted analytical store of your account’s operational data. System tables can be used for historical observability across your account. System tables must be enabled by an account admin.
 * 
 * ## Example Usage
 * 
 * Enable the system schema `access`
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.SystemSchema;
 * import com.pulumi.databricks.SystemSchemaArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var this_ = new SystemSchema(&#34;this&#34;, SystemSchemaArgs.builder()        
 *             .schema(&#34;access&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * This resource can be imported by the metastore id and schema name
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/systemSchema:SystemSchema this &lt;metastore_id&gt;|&lt;schema_name&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/systemSchema:SystemSchema")
public class SystemSchema extends com.pulumi.resources.CustomResource {
    @Export(name="metastoreId", refs={String.class}, tree="[0]")
    private Output<String> metastoreId;

    public Output<String> metastoreId() {
        return this.metastoreId;
    }
    /**
     * Full name of the system schema.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> schema;

    /**
     * @return Full name of the system schema.
     * 
     */
    public Output<Optional<String>> schema() {
        return Codegen.optional(this.schema);
    }
    /**
     * The current state of enablement for the system schema.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The current state of enablement for the system schema.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SystemSchema(String name) {
        this(name, SystemSchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SystemSchema(String name, @Nullable SystemSchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SystemSchema(String name, @Nullable SystemSchemaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/systemSchema:SystemSchema", name, args == null ? SystemSchemaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SystemSchema(String name, Output<String> id, @Nullable SystemSchemaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/systemSchema:SystemSchema", name, state, makeResourceOptions(options, id));
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
    public static SystemSchema get(String name, Output<String> id, @Nullable SystemSchemaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SystemSchema(name, id, state, options);
    }
}
