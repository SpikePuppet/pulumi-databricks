// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VectorSearchEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final VectorSearchEndpointArgs Empty = new VectorSearchEndpointArgs();

    /**
     * type of Vector Search Endpoint.  Currently only accepting single value: `STANDARD` (See [documentation](https://docs.databricks.com/api/workspace/vectorsearchendpoints/createendpoint) for the list of currently supported values).  If it&#39;s changed, Vector Search Endpoint is recreated.
     * 
     */
    @Import(name="endpointType", required=true)
    private Output<String> endpointType;

    /**
     * @return type of Vector Search Endpoint.  Currently only accepting single value: `STANDARD` (See [documentation](https://docs.databricks.com/api/workspace/vectorsearchendpoints/createendpoint) for the list of currently supported values).  If it&#39;s changed, Vector Search Endpoint is recreated.
     * 
     */
    public Output<String> endpointType() {
        return this.endpointType;
    }

    /**
     * Name of the Vector Search Endpoint to create.  If name is changed, Vector Search Endpoint is recreated.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Vector Search Endpoint to create.  If name is changed, Vector Search Endpoint is recreated.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private VectorSearchEndpointArgs() {}

    private VectorSearchEndpointArgs(VectorSearchEndpointArgs $) {
        this.endpointType = $.endpointType;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VectorSearchEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VectorSearchEndpointArgs $;

        public Builder() {
            $ = new VectorSearchEndpointArgs();
        }

        public Builder(VectorSearchEndpointArgs defaults) {
            $ = new VectorSearchEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointType type of Vector Search Endpoint.  Currently only accepting single value: `STANDARD` (See [documentation](https://docs.databricks.com/api/workspace/vectorsearchendpoints/createendpoint) for the list of currently supported values).  If it&#39;s changed, Vector Search Endpoint is recreated.
         * 
         * @return builder
         * 
         */
        public Builder endpointType(Output<String> endpointType) {
            $.endpointType = endpointType;
            return this;
        }

        /**
         * @param endpointType type of Vector Search Endpoint.  Currently only accepting single value: `STANDARD` (See [documentation](https://docs.databricks.com/api/workspace/vectorsearchendpoints/createendpoint) for the list of currently supported values).  If it&#39;s changed, Vector Search Endpoint is recreated.
         * 
         * @return builder
         * 
         */
        public Builder endpointType(String endpointType) {
            return endpointType(Output.of(endpointType));
        }

        /**
         * @param name Name of the Vector Search Endpoint to create.  If name is changed, Vector Search Endpoint is recreated.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Vector Search Endpoint to create.  If name is changed, Vector Search Endpoint is recreated.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public VectorSearchEndpointArgs build() {
            if ($.endpointType == null) {
                throw new MissingRequiredPropertyException("VectorSearchEndpointArgs", "endpointType");
            }
            return $;
        }
    }

}
