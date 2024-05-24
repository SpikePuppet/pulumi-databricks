// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.RestrictWorkspaceAdminsSettingArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.RestrictWorkspaceAdminsSettingState;
import com.pulumi.databricks.outputs.RestrictWorkspaceAdminsSettingRestrictWorkspaceAdmins;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * &gt; **Note** This resource could be only used with workspace-level provider!
 * 
 * The `databricks.RestrictWorkspaceAdminsSetting` resource lets you control the capabilities of workspace admins.
 * 
 * With the status set to `ALLOW_ALL`, workspace admins can:
 * 
 * 1. Create service principal personal access tokens on behalf of any service principal in their workspace.
 * 2. Change a job owner to any user in the workspace.
 * 3. Change the job run_as setting to any user in their workspace or a service principal on which they have the Service Principal User role.
 * 
 * With the status set to `RESTRICT_TOKENS_AND_JOB_RUN_AS`, workspace admins can:
 * 
 * 1. Only create personal access tokens on behalf of service principals on which they have the Service Principal User role.
 * 2. Only change a job owner to themselves.
 * 3. Only change the job run_as setting to themselves a service principal on which they have the Service Principal User role.
 * 
 * &gt; **Note** Only account admins can update the setting. And the account admin must be part of the workspace to change the setting status.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.RestrictWorkspaceAdminsSetting;
 * import com.pulumi.databricks.RestrictWorkspaceAdminsSettingArgs;
 * import com.pulumi.databricks.inputs.RestrictWorkspaceAdminsSettingRestrictWorkspaceAdminsArgs;
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
 *         var this_ = new RestrictWorkspaceAdminsSetting("this", RestrictWorkspaceAdminsSettingArgs.builder()
 *             .restrictWorkspaceAdmins(RestrictWorkspaceAdminsSettingRestrictWorkspaceAdminsArgs.builder()
 *                 .status("RESTRICT_TOKENS_AND_JOB_RUN_AS")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * This resource can be imported by predefined name `global`:
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/restrictWorkspaceAdminsSetting:RestrictWorkspaceAdminsSetting this global
 * ```
 * 
 */
@ResourceType(type="databricks:index/restrictWorkspaceAdminsSetting:RestrictWorkspaceAdminsSetting")
public class RestrictWorkspaceAdminsSetting extends com.pulumi.resources.CustomResource {
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The configuration details.
     * 
     */
    @Export(name="restrictWorkspaceAdmins", refs={RestrictWorkspaceAdminsSettingRestrictWorkspaceAdmins.class}, tree="[0]")
    private Output<RestrictWorkspaceAdminsSettingRestrictWorkspaceAdmins> restrictWorkspaceAdmins;

    /**
     * @return The configuration details.
     * 
     */
    public Output<RestrictWorkspaceAdminsSettingRestrictWorkspaceAdmins> restrictWorkspaceAdmins() {
        return this.restrictWorkspaceAdmins;
    }
    @Export(name="settingName", refs={String.class}, tree="[0]")
    private Output<String> settingName;

    public Output<String> settingName() {
        return this.settingName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RestrictWorkspaceAdminsSetting(String name) {
        this(name, RestrictWorkspaceAdminsSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RestrictWorkspaceAdminsSetting(String name, RestrictWorkspaceAdminsSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RestrictWorkspaceAdminsSetting(String name, RestrictWorkspaceAdminsSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/restrictWorkspaceAdminsSetting:RestrictWorkspaceAdminsSetting", name, args == null ? RestrictWorkspaceAdminsSettingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RestrictWorkspaceAdminsSetting(String name, Output<String> id, @Nullable RestrictWorkspaceAdminsSettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/restrictWorkspaceAdminsSetting:RestrictWorkspaceAdminsSetting", name, state, makeResourceOptions(options, id));
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
    public static RestrictWorkspaceAdminsSetting get(String name, Output<String> id, @Nullable RestrictWorkspaceAdminsSettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RestrictWorkspaceAdminsSetting(name, id, state, options);
    }
}
