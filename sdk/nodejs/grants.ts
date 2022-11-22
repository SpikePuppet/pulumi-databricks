// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class Grants extends pulumi.CustomResource {
    /**
     * Get an existing Grants resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GrantsState, opts?: pulumi.CustomResourceOptions): Grants {
        return new Grants(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/grants:Grants';

    /**
     * Returns true if the given object is an instance of Grants.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Grants {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Grants.__pulumiType;
    }

    public readonly catalog!: pulumi.Output<string | undefined>;
    public readonly externalLocation!: pulumi.Output<string | undefined>;
    public readonly function!: pulumi.Output<string | undefined>;
    public readonly grants!: pulumi.Output<outputs.GrantsGrant[]>;
    public readonly materializedView!: pulumi.Output<string | undefined>;
    public readonly metastore!: pulumi.Output<string | undefined>;
    public readonly schema!: pulumi.Output<string | undefined>;
    public readonly share!: pulumi.Output<string | undefined>;
    public readonly storageCredential!: pulumi.Output<string | undefined>;
    public readonly table!: pulumi.Output<string | undefined>;
    public readonly view!: pulumi.Output<string | undefined>;

    /**
     * Create a Grants resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GrantsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GrantsArgs | GrantsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GrantsState | undefined;
            resourceInputs["catalog"] = state ? state.catalog : undefined;
            resourceInputs["externalLocation"] = state ? state.externalLocation : undefined;
            resourceInputs["function"] = state ? state.function : undefined;
            resourceInputs["grants"] = state ? state.grants : undefined;
            resourceInputs["materializedView"] = state ? state.materializedView : undefined;
            resourceInputs["metastore"] = state ? state.metastore : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["share"] = state ? state.share : undefined;
            resourceInputs["storageCredential"] = state ? state.storageCredential : undefined;
            resourceInputs["table"] = state ? state.table : undefined;
            resourceInputs["view"] = state ? state.view : undefined;
        } else {
            const args = argsOrState as GrantsArgs | undefined;
            if ((!args || args.grants === undefined) && !opts.urn) {
                throw new Error("Missing required property 'grants'");
            }
            resourceInputs["catalog"] = args ? args.catalog : undefined;
            resourceInputs["externalLocation"] = args ? args.externalLocation : undefined;
            resourceInputs["function"] = args ? args.function : undefined;
            resourceInputs["grants"] = args ? args.grants : undefined;
            resourceInputs["materializedView"] = args ? args.materializedView : undefined;
            resourceInputs["metastore"] = args ? args.metastore : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["share"] = args ? args.share : undefined;
            resourceInputs["storageCredential"] = args ? args.storageCredential : undefined;
            resourceInputs["table"] = args ? args.table : undefined;
            resourceInputs["view"] = args ? args.view : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Grants.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Grants resources.
 */
export interface GrantsState {
    catalog?: pulumi.Input<string>;
    externalLocation?: pulumi.Input<string>;
    function?: pulumi.Input<string>;
    grants?: pulumi.Input<pulumi.Input<inputs.GrantsGrant>[]>;
    materializedView?: pulumi.Input<string>;
    metastore?: pulumi.Input<string>;
    schema?: pulumi.Input<string>;
    share?: pulumi.Input<string>;
    storageCredential?: pulumi.Input<string>;
    table?: pulumi.Input<string>;
    view?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Grants resource.
 */
export interface GrantsArgs {
    catalog?: pulumi.Input<string>;
    externalLocation?: pulumi.Input<string>;
    function?: pulumi.Input<string>;
    grants: pulumi.Input<pulumi.Input<inputs.GrantsGrant>[]>;
    materializedView?: pulumi.Input<string>;
    metastore?: pulumi.Input<string>;
    schema?: pulumi.Input<string>;
    share?: pulumi.Input<string>;
    storageCredential?: pulumi.Input<string>;
    table?: pulumi.Input<string>;
    view?: pulumi.Input<string>;
}
