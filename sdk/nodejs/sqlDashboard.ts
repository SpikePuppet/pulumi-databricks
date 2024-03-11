// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource is used to manage [Databricks SQL Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html). To manage [SQLA resources](https://docs.databricks.com/sql/get-started/concepts.html) you must have `databricksSqlAccess` on your databricks.Group or databricks_user.
 *
 * **Note:** documentation for this resource is a work in progress.
 *
 * A dashboard may have one or more widgets.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const sharedDir = new databricks.Directory("sharedDir", {path: "/Shared/Dashboards"});
 * const d1 = new databricks.SqlDashboard("d1", {
 *     parent: pulumi.interpolate`folders/${sharedDir.objectId}`,
 *     tags: [
 *         "some-tag",
 *         "another-tag",
 *     ],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Example permission to share dashboard with all users:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const d1 = new databricks.Permissions("d1", {
 *     sqlDashboardId: databricks_sql_dashboard.d1.id,
 *     accessControls: [{
 *         groupName: data.databricks_group.users.display_name,
 *         permissionLevel: "CAN_RUN",
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
 * * databricks.SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all databricks.SqlEndpoint of workspace.
 * * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
 *
 * ## Import
 *
 * You can import a `databricks_sql_dashboard` resource with ID like the following:
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/sqlDashboard:SqlDashboard this <dashboard-id>
 * ```
 */
export class SqlDashboard extends pulumi.CustomResource {
    /**
     * Get an existing SqlDashboard resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SqlDashboardState, opts?: pulumi.CustomResourceOptions): SqlDashboard {
        return new SqlDashboard(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/sqlDashboard:SqlDashboard';

    /**
     * Returns true if the given object is an instance of SqlDashboard.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SqlDashboard {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SqlDashboard.__pulumiType;
    }

    public readonly createdAt!: pulumi.Output<string>;
    public readonly dashboardFiltersEnabled!: pulumi.Output<boolean | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly parent!: pulumi.Output<string | undefined>;
    public readonly runAsRole!: pulumi.Output<string | undefined>;
    public readonly tags!: pulumi.Output<string[] | undefined>;
    public readonly updatedAt!: pulumi.Output<string>;

    /**
     * Create a SqlDashboard resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SqlDashboardArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SqlDashboardArgs | SqlDashboardState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SqlDashboardState | undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["dashboardFiltersEnabled"] = state ? state.dashboardFiltersEnabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parent"] = state ? state.parent : undefined;
            resourceInputs["runAsRole"] = state ? state.runAsRole : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
        } else {
            const args = argsOrState as SqlDashboardArgs | undefined;
            resourceInputs["createdAt"] = args ? args.createdAt : undefined;
            resourceInputs["dashboardFiltersEnabled"] = args ? args.dashboardFiltersEnabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parent"] = args ? args.parent : undefined;
            resourceInputs["runAsRole"] = args ? args.runAsRole : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["updatedAt"] = args ? args.updatedAt : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SqlDashboard.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SqlDashboard resources.
 */
export interface SqlDashboardState {
    createdAt?: pulumi.Input<string>;
    dashboardFiltersEnabled?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    parent?: pulumi.Input<string>;
    runAsRole?: pulumi.Input<string>;
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    updatedAt?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SqlDashboard resource.
 */
export interface SqlDashboardArgs {
    createdAt?: pulumi.Input<string>;
    dashboardFiltersEnabled?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    parent?: pulumi.Input<string>;
    runAsRole?: pulumi.Input<string>;
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    updatedAt?: pulumi.Input<string>;
}
