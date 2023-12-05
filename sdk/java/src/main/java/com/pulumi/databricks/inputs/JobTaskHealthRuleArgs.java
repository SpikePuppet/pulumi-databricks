// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskHealthRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskHealthRuleArgs Empty = new JobTaskHealthRuleArgs();

    /**
     * string specifying the metric to check.  The only supported metric is `RUN_DURATION_SECONDS` (check [Jobs REST API documentation](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
     * 
     */
    @Import(name="metric")
    private @Nullable Output<String> metric;

    /**
     * @return string specifying the metric to check.  The only supported metric is `RUN_DURATION_SECONDS` (check [Jobs REST API documentation](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
     * 
     */
    public Optional<Output<String>> metric() {
        return Optional.ofNullable(this.metric);
    }

    /**
     * The string specifying the operation used to compare operands.  Currently, following operators are supported: `EQUAL_TO`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `NOT_EQUAL`. (Check the [API docs](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
     * 
     * This task does not require a cluster to execute and does not support retries or notifications.
     * 
     */
    @Import(name="op")
    private @Nullable Output<String> op;

    /**
     * @return The string specifying the operation used to compare operands.  Currently, following operators are supported: `EQUAL_TO`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `NOT_EQUAL`. (Check the [API docs](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
     * 
     * This task does not require a cluster to execute and does not support retries or notifications.
     * 
     */
    public Optional<Output<String>> op() {
        return Optional.ofNullable(this.op);
    }

    /**
     * integer value used to compare to the given metric.
     * 
     */
    @Import(name="value")
    private @Nullable Output<Integer> value;

    /**
     * @return integer value used to compare to the given metric.
     * 
     */
    public Optional<Output<Integer>> value() {
        return Optional.ofNullable(this.value);
    }

    private JobTaskHealthRuleArgs() {}

    private JobTaskHealthRuleArgs(JobTaskHealthRuleArgs $) {
        this.metric = $.metric;
        this.op = $.op;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskHealthRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskHealthRuleArgs $;

        public Builder() {
            $ = new JobTaskHealthRuleArgs();
        }

        public Builder(JobTaskHealthRuleArgs defaults) {
            $ = new JobTaskHealthRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metric string specifying the metric to check.  The only supported metric is `RUN_DURATION_SECONDS` (check [Jobs REST API documentation](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
         * 
         * @return builder
         * 
         */
        public Builder metric(@Nullable Output<String> metric) {
            $.metric = metric;
            return this;
        }

        /**
         * @param metric string specifying the metric to check.  The only supported metric is `RUN_DURATION_SECONDS` (check [Jobs REST API documentation](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
         * 
         * @return builder
         * 
         */
        public Builder metric(String metric) {
            return metric(Output.of(metric));
        }

        /**
         * @param op The string specifying the operation used to compare operands.  Currently, following operators are supported: `EQUAL_TO`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `NOT_EQUAL`. (Check the [API docs](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
         * 
         * This task does not require a cluster to execute and does not support retries or notifications.
         * 
         * @return builder
         * 
         */
        public Builder op(@Nullable Output<String> op) {
            $.op = op;
            return this;
        }

        /**
         * @param op The string specifying the operation used to compare operands.  Currently, following operators are supported: `EQUAL_TO`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `NOT_EQUAL`. (Check the [API docs](https://docs.databricks.com/api/workspace/jobs/create) for the latest information).
         * 
         * This task does not require a cluster to execute and does not support retries or notifications.
         * 
         * @return builder
         * 
         */
        public Builder op(String op) {
            return op(Output.of(op));
        }

        /**
         * @param value integer value used to compare to the given metric.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<Integer> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value integer value used to compare to the given metric.
         * 
         * @return builder
         * 
         */
        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public JobTaskHealthRuleArgs build() {
            return $;
        }
    }

}
