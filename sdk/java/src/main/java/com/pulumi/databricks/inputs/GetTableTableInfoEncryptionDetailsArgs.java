// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetTableTableInfoEncryptionDetailsSseEncryptionDetailsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTableTableInfoEncryptionDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetTableTableInfoEncryptionDetailsArgs Empty = new GetTableTableInfoEncryptionDetailsArgs();

    @Import(name="sseEncryptionDetails")
    private @Nullable Output<GetTableTableInfoEncryptionDetailsSseEncryptionDetailsArgs> sseEncryptionDetails;

    public Optional<Output<GetTableTableInfoEncryptionDetailsSseEncryptionDetailsArgs>> sseEncryptionDetails() {
        return Optional.ofNullable(this.sseEncryptionDetails);
    }

    private GetTableTableInfoEncryptionDetailsArgs() {}

    private GetTableTableInfoEncryptionDetailsArgs(GetTableTableInfoEncryptionDetailsArgs $) {
        this.sseEncryptionDetails = $.sseEncryptionDetails;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableTableInfoEncryptionDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableTableInfoEncryptionDetailsArgs $;

        public Builder() {
            $ = new GetTableTableInfoEncryptionDetailsArgs();
        }

        public Builder(GetTableTableInfoEncryptionDetailsArgs defaults) {
            $ = new GetTableTableInfoEncryptionDetailsArgs(Objects.requireNonNull(defaults));
        }

        public Builder sseEncryptionDetails(@Nullable Output<GetTableTableInfoEncryptionDetailsSseEncryptionDetailsArgs> sseEncryptionDetails) {
            $.sseEncryptionDetails = sseEncryptionDetails;
            return this;
        }

        public Builder sseEncryptionDetails(GetTableTableInfoEncryptionDetailsSseEncryptionDetailsArgs sseEncryptionDetails) {
            return sseEncryptionDetails(Output.of(sseEncryptionDetails));
        }

        public GetTableTableInfoEncryptionDetailsArgs build() {
            return $;
        }
    }

}
