// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.MwsNetworksErrorMessageArgs;
import com.pulumi.databricks.inputs.MwsNetworksGcpNetworkInfoArgs;
import com.pulumi.databricks.inputs.MwsNetworksVpcEndpointsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MwsNetworksState extends com.pulumi.resources.ResourceArgs {

    public static final MwsNetworksState Empty = new MwsNetworksState();

    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    @Import(name="creationTime")
    private @Nullable Output<Integer> creationTime;

    public Optional<Output<Integer>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    @Import(name="errorMessages")
    private @Nullable Output<List<MwsNetworksErrorMessageArgs>> errorMessages;

    public Optional<Output<List<MwsNetworksErrorMessageArgs>>> errorMessages() {
        return Optional.ofNullable(this.errorMessages);
    }

    /**
     * a block consists of Google Cloud specific information for this network, for example the VPC ID, subnet ID, and secondary IP ranges. It has the following fields:
     * 
     */
    @Import(name="gcpNetworkInfo")
    private @Nullable Output<MwsNetworksGcpNetworkInfoArgs> gcpNetworkInfo;

    /**
     * @return a block consists of Google Cloud specific information for this network, for example the VPC ID, subnet ID, and secondary IP ranges. It has the following fields:
     * 
     */
    public Optional<Output<MwsNetworksGcpNetworkInfoArgs>> gcpNetworkInfo() {
        return Optional.ofNullable(this.gcpNetworkInfo);
    }

    /**
     * (String) id of network to be used for databricks.MwsWorkspaces resource.
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return (String) id of network to be used for databricks.MwsWorkspaces resource.
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * name under which this network is registered
     * 
     */
    @Import(name="networkName")
    private @Nullable Output<String> networkName;

    /**
     * @return name under which this network is registered
     * 
     */
    public Optional<Output<String>> networkName() {
        return Optional.ofNullable(this.networkName);
    }

    /**
     * ids of aws_security_group
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return ids of aws_security_group
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * ids of aws_subnet
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    /**
     * @return ids of aws_subnet
     * 
     */
    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    /**
     * mapping of databricks.MwsVpcEndpoint for PrivateLink or Private Service Connect connections
     * 
     */
    @Import(name="vpcEndpoints")
    private @Nullable Output<MwsNetworksVpcEndpointsArgs> vpcEndpoints;

    /**
     * @return mapping of databricks.MwsVpcEndpoint for PrivateLink or Private Service Connect connections
     * 
     */
    public Optional<Output<MwsNetworksVpcEndpointsArgs>> vpcEndpoints() {
        return Optional.ofNullable(this.vpcEndpoints);
    }

    /**
     * aws_vpc id
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return aws_vpc id
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * (String) VPC attachment status
     * 
     */
    @Import(name="vpcStatus")
    private @Nullable Output<String> vpcStatus;

    /**
     * @return (String) VPC attachment status
     * 
     */
    public Optional<Output<String>> vpcStatus() {
        return Optional.ofNullable(this.vpcStatus);
    }

    /**
     * (Integer) id of associated workspace
     * 
     */
    @Import(name="workspaceId")
    private @Nullable Output<Integer> workspaceId;

    /**
     * @return (Integer) id of associated workspace
     * 
     */
    public Optional<Output<Integer>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    private MwsNetworksState() {}

    private MwsNetworksState(MwsNetworksState $) {
        this.accountId = $.accountId;
        this.creationTime = $.creationTime;
        this.errorMessages = $.errorMessages;
        this.gcpNetworkInfo = $.gcpNetworkInfo;
        this.networkId = $.networkId;
        this.networkName = $.networkName;
        this.securityGroupIds = $.securityGroupIds;
        this.subnetIds = $.subnetIds;
        this.vpcEndpoints = $.vpcEndpoints;
        this.vpcId = $.vpcId;
        this.vpcStatus = $.vpcStatus;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsNetworksState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsNetworksState $;

        public Builder() {
            $ = new MwsNetworksState();
        }

        public Builder(MwsNetworksState defaults) {
            $ = new MwsNetworksState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/)
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder creationTime(@Nullable Output<Integer> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        public Builder creationTime(Integer creationTime) {
            return creationTime(Output.of(creationTime));
        }

        public Builder errorMessages(@Nullable Output<List<MwsNetworksErrorMessageArgs>> errorMessages) {
            $.errorMessages = errorMessages;
            return this;
        }

        public Builder errorMessages(List<MwsNetworksErrorMessageArgs> errorMessages) {
            return errorMessages(Output.of(errorMessages));
        }

        public Builder errorMessages(MwsNetworksErrorMessageArgs... errorMessages) {
            return errorMessages(List.of(errorMessages));
        }

        /**
         * @param gcpNetworkInfo a block consists of Google Cloud specific information for this network, for example the VPC ID, subnet ID, and secondary IP ranges. It has the following fields:
         * 
         * @return builder
         * 
         */
        public Builder gcpNetworkInfo(@Nullable Output<MwsNetworksGcpNetworkInfoArgs> gcpNetworkInfo) {
            $.gcpNetworkInfo = gcpNetworkInfo;
            return this;
        }

        /**
         * @param gcpNetworkInfo a block consists of Google Cloud specific information for this network, for example the VPC ID, subnet ID, and secondary IP ranges. It has the following fields:
         * 
         * @return builder
         * 
         */
        public Builder gcpNetworkInfo(MwsNetworksGcpNetworkInfoArgs gcpNetworkInfo) {
            return gcpNetworkInfo(Output.of(gcpNetworkInfo));
        }

        /**
         * @param networkId (String) id of network to be used for databricks.MwsWorkspaces resource.
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId (String) id of network to be used for databricks.MwsWorkspaces resource.
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param networkName name under which this network is registered
         * 
         * @return builder
         * 
         */
        public Builder networkName(@Nullable Output<String> networkName) {
            $.networkName = networkName;
            return this;
        }

        /**
         * @param networkName name under which this network is registered
         * 
         * @return builder
         * 
         */
        public Builder networkName(String networkName) {
            return networkName(Output.of(networkName));
        }

        /**
         * @param securityGroupIds ids of aws_security_group
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds ids of aws_security_group
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds ids of aws_security_group
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param subnetIds ids of aws_subnet
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds ids of aws_subnet
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds ids of aws_subnet
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param vpcEndpoints mapping of databricks.MwsVpcEndpoint for PrivateLink or Private Service Connect connections
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpoints(@Nullable Output<MwsNetworksVpcEndpointsArgs> vpcEndpoints) {
            $.vpcEndpoints = vpcEndpoints;
            return this;
        }

        /**
         * @param vpcEndpoints mapping of databricks.MwsVpcEndpoint for PrivateLink or Private Service Connect connections
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpoints(MwsNetworksVpcEndpointsArgs vpcEndpoints) {
            return vpcEndpoints(Output.of(vpcEndpoints));
        }

        /**
         * @param vpcId aws_vpc id
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId aws_vpc id
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vpcStatus (String) VPC attachment status
         * 
         * @return builder
         * 
         */
        public Builder vpcStatus(@Nullable Output<String> vpcStatus) {
            $.vpcStatus = vpcStatus;
            return this;
        }

        /**
         * @param vpcStatus (String) VPC attachment status
         * 
         * @return builder
         * 
         */
        public Builder vpcStatus(String vpcStatus) {
            return vpcStatus(Output.of(vpcStatus));
        }

        /**
         * @param workspaceId (Integer) id of associated workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(@Nullable Output<Integer> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId (Integer) id of associated workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Integer workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public MwsNetworksState build() {
            return $;
        }
    }

}
