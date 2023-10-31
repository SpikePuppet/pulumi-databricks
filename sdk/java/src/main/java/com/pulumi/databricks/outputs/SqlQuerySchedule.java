// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.SqlQueryScheduleContinuous;
import com.pulumi.databricks.outputs.SqlQueryScheduleDaily;
import com.pulumi.databricks.outputs.SqlQueryScheduleWeekly;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlQuerySchedule {
    private @Nullable SqlQueryScheduleContinuous continuous;
    private @Nullable SqlQueryScheduleDaily daily;
    private @Nullable SqlQueryScheduleWeekly weekly;

    private SqlQuerySchedule() {}
    public Optional<SqlQueryScheduleContinuous> continuous() {
        return Optional.ofNullable(this.continuous);
    }
    public Optional<SqlQueryScheduleDaily> daily() {
        return Optional.ofNullable(this.daily);
    }
    public Optional<SqlQueryScheduleWeekly> weekly() {
        return Optional.ofNullable(this.weekly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlQuerySchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SqlQueryScheduleContinuous continuous;
        private @Nullable SqlQueryScheduleDaily daily;
        private @Nullable SqlQueryScheduleWeekly weekly;
        public Builder() {}
        public Builder(SqlQuerySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continuous = defaults.continuous;
    	      this.daily = defaults.daily;
    	      this.weekly = defaults.weekly;
        }

        @CustomType.Setter
        public Builder continuous(@Nullable SqlQueryScheduleContinuous continuous) {
            this.continuous = continuous;
            return this;
        }
        @CustomType.Setter
        public Builder daily(@Nullable SqlQueryScheduleDaily daily) {
            this.daily = daily;
            return this;
        }
        @CustomType.Setter
        public Builder weekly(@Nullable SqlQueryScheduleWeekly weekly) {
            this.weekly = weekly;
            return this;
        }
        public SqlQuerySchedule build() {
            final var _resultValue = new SqlQuerySchedule();
            _resultValue.continuous = continuous;
            _resultValue.daily = daily;
            _resultValue.weekly = weekly;
            return _resultValue;
        }
    }
}
