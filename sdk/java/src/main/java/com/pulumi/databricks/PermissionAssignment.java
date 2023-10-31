// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.PermissionAssignmentArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.PermissionAssignmentState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="databricks:index/permissionAssignment:PermissionAssignment")
public class PermissionAssignment extends com.pulumi.resources.CustomResource {
    @Export(name="permissions", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> permissions;

    public Output<List<String>> permissions() {
        return this.permissions;
    }
    @Export(name="principalId", refs={Integer.class}, tree="[0]")
    private Output<Integer> principalId;

    public Output<Integer> principalId() {
        return this.principalId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PermissionAssignment(String name) {
        this(name, PermissionAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PermissionAssignment(String name, PermissionAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PermissionAssignment(String name, PermissionAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/permissionAssignment:PermissionAssignment", name, args == null ? PermissionAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PermissionAssignment(String name, Output<String> id, @Nullable PermissionAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/permissionAssignment:PermissionAssignment", name, state, makeResourceOptions(options, id));
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
    public static PermissionAssignment get(String name, Output<String> id, @Nullable PermissionAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PermissionAssignment(name, id, state, options);
    }
}
