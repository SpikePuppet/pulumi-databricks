// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.PermissionsAccessControlArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PermissionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PermissionsArgs Empty = new PermissionsArgs();

    @Import(name="accessControls", required=true)
    private Output<List<PermissionsAccessControlArgs>> accessControls;

    public Output<List<PermissionsAccessControlArgs>> accessControls() {
        return this.accessControls;
    }

    @Import(name="authorization")
    private @Nullable Output<String> authorization;

    public Optional<Output<String>> authorization() {
        return Optional.ofNullable(this.authorization);
    }

    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    @Import(name="clusterPolicyId")
    private @Nullable Output<String> clusterPolicyId;

    public Optional<Output<String>> clusterPolicyId() {
        return Optional.ofNullable(this.clusterPolicyId);
    }

    @Import(name="directoryId")
    private @Nullable Output<String> directoryId;

    public Optional<Output<String>> directoryId() {
        return Optional.ofNullable(this.directoryId);
    }

    @Import(name="directoryPath")
    private @Nullable Output<String> directoryPath;

    public Optional<Output<String>> directoryPath() {
        return Optional.ofNullable(this.directoryPath);
    }

    @Import(name="experimentId")
    private @Nullable Output<String> experimentId;

    public Optional<Output<String>> experimentId() {
        return Optional.ofNullable(this.experimentId);
    }

    @Import(name="instancePoolId")
    private @Nullable Output<String> instancePoolId;

    public Optional<Output<String>> instancePoolId() {
        return Optional.ofNullable(this.instancePoolId);
    }

    @Import(name="jobId")
    private @Nullable Output<String> jobId;

    public Optional<Output<String>> jobId() {
        return Optional.ofNullable(this.jobId);
    }

    @Import(name="notebookId")
    private @Nullable Output<String> notebookId;

    public Optional<Output<String>> notebookId() {
        return Optional.ofNullable(this.notebookId);
    }

    @Import(name="notebookPath")
    private @Nullable Output<String> notebookPath;

    public Optional<Output<String>> notebookPath() {
        return Optional.ofNullable(this.notebookPath);
    }

    /**
     * type of permissions.
     * 
     */
    @Import(name="objectType")
    private @Nullable Output<String> objectType;

    /**
     * @return type of permissions.
     * 
     */
    public Optional<Output<String>> objectType() {
        return Optional.ofNullable(this.objectType);
    }

    @Import(name="pipelineId")
    private @Nullable Output<String> pipelineId;

    public Optional<Output<String>> pipelineId() {
        return Optional.ofNullable(this.pipelineId);
    }

    @Import(name="registeredModelId")
    private @Nullable Output<String> registeredModelId;

    public Optional<Output<String>> registeredModelId() {
        return Optional.ofNullable(this.registeredModelId);
    }

    @Import(name="repoId")
    private @Nullable Output<String> repoId;

    public Optional<Output<String>> repoId() {
        return Optional.ofNullable(this.repoId);
    }

    @Import(name="repoPath")
    private @Nullable Output<String> repoPath;

    public Optional<Output<String>> repoPath() {
        return Optional.ofNullable(this.repoPath);
    }

    @Import(name="servingEndpointId")
    private @Nullable Output<String> servingEndpointId;

    public Optional<Output<String>> servingEndpointId() {
        return Optional.ofNullable(this.servingEndpointId);
    }

    @Import(name="sqlAlertId")
    private @Nullable Output<String> sqlAlertId;

    public Optional<Output<String>> sqlAlertId() {
        return Optional.ofNullable(this.sqlAlertId);
    }

    @Import(name="sqlDashboardId")
    private @Nullable Output<String> sqlDashboardId;

    public Optional<Output<String>> sqlDashboardId() {
        return Optional.ofNullable(this.sqlDashboardId);
    }

    @Import(name="sqlEndpointId")
    private @Nullable Output<String> sqlEndpointId;

    public Optional<Output<String>> sqlEndpointId() {
        return Optional.ofNullable(this.sqlEndpointId);
    }

    @Import(name="sqlQueryId")
    private @Nullable Output<String> sqlQueryId;

    public Optional<Output<String>> sqlQueryId() {
        return Optional.ofNullable(this.sqlQueryId);
    }

    @Import(name="workspaceFileId")
    private @Nullable Output<String> workspaceFileId;

    public Optional<Output<String>> workspaceFileId() {
        return Optional.ofNullable(this.workspaceFileId);
    }

    @Import(name="workspaceFilePath")
    private @Nullable Output<String> workspaceFilePath;

    public Optional<Output<String>> workspaceFilePath() {
        return Optional.ofNullable(this.workspaceFilePath);
    }

    private PermissionsArgs() {}

    private PermissionsArgs(PermissionsArgs $) {
        this.accessControls = $.accessControls;
        this.authorization = $.authorization;
        this.clusterId = $.clusterId;
        this.clusterPolicyId = $.clusterPolicyId;
        this.directoryId = $.directoryId;
        this.directoryPath = $.directoryPath;
        this.experimentId = $.experimentId;
        this.instancePoolId = $.instancePoolId;
        this.jobId = $.jobId;
        this.notebookId = $.notebookId;
        this.notebookPath = $.notebookPath;
        this.objectType = $.objectType;
        this.pipelineId = $.pipelineId;
        this.registeredModelId = $.registeredModelId;
        this.repoId = $.repoId;
        this.repoPath = $.repoPath;
        this.servingEndpointId = $.servingEndpointId;
        this.sqlAlertId = $.sqlAlertId;
        this.sqlDashboardId = $.sqlDashboardId;
        this.sqlEndpointId = $.sqlEndpointId;
        this.sqlQueryId = $.sqlQueryId;
        this.workspaceFileId = $.workspaceFileId;
        this.workspaceFilePath = $.workspaceFilePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PermissionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PermissionsArgs $;

        public Builder() {
            $ = new PermissionsArgs();
        }

        public Builder(PermissionsArgs defaults) {
            $ = new PermissionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessControls(Output<List<PermissionsAccessControlArgs>> accessControls) {
            $.accessControls = accessControls;
            return this;
        }

        public Builder accessControls(List<PermissionsAccessControlArgs> accessControls) {
            return accessControls(Output.of(accessControls));
        }

        public Builder accessControls(PermissionsAccessControlArgs... accessControls) {
            return accessControls(List.of(accessControls));
        }

        public Builder authorization(@Nullable Output<String> authorization) {
            $.authorization = authorization;
            return this;
        }

        public Builder authorization(String authorization) {
            return authorization(Output.of(authorization));
        }

        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        public Builder clusterPolicyId(@Nullable Output<String> clusterPolicyId) {
            $.clusterPolicyId = clusterPolicyId;
            return this;
        }

        public Builder clusterPolicyId(String clusterPolicyId) {
            return clusterPolicyId(Output.of(clusterPolicyId));
        }

        public Builder directoryId(@Nullable Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        public Builder directoryPath(@Nullable Output<String> directoryPath) {
            $.directoryPath = directoryPath;
            return this;
        }

        public Builder directoryPath(String directoryPath) {
            return directoryPath(Output.of(directoryPath));
        }

        public Builder experimentId(@Nullable Output<String> experimentId) {
            $.experimentId = experimentId;
            return this;
        }

        public Builder experimentId(String experimentId) {
            return experimentId(Output.of(experimentId));
        }

        public Builder instancePoolId(@Nullable Output<String> instancePoolId) {
            $.instancePoolId = instancePoolId;
            return this;
        }

        public Builder instancePoolId(String instancePoolId) {
            return instancePoolId(Output.of(instancePoolId));
        }

        public Builder jobId(@Nullable Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
        }

        public Builder notebookId(@Nullable Output<String> notebookId) {
            $.notebookId = notebookId;
            return this;
        }

        public Builder notebookId(String notebookId) {
            return notebookId(Output.of(notebookId));
        }

        public Builder notebookPath(@Nullable Output<String> notebookPath) {
            $.notebookPath = notebookPath;
            return this;
        }

        public Builder notebookPath(String notebookPath) {
            return notebookPath(Output.of(notebookPath));
        }

        /**
         * @param objectType type of permissions.
         * 
         * @return builder
         * 
         */
        public Builder objectType(@Nullable Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param objectType type of permissions.
         * 
         * @return builder
         * 
         */
        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        public Builder pipelineId(@Nullable Output<String> pipelineId) {
            $.pipelineId = pipelineId;
            return this;
        }

        public Builder pipelineId(String pipelineId) {
            return pipelineId(Output.of(pipelineId));
        }

        public Builder registeredModelId(@Nullable Output<String> registeredModelId) {
            $.registeredModelId = registeredModelId;
            return this;
        }

        public Builder registeredModelId(String registeredModelId) {
            return registeredModelId(Output.of(registeredModelId));
        }

        public Builder repoId(@Nullable Output<String> repoId) {
            $.repoId = repoId;
            return this;
        }

        public Builder repoId(String repoId) {
            return repoId(Output.of(repoId));
        }

        public Builder repoPath(@Nullable Output<String> repoPath) {
            $.repoPath = repoPath;
            return this;
        }

        public Builder repoPath(String repoPath) {
            return repoPath(Output.of(repoPath));
        }

        public Builder servingEndpointId(@Nullable Output<String> servingEndpointId) {
            $.servingEndpointId = servingEndpointId;
            return this;
        }

        public Builder servingEndpointId(String servingEndpointId) {
            return servingEndpointId(Output.of(servingEndpointId));
        }

        public Builder sqlAlertId(@Nullable Output<String> sqlAlertId) {
            $.sqlAlertId = sqlAlertId;
            return this;
        }

        public Builder sqlAlertId(String sqlAlertId) {
            return sqlAlertId(Output.of(sqlAlertId));
        }

        public Builder sqlDashboardId(@Nullable Output<String> sqlDashboardId) {
            $.sqlDashboardId = sqlDashboardId;
            return this;
        }

        public Builder sqlDashboardId(String sqlDashboardId) {
            return sqlDashboardId(Output.of(sqlDashboardId));
        }

        public Builder sqlEndpointId(@Nullable Output<String> sqlEndpointId) {
            $.sqlEndpointId = sqlEndpointId;
            return this;
        }

        public Builder sqlEndpointId(String sqlEndpointId) {
            return sqlEndpointId(Output.of(sqlEndpointId));
        }

        public Builder sqlQueryId(@Nullable Output<String> sqlQueryId) {
            $.sqlQueryId = sqlQueryId;
            return this;
        }

        public Builder sqlQueryId(String sqlQueryId) {
            return sqlQueryId(Output.of(sqlQueryId));
        }

        public Builder workspaceFileId(@Nullable Output<String> workspaceFileId) {
            $.workspaceFileId = workspaceFileId;
            return this;
        }

        public Builder workspaceFileId(String workspaceFileId) {
            return workspaceFileId(Output.of(workspaceFileId));
        }

        public Builder workspaceFilePath(@Nullable Output<String> workspaceFilePath) {
            $.workspaceFilePath = workspaceFilePath;
            return this;
        }

        public Builder workspaceFilePath(String workspaceFilePath) {
            return workspaceFilePath(Output.of(workspaceFilePath));
        }

        public PermissionsArgs build() {
            if ($.accessControls == null) {
                throw new MissingRequiredPropertyException("PermissionsArgs", "accessControls");
            }
            return $;
        }
    }

}
