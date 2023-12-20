// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class InstancePoolPreloadedDockerImage
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
        ///     var thisdocker_registry_image = new Docker.Index.Docker_registry_image("thisdocker_registry_image", new()
        ///     {
        ///         Name = $"{azurerm_container_registry.This.Login_server}/sample:latest",
        ///         Build = new[]
        ///         {
        ///             null,
        ///         },
        ///     });
        /// 
        ///     var thisInstancePool = new Databricks.InstancePool("thisInstancePool", new()
        ///     {
        ///         PreloadedDockerImages = new[]
        ///         {
        ///             new Databricks.Inputs.InstancePoolPreloadedDockerImageArgs
        ///             {
        ///                 Url = thisdocker_registry_image.Name,
        ///                 BasicAuth = new Databricks.Inputs.InstancePoolPreloadedDockerImageBasicAuthArgs
        ///                 {
        ///                     Username = azurerm_container_registry.This.Admin_username,
        ///                     Password = azurerm_container_registry.This.Admin_password,
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public readonly Outputs.InstancePoolPreloadedDockerImageBasicAuth? BasicAuth;
        /// <summary>
        /// URL for the Docker image
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private InstancePoolPreloadedDockerImage(
            Outputs.InstancePoolPreloadedDockerImageBasicAuth? basicAuth,

            string url)
        {
            BasicAuth = basicAuth;
            Url = url;
        }
    }
}
