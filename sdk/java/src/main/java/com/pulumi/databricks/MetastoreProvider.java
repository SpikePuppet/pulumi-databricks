// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MetastoreProviderArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MetastoreProviderState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Within a metastore, Unity Catalog provides the ability to create a provider which contains a list of shares that have been shared with you.
 * 
 * A `databricks.MetastoreProvider` is contained within databricks.Metastore and can contain a list of shares that have been shared with you.
 * 
 * Note that Databricks to Databricks sharing automatically creates the provider.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.MetastoreProvider;
 * import com.pulumi.databricks.MetastoreProviderArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var dbprovider = new MetastoreProvider(&#34;dbprovider&#34;, MetastoreProviderArgs.builder()        
 *             .comment(&#34;made by terraform 2&#34;)
 *             .authenticationType(&#34;TOKEN&#34;)
 *             .recipientProfileStr(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;shareCredentialsVersion&#34;, 1),
 *                     jsonProperty(&#34;bearerToken&#34;, &#34;token&#34;),
 *                     jsonProperty(&#34;endpoint&#34;, &#34;endpoint&#34;),
 *                     jsonProperty(&#34;expirationTime&#34;, &#34;expiration-time&#34;)
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Related Resources
 * 
 * The following resources are used in the same context:
 * 
 * * databricks.Table data to list tables within Unity Catalog.
 * * databricks.Schema data to list schemas within Unity Catalog.
 * * databricks.Catalog data to list catalogs within Unity Catalog.
 * 
 */
@ResourceType(type="databricks:index/metastoreProvider:MetastoreProvider")
public class MetastoreProvider extends com.pulumi.resources.CustomResource {
    /**
     * The delta sharing authentication type. Valid values are `TOKEN`.
     * 
     */
    @Export(name="authenticationType", refs={String.class}, tree="[0]")
    private Output<String> authenticationType;

    /**
     * @return The delta sharing authentication type. Valid values are `TOKEN`.
     * 
     */
    public Output<String> authenticationType() {
        return this.authenticationType;
    }
    /**
     * Description about the provider.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Description about the provider.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Name of provider. Change forces creation of a new resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of provider. Change forces creation of a new resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * This is the json file that is created from a recipient url.
     * 
     */
    @Export(name="recipientProfileStr", refs={String.class}, tree="[0]")
    private Output<String> recipientProfileStr;

    /**
     * @return This is the json file that is created from a recipient url.
     * 
     */
    public Output<String> recipientProfileStr() {
        return this.recipientProfileStr;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MetastoreProvider(String name) {
        this(name, MetastoreProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MetastoreProvider(String name, MetastoreProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetastoreProvider(String name, MetastoreProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/metastoreProvider:MetastoreProvider", name, args == null ? MetastoreProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MetastoreProvider(String name, Output<String> id, @Nullable MetastoreProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/metastoreProvider:MetastoreProvider", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "recipientProfileStr"
            ))
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
    public static MetastoreProvider get(String name, Output<String> id, @Nullable MetastoreProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MetastoreProvider(name, id, state, options);
    }
}
