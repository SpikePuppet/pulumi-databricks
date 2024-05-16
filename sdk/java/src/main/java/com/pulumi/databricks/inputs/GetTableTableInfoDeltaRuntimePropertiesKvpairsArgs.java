// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetTableTableInfoDeltaRuntimePropertiesKvpairsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetTableTableInfoDeltaRuntimePropertiesKvpairsArgs Empty = new GetTableTableInfoDeltaRuntimePropertiesKvpairsArgs();

    @Import(name="deltaRuntimeProperties", required=true)
    private Output<Map<String,Object>> deltaRuntimeProperties;

    public Output<Map<String,Object>> deltaRuntimeProperties() {
        return this.deltaRuntimeProperties;
    }

    private GetTableTableInfoDeltaRuntimePropertiesKvpairsArgs() {}

    private GetTableTableInfoDeltaRuntimePropertiesKvpairsArgs(GetTableTableInfoDeltaRuntimePropertiesKvpairsArgs $) {
        this.deltaRuntimeProperties = $.deltaRuntimeProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableTableInfoDeltaRuntimePropertiesKvpairsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableTableInfoDeltaRuntimePropertiesKvpairsArgs $;

        public Builder() {
            $ = new GetTableTableInfoDeltaRuntimePropertiesKvpairsArgs();
        }

        public Builder(GetTableTableInfoDeltaRuntimePropertiesKvpairsArgs defaults) {
            $ = new GetTableTableInfoDeltaRuntimePropertiesKvpairsArgs(Objects.requireNonNull(defaults));
        }

        public Builder deltaRuntimeProperties(Output<Map<String,Object>> deltaRuntimeProperties) {
            $.deltaRuntimeProperties = deltaRuntimeProperties;
            return this;
        }

        public Builder deltaRuntimeProperties(Map<String,Object> deltaRuntimeProperties) {
            return deltaRuntimeProperties(Output.of(deltaRuntimeProperties));
        }

        public GetTableTableInfoDeltaRuntimePropertiesKvpairsArgs build() {
            if ($.deltaRuntimeProperties == null) {
                throw new MissingRequiredPropertyException("GetTableTableInfoDeltaRuntimePropertiesKvpairsArgs", "deltaRuntimeProperties");
            }
            return $;
        }
    }

}
