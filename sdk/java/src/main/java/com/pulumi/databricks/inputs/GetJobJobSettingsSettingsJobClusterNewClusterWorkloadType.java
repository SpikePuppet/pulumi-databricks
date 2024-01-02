// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeClients;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;


public final class GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType Empty = new GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType();

    @Import(name="clients", required=true)
    private GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeClients clients;

    public GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeClients clients() {
        return this.clients;
    }

    private GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType() {}

    private GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType(GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType $) {
        this.clients = $.clients;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType();
        }

        public Builder(GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType defaults) {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType(Objects.requireNonNull(defaults));
        }

        public Builder clients(GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeClients clients) {
            $.clients = clients;
            return this;
        }

        public GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType build() {
            if ($.clients == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType", "clients");
            }
            return $;
        }
    }

}
