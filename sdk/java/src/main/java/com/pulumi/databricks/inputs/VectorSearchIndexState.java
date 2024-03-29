// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.VectorSearchIndexDeltaSyncIndexSpecArgs;
import com.pulumi.databricks.inputs.VectorSearchIndexDirectAccessIndexSpecArgs;
import com.pulumi.databricks.inputs.VectorSearchIndexStatusArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VectorSearchIndexState extends com.pulumi.resources.ResourceArgs {

    public static final VectorSearchIndexState Empty = new VectorSearchIndexState();

    /**
     * Creator of the endpoint.
     * 
     */
    @Import(name="creator")
    private @Nullable Output<String> creator;

    /**
     * @return Creator of the endpoint.
     * 
     */
    public Optional<Output<String>> creator() {
        return Optional.ofNullable(this.creator);
    }

    /**
     * Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`.
     * 
     */
    @Import(name="deltaSyncIndexSpec")
    private @Nullable Output<VectorSearchIndexDeltaSyncIndexSpecArgs> deltaSyncIndexSpec;

    /**
     * @return Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`.
     * 
     */
    public Optional<Output<VectorSearchIndexDeltaSyncIndexSpecArgs>> deltaSyncIndexSpec() {
        return Optional.ofNullable(this.deltaSyncIndexSpec);
    }

    /**
     * Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`.
     * 
     */
    @Import(name="directAccessIndexSpec")
    private @Nullable Output<VectorSearchIndexDirectAccessIndexSpecArgs> directAccessIndexSpec;

    /**
     * @return Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`.
     * 
     */
    public Optional<Output<VectorSearchIndexDirectAccessIndexSpecArgs>> directAccessIndexSpec() {
        return Optional.ofNullable(this.directAccessIndexSpec);
    }

    /**
     * The name of the Vector Search Endpoint that will be used for indexing the data.
     * 
     */
    @Import(name="endpointName")
    private @Nullable Output<String> endpointName;

    /**
     * @return The name of the Vector Search Endpoint that will be used for indexing the data.
     * 
     */
    public Optional<Output<String>> endpointName() {
        return Optional.ofNullable(this.endpointName);
    }

    /**
     * Vector Search index type. Currently supported values are:
     * 
     */
    @Import(name="indexType")
    private @Nullable Output<String> indexType;

    /**
     * @return Vector Search index type. Currently supported values are:
     * 
     */
    public Optional<Output<String>> indexType() {
        return Optional.ofNullable(this.indexType);
    }

    /**
     * The name of the column.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the column.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The column name that will be used as a primary key.
     * 
     */
    @Import(name="primaryKey")
    private @Nullable Output<String> primaryKey;

    /**
     * @return The column name that will be used as a primary key.
     * 
     */
    public Optional<Output<String>> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }

    /**
     * Object describing the current status of the index consisting of the following fields:
     * 
     */
    @Import(name="statuses")
    private @Nullable Output<List<VectorSearchIndexStatusArgs>> statuses;

    /**
     * @return Object describing the current status of the index consisting of the following fields:
     * 
     */
    public Optional<Output<List<VectorSearchIndexStatusArgs>>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    private VectorSearchIndexState() {}

    private VectorSearchIndexState(VectorSearchIndexState $) {
        this.creator = $.creator;
        this.deltaSyncIndexSpec = $.deltaSyncIndexSpec;
        this.directAccessIndexSpec = $.directAccessIndexSpec;
        this.endpointName = $.endpointName;
        this.indexType = $.indexType;
        this.name = $.name;
        this.primaryKey = $.primaryKey;
        this.statuses = $.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VectorSearchIndexState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VectorSearchIndexState $;

        public Builder() {
            $ = new VectorSearchIndexState();
        }

        public Builder(VectorSearchIndexState defaults) {
            $ = new VectorSearchIndexState(Objects.requireNonNull(defaults));
        }

        /**
         * @param creator Creator of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder creator(@Nullable Output<String> creator) {
            $.creator = creator;
            return this;
        }

        /**
         * @param creator Creator of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder creator(String creator) {
            return creator(Output.of(creator));
        }

        /**
         * @param deltaSyncIndexSpec Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`.
         * 
         * @return builder
         * 
         */
        public Builder deltaSyncIndexSpec(@Nullable Output<VectorSearchIndexDeltaSyncIndexSpecArgs> deltaSyncIndexSpec) {
            $.deltaSyncIndexSpec = deltaSyncIndexSpec;
            return this;
        }

        /**
         * @param deltaSyncIndexSpec Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`.
         * 
         * @return builder
         * 
         */
        public Builder deltaSyncIndexSpec(VectorSearchIndexDeltaSyncIndexSpecArgs deltaSyncIndexSpec) {
            return deltaSyncIndexSpec(Output.of(deltaSyncIndexSpec));
        }

        /**
         * @param directAccessIndexSpec Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`.
         * 
         * @return builder
         * 
         */
        public Builder directAccessIndexSpec(@Nullable Output<VectorSearchIndexDirectAccessIndexSpecArgs> directAccessIndexSpec) {
            $.directAccessIndexSpec = directAccessIndexSpec;
            return this;
        }

        /**
         * @param directAccessIndexSpec Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`.
         * 
         * @return builder
         * 
         */
        public Builder directAccessIndexSpec(VectorSearchIndexDirectAccessIndexSpecArgs directAccessIndexSpec) {
            return directAccessIndexSpec(Output.of(directAccessIndexSpec));
        }

        /**
         * @param endpointName The name of the Vector Search Endpoint that will be used for indexing the data.
         * 
         * @return builder
         * 
         */
        public Builder endpointName(@Nullable Output<String> endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        /**
         * @param endpointName The name of the Vector Search Endpoint that will be used for indexing the data.
         * 
         * @return builder
         * 
         */
        public Builder endpointName(String endpointName) {
            return endpointName(Output.of(endpointName));
        }

        /**
         * @param indexType Vector Search index type. Currently supported values are:
         * 
         * @return builder
         * 
         */
        public Builder indexType(@Nullable Output<String> indexType) {
            $.indexType = indexType;
            return this;
        }

        /**
         * @param indexType Vector Search index type. Currently supported values are:
         * 
         * @return builder
         * 
         */
        public Builder indexType(String indexType) {
            return indexType(Output.of(indexType));
        }

        /**
         * @param name The name of the column.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the column.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primaryKey The column name that will be used as a primary key.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(@Nullable Output<String> primaryKey) {
            $.primaryKey = primaryKey;
            return this;
        }

        /**
         * @param primaryKey The column name that will be used as a primary key.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(String primaryKey) {
            return primaryKey(Output.of(primaryKey));
        }

        /**
         * @param statuses Object describing the current status of the index consisting of the following fields:
         * 
         * @return builder
         * 
         */
        public Builder statuses(@Nullable Output<List<VectorSearchIndexStatusArgs>> statuses) {
            $.statuses = statuses;
            return this;
        }

        /**
         * @param statuses Object describing the current status of the index consisting of the following fields:
         * 
         * @return builder
         * 
         */
        public Builder statuses(List<VectorSearchIndexStatusArgs> statuses) {
            return statuses(Output.of(statuses));
        }

        /**
         * @param statuses Object describing the current status of the index consisting of the following fields:
         * 
         * @return builder
         * 
         */
        public Builder statuses(VectorSearchIndexStatusArgs... statuses) {
            return statuses(List.of(statuses));
        }

        public VectorSearchIndexState build() {
            return $;
        }
    }

}
