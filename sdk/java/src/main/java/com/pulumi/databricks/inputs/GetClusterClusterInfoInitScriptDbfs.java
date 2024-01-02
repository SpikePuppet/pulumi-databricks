// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetClusterClusterInfoInitScriptDbfs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoInitScriptDbfs Empty = new GetClusterClusterInfoInitScriptDbfs();

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    private GetClusterClusterInfoInitScriptDbfs() {}

    private GetClusterClusterInfoInitScriptDbfs(GetClusterClusterInfoInitScriptDbfs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoInitScriptDbfs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoInitScriptDbfs $;

        public Builder() {
            $ = new GetClusterClusterInfoInitScriptDbfs();
        }

        public Builder(GetClusterClusterInfoInitScriptDbfs defaults) {
            $ = new GetClusterClusterInfoInitScriptDbfs(Objects.requireNonNull(defaults));
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public GetClusterClusterInfoInitScriptDbfs build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetClusterClusterInfoInitScriptDbfs", "destination");
            }
            return $;
        }
    }

}
