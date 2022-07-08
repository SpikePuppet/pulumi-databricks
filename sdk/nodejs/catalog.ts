// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const sandbox = new databricks.Catalog("sandbox", {
 *     metastoreId: databricks_metastore["this"].id,
 *     comment: "this catalog is managed by terraform",
 *     properties: {
 *         purpose: "testing",
 *     },
 * });
 * ```
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.Table data to list tables within Unity Catalog.
 * * databricks.Schema data to list schemas within Unity Catalog.
 * * databricks.Catalog data to list catalogs within Unity Catalog.
 *
 * ## Import
 *
 * This resource can be imported by namebash
 *
 * ```sh
 *  $ pulumi import databricks:index/catalog:Catalog this <name>
 * ```
 */
export class Catalog extends pulumi.CustomResource {
    /**
     * Get an existing Catalog resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CatalogState, opts?: pulumi.CustomResourceOptions): Catalog {
        return new Catalog(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/catalog:Catalog';

    /**
     * Returns true if the given object is an instance of Catalog.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Catalog {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Catalog.__pulumiType;
    }

    /**
     * User-supplied free-form text.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    public readonly metastoreId!: pulumi.Output<string>;
    /**
     * Name of Catalog relative to parent metastore. Change forces creation of a new resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Username/groupname/sp applicationId catalog owner.
     */
    public readonly owner!: pulumi.Output<string>;
    /**
     * Extensible Catalog properties.
     */
    public readonly properties!: pulumi.Output<{[key: string]: any} | undefined>;

    /**
     * Create a Catalog resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: CatalogArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CatalogArgs | CatalogState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CatalogState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["metastoreId"] = state ? state.metastoreId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["owner"] = state ? state.owner : undefined;
            resourceInputs["properties"] = state ? state.properties : undefined;
        } else {
            const args = argsOrState as CatalogArgs | undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["metastoreId"] = args ? args.metastoreId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["owner"] = args ? args.owner : undefined;
            resourceInputs["properties"] = args ? args.properties : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Catalog.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Catalog resources.
 */
export interface CatalogState {
    /**
     * User-supplied free-form text.
     */
    comment?: pulumi.Input<string>;
    metastoreId?: pulumi.Input<string>;
    /**
     * Name of Catalog relative to parent metastore. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Username/groupname/sp applicationId catalog owner.
     */
    owner?: pulumi.Input<string>;
    /**
     * Extensible Catalog properties.
     */
    properties?: pulumi.Input<{[key: string]: any}>;
}

/**
 * The set of arguments for constructing a Catalog resource.
 */
export interface CatalogArgs {
    /**
     * User-supplied free-form text.
     */
    comment?: pulumi.Input<string>;
    metastoreId?: pulumi.Input<string>;
    /**
     * Name of Catalog relative to parent metastore. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Username/groupname/sp applicationId catalog owner.
     */
    owner?: pulumi.Input<string>;
    /**
     * Extensible Catalog properties.
     */
    properties?: pulumi.Input<{[key: string]: any}>;
}
