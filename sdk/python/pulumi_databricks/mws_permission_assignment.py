# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['MwsPermissionAssignmentArgs', 'MwsPermissionAssignment']

@pulumi.input_type
class MwsPermissionAssignmentArgs:
    def __init__(__self__, *,
                 permissions: pulumi.Input[Sequence[pulumi.Input[str]]],
                 principal_id: pulumi.Input[int],
                 workspace_id: pulumi.Input[int]):
        """
        The set of arguments for constructing a MwsPermissionAssignment resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] permissions: The list of workspace permissions to assign to the principal:
               * `"USER"` - Can access the workspace with basic privileges.
               * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
        :param pulumi.Input[int] principal_id: Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, ServicePrincipal or Group data sources.
        :param pulumi.Input[int] workspace_id: Databricks workspace ID.
        """
        pulumi.set(__self__, "permissions", permissions)
        pulumi.set(__self__, "principal_id", principal_id)
        pulumi.set(__self__, "workspace_id", workspace_id)

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The list of workspace permissions to assign to the principal:
        * `"USER"` - Can access the workspace with basic privileges.
        * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> pulumi.Input[int]:
        """
        Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, ServicePrincipal or Group data sources.
        """
        return pulumi.get(self, "principal_id")

    @principal_id.setter
    def principal_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "principal_id", value)

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> pulumi.Input[int]:
        """
        Databricks workspace ID.
        """
        return pulumi.get(self, "workspace_id")

    @workspace_id.setter
    def workspace_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "workspace_id", value)


