// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Getting details of an existing share in the metastore
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getShare({
 *     name: "this",
 * });
 * export const createdBy = _this.then(_this => _this.createdBy);
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.Share to create Delta Sharing shares.
 * * databricks.Recipient to create Delta Sharing recipients.
 * * databricks.Grants to manage Delta Sharing permissions.
 */
export function getShare(args?: GetShareArgs, opts?: pulumi.InvokeOptions): Promise<GetShareResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getShare:getShare", {
        "createdAt": args.createdAt,
        "createdBy": args.createdBy,
        "name": args.name,
        "objects": args.objects,
    }, opts);
}

/**
 * A collection of arguments for invoking getShare.
 */
export interface GetShareArgs {
    /**
     * Time when the share was created.
     */
    createdAt?: number;
    /**
     * The principal that created the share.
     */
    createdBy?: string;
    /**
     * The name of the share
     */
    name?: string;
    /**
     * arrays containing details of each object in the share.
     */
    objects?: inputs.GetShareObject[];
}

/**
 * A collection of values returned by getShare.
 */
export interface GetShareResult {
    /**
     * Time when the share was created.
     */
    readonly createdAt: number;
    /**
     * The principal that created the share.
     */
    readonly createdBy: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Full name of the object being shared.
     */
    readonly name: string;
    /**
     * arrays containing details of each object in the share.
     */
    readonly objects: outputs.GetShareObject[];
}
/**
 * ## Example Usage
 *
 * Getting details of an existing share in the metastore
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getShare({
 *     name: "this",
 * });
 * export const createdBy = _this.then(_this => _this.createdBy);
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.Share to create Delta Sharing shares.
 * * databricks.Recipient to create Delta Sharing recipients.
 * * databricks.Grants to manage Delta Sharing permissions.
 */
export function getShareOutput(args?: GetShareOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetShareResult> {
    return pulumi.output(args).apply((a: any) => getShare(a, opts))
}

/**
 * A collection of arguments for invoking getShare.
 */
export interface GetShareOutputArgs {
    /**
     * Time when the share was created.
     */
    createdAt?: pulumi.Input<number>;
    /**
     * The principal that created the share.
     */
    createdBy?: pulumi.Input<string>;
    /**
     * The name of the share
     */
    name?: pulumi.Input<string>;
    /**
     * arrays containing details of each object in the share.
     */
    objects?: pulumi.Input<pulumi.Input<inputs.GetShareObjectArgs>[]>;
}
