// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * List all storage credentials in the metastore
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const all = databricks.getStorageCredentials({});
 * export const allStorageCredentials = all.then(all => all.names);
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.StorageCredential to get information about a single credential
 * * databricks.StorageCredential to manage Storage Credentials within Unity Catalog.
 */
export function getStorageCredentials(args?: GetStorageCredentialsArgs, opts?: pulumi.InvokeOptions): Promise<GetStorageCredentialsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getStorageCredentials:getStorageCredentials", {
        "names": args.names,
    }, opts);
}

/**
 * A collection of arguments for invoking getStorageCredentials.
 */
export interface GetStorageCredentialsArgs {
    /**
     * List of names of databricks.StorageCredential in the metastore
     */
    names?: string[];
}

/**
 * A collection of values returned by getStorageCredentials.
 */
export interface GetStorageCredentialsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * List of names of databricks.StorageCredential in the metastore
     */
    readonly names: string[];
}
/**
 * ## Example Usage
 *
 * List all storage credentials in the metastore
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const all = databricks.getStorageCredentials({});
 * export const allStorageCredentials = all.then(all => all.names);
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.StorageCredential to get information about a single credential
 * * databricks.StorageCredential to manage Storage Credentials within Unity Catalog.
 */
export function getStorageCredentialsOutput(args?: GetStorageCredentialsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetStorageCredentialsResult> {
    return pulumi.output(args).apply((a: any) => getStorageCredentials(a, opts))
}

/**
 * A collection of arguments for invoking getStorageCredentials.
 */
export interface GetStorageCredentialsOutputArgs {
    /**
     * List of names of databricks.StorageCredential in the metastore
     */
    names?: pulumi.Input<pulumi.Input<string>[]>;
}
