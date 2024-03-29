// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.LakehouseMonitorNotificationsOnFailureArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LakehouseMonitorNotificationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LakehouseMonitorNotificationsArgs Empty = new LakehouseMonitorNotificationsArgs();

    @Import(name="onFailure")
    private @Nullable Output<LakehouseMonitorNotificationsOnFailureArgs> onFailure;

    public Optional<Output<LakehouseMonitorNotificationsOnFailureArgs>> onFailure() {
        return Optional.ofNullable(this.onFailure);
    }

    private LakehouseMonitorNotificationsArgs() {}

    private LakehouseMonitorNotificationsArgs(LakehouseMonitorNotificationsArgs $) {
        this.onFailure = $.onFailure;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LakehouseMonitorNotificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LakehouseMonitorNotificationsArgs $;

        public Builder() {
            $ = new LakehouseMonitorNotificationsArgs();
        }

        public Builder(LakehouseMonitorNotificationsArgs defaults) {
            $ = new LakehouseMonitorNotificationsArgs(Objects.requireNonNull(defaults));
        }

        public Builder onFailure(@Nullable Output<LakehouseMonitorNotificationsOnFailureArgs> onFailure) {
            $.onFailure = onFailure;
            return this;
        }

        public Builder onFailure(LakehouseMonitorNotificationsOnFailureArgs onFailure) {
            return onFailure(Output.of(onFailure));
        }

        public LakehouseMonitorNotificationsArgs build() {
            return $;
        }
    }

}
