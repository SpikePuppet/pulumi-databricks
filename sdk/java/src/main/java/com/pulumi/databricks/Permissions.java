// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.PermissionsArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.PermissionsState;
import com.pulumi.databricks.outputs.PermissionsAccessControl;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ### Import Example
 * 
 * Configuration file:
 * 
 * hcl
 * 
 * resource &#34;databricks_mlflow_model&#34; &#34;model&#34; {
 * 
 *   name        = &#34;example_model&#34;
 * 
 *   description = &#34;MLflow registered model&#34;
 * 
 * }
 * 
 * resource &#34;databricks_permissions&#34; &#34;model_usage&#34; {
 * 
 *   registered_model_id = databricks_mlflow_model.model.registered_model_id
 * 
 *   access_control {
 * 
 *     group_name       = &#34;users&#34;
 *     
 *     permission_level = &#34;CAN_READ&#34;
 * 
 *   }
 * 
 * }
 * 
 * Import command:
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/permissions:Permissions model_usage /registered-models/&lt;registered_model_id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/permissions:Permissions")
public class Permissions extends com.pulumi.resources.CustomResource {
    @Export(name="accessControls", refs={List.class,PermissionsAccessControl.class}, tree="[0,1]")
    private Output<List<PermissionsAccessControl>> accessControls;

    public Output<List<PermissionsAccessControl>> accessControls() {
        return this.accessControls;
    }
    @Export(name="authorization", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authorization;

    public Output<Optional<String>> authorization() {
        return Codegen.optional(this.authorization);
    }
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clusterId;

    public Output<Optional<String>> clusterId() {
        return Codegen.optional(this.clusterId);
    }
    @Export(name="clusterPolicyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clusterPolicyId;

    public Output<Optional<String>> clusterPolicyId() {
        return Codegen.optional(this.clusterPolicyId);
    }
    @Export(name="directoryId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> directoryId;

    public Output<Optional<String>> directoryId() {
        return Codegen.optional(this.directoryId);
    }
    @Export(name="directoryPath", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> directoryPath;

    public Output<Optional<String>> directoryPath() {
        return Codegen.optional(this.directoryPath);
    }
    @Export(name="experimentId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> experimentId;

    public Output<Optional<String>> experimentId() {
        return Codegen.optional(this.experimentId);
    }
    @Export(name="instancePoolId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instancePoolId;

    public Output<Optional<String>> instancePoolId() {
        return Codegen.optional(this.instancePoolId);
    }
    @Export(name="jobId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> jobId;

    public Output<Optional<String>> jobId() {
        return Codegen.optional(this.jobId);
    }
    @Export(name="notebookId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> notebookId;

    public Output<Optional<String>> notebookId() {
        return Codegen.optional(this.notebookId);
    }
    @Export(name="notebookPath", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> notebookPath;

    public Output<Optional<String>> notebookPath() {
        return Codegen.optional(this.notebookPath);
    }
    /**
     * type of permissions.
     * 
     */
    @Export(name="objectType", refs={String.class}, tree="[0]")
    private Output<String> objectType;

    /**
     * @return type of permissions.
     * 
     */
    public Output<String> objectType() {
        return this.objectType;
    }
    @Export(name="pipelineId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pipelineId;

    public Output<Optional<String>> pipelineId() {
        return Codegen.optional(this.pipelineId);
    }
    @Export(name="registeredModelId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> registeredModelId;

    public Output<Optional<String>> registeredModelId() {
        return Codegen.optional(this.registeredModelId);
    }
    @Export(name="repoId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> repoId;

    public Output<Optional<String>> repoId() {
        return Codegen.optional(this.repoId);
    }
    @Export(name="repoPath", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> repoPath;

    public Output<Optional<String>> repoPath() {
        return Codegen.optional(this.repoPath);
    }
    @Export(name="servingEndpointId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> servingEndpointId;

    public Output<Optional<String>> servingEndpointId() {
        return Codegen.optional(this.servingEndpointId);
    }
    @Export(name="sqlAlertId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sqlAlertId;

    public Output<Optional<String>> sqlAlertId() {
        return Codegen.optional(this.sqlAlertId);
    }
    @Export(name="sqlDashboardId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sqlDashboardId;

    public Output<Optional<String>> sqlDashboardId() {
        return Codegen.optional(this.sqlDashboardId);
    }
    @Export(name="sqlEndpointId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sqlEndpointId;

    public Output<Optional<String>> sqlEndpointId() {
        return Codegen.optional(this.sqlEndpointId);
    }
    @Export(name="sqlQueryId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sqlQueryId;

    public Output<Optional<String>> sqlQueryId() {
        return Codegen.optional(this.sqlQueryId);
    }
    @Export(name="workspaceFileId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> workspaceFileId;

    public Output<Optional<String>> workspaceFileId() {
        return Codegen.optional(this.workspaceFileId);
    }
    @Export(name="workspaceFilePath", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> workspaceFilePath;

    public Output<Optional<String>> workspaceFilePath() {
        return Codegen.optional(this.workspaceFilePath);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Permissions(String name) {
        this(name, PermissionsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Permissions(String name, PermissionsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Permissions(String name, PermissionsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/permissions:Permissions", name, args == null ? PermissionsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Permissions(String name, Output<String> id, @Nullable PermissionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/permissions:Permissions", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Permissions get(String name, Output<String> id, @Nullable PermissionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Permissions(name, id, state, options);
    }
}
