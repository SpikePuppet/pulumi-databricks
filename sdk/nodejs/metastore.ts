// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Note** This resource could be used with account or workspace-level provider.
 *
 * A metastore is the top-level container of objects in Unity Catalog. It stores data assets (tables and views) and the permissions that govern access to them. Databricks account admins can create metastores and assign them to Databricks workspaces in order to control which workloads use each metastore.
 *
 * Unity Catalog offers a new metastore with built in security and auditing. This is distinct to the metastore used in previous versions of Databricks (based on the Hive Metastore).
 *
 * A Unity Catalog metastore can be created without a root location & credential to maintain strict separation of storage across catalogs or environments.
 *
 * ## Example Usage
 *
 * For AWS
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const thisMetastore = new databricks.Metastore("thisMetastore", {
 *     storageRoot: `s3://${aws_s3_bucket.metastore.id}/metastore`,
 *     owner: "uc admins",
 *     region: "us-east-1",
 *     forceDestroy: true,
 * });
 * const thisMetastoreAssignment = new databricks.MetastoreAssignment("thisMetastoreAssignment", {
 *     metastoreId: thisMetastore.id,
 *     workspaceId: local.workspace_id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * For Azure
 *
 * ## Import
 *
 * This resource can be imported by ID:
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/metastore:Metastore this <id>
 * ```
 */
export class Metastore extends pulumi.CustomResource {
    /**
     * Get an existing Metastore resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MetastoreState, opts?: pulumi.CustomResourceOptions): Metastore {
        return new Metastore(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/metastore:Metastore';

    /**
     * Returns true if the given object is an instance of Metastore.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Metastore {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Metastore.__pulumiType;
    }

    public readonly cloud!: pulumi.Output<string>;
    public readonly createdAt!: pulumi.Output<number>;
    public readonly createdBy!: pulumi.Output<string>;
    public readonly defaultDataAccessConfigId!: pulumi.Output<string | undefined>;
    /**
     * The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing. Once this is set it cannot be removed and can only be modified to another valid value. To delete this value please taint and recreate the resource.
     */
    public readonly deltaSharingOrganizationName!: pulumi.Output<string | undefined>;
    /**
     * Required along with `deltaSharingScope`. Used to set expiration duration in seconds on recipient data access tokens. Set to 0 for unlimited duration.
     */
    public readonly deltaSharingRecipientTokenLifetimeInSeconds!: pulumi.Output<number | undefined>;
    /**
     * Required along with `deltaSharingRecipientTokenLifetimeInSeconds`. Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.  INTERNAL only allows sharing within the same account, and INTERNAL_AND_EXTERNAL allows cross account sharing and token based sharing.
     */
    public readonly deltaSharingScope!: pulumi.Output<string | undefined>;
    /**
     * Destroy metastore regardless of its contents.
     */
    public readonly forceDestroy!: pulumi.Output<boolean | undefined>;
    public readonly globalMetastoreId!: pulumi.Output<string>;
    public readonly metastoreId!: pulumi.Output<string>;
    /**
     * Name of metastore.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Username/groupname/sp applicationId of the metastore owner.
     */
    public readonly owner!: pulumi.Output<string>;
    /**
     * The region of the metastore
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Path on cloud storage account, where managed `databricks.Table` are stored. Change forces creation of a new resource. If no `storageRoot` is defined for the metastore, each catalog must have a `storageRoot` defined.
     */
    public readonly storageRoot!: pulumi.Output<string | undefined>;
    public readonly storageRootCredentialId!: pulumi.Output<string | undefined>;
    public readonly updatedAt!: pulumi.Output<number>;
    public readonly updatedBy!: pulumi.Output<string>;

    /**
     * Create a Metastore resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: MetastoreArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MetastoreArgs | MetastoreState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MetastoreState | undefined;
            resourceInputs["cloud"] = state ? state.cloud : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["createdBy"] = state ? state.createdBy : undefined;
            resourceInputs["defaultDataAccessConfigId"] = state ? state.defaultDataAccessConfigId : undefined;
            resourceInputs["deltaSharingOrganizationName"] = state ? state.deltaSharingOrganizationName : undefined;
            resourceInputs["deltaSharingRecipientTokenLifetimeInSeconds"] = state ? state.deltaSharingRecipientTokenLifetimeInSeconds : undefined;
            resourceInputs["deltaSharingScope"] = state ? state.deltaSharingScope : undefined;
            resourceInputs["forceDestroy"] = state ? state.forceDestroy : undefined;
            resourceInputs["globalMetastoreId"] = state ? state.globalMetastoreId : undefined;
            resourceInputs["metastoreId"] = state ? state.metastoreId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["owner"] = state ? state.owner : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["storageRoot"] = state ? state.storageRoot : undefined;
            resourceInputs["storageRootCredentialId"] = state ? state.storageRootCredentialId : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
            resourceInputs["updatedBy"] = state ? state.updatedBy : undefined;
        } else {
            const args = argsOrState as MetastoreArgs | undefined;
            resourceInputs["cloud"] = args ? args.cloud : undefined;
            resourceInputs["createdAt"] = args ? args.createdAt : undefined;
            resourceInputs["createdBy"] = args ? args.createdBy : undefined;
            resourceInputs["defaultDataAccessConfigId"] = args ? args.defaultDataAccessConfigId : undefined;
            resourceInputs["deltaSharingOrganizationName"] = args ? args.deltaSharingOrganizationName : undefined;
            resourceInputs["deltaSharingRecipientTokenLifetimeInSeconds"] = args ? args.deltaSharingRecipientTokenLifetimeInSeconds : undefined;
            resourceInputs["deltaSharingScope"] = args ? args.deltaSharingScope : undefined;
            resourceInputs["forceDestroy"] = args ? args.forceDestroy : undefined;
            resourceInputs["globalMetastoreId"] = args ? args.globalMetastoreId : undefined;
            resourceInputs["metastoreId"] = args ? args.metastoreId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["owner"] = args ? args.owner : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["storageRoot"] = args ? args.storageRoot : undefined;
            resourceInputs["storageRootCredentialId"] = args ? args.storageRootCredentialId : undefined;
            resourceInputs["updatedAt"] = args ? args.updatedAt : undefined;
            resourceInputs["updatedBy"] = args ? args.updatedBy : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Metastore.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Metastore resources.
 */
export interface MetastoreState {
    cloud?: pulumi.Input<string>;
    createdAt?: pulumi.Input<number>;
    createdBy?: pulumi.Input<string>;
    defaultDataAccessConfigId?: pulumi.Input<string>;
    /**
     * The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing. Once this is set it cannot be removed and can only be modified to another valid value. To delete this value please taint and recreate the resource.
     */
    deltaSharingOrganizationName?: pulumi.Input<string>;
    /**
     * Required along with `deltaSharingScope`. Used to set expiration duration in seconds on recipient data access tokens. Set to 0 for unlimited duration.
     */
    deltaSharingRecipientTokenLifetimeInSeconds?: pulumi.Input<number>;
    /**
     * Required along with `deltaSharingRecipientTokenLifetimeInSeconds`. Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.  INTERNAL only allows sharing within the same account, and INTERNAL_AND_EXTERNAL allows cross account sharing and token based sharing.
     */
    deltaSharingScope?: pulumi.Input<string>;
    /**
     * Destroy metastore regardless of its contents.
     */
    forceDestroy?: pulumi.Input<boolean>;
    globalMetastoreId?: pulumi.Input<string>;
    metastoreId?: pulumi.Input<string>;
    /**
     * Name of metastore.
     */
    name?: pulumi.Input<string>;
    /**
     * Username/groupname/sp applicationId of the metastore owner.
     */
    owner?: pulumi.Input<string>;
    /**
     * The region of the metastore
     */
    region?: pulumi.Input<string>;
    /**
     * Path on cloud storage account, where managed `databricks.Table` are stored. Change forces creation of a new resource. If no `storageRoot` is defined for the metastore, each catalog must have a `storageRoot` defined.
     */
    storageRoot?: pulumi.Input<string>;
    storageRootCredentialId?: pulumi.Input<string>;
    updatedAt?: pulumi.Input<number>;
    updatedBy?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Metastore resource.
 */
export interface MetastoreArgs {
    cloud?: pulumi.Input<string>;
    createdAt?: pulumi.Input<number>;
    createdBy?: pulumi.Input<string>;
    defaultDataAccessConfigId?: pulumi.Input<string>;
    /**
     * The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing. Once this is set it cannot be removed and can only be modified to another valid value. To delete this value please taint and recreate the resource.
     */
    deltaSharingOrganizationName?: pulumi.Input<string>;
    /**
     * Required along with `deltaSharingScope`. Used to set expiration duration in seconds on recipient data access tokens. Set to 0 for unlimited duration.
     */
    deltaSharingRecipientTokenLifetimeInSeconds?: pulumi.Input<number>;
    /**
     * Required along with `deltaSharingRecipientTokenLifetimeInSeconds`. Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.  INTERNAL only allows sharing within the same account, and INTERNAL_AND_EXTERNAL allows cross account sharing and token based sharing.
     */
    deltaSharingScope?: pulumi.Input<string>;
    /**
     * Destroy metastore regardless of its contents.
     */
    forceDestroy?: pulumi.Input<boolean>;
    globalMetastoreId?: pulumi.Input<string>;
    metastoreId?: pulumi.Input<string>;
    /**
     * Name of metastore.
     */
    name?: pulumi.Input<string>;
    /**
     * Username/groupname/sp applicationId of the metastore owner.
     */
    owner?: pulumi.Input<string>;
    /**
     * The region of the metastore
     */
    region?: pulumi.Input<string>;
    /**
     * Path on cloud storage account, where managed `databricks.Table` are stored. Change forces creation of a new resource. If no `storageRoot` is defined for the metastore, each catalog must have a `storageRoot` defined.
     */
    storageRoot?: pulumi.Input<string>;
    storageRootCredentialId?: pulumi.Input<string>;
    updatedAt?: pulumi.Input<number>;
    updatedBy?: pulumi.Input<string>;
}
