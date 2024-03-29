// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.OnlineTableSpecArgs;
import com.pulumi.databricks.inputs.OnlineTableStatusArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OnlineTableState extends com.pulumi.resources.ResourceArgs {

    public static final OnlineTableState Empty = new OnlineTableState();

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

    /**
     * object describing status of the online table:
     * 
     */
    @Import(name="statuses")
    private @Nullable Output<List<OnlineTableStatusArgs>> statuses;

    /**
     * @return object describing status of the online table:
     * 
     */
    public Optional<Output<List<OnlineTableStatusArgs>>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    private OnlineTableState() {}

    private OnlineTableState(OnlineTableState $) {
        this.name = $.name;
        this.spec = $.spec;
        this.statuses = $.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OnlineTableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OnlineTableState $;

        public Builder() {
            $ = new OnlineTableState();
        }

        public Builder(OnlineTableState defaults) {
            $ = new OnlineTableState(Objects.requireNonNull(defaults));
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

        /**
         * @param statuses object describing status of the online table:
         * 
         * @return builder
         * 
         */
        public Builder statuses(@Nullable Output<List<OnlineTableStatusArgs>> statuses) {
            $.statuses = statuses;
            return this;
        }

        /**
         * @param statuses object describing status of the online table:
         * 
         * @return builder
         * 
         */
        public Builder statuses(List<OnlineTableStatusArgs> statuses) {
            return statuses(Output.of(statuses));
        }

        /**
         * @param statuses object describing status of the online table:
         * 
         * @return builder
         * 
         */
        public Builder statuses(OnlineTableStatusArgs... statuses) {
            return statuses(List.of(statuses));
        }

        public OnlineTableState build() {
            return $;
        }
    }

}
