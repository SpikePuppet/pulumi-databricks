// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add dependsOn attribute in order to prevent _default auth: cannot configure default credentials_ errors.
 *
 * This data source allows to get information about a directory in a Databricks Workspace.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const prod = databricks.getDirectory({
 *     path: "/Production",
 * });
 * ```
 */
export function getDirectory(args: GetDirectoryArgs, opts?: pulumi.InvokeOptions): Promise<GetDirectoryResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getDirectory:getDirectory", {
        "objectId": args.objectId,
        "path": args.path,
    }, opts);
}

/**
 * A collection of arguments for invoking getDirectory.
 */
export interface GetDirectoryArgs {
    /**
     * directory object ID
     */
    objectId?: number;
    /**
     * Path to a directory in the workspace
     */
    path: string;
}

/**
 * A collection of values returned by getDirectory.
 */
export interface GetDirectoryResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * directory object ID
     */
    readonly objectId: number;
    readonly path: string;
    /**
     * path on Workspace File System (WSFS) in form of `/Workspace` + `path`
     */
    readonly workspacePath: string;
}
/**
 * > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add dependsOn attribute in order to prevent _default auth: cannot configure default credentials_ errors.
 *
 * This data source allows to get information about a directory in a Databricks Workspace.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const prod = databricks.getDirectory({
 *     path: "/Production",
 * });
 * ```
 */
export function getDirectoryOutput(args: GetDirectoryOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDirectoryResult> {
    return pulumi.output(args).apply((a: any) => getDirectory(a, opts))
}

/**
 * A collection of arguments for invoking getDirectory.
 */
export interface GetDirectoryOutputArgs {
    /**
     * directory object ID
     */
    objectId?: pulumi.Input<number>;
    /**
     * Path to a directory in the workspace
     */
    path: pulumi.Input<string>;
}
