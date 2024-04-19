// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask {
    private @Nullable Map<String,Object> baseParameters;
    private String notebookPath;
    private @Nullable String source;
    private @Nullable String warehouseId;

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask() {}
    public Map<String,Object> baseParameters() {
        return this.baseParameters == null ? Map.of() : this.baseParameters;
    }
    public String notebookPath() {
        return this.notebookPath;
    }
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    public Optional<String> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> baseParameters;
        private String notebookPath;
        private @Nullable String source;
        private @Nullable String warehouseId;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseParameters = defaults.baseParameters;
    	      this.notebookPath = defaults.notebookPath;
    	      this.source = defaults.source;
    	      this.warehouseId = defaults.warehouseId;
        }

        @CustomType.Setter
        public Builder baseParameters(@Nullable Map<String,Object> baseParameters) {

            this.baseParameters = baseParameters;
            return this;
        }
        @CustomType.Setter
        public Builder notebookPath(String notebookPath) {
            if (notebookPath == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask", "notebookPath");
            }
            this.notebookPath = notebookPath;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {

            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder warehouseId(@Nullable String warehouseId) {

            this.warehouseId = warehouseId;
            return this;
        }
        public GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask();
            _resultValue.baseParameters = baseParameters;
            _resultValue.notebookPath = notebookPath;
            _resultValue.source = source;
            _resultValue.warehouseId = warehouseId;
            return _resultValue;
        }
    }
}
