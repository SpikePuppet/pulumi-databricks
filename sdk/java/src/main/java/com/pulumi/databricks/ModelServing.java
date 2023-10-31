// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.ModelServingArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.ModelServingState;
import com.pulumi.databricks.outputs.ModelServingConfig;
import com.pulumi.databricks.outputs.ModelServingTag;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to manage [Model Serving](https://docs.databricks.com/machine-learning/model-serving/index.html) endpoints in Databricks.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.ModelServing;
 * import com.pulumi.databricks.ModelServingArgs;
 * import com.pulumi.databricks.inputs.ModelServingConfigArgs;
 * import com.pulumi.databricks.inputs.ModelServingConfigTrafficConfigArgs;
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
 *         var this_ = new ModelServing(&#34;this&#34;, ModelServingArgs.builder()        
 *             .config(ModelServingConfigArgs.builder()
 *                 .servedModels(                
 *                     ModelServingConfigServedModelArgs.builder()
 *                         .modelName(&#34;ads-model&#34;)
 *                         .modelVersion(&#34;2&#34;)
 *                         .name(&#34;prod_model&#34;)
 *                         .scaleToZeroEnabled(true)
 *                         .workloadSize(&#34;Small&#34;)
 *                         .build(),
 *                     ModelServingConfigServedModelArgs.builder()
 *                         .modelName(&#34;ads-model&#34;)
 *                         .modelVersion(&#34;4&#34;)
 *                         .name(&#34;candidate_model&#34;)
 *                         .scaleToZeroEnabled(false)
 *                         .workloadSize(&#34;Small&#34;)
 *                         .build())
 *                 .trafficConfig(ModelServingConfigTrafficConfigArgs.builder()
 *                     .routes(                    
 *                         ModelServingConfigTrafficConfigRouteArgs.builder()
 *                             .servedModelName(&#34;prod_model&#34;)
 *                             .trafficPercentage(90)
 *                             .build(),
 *                         ModelServingConfigTrafficConfigRouteArgs.builder()
 *                             .servedModelName(&#34;candidate_model&#34;)
 *                             .trafficPercentage(10)
 *                             .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Access Control
 * 
 * * databricks.Permissions can control which groups or individual users can *Manage*, *Query* or *View* individual serving endpoints.
 * 
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * databricks.RegisteredModel to create [Models in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.
 * * End to end workspace management guide.
 * * databricks.Directory to manage directories in [Databricks Workspace](https://docs.databricks.com/workspace/workspace-objects.html).
 * * databricks.MlflowModel to create models in the [workspace model registry](https://docs.databricks.com/en/mlflow/model-registry.html) in Databricks.
 * * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
 * * databricks.Notebook data to export a notebook from Databricks Workspace.
 * * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
 * 
 * ## Import
 * 
 * The model serving resource can be imported using the name of the endpoint. bash
 * 
 * ```sh
 *  $ pulumi import databricks:index/modelServing:ModelServing this &lt;model-serving-endpoint-name&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/modelServing:ModelServing")
public class ModelServing extends com.pulumi.resources.CustomResource {
    /**
     * The model serving endpoint configuration.
     * 
     */
    @Export(name="config", refs={ModelServingConfig.class}, tree="[0]")
    private Output<ModelServingConfig> config;

    /**
     * @return The model serving endpoint configuration.
     * 
     */
    public Output<ModelServingConfig> config() {
        return this.config;
    }
    /**
     * The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
     * 
     */
    @Export(name="servingEndpointId", refs={String.class}, tree="[0]")
    private Output<String> servingEndpointId;

    /**
     * @return Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
     * 
     */
    public Output<String> servingEndpointId() {
        return this.servingEndpointId;
    }
    @Export(name="tags", refs={List.class,ModelServingTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ModelServingTag>> tags;

    public Output<Optional<List<ModelServingTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ModelServing(String name) {
        this(name, ModelServingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ModelServing(String name, ModelServingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ModelServing(String name, ModelServingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/modelServing:ModelServing", name, args == null ? ModelServingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ModelServing(String name, Output<String> id, @Nullable ModelServingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/modelServing:ModelServing", name, state, makeResourceOptions(options, id));
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
    public static ModelServing get(String name, Output<String> id, @Nullable ModelServingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ModelServing(name, id, state, options);
    }
}
