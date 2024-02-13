// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MlflowModelArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MlflowModelState;
import com.pulumi.databricks.outputs.MlflowModelTag;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to create [MLflow models](https://docs.databricks.com/applications/mlflow/models.html) in Databricks.
 * 
 * **Note** This documentation covers the Workspace Model Registry. Databricks recommends using Models in Unity Catalog. Models in Unity Catalog provides centralized model governance, cross-workspace access, lineage, and deployment.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.MlflowModel;
 * import com.pulumi.databricks.MlflowModelArgs;
 * import com.pulumi.databricks.inputs.MlflowModelTagArgs;
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
 *         var test = new MlflowModel(&#34;test&#34;, MlflowModelArgs.builder()        
 *             .description(&#34;My MLflow model description&#34;)
 *             .tags(            
 *                 MlflowModelTagArgs.builder()
 *                     .key(&#34;key1&#34;)
 *                     .value(&#34;value1&#34;)
 *                     .build(),
 *                 MlflowModelTagArgs.builder()
 *                     .key(&#34;key2&#34;)
 *                     .value(&#34;value2&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Access Control
 * 
 * * databricks.Permissions can control which groups or individual users can *Read*, *Edit*, *Manage Staging Versions*, *Manage Production Versions*, and *Manage* individual models.
 * 
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * databricks.RegisteredModel to create [Models in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.
 * * End to end workspace management guide.
 * * databricks.ModelServing to serve this model on a Databricks serving endpoint.
 * * databricks.Directory to manage directories in [Databricks Workspace](https://docs.databricks.com/workspace/workspace-objects.html).
 * * databricks.MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
 * * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
 * * databricks.Notebook data to export a notebook from Databricks Workspace.
 * * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
 * 
 * ## Import
 * 
 * The model resource can be imported using the name
 * 
 *  bash
 * 
 * ```sh
 * $ pulumi import databricks:index/mlflowModel:MlflowModel this &lt;name&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/mlflowModel:MlflowModel")
public class MlflowModel extends com.pulumi.resources.CustomResource {
    /**
     * The description of the MLflow model.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the MLflow model.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of MLflow model. Change of name triggers new resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of MLflow model. Change of name triggers new resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="registeredModelId", refs={String.class}, tree="[0]")
    private Output<String> registeredModelId;

    public Output<String> registeredModelId() {
        return this.registeredModelId;
    }
    /**
     * Tags for the MLflow model.
     * 
     */
    @Export(name="tags", refs={List.class,MlflowModelTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MlflowModelTag>> tags;

    /**
     * @return Tags for the MLflow model.
     * 
     */
    public Output<Optional<List<MlflowModelTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MlflowModel(String name) {
        this(name, MlflowModelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MlflowModel(String name, @Nullable MlflowModelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MlflowModel(String name, @Nullable MlflowModelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mlflowModel:MlflowModel", name, args == null ? MlflowModelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MlflowModel(String name, Output<String> id, @Nullable MlflowModelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mlflowModel:MlflowModel", name, state, makeResourceOptions(options, id));
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
    public static MlflowModel get(String name, Output<String> id, @Nullable MlflowModelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MlflowModel(name, id, state, options);
    }
}
