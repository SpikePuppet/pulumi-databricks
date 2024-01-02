// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs Empty = new GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs();

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    private GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs() {}

    private GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs(GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs();
        }

        public Builder(GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs defaults) {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs(Objects.requireNonNull(defaults));
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs", "destination");
            }
            return $;
        }
    }

}
