// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SqlQueryParameterEnumMultiple {
    private String prefix;
    private String separator;
    private String suffix;

    private SqlQueryParameterEnumMultiple() {}
    public String prefix() {
        return this.prefix;
    }
    public String separator() {
        return this.separator;
    }
    public String suffix() {
        return this.suffix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlQueryParameterEnumMultiple defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String prefix;
        private String separator;
        private String suffix;
        public Builder() {}
        public Builder(SqlQueryParameterEnumMultiple defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
    	      this.separator = defaults.separator;
    	      this.suffix = defaults.suffix;
        }

        @CustomType.Setter
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        @CustomType.Setter
        public Builder separator(String separator) {
            this.separator = Objects.requireNonNull(separator);
            return this;
        }
        @CustomType.Setter
        public Builder suffix(String suffix) {
            this.suffix = Objects.requireNonNull(suffix);
            return this;
        }
        public SqlQueryParameterEnumMultiple build() {
            final var _resultValue = new SqlQueryParameterEnumMultiple();
            _resultValue.prefix = prefix;
            _resultValue.separator = separator;
            _resultValue.suffix = suffix;
            return _resultValue;
        }
    }
}
