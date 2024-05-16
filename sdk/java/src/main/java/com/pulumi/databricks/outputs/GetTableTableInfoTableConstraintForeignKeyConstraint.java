// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTableTableInfoTableConstraintForeignKeyConstraint {
    private List<String> childColumns;
    /**
     * @return Full name of the databricks_table: _`catalog`.`schema`.`table`_
     * 
     */
    private String name;
    private List<String> parentColumns;
    private String parentTable;

    private GetTableTableInfoTableConstraintForeignKeyConstraint() {}
    public List<String> childColumns() {
        return this.childColumns;
    }
    /**
     * @return Full name of the databricks_table: _`catalog`.`schema`.`table`_
     * 
     */
    public String name() {
        return this.name;
    }
    public List<String> parentColumns() {
        return this.parentColumns;
    }
    public String parentTable() {
        return this.parentTable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableTableInfoTableConstraintForeignKeyConstraint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> childColumns;
        private String name;
        private List<String> parentColumns;
        private String parentTable;
        public Builder() {}
        public Builder(GetTableTableInfoTableConstraintForeignKeyConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.childColumns = defaults.childColumns;
    	      this.name = defaults.name;
    	      this.parentColumns = defaults.parentColumns;
    	      this.parentTable = defaults.parentTable;
        }

        @CustomType.Setter
        public Builder childColumns(List<String> childColumns) {
            if (childColumns == null) {
              throw new MissingRequiredPropertyException("GetTableTableInfoTableConstraintForeignKeyConstraint", "childColumns");
            }
            this.childColumns = childColumns;
            return this;
        }
        public Builder childColumns(String... childColumns) {
            return childColumns(List.of(childColumns));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTableTableInfoTableConstraintForeignKeyConstraint", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder parentColumns(List<String> parentColumns) {
            if (parentColumns == null) {
              throw new MissingRequiredPropertyException("GetTableTableInfoTableConstraintForeignKeyConstraint", "parentColumns");
            }
            this.parentColumns = parentColumns;
            return this;
        }
        public Builder parentColumns(String... parentColumns) {
            return parentColumns(List.of(parentColumns));
        }
        @CustomType.Setter
        public Builder parentTable(String parentTable) {
            if (parentTable == null) {
              throw new MissingRequiredPropertyException("GetTableTableInfoTableConstraintForeignKeyConstraint", "parentTable");
            }
            this.parentTable = parentTable;
            return this;
        }
        public GetTableTableInfoTableConstraintForeignKeyConstraint build() {
            final var _resultValue = new GetTableTableInfoTableConstraintForeignKeyConstraint();
            _resultValue.childColumns = childColumns;
            _resultValue.name = name;
            _resultValue.parentColumns = parentColumns;
            _resultValue.parentTable = parentTable;
            return _resultValue;
        }
    }
}
