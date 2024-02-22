// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs();

    @Import(name="destination", required=true)
    private Output<String> destination;

    public Output<String> destination() {
        return this.destination;
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs(Objects.requireNonNull(defaults));
        }

        public Builder destination(Output<String> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs", "destination");
            }
            return $;
        }
    }

}
