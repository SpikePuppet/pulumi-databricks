// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetOnDemandOption;
import com.pulumi.databricks.outputs.GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption;
import com.pulumi.databricks.outputs.GetInstancePoolPoolInfoInstancePoolFleetAttributeLaunchTemplateOverride;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstancePoolPoolInfoInstancePoolFleetAttribute {
    private @Nullable GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetOnDemandOption fleetOnDemandOption;
    private @Nullable GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption fleetSpotOption;
    private List<GetInstancePoolPoolInfoInstancePoolFleetAttributeLaunchTemplateOverride> launchTemplateOverrides;

    private GetInstancePoolPoolInfoInstancePoolFleetAttribute() {}
    public Optional<GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetOnDemandOption> fleetOnDemandOption() {
        return Optional.ofNullable(this.fleetOnDemandOption);
    }
    public Optional<GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption> fleetSpotOption() {
        return Optional.ofNullable(this.fleetSpotOption);
    }
    public List<GetInstancePoolPoolInfoInstancePoolFleetAttributeLaunchTemplateOverride> launchTemplateOverrides() {
        return this.launchTemplateOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancePoolPoolInfoInstancePoolFleetAttribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetOnDemandOption fleetOnDemandOption;
        private @Nullable GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption fleetSpotOption;
        private List<GetInstancePoolPoolInfoInstancePoolFleetAttributeLaunchTemplateOverride> launchTemplateOverrides;
        public Builder() {}
        public Builder(GetInstancePoolPoolInfoInstancePoolFleetAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetOnDemandOption = defaults.fleetOnDemandOption;
    	      this.fleetSpotOption = defaults.fleetSpotOption;
    	      this.launchTemplateOverrides = defaults.launchTemplateOverrides;
        }

        @CustomType.Setter
        public Builder fleetOnDemandOption(@Nullable GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetOnDemandOption fleetOnDemandOption) {

            this.fleetOnDemandOption = fleetOnDemandOption;
            return this;
        }
        @CustomType.Setter
        public Builder fleetSpotOption(@Nullable GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption fleetSpotOption) {

            this.fleetSpotOption = fleetSpotOption;
            return this;
        }
        @CustomType.Setter
        public Builder launchTemplateOverrides(List<GetInstancePoolPoolInfoInstancePoolFleetAttributeLaunchTemplateOverride> launchTemplateOverrides) {
            if (launchTemplateOverrides == null) {
              throw new MissingRequiredPropertyException("GetInstancePoolPoolInfoInstancePoolFleetAttribute", "launchTemplateOverrides");
            }
            this.launchTemplateOverrides = launchTemplateOverrides;
            return this;
        }
        public Builder launchTemplateOverrides(GetInstancePoolPoolInfoInstancePoolFleetAttributeLaunchTemplateOverride... launchTemplateOverrides) {
            return launchTemplateOverrides(List.of(launchTemplateOverrides));
        }
        public GetInstancePoolPoolInfoInstancePoolFleetAttribute build() {
            final var _resultValue = new GetInstancePoolPoolInfoInstancePoolFleetAttribute();
            _resultValue.fleetOnDemandOption = fleetOnDemandOption;
            _resultValue.fleetSpotOption = fleetSpotOption;
            _resultValue.launchTemplateOverrides = launchTemplateOverrides;
            return _resultValue;
        }
    }
}
