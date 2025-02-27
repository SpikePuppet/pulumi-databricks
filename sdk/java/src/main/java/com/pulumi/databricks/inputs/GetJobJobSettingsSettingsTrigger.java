// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTriggerFileArrival;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTriggerTableUpdate;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTrigger extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTrigger Empty = new GetJobJobSettingsSettingsTrigger();

    @Import(name="fileArrival")
    private @Nullable GetJobJobSettingsSettingsTriggerFileArrival fileArrival;

    public Optional<GetJobJobSettingsSettingsTriggerFileArrival> fileArrival() {
        return Optional.ofNullable(this.fileArrival);
    }

    @Import(name="pauseStatus")
    private @Nullable String pauseStatus;

    public Optional<String> pauseStatus() {
        return Optional.ofNullable(this.pauseStatus);
    }

    @Import(name="tableUpdate")
    private @Nullable GetJobJobSettingsSettingsTriggerTableUpdate tableUpdate;

    public Optional<GetJobJobSettingsSettingsTriggerTableUpdate> tableUpdate() {
        return Optional.ofNullable(this.tableUpdate);
    }

    private GetJobJobSettingsSettingsTrigger() {}

    private GetJobJobSettingsSettingsTrigger(GetJobJobSettingsSettingsTrigger $) {
        this.fileArrival = $.fileArrival;
        this.pauseStatus = $.pauseStatus;
        this.tableUpdate = $.tableUpdate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTrigger defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTrigger $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTrigger();
        }

        public Builder(GetJobJobSettingsSettingsTrigger defaults) {
            $ = new GetJobJobSettingsSettingsTrigger(Objects.requireNonNull(defaults));
        }

        public Builder fileArrival(@Nullable GetJobJobSettingsSettingsTriggerFileArrival fileArrival) {
            $.fileArrival = fileArrival;
            return this;
        }

        public Builder pauseStatus(@Nullable String pauseStatus) {
            $.pauseStatus = pauseStatus;
            return this;
        }

        public Builder tableUpdate(@Nullable GetJobJobSettingsSettingsTriggerTableUpdate tableUpdate) {
            $.tableUpdate = tableUpdate;
            return this;
        }

        public GetJobJobSettingsSettingsTrigger build() {
            return $;
        }
    }

}
