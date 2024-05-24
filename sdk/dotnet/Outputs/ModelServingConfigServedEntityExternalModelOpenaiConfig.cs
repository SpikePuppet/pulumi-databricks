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
    public sealed class ModelServingConfigServedEntityExternalModelOpenaiConfig
    {
        public readonly string? MicrosoftEntraClientId;
        public readonly string? MicrosoftEntraClientSecret;
        public readonly string? MicrosoftEntraTenantId;
        public readonly string? OpenaiApiBase;
        public readonly string? OpenaiApiKey;
        public readonly string? OpenaiApiType;
        public readonly string? OpenaiApiVersion;
        public readonly string? OpenaiDeploymentName;
        public readonly string? OpenaiOrganization;

        [OutputConstructor]
        private ModelServingConfigServedEntityExternalModelOpenaiConfig(
            string? microsoftEntraClientId,

            string? microsoftEntraClientSecret,

            string? microsoftEntraTenantId,

            string? openaiApiBase,

            string? openaiApiKey,

            string? openaiApiType,

            string? openaiApiVersion,

            string? openaiDeploymentName,

            string? openaiOrganization)
        {
            MicrosoftEntraClientId = microsoftEntraClientId;
            MicrosoftEntraClientSecret = microsoftEntraClientSecret;
            MicrosoftEntraTenantId = microsoftEntraTenantId;
            OpenaiApiBase = openaiApiBase;
            OpenaiApiKey = openaiApiKey;
            OpenaiApiType = openaiApiType;
            OpenaiApiVersion = openaiApiVersion;
            OpenaiDeploymentName = openaiDeploymentName;
            OpenaiOrganization = openaiOrganization;
        }
    }
}
