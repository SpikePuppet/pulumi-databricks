// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MountS3Args extends com.pulumi.resources.ResourceArgs {

    public static final MountS3Args Empty = new MountS3Args();

    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }

    @Import(name="instanceProfile")
    private @Nullable Output<String> instanceProfile;

    public Optional<Output<String>> instanceProfile() {
        return Optional.ofNullable(this.instanceProfile);
    }

    private MountS3Args() {}

    private MountS3Args(MountS3Args $) {
        this.bucketName = $.bucketName;
        this.instanceProfile = $.instanceProfile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MountS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MountS3Args $;

        public Builder() {
            $ = new MountS3Args();
        }

        public Builder(MountS3Args defaults) {
            $ = new MountS3Args(Objects.requireNonNull(defaults));
        }

        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder instanceProfile(@Nullable Output<String> instanceProfile) {
            $.instanceProfile = instanceProfile;
            return this;
        }

        public Builder instanceProfile(String instanceProfile) {
            return instanceProfile(Output.of(instanceProfile));
        }

        public MountS3Args build() {
            if ($.bucketName == null) {
                throw new MissingRequiredPropertyException("MountS3Args", "bucketName");
            }
            return $;
        }
    }

}
