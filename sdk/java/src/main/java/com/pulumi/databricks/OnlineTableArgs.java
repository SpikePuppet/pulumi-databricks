// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.OnlineTableSpecArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OnlineTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final OnlineTableArgs Empty = new OnlineTableArgs();

    /**
     * 3-level name of the Online Table to create.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return 3-level name of the Online Table to create.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * object containing specification of the online table:
     * 
     */
    @Import(name="spec")
    private @Nullable Output<OnlineTableSpecArgs> spec;

    /**
     * @return object containing specification of the online table:
     * 
     */
    public Optional<Output<OnlineTableSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    private OnlineTableArgs() {}

    private OnlineTableArgs(OnlineTableArgs $) {
        this.name = $.name;
        this.spec = $.spec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OnlineTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OnlineTableArgs $;

        public Builder() {
            $ = new OnlineTableArgs();
        }

        public Builder(OnlineTableArgs defaults) {
            $ = new OnlineTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name 3-level name of the Online Table to create.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name 3-level name of the Online Table to create.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param spec object containing specification of the online table:
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<OnlineTableSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec object containing specification of the online table:
         * 
         * @return builder
         * 
         */
        public Builder spec(OnlineTableSpecArgs spec) {
            return spec(Output.of(spec));
        }

        public OnlineTableArgs build() {
            return $;
        }
    }

}
