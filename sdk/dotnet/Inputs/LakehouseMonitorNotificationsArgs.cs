// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class LakehouseMonitorNotificationsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// who to send notifications to on monitor failure.
        /// </summary>
        [Input("onFailure")]
        public Input<Inputs.LakehouseMonitorNotificationsOnFailureArgs>? OnFailure { get; set; }

        /// <summary>
        /// Who to send notifications to when new data classification tags are detected.
        /// </summary>
        [Input("onNewClassificationTagDetected")]
        public Input<Inputs.LakehouseMonitorNotificationsOnNewClassificationTagDetectedArgs>? OnNewClassificationTagDetected { get; set; }

        public LakehouseMonitorNotificationsArgs()
        {
        }
        public static new LakehouseMonitorNotificationsArgs Empty => new LakehouseMonitorNotificationsArgs();
    }
}
