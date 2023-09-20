// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * To work with external tables, Unity Catalog introduces two new objects to access and work with external cloud storage:
 *
 * - databricks.StorageCredential represent authentication methods to access cloud storage (e.g. an IAM role for Amazon S3 or a service principal for Azure Storage). Storage credentials are access-controlled to determine which users can use the credential.
 * - `databricks.ExternalLocation` are objects that combine a cloud storage path with a Storage Credential that can be used to access the location.
 *
 * ## Import
 *
 * This resource can be imported by `name`bash
 *
 * ```sh
 *  $ pulumi import databricks:index/externalLocation:ExternalLocation this <name>
 * ```
 */
export class ExternalLocation extends pulumi.CustomResource {
    /**
     * Get an existing ExternalLocation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ExternalLocationState, opts?: pulumi.CustomResourceOptions): ExternalLocation {
        return new ExternalLocation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/externalLocation:ExternalLocation';

    /**
     * Returns true if the given object is an instance of ExternalLocation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ExternalLocation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ExternalLocation.__pulumiType;
    }

    /**
     * The ARN of the s3 access point to use with the external location (AWS).
     */
    public readonly accessPoint!: pulumi.Output<string | undefined>;
    /**
     * User-supplied free-form text.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Name of the databricks.StorageCredential to use with this external location.
     */
    public readonly credentialName!: pulumi.Output<string>;
    /**
     * The options for Server-Side Encryption to be used by each Databricks s3 client when connecting to S3 cloud storage (AWS).
     */
    public readonly encryptionDetails!: pulumi.Output<outputs.ExternalLocationEncryptionDetails | undefined>;
    /**
     * Destroy external location regardless of its dependents.
     */
    public readonly forceDestroy!: pulumi.Output<boolean | undefined>;
    /**
     * Update external location regardless of its dependents.
     */
    public readonly forceUpdate!: pulumi.Output<boolean | undefined>;
    public readonly metastoreId!: pulumi.Output<string>;
    /**
     * Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Username/groupname/sp applicationId of the external location owner.
     */
    public readonly owner!: pulumi.Output<string>;
    /**
     * Indicates whether the external location is read-only.
     */
    public readonly readOnly!: pulumi.Output<boolean | undefined>;
    /**
     * Suppress validation errors if any & force save the external location
     */
    public readonly skipValidation!: pulumi.Output<boolean | undefined>;
    /**
     * Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
     */
    public readonly url!: pulumi.Output<string>;

    /**
     * Create a ExternalLocation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ExternalLocationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ExternalLocationArgs | ExternalLocationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ExternalLocationState | undefined;
            resourceInputs["accessPoint"] = state ? state.accessPoint : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["credentialName"] = state ? state.credentialName : undefined;
            resourceInputs["encryptionDetails"] = state ? state.encryptionDetails : undefined;
            resourceInputs["forceDestroy"] = state ? state.forceDestroy : undefined;
            resourceInputs["forceUpdate"] = state ? state.forceUpdate : undefined;
            resourceInputs["metastoreId"] = state ? state.metastoreId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["owner"] = state ? state.owner : undefined;
            resourceInputs["readOnly"] = state ? state.readOnly : undefined;
            resourceInputs["skipValidation"] = state ? state.skipValidation : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as ExternalLocationArgs | undefined;
            if ((!args || args.credentialName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'credentialName'");
            }
            if ((!args || args.url === undefined) && !opts.urn) {
                throw new Error("Missing required property 'url'");
            }
            resourceInputs["accessPoint"] = args ? args.accessPoint : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["credentialName"] = args ? args.credentialName : undefined;
            resourceInputs["encryptionDetails"] = args ? args.encryptionDetails : undefined;
            resourceInputs["forceDestroy"] = args ? args.forceDestroy : undefined;
            resourceInputs["forceUpdate"] = args ? args.forceUpdate : undefined;
            resourceInputs["metastoreId"] = args ? args.metastoreId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["owner"] = args ? args.owner : undefined;
            resourceInputs["readOnly"] = args ? args.readOnly : undefined;
            resourceInputs["skipValidation"] = args ? args.skipValidation : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ExternalLocation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ExternalLocation resources.
 */
export interface ExternalLocationState {
    /**
     * The ARN of the s3 access point to use with the external location (AWS).
     */
    accessPoint?: pulumi.Input<string>;
    /**
     * User-supplied free-form text.
     */
    comment?: pulumi.Input<string>;
    /**
     * Name of the databricks.StorageCredential to use with this external location.
     */
    credentialName?: pulumi.Input<string>;
    /**
     * The options for Server-Side Encryption to be used by each Databricks s3 client when connecting to S3 cloud storage (AWS).
     */
    encryptionDetails?: pulumi.Input<inputs.ExternalLocationEncryptionDetails>;
    /**
     * Destroy external location regardless of its dependents.
     */
    forceDestroy?: pulumi.Input<boolean>;
    /**
     * Update external location regardless of its dependents.
     */
    forceUpdate?: pulumi.Input<boolean>;
    metastoreId?: pulumi.Input<string>;
    /**
     * Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Username/groupname/sp applicationId of the external location owner.
     */
    owner?: pulumi.Input<string>;
    /**
     * Indicates whether the external location is read-only.
     */
    readOnly?: pulumi.Input<boolean>;
    /**
     * Suppress validation errors if any & force save the external location
     */
    skipValidation?: pulumi.Input<boolean>;
    /**
     * Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ExternalLocation resource.
 */
export interface ExternalLocationArgs {
    /**
     * The ARN of the s3 access point to use with the external location (AWS).
     */
    accessPoint?: pulumi.Input<string>;
    /**
     * User-supplied free-form text.
     */
    comment?: pulumi.Input<string>;
    /**
     * Name of the databricks.StorageCredential to use with this external location.
     */
    credentialName: pulumi.Input<string>;
    /**
     * The options for Server-Side Encryption to be used by each Databricks s3 client when connecting to S3 cloud storage (AWS).
     */
    encryptionDetails?: pulumi.Input<inputs.ExternalLocationEncryptionDetails>;
    /**
     * Destroy external location regardless of its dependents.
     */
    forceDestroy?: pulumi.Input<boolean>;
    /**
     * Update external location regardless of its dependents.
     */
    forceUpdate?: pulumi.Input<boolean>;
    metastoreId?: pulumi.Input<string>;
    /**
     * Name of External Location, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Username/groupname/sp applicationId of the external location owner.
     */
    owner?: pulumi.Input<string>;
    /**
     * Indicates whether the external location is read-only.
     */
    readOnly?: pulumi.Input<boolean>;
    /**
     * Suppress validation errors if any & force save the external location
     */
    skipValidation?: pulumi.Input<boolean>;
    /**
     * Path URL in cloud storage, of the form: `s3://[bucket-host]/[bucket-dir]` (AWS), `abfss://[user]@[host]/[path]` (Azure), `gs://[bucket-host]/[bucket-dir]` (GCP).
     */
    url: pulumi.Input<string>;
}
