// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// &gt; **Note** This resource could be only used with workspace-level provider!
    /// 
    /// Lakehouse Federation is the query federation platform for Databricks. Databricks uses Unity Catalog to manage query federation. To make a dataset available for read-only querying using Lakehouse Federation, you create the following:
    /// 
    /// - A connection, a securable object in Unity Catalog that specifies a path and credentials for accessing an external database system.
    /// - A foreign catalog
    /// 
    /// This resource manages connections in Unity Catalog
    /// 
    /// ## Example Usage
    /// 
    /// Create a connection to a MySQL database
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var mysql = new Databricks.Connection("mysql", new()
    ///     {
    ///         Comment = "this is a connection to mysql db",
    ///         ConnectionType = "MYSQL",
    ///         Options = 
    ///         {
    ///             { "host", "test.mysql.database.azure.com" },
    ///             { "password", "password" },
    ///             { "port", "3306" },
    ///             { "user", "user" },
    ///         },
    ///         Properties = 
    ///         {
    ///             { "purpose", "testing" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// Create a connection to a BigQuery database
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var bigquery = new Databricks.Connection("bigquery", new()
    ///     {
    ///         ConnectionType = "BIGQUERY",
    ///         Comment = "this is a connection to BQ",
    ///         Options = 
    ///         {
    ///             { "GoogleServiceAccountKeyJson", JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["type"] = "service_account",
    ///                 ["project_id"] = "PROJECT_ID",
    ///                 ["private_key_id"] = "KEY_ID",
    ///                 ["private_key"] = @"-----BEGIN PRIVATE KEY-----
    /// PRIVATE_KEY
    /// -----END PRIVATE KEY-----
    /// ",
    ///                 ["client_email"] = "SERVICE_ACCOUNT_EMAIL",
    ///                 ["client_id"] = "CLIENT_ID",
    ///                 ["auth_uri"] = "https://accounts.google.com/o/oauth2/auth",
    ///                 ["token_uri"] = "https://accounts.google.com/o/oauth2/token",
    ///                 ["auth_provider_x509_cert_url"] = "https://www.googleapis.com/oauth2/v1/certs",
    ///                 ["client_x509_cert_url"] = "https://www.googleapis.com/robot/v1/metadata/x509/SERVICE_ACCOUNT_EMAIL",
    ///                 ["universe_domain"] = "googleapis.com",
    ///             }) },
    ///         },
    ///         Properties = 
    ///         {
    ///             { "purpose", "testing" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by `id`:
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/connection:Connection this '&lt;metastore_id&gt;|&lt;name&gt;'
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/connection:Connection")]
    public partial class Connection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Free-form text.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Connection type. `BIGQUERY` `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
        /// </summary>
        [Output("connectionType")]
        public Output<string> ConnectionType { get; private set; } = null!;

        [Output("metastoreId")]
        public Output<string> MetastoreId { get; private set; } = null!;

        /// <summary>
        /// Name of the Connection.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The key value of options required by the connection, e.g. `host`, `port`, `user`, `password` or `GoogleServiceAccountKeyJson`. Please consult the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources) for the required option.
        /// </summary>
        [Output("options")]
        public Output<ImmutableDictionary<string, object>> Options { get; private set; } = null!;

        /// <summary>
        /// Name of the connection owner.
        /// </summary>
        [Output("owner")]
        public Output<string> Owner { get; private set; } = null!;

        /// <summary>
        /// Free-form connection properties.
        /// </summary>
        [Output("properties")]
        public Output<ImmutableDictionary<string, object>?> Properties { get; private set; } = null!;

        [Output("readOnly")]
        public Output<bool> ReadOnly { get; private set; } = null!;


        /// <summary>
        /// Create a Connection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Connection(string name, ConnectionArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/connection:Connection", name, args ?? new ConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Connection(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/connection:Connection", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "options",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Connection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Connection Get(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new Connection(name, id, state, options);
        }
    }

    public sealed class ConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Free-form text.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Connection type. `BIGQUERY` `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
        /// </summary>
        [Input("connectionType", required: true)]
        public Input<string> ConnectionType { get; set; } = null!;

        [Input("metastoreId")]
        public Input<string>? MetastoreId { get; set; }

        /// <summary>
        /// Name of the Connection.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("options", required: true)]
        private InputMap<object>? _options;

        /// <summary>
        /// The key value of options required by the connection, e.g. `host`, `port`, `user`, `password` or `GoogleServiceAccountKeyJson`. Please consult the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources) for the required option.
        /// </summary>
        public InputMap<object> Options
        {
            get => _options ?? (_options = new InputMap<object>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, object>());
                _options = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Name of the connection owner.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("properties")]
        private InputMap<object>? _properties;

        /// <summary>
        /// Free-form connection properties.
        /// </summary>
        public InputMap<object> Properties
        {
            get => _properties ?? (_properties = new InputMap<object>());
            set => _properties = value;
        }

        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        public ConnectionArgs()
        {
        }
        public static new ConnectionArgs Empty => new ConnectionArgs();
    }

    public sealed class ConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Free-form text.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Connection type. `BIGQUERY` `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
        /// </summary>
        [Input("connectionType")]
        public Input<string>? ConnectionType { get; set; }

        [Input("metastoreId")]
        public Input<string>? MetastoreId { get; set; }

        /// <summary>
        /// Name of the Connection.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("options")]
        private InputMap<object>? _options;

        /// <summary>
        /// The key value of options required by the connection, e.g. `host`, `port`, `user`, `password` or `GoogleServiceAccountKeyJson`. Please consult the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources) for the required option.
        /// </summary>
        public InputMap<object> Options
        {
            get => _options ?? (_options = new InputMap<object>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, object>());
                _options = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Name of the connection owner.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("properties")]
        private InputMap<object>? _properties;

        /// <summary>
        /// Free-form connection properties.
        /// </summary>
        public InputMap<object> Properties
        {
            get => _properties ?? (_properties = new InputMap<object>());
            set => _properties = value;
        }

        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        public ConnectionState()
        {
        }
        public static new ConnectionState Empty => new ConnectionState();
    }
}
