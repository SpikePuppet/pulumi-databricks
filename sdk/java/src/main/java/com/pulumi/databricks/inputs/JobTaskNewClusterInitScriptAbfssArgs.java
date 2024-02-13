// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class JobTaskNewClusterInitScriptAbfssArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskNewClusterInitScriptAbfssArgs Empty = new JobTaskNewClusterInitScriptAbfssArgs();

    @Import(name="destination", required=true)
    private Output<String> destination;

    public Output<String> destination() {
        return this.destination;
    }

    private JobTaskNewClusterInitScriptAbfssArgs() {}

    private JobTaskNewClusterInitScriptAbfssArgs(JobTaskNewClusterInitScriptAbfssArgs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskNewClusterInitScriptAbfssArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskNewClusterInitScriptAbfssArgs $;

        public Builder() {
            $ = new JobTaskNewClusterInitScriptAbfssArgs();
        }

        public Builder(JobTaskNewClusterInitScriptAbfssArgs defaults) {
            $ = new JobTaskNewClusterInitScriptAbfssArgs(Objects.requireNonNull(defaults));
        }

        public Builder destination(Output<String> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public JobTaskNewClusterInitScriptAbfssArgs build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("JobTaskNewClusterInitScriptAbfssArgs", "destination");
            }
            return $;
        }
    }

}
