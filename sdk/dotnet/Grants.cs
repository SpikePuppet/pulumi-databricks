// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    [DatabricksResourceType("databricks:index/grants:Grants")]
    public partial class Grants : global::Pulumi.CustomResource
    {
        [Output("catalog")]
        public Output<string?> Catalog { get; private set; } = null!;

        [Output("externalLocation")]
        public Output<string?> ExternalLocation { get; private set; } = null!;

        [Output("function")]
        public Output<string?> Function { get; private set; } = null!;

        [Output("grants")]
        public Output<ImmutableArray<Outputs.GrantsGrant>> GrantDetails { get; private set; } = null!;

        [Output("materializedView")]
        public Output<string?> MaterializedView { get; private set; } = null!;

        [Output("metastore")]
        public Output<string?> Metastore { get; private set; } = null!;

        [Output("schema")]
        public Output<string?> Schema { get; private set; } = null!;

        [Output("share")]
        public Output<string?> Share { get; private set; } = null!;

        [Output("storageCredential")]
        public Output<string?> StorageCredential { get; private set; } = null!;

        [Output("table")]
        public Output<string?> Table { get; private set; } = null!;

        [Output("view")]
        public Output<string?> View { get; private set; } = null!;

        [Output("volume")]
        public Output<string?> Volume { get; private set; } = null!;


        /// <summary>
        /// Create a Grants resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Grants(string name, GrantsArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/grants:Grants", name, args ?? new GrantsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Grants(string name, Input<string> id, GrantsState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/grants:Grants", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Grants resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Grants Get(string name, Input<string> id, GrantsState? state = null, CustomResourceOptions? options = null)
        {
            return new Grants(name, id, state, options);
        }
    }

    public sealed class GrantsArgs : global::Pulumi.ResourceArgs
    {
        [Input("catalog")]
        public Input<string>? Catalog { get; set; }

        [Input("externalLocation")]
        public Input<string>? ExternalLocation { get; set; }

        [Input("function")]
        public Input<string>? Function { get; set; }

        [Input("grants", required: true)]
        private InputList<Inputs.GrantsGrantArgs>? _grants;
        public InputList<Inputs.GrantsGrantArgs> GrantDetails
        {
            get => _grants ?? (_grants = new InputList<Inputs.GrantsGrantArgs>());
            set => _grants = value;
        }

        [Input("materializedView")]
        public Input<string>? MaterializedView { get; set; }

        [Input("metastore")]
        public Input<string>? Metastore { get; set; }

        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("share")]
        public Input<string>? Share { get; set; }

        [Input("storageCredential")]
        public Input<string>? StorageCredential { get; set; }

        [Input("table")]
        public Input<string>? Table { get; set; }

        [Input("view")]
        public Input<string>? View { get; set; }

        [Input("volume")]
        public Input<string>? Volume { get; set; }

        public GrantsArgs()
        {
        }
        public static new GrantsArgs Empty => new GrantsArgs();
    }

    public sealed class GrantsState : global::Pulumi.ResourceArgs
    {
        [Input("catalog")]
        public Input<string>? Catalog { get; set; }

        [Input("externalLocation")]
        public Input<string>? ExternalLocation { get; set; }

        [Input("function")]
        public Input<string>? Function { get; set; }

        [Input("grants")]
        private InputList<Inputs.GrantsGrantGetArgs>? _grants;
        public InputList<Inputs.GrantsGrantGetArgs> GrantDetails
        {
            get => _grants ?? (_grants = new InputList<Inputs.GrantsGrantGetArgs>());
            set => _grants = value;
        }

        [Input("materializedView")]
        public Input<string>? MaterializedView { get; set; }

        [Input("metastore")]
        public Input<string>? Metastore { get; set; }

        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("share")]
        public Input<string>? Share { get; set; }

        [Input("storageCredential")]
        public Input<string>? StorageCredential { get; set; }

        [Input("table")]
        public Input<string>? Table { get; set; }

        [Input("view")]
        public Input<string>? View { get; set; }

        [Input("volume")]
        public Input<string>? Volume { get; set; }

        public GrantsState()
        {
        }
        public static new GrantsState Empty => new GrantsState();
    }
}
