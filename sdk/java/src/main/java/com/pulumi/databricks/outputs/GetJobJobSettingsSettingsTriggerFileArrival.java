// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTriggerFileArrival {
    private @Nullable Integer minTimeBetweenTriggerSeconds;
    private String url;
    private @Nullable Integer waitAfterLastChangeSeconds;

    private GetJobJobSettingsSettingsTriggerFileArrival() {}
    public Optional<Integer> minTimeBetweenTriggerSeconds() {
        return Optional.ofNullable(this.minTimeBetweenTriggerSeconds);
    }
    public String url() {
        return this.url;
    }
    public Optional<Integer> waitAfterLastChangeSeconds() {
        return Optional.ofNullable(this.waitAfterLastChangeSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTriggerFileArrival defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer minTimeBetweenTriggerSeconds;
        private String url;
        private @Nullable Integer waitAfterLastChangeSeconds;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTriggerFileArrival defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minTimeBetweenTriggerSeconds = defaults.minTimeBetweenTriggerSeconds;
    	      this.url = defaults.url;
    	      this.waitAfterLastChangeSeconds = defaults.waitAfterLastChangeSeconds;
        }

        @CustomType.Setter
        public Builder minTimeBetweenTriggerSeconds(@Nullable Integer minTimeBetweenTriggerSeconds) {
            this.minTimeBetweenTriggerSeconds = minTimeBetweenTriggerSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        @CustomType.Setter
        public Builder waitAfterLastChangeSeconds(@Nullable Integer waitAfterLastChangeSeconds) {
            this.waitAfterLastChangeSeconds = waitAfterLastChangeSeconds;
            return this;
        }
        public GetJobJobSettingsSettingsTriggerFileArrival build() {
            final var o = new GetJobJobSettingsSettingsTriggerFileArrival();
            o.minTimeBetweenTriggerSeconds = minTimeBetweenTriggerSeconds;
            o.url = url;
            o.waitAfterLastChangeSeconds = waitAfterLastChangeSeconds;
            return o;
        }
    }
}