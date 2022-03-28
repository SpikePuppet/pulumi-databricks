# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ServicePrincipalArgs', 'ServicePrincipal']

@pulumi.input_type
class ServicePrincipalArgs:
    def __init__(__self__, *,
                 active: Optional[pulumi.Input[bool]] = None,
                 allow_cluster_create: Optional[pulumi.Input[bool]] = None,
                 allow_instance_pool_create: Optional[pulumi.Input[bool]] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 databricks_sql_access: Optional[pulumi.Input[bool]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 workspace_access: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a ServicePrincipal resource.
        :param pulumi.Input[bool] active: Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
        :param pulumi.Input[bool] allow_cluster_create: Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
        :param pulumi.Input[bool] allow_instance_pool_create: Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        :param pulumi.Input[str] application_id: This is the application id of the given service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
        :param pulumi.Input[bool] databricks_sql_access: This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
        :param pulumi.Input[str] display_name: This is an alias for the service principal and can be the full name of the service principal.
        :param pulumi.Input[bool] workspace_access: This is a field to allow the group to have access to Databricks Workspace.
        """
        if active is not None:
            pulumi.set(__self__, "active", active)
        if allow_cluster_create is not None:
            pulumi.set(__self__, "allow_cluster_create", allow_cluster_create)
        if allow_instance_pool_create is not None:
            pulumi.set(__self__, "allow_instance_pool_create", allow_instance_pool_create)
        if application_id is not None:
            pulumi.set(__self__, "application_id", application_id)
        if databricks_sql_access is not None:
            pulumi.set(__self__, "databricks_sql_access", databricks_sql_access)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if workspace_access is not None:
            pulumi.set(__self__, "workspace_access", workspace_access)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter(name="allowClusterCreate")
    def allow_cluster_create(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
        """
        return pulumi.get(self, "allow_cluster_create")

    @allow_cluster_create.setter
    def allow_cluster_create(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_cluster_create", value)

    @property
    @pulumi.getter(name="allowInstancePoolCreate")
    def allow_instance_pool_create(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        """
        return pulumi.get(self, "allow_instance_pool_create")

    @allow_instance_pool_create.setter
    def allow_instance_pool_create(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_instance_pool_create", value)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[str]]:
        """
        This is the application id of the given service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter(name="databricksSqlAccess")
    def databricks_sql_access(self) -> Optional[pulumi.Input[bool]]:
        """
        This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
        """
        return pulumi.get(self, "databricks_sql_access")

    @databricks_sql_access.setter
    def databricks_sql_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "databricks_sql_access", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        This is an alias for the service principal and can be the full name of the service principal.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="workspaceAccess")
    def workspace_access(self) -> Optional[pulumi.Input[bool]]:
        """
        This is a field to allow the group to have access to Databricks Workspace.
        """
        return pulumi.get(self, "workspace_access")

    @workspace_access.setter
    def workspace_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "workspace_access", value)


@pulumi.input_type
class _ServicePrincipalState:
    def __init__(__self__, *,
                 active: Optional[pulumi.Input[bool]] = None,
                 allow_cluster_create: Optional[pulumi.Input[bool]] = None,
                 allow_instance_pool_create: Optional[pulumi.Input[bool]] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 databricks_sql_access: Optional[pulumi.Input[bool]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 workspace_access: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering ServicePrincipal resources.
        :param pulumi.Input[bool] active: Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
        :param pulumi.Input[bool] allow_cluster_create: Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
        :param pulumi.Input[bool] allow_instance_pool_create: Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        :param pulumi.Input[str] application_id: This is the application id of the given service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
        :param pulumi.Input[bool] databricks_sql_access: This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
        :param pulumi.Input[str] display_name: This is an alias for the service principal and can be the full name of the service principal.
        :param pulumi.Input[bool] workspace_access: This is a field to allow the group to have access to Databricks Workspace.
        """
        if active is not None:
            pulumi.set(__self__, "active", active)
        if allow_cluster_create is not None:
            pulumi.set(__self__, "allow_cluster_create", allow_cluster_create)
        if allow_instance_pool_create is not None:
            pulumi.set(__self__, "allow_instance_pool_create", allow_instance_pool_create)
        if application_id is not None:
            pulumi.set(__self__, "application_id", application_id)
        if databricks_sql_access is not None:
            pulumi.set(__self__, "databricks_sql_access", databricks_sql_access)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if workspace_access is not None:
            pulumi.set(__self__, "workspace_access", workspace_access)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter(name="allowClusterCreate")
    def allow_cluster_create(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
        """
        return pulumi.get(self, "allow_cluster_create")

    @allow_cluster_create.setter
    def allow_cluster_create(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_cluster_create", value)

    @property
    @pulumi.getter(name="allowInstancePoolCreate")
    def allow_instance_pool_create(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        """
        return pulumi.get(self, "allow_instance_pool_create")

    @allow_instance_pool_create.setter
    def allow_instance_pool_create(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_instance_pool_create", value)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[str]]:
        """
        This is the application id of the given service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter(name="databricksSqlAccess")
    def databricks_sql_access(self) -> Optional[pulumi.Input[bool]]:
        """
        This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
        """
        return pulumi.get(self, "databricks_sql_access")

    @databricks_sql_access.setter
    def databricks_sql_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "databricks_sql_access", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        This is an alias for the service principal and can be the full name of the service principal.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="workspaceAccess")
    def workspace_access(self) -> Optional[pulumi.Input[bool]]:
        """
        This is a field to allow the group to have access to Databricks Workspace.
        """
        return pulumi.get(self, "workspace_access")

    @workspace_access.setter
    def workspace_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "workspace_access", value)


class ServicePrincipal(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 allow_cluster_create: Optional[pulumi.Input[bool]] = None,
                 allow_instance_pool_create: Optional[pulumi.Input[bool]] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 databricks_sql_access: Optional[pulumi.Input[bool]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 workspace_access: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Directly manage [Service Principals](https://docs.databricks.com/administration-guide/users-groups/service-principals.html) that could be added to Group within workspace.

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        * Group data to retrieve information about Group members, entitlements and instance profiles.
        * databricks_group_member to attach users and groups as group members.
        * Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
        * SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.

        ## Import

        The resource scim service principal can be imported using idbash

        ```sh
         $ pulumi import databricks:index/servicePrincipal:ServicePrincipal me <service-principal-id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
        :param pulumi.Input[bool] allow_cluster_create: Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
        :param pulumi.Input[bool] allow_instance_pool_create: Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        :param pulumi.Input[str] application_id: This is the application id of the given service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
        :param pulumi.Input[bool] databricks_sql_access: This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
        :param pulumi.Input[str] display_name: This is an alias for the service principal and can be the full name of the service principal.
        :param pulumi.Input[bool] workspace_access: This is a field to allow the group to have access to Databricks Workspace.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ServicePrincipalArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Directly manage [Service Principals](https://docs.databricks.com/administration-guide/users-groups/service-principals.html) that could be added to Group within workspace.

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        * Group data to retrieve information about Group members, entitlements and instance profiles.
        * databricks_group_member to attach users and groups as group members.
        * Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
        * SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.

        ## Import

        The resource scim service principal can be imported using idbash

        ```sh
         $ pulumi import databricks:index/servicePrincipal:ServicePrincipal me <service-principal-id>
        ```

        :param str resource_name: The name of the resource.
        :param ServicePrincipalArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServicePrincipalArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 allow_cluster_create: Optional[pulumi.Input[bool]] = None,
                 allow_instance_pool_create: Optional[pulumi.Input[bool]] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 databricks_sql_access: Optional[pulumi.Input[bool]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 workspace_access: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServicePrincipalArgs.__new__(ServicePrincipalArgs)

            __props__.__dict__["active"] = active
            __props__.__dict__["allow_cluster_create"] = allow_cluster_create
            __props__.__dict__["allow_instance_pool_create"] = allow_instance_pool_create
            __props__.__dict__["application_id"] = application_id
            __props__.__dict__["databricks_sql_access"] = databricks_sql_access
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["workspace_access"] = workspace_access
        super(ServicePrincipal, __self__).__init__(
            'databricks:index/servicePrincipal:ServicePrincipal',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active: Optional[pulumi.Input[bool]] = None,
            allow_cluster_create: Optional[pulumi.Input[bool]] = None,
            allow_instance_pool_create: Optional[pulumi.Input[bool]] = None,
            application_id: Optional[pulumi.Input[str]] = None,
            databricks_sql_access: Optional[pulumi.Input[bool]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            workspace_access: Optional[pulumi.Input[bool]] = None) -> 'ServicePrincipal':
        """
        Get an existing ServicePrincipal resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
        :param pulumi.Input[bool] allow_cluster_create: Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
        :param pulumi.Input[bool] allow_instance_pool_create: Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        :param pulumi.Input[str] application_id: This is the application id of the given service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
        :param pulumi.Input[bool] databricks_sql_access: This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
        :param pulumi.Input[str] display_name: This is an alias for the service principal and can be the full name of the service principal.
        :param pulumi.Input[bool] workspace_access: This is a field to allow the group to have access to Databricks Workspace.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServicePrincipalState.__new__(_ServicePrincipalState)

        __props__.__dict__["active"] = active
        __props__.__dict__["allow_cluster_create"] = allow_cluster_create
        __props__.__dict__["allow_instance_pool_create"] = allow_instance_pool_create
        __props__.__dict__["application_id"] = application_id
        __props__.__dict__["databricks_sql_access"] = databricks_sql_access
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["workspace_access"] = workspace_access
        return ServicePrincipal(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def active(self) -> pulumi.Output[Optional[bool]]:
        """
        Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter(name="allowClusterCreate")
    def allow_cluster_create(self) -> pulumi.Output[Optional[bool]]:
        """
        Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
        """
        return pulumi.get(self, "allow_cluster_create")

    @property
    @pulumi.getter(name="allowInstancePoolCreate")
    def allow_instance_pool_create(self) -> pulumi.Output[Optional[bool]]:
        """
        Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        """
        return pulumi.get(self, "allow_instance_pool_create")

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> pulumi.Output[str]:
        """
        This is the application id of the given service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
        """
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter(name="databricksSqlAccess")
    def databricks_sql_access(self) -> pulumi.Output[Optional[bool]]:
        """
        This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
        """
        return pulumi.get(self, "databricks_sql_access")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        This is an alias for the service principal and can be the full name of the service principal.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="workspaceAccess")
    def workspace_access(self) -> pulumi.Output[Optional[bool]]:
        """
        This is a field to allow the group to have access to Databricks Workspace.
        """
        return pulumi.get(self, "workspace_access")

