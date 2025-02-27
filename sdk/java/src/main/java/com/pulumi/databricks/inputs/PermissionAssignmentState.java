// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PermissionAssignmentState extends com.pulumi.resources.ResourceArgs {

    public static final PermissionAssignmentState Empty = new PermissionAssignmentState();

    /**
     * The list of workspace permissions to assign to the principal:
     * * `&#34;USER&#34;` - Can access the workspace with basic privileges.
     * * `&#34;ADMIN&#34;` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<List<String>> permissions;

    /**
     * @return The list of workspace permissions to assign to the principal:
     * * `&#34;USER&#34;` - Can access the workspace with basic privileges.
     * * `&#34;ADMIN&#34;` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
     * 
     */
    public Optional<Output<List<String>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    private PermissionAssignmentState() {}

    private PermissionAssignmentState(PermissionAssignmentState $) {
        this.permissions = $.permissions;
        this.principalId = $.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PermissionAssignmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PermissionAssignmentState $;

        public Builder() {
            $ = new PermissionAssignmentState();
        }

        public Builder(PermissionAssignmentState defaults) {
            $ = new PermissionAssignmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param permissions The list of workspace permissions to assign to the principal:
         * * `&#34;USER&#34;` - Can access the workspace with basic privileges.
         * * `&#34;ADMIN&#34;` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<List<String>> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions The list of workspace permissions to assign to the principal:
         * * `&#34;USER&#34;` - Can access the workspace with basic privileges.
         * * `&#34;ADMIN&#34;` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
         * 
         * @return builder
         * 
         */
        public Builder permissions(List<String> permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param permissions The list of workspace permissions to assign to the principal:
         * * `&#34;USER&#34;` - Can access the workspace with basic privileges.
         * * `&#34;ADMIN&#34;` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
         * 
         * @return builder
         * 
         */
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }

        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        public PermissionAssignmentState build() {
            return $;
        }
    }

}
