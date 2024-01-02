// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobPipelineTask {
    /**
     * @return (Bool) Specifies if there should be full refresh of the pipeline.
     * 
     * &gt; **Note** The following configuration blocks are only supported inside a `task` block
     * 
     */
    private @Nullable Boolean fullRefresh;
    /**
     * @return The pipeline&#39;s unique ID.
     * 
     */
    private String pipelineId;

    private JobPipelineTask() {}
    /**
     * @return (Bool) Specifies if there should be full refresh of the pipeline.
     * 
     * &gt; **Note** The following configuration blocks are only supported inside a `task` block
     * 
     */
    public Optional<Boolean> fullRefresh() {
        return Optional.ofNullable(this.fullRefresh);
    }
    /**
     * @return The pipeline&#39;s unique ID.
     * 
     */
    public String pipelineId() {
        return this.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPipelineTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean fullRefresh;
        private String pipelineId;
        public Builder() {}
        public Builder(JobPipelineTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullRefresh = defaults.fullRefresh;
    	      this.pipelineId = defaults.pipelineId;
        }

        @CustomType.Setter
        public Builder fullRefresh(@Nullable Boolean fullRefresh) {

            this.fullRefresh = fullRefresh;
            return this;
        }
        @CustomType.Setter
        public Builder pipelineId(String pipelineId) {
            if (pipelineId == null) {
              throw new MissingRequiredPropertyException("JobPipelineTask", "pipelineId");
            }
            this.pipelineId = pipelineId;
            return this;
        }
        public JobPipelineTask build() {
            final var _resultValue = new JobPipelineTask();
            _resultValue.fullRefresh = fullRefresh;
            _resultValue.pipelineId = pipelineId;
            return _resultValue;
        }
    }
}
