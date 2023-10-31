// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServicePrincipalsResult {
    /**
     * @return List of `application_ids` of service principals Individual service principal can be retrieved using databricks.ServicePrincipal data source
     * 
     */
    private List<String> applicationIds;
    private String displayNameContains;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetServicePrincipalsResult() {}
    /**
     * @return List of `application_ids` of service principals Individual service principal can be retrieved using databricks.ServicePrincipal data source
     * 
     */
    public List<String> applicationIds() {
        return this.applicationIds;
    }
    public String displayNameContains() {
        return this.displayNameContains;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServicePrincipalsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> applicationIds;
        private String displayNameContains;
        private String id;
        public Builder() {}
        public Builder(GetServicePrincipalsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationIds = defaults.applicationIds;
    	      this.displayNameContains = defaults.displayNameContains;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder applicationIds(List<String> applicationIds) {
            this.applicationIds = Objects.requireNonNull(applicationIds);
            return this;
        }
        public Builder applicationIds(String... applicationIds) {
            return applicationIds(List.of(applicationIds));
        }
        @CustomType.Setter
        public Builder displayNameContains(String displayNameContains) {
            this.displayNameContains = Objects.requireNonNull(displayNameContains);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetServicePrincipalsResult build() {
            final var _resultValue = new GetServicePrincipalsResult();
            _resultValue.applicationIds = applicationIds;
            _resultValue.displayNameContains = displayNameContains;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
