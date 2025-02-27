// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class SqlQueryParameterDatetimesecArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlQueryParameterDatetimesecArgs Empty = new SqlQueryParameterDatetimesecArgs();

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private SqlQueryParameterDatetimesecArgs() {}

    private SqlQueryParameterDatetimesecArgs(SqlQueryParameterDatetimesecArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlQueryParameterDatetimesecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlQueryParameterDatetimesecArgs $;

        public Builder() {
            $ = new SqlQueryParameterDatetimesecArgs();
        }

        public Builder(SqlQueryParameterDatetimesecArgs defaults) {
            $ = new SqlQueryParameterDatetimesecArgs(Objects.requireNonNull(defaults));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SqlQueryParameterDatetimesecArgs build() {
            if ($.value == null) {
                throw new MissingRequiredPropertyException("SqlQueryParameterDatetimesecArgs", "value");
            }
            return $;
        }
    }

}
