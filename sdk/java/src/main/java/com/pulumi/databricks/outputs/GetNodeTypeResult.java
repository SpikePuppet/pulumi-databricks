// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNodeTypeResult {
    private @Nullable String category;
    private @Nullable Boolean fleet;
    private @Nullable Integer gbPerCore;
    private @Nullable Boolean graviton;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable Boolean isIoCacheEnabled;
    private @Nullable Boolean localDisk;
    private @Nullable Integer localDiskMinSize;
    private @Nullable Integer minCores;
    private @Nullable Integer minGpus;
    private @Nullable Integer minMemoryGb;
    private @Nullable Boolean photonDriverCapable;
    private @Nullable Boolean photonWorkerCapable;
    private @Nullable Boolean supportPortForwarding;
    private @Nullable Boolean vcpu;

    private GetNodeTypeResult() {}
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    public Optional<Boolean> fleet() {
        return Optional.ofNullable(this.fleet);
    }
    public Optional<Integer> gbPerCore() {
        return Optional.ofNullable(this.gbPerCore);
    }
    public Optional<Boolean> graviton() {
        return Optional.ofNullable(this.graviton);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> isIoCacheEnabled() {
        return Optional.ofNullable(this.isIoCacheEnabled);
    }
    public Optional<Boolean> localDisk() {
        return Optional.ofNullable(this.localDisk);
    }
    public Optional<Integer> localDiskMinSize() {
        return Optional.ofNullable(this.localDiskMinSize);
    }
    public Optional<Integer> minCores() {
        return Optional.ofNullable(this.minCores);
    }
    public Optional<Integer> minGpus() {
        return Optional.ofNullable(this.minGpus);
    }
    public Optional<Integer> minMemoryGb() {
        return Optional.ofNullable(this.minMemoryGb);
    }
    public Optional<Boolean> photonDriverCapable() {
        return Optional.ofNullable(this.photonDriverCapable);
    }
    public Optional<Boolean> photonWorkerCapable() {
        return Optional.ofNullable(this.photonWorkerCapable);
    }
    public Optional<Boolean> supportPortForwarding() {
        return Optional.ofNullable(this.supportPortForwarding);
    }
    public Optional<Boolean> vcpu() {
        return Optional.ofNullable(this.vcpu);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeTypeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String category;
        private @Nullable Boolean fleet;
        private @Nullable Integer gbPerCore;
        private @Nullable Boolean graviton;
        private String id;
        private @Nullable Boolean isIoCacheEnabled;
        private @Nullable Boolean localDisk;
        private @Nullable Integer localDiskMinSize;
        private @Nullable Integer minCores;
        private @Nullable Integer minGpus;
        private @Nullable Integer minMemoryGb;
        private @Nullable Boolean photonDriverCapable;
        private @Nullable Boolean photonWorkerCapable;
        private @Nullable Boolean supportPortForwarding;
        private @Nullable Boolean vcpu;
        public Builder() {}
        public Builder(GetNodeTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.fleet = defaults.fleet;
    	      this.gbPerCore = defaults.gbPerCore;
    	      this.graviton = defaults.graviton;
    	      this.id = defaults.id;
    	      this.isIoCacheEnabled = defaults.isIoCacheEnabled;
    	      this.localDisk = defaults.localDisk;
    	      this.localDiskMinSize = defaults.localDiskMinSize;
    	      this.minCores = defaults.minCores;
    	      this.minGpus = defaults.minGpus;
    	      this.minMemoryGb = defaults.minMemoryGb;
    	      this.photonDriverCapable = defaults.photonDriverCapable;
    	      this.photonWorkerCapable = defaults.photonWorkerCapable;
    	      this.supportPortForwarding = defaults.supportPortForwarding;
    	      this.vcpu = defaults.vcpu;
        }

        @CustomType.Setter
        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder fleet(@Nullable Boolean fleet) {
            this.fleet = fleet;
            return this;
        }
        @CustomType.Setter
        public Builder gbPerCore(@Nullable Integer gbPerCore) {
            this.gbPerCore = gbPerCore;
            return this;
        }
        @CustomType.Setter
        public Builder graviton(@Nullable Boolean graviton) {
            this.graviton = graviton;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder isIoCacheEnabled(@Nullable Boolean isIoCacheEnabled) {
            this.isIoCacheEnabled = isIoCacheEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder localDisk(@Nullable Boolean localDisk) {
            this.localDisk = localDisk;
            return this;
        }
        @CustomType.Setter
        public Builder localDiskMinSize(@Nullable Integer localDiskMinSize) {
            this.localDiskMinSize = localDiskMinSize;
            return this;
        }
        @CustomType.Setter
        public Builder minCores(@Nullable Integer minCores) {
            this.minCores = minCores;
            return this;
        }
        @CustomType.Setter
        public Builder minGpus(@Nullable Integer minGpus) {
            this.minGpus = minGpus;
            return this;
        }
        @CustomType.Setter
        public Builder minMemoryGb(@Nullable Integer minMemoryGb) {
            this.minMemoryGb = minMemoryGb;
            return this;
        }
        @CustomType.Setter
        public Builder photonDriverCapable(@Nullable Boolean photonDriverCapable) {
            this.photonDriverCapable = photonDriverCapable;
            return this;
        }
        @CustomType.Setter
        public Builder photonWorkerCapable(@Nullable Boolean photonWorkerCapable) {
            this.photonWorkerCapable = photonWorkerCapable;
            return this;
        }
        @CustomType.Setter
        public Builder supportPortForwarding(@Nullable Boolean supportPortForwarding) {
            this.supportPortForwarding = supportPortForwarding;
            return this;
        }
        @CustomType.Setter
        public Builder vcpu(@Nullable Boolean vcpu) {
            this.vcpu = vcpu;
            return this;
        }
        public GetNodeTypeResult build() {
            final var o = new GetNodeTypeResult();
            o.category = category;
            o.fleet = fleet;
            o.gbPerCore = gbPerCore;
            o.graviton = graviton;
            o.id = id;
            o.isIoCacheEnabled = isIoCacheEnabled;
            o.localDisk = localDisk;
            o.localDiskMinSize = localDiskMinSize;
            o.minCores = minCores;
            o.minGpus = minGpus;
            o.minMemoryGb = minMemoryGb;
            o.photonDriverCapable = photonDriverCapable;
            o.photonWorkerCapable = photonWorkerCapable;
            o.supportPortForwarding = supportPortForwarding;
            o.vcpu = vcpu;
            return o;
        }
    }
}
