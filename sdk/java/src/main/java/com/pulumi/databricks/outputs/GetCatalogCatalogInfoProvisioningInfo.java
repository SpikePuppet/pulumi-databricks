// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCatalogCatalogInfoProvisioningInfo {
    private @Nullable String state;

    private GetCatalogCatalogInfoProvisioningInfo() {}
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCatalogCatalogInfoProvisioningInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String state;
        public Builder() {}
        public Builder(GetCatalogCatalogInfoProvisioningInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder state(@Nullable String state) {

            this.state = state;
            return this;
        }
        public GetCatalogCatalogInfoProvisioningInfo build() {
            final var _resultValue = new GetCatalogCatalogInfoProvisioningInfo();
            _resultValue.state = state;
            return _resultValue;
        }
    }
}
