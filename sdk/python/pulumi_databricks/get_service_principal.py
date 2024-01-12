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
    'GetServicePrincipalResult',
    'AwaitableGetServicePrincipalResult',
    'get_service_principal',
    'get_service_principal_output',
]

@pulumi.output_type
class GetServicePrincipalResult:
    """
    A collection of values returned by getServicePrincipal.
    """
    def __init__(__self__, acl_principal_id=None, active=None, application_id=None, display_name=None, external_id=None, home=None, id=None, repos=None, sp_id=None):
        if acl_principal_id and not isinstance(acl_principal_id, str):
            raise TypeError("Expected argument 'acl_principal_id' to be a str")
        pulumi.set(__self__, "acl_principal_id", acl_principal_id)
        if active and not isinstance(active, bool):
            raise TypeError("Expected argument 'active' to be a bool")
        pulumi.set(__self__, "active", active)
        if application_id and not isinstance(application_id, str):
            raise TypeError("Expected argument 'application_id' to be a str")
        pulumi.set(__self__, "application_id", application_id)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if external_id and not isinstance(external_id, str):
            raise TypeError("Expected argument 'external_id' to be a str")
        pulumi.set(__self__, "external_id", external_id)
        if home and not isinstance(home, str):
            raise TypeError("Expected argument 'home' to be a str")
        pulumi.set(__self__, "home", home)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if repos and not isinstance(repos, str):
            raise TypeError("Expected argument 'repos' to be a str")
        pulumi.set(__self__, "repos", repos)
        if sp_id and not isinstance(sp_id, str):
            raise TypeError("Expected argument 'sp_id' to be a str")
        pulumi.set(__self__, "sp_id", sp_id)

    @property
    @pulumi.getter(name="aclPrincipalId")
    def acl_principal_id(self) -> str:
        """
        identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
        """
        return pulumi.get(self, "acl_principal_id")

    @property
    @pulumi.getter
    def active(self) -> bool:
        """
        Whether service principal is active or not.
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> str:
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        Display name of the service principal, e.g. `Foo SPN`.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="externalId")
    def external_id(self) -> str:
        """
        ID of the service principal in an external identity provider.
        """
        return pulumi.get(self, "external_id")

    @property
    @pulumi.getter
    def home(self) -> str:
        """
        Home folder of the service principal, e.g. `/Users/11111111-2222-3333-4444-555666777888`.
        """
        return pulumi.get(self, "home")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The id of the service principal.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def repos(self) -> str:
        """
        Repos location of the service principal, e.g. `/Repos/11111111-2222-3333-4444-555666777888`.
        """
        return pulumi.get(self, "repos")

    @property
    @pulumi.getter(name="spId")
    def sp_id(self) -> str:
        return pulumi.get(self, "sp_id")


class AwaitableGetServicePrincipalResult(GetServicePrincipalResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServicePrincipalResult(
            acl_principal_id=self.acl_principal_id,
            active=self.active,
            application_id=self.application_id,
            display_name=self.display_name,
            external_id=self.external_id,
            home=self.home,
            id=self.id,
            repos=self.repos,
            sp_id=self.sp_id)


def get_service_principal(acl_principal_id: Optional[str] = None,
                          active: Optional[bool] = None,
                          application_id: Optional[str] = None,
                          display_name: Optional[str] = None,
                          external_id: Optional[str] = None,
                          home: Optional[str] = None,
                          id: Optional[str] = None,
                          repos: Optional[str] = None,
                          sp_id: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServicePrincipalResult:
    """
    > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.

    Retrieves information about databricks_service_principal.

    ## Example Usage

    Adding service principal `11111111-2222-3333-4444-555666777888` to administrative group

    ```python
    import pulumi
    import pulumi_databricks as databricks

    admins = databricks.get_group(display_name="admins")
    spn = databricks.get_service_principal(application_id="11111111-2222-3333-4444-555666777888")
    my_member_a = databricks.GroupMember("myMemberA",
        group_id=admins.id,
        member_id=spn.id)
    ```
    ## Related Resources

    The following resources are used in the same context:

    - End to end workspace management guide.
    - get_current_user data to retrieve information about User or databricks_service_principal, that is calling Databricks REST API.
    - Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
    - Group data to retrieve information about Group members, entitlements and instance profiles.
    - GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
    - GroupMember to attach users and groups as group members.
    - Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
    - databricks_service principal to manage service principals


    :param str acl_principal_id: identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
    :param bool active: Whether service principal is active or not.
    :param str application_id: ID of the service principal. The service principal must exist before this resource can be retrieved.
    :param str display_name: Exact display name of the service principal. The service principal must exist before this resource can be retrieved.  In case if there are several service principals with the same name, an error is thrown.
    :param str external_id: ID of the service principal in an external identity provider.
    :param str home: Home folder of the service principal, e.g. `/Users/11111111-2222-3333-4444-555666777888`.
    :param str id: The id of the service principal.
    :param str repos: Repos location of the service principal, e.g. `/Repos/11111111-2222-3333-4444-555666777888`.
    """
    __args__ = dict()
    __args__['aclPrincipalId'] = acl_principal_id
    __args__['active'] = active
    __args__['applicationId'] = application_id
    __args__['displayName'] = display_name
    __args__['externalId'] = external_id
    __args__['home'] = home
    __args__['id'] = id
    __args__['repos'] = repos
    __args__['spId'] = sp_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getServicePrincipal:getServicePrincipal', __args__, opts=opts, typ=GetServicePrincipalResult).value

    return AwaitableGetServicePrincipalResult(
        acl_principal_id=pulumi.get(__ret__, 'acl_principal_id'),
        active=pulumi.get(__ret__, 'active'),
        application_id=pulumi.get(__ret__, 'application_id'),
        display_name=pulumi.get(__ret__, 'display_name'),
        external_id=pulumi.get(__ret__, 'external_id'),
        home=pulumi.get(__ret__, 'home'),
        id=pulumi.get(__ret__, 'id'),
        repos=pulumi.get(__ret__, 'repos'),
        sp_id=pulumi.get(__ret__, 'sp_id'))


@_utilities.lift_output_func(get_service_principal)
def get_service_principal_output(acl_principal_id: Optional[pulumi.Input[Optional[str]]] = None,
                                 active: Optional[pulumi.Input[Optional[bool]]] = None,
                                 application_id: Optional[pulumi.Input[Optional[str]]] = None,
                                 display_name: Optional[pulumi.Input[Optional[str]]] = None,
                                 external_id: Optional[pulumi.Input[Optional[str]]] = None,
                                 home: Optional[pulumi.Input[Optional[str]]] = None,
                                 id: Optional[pulumi.Input[Optional[str]]] = None,
                                 repos: Optional[pulumi.Input[Optional[str]]] = None,
                                 sp_id: Optional[pulumi.Input[Optional[str]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServicePrincipalResult]:
    """
    > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.

    Retrieves information about databricks_service_principal.

    ## Example Usage

    Adding service principal `11111111-2222-3333-4444-555666777888` to administrative group

    ```python
    import pulumi
    import pulumi_databricks as databricks

    admins = databricks.get_group(display_name="admins")
    spn = databricks.get_service_principal(application_id="11111111-2222-3333-4444-555666777888")
    my_member_a = databricks.GroupMember("myMemberA",
        group_id=admins.id,
        member_id=spn.id)
    ```
    ## Related Resources

    The following resources are used in the same context:

    - End to end workspace management guide.
    - get_current_user data to retrieve information about User or databricks_service_principal, that is calling Databricks REST API.
    - Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
    - Group data to retrieve information about Group members, entitlements and instance profiles.
    - GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
    - GroupMember to attach users and groups as group members.
    - Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
    - databricks_service principal to manage service principals


    :param str acl_principal_id: identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
    :param bool active: Whether service principal is active or not.
    :param str application_id: ID of the service principal. The service principal must exist before this resource can be retrieved.
    :param str display_name: Exact display name of the service principal. The service principal must exist before this resource can be retrieved.  In case if there are several service principals with the same name, an error is thrown.
    :param str external_id: ID of the service principal in an external identity provider.
    :param str home: Home folder of the service principal, e.g. `/Users/11111111-2222-3333-4444-555666777888`.
    :param str id: The id of the service principal.
    :param str repos: Repos location of the service principal, e.g. `/Repos/11111111-2222-3333-4444-555666777888`.
    """
    ...
