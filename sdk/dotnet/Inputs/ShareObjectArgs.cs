// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ShareObjectArgs : global::Pulumi.ResourceArgs
    {
        [Input("addedAt")]
        public Input<int>? AddedAt { get; set; }

        [Input("addedBy")]
        public Input<string>? AddedBy { get; set; }

        /// <summary>
        /// Description about the object.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Type of the object, currently only `TABLE` is allowed.
        /// </summary>
        [Input("dataObjectType", required: true)]
        public Input<string> DataObjectType { get; set; } = null!;

        /// <summary>
        /// Full name of the object, e.g. `catalog.schema.name` for a table.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("sharedAs")]
        public Input<string>? SharedAs { get; set; }

        public ShareObjectArgs()
        {
        }
        public static new ShareObjectArgs Empty => new ShareObjectArgs();
    }
}