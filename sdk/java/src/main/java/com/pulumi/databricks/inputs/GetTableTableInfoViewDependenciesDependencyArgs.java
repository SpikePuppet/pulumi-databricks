// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetTableTableInfoViewDependenciesDependencyFunctionArgs;
import com.pulumi.databricks.inputs.GetTableTableInfoViewDependenciesDependencyTableArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTableTableInfoViewDependenciesDependencyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetTableTableInfoViewDependenciesDependencyArgs Empty = new GetTableTableInfoViewDependenciesDependencyArgs();

    @Import(name="function")
    private @Nullable Output<GetTableTableInfoViewDependenciesDependencyFunctionArgs> function;

    public Optional<Output<GetTableTableInfoViewDependenciesDependencyFunctionArgs>> function() {
        return Optional.ofNullable(this.function);
    }

    @Import(name="table")
    private @Nullable Output<GetTableTableInfoViewDependenciesDependencyTableArgs> table;

    public Optional<Output<GetTableTableInfoViewDependenciesDependencyTableArgs>> table() {
        return Optional.ofNullable(this.table);
    }

    private GetTableTableInfoViewDependenciesDependencyArgs() {}

    private GetTableTableInfoViewDependenciesDependencyArgs(GetTableTableInfoViewDependenciesDependencyArgs $) {
        this.function = $.function;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableTableInfoViewDependenciesDependencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableTableInfoViewDependenciesDependencyArgs $;

        public Builder() {
            $ = new GetTableTableInfoViewDependenciesDependencyArgs();
        }

        public Builder(GetTableTableInfoViewDependenciesDependencyArgs defaults) {
            $ = new GetTableTableInfoViewDependenciesDependencyArgs(Objects.requireNonNull(defaults));
        }

        public Builder function(@Nullable Output<GetTableTableInfoViewDependenciesDependencyFunctionArgs> function) {
            $.function = function;
            return this;
        }

        public Builder function(GetTableTableInfoViewDependenciesDependencyFunctionArgs function) {
            return function(Output.of(function));
        }

        public Builder table(@Nullable Output<GetTableTableInfoViewDependenciesDependencyTableArgs> table) {
            $.table = table;
            return this;
        }

        public Builder table(GetTableTableInfoViewDependenciesDependencyTableArgs table) {
            return table(Output.of(table));
        }

        public GetTableTableInfoViewDependenciesDependencyArgs build() {
            return $;
        }
    }

}