@pulumi.input_type
class _MwsPermissionAssignmentState:
    def __init__(__self__, *,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 principal_id: Optional[pulumi.Input[int]] = None,
                 workspace_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering MwsPermissionAssignment resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] permissions: The list of workspace permissions to assign to the principal:
               * `"USER"` - Can access the workspace with basic privileges.
               * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
        :param pulumi.Input[int] principal_id: Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, ServicePrincipal or Group data sources.
        :param pulumi.Input[int] workspace_id: Databricks workspace ID.
        """
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)
        if principal_id is not None:
            pulumi.set(__self__, "principal_id", principal_id)
        if workspace_id is not None:
            pulumi.set(__self__, "workspace_id", workspace_id)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list of workspace permissions to assign to the principal:
        * `"USER"` - Can access the workspace with basic privileges.
        * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> Optional[pulumi.Input[int]]:
        """
        Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, ServicePrincipal or Group data sources.
        """
        return pulumi.get(self, "principal_id")

    @principal_id.setter
    def principal_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "principal_id", value)

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> Optional[pulumi.Input[int]]:
        """
        Databricks workspace ID.
        """
        return pulumi.get(self, "workspace_id")

    @workspace_id.setter
    def workspace_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "workspace_id", value)


class MwsPermissionAssignment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 principal_id: Optional[pulumi.Input[int]] = None,
                 workspace_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        These resources are invoked in the account context. Permission Assignment Account API endpoints are restricted to account admins. Provider must have `account_id` attribute configured. Account Id that could be found in the top right corner of Accounts Console

        ## Example Usage

        In account context, adding account-level group to a workspace:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        data_eng = databricks.Group("dataEng")
        add_admin_group = databricks.MwsPermissionAssignment("addAdminGroup",
            workspace_id=databricks_mws_workspaces["this"]["workspace_id"],
            principal_id=data_eng.id,
            permissions=["ADMIN"])
        ```

        In account context, adding account-level user to a workspace:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        me = databricks.User("me", user_name="me@example.com")
        add_user = databricks.MwsPermissionAssignment("addUser",
            workspace_id=databricks_mws_workspaces["this"]["workspace_id"],
            principal_id=me.id,
            permissions=["USER"])
        ```

        In account context, adding account-level service principal to a workspace:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        sp = databricks.ServicePrincipal("sp", display_name="Automation-only SP")
        add_admin_spn = databricks.MwsPermissionAssignment("addAdminSpn",
            workspace_id=databricks_mws_workspaces["this"]["workspace_id"],
            principal_id=sp.id,
            permissions=["ADMIN"])
        ```
        ## Related Resources

        The following resources are used in the same context:

        * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        * Group data to retrieve information about Group members, entitlements and instance profiles.
        * GroupMember to attach users and groups as group members.
        * PermissionAssignment to manage permission assignment from a workspace context

        ## Import

        The resource `databricks_mws_permission_assignment` can be imported using the workspace id and principal id bash

        ```sh
         $ pulumi import databricks:index/mwsPermissionAssignment:MwsPermissionAssignment this "workspace_id|principal_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] permissions: The list of workspace permissions to assign to the principal:
               * `"USER"` - Can access the workspace with basic privileges.
               * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
        :param pulumi.Input[int] principal_id: Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, ServicePrincipal or Group data sources.
        :param pulumi.Input[int] workspace_id: Databricks workspace ID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MwsPermissionAssignmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        These resources are invoked in the account context. Permission Assignment Account API endpoints are restricted to account admins. Provider must have `account_id` attribute configured. Account Id that could be found in the top right corner of Accounts Console

        ## Example Usage

        In account context, adding account-level group to a workspace:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        data_eng = databricks.Group("dataEng")
        add_admin_group = databricks.MwsPermissionAssignment("addAdminGroup",
            workspace_id=databricks_mws_workspaces["this"]["workspace_id"],
            principal_id=data_eng.id,
            permissions=["ADMIN"])
        ```

        In account context, adding account-level user to a workspace:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        me = databricks.User("me", user_name="me@example.com")
        add_user = databricks.MwsPermissionAssignment("addUser",
            workspace_id=databricks_mws_workspaces["this"]["workspace_id"],
            principal_id=me.id,
            permissions=["USER"])
        ```

        In account context, adding account-level service principal to a workspace:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        sp = databricks.ServicePrincipal("sp", display_name="Automation-only SP")
        add_admin_spn = databricks.MwsPermissionAssignment("addAdminSpn",
            workspace_id=databricks_mws_workspaces["this"]["workspace_id"],
            principal_id=sp.id,
            permissions=["ADMIN"])
        ```
        ## Related Resources

        The following resources are used in the same context:

        * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        * Group data to retrieve information about Group members, entitlements and instance profiles.
        * GroupMember to attach users and groups as group members.
        * PermissionAssignment to manage permission assignment from a workspace context

        ## Import

        The resource `databricks_mws_permission_assignment` can be imported using the workspace id and principal id bash

        ```sh
         $ pulumi import databricks:index/mwsPermissionAssignment:MwsPermissionAssignment this "workspace_id|principal_id"
        ```

        :param str resource_name: The name of the resource.
        :param MwsPermissionAssignmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MwsPermissionAssignmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 principal_id: Optional[pulumi.Input[int]] = None,
                 workspace_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MwsPermissionAssignmentArgs.__new__(MwsPermissionAssignmentArgs)

            if permissions is None and not opts.urn:
                raise TypeError("Missing required property 'permissions'")
            __props__.__dict__["permissions"] = permissions
            if principal_id is None and not opts.urn:
                raise TypeError("Missing required property 'principal_id'")
            __props__.__dict__["principal_id"] = principal_id
            if workspace_id is None and not opts.urn:
                raise TypeError("Missing required property 'workspace_id'")
            __props__.__dict__["workspace_id"] = workspace_id
        super(MwsPermissionAssignment, __self__).__init__(
            'databricks:index/mwsPermissionAssignment:MwsPermissionAssignment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            permissions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            principal_id: Optional[pulumi.Input[int]] = None,
            workspace_id: Optional[pulumi.Input[int]] = None) -> 'MwsPermissionAssignment':
        """
        Get an existing MwsPermissionAssignment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] permissions: The list of workspace permissions to assign to the principal:
               * `"USER"` - Can access the workspace with basic privileges.
               * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
        :param pulumi.Input[int] principal_id: Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, ServicePrincipal or Group data sources.
        :param pulumi.Input[int] workspace_id: Databricks workspace ID.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MwsPermissionAssignmentState.__new__(_MwsPermissionAssignmentState)

        __props__.__dict__["permissions"] = permissions
        __props__.__dict__["principal_id"] = principal_id
        __props__.__dict__["workspace_id"] = workspace_id
        return MwsPermissionAssignment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Output[Sequence[str]]:
        """
        The list of workspace permissions to assign to the principal:
        * `"USER"` - Can access the workspace with basic privileges.
        * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> pulumi.Output[int]:
        """
        Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, ServicePrincipal or Group data sources.
        """
        return pulumi.get(self, "principal_id")

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> pulumi.Output[int]:
        """
        Databricks workspace ID.
        """
        return pulumi.get(self, "workspace_id")

