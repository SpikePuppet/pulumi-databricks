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
public final class LakehouseMonitorInferenceLog {
    /**
     * @return List of granularities to use when aggregating data into time windows based on their timestamp.
     * 
     */
    private @Nullable List<String> granularities;
    /**
     * @return Column of the model label
     * 
     */
    private @Nullable String labelCol;
    /**
     * @return Column of the model id or version
     * 
     */
    private @Nullable String modelIdCol;
    /**
     * @return Column of the model prediction
     * 
     */
    private @Nullable String predictionCol;
    /**
     * @return Column of the model prediction probabilities
     * 
     */
    private @Nullable String predictionProbaCol;
    /**
     * @return Problem type the model aims to solve. Either `PROBLEM_TYPE_CLASSIFICATION` or `PROBLEM_TYPE_REGRESSION`
     * 
     */
    private @Nullable String problemType;
    /**
     * @return Column of the timestamp of predictions
     * 
     */
    private @Nullable String timestampCol;

    private LakehouseMonitorInferenceLog() {}
    /**
     * @return List of granularities to use when aggregating data into time windows based on their timestamp.
     * 
     */
    public List<String> granularities() {
        return this.granularities == null ? List.of() : this.granularities;
    }
    /**
     * @return Column of the model label
     * 
     */
    public Optional<String> labelCol() {
        return Optional.ofNullable(this.labelCol);
    }
    /**
     * @return Column of the model id or version
     * 
     */
    public Optional<String> modelIdCol() {
        return Optional.ofNullable(this.modelIdCol);
    }
    /**
     * @return Column of the model prediction
     * 
     */
    public Optional<String> predictionCol() {
        return Optional.ofNullable(this.predictionCol);
    }
    /**
     * @return Column of the model prediction probabilities
     * 
     */
    public Optional<String> predictionProbaCol() {
        return Optional.ofNullable(this.predictionProbaCol);
    }
    /**
     * @return Problem type the model aims to solve. Either `PROBLEM_TYPE_CLASSIFICATION` or `PROBLEM_TYPE_REGRESSION`
     * 
     */
    public Optional<String> problemType() {
        return Optional.ofNullable(this.problemType);
    }
    /**
     * @return Column of the timestamp of predictions
     * 
     */
    public Optional<String> timestampCol() {
        return Optional.ofNullable(this.timestampCol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LakehouseMonitorInferenceLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> granularities;
        private @Nullable String labelCol;
        private @Nullable String modelIdCol;
        private @Nullable String predictionCol;
        private @Nullable String predictionProbaCol;
        private @Nullable String problemType;
        private @Nullable String timestampCol;
        public Builder() {}
        public Builder(LakehouseMonitorInferenceLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.granularities = defaults.granularities;
    	      this.labelCol = defaults.labelCol;
    	      this.modelIdCol = defaults.modelIdCol;
    	      this.predictionCol = defaults.predictionCol;
    	      this.predictionProbaCol = defaults.predictionProbaCol;
    	      this.problemType = defaults.problemType;
    	      this.timestampCol = defaults.timestampCol;
        }

        @CustomType.Setter
        public Builder granularities(@Nullable List<String> granularities) {

            this.granularities = granularities;
            return this;
        }
        public Builder granularities(String... granularities) {
            return granularities(List.of(granularities));
        }
        @CustomType.Setter
        public Builder labelCol(@Nullable String labelCol) {

            this.labelCol = labelCol;
            return this;
        }
        @CustomType.Setter
        public Builder modelIdCol(@Nullable String modelIdCol) {

            this.modelIdCol = modelIdCol;
            return this;
        }
        @CustomType.Setter
        public Builder predictionCol(@Nullable String predictionCol) {

            this.predictionCol = predictionCol;
            return this;
        }
        @CustomType.Setter
        public Builder predictionProbaCol(@Nullable String predictionProbaCol) {

            this.predictionProbaCol = predictionProbaCol;
            return this;
        }
        @CustomType.Setter
        public Builder problemType(@Nullable String problemType) {

            this.problemType = problemType;
            return this;
        }
        @CustomType.Setter
        public Builder timestampCol(@Nullable String timestampCol) {

            this.timestampCol = timestampCol;
            return this;
        }
        public LakehouseMonitorInferenceLog build() {
            final var _resultValue = new LakehouseMonitorInferenceLog();
            _resultValue.granularities = granularities;
            _resultValue.labelCol = labelCol;
            _resultValue.modelIdCol = modelIdCol;
            _resultValue.predictionCol = predictionCol;
            _resultValue.predictionProbaCol = predictionProbaCol;
            _resultValue.problemType = problemType;
            _resultValue.timestampCol = timestampCol;
            return _resultValue;
        }
    }
}