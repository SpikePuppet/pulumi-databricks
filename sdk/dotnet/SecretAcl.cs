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
    /// Create or overwrite the ACL associated with the given principal (user or group) on the specified databricks_secret_scope. Please consult [Secrets User Guide](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) for more details.
    /// 
    /// ## Example Usage
    /// 
    /// This way, data scientists can read the Publishing API key that is synchronized from, for example, Azure Key Vault.
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
    ///     var ds = new Databricks.Group("ds");
    /// 
    ///     var app = new Databricks.SecretScope("app");
    /// 
    ///     var mySecretAcl = new Databricks.SecretAcl("mySecretAcl", new()
    ///     {
    ///         Principal = ds.DisplayName,
    ///         Permission = "READ",
    ///         Scope = app.Name,
    ///     });
    /// 
    ///     var publishingApi = new Databricks.Secret("publishingApi", new()
    ///     {
    ///         Key = "publishing_api",
    ///         StringValue = data.Azurerm_key_vault_secret.Example.Value,
    ///         Scope = app.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * End to end workspace management guide.
    /// * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
    /// * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
    /// * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
    /// * databricks.Secret to manage [secrets](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) in Databricks workspace.
    /// * databricks.SecretScope to create [secret scopes](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) in Databricks workspace.
    /// 
    /// ## Import
    /// 
    /// The resource secret acl can be imported using `scopeName|||principalName` combination.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/secretAcl:SecretAcl object `scopeName|||principalName`
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/secretAcl:SecretAcl")]
    public partial class SecretAcl : global::Pulumi.CustomResource
    {
        /// <summary>
        /// `READ`, `WRITE` or `MANAGE`.
        /// </summary>
        [Output("permission")]
        public Output<string> Permission { get; private set; } = null!;

        /// <summary>
        /// principal's identifier. It can be:
        /// </summary>
        [Output("principal")]
        public Output<string> Principal { get; private set; } = null!;

        /// <summary>
        /// name of the scope
        /// </summary>
        [Output("scope")]
        public Output<string> Scope { get; private set; } = null!;


        /// <summary>
        /// Create a SecretAcl resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecretAcl(string name, SecretAclArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/secretAcl:SecretAcl", name, args ?? new SecretAclArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecretAcl(string name, Input<string> id, SecretAclState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/secretAcl:SecretAcl", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SecretAcl resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecretAcl Get(string name, Input<string> id, SecretAclState? state = null, CustomResourceOptions? options = null)
        {
            return new SecretAcl(name, id, state, options);
        }
    }

    public sealed class SecretAclArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `READ`, `WRITE` or `MANAGE`.
        /// </summary>
        [Input("permission", required: true)]
        public Input<string> Permission { get; set; } = null!;

        /// <summary>
        /// principal's identifier. It can be:
        /// </summary>
        [Input("principal", required: true)]
        public Input<string> Principal { get; set; } = null!;

        /// <summary>
        /// name of the scope
        /// </summary>
        [Input("scope", required: true)]
        public Input<string> Scope { get; set; } = null!;

        public SecretAclArgs()
        {
        }
        public static new SecretAclArgs Empty => new SecretAclArgs();
    }

    public sealed class SecretAclState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `READ`, `WRITE` or `MANAGE`.
        /// </summary>
        [Input("permission")]
        public Input<string>? Permission { get; set; }

        /// <summary>
        /// principal's identifier. It can be:
        /// </summary>
        [Input("principal")]
        public Input<string>? Principal { get; set; }

        /// <summary>
        /// name of the scope
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        public SecretAclState()
        {
        }
        public static new SecretAclState Empty => new SecretAclState();
    }
}
