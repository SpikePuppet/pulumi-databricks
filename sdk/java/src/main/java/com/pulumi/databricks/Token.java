// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.TokenArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.TokenState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource creates [Personal Access Tokens](https://docs.databricks.com/sql/user/security/personal-access-tokens.html) for the same user that is authenticated with the provider. Most likely you should use databricks.OboToken to create [On-Behalf-Of tokens](https://docs.databricks.com/administration-guide/users-groups/service-principals.html#manage-personal-access-tokens-for-a-service-principal) for a databricks.ServicePrincipal in Databricks workspaces on AWS. Databricks workspaces on other clouds use their own native OAuth token flows.
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
 * import com.pulumi.databricks.Token;
 * import com.pulumi.databricks.TokenArgs;
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
 *         // create PAT token to provision entities within workspace
 *         var pat = new Token("pat", TokenArgs.builder()        
 *             .comment("Terraform Provisioning")
 *             .lifetimeSeconds(8640000)
 *             .build());
 * 
 *         ctx.export("databricksToken", pat.tokenValue());
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * A token can be automatically rotated by taking a dependency on the `time_rotating` resource:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.time.Rotating;
 * import com.pulumi.time.RotatingArgs;
 * import com.pulumi.databricks.Token;
 * import com.pulumi.databricks.TokenArgs;
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
 *         var this_ = new Rotating("this", RotatingArgs.builder()        
 *             .rotationDays(30)
 *             .build());
 * 
 *         var pat = new Token("pat", TokenArgs.builder()        
 *             .comment(this_.rfc3339().applyValue(rfc3339 -> String.format("Terraform (created: %s)", rfc3339)))
 *             .lifetimeSeconds(60 * 24 * 60 * 60)
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
 * -&gt; **Note** Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/token:Token")
public class Token extends com.pulumi.resources.CustomResource {
    /**
     * (String) Comment that will appear on the user’s settings page for this token.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return (String) Comment that will appear on the user’s settings page for this token.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    @Export(name="creationTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> creationTime;

    public Output<Integer> creationTime() {
        return this.creationTime;
    }
    @Export(name="expiryTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> expiryTime;

    public Output<Integer> expiryTime() {
        return this.expiryTime;
    }
    /**
     * (Integer) The lifetime of the token, in seconds. If no lifetime is specified, the token remains valid indefinitely.
     * 
     */
    @Export(name="lifetimeSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> lifetimeSeconds;

    /**
     * @return (Integer) The lifetime of the token, in seconds. If no lifetime is specified, the token remains valid indefinitely.
     * 
     */
    public Output<Optional<Integer>> lifetimeSeconds() {
        return Codegen.optional(this.lifetimeSeconds);
    }
    @Export(name="tokenId", refs={String.class}, tree="[0]")
    private Output<String> tokenId;

    public Output<String> tokenId() {
        return this.tokenId;
    }
    /**
     * **Sensitive** value of the newly-created token.
     * 
     */
    @Export(name="tokenValue", refs={String.class}, tree="[0]")
    private Output<String> tokenValue;

    /**
     * @return **Sensitive** value of the newly-created token.
     * 
     */
    public Output<String> tokenValue() {
        return this.tokenValue;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Token(String name) {
        this(name, TokenArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Token(String name, @Nullable TokenArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Token(String name, @Nullable TokenArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/token:Token", name, args == null ? TokenArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Token(String name, Output<String> id, @Nullable TokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/token:Token", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "tokenValue"
            ))
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
    public static Token get(String name, Output<String> id, @Nullable TokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Token(name, id, state, options);
    }
}
