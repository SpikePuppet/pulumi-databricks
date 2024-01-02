// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsNotebookTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsNotebookTaskArgs Empty = new GetJobJobSettingsSettingsNotebookTaskArgs();

    @Import(name="baseParameters")
    private @Nullable Output<Map<String,Object>> baseParameters;

    public Optional<Output<Map<String,Object>>> baseParameters() {
        return Optional.ofNullable(this.baseParameters);
    }

    @Import(name="notebookPath", required=true)
    private Output<String> notebookPath;

    public Output<String> notebookPath() {
        return this.notebookPath;
    }

    @Import(name="source")
    private @Nullable Output<String> source;

    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private GetJobJobSettingsSettingsNotebookTaskArgs() {}

    private GetJobJobSettingsSettingsNotebookTaskArgs(GetJobJobSettingsSettingsNotebookTaskArgs $) {
        this.baseParameters = $.baseParameters;
        this.notebookPath = $.notebookPath;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsNotebookTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsNotebookTaskArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsNotebookTaskArgs();
        }

        public Builder(GetJobJobSettingsSettingsNotebookTaskArgs defaults) {
            $ = new GetJobJobSettingsSettingsNotebookTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder baseParameters(@Nullable Output<Map<String,Object>> baseParameters) {
            $.baseParameters = baseParameters;
            return this;
        }

        public Builder baseParameters(Map<String,Object> baseParameters) {
            return baseParameters(Output.of(baseParameters));
        }

        public Builder notebookPath(Output<String> notebookPath) {
            $.notebookPath = notebookPath;
            return this;
        }

        public Builder notebookPath(String notebookPath) {
            return notebookPath(Output.of(notebookPath));
        }

        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public GetJobJobSettingsSettingsNotebookTaskArgs build() {
            if ($.notebookPath == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsNotebookTaskArgs", "notebookPath");
            }
            return $;
        }
    }

}
