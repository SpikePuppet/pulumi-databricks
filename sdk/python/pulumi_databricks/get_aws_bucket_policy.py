# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAwsBucketPolicyResult',
    'AwaitableGetAwsBucketPolicyResult',
    'get_aws_bucket_policy',
    'get_aws_bucket_policy_output',
]

@pulumi.output_type
class GetAwsBucketPolicyResult:
    """
    A collection of values returned by getAwsBucketPolicy.
    """
    def __init__(__self__, bucket=None, databricks_account_id=None, full_access_role=None, id=None, json=None):
        if bucket and not isinstance(bucket, str):
            raise TypeError("Expected argument 'bucket' to be a str")
        pulumi.set(__self__, "bucket", bucket)
        if databricks_account_id and not isinstance(databricks_account_id, str):
            raise TypeError("Expected argument 'databricks_account_id' to be a str")
        pulumi.set(__self__, "databricks_account_id", databricks_account_id)
        if full_access_role and not isinstance(full_access_role, str):
            raise TypeError("Expected argument 'full_access_role' to be a str")
        pulumi.set(__self__, "full_access_role", full_access_role)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if json and not isinstance(json, str):
            raise TypeError("Expected argument 'json' to be a str")
        pulumi.set(__self__, "json", json)

    @property
    @pulumi.getter
    def bucket(self) -> str:
        return pulumi.get(self, "bucket")

    @property
    @pulumi.getter(name="databricksAccountId")
    def databricks_account_id(self) -> Optional[str]:
        return pulumi.get(self, "databricks_account_id")

    @property
    @pulumi.getter(name="fullAccessRole")
    def full_access_role(self) -> Optional[str]:
        return pulumi.get(self, "full_access_role")

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
        (Read-only) AWS IAM Policy JSON document to grant Databricks full access to bucket.
        """
        return pulumi.get(self, "json")


class AwaitableGetAwsBucketPolicyResult(GetAwsBucketPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAwsBucketPolicyResult(
            bucket=self.bucket,
            databricks_account_id=self.databricks_account_id,
            full_access_role=self.full_access_role,
            id=self.id,
            json=self.json)


def get_aws_bucket_policy(bucket: Optional[str] = None,
                          databricks_account_id: Optional[str] = None,
                          full_access_role: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAwsBucketPolicyResult:
    """
    This datasource configures a simple access policy for AWS S3 buckets, so that Databricks can access data in it.

    ## Related Resources

    The following resources are used in the same context:

    * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide
    * End to end workspace management guide
    * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
    * Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.


    :param str bucket: AWS S3 Bucket name for which to generate the policy document.
    :param str full_access_role: Data access role that can have full access for this bucket
    """
    __args__ = dict()
    __args__['bucket'] = bucket
    __args__['databricksAccountId'] = databricks_account_id
    __args__['fullAccessRole'] = full_access_role
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('databricks:index/getAwsBucketPolicy:getAwsBucketPolicy', __args__, opts=opts, typ=GetAwsBucketPolicyResult).value

    return AwaitableGetAwsBucketPolicyResult(
        bucket=__ret__.bucket,
        databricks_account_id=__ret__.databricks_account_id,
        full_access_role=__ret__.full_access_role,
        id=__ret__.id,
        json=__ret__.json)


@_utilities.lift_output_func(get_aws_bucket_policy)
def get_aws_bucket_policy_output(bucket: Optional[pulumi.Input[str]] = None,
                                 databricks_account_id: Optional[pulumi.Input[Optional[str]]] = None,
                                 full_access_role: Optional[pulumi.Input[Optional[str]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAwsBucketPolicyResult]:
    """
    This datasource configures a simple access policy for AWS S3 buckets, so that Databricks can access data in it.

    ## Related Resources

    The following resources are used in the same context:

    * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide
    * End to end workspace management guide
    * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
    * Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.


    :param str bucket: AWS S3 Bucket name for which to generate the policy document.
    :param str full_access_role: Data access role that can have full access for this bucket
    """
    ...
