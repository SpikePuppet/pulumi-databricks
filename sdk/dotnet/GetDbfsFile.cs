// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetDbfsFile
    {
        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// This data source allows to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// 
        /// ## Example Usage
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
        ///     var report = Databricks.GetDbfsFile.Invoke(new()
        ///     {
        ///         LimitFileSize = true,
        ///         Path = "dbfs:/reports/some.csv",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide.
        /// * databricks.getDbfsFilePaths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// * databricks.DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// * databricks.Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
        /// </summary>
        public static Task<GetDbfsFileResult> InvokeAsync(GetDbfsFileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDbfsFileResult>("databricks:index/getDbfsFile:getDbfsFile", args ?? new GetDbfsFileArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// This data source allows to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// 
        /// ## Example Usage
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
        ///     var report = Databricks.GetDbfsFile.Invoke(new()
        ///     {
        ///         LimitFileSize = true,
        ///         Path = "dbfs:/reports/some.csv",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide.
        /// * databricks.getDbfsFilePaths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// * databricks.DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// * databricks.Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
        /// </summary>
        public static Output<GetDbfsFileResult> Invoke(GetDbfsFileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDbfsFileResult>("databricks:index/getDbfsFile:getDbfsFile", args ?? new GetDbfsFileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDbfsFileArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Do not load content for files larger than 4MB.
        /// </summary>
        [Input("limitFileSize", required: true)]
        public bool LimitFileSize { get; set; }

        /// <summary>
        /// Path on DBFS for the file from which to get content.
        /// </summary>
        [Input("path", required: true)]
        public string Path { get; set; } = null!;

        public GetDbfsFileArgs()
        {
        }
        public static new GetDbfsFileArgs Empty => new GetDbfsFileArgs();
    }

    public sealed class GetDbfsFileInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Do not load content for files larger than 4MB.
        /// </summary>
        [Input("limitFileSize", required: true)]
        public Input<bool> LimitFileSize { get; set; } = null!;

        /// <summary>
        /// Path on DBFS for the file from which to get content.
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        public GetDbfsFileInvokeArgs()
        {
        }
        public static new GetDbfsFileInvokeArgs Empty => new GetDbfsFileInvokeArgs();
    }


    [OutputType]
    public sealed class GetDbfsFileResult
    {
        /// <summary>
        /// base64-encoded file contents
        /// </summary>
        public readonly string Content;
        /// <summary>
        /// size of the file in bytes
        /// </summary>
        public readonly int FileSize;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool LimitFileSize;
        public readonly string Path;

        [OutputConstructor]
        private GetDbfsFileResult(
            string content,

            int fileSize,

            string id,

            bool limitFileSize,

            string path)
        {
            Content = content;
            FileSize = fileSize;
            Id = id;
            LimitFileSize = limitFileSize;
            Path = path;
        }
    }
}
