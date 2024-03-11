// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.DefaultNamespaceSettingArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.DefaultNamespaceSettingState;
import com.pulumi.databricks.outputs.DefaultNamespaceSettingNamespace;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * &gt; **Note** This resource could be only used with workspace-level provider!
 * 
 * The `databricks.DefaultNamespaceSetting` resource allows you to operate the setting configuration for the default namespace in the Databricks workspace.
 * Setting the default catalog for the workspace determines the catalog that is used when queries do not reference
 * a fully qualified 3 level name. For example, if the default catalog is set to &#39;retail_prod&#39; then a query
 * &#39;SELECT * FROM myTable&#39; would reference the object &#39;retail_prod.default.myTable&#39;
 * (the schema &#39;default&#39; is always assumed).
 * This setting requires a restart of clusters and SQL warehouses to take effect. Additionally, the default namespace only applies when using Unity Catalog-enabled compute.
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
 * import com.pulumi.databricks.DefaultNamespaceSetting;
 * import com.pulumi.databricks.DefaultNamespaceSettingArgs;
 * import com.pulumi.databricks.inputs.DefaultNamespaceSettingNamespaceArgs;
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
 *         var this_ = new DefaultNamespaceSetting(&#34;this&#34;, DefaultNamespaceSettingArgs.builder()        
 *             .namespace(DefaultNamespaceSettingNamespaceArgs.builder()
 *                 .value(&#34;namespace_value&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * This resource can be imported by predefined name `global`:
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/defaultNamespaceSetting:DefaultNamespaceSetting this global
 * ```
 * 
 */
@ResourceType(type="databricks:index/defaultNamespaceSetting:DefaultNamespaceSetting")
public class DefaultNamespaceSetting extends com.pulumi.resources.CustomResource {
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The configuration details.
     * 
     */
    @Export(name="namespace", refs={DefaultNamespaceSettingNamespace.class}, tree="[0]")
    private Output<DefaultNamespaceSettingNamespace> namespace;

    /**
     * @return The configuration details.
     * 
     */
    public Output<DefaultNamespaceSettingNamespace> namespace() {
        return this.namespace;
    }
    @Export(name="settingName", refs={String.class}, tree="[0]")
    private Output<String> settingName;

    public Output<String> settingName() {
        return this.settingName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DefaultNamespaceSetting(String name) {
        this(name, DefaultNamespaceSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefaultNamespaceSetting(String name, DefaultNamespaceSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultNamespaceSetting(String name, DefaultNamespaceSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/defaultNamespaceSetting:DefaultNamespaceSetting", name, args == null ? DefaultNamespaceSettingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DefaultNamespaceSetting(String name, Output<String> id, @Nullable DefaultNamespaceSettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/defaultNamespaceSetting:DefaultNamespaceSetting", name, state, makeResourceOptions(options, id));
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
    public static DefaultNamespaceSetting get(String name, Output<String> id, @Nullable DefaultNamespaceSettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DefaultNamespaceSetting(name, id, state, options);
    }
}
