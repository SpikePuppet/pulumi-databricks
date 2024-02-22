// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetStorageCredentialStorageCredentialInfoArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStorageCredentialArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStorageCredentialArgs Empty = new GetStorageCredentialArgs();

    /**
     * The name of the storage credential
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the storage credential
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="storageCredentialInfo")
    private @Nullable Output<GetStorageCredentialStorageCredentialInfoArgs> storageCredentialInfo;

    public Optional<Output<GetStorageCredentialStorageCredentialInfoArgs>> storageCredentialInfo() {
        return Optional.ofNullable(this.storageCredentialInfo);
    }

    private GetStorageCredentialArgs() {}

    private GetStorageCredentialArgs(GetStorageCredentialArgs $) {
        this.name = $.name;
        this.storageCredentialInfo = $.storageCredentialInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStorageCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStorageCredentialArgs $;

        public Builder() {
            $ = new GetStorageCredentialArgs();
        }

        public Builder(GetStorageCredentialArgs defaults) {
            $ = new GetStorageCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the storage credential
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the storage credential
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder storageCredentialInfo(@Nullable Output<GetStorageCredentialStorageCredentialInfoArgs> storageCredentialInfo) {
            $.storageCredentialInfo = storageCredentialInfo;
            return this;
        }

        public Builder storageCredentialInfo(GetStorageCredentialStorageCredentialInfoArgs storageCredentialInfo) {
            return storageCredentialInfo(Output.of(storageCredentialInfo));
        }

        public GetStorageCredentialArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetStorageCredentialArgs", "name");
            }
            return $;
        }
    }

}
