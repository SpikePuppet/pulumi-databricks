// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AccessControlRuleSetGrantRule {
    /**
     * @return a list of principals who are granted a role. The following format is supported:
     * * `users/{username}` (also exposed as `acl_principal_id` attribute of `databricks.User` resource).
     * * `groups/{groupname}` (also exposed as `acl_principal_id` attribute of `databricks.Group` resource).
     * * `servicePrincipals/{applicationId}` (also exposed as `acl_principal_id` attribute of `databricks.ServicePrincipal` resource).
     * 
     */
    private @Nullable List<String> principals;
    /**
     * @return Role to be granted. The supported roles are listed below. For more information about these roles, refer to [service principal roles](https://docs.databricks.com/security/auth-authz/access-control/service-principal-acl.html#service-principal-roles), [group roles](https://docs.databricks.com/en/administration-guide/users-groups/groups.html#manage-roles-on-an-account-group-using-the-workspace-admin-settings-page) or [marketplace roles](https://docs.databricks.com/en/marketplace/get-started-provider.html#assign-the-marketplace-admin-role).
     * * `roles/servicePrincipal.manager` - Manager of a service principal.
     * * `roles/servicePrincipal.user` - User of a service principal.
     * * `roles/group.manager` - Manager of a group.
     * * `roles/marketplace.admin` - Admin of marketplace.
     * 
     */
    private String role;

    private AccessControlRuleSetGrantRule() {}
    /**
     * @return a list of principals who are granted a role. The following format is supported:
     * * `users/{username}` (also exposed as `acl_principal_id` attribute of `databricks.User` resource).
     * * `groups/{groupname}` (also exposed as `acl_principal_id` attribute of `databricks.Group` resource).
     * * `servicePrincipals/{applicationId}` (also exposed as `acl_principal_id` attribute of `databricks.ServicePrincipal` resource).
     * 
     */
    public List<String> principals() {
        return this.principals == null ? List.of() : this.principals;
    }
    /**
     * @return Role to be granted. The supported roles are listed below. For more information about these roles, refer to [service principal roles](https://docs.databricks.com/security/auth-authz/access-control/service-principal-acl.html#service-principal-roles), [group roles](https://docs.databricks.com/en/administration-guide/users-groups/groups.html#manage-roles-on-an-account-group-using-the-workspace-admin-settings-page) or [marketplace roles](https://docs.databricks.com/en/marketplace/get-started-provider.html#assign-the-marketplace-admin-role).
     * * `roles/servicePrincipal.manager` - Manager of a service principal.
     * * `roles/servicePrincipal.user` - User of a service principal.
     * * `roles/group.manager` - Manager of a group.
     * * `roles/marketplace.admin` - Admin of marketplace.
     * 
     */
    public String role() {
        return this.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessControlRuleSetGrantRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> principals;
        private String role;
        public Builder() {}
        public Builder(AccessControlRuleSetGrantRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principals = defaults.principals;
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder principals(@Nullable List<String> principals) {
            this.principals = principals;
            return this;
        }
        public Builder principals(String... principals) {
            return principals(List.of(principals));
        }
        @CustomType.Setter
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public AccessControlRuleSetGrantRule build() {
            final var o = new AccessControlRuleSetGrantRule();
            o.principals = principals;
            o.role = role;
            return o;
        }
    }
}
