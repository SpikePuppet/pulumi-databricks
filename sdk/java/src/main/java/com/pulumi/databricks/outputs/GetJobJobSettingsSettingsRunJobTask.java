// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsRunJobTask {
    private String jobId;
    private @Nullable Map<String,Object> jobParameters;

    private GetJobJobSettingsSettingsRunJobTask() {}
    public String jobId() {
        return this.jobId;
    }
    public Map<String,Object> jobParameters() {
        return this.jobParameters == null ? Map.of() : this.jobParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsRunJobTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String jobId;
        private @Nullable Map<String,Object> jobParameters;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsRunJobTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
    	      this.jobParameters = defaults.jobParameters;
        }

        @CustomType.Setter
        public Builder jobId(String jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }
        @CustomType.Setter
        public Builder jobParameters(@Nullable Map<String,Object> jobParameters) {
            this.jobParameters = jobParameters;
            return this;
        }
        public GetJobJobSettingsSettingsRunJobTask build() {
            final var o = new GetJobJobSettingsSettingsRunJobTask();
            o.jobId = jobId;
            o.jobParameters = jobParameters;
            return o;
        }
    }
}
