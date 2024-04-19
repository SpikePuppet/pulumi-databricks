// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class LakehouseMonitorTimeSeriesArgs extends com.pulumi.resources.ResourceArgs {

    public static final LakehouseMonitorTimeSeriesArgs Empty = new LakehouseMonitorTimeSeriesArgs();

    /**
     * List of granularities to use when aggregating data into time windows based on their timestamp.
     * 
     */
    @Import(name="granularities", required=true)
    private Output<List<String>> granularities;

    /**
     * @return List of granularities to use when aggregating data into time windows based on their timestamp.
     * 
     */
    public Output<List<String>> granularities() {
        return this.granularities;
    }

    /**
     * Column of the timestamp of predictions
     * 
     */
    @Import(name="timestampCol", required=true)
    private Output<String> timestampCol;

    /**
     * @return Column of the timestamp of predictions
     * 
     */
    public Output<String> timestampCol() {
        return this.timestampCol;
    }

    private LakehouseMonitorTimeSeriesArgs() {}

    private LakehouseMonitorTimeSeriesArgs(LakehouseMonitorTimeSeriesArgs $) {
        this.granularities = $.granularities;
        this.timestampCol = $.timestampCol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LakehouseMonitorTimeSeriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LakehouseMonitorTimeSeriesArgs $;

        public Builder() {
            $ = new LakehouseMonitorTimeSeriesArgs();
        }

        public Builder(LakehouseMonitorTimeSeriesArgs defaults) {
            $ = new LakehouseMonitorTimeSeriesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param granularities List of granularities to use when aggregating data into time windows based on their timestamp.
         * 
         * @return builder
         * 
         */
        public Builder granularities(Output<List<String>> granularities) {
            $.granularities = granularities;
            return this;
        }

        /**
         * @param granularities List of granularities to use when aggregating data into time windows based on their timestamp.
         * 
         * @return builder
         * 
         */
        public Builder granularities(List<String> granularities) {
            return granularities(Output.of(granularities));
        }

        /**
         * @param granularities List of granularities to use when aggregating data into time windows based on their timestamp.
         * 
         * @return builder
         * 
         */
        public Builder granularities(String... granularities) {
            return granularities(List.of(granularities));
        }

        /**
         * @param timestampCol Column of the timestamp of predictions
         * 
         * @return builder
         * 
         */
        public Builder timestampCol(Output<String> timestampCol) {
            $.timestampCol = timestampCol;
            return this;
        }

        /**
         * @param timestampCol Column of the timestamp of predictions
         * 
         * @return builder
         * 
         */
        public Builder timestampCol(String timestampCol) {
            return timestampCol(Output.of(timestampCol));
        }

        public LakehouseMonitorTimeSeriesArgs build() {
            if ($.granularities == null) {
                throw new MissingRequiredPropertyException("LakehouseMonitorTimeSeriesArgs", "granularities");
            }
            if ($.timestampCol == null) {
                throw new MissingRequiredPropertyException("LakehouseMonitorTimeSeriesArgs", "timestampCol");
            }
            return $;
        }
    }

}
