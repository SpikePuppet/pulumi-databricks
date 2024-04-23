// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.SqlQueryParameterDatetimesecRangeRangeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlQueryParameterDatetimesecRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlQueryParameterDatetimesecRangeArgs Empty = new SqlQueryParameterDatetimesecRangeArgs();

    @Import(name="range")
    private @Nullable Output<SqlQueryParameterDatetimesecRangeRangeArgs> range;

    public Optional<Output<SqlQueryParameterDatetimesecRangeRangeArgs>> range() {
        return Optional.ofNullable(this.range);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private SqlQueryParameterDatetimesecRangeArgs() {}

    private SqlQueryParameterDatetimesecRangeArgs(SqlQueryParameterDatetimesecRangeArgs $) {
        this.range = $.range;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlQueryParameterDatetimesecRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlQueryParameterDatetimesecRangeArgs $;

        public Builder() {
            $ = new SqlQueryParameterDatetimesecRangeArgs();
        }

        public Builder(SqlQueryParameterDatetimesecRangeArgs defaults) {
            $ = new SqlQueryParameterDatetimesecRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder range(@Nullable Output<SqlQueryParameterDatetimesecRangeRangeArgs> range) {
            $.range = range;
            return this;
        }

        public Builder range(SqlQueryParameterDatetimesecRangeRangeArgs range) {
            return range(Output.of(range));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SqlQueryParameterDatetimesecRangeArgs build() {
            return $;
        }
    }

}
