// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > **Note** This resource could be only used on Unity Catalog-enabled workspace!
 *
 * This resource allows you to create [Vector Search Index](https://docs.databricks.com/en/generative-ai/create-query-vector-search.html) in Databricks.  Vector Search is a serverless similarity search engine that allows you to store a vector representation of your data, including metadata, in a vector database.  The Vector Search Index provides the ability to search data in the linked Delta Table.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const sync = new databricks.VectorSearchIndex("sync", {
 *     endpointName: databricks_vector_search_endpoint["this"].name,
 *     primaryKey: "id",
 *     indexType: "DELTA_SYNC",
 *     deltaSyncIndexSpec: {
 *         sourceTable: "main.default.source_table",
 *         pipelineType: "TRIGGERED",
 *         embeddingSourceColumns: [{
 *             name: "text",
 *             embeddingModelEndpointName: databricks_model_serving["this"].name,
 *         }],
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * The resource can be imported using the name of the Vector Search Index
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/vectorSearchIndex:VectorSearchIndex this <index-name>
 * ```
 */
export class VectorSearchIndex extends pulumi.CustomResource {
    /**
     * Get an existing VectorSearchIndex resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VectorSearchIndexState, opts?: pulumi.CustomResourceOptions): VectorSearchIndex {
        return new VectorSearchIndex(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/vectorSearchIndex:VectorSearchIndex';

    /**
     * Returns true if the given object is an instance of VectorSearchIndex.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VectorSearchIndex {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VectorSearchIndex.__pulumiType;
    }

    /**
     * Creator of the endpoint.
     */
    public /*out*/ readonly creator!: pulumi.Output<string>;
    /**
     * Specification for Delta Sync Index. Required if `indexType` is `DELTA_SYNC`.
     */
    public readonly deltaSyncIndexSpec!: pulumi.Output<outputs.VectorSearchIndexDeltaSyncIndexSpec | undefined>;
    /**
     * Specification for Direct Vector Access Index. Required if `indexType` is `DIRECT_ACCESS`.
     */
    public readonly directAccessIndexSpec!: pulumi.Output<outputs.VectorSearchIndexDirectAccessIndexSpec | undefined>;
    /**
     * The name of the Vector Search Endpoint that will be used for indexing the data.
     */
    public readonly endpointName!: pulumi.Output<string>;
    /**
     * Vector Search index type. Currently supported values are:
     */
    public readonly indexType!: pulumi.Output<string>;
    /**
     * The name of the column.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The column name that will be used as a primary key.
     */
    public readonly primaryKey!: pulumi.Output<string>;
    /**
     * Object describing the current status of the index consisting of the following fields:
     */
    public /*out*/ readonly statuses!: pulumi.Output<outputs.VectorSearchIndexStatus[]>;

    /**
     * Create a VectorSearchIndex resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VectorSearchIndexArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VectorSearchIndexArgs | VectorSearchIndexState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VectorSearchIndexState | undefined;
            resourceInputs["creator"] = state ? state.creator : undefined;
            resourceInputs["deltaSyncIndexSpec"] = state ? state.deltaSyncIndexSpec : undefined;
            resourceInputs["directAccessIndexSpec"] = state ? state.directAccessIndexSpec : undefined;
            resourceInputs["endpointName"] = state ? state.endpointName : undefined;
            resourceInputs["indexType"] = state ? state.indexType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["primaryKey"] = state ? state.primaryKey : undefined;
            resourceInputs["statuses"] = state ? state.statuses : undefined;
        } else {
            const args = argsOrState as VectorSearchIndexArgs | undefined;
            if ((!args || args.endpointName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'endpointName'");
            }
            if ((!args || args.indexType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'indexType'");
            }
            if ((!args || args.primaryKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'primaryKey'");
            }
            resourceInputs["deltaSyncIndexSpec"] = args ? args.deltaSyncIndexSpec : undefined;
            resourceInputs["directAccessIndexSpec"] = args ? args.directAccessIndexSpec : undefined;
            resourceInputs["endpointName"] = args ? args.endpointName : undefined;
            resourceInputs["indexType"] = args ? args.indexType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["primaryKey"] = args ? args.primaryKey : undefined;
            resourceInputs["creator"] = undefined /*out*/;
            resourceInputs["statuses"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VectorSearchIndex.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VectorSearchIndex resources.
 */
export interface VectorSearchIndexState {
    /**
     * Creator of the endpoint.
     */
    creator?: pulumi.Input<string>;
    /**
     * Specification for Delta Sync Index. Required if `indexType` is `DELTA_SYNC`.
     */
    deltaSyncIndexSpec?: pulumi.Input<inputs.VectorSearchIndexDeltaSyncIndexSpec>;
    /**
     * Specification for Direct Vector Access Index. Required if `indexType` is `DIRECT_ACCESS`.
     */
    directAccessIndexSpec?: pulumi.Input<inputs.VectorSearchIndexDirectAccessIndexSpec>;
    /**
     * The name of the Vector Search Endpoint that will be used for indexing the data.
     */
    endpointName?: pulumi.Input<string>;
    /**
     * Vector Search index type. Currently supported values are:
     */
    indexType?: pulumi.Input<string>;
    /**
     * The name of the column.
     */
    name?: pulumi.Input<string>;
    /**
     * The column name that will be used as a primary key.
     */
    primaryKey?: pulumi.Input<string>;
    /**
     * Object describing the current status of the index consisting of the following fields:
     */
    statuses?: pulumi.Input<pulumi.Input<inputs.VectorSearchIndexStatus>[]>;
}

/**
 * The set of arguments for constructing a VectorSearchIndex resource.
 */
export interface VectorSearchIndexArgs {
    /**
     * Specification for Delta Sync Index. Required if `indexType` is `DELTA_SYNC`.
     */
    deltaSyncIndexSpec?: pulumi.Input<inputs.VectorSearchIndexDeltaSyncIndexSpec>;
    /**
     * Specification for Direct Vector Access Index. Required if `indexType` is `DIRECT_ACCESS`.
     */
    directAccessIndexSpec?: pulumi.Input<inputs.VectorSearchIndexDirectAccessIndexSpec>;
    /**
     * The name of the Vector Search Endpoint that will be used for indexing the data.
     */
    endpointName: pulumi.Input<string>;
    /**
     * Vector Search index type. Currently supported values are:
     */
    indexType: pulumi.Input<string>;
    /**
     * The name of the column.
     */
    name?: pulumi.Input<string>;
    /**
     * The column name that will be used as a primary key.
     */
    primaryKey: pulumi.Input<string>;
}
