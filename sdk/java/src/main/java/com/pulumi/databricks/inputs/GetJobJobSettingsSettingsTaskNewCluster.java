// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterAutoscale;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterAwsAttributes;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterAzureAttributes;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterClusterLogConf;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterDockerImage;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterGcpAttributes;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterInitScript;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterWorkloadType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskNewCluster extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskNewCluster Empty = new GetJobJobSettingsSettingsTaskNewCluster();

    @Import(name="applyPolicyDefaultValues")
    private @Nullable Boolean applyPolicyDefaultValues;

    public Optional<Boolean> applyPolicyDefaultValues() {
        return Optional.ofNullable(this.applyPolicyDefaultValues);
    }

    @Import(name="autoscale")
    private @Nullable GetJobJobSettingsSettingsTaskNewClusterAutoscale autoscale;

    public Optional<GetJobJobSettingsSettingsTaskNewClusterAutoscale> autoscale() {
        return Optional.ofNullable(this.autoscale);
    }

    @Import(name="autoterminationMinutes")
    private @Nullable Integer autoterminationMinutes;

    public Optional<Integer> autoterminationMinutes() {
        return Optional.ofNullable(this.autoterminationMinutes);
    }

    @Import(name="awsAttributes")
    private @Nullable GetJobJobSettingsSettingsTaskNewClusterAwsAttributes awsAttributes;

    public Optional<GetJobJobSettingsSettingsTaskNewClusterAwsAttributes> awsAttributes() {
        return Optional.ofNullable(this.awsAttributes);
    }

    @Import(name="azureAttributes")
    private @Nullable GetJobJobSettingsSettingsTaskNewClusterAzureAttributes azureAttributes;

    public Optional<GetJobJobSettingsSettingsTaskNewClusterAzureAttributes> azureAttributes() {
        return Optional.ofNullable(this.azureAttributes);
    }

    @Import(name="clusterId")
    private @Nullable String clusterId;

    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    @Import(name="clusterLogConf")
    private @Nullable GetJobJobSettingsSettingsTaskNewClusterClusterLogConf clusterLogConf;

    public Optional<GetJobJobSettingsSettingsTaskNewClusterClusterLogConf> clusterLogConf() {
        return Optional.ofNullable(this.clusterLogConf);
    }

    @Import(name="clusterMountInfos")
    private @Nullable List<GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo> clusterMountInfos;

    public Optional<List<GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo>> clusterMountInfos() {
        return Optional.ofNullable(this.clusterMountInfos);
    }

    @Import(name="clusterName")
    private @Nullable String clusterName;

    public Optional<String> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    @Import(name="customTags")
    private @Nullable Map<String,Object> customTags;

    public Optional<Map<String,Object>> customTags() {
        return Optional.ofNullable(this.customTags);
    }

    @Import(name="dataSecurityMode")
    private @Nullable String dataSecurityMode;

    public Optional<String> dataSecurityMode() {
        return Optional.ofNullable(this.dataSecurityMode);
    }

    @Import(name="dockerImage")
    private @Nullable GetJobJobSettingsSettingsTaskNewClusterDockerImage dockerImage;

    public Optional<GetJobJobSettingsSettingsTaskNewClusterDockerImage> dockerImage() {
        return Optional.ofNullable(this.dockerImage);
    }

    @Import(name="driverInstancePoolId", required=true)
    private String driverInstancePoolId;

    public String driverInstancePoolId() {
        return this.driverInstancePoolId;
    }

    @Import(name="driverNodeTypeId", required=true)
    private String driverNodeTypeId;

    public String driverNodeTypeId() {
        return this.driverNodeTypeId;
    }

    @Import(name="enableElasticDisk", required=true)
    private Boolean enableElasticDisk;

    public Boolean enableElasticDisk() {
        return this.enableElasticDisk;
    }

    @Import(name="enableLocalDiskEncryption", required=true)
    private Boolean enableLocalDiskEncryption;

    public Boolean enableLocalDiskEncryption() {
        return this.enableLocalDiskEncryption;
    }

    @Import(name="gcpAttributes")
    private @Nullable GetJobJobSettingsSettingsTaskNewClusterGcpAttributes gcpAttributes;

    public Optional<GetJobJobSettingsSettingsTaskNewClusterGcpAttributes> gcpAttributes() {
        return Optional.ofNullable(this.gcpAttributes);
    }

    @Import(name="idempotencyToken")
    private @Nullable String idempotencyToken;

    public Optional<String> idempotencyToken() {
        return Optional.ofNullable(this.idempotencyToken);
    }

    @Import(name="initScripts")
    private @Nullable List<GetJobJobSettingsSettingsTaskNewClusterInitScript> initScripts;

    public Optional<List<GetJobJobSettingsSettingsTaskNewClusterInitScript>> initScripts() {
        return Optional.ofNullable(this.initScripts);
    }

    @Import(name="instancePoolId")
    private @Nullable String instancePoolId;

    public Optional<String> instancePoolId() {
        return Optional.ofNullable(this.instancePoolId);
    }

    @Import(name="nodeTypeId", required=true)
    private String nodeTypeId;

    public String nodeTypeId() {
        return this.nodeTypeId;
    }

    @Import(name="numWorkers", required=true)
    private Integer numWorkers;

    public Integer numWorkers() {
        return this.numWorkers;
    }

    @Import(name="policyId")
    private @Nullable String policyId;

    public Optional<String> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    @Import(name="runtimeEngine")
    private @Nullable String runtimeEngine;

    public Optional<String> runtimeEngine() {
        return Optional.ofNullable(this.runtimeEngine);
    }

    @Import(name="singleUserName")
    private @Nullable String singleUserName;

    public Optional<String> singleUserName() {
        return Optional.ofNullable(this.singleUserName);
    }

    @Import(name="sparkConf")
    private @Nullable Map<String,Object> sparkConf;

    public Optional<Map<String,Object>> sparkConf() {
        return Optional.ofNullable(this.sparkConf);
    }

    @Import(name="sparkEnvVars")
    private @Nullable Map<String,Object> sparkEnvVars;

    public Optional<Map<String,Object>> sparkEnvVars() {
        return Optional.ofNullable(this.sparkEnvVars);
    }

    @Import(name="sparkVersion", required=true)
    private String sparkVersion;

    public String sparkVersion() {
        return this.sparkVersion;
    }

    @Import(name="sshPublicKeys")
    private @Nullable List<String> sshPublicKeys;

    public Optional<List<String>> sshPublicKeys() {
        return Optional.ofNullable(this.sshPublicKeys);
    }

    @Import(name="workloadType")
    private @Nullable GetJobJobSettingsSettingsTaskNewClusterWorkloadType workloadType;

    public Optional<GetJobJobSettingsSettingsTaskNewClusterWorkloadType> workloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    private GetJobJobSettingsSettingsTaskNewCluster() {}

    private GetJobJobSettingsSettingsTaskNewCluster(GetJobJobSettingsSettingsTaskNewCluster $) {
        this.applyPolicyDefaultValues = $.applyPolicyDefaultValues;
        this.autoscale = $.autoscale;
        this.autoterminationMinutes = $.autoterminationMinutes;
        this.awsAttributes = $.awsAttributes;
        this.azureAttributes = $.azureAttributes;
        this.clusterId = $.clusterId;
        this.clusterLogConf = $.clusterLogConf;
        this.clusterMountInfos = $.clusterMountInfos;
        this.clusterName = $.clusterName;
        this.customTags = $.customTags;
        this.dataSecurityMode = $.dataSecurityMode;
        this.dockerImage = $.dockerImage;
        this.driverInstancePoolId = $.driverInstancePoolId;
        this.driverNodeTypeId = $.driverNodeTypeId;
        this.enableElasticDisk = $.enableElasticDisk;
        this.enableLocalDiskEncryption = $.enableLocalDiskEncryption;
        this.gcpAttributes = $.gcpAttributes;
        this.idempotencyToken = $.idempotencyToken;
        this.initScripts = $.initScripts;
        this.instancePoolId = $.instancePoolId;
        this.nodeTypeId = $.nodeTypeId;
        this.numWorkers = $.numWorkers;
        this.policyId = $.policyId;
        this.runtimeEngine = $.runtimeEngine;
        this.singleUserName = $.singleUserName;
        this.sparkConf = $.sparkConf;
        this.sparkEnvVars = $.sparkEnvVars;
        this.sparkVersion = $.sparkVersion;
        this.sshPublicKeys = $.sshPublicKeys;
        this.workloadType = $.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskNewCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskNewCluster $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskNewCluster();
        }

        public Builder(GetJobJobSettingsSettingsTaskNewCluster defaults) {
            $ = new GetJobJobSettingsSettingsTaskNewCluster(Objects.requireNonNull(defaults));
        }

        public Builder applyPolicyDefaultValues(@Nullable Boolean applyPolicyDefaultValues) {
            $.applyPolicyDefaultValues = applyPolicyDefaultValues;
            return this;
        }

        public Builder autoscale(@Nullable GetJobJobSettingsSettingsTaskNewClusterAutoscale autoscale) {
            $.autoscale = autoscale;
            return this;
        }

        public Builder autoterminationMinutes(@Nullable Integer autoterminationMinutes) {
            $.autoterminationMinutes = autoterminationMinutes;
            return this;
        }

        public Builder awsAttributes(@Nullable GetJobJobSettingsSettingsTaskNewClusterAwsAttributes awsAttributes) {
            $.awsAttributes = awsAttributes;
            return this;
        }

        public Builder azureAttributes(@Nullable GetJobJobSettingsSettingsTaskNewClusterAzureAttributes azureAttributes) {
            $.azureAttributes = azureAttributes;
            return this;
        }

        public Builder clusterId(@Nullable String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder clusterLogConf(@Nullable GetJobJobSettingsSettingsTaskNewClusterClusterLogConf clusterLogConf) {
            $.clusterLogConf = clusterLogConf;
            return this;
        }

        public Builder clusterMountInfos(@Nullable List<GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo> clusterMountInfos) {
            $.clusterMountInfos = clusterMountInfos;
            return this;
        }

        public Builder clusterMountInfos(GetJobJobSettingsSettingsTaskNewClusterClusterMountInfo... clusterMountInfos) {
            return clusterMountInfos(List.of(clusterMountInfos));
        }

        public Builder clusterName(@Nullable String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder customTags(@Nullable Map<String,Object> customTags) {
            $.customTags = customTags;
            return this;
        }

        public Builder dataSecurityMode(@Nullable String dataSecurityMode) {
            $.dataSecurityMode = dataSecurityMode;
            return this;
        }

        public Builder dockerImage(@Nullable GetJobJobSettingsSettingsTaskNewClusterDockerImage dockerImage) {
            $.dockerImage = dockerImage;
            return this;
        }

        public Builder driverInstancePoolId(String driverInstancePoolId) {
            $.driverInstancePoolId = driverInstancePoolId;
            return this;
        }

        public Builder driverNodeTypeId(String driverNodeTypeId) {
            $.driverNodeTypeId = driverNodeTypeId;
            return this;
        }

        public Builder enableElasticDisk(Boolean enableElasticDisk) {
            $.enableElasticDisk = enableElasticDisk;
            return this;
        }

        public Builder enableLocalDiskEncryption(Boolean enableLocalDiskEncryption) {
            $.enableLocalDiskEncryption = enableLocalDiskEncryption;
            return this;
        }

        public Builder gcpAttributes(@Nullable GetJobJobSettingsSettingsTaskNewClusterGcpAttributes gcpAttributes) {
            $.gcpAttributes = gcpAttributes;
            return this;
        }

        public Builder idempotencyToken(@Nullable String idempotencyToken) {
            $.idempotencyToken = idempotencyToken;
            return this;
        }

        public Builder initScripts(@Nullable List<GetJobJobSettingsSettingsTaskNewClusterInitScript> initScripts) {
            $.initScripts = initScripts;
            return this;
        }

        public Builder initScripts(GetJobJobSettingsSettingsTaskNewClusterInitScript... initScripts) {
            return initScripts(List.of(initScripts));
        }

        public Builder instancePoolId(@Nullable String instancePoolId) {
            $.instancePoolId = instancePoolId;
            return this;
        }

        public Builder nodeTypeId(String nodeTypeId) {
            $.nodeTypeId = nodeTypeId;
            return this;
        }

        public Builder numWorkers(Integer numWorkers) {
            $.numWorkers = numWorkers;
            return this;
        }

        public Builder policyId(@Nullable String policyId) {
            $.policyId = policyId;
            return this;
        }

        public Builder runtimeEngine(@Nullable String runtimeEngine) {
            $.runtimeEngine = runtimeEngine;
            return this;
        }

        public Builder singleUserName(@Nullable String singleUserName) {
            $.singleUserName = singleUserName;
            return this;
        }

        public Builder sparkConf(@Nullable Map<String,Object> sparkConf) {
            $.sparkConf = sparkConf;
            return this;
        }

        public Builder sparkEnvVars(@Nullable Map<String,Object> sparkEnvVars) {
            $.sparkEnvVars = sparkEnvVars;
            return this;
        }

        public Builder sparkVersion(String sparkVersion) {
            $.sparkVersion = sparkVersion;
            return this;
        }

        public Builder sshPublicKeys(@Nullable List<String> sshPublicKeys) {
            $.sshPublicKeys = sshPublicKeys;
            return this;
        }

        public Builder sshPublicKeys(String... sshPublicKeys) {
            return sshPublicKeys(List.of(sshPublicKeys));
        }

        public Builder workloadType(@Nullable GetJobJobSettingsSettingsTaskNewClusterWorkloadType workloadType) {
            $.workloadType = workloadType;
            return this;
        }

        public GetJobJobSettingsSettingsTaskNewCluster build() {
            if ($.driverInstancePoolId == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskNewCluster", "driverInstancePoolId");
            }
            if ($.driverNodeTypeId == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskNewCluster", "driverNodeTypeId");
            }
            if ($.enableElasticDisk == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskNewCluster", "enableElasticDisk");
            }
            if ($.enableLocalDiskEncryption == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskNewCluster", "enableLocalDiskEncryption");
            }
            if ($.nodeTypeId == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskNewCluster", "nodeTypeId");
            }
            if ($.numWorkers == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskNewCluster", "numWorkers");
            }
            if ($.sparkVersion == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskNewCluster", "sparkVersion");
            }
            return $;
        }
    }

}
