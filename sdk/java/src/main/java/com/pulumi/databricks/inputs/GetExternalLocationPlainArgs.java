// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetExternalLocationExternalLocationInfo;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExternalLocationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExternalLocationPlainArgs Empty = new GetExternalLocationPlainArgs();

    @Import(name="externalLocationInfo")
    private @Nullable GetExternalLocationExternalLocationInfo externalLocationInfo;

    public Optional<GetExternalLocationExternalLocationInfo> externalLocationInfo() {
        return Optional.ofNullable(this.externalLocationInfo);
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

    private GetExternalLocationPlainArgs() {}

    private GetExternalLocationPlainArgs(GetExternalLocationPlainArgs $) {
        this.externalLocationInfo = $.externalLocationInfo;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExternalLocationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalLocationPlainArgs $;

        public Builder() {
            $ = new GetExternalLocationPlainArgs();
        }

        public Builder(GetExternalLocationPlainArgs defaults) {
            $ = new GetExternalLocationPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder externalLocationInfo(@Nullable GetExternalLocationExternalLocationInfo externalLocationInfo) {
            $.externalLocationInfo = externalLocationInfo;
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

        public GetExternalLocationPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetExternalLocationPlainArgs", "name");
            }
            return $;
        }
    }

}
