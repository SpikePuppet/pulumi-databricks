// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MetastoreDataAccessAwsIamRoleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        [Input("unityCatalogIamArn")]
        public Input<string>? UnityCatalogIamArn { get; set; }

        public MetastoreDataAccessAwsIamRoleGetArgs()
        {
        }
        public static new MetastoreDataAccessAwsIamRoleGetArgs Empty => new MetastoreDataAccessAwsIamRoleGetArgs();
    }
}
