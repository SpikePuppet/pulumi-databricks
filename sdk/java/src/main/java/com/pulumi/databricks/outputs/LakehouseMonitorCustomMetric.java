// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LakehouseMonitorCustomMetric {
    /**
     * @return [create metric definition]: https://docs.databricks.com/en/lakehouse-monitoring/custom-metrics.html#create-definition
     * 
     */
    private @Nullable String definition;
    /**
     * @return Columns on the monitored table to apply the custom metrics to.
     * 
     */
    private @Nullable List<String> inputColumns;
    /**
     * @return Name of the custom metric.
     * 
     */
    private @Nullable String name;
    /**
     * @return The output type of the custom metric.
     * 
     */
    private @Nullable String outputDataType;
    /**
     * @return The type of the custom metric.
     * 
     */
    private @Nullable String type;

    private LakehouseMonitorCustomMetric() {}
    /**
     * @return [create metric definition]: https://docs.databricks.com/en/lakehouse-monitoring/custom-metrics.html#create-definition
     * 
     */
    public Optional<String> definition() {
        return Optional.ofNullable(this.definition);
    }
    /**
     * @return Columns on the monitored table to apply the custom metrics to.
     * 
     */
    public List<String> inputColumns() {
        return this.inputColumns == null ? List.of() : this.inputColumns;
    }
    /**
     * @return Name of the custom metric.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The output type of the custom metric.
     * 
     */
    public Optional<String> outputDataType() {
        return Optional.ofNullable(this.outputDataType);
    }
    /**
     * @return The type of the custom metric.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LakehouseMonitorCustomMetric defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String definition;
        private @Nullable List<String> inputColumns;
        private @Nullable String name;
        private @Nullable String outputDataType;
        private @Nullable String type;
        public Builder() {}
        public Builder(LakehouseMonitorCustomMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.inputColumns = defaults.inputColumns;
    	      this.name = defaults.name;
    	      this.outputDataType = defaults.outputDataType;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder definition(@Nullable String definition) {

            this.definition = definition;
            return this;
        }
        @CustomType.Setter
        public Builder inputColumns(@Nullable List<String> inputColumns) {

            this.inputColumns = inputColumns;
            return this;
        }
        public Builder inputColumns(String... inputColumns) {
            return inputColumns(List.of(inputColumns));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder outputDataType(@Nullable String outputDataType) {

            this.outputDataType = outputDataType;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public LakehouseMonitorCustomMetric build() {
            final var _resultValue = new LakehouseMonitorCustomMetric();
            _resultValue.definition = definition;
            _resultValue.inputColumns = inputColumns;
            _resultValue.name = name;
            _resultValue.outputDataType = outputDataType;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
