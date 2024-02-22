// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask();

    @Import(name="parameters")
    private @Nullable List<String> parameters;

    public Optional<List<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask(GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask $) {
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask(Objects.requireNonNull(defaults));
        }

        public Builder parameters(@Nullable List<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTask build() {
            return $;
        }
    }

}
