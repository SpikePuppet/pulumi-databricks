// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetCatalogCatalogInfoProvisioningInfoArgs : global::Pulumi.InvokeArgs
    {
        [Input("state")]
        public string? State { get; set; }

        public GetCatalogCatalogInfoProvisioningInfoArgs()
        {
        }
        public static new GetCatalogCatalogInfoProvisioningInfoArgs Empty => new GetCatalogCatalogInfoProvisioningInfoArgs();
    }
}
