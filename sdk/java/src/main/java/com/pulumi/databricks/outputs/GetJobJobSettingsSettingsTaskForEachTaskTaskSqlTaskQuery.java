// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery {
    private String queryId;

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery() {}
    public String queryId() {
        return this.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String queryId;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryId = defaults.queryId;
        }

        @CustomType.Setter
        public Builder queryId(String queryId) {
            if (queryId == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery", "queryId");
            }
            this.queryId = queryId;
            return this;
        }
        public GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery();
            _resultValue.queryId = queryId;
            return _resultValue;
        }
    }
}
