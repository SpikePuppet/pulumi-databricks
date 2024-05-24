// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutomaticClusterUpdateWorkspaceSettingState extends com.pulumi.resources.ResourceArgs {

    public static final AutomaticClusterUpdateWorkspaceSettingState Empty = new AutomaticClusterUpdateWorkspaceSettingState();

    @Import(name="automaticClusterUpdateWorkspace")
    private @Nullable Output<AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceArgs> automaticClusterUpdateWorkspace;

    public Optional<Output<AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceArgs>> automaticClusterUpdateWorkspace() {
        return Optional.ofNullable(this.automaticClusterUpdateWorkspace);
    }

    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="settingName")
    private @Nullable Output<String> settingName;

    public Optional<Output<String>> settingName() {
        return Optional.ofNullable(this.settingName);
    }

    private AutomaticClusterUpdateWorkspaceSettingState() {}

    private AutomaticClusterUpdateWorkspaceSettingState(AutomaticClusterUpdateWorkspaceSettingState $) {
        this.automaticClusterUpdateWorkspace = $.automaticClusterUpdateWorkspace;
        this.etag = $.etag;
        this.settingName = $.settingName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomaticClusterUpdateWorkspaceSettingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomaticClusterUpdateWorkspaceSettingState $;

        public Builder() {
            $ = new AutomaticClusterUpdateWorkspaceSettingState();
        }

        public Builder(AutomaticClusterUpdateWorkspaceSettingState defaults) {
            $ = new AutomaticClusterUpdateWorkspaceSettingState(Objects.requireNonNull(defaults));
        }

        public Builder automaticClusterUpdateWorkspace(@Nullable Output<AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceArgs> automaticClusterUpdateWorkspace) {
            $.automaticClusterUpdateWorkspace = automaticClusterUpdateWorkspace;
            return this;
        }

        public Builder automaticClusterUpdateWorkspace(AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceArgs automaticClusterUpdateWorkspace) {
            return automaticClusterUpdateWorkspace(Output.of(automaticClusterUpdateWorkspace));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder settingName(@Nullable Output<String> settingName) {
            $.settingName = settingName;
            return this;
        }

        public Builder settingName(String settingName) {
            return settingName(Output.of(settingName));
        }

        public AutomaticClusterUpdateWorkspaceSettingState build() {
            return $;
        }
    }

}
