# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetServicePrincipalsResult',
    'AwaitableGetServicePrincipalsResult',
    'get_service_principals',
    'get_service_principals_output',
]

@pulumi.output_type
class GetServicePrincipalsResult:
    """
    A collection of values returned by getServicePrincipals.
    """
    def __init__(__self__, application_ids=None, display_name_contains=None, id=None):
        if application_ids and not isinstance(application_ids, list):
            raise TypeError("Expected argument 'application_ids' to be a list")
        pulumi.set(__self__, "application_ids", application_ids)
        if display_name_contains and not isinstance(display_name_contains, str):
            raise TypeError("Expected argument 'display_name_contains' to be a str")
        pulumi.set(__self__, "display_name_contains", display_name_contains)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="applicationIds")
    def application_ids(self) -> Sequence[str]:
        """
        List of `application_ids` of service principals Individual service principal can be retrieved using ServicePrincipal data source
        """
        return pulumi.get(self, "application_ids")

    @property
    @pulumi.getter(name="displayNameContains")
    def display_name_contains(self) -> str:
        return pulumi.get(self, "display_name_contains")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetServicePrincipalsResult(GetServicePrincipalsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServicePrincipalsResult(
            application_ids=self.application_ids,
            display_name_contains=self.display_name_contains,
            id=self.id)


def get_service_principals(application_ids: Optional[Sequence[str]] = None,
                           display_name_contains: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServicePrincipalsResult:
    """
    > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.

    Retrieves `application_ids` of all ServicePrincipal based on their `display_name`

    ## Related Resources

    The following resources are used in the same context:

    * End to end workspace management guide.
    * get_current_user data to retrieve information about User or databricks_service_principal, that is calling Databricks REST API.
    * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
    * Group data to retrieve information about Group members, entitlements and instance profiles.
    * GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
    * GroupMember to attach users and groups as group members.
    * Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
    * databricks_service principal to manage service principals


    :param Sequence[str] application_ids: List of `application_ids` of service principals Individual service principal can be retrieved using ServicePrincipal data source
    :param str display_name_contains: Only return ServicePrincipal display name that match the given name string
    """
    __args__ = dict()
    __args__['applicationIds'] = application_ids
    __args__['displayNameContains'] = display_name_contains
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getServicePrincipals:getServicePrincipals', __args__, opts=opts, typ=GetServicePrincipalsResult).value

    return AwaitableGetServicePrincipalsResult(
        application_ids=pulumi.get(__ret__, 'application_ids'),
        display_name_contains=pulumi.get(__ret__, 'display_name_contains'),
        id=pulumi.get(__ret__, 'id'))


@_utilities.lift_output_func(get_service_principals)
def get_service_principals_output(application_ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                  display_name_contains: Optional[pulumi.Input[Optional[str]]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServicePrincipalsResult]:
    """
    > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.

    Retrieves `application_ids` of all ServicePrincipal based on their `display_name`

    ## Related Resources

    The following resources are used in the same context:

    * End to end workspace management guide.
    * get_current_user data to retrieve information about User or databricks_service_principal, that is calling Databricks REST API.
    * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
    * Group data to retrieve information about Group members, entitlements and instance profiles.
    * GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
    * GroupMember to attach users and groups as group members.
    * Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
    * databricks_service principal to manage service principals


    :param Sequence[str] application_ids: List of `application_ids` of service principals Individual service principal can be retrieved using ServicePrincipal data source
    :param str display_name_contains: Only return ServicePrincipal display name that match the given name string
    """
    ...
