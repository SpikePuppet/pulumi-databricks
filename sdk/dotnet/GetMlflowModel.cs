// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetMlflowModel
    {
        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// Retrieves the settings of databricks.MlflowModel by name.
        /// </summary>
        public static Task<GetMlflowModelResult> InvokeAsync(GetMlflowModelArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMlflowModelResult>("databricks:index/getMlflowModel:getMlflowModel", args ?? new GetMlflowModelArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// Retrieves the settings of databricks.MlflowModel by name.
        /// </summary>
        public static Output<GetMlflowModelResult> Invoke(GetMlflowModelInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMlflowModelResult>("databricks:index/getMlflowModel:getMlflowModel", args ?? new GetMlflowModelInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMlflowModelArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// User-specified description for the object.
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        [Input("latestVersions")]
        private List<Inputs.GetMlflowModelLatestVersionArgs>? _latestVersions;

        /// <summary>
        /// Array of model versions, each the latest version for its stage.
        /// </summary>
        public List<Inputs.GetMlflowModelLatestVersionArgs> LatestVersions
        {
            get => _latestVersions ?? (_latestVersions = new List<Inputs.GetMlflowModelLatestVersionArgs>());
            set => _latestVersions = value;
        }

        /// <summary>
        /// Name of the registered model.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Permission level of the requesting user on the object. For what is allowed at each level, see MLflow Model permissions.
        /// </summary>
        [Input("permissionLevel")]
        public string? PermissionLevel { get; set; }

        [Input("tags")]
        private List<Inputs.GetMlflowModelTagArgs>? _tags;

        /// <summary>
        /// Array of tags associated with the model.
        /// </summary>
        public List<Inputs.GetMlflowModelTagArgs> Tags
        {
            get => _tags ?? (_tags = new List<Inputs.GetMlflowModelTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The username of the user that created the object.
        /// </summary>
        [Input("userId")]
        public string? UserId { get; set; }

        public GetMlflowModelArgs()
        {
        }
        public static new GetMlflowModelArgs Empty => new GetMlflowModelArgs();
    }

    public sealed class GetMlflowModelInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// User-specified description for the object.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("latestVersions")]
        private InputList<Inputs.GetMlflowModelLatestVersionInputArgs>? _latestVersions;

        /// <summary>
        /// Array of model versions, each the latest version for its stage.
        /// </summary>
        public InputList<Inputs.GetMlflowModelLatestVersionInputArgs> LatestVersions
        {
            get => _latestVersions ?? (_latestVersions = new InputList<Inputs.GetMlflowModelLatestVersionInputArgs>());
            set => _latestVersions = value;
        }

        /// <summary>
        /// Name of the registered model.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Permission level of the requesting user on the object. For what is allowed at each level, see MLflow Model permissions.
        /// </summary>
        [Input("permissionLevel")]
        public Input<string>? PermissionLevel { get; set; }

        [Input("tags")]
        private InputList<Inputs.GetMlflowModelTagInputArgs>? _tags;

        /// <summary>
        /// Array of tags associated with the model.
        /// </summary>
        public InputList<Inputs.GetMlflowModelTagInputArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.GetMlflowModelTagInputArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The username of the user that created the object.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public GetMlflowModelInvokeArgs()
        {
        }
        public static new GetMlflowModelInvokeArgs Empty => new GetMlflowModelInvokeArgs();
    }


    [OutputType]
    public sealed class GetMlflowModelResult
    {
        /// <summary>
        /// User-specified description for the object.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Unique identifier for the object.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Array of model versions, each the latest version for its stage.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMlflowModelLatestVersionResult> LatestVersions;
        /// <summary>
        /// Name of the model.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Permission level of the requesting user on the object. For what is allowed at each level, see MLflow Model permissions.
        /// </summary>
        public readonly string PermissionLevel;
        /// <summary>
        /// Array of tags associated with the model.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMlflowModelTagResult> Tags;
        /// <summary>
        /// The username of the user that created the object.
        /// </summary>
        public readonly string UserId;

        [OutputConstructor]
        private GetMlflowModelResult(
            string description,

            string id,

            ImmutableArray<Outputs.GetMlflowModelLatestVersionResult> latestVersions,

            string name,

            string permissionLevel,

            ImmutableArray<Outputs.GetMlflowModelTagResult> tags,

            string userId)
        {
            Description = description;
            Id = id;
            LatestVersions = latestVersions;
            Name = name;
            PermissionLevel = permissionLevel;
            Tags = tags;
            UserId = userId;
        }
    }
}
