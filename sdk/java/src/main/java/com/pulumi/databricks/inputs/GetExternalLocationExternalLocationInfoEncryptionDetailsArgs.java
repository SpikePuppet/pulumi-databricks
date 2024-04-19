// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetExternalLocationExternalLocationInfoEncryptionDetailsSseEncryptionDetailsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExternalLocationExternalLocationInfoEncryptionDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetExternalLocationExternalLocationInfoEncryptionDetailsArgs Empty = new GetExternalLocationExternalLocationInfoEncryptionDetailsArgs();

    @Import(name="sseEncryptionDetails")
    private @Nullable Output<GetExternalLocationExternalLocationInfoEncryptionDetailsSseEncryptionDetailsArgs> sseEncryptionDetails;

    public Optional<Output<GetExternalLocationExternalLocationInfoEncryptionDetailsSseEncryptionDetailsArgs>> sseEncryptionDetails() {
        return Optional.ofNullable(this.sseEncryptionDetails);
    }

    private GetExternalLocationExternalLocationInfoEncryptionDetailsArgs() {}

    private GetExternalLocationExternalLocationInfoEncryptionDetailsArgs(GetExternalLocationExternalLocationInfoEncryptionDetailsArgs $) {
        this.sseEncryptionDetails = $.sseEncryptionDetails;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExternalLocationExternalLocationInfoEncryptionDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalLocationExternalLocationInfoEncryptionDetailsArgs $;

        public Builder() {
            $ = new GetExternalLocationExternalLocationInfoEncryptionDetailsArgs();
        }

        public Builder(GetExternalLocationExternalLocationInfoEncryptionDetailsArgs defaults) {
            $ = new GetExternalLocationExternalLocationInfoEncryptionDetailsArgs(Objects.requireNonNull(defaults));
        }

        public Builder sseEncryptionDetails(@Nullable Output<GetExternalLocationExternalLocationInfoEncryptionDetailsSseEncryptionDetailsArgs> sseEncryptionDetails) {
            $.sseEncryptionDetails = sseEncryptionDetails;
            return this;
        }

        public Builder sseEncryptionDetails(GetExternalLocationExternalLocationInfoEncryptionDetailsSseEncryptionDetailsArgs sseEncryptionDetails) {
            return sseEncryptionDetails(Output.of(sseEncryptionDetails));
        }

        public GetExternalLocationExternalLocationInfoEncryptionDetailsArgs build() {
            return $;
        }
    }

}
