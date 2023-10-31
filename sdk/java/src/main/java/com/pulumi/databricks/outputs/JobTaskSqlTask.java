// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskSqlTaskAlert;
import com.pulumi.databricks.outputs.JobTaskSqlTaskDashboard;
import com.pulumi.databricks.outputs.JobTaskSqlTaskFile;
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
     * @return block consisting of following fields:
     * 
     */
    private @Nullable JobTaskSqlTaskAlert alert;
    /**
     * @return block consisting of following fields:
     * 
     */
    private @Nullable JobTaskSqlTaskDashboard dashboard;
    /**
     * @return block consisting of single string field: `path` - a relative path to the file (inside the Git repository) with SQL commands to execute.  *Requires `git_source` configuration block*.
     * 
     * Example
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.databricks.Job;
     * import com.pulumi.databricks.JobArgs;
     * import com.pulumi.databricks.inputs.JobTaskArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskQueryArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskDashboardArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskAlertArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var sqlAggregationJob = new Job(&#34;sqlAggregationJob&#34;, JobArgs.builder()        
     *             .tasks(            
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_agg_query&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
     *                         .query(JobTaskSqlTaskQueryArgs.builder()
     *                             .queryId(databricks_sql_query.agg_query().id())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_dashboard&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
     *                         .dashboard(JobTaskSqlTaskDashboardArgs.builder()
     *                             .dashboardId(databricks_sql_dashboard.dash().id())
     *                             .subscriptions(JobTaskSqlTaskDashboardSubscriptionArgs.builder()
     *                                 .userName(&#34;user@domain.com&#34;)
     *                                 .build())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_alert&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
     *                         .alert(JobTaskSqlTaskAlertArgs.builder()
     *                             .alertId(databricks_sql_alert.alert().id())
     *                             .subscriptions(JobTaskSqlTaskAlertSubscriptionArgs.builder()
     *                                 .userName(&#34;user@domain.com&#34;)
     *                                 .build())
     *                             .build())
     *                         .build())
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    private @Nullable JobTaskSqlTaskFile file;
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
     * @return block consisting of following fields:
     * 
     */
    public Optional<JobTaskSqlTaskAlert> alert() {
        return Optional.ofNullable(this.alert);
    }
    /**
     * @return block consisting of following fields:
     * 
     */
    public Optional<JobTaskSqlTaskDashboard> dashboard() {
        return Optional.ofNullable(this.dashboard);
    }
    /**
     * @return block consisting of single string field: `path` - a relative path to the file (inside the Git repository) with SQL commands to execute.  *Requires `git_source` configuration block*.
     * 
     * Example
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.databricks.Job;
     * import com.pulumi.databricks.JobArgs;
     * import com.pulumi.databricks.inputs.JobTaskArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskQueryArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskDashboardArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskAlertArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var sqlAggregationJob = new Job(&#34;sqlAggregationJob&#34;, JobArgs.builder()        
     *             .tasks(            
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_agg_query&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
     *                         .query(JobTaskSqlTaskQueryArgs.builder()
     *                             .queryId(databricks_sql_query.agg_query().id())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_dashboard&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
     *                         .dashboard(JobTaskSqlTaskDashboardArgs.builder()
     *                             .dashboardId(databricks_sql_dashboard.dash().id())
     *                             .subscriptions(JobTaskSqlTaskDashboardSubscriptionArgs.builder()
     *                                 .userName(&#34;user@domain.com&#34;)
     *                                 .build())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_alert&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(databricks_sql_endpoint.sql_job_warehouse().id())
     *                         .alert(JobTaskSqlTaskAlertArgs.builder()
     *                             .alertId(databricks_sql_alert.alert().id())
     *                             .subscriptions(JobTaskSqlTaskAlertSubscriptionArgs.builder()
     *                                 .userName(&#34;user@domain.com&#34;)
     *                                 .build())
     *                             .build())
     *                         .build())
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public Optional<JobTaskSqlTaskFile> file() {
        return Optional.ofNullable(this.file);
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
        private @Nullable JobTaskSqlTaskFile file;
        private @Nullable Map<String,Object> parameters;
        private @Nullable JobTaskSqlTaskQuery query;
        private @Nullable String warehouseId;
        public Builder() {}
        public Builder(JobTaskSqlTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alert = defaults.alert;
    	      this.dashboard = defaults.dashboard;
    	      this.file = defaults.file;
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
        public Builder file(@Nullable JobTaskSqlTaskFile file) {
            this.file = file;
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
            final var _resultValue = new JobTaskSqlTask();
            _resultValue.alert = alert;
            _resultValue.dashboard = dashboard;
            _resultValue.file = file;
            _resultValue.parameters = parameters;
            _resultValue.query = query;
            _resultValue.warehouseId = warehouseId;
            return _resultValue;
        }
    }
}
