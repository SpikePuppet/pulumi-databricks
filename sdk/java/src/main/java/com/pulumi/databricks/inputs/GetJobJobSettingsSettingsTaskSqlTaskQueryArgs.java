// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskSqlTaskQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskSqlTaskQueryArgs Empty = new GetJobJobSettingsSettingsTaskSqlTaskQueryArgs();

    @Import(name="queryId", required=true)
    private Output<String> queryId;

    public Output<String> queryId() {
        return this.queryId;
    }

    private GetJobJobSettingsSettingsTaskSqlTaskQueryArgs() {}

    private GetJobJobSettingsSettingsTaskSqlTaskQueryArgs(GetJobJobSettingsSettingsTaskSqlTaskQueryArgs $) {
        this.queryId = $.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskSqlTaskQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskSqlTaskQueryArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskSqlTaskQueryArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskSqlTaskQueryArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskSqlTaskQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder queryId(Output<String> queryId) {
            $.queryId = queryId;
            return this;
        }

        public Builder queryId(String queryId) {
            return queryId(Output.of(queryId));
        }

        public GetJobJobSettingsSettingsTaskSqlTaskQueryArgs build() {
            if ($.queryId == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskSqlTaskQueryArgs", "queryId");
            }
            return $;
        }
    }

}
