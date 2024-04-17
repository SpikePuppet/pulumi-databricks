// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class ModelServingConfigServedEntityExternalModelDatabricksModelServingConfig
    {
        /// <summary>
        /// The Databricks secret key reference for a Databricks API token that corresponds to a user or service principal with Can Query access to the model serving endpoint pointed to by this external model.
        /// </summary>
        public readonly string DatabricksApiToken;
        /// <summary>
        /// The URL of the Databricks workspace containing the model serving endpoint pointed to by this external model.
        /// </summary>
        public readonly string DatabricksWorkspaceUrl;

        [OutputConstructor]
        private ModelServingConfigServedEntityExternalModelDatabricksModelServingConfig(
            string databricksApiToken,

            string databricksWorkspaceUrl)
        {
            DatabricksApiToken = databricksApiToken;
            DatabricksWorkspaceUrl = databricksWorkspaceUrl;
        }
    }
}