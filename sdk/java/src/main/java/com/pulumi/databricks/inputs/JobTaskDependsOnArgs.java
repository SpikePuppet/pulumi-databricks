// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskDependsOnArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskDependsOnArgs Empty = new JobTaskDependsOnArgs();

    @Import(name="outcome")
    private @Nullable Output<String> outcome;

    public Optional<Output<String>> outcome() {
        return Optional.ofNullable(this.outcome);
    }

    /**
     * The name of the task this task depends on.
     * 
     */
    @Import(name="taskKey", required=true)
    private Output<String> taskKey;

    /**
     * @return The name of the task this task depends on.
     * 
     */
    public Output<String> taskKey() {
        return this.taskKey;
    }

    private JobTaskDependsOnArgs() {}

    private JobTaskDependsOnArgs(JobTaskDependsOnArgs $) {
        this.outcome = $.outcome;
        this.taskKey = $.taskKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskDependsOnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskDependsOnArgs $;

        public Builder() {
            $ = new JobTaskDependsOnArgs();
        }

        public Builder(JobTaskDependsOnArgs defaults) {
            $ = new JobTaskDependsOnArgs(Objects.requireNonNull(defaults));
        }

        public Builder outcome(@Nullable Output<String> outcome) {
            $.outcome = outcome;
            return this;
        }

        public Builder outcome(String outcome) {
            return outcome(Output.of(outcome));
        }

        /**
         * @param taskKey The name of the task this task depends on.
         * 
         * @return builder
         * 
         */
        public Builder taskKey(Output<String> taskKey) {
            $.taskKey = taskKey;
            return this;
        }

        /**
         * @param taskKey The name of the task this task depends on.
         * 
         * @return builder
         * 
         */
        public Builder taskKey(String taskKey) {
            return taskKey(Output.of(taskKey));
        }

        public JobTaskDependsOnArgs build() {
            if ($.taskKey == null) {
                throw new MissingRequiredPropertyException("JobTaskDependsOnArgs", "taskKey");
            }
            return $;
        }
    }

}
