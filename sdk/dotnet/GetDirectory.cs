// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetDirectory
    {
        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// This data source allows to get information about a directory in a Databricks Workspace.
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
        ///     var prod = Databricks.GetDirectory.Invoke(new()
        ///     {
        ///         Path = "/Production",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDirectoryResult> InvokeAsync(GetDirectoryArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDirectoryResult>("databricks:index/getDirectory:getDirectory", args ?? new GetDirectoryArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// This data source allows to get information about a directory in a Databricks Workspace.
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
        ///     var prod = Databricks.GetDirectory.Invoke(new()
        ///     {
        ///         Path = "/Production",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDirectoryResult> Invoke(GetDirectoryInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDirectoryResult>("databricks:index/getDirectory:getDirectory", args ?? new GetDirectoryInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDirectoryArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// directory object ID
        /// </summary>
        [Input("objectId")]
        public int? ObjectId { get; set; }

        /// <summary>
        /// Path to a directory in the workspace
        /// </summary>
        [Input("path", required: true)]
        public string Path { get; set; } = null!;

        public GetDirectoryArgs()
        {
        }
        public static new GetDirectoryArgs Empty => new GetDirectoryArgs();
    }

    public sealed class GetDirectoryInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// directory object ID
        /// </summary>
        [Input("objectId")]
        public Input<int>? ObjectId { get; set; }

        /// <summary>
        /// Path to a directory in the workspace
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        public GetDirectoryInvokeArgs()
        {
        }
        public static new GetDirectoryInvokeArgs Empty => new GetDirectoryInvokeArgs();
    }


    [OutputType]
    public sealed class GetDirectoryResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// directory object ID
        /// </summary>
        public readonly int ObjectId;
        public readonly string Path;
        /// <summary>
        /// path on Workspace File System (WSFS) in form of `/Workspace` + `path`
        /// </summary>
        public readonly string WorkspacePath;

        [OutputConstructor]
        private GetDirectoryResult(
            string id,

            int objectId,

            string path,

            string workspacePath)
        {
            Id = id;
            ObjectId = objectId;
            Path = path;
            WorkspacePath = workspacePath;
        }
    }
}
