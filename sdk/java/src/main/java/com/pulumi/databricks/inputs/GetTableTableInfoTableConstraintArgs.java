// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetTableTableInfoTableConstraintForeignKeyConstraintArgs;
import com.pulumi.databricks.inputs.GetTableTableInfoTableConstraintNamedTableConstraintArgs;
import com.pulumi.databricks.inputs.GetTableTableInfoTableConstraintPrimaryKeyConstraintArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTableTableInfoTableConstraintArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetTableTableInfoTableConstraintArgs Empty = new GetTableTableInfoTableConstraintArgs();

    @Import(name="foreignKeyConstraint")
    private @Nullable Output<GetTableTableInfoTableConstraintForeignKeyConstraintArgs> foreignKeyConstraint;

    public Optional<Output<GetTableTableInfoTableConstraintForeignKeyConstraintArgs>> foreignKeyConstraint() {
        return Optional.ofNullable(this.foreignKeyConstraint);
    }

    @Import(name="namedTableConstraint")
    private @Nullable Output<GetTableTableInfoTableConstraintNamedTableConstraintArgs> namedTableConstraint;

    public Optional<Output<GetTableTableInfoTableConstraintNamedTableConstraintArgs>> namedTableConstraint() {
        return Optional.ofNullable(this.namedTableConstraint);
    }

    @Import(name="primaryKeyConstraint")
    private @Nullable Output<GetTableTableInfoTableConstraintPrimaryKeyConstraintArgs> primaryKeyConstraint;

    public Optional<Output<GetTableTableInfoTableConstraintPrimaryKeyConstraintArgs>> primaryKeyConstraint() {
        return Optional.ofNullable(this.primaryKeyConstraint);
    }

    private GetTableTableInfoTableConstraintArgs() {}

    private GetTableTableInfoTableConstraintArgs(GetTableTableInfoTableConstraintArgs $) {
        this.foreignKeyConstraint = $.foreignKeyConstraint;
        this.namedTableConstraint = $.namedTableConstraint;
        this.primaryKeyConstraint = $.primaryKeyConstraint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableTableInfoTableConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableTableInfoTableConstraintArgs $;

        public Builder() {
            $ = new GetTableTableInfoTableConstraintArgs();
        }

        public Builder(GetTableTableInfoTableConstraintArgs defaults) {
            $ = new GetTableTableInfoTableConstraintArgs(Objects.requireNonNull(defaults));
        }

        public Builder foreignKeyConstraint(@Nullable Output<GetTableTableInfoTableConstraintForeignKeyConstraintArgs> foreignKeyConstraint) {
            $.foreignKeyConstraint = foreignKeyConstraint;
            return this;
        }

        public Builder foreignKeyConstraint(GetTableTableInfoTableConstraintForeignKeyConstraintArgs foreignKeyConstraint) {
            return foreignKeyConstraint(Output.of(foreignKeyConstraint));
        }

        public Builder namedTableConstraint(@Nullable Output<GetTableTableInfoTableConstraintNamedTableConstraintArgs> namedTableConstraint) {
            $.namedTableConstraint = namedTableConstraint;
            return this;
        }

        public Builder namedTableConstraint(GetTableTableInfoTableConstraintNamedTableConstraintArgs namedTableConstraint) {
            return namedTableConstraint(Output.of(namedTableConstraint));
        }

        public Builder primaryKeyConstraint(@Nullable Output<GetTableTableInfoTableConstraintPrimaryKeyConstraintArgs> primaryKeyConstraint) {
            $.primaryKeyConstraint = primaryKeyConstraint;
            return this;
        }

        public Builder primaryKeyConstraint(GetTableTableInfoTableConstraintPrimaryKeyConstraintArgs primaryKeyConstraint) {
            return primaryKeyConstraint(Output.of(primaryKeyConstraint));
        }

        public GetTableTableInfoTableConstraintArgs build() {
            return $;
        }
    }

}
