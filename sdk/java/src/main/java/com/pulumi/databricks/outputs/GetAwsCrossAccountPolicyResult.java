// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAwsCrossAccountPolicyResult {
    private @Nullable String awsAccountId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return AWS IAM Policy JSON document
     * 
     */
    private String json;
    private @Nullable List<String> passRoles;
    private @Nullable String policyType;
    private @Nullable String region;
    private @Nullable String securityGroupId;
    private @Nullable String vpcId;

    private GetAwsCrossAccountPolicyResult() {}
    public Optional<String> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return AWS IAM Policy JSON document
     * 
     */
    public String json() {
        return this.json;
    }
    public List<String> passRoles() {
        return this.passRoles == null ? List.of() : this.passRoles;
    }
    public Optional<String> policyType() {
        return Optional.ofNullable(this.policyType);
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public Optional<String> securityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAwsCrossAccountPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String awsAccountId;
        private String id;
        private String json;
        private @Nullable List<String> passRoles;
        private @Nullable String policyType;
        private @Nullable String region;
        private @Nullable String securityGroupId;
        private @Nullable String vpcId;
        public Builder() {}
        public Builder(GetAwsCrossAccountPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.id = defaults.id;
    	      this.json = defaults.json;
    	      this.passRoles = defaults.passRoles;
    	      this.policyType = defaults.policyType;
    	      this.region = defaults.region;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder awsAccountId(@Nullable String awsAccountId) {

            this.awsAccountId = awsAccountId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAwsCrossAccountPolicyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder json(String json) {
            if (json == null) {
              throw new MissingRequiredPropertyException("GetAwsCrossAccountPolicyResult", "json");
            }
            this.json = json;
            return this;
        }
        @CustomType.Setter
        public Builder passRoles(@Nullable List<String> passRoles) {

            this.passRoles = passRoles;
            return this;
        }
        public Builder passRoles(String... passRoles) {
            return passRoles(List.of(passRoles));
        }
        @CustomType.Setter
        public Builder policyType(@Nullable String policyType) {

            this.policyType = policyType;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupId(@Nullable String securityGroupId) {

            this.securityGroupId = securityGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(@Nullable String vpcId) {

            this.vpcId = vpcId;
            return this;
        }
        public GetAwsCrossAccountPolicyResult build() {
            final var _resultValue = new GetAwsCrossAccountPolicyResult();
            _resultValue.awsAccountId = awsAccountId;
            _resultValue.id = id;
            _resultValue.json = json;
            _resultValue.passRoles = passRoles;
            _resultValue.policyType = policyType;
            _resultValue.region = region;
            _resultValue.securityGroupId = securityGroupId;
            _resultValue.vpcId = vpcId;
            return _resultValue;
        }
    }
}
