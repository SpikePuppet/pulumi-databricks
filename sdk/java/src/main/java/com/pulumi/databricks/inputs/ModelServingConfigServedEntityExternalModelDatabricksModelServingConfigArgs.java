// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs Empty = new ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs();

    /**
     * The Databricks secret key reference for a Databricks API token that corresponds to a user or service principal with Can Query access to the model serving endpoint pointed to by this external model.
     * 
     */
    @Import(name="databricksApiToken", required=true)
    private Output<String> databricksApiToken;

    /**
     * @return The Databricks secret key reference for a Databricks API token that corresponds to a user or service principal with Can Query access to the model serving endpoint pointed to by this external model.
     * 
     */
    public Output<String> databricksApiToken() {
        return this.databricksApiToken;
    }

    /**
     * The URL of the Databricks workspace containing the model serving endpoint pointed to by this external model.
     * 
     */
    @Import(name="databricksWorkspaceUrl", required=true)
    private Output<String> databricksWorkspaceUrl;

    /**
     * @return The URL of the Databricks workspace containing the model serving endpoint pointed to by this external model.
     * 
     */
    public Output<String> databricksWorkspaceUrl() {
        return this.databricksWorkspaceUrl;
    }

    private ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs() {}

    private ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs(ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs $) {
        this.databricksApiToken = $.databricksApiToken;
        this.databricksWorkspaceUrl = $.databricksWorkspaceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs $;

        public Builder() {
            $ = new ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs();
        }

        public Builder(ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs defaults) {
            $ = new ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databricksApiToken The Databricks secret key reference for a Databricks API token that corresponds to a user or service principal with Can Query access to the model serving endpoint pointed to by this external model.
         * 
         * @return builder
         * 
         */
        public Builder databricksApiToken(Output<String> databricksApiToken) {
            $.databricksApiToken = databricksApiToken;
            return this;
        }

        /**
         * @param databricksApiToken The Databricks secret key reference for a Databricks API token that corresponds to a user or service principal with Can Query access to the model serving endpoint pointed to by this external model.
         * 
         * @return builder
         * 
         */
        public Builder databricksApiToken(String databricksApiToken) {
            return databricksApiToken(Output.of(databricksApiToken));
        }

        /**
         * @param databricksWorkspaceUrl The URL of the Databricks workspace containing the model serving endpoint pointed to by this external model.
         * 
         * @return builder
         * 
         */
        public Builder databricksWorkspaceUrl(Output<String> databricksWorkspaceUrl) {
            $.databricksWorkspaceUrl = databricksWorkspaceUrl;
            return this;
        }

        /**
         * @param databricksWorkspaceUrl The URL of the Databricks workspace containing the model serving endpoint pointed to by this external model.
         * 
         * @return builder
         * 
         */
        public Builder databricksWorkspaceUrl(String databricksWorkspaceUrl) {
            return databricksWorkspaceUrl(Output.of(databricksWorkspaceUrl));
        }

        public ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs build() {
            if ($.databricksApiToken == null) {
                throw new MissingRequiredPropertyException("ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs", "databricksApiToken");
            }
            if ($.databricksWorkspaceUrl == null) {
                throw new MissingRequiredPropertyException("ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigArgs", "databricksWorkspaceUrl");
            }
            return $;
        }
    }

}
