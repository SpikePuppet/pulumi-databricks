// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class LakehouseMonitorInferenceLogArgs : global::Pulumi.ResourceArgs
    {
        [Input("granularities")]
        private InputList<string>? _granularities;

        /// <summary>
        /// List of granularities to use when aggregating data into time windows based on their timestamp.
        /// </summary>
        public InputList<string> Granularities
        {
            get => _granularities ?? (_granularities = new InputList<string>());
            set => _granularities = value;
        }

        /// <summary>
        /// Column of the model label
        /// </summary>
        [Input("labelCol")]
        public Input<string>? LabelCol { get; set; }

        /// <summary>
        /// Column of the model id or version
        /// </summary>
        [Input("modelIdCol")]
        public Input<string>? ModelIdCol { get; set; }

        /// <summary>
        /// Column of the model prediction
        /// </summary>
        [Input("predictionCol")]
        public Input<string>? PredictionCol { get; set; }

        /// <summary>
        /// Column of the model prediction probabilities
        /// </summary>
        [Input("predictionProbaCol")]
        public Input<string>? PredictionProbaCol { get; set; }

        /// <summary>
        /// Problem type the model aims to solve. Either `PROBLEM_TYPE_CLASSIFICATION` or `PROBLEM_TYPE_REGRESSION`
        /// </summary>
        [Input("problemType")]
        public Input<string>? ProblemType { get; set; }

        /// <summary>
        /// Column of the timestamp of predictions
        /// </summary>
        [Input("timestampCol")]
        public Input<string>? TimestampCol { get; set; }

        public LakehouseMonitorInferenceLogArgs()
        {
        }
        public static new LakehouseMonitorInferenceLogArgs Empty => new LakehouseMonitorInferenceLogArgs();
    }
}