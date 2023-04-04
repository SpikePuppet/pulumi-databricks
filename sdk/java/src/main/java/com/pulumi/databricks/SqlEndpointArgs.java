// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.SqlEndpointChannelArgs;
import com.pulumi.databricks.inputs.SqlEndpointOdbcParamsArgs;
import com.pulumi.databricks.inputs.SqlEndpointTagsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlEndpointArgs Empty = new SqlEndpointArgs();

    /**
     * Time in minutes until an idle SQL warehouse terminates all clusters and stops. This field is optional. The default is 120, set to 0 to disable the auto stop.
     * 
     */
    @Import(name="autoStopMins")
    private @Nullable Output<Integer> autoStopMins;

    /**
     * @return Time in minutes until an idle SQL warehouse terminates all clusters and stops. This field is optional. The default is 120, set to 0 to disable the auto stop.
     * 
     */
    public Optional<Output<Integer>> autoStopMins() {
        return Optional.ofNullable(this.autoStopMins);
    }

    /**
     * block, consisting of following fields:
     * 
     */
    @Import(name="channel")
    private @Nullable Output<SqlEndpointChannelArgs> channel;

    /**
     * @return block, consisting of following fields:
     * 
     */
    public Optional<Output<SqlEndpointChannelArgs>> channel() {
        return Optional.ofNullable(this.channel);
    }

    /**
     * The size of the clusters allocated to the endpoint: &#34;2X-Small&#34;, &#34;X-Small&#34;, &#34;Small&#34;, &#34;Medium&#34;, &#34;Large&#34;, &#34;X-Large&#34;, &#34;2X-Large&#34;, &#34;3X-Large&#34;, &#34;4X-Large&#34;.
     * 
     */
    @Import(name="clusterSize", required=true)
    private Output<String> clusterSize;

    /**
     * @return The size of the clusters allocated to the endpoint: &#34;2X-Small&#34;, &#34;X-Small&#34;, &#34;Small&#34;, &#34;Medium&#34;, &#34;Large&#34;, &#34;X-Large&#34;, &#34;2X-Large&#34;, &#34;3X-Large&#34;, &#34;4X-Large&#34;.
     * 
     */
    public Output<String> clusterSize() {
        return this.clusterSize;
    }

    /**
     * ID of the data source for this endpoint. This is used to bind an Databricks SQL query to an endpoint.
     * 
     */
    @Import(name="dataSourceId")
    private @Nullable Output<String> dataSourceId;

    /**
     * @return ID of the data source for this endpoint. This is used to bind an Databricks SQL query to an endpoint.
     * 
     */
    public Optional<Output<String>> dataSourceId() {
        return Optional.ofNullable(this.dataSourceId);
    }

    /**
     * Whether to enable [Photon](https://databricks.com/product/delta-engine). This field is optional and is enabled by default.
     * 
     */
    @Import(name="enablePhoton")
    private @Nullable Output<Boolean> enablePhoton;

    /**
     * @return Whether to enable [Photon](https://databricks.com/product/delta-engine). This field is optional and is enabled by default.
     * 
     */
    public Optional<Output<Boolean>> enablePhoton() {
        return Optional.ofNullable(this.enablePhoton);
    }

    /**
     * Whether this SQL warehouse is a serverless endpoint. If this value is true explicitly or through the default, you **must** also set `warehouse_type` field to `pro`.
     * 
     */
    @Import(name="enableServerlessCompute")
    private @Nullable Output<Boolean> enableServerlessCompute;

    /**
     * @return Whether this SQL warehouse is a serverless endpoint. If this value is true explicitly or through the default, you **must** also set `warehouse_type` field to `pro`.
     * 
     */
    public Optional<Output<Boolean>> enableServerlessCompute() {
        return Optional.ofNullable(this.enableServerlessCompute);
    }

    @Import(name="instanceProfileArn")
    private @Nullable Output<String> instanceProfileArn;

    public Optional<Output<String>> instanceProfileArn() {
        return Optional.ofNullable(this.instanceProfileArn);
    }

    /**
     * JDBC connection string.
     * 
     */
    @Import(name="jdbcUrl")
    private @Nullable Output<String> jdbcUrl;

    /**
     * @return JDBC connection string.
     * 
     */
    public Optional<Output<String>> jdbcUrl() {
        return Optional.ofNullable(this.jdbcUrl);
    }

    /**
     * Maximum number of clusters available when a SQL warehouse is running. This field is required. If multi-cluster load balancing is not enabled, this is default to `1`.
     * 
     */
    @Import(name="maxNumClusters")
    private @Nullable Output<Integer> maxNumClusters;

    /**
     * @return Maximum number of clusters available when a SQL warehouse is running. This field is required. If multi-cluster load balancing is not enabled, this is default to `1`.
     * 
     */
    public Optional<Output<Integer>> maxNumClusters() {
        return Optional.ofNullable(this.maxNumClusters);
    }

    /**
     * Minimum number of clusters available when a SQL warehouse is running. The default is `1`.
     * 
     */
    @Import(name="minNumClusters")
    private @Nullable Output<Integer> minNumClusters;

    /**
     * @return Minimum number of clusters available when a SQL warehouse is running. The default is `1`.
     * 
     */
    public Optional<Output<Integer>> minNumClusters() {
        return Optional.ofNullable(this.minNumClusters);
    }

    /**
     * Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="numClusters")
    private @Nullable Output<Integer> numClusters;

    public Optional<Output<Integer>> numClusters() {
        return Optional.ofNullable(this.numClusters);
    }

    /**
     * ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
     * 
     */
    @Import(name="odbcParams")
    private @Nullable Output<SqlEndpointOdbcParamsArgs> odbcParams;

    /**
     * @return ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
     * 
     */
    public Optional<Output<SqlEndpointOdbcParamsArgs>> odbcParams() {
        return Optional.ofNullable(this.odbcParams);
    }

    /**
     * The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`. This field is optional. Default is `COST_OPTIMIZED`.
     * 
     */
    @Import(name="spotInstancePolicy")
    private @Nullable Output<String> spotInstancePolicy;

    /**
     * @return The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`. This field is optional. Default is `COST_OPTIMIZED`.
     * 
     */
    public Optional<Output<String>> spotInstancePolicy() {
        return Optional.ofNullable(this.spotInstancePolicy);
    }

    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Databricks tags all endpoint resources with these tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<SqlEndpointTagsArgs> tags;

    /**
     * @return Databricks tags all endpoint resources with these tags.
     * 
     */
    public Optional<Output<SqlEndpointTagsArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/admin/sql-endpoints.html#switch-the-sql-warehouse-type-pro-classic-or-serverless) or [Azure](https://docs.databricks.com/sql/admin/sql-endpoints.html#switch-the-sql-warehouse-type-pro-classic-or-serverless). Set to `PRO` or `CLASSIC` (default).  If you want to use serverless compute, you must set to `PRO` and **also** set the field `enable_serverless_compute` to `true`.
     * 
     */
    @Import(name="warehouseType")
    private @Nullable Output<String> warehouseType;

    /**
     * @return SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/admin/sql-endpoints.html#switch-the-sql-warehouse-type-pro-classic-or-serverless) or [Azure](https://docs.databricks.com/sql/admin/sql-endpoints.html#switch-the-sql-warehouse-type-pro-classic-or-serverless). Set to `PRO` or `CLASSIC` (default).  If you want to use serverless compute, you must set to `PRO` and **also** set the field `enable_serverless_compute` to `true`.
     * 
     */
    public Optional<Output<String>> warehouseType() {
        return Optional.ofNullable(this.warehouseType);
    }

    private SqlEndpointArgs() {}

    private SqlEndpointArgs(SqlEndpointArgs $) {
        this.autoStopMins = $.autoStopMins;
        this.channel = $.channel;
        this.clusterSize = $.clusterSize;
        this.dataSourceId = $.dataSourceId;
        this.enablePhoton = $.enablePhoton;
        this.enableServerlessCompute = $.enableServerlessCompute;
        this.instanceProfileArn = $.instanceProfileArn;
        this.jdbcUrl = $.jdbcUrl;
        this.maxNumClusters = $.maxNumClusters;
        this.minNumClusters = $.minNumClusters;
        this.name = $.name;
        this.numClusters = $.numClusters;
        this.odbcParams = $.odbcParams;
        this.spotInstancePolicy = $.spotInstancePolicy;
        this.state = $.state;
        this.tags = $.tags;
        this.warehouseType = $.warehouseType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlEndpointArgs $;

        public Builder() {
            $ = new SqlEndpointArgs();
        }

        public Builder(SqlEndpointArgs defaults) {
            $ = new SqlEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoStopMins Time in minutes until an idle SQL warehouse terminates all clusters and stops. This field is optional. The default is 120, set to 0 to disable the auto stop.
         * 
         * @return builder
         * 
         */
        public Builder autoStopMins(@Nullable Output<Integer> autoStopMins) {
            $.autoStopMins = autoStopMins;
            return this;
        }

        /**
         * @param autoStopMins Time in minutes until an idle SQL warehouse terminates all clusters and stops. This field is optional. The default is 120, set to 0 to disable the auto stop.
         * 
         * @return builder
         * 
         */
        public Builder autoStopMins(Integer autoStopMins) {
            return autoStopMins(Output.of(autoStopMins));
        }

        /**
         * @param channel block, consisting of following fields:
         * 
         * @return builder
         * 
         */
        public Builder channel(@Nullable Output<SqlEndpointChannelArgs> channel) {
            $.channel = channel;
            return this;
        }

        /**
         * @param channel block, consisting of following fields:
         * 
         * @return builder
         * 
         */
        public Builder channel(SqlEndpointChannelArgs channel) {
            return channel(Output.of(channel));
        }

        /**
         * @param clusterSize The size of the clusters allocated to the endpoint: &#34;2X-Small&#34;, &#34;X-Small&#34;, &#34;Small&#34;, &#34;Medium&#34;, &#34;Large&#34;, &#34;X-Large&#34;, &#34;2X-Large&#34;, &#34;3X-Large&#34;, &#34;4X-Large&#34;.
         * 
         * @return builder
         * 
         */
        public Builder clusterSize(Output<String> clusterSize) {
            $.clusterSize = clusterSize;
            return this;
        }

        /**
         * @param clusterSize The size of the clusters allocated to the endpoint: &#34;2X-Small&#34;, &#34;X-Small&#34;, &#34;Small&#34;, &#34;Medium&#34;, &#34;Large&#34;, &#34;X-Large&#34;, &#34;2X-Large&#34;, &#34;3X-Large&#34;, &#34;4X-Large&#34;.
         * 
         * @return builder
         * 
         */
        public Builder clusterSize(String clusterSize) {
            return clusterSize(Output.of(clusterSize));
        }

        /**
         * @param dataSourceId ID of the data source for this endpoint. This is used to bind an Databricks SQL query to an endpoint.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceId(@Nullable Output<String> dataSourceId) {
            $.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * @param dataSourceId ID of the data source for this endpoint. This is used to bind an Databricks SQL query to an endpoint.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceId(String dataSourceId) {
            return dataSourceId(Output.of(dataSourceId));
        }

        /**
         * @param enablePhoton Whether to enable [Photon](https://databricks.com/product/delta-engine). This field is optional and is enabled by default.
         * 
         * @return builder
         * 
         */
        public Builder enablePhoton(@Nullable Output<Boolean> enablePhoton) {
            $.enablePhoton = enablePhoton;
            return this;
        }

        /**
         * @param enablePhoton Whether to enable [Photon](https://databricks.com/product/delta-engine). This field is optional and is enabled by default.
         * 
         * @return builder
         * 
         */
        public Builder enablePhoton(Boolean enablePhoton) {
            return enablePhoton(Output.of(enablePhoton));
        }

        /**
         * @param enableServerlessCompute Whether this SQL warehouse is a serverless endpoint. If this value is true explicitly or through the default, you **must** also set `warehouse_type` field to `pro`.
         * 
         * @return builder
         * 
         */
        public Builder enableServerlessCompute(@Nullable Output<Boolean> enableServerlessCompute) {
            $.enableServerlessCompute = enableServerlessCompute;
            return this;
        }

        /**
         * @param enableServerlessCompute Whether this SQL warehouse is a serverless endpoint. If this value is true explicitly or through the default, you **must** also set `warehouse_type` field to `pro`.
         * 
         * @return builder
         * 
         */
        public Builder enableServerlessCompute(Boolean enableServerlessCompute) {
            return enableServerlessCompute(Output.of(enableServerlessCompute));
        }

        public Builder instanceProfileArn(@Nullable Output<String> instanceProfileArn) {
            $.instanceProfileArn = instanceProfileArn;
            return this;
        }

        public Builder instanceProfileArn(String instanceProfileArn) {
            return instanceProfileArn(Output.of(instanceProfileArn));
        }

        /**
         * @param jdbcUrl JDBC connection string.
         * 
         * @return builder
         * 
         */
        public Builder jdbcUrl(@Nullable Output<String> jdbcUrl) {
            $.jdbcUrl = jdbcUrl;
            return this;
        }

        /**
         * @param jdbcUrl JDBC connection string.
         * 
         * @return builder
         * 
         */
        public Builder jdbcUrl(String jdbcUrl) {
            return jdbcUrl(Output.of(jdbcUrl));
        }

        /**
         * @param maxNumClusters Maximum number of clusters available when a SQL warehouse is running. This field is required. If multi-cluster load balancing is not enabled, this is default to `1`.
         * 
         * @return builder
         * 
         */
        public Builder maxNumClusters(@Nullable Output<Integer> maxNumClusters) {
            $.maxNumClusters = maxNumClusters;
            return this;
        }

        /**
         * @param maxNumClusters Maximum number of clusters available when a SQL warehouse is running. This field is required. If multi-cluster load balancing is not enabled, this is default to `1`.
         * 
         * @return builder
         * 
         */
        public Builder maxNumClusters(Integer maxNumClusters) {
            return maxNumClusters(Output.of(maxNumClusters));
        }

        /**
         * @param minNumClusters Minimum number of clusters available when a SQL warehouse is running. The default is `1`.
         * 
         * @return builder
         * 
         */
        public Builder minNumClusters(@Nullable Output<Integer> minNumClusters) {
            $.minNumClusters = minNumClusters;
            return this;
        }

        /**
         * @param minNumClusters Minimum number of clusters available when a SQL warehouse is running. The default is `1`.
         * 
         * @return builder
         * 
         */
        public Builder minNumClusters(Integer minNumClusters) {
            return minNumClusters(Output.of(minNumClusters));
        }

        /**
         * @param name Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder numClusters(@Nullable Output<Integer> numClusters) {
            $.numClusters = numClusters;
            return this;
        }

        public Builder numClusters(Integer numClusters) {
            return numClusters(Output.of(numClusters));
        }

        /**
         * @param odbcParams ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
         * 
         * @return builder
         * 
         */
        public Builder odbcParams(@Nullable Output<SqlEndpointOdbcParamsArgs> odbcParams) {
            $.odbcParams = odbcParams;
            return this;
        }

        /**
         * @param odbcParams ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
         * 
         * @return builder
         * 
         */
        public Builder odbcParams(SqlEndpointOdbcParamsArgs odbcParams) {
            return odbcParams(Output.of(odbcParams));
        }

        /**
         * @param spotInstancePolicy The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`. This field is optional. Default is `COST_OPTIMIZED`.
         * 
         * @return builder
         * 
         */
        public Builder spotInstancePolicy(@Nullable Output<String> spotInstancePolicy) {
            $.spotInstancePolicy = spotInstancePolicy;
            return this;
        }

        /**
         * @param spotInstancePolicy The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`. This field is optional. Default is `COST_OPTIMIZED`.
         * 
         * @return builder
         * 
         */
        public Builder spotInstancePolicy(String spotInstancePolicy) {
            return spotInstancePolicy(Output.of(spotInstancePolicy));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags Databricks tags all endpoint resources with these tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<SqlEndpointTagsArgs> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Databricks tags all endpoint resources with these tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(SqlEndpointTagsArgs tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param warehouseType SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/admin/sql-endpoints.html#switch-the-sql-warehouse-type-pro-classic-or-serverless) or [Azure](https://docs.databricks.com/sql/admin/sql-endpoints.html#switch-the-sql-warehouse-type-pro-classic-or-serverless). Set to `PRO` or `CLASSIC` (default).  If you want to use serverless compute, you must set to `PRO` and **also** set the field `enable_serverless_compute` to `true`.
         * 
         * @return builder
         * 
         */
        public Builder warehouseType(@Nullable Output<String> warehouseType) {
            $.warehouseType = warehouseType;
            return this;
        }

        /**
         * @param warehouseType SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/admin/sql-endpoints.html#switch-the-sql-warehouse-type-pro-classic-or-serverless) or [Azure](https://docs.databricks.com/sql/admin/sql-endpoints.html#switch-the-sql-warehouse-type-pro-classic-or-serverless). Set to `PRO` or `CLASSIC` (default).  If you want to use serverless compute, you must set to `PRO` and **also** set the field `enable_serverless_compute` to `true`.
         * 
         * @return builder
         * 
         */
        public Builder warehouseType(String warehouseType) {
            return warehouseType(Output.of(warehouseType));
        }

        public SqlEndpointArgs build() {
            $.clusterSize = Objects.requireNonNull($.clusterSize, "expected parameter 'clusterSize' to be non-null");
            return $;
        }
    }

}
