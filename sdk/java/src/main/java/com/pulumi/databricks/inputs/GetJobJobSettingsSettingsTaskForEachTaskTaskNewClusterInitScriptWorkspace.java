// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace();

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace(Objects.requireNonNull(defaults));
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspace", "destination");
            }
            return $;
        }
    }

}
