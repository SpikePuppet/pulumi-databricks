// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobTaskForEachTaskTaskSqlTaskAlertArgs;
import com.pulumi.databricks.inputs.JobTaskForEachTaskTaskSqlTaskDashboardArgs;
import com.pulumi.databricks.inputs.JobTaskForEachTaskTaskSqlTaskFileArgs;
import com.pulumi.databricks.inputs.JobTaskForEachTaskTaskSqlTaskQueryArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskForEachTaskTaskSqlTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskForEachTaskTaskSqlTaskArgs Empty = new JobTaskForEachTaskTaskSqlTaskArgs();

    /**
     * block consisting of following fields:
     * 
     */
    @Import(name="alert")
    private @Nullable Output<JobTaskForEachTaskTaskSqlTaskAlertArgs> alert;

    /**
     * @return block consisting of following fields:
     * 
     */
    public Optional<Output<JobTaskForEachTaskTaskSqlTaskAlertArgs>> alert() {
        return Optional.ofNullable(this.alert);
    }

    /**
     * block consisting of following fields:
     * 
     */
    @Import(name="dashboard")
    private @Nullable Output<JobTaskForEachTaskTaskSqlTaskDashboardArgs> dashboard;

    /**
     * @return block consisting of following fields:
     * 
     */
    public Optional<Output<JobTaskForEachTaskTaskSqlTaskDashboardArgs>> dashboard() {
        return Optional.ofNullable(this.dashboard);
    }

    /**
     * block consisting of single string fields:
     * 
     */
    @Import(name="file")
    private @Nullable Output<JobTaskForEachTaskTaskSqlTaskFileArgs> file;

    /**
     * @return block consisting of single string fields:
     * 
     */
    public Optional<Output<JobTaskForEachTaskTaskSqlTaskFileArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,Object>> parameters;

    /**
     * @return (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
     * 
     */
    public Optional<Output<Map<String,Object>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * block consisting of single string field: `query_id` - identifier of the Databricks SQL Query (databricks_sql_query).
     * 
     */
    @Import(name="query")
    private @Nullable Output<JobTaskForEachTaskTaskSqlTaskQueryArgs> query;

    /**
     * @return block consisting of single string field: `query_id` - identifier of the Databricks SQL Query (databricks_sql_query).
     * 
     */
    public Optional<Output<JobTaskForEachTaskTaskSqlTaskQueryArgs>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only Serverless &amp; Pro warehouses are supported right now.
     * 
     */
    @Import(name="warehouseId")
    private @Nullable Output<String> warehouseId;

    /**
     * @return ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only Serverless &amp; Pro warehouses are supported right now.
     * 
     */
    public Optional<Output<String>> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    private JobTaskForEachTaskTaskSqlTaskArgs() {}

    private JobTaskForEachTaskTaskSqlTaskArgs(JobTaskForEachTaskTaskSqlTaskArgs $) {
        this.alert = $.alert;
        this.dashboard = $.dashboard;
        this.file = $.file;
        this.parameters = $.parameters;
        this.query = $.query;
        this.warehouseId = $.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskForEachTaskTaskSqlTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskForEachTaskTaskSqlTaskArgs $;

        public Builder() {
            $ = new JobTaskForEachTaskTaskSqlTaskArgs();
        }

        public Builder(JobTaskForEachTaskTaskSqlTaskArgs defaults) {
            $ = new JobTaskForEachTaskTaskSqlTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alert block consisting of following fields:
         * 
         * @return builder
         * 
         */
        public Builder alert(@Nullable Output<JobTaskForEachTaskTaskSqlTaskAlertArgs> alert) {
            $.alert = alert;
            return this;
        }

        /**
         * @param alert block consisting of following fields:
         * 
         * @return builder
         * 
         */
        public Builder alert(JobTaskForEachTaskTaskSqlTaskAlertArgs alert) {
            return alert(Output.of(alert));
        }

        /**
         * @param dashboard block consisting of following fields:
         * 
         * @return builder
         * 
         */
        public Builder dashboard(@Nullable Output<JobTaskForEachTaskTaskSqlTaskDashboardArgs> dashboard) {
            $.dashboard = dashboard;
            return this;
        }

        /**
         * @param dashboard block consisting of following fields:
         * 
         * @return builder
         * 
         */
        public Builder dashboard(JobTaskForEachTaskTaskSqlTaskDashboardArgs dashboard) {
            return dashboard(Output.of(dashboard));
        }

        /**
         * @param file block consisting of single string fields:
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<JobTaskForEachTaskTaskSqlTaskFileArgs> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file block consisting of single string fields:
         * 
         * @return builder
         * 
         */
        public Builder file(JobTaskForEachTaskTaskSqlTaskFileArgs file) {
            return file(Output.of(file));
        }

        /**
         * @param parameters (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,Object>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,Object> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param query block consisting of single string field: `query_id` - identifier of the Databricks SQL Query (databricks_sql_query).
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<JobTaskForEachTaskTaskSqlTaskQueryArgs> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query block consisting of single string field: `query_id` - identifier of the Databricks SQL Query (databricks_sql_query).
         * 
         * @return builder
         * 
         */
        public Builder query(JobTaskForEachTaskTaskSqlTaskQueryArgs query) {
            return query(Output.of(query));
        }

        /**
         * @param warehouseId ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only Serverless &amp; Pro warehouses are supported right now.
         * 
         * @return builder
         * 
         */
        public Builder warehouseId(@Nullable Output<String> warehouseId) {
            $.warehouseId = warehouseId;
            return this;
        }

        /**
         * @param warehouseId ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only Serverless &amp; Pro warehouses are supported right now.
         * 
         * @return builder
         * 
         */
        public Builder warehouseId(String warehouseId) {
            return warehouseId(Output.of(warehouseId));
        }

        public JobTaskForEachTaskTaskSqlTaskArgs build() {
            return $;
        }
    }

}