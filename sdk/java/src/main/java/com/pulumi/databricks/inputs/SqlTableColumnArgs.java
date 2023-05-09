// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlTableColumnArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlTableColumnArgs Empty = new SqlTableColumnArgs();

    /**
     * User-supplied free-form text.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return User-supplied free-form text.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * User-visible name of column
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return User-visible name of column
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Whether field is nullable (Default: `true`)
     * 
     */
    @Import(name="nullable")
    private @Nullable Output<Boolean> nullable;

    /**
     * @return Whether field is nullable (Default: `true`)
     * 
     */
    public Optional<Output<Boolean>> nullable() {
        return Optional.ofNullable(this.nullable);
    }

    /**
     * Column type spec (with metadata) as SQL text
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Column type spec (with metadata) as SQL text
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private SqlTableColumnArgs() {}

    private SqlTableColumnArgs(SqlTableColumnArgs $) {
        this.comment = $.comment;
        this.name = $.name;
        this.nullable = $.nullable;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlTableColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlTableColumnArgs $;

        public Builder() {
            $ = new SqlTableColumnArgs();
        }

        public Builder(SqlTableColumnArgs defaults) {
            $ = new SqlTableColumnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment User-supplied free-form text.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment User-supplied free-form text.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param name User-visible name of column
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name User-visible name of column
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nullable Whether field is nullable (Default: `true`)
         * 
         * @return builder
         * 
         */
        public Builder nullable(@Nullable Output<Boolean> nullable) {
            $.nullable = nullable;
            return this;
        }

        /**
         * @param nullable Whether field is nullable (Default: `true`)
         * 
         * @return builder
         * 
         */
        public Builder nullable(Boolean nullable) {
            return nullable(Output.of(nullable));
        }

        /**
         * @param type Column type spec (with metadata) as SQL text
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Column type spec (with metadata) as SQL text
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SqlTableColumnArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
