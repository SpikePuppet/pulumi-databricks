// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Public Preview** This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html).
 *
 * > **Note** This resource could be only used with workspace-level provider!
 *
 * Manages system tables enablement. System tables are a Databricks-hosted analytical store of your account’s operational data. System tables can be used for historical observability across your account. System tables must be enabled by an account admin.
 *
 * ## Example Usage
 *
 * Enable the system schema `access`
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const _this = new databricks.SystemSchema("this", {schema: "access"});
 * ```
 *
 * ## Import
 *
 * This resource can be imported by the metastore id and schema name
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/systemSchema:SystemSchema this '<metastore_id>|<schema_name>'
 * ```
 */
export class SystemSchema extends pulumi.CustomResource {
    /**
     * Get an existing SystemSchema resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SystemSchemaState, opts?: pulumi.CustomResourceOptions): SystemSchema {
        return new SystemSchema(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/systemSchema:SystemSchema';

    /**
     * Returns true if the given object is an instance of SystemSchema.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SystemSchema {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SystemSchema.__pulumiType;
    }

    /**
     * the full name of the system schema, in form of `system.<schema>`.
     */
    public /*out*/ readonly fullName!: pulumi.Output<string>;
    public /*out*/ readonly metastoreId!: pulumi.Output<string>;
    /**
     * name of the system schema.
     */
    public readonly schema!: pulumi.Output<string | undefined>;
    /**
     * The current state of enablement for the system schema.
     */
    public readonly state!: pulumi.Output<string>;

    /**
     * Create a SystemSchema resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SystemSchemaArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SystemSchemaArgs | SystemSchemaState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SystemSchemaState | undefined;
            resourceInputs["fullName"] = state ? state.fullName : undefined;
            resourceInputs["metastoreId"] = state ? state.metastoreId : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
        } else {
            const args = argsOrState as SystemSchemaArgs | undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["state"] = args ? args.state : undefined;
            resourceInputs["fullName"] = undefined /*out*/;
            resourceInputs["metastoreId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SystemSchema.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SystemSchema resources.
 */
export interface SystemSchemaState {
    /**
     * the full name of the system schema, in form of `system.<schema>`.
     */
    fullName?: pulumi.Input<string>;
    metastoreId?: pulumi.Input<string>;
    /**
     * name of the system schema.
     */
    schema?: pulumi.Input<string>;
    /**
     * The current state of enablement for the system schema.
     */
    state?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SystemSchema resource.
 */
export interface SystemSchemaArgs {
    /**
     * name of the system schema.
     */
    schema?: pulumi.Input<string>;
    /**
     * The current state of enablement for the system schema.
     */
    state?: pulumi.Input<string>;
}
