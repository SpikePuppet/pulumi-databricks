// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.SqlQueryParameterDatetimeRangeRange;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlQueryParameterDatetimeRange {
    private @Nullable SqlQueryParameterDatetimeRangeRange range;
    private @Nullable String value;

    private SqlQueryParameterDatetimeRange() {}
    public Optional<SqlQueryParameterDatetimeRangeRange> range() {
        return Optional.ofNullable(this.range);
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlQueryParameterDatetimeRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SqlQueryParameterDatetimeRangeRange range;
        private @Nullable String value;
        public Builder() {}
        public Builder(SqlQueryParameterDatetimeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.range = defaults.range;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder range(@Nullable SqlQueryParameterDatetimeRangeRange range) {

            this.range = range;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public SqlQueryParameterDatetimeRange build() {
            final var _resultValue = new SqlQueryParameterDatetimeRange();
            _resultValue.range = range;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
