// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchemasPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemasPlainArgs Empty = new GetSchemasPlainArgs();

    /**
     * Name of databricks_catalog
     * 
     */
    @Import(name="catalogName", required=true)
    private String catalogName;

    /**
     * @return Name of databricks_catalog
     * 
     */
    public String catalogName() {
        return this.catalogName;
    }

    /**
     * set of databricks.Schema full names: *`catalog`.`schema`*
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return set of databricks.Schema full names: *`catalog`.`schema`*
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    private GetSchemasPlainArgs() {}

    private GetSchemasPlainArgs(GetSchemasPlainArgs $) {
        this.catalogName = $.catalogName;
        this.ids = $.ids;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemasPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemasPlainArgs $;

        public Builder() {
            $ = new GetSchemasPlainArgs();
        }

        public Builder(GetSchemasPlainArgs defaults) {
            $ = new GetSchemasPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogName Name of databricks_catalog
         * 
         * @return builder
         * 
         */
        public Builder catalogName(String catalogName) {
            $.catalogName = catalogName;
            return this;
        }

        /**
         * @param ids set of databricks.Schema full names: *`catalog`.`schema`*
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids set of databricks.Schema full names: *`catalog`.`schema`*
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public GetSchemasPlainArgs build() {
            if ($.catalogName == null) {
                throw new MissingRequiredPropertyException("GetSchemasPlainArgs", "catalogName");
            }
            return $;
        }
    }

}
