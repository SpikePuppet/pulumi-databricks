// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class JobTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs Empty = new JobTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs();

    @Import(name="destination", required=true)
    private Output<String> destination;

    public Output<String> destination() {
        return this.destination;
    }

    private JobTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs() {}

    private JobTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs(JobTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs $;

        public Builder() {
            $ = new JobTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs();
        }

        public Builder(JobTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs defaults) {
            $ = new JobTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder destination(Output<String> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public JobTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs", "destination");
            }
            return $;
        }
    }

}
