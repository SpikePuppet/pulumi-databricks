// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.PipelineClusterAutoscale;
import com.pulumi.databricks.outputs.PipelineClusterAwsAttributes;
import com.pulumi.databricks.outputs.PipelineClusterAzureAttributes;
import com.pulumi.databricks.outputs.PipelineClusterClusterLogConf;
import com.pulumi.databricks.outputs.PipelineClusterGcpAttributes;
import com.pulumi.databricks.outputs.PipelineClusterInitScript;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineCluster {
    private @Nullable Boolean applyPolicyDefaultValues;
    private @Nullable PipelineClusterAutoscale autoscale;
    private @Nullable PipelineClusterAwsAttributes awsAttributes;
    private @Nullable PipelineClusterAzureAttributes azureAttributes;
    private @Nullable PipelineClusterClusterLogConf clusterLogConf;
    private @Nullable Map<String,Object> customTags;
    private @Nullable String driverInstancePoolId;
    private @Nullable String driverNodeTypeId;
    private @Nullable Boolean enableLocalDiskEncryption;
    private @Nullable PipelineClusterGcpAttributes gcpAttributes;
    private @Nullable List<PipelineClusterInitScript> initScripts;
    private @Nullable String instancePoolId;
    private @Nullable String label;
    private @Nullable String nodeTypeId;
    private @Nullable Integer numWorkers;
    private @Nullable String policyId;
    private @Nullable Map<String,Object> sparkConf;
    private @Nullable Map<String,Object> sparkEnvVars;
    private @Nullable List<String> sshPublicKeys;

    private PipelineCluster() {}
    public Optional<Boolean> applyPolicyDefaultValues() {
        return Optional.ofNullable(this.applyPolicyDefaultValues);
    }
    public Optional<PipelineClusterAutoscale> autoscale() {
        return Optional.ofNullable(this.autoscale);
    }
    public Optional<PipelineClusterAwsAttributes> awsAttributes() {
        return Optional.ofNullable(this.awsAttributes);
    }
    public Optional<PipelineClusterAzureAttributes> azureAttributes() {
        return Optional.ofNullable(this.azureAttributes);
    }
    public Optional<PipelineClusterClusterLogConf> clusterLogConf() {
        return Optional.ofNullable(this.clusterLogConf);
    }
    public Map<String,Object> customTags() {
        return this.customTags == null ? Map.of() : this.customTags;
    }
    public Optional<String> driverInstancePoolId() {
        return Optional.ofNullable(this.driverInstancePoolId);
    }
    public Optional<String> driverNodeTypeId() {
        return Optional.ofNullable(this.driverNodeTypeId);
    }
    public Optional<Boolean> enableLocalDiskEncryption() {
        return Optional.ofNullable(this.enableLocalDiskEncryption);
    }
    public Optional<PipelineClusterGcpAttributes> gcpAttributes() {
        return Optional.ofNullable(this.gcpAttributes);
    }
    public List<PipelineClusterInitScript> initScripts() {
        return this.initScripts == null ? List.of() : this.initScripts;
    }
    public Optional<String> instancePoolId() {
        return Optional.ofNullable(this.instancePoolId);
    }
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    public Optional<String> nodeTypeId() {
        return Optional.ofNullable(this.nodeTypeId);
    }
    public Optional<Integer> numWorkers() {
        return Optional.ofNullable(this.numWorkers);
    }
    public Optional<String> policyId() {
        return Optional.ofNullable(this.policyId);
    }
    public Map<String,Object> sparkConf() {
        return this.sparkConf == null ? Map.of() : this.sparkConf;
    }
    public Map<String,Object> sparkEnvVars() {
        return this.sparkEnvVars == null ? Map.of() : this.sparkEnvVars;
    }
    public List<String> sshPublicKeys() {
        return this.sshPublicKeys == null ? List.of() : this.sshPublicKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean applyPolicyDefaultValues;
        private @Nullable PipelineClusterAutoscale autoscale;
        private @Nullable PipelineClusterAwsAttributes awsAttributes;
        private @Nullable PipelineClusterAzureAttributes azureAttributes;
        private @Nullable PipelineClusterClusterLogConf clusterLogConf;
        private @Nullable Map<String,Object> customTags;
        private @Nullable String driverInstancePoolId;
        private @Nullable String driverNodeTypeId;
        private @Nullable Boolean enableLocalDiskEncryption;
        private @Nullable PipelineClusterGcpAttributes gcpAttributes;
        private @Nullable List<PipelineClusterInitScript> initScripts;
        private @Nullable String instancePoolId;
        private @Nullable String label;
        private @Nullable String nodeTypeId;
        private @Nullable Integer numWorkers;
        private @Nullable String policyId;
        private @Nullable Map<String,Object> sparkConf;
        private @Nullable Map<String,Object> sparkEnvVars;
        private @Nullable List<String> sshPublicKeys;
        public Builder() {}
        public Builder(PipelineCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyPolicyDefaultValues = defaults.applyPolicyDefaultValues;
    	      this.autoscale = defaults.autoscale;
    	      this.awsAttributes = defaults.awsAttributes;
    	      this.azureAttributes = defaults.azureAttributes;
    	      this.clusterLogConf = defaults.clusterLogConf;
    	      this.customTags = defaults.customTags;
    	      this.driverInstancePoolId = defaults.driverInstancePoolId;
    	      this.driverNodeTypeId = defaults.driverNodeTypeId;
    	      this.enableLocalDiskEncryption = defaults.enableLocalDiskEncryption;
    	      this.gcpAttributes = defaults.gcpAttributes;
    	      this.initScripts = defaults.initScripts;
    	      this.instancePoolId = defaults.instancePoolId;
    	      this.label = defaults.label;
    	      this.nodeTypeId = defaults.nodeTypeId;
    	      this.numWorkers = defaults.numWorkers;
    	      this.policyId = defaults.policyId;
    	      this.sparkConf = defaults.sparkConf;
    	      this.sparkEnvVars = defaults.sparkEnvVars;
    	      this.sshPublicKeys = defaults.sshPublicKeys;
        }

        @CustomType.Setter
        public Builder applyPolicyDefaultValues(@Nullable Boolean applyPolicyDefaultValues) {
            this.applyPolicyDefaultValues = applyPolicyDefaultValues;
            return this;
        }
        @CustomType.Setter
        public Builder autoscale(@Nullable PipelineClusterAutoscale autoscale) {
            this.autoscale = autoscale;
            return this;
        }
        @CustomType.Setter
        public Builder awsAttributes(@Nullable PipelineClusterAwsAttributes awsAttributes) {
            this.awsAttributes = awsAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder azureAttributes(@Nullable PipelineClusterAzureAttributes azureAttributes) {
            this.azureAttributes = azureAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder clusterLogConf(@Nullable PipelineClusterClusterLogConf clusterLogConf) {
            this.clusterLogConf = clusterLogConf;
            return this;
        }
        @CustomType.Setter
        public Builder customTags(@Nullable Map<String,Object> customTags) {
            this.customTags = customTags;
            return this;
        }
        @CustomType.Setter
        public Builder driverInstancePoolId(@Nullable String driverInstancePoolId) {
            this.driverInstancePoolId = driverInstancePoolId;
            return this;
        }
        @CustomType.Setter
        public Builder driverNodeTypeId(@Nullable String driverNodeTypeId) {
            this.driverNodeTypeId = driverNodeTypeId;
            return this;
        }
        @CustomType.Setter
        public Builder enableLocalDiskEncryption(@Nullable Boolean enableLocalDiskEncryption) {
            this.enableLocalDiskEncryption = enableLocalDiskEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder gcpAttributes(@Nullable PipelineClusterGcpAttributes gcpAttributes) {
            this.gcpAttributes = gcpAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder initScripts(@Nullable List<PipelineClusterInitScript> initScripts) {
            this.initScripts = initScripts;
            return this;
        }
        public Builder initScripts(PipelineClusterInitScript... initScripts) {
            return initScripts(List.of(initScripts));
        }
        @CustomType.Setter
        public Builder instancePoolId(@Nullable String instancePoolId) {
            this.instancePoolId = instancePoolId;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder nodeTypeId(@Nullable String nodeTypeId) {
            this.nodeTypeId = nodeTypeId;
            return this;
        }
        @CustomType.Setter
        public Builder numWorkers(@Nullable Integer numWorkers) {
            this.numWorkers = numWorkers;
            return this;
        }
        @CustomType.Setter
        public Builder policyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }
        @CustomType.Setter
        public Builder sparkConf(@Nullable Map<String,Object> sparkConf) {
            this.sparkConf = sparkConf;
            return this;
        }
        @CustomType.Setter
        public Builder sparkEnvVars(@Nullable Map<String,Object> sparkEnvVars) {
            this.sparkEnvVars = sparkEnvVars;
            return this;
        }
        @CustomType.Setter
        public Builder sshPublicKeys(@Nullable List<String> sshPublicKeys) {
            this.sshPublicKeys = sshPublicKeys;
            return this;
        }
        public Builder sshPublicKeys(String... sshPublicKeys) {
            return sshPublicKeys(List.of(sshPublicKeys));
        }
        public PipelineCluster build() {
            final var _resultValue = new PipelineCluster();
            _resultValue.applyPolicyDefaultValues = applyPolicyDefaultValues;
            _resultValue.autoscale = autoscale;
            _resultValue.awsAttributes = awsAttributes;
            _resultValue.azureAttributes = azureAttributes;
            _resultValue.clusterLogConf = clusterLogConf;
            _resultValue.customTags = customTags;
            _resultValue.driverInstancePoolId = driverInstancePoolId;
            _resultValue.driverNodeTypeId = driverNodeTypeId;
            _resultValue.enableLocalDiskEncryption = enableLocalDiskEncryption;
            _resultValue.gcpAttributes = gcpAttributes;
            _resultValue.initScripts = initScripts;
            _resultValue.instancePoolId = instancePoolId;
            _resultValue.label = label;
            _resultValue.nodeTypeId = nodeTypeId;
            _resultValue.numWorkers = numWorkers;
            _resultValue.policyId = policyId;
            _resultValue.sparkConf = sparkConf;
            _resultValue.sparkEnvVars = sparkEnvVars;
            _resultValue.sshPublicKeys = sshPublicKeys;
            return _resultValue;
        }
    }
}
