// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Note** This resource could be only used with workspace-level provider!
 *
 * This resource allows you to create [Models in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const _this = new databricks.RegisteredModel("this", {
 *     catalogName: "main",
 *     schemaName: "default",
 * });
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
 * $ pulumi import databricks:index/registeredModel:RegisteredModel this <catalog_name.schema_name.model_name>
 * ```
 */
export class RegisteredModel extends pulumi.CustomResource {
    /**
     * Get an existing RegisteredModel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegisteredModelState, opts?: pulumi.CustomResourceOptions): RegisteredModel {
        return new RegisteredModel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/registeredModel:RegisteredModel';

    /**
     * Returns true if the given object is an instance of RegisteredModel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RegisteredModel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RegisteredModel.__pulumiType;
    }

    /**
     * The name of the catalog where the schema and the registered model reside.
     */
    public readonly catalogName!: pulumi.Output<string>;
    /**
     * The comment attached to the registered model.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The name of the registered model.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the schema where the registered model resides.
     */
    public readonly schemaName!: pulumi.Output<string>;
    public readonly storageLocation!: pulumi.Output<string>;

    /**
     * Create a RegisteredModel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RegisteredModelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RegisteredModelArgs | RegisteredModelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RegisteredModelState | undefined;
            resourceInputs["catalogName"] = state ? state.catalogName : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["schemaName"] = state ? state.schemaName : undefined;
            resourceInputs["storageLocation"] = state ? state.storageLocation : undefined;
        } else {
            const args = argsOrState as RegisteredModelArgs | undefined;
            if ((!args || args.catalogName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'catalogName'");
            }
            if ((!args || args.schemaName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schemaName'");
            }
            resourceInputs["catalogName"] = args ? args.catalogName : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["schemaName"] = args ? args.schemaName : undefined;
            resourceInputs["storageLocation"] = args ? args.storageLocation : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RegisteredModel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RegisteredModel resources.
 */
export interface RegisteredModelState {
    /**
     * The name of the catalog where the schema and the registered model reside.
     */
    catalogName?: pulumi.Input<string>;
    /**
     * The comment attached to the registered model.
     */
    comment?: pulumi.Input<string>;
    /**
     * The name of the registered model.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the schema where the registered model resides.
     */
    schemaName?: pulumi.Input<string>;
    storageLocation?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RegisteredModel resource.
 */
export interface RegisteredModelArgs {
    /**
     * The name of the catalog where the schema and the registered model reside.
     */
    catalogName: pulumi.Input<string>;
    /**
     * The comment attached to the registered model.
     */
    comment?: pulumi.Input<string>;
    /**
     * The name of the registered model.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the schema where the registered model resides.
     */
    schemaName: pulumi.Input<string>;
    storageLocation?: pulumi.Input<string>;
}
