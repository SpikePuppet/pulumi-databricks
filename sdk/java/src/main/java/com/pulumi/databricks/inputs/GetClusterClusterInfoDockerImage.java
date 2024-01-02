// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetClusterClusterInfoDockerImageBasicAuth;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterClusterInfoDockerImage extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoDockerImage Empty = new GetClusterClusterInfoDockerImage();

    @Import(name="basicAuth")
    private @Nullable GetClusterClusterInfoDockerImageBasicAuth basicAuth;

    public Optional<GetClusterClusterInfoDockerImageBasicAuth> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }

    @Import(name="url", required=true)
    private String url;

    public String url() {
        return this.url;
    }

    private GetClusterClusterInfoDockerImage() {}

    private GetClusterClusterInfoDockerImage(GetClusterClusterInfoDockerImage $) {
        this.basicAuth = $.basicAuth;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoDockerImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoDockerImage $;

        public Builder() {
            $ = new GetClusterClusterInfoDockerImage();
        }

        public Builder(GetClusterClusterInfoDockerImage defaults) {
            $ = new GetClusterClusterInfoDockerImage(Objects.requireNonNull(defaults));
        }

        public Builder basicAuth(@Nullable GetClusterClusterInfoDockerImageBasicAuth basicAuth) {
            $.basicAuth = basicAuth;
            return this;
        }

        public Builder url(String url) {
            $.url = url;
            return this;
        }

        public GetClusterClusterInfoDockerImage build() {
            if ($.url == null) {
                throw new MissingRequiredPropertyException("GetClusterClusterInfoDockerImage", "url");
            }
            return $;
        }
    }

}
