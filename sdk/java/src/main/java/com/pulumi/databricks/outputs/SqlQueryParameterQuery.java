// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.SqlQueryParameterQueryMultiple;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlQueryParameterQuery {
    private @Nullable SqlQueryParameterQueryMultiple multiple;
    private String queryId;
    private @Nullable String value;
    private @Nullable List<String> values;

    private SqlQueryParameterQuery() {}
    public Optional<SqlQueryParameterQueryMultiple> multiple() {
        return Optional.ofNullable(this.multiple);
    }
    public String queryId() {
        return this.queryId;
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlQueryParameterQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SqlQueryParameterQueryMultiple multiple;
        private String queryId;
        private @Nullable String value;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(SqlQueryParameterQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multiple = defaults.multiple;
    	      this.queryId = defaults.queryId;
    	      this.value = defaults.value;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder multiple(@Nullable SqlQueryParameterQueryMultiple multiple) {

            this.multiple = multiple;
            return this;
        }
        @CustomType.Setter
        public Builder queryId(String queryId) {
            if (queryId == null) {
              throw new MissingRequiredPropertyException("SqlQueryParameterQuery", "queryId");
            }
            this.queryId = queryId;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {

            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public SqlQueryParameterQuery build() {
            final var _resultValue = new SqlQueryParameterQuery();
            _resultValue.multiple = multiple;
            _resultValue.queryId = queryId;
            _resultValue.value = value;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
