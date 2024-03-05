// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegisteredModelArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegisteredModelArgs Empty = new RegisteredModelArgs();

    /**
     * The name of the catalog where the schema and the registered model reside. *Change of this parameter forces recreation of the resource.*
     * 
     */
    @Import(name="catalogName", required=true)
    private Output<String> catalogName;

    /**
     * @return The name of the catalog where the schema and the registered model reside. *Change of this parameter forces recreation of the resource.*
     * 
     */
    public Output<String> catalogName() {
        return this.catalogName;
    }

    /**
     * The comment attached to the registered model.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return The comment attached to the registered model.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The name of the registered model.  *Change of this parameter forces recreation of the resource.*
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the registered model.  *Change of this parameter forces recreation of the resource.*
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the schema where the registered model resides. *Change of this parameter forces recreation of the resource.*
     * 
     */
    @Import(name="schemaName", required=true)
    private Output<String> schemaName;

    /**
     * @return The name of the schema where the registered model resides. *Change of this parameter forces recreation of the resource.*
     * 
     */
    public Output<String> schemaName() {
        return this.schemaName;
    }

    /**
     * The storage location under which model version data files are stored. *Change of this parameter forces recreation of the resource.*
     * 
     */
    @Import(name="storageLocation")
    private @Nullable Output<String> storageLocation;

    /**
     * @return The storage location under which model version data files are stored. *Change of this parameter forces recreation of the resource.*
     * 
     */
    public Optional<Output<String>> storageLocation() {
        return Optional.ofNullable(this.storageLocation);
    }

    private RegisteredModelArgs() {}

    private RegisteredModelArgs(RegisteredModelArgs $) {
        this.catalogName = $.catalogName;
        this.comment = $.comment;
        this.name = $.name;
        this.schemaName = $.schemaName;
        this.storageLocation = $.storageLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegisteredModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegisteredModelArgs $;

        public Builder() {
            $ = new RegisteredModelArgs();
        }

        public Builder(RegisteredModelArgs defaults) {
            $ = new RegisteredModelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogName The name of the catalog where the schema and the registered model reside. *Change of this parameter forces recreation of the resource.*
         * 
         * @return builder
         * 
         */
        public Builder catalogName(Output<String> catalogName) {
            $.catalogName = catalogName;
            return this;
        }

        /**
         * @param catalogName The name of the catalog where the schema and the registered model reside. *Change of this parameter forces recreation of the resource.*
         * 
         * @return builder
         * 
         */
        public Builder catalogName(String catalogName) {
            return catalogName(Output.of(catalogName));
        }

        /**
         * @param comment The comment attached to the registered model.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment The comment attached to the registered model.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param name The name of the registered model.  *Change of this parameter forces recreation of the resource.*
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the registered model.  *Change of this parameter forces recreation of the resource.*
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schemaName The name of the schema where the registered model resides. *Change of this parameter forces recreation of the resource.*
         * 
         * @return builder
         * 
         */
        public Builder schemaName(Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param schemaName The name of the schema where the registered model resides. *Change of this parameter forces recreation of the resource.*
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        /**
         * @param storageLocation The storage location under which model version data files are stored. *Change of this parameter forces recreation of the resource.*
         * 
         * @return builder
         * 
         */
        public Builder storageLocation(@Nullable Output<String> storageLocation) {
            $.storageLocation = storageLocation;
            return this;
        }

        /**
         * @param storageLocation The storage location under which model version data files are stored. *Change of this parameter forces recreation of the resource.*
         * 
         * @return builder
         * 
         */
        public Builder storageLocation(String storageLocation) {
            return storageLocation(Output.of(storageLocation));
        }

        public RegisteredModelArgs build() {
            if ($.catalogName == null) {
                throw new MissingRequiredPropertyException("RegisteredModelArgs", "catalogName");
            }
            if ($.schemaName == null) {
                throw new MissingRequiredPropertyException("RegisteredModelArgs", "schemaName");
            }
            return $;
        }
    }

}
