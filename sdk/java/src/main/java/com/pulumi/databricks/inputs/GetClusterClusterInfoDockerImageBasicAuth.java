// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterClusterInfoDockerImageBasicAuth extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoDockerImageBasicAuth Empty = new GetClusterClusterInfoDockerImageBasicAuth();

    @Import(name="password", required=true)
    private String password;

    public String password() {
        return this.password;
    }

    @Import(name="username", required=true)
    private String username;

    public String username() {
        return this.username;
    }

    private GetClusterClusterInfoDockerImageBasicAuth() {}

    private GetClusterClusterInfoDockerImageBasicAuth(GetClusterClusterInfoDockerImageBasicAuth $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoDockerImageBasicAuth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoDockerImageBasicAuth $;

        public Builder() {
            $ = new GetClusterClusterInfoDockerImageBasicAuth();
        }

        public Builder(GetClusterClusterInfoDockerImageBasicAuth defaults) {
            $ = new GetClusterClusterInfoDockerImageBasicAuth(Objects.requireNonNull(defaults));
        }

        public Builder password(String password) {
            $.password = password;
            return this;
        }

        public Builder username(String username) {
            $.username = username;
            return this;
        }

        public GetClusterClusterInfoDockerImageBasicAuth build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}