// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetJobJobSettingsSettingsQueue {
    private GetJobJobSettingsSettingsQueue() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsQueue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsQueue defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GetJobJobSettingsSettingsQueue build() {
            final var o = new GetJobJobSettingsSettingsQueue();
            return o;
        }
    }
}
