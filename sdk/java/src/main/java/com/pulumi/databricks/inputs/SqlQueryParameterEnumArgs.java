// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.SqlQueryParameterEnumMultipleArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlQueryParameterEnumArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlQueryParameterEnumArgs Empty = new SqlQueryParameterEnumArgs();

    @Import(name="multiple")
    private @Nullable Output<SqlQueryParameterEnumMultipleArgs> multiple;

    public Optional<Output<SqlQueryParameterEnumMultipleArgs>> multiple() {
        return Optional.ofNullable(this.multiple);
    }

    @Import(name="options", required=true)
    private Output<List<String>> options;

    public Output<List<String>> options() {
        return this.options;
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private SqlQueryParameterEnumArgs() {}

    private SqlQueryParameterEnumArgs(SqlQueryParameterEnumArgs $) {
        this.multiple = $.multiple;
        this.options = $.options;
        this.value = $.value;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlQueryParameterEnumArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlQueryParameterEnumArgs $;

        public Builder() {
            $ = new SqlQueryParameterEnumArgs();
        }

        public Builder(SqlQueryParameterEnumArgs defaults) {
            $ = new SqlQueryParameterEnumArgs(Objects.requireNonNull(defaults));
        }

        public Builder multiple(@Nullable Output<SqlQueryParameterEnumMultipleArgs> multiple) {
            $.multiple = multiple;
            return this;
        }

        public Builder multiple(SqlQueryParameterEnumMultipleArgs multiple) {
            return multiple(Output.of(multiple));
        }

        public Builder options(Output<List<String>> options) {
            $.options = options;
            return this;
        }

        public Builder options(List<String> options) {
            return options(Output.of(options));
        }

        public Builder options(String... options) {
            return options(List.of(options));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public SqlQueryParameterEnumArgs build() {
            if ($.options == null) {
                throw new MissingRequiredPropertyException("SqlQueryParameterEnumArgs", "options");
            }
            return $;
        }
    }

}
