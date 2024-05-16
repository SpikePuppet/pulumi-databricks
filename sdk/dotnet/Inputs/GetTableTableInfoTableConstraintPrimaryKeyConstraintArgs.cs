// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetTableTableInfoTableConstraintPrimaryKeyConstraintInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("childColumns", required: true)]
        private InputList<string>? _childColumns;
        public InputList<string> ChildColumns
        {
            get => _childColumns ?? (_childColumns = new InputList<string>());
            set => _childColumns = value;
        }

        /// <summary>
        /// Full name of the databricks_table: _`catalog`.`schema`.`table`_
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetTableTableInfoTableConstraintPrimaryKeyConstraintInputArgs()
        {
        }
        public static new GetTableTableInfoTableConstraintPrimaryKeyConstraintInputArgs Empty => new GetTableTableInfoTableConstraintPrimaryKeyConstraintInputArgs();
    }
}
