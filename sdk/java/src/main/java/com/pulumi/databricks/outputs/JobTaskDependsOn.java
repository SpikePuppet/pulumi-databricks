// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskDependsOn {
    private @Nullable String outcome;
    /**
     * @return The name of the task this task depends on.
     * 
     */
    private String taskKey;

    private JobTaskDependsOn() {}
    public Optional<String> outcome() {
        return Optional.ofNullable(this.outcome);
    }
    /**
     * @return The name of the task this task depends on.
     * 
     */
    public String taskKey() {
        return this.taskKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskDependsOn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String outcome;
        private String taskKey;
        public Builder() {}
        public Builder(JobTaskDependsOn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outcome = defaults.outcome;
    	      this.taskKey = defaults.taskKey;
        }

        @CustomType.Setter
        public Builder outcome(@Nullable String outcome) {

            this.outcome = outcome;
            return this;
        }
        @CustomType.Setter
        public Builder taskKey(String taskKey) {
            if (taskKey == null) {
              throw new MissingRequiredPropertyException("JobTaskDependsOn", "taskKey");
            }
            this.taskKey = taskKey;
            return this;
        }
        public JobTaskDependsOn build() {
            final var _resultValue = new JobTaskDependsOn();
            _resultValue.outcome = outcome;
            _resultValue.taskKey = taskKey;
            return _resultValue;
        }
    }
}
