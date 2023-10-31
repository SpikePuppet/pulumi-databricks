// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.AccessControlRuleSetArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.AccessControlRuleSetState;
import com.pulumi.databricks.outputs.AccessControlRuleSetGrantRule;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to manage access rules on Databricks account level resources. For convenience we allow accessing this resource through the Databricks account and workspace.
 * 
 * &gt; **Note** Currently, we only support managing access rules on service principal, group and account resources through `databricks.AccessControlRuleSet`.
 * 
 * &gt; **Warning** `databricks.AccessControlRuleSet` cannot be used to manage access rules for resources supported by databricks_permissions. Refer to its documentation for more information.
 * 
 * ## Service principal rule set usage
 * 
 * Through a Databricks workspace:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetGroupArgs;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
 * import com.pulumi.databricks.AccessControlRuleSet;
 * import com.pulumi.databricks.AccessControlRuleSetArgs;
 * import com.pulumi.databricks.inputs.AccessControlRuleSetGrantRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var accountId = &#34;00000000-0000-0000-0000-000000000000&#34;;
 * 
 *         final var ds = DatabricksFunctions.getGroup(GetGroupArgs.builder()
 *             .displayName(&#34;Data Science&#34;)
 *             .build());
 * 
 *         var automationSp = new ServicePrincipal(&#34;automationSp&#34;, ServicePrincipalArgs.builder()        
 *             .displayName(&#34;SP_FOR_AUTOMATION&#34;)
 *             .build());
 * 
 *         var automationSpRuleSet = new AccessControlRuleSet(&#34;automationSpRuleSet&#34;, AccessControlRuleSetArgs.builder()        
 *             .grantRules(AccessControlRuleSetGrantRuleArgs.builder()
 *                 .principals(ds.applyValue(getGroupResult -&gt; getGroupResult.aclPrincipalId()))
 *                 .role(&#34;roles/servicePrincipal.user&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Through AWS Databricks account:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Group;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
 * import com.pulumi.databricks.AccessControlRuleSet;
 * import com.pulumi.databricks.AccessControlRuleSetArgs;
 * import com.pulumi.databricks.inputs.AccessControlRuleSetGrantRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var accountId = &#34;00000000-0000-0000-0000-000000000000&#34;;
 * 
 *         var ds = new Group(&#34;ds&#34;);
 * 
 *         var automationSp = new ServicePrincipal(&#34;automationSp&#34;, ServicePrincipalArgs.builder()        
 *             .displayName(&#34;SP_FOR_AUTOMATION&#34;)
 *             .build());
 * 
 *         var automationSpRuleSet = new AccessControlRuleSet(&#34;automationSpRuleSet&#34;, AccessControlRuleSetArgs.builder()        
 *             .grantRules(AccessControlRuleSetGrantRuleArgs.builder()
 *                 .principals(ds.aclPrincipalId())
 *                 .role(&#34;roles/servicePrincipal.user&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Through Azure Databricks account:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Group;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
 * import com.pulumi.databricks.AccessControlRuleSet;
 * import com.pulumi.databricks.AccessControlRuleSetArgs;
 * import com.pulumi.databricks.inputs.AccessControlRuleSetGrantRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var accountId = &#34;00000000-0000-0000-0000-000000000000&#34;;
 * 
 *         var ds = new Group(&#34;ds&#34;);
 * 
 *         var automationSp = new ServicePrincipal(&#34;automationSp&#34;, ServicePrincipalArgs.builder()        
 *             .applicationId(&#34;00000000-0000-0000-0000-000000000000&#34;)
 *             .displayName(&#34;SP_FOR_AUTOMATION&#34;)
 *             .build());
 * 
 *         var automationSpRuleSet = new AccessControlRuleSet(&#34;automationSpRuleSet&#34;, AccessControlRuleSetArgs.builder()        
 *             .grantRules(AccessControlRuleSetGrantRuleArgs.builder()
 *                 .principals(ds.aclPrincipalId())
 *                 .role(&#34;roles/servicePrincipal.user&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Through GCP Databricks account:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Group;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
 * import com.pulumi.databricks.AccessControlRuleSet;
 * import com.pulumi.databricks.AccessControlRuleSetArgs;
 * import com.pulumi.databricks.inputs.AccessControlRuleSetGrantRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var accountId = &#34;00000000-0000-0000-0000-000000000000&#34;;
 * 
 *         var ds = new Group(&#34;ds&#34;);
 * 
 *         var automationSp = new ServicePrincipal(&#34;automationSp&#34;, ServicePrincipalArgs.builder()        
 *             .displayName(&#34;SP_FOR_AUTOMATION&#34;)
 *             .build());
 * 
 *         var automationSpRuleSet = new AccessControlRuleSet(&#34;automationSpRuleSet&#34;, AccessControlRuleSetArgs.builder()        
 *             .grantRules(AccessControlRuleSetGrantRuleArgs.builder()
 *                 .principals(ds.aclPrincipalId())
 *                 .role(&#34;roles/servicePrincipal.user&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Group rule set usage
 * 
 * Refer to the appropriate provider configuration as shown in the examples for service principal rule set.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetGroupArgs;
 * import com.pulumi.databricks.inputs.GetUserArgs;
 * import com.pulumi.databricks.AccessControlRuleSet;
 * import com.pulumi.databricks.AccessControlRuleSetArgs;
 * import com.pulumi.databricks.inputs.AccessControlRuleSetGrantRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var accountId = &#34;00000000-0000-0000-0000-000000000000&#34;;
 * 
 *         final var ds = DatabricksFunctions.getGroup(GetGroupArgs.builder()
 *             .displayName(&#34;Data Science&#34;)
 *             .build());
 * 
 *         final var john = DatabricksFunctions.getUser(GetUserArgs.builder()
 *             .userName(&#34;john.doe@example.com&#34;)
 *             .build());
 * 
 *         var dsGroupRuleSet = new AccessControlRuleSet(&#34;dsGroupRuleSet&#34;, AccessControlRuleSetArgs.builder()        
 *             .grantRules(AccessControlRuleSetGrantRuleArgs.builder()
 *                 .principals(john.applyValue(getUserResult -&gt; getUserResult.aclPrincipalId()))
 *                 .role(&#34;roles/group.manager&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Account rule set usage
 * 
 * Refer to the appropriate provider configuration as shown in the examples for service principal rule set.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetGroupArgs;
 * import com.pulumi.databricks.inputs.GetUserArgs;
 * import com.pulumi.databricks.AccessControlRuleSet;
 * import com.pulumi.databricks.AccessControlRuleSetArgs;
 * import com.pulumi.databricks.inputs.AccessControlRuleSetGrantRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var accountId = &#34;00000000-0000-0000-0000-000000000000&#34;;
 * 
 *         final var ds = DatabricksFunctions.getGroup(GetGroupArgs.builder()
 *             .displayName(&#34;Data Science&#34;)
 *             .build());
 * 
 *         final var marketplaceAdmins = DatabricksFunctions.getGroup(GetGroupArgs.builder()
 *             .displayName(&#34;Marketplace Admins&#34;)
 *             .build());
 * 
 *         final var john = DatabricksFunctions.getUser(GetUserArgs.builder()
 *             .userName(&#34;john.doe@example.com&#34;)
 *             .build());
 * 
 *         var accountRuleSet = new AccessControlRuleSet(&#34;accountRuleSet&#34;, AccessControlRuleSetArgs.builder()        
 *             .grantRules(            
 *                 AccessControlRuleSetGrantRuleArgs.builder()
 *                     .principals(john.applyValue(getUserResult -&gt; getUserResult.aclPrincipalId()))
 *                     .role(&#34;roles/group.manager&#34;)
 *                     .build(),
 *                 AccessControlRuleSetGrantRuleArgs.builder()
 *                     .principals(ds.applyValue(getGroupResult -&gt; getGroupResult.aclPrincipalId()))
 *                     .role(&#34;roles/servicePrincipal.manager&#34;)
 *                     .build(),
 *                 AccessControlRuleSetGrantRuleArgs.builder()
 *                     .principals(marketplaceAdmins.applyValue(getGroupResult -&gt; getGroupResult.aclPrincipalId()))
 *                     .role(&#34;roles/marketplace.admin&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * databricks.Group
 * * databricks.User
 * * databricks.ServicePrincipal
 * 
 */
@ResourceType(type="databricks:index/accessControlRuleSet:AccessControlRuleSet")
public class AccessControlRuleSet extends com.pulumi.resources.CustomResource {
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.
     * 
     * !&gt; **Warning** Name uniquely identifies a rule set resource. Ensure all the grant_rules blocks for a rule set name are present in one `databricks.AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
     * 
     */
    @Export(name="grantRules", refs={List.class,AccessControlRuleSetGrantRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AccessControlRuleSetGrantRule>> grantRules;

    /**
     * @return The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.
     * 
     * !&gt; **Warning** Name uniquely identifies a rule set resource. Ensure all the grant_rules blocks for a rule set name are present in one `databricks.AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
     * 
     */
    public Output<Optional<List<AccessControlRuleSetGrantRule>>> grantRules() {
        return Codegen.optional(this.grantRules);
    }
    /**
     * Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
     * * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
     * * `accounts/{account_id}/groups/{group_id}/ruleSets/default`
     * * `accounts/{account_id}/ruleSets/default`
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
     * * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
     * * `accounts/{account_id}/groups/{group_id}/ruleSets/default`
     * * `accounts/{account_id}/ruleSets/default`
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessControlRuleSet(String name) {
        this(name, AccessControlRuleSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessControlRuleSet(String name, @Nullable AccessControlRuleSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessControlRuleSet(String name, @Nullable AccessControlRuleSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/accessControlRuleSet:AccessControlRuleSet", name, args == null ? AccessControlRuleSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessControlRuleSet(String name, Output<String> id, @Nullable AccessControlRuleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/accessControlRuleSet:AccessControlRuleSet", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AccessControlRuleSet get(String name, Output<String> id, @Nullable AccessControlRuleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessControlRuleSet(name, id, state, options);
    }
}
