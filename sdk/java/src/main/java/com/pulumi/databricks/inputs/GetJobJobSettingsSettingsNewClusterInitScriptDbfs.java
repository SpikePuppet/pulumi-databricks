// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsNewClusterInitScriptDbfs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsNewClusterInitScriptDbfs Empty = new GetJobJobSettingsSettingsNewClusterInitScriptDbfs();

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    private GetJobJobSettingsSettingsNewClusterInitScriptDbfs() {}

    private GetJobJobSettingsSettingsNewClusterInitScriptDbfs(GetJobJobSettingsSettingsNewClusterInitScriptDbfs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsNewClusterInitScriptDbfs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsNewClusterInitScriptDbfs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsNewClusterInitScriptDbfs();
        }

        public Builder(GetJobJobSettingsSettingsNewClusterInitScriptDbfs defaults) {
            $ = new GetJobJobSettingsSettingsNewClusterInitScriptDbfs(Objects.requireNonNull(defaults));
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public GetJobJobSettingsSettingsNewClusterInitScriptDbfs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            return $;
        }
    }

}