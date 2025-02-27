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


public final class PermissionsAccessControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final PermissionsAccessControlArgs Empty = new PermissionsAccessControlArgs();

    @Import(name="groupName")
    private @Nullable Output<String> groupName;

    public Optional<Output<String>> groupName() {
        return Optional.ofNullable(this.groupName);
    }

    @Import(name="permissionLevel", required=true)
    private Output<String> permissionLevel;

    public Output<String> permissionLevel() {
        return this.permissionLevel;
    }

    @Import(name="servicePrincipalName")
    private @Nullable Output<String> servicePrincipalName;

    public Optional<Output<String>> servicePrincipalName() {
        return Optional.ofNullable(this.servicePrincipalName);
    }

    @Import(name="userName")
    private @Nullable Output<String> userName;

    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private PermissionsAccessControlArgs() {}

    private PermissionsAccessControlArgs(PermissionsAccessControlArgs $) {
        this.groupName = $.groupName;
        this.permissionLevel = $.permissionLevel;
        this.servicePrincipalName = $.servicePrincipalName;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PermissionsAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PermissionsAccessControlArgs $;

        public Builder() {
            $ = new PermissionsAccessControlArgs();
        }

        public Builder(PermissionsAccessControlArgs defaults) {
            $ = new PermissionsAccessControlArgs(Objects.requireNonNull(defaults));
        }

        public Builder groupName(@Nullable Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        public Builder permissionLevel(Output<String> permissionLevel) {
            $.permissionLevel = permissionLevel;
            return this;
        }

        public Builder permissionLevel(String permissionLevel) {
            return permissionLevel(Output.of(permissionLevel));
        }

        public Builder servicePrincipalName(@Nullable Output<String> servicePrincipalName) {
            $.servicePrincipalName = servicePrincipalName;
            return this;
        }

        public Builder servicePrincipalName(String servicePrincipalName) {
            return servicePrincipalName(Output.of(servicePrincipalName));
        }

        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public PermissionsAccessControlArgs build() {
            if ($.permissionLevel == null) {
                throw new MissingRequiredPropertyException("PermissionsAccessControlArgs", "permissionLevel");
            }
            return $;
        }
    }

}
