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
    /// Create service principal secret
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var terraformSp = new Databricks.ServicePrincipalSecret("terraform_sp", new()
    ///     {
    ///         ServicePrincipalId = @this.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * databricks.ServicePrincipal to manage [Service Principals](https://docs.databricks.com/administration-guide/users-groups/service-principals.html) in Databricks
    /// </summary>
    [DatabricksResourceType("databricks:index/servicePrincipalSecret:ServicePrincipalSecret")]
    public partial class ServicePrincipalSecret : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Generated secret for the service principal
        /// </summary>
        [Output("secret")]
        public Output<string> Secret { get; private set; } = null!;

        /// <summary>
        /// ID of the databricks.ServicePrincipal (not application ID).
        /// </summary>
        [Output("servicePrincipalId")]
        public Output<string> ServicePrincipalId { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a ServicePrincipalSecret resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServicePrincipalSecret(string name, ServicePrincipalSecretArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/servicePrincipalSecret:ServicePrincipalSecret", name, args ?? new ServicePrincipalSecretArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServicePrincipalSecret(string name, Input<string> id, ServicePrincipalSecretState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/servicePrincipalSecret:ServicePrincipalSecret", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "secret",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ServicePrincipalSecret resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServicePrincipalSecret Get(string name, Input<string> id, ServicePrincipalSecretState? state = null, CustomResourceOptions? options = null)
        {
            return new ServicePrincipalSecret(name, id, state, options);
        }
    }

    public sealed class ServicePrincipalSecretArgs : global::Pulumi.ResourceArgs
    {
        [Input("secret")]
        private Input<string>? _secret;

        /// <summary>
        /// Generated secret for the service principal
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// ID of the databricks.ServicePrincipal (not application ID).
        /// </summary>
        [Input("servicePrincipalId", required: true)]
        public Input<string> ServicePrincipalId { get; set; } = null!;

        [Input("status")]
        public Input<string>? Status { get; set; }

        public ServicePrincipalSecretArgs()
        {
        }
        public static new ServicePrincipalSecretArgs Empty => new ServicePrincipalSecretArgs();
    }

    public sealed class ServicePrincipalSecretState : global::Pulumi.ResourceArgs
    {
        [Input("secret")]
        private Input<string>? _secret;

        /// <summary>
        /// Generated secret for the service principal
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// ID of the databricks.ServicePrincipal (not application ID).
        /// </summary>
        [Input("servicePrincipalId")]
        public Input<string>? ServicePrincipalId { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        public ServicePrincipalSecretState()
        {
        }
        public static new ServicePrincipalSecretState Empty => new ServicePrincipalSecretState();
    }
}
