// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskConditionTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskConditionTaskArgs Empty = new GetJobJobSettingsSettingsTaskConditionTaskArgs();

    @Import(name="left", required=true)
    private Output<String> left;

    public Output<String> left() {
        return this.left;
    }

    @Import(name="op", required=true)
    private Output<String> op;

    public Output<String> op() {
        return this.op;
    }

    @Import(name="right", required=true)
    private Output<String> right;

    public Output<String> right() {
        return this.right;
    }

    private GetJobJobSettingsSettingsTaskConditionTaskArgs() {}

    private GetJobJobSettingsSettingsTaskConditionTaskArgs(GetJobJobSettingsSettingsTaskConditionTaskArgs $) {
        this.left = $.left;
        this.op = $.op;
        this.right = $.right;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskConditionTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskConditionTaskArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskConditionTaskArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskConditionTaskArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskConditionTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder left(Output<String> left) {
            $.left = left;
            return this;
        }

        public Builder left(String left) {
            return left(Output.of(left));
        }

        public Builder op(Output<String> op) {
            $.op = op;
            return this;
        }

        public Builder op(String op) {
            return op(Output.of(op));
        }

        public Builder right(Output<String> right) {
            $.right = right;
            return this;
        }

        public Builder right(String right) {
            return right(Output.of(right));
        }

        public GetJobJobSettingsSettingsTaskConditionTaskArgs build() {
            if ($.left == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskConditionTaskArgs", "left");
            }
            if ($.op == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskConditionTaskArgs", "op");
            }
            if ($.right == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskConditionTaskArgs", "right");
            }
            return $;
        }
    }

}
