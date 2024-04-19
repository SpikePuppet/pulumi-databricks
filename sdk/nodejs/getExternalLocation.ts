// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Getting details of an existing external location in the metastore
 */
export function getExternalLocation(args: GetExternalLocationArgs, opts?: pulumi.InvokeOptions): Promise<GetExternalLocationResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getExternalLocation:getExternalLocation", {
        "externalLocationInfo": args.externalLocationInfo,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getExternalLocation.
 */
export interface GetExternalLocationArgs {
    externalLocationInfo?: inputs.GetExternalLocationExternalLocationInfo;
    /**
     * The name of the storage credential
     */
    name: string;
}

/**
 * A collection of values returned by getExternalLocation.
 */
export interface GetExternalLocationResult {
    readonly externalLocationInfo: outputs.GetExternalLocationExternalLocationInfo;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
}
/**
 * ## Example Usage
 *
 * Getting details of an existing external location in the metastore
 */
export function getExternalLocationOutput(args: GetExternalLocationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetExternalLocationResult> {
    return pulumi.output(args).apply((a: any) => getExternalLocation(a, opts))
}

/**
 * A collection of arguments for invoking getExternalLocation.
 */
export interface GetExternalLocationOutputArgs {
    externalLocationInfo?: pulumi.Input<inputs.GetExternalLocationExternalLocationInfoArgs>;
    /**
     * The name of the storage credential
     */
    name: pulumi.Input<string>;
}
