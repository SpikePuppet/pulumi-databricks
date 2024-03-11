// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * The resource notebook can be imported using notebook path
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/notebook:Notebook this /path/to/notebook
 * ```
 */
export class Notebook extends pulumi.CustomResource {
    /**
     * Get an existing Notebook resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NotebookState, opts?: pulumi.CustomResourceOptions): Notebook {
        return new Notebook(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/notebook:Notebook';

    /**
     * Returns true if the given object is an instance of Notebook.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Notebook {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Notebook.__pulumiType;
    }

    public readonly contentBase64!: pulumi.Output<string | undefined>;
    public readonly format!: pulumi.Output<string | undefined>;
    /**
     * One of `SCALA`, `PYTHON`, `SQL`, `R`.
     */
    public readonly language!: pulumi.Output<string | undefined>;
    public readonly md5!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier for a NOTEBOOK
     */
    public readonly objectId!: pulumi.Output<number>;
    /**
     * @deprecated Always is a notebook
     */
    public readonly objectType!: pulumi.Output<string>;
    /**
     * The absolute path of the notebook or directory, beginning with "/", e.g. "/Demo".
     */
    public readonly path!: pulumi.Output<string>;
    /**
     * Path to notebook in source code format on local filesystem. Conflicts with `contentBase64`.
     */
    public readonly source!: pulumi.Output<string | undefined>;
    /**
     * Routable URL of the notebook
     */
    public /*out*/ readonly url!: pulumi.Output<string>;

    /**
     * Create a Notebook resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NotebookArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NotebookArgs | NotebookState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NotebookState | undefined;
            resourceInputs["contentBase64"] = state ? state.contentBase64 : undefined;
            resourceInputs["format"] = state ? state.format : undefined;
            resourceInputs["language"] = state ? state.language : undefined;
            resourceInputs["md5"] = state ? state.md5 : undefined;
            resourceInputs["objectId"] = state ? state.objectId : undefined;
            resourceInputs["objectType"] = state ? state.objectType : undefined;
            resourceInputs["path"] = state ? state.path : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as NotebookArgs | undefined;
            if ((!args || args.path === undefined) && !opts.urn) {
                throw new Error("Missing required property 'path'");
            }
            resourceInputs["contentBase64"] = args ? args.contentBase64 : undefined;
            resourceInputs["format"] = args ? args.format : undefined;
            resourceInputs["language"] = args ? args.language : undefined;
            resourceInputs["md5"] = args ? args.md5 : undefined;
            resourceInputs["objectId"] = args ? args.objectId : undefined;
            resourceInputs["objectType"] = args ? args.objectType : undefined;
            resourceInputs["path"] = args ? args.path : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["url"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Notebook.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Notebook resources.
 */
export interface NotebookState {
    contentBase64?: pulumi.Input<string>;
    format?: pulumi.Input<string>;
    /**
     * One of `SCALA`, `PYTHON`, `SQL`, `R`.
     */
    language?: pulumi.Input<string>;
    md5?: pulumi.Input<string>;
    /**
     * Unique identifier for a NOTEBOOK
     */
    objectId?: pulumi.Input<number>;
    /**
     * @deprecated Always is a notebook
     */
    objectType?: pulumi.Input<string>;
    /**
     * The absolute path of the notebook or directory, beginning with "/", e.g. "/Demo".
     */
    path?: pulumi.Input<string>;
    /**
     * Path to notebook in source code format on local filesystem. Conflicts with `contentBase64`.
     */
    source?: pulumi.Input<string>;
    /**
     * Routable URL of the notebook
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Notebook resource.
 */
export interface NotebookArgs {
    contentBase64?: pulumi.Input<string>;
    format?: pulumi.Input<string>;
    /**
     * One of `SCALA`, `PYTHON`, `SQL`, `R`.
     */
    language?: pulumi.Input<string>;
    md5?: pulumi.Input<string>;
    /**
     * Unique identifier for a NOTEBOOK
     */
    objectId?: pulumi.Input<number>;
    /**
     * @deprecated Always is a notebook
     */
    objectType?: pulumi.Input<string>;
    /**
     * The absolute path of the notebook or directory, beginning with "/", e.g. "/Demo".
     */
    path: pulumi.Input<string>;
    /**
     * Path to notebook in source code format on local filesystem. Conflicts with `contentBase64`.
     */
    source?: pulumi.Input<string>;
}
