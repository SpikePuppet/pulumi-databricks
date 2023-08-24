// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsRunJobTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsRunJobTaskArgs Empty = new GetJobJobSettingsSettingsRunJobTaskArgs();

    @Import(name="jobId", required=true)
    private Output<String> jobId;

    public Output<String> jobId() {
        return this.jobId;
    }

    @Import(name="jobParameters")
    private @Nullable Output<Map<String,Object>> jobParameters;

    public Optional<Output<Map<String,Object>>> jobParameters() {
        return Optional.ofNullable(this.jobParameters);
    }

    private GetJobJobSettingsSettingsRunJobTaskArgs() {}

    private GetJobJobSettingsSettingsRunJobTaskArgs(GetJobJobSettingsSettingsRunJobTaskArgs $) {
        this.jobId = $.jobId;
        this.jobParameters = $.jobParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsRunJobTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsRunJobTaskArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsRunJobTaskArgs();
        }

        public Builder(GetJobJobSettingsSettingsRunJobTaskArgs defaults) {
            $ = new GetJobJobSettingsSettingsRunJobTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder jobId(Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
        }

        public Builder jobParameters(@Nullable Output<Map<String,Object>> jobParameters) {
            $.jobParameters = jobParameters;
            return this;
        }

        public Builder jobParameters(Map<String,Object> jobParameters) {
            return jobParameters(Output.of(jobParameters));
        }

        public GetJobJobSettingsSettingsRunJobTaskArgs build() {
            $.jobId = Objects.requireNonNull($.jobId, "expected parameter 'jobId' to be non-null");
            return $;
        }
    }

}