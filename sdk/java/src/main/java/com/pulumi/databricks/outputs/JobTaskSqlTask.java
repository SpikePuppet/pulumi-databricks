// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskSqlTaskAlert;
import com.pulumi.databricks.outputs.JobTaskSqlTaskDashboard;
import com.pulumi.databricks.outputs.JobTaskSqlTaskQuery;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskSqlTask {
    /**
     * @return block consisting of single string field: `alert_id` - identifier of the Databricks SQL Alert.
     * 
     */
    private @Nullable JobTaskSqlTaskAlert alert;
    /**
     * @return block consisting of single string field: `dashboard_id` - identifier of the Databricks SQL Dashboard databricks_sql_dashboard.
     * 
     */
    private @Nullable JobTaskSqlTaskDashboard dashboard;
    /**
     * @return (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
     * 
     */
    private @Nullable Map<String,Object> parameters;
    /**
     * @return block consisting of single string field: `query_id` - identifier of the Databricks SQL Query (databricks_sql_query).
     * 
     */
    private @Nullable JobTaskSqlTaskQuery query;
    /**
     * @return ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only Serverless &amp; Pro warehouses are supported right now.
     * 
     */
    private @Nullable String warehouseId;

    private JobTaskSqlTask() {}
    /**
     * @return block consisting of single string field: `alert_id` - identifier of the Databricks SQL Alert.
     * 
     */
    public Optional<JobTaskSqlTaskAlert> alert() {
        return Optional.ofNullable(this.alert);
    }
    /**
     * @return block consisting of single string field: `dashboard_id` - identifier of the Databricks SQL Dashboard databricks_sql_dashboard.
     * 
     */
    public Optional<JobTaskSqlTaskDashboard> dashboard() {
        return Optional.ofNullable(this.dashboard);
    }
    /**
     * @return (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
     * 
     */
    public Map<String,Object> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * @return block consisting of single string field: `query_id` - identifier of the Databricks SQL Query (databricks_sql_query).
     * 
     */
    public Optional<JobTaskSqlTaskQuery> query() {
        return Optional.ofNullable(this.query);
    }
    /**
     * @return ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only Serverless &amp; Pro warehouses are supported right now.
     * 
     */
    public Optional<String> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskSqlTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JobTaskSqlTaskAlert alert;
        private @Nullable JobTaskSqlTaskDashboard dashboard;
        private @Nullable Map<String,Object> parameters;
        private @Nullable JobTaskSqlTaskQuery query;
        private @Nullable String warehouseId;
        public Builder() {}
        public Builder(JobTaskSqlTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alert = defaults.alert;
    	      this.dashboard = defaults.dashboard;
    	      this.parameters = defaults.parameters;
    	      this.query = defaults.query;
    	      this.warehouseId = defaults.warehouseId;
        }

        @CustomType.Setter
        public Builder alert(@Nullable JobTaskSqlTaskAlert alert) {
            this.alert = alert;
            return this;
        }
        @CustomType.Setter
        public Builder dashboard(@Nullable JobTaskSqlTaskDashboard dashboard) {
            this.dashboard = dashboard;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable Map<String,Object> parameters) {
            this.parameters = parameters;
            return this;
        }
        @CustomType.Setter
        public Builder query(@Nullable JobTaskSqlTaskQuery query) {
            this.query = query;
            return this;
        }
        @CustomType.Setter
        public Builder warehouseId(@Nullable String warehouseId) {
            this.warehouseId = warehouseId;
            return this;
        }
        public JobTaskSqlTask build() {
            final var o = new JobTaskSqlTask();
            o.alert = alert;
            o.dashboard = dashboard;
            o.parameters = parameters;
            o.query = query;
            o.warehouseId = warehouseId;
            return o;
        }
    }
}
