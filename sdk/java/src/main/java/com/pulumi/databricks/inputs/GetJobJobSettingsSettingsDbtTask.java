// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsDbtTask extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsDbtTask Empty = new GetJobJobSettingsSettingsDbtTask();

    @Import(name="catalog")
    private @Nullable String catalog;

    public Optional<String> catalog() {
        return Optional.ofNullable(this.catalog);
    }

    @Import(name="commands", required=true)
    private List<String> commands;

    public List<String> commands() {
        return this.commands;
    }

    @Import(name="profilesDirectory")
    private @Nullable String profilesDirectory;

    public Optional<String> profilesDirectory() {
        return Optional.ofNullable(this.profilesDirectory);
    }

    @Import(name="projectDirectory")
    private @Nullable String projectDirectory;

    public Optional<String> projectDirectory() {
        return Optional.ofNullable(this.projectDirectory);
    }

    @Import(name="schema")
    private @Nullable String schema;

    public Optional<String> schema() {
        return Optional.ofNullable(this.schema);
    }

    @Import(name="warehouseId")
    private @Nullable String warehouseId;

    public Optional<String> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    private GetJobJobSettingsSettingsDbtTask() {}

    private GetJobJobSettingsSettingsDbtTask(GetJobJobSettingsSettingsDbtTask $) {
        this.catalog = $.catalog;
        this.commands = $.commands;
        this.profilesDirectory = $.profilesDirectory;
        this.projectDirectory = $.projectDirectory;
        this.schema = $.schema;
        this.warehouseId = $.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsDbtTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsDbtTask $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsDbtTask();
        }

        public Builder(GetJobJobSettingsSettingsDbtTask defaults) {
            $ = new GetJobJobSettingsSettingsDbtTask(Objects.requireNonNull(defaults));
        }

        public Builder catalog(@Nullable String catalog) {
            $.catalog = catalog;
            return this;
        }

        public Builder commands(List<String> commands) {
            $.commands = commands;
            return this;
        }

        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }

        public Builder profilesDirectory(@Nullable String profilesDirectory) {
            $.profilesDirectory = profilesDirectory;
            return this;
        }

        public Builder projectDirectory(@Nullable String projectDirectory) {
            $.projectDirectory = projectDirectory;
            return this;
        }

        public Builder schema(@Nullable String schema) {
            $.schema = schema;
            return this;
        }

        public Builder warehouseId(@Nullable String warehouseId) {
            $.warehouseId = warehouseId;
            return this;
        }

        public GetJobJobSettingsSettingsDbtTask build() {
            if ($.commands == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsDbtTask", "commands");
            }
            return $;
        }
    }

}
