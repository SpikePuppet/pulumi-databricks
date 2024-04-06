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
 * ## Databricks on AWS usage
 * 
 * &gt; **Note** Initialize provider with `alias = &#34;mws&#34;`, `host  = &#34;https://accounts.cloud.databricks.com&#34;` and use `provider = databricks.mws`
 * 
 * Use this resource to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) &amp; subnets for new workspaces within AWS. It is essential to understand that this will require you to configure your provider separately for the multiple workspaces resources.
 * 
 * * Databricks must have access to at least two subnets for each workspace, with each subnet in a different Availability Zone. You cannot specify more than one Databricks workspace subnet per Availability Zone in the Create network configuration API call. You can have more than one subnet per Availability Zone as part of your network setup, but you can choose only one subnet per Availability Zone for the Databricks workspace.
 * * Databricks assigns two IP addresses per node, one for management traffic and one for Spark applications. The total number of instances for each subnet is equal to half of the available IP addresses.
 * * Each subnet must have a netmask between /17 and /25.
 * * Subnets must be private.
 * * Subnets must have outbound access to the public network using a aws_nat_gateway, or other similar customer-managed appliance infrastructure.
 * * The NAT gateway must be set up in its subnet (public_subnets in the example below) that routes quad-zero (0.0.0.0/0) traffic to an internet gateway or other customer-managed appliance infrastructure.
 * 
 * &gt; **Note** The NAT gateway needs only one IP address per AZ. Hence, the public subnet only needs two IP addresses. In order to limit the number of IP addresses in the public subnet, you can specify a secondary CIDR block (cidr_block_public) using the argument secondary_cidr_blocks then pass it to the public_subnets argument. Please review the [IPv4 CIDR block association restrictions](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) when choosing the secondary cidr block.
 * 
 * Please follow this complete runnable example &amp; subnet for new workspaces within GCP. It is essential to understand that this will require you to configure your provider separately for the multiple workspaces resources.
 * 
 * * Databricks must have access to a subnet in the same region as the workspace, of which IP range will be used to allocate your workspace’s GKE cluster nodes.
 * * The subnet must have a netmask between /29 and /9.
 * * Databricks must have access to 2 secondary IP ranges, one between /21 to /9 for workspace’s GKE cluster pods, and one between /27 to /16 for workspace’s GKE cluster services.
 * * Subnet must have outbound access to the public network using a gcp_compute_router_nat or other similar customer-managed appliance infrastructure.
 * 
 * Please follow this complete runnable example]
 *   private_subnets = [cidrsubnet(var.cidr_block, 3, 1),
 *   cidrsubnet(var.cidr_block, 3, 2)]
 * 
 *   default_security_group_egress = [{
 *     cidr_blocks = &#34;0.0.0.0/0&#34;
 *   }]
 * 
 *   default_security_group_ingress = [{
 *     description = &#34;Allow all internal TCP and UDP&#34;
 *     self        = true
 *   }]
 * }
 * 
 * resource &#34;databricks.MwsNetworks&#34; &#34;this&#34; {
 *   provider           = databricks.mws
 *   account_id         = var.databricks_account_id
 *   network_name       = &#34;${local.prefix}-network&#34;
 *   security_group_ids = [module.vpc.default_security_group_id]
 *   subnet_ids         = module.vpc.private_subnets
 *   vpc_id             = module.vpc.vpc_id
 * }
 * 
 * ### Creating a Databricks on GCP workspace
 * 
 * In order to create a VPC [that leverages GCP Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html) you would need to add the `vpc_endpoint_id` Attributes from mws_vpc_endpoint resources into the databricks.MwsNetworks resource. For example:
 * 
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
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
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
