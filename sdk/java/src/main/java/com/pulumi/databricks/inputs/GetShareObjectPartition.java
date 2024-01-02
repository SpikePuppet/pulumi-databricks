// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetShareObjectPartitionValue;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;


public final class GetShareObjectPartition extends com.pulumi.resources.InvokeArgs {

    public static final GetShareObjectPartition Empty = new GetShareObjectPartition();

    @Import(name="values", required=true)
    private List<GetShareObjectPartitionValue> values;

    public List<GetShareObjectPartitionValue> values() {
        return this.values;
    }

    private GetShareObjectPartition() {}

    private GetShareObjectPartition(GetShareObjectPartition $) {
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetShareObjectPartition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetShareObjectPartition $;

        public Builder() {
            $ = new GetShareObjectPartition();
        }

        public Builder(GetShareObjectPartition defaults) {
            $ = new GetShareObjectPartition(Objects.requireNonNull(defaults));
        }

        public Builder values(List<GetShareObjectPartitionValue> values) {
            $.values = values;
            return this;
        }

        public Builder values(GetShareObjectPartitionValue... values) {
            return values(List.of(values));
        }

        public GetShareObjectPartition build() {
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetShareObjectPartition", "values");
            }
            return $;
        }
    }

}
