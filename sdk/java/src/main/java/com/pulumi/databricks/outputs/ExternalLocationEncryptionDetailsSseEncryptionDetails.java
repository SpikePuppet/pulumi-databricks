// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExternalLocationEncryptionDetailsSseEncryptionDetails {
    private @Nullable String algorithm;
    private @Nullable String awsKmsKeyArn;

    private ExternalLocationEncryptionDetailsSseEncryptionDetails() {}
    public Optional<String> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    public Optional<String> awsKmsKeyArn() {
        return Optional.ofNullable(this.awsKmsKeyArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalLocationEncryptionDetailsSseEncryptionDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String algorithm;
        private @Nullable String awsKmsKeyArn;
        public Builder() {}
        public Builder(ExternalLocationEncryptionDetailsSseEncryptionDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.awsKmsKeyArn = defaults.awsKmsKeyArn;
        }

        @CustomType.Setter
        public Builder algorithm(@Nullable String algorithm) {

            this.algorithm = algorithm;
            return this;
        }
        @CustomType.Setter
        public Builder awsKmsKeyArn(@Nullable String awsKmsKeyArn) {

            this.awsKmsKeyArn = awsKmsKeyArn;
            return this;
        }
        public ExternalLocationEncryptionDetailsSseEncryptionDetails build() {
            final var _resultValue = new ExternalLocationEncryptionDetailsSseEncryptionDetails();
            _resultValue.algorithm = algorithm;
            _resultValue.awsKmsKeyArn = awsKmsKeyArn;
            return _resultValue;
        }
    }
}
