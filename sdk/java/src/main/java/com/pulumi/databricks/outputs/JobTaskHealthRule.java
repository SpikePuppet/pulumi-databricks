// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskHealthRule {
    /**
     * @return string specifying the metric to check.  The only supported metric is `RUN_DURATION_SECONDS` (check [Jobs REST API documentation](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
     * 
     */
    private @Nullable String metric;
    /**
     * @return The string specifying the operation used to compare operands.  Currently, following operators are supported: `EQUAL_TO`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `NOT_EQUAL`. (Check the [API docs](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
     * 
     * This task does not require a cluster to execute and does not support retries or notifications.
     * 
     */
    private @Nullable String op;
    /**
     * @return integer value used to compare to the given metric.
     * 
     */
    private @Nullable Integer value;

    private JobTaskHealthRule() {}
    /**
     * @return string specifying the metric to check.  The only supported metric is `RUN_DURATION_SECONDS` (check [Jobs REST API documentation](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
     * 
     */
    public Optional<String> metric() {
        return Optional.ofNullable(this.metric);
    }
    /**
     * @return The string specifying the operation used to compare operands.  Currently, following operators are supported: `EQUAL_TO`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `NOT_EQUAL`. (Check the [API docs](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
     * 
     * This task does not require a cluster to execute and does not support retries or notifications.
     * 
     */
    public Optional<String> op() {
        return Optional.ofNullable(this.op);
    }
    /**
     * @return integer value used to compare to the given metric.
     * 
     */
    public Optional<Integer> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskHealthRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String metric;
        private @Nullable String op;
        private @Nullable Integer value;
        public Builder() {}
        public Builder(JobTaskHealthRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.op = defaults.op;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder metric(@Nullable String metric) {
            this.metric = metric;
            return this;
        }
        @CustomType.Setter
        public Builder op(@Nullable String op) {
            this.op = op;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable Integer value) {
            this.value = value;
            return this;
        }
        public JobTaskHealthRule build() {
            final var _resultValue = new JobTaskHealthRule();
            _resultValue.metric = metric;
            _resultValue.op = op;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
