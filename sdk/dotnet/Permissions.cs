// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// ## Import
    /// 
    /// ### Import Example Configuration filehcl resource "databricks_mlflow_model" "model" {
    /// 
    ///  name
    /// 
    /// = "example_model"
    /// 
    ///  description = "MLflow registered model" } resource "databricks_permissions" "model_usage" {
    /// 
    ///  registered_model_id = databricks_mlflow_model.model.registered_model_id
    /// 
    ///  access_control {
    /// 
    ///  group_name
    /// 
    ///  = "users"
    /// 
    ///  permission_level = "CAN_READ"
    /// 
    ///  } } Import commandbash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/permissions:Permissions model_usage /registered-models/&lt;registered_model_id&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/permissions:Permissions")]
    public partial class Permissions : global::Pulumi.CustomResource
    {
        [Output("accessControls")]
        public Output<ImmutableArray<Outputs.PermissionsAccessControl>> AccessControls { get; private set; } = null!;

        /// <summary>
        /// either [`tokens`](https://docs.databricks.com/administration-guide/access-control/tokens.html) or [`passwords`](https://docs.databricks.com/administration-guide/users-groups/single-sign-on/index.html#configure-password-permission).
        /// </summary>
        [Output("authorization")]
        public Output<string?> Authorization { get; private set; } = null!;

        /// <summary>
        /// cluster id
        /// </summary>
        [Output("clusterId")]
        public Output<string?> ClusterId { get; private set; } = null!;

        /// <summary>
        /// cluster policy id
        /// </summary>
        [Output("clusterPolicyId")]
        public Output<string?> ClusterPolicyId { get; private set; } = null!;

        /// <summary>
        /// directory id
        /// </summary>
        [Output("directoryId")]
        public Output<string?> DirectoryId { get; private set; } = null!;

        /// <summary>
        /// path of directory
        /// </summary>
        [Output("directoryPath")]
        public Output<string?> DirectoryPath { get; private set; } = null!;

        /// <summary>
        /// MLflow experiment id
        /// </summary>
        [Output("experimentId")]
        public Output<string?> ExperimentId { get; private set; } = null!;

        /// <summary>
        /// instance pool id
        /// </summary>
        [Output("instancePoolId")]
        public Output<string?> InstancePoolId { get; private set; } = null!;

        /// <summary>
        /// job id
        /// </summary>
        [Output("jobId")]
        public Output<string?> JobId { get; private set; } = null!;

        /// <summary>
        /// ID of notebook within workspace
        /// </summary>
        [Output("notebookId")]
        public Output<string?> NotebookId { get; private set; } = null!;

        /// <summary>
        /// path of notebook
        /// </summary>
        [Output("notebookPath")]
        public Output<string?> NotebookPath { get; private set; } = null!;

        /// <summary>
        /// type of permissions.
        /// </summary>
        [Output("objectType")]
        public Output<string> ObjectType { get; private set; } = null!;

        /// <summary>
        /// pipeline id
        /// </summary>
        [Output("pipelineId")]
        public Output<string?> PipelineId { get; private set; } = null!;

        /// <summary>
        /// MLflow registered model id
        /// </summary>
        [Output("registeredModelId")]
        public Output<string?> RegisteredModelId { get; private set; } = null!;

        /// <summary>
        /// repo id
        /// </summary>
        [Output("repoId")]
        public Output<string?> RepoId { get; private set; } = null!;

        /// <summary>
        /// path of databricks repo directory(`/Repos/&lt;username&gt;/...`)
        /// </summary>
        [Output("repoPath")]
        public Output<string?> RepoPath { get; private set; } = null!;

        /// <summary>
        /// [SQL alert](https://docs.databricks.com/sql/user/security/access-control/alert-acl.html) id
        /// </summary>
        [Output("sqlAlertId")]
        public Output<string?> SqlAlertId { get; private set; } = null!;

        /// <summary>
        /// SQL dashboard id
        /// </summary>
        [Output("sqlDashboardId")]
        public Output<string?> SqlDashboardId { get; private set; } = null!;

        /// <summary>
        /// SQL warehouse id
        /// </summary>
        [Output("sqlEndpointId")]
        public Output<string?> SqlEndpointId { get; private set; } = null!;

        /// <summary>
        /// SQL query id
        /// </summary>
        [Output("sqlQueryId")]
        public Output<string?> SqlQueryId { get; private set; } = null!;


        /// <summary>
        /// Create a Permissions resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Permissions(string name, PermissionsArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/permissions:Permissions", name, args ?? new PermissionsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Permissions(string name, Input<string> id, PermissionsState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/permissions:Permissions", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Permissions resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Permissions Get(string name, Input<string> id, PermissionsState? state = null, CustomResourceOptions? options = null)
        {
            return new Permissions(name, id, state, options);
        }
    }

    public sealed class PermissionsArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessControls", required: true)]
        private InputList<Inputs.PermissionsAccessControlArgs>? _accessControls;
        public InputList<Inputs.PermissionsAccessControlArgs> AccessControls
        {
            get => _accessControls ?? (_accessControls = new InputList<Inputs.PermissionsAccessControlArgs>());
            set => _accessControls = value;
        }

        /// <summary>
        /// either [`tokens`](https://docs.databricks.com/administration-guide/access-control/tokens.html) or [`passwords`](https://docs.databricks.com/administration-guide/users-groups/single-sign-on/index.html#configure-password-permission).
        /// </summary>
        [Input("authorization")]
        public Input<string>? Authorization { get; set; }

        /// <summary>
        /// cluster id
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// cluster policy id
        /// </summary>
        [Input("clusterPolicyId")]
        public Input<string>? ClusterPolicyId { get; set; }

        /// <summary>
        /// directory id
        /// </summary>
        [Input("directoryId")]
        public Input<string>? DirectoryId { get; set; }

        /// <summary>
        /// path of directory
        /// </summary>
        [Input("directoryPath")]
        public Input<string>? DirectoryPath { get; set; }

        /// <summary>
        /// MLflow experiment id
        /// </summary>
        [Input("experimentId")]
        public Input<string>? ExperimentId { get; set; }

        /// <summary>
        /// instance pool id
        /// </summary>
        [Input("instancePoolId")]
        public Input<string>? InstancePoolId { get; set; }

        /// <summary>
        /// job id
        /// </summary>
        [Input("jobId")]
        public Input<string>? JobId { get; set; }

        /// <summary>
        /// ID of notebook within workspace
        /// </summary>
        [Input("notebookId")]
        public Input<string>? NotebookId { get; set; }

        /// <summary>
        /// path of notebook
        /// </summary>
        [Input("notebookPath")]
        public Input<string>? NotebookPath { get; set; }

        /// <summary>
        /// type of permissions.
        /// </summary>
        [Input("objectType")]
        public Input<string>? ObjectType { get; set; }

        /// <summary>
        /// pipeline id
        /// </summary>
        [Input("pipelineId")]
        public Input<string>? PipelineId { get; set; }

        /// <summary>
        /// MLflow registered model id
        /// </summary>
        [Input("registeredModelId")]
        public Input<string>? RegisteredModelId { get; set; }

        /// <summary>
        /// repo id
        /// </summary>
        [Input("repoId")]
        public Input<string>? RepoId { get; set; }

        /// <summary>
        /// path of databricks repo directory(`/Repos/&lt;username&gt;/...`)
        /// </summary>
        [Input("repoPath")]
        public Input<string>? RepoPath { get; set; }

        /// <summary>
        /// [SQL alert](https://docs.databricks.com/sql/user/security/access-control/alert-acl.html) id
        /// </summary>
        [Input("sqlAlertId")]
        public Input<string>? SqlAlertId { get; set; }

        /// <summary>
        /// SQL dashboard id
        /// </summary>
        [Input("sqlDashboardId")]
        public Input<string>? SqlDashboardId { get; set; }

        /// <summary>
        /// SQL warehouse id
        /// </summary>
        [Input("sqlEndpointId")]
        public Input<string>? SqlEndpointId { get; set; }

        /// <summary>
        /// SQL query id
        /// </summary>
        [Input("sqlQueryId")]
        public Input<string>? SqlQueryId { get; set; }

        public PermissionsArgs()
        {
        }
        public static new PermissionsArgs Empty => new PermissionsArgs();
    }

    public sealed class PermissionsState : global::Pulumi.ResourceArgs
    {
        [Input("accessControls")]
        private InputList<Inputs.PermissionsAccessControlGetArgs>? _accessControls;
        public InputList<Inputs.PermissionsAccessControlGetArgs> AccessControls
        {
            get => _accessControls ?? (_accessControls = new InputList<Inputs.PermissionsAccessControlGetArgs>());
            set => _accessControls = value;
        }

        /// <summary>
        /// either [`tokens`](https://docs.databricks.com/administration-guide/access-control/tokens.html) or [`passwords`](https://docs.databricks.com/administration-guide/users-groups/single-sign-on/index.html#configure-password-permission).
        /// </summary>
        [Input("authorization")]
        public Input<string>? Authorization { get; set; }

        /// <summary>
        /// cluster id
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// cluster policy id
        /// </summary>
        [Input("clusterPolicyId")]
        public Input<string>? ClusterPolicyId { get; set; }

        /// <summary>
        /// directory id
        /// </summary>
        [Input("directoryId")]
        public Input<string>? DirectoryId { get; set; }

        /// <summary>
        /// path of directory
        /// </summary>
        [Input("directoryPath")]
        public Input<string>? DirectoryPath { get; set; }

        /// <summary>
        /// MLflow experiment id
        /// </summary>
        [Input("experimentId")]
        public Input<string>? ExperimentId { get; set; }

        /// <summary>
        /// instance pool id
        /// </summary>
        [Input("instancePoolId")]
        public Input<string>? InstancePoolId { get; set; }

        /// <summary>
        /// job id
        /// </summary>
        [Input("jobId")]
        public Input<string>? JobId { get; set; }

        /// <summary>
        /// ID of notebook within workspace
        /// </summary>
        [Input("notebookId")]
        public Input<string>? NotebookId { get; set; }

        /// <summary>
        /// path of notebook
        /// </summary>
        [Input("notebookPath")]
        public Input<string>? NotebookPath { get; set; }

        /// <summary>
        /// type of permissions.
        /// </summary>
        [Input("objectType")]
        public Input<string>? ObjectType { get; set; }

        /// <summary>
        /// pipeline id
        /// </summary>
        [Input("pipelineId")]
        public Input<string>? PipelineId { get; set; }

        /// <summary>
        /// MLflow registered model id
        /// </summary>
        [Input("registeredModelId")]
        public Input<string>? RegisteredModelId { get; set; }

        /// <summary>
        /// repo id
        /// </summary>
        [Input("repoId")]
        public Input<string>? RepoId { get; set; }

        /// <summary>
        /// path of databricks repo directory(`/Repos/&lt;username&gt;/...`)
        /// </summary>
        [Input("repoPath")]
        public Input<string>? RepoPath { get; set; }

        /// <summary>
        /// [SQL alert](https://docs.databricks.com/sql/user/security/access-control/alert-acl.html) id
        /// </summary>
        [Input("sqlAlertId")]
        public Input<string>? SqlAlertId { get; set; }

        /// <summary>
        /// SQL dashboard id
        /// </summary>
        [Input("sqlDashboardId")]
        public Input<string>? SqlDashboardId { get; set; }

        /// <summary>
        /// SQL warehouse id
        /// </summary>
        [Input("sqlEndpointId")]
        public Input<string>? SqlEndpointId { get; set; }

        /// <summary>
        /// SQL query id
        /// </summary>
        [Input("sqlQueryId")]
        public Input<string>? SqlQueryId { get; set; }

        public PermissionsState()
        {
        }
        public static new PermissionsState Empty => new PermissionsState();
    }
}
