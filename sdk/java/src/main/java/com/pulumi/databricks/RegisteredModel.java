// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.RegisteredModelArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.RegisteredModelState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **Note** This resource could be only used with workspace-level provider!
 * 
 * This resource allows you to create [Models in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.RegisteredModel;
 * import com.pulumi.databricks.RegisteredModelArgs;
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
 *         var this_ = new RegisteredModel(&#34;this&#34;, RegisteredModelArgs.builder()        
 *             .catalogName(&#34;main&#34;)
 *             .schemaName(&#34;default&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Access Control
 * 
 * * databricks.Grants can be used to grant principals `ALL_PRIVILEGES`, `APPLY_TAG`, and `EXECUTE` privileges.
 * 
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * databricks.ModelServing to serve this model on a Databricks serving endpoint.
 * * databricks.MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
 * * databricks.Table data to manage tables within Unity Catalog.
 * * databricks.Schema data to manage schemas within Unity Catalog.
 * * databricks.Catalog data to manage catalogs within Unity Catalog.
 * 
 * ## Import
 * 
 * The registered model resource can be imported using the full (3-level) name of the model.
 * 
 *  bash
 * 
 * ```sh
 * $ pulumi import databricks:index/registeredModel:RegisteredModel this &lt;catalog_name.schema_name.model_name&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/registeredModel:RegisteredModel")
public class RegisteredModel extends com.pulumi.resources.CustomResource {
    /**
     * The name of the catalog where the schema and the registered model reside. *Change of this parameter forces recreation of the resource.*
     * 
     */
    @Export(name="catalogName", refs={String.class}, tree="[0]")
    private Output<String> catalogName;

    /**
     * @return The name of the catalog where the schema and the registered model reside. *Change of this parameter forces recreation of the resource.*
     * 
     */
    public Output<String> catalogName() {
        return this.catalogName;
    }
    /**
     * The comment attached to the registered model.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return The comment attached to the registered model.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The name of the registered model.  *Change of this parameter forces recreation of the resource.*
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the registered model.  *Change of this parameter forces recreation of the resource.*
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the schema where the registered model resides. *Change of this parameter forces recreation of the resource.*
     * 
     */
    @Export(name="schemaName", refs={String.class}, tree="[0]")
    private Output<String> schemaName;

    /**
     * @return The name of the schema where the registered model resides. *Change of this parameter forces recreation of the resource.*
     * 
     */
    public Output<String> schemaName() {
        return this.schemaName;
    }
    /**
     * The storage location under which model version data files are stored. *Change of this parameter forces recreation of the resource.*
     * 
     */
    @Export(name="storageLocation", refs={String.class}, tree="[0]")
    private Output<String> storageLocation;

    /**
     * @return The storage location under which model version data files are stored. *Change of this parameter forces recreation of the resource.*
     * 
     */
    public Output<String> storageLocation() {
        return this.storageLocation;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegisteredModel(String name) {
        this(name, RegisteredModelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegisteredModel(String name, RegisteredModelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegisteredModel(String name, RegisteredModelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/registeredModel:RegisteredModel", name, args == null ? RegisteredModelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegisteredModel(String name, Output<String> id, @Nullable RegisteredModelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/registeredModel:RegisteredModel", name, state, makeResourceOptions(options, id));
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
    public static RegisteredModel get(String name, Output<String> id, @Nullable RegisteredModelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegisteredModel(name, id, state, options);
    }
}
