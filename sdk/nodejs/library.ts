// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Installs a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster. Each different type of library has a slightly different syntax. It's possible to set only one type of library within one resource. Otherwise, the plan will fail with an error.
 *
 * > **Note** `databricks.Library` resource would always start the associated cluster if it's not running, so make sure to have auto-termination configured. It's not possible to atomically change the version of the same library without cluster restart. Libraries are fully removed from the cluster only after restart.
 *
 * ## Java/Scala JAR
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const appDbfsFile = new databricks.DbfsFile("appDbfsFile", {
 *     source: `${path.module}/app-0.0.1.jar`,
 *     path: "/FileStore/app-0.0.1.jar",
 * });
 * const appLibrary = new databricks.Library("appLibrary", {
 *     clusterId: databricks_cluster["this"].id,
 *     jar: appDbfsFile.dbfsPath,
 * });
 * ```
 *
 * ## Java/Scala Maven
 *
 * Installing artifacts from Maven repository. You can also optionally specify a `repo` parameter for a custom Maven-style repository, that should be accessible without any authentication. Maven libraries are resolved in Databricks Control Plane, so repo should be accessible from it. It can even be properly configured [maven s3 wagon](https://github.com/seahen/maven-s3-wagon), [AWS CodeArtifact](https://aws.amazon.com/codeartifact/) or [Azure Artifacts](https://azure.microsoft.com/en-us/services/devops/artifacts/).
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const deequ = new databricks.Library("deequ", {
 *     clusterId: databricks_cluster["this"].id,
 *     maven: {
 *         coordinates: "com.amazon.deequ:deequ:1.0.4",
 *         exclusions: ["org.apache.avro:avro"],
 *     },
 * });
 * ```
 *
 * ## Python Wheel
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const appDbfsFile = new databricks.DbfsFile("appDbfsFile", {
 *     source: `${path.module}/baz.whl`,
 *     path: "/FileStore/baz.whl",
 * });
 * const appLibrary = new databricks.Library("appLibrary", {
 *     clusterId: databricks_cluster["this"].id,
 *     whl: appDbfsFile.dbfsPath,
 * });
 * ```
 *
 * ## Python PyPI
 *
 * Installing Python PyPI artifacts. You can optionally also specify the `repo` parameter for a custom PyPI mirror, which should be accessible without any authentication for the network that cluster runs in.
 *
 * > **Note** `repo` host should be accessible from the Internet by Databricks control plane. If connectivity to custom PyPI repositories is required, please modify cluster-node `/etc/pip.conf` through databricks_global_init_script.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const fbprophet = new databricks.Library("fbprophet", {
 *     clusterId: databricks_cluster["this"].id,
 *     pypi: {
 *         "package": "fbprophet==0.6",
 *     },
 * });
 * ```
 *
 * ## Python EGG
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const appDbfsFile = new databricks.DbfsFile("appDbfsFile", {
 *     source: `${path.module}/foo.egg`,
 *     path: "/FileStore/foo.egg",
 * });
 * const appLibrary = new databricks.Library("appLibrary", {
 *     clusterId: databricks_cluster["this"].id,
 *     egg: appDbfsFile.dbfsPath,
 * });
 * ```
 *
 * ## R CRan
 *
 * Installing artifacts from CRan. You can also optionally specify a `repo` parameter for a custom cran mirror.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const rkeops = new databricks.Library("rkeops", {
 *     clusterId: databricks_cluster["this"].id,
 *     cran: {
 *         "package": "rkeops",
 *     },
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.getClusters data to retrieve a list of databricks.Cluster ids.
 * * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
 * * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
 * * databricks.DbfsFile data to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
 * * databricks.getDbfsFilePaths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
 * * databricks.DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
 * * databricks.GlobalInitScript to manage [global init scripts](https://docs.databricks.com/clusters/init-scripts.html#global-init-scripts), which are run on all databricks.Cluster and databricks_job.
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 * * databricks.Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
 * * databricks.Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
 * * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
 *
 * ## Import
 *
 * -> **Note** Importing this resource is not currently supported.
 */
export class Library extends pulumi.CustomResource {
    /**
     * Get an existing Library resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LibraryState, opts?: pulumi.CustomResourceOptions): Library {
        return new Library(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/library:Library';

    /**
     * Returns true if the given object is an instance of Library.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Library {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Library.__pulumiType;
    }

    public readonly clusterId!: pulumi.Output<string>;
    public readonly cran!: pulumi.Output<outputs.LibraryCran | undefined>;
    public readonly egg!: pulumi.Output<string | undefined>;
    public readonly jar!: pulumi.Output<string | undefined>;
    public readonly maven!: pulumi.Output<outputs.LibraryMaven | undefined>;
    public readonly pypi!: pulumi.Output<outputs.LibraryPypi | undefined>;
    public readonly whl!: pulumi.Output<string | undefined>;

    /**
     * Create a Library resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LibraryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LibraryArgs | LibraryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LibraryState | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["cran"] = state ? state.cran : undefined;
            resourceInputs["egg"] = state ? state.egg : undefined;
            resourceInputs["jar"] = state ? state.jar : undefined;
            resourceInputs["maven"] = state ? state.maven : undefined;
            resourceInputs["pypi"] = state ? state.pypi : undefined;
            resourceInputs["whl"] = state ? state.whl : undefined;
        } else {
            const args = argsOrState as LibraryArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["cran"] = args ? args.cran : undefined;
            resourceInputs["egg"] = args ? args.egg : undefined;
            resourceInputs["jar"] = args ? args.jar : undefined;
            resourceInputs["maven"] = args ? args.maven : undefined;
            resourceInputs["pypi"] = args ? args.pypi : undefined;
            resourceInputs["whl"] = args ? args.whl : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Library.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Library resources.
 */
export interface LibraryState {
    clusterId?: pulumi.Input<string>;
    cran?: pulumi.Input<inputs.LibraryCran>;
    egg?: pulumi.Input<string>;
    jar?: pulumi.Input<string>;
    maven?: pulumi.Input<inputs.LibraryMaven>;
    pypi?: pulumi.Input<inputs.LibraryPypi>;
    whl?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Library resource.
 */
export interface LibraryArgs {
    clusterId: pulumi.Input<string>;
    cran?: pulumi.Input<inputs.LibraryCran>;
    egg?: pulumi.Input<string>;
    jar?: pulumi.Input<string>;
    maven?: pulumi.Input<inputs.LibraryMaven>;
    pypi?: pulumi.Input<inputs.LibraryPypi>;
    whl?: pulumi.Input<string>;
}
