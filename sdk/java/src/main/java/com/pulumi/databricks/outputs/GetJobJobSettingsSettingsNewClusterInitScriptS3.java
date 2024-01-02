// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsNewClusterInitScriptS3 {
    private @Nullable String cannedAcl;
    private String destination;
    private @Nullable Boolean enableEncryption;
    private @Nullable String encryptionType;
    private @Nullable String endpoint;
    private @Nullable String kmsKey;
    private @Nullable String region;

    private GetJobJobSettingsSettingsNewClusterInitScriptS3() {}
    public Optional<String> cannedAcl() {
        return Optional.ofNullable(this.cannedAcl);
    }
    public String destination() {
        return this.destination;
    }
    public Optional<Boolean> enableEncryption() {
        return Optional.ofNullable(this.enableEncryption);
    }
    public Optional<String> encryptionType() {
        return Optional.ofNullable(this.encryptionType);
    }
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    public Optional<String> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsNewClusterInitScriptS3 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cannedAcl;
        private String destination;
        private @Nullable Boolean enableEncryption;
        private @Nullable String encryptionType;
        private @Nullable String endpoint;
        private @Nullable String kmsKey;
        private @Nullable String region;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsNewClusterInitScriptS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cannedAcl = defaults.cannedAcl;
    	      this.destination = defaults.destination;
    	      this.enableEncryption = defaults.enableEncryption;
    	      this.encryptionType = defaults.encryptionType;
    	      this.endpoint = defaults.endpoint;
    	      this.kmsKey = defaults.kmsKey;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder cannedAcl(@Nullable String cannedAcl) {

            this.cannedAcl = cannedAcl;
            return this;
        }
        @CustomType.Setter
        public Builder destination(String destination) {
            if (destination == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsNewClusterInitScriptS3", "destination");
            }
            this.destination = destination;
            return this;
        }
        @CustomType.Setter
        public Builder enableEncryption(@Nullable Boolean enableEncryption) {

            this.enableEncryption = enableEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionType(@Nullable String encryptionType) {

            this.encryptionType = encryptionType;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(@Nullable String endpoint) {

            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKey(@Nullable String kmsKey) {

            this.kmsKey = kmsKey;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        public GetJobJobSettingsSettingsNewClusterInitScriptS3 build() {
            final var _resultValue = new GetJobJobSettingsSettingsNewClusterInitScriptS3();
            _resultValue.cannedAcl = cannedAcl;
            _resultValue.destination = destination;
            _resultValue.enableEncryption = enableEncryption;
            _resultValue.encryptionType = encryptionType;
            _resultValue.endpoint = endpoint;
            _resultValue.kmsKey = kmsKey;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
