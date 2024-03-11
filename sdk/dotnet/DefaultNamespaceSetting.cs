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
    /// The `databricks.DefaultNamespaceSetting` resource allows you to operate the setting configuration for the default namespace in the Databricks workspace.
    /// Setting the default catalog for the workspace determines the catalog that is used when queries do not reference
    /// a fully qualified 3 level name. For example, if the default catalog is set to 'retail_prod' then a query
    /// 'SELECT * FROM myTable' would reference the object 'retail_prod.default.myTable'
    /// (the schema 'default' is always assumed).
    /// This setting requires a restart of clusters and SQL warehouses to take effect. Additionally, the default namespace only applies when using Unity Catalog-enabled compute.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @this = new Databricks.DefaultNamespaceSetting("this", new()
    ///     {
    ///         Namespace = new Databricks.Inputs.DefaultNamespaceSettingNamespaceArgs
    ///         {
    ///             Value = "namespace_value",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by predefined name `global`:
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/defaultNamespaceSetting:DefaultNamespaceSetting this global
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/defaultNamespaceSetting:DefaultNamespaceSetting")]
    public partial class DefaultNamespaceSetting : global::Pulumi.CustomResource
    {
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The configuration details.
        /// </summary>
        [Output("namespace")]
        public Output<Outputs.DefaultNamespaceSettingNamespace> Namespace { get; private set; } = null!;

        [Output("settingName")]
        public Output<string> SettingName { get; private set; } = null!;


        /// <summary>
        /// Create a DefaultNamespaceSetting resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DefaultNamespaceSetting(string name, DefaultNamespaceSettingArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/defaultNamespaceSetting:DefaultNamespaceSetting", name, args ?? new DefaultNamespaceSettingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DefaultNamespaceSetting(string name, Input<string> id, DefaultNamespaceSettingState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/defaultNamespaceSetting:DefaultNamespaceSetting", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DefaultNamespaceSetting resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DefaultNamespaceSetting Get(string name, Input<string> id, DefaultNamespaceSettingState? state = null, CustomResourceOptions? options = null)
        {
            return new DefaultNamespaceSetting(name, id, state, options);
        }
    }

    public sealed class DefaultNamespaceSettingArgs : global::Pulumi.ResourceArgs
    {
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The configuration details.
        /// </summary>
        [Input("namespace", required: true)]
        public Input<Inputs.DefaultNamespaceSettingNamespaceArgs> Namespace { get; set; } = null!;

        [Input("settingName")]
        public Input<string>? SettingName { get; set; }

        public DefaultNamespaceSettingArgs()
        {
        }
        public static new DefaultNamespaceSettingArgs Empty => new DefaultNamespaceSettingArgs();
    }

    public sealed class DefaultNamespaceSettingState : global::Pulumi.ResourceArgs
    {
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The configuration details.
        /// </summary>
        [Input("namespace")]
        public Input<Inputs.DefaultNamespaceSettingNamespaceGetArgs>? Namespace { get; set; }

        [Input("settingName")]
        public Input<string>? SettingName { get; set; }

        public DefaultNamespaceSettingState()
        {
        }
        public static new DefaultNamespaceSettingState Empty => new DefaultNamespaceSettingState();
    }
}
