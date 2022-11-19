// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskSparkPythonTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskSparkPythonTaskArgs Empty = new GetJobJobSettingsSettingsTaskSparkPythonTaskArgs();

    @Import(name="parameters")
    private @Nullable Output<List<String>> parameters;

    public Optional<Output<List<String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    @Import(name="pythonFile", required=true)
    private Output<String> pythonFile;

    public Output<String> pythonFile() {
        return this.pythonFile;
    }

    private GetJobJobSettingsSettingsTaskSparkPythonTaskArgs() {}

    private GetJobJobSettingsSettingsTaskSparkPythonTaskArgs(GetJobJobSettingsSettingsTaskSparkPythonTaskArgs $) {
        this.parameters = $.parameters;
        this.pythonFile = $.pythonFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskSparkPythonTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskSparkPythonTaskArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskSparkPythonTaskArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskSparkPythonTaskArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskSparkPythonTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder parameters(@Nullable Output<List<String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<String> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }

        public Builder pythonFile(Output<String> pythonFile) {
            $.pythonFile = pythonFile;
            return this;
        }

        public Builder pythonFile(String pythonFile) {
            return pythonFile(Output.of(pythonFile));
        }

        public GetJobJobSettingsSettingsTaskSparkPythonTaskArgs build() {
            $.pythonFile = Objects.requireNonNull($.pythonFile, "expected parameter 'pythonFile' to be non-null");
            return $;
        }
    }

}