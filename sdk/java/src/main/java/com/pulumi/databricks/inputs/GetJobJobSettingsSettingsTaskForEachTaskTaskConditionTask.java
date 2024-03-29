// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask();

    @Import(name="left", required=true)
    private String left;

    public String left() {
        return this.left;
    }

    @Import(name="op", required=true)
    private String op;

    public String op() {
        return this.op;
    }

    @Import(name="right", required=true)
    private String right;

    public String right() {
        return this.right;
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask(GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask $) {
        this.left = $.left;
        this.op = $.op;
        this.right = $.right;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask(Objects.requireNonNull(defaults));
        }

        public Builder left(String left) {
            $.left = left;
            return this;
        }

        public Builder op(String op) {
            $.op = op;
            return this;
        }

        public Builder right(String right) {
            $.right = right;
            return this;
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask build() {
            if ($.left == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask", "left");
            }
            if ($.op == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask", "op");
            }
            if ($.right == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTask", "right");
            }
            return $;
        }
    }

}
