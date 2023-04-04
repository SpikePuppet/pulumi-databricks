// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTriggerFileArrival;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTrigger extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTrigger Empty = new GetJobJobSettingsSettingsTrigger();

    @Import(name="fileArrival", required=true)
    private GetJobJobSettingsSettingsTriggerFileArrival fileArrival;

    public GetJobJobSettingsSettingsTriggerFileArrival fileArrival() {
        return this.fileArrival;
    }

    @Import(name="pauseStatus", required=true)
    private String pauseStatus;

    public String pauseStatus() {
        return this.pauseStatus;
    }

    private GetJobJobSettingsSettingsTrigger() {}

    private GetJobJobSettingsSettingsTrigger(GetJobJobSettingsSettingsTrigger $) {
        this.fileArrival = $.fileArrival;
        this.pauseStatus = $.pauseStatus;
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

        public Builder fileArrival(GetJobJobSettingsSettingsTriggerFileArrival fileArrival) {
            $.fileArrival = fileArrival;
            return this;
        }

        public Builder pauseStatus(String pauseStatus) {
            $.pauseStatus = pauseStatus;
            return this;
        }

        public GetJobJobSettingsSettingsTrigger build() {
            $.fileArrival = Objects.requireNonNull($.fileArrival, "expected parameter 'fileArrival' to be non-null");
            $.pauseStatus = Objects.requireNonNull($.pauseStatus, "expected parameter 'pauseStatus' to be non-null");
            return $;
        }
    }

}
