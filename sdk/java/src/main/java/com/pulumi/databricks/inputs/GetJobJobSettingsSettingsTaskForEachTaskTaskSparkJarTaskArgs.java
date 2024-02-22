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


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs();

    @Import(name="jarUri")
    private @Nullable Output<String> jarUri;

    public Optional<Output<String>> jarUri() {
        return Optional.ofNullable(this.jarUri);
    }

    @Import(name="mainClassName")
    private @Nullable Output<String> mainClassName;

    public Optional<Output<String>> mainClassName() {
        return Optional.ofNullable(this.mainClassName);
    }

    @Import(name="parameters")
    private @Nullable Output<List<String>> parameters;

    public Optional<Output<List<String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs(GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs $) {
        this.jarUri = $.jarUri;
        this.mainClassName = $.mainClassName;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder jarUri(@Nullable Output<String> jarUri) {
            $.jarUri = jarUri;
            return this;
        }

        public Builder jarUri(String jarUri) {
            return jarUri(Output.of(jarUri));
        }

        public Builder mainClassName(@Nullable Output<String> mainClassName) {
            $.mainClassName = mainClassName;
            return this;
        }

        public Builder mainClassName(String mainClassName) {
            return mainClassName(Output.of(mainClassName));
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

        public GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs build() {
            return $;
        }
    }

}
