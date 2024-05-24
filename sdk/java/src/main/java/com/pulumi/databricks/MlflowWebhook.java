// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MlflowWebhookArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MlflowWebhookState;
import com.pulumi.databricks.outputs.MlflowWebhookHttpUrlSpec;
import com.pulumi.databricks.outputs.MlflowWebhookJobSpec;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to create [MLflow Model Registry Webhooks](https://docs.databricks.com/applications/mlflow/model-registry-webhooks.html) in Databricks.  Webhooks enable you to listen for Model Registry events so your integrations can automatically trigger actions. You can use webhooks to automate and integrate your machine learning pipeline with existing CI/CD tools and workflows. Webhooks allow trigger execution of a Databricks job or call a web service on specific event(s) that is generated in the MLflow Registry - stage transitioning, creation of registered model, creation of transition request, etc.
 * 
 * ## Example Usage
 * 
 * ### Triggering Databricks job
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
 * import com.pulumi.databricks.inputs.GetSparkVersionArgs;
 * import com.pulumi.databricks.inputs.GetNodeTypeArgs;
 * import com.pulumi.databricks.Notebook;
 * import com.pulumi.databricks.NotebookArgs;
 * import com.pulumi.databricks.Job;
 * import com.pulumi.databricks.JobArgs;
 * import com.pulumi.databricks.inputs.JobTaskArgs;
 * import com.pulumi.databricks.inputs.JobTaskNewClusterArgs;
 * import com.pulumi.databricks.inputs.JobTaskNotebookTaskArgs;
 * import com.pulumi.databricks.Token;
 * import com.pulumi.databricks.TokenArgs;
 * import com.pulumi.databricks.MlflowWebhook;
 * import com.pulumi.databricks.MlflowWebhookArgs;
 * import com.pulumi.databricks.inputs.MlflowWebhookJobSpecArgs;
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
 *         final var latest = DatabricksFunctions.getSparkVersion();
 * 
 *         final var smallest = DatabricksFunctions.getNodeType(GetNodeTypeArgs.builder()
 *             .localDisk(true)
 *             .build());
 * 
 *         var this_ = new Notebook("this", NotebookArgs.builder()
 *             .path(String.format("%s/MLFlowWebhook", me.applyValue(getCurrentUserResult -> getCurrentUserResult.home())))
 *             .language("PYTHON")
 *             .contentBase64(StdFunctions.base64encode(Base64encodeArgs.builder()
 *                 .input("""
 * import json
 *  
 * event_message = dbutils.widgets.get("event_message")
 * event_message_dict = json.loads(event_message)
 * print(f"event data={event_message_dict}")
 *                 """)
 *                 .build()).result())
 *             .build());
 * 
 *         var thisJob = new Job("thisJob", JobArgs.builder()
 *             .name(String.format("Terraform MLflowWebhook Demo (%s)", me.applyValue(getCurrentUserResult -> getCurrentUserResult.alphanumeric())))
 *             .tasks(JobTaskArgs.builder()
 *                 .taskKey("task1")
 *                 .newCluster(JobTaskNewClusterArgs.builder()
 *                     .numWorkers(1)
 *                     .sparkVersion(latest.applyValue(getSparkVersionResult -> getSparkVersionResult.id()))
 *                     .nodeTypeId(smallest.applyValue(getNodeTypeResult -> getNodeTypeResult.id()))
 *                     .build())
 *                 .notebookTask(JobTaskNotebookTaskArgs.builder()
 *                     .notebookPath(this_.path())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var patForWebhook = new Token("patForWebhook", TokenArgs.builder()
 *             .comment("MLflow Webhook")
 *             .lifetimeSeconds(86400000)
 *             .build());
 * 
 *         var job = new MlflowWebhook("job", MlflowWebhookArgs.builder()
 *             .events("TRANSITION_REQUEST_CREATED")
 *             .description("Databricks Job webhook trigger")
 *             .status("ACTIVE")
 *             .jobSpec(MlflowWebhookJobSpecArgs.builder()
 *                 .jobId(thisJob.id())
 *                 .workspaceUrl(me.applyValue(getCurrentUserResult -> getCurrentUserResult.workspaceUrl()))
 *                 .accessToken(patForWebhook.tokenValue())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### POSTing to URL
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.MlflowWebhook;
 * import com.pulumi.databricks.MlflowWebhookArgs;
 * import com.pulumi.databricks.inputs.MlflowWebhookHttpUrlSpecArgs;
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
 *         var url = new MlflowWebhook("url", MlflowWebhookArgs.builder()
 *             .events("TRANSITION_REQUEST_CREATED")
 *             .description("URL webhook trigger")
 *             .httpUrlSpec(MlflowWebhookHttpUrlSpecArgs.builder()
 *                 .url("https://my_cool_host/webhook")
 *                 .build())
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
 * * MLflow webhooks could be configured only by workspace admins.
 * 
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * End to end workspace management guide.
 * * databricks.Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
 * * databricks.MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
 * * databricks.MlflowModel to create [MLflow models](https://docs.databricks.com/applications/mlflow/models.html) in Databricks.
 * * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
 * * databricks.Notebook data to export a notebook from Databricks Workspace.
 * * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
 * 
 * ## Import
 * 
 * -&gt; **Note** Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/mlflowWebhook:MlflowWebhook")
public class MlflowWebhook extends com.pulumi.resources.CustomResource {
    /**
     * Optional description of the MLflow webhook.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Optional description of the MLflow webhook.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
     * 
     * Configuration must include one of `http_url_spec` or `job_spec` blocks, but not both.
     * 
     */
    @Export(name="events", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> events;

    /**
     * @return The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
     * 
     * Configuration must include one of `http_url_spec` or `job_spec` blocks, but not both.
     * 
     */
    public Output<List<String>> events() {
        return this.events;
    }
    @Export(name="httpUrlSpec", refs={MlflowWebhookHttpUrlSpec.class}, tree="[0]")
    private Output</* @Nullable */ MlflowWebhookHttpUrlSpec> httpUrlSpec;

    public Output<Optional<MlflowWebhookHttpUrlSpec>> httpUrlSpec() {
        return Codegen.optional(this.httpUrlSpec);
    }
    @Export(name="jobSpec", refs={MlflowWebhookJobSpec.class}, tree="[0]")
    private Output</* @Nullable */ MlflowWebhookJobSpec> jobSpec;

    public Output<Optional<MlflowWebhookJobSpec>> jobSpec() {
        return Codegen.optional(this.jobSpec);
    }
    /**
     * Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
     * 
     */
    @Export(name="modelName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> modelName;

    /**
     * @return Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
     * 
     */
    public Output<Optional<String>> modelName() {
        return Codegen.optional(this.modelName);
    }
    /**
     * Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> status;

    /**
     * @return Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MlflowWebhook(String name) {
        this(name, MlflowWebhookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MlflowWebhook(String name, MlflowWebhookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MlflowWebhook(String name, MlflowWebhookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mlflowWebhook:MlflowWebhook", name, args == null ? MlflowWebhookArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MlflowWebhook(String name, Output<String> id, @Nullable MlflowWebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mlflowWebhook:MlflowWebhook", name, state, makeResourceOptions(options, id));
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
    public static MlflowWebhook get(String name, Output<String> id, @Nullable MlflowWebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MlflowWebhook(name, id, state, options);
    }
}
