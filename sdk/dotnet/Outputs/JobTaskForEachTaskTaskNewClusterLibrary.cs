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
    public sealed class JobTaskForEachTaskTaskNewClusterLibrary
    {
        public readonly Outputs.JobTaskForEachTaskTaskNewClusterLibraryCran? Cran;
        public readonly string? Egg;
        public readonly string? Jar;
        public readonly Outputs.JobTaskForEachTaskTaskNewClusterLibraryMaven? Maven;
        public readonly Outputs.JobTaskForEachTaskTaskNewClusterLibraryPypi? Pypi;
        public readonly string? Requirements;
        public readonly string? Whl;

        [OutputConstructor]
        private JobTaskForEachTaskTaskNewClusterLibrary(
            Outputs.JobTaskForEachTaskTaskNewClusterLibraryCran? cran,

            string? egg,

            string? jar,

            Outputs.JobTaskForEachTaskTaskNewClusterLibraryMaven? maven,

            Outputs.JobTaskForEachTaskTaskNewClusterLibraryPypi? pypi,

            string? requirements,

            string? whl)
        {
            Cran = cran;
            Egg = egg;
            Jar = jar;
            Maven = maven;
            Pypi = pypi;
            Requirements = requirements;
            Whl = whl;
        }
    }
}
