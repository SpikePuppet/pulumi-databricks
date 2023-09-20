// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTriggerFileArrivalArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTriggerArgs Empty = new GetJobJobSettingsSettingsTriggerArgs();

    @Import(name="fileArrival", required=true)
    private Output<GetJobJobSettingsSettingsTriggerFileArrivalArgs> fileArrival;

    public Output<GetJobJobSettingsSettingsTriggerFileArrivalArgs> fileArrival() {
        return this.fileArrival;
    }

    @Import(name="pauseStatus")
    private @Nullable Output<String> pauseStatus;

    public Optional<Output<String>> pauseStatus() {
        return Optional.ofNullable(this.pauseStatus);
    }

    private GetJobJobSettingsSettingsTriggerArgs() {}

    private GetJobJobSettingsSettingsTriggerArgs(GetJobJobSettingsSettingsTriggerArgs $) {
        this.fileArrival = $.fileArrival;
        this.pauseStatus = $.pauseStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTriggerArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTriggerArgs();
        }

        public Builder(GetJobJobSettingsSettingsTriggerArgs defaults) {
            $ = new GetJobJobSettingsSettingsTriggerArgs(Objects.requireNonNull(defaults));
        }

        public Builder fileArrival(Output<GetJobJobSettingsSettingsTriggerFileArrivalArgs> fileArrival) {
            $.fileArrival = fileArrival;
            return this;
        }

        public Builder fileArrival(GetJobJobSettingsSettingsTriggerFileArrivalArgs fileArrival) {
            return fileArrival(Output.of(fileArrival));
        }

        public Builder pauseStatus(@Nullable Output<String> pauseStatus) {
            $.pauseStatus = pauseStatus;
            return this;
        }

        public Builder pauseStatus(String pauseStatus) {
            return pauseStatus(Output.of(pauseStatus));
        }

        public GetJobJobSettingsSettingsTriggerArgs build() {
            $.fileArrival = Objects.requireNonNull($.fileArrival, "expected parameter 'fileArrival' to be non-null");
            return $;
        }
    }

}
