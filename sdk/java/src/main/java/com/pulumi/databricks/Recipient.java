// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.RecipientArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.RecipientState;
import com.pulumi.databricks.outputs.RecipientIpAccessList;
import com.pulumi.databricks.outputs.RecipientToken;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **Note** This resource could be only used with workspace-level provider!
 * 
 * Within a metastore, Unity Catalog provides the ability to create a recipient to attach delta shares to.
 * 
 * A `databricks.Recipient` is contained within databricks.Metastore and can have permissions to `SELECT` from a list of shares.
 * 
 * ## Example Usage
 * ### Databricks Sharing with non databricks recipient
 * 
 * Setting `authentication_type` type to `TOKEN` creates a temporary url to download a credentials file. This is used to
 * authenticate to the sharing server to access data. This is for when the recipient is not using Databricks.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.random.RandomPassword;
 * import com.pulumi.random.RandomPasswordArgs;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.Recipient;
 * import com.pulumi.databricks.RecipientArgs;
 * import com.pulumi.databricks.inputs.RecipientIpAccessListArgs;
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
 *         var db2opensharecode = new RandomPassword(&#34;db2opensharecode&#34;, RandomPasswordArgs.builder()        
 *             .length(16)
 *             .special(true)
 *             .build());
 * 
 *         final var current = DatabricksFunctions.getCurrentUser();
 * 
 *         var db2open = new Recipient(&#34;db2open&#34;, RecipientArgs.builder()        
 *             .comment(&#34;made by terraform&#34;)
 *             .authenticationType(&#34;TOKEN&#34;)
 *             .sharingCode(db2opensharecode.result())
 *             .ipAccessList(RecipientIpAccessListArgs.builder()
 *                 .allowedIpAddresses()
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * databricks.Share to create Delta Sharing shares.
 * * databricks.Grants to manage Delta Sharing permissions.
 * * databricks.getShares to read existing Delta Sharing shares.
 * 
 */
@ResourceType(type="databricks:index/recipient:Recipient")
public class Recipient extends com.pulumi.resources.CustomResource {
    /**
     * The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
     * 
     */
    @Export(name="authenticationType", refs={String.class}, tree="[0]")
    private Output<String> authenticationType;

    /**
     * @return The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
     * 
     */
    public Output<String> authenticationType() {
        return this.authenticationType;
    }
    /**
     * Description about the recipient.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Description about the recipient.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Required when `authentication_type` is `DATABRICKS`.
     * 
     */
    @Export(name="dataRecipientGlobalMetastoreId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dataRecipientGlobalMetastoreId;

    /**
     * @return Required when `authentication_type` is `DATABRICKS`.
     * 
     */
    public Output<Optional<String>> dataRecipientGlobalMetastoreId() {
        return Codegen.optional(this.dataRecipientGlobalMetastoreId);
    }
    /**
     * Recipient IP access list.
     * 
     */
    @Export(name="ipAccessList", refs={RecipientIpAccessList.class}, tree="[0]")
    private Output</* @Nullable */ RecipientIpAccessList> ipAccessList;

    /**
     * @return Recipient IP access list.
     * 
     */
    public Output<Optional<RecipientIpAccessList>> ipAccessList() {
        return Codegen.optional(this.ipAccessList);
    }
    /**
     * Name of recipient. Change forces creation of a new resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of recipient. Change forces creation of a new resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Username/groupname/sp application_id of the recipient owner.
     * 
     */
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> owner;

    /**
     * @return Username/groupname/sp application_id of the recipient owner.
     * 
     */
    public Output<Optional<String>> owner() {
        return Codegen.optional(this.owner);
    }
    /**
     * The one-time sharing code provided by the data recipient.
     * 
     */
    @Export(name="sharingCode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sharingCode;

    /**
     * @return The one-time sharing code provided by the data recipient.
     * 
     */
    public Output<Optional<String>> sharingCode() {
        return Codegen.optional(this.sharingCode);
    }
    /**
     * List of Recipient Tokens. This field is only present when the authentication_type is TOKEN. Each list element is an object with following attributes:
     * 
     */
    @Export(name="tokens", refs={List.class,RecipientToken.class}, tree="[0,1]")
    private Output<List<RecipientToken>> tokens;

    /**
     * @return List of Recipient Tokens. This field is only present when the authentication_type is TOKEN. Each list element is an object with following attributes:
     * 
     */
    public Output<List<RecipientToken>> tokens() {
        return this.tokens;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Recipient(String name) {
        this(name, RecipientArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Recipient(String name, RecipientArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Recipient(String name, RecipientArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/recipient:Recipient", name, args == null ? RecipientArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Recipient(String name, Output<String> id, @Nullable RecipientState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/recipient:Recipient", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "sharingCode"
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
    public static Recipient get(String name, Output<String> id, @Nullable RecipientState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Recipient(name, id, state, options);
    }
}
