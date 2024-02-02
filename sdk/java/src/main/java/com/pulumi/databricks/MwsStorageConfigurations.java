// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MwsStorageConfigurationsArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MwsStorageConfigurationsState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * &gt; **Note** Initialize provider with `alias = &#34;mws&#34;`, `host  = &#34;https://accounts.cloud.databricks.com&#34;` and use `provider = databricks.mws`
 * 
 * This resource to configure root bucket new workspaces within AWS.
 * 
 * It is important to understand that this will require you to configure your provider separately for the multiple workspaces resources. This will point to &lt;https://accounts.cloud.databricks.com&gt; for the HOST and it will use basic auth as that is the only authentication method available for multiple workspaces api.
 * 
 * Please follow this complete runnable example
 * * `storage_configuration_name` - name under which this storage configuration is stored
 * 
 * ## Related Resources
 * 
 * The following resources are used in the same context:
 * 
 * * Provisioning Databricks on AWS guide.
 * * Provisioning Databricks on AWS with PrivateLink guide.
 * * databricks.MwsCredentials to configure the cross-account role for creation of new workspaces within AWS.
 * * databricks.MwsCustomerManagedKeys to configure KMS keys for new workspaces within AWS.
 * * databricks.MwsLogDelivery to configure delivery of [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
 * * databricks.MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) &amp; subnets for new workspaces within AWS.
 * * databricks.MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
 * 
 * ## Import
 * 
 * -&gt; **Note** Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/mwsStorageConfigurations:MwsStorageConfigurations")
public class MwsStorageConfigurations extends com.pulumi.resources.CustomResource {
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }
    @Export(name="bucketName", refs={String.class}, tree="[0]")
    private Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }
    @Export(name="creationTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> creationTime;

    public Output<Integer> creationTime() {
        return this.creationTime;
    }
    /**
     * (String) id of storage config to be used for `databricks_mws_workspace` resource.
     * 
     */
    @Export(name="storageConfigurationId", refs={String.class}, tree="[0]")
    private Output<String> storageConfigurationId;

    /**
     * @return (String) id of storage config to be used for `databricks_mws_workspace` resource.
     * 
     */
    public Output<String> storageConfigurationId() {
        return this.storageConfigurationId;
    }
    @Export(name="storageConfigurationName", refs={String.class}, tree="[0]")
    private Output<String> storageConfigurationName;

    public Output<String> storageConfigurationName() {
        return this.storageConfigurationName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MwsStorageConfigurations(String name) {
        this(name, MwsStorageConfigurationsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MwsStorageConfigurations(String name, MwsStorageConfigurationsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MwsStorageConfigurations(String name, MwsStorageConfigurationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsStorageConfigurations:MwsStorageConfigurations", name, args == null ? MwsStorageConfigurationsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MwsStorageConfigurations(String name, Output<String> id, @Nullable MwsStorageConfigurationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsStorageConfigurations:MwsStorageConfigurations", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "accountId"
            ))
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
    public static MwsStorageConfigurations get(String name, Output<String> id, @Nullable MwsStorageConfigurationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MwsStorageConfigurations(name, id, state, options);
    }
}
