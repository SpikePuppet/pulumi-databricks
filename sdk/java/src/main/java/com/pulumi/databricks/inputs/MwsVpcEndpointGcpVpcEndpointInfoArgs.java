// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MwsVpcEndpointGcpVpcEndpointInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final MwsVpcEndpointGcpVpcEndpointInfoArgs Empty = new MwsVpcEndpointGcpVpcEndpointInfoArgs();

    /**
     * Region of the PSC endpoint.
     * 
     */
    @Import(name="endpointRegion", required=true)
    private Output<String> endpointRegion;

    /**
     * @return Region of the PSC endpoint.
     * 
     */
    public Output<String> endpointRegion() {
        return this.endpointRegion;
    }

    /**
     * The Google Cloud project ID of the VPC network where the PSC connection resides.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The Google Cloud project ID of the VPC network where the PSC connection resides.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * The unique ID of this PSC connection.
     * 
     */
    @Import(name="pscConnectionId")
    private @Nullable Output<String> pscConnectionId;

    /**
     * @return The unique ID of this PSC connection.
     * 
     */
    public Optional<Output<String>> pscConnectionId() {
        return Optional.ofNullable(this.pscConnectionId);
    }

    /**
     * The name of the PSC endpoint in the Google Cloud project.
     * 
     */
    @Import(name="pscEndpointName", required=true)
    private Output<String> pscEndpointName;

    /**
     * @return The name of the PSC endpoint in the Google Cloud project.
     * 
     */
    public Output<String> pscEndpointName() {
        return this.pscEndpointName;
    }

    /**
     * The service attachment this PSC connection connects to.
     * 
     */
    @Import(name="serviceAttachmentId")
    private @Nullable Output<String> serviceAttachmentId;

    /**
     * @return The service attachment this PSC connection connects to.
     * 
     */
    public Optional<Output<String>> serviceAttachmentId() {
        return Optional.ofNullable(this.serviceAttachmentId);
    }

    private MwsVpcEndpointGcpVpcEndpointInfoArgs() {}

    private MwsVpcEndpointGcpVpcEndpointInfoArgs(MwsVpcEndpointGcpVpcEndpointInfoArgs $) {
        this.endpointRegion = $.endpointRegion;
        this.projectId = $.projectId;
        this.pscConnectionId = $.pscConnectionId;
        this.pscEndpointName = $.pscEndpointName;
        this.serviceAttachmentId = $.serviceAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsVpcEndpointGcpVpcEndpointInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsVpcEndpointGcpVpcEndpointInfoArgs $;

        public Builder() {
            $ = new MwsVpcEndpointGcpVpcEndpointInfoArgs();
        }

        public Builder(MwsVpcEndpointGcpVpcEndpointInfoArgs defaults) {
            $ = new MwsVpcEndpointGcpVpcEndpointInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointRegion Region of the PSC endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointRegion(Output<String> endpointRegion) {
            $.endpointRegion = endpointRegion;
            return this;
        }

        /**
         * @param endpointRegion Region of the PSC endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointRegion(String endpointRegion) {
            return endpointRegion(Output.of(endpointRegion));
        }

        /**
         * @param projectId The Google Cloud project ID of the VPC network where the PSC connection resides.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The Google Cloud project ID of the VPC network where the PSC connection resides.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param pscConnectionId The unique ID of this PSC connection.
         * 
         * @return builder
         * 
         */
        public Builder pscConnectionId(@Nullable Output<String> pscConnectionId) {
            $.pscConnectionId = pscConnectionId;
            return this;
        }

        /**
         * @param pscConnectionId The unique ID of this PSC connection.
         * 
         * @return builder
         * 
         */
        public Builder pscConnectionId(String pscConnectionId) {
            return pscConnectionId(Output.of(pscConnectionId));
        }

        /**
         * @param pscEndpointName The name of the PSC endpoint in the Google Cloud project.
         * 
         * @return builder
         * 
         */
        public Builder pscEndpointName(Output<String> pscEndpointName) {
            $.pscEndpointName = pscEndpointName;
            return this;
        }

        /**
         * @param pscEndpointName The name of the PSC endpoint in the Google Cloud project.
         * 
         * @return builder
         * 
         */
        public Builder pscEndpointName(String pscEndpointName) {
            return pscEndpointName(Output.of(pscEndpointName));
        }

        /**
         * @param serviceAttachmentId The service attachment this PSC connection connects to.
         * 
         * @return builder
         * 
         */
        public Builder serviceAttachmentId(@Nullable Output<String> serviceAttachmentId) {
            $.serviceAttachmentId = serviceAttachmentId;
            return this;
        }

        /**
         * @param serviceAttachmentId The service attachment this PSC connection connects to.
         * 
         * @return builder
         * 
         */
        public Builder serviceAttachmentId(String serviceAttachmentId) {
            return serviceAttachmentId(Output.of(serviceAttachmentId));
        }

        public MwsVpcEndpointGcpVpcEndpointInfoArgs build() {
            if ($.endpointRegion == null) {
                throw new MissingRequiredPropertyException("MwsVpcEndpointGcpVpcEndpointInfoArgs", "endpointRegion");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("MwsVpcEndpointGcpVpcEndpointInfoArgs", "projectId");
            }
            if ($.pscEndpointName == null) {
                throw new MissingRequiredPropertyException("MwsVpcEndpointGcpVpcEndpointInfoArgs", "pscEndpointName");
            }
            return $;
        }
    }

}
