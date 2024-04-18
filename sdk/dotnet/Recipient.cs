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
    /// Within a metastore, Unity Catalog provides the ability to create a recipient to attach delta shares to.
    /// 
    /// A `databricks.Recipient` is contained within databricks.Metastore and can have permissions to `SELECT` from a list of shares.
    /// 
    /// ## Example Usage
    /// 
    /// ### Databricks Sharing with non databricks recipient
    /// 
    /// Setting `authentication_type` type to `TOKEN` creates a temporary url to download a credentials file. This is used to
    /// authenticate to the sharing server to access data. This is for when the recipient is not using Databricks.
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// using Random = Pulumi.Random;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var db2opensharecode = new Random.Index.Password("db2opensharecode", new()
    ///     {
    ///         Length = 16,
    ///         Special = true,
    ///     });
    /// 
    ///     var current = Databricks.GetCurrentUser.Invoke();
    /// 
    ///     var db2open = new Databricks.Recipient("db2open", new()
    ///     {
    ///         Name = $"{current.Apply(getCurrentUserResult =&gt; getCurrentUserResult.Alphanumeric)}-recipient",
    ///         Comment = "made by terraform",
    ///         AuthenticationType = "TOKEN",
    ///         SharingCode = db2opensharecode.Result,
    ///         IpAccessList = new Databricks.Inputs.RecipientIpAccessListArgs
    ///         {
    ///             AllowedIpAddresses = new() { },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [DatabricksResourceType("databricks:index/recipient:Recipient")]
    public partial class Recipient : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
        /// </summary>
        [Output("authenticationType")]
        public Output<string> AuthenticationType { get; private set; } = null!;

        /// <summary>
        /// Description about the recipient.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Required when `authentication_type` is `DATABRICKS`.
        /// </summary>
        [Output("dataRecipientGlobalMetastoreId")]
        public Output<string?> DataRecipientGlobalMetastoreId { get; private set; } = null!;

        /// <summary>
        /// Recipient IP access list.
        /// </summary>
        [Output("ipAccessList")]
        public Output<Outputs.RecipientIpAccessList?> IpAccessList { get; private set; } = null!;

        /// <summary>
        /// Name of recipient. Change forces creation of a new resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Username/groupname/sp application_id of the recipient owner.
        /// </summary>
        [Output("owner")]
        public Output<string?> Owner { get; private set; } = null!;

        /// <summary>
        /// The one-time sharing code provided by the data recipient.
        /// </summary>
        [Output("sharingCode")]
        public Output<string?> SharingCode { get; private set; } = null!;

        /// <summary>
        /// List of Recipient Tokens. This field is only present when the authentication_type is TOKEN. Each list element is an object with following attributes:
        /// </summary>
        [Output("tokens")]
        public Output<ImmutableArray<Outputs.RecipientToken>> Tokens { get; private set; } = null!;


        /// <summary>
        /// Create a Recipient resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Recipient(string name, RecipientArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/recipient:Recipient", name, args ?? new RecipientArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Recipient(string name, Input<string> id, RecipientState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/recipient:Recipient", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "sharingCode",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Recipient resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Recipient Get(string name, Input<string> id, RecipientState? state = null, CustomResourceOptions? options = null)
        {
            return new Recipient(name, id, state, options);
        }
    }

    public sealed class RecipientArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
        /// </summary>
        [Input("authenticationType", required: true)]
        public Input<string> AuthenticationType { get; set; } = null!;

        /// <summary>
        /// Description about the recipient.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Required when `authentication_type` is `DATABRICKS`.
        /// </summary>
        [Input("dataRecipientGlobalMetastoreId")]
        public Input<string>? DataRecipientGlobalMetastoreId { get; set; }

        /// <summary>
        /// Recipient IP access list.
        /// </summary>
        [Input("ipAccessList")]
        public Input<Inputs.RecipientIpAccessListArgs>? IpAccessList { get; set; }

        /// <summary>
        /// Name of recipient. Change forces creation of a new resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Username/groupname/sp application_id of the recipient owner.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("sharingCode")]
        private Input<string>? _sharingCode;

        /// <summary>
        /// The one-time sharing code provided by the data recipient.
        /// </summary>
        public Input<string>? SharingCode
        {
            get => _sharingCode;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sharingCode = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("tokens")]
        private InputList<Inputs.RecipientTokenArgs>? _tokens;

        /// <summary>
        /// List of Recipient Tokens. This field is only present when the authentication_type is TOKEN. Each list element is an object with following attributes:
        /// </summary>
        public InputList<Inputs.RecipientTokenArgs> Tokens
        {
            get => _tokens ?? (_tokens = new InputList<Inputs.RecipientTokenArgs>());
            set => _tokens = value;
        }

        public RecipientArgs()
        {
        }
        public static new RecipientArgs Empty => new RecipientArgs();
    }

    public sealed class RecipientState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
        /// </summary>
        [Input("authenticationType")]
        public Input<string>? AuthenticationType { get; set; }

        /// <summary>
        /// Description about the recipient.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Required when `authentication_type` is `DATABRICKS`.
        /// </summary>
        [Input("dataRecipientGlobalMetastoreId")]
        public Input<string>? DataRecipientGlobalMetastoreId { get; set; }

        /// <summary>
        /// Recipient IP access list.
        /// </summary>
        [Input("ipAccessList")]
        public Input<Inputs.RecipientIpAccessListGetArgs>? IpAccessList { get; set; }

        /// <summary>
        /// Name of recipient. Change forces creation of a new resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Username/groupname/sp application_id of the recipient owner.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("sharingCode")]
        private Input<string>? _sharingCode;

        /// <summary>
        /// The one-time sharing code provided by the data recipient.
        /// </summary>
        public Input<string>? SharingCode
        {
            get => _sharingCode;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sharingCode = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("tokens")]
        private InputList<Inputs.RecipientTokenGetArgs>? _tokens;

        /// <summary>
        /// List of Recipient Tokens. This field is only present when the authentication_type is TOKEN. Each list element is an object with following attributes:
        /// </summary>
        public InputList<Inputs.RecipientTokenGetArgs> Tokens
        {
            get => _tokens ?? (_tokens = new InputList<Inputs.RecipientTokenGetArgs>());
            set => _tokens = value;
        }

        public RecipientState()
        {
        }
        public static new RecipientState Empty => new RecipientState();
    }
}
