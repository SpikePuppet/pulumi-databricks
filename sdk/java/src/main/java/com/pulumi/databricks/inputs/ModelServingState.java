// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.ModelServingConfigArgs;
import com.pulumi.databricks.inputs.ModelServingRateLimitArgs;
import com.pulumi.databricks.inputs.ModelServingTagArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelServingState extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingState Empty = new ModelServingState();

    /**
     * The model serving endpoint configuration.
     * 
     */
    @Import(name="config")
    private @Nullable Output<ModelServingConfigArgs> config;

    /**
     * @return The model serving endpoint configuration.
     * 
     */
    public Optional<Output<ModelServingConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of rate limits to be applied to the serving endpoint. NOTE: only external and foundation model endpoints are supported as of now.
     * 
     */
    @Import(name="rateLimits")
    private @Nullable Output<List<ModelServingRateLimitArgs>> rateLimits;

    /**
     * @return A list of rate limits to be applied to the serving endpoint. NOTE: only external and foundation model endpoints are supported as of now.
     * 
     */
    public Optional<Output<List<ModelServingRateLimitArgs>>> rateLimits() {
        return Optional.ofNullable(this.rateLimits);
    }

    /**
     * A boolean enabling route optimization for the endpoint. NOTE: only available for custom models.
     * 
     */
    @Import(name="routeOptimized")
    private @Nullable Output<Boolean> routeOptimized;

    /**
     * @return A boolean enabling route optimization for the endpoint. NOTE: only available for custom models.
     * 
     */
    public Optional<Output<Boolean>> routeOptimized() {
        return Optional.ofNullable(this.routeOptimized);
    }

    /**
     * Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
     * 
     */
    @Import(name="servingEndpointId")
    private @Nullable Output<String> servingEndpointId;

    /**
     * @return Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
     * 
     */
    public Optional<Output<String>> servingEndpointId() {
        return Optional.ofNullable(this.servingEndpointId);
    }

    /**
     * Tags to be attached to the serving endpoint and automatically propagated to billing logs.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ModelServingTagArgs>> tags;

    /**
     * @return Tags to be attached to the serving endpoint and automatically propagated to billing logs.
     * 
     */
    public Optional<Output<List<ModelServingTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ModelServingState() {}

    private ModelServingState(ModelServingState $) {
        this.config = $.config;
        this.name = $.name;
        this.rateLimits = $.rateLimits;
        this.routeOptimized = $.routeOptimized;
        this.servingEndpointId = $.servingEndpointId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingState $;

        public Builder() {
            $ = new ModelServingState();
        }

        public Builder(ModelServingState defaults) {
            $ = new ModelServingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param config The model serving endpoint configuration.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<ModelServingConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The model serving endpoint configuration.
         * 
         * @return builder
         * 
         */
        public Builder config(ModelServingConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param name The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rateLimits A list of rate limits to be applied to the serving endpoint. NOTE: only external and foundation model endpoints are supported as of now.
         * 
         * @return builder
         * 
         */
        public Builder rateLimits(@Nullable Output<List<ModelServingRateLimitArgs>> rateLimits) {
            $.rateLimits = rateLimits;
            return this;
        }

        /**
         * @param rateLimits A list of rate limits to be applied to the serving endpoint. NOTE: only external and foundation model endpoints are supported as of now.
         * 
         * @return builder
         * 
         */
        public Builder rateLimits(List<ModelServingRateLimitArgs> rateLimits) {
            return rateLimits(Output.of(rateLimits));
        }

        /**
         * @param rateLimits A list of rate limits to be applied to the serving endpoint. NOTE: only external and foundation model endpoints are supported as of now.
         * 
         * @return builder
         * 
         */
        public Builder rateLimits(ModelServingRateLimitArgs... rateLimits) {
            return rateLimits(List.of(rateLimits));
        }

        /**
         * @param routeOptimized A boolean enabling route optimization for the endpoint. NOTE: only available for custom models.
         * 
         * @return builder
         * 
         */
        public Builder routeOptimized(@Nullable Output<Boolean> routeOptimized) {
            $.routeOptimized = routeOptimized;
            return this;
        }

        /**
         * @param routeOptimized A boolean enabling route optimization for the endpoint. NOTE: only available for custom models.
         * 
         * @return builder
         * 
         */
        public Builder routeOptimized(Boolean routeOptimized) {
            return routeOptimized(Output.of(routeOptimized));
        }

        /**
         * @param servingEndpointId Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
         * 
         * @return builder
         * 
         */
        public Builder servingEndpointId(@Nullable Output<String> servingEndpointId) {
            $.servingEndpointId = servingEndpointId;
            return this;
        }

        /**
         * @param servingEndpointId Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
         * 
         * @return builder
         * 
         */
        public Builder servingEndpointId(String servingEndpointId) {
            return servingEndpointId(Output.of(servingEndpointId));
        }

        /**
         * @param tags Tags to be attached to the serving endpoint and automatically propagated to billing logs.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ModelServingTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to be attached to the serving endpoint and automatically propagated to billing logs.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ModelServingTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to be attached to the serving endpoint and automatically propagated to billing logs.
         * 
         * @return builder
         * 
         */
        public Builder tags(ModelServingTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ModelServingState build() {
            return $;
        }
    }

}
