# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['InstanceProfileArgs', 'InstanceProfile']

@pulumi.input_type
class InstanceProfileArgs:
    def __init__(__self__, *,
                 instance_profile_arn: pulumi.Input[str],
                 iam_role_arn: Optional[pulumi.Input[str]] = None,
                 is_meta_instance_profile: Optional[pulumi.Input[bool]] = None,
                 skip_validation: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a InstanceProfile resource.
        :param pulumi.Input[str] instance_profile_arn: `ARN` attribute of `aws_iam_instance_profile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
        :param pulumi.Input[str] iam_role_arn: The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::<account-id>:role/<name>`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
        :param pulumi.Input[bool] is_meta_instance_profile: Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
        :param pulumi.Input[bool] skip_validation: **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. "Your requested instance type is not supported in your requested availability zone"), you can pass this flag to skip the validation and forcibly add the instance profile.
        """
        pulumi.set(__self__, "instance_profile_arn", instance_profile_arn)
        if iam_role_arn is not None:
            pulumi.set(__self__, "iam_role_arn", iam_role_arn)
        if is_meta_instance_profile is not None:
            pulumi.set(__self__, "is_meta_instance_profile", is_meta_instance_profile)
        if skip_validation is not None:
            pulumi.set(__self__, "skip_validation", skip_validation)

    @property
    @pulumi.getter(name="instanceProfileArn")
    def instance_profile_arn(self) -> pulumi.Input[str]:
        """
        `ARN` attribute of `aws_iam_instance_profile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
        """
        return pulumi.get(self, "instance_profile_arn")

    @instance_profile_arn.setter
    def instance_profile_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_profile_arn", value)

    @property
    @pulumi.getter(name="iamRoleArn")
    def iam_role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::<account-id>:role/<name>`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
        """
        return pulumi.get(self, "iam_role_arn")

    @iam_role_arn.setter
    def iam_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "iam_role_arn", value)

    @property
    @pulumi.getter(name="isMetaInstanceProfile")
    def is_meta_instance_profile(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
        """
        return pulumi.get(self, "is_meta_instance_profile")

    @is_meta_instance_profile.setter
    def is_meta_instance_profile(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_meta_instance_profile", value)

    @property
    @pulumi.getter(name="skipValidation")
    def skip_validation(self) -> Optional[pulumi.Input[bool]]:
        """
        **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. "Your requested instance type is not supported in your requested availability zone"), you can pass this flag to skip the validation and forcibly add the instance profile.
        """
        return pulumi.get(self, "skip_validation")

    @skip_validation.setter
    def skip_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_validation", value)


@pulumi.input_type
class _InstanceProfileState:
    def __init__(__self__, *,
                 iam_role_arn: Optional[pulumi.Input[str]] = None,
                 instance_profile_arn: Optional[pulumi.Input[str]] = None,
                 is_meta_instance_profile: Optional[pulumi.Input[bool]] = None,
                 skip_validation: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering InstanceProfile resources.
        :param pulumi.Input[str] iam_role_arn: The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::<account-id>:role/<name>`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
        :param pulumi.Input[str] instance_profile_arn: `ARN` attribute of `aws_iam_instance_profile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
        :param pulumi.Input[bool] is_meta_instance_profile: Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
        :param pulumi.Input[bool] skip_validation: **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. "Your requested instance type is not supported in your requested availability zone"), you can pass this flag to skip the validation and forcibly add the instance profile.
        """
        if iam_role_arn is not None:
            pulumi.set(__self__, "iam_role_arn", iam_role_arn)
        if instance_profile_arn is not None:
            pulumi.set(__self__, "instance_profile_arn", instance_profile_arn)
        if is_meta_instance_profile is not None:
            pulumi.set(__self__, "is_meta_instance_profile", is_meta_instance_profile)
        if skip_validation is not None:
            pulumi.set(__self__, "skip_validation", skip_validation)

    @property
    @pulumi.getter(name="iamRoleArn")
    def iam_role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::<account-id>:role/<name>`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
        """
        return pulumi.get(self, "iam_role_arn")

    @iam_role_arn.setter
    def iam_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "iam_role_arn", value)

    @property
    @pulumi.getter(name="instanceProfileArn")
    def instance_profile_arn(self) -> Optional[pulumi.Input[str]]:
        """
        `ARN` attribute of `aws_iam_instance_profile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
        """
        return pulumi.get(self, "instance_profile_arn")

    @instance_profile_arn.setter
    def instance_profile_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_profile_arn", value)

    @property
    @pulumi.getter(name="isMetaInstanceProfile")
    def is_meta_instance_profile(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
        """
        return pulumi.get(self, "is_meta_instance_profile")

    @is_meta_instance_profile.setter
    def is_meta_instance_profile(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_meta_instance_profile", value)

    @property
    @pulumi.getter(name="skipValidation")
    def skip_validation(self) -> Optional[pulumi.Input[bool]]:
        """
        **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. "Your requested instance type is not supported in your requested availability zone"), you can pass this flag to skip the validation and forcibly add the instance profile.
        """
        return pulumi.get(self, "skip_validation")

    @skip_validation.setter
    def skip_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_validation", value)


class InstanceProfile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 iam_role_arn: Optional[pulumi.Input[str]] = None,
                 instance_profile_arn: Optional[pulumi.Input[str]] = None,
                 is_meta_instance_profile: Optional[pulumi.Input[bool]] = None,
                 skip_validation: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        This resource allows you to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount. The following example demonstrates how to create an instance profile and create a cluster with it. When creating a new `InstanceProfile`, Databricks validates that it has sufficient permissions to launch instances with the instance profile. This validation uses AWS dry-run mode for the [AWS EC2 RunInstances API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html).

        > **Note** Please switch to StorageCredential with Unity Catalog to manage storage credentials, which provides a better and faster way for managing credential security.

        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_databricks as databricks

        config = pulumi.Config()
        # Role that you've specified on https://accounts.cloud.databricks.com/#aws
        crossaccount_role_name = config.require("crossaccountRoleName")
        assume_role_for_ec2 = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            actions=["sts:AssumeRole"],
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                identifiers=["ec2.amazonaws.com"],
                type="Service",
            )],
        )])
        role_for_s3_access = aws.iam.Role("role_for_s3_access",
            name="shared-ec2-role-for-s3",
            description="Role for shared access",
            assume_role_policy=assume_role_for_ec2.json)
        pass_role_for_s3_access = aws.iam.get_policy_document_output(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            actions=["iam:PassRole"],
            resources=[role_for_s3_access.arn],
        )])
        pass_role_for_s3_access_policy = aws.iam.Policy("pass_role_for_s3_access",
            name="shared-pass-role-for-s3-access",
            path="/",
            policy=pass_role_for_s3_access.json)
        cross_account = aws.iam.RolePolicyAttachment("cross_account",
            policy_arn=pass_role_for_s3_access_policy.arn,
            role=crossaccount_role_name)
        shared = aws.iam.InstanceProfile("shared",
            name="shared-instance-profile",
            role=role_for_s3_access.name)
        shared_instance_profile = databricks.InstanceProfile("shared", instance_profile_arn=shared.arn)
        latest = databricks.get_spark_version()
        smallest = databricks.get_node_type(local_disk=True)
        this = databricks.Cluster("this",
            cluster_name="Shared Autoscaling",
            spark_version=latest.id,
            node_type_id=smallest.id,
            autotermination_minutes=20,
            autoscale=databricks.ClusterAutoscaleArgs(
                min_workers=1,
                max_workers=50,
            ),
            aws_attributes=databricks.ClusterAwsAttributesArgs(
                instance_profile_arn=shared_instance_profile.id,
                availability="SPOT",
                zone_id="us-east-1",
                first_on_demand=1,
                spot_bid_price_percent=100,
            ))
        ```

        ## Usage with Cluster Policies

        It is advised to keep all common configurations in Cluster Policies to maintain control of the environments launched, so `Cluster` above could be replaced with `ClusterPolicy`:

        ```python
        import pulumi
        import json
        import pulumi_databricks as databricks

        this = databricks.ClusterPolicy("this",
            name="Policy with predefined instance profile",
            definition=json.dumps({
                "aws_attributes.instance_profile_arn": {
                    "type": "fixed",
                    "value": shared["arn"],
                },
            }))
        ```

        ## Granting access to all users

        You can make instance profile available to all users by associating it with the special group called `users` through Group data source.

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.InstanceProfile("this", instance_profile_arn=shared["arn"])
        users = databricks.get_group(display_name="users")
        all = databricks.GroupInstanceProfile("all",
            group_id=users.id,
            instance_profile_id=this.id)
        ```

        ## Usage with Databricks SQL serverless

        When the instance profile ARN and its associated IAM role ARN don't match and the instance profile is intended for use with Databricks SQL serverless, the `iam_role_arn` parameter can be specified.

        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_databricks as databricks

        sql_serverless_assume_role = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            actions=["sts:AssumeRole"],
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=["arn:aws:iam::790110701330:role/serverless-customer-resource-role"],
            )],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="StringEquals",
                variable="sts:ExternalID",
                values=[
                    "databricks-serverless-<YOUR_WORKSPACE_ID1>",
                    "databricks-serverless-<YOUR_WORKSPACE_ID2>",
                ],
            )],
        )])
        this = aws.iam.Role("this",
            name="my-databricks-sql-serverless-role",
            assume_role_policy=sql_serverless_assume_role.json)
        this_instance_profile = aws.iam.InstanceProfile("this",
            name="my-databricks-sql-serverless-instance-profile",
            role=this.name)
        this_instance_profile2 = databricks.InstanceProfile("this",
            instance_profile_arn=this_instance_profile.arn,
            iam_role_arn=this.arn)
        ```

        ## Import

        The resource instance profile can be imported using the ARN of it

        bash

        ```sh
        $ pulumi import databricks:index/instanceProfile:InstanceProfile this <instance-profile-arn>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] iam_role_arn: The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::<account-id>:role/<name>`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
        :param pulumi.Input[str] instance_profile_arn: `ARN` attribute of `aws_iam_instance_profile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
        :param pulumi.Input[bool] is_meta_instance_profile: Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
        :param pulumi.Input[bool] skip_validation: **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. "Your requested instance type is not supported in your requested availability zone"), you can pass this flag to skip the validation and forcibly add the instance profile.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceProfileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount. The following example demonstrates how to create an instance profile and create a cluster with it. When creating a new `InstanceProfile`, Databricks validates that it has sufficient permissions to launch instances with the instance profile. This validation uses AWS dry-run mode for the [AWS EC2 RunInstances API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html).

        > **Note** Please switch to StorageCredential with Unity Catalog to manage storage credentials, which provides a better and faster way for managing credential security.

        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_databricks as databricks

        config = pulumi.Config()
        # Role that you've specified on https://accounts.cloud.databricks.com/#aws
        crossaccount_role_name = config.require("crossaccountRoleName")
        assume_role_for_ec2 = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            actions=["sts:AssumeRole"],
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                identifiers=["ec2.amazonaws.com"],
                type="Service",
            )],
        )])
        role_for_s3_access = aws.iam.Role("role_for_s3_access",
            name="shared-ec2-role-for-s3",
            description="Role for shared access",
            assume_role_policy=assume_role_for_ec2.json)
        pass_role_for_s3_access = aws.iam.get_policy_document_output(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            actions=["iam:PassRole"],
            resources=[role_for_s3_access.arn],
        )])
        pass_role_for_s3_access_policy = aws.iam.Policy("pass_role_for_s3_access",
            name="shared-pass-role-for-s3-access",
            path="/",
            policy=pass_role_for_s3_access.json)
        cross_account = aws.iam.RolePolicyAttachment("cross_account",
            policy_arn=pass_role_for_s3_access_policy.arn,
            role=crossaccount_role_name)
        shared = aws.iam.InstanceProfile("shared",
            name="shared-instance-profile",
            role=role_for_s3_access.name)
        shared_instance_profile = databricks.InstanceProfile("shared", instance_profile_arn=shared.arn)
        latest = databricks.get_spark_version()
        smallest = databricks.get_node_type(local_disk=True)
        this = databricks.Cluster("this",
            cluster_name="Shared Autoscaling",
            spark_version=latest.id,
            node_type_id=smallest.id,
            autotermination_minutes=20,
            autoscale=databricks.ClusterAutoscaleArgs(
                min_workers=1,
                max_workers=50,
            ),
            aws_attributes=databricks.ClusterAwsAttributesArgs(
                instance_profile_arn=shared_instance_profile.id,
                availability="SPOT",
                zone_id="us-east-1",
                first_on_demand=1,
                spot_bid_price_percent=100,
            ))
        ```

        ## Usage with Cluster Policies

        It is advised to keep all common configurations in Cluster Policies to maintain control of the environments launched, so `Cluster` above could be replaced with `ClusterPolicy`:

        ```python
        import pulumi
        import json
        import pulumi_databricks as databricks

        this = databricks.ClusterPolicy("this",
            name="Policy with predefined instance profile",
            definition=json.dumps({
                "aws_attributes.instance_profile_arn": {
                    "type": "fixed",
                    "value": shared["arn"],
                },
            }))
        ```

        ## Granting access to all users

        You can make instance profile available to all users by associating it with the special group called `users` through Group data source.

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.InstanceProfile("this", instance_profile_arn=shared["arn"])
        users = databricks.get_group(display_name="users")
        all = databricks.GroupInstanceProfile("all",
            group_id=users.id,
            instance_profile_id=this.id)
        ```

        ## Usage with Databricks SQL serverless

        When the instance profile ARN and its associated IAM role ARN don't match and the instance profile is intended for use with Databricks SQL serverless, the `iam_role_arn` parameter can be specified.

        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_databricks as databricks

        sql_serverless_assume_role = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            actions=["sts:AssumeRole"],
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=["arn:aws:iam::790110701330:role/serverless-customer-resource-role"],
            )],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="StringEquals",
                variable="sts:ExternalID",
                values=[
                    "databricks-serverless-<YOUR_WORKSPACE_ID1>",
                    "databricks-serverless-<YOUR_WORKSPACE_ID2>",
                ],
            )],
        )])
        this = aws.iam.Role("this",
            name="my-databricks-sql-serverless-role",
            assume_role_policy=sql_serverless_assume_role.json)
        this_instance_profile = aws.iam.InstanceProfile("this",
            name="my-databricks-sql-serverless-instance-profile",
            role=this.name)
        this_instance_profile2 = databricks.InstanceProfile("this",
            instance_profile_arn=this_instance_profile.arn,
            iam_role_arn=this.arn)
        ```

        ## Import

        The resource instance profile can be imported using the ARN of it

        bash

        ```sh
        $ pulumi import databricks:index/instanceProfile:InstanceProfile this <instance-profile-arn>
        ```

        :param str resource_name: The name of the resource.
        :param InstanceProfileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceProfileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 iam_role_arn: Optional[pulumi.Input[str]] = None,
                 instance_profile_arn: Optional[pulumi.Input[str]] = None,
                 is_meta_instance_profile: Optional[pulumi.Input[bool]] = None,
                 skip_validation: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceProfileArgs.__new__(InstanceProfileArgs)

            __props__.__dict__["iam_role_arn"] = iam_role_arn
            if instance_profile_arn is None and not opts.urn:
                raise TypeError("Missing required property 'instance_profile_arn'")
            __props__.__dict__["instance_profile_arn"] = instance_profile_arn
            __props__.__dict__["is_meta_instance_profile"] = is_meta_instance_profile
            __props__.__dict__["skip_validation"] = skip_validation
        super(InstanceProfile, __self__).__init__(
            'databricks:index/instanceProfile:InstanceProfile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            iam_role_arn: Optional[pulumi.Input[str]] = None,
            instance_profile_arn: Optional[pulumi.Input[str]] = None,
            is_meta_instance_profile: Optional[pulumi.Input[bool]] = None,
            skip_validation: Optional[pulumi.Input[bool]] = None) -> 'InstanceProfile':
        """
        Get an existing InstanceProfile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] iam_role_arn: The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::<account-id>:role/<name>`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
        :param pulumi.Input[str] instance_profile_arn: `ARN` attribute of `aws_iam_instance_profile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
        :param pulumi.Input[bool] is_meta_instance_profile: Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
        :param pulumi.Input[bool] skip_validation: **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. "Your requested instance type is not supported in your requested availability zone"), you can pass this flag to skip the validation and forcibly add the instance profile.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceProfileState.__new__(_InstanceProfileState)

        __props__.__dict__["iam_role_arn"] = iam_role_arn
        __props__.__dict__["instance_profile_arn"] = instance_profile_arn
        __props__.__dict__["is_meta_instance_profile"] = is_meta_instance_profile
        __props__.__dict__["skip_validation"] = skip_validation
        return InstanceProfile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="iamRoleArn")
    def iam_role_arn(self) -> pulumi.Output[Optional[str]]:
        """
        The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::<account-id>:role/<name>`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
        """
        return pulumi.get(self, "iam_role_arn")

    @property
    @pulumi.getter(name="instanceProfileArn")
    def instance_profile_arn(self) -> pulumi.Output[str]:
        """
        `ARN` attribute of `aws_iam_instance_profile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
        """
        return pulumi.get(self, "instance_profile_arn")

    @property
    @pulumi.getter(name="isMetaInstanceProfile")
    def is_meta_instance_profile(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
        """
        return pulumi.get(self, "is_meta_instance_profile")

    @property
    @pulumi.getter(name="skipValidation")
    def skip_validation(self) -> pulumi.Output[bool]:
        """
        **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. "Your requested instance type is not supported in your requested availability zone"), you can pass this flag to skip the validation and forcibly add the instance profile.
        """
        return pulumi.get(self, "skip_validation")

