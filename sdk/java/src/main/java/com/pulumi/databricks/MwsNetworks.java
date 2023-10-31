// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MwsNetworksArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MwsNetworksState;
import com.pulumi.databricks.outputs.MwsNetworksErrorMessage;
import com.pulumi.databricks.outputs.MwsNetworksGcpNetworkInfo;
import com.pulumi.databricks.outputs.MwsNetworksVpcEndpoints;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Creating a Databricks on AWS workspace
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetAvailabilityZonesArgs;
 * import com.pulumi.databricks.MwsNetworks;
 * import com.pulumi.databricks.MwsNetworksArgs;
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
 *         final var config = ctx.config();
 *         final var databricksAccountId = config.get(&#34;databricksAccountId&#34;);
 *         final var available = AwsFunctions.getAvailabilityZones();
 * 
 *         var this_ = new MwsNetworks(&#34;this&#34;, MwsNetworksArgs.builder()        
 *             .accountId(databricksAccountId)
 *             .networkName(String.format(&#34;%s-network&#34;, local.prefix()))
 *             .securityGroupIds(module.vpc().default_security_group_id())
 *             .subnetIds(module.vpc().private_subnets())
 *             .vpcId(module.vpc().vpc_id())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.mws())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * In order to create a VPC [that leverages AWS PrivateLink](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html) you would need to add the `vpc_endpoint_id` Attributes from mws_vpc_endpoint resources into the databricks.MwsNetworks resource. For example:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.MwsNetworks;
 * import com.pulumi.databricks.MwsNetworksArgs;
 * import com.pulumi.databricks.inputs.MwsNetworksVpcEndpointsArgs;
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
 *         var this_ = new MwsNetworks(&#34;this&#34;, MwsNetworksArgs.builder()        
 *             .accountId(var_.databricks_account_id())
 *             .networkName(String.format(&#34;%s-network&#34;, local.prefix()))
 *             .securityGroupIds(module.vpc().default_security_group_id())
 *             .subnetIds(module.vpc().private_subnets())
 *             .vpcId(module.vpc().vpc_id())
 *             .vpcEndpoints(MwsNetworksVpcEndpointsArgs.builder()
 *                 .dataplaneRelays(databricks_mws_vpc_endpoint.relay().vpc_endpoint_id())
 *                 .restApis(databricks_mws_vpc_endpoint.workspace().vpc_endpoint_id())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.mws())
 *                 .dependsOn(                
 *                     aws_vpc_endpoint.workspace(),
 *                     aws_vpc_endpoint.relay())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Creating a Databricks on GCP workspace
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.google.google_compute_network;
 * import com.pulumi.google.Google_compute_networkArgs;
 * import com.pulumi.google.google_compute_subnetwork;
 * import com.pulumi.google.Google_compute_subnetworkArgs;
 * import com.pulumi.google.google_compute_router;
 * import com.pulumi.google.Google_compute_routerArgs;
 * import com.pulumi.google.google_compute_router_nat;
 * import com.pulumi.google.Google_compute_router_natArgs;
 * import com.pulumi.databricks.MwsNetworks;
 * import com.pulumi.databricks.MwsNetworksArgs;
 * import com.pulumi.databricks.inputs.MwsNetworksGcpNetworkInfoArgs;
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
 *         final var config = ctx.config();
 *         final var databricksAccountId = config.get(&#34;databricksAccountId&#34;);
 *         var dbxPrivateVpc = new Google_compute_network(&#34;dbxPrivateVpc&#34;, Google_compute_networkArgs.builder()        
 *             .project(var_.google_project())
 *             .name(String.format(&#34;tf-network-%s&#34;, random_string.suffix().result()))
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var network_with_private_secondary_ip_ranges = new Google_compute_subnetwork(&#34;network-with-private-secondary-ip-ranges&#34;, Google_compute_subnetworkArgs.builder()        
 *             .name(String.format(&#34;test-dbx-%s&#34;, random_string.suffix().result()))
 *             .ipCidrRange(&#34;10.0.0.0/16&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .network(dbxPrivateVpc.id())
 *             .secondaryIpRange(            
 *                 %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
 *                 %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *             .privateIpGoogleAccess(true)
 *             .build());
 * 
 *         var router = new Google_compute_router(&#34;router&#34;, Google_compute_routerArgs.builder()        
 *             .name(String.format(&#34;my-router-%s&#34;, random_string.suffix().result()))
 *             .region(network_with_private_secondary_ip_ranges.region())
 *             .network(dbxPrivateVpc.id())
 *             .build());
 * 
 *         var nat = new Google_compute_router_nat(&#34;nat&#34;, Google_compute_router_natArgs.builder()        
 *             .name(String.format(&#34;my-router-nat-%s&#34;, random_string.suffix().result()))
 *             .router(router.name())
 *             .region(router.region())
 *             .natIpAllocateOption(&#34;AUTO_ONLY&#34;)
 *             .sourceSubnetworkIpRangesToNat(&#34;ALL_SUBNETWORKS_ALL_IP_RANGES&#34;)
 *             .build());
 * 
 *         var this_ = new MwsNetworks(&#34;this&#34;, MwsNetworksArgs.builder()        
 *             .accountId(databricksAccountId)
 *             .networkName(String.format(&#34;test-demo-%s&#34;, random_string.suffix().result()))
 *             .gcpNetworkInfo(MwsNetworksGcpNetworkInfoArgs.builder()
 *                 .networkProjectId(var_.google_project())
 *                 .vpcId(dbxPrivateVpc.name())
 *                 .subnetId(google_compute_subnetwork.network_with_private_secondary_ip_ranges().name())
 *                 .subnetRegion(google_compute_subnetwork.network_with_private_secondary_ip_ranges().region())
 *                 .podIpRangeName(&#34;pods&#34;)
 *                 .serviceIpRangeName(&#34;svc&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * In order to create a VPC [that leverages GCP Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html) you would need to add the `vpc_endpoint_id` Attributes from mws_vpc_endpoint resources into the databricks.MwsNetworks resource. For example:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.MwsNetworks;
 * import com.pulumi.databricks.MwsNetworksArgs;
 * import com.pulumi.databricks.inputs.MwsNetworksGcpNetworkInfoArgs;
 * import com.pulumi.databricks.inputs.MwsNetworksVpcEndpointsArgs;
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
 *         var this_ = new MwsNetworks(&#34;this&#34;, MwsNetworksArgs.builder()        
 *             .accountId(var_.databricks_account_id())
 *             .networkName(String.format(&#34;test-demo-%s&#34;, random_string.suffix().result()))
 *             .gcpNetworkInfo(MwsNetworksGcpNetworkInfoArgs.builder()
 *                 .networkProjectId(var_.google_project())
 *                 .vpcId(google_compute_network.dbx_private_vpc().name())
 *                 .subnetId(google_compute_subnetwork.network_with_private_secondary_ip_ranges().name())
 *                 .subnetRegion(google_compute_subnetwork.network_with_private_secondary_ip_ranges().region())
 *                 .podIpRangeName(&#34;pods&#34;)
 *                 .serviceIpRangeName(&#34;svc&#34;)
 *                 .build())
 *             .vpcEndpoints(MwsNetworksVpcEndpointsArgs.builder()
 *                 .dataplaneRelays(databricks_mws_vpc_endpoint.relay().vpc_endpoint_id())
 *                 .restApis(databricks_mws_vpc_endpoint.workspace().vpc_endpoint_id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Modifying networks on running workspaces (AWS only)
 * 
 * Due to specifics of platform APIs, changing any attribute of network configuration would cause `databricks.MwsNetworks` to be re-created - deleted &amp; added again with special case for running workspaces. Once network configuration is attached to a running databricks_mws_workspaces, you cannot delete it and `pulumi up` would result in `INVALID_STATE: Unable to delete, Network is being used by active workspace X` error. In order to modify any attributes of a network, you have to perform three different `pulumi up` steps:
 * 
 * 1. Create a new `databricks.MwsNetworks` resource.
 * 2. Update the `databricks.MwsWorkspaces` to point to the new `network_id`.
 * 3. Delete the old `databricks.MwsNetworks` resource.
 * 
 * ## Related Resources
 * 
 * The following resources are used in the same context:
 * 
 * * Provisioning Databricks on AWS guide.
 * * Provisioning Databricks on AWS with PrivateLink guide.
 * * Provisioning AWS Databricks E2 with a Hub &amp; Spoke firewall for data exfiltration protection guide.
 * * Provisioning Databricks on GCP guide.
 * * Provisioning Databricks workspaces on GCP with Private Service Connect guide.
 * * databricks.MwsVpcEndpoint resources with Databricks such that they can be used as part of a databricks.MwsNetworks configuration.
 * * databricks.MwsPrivateAccessSettings to create a Private Access Setting that can be used as part of a databricks.MwsWorkspaces resource to create a [Databricks Workspace that leverages AWS PrivateLink](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html) or [GCP Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html).
 * * databricks.MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
 * 
 * ## Import
 * 
 * -&gt; **Note** Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/mwsNetworks:MwsNetworks")
public class MwsNetworks extends com.pulumi.resources.CustomResource {
    /**
     * Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    @Export(name="creationTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> creationTime;

    public Output<Integer> creationTime() {
        return this.creationTime;
    }
    @Export(name="errorMessages", refs={List.class,MwsNetworksErrorMessage.class}, tree="[0,1]")
    private Output<List<MwsNetworksErrorMessage>> errorMessages;

    public Output<List<MwsNetworksErrorMessage>> errorMessages() {
        return this.errorMessages;
    }
    /**
     * a block consists of Google Cloud specific information for this network, for example the VPC ID, subnet ID, and secondary IP ranges. It has the following fields:
     * 
     */
    @Export(name="gcpNetworkInfo", refs={MwsNetworksGcpNetworkInfo.class}, tree="[0]")
    private Output</* @Nullable */ MwsNetworksGcpNetworkInfo> gcpNetworkInfo;

    /**
     * @return a block consists of Google Cloud specific information for this network, for example the VPC ID, subnet ID, and secondary IP ranges. It has the following fields:
     * 
     */
    public Output<Optional<MwsNetworksGcpNetworkInfo>> gcpNetworkInfo() {
        return Codegen.optional(this.gcpNetworkInfo);
    }
    /**
     * (String) id of network to be used for databricks.MwsWorkspaces resource.
     * 
     */
    @Export(name="networkId", refs={String.class}, tree="[0]")
    private Output<String> networkId;

    /**
     * @return (String) id of network to be used for databricks.MwsWorkspaces resource.
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }
    /**
     * name under which this network is registered
     * 
     */
    @Export(name="networkName", refs={String.class}, tree="[0]")
    private Output<String> networkName;

    /**
     * @return name under which this network is registered
     * 
     */
    public Output<String> networkName() {
        return this.networkName;
    }
    /**
     * ids of aws_security_group
     * 
     */
    @Export(name="securityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> securityGroupIds;

    /**
     * @return ids of aws_security_group
     * 
     */
    public Output<Optional<List<String>>> securityGroupIds() {
        return Codegen.optional(this.securityGroupIds);
    }
    /**
     * ids of aws_subnet
     * 
     */
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> subnetIds;

    /**
     * @return ids of aws_subnet
     * 
     */
    public Output<Optional<List<String>>> subnetIds() {
        return Codegen.optional(this.subnetIds);
    }
    /**
     * mapping of databricks.MwsVpcEndpoint for PrivateLink or Private Service Connect connections
     * 
     */
    @Export(name="vpcEndpoints", refs={MwsNetworksVpcEndpoints.class}, tree="[0]")
    private Output<MwsNetworksVpcEndpoints> vpcEndpoints;

    /**
     * @return mapping of databricks.MwsVpcEndpoint for PrivateLink or Private Service Connect connections
     * 
     */
    public Output<MwsNetworksVpcEndpoints> vpcEndpoints() {
        return this.vpcEndpoints;
    }
    /**
     * The ID of the VPC associated with this network. VPC IDs can be used in multiple network configurations.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vpcId;

    /**
     * @return The ID of the VPC associated with this network. VPC IDs can be used in multiple network configurations.
     * 
     */
    public Output<Optional<String>> vpcId() {
        return Codegen.optional(this.vpcId);
    }
    /**
     * (String) VPC attachment status
     * 
     */
    @Export(name="vpcStatus", refs={String.class}, tree="[0]")
    private Output<String> vpcStatus;

    /**
     * @return (String) VPC attachment status
     * 
     */
    public Output<String> vpcStatus() {
        return this.vpcStatus;
    }
    /**
     * (Integer) id of associated workspace
     * 
     */
    @Export(name="workspaceId", refs={Integer.class}, tree="[0]")
    private Output<Integer> workspaceId;

    /**
     * @return (Integer) id of associated workspace
     * 
     */
    public Output<Integer> workspaceId() {
        return this.workspaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MwsNetworks(String name) {
        this(name, MwsNetworksArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MwsNetworks(String name, MwsNetworksArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MwsNetworks(String name, MwsNetworksArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsNetworks:MwsNetworks", name, args == null ? MwsNetworksArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MwsNetworks(String name, Output<String> id, @Nullable MwsNetworksState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsNetworks:MwsNetworks", name, state, makeResourceOptions(options, id));
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
    public static MwsNetworks get(String name, Output<String> id, @Nullable MwsNetworksState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MwsNetworks(name, id, state, options);
    }
}
