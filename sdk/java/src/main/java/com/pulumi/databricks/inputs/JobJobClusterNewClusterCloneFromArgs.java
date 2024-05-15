// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class JobJobClusterNewClusterCloneFromArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobJobClusterNewClusterCloneFromArgs Empty = new JobJobClusterNewClusterCloneFromArgs();

    @Import(name="sourceClusterId", required=true)
    private Output<String> sourceClusterId;

    public Output<String> sourceClusterId() {
        return this.sourceClusterId;
    }

    private JobJobClusterNewClusterCloneFromArgs() {}

    private JobJobClusterNewClusterCloneFromArgs(JobJobClusterNewClusterCloneFromArgs $) {
        this.sourceClusterId = $.sourceClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobJobClusterNewClusterCloneFromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobJobClusterNewClusterCloneFromArgs $;

        public Builder() {
            $ = new JobJobClusterNewClusterCloneFromArgs();
        }

        public Builder(JobJobClusterNewClusterCloneFromArgs defaults) {
            $ = new JobJobClusterNewClusterCloneFromArgs(Objects.requireNonNull(defaults));
        }

        public Builder sourceClusterId(Output<String> sourceClusterId) {
            $.sourceClusterId = sourceClusterId;
            return this;
        }

        public Builder sourceClusterId(String sourceClusterId) {
            return sourceClusterId(Output.of(sourceClusterId));
        }

        public JobJobClusterNewClusterCloneFromArgs build() {
            if ($.sourceClusterId == null) {
                throw new MissingRequiredPropertyException("JobJobClusterNewClusterCloneFromArgs", "sourceClusterId");
            }
            return $;
        }
    }

}
