// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetZones
    {
        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// This data source allows you to fetch all available AWS availability zones on your workspace on AWS.
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
        ///     var zones = Databricks.GetZones.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetZonesResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZonesResult>("databricks:index/getZones:getZones", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// This data source allows you to fetch all available AWS availability zones on your workspace on AWS.
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
        ///     var zones = Databricks.GetZones.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZonesResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZonesResult>("databricks:index/getZones:getZones", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetZonesResult
    {
        /// <summary>
        /// This is the default zone that gets assigned to your workspace. This is the zone used by default for clusters and instance pools.
        /// </summary>
        public readonly string DefaultZone;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// This is a list of all the zones available for your subnets in your Databricks workspace.
        /// </summary>
        public readonly ImmutableArray<string> Zones;

        [OutputConstructor]
        private GetZonesResult(
            string defaultZone,

            string id,

            ImmutableArray<string> zones)
        {
            DefaultZone = defaultZone;
            Id = id;
            Zones = zones;
        }
    }
}
