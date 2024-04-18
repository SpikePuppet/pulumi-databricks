// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskSqlTaskFile {
    /**
     * @return If `source` is `GIT`: Relative path to the file in the repository specified in the `git_source` block with SQL commands to execute. If `source` is `WORKSPACE`: Absolute path to the file in the workspace with SQL commands to execute.
     * 
     * Example
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
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
     *             .name(&#34;Example SQL Job&#34;)
     *             .tasks(            
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_agg_query&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(sqlJobWarehouse.id())
     *                         .query(JobTaskSqlTaskQueryArgs.builder()
     *                             .queryId(aggQuery.id())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_dashboard&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(sqlJobWarehouse.id())
     *                         .dashboard(JobTaskSqlTaskDashboardArgs.builder()
     *                             .dashboardId(dash.id())
     *                             .subscriptions(JobTaskSqlTaskDashboardSubscriptionArgs.builder()
     *                                 .userName(&#34;user@domain.com&#34;)
     *                                 .build())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_alert&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(sqlJobWarehouse.id())
     *                         .alert(JobTaskSqlTaskAlertArgs.builder()
     *                             .alertId(alert.id())
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
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    private String path;
    /**
     * @return The source of the project. Possible values are `WORKSPACE` and `GIT`.  Defaults to `GIT` if a `git_source` block is present in the job definition.
     * 
     */
    private @Nullable String source;

    private JobTaskSqlTaskFile() {}
    /**
     * @return If `source` is `GIT`: Relative path to the file in the repository specified in the `git_source` block with SQL commands to execute. If `source` is `WORKSPACE`: Absolute path to the file in the workspace with SQL commands to execute.
     * 
     * Example
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
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
     *             .name(&#34;Example SQL Job&#34;)
     *             .tasks(            
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_agg_query&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(sqlJobWarehouse.id())
     *                         .query(JobTaskSqlTaskQueryArgs.builder()
     *                             .queryId(aggQuery.id())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_dashboard&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(sqlJobWarehouse.id())
     *                         .dashboard(JobTaskSqlTaskDashboardArgs.builder()
     *                             .dashboardId(dash.id())
     *                             .subscriptions(JobTaskSqlTaskDashboardSubscriptionArgs.builder()
     *                                 .userName(&#34;user@domain.com&#34;)
     *                                 .build())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey(&#34;run_alert&#34;)
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(sqlJobWarehouse.id())
     *                         .alert(JobTaskSqlTaskAlertArgs.builder()
     *                             .alertId(alert.id())
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
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The source of the project. Possible values are `WORKSPACE` and `GIT`.  Defaults to `GIT` if a `git_source` block is present in the job definition.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskSqlTaskFile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String path;
        private @Nullable String source;
        public Builder() {}
        public Builder(JobTaskSqlTaskFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("JobTaskSqlTaskFile", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {

            this.source = source;
            return this;
        }
        public JobTaskSqlTaskFile build() {
            final var _resultValue = new JobTaskSqlTaskFile();
            _resultValue.path = path;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}
