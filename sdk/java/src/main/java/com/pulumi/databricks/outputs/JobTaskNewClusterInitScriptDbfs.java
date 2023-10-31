// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobTaskNewClusterInitScriptDbfs {
    private String destination;

    private JobTaskNewClusterInitScriptDbfs() {}
    public String destination() {
        return this.destination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskNewClusterInitScriptDbfs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destination;
        public Builder() {}
        public Builder(JobTaskNewClusterInitScriptDbfs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        @CustomType.Setter
        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public JobTaskNewClusterInitScriptDbfs build() {
            final var _resultValue = new JobTaskNewClusterInitScriptDbfs();
            _resultValue.destination = destination;
            return _resultValue;
        }
    }
}
