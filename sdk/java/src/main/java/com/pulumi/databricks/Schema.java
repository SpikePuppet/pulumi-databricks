// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.SchemaArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.SchemaState;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **Note** This resource could be only used with workspace-level provider!
 * 
 * Within a metastore, Unity Catalog provides a 3-level namespace for organizing data: Catalogs, Databases (also called Schemas), and Tables / Views.
 * 
 * A `databricks.Schema` is contained within databricks.Catalog and can contain tables &amp; views.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Catalog;
 * import com.pulumi.databricks.CatalogArgs;
 * import com.pulumi.databricks.Schema;
 * import com.pulumi.databricks.SchemaArgs;
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
 *         var sandbox = new Catalog(&#34;sandbox&#34;, CatalogArgs.builder()        
 *             .name(&#34;sandbox&#34;)
 *             .comment(&#34;this catalog is managed by terraform&#34;)
 *             .properties(Map.of(&#34;purpose&#34;, &#34;testing&#34;))
 *             .build());
 * 
 *         var things = new Schema(&#34;things&#34;, SchemaArgs.builder()        
 *             .catalogName(sandbox.id())
 *             .name(&#34;things&#34;)
 *             .comment(&#34;this database is managed by terraform&#34;)
 *             .properties(Map.of(&#34;kind&#34;, &#34;various&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Related Resources
 * 
 * The following resources are used in the same context:
 * 
 * * databricks.getTables data to list tables within Unity Catalog.
 * * databricks.getSchemas data to list schemas within Unity Catalog.
 * * databricks.getCatalogs data to list catalogs within Unity Catalog.
 * 
 * ## Import
 * 
 * This resource can be imported by its full name:
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/schema:Schema this &lt;catalog_name&gt;.&lt;name&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/schema:Schema")
public class Schema extends com.pulumi.resources.CustomResource {
    /**
     * Name of parent catalog. Change forces creation of a new resource.
     * 
     */
    @Export(name="catalogName", refs={String.class}, tree="[0]")
    private Output<String> catalogName;

    /**
     * @return Name of parent catalog. Change forces creation of a new resource.
     * 
     */
    public Output<String> catalogName() {
        return this.catalogName;
    }
    /**
     * User-supplied free-form text.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return User-supplied free-form text.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Whether predictive optimization should be enabled for this object and objects under it. Can be `ENABLE`, `DISABLE` or `INHERIT`
     * 
     */
    @Export(name="enablePredictiveOptimization", refs={String.class}, tree="[0]")
    private Output<String> enablePredictiveOptimization;

    /**
     * @return Whether predictive optimization should be enabled for this object and objects under it. Can be `ENABLE`, `DISABLE` or `INHERIT`
     * 
     */
    public Output<String> enablePredictiveOptimization() {
        return this.enablePredictiveOptimization;
    }
    /**
     * Delete schema regardless of its contents.
     * 
     */
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Delete schema regardless of its contents.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    @Export(name="metastoreId", refs={String.class}, tree="[0]")
    private Output<String> metastoreId;

    public Output<String> metastoreId() {
        return this.metastoreId;
    }
    /**
     * Name of Schema relative to parent catalog. Change forces creation of a new resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of Schema relative to parent catalog. Change forces creation of a new resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Username/groupname/sp application_id of the schema owner.
     * 
     */
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output<String> owner;

    /**
     * @return Username/groupname/sp application_id of the schema owner.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * Extensible Schema properties.
     * 
     */
    @Export(name="properties", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> properties;

    /**
     * @return Extensible Schema properties.
     * 
     */
    public Output<Optional<Map<String,Object>>> properties() {
        return Codegen.optional(this.properties);
    }
    /**
     * Managed location of the schema. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the catalog root location. Change forces creation of a new resource.
     * 
     */
    @Export(name="storageRoot", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageRoot;

    /**
     * @return Managed location of the schema. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the catalog root location. Change forces creation of a new resource.
     * 
     */
    public Output<Optional<String>> storageRoot() {
        return Codegen.optional(this.storageRoot);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schema(String name) {
        this(name, SchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schema(String name, SchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schema(String name, SchemaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/schema:Schema", name, args == null ? SchemaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Schema(String name, Output<String> id, @Nullable SchemaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/schema:Schema", name, state, makeResourceOptions(options, id));
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
    public static Schema get(String name, Output<String> id, @Nullable SchemaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Schema(name, id, state, options);
    }
}
