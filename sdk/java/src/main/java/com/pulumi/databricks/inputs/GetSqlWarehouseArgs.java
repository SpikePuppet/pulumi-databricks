// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetSqlWarehouseChannelArgs;
import com.pulumi.databricks.inputs.GetSqlWarehouseHealthArgs;
import com.pulumi.databricks.inputs.GetSqlWarehouseOdbcParamsArgs;
import com.pulumi.databricks.inputs.GetSqlWarehouseTagsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSqlWarehouseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSqlWarehouseArgs Empty = new GetSqlWarehouseArgs();

    /**
     * Time in minutes until an idle SQL warehouse terminates all clusters and stops.
     * 
     */
    @Import(name="autoStopMins")
    private @Nullable Output<Integer> autoStopMins;

    /**
     * @return Time in minutes until an idle SQL warehouse terminates all clusters and stops.
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
    private @Nullable Output<GetSqlWarehouseChannelArgs> channel;

    /**
     * @return block, consisting of following fields:
     * 
     */
    public Optional<Output<GetSqlWarehouseChannelArgs>> channel() {
        return Optional.ofNullable(this.channel);
    }

    /**
     * The size of the clusters allocated to the warehouse: &#34;2X-Small&#34;, &#34;X-Small&#34;, &#34;Small&#34;, &#34;Medium&#34;, &#34;Large&#34;, &#34;X-Large&#34;, &#34;2X-Large&#34;, &#34;3X-Large&#34;, &#34;4X-Large&#34;.
     * 
     */
    @Import(name="clusterSize")
    private @Nullable Output<String> clusterSize;

    /**
     * @return The size of the clusters allocated to the warehouse: &#34;2X-Small&#34;, &#34;X-Small&#34;, &#34;Small&#34;, &#34;Medium&#34;, &#34;Large&#34;, &#34;X-Large&#34;, &#34;2X-Large&#34;, &#34;3X-Large&#34;, &#34;4X-Large&#34;.
     * 
     */
    public Optional<Output<String>> clusterSize() {
        return Optional.ofNullable(this.clusterSize);
    }

    /**
     * The username of the user who created the endpoint.
     * 
     */
    @Import(name="creatorName")
    private @Nullable Output<String> creatorName;

    /**
     * @return The username of the user who created the endpoint.
     * 
     */
    public Optional<Output<String>> creatorName() {
        return Optional.ofNullable(this.creatorName);
    }

    /**
     * ID of the data source for this warehouse. This is used to bind an Databricks SQL query to an warehouse.
     * 
     */
    @Import(name="dataSourceId")
    private @Nullable Output<String> dataSourceId;

    /**
     * @return ID of the data source for this warehouse. This is used to bind an Databricks SQL query to an warehouse.
     * 
     */
    public Optional<Output<String>> dataSourceId() {
        return Optional.ofNullable(this.dataSourceId);
    }

    /**
     * Whether [Photon](https://databricks.com/product/delta-engine) is enabled.
     * 
     */
    @Import(name="enablePhoton")
    private @Nullable Output<Boolean> enablePhoton;

    /**
     * @return Whether [Photon](https://databricks.com/product/delta-engine) is enabled.
     * 
     */
    public Optional<Output<Boolean>> enablePhoton() {
        return Optional.ofNullable(this.enablePhoton);
    }

    /**
     * Whether this SQL warehouse is a serverless SQL warehouse.
     * 
     */
    @Import(name="enableServerlessCompute")
    private @Nullable Output<Boolean> enableServerlessCompute;

    /**
     * @return Whether this SQL warehouse is a serverless SQL warehouse.
     * 
     */
    public Optional<Output<Boolean>> enableServerlessCompute() {
        return Optional.ofNullable(this.enableServerlessCompute);
    }

    /**
     * Health status of the endpoint.
     * 
     */
    @Import(name="health")
    private @Nullable Output<GetSqlWarehouseHealthArgs> health;

    /**
     * @return Health status of the endpoint.
     * 
     */
    public Optional<Output<GetSqlWarehouseHealthArgs>> health() {
        return Optional.ofNullable(this.health);
    }

    /**
     * The ID of the SQL warehouse.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the SQL warehouse.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
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
     * Maximum number of clusters available when a SQL warehouse is running.
     * 
     */
    @Import(name="maxNumClusters")
    private @Nullable Output<Integer> maxNumClusters;

    /**
     * @return Maximum number of clusters available when a SQL warehouse is running.
     * 
     */
    public Optional<Output<Integer>> maxNumClusters() {
        return Optional.ofNullable(this.maxNumClusters);
    }

    /**
     * Minimum number of clusters available when a SQL warehouse is running.
     * 
     */
    @Import(name="minNumClusters")
    private @Nullable Output<Integer> minNumClusters;

    /**
     * @return Minimum number of clusters available when a SQL warehouse is running.
     * 
     */
    public Optional<Output<Integer>> minNumClusters() {
        return Optional.ofNullable(this.minNumClusters);
    }

    /**
     * Name of the SQL warehouse to search (case-sensitive).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the SQL warehouse to search (case-sensitive).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The current number of clusters used by the endpoint.
     * 
     */
    @Import(name="numActiveSessions")
    private @Nullable Output<Integer> numActiveSessions;

    /**
     * @return The current number of clusters used by the endpoint.
     * 
     */
    public Optional<Output<Integer>> numActiveSessions() {
        return Optional.ofNullable(this.numActiveSessions);
    }

    /**
     * The current number of clusters used by the endpoint.
     * 
     */
    @Import(name="numClusters")
    private @Nullable Output<Integer> numClusters;

    /**
     * @return The current number of clusters used by the endpoint.
     * 
     */
    public Optional<Output<Integer>> numClusters() {
        return Optional.ofNullable(this.numClusters);
    }

    /**
     * ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
     * 
     */
    @Import(name="odbcParams")
    private @Nullable Output<GetSqlWarehouseOdbcParamsArgs> odbcParams;

    /**
     * @return ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
     * 
     */
    public Optional<Output<GetSqlWarehouseOdbcParamsArgs>> odbcParams() {
        return Optional.ofNullable(this.odbcParams);
    }

    /**
     * The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`.
     * 
     */
    @Import(name="spotInstancePolicy")
    private @Nullable Output<String> spotInstancePolicy;

    /**
     * @return The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`.
     * 
     */
    public Optional<Output<String>> spotInstancePolicy() {
        return Optional.ofNullable(this.spotInstancePolicy);
    }

    /**
     * The current state of the endpoint.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the endpoint.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * tags used for SQL warehouse resources.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<GetSqlWarehouseTagsArgs> tags;

    /**
     * @return tags used for SQL warehouse resources.
     * 
     */
    public Optional<Output<GetSqlWarehouseTagsArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/index.html#warehouse-types) or [Azure](https://learn.microsoft.com/azure/databricks/sql/#warehouse-types).
     * 
     */
    @Import(name="warehouseType")
    private @Nullable Output<String> warehouseType;

    /**
     * @return SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/index.html#warehouse-types) or [Azure](https://learn.microsoft.com/azure/databricks/sql/#warehouse-types).
     * 
     */
    public Optional<Output<String>> warehouseType() {
        return Optional.ofNullable(this.warehouseType);
    }

    private GetSqlWarehouseArgs() {}

    private GetSqlWarehouseArgs(GetSqlWarehouseArgs $) {
        this.autoStopMins = $.autoStopMins;
        this.channel = $.channel;
        this.clusterSize = $.clusterSize;
        this.creatorName = $.creatorName;
        this.dataSourceId = $.dataSourceId;
        this.enablePhoton = $.enablePhoton;
        this.enableServerlessCompute = $.enableServerlessCompute;
        this.health = $.health;
        this.id = $.id;
        this.instanceProfileArn = $.instanceProfileArn;
        this.jdbcUrl = $.jdbcUrl;
        this.maxNumClusters = $.maxNumClusters;
        this.minNumClusters = $.minNumClusters;
        this.name = $.name;
        this.numActiveSessions = $.numActiveSessions;
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
    public static Builder builder(GetSqlWarehouseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlWarehouseArgs $;

        public Builder() {
            $ = new GetSqlWarehouseArgs();
        }

        public Builder(GetSqlWarehouseArgs defaults) {
            $ = new GetSqlWarehouseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoStopMins Time in minutes until an idle SQL warehouse terminates all clusters and stops.
         * 
         * @return builder
         * 
         */
        public Builder autoStopMins(@Nullable Output<Integer> autoStopMins) {
            $.autoStopMins = autoStopMins;
            return this;
        }

        /**
         * @param autoStopMins Time in minutes until an idle SQL warehouse terminates all clusters and stops.
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
        public Builder channel(@Nullable Output<GetSqlWarehouseChannelArgs> channel) {
            $.channel = channel;
            return this;
        }

        /**
         * @param channel block, consisting of following fields:
         * 
         * @return builder
         * 
         */
        public Builder channel(GetSqlWarehouseChannelArgs channel) {
            return channel(Output.of(channel));
        }

        /**
         * @param clusterSize The size of the clusters allocated to the warehouse: &#34;2X-Small&#34;, &#34;X-Small&#34;, &#34;Small&#34;, &#34;Medium&#34;, &#34;Large&#34;, &#34;X-Large&#34;, &#34;2X-Large&#34;, &#34;3X-Large&#34;, &#34;4X-Large&#34;.
         * 
         * @return builder
         * 
         */
        public Builder clusterSize(@Nullable Output<String> clusterSize) {
            $.clusterSize = clusterSize;
            return this;
        }

        /**
         * @param clusterSize The size of the clusters allocated to the warehouse: &#34;2X-Small&#34;, &#34;X-Small&#34;, &#34;Small&#34;, &#34;Medium&#34;, &#34;Large&#34;, &#34;X-Large&#34;, &#34;2X-Large&#34;, &#34;3X-Large&#34;, &#34;4X-Large&#34;.
         * 
         * @return builder
         * 
         */
        public Builder clusterSize(String clusterSize) {
            return clusterSize(Output.of(clusterSize));
        }

        /**
         * @param creatorName The username of the user who created the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder creatorName(@Nullable Output<String> creatorName) {
            $.creatorName = creatorName;
            return this;
        }

        /**
         * @param creatorName The username of the user who created the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder creatorName(String creatorName) {
            return creatorName(Output.of(creatorName));
        }

        /**
         * @param dataSourceId ID of the data source for this warehouse. This is used to bind an Databricks SQL query to an warehouse.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceId(@Nullable Output<String> dataSourceId) {
            $.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * @param dataSourceId ID of the data source for this warehouse. This is used to bind an Databricks SQL query to an warehouse.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceId(String dataSourceId) {
            return dataSourceId(Output.of(dataSourceId));
        }

        /**
         * @param enablePhoton Whether [Photon](https://databricks.com/product/delta-engine) is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enablePhoton(@Nullable Output<Boolean> enablePhoton) {
            $.enablePhoton = enablePhoton;
            return this;
        }

        /**
         * @param enablePhoton Whether [Photon](https://databricks.com/product/delta-engine) is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enablePhoton(Boolean enablePhoton) {
            return enablePhoton(Output.of(enablePhoton));
        }

        /**
         * @param enableServerlessCompute Whether this SQL warehouse is a serverless SQL warehouse.
         * 
         * @return builder
         * 
         */
        public Builder enableServerlessCompute(@Nullable Output<Boolean> enableServerlessCompute) {
            $.enableServerlessCompute = enableServerlessCompute;
            return this;
        }

        /**
         * @param enableServerlessCompute Whether this SQL warehouse is a serverless SQL warehouse.
         * 
         * @return builder
         * 
         */
        public Builder enableServerlessCompute(Boolean enableServerlessCompute) {
            return enableServerlessCompute(Output.of(enableServerlessCompute));
        }

        /**
         * @param health Health status of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder health(@Nullable Output<GetSqlWarehouseHealthArgs> health) {
            $.health = health;
            return this;
        }

        /**
         * @param health Health status of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder health(GetSqlWarehouseHealthArgs health) {
            return health(Output.of(health));
        }

        /**
         * @param id The ID of the SQL warehouse.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the SQL warehouse.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
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
         * @param maxNumClusters Maximum number of clusters available when a SQL warehouse is running.
         * 
         * @return builder
         * 
         */
        public Builder maxNumClusters(@Nullable Output<Integer> maxNumClusters) {
            $.maxNumClusters = maxNumClusters;
            return this;
        }

        /**
         * @param maxNumClusters Maximum number of clusters available when a SQL warehouse is running.
         * 
         * @return builder
         * 
         */
        public Builder maxNumClusters(Integer maxNumClusters) {
            return maxNumClusters(Output.of(maxNumClusters));
        }

        /**
         * @param minNumClusters Minimum number of clusters available when a SQL warehouse is running.
         * 
         * @return builder
         * 
         */
        public Builder minNumClusters(@Nullable Output<Integer> minNumClusters) {
            $.minNumClusters = minNumClusters;
            return this;
        }

        /**
         * @param minNumClusters Minimum number of clusters available when a SQL warehouse is running.
         * 
         * @return builder
         * 
         */
        public Builder minNumClusters(Integer minNumClusters) {
            return minNumClusters(Output.of(minNumClusters));
        }

        /**
         * @param name Name of the SQL warehouse to search (case-sensitive).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the SQL warehouse to search (case-sensitive).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param numActiveSessions The current number of clusters used by the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder numActiveSessions(@Nullable Output<Integer> numActiveSessions) {
            $.numActiveSessions = numActiveSessions;
            return this;
        }

        /**
         * @param numActiveSessions The current number of clusters used by the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder numActiveSessions(Integer numActiveSessions) {
            return numActiveSessions(Output.of(numActiveSessions));
        }

        /**
         * @param numClusters The current number of clusters used by the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder numClusters(@Nullable Output<Integer> numClusters) {
            $.numClusters = numClusters;
            return this;
        }

        /**
         * @param numClusters The current number of clusters used by the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder numClusters(Integer numClusters) {
            return numClusters(Output.of(numClusters));
        }

        /**
         * @param odbcParams ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
         * 
         * @return builder
         * 
         */
        public Builder odbcParams(@Nullable Output<GetSqlWarehouseOdbcParamsArgs> odbcParams) {
            $.odbcParams = odbcParams;
            return this;
        }

        /**
         * @param odbcParams ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
         * 
         * @return builder
         * 
         */
        public Builder odbcParams(GetSqlWarehouseOdbcParamsArgs odbcParams) {
            return odbcParams(Output.of(odbcParams));
        }

        /**
         * @param spotInstancePolicy The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`.
         * 
         * @return builder
         * 
         */
        public Builder spotInstancePolicy(@Nullable Output<String> spotInstancePolicy) {
            $.spotInstancePolicy = spotInstancePolicy;
            return this;
        }

        /**
         * @param spotInstancePolicy The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`.
         * 
         * @return builder
         * 
         */
        public Builder spotInstancePolicy(String spotInstancePolicy) {
            return spotInstancePolicy(Output.of(spotInstancePolicy));
        }

        /**
         * @param state The current state of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags tags used for SQL warehouse resources.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<GetSqlWarehouseTagsArgs> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags tags used for SQL warehouse resources.
         * 
         * @return builder
         * 
         */
        public Builder tags(GetSqlWarehouseTagsArgs tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param warehouseType SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/index.html#warehouse-types) or [Azure](https://learn.microsoft.com/azure/databricks/sql/#warehouse-types).
         * 
         * @return builder
         * 
         */
        public Builder warehouseType(@Nullable Output<String> warehouseType) {
            $.warehouseType = warehouseType;
            return this;
        }

        /**
         * @param warehouseType SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/index.html#warehouse-types) or [Azure](https://learn.microsoft.com/azure/databricks/sql/#warehouse-types).
         * 
         * @return builder
         * 
         */
        public Builder warehouseType(String warehouseType) {
            return warehouseType(Output.of(warehouseType));
        }

        public GetSqlWarehouseArgs build() {
            return $;
        }
    }

}
