// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetTableTableInfoRowFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetTableTableInfoRowFilter Empty = new GetTableTableInfoRowFilter();

    @Import(name="functionName", required=true)
    private String functionName;

    public String functionName() {
        return this.functionName;
    }

    @Import(name="inputColumnNames", required=true)
    private List<String> inputColumnNames;

    public List<String> inputColumnNames() {
        return this.inputColumnNames;
    }

    private GetTableTableInfoRowFilter() {}

    private GetTableTableInfoRowFilter(GetTableTableInfoRowFilter $) {
        this.functionName = $.functionName;
        this.inputColumnNames = $.inputColumnNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableTableInfoRowFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableTableInfoRowFilter $;

        public Builder() {
            $ = new GetTableTableInfoRowFilter();
        }

        public Builder(GetTableTableInfoRowFilter defaults) {
            $ = new GetTableTableInfoRowFilter(Objects.requireNonNull(defaults));
        }

        public Builder functionName(String functionName) {
            $.functionName = functionName;
            return this;
        }

        public Builder inputColumnNames(List<String> inputColumnNames) {
            $.inputColumnNames = inputColumnNames;
            return this;
        }

        public Builder inputColumnNames(String... inputColumnNames) {
            return inputColumnNames(List.of(inputColumnNames));
        }

        public GetTableTableInfoRowFilter build() {
            if ($.functionName == null) {
                throw new MissingRequiredPropertyException("GetTableTableInfoRowFilter", "functionName");
            }
            if ($.inputColumnNames == null) {
                throw new MissingRequiredPropertyException("GetTableTableInfoRowFilter", "inputColumnNames");
            }
            return $;
        }
    }

}
