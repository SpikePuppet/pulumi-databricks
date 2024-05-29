// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class QualityMonitorCustomMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final QualityMonitorCustomMetricArgs Empty = new QualityMonitorCustomMetricArgs();

    /**
     * [create metric definition](https://docs.databricks.com/en/lakehouse-monitoring/custom-metrics.html#create-definition)
     * 
     */
    @Import(name="definition", required=true)
    private Output<String> definition;

    /**
     * @return [create metric definition](https://docs.databricks.com/en/lakehouse-monitoring/custom-metrics.html#create-definition)
     * 
     */
    public Output<String> definition() {
        return this.definition;
    }

    /**
     * Columns on the monitored table to apply the custom metrics to.
     * 
     */
    @Import(name="inputColumns", required=true)
    private Output<List<String>> inputColumns;

    /**
     * @return Columns on the monitored table to apply the custom metrics to.
     * 
     */
    public Output<List<String>> inputColumns() {
        return this.inputColumns;
    }

    /**
     * Name of the custom metric.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the custom metric.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The output type of the custom metric.
     * 
     */
    @Import(name="outputDataType", required=true)
    private Output<String> outputDataType;

    /**
     * @return The output type of the custom metric.
     * 
     */
    public Output<String> outputDataType() {
        return this.outputDataType;
    }

    /**
     * The type of the custom metric.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the custom metric.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private QualityMonitorCustomMetricArgs() {}

    private QualityMonitorCustomMetricArgs(QualityMonitorCustomMetricArgs $) {
        this.definition = $.definition;
        this.inputColumns = $.inputColumns;
        this.name = $.name;
        this.outputDataType = $.outputDataType;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QualityMonitorCustomMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QualityMonitorCustomMetricArgs $;

        public Builder() {
            $ = new QualityMonitorCustomMetricArgs();
        }

        public Builder(QualityMonitorCustomMetricArgs defaults) {
            $ = new QualityMonitorCustomMetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param definition [create metric definition](https://docs.databricks.com/en/lakehouse-monitoring/custom-metrics.html#create-definition)
         * 
         * @return builder
         * 
         */
        public Builder definition(Output<String> definition) {
            $.definition = definition;
            return this;
        }

        /**
         * @param definition [create metric definition](https://docs.databricks.com/en/lakehouse-monitoring/custom-metrics.html#create-definition)
         * 
         * @return builder
         * 
         */
        public Builder definition(String definition) {
            return definition(Output.of(definition));
        }

        /**
         * @param inputColumns Columns on the monitored table to apply the custom metrics to.
         * 
         * @return builder
         * 
         */
        public Builder inputColumns(Output<List<String>> inputColumns) {
            $.inputColumns = inputColumns;
            return this;
        }

        /**
         * @param inputColumns Columns on the monitored table to apply the custom metrics to.
         * 
         * @return builder
         * 
         */
        public Builder inputColumns(List<String> inputColumns) {
            return inputColumns(Output.of(inputColumns));
        }

        /**
         * @param inputColumns Columns on the monitored table to apply the custom metrics to.
         * 
         * @return builder
         * 
         */
        public Builder inputColumns(String... inputColumns) {
            return inputColumns(List.of(inputColumns));
        }

        /**
         * @param name Name of the custom metric.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the custom metric.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outputDataType The output type of the custom metric.
         * 
         * @return builder
         * 
         */
        public Builder outputDataType(Output<String> outputDataType) {
            $.outputDataType = outputDataType;
            return this;
        }

        /**
         * @param outputDataType The output type of the custom metric.
         * 
         * @return builder
         * 
         */
        public Builder outputDataType(String outputDataType) {
            return outputDataType(Output.of(outputDataType));
        }

        /**
         * @param type The type of the custom metric.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the custom metric.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public QualityMonitorCustomMetricArgs build() {
            if ($.definition == null) {
                throw new MissingRequiredPropertyException("QualityMonitorCustomMetricArgs", "definition");
            }
            if ($.inputColumns == null) {
                throw new MissingRequiredPropertyException("QualityMonitorCustomMetricArgs", "inputColumns");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("QualityMonitorCustomMetricArgs", "name");
            }
            if ($.outputDataType == null) {
                throw new MissingRequiredPropertyException("QualityMonitorCustomMetricArgs", "outputDataType");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("QualityMonitorCustomMetricArgs", "type");
            }
            return $;
        }
    }

}