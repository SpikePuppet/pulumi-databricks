// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class QualityMonitorNotificationsOnNewClassificationTagDetectedGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("emailAddresses")]
        private InputList<string>? _emailAddresses;
        public InputList<string> EmailAddresses
        {
            get => _emailAddresses ?? (_emailAddresses = new InputList<string>());
            set => _emailAddresses = value;
        }

        public QualityMonitorNotificationsOnNewClassificationTagDetectedGetArgs()
        {
        }
        public static new QualityMonitorNotificationsOnNewClassificationTagDetectedGetArgs Empty => new QualityMonitorNotificationsOnNewClassificationTagDetectedGetArgs();
    }
}
