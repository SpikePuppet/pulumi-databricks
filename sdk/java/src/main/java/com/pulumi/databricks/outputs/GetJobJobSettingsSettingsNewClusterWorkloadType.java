// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterWorkloadTypeClients;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;

@CustomType
public final class GetJobJobSettingsSettingsNewClusterWorkloadType {
    private GetJobJobSettingsSettingsNewClusterWorkloadTypeClients clients;

    private GetJobJobSettingsSettingsNewClusterWorkloadType() {}
    public GetJobJobSettingsSettingsNewClusterWorkloadTypeClients clients() {
        return this.clients;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsNewClusterWorkloadType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetJobJobSettingsSettingsNewClusterWorkloadTypeClients clients;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsNewClusterWorkloadType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clients = defaults.clients;
        }

        @CustomType.Setter
        public Builder clients(GetJobJobSettingsSettingsNewClusterWorkloadTypeClients clients) {
            if (clients == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsNewClusterWorkloadType", "clients");
            }
            this.clients = clients;
            return this;
        }
        public GetJobJobSettingsSettingsNewClusterWorkloadType build() {
            final var _resultValue = new GetJobJobSettingsSettingsNewClusterWorkloadType();
            _resultValue.clients = clients;
            return _resultValue;
        }
    }
}
