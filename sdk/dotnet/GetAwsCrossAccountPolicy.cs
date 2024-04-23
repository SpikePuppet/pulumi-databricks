// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetAwsCrossAccountPolicy
    {
        /// <summary>
        /// &gt; **Note** This data source could be only used with account-level provider!
        /// 
        /// This data source constructs necessary AWS cross-account policy for you, which is based on [official documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default).
        /// 
        /// ## Example Usage
        /// 
        /// For more detailed usage please see databricks.getAwsAssumeRolePolicy or databricks_aws_s3_mount pages.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetAwsCrossAccountPolicy.Invoke();
        /// 
        /// });
        /// ```
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * Provisioning AWS Databricks E2 with a Hub &amp; Spoke firewall for data exfiltration protection guide
        /// * databricks.getAwsAssumeRolePolicy data to construct the necessary AWS STS assume role policy.
        /// * databricks.getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
        /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
        /// </summary>
        public static Task<GetAwsCrossAccountPolicyResult> InvokeAsync(GetAwsCrossAccountPolicyArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAwsCrossAccountPolicyResult>("databricks:index/getAwsCrossAccountPolicy:getAwsCrossAccountPolicy", args ?? new GetAwsCrossAccountPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note** This data source could be only used with account-level provider!
        /// 
        /// This data source constructs necessary AWS cross-account policy for you, which is based on [official documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default).
        /// 
        /// ## Example Usage
        /// 
        /// For more detailed usage please see databricks.getAwsAssumeRolePolicy or databricks_aws_s3_mount pages.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetAwsCrossAccountPolicy.Invoke();
        /// 
        /// });
        /// ```
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * Provisioning AWS Databricks E2 with a Hub &amp; Spoke firewall for data exfiltration protection guide
        /// * databricks.getAwsAssumeRolePolicy data to construct the necessary AWS STS assume role policy.
        /// * databricks.getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
        /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
        /// </summary>
        public static Output<GetAwsCrossAccountPolicyResult> Invoke(GetAwsCrossAccountPolicyInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAwsCrossAccountPolicyResult>("databricks:index/getAwsCrossAccountPolicy:getAwsCrossAccountPolicy", args ?? new GetAwsCrossAccountPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAwsCrossAccountPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// — Your AWS account ID, which is a number.
        /// </summary>
        [Input("awsAccountId")]
        public string? AwsAccountId { get; set; }

        [Input("passRoles")]
        private List<string>? _passRoles;

        /// <summary>
        /// List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
        /// The below arguments are only valid for `restricted` policy type
        /// </summary>
        public List<string> PassRoles
        {
            get => _passRoles ?? (_passRoles = new List<string>());
            set => _passRoles = value;
        }

        /// <summary>
        /// The type of cross account policy to generated: `managed` for Databricks-managed VPC and `customer` for customer-managed VPC, `restricted` for customer-managed VPC with policy restrictions
        /// </summary>
        [Input("policyType")]
        public string? PolicyType { get; set; }

        /// <summary>
        /// — AWS Region name for your VPC deployment, for example `us-west-2`.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        /// <summary>
        /// — ID of your AWS security group. When you add a security group restriction, you cannot reuse the cross-account IAM role or reference a credentials ID (`credentials_id`) for any other workspaces. For those other workspaces, you must create separate roles, policies, and credentials objects.
        /// </summary>
        [Input("securityGroupId")]
        public string? SecurityGroupId { get; set; }

        /// <summary>
        /// — ID of the AWS VPC where you want to launch workspaces.
        /// </summary>
        [Input("vpcId")]
        public string? VpcId { get; set; }

        public GetAwsCrossAccountPolicyArgs()
        {
        }
        public static new GetAwsCrossAccountPolicyArgs Empty => new GetAwsCrossAccountPolicyArgs();
    }

    public sealed class GetAwsCrossAccountPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// — Your AWS account ID, which is a number.
        /// </summary>
        [Input("awsAccountId")]
        public Input<string>? AwsAccountId { get; set; }

        [Input("passRoles")]
        private InputList<string>? _passRoles;

        /// <summary>
        /// List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
        /// The below arguments are only valid for `restricted` policy type
        /// </summary>
        public InputList<string> PassRoles
        {
            get => _passRoles ?? (_passRoles = new InputList<string>());
            set => _passRoles = value;
        }

        /// <summary>
        /// The type of cross account policy to generated: `managed` for Databricks-managed VPC and `customer` for customer-managed VPC, `restricted` for customer-managed VPC with policy restrictions
        /// </summary>
        [Input("policyType")]
        public Input<string>? PolicyType { get; set; }

        /// <summary>
        /// — AWS Region name for your VPC deployment, for example `us-west-2`.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// — ID of your AWS security group. When you add a security group restriction, you cannot reuse the cross-account IAM role or reference a credentials ID (`credentials_id`) for any other workspaces. For those other workspaces, you must create separate roles, policies, and credentials objects.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// — ID of the AWS VPC where you want to launch workspaces.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public GetAwsCrossAccountPolicyInvokeArgs()
        {
        }
        public static new GetAwsCrossAccountPolicyInvokeArgs Empty => new GetAwsCrossAccountPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetAwsCrossAccountPolicyResult
    {
        public readonly string? AwsAccountId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// AWS IAM Policy JSON document
        /// </summary>
        public readonly string Json;
        public readonly ImmutableArray<string> PassRoles;
        public readonly string? PolicyType;
        public readonly string? Region;
        public readonly string? SecurityGroupId;
        public readonly string? VpcId;

        [OutputConstructor]
        private GetAwsCrossAccountPolicyResult(
            string? awsAccountId,

            string id,

            string json,

            ImmutableArray<string> passRoles,

            string? policyType,

            string? region,

            string? securityGroupId,

            string? vpcId)
        {
            AwsAccountId = awsAccountId;
            Id = id;
            Json = json;
            PassRoles = passRoles;
            PolicyType = policyType;
            Region = region;
            SecurityGroupId = securityGroupId;
            VpcId = vpcId;
        }
    }
}
