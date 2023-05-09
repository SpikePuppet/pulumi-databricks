// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobNewClusterInitScriptWorkspaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobNewClusterInitScriptWorkspaceArgs Empty = new JobNewClusterInitScriptWorkspaceArgs();

    @Import(name="destination")
    private @Nullable Output<String> destination;

    public Optional<Output<String>> destination() {
        return Optional.ofNullable(this.destination);
    }

    private JobNewClusterInitScriptWorkspaceArgs() {}

    private JobNewClusterInitScriptWorkspaceArgs(JobNewClusterInitScriptWorkspaceArgs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobNewClusterInitScriptWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobNewClusterInitScriptWorkspaceArgs $;

        public Builder() {
            $ = new JobNewClusterInitScriptWorkspaceArgs();
        }

        public Builder(JobNewClusterInitScriptWorkspaceArgs defaults) {
            $ = new JobNewClusterInitScriptWorkspaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder destination(@Nullable Output<String> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public JobNewClusterInitScriptWorkspaceArgs build() {
            return $;
        }
    }

}
