// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MlflowExperimentArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MlflowExperimentState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.MlflowExperiment;
 * import com.pulumi.databricks.MlflowExperimentArgs;
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
 *         final var me = DatabricksFunctions.getCurrentUser();
 * 
 *         var this_ = new MlflowExperiment("this", MlflowExperimentArgs.builder()
 *             .name(String.format("%s/Sample", me.applyValue(getCurrentUserResult -> getCurrentUserResult.home())))
 *             .artifactLocation("dbfs:/tmp/my-experiment")
 *             .description("My MLflow experiment description")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Access Control
 * 
 * * databricks.Permissions can control which groups or individual users can *Read*, *Edit*, or *Manage* individual experiments.
 * 
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * databricks.RegisteredModel to create [Models in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.
 * * End to end workspace management guide.
 * * databricks.Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
 * * databricks.MlflowModel to create models in the [workspace model registry](https://docs.databricks.com/en/mlflow/model-registry.html) in Databricks.
 * * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
 * * databricks.Notebook data to export a notebook from Databricks Workspace.
 * * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
 * 
 * ## Import
 * 
 * The experiment resource can be imported using the id of the experiment
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/mlflowExperiment:MlflowExperiment this &lt;experiment-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/mlflowExperiment:MlflowExperiment")
public class MlflowExperiment extends com.pulumi.resources.CustomResource {
    /**
     * Path to dbfs:/ or s3:// artifact location of the MLflow experiment.
     * 
     */
    @Export(name="artifactLocation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> artifactLocation;

    /**
     * @return Path to dbfs:/ or s3:// artifact location of the MLflow experiment.
     * 
     */
    public Output<Optional<String>> artifactLocation() {
        return Codegen.optional(this.artifactLocation);
    }
    @Export(name="creationTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> creationTime;

    public Output<Integer> creationTime() {
        return this.creationTime;
    }
    /**
     * The description of the MLflow experiment.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the MLflow experiment.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="experimentId", refs={String.class}, tree="[0]")
    private Output<String> experimentId;

    public Output<String> experimentId() {
        return this.experimentId;
    }
    @Export(name="lastUpdateTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> lastUpdateTime;

    public Output<Integer> lastUpdateTime() {
        return this.lastUpdateTime;
    }
    @Export(name="lifecycleStage", refs={String.class}, tree="[0]")
    private Output<String> lifecycleStage;

    public Output<String> lifecycleStage() {
        return this.lifecycleStage;
    }
    /**
     * Name of MLflow experiment. It must be an absolute path within the Databricks workspace, e.g. `/Users/&lt;some-username&gt;/my-experiment`. For more information about changes to experiment naming conventions, see [mlflow docs](https://docs.databricks.com/applications/mlflow/experiments.html#experiment-migration).
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of MLflow experiment. It must be an absolute path within the Databricks workspace, e.g. `/Users/&lt;some-username&gt;/my-experiment`. For more information about changes to experiment naming conventions, see [mlflow docs](https://docs.databricks.com/applications/mlflow/experiments.html#experiment-migration).
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MlflowExperiment(String name) {
        this(name, MlflowExperimentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MlflowExperiment(String name, @Nullable MlflowExperimentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MlflowExperiment(String name, @Nullable MlflowExperimentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mlflowExperiment:MlflowExperiment", name, args == null ? MlflowExperimentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MlflowExperiment(String name, Output<String> id, @Nullable MlflowExperimentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mlflowExperiment:MlflowExperiment", name, state, makeResourceOptions(options, id));
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
    public static MlflowExperiment get(String name, Output<String> id, @Nullable MlflowExperimentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MlflowExperiment(name, id, state, options);
    }
}
