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
    /// &gt; **Note** This resource could be used with account or workspace-level provider.
    /// 
    /// A metastore is the top-level container of objects in Unity Catalog. It stores data assets (tables and views) and the permissions that govern access to them. Databricks account admins can create metastores and assign them to Databricks workspaces in order to control which workloads use each metastore.
    /// 
    /// Unity Catalog offers a new metastore with built in security and auditing. This is distinct to the metastore used in previous versions of Databricks (based on the Hive Metastore).
    /// 
    /// A Unity Catalog metastore can be created without a root location &amp; credential to maintain strict separation of storage across catalogs or environments.
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by ID:
    /// 
    ///  bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/metastore:Metastore this &lt;id&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/metastore:Metastore")]
    public partial class Metastore : global::Pulumi.CustomResource
    {
        [Output("cloud")]
        public Output<string> Cloud { get; private set; } = null!;

        [Output("createdAt")]
        public Output<int> CreatedAt { get; private set; } = null!;

        [Output("createdBy")]
        public Output<string> CreatedBy { get; private set; } = null!;

        [Output("defaultDataAccessConfigId")]
        public Output<string?> DefaultDataAccessConfigId { get; private set; } = null!;

        /// <summary>
        /// The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing. Once this is set it cannot be removed and can only be modified to another valid value. To delete this value please taint and recreate the resource.
        /// </summary>
        [Output("deltaSharingOrganizationName")]
        public Output<string?> DeltaSharingOrganizationName { get; private set; } = null!;

        /// <summary>
        /// Required along with `delta_sharing_scope`. Used to set expiration duration in seconds on recipient data access tokens. Set to 0 for unlimited duration.
        /// </summary>
        [Output("deltaSharingRecipientTokenLifetimeInSeconds")]
        public Output<int?> DeltaSharingRecipientTokenLifetimeInSeconds { get; private set; } = null!;

        /// <summary>
        /// Required along with `delta_sharing_recipient_token_lifetime_in_seconds`. Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.
        /// </summary>
        [Output("deltaSharingScope")]
        public Output<string?> DeltaSharingScope { get; private set; } = null!;

        /// <summary>
        /// Destroy metastore regardless of its contents.
        /// </summary>
        [Output("forceDestroy")]
        public Output<bool?> ForceDestroy { get; private set; } = null!;

        [Output("globalMetastoreId")]
        public Output<string> GlobalMetastoreId { get; private set; } = null!;

        [Output("metastoreId")]
        public Output<string> MetastoreId { get; private set; } = null!;

        /// <summary>
        /// Name of metastore.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Username/groupname/sp application_id of the metastore owner.
        /// </summary>
        [Output("owner")]
        public Output<string> Owner { get; private set; } = null!;

        /// <summary>
        /// The region of the metastore
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Path on cloud storage account, where managed `databricks.Table` are stored. Change forces creation of a new resource. If no `storage_root` is defined for the metastore, each catalog must have a `storage_root` defined.
        /// </summary>
        [Output("storageRoot")]
        public Output<string?> StorageRoot { get; private set; } = null!;

        [Output("storageRootCredentialId")]
        public Output<string?> StorageRootCredentialId { get; private set; } = null!;

        [Output("updatedAt")]
        public Output<int> UpdatedAt { get; private set; } = null!;

        [Output("updatedBy")]
        public Output<string> UpdatedBy { get; private set; } = null!;


        /// <summary>
        /// Create a Metastore resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Metastore(string name, MetastoreArgs? args = null, CustomResourceOptions? options = null)
            : base("databricks:index/metastore:Metastore", name, args ?? new MetastoreArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Metastore(string name, Input<string> id, MetastoreState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/metastore:Metastore", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Metastore resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Metastore Get(string name, Input<string> id, MetastoreState? state = null, CustomResourceOptions? options = null)
        {
            return new Metastore(name, id, state, options);
        }
    }

    public sealed class MetastoreArgs : global::Pulumi.ResourceArgs
    {
        [Input("cloud")]
        public Input<string>? Cloud { get; set; }

        [Input("createdAt")]
        public Input<int>? CreatedAt { get; set; }

        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        [Input("defaultDataAccessConfigId")]
        public Input<string>? DefaultDataAccessConfigId { get; set; }

        /// <summary>
        /// The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing. Once this is set it cannot be removed and can only be modified to another valid value. To delete this value please taint and recreate the resource.
        /// </summary>
        [Input("deltaSharingOrganizationName")]
        public Input<string>? DeltaSharingOrganizationName { get; set; }

        /// <summary>
        /// Required along with `delta_sharing_scope`. Used to set expiration duration in seconds on recipient data access tokens. Set to 0 for unlimited duration.
        /// </summary>
        [Input("deltaSharingRecipientTokenLifetimeInSeconds")]
        public Input<int>? DeltaSharingRecipientTokenLifetimeInSeconds { get; set; }

        /// <summary>
        /// Required along with `delta_sharing_recipient_token_lifetime_in_seconds`. Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.
        /// </summary>
        [Input("deltaSharingScope")]
        public Input<string>? DeltaSharingScope { get; set; }

        /// <summary>
        /// Destroy metastore regardless of its contents.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        [Input("globalMetastoreId")]
        public Input<string>? GlobalMetastoreId { get; set; }

        [Input("metastoreId")]
        public Input<string>? MetastoreId { get; set; }

        /// <summary>
        /// Name of metastore.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Username/groupname/sp application_id of the metastore owner.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// The region of the metastore
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Path on cloud storage account, where managed `databricks.Table` are stored. Change forces creation of a new resource. If no `storage_root` is defined for the metastore, each catalog must have a `storage_root` defined.
        /// </summary>
        [Input("storageRoot")]
        public Input<string>? StorageRoot { get; set; }

        [Input("storageRootCredentialId")]
        public Input<string>? StorageRootCredentialId { get; set; }

        [Input("updatedAt")]
        public Input<int>? UpdatedAt { get; set; }

        [Input("updatedBy")]
        public Input<string>? UpdatedBy { get; set; }

        public MetastoreArgs()
        {
        }
        public static new MetastoreArgs Empty => new MetastoreArgs();
    }

    public sealed class MetastoreState : global::Pulumi.ResourceArgs
    {
        [Input("cloud")]
        public Input<string>? Cloud { get; set; }

        [Input("createdAt")]
        public Input<int>? CreatedAt { get; set; }

        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        [Input("defaultDataAccessConfigId")]
        public Input<string>? DefaultDataAccessConfigId { get; set; }

        /// <summary>
        /// The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing. Once this is set it cannot be removed and can only be modified to another valid value. To delete this value please taint and recreate the resource.
        /// </summary>
        [Input("deltaSharingOrganizationName")]
        public Input<string>? DeltaSharingOrganizationName { get; set; }

        /// <summary>
        /// Required along with `delta_sharing_scope`. Used to set expiration duration in seconds on recipient data access tokens. Set to 0 for unlimited duration.
        /// </summary>
        [Input("deltaSharingRecipientTokenLifetimeInSeconds")]
        public Input<int>? DeltaSharingRecipientTokenLifetimeInSeconds { get; set; }

        /// <summary>
        /// Required along with `delta_sharing_recipient_token_lifetime_in_seconds`. Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.
        /// </summary>
        [Input("deltaSharingScope")]
        public Input<string>? DeltaSharingScope { get; set; }

        /// <summary>
        /// Destroy metastore regardless of its contents.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        [Input("globalMetastoreId")]
        public Input<string>? GlobalMetastoreId { get; set; }

        [Input("metastoreId")]
        public Input<string>? MetastoreId { get; set; }

        /// <summary>
        /// Name of metastore.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Username/groupname/sp application_id of the metastore owner.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// The region of the metastore
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Path on cloud storage account, where managed `databricks.Table` are stored. Change forces creation of a new resource. If no `storage_root` is defined for the metastore, each catalog must have a `storage_root` defined.
        /// </summary>
        [Input("storageRoot")]
        public Input<string>? StorageRoot { get; set; }

        [Input("storageRootCredentialId")]
        public Input<string>? StorageRootCredentialId { get; set; }

        [Input("updatedAt")]
        public Input<int>? UpdatedAt { get; set; }

        [Input("updatedBy")]
        public Input<string>? UpdatedBy { get; set; }

        public MetastoreState()
        {
        }
        public static new MetastoreState Empty => new MetastoreState();
    }
}
