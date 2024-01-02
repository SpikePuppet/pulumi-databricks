// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetShareObjectPartitionValueArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;


public final class GetShareObjectPartitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetShareObjectPartitionArgs Empty = new GetShareObjectPartitionArgs();

    @Import(name="values", required=true)
    private Output<List<GetShareObjectPartitionValueArgs>> values;

    public Output<List<GetShareObjectPartitionValueArgs>> values() {
        return this.values;
    }

    private GetShareObjectPartitionArgs() {}

    private GetShareObjectPartitionArgs(GetShareObjectPartitionArgs $) {
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetShareObjectPartitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetShareObjectPartitionArgs $;

        public Builder() {
            $ = new GetShareObjectPartitionArgs();
        }

        public Builder(GetShareObjectPartitionArgs defaults) {
            $ = new GetShareObjectPartitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder values(Output<List<GetShareObjectPartitionValueArgs>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<GetShareObjectPartitionValueArgs> values) {
            return values(Output.of(values));
        }

        public Builder values(GetShareObjectPartitionValueArgs... values) {
            return values(List.of(values));
        }

        public GetShareObjectPartitionArgs build() {
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetShareObjectPartitionArgs", "values");
            }
            return $;
        }
    }

}
