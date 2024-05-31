// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTriggerTableUpdate {
    private @Nullable String condition;
    private @Nullable Integer minTimeBetweenTriggersSeconds;
    private List<String> tableNames;
    private @Nullable Integer waitAfterLastChangeSeconds;

    private JobTriggerTableUpdate() {}
    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }
    public Optional<Integer> minTimeBetweenTriggersSeconds() {
        return Optional.ofNullable(this.minTimeBetweenTriggersSeconds);
    }
    public List<String> tableNames() {
        return this.tableNames;
    }
    public Optional<Integer> waitAfterLastChangeSeconds() {
        return Optional.ofNullable(this.waitAfterLastChangeSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTriggerTableUpdate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String condition;
        private @Nullable Integer minTimeBetweenTriggersSeconds;
        private List<String> tableNames;
        private @Nullable Integer waitAfterLastChangeSeconds;
        public Builder() {}
        public Builder(JobTriggerTableUpdate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.minTimeBetweenTriggersSeconds = defaults.minTimeBetweenTriggersSeconds;
    	      this.tableNames = defaults.tableNames;
    	      this.waitAfterLastChangeSeconds = defaults.waitAfterLastChangeSeconds;
        }

        @CustomType.Setter
        public Builder condition(@Nullable String condition) {

            this.condition = condition;
            return this;
        }
        @CustomType.Setter
        public Builder minTimeBetweenTriggersSeconds(@Nullable Integer minTimeBetweenTriggersSeconds) {

            this.minTimeBetweenTriggersSeconds = minTimeBetweenTriggersSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder tableNames(List<String> tableNames) {
            if (tableNames == null) {
              throw new MissingRequiredPropertyException("JobTriggerTableUpdate", "tableNames");
            }
            this.tableNames = tableNames;
            return this;
        }
        public Builder tableNames(String... tableNames) {
            return tableNames(List.of(tableNames));
        }
        @CustomType.Setter
        public Builder waitAfterLastChangeSeconds(@Nullable Integer waitAfterLastChangeSeconds) {

            this.waitAfterLastChangeSeconds = waitAfterLastChangeSeconds;
            return this;
        }
        public JobTriggerTableUpdate build() {
            final var _resultValue = new JobTriggerTableUpdate();
            _resultValue.condition = condition;
            _resultValue.minTimeBetweenTriggersSeconds = minTimeBetweenTriggersSeconds;
            _resultValue.tableNames = tableNames;
            _resultValue.waitAfterLastChangeSeconds = waitAfterLastChangeSeconds;
            return _resultValue;
        }
    }
}
