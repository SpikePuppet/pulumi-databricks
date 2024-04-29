// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class MwsNccBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final MwsNccBindingArgs Empty = new MwsNccBindingArgs();

    /**
     * Canonical unique identifier of Network Connectivity Config in Databricks Account.
     * 
     */
    @Import(name="networkConnectivityConfigId", required=true)
    private Output<String> networkConnectivityConfigId;

    /**
     * @return Canonical unique identifier of Network Connectivity Config in Databricks Account.
     * 
     */
    public Output<String> networkConnectivityConfigId() {
        return this.networkConnectivityConfigId;
    }

    /**
     * Identifier of the workspace to attach the NCC to. Change forces creation of a new resource.
     * 
     */
    @Import(name="workspaceId", required=true)
    private Output<String> workspaceId;

    /**
     * @return Identifier of the workspace to attach the NCC to. Change forces creation of a new resource.
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    private MwsNccBindingArgs() {}

    private MwsNccBindingArgs(MwsNccBindingArgs $) {
        this.networkConnectivityConfigId = $.networkConnectivityConfigId;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsNccBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsNccBindingArgs $;

        public Builder() {
            $ = new MwsNccBindingArgs();
        }

        public Builder(MwsNccBindingArgs defaults) {
            $ = new MwsNccBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkConnectivityConfigId Canonical unique identifier of Network Connectivity Config in Databricks Account.
         * 
         * @return builder
         * 
         */
        public Builder networkConnectivityConfigId(Output<String> networkConnectivityConfigId) {
            $.networkConnectivityConfigId = networkConnectivityConfigId;
            return this;
        }

        /**
         * @param networkConnectivityConfigId Canonical unique identifier of Network Connectivity Config in Databricks Account.
         * 
         * @return builder
         * 
         */
        public Builder networkConnectivityConfigId(String networkConnectivityConfigId) {
            return networkConnectivityConfigId(Output.of(networkConnectivityConfigId));
        }

        /**
         * @param workspaceId Identifier of the workspace to attach the NCC to. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId Identifier of the workspace to attach the NCC to. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public MwsNccBindingArgs build() {
            if ($.networkConnectivityConfigId == null) {
                throw new MissingRequiredPropertyException("MwsNccBindingArgs", "networkConnectivityConfigId");
            }
            if ($.workspaceId == null) {
                throw new MissingRequiredPropertyException("MwsNccBindingArgs", "workspaceId");
            }
            return $;
        }
    }

}
