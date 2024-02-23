# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAwsUnityCatalogPolicyResult',
    'AwaitableGetAwsUnityCatalogPolicyResult',
    'get_aws_unity_catalog_policy',
    'get_aws_unity_catalog_policy_output',
]

@pulumi.output_type
class GetAwsUnityCatalogPolicyResult:
    """
    A collection of values returned by getAwsUnityCatalogPolicy.
    """
    def __init__(__self__, aws_account_id=None, bucket_name=None, id=None, json=None, kms_name=None, role_name=None):
        if aws_account_id and not isinstance(aws_account_id, str):
            raise TypeError("Expected argument 'aws_account_id' to be a str")
        pulumi.set(__self__, "aws_account_id", aws_account_id)
        if bucket_name and not isinstance(bucket_name, str):
            raise TypeError("Expected argument 'bucket_name' to be a str")
        pulumi.set(__self__, "bucket_name", bucket_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if json and not isinstance(json, str):
            raise TypeError("Expected argument 'json' to be a str")
        pulumi.set(__self__, "json", json)
        if kms_name and not isinstance(kms_name, str):
            raise TypeError("Expected argument 'kms_name' to be a str")
        pulumi.set(__self__, "kms_name", kms_name)
        if role_name and not isinstance(role_name, str):
            raise TypeError("Expected argument 'role_name' to be a str")
        pulumi.set(__self__, "role_name", role_name)

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> str:
        return pulumi.get(self, "aws_account_id")

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> str:
        return pulumi.get(self, "bucket_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def json(self) -> str:
        """
        AWS IAM Policy JSON document
        """
        return pulumi.get(self, "json")

    @property
    @pulumi.getter(name="kmsName")
    def kms_name(self) -> Optional[str]:
        return pulumi.get(self, "kms_name")

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> str:
        return pulumi.get(self, "role_name")


class AwaitableGetAwsUnityCatalogPolicyResult(GetAwsUnityCatalogPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAwsUnityCatalogPolicyResult(
            aws_account_id=self.aws_account_id,
            bucket_name=self.bucket_name,
            id=self.id,
            json=self.json,
            kms_name=self.kms_name,
            role_name=self.role_name)


def get_aws_unity_catalog_policy(aws_account_id: Optional[str] = None,
                                 bucket_name: Optional[str] = None,
                                 kms_name: Optional[str] = None,
                                 role_name: Optional[str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAwsUnityCatalogPolicyResult:
    """
    > **Note** This resource has an evolving API, which may change in future versions of the provider. Please always consult [latest documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default) in case of any questions.

    This data source constructs necessary AWS Unity Catalog policy for you, which is based on [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws
    import pulumi_databricks as databricks

    this = databricks.get_aws_unity_catalog_policy(aws_account_id=var["aws_account_id"],
        bucket_name="databricks-bucket",
        role_name="databricks-role",
        kms_name="databricks-kms")
    passrole_for_uc = aws.iam.get_policy_document(statements=[
        aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            actions=["sts:AssumeRole"],
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                identifiers=["arn:aws:iam::414351767826:role/unity-catalog-prod-UCMasterRole-14S5ZJVKOTYTL"],
                type="AWS",
            )],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="StringEquals",
                variable="sts:ExternalId",
                values=[var["databricks_account_id"]],
            )],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="ExplicitSelfRoleAssumption",
            effect="Allow",
            actions=["sts:AssumeRole"],
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=[f"arn:aws:iam::{var['aws_account_id']}:root"],
            )],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="ArnLike",
                variable="aws:PrincipalArn",
                values=[f"arn:aws:iam::{var['aws_account_id']}:role/{var['prefix']}-uc-access"],
            )],
        ),
    ])
    unity_metastore = aws.iam.Policy("unityMetastore", policy=this.json)
    metastore_data_access = aws.iam.Role("metastoreDataAccess",
        assume_role_policy=passrole_for_uc.json,
        managed_policy_arns=[unity_metastore.arn])
    ```


    :param str aws_account_id: The Account ID of the current AWS account (not your Databricks account).
    :param str bucket_name: The name of the S3 bucket used as root storage location for [managed tables](https://docs.databricks.com/data-governance/unity-catalog/index.html#managed-table) in Unity Catalog.
    :param str kms_name: If encryption is enabled, provide the name of the KMS key that encrypts the S3 bucket contents. If encryption is disabled, do not provide this argument.
    :param str role_name: The name of the AWS IAM role that you created in the previous step in the [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
    """
    __args__ = dict()
    __args__['awsAccountId'] = aws_account_id
    __args__['bucketName'] = bucket_name
    __args__['kmsName'] = kms_name
    __args__['roleName'] = role_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getAwsUnityCatalogPolicy:getAwsUnityCatalogPolicy', __args__, opts=opts, typ=GetAwsUnityCatalogPolicyResult).value

    return AwaitableGetAwsUnityCatalogPolicyResult(
        aws_account_id=pulumi.get(__ret__, 'aws_account_id'),
        bucket_name=pulumi.get(__ret__, 'bucket_name'),
        id=pulumi.get(__ret__, 'id'),
        json=pulumi.get(__ret__, 'json'),
        kms_name=pulumi.get(__ret__, 'kms_name'),
        role_name=pulumi.get(__ret__, 'role_name'))


@_utilities.lift_output_func(get_aws_unity_catalog_policy)
def get_aws_unity_catalog_policy_output(aws_account_id: Optional[pulumi.Input[str]] = None,
                                        bucket_name: Optional[pulumi.Input[str]] = None,
                                        kms_name: Optional[pulumi.Input[Optional[str]]] = None,
                                        role_name: Optional[pulumi.Input[str]] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAwsUnityCatalogPolicyResult]:
    """
    > **Note** This resource has an evolving API, which may change in future versions of the provider. Please always consult [latest documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default) in case of any questions.

    This data source constructs necessary AWS Unity Catalog policy for you, which is based on [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws
    import pulumi_databricks as databricks

    this = databricks.get_aws_unity_catalog_policy(aws_account_id=var["aws_account_id"],
        bucket_name="databricks-bucket",
        role_name="databricks-role",
        kms_name="databricks-kms")
    passrole_for_uc = aws.iam.get_policy_document(statements=[
        aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            actions=["sts:AssumeRole"],
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                identifiers=["arn:aws:iam::414351767826:role/unity-catalog-prod-UCMasterRole-14S5ZJVKOTYTL"],
                type="AWS",
            )],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="StringEquals",
                variable="sts:ExternalId",
                values=[var["databricks_account_id"]],
            )],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="ExplicitSelfRoleAssumption",
            effect="Allow",
            actions=["sts:AssumeRole"],
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=[f"arn:aws:iam::{var['aws_account_id']}:root"],
            )],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="ArnLike",
                variable="aws:PrincipalArn",
                values=[f"arn:aws:iam::{var['aws_account_id']}:role/{var['prefix']}-uc-access"],
            )],
        ),
    ])
    unity_metastore = aws.iam.Policy("unityMetastore", policy=this.json)
    metastore_data_access = aws.iam.Role("metastoreDataAccess",
        assume_role_policy=passrole_for_uc.json,
        managed_policy_arns=[unity_metastore.arn])
    ```


    :param str aws_account_id: The Account ID of the current AWS account (not your Databricks account).
    :param str bucket_name: The name of the S3 bucket used as root storage location for [managed tables](https://docs.databricks.com/data-governance/unity-catalog/index.html#managed-table) in Unity Catalog.
    :param str kms_name: If encryption is enabled, provide the name of the KMS key that encrypts the S3 bucket contents. If encryption is disabled, do not provide this argument.
    :param str role_name: The name of the AWS IAM role that you created in the previous step in the [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
    """
    ...