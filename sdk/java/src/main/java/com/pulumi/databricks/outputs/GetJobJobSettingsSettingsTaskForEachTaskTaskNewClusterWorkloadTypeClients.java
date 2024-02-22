// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeClients {
    private @Nullable Boolean jobs;
    private @Nullable Boolean notebooks;

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeClients() {}
    public Optional<Boolean> jobs() {
        return Optional.ofNullable(this.jobs);
    }
    public Optional<Boolean> notebooks() {
        return Optional.ofNullable(this.notebooks);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeClients defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean jobs;
        private @Nullable Boolean notebooks;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeClients defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobs = defaults.jobs;
    	      this.notebooks = defaults.notebooks;
        }

        @CustomType.Setter
        public Builder jobs(@Nullable Boolean jobs) {

            this.jobs = jobs;
            return this;
        }
        @CustomType.Setter
        public Builder notebooks(@Nullable Boolean notebooks) {

            this.notebooks = notebooks;
            return this;
        }
        public GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeClients build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeClients();
            _resultValue.jobs = jobs;
            _resultValue.notebooks = notebooks;
            return _resultValue;
        }
    }
}
