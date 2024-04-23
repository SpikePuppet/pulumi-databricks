# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['GroupInstanceProfileArgs', 'GroupInstanceProfile']

@pulumi.input_type
class GroupInstanceProfileArgs:
    def __init__(__self__, *,
                 group_id: pulumi.Input[str],
                 instance_profile_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a GroupInstanceProfile resource.
        :param pulumi.Input[str] group_id: This is the id of the group resource.
        :param pulumi.Input[str] instance_profile_id: This is the id of the instance profile resource.
        """
        pulumi.set(__self__, "group_id", group_id)
        pulumi.set(__self__, "instance_profile_id", instance_profile_id)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Input[str]:
        """
        This is the id of the group resource.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter(name="instanceProfileId")
    def instance_profile_id(self) -> pulumi.Input[str]:
        """
        This is the id of the instance profile resource.
        """
        return pulumi.get(self, "instance_profile_id")

    @instance_profile_id.setter
    def instance_profile_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_profile_id", value)


@pulumi.input_type
class _GroupInstanceProfileState:
    def __init__(__self__, *,
                 group_id: Optional[pulumi.Input[str]] = None,
                 instance_profile_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering GroupInstanceProfile resources.
        :param pulumi.Input[str] group_id: This is the id of the group resource.
        :param pulumi.Input[str] instance_profile_id: This is the id of the instance profile resource.
        """
        if group_id is not None:
            pulumi.set(__self__, "group_id", group_id)
        if instance_profile_id is not None:
            pulumi.set(__self__, "instance_profile_id", instance_profile_id)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[str]]:
        """
        This is the id of the group resource.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter(name="instanceProfileId")
    def instance_profile_id(self) -> Optional[pulumi.Input[str]]:
        """
        This is the id of the instance profile resource.
        """
        return pulumi.get(self, "instance_profile_id")

    @instance_profile_id.setter
    def instance_profile_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_profile_id", value)


class GroupInstanceProfile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 instance_profile_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        > **Deprecated** Please migrate to databricks_group_role.

        This resource allows you to attach InstanceProfile (AWS) to databricks_group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        instance_profile = databricks.InstanceProfile("instance_profile", instance_profile_arn="my_instance_profile_arn")
        my_group = databricks.Group("my_group", display_name="my_group_name")
        my_group_instance_profile = databricks.GroupInstanceProfile("my_group_instance_profile",
            group_id=my_group.id,
            instance_profile_id=instance_profile.id)
        ```

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * get_aws_bucket_policy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
        * ClusterPolicy to create a Cluster policy, which limits the ability to create clusters based on a set of rules.
        * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        * Group data to retrieve information about Group members, entitlements and instance profiles.
        * GroupMember to attach users and groups as group members.
        * InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
        * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
        * UserInstanceProfile to attach InstanceProfile (AWS) to databricks_user.

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_id: This is the id of the group resource.
        :param pulumi.Input[str] instance_profile_id: This is the id of the instance profile resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GroupInstanceProfileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Deprecated** Please migrate to databricks_group_role.

        This resource allows you to attach InstanceProfile (AWS) to databricks_group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        instance_profile = databricks.InstanceProfile("instance_profile", instance_profile_arn="my_instance_profile_arn")
        my_group = databricks.Group("my_group", display_name="my_group_name")
        my_group_instance_profile = databricks.GroupInstanceProfile("my_group_instance_profile",
            group_id=my_group.id,
            instance_profile_id=instance_profile.id)
        ```

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * get_aws_bucket_policy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
        * ClusterPolicy to create a Cluster policy, which limits the ability to create clusters based on a set of rules.
        * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        * Group data to retrieve information about Group members, entitlements and instance profiles.
        * GroupMember to attach users and groups as group members.
        * InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
        * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
        * UserInstanceProfile to attach InstanceProfile (AWS) to databricks_user.

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param GroupInstanceProfileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GroupInstanceProfileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 instance_profile_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GroupInstanceProfileArgs.__new__(GroupInstanceProfileArgs)

            if group_id is None and not opts.urn:
                raise TypeError("Missing required property 'group_id'")
            __props__.__dict__["group_id"] = group_id
            if instance_profile_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_profile_id'")
            __props__.__dict__["instance_profile_id"] = instance_profile_id
        super(GroupInstanceProfile, __self__).__init__(
            'databricks:index/groupInstanceProfile:GroupInstanceProfile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            instance_profile_id: Optional[pulumi.Input[str]] = None) -> 'GroupInstanceProfile':
        """
        Get an existing GroupInstanceProfile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_id: This is the id of the group resource.
        :param pulumi.Input[str] instance_profile_id: This is the id of the instance profile resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GroupInstanceProfileState.__new__(_GroupInstanceProfileState)

        __props__.__dict__["group_id"] = group_id
        __props__.__dict__["instance_profile_id"] = instance_profile_id
        return GroupInstanceProfile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        This is the id of the group resource.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="instanceProfileId")
    def instance_profile_id(self) -> pulumi.Output[str]:
        """
        This is the id of the instance profile resource.
        """
        return pulumi.get(self, "instance_profile_id")

