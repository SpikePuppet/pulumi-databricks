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
    /// &gt; **Note** This resource could be only used with workspace-level provider!
    /// 
    /// The `databricks.RestrictWorkspaceAdminsSetting` resource lets you control the capabilities of workspace admins.
    /// 
    /// With the status set to `ALLOW_ALL`, workspace admins can:
    /// 
    /// 1. Create service principal personal access tokens on behalf of any service principal in their workspace.
    /// 2. Change a job owner to any user in the workspace.
    /// 3. Change the job run_as setting to any user in their workspace or a service principal on which they have the Service Principal User role.
    /// 
    /// With the status set to `RESTRICT_TOKENS_AND_JOB_RUN_AS`, workspace admins can:
    /// 
    /// 1. Only create personal access tokens on behalf of service principals on which they have the Service Principal User role.
    /// 2. Only change a job owner to themselves.
    /// 3. Only change the job run_as setting to themselves a service principal on which they have the Service Principal User role.
    /// 
    /// &gt; **Note** Only account admins can update the setting. And the account admin must be part of the workspace to change the setting status.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @this = new Databricks.RestrictWorkspaceAdminsSetting("this", new()
    ///     {
    ///         RestrictWorkspaceAdmins = new Databricks.Inputs.RestrictWorkspaceAdminsSettingRestrictWorkspaceAdminsArgs
    ///         {
    ///             Status = "RESTRICT_TOKENS_AND_JOB_RUN_AS",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by predefined name `global`:
    /// 
    ///  bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/restrictWorkspaceAdminsSetting:RestrictWorkspaceAdminsSetting this global
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/restrictWorkspaceAdminsSetting:RestrictWorkspaceAdminsSetting")]
    public partial class RestrictWorkspaceAdminsSetting : global::Pulumi.CustomResource
    {
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The configuration details.
        /// </summary>
        [Output("restrictWorkspaceAdmins")]
        public Output<Outputs.RestrictWorkspaceAdminsSettingRestrictWorkspaceAdmins> RestrictWorkspaceAdmins { get; private set; } = null!;

        [Output("settingName")]
        public Output<string> SettingName { get; private set; } = null!;


        /// <summary>
        /// Create a RestrictWorkspaceAdminsSetting resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RestrictWorkspaceAdminsSetting(string name, RestrictWorkspaceAdminsSettingArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/restrictWorkspaceAdminsSetting:RestrictWorkspaceAdminsSetting", name, args ?? new RestrictWorkspaceAdminsSettingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RestrictWorkspaceAdminsSetting(string name, Input<string> id, RestrictWorkspaceAdminsSettingState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/restrictWorkspaceAdminsSetting:RestrictWorkspaceAdminsSetting", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RestrictWorkspaceAdminsSetting resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RestrictWorkspaceAdminsSetting Get(string name, Input<string> id, RestrictWorkspaceAdminsSettingState? state = null, CustomResourceOptions? options = null)
        {
            return new RestrictWorkspaceAdminsSetting(name, id, state, options);
        }
    }

    public sealed class RestrictWorkspaceAdminsSettingArgs : global::Pulumi.ResourceArgs
    {
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The configuration details.
        /// </summary>
        [Input("restrictWorkspaceAdmins", required: true)]
        public Input<Inputs.RestrictWorkspaceAdminsSettingRestrictWorkspaceAdminsArgs> RestrictWorkspaceAdmins { get; set; } = null!;

        [Input("settingName")]
        public Input<string>? SettingName { get; set; }

        public RestrictWorkspaceAdminsSettingArgs()
        {
        }
        public static new RestrictWorkspaceAdminsSettingArgs Empty => new RestrictWorkspaceAdminsSettingArgs();
    }

    public sealed class RestrictWorkspaceAdminsSettingState : global::Pulumi.ResourceArgs
    {
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The configuration details.
        /// </summary>
        [Input("restrictWorkspaceAdmins")]
        public Input<Inputs.RestrictWorkspaceAdminsSettingRestrictWorkspaceAdminsGetArgs>? RestrictWorkspaceAdmins { get; set; }

        [Input("settingName")]
        public Input<string>? SettingName { get; set; }

        public RestrictWorkspaceAdminsSettingState()
        {
        }
        public static new RestrictWorkspaceAdminsSettingState Empty => new RestrictWorkspaceAdminsSettingState();
    }
}
