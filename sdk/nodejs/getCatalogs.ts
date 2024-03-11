// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Listing all catalogs:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const all = databricks.getCatalogs({});
 * export const allCatalogs = all;
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.Schema to manage schemas within Unity Catalog.
 * * databricks.Catalog to manage catalogs within Unity Catalog.
 */
export function getCatalogs(args?: GetCatalogsArgs, opts?: pulumi.InvokeOptions): Promise<GetCatalogsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getCatalogs:getCatalogs", {
        "ids": args.ids,
    }, opts);
}

/**
 * A collection of arguments for invoking getCatalogs.
 */
export interface GetCatalogsArgs {
    /**
     * set of databricks.Catalog names
     */
    ids?: string[];
}

/**
 * A collection of values returned by getCatalogs.
 */
export interface GetCatalogsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * set of databricks.Catalog names
     */
    readonly ids: string[];
}
/**
 * ## Example Usage
 *
 * Listing all catalogs:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const all = databricks.getCatalogs({});
 * export const allCatalogs = all;
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.Schema to manage schemas within Unity Catalog.
 * * databricks.Catalog to manage catalogs within Unity Catalog.
 */
export function getCatalogsOutput(args?: GetCatalogsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCatalogsResult> {
    return pulumi.output(args).apply((a: any) => getCatalogs(a, opts))
}

/**
 * A collection of arguments for invoking getCatalogs.
 */
export interface GetCatalogsOutputArgs {
    /**
     * set of databricks.Catalog names
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
}
