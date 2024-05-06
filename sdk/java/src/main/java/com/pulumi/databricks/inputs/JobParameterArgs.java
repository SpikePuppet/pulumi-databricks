// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class JobParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobParameterArgs Empty = new JobParameterArgs();

    /**
     * Default value of the parameter.
     * 
     * *You can use this block only together with `task` blocks, not with the legacy tasks specification!*
     * 
     */
    @Import(name="default", required=true)
    private Output<String> default_;

    /**
     * @return Default value of the parameter.
     * 
     * *You can use this block only together with `task` blocks, not with the legacy tasks specification!*
     * 
     */
    public Output<String> default_() {
        return this.default_;
    }

    /**
     * The name of the defined parameter. May only contain alphanumeric characters, `_`, `-`, and `.`.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the defined parameter. May only contain alphanumeric characters, `_`, `-`, and `.`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private JobParameterArgs() {}

    private JobParameterArgs(JobParameterArgs $) {
        this.default_ = $.default_;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobParameterArgs $;

        public Builder() {
            $ = new JobParameterArgs();
        }

        public Builder(JobParameterArgs defaults) {
            $ = new JobParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param default_ Default value of the parameter.
         * 
         * *You can use this block only together with `task` blocks, not with the legacy tasks specification!*
         * 
         * @return builder
         * 
         */
        public Builder default_(Output<String> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ Default value of the parameter.
         * 
         * *You can use this block only together with `task` blocks, not with the legacy tasks specification!*
         * 
         * @return builder
         * 
         */
        public Builder default_(String default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param name The name of the defined parameter. May only contain alphanumeric characters, `_`, `-`, and `.`.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the defined parameter. May only contain alphanumeric characters, `_`, `-`, and `.`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public JobParameterArgs build() {
            if ($.default_ == null) {
                throw new MissingRequiredPropertyException("JobParameterArgs", "default_");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("JobParameterArgs", "name");
            }
            return $;
        }
    }

}
