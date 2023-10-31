// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetSqlWarehouseTagsCustomTag;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSqlWarehouseTags {
    private List<GetSqlWarehouseTagsCustomTag> customTags;

    private GetSqlWarehouseTags() {}
    public List<GetSqlWarehouseTagsCustomTag> customTags() {
        return this.customTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlWarehouseTags defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetSqlWarehouseTagsCustomTag> customTags;
        public Builder() {}
        public Builder(GetSqlWarehouseTags defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customTags = defaults.customTags;
        }

        @CustomType.Setter
        public Builder customTags(List<GetSqlWarehouseTagsCustomTag> customTags) {
            this.customTags = Objects.requireNonNull(customTags);
            return this;
        }
        public Builder customTags(GetSqlWarehouseTagsCustomTag... customTags) {
            return customTags(List.of(customTags));
        }
        public GetSqlWarehouseTags build() {
            final var _resultValue = new GetSqlWarehouseTags();
            _resultValue.customTags = customTags;
            return _resultValue;
        }
    }
}
