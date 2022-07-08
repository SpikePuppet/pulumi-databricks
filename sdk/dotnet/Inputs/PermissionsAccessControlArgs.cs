// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class PermissionsAccessControlArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// name of the group. We recommend setting permissions on groups.
        /// </summary>
        [Input("groupName")]
        public Input<string>? GroupName { get; set; }

        /// <summary>
        /// permission level according to specific resource. See examples above for the reference.
        /// </summary>
        [Input("permissionLevel", required: true)]
        public Input<string> PermissionLevel { get; set; } = null!;

        /// <summary>
        /// Application ID of the service_principal.
        /// </summary>
        [Input("servicePrincipalName")]
        public Input<string>? ServicePrincipalName { get; set; }

        /// <summary>
        /// name of the user.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public PermissionsAccessControlArgs()
        {
        }
    }
}
