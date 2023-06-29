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
    ///     var sandbox = new Databricks.Catalog("sandbox", new()
    ///     {
    ///         MetastoreId = databricks_metastore.This.Id,
    ///         Comment = "this catalog is managed by terraform",
    ///         Properties = 
    ///         {
    ///             { "purpose", "testing" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## Related Resources
    /// 
    /// The following resources are used in the same context:
    /// 
    /// * databricks.Table data to list tables within Unity Catalog.
    /// * databricks.Schema data to list schemas within Unity Catalog.
    /// * databricks.Catalog data to list catalogs within Unity Catalog.
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by namebash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/catalog:Catalog this &lt;name&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/catalog:Catalog")]
    public partial class Catalog : global::Pulumi.CustomResource
    {
        /// <summary>
        /// User-supplied free-form text.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Delete catalog regardless of its contents.
        /// </summary>
        [Output("forceDestroy")]
        public Output<bool?> ForceDestroy { get; private set; } = null!;

        /// <summary>
        /// Whether the catalog is accessible from all workspaces or a specific set of workspaces. Can be `ISOLATED` or `OPEN`. Setting the catalog to `ISOLATED` will automatically allow access from the current workspace.
        /// </summary>
        [Output("isolationMode")]
        public Output<string> IsolationMode { get; private set; } = null!;

        [Output("metastoreId")]
        public Output<string> MetastoreId { get; private set; } = null!;

        /// <summary>
        /// Name of Catalog relative to parent metastore.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Username/groupname/sp application_id of the catalog owner.
        /// </summary>
        [Output("owner")]
        public Output<string> Owner { get; private set; } = null!;

        /// <summary>
        /// Extensible Catalog properties.
        /// </summary>
        [Output("properties")]
        public Output<ImmutableDictionary<string, object>?> Properties { get; private set; } = null!;

        /// <summary>
        /// For Delta Sharing Catalogs: the name of the delta sharing provider. Change forces creation of a new resource.
        /// </summary>
        [Output("providerName")]
        public Output<string?> ProviderName { get; private set; } = null!;

        /// <summary>
        /// For Delta Sharing Catalogs: the name of the share under the share provider. Change forces creation of a new resource.
        /// </summary>
        [Output("shareName")]
        public Output<string?> ShareName { get; private set; } = null!;

        /// <summary>
        /// Managed location of the catalog. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the metastore root location. Change forces creation of a new resource.
        /// </summary>
        [Output("storageRoot")]
        public Output<string?> StorageRoot { get; private set; } = null!;


        /// <summary>
        /// Create a Catalog resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Catalog(string name, CatalogArgs? args = null, CustomResourceOptions? options = null)
            : base("databricks:index/catalog:Catalog", name, args ?? new CatalogArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Catalog(string name, Input<string> id, CatalogState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/catalog:Catalog", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Catalog resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Catalog Get(string name, Input<string> id, CatalogState? state = null, CustomResourceOptions? options = null)
        {
            return new Catalog(name, id, state, options);
        }
    }

    public sealed class CatalogArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User-supplied free-form text.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Delete catalog regardless of its contents.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// Whether the catalog is accessible from all workspaces or a specific set of workspaces. Can be `ISOLATED` or `OPEN`. Setting the catalog to `ISOLATED` will automatically allow access from the current workspace.
        /// </summary>
        [Input("isolationMode")]
        public Input<string>? IsolationMode { get; set; }

        [Input("metastoreId")]
        public Input<string>? MetastoreId { get; set; }

        /// <summary>
        /// Name of Catalog relative to parent metastore.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Username/groupname/sp application_id of the catalog owner.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("properties")]
        private InputMap<object>? _properties;

        /// <summary>
        /// Extensible Catalog properties.
        /// </summary>
        public InputMap<object> Properties
        {
            get => _properties ?? (_properties = new InputMap<object>());
            set => _properties = value;
        }

        /// <summary>
        /// For Delta Sharing Catalogs: the name of the delta sharing provider. Change forces creation of a new resource.
        /// </summary>
        [Input("providerName")]
        public Input<string>? ProviderName { get; set; }

        /// <summary>
        /// For Delta Sharing Catalogs: the name of the share under the share provider. Change forces creation of a new resource.
        /// </summary>
        [Input("shareName")]
        public Input<string>? ShareName { get; set; }

        /// <summary>
        /// Managed location of the catalog. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the metastore root location. Change forces creation of a new resource.
        /// </summary>
        [Input("storageRoot")]
        public Input<string>? StorageRoot { get; set; }

        public CatalogArgs()
        {
        }
        public static new CatalogArgs Empty => new CatalogArgs();
    }

    public sealed class CatalogState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User-supplied free-form text.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Delete catalog regardless of its contents.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// Whether the catalog is accessible from all workspaces or a specific set of workspaces. Can be `ISOLATED` or `OPEN`. Setting the catalog to `ISOLATED` will automatically allow access from the current workspace.
        /// </summary>
        [Input("isolationMode")]
        public Input<string>? IsolationMode { get; set; }

        [Input("metastoreId")]
        public Input<string>? MetastoreId { get; set; }

        /// <summary>
        /// Name of Catalog relative to parent metastore.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Username/groupname/sp application_id of the catalog owner.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("properties")]
        private InputMap<object>? _properties;

        /// <summary>
        /// Extensible Catalog properties.
        /// </summary>
        public InputMap<object> Properties
        {
            get => _properties ?? (_properties = new InputMap<object>());
            set => _properties = value;
        }

        /// <summary>
        /// For Delta Sharing Catalogs: the name of the delta sharing provider. Change forces creation of a new resource.
        /// </summary>
        [Input("providerName")]
        public Input<string>? ProviderName { get; set; }

        /// <summary>
        /// For Delta Sharing Catalogs: the name of the share under the share provider. Change forces creation of a new resource.
        /// </summary>
        [Input("shareName")]
        public Input<string>? ShareName { get; set; }

        /// <summary>
        /// Managed location of the catalog. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the metastore root location. Change forces creation of a new resource.
        /// </summary>
        [Input("storageRoot")]
        public Input<string>? StorageRoot { get; set; }

        public CatalogState()
        {
        }
        public static new CatalogState Empty => new CatalogState();
    }
}
