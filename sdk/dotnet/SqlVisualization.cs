// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// ## Import
    /// 
    /// You can import a `databricks_sql_visualization` resource with ID like the following:
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/sqlVisualization:SqlVisualization this &lt;query-id&gt;/&lt;visualization-id&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/sqlVisualization:SqlVisualization")]
    public partial class SqlVisualization : global::Pulumi.CustomResource
    {
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("options")]
        public Output<string> Options { get; private set; } = null!;

        [Output("queryId")]
        public Output<string> QueryId { get; private set; } = null!;

        [Output("queryPlan")]
        public Output<string?> QueryPlan { get; private set; } = null!;

        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        [Output("visualizationId")]
        public Output<string> VisualizationId { get; private set; } = null!;


        /// <summary>
        /// Create a SqlVisualization resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SqlVisualization(string name, SqlVisualizationArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/sqlVisualization:SqlVisualization", name, args ?? new SqlVisualizationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SqlVisualization(string name, Input<string> id, SqlVisualizationState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/sqlVisualization:SqlVisualization", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SqlVisualization resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SqlVisualization Get(string name, Input<string> id, SqlVisualizationState? state = null, CustomResourceOptions? options = null)
        {
            return new SqlVisualization(name, id, state, options);
        }
    }

    public sealed class SqlVisualizationArgs : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("options", required: true)]
        public Input<string> Options { get; set; } = null!;

        [Input("queryId", required: true)]
        public Input<string> QueryId { get; set; } = null!;

        [Input("queryPlan")]
        public Input<string>? QueryPlan { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("visualizationId")]
        public Input<string>? VisualizationId { get; set; }

        public SqlVisualizationArgs()
        {
        }
        public static new SqlVisualizationArgs Empty => new SqlVisualizationArgs();
    }

    public sealed class SqlVisualizationState : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("options")]
        public Input<string>? Options { get; set; }

        [Input("queryId")]
        public Input<string>? QueryId { get; set; }

        [Input("queryPlan")]
        public Input<string>? QueryPlan { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("visualizationId")]
        public Input<string>? VisualizationId { get; set; }

        public SqlVisualizationState()
        {
        }
        public static new SqlVisualizationState Empty => new SqlVisualizationState();
    }
}
