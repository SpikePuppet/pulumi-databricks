// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MountAdl {
    private String clientId;
    private String clientSecretKey;
    private String clientSecretScope;
    private @Nullable String directory;
    private @Nullable String sparkConfPrefix;
    private @Nullable String storageResourceName;
    private @Nullable String tenantId;

    private MountAdl() {}
    public String clientId() {
        return this.clientId;
    }
    public String clientSecretKey() {
        return this.clientSecretKey;
    }
    public String clientSecretScope() {
        return this.clientSecretScope;
    }
    public Optional<String> directory() {
        return Optional.ofNullable(this.directory);
    }
    public Optional<String> sparkConfPrefix() {
        return Optional.ofNullable(this.sparkConfPrefix);
    }
    public Optional<String> storageResourceName() {
        return Optional.ofNullable(this.storageResourceName);
    }
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MountAdl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientId;
        private String clientSecretKey;
        private String clientSecretScope;
        private @Nullable String directory;
        private @Nullable String sparkConfPrefix;
        private @Nullable String storageResourceName;
        private @Nullable String tenantId;
        public Builder() {}
        public Builder(MountAdl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecretKey = defaults.clientSecretKey;
    	      this.clientSecretScope = defaults.clientSecretScope;
    	      this.directory = defaults.directory;
    	      this.sparkConfPrefix = defaults.sparkConfPrefix;
    	      this.storageResourceName = defaults.storageResourceName;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder clientId(String clientId) {
            if (clientId == null) {
              throw new MissingRequiredPropertyException("MountAdl", "clientId");
            }
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientSecretKey(String clientSecretKey) {
            if (clientSecretKey == null) {
              throw new MissingRequiredPropertyException("MountAdl", "clientSecretKey");
            }
            this.clientSecretKey = clientSecretKey;
            return this;
        }
        @CustomType.Setter
        public Builder clientSecretScope(String clientSecretScope) {
            if (clientSecretScope == null) {
              throw new MissingRequiredPropertyException("MountAdl", "clientSecretScope");
            }
            this.clientSecretScope = clientSecretScope;
            return this;
        }
        @CustomType.Setter
        public Builder directory(@Nullable String directory) {

            this.directory = directory;
            return this;
        }
        @CustomType.Setter
        public Builder sparkConfPrefix(@Nullable String sparkConfPrefix) {

            this.sparkConfPrefix = sparkConfPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder storageResourceName(@Nullable String storageResourceName) {

            this.storageResourceName = storageResourceName;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(@Nullable String tenantId) {

            this.tenantId = tenantId;
            return this;
        }
        public MountAdl build() {
            final var _resultValue = new MountAdl();
            _resultValue.clientId = clientId;
            _resultValue.clientSecretKey = clientSecretKey;
            _resultValue.clientSecretScope = clientSecretScope;
            _resultValue.directory = directory;
            _resultValue.sparkConfPrefix = sparkConfPrefix;
            _resultValue.storageResourceName = storageResourceName;
            _resultValue.tenantId = tenantId;
            return _resultValue;
        }
    }
}
