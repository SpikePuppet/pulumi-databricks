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
    public sealed class SqlPermissionsPrivilegeAssignment
    {
        /// <summary>
        /// `display_name` for a databricks.Group or databricks_user, `application_id` for a databricks_service_principal.
        /// </summary>
        public readonly string Principal;
        public readonly ImmutableArray<string> Privileges;

        [OutputConstructor]
        private SqlPermissionsPrivilegeAssignment(
            string principal,

            ImmutableArray<string> privileges)
        {
            Principal = principal;
            Privileges = privileges;
        }
    }
}
