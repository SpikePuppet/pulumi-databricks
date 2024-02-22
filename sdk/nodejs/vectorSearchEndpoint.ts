// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > **Note** This resource could be only used on Unity Catalog-enabled workspace!
 *
 * This resource allows you to create [Vector Search Endpoint](https://docs.databricks.com/en/generative-ai/vector-search.html) in Databricks.  Vector Search is a serverless similarity search engine that allows you to store a vector representation of your data, including metadata, in a vector database.  The Vector Search Endpoint is used to create and access vector search indexes.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const _this = new databricks.VectorSearchEndpoint("this", {endpointType: "STANDARD"});
 * ```
 *
 * ## Import
 *
 * The resource can be imported using the name of the Vector Search Endpoint
 *
 *  bash
 *
 * ```sh
 * $ pulumi import databricks:index/vectorSearchEndpoint:VectorSearchEndpoint this <endpoint-name>
 * ```
 */
export class VectorSearchEndpoint extends pulumi.CustomResource {
    /**
     * Get an existing VectorSearchEndpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VectorSearchEndpointState, opts?: pulumi.CustomResourceOptions): VectorSearchEndpoint {
        return new VectorSearchEndpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/vectorSearchEndpoint:VectorSearchEndpoint';

    /**
     * Returns true if the given object is an instance of VectorSearchEndpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VectorSearchEndpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VectorSearchEndpoint.__pulumiType;
    }

    /**
     * Timestamp of endpoint creation (milliseconds).
     */
    public /*out*/ readonly creationTimestamp!: pulumi.Output<number>;
    /**
     * Creator of the endpoint.
     */
    public /*out*/ readonly creator!: pulumi.Output<string>;
    /**
     * Unique internal identifier of the endpoint (UUID).
     */
    public /*out*/ readonly endpointId!: pulumi.Output<string>;
    /**
     * Object describing the current status of the endpoint consisting of following fields:
     */
    public /*out*/ readonly endpointStatuses!: pulumi.Output<outputs.VectorSearchEndpointEndpointStatus[]>;
    /**
     * type of Vector Search Endpoint.  Currently only accepting single value: `STANDARD` (See [documentation](https://docs.databricks.com/api/workspace/vectorsearchendpoints/createendpoint) for the list of currently supported values).  If it's changed, Vector Search Endpoint is recreated.
     */
    public readonly endpointType!: pulumi.Output<string>;
    /**
     * Timestamp of last update to the endpoint (milliseconds).
     */
    public /*out*/ readonly lastUpdatedTimestamp!: pulumi.Output<number>;
    /**
     * User who last updated the endpoint.
     */
    public /*out*/ readonly lastUpdatedUser!: pulumi.Output<string>;
    /**
     * Name of the Vector Search Endpoint to create.  If name is changed, Vector Search Endpoint is recreated.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Number of indexes on the endpoint.
     */
    public /*out*/ readonly numIndexes!: pulumi.Output<number>;

    /**
     * Create a VectorSearchEndpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VectorSearchEndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VectorSearchEndpointArgs | VectorSearchEndpointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VectorSearchEndpointState | undefined;
            resourceInputs["creationTimestamp"] = state ? state.creationTimestamp : undefined;
            resourceInputs["creator"] = state ? state.creator : undefined;
            resourceInputs["endpointId"] = state ? state.endpointId : undefined;
            resourceInputs["endpointStatuses"] = state ? state.endpointStatuses : undefined;
            resourceInputs["endpointType"] = state ? state.endpointType : undefined;
            resourceInputs["lastUpdatedTimestamp"] = state ? state.lastUpdatedTimestamp : undefined;
            resourceInputs["lastUpdatedUser"] = state ? state.lastUpdatedUser : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["numIndexes"] = state ? state.numIndexes : undefined;
        } else {
            const args = argsOrState as VectorSearchEndpointArgs | undefined;
            if ((!args || args.endpointType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'endpointType'");
            }
            resourceInputs["endpointType"] = args ? args.endpointType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["creationTimestamp"] = undefined /*out*/;
            resourceInputs["creator"] = undefined /*out*/;
            resourceInputs["endpointId"] = undefined /*out*/;
            resourceInputs["endpointStatuses"] = undefined /*out*/;
            resourceInputs["lastUpdatedTimestamp"] = undefined /*out*/;
            resourceInputs["lastUpdatedUser"] = undefined /*out*/;
            resourceInputs["numIndexes"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VectorSearchEndpoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VectorSearchEndpoint resources.
 */
export interface VectorSearchEndpointState {
    /**
     * Timestamp of endpoint creation (milliseconds).
     */
    creationTimestamp?: pulumi.Input<number>;
    /**
     * Creator of the endpoint.
     */
    creator?: pulumi.Input<string>;
    /**
     * Unique internal identifier of the endpoint (UUID).
     */
    endpointId?: pulumi.Input<string>;
    /**
     * Object describing the current status of the endpoint consisting of following fields:
     */
    endpointStatuses?: pulumi.Input<pulumi.Input<inputs.VectorSearchEndpointEndpointStatus>[]>;
    /**
     * type of Vector Search Endpoint.  Currently only accepting single value: `STANDARD` (See [documentation](https://docs.databricks.com/api/workspace/vectorsearchendpoints/createendpoint) for the list of currently supported values).  If it's changed, Vector Search Endpoint is recreated.
     */
    endpointType?: pulumi.Input<string>;
    /**
     * Timestamp of last update to the endpoint (milliseconds).
     */
    lastUpdatedTimestamp?: pulumi.Input<number>;
    /**
     * User who last updated the endpoint.
     */
    lastUpdatedUser?: pulumi.Input<string>;
    /**
     * Name of the Vector Search Endpoint to create.  If name is changed, Vector Search Endpoint is recreated.
     */
    name?: pulumi.Input<string>;
    /**
     * Number of indexes on the endpoint.
     */
    numIndexes?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a VectorSearchEndpoint resource.
 */
export interface VectorSearchEndpointArgs {
    /**
     * type of Vector Search Endpoint.  Currently only accepting single value: `STANDARD` (See [documentation](https://docs.databricks.com/api/workspace/vectorsearchendpoints/createendpoint) for the list of currently supported values).  If it's changed, Vector Search Endpoint is recreated.
     */
    endpointType: pulumi.Input<string>;
    /**
     * Name of the Vector Search Endpoint to create.  If name is changed, Vector Search Endpoint is recreated.
     */
    name?: pulumi.Input<string>;
}
