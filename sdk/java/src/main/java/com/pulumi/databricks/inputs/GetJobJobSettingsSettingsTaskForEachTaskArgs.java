// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskForEachTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskArgs Empty = new GetJobJobSettingsSettingsTaskForEachTaskArgs();

    @Import(name="concurrency")
    private @Nullable Output<Integer> concurrency;

    public Optional<Output<Integer>> concurrency() {
        return Optional.ofNullable(this.concurrency);
    }

    @Import(name="inputs", required=true)
    private Output<String> inputs;

    public Output<String> inputs() {
        return this.inputs;
    }

    @Import(name="task", required=true)
    private Output<GetJobJobSettingsSettingsTaskForEachTaskTaskArgs> task;

    public Output<GetJobJobSettingsSettingsTaskForEachTaskTaskArgs> task() {
        return this.task;
    }

    private GetJobJobSettingsSettingsTaskForEachTaskArgs() {}

    private GetJobJobSettingsSettingsTaskForEachTaskArgs(GetJobJobSettingsSettingsTaskForEachTaskArgs $) {
        this.concurrency = $.concurrency;
        this.inputs = $.inputs;
        this.task = $.task;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder concurrency(@Nullable Output<Integer> concurrency) {
            $.concurrency = concurrency;
            return this;
        }

        public Builder concurrency(Integer concurrency) {
            return concurrency(Output.of(concurrency));
        }

        public Builder inputs(Output<String> inputs) {
            $.inputs = inputs;
            return this;
        }

        public Builder inputs(String inputs) {
            return inputs(Output.of(inputs));
        }

        public Builder task(Output<GetJobJobSettingsSettingsTaskForEachTaskTaskArgs> task) {
            $.task = task;
            return this;
        }

        public Builder task(GetJobJobSettingsSettingsTaskForEachTaskTaskArgs task) {
            return task(Output.of(task));
        }

        public GetJobJobSettingsSettingsTaskForEachTaskArgs build() {
            if ($.inputs == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskArgs", "inputs");
            }
            if ($.task == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskArgs", "task");
            }
            return $;
        }
    }

}
