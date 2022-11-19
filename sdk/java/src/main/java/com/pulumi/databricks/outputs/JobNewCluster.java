// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobNewClusterAutoscale;
import com.pulumi.databricks.outputs.JobNewClusterAwsAttributes;
import com.pulumi.databricks.outputs.JobNewClusterAzureAttributes;
import com.pulumi.databricks.outputs.JobNewClusterClusterLogConf;
import com.pulumi.databricks.outputs.JobNewClusterDockerImage;
import com.pulumi.databricks.outputs.JobNewClusterGcpAttributes;
import com.pulumi.databricks.outputs.JobNewClusterInitScript;
import com.pulumi.databricks.outputs.JobNewClusterWorkloadType;
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
public final class JobNewCluster {
    private @Nullable Boolean applyPolicyDefaultValues;
    private @Nullable JobNewClusterAutoscale autoscale;
    private @Nullable Integer autoterminationMinutes;
    private @Nullable JobNewClusterAwsAttributes awsAttributes;
    private @Nullable JobNewClusterAzureAttributes azureAttributes;
    private @Nullable String clusterId;
    private @Nullable JobNewClusterClusterLogConf clusterLogConf;
    private @Nullable String clusterName;
    private @Nullable Map<String,Object> customTags;
    private @Nullable String dataSecurityMode;
    private @Nullable JobNewClusterDockerImage dockerImage;
    private @Nullable String driverInstancePoolId;
    private @Nullable String driverNodeTypeId;
    private @Nullable Boolean enableElasticDisk;
    private @Nullable Boolean enableLocalDiskEncryption;
    private @Nullable JobNewClusterGcpAttributes gcpAttributes;
    private @Nullable String idempotencyToken;
    private @Nullable List<JobNewClusterInitScript> initScripts;
    private @Nullable String instancePoolId;
    private @Nullable String nodeTypeId;
    private @Nullable Integer numWorkers;
    private @Nullable String policyId;
    private @Nullable String singleUserName;
    private @Nullable Map<String,Object> sparkConf;
    private @Nullable Map<String,Object> sparkEnvVars;
    private String sparkVersion;
    private @Nullable List<String> sshPublicKeys;
    private @Nullable JobNewClusterWorkloadType workloadType;

