// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ClusterDockerImageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `basic_auth.username` and `basic_auth.password` for Docker repository. Docker registry credentials are encrypted when they are stored in Databricks internal storage and when they are passed to a registry upon fetching Docker images at cluster launch. However, other authenticated and authorized API users of this workspace can access the username and password.
        /// 
        /// Example usage with azurerm_container_registry, that you can adapt to your specific use-case:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// using Docker = Pulumi.Docker;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = new Docker.Index.RegistryImage("this", new()
        ///     {
        ///         Build = new[]
        ///         {
        ///             null,
        ///         },
        ///         Name = $"{thisAzurermContainerRegistry.LoginServer}/sample:latest",
        ///     });
        /// 
        ///     var thisCluster = new Databricks.Cluster("this", new()
        ///     {
        ///         DockerImage = new Databricks.Inputs.ClusterDockerImageArgs
        ///         {
        ///             Url = @this.Name,
        ///             BasicAuth = new Databricks.Inputs.ClusterDockerImageBasicAuthArgs
        ///             {
        ///                 Username = thisAzurermContainerRegistry.AdminUsername,
        ///                 Password = thisAzurermContainerRegistry.AdminPassword,
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        [Input("basicAuth")]
        public Input<Inputs.ClusterDockerImageBasicAuthArgs>? BasicAuth { get; set; }

        /// <summary>
        /// URL for the Docker image
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public ClusterDockerImageArgs()
        {
        }
        public static new ClusterDockerImageArgs Empty => new ClusterDockerImageArgs();
    }
}
