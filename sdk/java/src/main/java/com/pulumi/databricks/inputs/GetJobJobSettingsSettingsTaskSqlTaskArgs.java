// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskSqlTaskAlertArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskSqlTaskFileArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskSqlTaskQueryArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskSqlTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskSqlTaskArgs Empty = new GetJobJobSettingsSettingsTaskSqlTaskArgs();

    @Import(name="alert")
    private @Nullable Output<GetJobJobSettingsSettingsTaskSqlTaskAlertArgs> alert;

    public Optional<Output<GetJobJobSettingsSettingsTaskSqlTaskAlertArgs>> alert() {
        return Optional.ofNullable(this.alert);
    }

    @Import(name="dashboard")
    private @Nullable Output<GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs> dashboard;

    public Optional<Output<GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs>> dashboard() {
        return Optional.ofNullable(this.dashboard);
    }

    @Import(name="file")
    private @Nullable Output<GetJobJobSettingsSettingsTaskSqlTaskFileArgs> file;

    public Optional<Output<GetJobJobSettingsSettingsTaskSqlTaskFileArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    @Import(name="parameters")
    private @Nullable Output<Map<String,Object>> parameters;

    public Optional<Output<Map<String,Object>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    @Import(name="query")
    private @Nullable Output<GetJobJobSettingsSettingsTaskSqlTaskQueryArgs> query;

    public Optional<Output<GetJobJobSettingsSettingsTaskSqlTaskQueryArgs>> query() {
        return Optional.ofNullable(this.query);
    }

    @Import(name="warehouseId", required=true)
    private Output<String> warehouseId;

    public Output<String> warehouseId() {
        return this.warehouseId;
    }

    private GetJobJobSettingsSettingsTaskSqlTaskArgs() {}

    private GetJobJobSettingsSettingsTaskSqlTaskArgs(GetJobJobSettingsSettingsTaskSqlTaskArgs $) {
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
    public static Builder builder(GetJobJobSettingsSettingsTaskSqlTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskSqlTaskArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskSqlTaskArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskSqlTaskArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskSqlTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder alert(@Nullable Output<GetJobJobSettingsSettingsTaskSqlTaskAlertArgs> alert) {
            $.alert = alert;
            return this;
        }

        public Builder alert(GetJobJobSettingsSettingsTaskSqlTaskAlertArgs alert) {
            return alert(Output.of(alert));
        }

        public Builder dashboard(@Nullable Output<GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs> dashboard) {
            $.dashboard = dashboard;
            return this;
        }

        public Builder dashboard(GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs dashboard) {
            return dashboard(Output.of(dashboard));
        }

        public Builder file(@Nullable Output<GetJobJobSettingsSettingsTaskSqlTaskFileArgs> file) {
            $.file = file;
            return this;
        }

        public Builder file(GetJobJobSettingsSettingsTaskSqlTaskFileArgs file) {
            return file(Output.of(file));
        }

        public Builder parameters(@Nullable Output<Map<String,Object>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,Object> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder query(@Nullable Output<GetJobJobSettingsSettingsTaskSqlTaskQueryArgs> query) {
            $.query = query;
            return this;
        }

        public Builder query(GetJobJobSettingsSettingsTaskSqlTaskQueryArgs query) {
            return query(Output.of(query));
        }

        public Builder warehouseId(Output<String> warehouseId) {
            $.warehouseId = warehouseId;
            return this;
        }

        public Builder warehouseId(String warehouseId) {
            return warehouseId(Output.of(warehouseId));
        }

        public GetJobJobSettingsSettingsTaskSqlTaskArgs build() {
            if ($.warehouseId == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskSqlTaskArgs", "warehouseId");
            }
            return $;
        }
    }

}
