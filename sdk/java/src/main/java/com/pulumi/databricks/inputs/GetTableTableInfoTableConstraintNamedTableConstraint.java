// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetTableTableInfoTableConstraintNamedTableConstraint extends com.pulumi.resources.InvokeArgs {

    public static final GetTableTableInfoTableConstraintNamedTableConstraint Empty = new GetTableTableInfoTableConstraintNamedTableConstraint();

    /**
     * Full name of the databricks_table: _`catalog`.`schema`.`table`_
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Full name of the databricks_table: _`catalog`.`schema`.`table`_
     * 
     */
    public String name() {
        return this.name;
    }

    private GetTableTableInfoTableConstraintNamedTableConstraint() {}

    private GetTableTableInfoTableConstraintNamedTableConstraint(GetTableTableInfoTableConstraintNamedTableConstraint $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableTableInfoTableConstraintNamedTableConstraint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableTableInfoTableConstraintNamedTableConstraint $;

        public Builder() {
            $ = new GetTableTableInfoTableConstraintNamedTableConstraint();
        }

        public Builder(GetTableTableInfoTableConstraintNamedTableConstraint defaults) {
            $ = new GetTableTableInfoTableConstraintNamedTableConstraint(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Full name of the databricks_table: _`catalog`.`schema`.`table`_
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetTableTableInfoTableConstraintNamedTableConstraint build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetTableTableInfoTableConstraintNamedTableConstraint", "name");
            }
            return $;
        }
    }

}
