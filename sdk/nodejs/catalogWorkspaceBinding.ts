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
 *     name: "sandbox",
 *     isolationMode: "ISOLATED",
 * });
 * const sandboxCatalogWorkspaceBinding = new databricks.CatalogWorkspaceBinding("sandbox", {
 *     securableName: sandbox.name,
 *     workspaceId: other.workspaceId,
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported by using combination of workspace ID, securable type and name:
 *
 * ```sh
 * $ pulumi import databricks:index/catalogWorkspaceBinding:CatalogWorkspaceBinding this "<workspace_id>|<securable_type>|<securable_name>"
 * ```
 */
export class CatalogWorkspaceBinding extends pulumi.CustomResource {
    /**
     * Get an existing CatalogWorkspaceBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CatalogWorkspaceBindingState, opts?: pulumi.CustomResourceOptions): CatalogWorkspaceBinding {
        return new CatalogWorkspaceBinding(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/catalogWorkspaceBinding:CatalogWorkspaceBinding';

    /**
     * Returns true if the given object is an instance of CatalogWorkspaceBinding.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CatalogWorkspaceBinding {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CatalogWorkspaceBinding.__pulumiType;
    }

    /**
     * Binding mode. Default to `BINDING_TYPE_READ_WRITE`. Possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`
     */
    public readonly bindingType!: pulumi.Output<string | undefined>;
    /**
     * @deprecated Please use 'securable_name' and 'securable_type instead.
     */
    public readonly catalogName!: pulumi.Output<string | undefined>;
    /**
     * Name of securable. Change forces creation of a new resource.
     */
    public readonly securableName!: pulumi.Output<string | undefined>;
    /**
     * Type of securable. Default to `catalog`. Change forces creation of a new resource.
     */
    public readonly securableType!: pulumi.Output<string | undefined>;
    /**
     * ID of the workspace. Change forces creation of a new resource.
     */
    public readonly workspaceId!: pulumi.Output<string | undefined>;

    /**
     * Create a CatalogWorkspaceBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: CatalogWorkspaceBindingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CatalogWorkspaceBindingArgs | CatalogWorkspaceBindingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CatalogWorkspaceBindingState | undefined;
            resourceInputs["bindingType"] = state ? state.bindingType : undefined;
            resourceInputs["catalogName"] = state ? state.catalogName : undefined;
            resourceInputs["securableName"] = state ? state.securableName : undefined;
            resourceInputs["securableType"] = state ? state.securableType : undefined;
            resourceInputs["workspaceId"] = state ? state.workspaceId : undefined;
        } else {
            const args = argsOrState as CatalogWorkspaceBindingArgs | undefined;
            resourceInputs["bindingType"] = args ? args.bindingType : undefined;
            resourceInputs["catalogName"] = args ? args.catalogName : undefined;
            resourceInputs["securableName"] = args ? args.securableName : undefined;
            resourceInputs["securableType"] = args ? args.securableType : undefined;
            resourceInputs["workspaceId"] = args ? args.workspaceId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CatalogWorkspaceBinding.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CatalogWorkspaceBinding resources.
 */
export interface CatalogWorkspaceBindingState {
    /**
     * Binding mode. Default to `BINDING_TYPE_READ_WRITE`. Possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`
     */
    bindingType?: pulumi.Input<string>;
    /**
     * @deprecated Please use 'securable_name' and 'securable_type instead.
     */
    catalogName?: pulumi.Input<string>;
    /**
     * Name of securable. Change forces creation of a new resource.
     */
    securableName?: pulumi.Input<string>;
    /**
     * Type of securable. Default to `catalog`. Change forces creation of a new resource.
     */
    securableType?: pulumi.Input<string>;
    /**
     * ID of the workspace. Change forces creation of a new resource.
     */
    workspaceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CatalogWorkspaceBinding resource.
 */
export interface CatalogWorkspaceBindingArgs {
    /**
     * Binding mode. Default to `BINDING_TYPE_READ_WRITE`. Possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`
     */
    bindingType?: pulumi.Input<string>;
    /**
     * @deprecated Please use 'securable_name' and 'securable_type instead.
     */
    catalogName?: pulumi.Input<string>;
    /**
     * Name of securable. Change forces creation of a new resource.
     */
    securableName?: pulumi.Input<string>;
    /**
     * Type of securable. Default to `catalog`. Change forces creation of a new resource.
     */
    securableType?: pulumi.Input<string>;
    /**
     * ID of the workspace. Change forces creation of a new resource.
     */
    workspaceId?: pulumi.Input<string>;
}
