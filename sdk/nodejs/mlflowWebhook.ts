// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource allows you to create [MLflow Model Registry Webhooks](https://docs.databricks.com/applications/mlflow/model-registry-webhooks.html) in Databricks.  Webhooks enable you to listen for Model Registry events so your integrations can automatically trigger actions. You can use webhooks to automate and integrate your machine learning pipeline with existing CI/CD tools and workflows. Webhooks allow trigger execution of a Databricks job or call a web service on specific event(s) that is generated in the MLflow Registry - stage transitioning, creation of registered model, creation of transition request, etc.
 *
 * ## Example Usage
 *
 * ### POSTing to URL
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const url = new databricks.MlflowWebhook("url", {
 *     description: "URL webhook trigger",
 *     events: ["TRANSITION_REQUEST_CREATED"],
 *     httpUrlSpec: {
 *         url: "https://my_cool_host/webhook",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
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
 * -> **Note** Importing this resource is not currently supported.
 */
export class MlflowWebhook extends pulumi.CustomResource {
    /**
     * Get an existing MlflowWebhook resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MlflowWebhookState, opts?: pulumi.CustomResourceOptions): MlflowWebhook {
        return new MlflowWebhook(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/mlflowWebhook:MlflowWebhook';

    /**
     * Returns true if the given object is an instance of MlflowWebhook.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MlflowWebhook {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MlflowWebhook.__pulumiType;
    }

    /**
     * Optional description of the MLflow webhook.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
     *
     * Configuration must include one of `httpUrlSpec` or `jobSpec` blocks, but not both.
     */
    public readonly events!: pulumi.Output<string[]>;
    public readonly httpUrlSpec!: pulumi.Output<outputs.MlflowWebhookHttpUrlSpec | undefined>;
    public readonly jobSpec!: pulumi.Output<outputs.MlflowWebhookJobSpec | undefined>;
    /**
     * Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
     */
    public readonly modelName!: pulumi.Output<string | undefined>;
    /**
     * Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
     */
    public readonly status!: pulumi.Output<string | undefined>;

    /**
     * Create a MlflowWebhook resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MlflowWebhookArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MlflowWebhookArgs | MlflowWebhookState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MlflowWebhookState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["events"] = state ? state.events : undefined;
            resourceInputs["httpUrlSpec"] = state ? state.httpUrlSpec : undefined;
            resourceInputs["jobSpec"] = state ? state.jobSpec : undefined;
            resourceInputs["modelName"] = state ? state.modelName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as MlflowWebhookArgs | undefined;
            if ((!args || args.events === undefined) && !opts.urn) {
                throw new Error("Missing required property 'events'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["events"] = args ? args.events : undefined;
            resourceInputs["httpUrlSpec"] = args ? args.httpUrlSpec : undefined;
            resourceInputs["jobSpec"] = args ? args.jobSpec : undefined;
            resourceInputs["modelName"] = args ? args.modelName : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MlflowWebhook.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MlflowWebhook resources.
 */
export interface MlflowWebhookState {
    /**
     * Optional description of the MLflow webhook.
     */
    description?: pulumi.Input<string>;
    /**
     * The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
     *
     * Configuration must include one of `httpUrlSpec` or `jobSpec` blocks, but not both.
     */
    events?: pulumi.Input<pulumi.Input<string>[]>;
    httpUrlSpec?: pulumi.Input<inputs.MlflowWebhookHttpUrlSpec>;
    jobSpec?: pulumi.Input<inputs.MlflowWebhookJobSpec>;
    /**
     * Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
     */
    modelName?: pulumi.Input<string>;
    /**
     * Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MlflowWebhook resource.
 */
export interface MlflowWebhookArgs {
    /**
     * Optional description of the MLflow webhook.
     */
    description?: pulumi.Input<string>;
    /**
     * The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
     *
     * Configuration must include one of `httpUrlSpec` or `jobSpec` blocks, but not both.
     */
    events: pulumi.Input<pulumi.Input<string>[]>;
    httpUrlSpec?: pulumi.Input<inputs.MlflowWebhookHttpUrlSpec>;
    jobSpec?: pulumi.Input<inputs.MlflowWebhookJobSpec>;
    /**
     * Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
     */
    modelName?: pulumi.Input<string>;
    /**
     * Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
     */
    status?: pulumi.Input<string>;
}
