// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetClusterClusterInfoInitScriptAbfss extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoInitScriptAbfss Empty = new GetClusterClusterInfoInitScriptAbfss();

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    private GetClusterClusterInfoInitScriptAbfss() {}

    private GetClusterClusterInfoInitScriptAbfss(GetClusterClusterInfoInitScriptAbfss $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoInitScriptAbfss defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoInitScriptAbfss $;

        public Builder() {
            $ = new GetClusterClusterInfoInitScriptAbfss();
        }

        public Builder(GetClusterClusterInfoInitScriptAbfss defaults) {
            $ = new GetClusterClusterInfoInitScriptAbfss(Objects.requireNonNull(defaults));
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public GetClusterClusterInfoInitScriptAbfss build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetClusterClusterInfoInitScriptAbfss", "destination");
            }
            return $;
        }
    }

}
