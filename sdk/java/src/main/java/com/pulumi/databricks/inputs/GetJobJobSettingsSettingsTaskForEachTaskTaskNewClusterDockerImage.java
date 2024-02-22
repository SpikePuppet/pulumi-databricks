// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImage extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImage Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImage();

    @Import(name="basicAuth")
    private @Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth basicAuth;

    public Optional<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }

    @Import(name="url", required=true)
    private String url;

    public String url() {
        return this.url;
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImage() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImage(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImage $) {
        this.basicAuth = $.basicAuth;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImage $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImage();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImage defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImage(Objects.requireNonNull(defaults));
        }

        public Builder basicAuth(@Nullable GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth basicAuth) {
            $.basicAuth = basicAuth;
            return this;
        }

        public Builder url(String url) {
            $.url = url;
            return this;
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImage build() {
            if ($.url == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImage", "url");
            }
            return $;
        }
    }

}
