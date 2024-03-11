# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['UserInstanceProfileArgs', 'UserInstanceProfile']

@pulumi.input_type
class UserInstanceProfileArgs:
    def __init__(__self__, *,
                 instance_profile_id: pulumi.Input[str],
                 user_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a UserInstanceProfile resource.
        :param pulumi.Input[str] instance_profile_id: This is the id of the instance profile resource.
        :param pulumi.Input[str] user_id: This is the id of the user resource.
        """
        pulumi.set(__self__, "instance_profile_id", instance_profile_id)
        pulumi.set(__self__, "user_id", user_id)

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

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Input[str]:
        """
        This is the id of the user resource.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_id", value)


@pulumi.input_type
class _UserInstanceProfileState:
    def __init__(__self__, *,
                 instance_profile_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering UserInstanceProfile resources.
        :param pulumi.Input[str] instance_profile_id: This is the id of the instance profile resource.
        :param pulumi.Input[str] user_id: This is the id of the user resource.
        """
        if instance_profile_id is not None:
            pulumi.set(__self__, "instance_profile_id", instance_profile_id)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

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

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        This is the id of the user resource.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class UserInstanceProfile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_profile_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        > **Deprecated** Please rewrite with databricks_user_role. This resource will be removed in v0.5.x

        This resource allows you to attach InstanceProfile (AWS) to databricks_user.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_databricks as databricks

        instance_profile = databricks.InstanceProfile("instanceProfile", instance_profile_arn="my_instance_profile_arn")
        my_user = databricks.User("myUser", user_name="me@example.com")
        my_user_instance_profile = databricks.UserInstanceProfile("myUserInstanceProfile",
            user_id=my_user.id,
            instance_profile_id=instance_profile.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
        * GroupMember to attach users and groups as group members.
        * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
        * User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to Group within the workspace.
        * User data to retrieve information about databricks_user.

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_profile_id: This is the id of the instance profile resource.
        :param pulumi.Input[str] user_id: This is the id of the user resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserInstanceProfileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Deprecated** Please rewrite with databricks_user_role. This resource will be removed in v0.5.x

        This resource allows you to attach InstanceProfile (AWS) to databricks_user.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_databricks as databricks

        instance_profile = databricks.InstanceProfile("instanceProfile", instance_profile_arn="my_instance_profile_arn")
        my_user = databricks.User("myUser", user_name="me@example.com")
        my_user_instance_profile = databricks.UserInstanceProfile("myUserInstanceProfile",
            user_id=my_user.id,
            instance_profile_id=instance_profile.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
        * GroupMember to attach users and groups as group members.
        * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
        * User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to Group within the workspace.
        * User data to retrieve information about databricks_user.

        ## Import

        -> **Note** Importing this resource is not currently supported.

        :param str resource_name: The name of the resource.
        :param UserInstanceProfileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserInstanceProfileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_profile_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserInstanceProfileArgs.__new__(UserInstanceProfileArgs)

            if instance_profile_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_profile_id'")
            __props__.__dict__["instance_profile_id"] = instance_profile_id
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__.__dict__["user_id"] = user_id
        super(UserInstanceProfile, __self__).__init__(
            'databricks:index/userInstanceProfile:UserInstanceProfile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_profile_id: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'UserInstanceProfile':
        """
        Get an existing UserInstanceProfile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_profile_id: This is the id of the instance profile resource.
        :param pulumi.Input[str] user_id: This is the id of the user resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserInstanceProfileState.__new__(_UserInstanceProfileState)

        __props__.__dict__["instance_profile_id"] = instance_profile_id
        __props__.__dict__["user_id"] = user_id
        return UserInstanceProfile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="instanceProfileId")
    def instance_profile_id(self) -> pulumi.Output[str]:
        """
        This is the id of the instance profile resource.
        """
        return pulumi.get(self, "instance_profile_id")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        This is the id of the user resource.
        """
        return pulumi.get(self, "user_id")

