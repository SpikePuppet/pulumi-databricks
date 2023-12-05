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


public final class CatalogState extends com.pulumi.resources.ResourceArgs {

    public static final CatalogState Empty = new CatalogState();

    /**
     * User-supplied free-form text.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return User-supplied free-form text.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * For Foreign Catalogs: the name of the connection to an external data source. Changes forces creation of a new resource.
     * 
     */
    @Import(name="connectionName")
    private @Nullable Output<String> connectionName;

    /**
     * @return For Foreign Catalogs: the name of the connection to an external data source. Changes forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> connectionName() {
        return Optional.ofNullable(this.connectionName);
    }

    /**
     * Delete catalog regardless of its contents.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return Delete catalog regardless of its contents.
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * Whether the catalog is accessible from all workspaces or a specific set of workspaces. Can be `ISOLATED` or `OPEN`. Setting the catalog to `ISOLATED` will automatically allow access from the current workspace.
     * 
     */
    @Import(name="isolationMode")
    private @Nullable Output<String> isolationMode;

    /**
     * @return Whether the catalog is accessible from all workspaces or a specific set of workspaces. Can be `ISOLATED` or `OPEN`. Setting the catalog to `ISOLATED` will automatically allow access from the current workspace.
     * 
     */
    public Optional<Output<String>> isolationMode() {
        return Optional.ofNullable(this.isolationMode);
    }

    /**
     * ID of the metastore.
     * 
     */
    @Import(name="metastoreId")
    private @Nullable Output<String> metastoreId;

    /**
     * @return ID of the metastore.
     * 
     */
    public Optional<Output<String>> metastoreId() {
        return Optional.ofNullable(this.metastoreId);
    }

    /**
     * Name of Catalog relative to parent metastore.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of Catalog relative to parent metastore.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * For Foreign Catalogs: the name of the entity from an external data source that maps to a catalog. For example, the database name in a PostgreSQL server.
     * 
     */
    @Import(name="options")
    private @Nullable Output<Map<String,Object>> options;

    /**
     * @return For Foreign Catalogs: the name of the entity from an external data source that maps to a catalog. For example, the database name in a PostgreSQL server.
     * 
     */
    public Optional<Output<Map<String,Object>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * Username/groupname/sp application_id of the catalog owner.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return Username/groupname/sp application_id of the catalog owner.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * Extensible Catalog properties.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,Object>> properties;

    /**
     * @return Extensible Catalog properties.
     * 
     */
    public Optional<Output<Map<String,Object>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * For Delta Sharing Catalogs: the name of the delta sharing provider. Change forces creation of a new resource.
     * 
     */
    @Import(name="providerName")
    private @Nullable Output<String> providerName;

    /**
     * @return For Delta Sharing Catalogs: the name of the delta sharing provider. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> providerName() {
        return Optional.ofNullable(this.providerName);
    }

    /**
     * For Delta Sharing Catalogs: the name of the share under the share provider. Change forces creation of a new resource.
     * 
     */
    @Import(name="shareName")
    private @Nullable Output<String> shareName;

    /**
     * @return For Delta Sharing Catalogs: the name of the share under the share provider. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> shareName() {
        return Optional.ofNullable(this.shareName);
    }

    /**
     * Managed location of the catalog. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the metastore root location. Change forces creation of a new resource.
     * 
     */
    @Import(name="storageRoot")
    private @Nullable Output<String> storageRoot;

    /**
     * @return Managed location of the catalog. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the metastore root location. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> storageRoot() {
        return Optional.ofNullable(this.storageRoot);
    }

    private CatalogState() {}

    private CatalogState(CatalogState $) {
        this.comment = $.comment;
        this.connectionName = $.connectionName;
        this.forceDestroy = $.forceDestroy;
        this.isolationMode = $.isolationMode;
        this.metastoreId = $.metastoreId;
        this.name = $.name;
        this.options = $.options;
        this.owner = $.owner;
        this.properties = $.properties;
        this.providerName = $.providerName;
        this.shareName = $.shareName;
        this.storageRoot = $.storageRoot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogState $;

        public Builder() {
            $ = new CatalogState();
        }

        public Builder(CatalogState defaults) {
            $ = new CatalogState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment User-supplied free-form text.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment User-supplied free-form text.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param connectionName For Foreign Catalogs: the name of the connection to an external data source. Changes forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(@Nullable Output<String> connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param connectionName For Foreign Catalogs: the name of the connection to an external data source. Changes forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(String connectionName) {
            return connectionName(Output.of(connectionName));
        }

        /**
         * @param forceDestroy Delete catalog regardless of its contents.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * @param forceDestroy Delete catalog regardless of its contents.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        /**
         * @param isolationMode Whether the catalog is accessible from all workspaces or a specific set of workspaces. Can be `ISOLATED` or `OPEN`. Setting the catalog to `ISOLATED` will automatically allow access from the current workspace.
         * 
         * @return builder
         * 
         */
        public Builder isolationMode(@Nullable Output<String> isolationMode) {
            $.isolationMode = isolationMode;
            return this;
        }

        /**
         * @param isolationMode Whether the catalog is accessible from all workspaces or a specific set of workspaces. Can be `ISOLATED` or `OPEN`. Setting the catalog to `ISOLATED` will automatically allow access from the current workspace.
         * 
         * @return builder
         * 
         */
        public Builder isolationMode(String isolationMode) {
            return isolationMode(Output.of(isolationMode));
        }

        /**
         * @param metastoreId ID of the metastore.
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(@Nullable Output<String> metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        /**
         * @param metastoreId ID of the metastore.
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(String metastoreId) {
            return metastoreId(Output.of(metastoreId));
        }

        /**
         * @param name Name of Catalog relative to parent metastore.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of Catalog relative to parent metastore.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param options For Foreign Catalogs: the name of the entity from an external data source that maps to a catalog. For example, the database name in a PostgreSQL server.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<Map<String,Object>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options For Foreign Catalogs: the name of the entity from an external data source that maps to a catalog. For example, the database name in a PostgreSQL server.
         * 
         * @return builder
         * 
         */
        public Builder options(Map<String,Object> options) {
            return options(Output.of(options));
        }

        /**
         * @param owner Username/groupname/sp application_id of the catalog owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Username/groupname/sp application_id of the catalog owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param properties Extensible Catalog properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,Object>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Extensible Catalog properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,Object> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param providerName For Delta Sharing Catalogs: the name of the delta sharing provider. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder providerName(@Nullable Output<String> providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param providerName For Delta Sharing Catalogs: the name of the delta sharing provider. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            return providerName(Output.of(providerName));
        }

        /**
         * @param shareName For Delta Sharing Catalogs: the name of the share under the share provider. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder shareName(@Nullable Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param shareName For Delta Sharing Catalogs: the name of the share under the share provider. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        /**
         * @param storageRoot Managed location of the catalog. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the metastore root location. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder storageRoot(@Nullable Output<String> storageRoot) {
            $.storageRoot = storageRoot;
            return this;
        }

        /**
         * @param storageRoot Managed location of the catalog. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the metastore root location. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder storageRoot(String storageRoot) {
            return storageRoot(Output.of(storageRoot));
        }

        public CatalogState build() {
            return $;
        }
    }

}
