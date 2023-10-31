// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsDeployment {
    private String kind;
    private @Nullable String metadataFilePath;

    private GetJobJobSettingsSettingsDeployment() {}
    public String kind() {
        return this.kind;
    }
    public Optional<String> metadataFilePath() {
        return Optional.ofNullable(this.metadataFilePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsDeployment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kind;
        private @Nullable String metadataFilePath;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsDeployment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.metadataFilePath = defaults.metadataFilePath;
        }

        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder metadataFilePath(@Nullable String metadataFilePath) {
            this.metadataFilePath = metadataFilePath;
            return this;
        }
        public GetJobJobSettingsSettingsDeployment build() {
            final var _resultValue = new GetJobJobSettingsSettingsDeployment();
            _resultValue.kind = kind;
            _resultValue.metadataFilePath = metadataFilePath;
            return _resultValue;
        }
    }
}
