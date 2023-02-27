// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetShareObjectPartitionValue;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetShareObjectPartition {
    private List<GetShareObjectPartitionValue> values;

    private GetShareObjectPartition() {}
    public List<GetShareObjectPartitionValue> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetShareObjectPartition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetShareObjectPartitionValue> values;
        public Builder() {}
        public Builder(GetShareObjectPartition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder values(List<GetShareObjectPartitionValue> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(GetShareObjectPartitionValue... values) {
            return values(List.of(values));
        }
        public GetShareObjectPartition build() {
            final var o = new GetShareObjectPartition();
            o.values = values;
            return o;
        }
    }
}
