// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GrantsGrantArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GrantsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrantsArgs Empty = new GrantsArgs();

    @Import(name="catalog")
    private @Nullable Output<String> catalog;

    public Optional<Output<String>> catalog() {
        return Optional.ofNullable(this.catalog);
    }

    @Import(name="externalLocation")
    private @Nullable Output<String> externalLocation;

    public Optional<Output<String>> externalLocation() {
        return Optional.ofNullable(this.externalLocation);
    }

    @Import(name="function")
    private @Nullable Output<String> function;

    public Optional<Output<String>> function() {
        return Optional.ofNullable(this.function);
    }

    @Import(name="grants", required=true)
    private Output<List<GrantsGrantArgs>> grants;

    public Output<List<GrantsGrantArgs>> grants() {
        return this.grants;
    }

    @Import(name="materializedView")
    private @Nullable Output<String> materializedView;

    public Optional<Output<String>> materializedView() {
        return Optional.ofNullable(this.materializedView);
    }

    @Import(name="metastore")
    private @Nullable Output<String> metastore;

    public Optional<Output<String>> metastore() {
        return Optional.ofNullable(this.metastore);
    }

    @Import(name="schema")
    private @Nullable Output<String> schema;

    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    @Import(name="share")
    private @Nullable Output<String> share;

    public Optional<Output<String>> share() {
        return Optional.ofNullable(this.share);
    }

    @Import(name="storageCredential")
    private @Nullable Output<String> storageCredential;

    public Optional<Output<String>> storageCredential() {
        return Optional.ofNullable(this.storageCredential);
    }

    @Import(name="table")
    private @Nullable Output<String> table;

    public Optional<Output<String>> table() {
        return Optional.ofNullable(this.table);
    }

    @Import(name="view")
    private @Nullable Output<String> view;

    public Optional<Output<String>> view() {
        return Optional.ofNullable(this.view);
    }

    @Import(name="volume")
    private @Nullable Output<String> volume;

    public Optional<Output<String>> volume() {
        return Optional.ofNullable(this.volume);
    }

    private GrantsArgs() {}

    private GrantsArgs(GrantsArgs $) {
        this.catalog = $.catalog;
        this.externalLocation = $.externalLocation;
        this.function = $.function;
        this.grants = $.grants;
        this.materializedView = $.materializedView;
        this.metastore = $.metastore;
        this.schema = $.schema;
        this.share = $.share;
        this.storageCredential = $.storageCredential;
        this.table = $.table;
        this.view = $.view;
        this.volume = $.volume;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrantsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrantsArgs $;

        public Builder() {
            $ = new GrantsArgs();
        }

        public Builder(GrantsArgs defaults) {
            $ = new GrantsArgs(Objects.requireNonNull(defaults));
        }

        public Builder catalog(@Nullable Output<String> catalog) {
            $.catalog = catalog;
            return this;
        }

        public Builder catalog(String catalog) {
            return catalog(Output.of(catalog));
        }

        public Builder externalLocation(@Nullable Output<String> externalLocation) {
            $.externalLocation = externalLocation;
            return this;
        }

        public Builder externalLocation(String externalLocation) {
            return externalLocation(Output.of(externalLocation));
        }

        public Builder function(@Nullable Output<String> function) {
            $.function = function;
            return this;
        }

        public Builder function(String function) {
            return function(Output.of(function));
        }

        public Builder grants(Output<List<GrantsGrantArgs>> grants) {
            $.grants = grants;
            return this;
        }

        public Builder grants(List<GrantsGrantArgs> grants) {
            return grants(Output.of(grants));
        }

        public Builder grants(GrantsGrantArgs... grants) {
            return grants(List.of(grants));
        }

        public Builder materializedView(@Nullable Output<String> materializedView) {
            $.materializedView = materializedView;
            return this;
        }

        public Builder materializedView(String materializedView) {
            return materializedView(Output.of(materializedView));
        }

        public Builder metastore(@Nullable Output<String> metastore) {
            $.metastore = metastore;
            return this;
        }

        public Builder metastore(String metastore) {
            return metastore(Output.of(metastore));
        }

        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public Builder share(@Nullable Output<String> share) {
            $.share = share;
            return this;
        }

        public Builder share(String share) {
            return share(Output.of(share));
        }

        public Builder storageCredential(@Nullable Output<String> storageCredential) {
            $.storageCredential = storageCredential;
            return this;
        }

        public Builder storageCredential(String storageCredential) {
            return storageCredential(Output.of(storageCredential));
        }

        public Builder table(@Nullable Output<String> table) {
            $.table = table;
            return this;
        }

        public Builder table(String table) {
            return table(Output.of(table));
        }

        public Builder view(@Nullable Output<String> view) {
            $.view = view;
            return this;
        }

        public Builder view(String view) {
            return view(Output.of(view));
        }

        public Builder volume(@Nullable Output<String> volume) {
            $.volume = volume;
            return this;
        }

        public Builder volume(String volume) {
            return volume(Output.of(volume));
        }

        public GrantsArgs build() {
            $.grants = Objects.requireNonNull($.grants, "expected parameter 'grants' to be non-null");
            return $;
        }
    }

}
