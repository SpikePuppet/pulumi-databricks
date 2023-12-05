// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.getMetastores to get mapping of name to id of all metastores.
 * * databricks.Metastore to manage Metastores within Unity Catalog.
 * * databricks.Catalog to manage catalogs within Unity Catalog.
 */
export function getMetastore(args: GetMetastoreArgs, opts?: pulumi.InvokeOptions): Promise<GetMetastoreResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getMetastore:getMetastore", {
        "metastoreId": args.metastoreId,
        "metastoreInfo": args.metastoreInfo,
    }, opts);
}

/**
 * A collection of arguments for invoking getMetastore.
 */
export interface GetMetastoreArgs {
    /**
     * Id of the metastore to be fetched
     */
    metastoreId: string;
    /**
     * MetastoreInfo object for a databricks_metastore. This contains the following attributes:
     */
    metastoreInfo?: inputs.GetMetastoreMetastoreInfo;
}

/**
 * A collection of values returned by getMetastore.
 */
export interface GetMetastoreResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly metastoreId: string;
    /**
     * MetastoreInfo object for a databricks_metastore. This contains the following attributes:
     */
    readonly metastoreInfo: outputs.GetMetastoreMetastoreInfo;
}
/**
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.getMetastores to get mapping of name to id of all metastores.
 * * databricks.Metastore to manage Metastores within Unity Catalog.
 * * databricks.Catalog to manage catalogs within Unity Catalog.
 */
export function getMetastoreOutput(args: GetMetastoreOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetMetastoreResult> {
    return pulumi.output(args).apply((a: any) => getMetastore(a, opts))
}

/**
 * A collection of arguments for invoking getMetastore.
 */
export interface GetMetastoreOutputArgs {
    /**
     * Id of the metastore to be fetched
     */
    metastoreId: pulumi.Input<string>;
    /**
     * MetastoreInfo object for a databricks_metastore. This contains the following attributes:
     */
    metastoreInfo?: pulumi.Input<inputs.GetMetastoreMetastoreInfoArgs>;
}
