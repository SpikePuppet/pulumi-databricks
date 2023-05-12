// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetDbfsFilePaths
    {
        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// This data source allows to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var partitions = Databricks.GetDbfsFilePaths.Invoke(new()
        ///     {
        ///         Path = "dbfs:/user/hive/default.db/table",
        ///         Recursive = false,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide.
        /// * databricks.DbfsFile data to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// * databricks.getDbfsFilePaths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// * databricks.DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// * databricks.Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
        /// * databricks.Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
        /// </summary>
        public static Task<GetDbfsFilePathsResult> InvokeAsync(GetDbfsFilePathsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDbfsFilePathsResult>("databricks:index/getDbfsFilePaths:getDbfsFilePaths", args ?? new GetDbfsFilePathsArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// This data source allows to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var partitions = Databricks.GetDbfsFilePaths.Invoke(new()
        ///     {
        ///         Path = "dbfs:/user/hive/default.db/table",
        ///         Recursive = false,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide.
        /// * databricks.DbfsFile data to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// * databricks.getDbfsFilePaths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// * databricks.DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// * databricks.Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
        /// * databricks.Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
        /// </summary>
        public static Output<GetDbfsFilePathsResult> Invoke(GetDbfsFilePathsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDbfsFilePathsResult>("databricks:index/getDbfsFilePaths:getDbfsFilePaths", args ?? new GetDbfsFilePathsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDbfsFilePathsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Path on DBFS for the file to perform listing
        /// </summary>
        [Input("path", required: true)]
        public string Path { get; set; } = null!;

        /// <summary>
        /// Either or not recursively list all files
        /// </summary>
        [Input("recursive", required: true)]
        public bool Recursive { get; set; }

        public GetDbfsFilePathsArgs()
        {
        }
        public static new GetDbfsFilePathsArgs Empty => new GetDbfsFilePathsArgs();
    }

    public sealed class GetDbfsFilePathsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Path on DBFS for the file to perform listing
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        /// <summary>
        /// Either or not recursively list all files
        /// </summary>
        [Input("recursive", required: true)]
        public Input<bool> Recursive { get; set; } = null!;

        public GetDbfsFilePathsInvokeArgs()
        {
        }
        public static new GetDbfsFilePathsInvokeArgs Empty => new GetDbfsFilePathsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDbfsFilePathsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Path;
        /// <summary>
        /// returns list of objects with `path` and `file_size` attributes in each
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDbfsFilePathsPathListResult> PathLists;
        public readonly bool Recursive;

        [OutputConstructor]
        private GetDbfsFilePathsResult(
            string id,

            string path,

            ImmutableArray<Outputs.GetDbfsFilePathsPathListResult> pathLists,

            bool recursive)
        {
            Id = id;
            Path = path;
            PathLists = pathLists;
            Recursive = recursive;
        }
    }
}
