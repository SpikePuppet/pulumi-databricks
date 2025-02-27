// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PermissionAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final PermissionAssignmentArgs Empty = new PermissionAssignmentArgs();

    /**
     * The list of workspace permissions to assign to the principal:
     * * `&#34;USER&#34;` - Can access the workspace with basic privileges.
     * * `&#34;ADMIN&#34;` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
     * 
     */
    @Import(name="permissions", required=true)
    private Output<List<String>> permissions;

    /**
     * @return The list of workspace permissions to assign to the principal:
     * * `&#34;USER&#34;` - Can access the workspace with basic privileges.
     * * `&#34;ADMIN&#34;` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
     * 
     */
    public Output<List<String>> permissions() {
        return this.permissions;
    }

    @Import(name="principalId", required=true)
    private Output<String> principalId;

    public Output<String> principalId() {
        return this.principalId;
    }

    private PermissionAssignmentArgs() {}

    private PermissionAssignmentArgs(PermissionAssignmentArgs $) {
        this.permissions = $.permissions;
        this.principalId = $.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PermissionAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PermissionAssignmentArgs $;

        public Builder() {
            $ = new PermissionAssignmentArgs();
        }

        public Builder(PermissionAssignmentArgs defaults) {
            $ = new PermissionAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param permissions The list of workspace permissions to assign to the principal:
         * * `&#34;USER&#34;` - Can access the workspace with basic privileges.
         * * `&#34;ADMIN&#34;` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
         * 
         * @return builder
         * 
         */
        public Builder permissions(Output<List<String>> permissions) {
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

        public Builder principalId(Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        public PermissionAssignmentArgs build() {
            if ($.permissions == null) {
                throw new MissingRequiredPropertyException("PermissionAssignmentArgs", "permissions");
            }
            if ($.principalId == null) {
                throw new MissingRequiredPropertyException("PermissionAssignmentArgs", "principalId");
            }
            return $;
        }
    }

}
