// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetShare
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Getting details of an existing share in the metastore
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetShare.Invoke(new()
        ///     {
        ///         Name = "this",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["createdBy"] = @this.Apply(@this =&gt; @this.Apply(getShareResult =&gt; getShareResult.CreatedBy)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Share to create Delta Sharing shares.
        /// * databricks.Recipient to create Delta Sharing recipients.
        /// * databricks.Grants to manage Delta Sharing permissions.
        /// </summary>
        public static Task<GetShareResult> InvokeAsync(GetShareArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetShareResult>("databricks:index/getShare:getShare", args ?? new GetShareArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Getting details of an existing share in the metastore
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetShare.Invoke(new()
        ///     {
        ///         Name = "this",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["createdBy"] = @this.Apply(@this =&gt; @this.Apply(getShareResult =&gt; getShareResult.CreatedBy)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Share to create Delta Sharing shares.
        /// * databricks.Recipient to create Delta Sharing recipients.
        /// * databricks.Grants to manage Delta Sharing permissions.
        /// </summary>
        public static Output<GetShareResult> Invoke(GetShareInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetShareResult>("databricks:index/getShare:getShare", args ?? new GetShareInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetShareArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Time when the share was created.
        /// </summary>
        [Input("createdAt")]
        public int? CreatedAt { get; set; }

        /// <summary>
        /// The principal that created the share.
        /// </summary>
        [Input("createdBy")]
        public string? CreatedBy { get; set; }

        /// <summary>
        /// The name of the share
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("objects")]
        private List<Inputs.GetShareObjectArgs>? _objects;

        /// <summary>
        /// arrays containing details of each object in the share.
        /// </summary>
        public List<Inputs.GetShareObjectArgs> Objects
        {
            get => _objects ?? (_objects = new List<Inputs.GetShareObjectArgs>());
            set => _objects = value;
        }

        public GetShareArgs()
        {
        }
        public static new GetShareArgs Empty => new GetShareArgs();
    }

    public sealed class GetShareInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Time when the share was created.
        /// </summary>
        [Input("createdAt")]
        public Input<int>? CreatedAt { get; set; }

        /// <summary>
        /// The principal that created the share.
        /// </summary>
        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        /// <summary>
        /// The name of the share
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("objects")]
        private InputList<Inputs.GetShareObjectInputArgs>? _objects;

        /// <summary>
        /// arrays containing details of each object in the share.
        /// </summary>
        public InputList<Inputs.GetShareObjectInputArgs> Objects
        {
            get => _objects ?? (_objects = new InputList<Inputs.GetShareObjectInputArgs>());
            set => _objects = value;
        }

        public GetShareInvokeArgs()
        {
        }
        public static new GetShareInvokeArgs Empty => new GetShareInvokeArgs();
    }


    [OutputType]
    public sealed class GetShareResult
    {
        /// <summary>
        /// Time when the share was created.
        /// </summary>
        public readonly int CreatedAt;
        /// <summary>
        /// The principal that created the share.
        /// </summary>
        public readonly string CreatedBy;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Full name of the object being shared.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// arrays containing details of each object in the share.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetShareObjectResult> Objects;

        [OutputConstructor]
        private GetShareResult(
            int createdAt,

            string createdBy,

            string id,

            string name,

            ImmutableArray<Outputs.GetShareObjectResult> objects)
        {
            CreatedAt = createdAt;
            CreatedBy = createdBy;
            Id = id;
            Name = name;
            Objects = objects;
        }
    }
}
