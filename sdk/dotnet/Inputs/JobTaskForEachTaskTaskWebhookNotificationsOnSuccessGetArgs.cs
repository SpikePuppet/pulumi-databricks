// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskForEachTaskTaskWebhookNotificationsOnSuccessGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the job
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public JobTaskForEachTaskTaskWebhookNotificationsOnSuccessGetArgs()
        {
        }
        public static new JobTaskForEachTaskTaskWebhookNotificationsOnSuccessGetArgs Empty => new JobTaskForEachTaskTaskWebhookNotificationsOnSuccessGetArgs();
    }
}
