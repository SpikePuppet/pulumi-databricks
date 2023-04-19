// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobJobSettingsSettingsTaskSqlTaskFile {
    private String path;

    private GetJobJobSettingsSettingsTaskSqlTaskFile() {}
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskSqlTaskFile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String path;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskSqlTaskFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public GetJobJobSettingsSettingsTaskSqlTaskFile build() {
            final var o = new GetJobJobSettingsSettingsTaskSqlTaskFile();
            o.path = path;
            return o;
        }
    }
}