    private JobNewCluster() {}
    public Optional<Boolean> applyPolicyDefaultValues() {
        return Optional.ofNullable(this.applyPolicyDefaultValues);
    }
    public Optional<JobNewClusterAutoscale> autoscale() {
        return Optional.ofNullable(this.autoscale);
    }
    public Optional<Integer> autoterminationMinutes() {
        return Optional.ofNullable(this.autoterminationMinutes);
    }
    public Optional<JobNewClusterAwsAttributes> awsAttributes() {
        return Optional.ofNullable(this.awsAttributes);
    }
    public Optional<JobNewClusterAzureAttributes> azureAttributes() {
        return Optional.ofNullable(this.azureAttributes);
    }
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    public Optional<JobNewClusterClusterLogConf> clusterLogConf() {
        return Optional.ofNullable(this.clusterLogConf);
    }
    public Optional<String> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }
    public Map<String,Object> customTags() {
        return this.customTags == null ? Map.of() : this.customTags;
    }
    public Optional<String> dataSecurityMode() {
        return Optional.ofNullable(this.dataSecurityMode);
    }
    public Optional<JobNewClusterDockerImage> dockerImage() {
        return Optional.ofNullable(this.dockerImage);
    }
    public Optional<String> driverInstancePoolId() {
        return Optional.ofNullable(this.driverInstancePoolId);
    }
    public Optional<String> driverNodeTypeId() {
        return Optional.ofNullable(this.driverNodeTypeId);
    }
    public Optional<Boolean> enableElasticDisk() {
        return Optional.ofNullable(this.enableElasticDisk);
    }
    public Optional<Boolean> enableLocalDiskEncryption() {
        return Optional.ofNullable(this.enableLocalDiskEncryption);
    }
    public Optional<JobNewClusterGcpAttributes> gcpAttributes() {
        return Optional.ofNullable(this.gcpAttributes);
    }
    public Optional<String> idempotencyToken() {
        return Optional.ofNullable(this.idempotencyToken);
    }
    public List<JobNewClusterInitScript> initScripts() {
        return this.initScripts == null ? List.of() : this.initScripts;
    }
    public Optional<String> instancePoolId() {
        return Optional.ofNullable(this.instancePoolId);
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
    public Optional<String> singleUserName() {
        return Optional.ofNullable(this.singleUserName);
    }
    public Map<String,Object> sparkConf() {
        return this.sparkConf == null ? Map.of() : this.sparkConf;
    }
    public Map<String,Object> sparkEnvVars() {
        return this.sparkEnvVars == null ? Map.of() : this.sparkEnvVars;
    }
    public String sparkVersion() {
        return this.sparkVersion;
    }
    public List<String> sshPublicKeys() {
        return this.sshPublicKeys == null ? List.of() : this.sshPublicKeys;
    }
    public Optional<JobNewClusterWorkloadType> workloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobNewCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean applyPolicyDefaultValues;
        private @Nullable JobNewClusterAutoscale autoscale;
        private @Nullable Integer autoterminationMinutes;
        private @Nullable JobNewClusterAwsAttributes awsAttributes;
        private @Nullable JobNewClusterAzureAttributes azureAttributes;
        private @Nullable String clusterId;
        private @Nullable JobNewClusterClusterLogConf clusterLogConf;
        private @Nullable String clusterName;
        private @Nullable Map<String,Object> customTags;
        private @Nullable String dataSecurityMode;
        private @Nullable JobNewClusterDockerImage dockerImage;
        private @Nullable String driverInstancePoolId;
        private @Nullable String driverNodeTypeId;
        private @Nullable Boolean enableElasticDisk;
        private @Nullable Boolean enableLocalDiskEncryption;
        private @Nullable JobNewClusterGcpAttributes gcpAttributes;
        private @Nullable String idempotencyToken;
        private @Nullable List<JobNewClusterInitScript> initScripts;
        private @Nullable String instancePoolId;
        private @Nullable String nodeTypeId;
        private @Nullable Integer numWorkers;
        private @Nullable String policyId;
        private @Nullable String singleUserName;
        private @Nullable Map<String,Object> sparkConf;
        private @Nullable Map<String,Object> sparkEnvVars;
        private String sparkVersion;
        private @Nullable List<String> sshPublicKeys;
        private @Nullable JobNewClusterWorkloadType workloadType;
        public Builder() {}
        public Builder(JobNewCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyPolicyDefaultValues = defaults.applyPolicyDefaultValues;
    	      this.autoscale = defaults.autoscale;
    	      this.autoterminationMinutes = defaults.autoterminationMinutes;
    	      this.awsAttributes = defaults.awsAttributes;
    	      this.azureAttributes = defaults.azureAttributes;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterLogConf = defaults.clusterLogConf;
    	      this.clusterName = defaults.clusterName;
    	      this.customTags = defaults.customTags;
    	      this.dataSecurityMode = defaults.dataSecurityMode;
    	      this.dockerImage = defaults.dockerImage;
    	      this.driverInstancePoolId = defaults.driverInstancePoolId;
    	      this.driverNodeTypeId = defaults.driverNodeTypeId;
    	      this.enableElasticDisk = defaults.enableElasticDisk;
    	      this.enableLocalDiskEncryption = defaults.enableLocalDiskEncryption;
    	      this.gcpAttributes = defaults.gcpAttributes;
    	      this.idempotencyToken = defaults.idempotencyToken;
    	      this.initScripts = defaults.initScripts;
    	      this.instancePoolId = defaults.instancePoolId;
    	      this.nodeTypeId = defaults.nodeTypeId;
    	      this.numWorkers = defaults.numWorkers;
    	      this.policyId = defaults.policyId;
    	      this.singleUserName = defaults.singleUserName;
    	      this.sparkConf = defaults.sparkConf;
    	      this.sparkEnvVars = defaults.sparkEnvVars;
    	      this.sparkVersion = defaults.sparkVersion;
    	      this.sshPublicKeys = defaults.sshPublicKeys;
    	      this.workloadType = defaults.workloadType;
        }

        @CustomType.Setter
        public Builder applyPolicyDefaultValues(@Nullable Boolean applyPolicyDefaultValues) {
            this.applyPolicyDefaultValues = applyPolicyDefaultValues;
            return this;
        }
        @CustomType.Setter
        public Builder autoscale(@Nullable JobNewClusterAutoscale autoscale) {
            this.autoscale = autoscale;
            return this;
        }
        @CustomType.Setter
        public Builder autoterminationMinutes(@Nullable Integer autoterminationMinutes) {
            this.autoterminationMinutes = autoterminationMinutes;
            return this;
        }
        @CustomType.Setter
        public Builder awsAttributes(@Nullable JobNewClusterAwsAttributes awsAttributes) {
            this.awsAttributes = awsAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder azureAttributes(@Nullable JobNewClusterAzureAttributes azureAttributes) {
            this.azureAttributes = azureAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(@Nullable String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder clusterLogConf(@Nullable JobNewClusterClusterLogConf clusterLogConf) {
            this.clusterLogConf = clusterLogConf;
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder customTags(@Nullable Map<String,Object> customTags) {
            this.customTags = customTags;
            return this;
        }
        @CustomType.Setter
        public Builder dataSecurityMode(@Nullable String dataSecurityMode) {
            this.dataSecurityMode = dataSecurityMode;
            return this;
        }
        @CustomType.Setter
        public Builder dockerImage(@Nullable JobNewClusterDockerImage dockerImage) {
            this.dockerImage = dockerImage;
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
        public Builder enableElasticDisk(@Nullable Boolean enableElasticDisk) {
            this.enableElasticDisk = enableElasticDisk;
            return this;
        }
        @CustomType.Setter
        public Builder enableLocalDiskEncryption(@Nullable Boolean enableLocalDiskEncryption) {
            this.enableLocalDiskEncryption = enableLocalDiskEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder gcpAttributes(@Nullable JobNewClusterGcpAttributes gcpAttributes) {
            this.gcpAttributes = gcpAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder idempotencyToken(@Nullable String idempotencyToken) {
            this.idempotencyToken = idempotencyToken;
            return this;
        }
        @CustomType.Setter
        public Builder initScripts(@Nullable List<JobNewClusterInitScript> initScripts) {
            this.initScripts = initScripts;
            return this;
        }
        public Builder initScripts(JobNewClusterInitScript... initScripts) {
            return initScripts(List.of(initScripts));
        }
        @CustomType.Setter
        public Builder instancePoolId(@Nullable String instancePoolId) {
            this.instancePoolId = instancePoolId;
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
        public Builder singleUserName(@Nullable String singleUserName) {
            this.singleUserName = singleUserName;
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
        public Builder sparkVersion(String sparkVersion) {
            this.sparkVersion = Objects.requireNonNull(sparkVersion);
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
        @CustomType.Setter
        public Builder workloadType(@Nullable JobNewClusterWorkloadType workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public JobNewCluster build() {
            final var o = new JobNewCluster();
            o.applyPolicyDefaultValues = applyPolicyDefaultValues;
            o.autoscale = autoscale;
            o.autoterminationMinutes = autoterminationMinutes;
            o.awsAttributes = awsAttributes;
            o.azureAttributes = azureAttributes;
            o.clusterId = clusterId;
            o.clusterLogConf = clusterLogConf;
            o.clusterName = clusterName;
            o.customTags = customTags;
            o.dataSecurityMode = dataSecurityMode;
            o.dockerImage = dockerImage;
            o.driverInstancePoolId = driverInstancePoolId;
            o.driverNodeTypeId = driverNodeTypeId;
            o.enableElasticDisk = enableElasticDisk;
            o.enableLocalDiskEncryption = enableLocalDiskEncryption;
            o.gcpAttributes = gcpAttributes;
            o.idempotencyToken = idempotencyToken;
            o.initScripts = initScripts;
            o.instancePoolId = instancePoolId;
            o.nodeTypeId = nodeTypeId;
            o.numWorkers = numWorkers;
            o.policyId = policyId;
            o.singleUserName = singleUserName;
            o.sparkConf = sparkConf;
            o.sparkEnvVars = sparkEnvVars;
            o.sparkVersion = sparkVersion;
            o.sshPublicKeys = sshPublicKeys;
            o.workloadType = workloadType;
            return o;
        }
    }
}