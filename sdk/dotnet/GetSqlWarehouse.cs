// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetSqlWarehouse
    {
        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// Retrieves information about a databricks.getSqlWarehouse using its id. This could be retrieved programmatically using databricks.getSqlWarehouses data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// * Retrieve attributes of each SQL warehouses in a workspace:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var allSqlWarehouses = Databricks.GetSqlWarehouses.Invoke();
        /// 
        ///     var allSqlWarehouse = .Select(__value =&gt; 
        ///     {
        ///         return Databricks.GetSqlWarehouse.Invoke(new()
        ///         {
        ///             Id = __value,
        ///         });
        ///     }).ToList();
        /// 
        /// });
        /// ```
        /// 
        /// * Search for a specific SQL Warehouse by name:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Databricks.GetSqlWarehouse.Invoke(new()
        ///     {
        ///         Name = "Starter Warehouse",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related resources
        /// 
        /// The following resources are often used in the same context:
        /// 
        /// * End to end workspace management guide.
        /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
        /// * databricks.SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
        /// * databricks.SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all databricks.getSqlWarehouse of workspace.
        /// * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
        /// </summary>
        public static Task<GetSqlWarehouseResult> InvokeAsync(GetSqlWarehouseArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSqlWarehouseResult>("databricks:index/getSqlWarehouse:getSqlWarehouse", args ?? new GetSqlWarehouseArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// Retrieves information about a databricks.getSqlWarehouse using its id. This could be retrieved programmatically using databricks.getSqlWarehouses data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// * Retrieve attributes of each SQL warehouses in a workspace:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var allSqlWarehouses = Databricks.GetSqlWarehouses.Invoke();
        /// 
        ///     var allSqlWarehouse = .Select(__value =&gt; 
        ///     {
        ///         return Databricks.GetSqlWarehouse.Invoke(new()
        ///         {
        ///             Id = __value,
        ///         });
        ///     }).ToList();
        /// 
        /// });
        /// ```
        /// 
        /// * Search for a specific SQL Warehouse by name:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Databricks.GetSqlWarehouse.Invoke(new()
        ///     {
        ///         Name = "Starter Warehouse",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related resources
        /// 
        /// The following resources are often used in the same context:
        /// 
        /// * End to end workspace management guide.
        /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
        /// * databricks.SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
        /// * databricks.SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all databricks.getSqlWarehouse of workspace.
        /// * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
        /// </summary>
        public static Output<GetSqlWarehouseResult> Invoke(GetSqlWarehouseInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSqlWarehouseResult>("databricks:index/getSqlWarehouse:getSqlWarehouse", args ?? new GetSqlWarehouseInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSqlWarehouseArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Time in minutes until an idle SQL warehouse terminates all clusters and stops.
        /// </summary>
        [Input("autoStopMins")]
        public int? AutoStopMins { get; set; }

        /// <summary>
        /// block, consisting of following fields:
        /// </summary>
        [Input("channel")]
        public Inputs.GetSqlWarehouseChannelArgs? Channel { get; set; }

        /// <summary>
        /// The size of the clusters allocated to the warehouse: "2X-Small", "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large".
        /// </summary>
        [Input("clusterSize")]
        public string? ClusterSize { get; set; }

        /// <summary>
        /// The username of the user who created the endpoint.
        /// </summary>
        [Input("creatorName")]
        public string? CreatorName { get; set; }

        /// <summary>
        /// ID of the data source for this warehouse. This is used to bind an Databricks SQL query to an warehouse.
        /// </summary>
        [Input("dataSourceId")]
        public string? DataSourceId { get; set; }

        /// <summary>
        /// Whether [Photon](https://databricks.com/product/delta-engine) is enabled.
        /// </summary>
        [Input("enablePhoton")]
        public bool? EnablePhoton { get; set; }

        /// <summary>
        /// Whether this SQL warehouse is a serverless SQL warehouse.
        /// </summary>
        [Input("enableServerlessCompute")]
        public bool? EnableServerlessCompute { get; set; }

        /// <summary>
        /// Health status of the endpoint.
        /// </summary>
        [Input("health")]
        public Inputs.GetSqlWarehouseHealthArgs? Health { get; set; }

        /// <summary>
        /// The ID of the SQL warehouse.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        [Input("instanceProfileArn")]
        public string? InstanceProfileArn { get; set; }

        /// <summary>
        /// JDBC connection string.
        /// </summary>
        [Input("jdbcUrl")]
        public string? JdbcUrl { get; set; }

        /// <summary>
        /// Maximum number of clusters available when a SQL warehouse is running.
        /// </summary>
        [Input("maxNumClusters")]
        public int? MaxNumClusters { get; set; }

        /// <summary>
        /// Minimum number of clusters available when a SQL warehouse is running.
        /// </summary>
        [Input("minNumClusters")]
        public int? MinNumClusters { get; set; }

        /// <summary>
        /// Name of the SQL warehouse to search (case-sensitive).
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The current number of clusters used by the endpoint.
        /// </summary>
        [Input("numActiveSessions")]
        public int? NumActiveSessions { get; set; }

        /// <summary>
        /// The current number of clusters used by the endpoint.
        /// </summary>
        [Input("numClusters")]
        public int? NumClusters { get; set; }

        /// <summary>
        /// ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
        /// </summary>
        [Input("odbcParams")]
        public Inputs.GetSqlWarehouseOdbcParamsArgs? OdbcParams { get; set; }

        /// <summary>
        /// The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`.
        /// </summary>
        [Input("spotInstancePolicy")]
        public string? SpotInstancePolicy { get; set; }

        /// <summary>
        /// The current state of the endpoint.
        /// </summary>
        [Input("state")]
        public string? State { get; set; }

        /// <summary>
        /// tags used for SQL warehouse resources.
        /// </summary>
        [Input("tags")]
        public Inputs.GetSqlWarehouseTagsArgs? Tags { get; set; }

        /// <summary>
        /// SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/index.html#warehouse-types) or [Azure](https://learn.microsoft.com/azure/databricks/sql/#warehouse-types).
        /// </summary>
        [Input("warehouseType")]
        public string? WarehouseType { get; set; }

        public GetSqlWarehouseArgs()
        {
        }
        public static new GetSqlWarehouseArgs Empty => new GetSqlWarehouseArgs();
    }

    public sealed class GetSqlWarehouseInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Time in minutes until an idle SQL warehouse terminates all clusters and stops.
        /// </summary>
        [Input("autoStopMins")]
        public Input<int>? AutoStopMins { get; set; }

        /// <summary>
        /// block, consisting of following fields:
        /// </summary>
        [Input("channel")]
        public Input<Inputs.GetSqlWarehouseChannelInputArgs>? Channel { get; set; }

        /// <summary>
        /// The size of the clusters allocated to the warehouse: "2X-Small", "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large".
        /// </summary>
        [Input("clusterSize")]
        public Input<string>? ClusterSize { get; set; }

        /// <summary>
        /// The username of the user who created the endpoint.
        /// </summary>
        [Input("creatorName")]
        public Input<string>? CreatorName { get; set; }

        /// <summary>
        /// ID of the data source for this warehouse. This is used to bind an Databricks SQL query to an warehouse.
        /// </summary>
        [Input("dataSourceId")]
        public Input<string>? DataSourceId { get; set; }

        /// <summary>
        /// Whether [Photon](https://databricks.com/product/delta-engine) is enabled.
        /// </summary>
        [Input("enablePhoton")]
        public Input<bool>? EnablePhoton { get; set; }

        /// <summary>
        /// Whether this SQL warehouse is a serverless SQL warehouse.
        /// </summary>
        [Input("enableServerlessCompute")]
        public Input<bool>? EnableServerlessCompute { get; set; }

        /// <summary>
        /// Health status of the endpoint.
        /// </summary>
        [Input("health")]
        public Input<Inputs.GetSqlWarehouseHealthInputArgs>? Health { get; set; }

        /// <summary>
        /// The ID of the SQL warehouse.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("instanceProfileArn")]
        public Input<string>? InstanceProfileArn { get; set; }

        /// <summary>
        /// JDBC connection string.
        /// </summary>
        [Input("jdbcUrl")]
        public Input<string>? JdbcUrl { get; set; }

        /// <summary>
        /// Maximum number of clusters available when a SQL warehouse is running.
        /// </summary>
        [Input("maxNumClusters")]
        public Input<int>? MaxNumClusters { get; set; }

        /// <summary>
        /// Minimum number of clusters available when a SQL warehouse is running.
        /// </summary>
        [Input("minNumClusters")]
        public Input<int>? MinNumClusters { get; set; }

        /// <summary>
        /// Name of the SQL warehouse to search (case-sensitive).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The current number of clusters used by the endpoint.
        /// </summary>
        [Input("numActiveSessions")]
        public Input<int>? NumActiveSessions { get; set; }

        /// <summary>
        /// The current number of clusters used by the endpoint.
        /// </summary>
        [Input("numClusters")]
        public Input<int>? NumClusters { get; set; }

        /// <summary>
        /// ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
        /// </summary>
        [Input("odbcParams")]
        public Input<Inputs.GetSqlWarehouseOdbcParamsInputArgs>? OdbcParams { get; set; }

        /// <summary>
        /// The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`.
        /// </summary>
        [Input("spotInstancePolicy")]
        public Input<string>? SpotInstancePolicy { get; set; }

        /// <summary>
        /// The current state of the endpoint.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// tags used for SQL warehouse resources.
        /// </summary>
        [Input("tags")]
        public Input<Inputs.GetSqlWarehouseTagsInputArgs>? Tags { get; set; }

        /// <summary>
        /// SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/index.html#warehouse-types) or [Azure](https://learn.microsoft.com/azure/databricks/sql/#warehouse-types).
        /// </summary>
        [Input("warehouseType")]
        public Input<string>? WarehouseType { get; set; }

        public GetSqlWarehouseInvokeArgs()
        {
        }
        public static new GetSqlWarehouseInvokeArgs Empty => new GetSqlWarehouseInvokeArgs();
    }


    [OutputType]
    public sealed class GetSqlWarehouseResult
    {
        /// <summary>
        /// Time in minutes until an idle SQL warehouse terminates all clusters and stops.
        /// </summary>
        public readonly int AutoStopMins;
        /// <summary>
        /// block, consisting of following fields:
        /// </summary>
        public readonly Outputs.GetSqlWarehouseChannelResult Channel;
        /// <summary>
        /// The size of the clusters allocated to the warehouse: "2X-Small", "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large".
        /// </summary>
        public readonly string ClusterSize;
        /// <summary>
        /// The username of the user who created the endpoint.
        /// </summary>
        public readonly string CreatorName;
        /// <summary>
        /// ID of the data source for this warehouse. This is used to bind an Databricks SQL query to an warehouse.
        /// </summary>
        public readonly string DataSourceId;
        /// <summary>
        /// Whether [Photon](https://databricks.com/product/delta-engine) is enabled.
        /// </summary>
        public readonly bool EnablePhoton;
        /// <summary>
        /// Whether this SQL warehouse is a serverless SQL warehouse.
        /// </summary>
        public readonly bool EnableServerlessCompute;
        /// <summary>
        /// Health status of the endpoint.
        /// </summary>
        public readonly Outputs.GetSqlWarehouseHealthResult Health;
        /// <summary>
        /// The ID of the SQL warehouse.
        /// </summary>
        public readonly string Id;
        public readonly string InstanceProfileArn;
        /// <summary>
        /// JDBC connection string.
        /// </summary>
        public readonly string JdbcUrl;
        /// <summary>
        /// Maximum number of clusters available when a SQL warehouse is running.
        /// </summary>
        public readonly int MaxNumClusters;
        /// <summary>
        /// Minimum number of clusters available when a SQL warehouse is running.
        /// </summary>
        public readonly int MinNumClusters;
        /// <summary>
        /// Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The current number of clusters used by the endpoint.
        /// </summary>
        public readonly int NumActiveSessions;
        /// <summary>
        /// The current number of clusters used by the endpoint.
        /// </summary>
        public readonly int NumClusters;
        /// <summary>
        /// ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
        /// </summary>
        public readonly Outputs.GetSqlWarehouseOdbcParamsResult OdbcParams;
        /// <summary>
        /// The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`.
        /// </summary>
        public readonly string SpotInstancePolicy;
        /// <summary>
        /// The current state of the endpoint.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// tags used for SQL warehouse resources.
        /// </summary>
        public readonly Outputs.GetSqlWarehouseTagsResult Tags;
        /// <summary>
        /// SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/index.html#warehouse-types) or [Azure](https://learn.microsoft.com/azure/databricks/sql/#warehouse-types).
        /// </summary>
        public readonly string WarehouseType;

        [OutputConstructor]
        private GetSqlWarehouseResult(
            int autoStopMins,

            Outputs.GetSqlWarehouseChannelResult channel,

            string clusterSize,

            string creatorName,

            string dataSourceId,

            bool enablePhoton,

            bool enableServerlessCompute,

            Outputs.GetSqlWarehouseHealthResult health,

            string id,

            string instanceProfileArn,

            string jdbcUrl,

            int maxNumClusters,

            int minNumClusters,

            string name,

            int numActiveSessions,

            int numClusters,

            Outputs.GetSqlWarehouseOdbcParamsResult odbcParams,

            string spotInstancePolicy,

            string state,

            Outputs.GetSqlWarehouseTagsResult tags,

            string warehouseType)
        {
            AutoStopMins = autoStopMins;
            Channel = channel;
            ClusterSize = clusterSize;
            CreatorName = creatorName;
            DataSourceId = dataSourceId;
            EnablePhoton = enablePhoton;
            EnableServerlessCompute = enableServerlessCompute;
            Health = health;
            Id = id;
            InstanceProfileArn = instanceProfileArn;
            JdbcUrl = jdbcUrl;
            MaxNumClusters = maxNumClusters;
            MinNumClusters = minNumClusters;
            Name = name;
            NumActiveSessions = numActiveSessions;
            NumClusters = numClusters;
            OdbcParams = odbcParams;
            SpotInstancePolicy = spotInstancePolicy;
            State = state;
            Tags = tags;
            WarehouseType = warehouseType;
        }
    }
}
