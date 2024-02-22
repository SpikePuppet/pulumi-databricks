// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeClients;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;

@CustomType
public final class GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadType {
    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeClients clients;

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadType() {}
    public GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeClients clients() {
        return this.clients;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeClients clients;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clients = defaults.clients;
        }

        @CustomType.Setter
        public Builder clients(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeClients clients) {
            if (clients == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadType", "clients");
            }
            this.clients = clients;
            return this;
        }
        public GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadType build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadType();
            _resultValue.clients = clients;
            return _resultValue;
        }
    }
}
