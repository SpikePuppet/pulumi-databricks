// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingConfigServedEntityExternalModelAi21labsConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("ai21labsApiKey", required: true)]
        public Input<string> Ai21labsApiKey { get; set; } = null!;

        public ModelServingConfigServedEntityExternalModelAi21labsConfigArgs()
        {
        }
        public static new ModelServingConfigServedEntityExternalModelAi21labsConfigArgs Empty => new ModelServingConfigServedEntityExternalModelAi21labsConfigArgs();
    }
}
