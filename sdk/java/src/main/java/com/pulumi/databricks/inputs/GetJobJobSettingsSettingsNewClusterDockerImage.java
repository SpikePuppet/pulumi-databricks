// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsNewClusterDockerImageBasicAuth;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsNewClusterDockerImage extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsNewClusterDockerImage Empty = new GetJobJobSettingsSettingsNewClusterDockerImage();

    @Import(name="basicAuth")
    private @Nullable GetJobJobSettingsSettingsNewClusterDockerImageBasicAuth basicAuth;

    public Optional<GetJobJobSettingsSettingsNewClusterDockerImageBasicAuth> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }

    @Import(name="url", required=true)
    private String url;

    public String url() {
        return this.url;
    }

    private GetJobJobSettingsSettingsNewClusterDockerImage() {}

    private GetJobJobSettingsSettingsNewClusterDockerImage(GetJobJobSettingsSettingsNewClusterDockerImage $) {
        this.basicAuth = $.basicAuth;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsNewClusterDockerImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsNewClusterDockerImage $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsNewClusterDockerImage();
        }

        public Builder(GetJobJobSettingsSettingsNewClusterDockerImage defaults) {
            $ = new GetJobJobSettingsSettingsNewClusterDockerImage(Objects.requireNonNull(defaults));
        }

        public Builder basicAuth(@Nullable GetJobJobSettingsSettingsNewClusterDockerImageBasicAuth basicAuth) {
            $.basicAuth = basicAuth;
            return this;
        }

        public Builder url(String url) {
            $.url = url;
            return this;
        }

        public GetJobJobSettingsSettingsNewClusterDockerImage build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}