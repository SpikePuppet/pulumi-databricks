// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.ConnectionArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.ConnectionState;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Lakehouse Federation is the query federation platform for Databricks. Databricks uses Unity Catalog to manage query federation. To make a dataset available for read-only querying using Lakehouse Federation, you create the following:
 * 
 * - A connection, a securable object in Unity Catalog that specifies a path and credentials for accessing an external database system.
 * - A foreign catalog
 * 
 * This resource manages connections in Unity Catalog
 * 
 * ## Example Usage
 * 
 * Create a connection to a MySQL database
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Connection;
 * import com.pulumi.databricks.ConnectionArgs;
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
 *         var mysql = new Connection(&#34;mysql&#34;, ConnectionArgs.builder()        
 *             .comment(&#34;this is a connection to mysql db&#34;)
 *             .connectionType(&#34;MYSQL&#34;)
 *             .options(Map.ofEntries(
 *                 Map.entry(&#34;host&#34;, &#34;test.mysql.database.azure.com&#34;),
 *                 Map.entry(&#34;password&#34;, &#34;password&#34;),
 *                 Map.entry(&#34;port&#34;, &#34;3306&#34;),
 *                 Map.entry(&#34;user&#34;, &#34;user&#34;)
 *             ))
 *             .properties(Map.of(&#34;purpose&#34;, &#34;testing&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Create a connection to a BigQuery database
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Connection;
 * import com.pulumi.databricks.ConnectionArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var bigquery = new Connection(&#34;bigquery&#34;, ConnectionArgs.builder()        
 *             .connectionType(&#34;BIGQUERY&#34;)
 *             .comment(&#34;this is a connection to BQ&#34;)
 *             .options(Map.of(&#34;GoogleServiceAccountKeyJson&#34;, serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;type&#34;, &#34;service_account&#34;),
 *                     jsonProperty(&#34;project_id&#34;, &#34;PROJECT_ID&#34;),
 *                     jsonProperty(&#34;private_key_id&#34;, &#34;KEY_ID&#34;),
 *                     jsonProperty(&#34;private_key&#34;, &#34;&#34;&#34;
 * -----BEGIN PRIVATE KEY-----
 * PRIVATE_KEY
 * -----END PRIVATE KEY-----
 *                     &#34;&#34;&#34;),
 *                     jsonProperty(&#34;client_email&#34;, &#34;SERVICE_ACCOUNT_EMAIL&#34;),
 *                     jsonProperty(&#34;client_id&#34;, &#34;CLIENT_ID&#34;),
 *                     jsonProperty(&#34;auth_uri&#34;, &#34;https://accounts.google.com/o/oauth2/auth&#34;),
 *                     jsonProperty(&#34;token_uri&#34;, &#34;https://accounts.google.com/o/oauth2/token&#34;),
 *                     jsonProperty(&#34;auth_provider_x509_cert_url&#34;, &#34;https://www.googleapis.com/oauth2/v1/certs&#34;),
 *                     jsonProperty(&#34;client_x509_cert_url&#34;, &#34;https://www.googleapis.com/robot/v1/metadata/x509/SERVICE_ACCOUNT_EMAIL&#34;),
 *                     jsonProperty(&#34;universe_domain&#34;, &#34;googleapis.com&#34;)
 *                 ))))
 *             .properties(Map.of(&#34;purpose&#34;, &#34;testing&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported by `id`bash
 * 
 * ```sh
 *  $ pulumi import databricks:index/connection:Connection this &#39;&lt;metastore_id&gt;|&lt;name&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="databricks:index/connection:Connection")
public class Connection extends com.pulumi.resources.CustomResource {
    /**
     * Free-form text.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Free-form text.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Connection type. `BIGQUERY` `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
     * 
     */
    @Export(name="connectionType", refs={String.class}, tree="[0]")
    private Output<String> connectionType;

    /**
     * @return Connection type. `BIGQUERY` `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
     * 
     */
    public Output<String> connectionType() {
        return this.connectionType;
    }
    @Export(name="metastoreId", refs={String.class}, tree="[0]")
    private Output<String> metastoreId;

    public Output<String> metastoreId() {
        return this.metastoreId;
    }
    /**
     * Name of the Connection.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Connection.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The key value of options required by the connection, e.g. `host`, `port`, `user`, `password` or `GoogleServiceAccountKeyJson`. Please consult the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources) for the required option.
     * 
     */
    @Export(name="options", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> options;

    /**
     * @return The key value of options required by the connection, e.g. `host`, `port`, `user`, `password` or `GoogleServiceAccountKeyJson`. Please consult the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources) for the required option.
     * 
     */
    public Output<Map<String,Object>> options() {
        return this.options;
    }
    /**
     * Name of the connection owner.
     * 
     */
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> owner;

    /**
     * @return Name of the connection owner.
     * 
     */
    public Output<Optional<String>> owner() {
        return Codegen.optional(this.owner);
    }
    /**
     * Free-form connection properties.
     * 
     */
    @Export(name="properties", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> properties;

    /**
     * @return Free-form connection properties.
     * 
     */
    public Output<Optional<Map<String,Object>>> properties() {
        return Codegen.optional(this.properties);
    }
    @Export(name="readOnly", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> readOnly;

    public Output<Boolean> readOnly() {
        return this.readOnly;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connection(String name) {
        this(name, ConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connection(String name, ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/connection:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connection(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/connection:Connection", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "options"
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
    public static Connection get(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, state, options);
    }
}
