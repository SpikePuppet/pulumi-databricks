// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class SqlQueryParameterNumber {
    private Double value;

    private SqlQueryParameterNumber() {}
    public Double value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlQueryParameterNumber defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double value;
        public Builder() {}
        public Builder(SqlQueryParameterNumber defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder value(Double value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("SqlQueryParameterNumber", "value");
            }
            this.value = value;
            return this;
        }
        public SqlQueryParameterNumber build() {
            final var _resultValue = new SqlQueryParameterNumber();
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
