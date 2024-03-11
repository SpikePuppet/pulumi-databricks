// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Mapping of name to id of all metastores:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const all = databricks.getMetastores({});
 * export const allMetastores = all.then(all => all.ids);
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.Metastore to get information about a single metastore.
 * * databricks.Metastore to manage Metastores within Unity Catalog.
 * * databricks.Catalog to manage catalogs within Unity Catalog.
 */
export function getMetastores(args?: GetMetastoresArgs, opts?: pulumi.InvokeOptions): Promise<GetMetastoresResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getMetastores:getMetastores", {
        "ids": args.ids,
    }, opts);
}

/**
 * A collection of arguments for invoking getMetastores.
 */
export interface GetMetastoresArgs {
    /**
     * Mapping of name to id of databricks_metastore
     */
    ids?: {[key: string]: any};
}

/**
 * A collection of values returned by getMetastores.
 */
export interface GetMetastoresResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Mapping of name to id of databricks_metastore
     */
    readonly ids: {[key: string]: any};
}
/**
 * ## Example Usage
 *
 * Mapping of name to id of all metastores:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const all = databricks.getMetastores({});
 * export const allMetastores = all.then(all => all.ids);
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.Metastore to get information about a single metastore.
 * * databricks.Metastore to manage Metastores within Unity Catalog.
 * * databricks.Catalog to manage catalogs within Unity Catalog.
 */
export function getMetastoresOutput(args?: GetMetastoresOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetMetastoresResult> {
    return pulumi.output(args).apply((a: any) => getMetastores(a, opts))
}

/**
 * A collection of arguments for invoking getMetastores.
 */
export interface GetMetastoresOutputArgs {
    /**
     * Mapping of name to id of databricks_metastore
     */
    ids?: pulumi.Input<{[key: string]: any}>;
}
