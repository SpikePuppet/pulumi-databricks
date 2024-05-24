// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetStorageCredentialStorageCredentialInfo;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStorageCredentialPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStorageCredentialPlainArgs Empty = new GetStorageCredentialPlainArgs();

    /**
     * Unique ID of storage credential.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Unique ID of storage credential.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the storage credential
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the storage credential
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * array of objects with information about storage credential.
     * 
     */
    @Import(name="storageCredentialInfo")
    private @Nullable GetStorageCredentialStorageCredentialInfo storageCredentialInfo;

    /**
     * @return array of objects with information about storage credential.
     * 
     */
    public Optional<GetStorageCredentialStorageCredentialInfo> storageCredentialInfo() {
        return Optional.ofNullable(this.storageCredentialInfo);
    }

    private GetStorageCredentialPlainArgs() {}

    private GetStorageCredentialPlainArgs(GetStorageCredentialPlainArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.storageCredentialInfo = $.storageCredentialInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStorageCredentialPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStorageCredentialPlainArgs $;

        public Builder() {
            $ = new GetStorageCredentialPlainArgs();
        }

        public Builder(GetStorageCredentialPlainArgs defaults) {
            $ = new GetStorageCredentialPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Unique ID of storage credential.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of the storage credential
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param storageCredentialInfo array of objects with information about storage credential.
         * 
         * @return builder
         * 
         */
        public Builder storageCredentialInfo(@Nullable GetStorageCredentialStorageCredentialInfo storageCredentialInfo) {
            $.storageCredentialInfo = storageCredentialInfo;
            return this;
        }

        public GetStorageCredentialPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetStorageCredentialPlainArgs", "name");
            }
            return $;
        }
    }

}
