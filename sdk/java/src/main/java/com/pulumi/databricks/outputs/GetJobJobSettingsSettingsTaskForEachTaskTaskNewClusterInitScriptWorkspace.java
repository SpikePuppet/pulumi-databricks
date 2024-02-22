// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace {
    private String destination;

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace() {}
    public String destination() {
        return this.destination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destination;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        @CustomType.Setter
        public Builder destination(String destination) {
            if (destination == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace", "destination");
            }
            this.destination = destination;
            return this;
        }
        public GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace();
            _resultValue.destination = destination;
            return _resultValue;
        }
    }
}
