// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QualityMonitorInferenceLog {
    /**
     * @return List of granularities to use when aggregating data into time windows based on their timestamp.
     * 
     */
    private List<String> granularities;
    /**
     * @return Column of the model label
     * 
     */
    private @Nullable String labelCol;
    /**
     * @return Column of the model id or version
     * 
     */
    private String modelIdCol;
    /**
     * @return Column of the model prediction
     * 
     */
    private String predictionCol;
    /**
     * @return Column of the model prediction probabilities
     * 
     */
    private @Nullable String predictionProbaCol;
    /**
     * @return Problem type the model aims to solve. Either `PROBLEM_TYPE_CLASSIFICATION` or `PROBLEM_TYPE_REGRESSION`
     * 
     */
    private String problemType;
    /**
     * @return Column of the timestamp of predictions
     * 
     */
    private String timestampCol;

    private QualityMonitorInferenceLog() {}
    /**
     * @return List of granularities to use when aggregating data into time windows based on their timestamp.
     * 
     */
    public List<String> granularities() {
        return this.granularities;
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
    public String modelIdCol() {
        return this.modelIdCol;
    }
    /**
     * @return Column of the model prediction
     * 
     */
    public String predictionCol() {
        return this.predictionCol;
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
    public String problemType() {
        return this.problemType;
    }
    /**
     * @return Column of the timestamp of predictions
     * 
     */
    public String timestampCol() {
        return this.timestampCol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QualityMonitorInferenceLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> granularities;
        private @Nullable String labelCol;
        private String modelIdCol;
        private String predictionCol;
        private @Nullable String predictionProbaCol;
        private String problemType;
        private String timestampCol;
        public Builder() {}
        public Builder(QualityMonitorInferenceLog defaults) {
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
        public Builder granularities(List<String> granularities) {
            if (granularities == null) {
              throw new MissingRequiredPropertyException("QualityMonitorInferenceLog", "granularities");
            }
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
        public Builder modelIdCol(String modelIdCol) {
            if (modelIdCol == null) {
              throw new MissingRequiredPropertyException("QualityMonitorInferenceLog", "modelIdCol");
            }
            this.modelIdCol = modelIdCol;
            return this;
        }
        @CustomType.Setter
        public Builder predictionCol(String predictionCol) {
            if (predictionCol == null) {
              throw new MissingRequiredPropertyException("QualityMonitorInferenceLog", "predictionCol");
            }
            this.predictionCol = predictionCol;
            return this;
        }
        @CustomType.Setter
        public Builder predictionProbaCol(@Nullable String predictionProbaCol) {

            this.predictionProbaCol = predictionProbaCol;
            return this;
        }
        @CustomType.Setter
        public Builder problemType(String problemType) {
            if (problemType == null) {
              throw new MissingRequiredPropertyException("QualityMonitorInferenceLog", "problemType");
            }
            this.problemType = problemType;
            return this;
        }
        @CustomType.Setter
        public Builder timestampCol(String timestampCol) {
            if (timestampCol == null) {
              throw new MissingRequiredPropertyException("QualityMonitorInferenceLog", "timestampCol");
            }
            this.timestampCol = timestampCol;
            return this;
        }
        public QualityMonitorInferenceLog build() {
            final var _resultValue = new QualityMonitorInferenceLog();
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
