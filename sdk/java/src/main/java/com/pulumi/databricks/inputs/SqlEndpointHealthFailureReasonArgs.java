// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlEndpointHealthFailureReasonArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlEndpointHealthFailureReasonArgs Empty = new SqlEndpointHealthFailureReasonArgs();

    @Import(name="code")
    private @Nullable Output<String> code;

    public Optional<Output<String>> code() {
        return Optional.ofNullable(this.code);
    }

    @Import(name="parameters")
    private @Nullable Output<Map<String,Object>> parameters;

    public Optional<Output<Map<String,Object>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private SqlEndpointHealthFailureReasonArgs() {}

    private SqlEndpointHealthFailureReasonArgs(SqlEndpointHealthFailureReasonArgs $) {
        this.code = $.code;
        this.parameters = $.parameters;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlEndpointHealthFailureReasonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlEndpointHealthFailureReasonArgs $;

        public Builder() {
            $ = new SqlEndpointHealthFailureReasonArgs();
        }

        public Builder(SqlEndpointHealthFailureReasonArgs defaults) {
            $ = new SqlEndpointHealthFailureReasonArgs(Objects.requireNonNull(defaults));
        }

        public Builder code(@Nullable Output<String> code) {
            $.code = code;
            return this;
        }

        public Builder code(String code) {
            return code(Output.of(code));
        }

        public Builder parameters(@Nullable Output<Map<String,Object>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,Object> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SqlEndpointHealthFailureReasonArgs build() {
            return $;
        }
    }

}
