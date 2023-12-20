// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * Free-form text.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Free-form text.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Connection type. `BIGQUERY` `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
     * 
     */
    @Import(name="connectionType")
    private @Nullable Output<String> connectionType;

    /**
     * @return Connection type. `BIGQUERY` `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
     * 
     */
    public Optional<Output<String>> connectionType() {
        return Optional.ofNullable(this.connectionType);
    }

    @Import(name="metastoreId")
    private @Nullable Output<String> metastoreId;

    public Optional<Output<String>> metastoreId() {
        return Optional.ofNullable(this.metastoreId);
    }

    /**
     * Name of the Connection.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Connection.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The key value of options required by the connection, e.g. `host`, `port`, `user`, `password` or `GoogleServiceAccountKeyJson`. Please consult the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources) for the required option.
     * 
     */
    @Import(name="options")
    private @Nullable Output<Map<String,Object>> options;

    /**
     * @return The key value of options required by the connection, e.g. `host`, `port`, `user`, `password` or `GoogleServiceAccountKeyJson`. Please consult the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources) for the required option.
     * 
     */
    public Optional<Output<Map<String,Object>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * Name of the connection owner.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return Name of the connection owner.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * Free-form connection properties.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,Object>> properties;

    /**
     * @return Free-form connection properties.
     * 
     */
    public Optional<Output<Map<String,Object>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    private ConnectionState() {}

    private ConnectionState(ConnectionState $) {
        this.comment = $.comment;
        this.connectionType = $.connectionType;
        this.metastoreId = $.metastoreId;
        this.name = $.name;
        this.options = $.options;
        this.owner = $.owner;
        this.properties = $.properties;
        this.readOnly = $.readOnly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionState $;

        public Builder() {
            $ = new ConnectionState();
        }

        public Builder(ConnectionState defaults) {
            $ = new ConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Free-form text.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Free-form text.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param connectionType Connection type. `BIGQUERY` `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
         * 
         * @return builder
         * 
         */
        public Builder connectionType(@Nullable Output<String> connectionType) {
            $.connectionType = connectionType;
            return this;
        }

        /**
         * @param connectionType Connection type. `BIGQUERY` `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
         * 
         * @return builder
         * 
         */
        public Builder connectionType(String connectionType) {
            return connectionType(Output.of(connectionType));
        }

        public Builder metastoreId(@Nullable Output<String> metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        public Builder metastoreId(String metastoreId) {
            return metastoreId(Output.of(metastoreId));
        }

        /**
         * @param name Name of the Connection.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Connection.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param options The key value of options required by the connection, e.g. `host`, `port`, `user`, `password` or `GoogleServiceAccountKeyJson`. Please consult the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources) for the required option.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<Map<String,Object>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options The key value of options required by the connection, e.g. `host`, `port`, `user`, `password` or `GoogleServiceAccountKeyJson`. Please consult the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources) for the required option.
         * 
         * @return builder
         * 
         */
        public Builder options(Map<String,Object> options) {
            return options(Output.of(options));
        }

        /**
         * @param owner Name of the connection owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Name of the connection owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param properties Free-form connection properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,Object>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Free-form connection properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,Object> properties) {
            return properties(Output.of(properties));
        }

        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public ConnectionState build() {
            return $;
        }
    }

}
