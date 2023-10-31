// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MwsPrivateAccessSettingsArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MwsPrivateAccessSettingsState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **Note** Initialize provider with `alias = &#34;mws&#34;`, `host  = &#34;https://accounts.cloud.databricks.com&#34;` and use `provider = databricks.mws` for all `databricks_mws_*` resources.
 * 
 * &gt; **Note** This resource has an evolving API, which will change in the upcoming versions of the provider in order to simplify user experience.
 * 
 * Allows you to create a [Private Access Setting]that can be used as part of a databricks.MwsWorkspaces resource to create a [Databricks Workspace that leverages AWS PrivateLink](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html) or [GCP Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html)
 * 
 * It is strongly recommended that customers read the [Enable AWS Private Link](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html) [Enable GCP Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html) documentation before trying to leverage this resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.MwsPrivateAccessSettings;
 * import com.pulumi.databricks.MwsPrivateAccessSettingsArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var pas = new MwsPrivateAccessSettings(&#34;pas&#34;, MwsPrivateAccessSettingsArgs.builder()        
 *             .accountId(var_.databricks_account_id())
 *             .privateAccessSettingsName(String.format(&#34;Private Access Settings for %s&#34;, local.prefix()))
 *             .region(var_.region())
 *             .publicAccessEnabled(true)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.mws())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * The `databricks_mws_private_access_settings.pas.private_access_settings_id` can then be used as part of a databricks.MwsWorkspaces resource:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.MwsWorkspaces;
 * import com.pulumi.databricks.MwsWorkspacesArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var this_ = new MwsWorkspaces(&#34;this&#34;, MwsWorkspacesArgs.builder()        
 *             .accountId(var_.databricks_account_id())
 *             .awsRegion(var_.region())
 *             .workspaceName(local.prefix())
 *             .credentialsId(databricks_mws_credentials.this().credentials_id())
 *             .storageConfigurationId(databricks_mws_storage_configurations.this().storage_configuration_id())
 *             .networkId(databricks_mws_networks.this().network_id())
 *             .privateAccessSettingsId(databricks_mws_private_access_settings.pas().private_access_settings_id())
 *             .pricingTier(&#34;ENTERPRISE&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.mws())
 *                 .dependsOn(databricks_mws_networks.this())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * or
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.MwsWorkspaces;
 * import com.pulumi.databricks.MwsWorkspacesArgs;
 * import com.pulumi.databricks.inputs.MwsWorkspacesCloudResourceContainerArgs;
 * import com.pulumi.databricks.inputs.MwsWorkspacesCloudResourceContainerGcpArgs;
 * import com.pulumi.databricks.inputs.MwsWorkspacesGkeConfigArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var this_ = new MwsWorkspaces(&#34;this&#34;, MwsWorkspacesArgs.builder()        
 *             .accountId(var_.databricks_account_id())
 *             .workspaceName(&#34;gcp-workspace&#34;)
 *             .location(var_.subnet_region())
 *             .cloudResourceContainer(MwsWorkspacesCloudResourceContainerArgs.builder()
 *                 .gcp(MwsWorkspacesCloudResourceContainerGcpArgs.builder()
 *                     .projectId(var_.google_project())
 *                     .build())
 *                 .build())
 *             .gkeConfig(MwsWorkspacesGkeConfigArgs.builder()
 *                 .connectivityType(&#34;PRIVATE_NODE_PUBLIC_MASTER&#34;)
 *                 .masterIpRange(&#34;10.3.0.0/28&#34;)
 *                 .build())
 *             .networkId(databricks_mws_networks.this().network_id())
 *             .privateAccessSettingsId(databricks_mws_private_access_settings.pas().private_access_settings_id())
 *             .pricingTier(&#34;PREMIUM&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.mws())
 *                 .dependsOn(databricks_mws_networks.this())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ## Related Resources
 * 
 * The following resources are used in the same context:
 * 
 * * Provisioning Databricks on AWS guide.
 * * Provisioning Databricks on AWS with PrivateLink guide.
 * * Provisioning AWS Databricks E2 with a Hub &amp; Spoke firewall for data exfiltration protection guide.
 * * Provisioning Databricks workspaces on GCP with Private Service Connect guide.
 * * databricks.MwsVpcEndpoint resources with Databricks such that they can be used as part of a databricks.MwsNetworks configuration.
 * * databricks.MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) &amp; subnets for new workspaces within AWS.
 * * databricks.MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
 * 
 * ## Import
 * 
 * -&gt; **Note** Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/mwsPrivateAccessSettings:MwsPrivateAccessSettings")
public class MwsPrivateAccessSettings extends com.pulumi.resources.CustomResource {
    /**
     * Account Id that could be found in the Accounts Console for [AWS](https://accounts.cloud.databricks.com/) or [GCP](https://accounts.gcp.databricks.com/)
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountId;

    /**
     * @return Account Id that could be found in the Accounts Console for [AWS](https://accounts.cloud.databricks.com/) or [GCP](https://accounts.gcp.databricks.com/)
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * An array of databricks.MwsVpcEndpoint `vpc_endpoint_id` (not `id`). Only used when `private_access_level` is set to `ENDPOINT`. This is an allow list of databricks.MwsVpcEndpoint that in your account that can connect to your databricks.MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `public_access_enabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
     * 
     */
    @Export(name="allowedVpcEndpointIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedVpcEndpointIds;

    /**
     * @return An array of databricks.MwsVpcEndpoint `vpc_endpoint_id` (not `id`). Only used when `private_access_level` is set to `ENDPOINT`. This is an allow list of databricks.MwsVpcEndpoint that in your account that can connect to your databricks.MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `public_access_enabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
     * 
     */
    public Output<Optional<List<String>>> allowedVpcEndpointIds() {
        return Codegen.optional(this.allowedVpcEndpointIds);
    }
    /**
     * The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only databricks.MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified databricks.MwsVpcEndpoint connect to your workspace. Please see the `allowed_vpc_endpoint_ids` documentation for more details.
     * 
     */
    @Export(name="privateAccessLevel", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateAccessLevel;

    /**
     * @return The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only databricks.MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified databricks.MwsVpcEndpoint connect to your workspace. Please see the `allowed_vpc_endpoint_ids` documentation for more details.
     * 
     */
    public Output<Optional<String>> privateAccessLevel() {
        return Codegen.optional(this.privateAccessLevel);
    }
    /**
     * Canonical unique identifier of Private Access Settings in Databricks Account
     * 
     */
    @Export(name="privateAccessSettingsId", refs={String.class}, tree="[0]")
    private Output<String> privateAccessSettingsId;

    /**
     * @return Canonical unique identifier of Private Access Settings in Databricks Account
     * 
     */
    public Output<String> privateAccessSettingsId() {
        return this.privateAccessSettingsId;
    }
    /**
     * Name of Private Access Settings in Databricks Account
     * 
     */
    @Export(name="privateAccessSettingsName", refs={String.class}, tree="[0]")
    private Output<String> privateAccessSettingsName;

    /**
     * @return Name of Private Access Settings in Databricks Account
     * 
     */
    public Output<String> privateAccessSettingsName() {
        return this.privateAccessSettingsName;
    }
    /**
     * If `true`, the databricks.MwsWorkspaces can be accessed over the databricks.MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an databricks.IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false`, the workspace can be accessed only over VPC endpoints, and not over the public network.
     * 
     */
    @Export(name="publicAccessEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> publicAccessEnabled;

    /**
     * @return If `true`, the databricks.MwsWorkspaces can be accessed over the databricks.MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an databricks.IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false`, the workspace can be accessed only over VPC endpoints, and not over the public network.
     * 
     */
    public Output<Optional<Boolean>> publicAccessEnabled() {
        return Codegen.optional(this.publicAccessEnabled);
    }
    /**
     * Region of AWS VPC or the Google Cloud VPC network
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Region of AWS VPC or the Google Cloud VPC network
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * (AWS only) Status of Private Access Settings
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return (AWS only) Status of Private Access Settings
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MwsPrivateAccessSettings(String name) {
        this(name, MwsPrivateAccessSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MwsPrivateAccessSettings(String name, MwsPrivateAccessSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MwsPrivateAccessSettings(String name, MwsPrivateAccessSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsPrivateAccessSettings:MwsPrivateAccessSettings", name, args == null ? MwsPrivateAccessSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MwsPrivateAccessSettings(String name, Output<String> id, @Nullable MwsPrivateAccessSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsPrivateAccessSettings:MwsPrivateAccessSettings", name, state, makeResourceOptions(options, id));
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
    public static MwsPrivateAccessSettings get(String name, Output<String> id, @Nullable MwsPrivateAccessSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MwsPrivateAccessSettings(name, id, state, options);
    }
}
