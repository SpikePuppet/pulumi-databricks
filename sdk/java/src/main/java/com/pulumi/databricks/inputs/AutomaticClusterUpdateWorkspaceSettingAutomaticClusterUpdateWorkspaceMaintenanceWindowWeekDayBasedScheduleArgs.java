// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTimeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs Empty = new AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs();

    @Import(name="dayOfWeek")
    private @Nullable Output<String> dayOfWeek;

    public Optional<Output<String>> dayOfWeek() {
        return Optional.ofNullable(this.dayOfWeek);
    }

    @Import(name="frequency")
    private @Nullable Output<String> frequency;

    public Optional<Output<String>> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    @Import(name="windowStartTime")
    private @Nullable Output<AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTimeArgs> windowStartTime;

    public Optional<Output<AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTimeArgs>> windowStartTime() {
        return Optional.ofNullable(this.windowStartTime);
    }

    private AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs() {}

    private AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs(AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs $) {
        this.dayOfWeek = $.dayOfWeek;
        this.frequency = $.frequency;
        this.windowStartTime = $.windowStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs $;

        public Builder() {
            $ = new AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs();
        }

        public Builder(AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs defaults) {
            $ = new AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs(Objects.requireNonNull(defaults));
        }

        public Builder dayOfWeek(@Nullable Output<String> dayOfWeek) {
            $.dayOfWeek = dayOfWeek;
            return this;
        }

        public Builder dayOfWeek(String dayOfWeek) {
            return dayOfWeek(Output.of(dayOfWeek));
        }

        public Builder frequency(@Nullable Output<String> frequency) {
            $.frequency = frequency;
            return this;
        }

        public Builder frequency(String frequency) {
            return frequency(Output.of(frequency));
        }

        public Builder windowStartTime(@Nullable Output<AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTimeArgs> windowStartTime) {
            $.windowStartTime = windowStartTime;
            return this;
        }

        public Builder windowStartTime(AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTimeArgs windowStartTime) {
            return windowStartTime(Output.of(windowStartTime));
        }

        public AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs build() {
            return $;
        }
    }

}